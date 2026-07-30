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
public class BLiveSendMessageData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendMessageData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendMessageData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendMessageData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendMessageData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendMessageData newInstance() {
            return new BLiveSendMessageData();
        }

        public boolean parseField(BLiveSendMessageData bLiveSendMessageData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "extInfo":
                    bLiveSendMessageData.extInfo = BLiveSendMessageExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "fakeId":
                    bLiveSendMessageData.fakeId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveSendMessageData.liveId = jsonParser.getValueAsString();
                    return true;
                case "templateType":
                    bLiveSendMessageData.templateType = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveSendMessageData.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveSendMessageData.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveSendMessageData.userId = jsonParser.getValueAsString();
                    return true;
                case "roomType":
                    bLiveSendMessageData.roomType = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveSendMessageData.type = jsonParser.getValueAsInt();
                    return true;
                case "value":
                    bLiveSendMessageData.value = jsonParser.getValueAsString();
                    return true;
                case "liveMode":
                    bLiveSendMessageData.liveMode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendMessageData bLiveSendMessageData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendMessageData.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = bLiveSendMessageData.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveSendMessageData.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveSendMessageData.value;
            if (str4 != null) {
                jsonGenerator.writeStringField("value", str4);
            }
            String str5 = bLiveSendMessageData.roomType;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomType", str5);
            }
            jsonGenerator.writeNumberField("type", bLiveSendMessageData.type);
            String str6 = bLiveSendMessageData.liveId;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveId", str6);
            }
            String str7 = bLiveSendMessageData.fakeId;
            if (str7 != null) {
                jsonGenerator.writeStringField("fakeId", str7);
            }
            if (bLiveSendMessageData.extInfo != null) {
                jsonGenerator.writeFieldName("extInfo");
                BLiveSendMessageExtra.JSON_ADAPTER.serialize(bLiveSendMessageData.extInfo, jsonGenerator, true);
            }
            String str8 = bLiveSendMessageData.liveMode;
            if (str8 != null) {
                jsonGenerator.writeStringField("liveMode", str8);
            }
            String str9 = bLiveSendMessageData.templateType;
            if (str9 != null) {
                jsonGenerator.writeStringField("templateType", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendMessageData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendmessagedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveSendMessageExtra extInfo;

    @NonNull
    @ProtobufIndex(index = 8)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String liveMode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomType;

    @NonNull
    @ProtobufIndex(index = 11)
    public String templateType;

    @ProtobufIndex(index = 6)
    public int type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String value;

    public static BLiveSendMessageData new_() {
        BLiveSendMessageData bLiveSendMessageData = new BLiveSendMessageData();
        bLiveSendMessageData.nullCheck();
        return bLiveSendMessageData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendMessageData mo225055clone() {
        BLiveSendMessageData bLiveSendMessageData = new BLiveSendMessageData();
        bLiveSendMessageData.anchorId = this.anchorId;
        bLiveSendMessageData.roomId = this.roomId;
        bLiveSendMessageData.userId = this.userId;
        bLiveSendMessageData.value = this.value;
        bLiveSendMessageData.roomType = this.roomType;
        bLiveSendMessageData.type = this.type;
        bLiveSendMessageData.liveId = this.liveId;
        bLiveSendMessageData.fakeId = this.fakeId;
        BLiveSendMessageExtra bLiveSendMessageExtra = this.extInfo;
        if (bLiveSendMessageExtra != null) {
            bLiveSendMessageData.extInfo = bLiveSendMessageExtra.mo225055clone();
        }
        bLiveSendMessageData.liveMode = this.liveMode;
        bLiveSendMessageData.templateType = this.templateType;
        return bLiveSendMessageData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendMessageData)) {
            return false;
        }
        BLiveSendMessageData bLiveSendMessageData = (BLiveSendMessageData) obj;
        return ValueObject.util_equals(this.anchorId, bLiveSendMessageData.anchorId) && ValueObject.util_equals(this.roomId, bLiveSendMessageData.roomId) && ValueObject.util_equals(this.userId, bLiveSendMessageData.userId) && ValueObject.util_equals(this.value, bLiveSendMessageData.value) && ValueObject.util_equals(this.roomType, bLiveSendMessageData.roomType) && this.type == bLiveSendMessageData.type && ValueObject.util_equals(this.liveId, bLiveSendMessageData.liveId) && ValueObject.util_equals(this.fakeId, bLiveSendMessageData.fakeId) && ValueObject.util_equals(this.extInfo, bLiveSendMessageData.extInfo) && ValueObject.util_equals(this.liveMode, bLiveSendMessageData.liveMode) && ValueObject.util_equals(this.templateType, bLiveSendMessageData.templateType);
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
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.value;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomType;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.type) * 41;
        String str6 = this.liveId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.fakeId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveSendMessageExtra bLiveSendMessageExtra = this.extInfo;
        int iHashCode8 = (iHashCode7 + (bLiveSendMessageExtra != null ? bLiveSendMessageExtra.hashCode() : 0)) * 41;
        String str8 = this.liveMode;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.templateType;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.roomType == null) {
            this.roomType = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.extInfo == null) {
            this.extInfo = BLiveSendMessageExtra.new_();
        }
        if (this.liveMode == null) {
            this.liveMode = "";
        }
        if (this.templateType == null) {
            this.templateType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
