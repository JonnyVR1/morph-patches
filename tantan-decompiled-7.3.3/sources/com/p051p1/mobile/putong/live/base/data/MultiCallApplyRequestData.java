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
public class MultiCallApplyRequestData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<MultiCallApplyRequestData> JSON_ADAPTER = new ObjectJsonAdapter<MultiCallApplyRequestData>() { // from class: com.p1.mobile.putong.live.base.data.MultiCallApplyRequestData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MultiCallApplyRequestData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MultiCallApplyRequestData newInstance() {
            return new MultiCallApplyRequestData();
        }

        public boolean parseField(MultiCallApplyRequestData multiCallApplyRequestData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enterRoomSource":
                    multiCallApplyRequestData.enterRoomSource = jsonParser.getValueAsString();
                    return true;
                case "fakeId":
                    multiCallApplyRequestData.fakeId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    multiCallApplyRequestData.liveId = jsonParser.getValueAsString();
                    return true;
                case "source":
                    multiCallApplyRequestData.source = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    multiCallApplyRequestData.userId = jsonParser.getValueAsString();
                    return true;
                case "ownerLiveId":
                    multiCallApplyRequestData.ownerLiveId = jsonParser.getValueAsString();
                    return true;
                case "category":
                    multiCallApplyRequestData.category = jsonParser.getValueAsString();
                    return true;
                case "inviteId":
                    multiCallApplyRequestData.inviteId = jsonParser.getValueAsString();
                    return true;
                case "ownerCreateSource":
                    multiCallApplyRequestData.ownerCreateSource = jsonParser.getValueAsString();
                    return true;
                case "ownerMultiCallOrder":
                    multiCallApplyRequestData.ownerMultiCallOrder = jsonParser.getValueAsString();
                    return true;
                case "intendPosition":
                    multiCallApplyRequestData.intendPosition = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MultiCallApplyRequestData multiCallApplyRequestData, JsonGenerator jsonGenerator) throws IOException {
            String str = multiCallApplyRequestData.ownerMultiCallOrder;
            if (str != null) {
                jsonGenerator.writeStringField("ownerMultiCallOrder", str);
            }
            String str2 = multiCallApplyRequestData.ownerLiveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("ownerLiveId", str2);
            }
            String str3 = multiCallApplyRequestData.inviteId;
            if (str3 != null) {
                jsonGenerator.writeStringField("inviteId", str3);
            }
            String str4 = multiCallApplyRequestData.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            String str5 = multiCallApplyRequestData.source;
            if (str5 != null) {
                jsonGenerator.writeStringField("source", str5);
            }
            jsonGenerator.writeNumberField("intendPosition", multiCallApplyRequestData.intendPosition);
            String str6 = multiCallApplyRequestData.fakeId;
            if (str6 != null) {
                jsonGenerator.writeStringField("fakeId", str6);
            }
            String str7 = multiCallApplyRequestData.userId;
            if (str7 != null) {
                jsonGenerator.writeStringField("userId", str7);
            }
            String str8 = multiCallApplyRequestData.liveId;
            if (str8 != null) {
                jsonGenerator.writeStringField("liveId", str8);
            }
            String str9 = multiCallApplyRequestData.enterRoomSource;
            if (str9 != null) {
                jsonGenerator.writeStringField("enterRoomSource", str9);
            }
            String str10 = multiCallApplyRequestData.ownerCreateSource;
            if (str10 != null) {
                jsonGenerator.writeStringField("ownerCreateSource", str10);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MultiCallApplyRequestData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "multicallapplyrequestdata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String category;

    @NonNull
    @ProtobufIndex(index = 10)
    public String enterRoomSource;

    @NonNull
    @ProtobufIndex(index = 7)
    public String fakeId;

    @ProtobufIndex(index = 6)
    public int intendPosition;

    @NonNull
    @ProtobufIndex(index = 3)
    public String inviteId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String ownerCreateSource;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ownerLiveId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String ownerMultiCallOrder;

    @NonNull
    @ProtobufIndex(index = 5)
    public String source;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userId;

    public static MultiCallApplyRequestData new_() {
        MultiCallApplyRequestData multiCallApplyRequestData = new MultiCallApplyRequestData();
        multiCallApplyRequestData.nullCheck();
        return multiCallApplyRequestData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MultiCallApplyRequestData mo225055clone() {
        MultiCallApplyRequestData multiCallApplyRequestData = new MultiCallApplyRequestData();
        multiCallApplyRequestData.ownerMultiCallOrder = this.ownerMultiCallOrder;
        multiCallApplyRequestData.ownerLiveId = this.ownerLiveId;
        multiCallApplyRequestData.inviteId = this.inviteId;
        multiCallApplyRequestData.category = this.category;
        multiCallApplyRequestData.source = this.source;
        multiCallApplyRequestData.intendPosition = this.intendPosition;
        multiCallApplyRequestData.fakeId = this.fakeId;
        multiCallApplyRequestData.userId = this.userId;
        multiCallApplyRequestData.liveId = this.liveId;
        multiCallApplyRequestData.enterRoomSource = this.enterRoomSource;
        multiCallApplyRequestData.ownerCreateSource = this.ownerCreateSource;
        return multiCallApplyRequestData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCallApplyRequestData)) {
            return false;
        }
        MultiCallApplyRequestData multiCallApplyRequestData = (MultiCallApplyRequestData) obj;
        return ValueObject.util_equals(this.ownerMultiCallOrder, multiCallApplyRequestData.ownerMultiCallOrder) && ValueObject.util_equals(this.ownerLiveId, multiCallApplyRequestData.ownerLiveId) && ValueObject.util_equals(this.inviteId, multiCallApplyRequestData.inviteId) && ValueObject.util_equals(this.category, multiCallApplyRequestData.category) && ValueObject.util_equals(this.source, multiCallApplyRequestData.source) && this.intendPosition == multiCallApplyRequestData.intendPosition && ValueObject.util_equals(this.fakeId, multiCallApplyRequestData.fakeId) && ValueObject.util_equals(this.userId, multiCallApplyRequestData.userId) && ValueObject.util_equals(this.liveId, multiCallApplyRequestData.liveId) && ValueObject.util_equals(this.enterRoomSource, multiCallApplyRequestData.enterRoomSource) && ValueObject.util_equals(this.ownerCreateSource, multiCallApplyRequestData.ownerCreateSource);
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
        String str = this.ownerMultiCallOrder;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ownerLiveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.inviteId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.category;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.source;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.intendPosition) * 41;
        String str6 = this.fakeId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.liveId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.enterRoomSource;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.ownerCreateSource;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ownerMultiCallOrder == null) {
            this.ownerMultiCallOrder = "";
        }
        if (this.ownerLiveId == null) {
            this.ownerLiveId = "";
        }
        if (this.inviteId == null) {
            this.inviteId = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.enterRoomSource == null) {
            this.enterRoomSource = "";
        }
        if (this.ownerCreateSource == null) {
            this.ownerCreateSource = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
