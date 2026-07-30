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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OpenSdkCodeAuth openSdkCodeAuth) {
            String str = openSdkCodeAuth.code;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = openSdkCodeAuth.state;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, openSdkCodeAuth.error);
            String str3 = openSdkCodeAuth.message;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) openSdkCodeAuth).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OpenSdkCodeAuth m18741parse(nb5 nb5Var) throws IOException {
            OpenSdkCodeAuth openSdkCodeAuth = new OpenSdkCodeAuth();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    openSdkCodeAuth.code = nb5Var.s();
                } else if (iU == 18) {
                    openSdkCodeAuth.state = nb5Var.s();
                } else if (iU == 24) {
                    openSdkCodeAuth.error = nb5Var.j();
                } else {
                    if (iU != 34) {
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
                    openSdkCodeAuth.message = nb5Var.s();
                }
            }
            return openSdkCodeAuth;
        }

        public void serialize(OpenSdkCodeAuth openSdkCodeAuth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = openSdkCodeAuth.code;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = openSdkCodeAuth.state;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, openSdkCodeAuth.error);
            String str3 = openSdkCodeAuth.message;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<OpenSdkCodeAuth> JSON_ADAPTER = new ObjectJsonAdapter<OpenSdkCodeAuth>() { // from class: com.p1.mobile.putong.data.OpenSdkCodeAuth.2
        public Class getDataClass() {
            return OpenSdkCodeAuth.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OpenSdkCodeAuth mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OpenSdkCodeAuth openSdkCodeAuth, JsonGenerator jsonGenerator) throws IOException {
            String str = openSdkCodeAuth.code;
            if (str != null) {
                jsonGenerator.writeStringField("code", str);
            }
            String str2 = openSdkCodeAuth.state;
            if (str2 != null) {
                jsonGenerator.writeStringField(Channel.state, str2);
            }
            jsonGenerator.writeNumberField("error", openSdkCodeAuth.error);
            String str3 = openSdkCodeAuth.message;
            if (str3 != null) {
                jsonGenerator.writeStringField("message", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OpenSdkCodeAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OpenSdkCodeAuth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OpenSdkCodeAuth new_() {
        OpenSdkCodeAuth openSdkCodeAuth = new OpenSdkCodeAuth();
        openSdkCodeAuth.nullCheck();
        return openSdkCodeAuth;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OpenSdkCodeAuth m18740clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
