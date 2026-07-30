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
public class Accessory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accessory";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39213id;
    public static ProtobufAdapter<Accessory> PROTOBUF_ADAPTER = new MessageNanoAdapter<Accessory>() { // from class: com.p1.mobile.putong.feed.data.Accessory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Accessory accessory) {
            String str = accessory.f39213id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            accessory.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Accessory parse(nb5 nb5Var) throws IOException {
            Accessory accessory = new Accessory();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (accessory.f39213id != null) {
                        break;
                    }
                    accessory.f39213id = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (accessory.f39213id != null) {
                        break;
                    }
                    accessory.f39213id = "";
                    return accessory;
                }
                accessory.f39213id = nb5Var.m158750s();
            }
            return accessory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Accessory accessory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accessory.f39213id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<Accessory> JSON_ADAPTER = new ObjectJsonAdapter<Accessory>() { // from class: com.p1.mobile.putong.feed.data.Accessory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Accessory.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Accessory newInstance() {
            return new Accessory();
        }

        public boolean parseField(Accessory accessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            accessory.f39213id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(Accessory accessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(accessory, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Accessory accessory, JsonGenerator jsonGenerator) throws IOException {
            String str = accessory.f39213id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Accessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public Accessory mo223809clone() {
        Accessory accessory = new Accessory();
        accessory.f39213id = this.f39213id;
        return accessory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Accessory) {
            return ValueObject.util_equals(this.f39213id, ((Accessory) obj).f39213id);
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
        String str = this.f39213id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39213id == null) {
            this.f39213id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
