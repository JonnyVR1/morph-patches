package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class Reference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reference";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40092id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<Reference> PROTOBUF_ADAPTER = new MessageNanoAdapter<Reference>() { // from class: com.p1.mobile.putong.feed.data.Reference.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Reference reference) {
            String str = reference.f40092id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = reference.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            reference.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Reference parse(nc5 nc5Var) throws IOException {
            Reference reference = new Reference();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reference.f40092id == null) {
                        reference.f40092id = "";
                    }
                    if (reference.type != null) {
                        break;
                    }
                    reference.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    reference.f40092id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (reference.f40092id == null) {
                            reference.f40092id = "";
                        }
                        if (reference.type != null) {
                            break;
                        }
                        reference.type = "";
                        return reference;
                    }
                    reference.type = nc5Var.m162495s();
                }
            }
            return reference;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Reference reference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reference.f40092id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = reference.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<Reference> JSON_ADAPTER = new ObjectJsonAdapter<Reference>() { // from class: com.p1.mobile.putong.feed.data.Reference.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Reference.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Reference newInstance() {
            return new Reference();
        }

        public boolean parseField(Reference reference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                reference.f40092id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            reference.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Reference reference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(reference, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Reference reference, JsonGenerator jsonGenerator) throws IOException {
            String str = reference.f40092id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = reference.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Reference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Reference new_() {
        Reference reference = new Reference();
        reference.nullCheck();
        return reference;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Reference mo225055clone() {
        Reference reference = new Reference();
        reference.f40092id = this.f40092id;
        reference.type = this.type;
        return reference;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Reference)) {
            return false;
        }
        Reference reference = (Reference) obj;
        return ValueObject.util_equals(this.f40092id, reference.f40092id) && ValueObject.util_equals(this.type, reference.type);
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
        String str = this.f40092id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40092id == null) {
            this.f40092id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
