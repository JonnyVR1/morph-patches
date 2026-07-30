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
public class IntlTabMePayGuideTextContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intltabmepayguidetextcontent";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<IntlTabMePayGuideTextContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlTabMePayGuideTextContent>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideTextContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent) {
            String str = intlTabMePayGuideTextContent.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlTabMePayGuideTextContent.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) intlTabMePayGuideTextContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlTabMePayGuideTextContent m13699parse(nb5 nb5Var) throws IOException {
            IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = new IntlTabMePayGuideTextContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlTabMePayGuideTextContent.title == null) {
                        intlTabMePayGuideTextContent.title = "";
                    }
                    if (intlTabMePayGuideTextContent.text != null) {
                        break;
                    }
                    intlTabMePayGuideTextContent.text = "";
                    break;
                }
                if (iU == 10) {
                    intlTabMePayGuideTextContent.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (intlTabMePayGuideTextContent.title == null) {
                            intlTabMePayGuideTextContent.title = "";
                        }
                        if (intlTabMePayGuideTextContent.text != null) {
                            break;
                        }
                        intlTabMePayGuideTextContent.text = "";
                        return intlTabMePayGuideTextContent;
                    }
                    intlTabMePayGuideTextContent.text = nb5Var.s();
                }
            }
            return intlTabMePayGuideTextContent;
        }

        public void serialize(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlTabMePayGuideTextContent.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlTabMePayGuideTextContent.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<IntlTabMePayGuideTextContent> JSON_ADAPTER = new ObjectJsonAdapter<IntlTabMePayGuideTextContent>() { // from class: com.p1.mobile.putong.core.data.IntlTabMePayGuideTextContent.2
        public Class getDataClass() {
            return IntlTabMePayGuideTextContent.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlTabMePayGuideTextContent m13700newInstance() {
            return new IntlTabMePayGuideTextContent();
        }

        public boolean parseField(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                intlTabMePayGuideTextContent.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            intlTabMePayGuideTextContent.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(intlTabMePayGuideTextContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IntlTabMePayGuideTextContent intlTabMePayGuideTextContent, JsonGenerator jsonGenerator) throws IOException {
            String str = intlTabMePayGuideTextContent.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = intlTabMePayGuideTextContent.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlTabMePayGuideTextContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlTabMePayGuideTextContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlTabMePayGuideTextContent new_() {
        IntlTabMePayGuideTextContent intlTabMePayGuideTextContent = new IntlTabMePayGuideTextContent();
        intlTabMePayGuideTextContent.nullCheck();
        return intlTabMePayGuideTextContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlTabMePayGuideTextContent m13698clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
