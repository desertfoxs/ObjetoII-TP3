package oop2.tp3.ejercicio2;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RecaudacionTest {

    Recaudacion recaudacion = new Recaudacion();

    @Test
    public void testWhereGivenCompany() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("company_name", "Facebook");

        List<Map<String, String>> var = recaudacion.where(options, (Map<String, String> opt) -> opt.containsKey("company_name"),
                (Map<String, String> opt, String[] csvData) -> csvData[1].equals(options.get("company_name")));

        assertEquals(var.size(), 7);
    }

    @Test
    public void testWhereGivenCity() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("city", "Tempe");

        List<Map<String, String>> var = recaudacion.where(options, (Map<String, String> opt) -> opt.containsKey("city"),
                (Map<String, String> opt, String[] csvData) -> csvData[4].equals(options.get("city")));


        assertEquals(var.size(), 3);
    }

    @Test
    public void testWhereGivenState() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("state", "CA");

        List<Map<String, String>> var = recaudacion.where(options, (Map<String, String> opt) -> opt.containsKey("state"),
                (Map<String, String> opt, String[] csvData) -> csvData[5].equals(options.get("state")));


        assertEquals(var.size(), 873);
    }


    @Test
    public void testWhereGivenRound() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("round", "a");
        List<Map<String, String>> var = recaudacion.where(options, (Map<String, String> opt) -> opt.containsKey("round"),
                (Map<String, String> opt, String[] csvData) -> csvData[9].equals(options.get("round")));


        assertEquals(var.size(), 582);
    }


    @Test
    public void testMultipleOptions() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("round", "a");
        options.put("company_name", "Facebook");

        List<Map<String, String>> var = recaudacion.where(options, (Map<String, String> opt) -> opt.containsKey("company_name"),
                (Map<String, String> opt, String[] csvData) -> csvData[9].equals(options.get("company_name")));

        assertEquals(var.size(), 1);
    }

    /*
    @Test
    public void testWhereNotExists() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("company_name", "NotFacebook");
        assertEquals(recaudacion.where(options).size(), 0);
    }

    @Test
    public void testWhereCorrectKeys() throws IOException {
        Map<String, String> options = new HashMap<String, String>();
        options.put("company_name", "Facebook");
        Map<String, String> row = recaudacion.where(options).get(0);

        assertEquals(row.get("permalink"), "facebook");
        assertEquals(row.get("company_name"), "Facebook");
        assertEquals(row.get("number_employees"), "450");
        assertEquals(row.get("category"), "web");
        assertEquals(row.get("city"), "Palo Alto");
        assertEquals(row.get("state"), "CA");
        assertEquals(row.get("funded_date"), "1-Sep-04");
        assertEquals(row.get("raised_amount"), "500000");
        assertEquals(row.get("round"), "angel");

    }

 */
}
