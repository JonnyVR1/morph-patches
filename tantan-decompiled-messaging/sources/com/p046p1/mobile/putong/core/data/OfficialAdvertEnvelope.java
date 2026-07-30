package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class OfficialAdvertEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialadvertenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public OfficialAdvertData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<OfficialAdvertEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAdvertEnvelope>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OfficialAdvertEnvelope officialAdvertEnvelope) {
            Meta meta = officialAdvertEnvelope.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            OfficialAdvertData officialAdvertData = officialAdvertEnvelope.data;
            if (officialAdvertData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, officialAdvertData, OfficialAdvertData.PROTOBUF_ADAPTER);
            }
            officialAdvertEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAdvertEnvelope parse(nb5 nb5Var) throws IOException {
            OfficialAdvertEnvelope officialAdvertEnvelope = new OfficialAdvertEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (officialAdvertEnvelope.meta == null) {
                        officialAdvertEnvelope.meta = Meta.new_();
                    }
                    if (officialAdvertEnvelope.data != null) {
                        break;
                    }
                    officialAdvertEnvelope.data = OfficialAdvertData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    officialAdvertEnvelope.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (officialAdvertEnvelope.meta == null) {
                            officialAdvertEnvelope.meta = Meta.new_();
                        }
                        if (officialAdvertEnvelope.data != null) {
                            break;
                        }
                        officialAdvertEnvelope.data = OfficialAdvertData.new_();
                        return officialAdvertEnvelope;
                    }
                    officialAdvertEnvelope.data = (OfficialAdvertData) nb5Var.m158743l(OfficialAdvertData.PROTOBUF_ADAPTER);
                }
            }
            return officialAdvertEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAdvertEnvelope officialAdvertEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = officialAdvertEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            OfficialAdvertData officialAdvertData = officialAdvertEnvelope.data;
            if (officialAdvertData != null) {
                codedOutputByteBufferNano.m17254K(2, officialAdvertData, OfficialAdvertData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OfficialAdvertEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAdvertEnvelope>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAdvertEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OfficialAdvertEnvelope newInstance() {
            return new OfficialAdvertEnvelope();
        }

        public boolean parseField(OfficialAdvertEnvelope officialAdvertEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                officialAdvertEnvelope.data = OfficialAdvertData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            officialAdvertEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OfficialAdvertEnvelope officialAdvertEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(officialAdvertEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAdvertEnvelope officialAdvertEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (officialAdvertEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(officialAdvertEnvelope.meta, jsonGenerator, true);
            }
            if (officialAdvertEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                OfficialAdvertData.JSON_ADAPTER.serialize(officialAdvertEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAdvertEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAdvertEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAdvertEnvelope new_() {
        OfficialAdvertEnvelope officialAdvertEnvelope = new OfficialAdvertEnvelope();
        officialAdvertEnvelope.nullCheck();
        return officialAdvertEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAdvertEnvelope mo223809clone() {
        OfficialAdvertEnvelope officialAdvertEnvelope = new OfficialAdvertEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            officialAdvertEnvelope.meta = meta.mo223809clone();
        }
        OfficialAdvertData officialAdvertData = this.data;
        if (officialAdvertData != null) {
            officialAdvertEnvelope.data = officialAdvertData.mo223809clone();
        }
        return officialAdvertEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfficialAdvertEnvelope)) {
            return false;
        }
        OfficialAdvertEnvelope officialAdvertEnvelope = (OfficialAdvertEnvelope) obj;
        return ValueObject.util_equals(this.meta, officialAdvertEnvelope.meta) && ValueObject.util_equals(this.data, officialAdvertEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        OfficialAdvertData officialAdvertData = this.data;
        int iHashCode2 = iHashCode + (officialAdvertData != null ? officialAdvertData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = OfficialAdvertData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
