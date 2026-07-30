package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveSmallWindowLocation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSmallWindowLocation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSmallWindowLocation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSmallWindowLocation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSmallWindowLocation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSmallWindowLocation newInstance() {
            return new BLiveSmallWindowLocation();
        }

        public boolean parseField(BLiveSmallWindowLocation bLiveSmallWindowLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("widthP")) {
                bLiveSmallWindowLocation.widthP = (float) jsonParser.getValueAsDouble();
                return true;
            }
            if (!str.equals("marginTopP")) {
                return false;
            }
            bLiveSmallWindowLocation.marginTopP = (float) jsonParser.getValueAsDouble();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSmallWindowLocation bLiveSmallWindowLocation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("marginTopP", bLiveSmallWindowLocation.marginTopP);
            jsonGenerator.writeNumberField("widthP", bLiveSmallWindowLocation.widthP);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSmallWindowLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesmallwindowlocation";

    @ProtobufIndex(index = 1)
    public float marginTopP;

    @ProtobufIndex(index = 2)
    public float widthP;

    public static BLiveSmallWindowLocation new_() {
        BLiveSmallWindowLocation bLiveSmallWindowLocation = new BLiveSmallWindowLocation();
        bLiveSmallWindowLocation.nullCheck();
        return bLiveSmallWindowLocation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSmallWindowLocation mo223809clone() {
        BLiveSmallWindowLocation bLiveSmallWindowLocation = new BLiveSmallWindowLocation();
        bLiveSmallWindowLocation.marginTopP = this.marginTopP;
        bLiveSmallWindowLocation.widthP = this.widthP;
        return bLiveSmallWindowLocation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSmallWindowLocation)) {
            return false;
        }
        BLiveSmallWindowLocation bLiveSmallWindowLocation = (BLiveSmallWindowLocation) obj;
        return this.marginTopP == bLiveSmallWindowLocation.marginTopP && this.widthP == bLiveSmallWindowLocation.widthP;
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
        int iFloatToIntBits = (((i * 41) + Float.floatToIntBits(this.marginTopP)) * 41) + Float.floatToIntBits(this.widthP);
        this.hashCode = iFloatToIntBits;
        return iFloatToIntBits;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
