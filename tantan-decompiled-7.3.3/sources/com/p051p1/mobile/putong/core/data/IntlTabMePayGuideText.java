package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlTabMePayGuideText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguidetext";

    @NonNull
    @ProtobufIndex(index = 2)
    public IntlTabMePayGuideTextContent expired;

    /* JADX INFO: renamed from: in */
    @NonNull
    @ProtobufIndex(index = 1)
    public IntlTabMePayGuideTextContent f21171in;
    public static ProtobufAdapter<IntlTabMePayGuideText> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuideText>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTabMePayGuideText intlTabMePayGuideText) {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = intlTabMePayGuideText.f21171in;
            int iM17285l = intlTabMePayGuideTextContent != null ? CodedOutputByteBufferNano.m17285l(1, intlTabMePayGuideTextContent, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER) : 0;
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = intlTabMePayGuideText.expired;
            if (intlTabMePayGuideTextContent2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, intlTabMePayGuideTextContent2, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
            intlTabMePayGuideText.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTabMePayGuideText parse(nc5 nc5Var) throws IOException {
            IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlTabMePayGuideText.f21171in == null) {
                        intlTabMePayGuideText.f21171in = IntlTabMePayGuideTextContent.new_();
                    }
                    if (intlTabMePayGuideText.expired != null) {
                        break;
                    }
                    intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.new_();
                    break;
                }
                if (iM162497u == 10) {
                    intlTabMePayGuideText.f21171in = (IntlTabMePayGuideTextContent) nc5Var.m162488l(IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (intlTabMePayGuideText.f21171in == null) {
                            intlTabMePayGuideText.f21171in = IntlTabMePayGuideTextContent.new_();
                        }
                        if (intlTabMePayGuideText.expired != null) {
                            break;
                        }
                        intlTabMePayGuideText.expired = IntlTabMePayGuideTextContent.new_();
                        return intlTabMePayGuideText;
                    }
                    intlTabMePayGuideText.expired = (IntlTabMePayGuideTextContent) nc5Var.m162488l(IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
                }
            }
            return intlTabMePayGuideText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTabMePayGuideText intlTabMePayGuideText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = intlTabMePayGuideText.f21171in;
            if (intlTabMePayGuideTextContent != null) {
                codedOutputByteBufferNano.m17309K(1, intlTabMePayGuideTextContent, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = intlTabMePayGuideText.expired;
            if (intlTabMePayGuideTextContent2 != null) {
                codedOutputByteBufferNano.m17309K(2, intlTabMePayGuideTextContent2, IntlTabMePayGuideTextContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlTabMePayGuideText> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuideText>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTabMePayGuideText.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            intlTabMePayGuideText.f21171in = IntlTabMePayGuideTextContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlTabMePayGuideText intlTabMePayGuideText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expired") || str.equals("in")) {
                return true;
            }
            return super.parseFieldCheck(intlTabMePayGuideText, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTabMePayGuideText intlTabMePayGuideText, JsonGenerator jsonGenerator) throws IOException {
            if (intlTabMePayGuideText.f21171in != null) {
                jsonGenerator.writeFieldName("in");
                IntlTabMePayGuideTextContent.JSON_ADAPTER.serialize(intlTabMePayGuideText.f21171in, jsonGenerator, true);
            }
            if (intlTabMePayGuideText.expired != null) {
                jsonGenerator.writeFieldName("expired");
                IntlTabMePayGuideTextContent.JSON_ADAPTER.serialize(intlTabMePayGuideText.expired, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuideText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public IntlTabMePayGuideText mo225055clone() {
        IntlTabMePayGuideText intlTabMePayGuideText = new IntlTabMePayGuideText();
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = this.f21171in;
        if (intlTabMePayGuideTextContent != null) {
            intlTabMePayGuideText.f21171in = intlTabMePayGuideTextContent.mo225055clone();
        }
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = this.expired;
        if (intlTabMePayGuideTextContent2 != null) {
            intlTabMePayGuideText.expired = intlTabMePayGuideTextContent2.mo225055clone();
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
        return ValueObject.util_equals(this.f21171in, intlTabMePayGuideText.f21171in) && ValueObject.util_equals(this.expired, intlTabMePayGuideText.expired);
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
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = this.f21171in;
        int iHashCode = (i2 + (intlTabMePayGuideTextContent != null ? intlTabMePayGuideTextContent.hashCode() : 0)) * 41;
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent2 = this.expired;
        int iHashCode2 = iHashCode + (intlTabMePayGuideTextContent2 != null ? intlTabMePayGuideTextContent2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21171in == null) {
            this.f21171in = IntlTabMePayGuideTextContent.new_();
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
