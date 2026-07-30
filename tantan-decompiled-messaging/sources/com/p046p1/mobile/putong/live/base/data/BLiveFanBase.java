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
public class BLiveFanBase extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBase> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBase>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBase.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBase.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBase newInstance() {
            return new BLiveFanBase();
        }

        public boolean parseField(BLiveFanBase bLiveFanBase, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("anchorId")) {
                bLiveFanBase.anchorId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            bLiveFanBase.f44363id = jsonParser.getValueAsString();
            return false;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBase bLiveFanBase, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBase.f44363id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFanBase.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBase) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbase";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44363id;

    public static BLiveFanBase new_() {
        BLiveFanBase bLiveFanBase = new BLiveFanBase();
        bLiveFanBase.nullCheck();
        return bLiveFanBase;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBase mo223809clone() {
        BLiveFanBase bLiveFanBase = new BLiveFanBase();
        bLiveFanBase.f44363id = this.f44363id;
        bLiveFanBase.anchorId = this.anchorId;
        return bLiveFanBase;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBase)) {
            return false;
        }
        BLiveFanBase bLiveFanBase = (BLiveFanBase) obj;
        return ValueObject.util_equals(this.f44363id, bLiveFanBase.f44363id) && ValueObject.util_equals(this.anchorId, bLiveFanBase.anchorId);
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
        String str = this.f44363id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44363id == null) {
            this.f44363id = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
