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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationRolesHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private Integer issuerId;

    /**
     * new_role string
     */
    @JsonAdapter(NewRolesEnum.Adapter.class)
    public enum NewRolesEnum {
        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        ACCOUNTANT("Accountant"),

        AUDITOR("Auditor"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        CONTRACT_MANAGER("Contract_Manager"),

        DIPLOMAT("Diplomat"),

        DIRECTOR("Director"),

        FACTORY_MANAGER("Factory_Manager"),

        FITTING_MANAGER("Fitting_Manager"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_OFFICE("Rent_Office"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        SECURITY_OFFICER("Security_Officer"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        STATION_MANAGER("Station_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer"),

        TRADER("Trader");

        private String value;

        NewRolesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static NewRolesEnum fromValue(String value) {
            for (NewRolesEnum b : NewRolesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<NewRolesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final NewRolesEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public NewRolesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return NewRolesEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_NEW_ROLES = "new_roles";
    @SerializedName(SERIALIZED_NAME_NEW_ROLES)
    private List<NewRolesEnum> newRoles = new ArrayList<>();

    /**
     * old_role string
     */
    @JsonAdapter(OldRolesEnum.Adapter.class)
    public enum OldRolesEnum {
        ACCOUNT_TAKE_1("Account_Take_1"),

        ACCOUNT_TAKE_2("Account_Take_2"),

        ACCOUNT_TAKE_3("Account_Take_3"),

        ACCOUNT_TAKE_4("Account_Take_4"),

        ACCOUNT_TAKE_5("Account_Take_5"),

        ACCOUNT_TAKE_6("Account_Take_6"),

        ACCOUNT_TAKE_7("Account_Take_7"),

        ACCOUNTANT("Accountant"),

        AUDITOR("Auditor"),

        COMMUNICATIONS_OFFICER("Communications_Officer"),

        CONFIG_EQUIPMENT("Config_Equipment"),

        CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

        CONTAINER_TAKE_1("Container_Take_1"),

        CONTAINER_TAKE_2("Container_Take_2"),

        CONTAINER_TAKE_3("Container_Take_3"),

        CONTAINER_TAKE_4("Container_Take_4"),

        CONTAINER_TAKE_5("Container_Take_5"),

        CONTAINER_TAKE_6("Container_Take_6"),

        CONTAINER_TAKE_7("Container_Take_7"),

        CONTRACT_MANAGER("Contract_Manager"),

        DIPLOMAT("Diplomat"),

        DIRECTOR("Director"),

        FACTORY_MANAGER("Factory_Manager"),

        FITTING_MANAGER("Fitting_Manager"),

        HANGAR_QUERY_1("Hangar_Query_1"),

        HANGAR_QUERY_2("Hangar_Query_2"),

        HANGAR_QUERY_3("Hangar_Query_3"),

        HANGAR_QUERY_4("Hangar_Query_4"),

        HANGAR_QUERY_5("Hangar_Query_5"),

        HANGAR_QUERY_6("Hangar_Query_6"),

        HANGAR_QUERY_7("Hangar_Query_7"),

        HANGAR_TAKE_1("Hangar_Take_1"),

        HANGAR_TAKE_2("Hangar_Take_2"),

        HANGAR_TAKE_3("Hangar_Take_3"),

        HANGAR_TAKE_4("Hangar_Take_4"),

        HANGAR_TAKE_5("Hangar_Take_5"),

        HANGAR_TAKE_6("Hangar_Take_6"),

        HANGAR_TAKE_7("Hangar_Take_7"),

        JUNIOR_ACCOUNTANT("Junior_Accountant"),

        PERSONNEL_MANAGER("Personnel_Manager"),

        RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

        RENT_OFFICE("Rent_Office"),

        RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

        SECURITY_OFFICER("Security_Officer"),

        STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

        STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

        STATION_MANAGER("Station_Manager"),

        TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),

        TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer"),

        TRADER("Trader");

        private String value;

        OldRolesEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OldRolesEnum fromValue(String value) {
            for (OldRolesEnum b : OldRolesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<OldRolesEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OldRolesEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OldRolesEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OldRolesEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_OLD_ROLES = "old_roles";
    @SerializedName(SERIALIZED_NAME_OLD_ROLES)
    private List<OldRolesEnum> oldRoles = new ArrayList<>();

    /**
     * role_type string
     */
    @JsonAdapter(RoleTypeEnum.Adapter.class)
    public enum RoleTypeEnum {
        GRANTABLE_ROLES("grantable_roles"),

        GRANTABLE_ROLES_AT_BASE("grantable_roles_at_base"),

        GRANTABLE_ROLES_AT_HQ("grantable_roles_at_hq"),

        GRANTABLE_ROLES_AT_OTHER("grantable_roles_at_other"),

        ROLES("roles"),

        ROLES_AT_BASE("roles_at_base"),

        ROLES_AT_HQ("roles_at_hq"),

        ROLES_AT_OTHER("roles_at_other");

        private String value;

        RoleTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RoleTypeEnum fromValue(String value) {
            for (RoleTypeEnum b : RoleTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<RoleTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RoleTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RoleTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RoleTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLE_TYPE = "role_type";
    @SerializedName(SERIALIZED_NAME_ROLE_TYPE)
    private RoleTypeEnum roleType;

    public static final String SERIALIZED_NAME_CHANGED_AT = "changed_at";
    @SerializedName(SERIALIZED_NAME_CHANGED_AT)
    private OffsetDateTime changedAt;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    public CorporationRolesHistoryResponse issuerId(Integer issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * ID of the character who issued this change
     * 
     * @return issuerId
     **/
    @ApiModelProperty(required = true, value = "ID of the character who issued this change")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public CorporationRolesHistoryResponse newRoles(List<NewRolesEnum> newRoles) {
        this.newRoles = newRoles;
        return this;
    }

    public CorporationRolesHistoryResponse addNewRolesItem(NewRolesEnum newRolesItem) {
        this.newRoles.add(newRolesItem);
        return this;
    }

    /**
     * new_roles array
     * 
     * @return newRoles
     **/
    @ApiModelProperty(required = true, value = "new_roles array")
    public List<NewRolesEnum> getNewRoles() {
        return newRoles;
    }

    public void setNewRoles(List<NewRolesEnum> newRoles) {
        this.newRoles = newRoles;
    }

    public CorporationRolesHistoryResponse oldRoles(List<OldRolesEnum> oldRoles) {
        this.oldRoles = oldRoles;
        return this;
    }

    public CorporationRolesHistoryResponse addOldRolesItem(OldRolesEnum oldRolesItem) {
        this.oldRoles.add(oldRolesItem);
        return this;
    }

    /**
     * old_roles array
     * 
     * @return oldRoles
     **/
    @ApiModelProperty(required = true, value = "old_roles array")
    public List<OldRolesEnum> getOldRoles() {
        return oldRoles;
    }

    public void setOldRoles(List<OldRolesEnum> oldRoles) {
        this.oldRoles = oldRoles;
    }

    public CorporationRolesHistoryResponse roleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * role_type string
     * 
     * @return roleType
     **/
    @ApiModelProperty(required = true, value = "role_type string")
    public RoleTypeEnum getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
    }

    public CorporationRolesHistoryResponse changedAt(OffsetDateTime changedAt) {
        this.changedAt = changedAt;
        return this;
    }

    /**
     * changed_at string
     * 
     * @return changedAt
     **/
    @ApiModelProperty(required = true, value = "changed_at string")
    public OffsetDateTime getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(OffsetDateTime changedAt) {
        this.changedAt = changedAt;
    }

    public CorporationRolesHistoryResponse characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * The character whose roles are changed
     * 
     * @return characterId
     **/
    @ApiModelProperty(required = true, value = "The character whose roles are changed")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationRolesHistoryResponse corporationRolesHistoryResponse = (CorporationRolesHistoryResponse) o;
        return Objects.equals(this.issuerId, corporationRolesHistoryResponse.issuerId)
                && Objects.equals(this.newRoles, corporationRolesHistoryResponse.newRoles)
                && Objects.equals(this.oldRoles, corporationRolesHistoryResponse.oldRoles)
                && Objects.equals(this.roleType, corporationRolesHistoryResponse.roleType)
                && Objects.equals(this.changedAt, corporationRolesHistoryResponse.changedAt)
                && Objects.equals(this.characterId, corporationRolesHistoryResponse.characterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuerId, newRoles, oldRoles, roleType, changedAt, characterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationRolesHistoryResponse {\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
        sb.append("    oldRoles: ").append(toIndentedString(oldRoles)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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
