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
public class IntlSobotHelpCenter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlsobothelpcenter";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String url;
    public static ProtobufAdapter<IntlSobotHelpCenter> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlSobotHelpCenter>() { // from class: com.p1.mobile.putong.core.data.IntlSobotHelpCenter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlSobotHelpCenter intlSobotHelpCenter) {
            int iB = CodedOutputByteBufferNano.b(1, intlSobotHelpCenter.enable);
            String str = intlSobotHelpCenter.url;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) intlSobotHelpCenter).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlSobotHelpCenter m13683parse(nb5 nb5Var) throws IOException {
            IntlSobotHelpCenter intlSobotHelpCenter = new IntlSobotHelpCenter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlSobotHelpCenter.url != null) {
                        break;
                    }
                    intlSobotHelpCenter.url = "";
                    break;
                }
                if (iU == 8) {
                    intlSobotHelpCenter.enable = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (intlSobotHelpCenter.url != null) {
                            break;
                        }
                        intlSobotHelpCenter.url = "";
                        return intlSobotHelpCenter;
                    }
                    intlSobotHelpCenter.url = nb5Var.s();
                }
            }
            return intlSobotHelpCenter;
        }

        public void serialize(IntlSobotHelpCenter intlSobotHelpCenter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intlSobotHelpCenter.enable);
            String str = intlSobotHelpCenter.url;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<IntlSobotHelpCenter> JSON_ADAPTER = new ObjectJsonAdapter<IntlSobotHelpCenter>() { // from class: com.p1.mobile.putong.core.data.IntlSobotHelpCenter.2
        public Class getDataClass() {
            return IntlSobotHelpCenter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlSobotHelpCenter m13684newInstance() {
            return new IntlSobotHelpCenter();
        }

        public boolean parseField(IntlSobotHelpCenter intlSobotHelpCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                intlSobotHelpCenter.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            intlSobotHelpCenter.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlSobotHelpCenter intlSobotHelpCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(intlSobotHelpCenter, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlSobotHelpCenter intlSobotHelpCenter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", intlSobotHelpCenter.enable);
            String str = intlSobotHelpCenter.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlSobotHelpCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlSobotHelpCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlSobotHelpCenter new_() {
        IntlSobotHelpCenter intlSobotHelpCenter = new IntlSobotHelpCenter();
        intlSobotHelpCenter.nullCheck();
        return intlSobotHelpCenter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlSobotHelpCenter m13682clone() {
        IntlSobotHelpCenter intlSobotHelpCenter = new IntlSobotHelpCenter();
        intlSobotHelpCenter.enable = this.enable;
        intlSobotHelpCenter.url = this.url;
        return intlSobotHelpCenter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlSobotHelpCenter)) {
            return false;
        }
        IntlSobotHelpCenter intlSobotHelpCenter = (IntlSobotHelpCenter) obj;
        return this.enable == intlSobotHelpCenter.enable && ValueObject.util_equals(this.url, intlSobotHelpCenter.url);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
