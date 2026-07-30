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
public class Accessory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accessory";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40061id;
    public static ProtobufAdapter<Accessory> PROTOBUF_ADAPTER = new MessageNanoAdapter<Accessory>() { // from class: com.p1.mobile.putong.feed.data.Accessory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Accessory accessory) {
            String str = accessory.f40061id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            accessory.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Accessory parse(nc5 nc5Var) throws IOException {
            Accessory accessory = new Accessory();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (accessory.f40061id != null) {
                        break;
                    }
                    accessory.f40061id = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (accessory.f40061id != null) {
                        break;
                    }
                    accessory.f40061id = "";
                    return accessory;
                }
                accessory.f40061id = nc5Var.m162495s();
            }
            return accessory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Accessory accessory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accessory.f40061id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<Accessory> JSON_ADAPTER = new ObjectJsonAdapter<Accessory>() { // from class: com.p1.mobile.putong.feed.data.Accessory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Accessory.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Accessory newInstance() {
            return new Accessory();
        }

        public boolean parseField(Accessory accessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            accessory.f40061id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(Accessory accessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(accessory, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Accessory accessory, JsonGenerator jsonGenerator) throws IOException {
            String str = accessory.f40061id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Accessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Accessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Accessory new_() {
        Accessory accessory = new Accessory();
        accessory.nullCheck();
        return accessory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Accessory mo225055clone() {
        Accessory accessory = new Accessory();
        accessory.f40061id = this.f40061id;
        return accessory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Accessory) {
            return ValueObject.util_equals(this.f40061id, ((Accessory) obj).f40061id);
        }
        return false;
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
        String str = this.f40061id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40061id == null) {
            this.f40061id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
