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
public class MetaError extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "metaerror";

    @ProtobufIndex(index = 2)
    public int internalCode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;
    public static ProtobufAdapter<MetaError> PROTOBUF_ADAPTER = new MessageNanoAdapter<MetaError>() { // from class: com.p1.mobile.putong.data.MetaError.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MetaError metaError) {
            String str = metaError.message;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, metaError.internalCode);
            metaError.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MetaError parse(nb5 nb5Var) throws IOException {
            MetaError metaError = new MetaError();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (metaError.message != null) {
                        break;
                    }
                    metaError.message = "";
                    break;
                }
                if (iM158752u == 10) {
                    metaError.message = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (metaError.message != null) {
                            break;
                        }
                        metaError.message = "";
                        return metaError;
                    }
                    metaError.internalCode = nb5Var.m158741j();
                }
            }
            return metaError;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MetaError metaError, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = metaError.message;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, metaError.internalCode);
        }
    };
    public static JsonAdapter<MetaError> JSON_ADAPTER = new ObjectJsonAdapter<MetaError>() { // from class: com.p1.mobile.putong.data.MetaError.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MetaError.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MetaError newInstance() {
            return new MetaError();
        }

        public boolean parseField(MetaError metaError, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("internalCode")) {
                metaError.internalCode = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            metaError.message = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MetaError metaError, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("internalCode") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(metaError, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MetaError metaError, JsonGenerator jsonGenerator) throws IOException {
            String str = metaError.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            jsonGenerator.writeNumberField("internalCode", metaError.internalCode);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MetaError) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MetaError) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MetaError new_() {
        MetaError metaError = new MetaError();
        metaError.nullCheck();
        return metaError;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MetaError mo223809clone() {
        MetaError metaError = new MetaError();
        metaError.message = this.message;
        metaError.internalCode = this.internalCode;
        return metaError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetaError)) {
            return false;
        }
        MetaError metaError = (MetaError) obj;
        return ValueObject.util_equals(this.message, metaError.message) && this.internalCode == metaError.internalCode;
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
        String str = this.message;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.internalCode;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
