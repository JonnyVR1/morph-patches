package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CaptchaIdConfig captchaIdConfig) {
            String str = captchaIdConfig.url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = captchaIdConfig.captchaId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) captchaIdConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CaptchaIdConfig m17799parse(nb5 nb5Var) throws IOException {
            CaptchaIdConfig captchaIdConfig = new CaptchaIdConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (captchaIdConfig.url == null) {
                        captchaIdConfig.url = "";
                    }
                    if (captchaIdConfig.captchaId != null) {
                        break;
                    }
                    captchaIdConfig.captchaId = "";
                    break;
                }
                if (iU == 10) {
                    captchaIdConfig.url = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (captchaIdConfig.url == null) {
                            captchaIdConfig.url = "";
                        }
                        if (captchaIdConfig.captchaId != null) {
                            break;
                        }
                        captchaIdConfig.captchaId = "";
                        return captchaIdConfig;
                    }
                    captchaIdConfig.captchaId = nb5Var.s();
                }
            }
            return captchaIdConfig;
        }

        public void serialize(CaptchaIdConfig captchaIdConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = captchaIdConfig.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = captchaIdConfig.captchaId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<CaptchaIdConfig> JSON_ADAPTER = new ObjectJsonAdapter<CaptchaIdConfig>() { // from class: com.p1.mobile.putong.data.CaptchaIdConfig.2
        public Class getDataClass() {
            return CaptchaIdConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CaptchaIdConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CaptchaIdConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CaptchaIdConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CaptchaIdConfig new_() {
        CaptchaIdConfig captchaIdConfig = new CaptchaIdConfig();
        captchaIdConfig.nullCheck();
        return captchaIdConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CaptchaIdConfig m17798clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.captchaId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.captchaId == null) {
            this.captchaId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
