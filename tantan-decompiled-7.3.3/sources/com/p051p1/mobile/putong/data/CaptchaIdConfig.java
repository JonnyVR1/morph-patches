package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class CaptchaIdConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "captchaidconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String captchaId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<CaptchaIdConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CaptchaIdConfig>() { // from class: com.p1.mobile.putong.data.CaptchaIdConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CaptchaIdConfig captchaIdConfig) {
            String str = captchaIdConfig.url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = captchaIdConfig.captchaId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            captchaIdConfig.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CaptchaIdConfig parse(nc5 nc5Var) throws IOException {
            CaptchaIdConfig captchaIdConfig = new CaptchaIdConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (captchaIdConfig.url == null) {
                        captchaIdConfig.url = "";
                    }
                    if (captchaIdConfig.captchaId != null) {
                        break;
                    }
                    captchaIdConfig.captchaId = "";
                    break;
                }
                if (iM162497u == 10) {
                    captchaIdConfig.url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (captchaIdConfig.url == null) {
                            captchaIdConfig.url = "";
                        }
                        if (captchaIdConfig.captchaId != null) {
                            break;
                        }
                        captchaIdConfig.captchaId = "";
                        return captchaIdConfig;
                    }
                    captchaIdConfig.captchaId = nc5Var.m162495s();
                }
            }
            return captchaIdConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CaptchaIdConfig captchaIdConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = captchaIdConfig.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = captchaIdConfig.captchaId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<CaptchaIdConfig> JSON_ADAPTER = new ObjectJsonAdapter<CaptchaIdConfig>() { // from class: com.p1.mobile.putong.data.CaptchaIdConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CaptchaIdConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CaptchaIdConfig newInstance() {
            return new CaptchaIdConfig();
        }

        public boolean parseField(CaptchaIdConfig captchaIdConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("captchaId")) {
                captchaIdConfig.captchaId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            captchaIdConfig.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CaptchaIdConfig captchaIdConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("captchaId") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(captchaIdConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CaptchaIdConfig captchaIdConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = captchaIdConfig.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = captchaIdConfig.captchaId;
            if (str2 != null) {
                jsonGenerator.writeStringField("captchaId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CaptchaIdConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CaptchaIdConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CaptchaIdConfig new_() {
        CaptchaIdConfig captchaIdConfig = new CaptchaIdConfig();
        captchaIdConfig.nullCheck();
        return captchaIdConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CaptchaIdConfig mo225055clone() {
        CaptchaIdConfig captchaIdConfig = new CaptchaIdConfig();
        captchaIdConfig.url = this.url;
        captchaIdConfig.captchaId = this.captchaId;
        return captchaIdConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptchaIdConfig)) {
            return false;
        }
        CaptchaIdConfig captchaIdConfig = (CaptchaIdConfig) obj;
        return ValueObject.util_equals(this.url, captchaIdConfig.url) && ValueObject.util_equals(this.captchaId, captchaIdConfig.captchaId);
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
        String str2 = this.captchaId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.captchaId == null) {
            this.captchaId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
