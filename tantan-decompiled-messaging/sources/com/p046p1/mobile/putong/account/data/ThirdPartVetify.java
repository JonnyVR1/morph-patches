package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class ThirdPartVetify extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartvetify";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String error;

    @Nullable
    @ProtobufIndex(index = 3)
    public String message;
    public static ProtobufAdapter<ThirdPartVetify> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartVetify>() { // from class: com.p1.mobile.putong.account.data.ThirdPartVetify.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdPartVetify thirdPartVetify) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, thirdPartVetify.code);
            String str = thirdPartVetify.error;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = thirdPartVetify.message;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            thirdPartVetify.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdPartVetify parse(nb5 nb5Var) throws IOException {
            ThirdPartVetify thirdPartVetify = new ThirdPartVetify();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (thirdPartVetify.error != null) {
                        break;
                    }
                    thirdPartVetify.error = "";
                    break;
                }
                if (iM158752u == 8) {
                    thirdPartVetify.code = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    thirdPartVetify.error = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (thirdPartVetify.error != null) {
                            break;
                        }
                        thirdPartVetify.error = "";
                        return thirdPartVetify;
                    }
                    thirdPartVetify.message = nb5Var.m158750s();
                }
            }
            return thirdPartVetify;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdPartVetify thirdPartVetify, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, thirdPartVetify.code);
            String str = thirdPartVetify.error;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = thirdPartVetify.message;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<ThirdPartVetify> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartVetify>() { // from class: com.p1.mobile.putong.account.data.ThirdPartVetify.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdPartVetify.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdPartVetify newInstance() {
            return new ThirdPartVetify();
        }

        public boolean parseField(ThirdPartVetify thirdPartVetify, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "code":
                    thirdPartVetify.code = jsonParser.getValueAsInt();
                    return true;
                case "error":
                    thirdPartVetify.error = jsonParser.getValueAsString();
                    return true;
                case "message":
                    thirdPartVetify.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThirdPartVetify thirdPartVetify, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "code":
                case "error":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(thirdPartVetify, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdPartVetify thirdPartVetify, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", thirdPartVetify.code);
            String str = thirdPartVetify.error;
            if (str != null) {
                jsonGenerator.writeStringField("error", str);
            }
            String str2 = thirdPartVetify.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartVetify) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartVetify) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartVetify new_() {
        ThirdPartVetify thirdPartVetify = new ThirdPartVetify();
        thirdPartVetify.nullCheck();
        return thirdPartVetify;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdPartVetify mo223809clone() {
        ThirdPartVetify thirdPartVetify = new ThirdPartVetify();
        thirdPartVetify.code = this.code;
        thirdPartVetify.error = this.error;
        thirdPartVetify.message = this.message;
        return thirdPartVetify;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartVetify)) {
            return false;
        }
        ThirdPartVetify thirdPartVetify = (ThirdPartVetify) obj;
        return this.code == thirdPartVetify.code && ValueObject.util_equals(this.error, thirdPartVetify.error) && ValueObject.util_equals(this.message, thirdPartVetify.message);
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
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.error;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.message;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.error == null) {
            this.error = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
