package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveChatReport extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatReport> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatReport>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatReport.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatReport.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatReport newInstance() {
            return new BLiveChatReport();
        }

        public boolean parseField(BLiveChatReport bLiveChatReport, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fakeId":
                    bLiveChatReport.fakeId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveChatReport.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveChatReport.roomId = jsonParser.getValueAsString();
                    return true;
                case "reportedUserId":
                    bLiveChatReport.reportedUserId = jsonParser.getValueAsString();
                    return true;
                case "roomType":
                    bLiveChatReport.roomType = jsonParser.getValueAsInt();
                    return true;
                case "seq":
                    bLiveChatReport.seq = jsonParser.getValueAsLong();
                    return true;
                case "type":
                    bLiveChatReport.type = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatReport bLiveChatReport, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatReport.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            jsonGenerator.writeNumberField("type", bLiveChatReport.type);
            jsonGenerator.writeNumberField("seq", bLiveChatReport.seq);
            String str2 = bLiveChatReport.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveChatReport.reportedUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("reportedUserId", str3);
            }
            String str4 = bLiveChatReport.fakeId;
            if (str4 != null) {
                jsonGenerator.writeStringField("fakeId", str4);
            }
            jsonGenerator.writeNumberField("roomType", bLiveChatReport.roomType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatReport) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatreport";

    @NonNull
    @ProtobufIndex(index = 6)
    public String fakeId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String reportedUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @ProtobufIndex(index = 7)
    public int roomType;

    @ProtobufIndex(index = 3)
    public long seq;

    @ProtobufIndex(index = 2)
    public int type;

    public static BLiveChatReport new_() {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.nullCheck();
        return bLiveChatReport;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatReport mo223809clone() {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.roomId = this.roomId;
        bLiveChatReport.type = this.type;
        bLiveChatReport.seq = this.seq;
        bLiveChatReport.liveId = this.liveId;
        bLiveChatReport.reportedUserId = this.reportedUserId;
        bLiveChatReport.fakeId = this.fakeId;
        bLiveChatReport.roomType = this.roomType;
        return bLiveChatReport;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatReport)) {
            return false;
        }
        BLiveChatReport bLiveChatReport = (BLiveChatReport) obj;
        return ValueObject.util_equals(this.roomId, bLiveChatReport.roomId) && this.type == bLiveChatReport.type && this.seq == bLiveChatReport.seq && ValueObject.util_equals(this.liveId, bLiveChatReport.liveId) && ValueObject.util_equals(this.reportedUserId, bLiveChatReport.reportedUserId) && ValueObject.util_equals(this.fakeId, bLiveChatReport.fakeId) && this.roomType == bLiveChatReport.roomType;
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
        String str = this.roomId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.type) * 41;
        long j = this.seq;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.reportedUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.fakeId;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.roomType;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.reportedUserId == null) {
            this.reportedUserId = "";
        }
        if (this.fakeId == null) {
            this.fakeId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
