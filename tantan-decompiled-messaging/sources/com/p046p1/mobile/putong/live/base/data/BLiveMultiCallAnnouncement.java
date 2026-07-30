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
public class BLiveMultiCallAnnouncement extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallAnnouncement> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallAnnouncement>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallAnnouncement.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallAnnouncement newInstance() {
            return new BLiveMultiCallAnnouncement();
        }

        public boolean parseField(BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "roomId":
                    bLiveMultiCallAnnouncement.roomId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveMultiCallAnnouncement.f44401id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    bLiveMultiCallAnnouncement.state = BLiveMultiCallAnnouncementState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "content":
                    bLiveMultiCallAnnouncement.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallAnnouncement.f44401id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCallAnnouncement.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            if (bLiveMultiCallAnnouncement.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveMultiCallAnnouncementState.JSON_ADAPTER.serialize(bLiveMultiCallAnnouncement.state, jsonGenerator, true);
            }
            String str3 = bLiveMultiCallAnnouncement.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallAnnouncement) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallannouncement";

    @NonNull
    @ProtobufIndex(index = 4)
    public String content;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44401id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveMultiCallAnnouncementState state;

    public static BLiveMultiCallAnnouncement new_() {
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = new BLiveMultiCallAnnouncement();
        bLiveMultiCallAnnouncement.nullCheck();
        return bLiveMultiCallAnnouncement;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallAnnouncement mo223809clone() {
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = new BLiveMultiCallAnnouncement();
        bLiveMultiCallAnnouncement.f44401id = this.f44401id;
        bLiveMultiCallAnnouncement.roomId = this.roomId;
        bLiveMultiCallAnnouncement.state = this.state;
        bLiveMultiCallAnnouncement.content = this.content;
        return bLiveMultiCallAnnouncement;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallAnnouncement)) {
            return false;
        }
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = (BLiveMultiCallAnnouncement) obj;
        return ValueObject.util_equals(this.f44401id, bLiveMultiCallAnnouncement.f44401id) && ValueObject.util_equals(this.roomId, bLiveMultiCallAnnouncement.roomId) && ValueObject.util_equals(this.state, bLiveMultiCallAnnouncement.state) && ValueObject.util_equals(this.content, bLiveMultiCallAnnouncement.content);
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
        String str = this.f44401id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveMultiCallAnnouncementState bLiveMultiCallAnnouncementState = this.state;
        int iHashCode3 = (iHashCode2 + (bLiveMultiCallAnnouncementState != null ? bLiveMultiCallAnnouncementState.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44401id == null) {
            this.f44401id = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.state == null) {
            this.state = (BLiveMultiCallAnnouncementState) BLiveMultiCallAnnouncementState.JSON_ADAPTER.defaultEnum();
        }
        if (this.content == null) {
            this.content = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
