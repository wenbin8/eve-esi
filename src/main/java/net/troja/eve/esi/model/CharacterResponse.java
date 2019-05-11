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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
    @SerializedName(SERIALIZED_NAME_BIRTHDAY)
    private OffsetDateTime birthday;

    public static final String SERIALIZED_NAME_ALLIANCE_ID = "alliance_id";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_ID)
    private Integer allianceId;

    public static final String SERIALIZED_NAME_ANCESTRY_ID = "ancestry_id";
    @SerializedName(SERIALIZED_NAME_ANCESTRY_ID)
    private Integer ancestryId;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_SECURITY_STATUS = "security_status";
    @SerializedName(SERIALIZED_NAME_SECURITY_STATUS)
    private Float securityStatus;

    /**
     * gender string
     */
    @JsonAdapter(GenderEnum.Adapter.class)
    public enum GenderEnum {
        FEMALE("female"),

        MALE("male");

        private String value;

        GenderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static GenderEnum fromValue(String value) {
            for (GenderEnum b : GenderEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<GenderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public GenderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return GenderEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_GENDER = "gender";
    @SerializedName(SERIALIZED_NAME_GENDER)
    private GenderEnum gender;

    public static final String SERIALIZED_NAME_RACE_ID = "race_id";
    @SerializedName(SERIALIZED_NAME_RACE_ID)
    private Integer raceId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_BLOODLINE_ID = "bloodline_id";
    @SerializedName(SERIALIZED_NAME_BLOODLINE_ID)
    private Integer bloodlineId;

    public CharacterResponse birthday(OffsetDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    /**
     * Creation date of the character
     * 
     * @return birthday
     **/
    @ApiModelProperty(required = true, value = "Creation date of the character")
    public OffsetDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(OffsetDateTime birthday) {
        this.birthday = birthday;
    }

    public CharacterResponse allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * The character&#39;s alliance ID
     * 
     * @return allianceId
     **/
    @ApiModelProperty(value = "The character's alliance ID")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public CharacterResponse ancestryId(Integer ancestryId) {
        this.ancestryId = ancestryId;
        return this;
    }

    /**
     * ancestry_id integer
     * 
     * @return ancestryId
     **/
    @ApiModelProperty(value = "ancestry_id integer")
    public Integer getAncestryId() {
        return ancestryId;
    }

    public void setAncestryId(Integer ancestryId) {
        this.ancestryId = ancestryId;
    }

    public CharacterResponse corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * The character&#39;s corporation ID
     * 
     * @return corporationId
     **/
    @ApiModelProperty(required = true, value = "The character's corporation ID")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public CharacterResponse securityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }

    /**
     * security_status number minimum: -1E+1 maximum: 1E+1
     * 
     * @return securityStatus
     **/
    @ApiModelProperty(value = "security_status number")
    public Float getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(Float securityStatus) {
        this.securityStatus = securityStatus;
    }

    public CharacterResponse gender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    /**
     * gender string
     * 
     * @return gender
     **/
    @ApiModelProperty(required = true, value = "gender string")
    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public CharacterResponse raceId(Integer raceId) {
        this.raceId = raceId;
        return this;
    }

    /**
     * race_id integer
     * 
     * @return raceId
     **/
    @ApiModelProperty(required = true, value = "race_id integer")
    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public CharacterResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CharacterResponse factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * ID of the faction the character is fighting for, if the character is
     * enlisted in Factional Warfare
     * 
     * @return factionId
     **/
    @ApiModelProperty(value = "ID of the faction the character is fighting for, if the character is enlisted in Factional Warfare")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public CharacterResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The individual title of the character
     * 
     * @return title
     **/
    @ApiModelProperty(value = "The individual title of the character")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CharacterResponse bloodlineId(Integer bloodlineId) {
        this.bloodlineId = bloodlineId;
        return this;
    }

    /**
     * bloodline_id integer
     * 
     * @return bloodlineId
     **/
    @ApiModelProperty(required = true, value = "bloodline_id integer")
    public Integer getBloodlineId() {
        return bloodlineId;
    }

    public void setBloodlineId(Integer bloodlineId) {
        this.bloodlineId = bloodlineId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterResponse characterResponse = (CharacterResponse) o;
        return Objects.equals(this.birthday, characterResponse.birthday)
                && Objects.equals(this.allianceId, characterResponse.allianceId)
                && Objects.equals(this.ancestryId, characterResponse.ancestryId)
                && Objects.equals(this.corporationId, characterResponse.corporationId)
                && Objects.equals(this.securityStatus, characterResponse.securityStatus)
                && Objects.equals(this.gender, characterResponse.gender)
                && Objects.equals(this.raceId, characterResponse.raceId)
                && Objects.equals(this.name, characterResponse.name)
                && Objects.equals(this.description, characterResponse.description)
                && Objects.equals(this.factionId, characterResponse.factionId)
                && Objects.equals(this.title, characterResponse.title)
                && Objects.equals(this.bloodlineId, characterResponse.bloodlineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, allianceId, ancestryId, corporationId, securityStatus, gender, raceId, name,
                description, factionId, title, bloodlineId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterResponse {\n");
        sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    ancestryId: ").append(toIndentedString(ancestryId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
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
