package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveIntlLiveFramesCDN extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlLiveFramesCDN> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlLiveFramesCDN>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlLiveFramesCDN.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlLiveFramesCDN.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlLiveFramesCDN newInstance() {
            return new BLiveIntlLiveFramesCDN();
        }

        public boolean parseField(BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("url")) {
                bLiveIntlLiveFramesCDN.url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            bLiveIntlLiveFramesCDN.version = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlLiveFramesCDN.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = bLiveIntlLiveFramesCDN.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlLiveFramesCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlliveframescdn";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveIntlLiveFramesCDN new_() {
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN = new BLiveIntlLiveFramesCDN();
        bLiveIntlLiveFramesCDN.nullCheck();
        return bLiveIntlLiveFramesCDN;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlLiveFramesCDN mo223809clone() {
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN = new BLiveIntlLiveFramesCDN();
        bLiveIntlLiveFramesCDN.url = this.url;
        bLiveIntlLiveFramesCDN.version = this.version;
        return bLiveIntlLiveFramesCDN;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlLiveFramesCDN)) {
            return false;
        }
        BLiveIntlLiveFramesCDN bLiveIntlLiveFramesCDN = (BLiveIntlLiveFramesCDN) obj;
        return ValueObject.util_equals(this.url, bLiveIntlLiveFramesCDN.url) && ValueObject.util_equals(this.version, bLiveIntlLiveFramesCDN.version);
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
