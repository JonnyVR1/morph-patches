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
public class Owner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "owner";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f264id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<Owner> PROTOBUF_ADAPTER = new MessageNanoAdapter<Owner>() { // from class: com.p1.mobile.putong.data.Owner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Owner owner) {
            String str = owner.f264id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = owner.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) owner).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Owner m18762parse(nb5 nb5Var) throws IOException {
            Owner owner = new Owner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (owner.f264id == null) {
                        owner.f264id = "";
                    }
                    if (owner.type != null) {
                        break;
                    }
                    owner.type = "";
                    break;
                }
                if (iU == 10) {
                    owner.f264id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (owner.f264id == null) {
                            owner.f264id = "";
                        }
                        if (owner.type != null) {
                            break;
                        }
                        owner.type = "";
                        return owner;
                    }
                    owner.type = nb5Var.s();
                }
            }
            return owner;
        }

        public void serialize(Owner owner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = owner.f264id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = owner.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Owner> JSON_ADAPTER = new ObjectJsonAdapter<Owner>() { // from class: com.p1.mobile.putong.data.Owner.2
        public Class getDataClass() {
            return Owner.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Owner mo17830newInstance() {
            return new Owner();
        }

        public boolean parseField(Owner owner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                owner.f264id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            owner.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Owner owner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(owner, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Owner owner, JsonGenerator jsonGenerator) throws IOException {
            String str = owner.f264id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = owner.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Owner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Owner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Owner new_() {
        Owner owner = new Owner();
        owner.nullCheck();
        return owner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Owner m18761clone() {
        Owner owner = new Owner();
        owner.f264id = this.f264id;
        owner.type = this.type;
        return owner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        return ValueObject.util_equals(this.f264id, owner.f264id) && ValueObject.util_equals(this.type, owner.type);
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
        String str = this.f264id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f264id == null) {
            this.f264id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
