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
public class BLiveAnchorData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchorData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchorData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchorData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchorData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchorData newInstance() {
            return new BLiveAnchorData();
        }

        public boolean parseField(BLiveAnchorData bLiveAnchorData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("onlive")) {
                bLiveAnchorData.onlive = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("ongoingId")) {
                return false;
            }
            bLiveAnchorData.ongoingId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchorData bLiveAnchorData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("onlive", bLiveAnchorData.onlive);
            String str = bLiveAnchorData.ongoingId;
            if (str != null) {
                jsonGenerator.writeStringField("ongoingId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchorData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchordata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String ongoingId;

    @ProtobufIndex(index = 1)
    public boolean onlive;

    public static BLiveAnchorData new_() {
        BLiveAnchorData bLiveAnchorData = new BLiveAnchorData();
        bLiveAnchorData.nullCheck();
        return bLiveAnchorData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchorData mo225055clone() {
        BLiveAnchorData bLiveAnchorData = new BLiveAnchorData();
        bLiveAnchorData.onlive = this.onlive;
        bLiveAnchorData.ongoingId = this.ongoingId;
        return bLiveAnchorData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchorData)) {
            return false;
        }
        BLiveAnchorData bLiveAnchorData = (BLiveAnchorData) obj;
        return this.onlive == bLiveAnchorData.onlive && ValueObject.util_equals(this.ongoingId, bLiveAnchorData.ongoingId);
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
        int i2 = ((i * 41) + (this.onlive ? 1231 : 1237)) * 41;
        String str = this.ongoingId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ongoingId == null) {
            this.ongoingId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
