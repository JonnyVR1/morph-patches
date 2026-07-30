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
public class MetaError extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "metaerror";

    @ProtobufIndex(index = 2)
    public int internalCode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;
    public static ProtobufAdapter<MetaError> PROTOBUF_ADAPTER = new MessageNanoAdapter<MetaError>() { // from class: com.p1.mobile.putong.data.MetaError.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MetaError metaError) {
            String str = metaError.message;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, metaError.internalCode);
            ((MessageNano) metaError).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MetaError m18465parse(nb5 nb5Var) throws IOException {
            MetaError metaError = new MetaError();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (metaError.message != null) {
                        break;
                    }
                    metaError.message = "";
                    break;
                }
                if (iU == 10) {
                    metaError.message = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (metaError.message != null) {
                            break;
                        }
                        metaError.message = "";
                        return metaError;
                    }
                    metaError.internalCode = nb5Var.j();
                }
            }
            return metaError;
        }

        public void serialize(MetaError metaError, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = metaError.message;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, metaError.internalCode);
        }
    };
    public static JsonAdapter<MetaError> JSON_ADAPTER = new ObjectJsonAdapter<MetaError>() { // from class: com.p1.mobile.putong.data.MetaError.2
        public Class getDataClass() {
            return MetaError.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MetaError mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MetaError metaError, JsonGenerator jsonGenerator) throws IOException {
            String str = metaError.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            jsonGenerator.writeNumberField("internalCode", metaError.internalCode);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MetaError) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MetaError) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MetaError new_() {
        MetaError metaError = new MetaError();
        metaError.nullCheck();
        return metaError;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MetaError m18464clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.message;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.internalCode;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
