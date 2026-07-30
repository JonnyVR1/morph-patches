package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class OfficialAdvertEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialadvertenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public OfficialAdvertData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<OfficialAdvertEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAdvertEnvelope>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OfficialAdvertEnvelope officialAdvertEnvelope) {
            Meta meta = officialAdvertEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            OfficialAdvertData officialAdvertData = officialAdvertEnvelope.data;
            if (officialAdvertData != null) {
                iL += CodedOutputByteBufferNano.l(2, officialAdvertData, OfficialAdvertData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) officialAdvertEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OfficialAdvertEnvelope m14649parse(nb5 nb5Var) throws IOException {
            OfficialAdvertEnvelope officialAdvertEnvelope = new OfficialAdvertEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (officialAdvertEnvelope.meta == null) {
                        officialAdvertEnvelope.meta = Meta.new_();
                    }
                    if (officialAdvertEnvelope.data != null) {
                        break;
                    }
                    officialAdvertEnvelope.data = OfficialAdvertData.new_();
                    break;
                }
                if (iU == 10) {
                    officialAdvertEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (officialAdvertEnvelope.meta == null) {
                            officialAdvertEnvelope.meta = Meta.new_();
                        }
                        if (officialAdvertEnvelope.data != null) {
                            break;
                        }
                        officialAdvertEnvelope.data = OfficialAdvertData.new_();
                        return officialAdvertEnvelope;
                    }
                    officialAdvertEnvelope.data = (OfficialAdvertData) nb5Var.l(OfficialAdvertData.PROTOBUF_ADAPTER);
                }
            }
            return officialAdvertEnvelope;
        }

        public void serialize(OfficialAdvertEnvelope officialAdvertEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = officialAdvertEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            OfficialAdvertData officialAdvertData = officialAdvertEnvelope.data;
            if (officialAdvertData != null) {
                codedOutputByteBufferNano.K(2, officialAdvertData, OfficialAdvertData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OfficialAdvertEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAdvertEnvelope>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertEnvelope.2
        public Class getDataClass() {
            return OfficialAdvertEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OfficialAdvertEnvelope m14650newInstance() {
            return new OfficialAdvertEnvelope();
        }

        public boolean parseField(OfficialAdvertEnvelope officialAdvertEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                officialAdvertEnvelope.data = (OfficialAdvertData) OfficialAdvertData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            officialAdvertEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OfficialAdvertEnvelope officialAdvertEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(officialAdvertEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAdvertEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAdvertEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAdvertEnvelope new_() {
        OfficialAdvertEnvelope officialAdvertEnvelope = new OfficialAdvertEnvelope();
        officialAdvertEnvelope.nullCheck();
        return officialAdvertEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OfficialAdvertEnvelope m14648clone() {
        OfficialAdvertEnvelope officialAdvertEnvelope = new OfficialAdvertEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            officialAdvertEnvelope.meta = meta.clone();
        }
        OfficialAdvertData officialAdvertData = this.data;
        if (officialAdvertData != null) {
            officialAdvertEnvelope.data = officialAdvertData.m14644clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        OfficialAdvertData officialAdvertData = this.data;
        int iHashCode2 = iHashCode + (officialAdvertData != null ? officialAdvertData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = OfficialAdvertData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
