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
public class IdBoxed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idboxed";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f39607id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<IdBoxed> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdBoxed>() { // from class: com.p1.mobile.putong.data.IdBoxed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdBoxed idBoxed) {
            String str = idBoxed.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = idBoxed.f39607id;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            idBoxed.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdBoxed parse(nc5 nc5Var) throws IOException {
            IdBoxed idBoxed = new IdBoxed();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (idBoxed.type == null) {
                        idBoxed.type = "";
                    }
                    if (idBoxed.f39607id != null) {
                        break;
                    }
                    idBoxed.f39607id = "";
                    break;
                }
                if (iM162497u == 10) {
                    idBoxed.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (idBoxed.type == null) {
                            idBoxed.type = "";
                        }
                        if (idBoxed.f39607id != null) {
                            break;
                        }
                        idBoxed.f39607id = "";
                        return idBoxed;
                    }
                    idBoxed.f39607id = nc5Var.m162495s();
                }
            }
            return idBoxed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdBoxed idBoxed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idBoxed.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = idBoxed.f39607id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<IdBoxed> JSON_ADAPTER = new ObjectJsonAdapter<IdBoxed>() { // from class: com.p1.mobile.putong.data.IdBoxed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdBoxed.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdBoxed newInstance() {
            return new IdBoxed();
        }

        public boolean parseField(IdBoxed idBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                idBoxed.f39607id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            idBoxed.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IdBoxed idBoxed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(idBoxed, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdBoxed idBoxed, JsonGenerator jsonGenerator) throws IOException {
            String str = idBoxed.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = idBoxed.f39607id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdBoxed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public IdBoxed(String str, String str2) {
        this.type = str2;
        this.f39607id = str;
    }

    public static IdBoxed new_() {
        IdBoxed idBoxed = new IdBoxed();
        idBoxed.nullCheck();
        return idBoxed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdBoxed mo225055clone() {
        IdBoxed idBoxed = new IdBoxed();
        idBoxed.type = this.type;
        idBoxed.f39607id = this.f39607id;
        return idBoxed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdBoxed)) {
            return false;
        }
        IdBoxed idBoxed = (IdBoxed) obj;
        return ValueObject.util_equals(this.type, idBoxed.type) && ValueObject.util_equals(this.f39607id, idBoxed.f39607id);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f39607id;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f39607id == null) {
            this.f39607id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public IdBoxed() {
    }
}
