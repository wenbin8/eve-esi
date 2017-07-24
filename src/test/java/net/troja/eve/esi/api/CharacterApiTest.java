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
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterBlueprintsResponse;
import net.troja.eve.esi.model.CharacterChatChannelsResponse;
import net.troja.eve.esi.model.CharacterCorporationHistoryResponse;
import net.troja.eve.esi.model.CharacterFatigueResponse;
import net.troja.eve.esi.model.CharacterMedalsResponse;
import net.troja.eve.esi.model.CharacterNamesResponse;
import net.troja.eve.esi.model.CharacterPortraitResponse;
import net.troja.eve.esi.model.CharacterResearchAgentsResponse;
import net.troja.eve.esi.model.CharacterResponse;
import net.troja.eve.esi.model.CharacterStandingsResponse;
import net.troja.eve.esi.model.CspaCharacters;
import net.troja.eve.esi.model.CspaCostResponse;

/**
 * API tests for CharacterApi
 */
public class CharacterApiTest extends GeneralApiTest {

    private final CharacterApi api = new CharacterApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get character&#39;s public information
     *
     * Public information about a character --- Alternate route:
     * &#x60;/v3/characters/{character_id}/&#x60; Alternate route:
     * &#x60;/legacy/characters/{character_id}/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/&#x60; --- This route is cached for
     * up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdTest() throws ApiException {
        final CharacterResponse response = api.getCharactersCharacterId(characterId, DATASOURCE, null, null);

        assertThat(response, notNullValue());
        assertThat(response.getName(), notNullValue());
    }

    /**
     * Get agents research
     *
     * Return a list of agents research information for a character. The formula
     * for finding the current research points with an agent is: currentPoints
     * &#x3D; remainderPoints + pointsPerDay * days(currentTime -
     * researchStartDate) --- This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdAgentsResearchTest() throws ApiException {
        final List<CharacterResearchAgentsResponse> response = api.getCharactersCharacterIdAgentsResearch(characterId,
                DATASOURCE, null, null, null);

        assertThat(response, notNullValue());
    }

    /**
     * Get blueprints
     *
     * Return a list of blueprints the character has --- This route is cached
     * for up to 3600 seconds SSO Scope: esi-characters.read_blueprints.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdBlueprintsTest() throws ApiException {

        final List<CharacterBlueprintsResponse> response = api.getCharactersCharacterIdBlueprints(characterId,
                DATASOURCE, null, null, null);

        assertThat(response, notNullValue());
    }

    /**
     * Get chat channels
     *
     * Return chat channels that a character is the owner or an operator of ---
     * This route is cached for up to 300 seconds SSO Scope:
     * esi-characters.read_chat_channels.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdChatChannelsTest() throws ApiException {
        final List<CharacterChatChannelsResponse> response = api.getCharactersCharacterIdChatChannels(characterId,
                DATASOURCE, null, null, null);

        assertThat(response, notNullValue());
        ignoreTestFails();
        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get corporation history
     *
     * Get a list of all the corporations a character has been a member of ---
     * Alternate route:
     * &#x60;/v1/characters/{character_id}/corporationhistory/&#x60; Alternate
     * route: &#x60;/legacy/characters/{character_id}/corporationhistory/&#x60;
     * Alternate route:
     * &#x60;/dev/characters/{character_id}/corporationhistory/&#x60; --- This
     * route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCorporationhistoryTest() throws ApiException {
        final List<CharacterCorporationHistoryResponse> response = api
                .getCharactersCharacterIdCorporationhistory(characterId, DATASOURCE, null, null);

        assertThat(response.size(), greaterThan(0));
        assertThat(response.get(0).getCorporationId(), greaterThan(0));
    }

    /**
     * Get jump fatigue
     *
     * Return a character&#39;s jump activation and fatigue information  ---  This route is cached for up to 300 seconds  SSO Scope: esi-characters.read_fatigue.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdFatigueTest() throws ApiException {
        CharacterFatigueResponse response = api.getCharactersCharacterIdFatigue(characterId, DATASOURCE, null, null, null);
        assertThat(response, notNullValue());
    }

    /**
     * Get medals
     *
     * Return a list of medals the character has --- This route is cached for up
     * to 3600 seconds SSO Scope: esi-characters.read_medals.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMedalsTest() throws ApiException {
        ignoreTestFails();
        final List<CharacterMedalsResponse> response = api.getCharactersCharacterIdMedals(characterId, DATASOURCE, null,
                null, null);

        assertThat(response, notNullValue());
    }

    /**
     * Get character portraits
     *
     * Get portrait urls for a character --- Alternate route:
     * &#x60;/v2/characters/{character_id}/portrait/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/portrait/&#x60; --- This route is
     * cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPortraitTest() throws ApiException {
        final CharacterPortraitResponse response = api.getCharactersCharacterIdPortrait(characterId, DATASOURCE, null,
                null);

        assertThat(response, notNullValue());
        final String icon = response.getPx64x64();
        assertThat(StringUtils.isNotBlank(icon), equalTo(true));
    }

    /**
     * Get character corporation roles
     *
     * Returns a character&#39;s corporation roles --- This route is cached for
     * up to 3600 seconds SSO Scope: esi-characters.read_corporation_roles.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdRolesTest() throws ApiException {
        final List<String> response = api.getCharactersCharacterIdRoles(characterId, DATASOURCE, null, null, null);

        assertThat(response, notNullValue());
    }

    /**
     * Get standings
     *
     * Return character standings from agents, NPC corporations, and factions
     * --- This route is cached for up to 3600 seconds SSO Scope:
     * esi-characters.read_standings.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdStandingsTest() throws ApiException {
        final List<CharacterStandingsResponse> response = api.getCharactersCharacterIdStandings(characterId, DATASOURCE,
                null, null, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get character names
     *
     * Resolve a set of character IDs to character names --- Alternate route:
     * &#x60;/v1/characters/names/&#x60; Alternate route:
     * &#x60;/legacy/characters/names/&#x60; Alternate route:
     * &#x60;/dev/characters/names/&#x60; --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersNamesTest() throws ApiException {
        final List<Long> characterIds = new ArrayList<>();
        characterIds.add((long) characterId);

        final List<CharacterNamesResponse> response = api.getCharactersNames(characterIds, DATASOURCE, null, null);

        assertThat(response.size(), equalTo(1));
        assertThat(response.get(0).getCharacterName(), equalTo(characterName));
    }

    /**
     * Character affiliation
     *
     * Bulk lookup of character IDs to corporation, alliance and faction ---
     * This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("We can't test changes")
    public void postCharactersAffiliationTest() throws ApiException {
    }

    /**
     * Calculate a CSPA charge cost
     *
     * Takes a source character ID in the url and a set of target character
     * ID&#39;s in the body, returns a CSPA charge cost --- Alternate route:
     * &#x60;/v3/characters/{character_id}/cspa/&#x60; Alternate route:
     * &#x60;/legacy/characters/{character_id}/cspa/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/cspa/&#x60; SSO Scope:
     * esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdCspaTest() throws ApiException {
        final CspaCharacters characters = new CspaCharacters();
        characters.addCharactersItem(CHARACTER_ID_CHRIBBA);

        final CspaCostResponse response = api.postCharactersCharacterIdCspa(characterId, characters, DATASOURCE, null,
                null, null);

        assertThat(response.getCost(), equalTo(0l));
    }

}
