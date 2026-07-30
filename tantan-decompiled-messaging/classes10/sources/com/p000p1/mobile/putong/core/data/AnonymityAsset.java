package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class AnonymityAsset extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "anonymityasset";

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f6id;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String identifier;
    public static ProtobufAdapter<AnonymityAsset> PROTOBUF_ADAPTER = new MessageNanoAdapter<AnonymityAsset>() { // from class: com.p1.mobile.putong.core.data.AnonymityAsset.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AnonymityAsset anonymityAsset) {
            String str = anonymityAsset.f6id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = anonymityAsset.identifier;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) anonymityAsset).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AnonymityAsset m11625parse(nb5 nb5Var) throws IOException {
            AnonymityAsset anonymityAsset = new AnonymityAsset();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    anonymityAsset.f6id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        return anonymityAsset;
                    }
                    anonymityAsset.identifier = nb5Var.s();
                }
            }
        }

        public void serialize(AnonymityAsset anonymityAsset, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = anonymityAsset.f6id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = anonymityAsset.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AnonymityAsset> JSON_ADAPTER = new ObjectJsonAdapter<AnonymityAsset>() { // from class: com.p1.mobile.putong.core.data.AnonymityAsset.2
        public Class getDataClass() {
            return AnonymityAsset.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AnonymityAsset m11626newInstance() {
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
            anonymityAsset.f6id = jsonParser.getValueAsString();
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

        public void serializeFields(AnonymityAsset anonymityAsset, JsonGenerator jsonGenerator) throws IOException {
            String str = anonymityAsset.f6id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = anonymityAsset.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AnonymityAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AnonymityAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AnonymityAsset new_() {
        AnonymityAsset anonymityAsset = new AnonymityAsset();
        anonymityAsset.nullCheck();
        return anonymityAsset;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AnonymityAsset m11624clone() {
        AnonymityAsset anonymityAsset = new AnonymityAsset();
        anonymityAsset.f6id = this.f6id;
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
        return ValueObject.util_equals(this.f6id, anonymityAsset.f6id) && ValueObject.util_equals(this.identifier, anonymityAsset.identifier);
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
        String str = this.f6id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public AnonymityAsset subtract(AnonymityAsset anonymityAsset) {
        AnonymityAsset anonymityAsset2 = new AnonymityAsset();
        if (!ValueObject.util_equals(this.f6id, anonymityAsset.f6id)) {
            anonymityAsset2.f6id = this.f6id;
        }
        if (!ValueObject.util_equals(this.identifier, anonymityAsset.identifier)) {
            anonymityAsset2.identifier = this.identifier;
        }
        if (anonymityAsset2.equals(new AnonymityAsset())) {
            return null;
        }
        return anonymityAsset2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
