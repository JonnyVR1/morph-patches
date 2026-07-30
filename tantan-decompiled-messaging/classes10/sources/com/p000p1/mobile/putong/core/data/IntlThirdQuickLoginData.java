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
public class IntlThirdQuickLoginData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlthirdquicklogindata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String code;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String message;
    public static ProtobufAdapter<IntlThirdQuickLoginData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlThirdQuickLoginData>() { // from class: com.p1.mobile.putong.core.data.IntlThirdQuickLoginData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlThirdQuickLoginData intlThirdQuickLoginData) {
            String str = intlThirdQuickLoginData.code;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlThirdQuickLoginData.message;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) intlThirdQuickLoginData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlThirdQuickLoginData m13703parse(nb5 nb5Var) throws IOException {
            IntlThirdQuickLoginData intlThirdQuickLoginData = new IntlThirdQuickLoginData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlThirdQuickLoginData.code == null) {
                        intlThirdQuickLoginData.code = "";
                    }
                    if (intlThirdQuickLoginData.message != null) {
                        break;
                    }
                    intlThirdQuickLoginData.message = "";
                    break;
                }
                if (iU == 10) {
                    intlThirdQuickLoginData.code = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (intlThirdQuickLoginData.code == null) {
                            intlThirdQuickLoginData.code = "";
                        }
                        if (intlThirdQuickLoginData.message != null) {
                            break;
                        }
                        intlThirdQuickLoginData.message = "";
                        return intlThirdQuickLoginData;
                    }
                    intlThirdQuickLoginData.message = nb5Var.s();
                }
            }
            return intlThirdQuickLoginData;
        }

        public void serialize(IntlThirdQuickLoginData intlThirdQuickLoginData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlThirdQuickLoginData.code;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlThirdQuickLoginData.message;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<IntlThirdQuickLoginData> JSON_ADAPTER = new ObjectJsonAdapter<IntlThirdQuickLoginData>() { // from class: com.p1.mobile.putong.core.data.IntlThirdQuickLoginData.2
        public Class getDataClass() {
            return IntlThirdQuickLoginData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlThirdQuickLoginData m13704newInstance() {
            return new IntlThirdQuickLoginData();
        }

        public boolean parseField(IntlThirdQuickLoginData intlThirdQuickLoginData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("code")) {
                intlThirdQuickLoginData.code = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            intlThirdQuickLoginData.message = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlThirdQuickLoginData intlThirdQuickLoginData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("code") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(intlThirdQuickLoginData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlThirdQuickLoginData intlThirdQuickLoginData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlThirdQuickLoginData.code;
            if (str != null) {
                jsonGenerator.writeStringField("code", str);
            }
            String str2 = intlThirdQuickLoginData.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlThirdQuickLoginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlThirdQuickLoginData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlThirdQuickLoginData new_() {
        IntlThirdQuickLoginData intlThirdQuickLoginData = new IntlThirdQuickLoginData();
        intlThirdQuickLoginData.nullCheck();
        return intlThirdQuickLoginData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlThirdQuickLoginData m13702clone() {
        IntlThirdQuickLoginData intlThirdQuickLoginData = new IntlThirdQuickLoginData();
        intlThirdQuickLoginData.code = this.code;
        intlThirdQuickLoginData.message = this.message;
        return intlThirdQuickLoginData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlThirdQuickLoginData)) {
            return false;
        }
        IntlThirdQuickLoginData intlThirdQuickLoginData = (IntlThirdQuickLoginData) obj;
        return ValueObject.util_equals(this.code, intlThirdQuickLoginData.code) && ValueObject.util_equals(this.message, intlThirdQuickLoginData.message);
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
        String str = this.code;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.message;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.code == null) {
            this.code = "";
        }
        if (this.message == null) {
            this.message = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
