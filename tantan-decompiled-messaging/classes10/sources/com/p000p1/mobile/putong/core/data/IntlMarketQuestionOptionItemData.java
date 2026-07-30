package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class IntlMarketQuestionOptionItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketquestionoptionitemdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String desc;

    @ProtobufIndex(index = 1)
    public int oid;
    public static ProtobufAdapter<IntlMarketQuestionOptionItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketQuestionOptionItemData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData) {
            int iH = CodedOutputByteBufferNano.h(1, intlMarketQuestionOptionItemData.oid);
            String str = intlMarketQuestionOptionItemData.desc;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) intlMarketQuestionOptionItemData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionOptionItemData m13599parse(nb5 nb5Var) throws IOException {
            IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = new IntlMarketQuestionOptionItemData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketQuestionOptionItemData.desc != null) {
                        break;
                    }
                    intlMarketQuestionOptionItemData.desc = "";
                    break;
                }
                if (iU == 8) {
                    intlMarketQuestionOptionItemData.oid = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (intlMarketQuestionOptionItemData.desc != null) {
                            break;
                        }
                        intlMarketQuestionOptionItemData.desc = "";
                        return intlMarketQuestionOptionItemData;
                    }
                    intlMarketQuestionOptionItemData.desc = nb5Var.s();
                }
            }
            return intlMarketQuestionOptionItemData;
        }

        public void serialize(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlMarketQuestionOptionItemData.oid);
            String str = intlMarketQuestionOptionItemData.desc;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<IntlMarketQuestionOptionItemData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketQuestionOptionItemData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData.2
        public Class getDataClass() {
            return IntlMarketQuestionOptionItemData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketQuestionOptionItemData m13600newInstance() {
            return new IntlMarketQuestionOptionItemData();
        }

        public boolean parseField(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("oid")) {
                intlMarketQuestionOptionItemData.oid = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("desc")) {
                return false;
            }
            intlMarketQuestionOptionItemData.desc = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("oid") || str.equals("desc")) {
                return true;
            }
            return super.parseFieldCheck(intlMarketQuestionOptionItemData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("oid", intlMarketQuestionOptionItemData.oid);
            String str = intlMarketQuestionOptionItemData.desc;
            if (str != null) {
                jsonGenerator.writeStringField("desc", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketQuestionOptionItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketQuestionOptionItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketQuestionOptionItemData new_() {
        IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = new IntlMarketQuestionOptionItemData();
        intlMarketQuestionOptionItemData.nullCheck();
        return intlMarketQuestionOptionItemData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketQuestionOptionItemData m13598clone() {
        IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = new IntlMarketQuestionOptionItemData();
        intlMarketQuestionOptionItemData.oid = this.oid;
        intlMarketQuestionOptionItemData.desc = this.desc;
        return intlMarketQuestionOptionItemData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketQuestionOptionItemData)) {
            return false;
        }
        IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData = (IntlMarketQuestionOptionItemData) obj;
        return this.oid == intlMarketQuestionOptionItemData.oid && ValueObject.util_equals(this.desc, intlMarketQuestionOptionItemData.desc);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.oid) * 41;
        String str = this.desc;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
