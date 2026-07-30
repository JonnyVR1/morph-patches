package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: classes10.dex */
public class AnonymityAsset extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymityasset";

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f20344id;

    @Nullable
    @ProtobufIndex(index = 2)
    public String identifier;
    public static ProtobufAdapter<AnonymityAsset> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymityAsset>() { // from class: com.p1.mobile.putong.core.data.AnonymityAsset.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AnonymityAsset anonymityAsset) {
            String str = anonymityAsset.f20344id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = anonymityAsset.identifier;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            anonymityAsset.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AnonymityAsset parse(nb5 nb5Var) throws IOException {
            AnonymityAsset anonymityAsset = new AnonymityAsset();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    anonymityAsset.f20344id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        return anonymityAsset;
                    }
                    anonymityAsset.identifier = nb5Var.m158750s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AnonymityAsset anonymityAsset, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = anonymityAsset.f20344id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = anonymityAsset.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<AnonymityAsset> JSON_ADAPTER = new ObjectJsonAdapter<AnonymityAsset>() { // from class: com.p1.mobile.putong.core.data.AnonymityAsset.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AnonymityAsset.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AnonymityAsset newInstance() {
            return new AnonymityAsset();
        }

        public boolean parseField(AnonymityAsset anonymityAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("identifier")) {
                anonymityAsset.identifier = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            anonymityAsset.f20344id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(AnonymityAsset anonymityAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("identifier")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(anonymityAsset, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AnonymityAsset anonymityAsset, JsonGenerator jsonGenerator) throws IOException {
            String str = anonymityAsset.f20344id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = anonymityAsset.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymityAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymityAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymityAsset new_() {
        AnonymityAsset anonymityAsset = new AnonymityAsset();
        anonymityAsset.nullCheck();
        return anonymityAsset;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AnonymityAsset mo223809clone() {
        AnonymityAsset anonymityAsset = new AnonymityAsset();
        anonymityAsset.f20344id = this.f20344id;
        anonymityAsset.identifier = this.identifier;
        return anonymityAsset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymityAsset)) {
            return false;
        }
        AnonymityAsset anonymityAsset = (AnonymityAsset) obj;
        return ValueObject.util_equals(this.f20344id, anonymityAsset.f20344id) && ValueObject.util_equals(this.identifier, anonymityAsset.identifier);
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
        String str = this.f20344id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    public AnonymityAsset subtract(AnonymityAsset anonymityAsset) {
        AnonymityAsset anonymityAsset2 = new AnonymityAsset();
        if (!ValueObject.util_equals(this.f20344id, anonymityAsset.f20344id)) {
            anonymityAsset2.f20344id = this.f20344id;
        }
        if (!ValueObject.util_equals(this.identifier, anonymityAsset.identifier)) {
            anonymityAsset2.identifier = this.identifier;
        }
        if (anonymityAsset2.equals(new AnonymityAsset())) {
            return null;
        }
        return anonymityAsset2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
