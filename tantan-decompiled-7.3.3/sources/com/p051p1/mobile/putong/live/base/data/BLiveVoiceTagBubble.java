package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceTagBubble extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceTagBubble> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceTagBubble>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceTagBubble.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceTagBubble.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceTagBubble newInstance() {
            return new BLiveVoiceTagBubble();
        }

        public boolean parseField(BLiveVoiceTagBubble bLiveVoiceTagBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fromUserId":
                    bLiveVoiceTagBubble.fromUserId = jsonParser.getValueAsString();
                    return true;
                case "chatActionType":
                    bLiveVoiceTagBubble.chatActionType = jsonParser.getValueAsString();
                    return true;
                case "fromUserAvatar":
                    bLiveVoiceTagBubble.fromUserAvatar = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveVoiceTagBubble.userName = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveVoiceTagBubble.text = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    bLiveVoiceTagBubble.buttonText = jsonParser.getValueAsString();
                    return true;
                case "fromUserName":
                    bLiveVoiceTagBubble.fromUserName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceTagBubble bLiveVoiceTagBubble, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceTagBubble.userName;
            if (str != null) {
                jsonGenerator.writeStringField("userName", str);
            }
            String str2 = bLiveVoiceTagBubble.fromUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("fromUserId", str2);
            }
            String str3 = bLiveVoiceTagBubble.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            String str4 = bLiveVoiceTagBubble.fromUserName;
            if (str4 != null) {
                jsonGenerator.writeStringField("fromUserName", str4);
            }
            String str5 = bLiveVoiceTagBubble.fromUserAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("fromUserAvatar", str5);
            }
            String str6 = bLiveVoiceTagBubble.buttonText;
            if (str6 != null) {
                jsonGenerator.writeStringField("buttonText", str6);
            }
            String str7 = bLiveVoiceTagBubble.chatActionType;
            if (str7 != null) {
                jsonGenerator.writeStringField("chatActionType", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceTagBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicetagbubble";

    @NonNull
    @ProtobufIndex(index = 6)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 7)
    public String chatActionType;

    @NonNull
    @ProtobufIndex(index = 5)
    public String fromUserAvatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String fromUserId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String fromUserName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userName;

    public static BLiveVoiceTagBubble new_() {
        BLiveVoiceTagBubble bLiveVoiceTagBubble = new BLiveVoiceTagBubble();
        bLiveVoiceTagBubble.nullCheck();
        return bLiveVoiceTagBubble;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceTagBubble mo225055clone() {
        BLiveVoiceTagBubble bLiveVoiceTagBubble = new BLiveVoiceTagBubble();
        bLiveVoiceTagBubble.userName = this.userName;
        bLiveVoiceTagBubble.fromUserId = this.fromUserId;
        bLiveVoiceTagBubble.text = this.text;
        bLiveVoiceTagBubble.fromUserName = this.fromUserName;
        bLiveVoiceTagBubble.fromUserAvatar = this.fromUserAvatar;
        bLiveVoiceTagBubble.buttonText = this.buttonText;
        bLiveVoiceTagBubble.chatActionType = this.chatActionType;
        return bLiveVoiceTagBubble;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceTagBubble)) {
            return false;
        }
        BLiveVoiceTagBubble bLiveVoiceTagBubble = (BLiveVoiceTagBubble) obj;
        return ValueObject.util_equals(this.userName, bLiveVoiceTagBubble.userName) && ValueObject.util_equals(this.fromUserId, bLiveVoiceTagBubble.fromUserId) && ValueObject.util_equals(this.text, bLiveVoiceTagBubble.text) && ValueObject.util_equals(this.fromUserName, bLiveVoiceTagBubble.fromUserName) && ValueObject.util_equals(this.fromUserAvatar, bLiveVoiceTagBubble.fromUserAvatar) && ValueObject.util_equals(this.buttonText, bLiveVoiceTagBubble.buttonText) && ValueObject.util_equals(this.chatActionType, bLiveVoiceTagBubble.chatActionType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.fromUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.fromUserName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.fromUserAvatar;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.buttonText;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.chatActionType;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.fromUserId == null) {
            this.fromUserId = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.fromUserName == null) {
            this.fromUserName = "";
        }
        if (this.fromUserAvatar == null) {
            this.fromUserAvatar = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.chatActionType == null) {
            this.chatActionType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
