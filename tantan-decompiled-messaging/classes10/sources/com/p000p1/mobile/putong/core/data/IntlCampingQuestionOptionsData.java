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
public class IntlCampingQuestionOptionsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcampingquestionoptionsdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String desc;

    @ProtobufIndex(index = 1)
    public int oid;
    public static ProtobufAdapter<IntlCampingQuestionOptionsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlCampingQuestionOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingQuestionOptionsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData) {
            int iH = CodedOutputByteBufferNano.h(1, intlCampingQuestionOptionsData.oid);
            String str = intlCampingQuestionOptionsData.desc;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) intlCampingQuestionOptionsData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlCampingQuestionOptionsData m13511parse(nb5 nb5Var) throws IOException {
            IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = new IntlCampingQuestionOptionsData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlCampingQuestionOptionsData.desc != null) {
                        break;
                    }
                    intlCampingQuestionOptionsData.desc = "";
                    break;
                }
                if (iU == 8) {
                    intlCampingQuestionOptionsData.oid = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (intlCampingQuestionOptionsData.desc != null) {
                            break;
                        }
                        intlCampingQuestionOptionsData.desc = "";
                        return intlCampingQuestionOptionsData;
                    }
                    intlCampingQuestionOptionsData.desc = nb5Var.s();
                }
            }
            return intlCampingQuestionOptionsData;
        }

        public void serialize(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlCampingQuestionOptionsData.oid);
            String str = intlCampingQuestionOptionsData.desc;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<IntlCampingQuestionOptionsData> JSON_ADAPTER = new ObjectJsonAdapter<IntlCampingQuestionOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlCampingQuestionOptionsData.2
        public Class getDataClass() {
            return IntlCampingQuestionOptionsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlCampingQuestionOptionsData m13512newInstance() {
            return new IntlCampingQuestionOptionsData();
        }

        public boolean parseField(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("oid")) {
                intlCampingQuestionOptionsData.oid = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("desc")) {
                return false;
            }
            intlCampingQuestionOptionsData.desc = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("oid") || str.equals("desc")) {
                return true;
            }
            return super.parseFieldCheck(intlCampingQuestionOptionsData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("oid", intlCampingQuestionOptionsData.oid);
            String str = intlCampingQuestionOptionsData.desc;
            if (str != null) {
                jsonGenerator.writeStringField("desc", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlCampingQuestionOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlCampingQuestionOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlCampingQuestionOptionsData new_() {
        IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = new IntlCampingQuestionOptionsData();
        intlCampingQuestionOptionsData.nullCheck();
        return intlCampingQuestionOptionsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlCampingQuestionOptionsData m13510clone() {
        IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = new IntlCampingQuestionOptionsData();
        intlCampingQuestionOptionsData.oid = this.oid;
        intlCampingQuestionOptionsData.desc = this.desc;
        return intlCampingQuestionOptionsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlCampingQuestionOptionsData)) {
            return false;
        }
        IntlCampingQuestionOptionsData intlCampingQuestionOptionsData = (IntlCampingQuestionOptionsData) obj;
        return this.oid == intlCampingQuestionOptionsData.oid && ValueObject.util_equals(this.desc, intlCampingQuestionOptionsData.desc);
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
