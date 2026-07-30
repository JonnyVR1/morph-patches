package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveWealthLogoInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveWealthLogoInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveWealthLogoInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveWealthLogoInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveWealthLogoInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveWealthLogoInfo newInstance() {
            return new BLiveWealthLogoInfo();
        }

        public boolean parseField(BLiveWealthLogoInfo bLiveWealthLogoInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("canHide")) {
                return false;
            }
            bLiveWealthLogoInfo.canHide = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveWealthLogoInfo bLiveWealthLogoInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canHide", bLiveWealthLogoInfo.canHide);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveWealthLogoInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivewealthlogoinfo";

    @ProtobufIndex(index = 1)
    public boolean canHide;

    public static BLiveWealthLogoInfo new_() {
        BLiveWealthLogoInfo bLiveWealthLogoInfo = new BLiveWealthLogoInfo();
        bLiveWealthLogoInfo.nullCheck();
        return bLiveWealthLogoInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveWealthLogoInfo mo225055clone() {
        BLiveWealthLogoInfo bLiveWealthLogoInfo = new BLiveWealthLogoInfo();
        bLiveWealthLogoInfo.canHide = this.canHide;
        return bLiveWealthLogoInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveWealthLogoInfo) && this.canHide == ((BLiveWealthLogoInfo) obj).canHide;
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
        int i2 = (i * 41) + (this.canHide ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
