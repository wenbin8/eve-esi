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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationCustomsOfficesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("office_id")
    private Long officeId = null;

    @JsonProperty("system_id")
    private Integer systemId = null;

    @JsonProperty("reinforce_exit_start")
    private Integer reinforceExitStart = null;

    @JsonProperty("reinforce_exit_end")
    private Integer reinforceExitEnd = null;

    @JsonProperty("corporation_tax_rate")
    private Float corporationTaxRate = null;

    @JsonProperty("allow_alliance_access")
    private Boolean allowAllianceAccess = null;

    @JsonProperty("alliance_tax_rate")
    private Float allianceTaxRate = null;

    @JsonProperty("allow_access_with_standings")
    private Boolean allowAccessWithStandings = null;

    /**
     * Access is allowed only for entities with this level of standing or better
     */
    public enum StandingLevelEnum {
        BAD("bad"),

        EXCELLENT("excellent"),

        GOOD("good"),

        NEUTRAL("neutral"),

        TERRIBLE("terrible");

        private String value;

        StandingLevelEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StandingLevelEnum fromValue(String text) {
            for (StandingLevelEnum b : StandingLevelEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("standing_level")
    private StandingLevelEnum standingLevel = null;

    @JsonProperty("excellent_standing_tax_rate")
    private Float excellentStandingTaxRate = null;

    @JsonProperty("good_standing_tax_rate")
    private Float goodStandingTaxRate = null;

    @JsonProperty("neutral_standing_tax_rate")
    private Float neutralStandingTaxRate = null;

    @JsonProperty("bad_standing_tax_rate")
    private Float badStandingTaxRate = null;

    @JsonProperty("terrible_standing_tax_rate")
    private Float terribleStandingTaxRate = null;

    public CorporationCustomsOfficesResponse officeId(Long officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * unique ID of this customs office
     * 
     * @return officeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "unique ID of this customs office")
    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public CorporationCustomsOfficesResponse systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * ID of the solar system this customs office is located in
     * 
     * @return systemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of the solar system this customs office is located in")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public CorporationCustomsOfficesResponse reinforceExitStart(Integer reinforceExitStart) {
        this.reinforceExitStart = reinforceExitStart;
        return this;
    }

    /**
     * Together with reinforce_exit_end, marks a 2-hour period where this
     * customs office could exit reinforcement mode during the day after initial
     * attack minimum: 0 maximum: 23
     * 
     * @return reinforceExitStart
     **/
    @ApiModelProperty(example = "null", required = true, value = "Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack")
    public Integer getReinforceExitStart() {
        return reinforceExitStart;
    }

    public void setReinforceExitStart(Integer reinforceExitStart) {
        this.reinforceExitStart = reinforceExitStart;
    }

    public CorporationCustomsOfficesResponse reinforceExitEnd(Integer reinforceExitEnd) {
        this.reinforceExitEnd = reinforceExitEnd;
        return this;
    }

    /**
     * reinforce_exit_end integer minimum: 0 maximum: 23
     * 
     * @return reinforceExitEnd
     **/
    @ApiModelProperty(example = "null", required = true, value = "reinforce_exit_end integer")
    public Integer getReinforceExitEnd() {
        return reinforceExitEnd;
    }

    public void setReinforceExitEnd(Integer reinforceExitEnd) {
        this.reinforceExitEnd = reinforceExitEnd;
    }

    public CorporationCustomsOfficesResponse corporationTaxRate(Float corporationTaxRate) {
        this.corporationTaxRate = corporationTaxRate;
        return this;
    }

    /**
     * corporation_tax_rate number
     * 
     * @return corporationTaxRate
     **/
    @ApiModelProperty(example = "null", value = "corporation_tax_rate number")
    public Float getCorporationTaxRate() {
        return corporationTaxRate;
    }

    public void setCorporationTaxRate(Float corporationTaxRate) {
        this.corporationTaxRate = corporationTaxRate;
    }

    public CorporationCustomsOfficesResponse allowAllianceAccess(Boolean allowAllianceAccess) {
        this.allowAllianceAccess = allowAllianceAccess;
        return this;
    }

    /**
     * allow_alliance_access boolean
     * 
     * @return allowAllianceAccess
     **/
    @ApiModelProperty(example = "null", required = true, value = "allow_alliance_access boolean")
    public Boolean getAllowAllianceAccess() {
        return allowAllianceAccess;
    }

    public void setAllowAllianceAccess(Boolean allowAllianceAccess) {
        this.allowAllianceAccess = allowAllianceAccess;
    }

    public CorporationCustomsOfficesResponse allianceTaxRate(Float allianceTaxRate) {
        this.allianceTaxRate = allianceTaxRate;
        return this;
    }

    /**
     * Only present if alliance access is allowed
     * 
     * @return allianceTaxRate
     **/
    @ApiModelProperty(example = "null", value = "Only present if alliance access is allowed")
    public Float getAllianceTaxRate() {
        return allianceTaxRate;
    }

    public void setAllianceTaxRate(Float allianceTaxRate) {
        this.allianceTaxRate = allianceTaxRate;
    }

    public CorporationCustomsOfficesResponse allowAccessWithStandings(Boolean allowAccessWithStandings) {
        this.allowAccessWithStandings = allowAccessWithStandings;
        return this;
    }

    /**
     * standing_level and any standing related tax rate only present when this
     * is true
     * 
     * @return allowAccessWithStandings
     **/
    @ApiModelProperty(example = "null", required = true, value = "standing_level and any standing related tax rate only present when this is true")
    public Boolean getAllowAccessWithStandings() {
        return allowAccessWithStandings;
    }

    public void setAllowAccessWithStandings(Boolean allowAccessWithStandings) {
        this.allowAccessWithStandings = allowAccessWithStandings;
    }

    public CorporationCustomsOfficesResponse standingLevel(StandingLevelEnum standingLevel) {
        this.standingLevel = standingLevel;
        return this;
    }

    /**
     * Access is allowed only for entities with this level of standing or better
     * 
     * @return standingLevel
     **/
    @ApiModelProperty(example = "null", value = "Access is allowed only for entities with this level of standing or better")
    public StandingLevelEnum getStandingLevel() {
        return standingLevel;
    }

    public void setStandingLevel(StandingLevelEnum standingLevel) {
        this.standingLevel = standingLevel;
    }

    public CorporationCustomsOfficesResponse excellentStandingTaxRate(Float excellentStandingTaxRate) {
        this.excellentStandingTaxRate = excellentStandingTaxRate;
        return this;
    }

    /**
     * Tax rate for entities with excellent level of standing, only present if
     * this level is allowed, same for all other standing related tax rates
     * 
     * @return excellentStandingTaxRate
     **/
    @ApiModelProperty(example = "null", value = "Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates")
    public Float getExcellentStandingTaxRate() {
        return excellentStandingTaxRate;
    }

    public void setExcellentStandingTaxRate(Float excellentStandingTaxRate) {
        this.excellentStandingTaxRate = excellentStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse goodStandingTaxRate(Float goodStandingTaxRate) {
        this.goodStandingTaxRate = goodStandingTaxRate;
        return this;
    }

    /**
     * good_standing_tax_rate number
     * 
     * @return goodStandingTaxRate
     **/
    @ApiModelProperty(example = "null", value = "good_standing_tax_rate number")
    public Float getGoodStandingTaxRate() {
        return goodStandingTaxRate;
    }

    public void setGoodStandingTaxRate(Float goodStandingTaxRate) {
        this.goodStandingTaxRate = goodStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse neutralStandingTaxRate(Float neutralStandingTaxRate) {
        this.neutralStandingTaxRate = neutralStandingTaxRate;
        return this;
    }

    /**
     * neutral_standing_tax_rate number
     * 
     * @return neutralStandingTaxRate
     **/
    @ApiModelProperty(example = "null", value = "neutral_standing_tax_rate number")
    public Float getNeutralStandingTaxRate() {
        return neutralStandingTaxRate;
    }

    public void setNeutralStandingTaxRate(Float neutralStandingTaxRate) {
        this.neutralStandingTaxRate = neutralStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse badStandingTaxRate(Float badStandingTaxRate) {
        this.badStandingTaxRate = badStandingTaxRate;
        return this;
    }

    /**
     * bad_standing_tax_rate number
     * 
     * @return badStandingTaxRate
     **/
    @ApiModelProperty(example = "null", value = "bad_standing_tax_rate number")
    public Float getBadStandingTaxRate() {
        return badStandingTaxRate;
    }

    public void setBadStandingTaxRate(Float badStandingTaxRate) {
        this.badStandingTaxRate = badStandingTaxRate;
    }

    public CorporationCustomsOfficesResponse terribleStandingTaxRate(Float terribleStandingTaxRate) {
        this.terribleStandingTaxRate = terribleStandingTaxRate;
        return this;
    }

    /**
     * terrible_standing_tax_rate number
     * 
     * @return terribleStandingTaxRate
     **/
    @ApiModelProperty(example = "null", value = "terrible_standing_tax_rate number")
    public Float getTerribleStandingTaxRate() {
        return terribleStandingTaxRate;
    }

    public void setTerribleStandingTaxRate(Float terribleStandingTaxRate) {
        this.terribleStandingTaxRate = terribleStandingTaxRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationCustomsOfficesResponse corporationCustomsOfficesResponse = (CorporationCustomsOfficesResponse) o;
        return Objects.equals(this.officeId, corporationCustomsOfficesResponse.officeId)
                && Objects.equals(this.systemId, corporationCustomsOfficesResponse.systemId)
                && Objects.equals(this.reinforceExitStart, corporationCustomsOfficesResponse.reinforceExitStart)
                && Objects.equals(this.reinforceExitEnd, corporationCustomsOfficesResponse.reinforceExitEnd)
                && Objects.equals(this.corporationTaxRate, corporationCustomsOfficesResponse.corporationTaxRate)
                && Objects.equals(this.allowAllianceAccess, corporationCustomsOfficesResponse.allowAllianceAccess)
                && Objects.equals(this.allianceTaxRate, corporationCustomsOfficesResponse.allianceTaxRate)
                && Objects.equals(this.allowAccessWithStandings,
                        corporationCustomsOfficesResponse.allowAccessWithStandings)
                && Objects.equals(this.standingLevel, corporationCustomsOfficesResponse.standingLevel)
                && Objects.equals(this.excellentStandingTaxRate,
                        corporationCustomsOfficesResponse.excellentStandingTaxRate)
                && Objects.equals(this.goodStandingTaxRate, corporationCustomsOfficesResponse.goodStandingTaxRate)
                && Objects
                        .equals(this.neutralStandingTaxRate, corporationCustomsOfficesResponse.neutralStandingTaxRate)
                && Objects.equals(this.badStandingTaxRate, corporationCustomsOfficesResponse.badStandingTaxRate)
                && Objects.equals(this.terribleStandingTaxRate,
                        corporationCustomsOfficesResponse.terribleStandingTaxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, systemId, reinforceExitStart, reinforceExitEnd, corporationTaxRate,
                allowAllianceAccess, allianceTaxRate, allowAccessWithStandings, standingLevel,
                excellentStandingTaxRate, goodStandingTaxRate, neutralStandingTaxRate, badStandingTaxRate,
                terribleStandingTaxRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationCustomsOfficesResponse {\n");

        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    reinforceExitStart: ").append(toIndentedString(reinforceExitStart)).append("\n");
        sb.append("    reinforceExitEnd: ").append(toIndentedString(reinforceExitEnd)).append("\n");
        sb.append("    corporationTaxRate: ").append(toIndentedString(corporationTaxRate)).append("\n");
        sb.append("    allowAllianceAccess: ").append(toIndentedString(allowAllianceAccess)).append("\n");
        sb.append("    allianceTaxRate: ").append(toIndentedString(allianceTaxRate)).append("\n");
        sb.append("    allowAccessWithStandings: ").append(toIndentedString(allowAccessWithStandings)).append("\n");
        sb.append("    standingLevel: ").append(toIndentedString(standingLevel)).append("\n");
        sb.append("    excellentStandingTaxRate: ").append(toIndentedString(excellentStandingTaxRate)).append("\n");
        sb.append("    goodStandingTaxRate: ").append(toIndentedString(goodStandingTaxRate)).append("\n");
        sb.append("    neutralStandingTaxRate: ").append(toIndentedString(neutralStandingTaxRate)).append("\n");
        sb.append("    badStandingTaxRate: ").append(toIndentedString(badStandingTaxRate)).append("\n");
        sb.append("    terribleStandingTaxRate: ").append(toIndentedString(terribleStandingTaxRate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
