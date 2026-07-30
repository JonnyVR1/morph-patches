package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OpenSdkCodeAuth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "opensdkcodeauth";

    @NonNull
    @ProtobufIndex(index = 1)
    public String code;

    @ProtobufIndex(index = 3)
    public int error;

    @NonNull
    @ProtobufIndex(index = 4)
    public String message;

    @NonNull
    @ProtobufIndex(index = 2)
    public String state;
    public static ProtobufAdapter<OpenSdkCodeAuth> PROTOBUF_ADAPTER = new MessageNanoAdapter<OpenSdkCodeAuth>() { // from class: com.p1.mobile.putong.data.OpenSdkCodeAuth.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OpenSdkCodeAuth openSdkCodeAuth) {
            String str = openSdkCodeAuth.code;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = openSdkCodeAuth.state;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, openSdkCodeAuth.error);
            String str3 = openSdkCodeAuth.message;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            openSdkCodeAuth.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OpenSdkCodeAuth parse(nb5 nb5Var) throws IOException {
            OpenSdkCodeAuth openSdkCodeAuth = new OpenSdkCodeAuth();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (openSdkCodeAuth.code == null) {
                        openSdkCodeAuth.code = "";
                    }
                    if (openSdkCodeAuth.state == null) {
                        openSdkCodeAuth.state = "";
                    }
                    if (openSdkCodeAuth.message != null) {
                        break;
                    }
                    openSdkCodeAuth.message = "";
                    break;
                }
                if (iM158752u == 10) {
                    openSdkCodeAuth.code = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    openSdkCodeAuth.state = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    openSdkCodeAuth.error = nb5Var.m158741j();
                } else {
                    if (iM158752u != 34) {
                        if (openSdkCodeAuth.code == null) {
                            openSdkCodeAuth.code = "";
                        }
                        if (openSdkCodeAuth.state == null) {
                            openSdkCodeAuth.state = "";
                        }
                        if (openSdkCodeAuth.message != null) {
                            break;
                        }
                        openSdkCodeAuth.message = "";
                        return openSdkCodeAuth;
                    }
                    openSdkCodeAuth.message = nb5Var.m158750s();
                }
            }
            return openSdkCodeAuth;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OpenSdkCodeAuth openSdkCodeAuth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = openSdkCodeAuth.code;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = openSdkCodeAuth.state;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, openSdkCodeAuth.error);
            String str3 = openSdkCodeAuth.message;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<OpenSdkCodeAuth> JSON_ADAPTER = new ObjectJsonAdapter<OpenSdkCodeAuth>() { // from class: com.p1.mobile.putong.data.OpenSdkCodeAuth.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OpenSdkCodeAuth.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OpenSdkCodeAuth newInstance() {
            return new OpenSdkCodeAuth();
        }

        public boolean parseField(OpenSdkCodeAuth openSdkCodeAuth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "code":
                    openSdkCodeAuth.code = jsonParser.getValueAsString();
                    return true;
                case "error":
                    openSdkCodeAuth.error = jsonParser.getValueAsInt();
                    return true;
                case "state":
                    openSdkCodeAuth.state = jsonParser.getValueAsString();
                    return true;
                case "message":
                    openSdkCodeAuth.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OpenSdkCodeAuth openSdkCodeAuth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "code":
                case "error":
                case "state":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(openSdkCodeAuth, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OpenSdkCodeAuth openSdkCodeAuth, JsonGenerator jsonGenerator) throws IOException {
            String str = openSdkCodeAuth.code;
            if (str != null) {
                jsonGenerator.writeStringField("code", str);
            }
            String str2 = openSdkCodeAuth.state;
            if (str2 != null) {
                jsonGenerator.writeStringField("state", str2);
            }
            jsonGenerator.writeNumberField("error", openSdkCodeAuth.error);
            String str3 = openSdkCodeAuth.message;
            if (str3 != null) {
                jsonGenerator.writeStringField("message", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OpenSdkCodeAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OpenSdkCodeAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OpenSdkCodeAuth new_() {
        OpenSdkCodeAuth openSdkCodeAuth = new OpenSdkCodeAuth();
        openSdkCodeAuth.nullCheck();
        return openSdkCodeAuth;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OpenSdkCodeAuth mo223809clone() {
        OpenSdkCodeAuth openSdkCodeAuth = new OpenSdkCodeAuth();
        openSdkCodeAuth.code = this.code;
        openSdkCodeAuth.state = this.state;
        openSdkCodeAuth.error = this.error;
        openSdkCodeAuth.message = this.message;
        return openSdkCodeAuth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenSdkCodeAuth)) {
            return false;
        }
        OpenSdkCodeAuth openSdkCodeAuth = (OpenSdkCodeAuth) obj;
        return ValueObject.util_equals(this.code, openSdkCodeAuth.code) && ValueObject.util_equals(this.state, openSdkCodeAuth.state) && this.error == openSdkCodeAuth.error && ValueObject.util_equals(this.message, openSdkCodeAuth.message);
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
        String str = this.code;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.state;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.error) * 41;
        String str3 = this.message;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.code == null) {
            this.code = "";
        }
        if (this.state == null) {
            this.state = "";
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
