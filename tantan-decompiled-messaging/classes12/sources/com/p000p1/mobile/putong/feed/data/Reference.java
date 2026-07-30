package com.p000p1.mobile.putong.feed.data;

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
public class Reference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reference";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f705id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<Reference> PROTOBUF_ADAPTER = new MessageNanoAdapter<Reference>() { // from class: com.p1.mobile.putong.feed.data.Reference.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Reference reference) {
            String str = reference.f705id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = reference.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) reference).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Reference m19750parse(nb5 nb5Var) throws IOException {
            Reference reference = new Reference();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reference.f705id == null) {
                        reference.f705id = "";
                    }
                    if (reference.type != null) {
                        break;
                    }
                    reference.type = "";
                    break;
                }
                if (iU == 10) {
                    reference.f705id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (reference.f705id == null) {
                            reference.f705id = "";
                        }
                        if (reference.type != null) {
                            break;
                        }
                        reference.type = "";
                        return reference;
                    }
                    reference.type = nb5Var.s();
                }
            }
            return reference;
        }

        public void serialize(Reference reference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reference.f705id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = reference.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Reference> JSON_ADAPTER = new ObjectJsonAdapter<Reference>() { // from class: com.p1.mobile.putong.feed.data.Reference.2
        public Class getDataClass() {
            return Reference.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Reference mo17830newInstance() {
            return new Reference();
        }

        public boolean parseField(Reference reference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                reference.f705id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Reference reference, JsonGenerator jsonGenerator) throws IOException {
            String str = reference.f705id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = reference.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Reference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Reference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Reference new_() {
        Reference reference = new Reference();
        reference.nullCheck();
        return reference;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Reference m19749clone() {
        Reference reference = new Reference();
        reference.f705id = this.f705id;
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
        return ValueObject.util_equals(this.f705id, reference.f705id) && ValueObject.util_equals(this.type, reference.type);
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
        String str = this.f705id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f705id == null) {
            this.f705id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
