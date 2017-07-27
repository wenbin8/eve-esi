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
public class CharacterBlueprintsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("item_id")
    private Long itemId = null;

    /**
     * Indicates something about this item's storage location. The flag is used
     * to differentiate between hangar divisions, drone bay, fitting location,
     * and similar.
     */
    public enum LocationFlagEnum {
        AUTOFIT("AutoFit"),

        CARGO("Cargo"),

        CORPSEBAY("CorpseBay"),

        DRONEBAY("DroneBay"),

        FLEETHANGAR("FleetHangar"),

        DELIVERIES("Deliveries"),

        HIDDENMODIFIERS("HiddenModifiers"),

        HANGAR("Hangar"),

        HANGARALL("HangarAll"),

        LOSLOT0("LoSlot0"),

        LOSLOT1("LoSlot1"),

        LOSLOT2("LoSlot2"),

        LOSLOT3("LoSlot3"),

        LOSLOT4("LoSlot4"),

        LOSLOT5("LoSlot5"),

        LOSLOT6("LoSlot6"),

        LOSLOT7("LoSlot7"),

        MEDSLOT0("MedSlot0"),

        MEDSLOT1("MedSlot1"),

        MEDSLOT2("MedSlot2"),

        MEDSLOT3("MedSlot3"),

        MEDSLOT4("MedSlot4"),

        MEDSLOT5("MedSlot5"),

        MEDSLOT6("MedSlot6"),

        MEDSLOT7("MedSlot7"),

        HISLOT0("HiSlot0"),

        HISLOT1("HiSlot1"),

        HISLOT2("HiSlot2"),

        HISLOT3("HiSlot3"),

        HISLOT4("HiSlot4"),

        HISLOT5("HiSlot5"),

        HISLOT6("HiSlot6"),

        HISLOT7("HiSlot7"),

        ASSETSAFETY("AssetSafety"),

        LOCKED("Locked"),

        UNLOCKED("Unlocked"),

        IMPLANT("Implant"),

        QUAFEBAY("QuafeBay"),

        RIGSLOT0("RigSlot0"),

        RIGSLOT1("RigSlot1"),

        RIGSLOT2("RigSlot2"),

        RIGSLOT3("RigSlot3"),

        RIGSLOT4("RigSlot4"),

        RIGSLOT5("RigSlot5"),

        RIGSLOT6("RigSlot6"),

        RIGSLOT7("RigSlot7"),

        SHIPHANGAR("ShipHangar"),

        SPECIALIZEDFUELBAY("SpecializedFuelBay"),

        SPECIALIZEDOREHOLD("SpecializedOreHold"),

        SPECIALIZEDGASHOLD("SpecializedGasHold"),

        SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),

        SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),

        SPECIALIZEDSHIPHOLD("SpecializedShipHold"),

        SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),

        SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),

        SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),

        SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),

        SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),

        SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),

        SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),

        SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),

        SUBSYSTEMSLOT0("SubSystemSlot0"),

        SUBSYSTEMSLOT1("SubSystemSlot1"),

        SUBSYSTEMSLOT2("SubSystemSlot2"),

        SUBSYSTEMSLOT3("SubSystemSlot3"),

        SUBSYSTEMSLOT4("SubSystemSlot4"),

        SUBSYSTEMSLOT5("SubSystemSlot5"),

        SUBSYSTEMSLOT6("SubSystemSlot6"),

        SUBSYSTEMSLOT7("SubSystemSlot7"),

        FIGHTERBAY("FighterBay"),

        FIGHTERTUBE0("FighterTube0"),

        FIGHTERTUBE1("FighterTube1"),

        FIGHTERTUBE2("FighterTube2"),

        FIGHTERTUBE3("FighterTube3"),

        FIGHTERTUBE4("FighterTube4"),

        MODULE("Module");

        private String value;

        LocationFlagEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationFlagEnum fromValue(String text) {
            for (LocationFlagEnum b : LocationFlagEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("location_flag")
    private LocationFlagEnum locationFlag = null;

    @JsonProperty("location_id")
    private Long locationId = null;

    @JsonProperty("material_efficiency")
    private Integer materialEfficiency = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("runs")
    private Integer runs = null;

    @JsonProperty("time_efficiency")
    private Integer timeEfficiency = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public CharacterBlueprintsResponse itemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * Unique ID for this item. The ID of an item is stable if that item is not
     * repackaged, stacked, detached from a stack, assembled, or otherwise
     * altered. If an item is changed in one of these ways, then the ID will
     * also change (see notes below).
     * 
     * @return itemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique ID for this item. The ID of an item is stable if that item is not repackaged, stacked, detached from a stack, assembled, or otherwise altered. If an item is changed in one of these ways, then the ID will also change (see notes below).")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public CharacterBlueprintsResponse locationFlag(LocationFlagEnum locationFlag) {
        this.locationFlag = locationFlag;
        return this;
    }

    /**
     * Indicates something about this item's storage location. The flag is used
     * to differentiate between hangar divisions, drone bay, fitting location,
     * and similar.
     * 
     * @return locationFlag
     **/
    @ApiModelProperty(example = "null", required = true, value = "Indicates something about this item's storage location. The flag is used to differentiate between hangar divisions, drone bay, fitting location, and similar.")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }

    public void setLocationFlag(LocationFlagEnum locationFlag) {
        this.locationFlag = locationFlag;
    }

    public CharacterBlueprintsResponse locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * References a solar system, station or itemID if this blueprint is located
     * within a container. If an itemID the Character - AssetList API must be
     * queried to find the container using the itemID, from which the correct
     * location of the Blueprint can be derived.
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "References a solar system, station or itemID if this blueprint is located within a container. If an itemID the Character - AssetList API must be queried to find the container using the itemID, from which the correct location of the Blueprint can be derived.")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CharacterBlueprintsResponse materialEfficiency(Integer materialEfficiency) {
        this.materialEfficiency = materialEfficiency;
        return this;
    }

    /**
     * Material Efficiency Level of the blueprint, can be any integer between 0
     * and 10.
     * 
     * @return materialEfficiency
     **/
    @ApiModelProperty(example = "null", required = true, value = "Material Efficiency Level of the blueprint, can be any integer between 0 and 10.")
    public Integer getMaterialEfficiency() {
        return materialEfficiency;
    }

    public void setMaterialEfficiency(Integer materialEfficiency) {
        this.materialEfficiency = materialEfficiency;
    }

    public CharacterBlueprintsResponse quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Typically will be -1 or -2 designating a singleton item, where -1 is an
     * original and -2 is a copy. It can be a positive integer if it is a stack
     * of blueprint originals fresh from the market (no activities performed on
     * them yet).
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "Typically will be -1 or -2 designating a singleton item, where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (no activities performed on them yet).")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CharacterBlueprintsResponse runs(Integer runs) {
        this.runs = runs;
        return this;
    }

    /**
     * Number of runs remaining if the blueprint is a copy, -1 if it is an
     * original.
     * 
     * @return runs
     **/
    @ApiModelProperty(example = "null", required = true, value = "Number of runs remaining if the blueprint is a copy, -1 if it is an original.")
    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public CharacterBlueprintsResponse timeEfficiency(Integer timeEfficiency) {
        this.timeEfficiency = timeEfficiency;
        return this;
    }

    /**
     * Time Efficiency Level of the blueprint, can be any even integer between 0
     * and 20.
     * 
     * @return timeEfficiency
     **/
    @ApiModelProperty(example = "null", required = true, value = "Time Efficiency Level of the blueprint, can be any even integer between 0 and 20.")
    public Integer getTimeEfficiency() {
        return timeEfficiency;
    }

    public void setTimeEfficiency(Integer timeEfficiency) {
        this.timeEfficiency = timeEfficiency;
    }

    public CharacterBlueprintsResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterBlueprintsResponse characterBlueprintsResponse = (CharacterBlueprintsResponse) o;
        return Objects.equals(this.itemId, characterBlueprintsResponse.itemId)
                && Objects.equals(this.locationFlag, characterBlueprintsResponse.locationFlag)
                && Objects.equals(this.locationId, characterBlueprintsResponse.locationId)
                && Objects.equals(this.materialEfficiency, characterBlueprintsResponse.materialEfficiency)
                && Objects.equals(this.quantity, characterBlueprintsResponse.quantity)
                && Objects.equals(this.runs, characterBlueprintsResponse.runs)
                && Objects.equals(this.timeEfficiency, characterBlueprintsResponse.timeEfficiency)
                && Objects.equals(this.typeId, characterBlueprintsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, locationFlag, locationId, materialEfficiency, quantity, runs, timeEfficiency,
                typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterBlueprintsResponse {\n");

        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    materialEfficiency: ").append(toIndentedString(materialEfficiency)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
        sb.append("    timeEfficiency: ").append(toIndentedString(timeEfficiency)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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