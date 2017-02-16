/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.InsurancePricesResponse;

/**
 * API tests for InsuranceApi
 */
public class InsuranceApiTest extends GeneralApiTest {

    private final InsuranceApi api = new InsuranceApi();

    /**
     * List insurance levels
     *
     * Return available insurance levels for all ship types --- Alternate route:
     * &#x60;/v1/insurance/prices/&#x60; Alternate route:
     * &#x60;/legacy/insurance/prices/&#x60; Alternate route:
     * &#x60;/dev/insurance/prices/&#x60; --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getInsurancePricesTest() throws ApiException {
        final String language = "en-us";
        final List<InsurancePricesResponse> response = api.getInsurancePrices(language, DATASOURCE);

        assertThat(response.size(), greaterThan(0));
        final InsurancePricesResponse price = response.get(0);
        assertThat(price.getLevels().size(), equalTo(6));
        assertThat(price.getTypeId(), greaterThan(0));
    }

}
