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
public class IntlWebPayPaymentEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlwebpaypaymentenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlWebPayPaymentData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<IntlWebPayPaymentEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlWebPayPaymentEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope) {
            Meta meta = intlWebPayPaymentEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            if (intlWebPayPaymentData != null) {
                iL += CodedOutputByteBufferNano.l(2, intlWebPayPaymentData, IntlWebPayPaymentData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlWebPayPaymentEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlWebPayPaymentEnvelope m13739parse(nb5 nb5Var) throws IOException {
            IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope = new IntlWebPayPaymentEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlWebPayPaymentEnvelope.meta == null) {
                        intlWebPayPaymentEnvelope.meta = Meta.new_();
                    }
                    if (intlWebPayPaymentEnvelope.data != null) {
                        break;
                    }
                    intlWebPayPaymentEnvelope.data = IntlWebPayPaymentData.new_();
                    break;
                }
                if (iU == 10) {
                    intlWebPayPaymentEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlWebPayPaymentEnvelope.meta == null) {
                            intlWebPayPaymentEnvelope.meta = Meta.new_();
                        }
                        if (intlWebPayPaymentEnvelope.data != null) {
                            break;
                        }
                        intlWebPayPaymentEnvelope.data = IntlWebPayPaymentData.new_();
                        return intlWebPayPaymentEnvelope;
                    }
                    intlWebPayPaymentEnvelope.data = (IntlWebPayPaymentData) nb5Var.l(IntlWebPayPaymentData.PROTOBUF_ADAPTER);
                }
            }
            return intlWebPayPaymentEnvelope;
        }

        public void serialize(IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = intlWebPayPaymentEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            IntlWebPayPaymentData intlWebPayPaymentData = intlWebPayPaymentEnvelope.data;
            if (intlWebPayPaymentData != null) {
                codedOutputByteBufferNano.K(2, intlWebPayPaymentData, IntlWebPayPaymentData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlWebPayPaymentEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<IntlWebPayPaymentEnvelope>() { // from class: com.p1.mobile.putong.core.data.IntlWebPayPaymentEnvelope.2
        public Class getDataClass() {
            return IntlWebPayPaymentEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlWebPayPaymentEnvelope m13740newInstance() {
            return new IntlWebPayPaymentEnvelope();
        }

        public boolean parseField(IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                intlWebPayPaymentEnvelope.data = (IntlWebPayPaymentData) IntlWebPayPaymentData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            intlWebPayPaymentEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(intlWebPayPaymentEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (intlWebPayPaymentEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(intlWebPayPaymentEnvelope.meta, jsonGenerator, true);
            }
            if (intlWebPayPaymentEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                IntlWebPayPaymentData.JSON_ADAPTER.serialize(intlWebPayPaymentEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlWebPayPaymentEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlWebPayPaymentEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlWebPayPaymentEnvelope new_() {
        IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope = new IntlWebPayPaymentEnvelope();
        intlWebPayPaymentEnvelope.nullCheck();
        return intlWebPayPaymentEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlWebPayPaymentEnvelope m13738clone() {
        IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope = new IntlWebPayPaymentEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            intlWebPayPaymentEnvelope.meta = meta.clone();
        }
        IntlWebPayPaymentData intlWebPayPaymentData = this.data;
        if (intlWebPayPaymentData != null) {
            intlWebPayPaymentEnvelope.data = intlWebPayPaymentData.m13734clone();
        }
        return intlWebPayPaymentEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlWebPayPaymentEnvelope)) {
            return false;
        }
        IntlWebPayPaymentEnvelope intlWebPayPaymentEnvelope = (IntlWebPayPaymentEnvelope) obj;
        return ValueObject.util_equals(this.meta, intlWebPayPaymentEnvelope.meta) && ValueObject.util_equals(this.data, intlWebPayPaymentEnvelope.data);
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
        IntlWebPayPaymentData intlWebPayPaymentData = this.data;
        int iHashCode2 = iHashCode + (intlWebPayPaymentData != null ? intlWebPayPaymentData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = IntlWebPayPaymentData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
