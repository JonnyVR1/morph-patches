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
public class IntlTabMePayGuideTextContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguidetextcontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<IntlTabMePayGuideTextContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuideTextContent>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideTextContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent) {
            String str = intlTabMePayGuideTextContent.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = intlTabMePayGuideTextContent.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            intlTabMePayGuideTextContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlTabMePayGuideTextContent parse(nb5 nb5Var) throws IOException {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = new IntlTabMePayGuideTextContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlTabMePayGuideTextContent.title == null) {
                        intlTabMePayGuideTextContent.title = "";
                    }
                    if (intlTabMePayGuideTextContent.text != null) {
                        break;
                    }
                    intlTabMePayGuideTextContent.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    intlTabMePayGuideTextContent.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (intlTabMePayGuideTextContent.title == null) {
                            intlTabMePayGuideTextContent.title = "";
                        }
                        if (intlTabMePayGuideTextContent.text != null) {
                            break;
                        }
                        intlTabMePayGuideTextContent.text = "";
                        return intlTabMePayGuideTextContent;
                    }
                    intlTabMePayGuideTextContent.text = nb5Var.m158750s();
                }
            }
            return intlTabMePayGuideTextContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlTabMePayGuideTextContent.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = intlTabMePayGuideTextContent.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<IntlTabMePayGuideTextContent> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuideTextContent>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideTextContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlTabMePayGuideTextContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlTabMePayGuideTextContent newInstance() {
            return new IntlTabMePayGuideTextContent();
        }

        public boolean parseField(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                intlTabMePayGuideTextContent.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            intlTabMePayGuideTextContent.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(intlTabMePayGuideTextContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, JsonGenerator jsonGenerator) throws IOException {
            String str = intlTabMePayGuideTextContent.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = intlTabMePayGuideTextContent.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuideTextContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuideTextContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuideTextContent new_() {
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = new IntlTabMePayGuideTextContent();
        intlTabMePayGuideTextContent.nullCheck();
        return intlTabMePayGuideTextContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlTabMePayGuideTextContent mo223809clone() {
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = new IntlTabMePayGuideTextContent();
        intlTabMePayGuideTextContent.title = this.title;
        intlTabMePayGuideTextContent.text = this.text;
        return intlTabMePayGuideTextContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlTabMePayGuideTextContent)) {
            return false;
        }
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = (IntlTabMePayGuideTextContent) obj;
        return ValueObject.util_equals(this.title, intlTabMePayGuideTextContent.title) && ValueObject.util_equals(this.text, intlTabMePayGuideTextContent.text);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
