package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes12.dex */
public class OpenSDKInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "opensdkinfo";

    @ProtobufIndex(index = 4)
    public int error;

    @NonNull
    @ProtobufIndex(index = 3)
    public String logo_url;

    @NonNull
    @ProtobufIndex(index = 5)
    public String message;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public Scopes scopes;
    public static ProtobufAdapter<OpenSDKInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OpenSDKInfo>() { // from class: com.p1.mobile.putong.data.OpenSDKInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OpenSDKInfo openSDKInfo) {
            String str = openSDKInfo.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            Scopes scopes = openSDKInfo.scopes;
            if (scopes != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, scopes, Scopes.PROTOBUF_ADAPTER);
            }
            String str2 = openSDKInfo.logo_url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, openSDKInfo.error);
            String str3 = openSDKInfo.message;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            openSDKInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OpenSDKInfo parse(nb5 nb5Var) throws IOException {
            OpenSDKInfo openSDKInfo = new OpenSDKInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (openSDKInfo.name == null) {
                        openSDKInfo.name = "";
                    }
                    if (openSDKInfo.scopes == null) {
                        openSDKInfo.scopes = Scopes.new_();
                    }
                    if (openSDKInfo.logo_url == null) {
                        openSDKInfo.logo_url = "";
                    }
                    if (openSDKInfo.message != null) {
                        break;
                    }
                    openSDKInfo.message = "";
                    break;
                }
                if (iM158752u == 10) {
                    openSDKInfo.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    openSDKInfo.scopes = (Scopes) nb5Var.m158743l(Scopes.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    openSDKInfo.logo_url = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    openSDKInfo.error = nb5Var.m158741j();
                } else {
                    if (iM158752u != 42) {
                        if (openSDKInfo.name == null) {
                            openSDKInfo.name = "";
                        }
                        if (openSDKInfo.scopes == null) {
                            openSDKInfo.scopes = Scopes.new_();
                        }
                        if (openSDKInfo.logo_url == null) {
                            openSDKInfo.logo_url = "";
                        }
                        if (openSDKInfo.message != null) {
                            break;
                        }
                        openSDKInfo.message = "";
                        return openSDKInfo;
                    }
                    openSDKInfo.message = nb5Var.m158750s();
                }
            }
            return openSDKInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OpenSDKInfo openSDKInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = openSDKInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            Scopes scopes = openSDKInfo.scopes;
            if (scopes != null) {
                codedOutputByteBufferNano.m17254K(2, scopes, Scopes.PROTOBUF_ADAPTER);
            }
            String str2 = openSDKInfo.logo_url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17250G(4, openSDKInfo.error);
            String str3 = openSDKInfo.message;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<OpenSDKInfo> JSON_ADAPTER = new ObjectJsonAdapter<OpenSDKInfo>() { // from class: com.p1.mobile.putong.data.OpenSDKInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OpenSDKInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OpenSDKInfo newInstance() {
            return new OpenSDKInfo();
        }

        public boolean parseField(OpenSDKInfo openSDKInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "scopes":
                    openSDKInfo.scopes = Scopes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    openSDKInfo.name = jsonParser.getValueAsString();
                    return true;
                case "error":
                    openSDKInfo.error = jsonParser.getValueAsInt();
                    return true;
                case "message":
                    openSDKInfo.message = jsonParser.getValueAsString();
                    return true;
                case "logo_url":
                    openSDKInfo.logo_url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OpenSDKInfo openSDKInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "scopes":
                case "name":
                case "error":
                case "message":
                case "logo_url":
                    return true;
                default:
                    return super.parseFieldCheck(openSDKInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OpenSDKInfo openSDKInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = openSDKInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (openSDKInfo.scopes != null) {
                jsonGenerator.writeFieldName(Scopes.TYPE);
                Scopes.JSON_ADAPTER.serialize(openSDKInfo.scopes, jsonGenerator, true);
            }
            String str2 = openSDKInfo.logo_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("logo_url", str2);
            }
            jsonGenerator.writeNumberField("error", openSDKInfo.error);
            String str3 = openSDKInfo.message;
            if (str3 != null) {
                jsonGenerator.writeStringField("message", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OpenSDKInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OpenSDKInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OpenSDKInfo new_() {
        OpenSDKInfo openSDKInfo = new OpenSDKInfo();
        openSDKInfo.nullCheck();
        return openSDKInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OpenSDKInfo mo223809clone() {
        OpenSDKInfo openSDKInfo = new OpenSDKInfo();
        openSDKInfo.name = this.name;
        Scopes scopes = this.scopes;
        if (scopes != null) {
            openSDKInfo.scopes = scopes.mo223809clone();
        }
        openSDKInfo.logo_url = this.logo_url;
        openSDKInfo.error = this.error;
        openSDKInfo.message = this.message;
        return openSDKInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenSDKInfo)) {
            return false;
        }
        OpenSDKInfo openSDKInfo = (OpenSDKInfo) obj;
        return ValueObject.util_equals(this.name, openSDKInfo.name) && ValueObject.util_equals(this.scopes, openSDKInfo.scopes) && ValueObject.util_equals(this.logo_url, openSDKInfo.logo_url) && this.error == openSDKInfo.error && ValueObject.util_equals(this.message, openSDKInfo.message);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Scopes scopes = this.scopes;
        int iHashCode2 = (iHashCode + (scopes != null ? scopes.hashCode() : 0)) * 41;
        String str2 = this.logo_url;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.error) * 41;
        String str3 = this.message;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.scopes == null) {
            this.scopes = Scopes.new_();
        }
        if (this.logo_url == null) {
            this.logo_url = "";
        }
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
