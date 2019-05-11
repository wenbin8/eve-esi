/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import net.troja.eve.esi.model.CharacterStatsCharacter;
import net.troja.eve.esi.model.CharacterStatsCombat;
import net.troja.eve.esi.model.CharacterStatsIndustry;
import net.troja.eve.esi.model.CharacterStatsInventory;
import net.troja.eve.esi.model.CharacterStatsIsk;
import net.troja.eve.esi.model.CharacterStatsMarket;
import net.troja.eve.esi.model.CharacterStatsMining;
import net.troja.eve.esi.model.CharacterStatsModule;
import net.troja.eve.esi.model.CharacterStatsOrbital;
import net.troja.eve.esi.model.CharacterStatsPve;
import net.troja.eve.esi.model.CharacterStatsSocial;
import net.troja.eve.esi.model.CharacterStatsTravel;
import java.io.Serializable;

/**
 * Aggregate stats for a year
 */
@ApiModel(description = "Aggregate stats for a year")
public class CharacterStatsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ISK = "isk";
    @SerializedName(SERIALIZED_NAME_ISK)
    private CharacterStatsIsk isk = null;

    public static final String SERIALIZED_NAME_SOCIAL = "social";
    @SerializedName(SERIALIZED_NAME_SOCIAL)
    private CharacterStatsSocial social = null;

    public static final String SERIALIZED_NAME_YEAR = "year";
    @SerializedName(SERIALIZED_NAME_YEAR)
    private Integer year;

    public static final String SERIALIZED_NAME_MODULE = "module";
    @SerializedName(SERIALIZED_NAME_MODULE)
    private CharacterStatsModule module = null;

    public static final String SERIALIZED_NAME_ORBITAL = "orbital";
    @SerializedName(SERIALIZED_NAME_ORBITAL)
    private CharacterStatsOrbital orbital = null;

    public static final String SERIALIZED_NAME_COMBAT = "combat";
    @SerializedName(SERIALIZED_NAME_COMBAT)
    private CharacterStatsCombat combat = null;

    public static final String SERIALIZED_NAME_INDUSTRY = "industry";
    @SerializedName(SERIALIZED_NAME_INDUSTRY)
    private CharacterStatsIndustry industry = null;

    public static final String SERIALIZED_NAME_MINING = "mining";
    @SerializedName(SERIALIZED_NAME_MINING)
    private CharacterStatsMining mining = null;

    public static final String SERIALIZED_NAME_INVENTORY = "inventory";
    @SerializedName(SERIALIZED_NAME_INVENTORY)
    private CharacterStatsInventory inventory = null;

    public static final String SERIALIZED_NAME_MARKET = "market";
    @SerializedName(SERIALIZED_NAME_MARKET)
    private CharacterStatsMarket market = null;

    public static final String SERIALIZED_NAME_CHARACTER = "character";
    @SerializedName(SERIALIZED_NAME_CHARACTER)
    private CharacterStatsCharacter character = null;

    public static final String SERIALIZED_NAME_TRAVEL = "travel";
    @SerializedName(SERIALIZED_NAME_TRAVEL)
    private CharacterStatsTravel travel = null;

    public static final String SERIALIZED_NAME_PVE = "pve";
    @SerializedName(SERIALIZED_NAME_PVE)
    private CharacterStatsPve pve = null;

    public CharacterStatsResponse isk(CharacterStatsIsk isk) {
        this.isk = isk;
        return this;
    }

    /**
     * Get isk
     * 
     * @return isk
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsIsk getIsk() {
        return isk;
    }

    public void setIsk(CharacterStatsIsk isk) {
        this.isk = isk;
    }

    public CharacterStatsResponse social(CharacterStatsSocial social) {
        this.social = social;
        return this;
    }

    /**
     * Get social
     * 
     * @return social
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsSocial getSocial() {
        return social;
    }

    public void setSocial(CharacterStatsSocial social) {
        this.social = social;
    }

    public CharacterStatsResponse year(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * Gregorian year for this set of aggregates
     * 
     * @return year
     **/
    @ApiModelProperty(required = true, value = "Gregorian year for this set of aggregates")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public CharacterStatsResponse module(CharacterStatsModule module) {
        this.module = module;
        return this;
    }

    /**
     * Get module
     * 
     * @return module
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsModule getModule() {
        return module;
    }

    public void setModule(CharacterStatsModule module) {
        this.module = module;
    }

    public CharacterStatsResponse orbital(CharacterStatsOrbital orbital) {
        this.orbital = orbital;
        return this;
    }

    /**
     * Get orbital
     * 
     * @return orbital
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsOrbital getOrbital() {
        return orbital;
    }

    public void setOrbital(CharacterStatsOrbital orbital) {
        this.orbital = orbital;
    }

    public CharacterStatsResponse combat(CharacterStatsCombat combat) {
        this.combat = combat;
        return this;
    }

    /**
     * Get combat
     * 
     * @return combat
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsCombat getCombat() {
        return combat;
    }

    public void setCombat(CharacterStatsCombat combat) {
        this.combat = combat;
    }

    public CharacterStatsResponse industry(CharacterStatsIndustry industry) {
        this.industry = industry;
        return this;
    }

    /**
     * Get industry
     * 
     * @return industry
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsIndustry getIndustry() {
        return industry;
    }

    public void setIndustry(CharacterStatsIndustry industry) {
        this.industry = industry;
    }

    public CharacterStatsResponse mining(CharacterStatsMining mining) {
        this.mining = mining;
        return this;
    }

    /**
     * Get mining
     * 
     * @return mining
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsMining getMining() {
        return mining;
    }

    public void setMining(CharacterStatsMining mining) {
        this.mining = mining;
    }

    public CharacterStatsResponse inventory(CharacterStatsInventory inventory) {
        this.inventory = inventory;
        return this;
    }

    /**
     * Get inventory
     * 
     * @return inventory
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsInventory getInventory() {
        return inventory;
    }

    public void setInventory(CharacterStatsInventory inventory) {
        this.inventory = inventory;
    }

    public CharacterStatsResponse market(CharacterStatsMarket market) {
        this.market = market;
        return this;
    }

    /**
     * Get market
     * 
     * @return market
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsMarket getMarket() {
        return market;
    }

    public void setMarket(CharacterStatsMarket market) {
        this.market = market;
    }

    public CharacterStatsResponse character(CharacterStatsCharacter character) {
        this.character = character;
        return this;
    }

    /**
     * Get character
     * 
     * @return character
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsCharacter getCharacter() {
        return character;
    }

    public void setCharacter(CharacterStatsCharacter character) {
        this.character = character;
    }

    public CharacterStatsResponse travel(CharacterStatsTravel travel) {
        this.travel = travel;
        return this;
    }

    /**
     * Get travel
     * 
     * @return travel
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsTravel getTravel() {
        return travel;
    }

    public void setTravel(CharacterStatsTravel travel) {
        this.travel = travel;
    }

    public CharacterStatsResponse pve(CharacterStatsPve pve) {
        this.pve = pve;
        return this;
    }

    /**
     * Get pve
     * 
     * @return pve
     **/
    @ApiModelProperty(value = "")
    public CharacterStatsPve getPve() {
        return pve;
    }

    public void setPve(CharacterStatsPve pve) {
        this.pve = pve;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsResponse characterStatsResponse = (CharacterStatsResponse) o;
        return Objects.equals(this.isk, characterStatsResponse.isk)
                && Objects.equals(this.social, characterStatsResponse.social)
                && Objects.equals(this.year, characterStatsResponse.year)
                && Objects.equals(this.module, characterStatsResponse.module)
                && Objects.equals(this.orbital, characterStatsResponse.orbital)
                && Objects.equals(this.combat, characterStatsResponse.combat)
                && Objects.equals(this.industry, characterStatsResponse.industry)
                && Objects.equals(this.mining, characterStatsResponse.mining)
                && Objects.equals(this.inventory, characterStatsResponse.inventory)
                && Objects.equals(this.market, characterStatsResponse.market)
                && Objects.equals(this.character, characterStatsResponse.character)
                && Objects.equals(this.travel, characterStatsResponse.travel)
                && Objects.equals(this.pve, characterStatsResponse.pve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isk, social, year, module, orbital, combat, industry, mining, inventory, market, character,
                travel, pve);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsResponse {\n");
        sb.append("    isk: ").append(toIndentedString(isk)).append("\n");
        sb.append("    social: ").append(toIndentedString(social)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    orbital: ").append(toIndentedString(orbital)).append("\n");
        sb.append("    combat: ").append(toIndentedString(combat)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    mining: ").append(toIndentedString(mining)).append("\n");
        sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
        sb.append("    market: ").append(toIndentedString(market)).append("\n");
        sb.append("    character: ").append(toIndentedString(character)).append("\n");
        sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
        sb.append("    pve: ").append(toIndentedString(pve)).append("\n");
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
