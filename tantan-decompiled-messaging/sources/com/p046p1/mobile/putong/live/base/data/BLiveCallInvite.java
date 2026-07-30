package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
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
public class BLiveCallInvite extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallInvite> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallInvite>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallInvite.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallInvite.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallInvite newInstance() {
            return new BLiveCallInvite();
        }

        public boolean parseField(BLiveCallInvite bLiveCallInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveCallInvite.liveId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveCallInvite.f44343id = jsonParser.getValueAsString();
                    return false;
                case "to":
                    bLiveCallInvite.f44344to = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "type":
                    bLiveCallInvite.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveCallInvite.state = BLiveCallInviteState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "rewardPoint":
                    bLiveCallInvite.rewardPoint = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallInvite bLiveCallInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCallInvite.f44343id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveCallInvite.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            if (bLiveCallInvite.f44344to != null) {
                jsonGenerator.writeFieldName("to");
                Converter.USER_ID.serialize(bLiveCallInvite.f44344to, jsonGenerator, true);
            }
            if (bLiveCallInvite.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveCallInviteState.JSON_ADAPTER.serialize(bLiveCallInvite.state, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("rewardPoint", bLiveCallInvite.rewardPoint);
            String str3 = bLiveCallInvite.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallinvite";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44343id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @ProtobufIndex(index = 5)
    public long rewardPoint;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveCallInviteState state;

    /* JADX INFO: renamed from: to */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f44344to;

    @NonNull
    @ProtobufIndex(index = 6)
    public String type;

    public static BLiveCallInvite new_() {
        BLiveCallInvite bLiveCallInvite = new BLiveCallInvite();
        bLiveCallInvite.nullCheck();
        return bLiveCallInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallInvite mo223809clone() {
        BLiveCallInvite bLiveCallInvite = new BLiveCallInvite();
        bLiveCallInvite.f44343id = this.f44343id;
        bLiveCallInvite.liveId = this.liveId;
        bLiveCallInvite.f44344to = this.f44344to;
        bLiveCallInvite.state = this.state;
        bLiveCallInvite.rewardPoint = this.rewardPoint;
        bLiveCallInvite.type = this.type;
        return bLiveCallInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallInvite)) {
            return false;
        }
        BLiveCallInvite bLiveCallInvite = (BLiveCallInvite) obj;
        return ValueObject.util_equals(this.f44343id, bLiveCallInvite.f44343id) && ValueObject.util_equals(this.liveId, bLiveCallInvite.liveId) && ValueObject.util_equals(this.f44344to, bLiveCallInvite.f44344to) && ValueObject.util_equals(this.state, bLiveCallInvite.state) && this.rewardPoint == bLiveCallInvite.rewardPoint && ValueObject.util_equals(this.type, bLiveCallInvite.type);
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
        String str = this.f44343id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f44344to;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveCallInviteState bLiveCallInviteState = this.state;
        int iHashCode4 = bLiveCallInviteState != null ? bLiveCallInviteState.hashCode() : 0;
        long j = this.rewardPoint;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.type;
        int iHashCode5 = i3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44343id == null) {
            this.f44343id = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.f44344to == null) {
            this.f44344to = "";
        }
        if (this.state == null) {
            this.state = (BLiveCallInviteState) BLiveCallInviteState.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
