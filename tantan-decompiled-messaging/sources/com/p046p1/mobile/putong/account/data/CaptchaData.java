package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes9.dex */
public class CaptchaData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "captchadata";

    @NonNull
    @ProtobufIndex(index = 3)
    public CaptchaImage images;

    @NonNull
    @ProtobufIndex(index = 2)
    public String token;

    @ProtobufIndex(index = 1)
    public int ttl;
    public static ProtobufAdapter<CaptchaData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CaptchaData>() { // from class: com.p1.mobile.putong.account.data.CaptchaData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CaptchaData captchaData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, captchaData.ttl);
            String str = captchaData.token;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            CaptchaImage captchaImage = captchaData.images;
            if (captchaImage != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, captchaImage, CaptchaImage.PROTOBUF_ADAPTER);
            }
            captchaData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CaptchaData parse(nb5 nb5Var) throws IOException {
            CaptchaData captchaData = new CaptchaData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (captchaData.token == null) {
                        captchaData.token = "";
                    }
                    if (captchaData.images != null) {
                        break;
                    }
                    captchaData.images = CaptchaImage.new_();
                    break;
                }
                if (iM158752u == 8) {
                    captchaData.ttl = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    captchaData.token = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (captchaData.token == null) {
                            captchaData.token = "";
                        }
                        if (captchaData.images != null) {
                            break;
                        }
                        captchaData.images = CaptchaImage.new_();
                        return captchaData;
                    }
                    captchaData.images = (CaptchaImage) nb5Var.m158743l(CaptchaImage.PROTOBUF_ADAPTER);
                }
            }
            return captchaData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CaptchaData captchaData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, captchaData.ttl);
            String str = captchaData.token;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            CaptchaImage captchaImage = captchaData.images;
            if (captchaImage != null) {
                codedOutputByteBufferNano.m17254K(3, captchaImage, CaptchaImage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CaptchaData> JSON_ADAPTER = new ObjectJsonAdapter<CaptchaData>() { // from class: com.p1.mobile.putong.account.data.CaptchaData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CaptchaData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CaptchaData newInstance() {
            return new CaptchaData();
        }

        public boolean parseField(CaptchaData captchaData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "images":
                    captchaData.images = CaptchaImage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ttl":
                    captchaData.ttl = jsonParser.getValueAsInt();
                    return true;
                case "token":
                    captchaData.token = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CaptchaData captchaData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "images":
                case "ttl":
                case "token":
                    return true;
                default:
                    return super.parseFieldCheck(captchaData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CaptchaData captchaData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("ttl", captchaData.ttl);
            String str = captchaData.token;
            if (str != null) {
                jsonGenerator.writeStringField("token", str);
            }
            if (captchaData.images != null) {
                jsonGenerator.writeFieldName("images");
                CaptchaImage.JSON_ADAPTER.serialize(captchaData.images, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CaptchaData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CaptchaData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CaptchaData new_() {
        CaptchaData captchaData = new CaptchaData();
        captchaData.nullCheck();
        return captchaData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CaptchaData mo223809clone() {
        CaptchaData captchaData = new CaptchaData();
        captchaData.ttl = this.ttl;
        captchaData.token = this.token;
        CaptchaImage captchaImage = this.images;
        if (captchaImage != null) {
            captchaData.images = captchaImage.mo223809clone();
        }
        return captchaData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaptchaData)) {
            return false;
        }
        CaptchaData captchaData = (CaptchaData) obj;
        return this.ttl == captchaData.ttl && ValueObject.util_equals(this.token, captchaData.token) && ValueObject.util_equals(this.images, captchaData.images);
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
        int i2 = ((i * 41) + this.ttl) * 41;
        String str = this.token;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CaptchaImage captchaImage = this.images;
        int iHashCode2 = iHashCode + (captchaImage != null ? captchaImage.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.token == null) {
            this.token = "";
        }
        if (this.images == null) {
            this.images = CaptchaImage.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
