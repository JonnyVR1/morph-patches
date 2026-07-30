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
public class IntlTabMePayGuideText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguidetext";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public IntlTabMePayGuideTextContent expired;

    /* JADX INFO: renamed from: in */
    @NonNull
    @ProtobufIndex(index = 1)
    public IntlTabMePayGuideTextContent f91in;
    public static ProtobufAdapter<IntlTabMePayGuideText> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuideText>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlTabMePayGuideText intlTabMePayGuideText) {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = intlTabMePayGuideText.f91in;
            int iL = intlTabMePayGuideTextContent != null ? CodedOutputByteBufferNano.l(1, intlTabMePayGuideTextContent, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER) : 0;
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = intlTabMePayGuideText.expired;
            if (intlTabMePayGuideTextContent2 != null) {
                iL += CodedOutputByteBufferNano.l(2, intlTabMePayGuideTextContent2, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlTabMePayGuideText).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlTabMePayGuideText m13695parse(nb5 nb5Var) throws IOException {
            IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlTabMePayGuideText.f91in == null) {
                        intlTabMePayGuideText.f91in = IntlTabMePayGuideTextContent.new_();
                    }
                    if (intlTabMePayGuideText.expired != null) {
                        break;
                    }
                    intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.new_();
                    break;
                }
                if (iU == 10) {
                    intlTabMePayGuideText.f91in = (IntlTabMePayGuideTextContent) nb5Var.l(IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (intlTabMePayGuideText.f91in == null) {
                            intlTabMePayGuideText.f91in = IntlTabMePayGuideTextContent.new_();
                        }
                        if (intlTabMePayGuideText.expired != null) {
                            break;
                        }
                        intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.new_();
                        return intlTabMePayGuideText;
                    }
                    intlTabMePayGuideText.expired = (IntlTabMePayGuideTextContent) nb5Var.l(IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
                }
            }
            return intlTabMePayGuideText;
        }

        public void serialize(IntlTabMePayGuideText intlTabMePayGuideText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = intlTabMePayGuideText.f91in;
            if (intlTabMePayGuideTextContent != null) {
                codedOutputByteBufferNano.K(1, intlTabMePayGuideTextContent, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = intlTabMePayGuideText.expired;
            if (intlTabMePayGuideTextContent2 != null) {
                codedOutputByteBufferNano.K(2, intlTabMePayGuideTextContent2, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlTabMePayGuideText> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuideText>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideText.2
        public Class getDataClass() {
            return IntlTabMePayGuideText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlTabMePayGuideText m13696newInstance() {
            return new IntlTabMePayGuideText();
        }

        public boolean parseField(IntlTabMePayGuideText intlTabMePayGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expired")) {
                intlTabMePayGuideText.expired = (IntlTabMePayGuideTextContent) IntlTabMePayGuideTextContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("in")) {
                return false;
            }
            intlTabMePayGuideText.f91in = (IntlTabMePayGuideTextContent) IntlTabMePayGuideTextContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTabMePayGuideText intlTabMePayGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expired") || str.equals("in")) {
                return true;
            }
            return super.parseFieldCheck(intlTabMePayGuideText, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlTabMePayGuideText intlTabMePayGuideText, JsonGenerator jsonGenerator) throws IOException {
            if (intlTabMePayGuideText.f91in != null) {
                jsonGenerator.writeFieldName("in");
                IntlTabMePayGuideTextContent.JSON_ADAPTER.serialize(intlTabMePayGuideText.f91in, jsonGenerator, true);
            }
            if (intlTabMePayGuideText.expired != null) {
                jsonGenerator.writeFieldName("expired");
                IntlTabMePayGuideTextContent.JSON_ADAPTER.serialize(intlTabMePayGuideText.expired, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuideText new_() {
        IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
        intlTabMePayGuideText.nullCheck();
        return intlTabMePayGuideText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlTabMePayGuideText m13694clone() {
        IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = this.f91in;
        if (intlTabMePayGuideTextContent != null) {
            intlTabMePayGuideText.f91in = intlTabMePayGuideTextContent.m13698clone();
        }
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = this.expired;
        if (intlTabMePayGuideTextContent2 != null) {
            intlTabMePayGuideText.expired = intlTabMePayGuideTextContent2.m13698clone();
        }
        return intlTabMePayGuideText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTabMePayGuideText)) {
            return false;
        }
        IntlTabMePayGuideText intlTabMePayGuideText = (IntlTabMePayGuideText) obj;
        return ValueObject.util_equals(this.f91in, intlTabMePayGuideText.f91in) && ValueObject.util_equals(this.expired, intlTabMePayGuideText.expired);
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
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = this.f91in;
        int iHashCode = (i2 + (intlTabMePayGuideTextContent != null ? intlTabMePayGuideTextContent.hashCode() : 0)) * 41;
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = this.expired;
        int iHashCode2 = iHashCode + (intlTabMePayGuideTextContent2 != null ? intlTabMePayGuideTextContent2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f91in == null) {
            this.f91in = IntlTabMePayGuideTextContent.new_();
        }
        if (this.expired == null) {
            this.expired = IntlTabMePayGuideTextContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
