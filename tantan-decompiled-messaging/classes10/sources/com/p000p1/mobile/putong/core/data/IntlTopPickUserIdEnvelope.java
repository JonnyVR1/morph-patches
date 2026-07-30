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
public class IntlTopPickUserIdEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltoppickuseridenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlTopPickUserId data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlTopPickUserIdEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTopPickUserIdEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope) {
            Meta meta = intlTopPickUserIdEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlTopPickUserId intlTopPickUserId = intlTopPickUserIdEnvelope.data;
            if (intlTopPickUserId != null) {
                iL += CodedOutputByteBufferNano.l(2, intlTopPickUserId, IntlTopPickUserId.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlTopPickUserIdEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlTopPickUserIdEnvelope m13715parse(nb5 nb5Var) throws IOException {
            IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = new IntlTopPickUserIdEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlTopPickUserIdEnvelope.meta == null) {
                        intlTopPickUserIdEnvelope.meta = Meta.new_();
                    }
                    if (intlTopPickUserIdEnvelope.data != null) {
                        break;
                    }
                    intlTopPickUserIdEnvelope.data = IntlTopPickUserId.new_();
                    break;
                }
                if (iU == 10) {
                    intlTopPickUserIdEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlTopPickUserIdEnvelope.meta == null) {
                            intlTopPickUserIdEnvelope.meta = Meta.new_();
                        }
                        if (intlTopPickUserIdEnvelope.data != null) {
                            break;
                        }
                        intlTopPickUserIdEnvelope.data = IntlTopPickUserId.new_();
                        return intlTopPickUserIdEnvelope;
                    }
                    intlTopPickUserIdEnvelope.data = (IntlTopPickUserId) nb5Var.l(IntlTopPickUserId.PROTOBUF_ADAPTER);
                }
            }
            return intlTopPickUserIdEnvelope;
        }

        public void serialize(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlTopPickUserIdEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlTopPickUserId intlTopPickUserId = intlTopPickUserIdEnvelope.data;
            if (intlTopPickUserId != null) {
                codedOutputByteBufferNano.K(2, intlTopPickUserId, IntlTopPickUserId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlTopPickUserIdEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlTopPickUserIdEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlTopPickUserIdEnvelope.2
        public Class getDataClass() {
            return IntlTopPickUserIdEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlTopPickUserIdEnvelope m13716newInstance() {
            return new IntlTopPickUserIdEnvelope();
        }

        public boolean parseField(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlTopPickUserIdEnvelope.data = (IntlTopPickUserId) IntlTopPickUserId.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlTopPickUserIdEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlTopPickUserIdEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlTopPickUserIdEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlTopPickUserIdEnvelope.meta, jsonGenerator, true);
            }
            if (intlTopPickUserIdEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlTopPickUserId.JSON_ADAPTER.serialize(intlTopPickUserIdEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTopPickUserIdEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTopPickUserIdEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTopPickUserIdEnvelope new_() {
        IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = new IntlTopPickUserIdEnvelope();
        intlTopPickUserIdEnvelope.nullCheck();
        return intlTopPickUserIdEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlTopPickUserIdEnvelope m13714clone() {
        IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = new IntlTopPickUserIdEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlTopPickUserIdEnvelope.meta = meta.clone();
        }
        IntlTopPickUserId intlTopPickUserId = this.data;
        if (intlTopPickUserId != null) {
            intlTopPickUserIdEnvelope.data = intlTopPickUserId.m13710clone();
        }
        return intlTopPickUserIdEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTopPickUserIdEnvelope)) {
            return false;
        }
        IntlTopPickUserIdEnvelope intlTopPickUserIdEnvelope = (IntlTopPickUserIdEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlTopPickUserIdEnvelope.meta) && ValueObject.util_equals(this.data, intlTopPickUserIdEnvelope.data);
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
        IntlTopPickUserId intlTopPickUserId = this.data;
        int iHashCode2 = iHashCode + (intlTopPickUserId != null ? intlTopPickUserId.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlTopPickUserId.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
