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
public class BLivePkInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkInfo newInstance() {
            return new BLivePkInfo();
        }

        public boolean parseField(BLivePkInfo bLivePkInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ongoingSeekId":
                    bLivePkInfo.ongoingSeekId = jsonParser.getValueAsString();
                    return true;
                case "ongoingId":
                    bLivePkInfo.ongoingId = jsonParser.getValueAsString();
                    return true;
                case "ongoingInviteId":
                    bLivePkInfo.ongoingInviteId = jsonParser.getValueAsString();
                    return true;
                case "ongoingMultiId":
                    bLivePkInfo.ongoingMultiId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkInfo bLivePkInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkInfo.ongoingId;
            if (str != null) {
                jsonGenerator.writeStringField("ongoingId", str);
            }
            String str2 = bLivePkInfo.ongoingInviteId;
            if (str2 != null) {
                jsonGenerator.writeStringField("ongoingInviteId", str2);
            }
            String str3 = bLivePkInfo.ongoingSeekId;
            if (str3 != null) {
                jsonGenerator.writeStringField("ongoingSeekId", str3);
            }
            String str4 = bLivePkInfo.ongoingMultiId;
            if (str4 != null) {
                jsonGenerator.writeStringField("ongoingMultiId", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String ongoingId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ongoingInviteId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String ongoingMultiId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ongoingSeekId;

    public static BLivePkInfo new_() {
        BLivePkInfo bLivePkInfo = new BLivePkInfo();
        bLivePkInfo.nullCheck();
        return bLivePkInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkInfo mo225055clone() {
        BLivePkInfo bLivePkInfo = new BLivePkInfo();
        bLivePkInfo.ongoingId = this.ongoingId;
        bLivePkInfo.ongoingInviteId = this.ongoingInviteId;
        bLivePkInfo.ongoingSeekId = this.ongoingSeekId;
        bLivePkInfo.ongoingMultiId = this.ongoingMultiId;
        return bLivePkInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkInfo)) {
            return false;
        }
        BLivePkInfo bLivePkInfo = (BLivePkInfo) obj;
        return ValueObject.util_equals(this.ongoingId, bLivePkInfo.ongoingId) && ValueObject.util_equals(this.ongoingInviteId, bLivePkInfo.ongoingInviteId) && ValueObject.util_equals(this.ongoingSeekId, bLivePkInfo.ongoingSeekId) && ValueObject.util_equals(this.ongoingMultiId, bLivePkInfo.ongoingMultiId);
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
        String str = this.ongoingId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ongoingInviteId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ongoingSeekId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.ongoingMultiId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ongoingId == null) {
            this.ongoingId = "";
        }
        if (this.ongoingInviteId == null) {
            this.ongoingInviteId = "";
        }
        if (this.ongoingSeekId == null) {
            this.ongoingSeekId = "";
        }
        if (this.ongoingMultiId == null) {
            this.ongoingMultiId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
