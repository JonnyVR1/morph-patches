package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class IntlTabMePayGuideText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguidetext";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlTabMePayGuideTextContent expired;

    /* JADX INFO: renamed from: in */
    @NonNull
    @ProtobufIndex(index = 1)
    public IntlTabMePayGuideTextContent f20429in;
    public static ProtobufAdapter<IntlTabMePayGuideText> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuideText>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTabMePayGuideText intlTabMePayGuideText) {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = intlTabMePayGuideText.f20429in;
            int iM17230l = intlTabMePayGuideTextContent != null ? CodedOutputByteBufferNano.m17230l(1, intlTabMePayGuideTextContent, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER) : 0;
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = intlTabMePayGuideText.expired;
            if (intlTabMePayGuideTextContent2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, intlTabMePayGuideTextContent2, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
            intlTabMePayGuideText.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTabMePayGuideText parse(nb5 nb5Var) throws IOException {
            IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlTabMePayGuideText.f20429in == null) {
                        intlTabMePayGuideText.f20429in = IntlTabMePayGuideTextContent.new_();
                    }
                    if (intlTabMePayGuideText.expired != null) {
                        break;
                    }
                    intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlTabMePayGuideText.f20429in = (IntlTabMePayGuideTextContent) nb5Var.m158743l(IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (intlTabMePayGuideText.f20429in == null) {
                            intlTabMePayGuideText.f20429in = IntlTabMePayGuideTextContent.new_();
                        }
                        if (intlTabMePayGuideText.expired != null) {
                            break;
                        }
                        intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.new_();
                        return intlTabMePayGuideText;
                    }
                    intlTabMePayGuideText.expired = (IntlTabMePayGuideTextContent) nb5Var.m158743l(IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
                }
            }
            return intlTabMePayGuideText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTabMePayGuideText intlTabMePayGuideText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = intlTabMePayGuideText.f20429in;
            if (intlTabMePayGuideTextContent != null) {
                codedOutputByteBufferNano.m17254K(1, intlTabMePayGuideTextContent, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = intlTabMePayGuideText.expired;
            if (intlTabMePayGuideTextContent2 != null) {
                codedOutputByteBufferNano.m17254K(2, intlTabMePayGuideTextContent2, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlTabMePayGuideText> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuideText>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTabMePayGuideText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTabMePayGuideText newInstance() {
            return new IntlTabMePayGuideText();
        }

        public boolean parseField(IntlTabMePayGuideText intlTabMePayGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expired")) {
                intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("in")) {
                return false;
            }
            intlTabMePayGuideText.f20429in = IntlTabMePayGuideTextContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTabMePayGuideText intlTabMePayGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expired") || str.equals("in")) {
                return true;
            }
            return super.parseFieldCheck(intlTabMePayGuideText, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTabMePayGuideText intlTabMePayGuideText, JsonGenerator jsonGenerator) throws IOException {
            if (intlTabMePayGuideText.f20429in != null) {
                jsonGenerator.writeFieldName("in");
                IntlTabMePayGuideTextContent.JSON_ADAPTER.serialize(intlTabMePayGuideText.f20429in, jsonGenerator, true);
            }
            if (intlTabMePayGuideText.expired != null) {
                jsonGenerator.writeFieldName("expired");
                IntlTabMePayGuideTextContent.JSON_ADAPTER.serialize(intlTabMePayGuideText.expired, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuideText new_() {
        IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
        intlTabMePayGuideText.nullCheck();
        return intlTabMePayGuideText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTabMePayGuideText mo223809clone() {
        IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = this.f20429in;
        if (intlTabMePayGuideTextContent != null) {
            intlTabMePayGuideText.f20429in = intlTabMePayGuideTextContent.mo223809clone();
        }
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = this.expired;
        if (intlTabMePayGuideTextContent2 != null) {
            intlTabMePayGuideText.expired = intlTabMePayGuideTextContent2.mo223809clone();
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
        return ValueObject.util_equals(this.f20429in, intlTabMePayGuideText.f20429in) && ValueObject.util_equals(this.expired, intlTabMePayGuideText.expired);
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
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = this.f20429in;
        int iHashCode = (i2 + (intlTabMePayGuideTextContent != null ? intlTabMePayGuideTextContent.hashCode() : 0)) * 41;
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = this.expired;
        int iHashCode2 = iHashCode + (intlTabMePayGuideTextContent2 != null ? intlTabMePayGuideTextContent2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20429in == null) {
            this.f20429in = IntlTabMePayGuideTextContent.new_();
        }
        if (this.expired == null) {
            this.expired = IntlTabMePayGuideTextContent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
