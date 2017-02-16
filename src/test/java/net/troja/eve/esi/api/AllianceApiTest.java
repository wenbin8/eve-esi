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

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.AllianceIconsResponse;
import net.troja.eve.esi.model.AllianceNamesResponse;
import net.troja.eve.esi.model.AllianceResponse;

/**
 * API tests for AllianceApi
 */
public class AllianceApiTest extends GeneralApiTest {
    private final AllianceApi api = new AllianceApi();

    /**
     * List all alliances
     *
     * List all active player alliances --- Alternate route:
     * &#x60;/v1/alliances/&#x60; Alternate route:
     * &#x60;/legacy/alliances/&#x60; Alternate route:
     * &#x60;/dev/alliances/&#x60; --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getAlliancesTest() throws ApiException {
        final List<Integer> response = api.getAlliances(DATASOURCE);

        assertThat(response.size(), greaterThan(1));
        assertThat(response.get(0), equalTo(99000006));
    }

    /**
     * Get alliance information
     *
     * Public information about an alliance --- Alternate route:
     * &#x60;/v2/alliances/{alliance_id}/&#x60; --- This route is cached for up
     * to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdTest() throws ApiException {
        final AllianceResponse response = api.getAlliancesAllianceId(ALLIANCE_ID_TRI, DATASOURCE);

        assertThat(response.getAllianceName(), equalTo("Triumvirate."));
        assertThat(response.getTicker(), equalTo("TRI"));
        assertThat(response.getExecutorCorp(), equalTo(98435559));
        assertThat(response.getDateFounded().toString(), equalTo("2006-07-14T18:53Z"));
    }

    /**
     * List alliance&#39;s corporations
     *
     * List all current member corporations of an alliance --- Alternate route:
     * &#x60;/v1/alliances/{alliance_id}/corporations/&#x60; Alternate route:
     * &#x60;/legacy/alliances/{alliance_id}/corporations/&#x60; Alternate
     * route: &#x60;/dev/alliances/{alliance_id}/corporations/&#x60; --- This
     * route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdCorporationsTest() throws ApiException {
        final List<Integer> response = api.getAlliancesAllianceIdCorporations(ALLIANCE_ID_TRI, DATASOURCE);

        assertThat(response.size(), greaterThan(1));
        assertThat(response, hasItem(98435559));
    }

    /**
     * Get alliance icon
     *
     * Get the icon urls for a alliance --- Alternate route:
     * &#x60;/v1/alliances/{alliance_id}/icons/&#x60; Alternate route:
     * &#x60;/legacy/alliances/{alliance_id}/icons/&#x60; Alternate route:
     * &#x60;/dev/alliances/{alliance_id}/icons/&#x60; --- This route is cached
     * for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdIconsTest() throws ApiException {
        final AllianceIconsResponse response = api.getAlliancesAllianceIdIcons(ALLIANCE_ID_TRI, DATASOURCE);

        assertThat(response.getPx128x128(), equalTo("http://image.eveonline.com/Alliance/933731581_128.png"));
    }

    /**
     * Get alliance names
     *
     * Resolve a set of alliance IDs to alliance names --- Alternate route:
     * &#x60;/v1/alliances/names/&#x60; Alternate route:
     * &#x60;/legacy/alliances/names/&#x60; Alternate route:
     * &#x60;/dev/alliances/names/&#x60; --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getAlliancesNamesTest() throws ApiException {
        final List<Long> allianceIds = new ArrayList<>();
        allianceIds.add((long) ALLIANCE_ID_TRI);
        final List<AllianceNamesResponse> response = api.getAlliancesNames(allianceIds, DATASOURCE);

        assertThat(response.size(), equalTo(1));
        final AllianceNamesResponse alliance = response.get(0);
        assertThat(alliance.getAllianceId(), equalTo(ALLIANCE_ID_TRI));
        assertThat(alliance.getAllianceName(), equalTo("Triumvirate."));
    }
}
