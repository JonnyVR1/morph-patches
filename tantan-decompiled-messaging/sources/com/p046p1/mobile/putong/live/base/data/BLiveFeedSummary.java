package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveFeedSummary;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFeedSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFeedSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFeedSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFeedSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFeedSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFeedSummary newInstance() {
            return new BLiveFeedSummary();
        }

        public boolean parseField(BLiveFeedSummary bLiveFeedSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveFeedSummary.description = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    bLiveFeedSummary.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveFeedSummary.f44367id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveFeedSummary.type = jsonParser.getValueAsString();
                    return true;
                case "display":
                    bLiveFeedSummary.display = jsonParser.getValueAsBoolean();
                    return true;
                case "subDescription":
                    bLiveFeedSummary.subDescription = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFeedSummary bLiveFeedSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFeedSummary.f44367id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFeedSummary.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveFeedSummary.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            jsonGenerator.writeBooleanField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, bLiveFeedSummary.display);
            String str4 = bLiveFeedSummary.subDescription;
            if (str4 != null) {
                jsonGenerator.writeStringField("subDescription", str4);
            }
            if (bLiveFeedSummary.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(bLiveFeedSummary.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFeedSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefeedsummary";

    @NonNull
    @ProtobufIndex(index = 3)
    public String description;

    @ProtobufIndex(index = 4)
    public boolean display;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44367id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subDescription;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> userIds;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67951a(String str) {
        return str;
    }

    public static BLiveFeedSummary new_() {
        BLiveFeedSummary bLiveFeedSummary = new BLiveFeedSummary();
        bLiveFeedSummary.nullCheck();
        return bLiveFeedSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFeedSummary mo223809clone() {
        BLiveFeedSummary bLiveFeedSummary = new BLiveFeedSummary();
        bLiveFeedSummary.f44367id = this.f44367id;
        bLiveFeedSummary.type = this.type;
        bLiveFeedSummary.description = this.description;
        bLiveFeedSummary.display = this.display;
        bLiveFeedSummary.subDescription = this.subDescription;
        List<String> list = this.userIds;
        if (list != null) {
            bLiveFeedSummary.userIds = ValueObject.util_map(list, new w9j() { // from class: l.tz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveFeedSummary.m67951a((String) obj);
                }
            });
        }
        return bLiveFeedSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFeedSummary)) {
            return false;
        }
        BLiveFeedSummary bLiveFeedSummary = (BLiveFeedSummary) obj;
        return ValueObject.util_equals(this.f44367id, bLiveFeedSummary.f44367id) && ValueObject.util_equals(this.type, bLiveFeedSummary.type) && ValueObject.util_equals(this.description, bLiveFeedSummary.description) && this.display == bLiveFeedSummary.display && ValueObject.util_equals(this.subDescription, bLiveFeedSummary.subDescription) && ValueObject.util_equals(this.userIds, bLiveFeedSummary.userIds);
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
        String str = this.f44367id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.display ? 1231 : 1237)) * 41;
        String str4 = this.subDescription;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44367id == null) {
            this.f44367id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.subDescription == null) {
            this.subDescription = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
