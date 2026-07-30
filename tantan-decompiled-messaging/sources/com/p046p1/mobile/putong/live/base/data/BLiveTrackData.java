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
public class BLiveTrackData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTrackData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTrackData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTrackData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTrackData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTrackData newInstance() {
            return new BLiveTrackData();
        }

        public boolean parseField(BLiveTrackData bLiveTrackData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("eid")) {
                return false;
            }
            bLiveTrackData.eid = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTrackData bLiveTrackData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTrackData.eid;
            if (str != null) {
                jsonGenerator.writeStringField("eid", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTrackData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetrackdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String eid;

    public static BLiveTrackData new_() {
        BLiveTrackData bLiveTrackData = new BLiveTrackData();
        bLiveTrackData.nullCheck();
        return bLiveTrackData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTrackData mo223809clone() {
        BLiveTrackData bLiveTrackData = new BLiveTrackData();
        bLiveTrackData.eid = this.eid;
        return bLiveTrackData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveTrackData) {
            return ValueObject.util_equals(this.eid, ((BLiveTrackData) obj).eid);
        }
        return false;
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
        String str = this.eid;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.eid == null) {
            this.eid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
