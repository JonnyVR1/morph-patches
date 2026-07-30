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
public class Accessory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "accessory";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f674id;
    public static ProtobufAdapter<Accessory> PROTOBUF_ADAPTER = new MessageNanoAdapter<Accessory>() { // from class: com.p1.mobile.putong.feed.data.Accessory.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Accessory accessory) {
            String str = accessory.f674id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) accessory).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Accessory m19401parse(nb5 nb5Var) throws IOException {
            Accessory accessory = new Accessory();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (accessory.f674id != null) {
                        break;
                    }
                    accessory.f674id = "";
                    break;
                }
                if (iU != 10) {
                    if (accessory.f674id != null) {
                        break;
                    }
                    accessory.f674id = "";
                    return accessory;
                }
                accessory.f674id = nb5Var.s();
            }
            return accessory;
        }

        public void serialize(Accessory accessory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = accessory.f674id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<Accessory> JSON_ADAPTER = new ObjectJsonAdapter<Accessory>() { // from class: com.p1.mobile.putong.feed.data.Accessory.2
        public Class getDataClass() {
            return Accessory.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Accessory mo17830newInstance() {
            return new Accessory();
        }

        public boolean parseField(Accessory accessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("id")) {
                return false;
            }
            accessory.f674id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(Accessory accessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(accessory, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Accessory accessory, JsonGenerator jsonGenerator) throws IOException {
            String str = accessory.f674id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Accessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Accessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Accessory new_() {
        Accessory accessory = new Accessory();
        accessory.nullCheck();
        return accessory;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Accessory m19400clone() {
        Accessory accessory = new Accessory();
        accessory.f674id = this.f674id;
        return accessory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Accessory) {
            return ValueObject.util_equals(this.f674id, ((Accessory) obj).f674id);
        }
        return false;
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
        String str = this.f674id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f674id == null) {
            this.f674id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
