package com.p046p1.mobile.putong.feed.data;

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
public class Reference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reference";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39244id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<Reference> PROTOBUF_ADAPTER = new MessageNanoAdapter<Reference>() { // from class: com.p1.mobile.putong.feed.data.Reference.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Reference reference) {
            String str = reference.f39244id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = reference.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            reference.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Reference parse(nb5 nb5Var) throws IOException {
            Reference reference = new Reference();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (reference.f39244id == null) {
                        reference.f39244id = "";
                    }
                    if (reference.type != null) {
                        break;
                    }
                    reference.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    reference.f39244id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (reference.f39244id == null) {
                            reference.f39244id = "";
                        }
                        if (reference.type != null) {
                            break;
                        }
                        reference.type = "";
                        return reference;
                    }
                    reference.type = nb5Var.m158750s();
                }
            }
            return reference;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Reference reference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reference.f39244id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = reference.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<Reference> JSON_ADAPTER = new ObjectJsonAdapter<Reference>() { // from class: com.p1.mobile.putong.feed.data.Reference.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Reference.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Reference newInstance() {
            return new Reference();
        }

        public boolean parseField(Reference reference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                reference.f39244id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Reference reference, JsonGenerator jsonGenerator) throws IOException {
            String str = reference.f39244id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = reference.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public Reference mo223809clone() {
        Reference reference = new Reference();
        reference.f39244id = this.f39244id;
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
        return ValueObject.util_equals(this.f39244id, reference.f39244id) && ValueObject.util_equals(this.type, reference.type);
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
        String str = this.f39244id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39244id == null) {
            this.f39244id = "";
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
