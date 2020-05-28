/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.3.8
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
import java.io.Serializable;

/**
 * character_id and response of an attendee
 */
@ApiModel(description = "character_id and response of an attendee")
public class CharacterCalendarAttendeesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_CHARACTER_ID = "character_id";
    @SerializedName(SERIALIZED_NAME_CHARACTER_ID)
    private Integer characterId;

    /**
     * event_response string
     */
    @JsonAdapter(EventResponseEnum.Adapter.class)
    public enum EventResponseEnum {
        DECLINED("declined"),

        NOT_RESPONDED("not_responded"),

        ACCEPTED("accepted"),

        TENTATIVE("tentative");

        private String value;

        EventResponseEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EventResponseEnum fromValue(String value) {
            for (EventResponseEnum b : EventResponseEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<EventResponseEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EventResponseEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EventResponseEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EventResponseEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_EVENT_RESPONSE = "event_response";
    @SerializedName(SERIALIZED_NAME_EVENT_RESPONSE)
    private String eventResponse;
    private EventResponseEnum eventResponseEnum;

    public CharacterCalendarAttendeesResponse characterId(Integer characterId) {

        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public CharacterCalendarAttendeesResponse eventResponse(EventResponseEnum eventResponseEnum) {

        this.eventResponseEnum = eventResponseEnum;
        return this;
    }

    public CharacterCalendarAttendeesResponse eventResponseString(String eventResponse) {

        this.eventResponse = eventResponse;
        return this;
    }

    /**
     * event_response string
     * 
     * @return eventResponse
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "event_response string")
    public EventResponseEnum getEventResponse() {
        if (eventResponseEnum == null) {
            eventResponseEnum = EventResponseEnum.fromValue(eventResponse);
        }
        return eventResponseEnum;
    }

    public String getEventResponseString() {
        return eventResponse;
    }

    public void setEventResponse(EventResponseEnum eventResponseEnum) {
        this.eventResponseEnum = eventResponseEnum;
    }

    public void setEventResponseString(String eventResponse) {
        this.eventResponse = eventResponse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCalendarAttendeesResponse characterCalendarAttendeesResponse = (CharacterCalendarAttendeesResponse) o;
        return Objects.equals(this.characterId, characterCalendarAttendeesResponse.characterId)
                && Objects.equals(this.eventResponse, characterCalendarAttendeesResponse.eventResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, eventResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterCalendarAttendeesResponse {\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
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
