package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Owner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "owner";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39651id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<Owner> PROTOBUF_ADAPTER = new MessageNanoAdapter<Owner>() { // from class: com.p1.mobile.putong.data.Owner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Owner owner) {
            String str = owner.f39651id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = owner.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            owner.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Owner parse(nc5 nc5Var) throws IOException {
            Owner owner = new Owner();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (owner.f39651id == null) {
                        owner.f39651id = "";
                    }
                    if (owner.type != null) {
                        break;
                    }
                    owner.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    owner.f39651id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (owner.f39651id == null) {
                            owner.f39651id = "";
                        }
                        if (owner.type != null) {
                            break;
                        }
                        owner.type = "";
                        return owner;
                    }
                    owner.type = nc5Var.m162495s();
                }
            }
            return owner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Owner owner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = owner.f39651id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = owner.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<Owner> JSON_ADAPTER = new ObjectJsonAdapter<Owner>() { // from class: com.p1.mobile.putong.data.Owner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Owner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Owner newInstance() {
            return new Owner();
        }

        public boolean parseField(Owner owner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                owner.f39651id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Owner owner, JsonGenerator jsonGenerator) throws IOException {
            String str = owner.f39651id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = owner.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Owner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Owner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Owner new_() {
        Owner owner = new Owner();
        owner.nullCheck();
        return owner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Owner mo225055clone() {
        Owner owner = new Owner();
        owner.f39651id = this.f39651id;
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
        return ValueObject.util_equals(this.f39651id, owner.f39651id) && ValueObject.util_equals(this.type, owner.type);
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
        String str = this.f39651id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39651id == null) {
            this.f39651id = "";
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
