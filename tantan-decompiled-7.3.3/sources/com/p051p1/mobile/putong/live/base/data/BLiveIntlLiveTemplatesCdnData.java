package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class BLiveIntlLiveTemplatesCdnData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlLiveTemplatesCdnData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlLiveTemplatesCdnData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlLiveTemplatesCdnData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlLiveTemplatesCdnData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlLiveTemplatesCdnData newInstance() {
            return new BLiveIntlLiveTemplatesCdnData();
        }

        public boolean parseField(BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("url")) {
                bLiveIntlLiveTemplatesCdnData.url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            bLiveIntlLiveTemplatesCdnData.version = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlLiveTemplatesCdnData.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = bLiveIntlLiveTemplatesCdnData.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlLiveTemplatesCdnData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintllivetemplatescdndata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveIntlLiveTemplatesCdnData new_() {
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData = new BLiveIntlLiveTemplatesCdnData();
        bLiveIntlLiveTemplatesCdnData.nullCheck();
        return bLiveIntlLiveTemplatesCdnData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlLiveTemplatesCdnData mo225055clone() {
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData = new BLiveIntlLiveTemplatesCdnData();
        bLiveIntlLiveTemplatesCdnData.url = this.url;
        bLiveIntlLiveTemplatesCdnData.version = this.version;
        return bLiveIntlLiveTemplatesCdnData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlLiveTemplatesCdnData)) {
            return false;
        }
        BLiveIntlLiveTemplatesCdnData bLiveIntlLiveTemplatesCdnData = (BLiveIntlLiveTemplatesCdnData) obj;
        return ValueObject.util_equals(this.url, bLiveIntlLiveTemplatesCdnData.url) && ValueObject.util_equals(this.version, bLiveIntlLiveTemplatesCdnData.version);
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
