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
public class ConvAdditionalLoveLetterTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "convadditionallovelettertag";

    @NonNull
    @ProtobufIndex(index = 1)
    public String tag;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tagDesc;
    public static ProtobufAdapter<ConvAdditionalLoveLetterTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConvAdditionalLoveLetterTag>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag) {
            String str = convAdditionalLoveLetterTag.tag;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = convAdditionalLoveLetterTag.tagDesc;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) convAdditionalLoveLetterTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalLoveLetterTag m12297parse(nb5 nb5Var) throws IOException {
            ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = new ConvAdditionalLoveLetterTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (convAdditionalLoveLetterTag.tag == null) {
                        convAdditionalLoveLetterTag.tag = "";
                    }
                    if (convAdditionalLoveLetterTag.tagDesc != null) {
                        break;
                    }
                    convAdditionalLoveLetterTag.tagDesc = "";
                    break;
                }
                if (iU == 10) {
                    convAdditionalLoveLetterTag.tag = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (convAdditionalLoveLetterTag.tag == null) {
                            convAdditionalLoveLetterTag.tag = "";
                        }
                        if (convAdditionalLoveLetterTag.tagDesc != null) {
                            break;
                        }
                        convAdditionalLoveLetterTag.tagDesc = "";
                        return convAdditionalLoveLetterTag;
                    }
                    convAdditionalLoveLetterTag.tagDesc = nb5Var.s();
                }
            }
            return convAdditionalLoveLetterTag;
        }

        public void serialize(ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = convAdditionalLoveLetterTag.tag;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = convAdditionalLoveLetterTag.tagDesc;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ConvAdditionalLoveLetterTag> JSON_ADAPTER = new ObjectJsonAdapter<ConvAdditionalLoveLetterTag>() { // from class: com.p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag.2
        public Class getDataClass() {
            return ConvAdditionalLoveLetterTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConvAdditionalLoveLetterTag m12298newInstance() {
            return new ConvAdditionalLoveLetterTag();
        }

        public boolean parseField(ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tagDesc")) {
                convAdditionalLoveLetterTag.tagDesc = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tag")) {
                return false;
            }
            convAdditionalLoveLetterTag.tag = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tagDesc") || str.equals("tag")) {
                return true;
            }
            return super.parseFieldCheck(convAdditionalLoveLetterTag, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag, JsonGenerator jsonGenerator) throws IOException {
            String str = convAdditionalLoveLetterTag.tag;
            if (str != null) {
                jsonGenerator.writeStringField("tag", str);
            }
            String str2 = convAdditionalLoveLetterTag.tagDesc;
            if (str2 != null) {
                jsonGenerator.writeStringField("tagDesc", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConvAdditionalLoveLetterTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConvAdditionalLoveLetterTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConvAdditionalLoveLetterTag new_() {
        ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = new ConvAdditionalLoveLetterTag();
        convAdditionalLoveLetterTag.nullCheck();
        return convAdditionalLoveLetterTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConvAdditionalLoveLetterTag m12296clone() {
        ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = new ConvAdditionalLoveLetterTag();
        convAdditionalLoveLetterTag.tag = this.tag;
        convAdditionalLoveLetterTag.tagDesc = this.tagDesc;
        return convAdditionalLoveLetterTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConvAdditionalLoveLetterTag)) {
            return false;
        }
        ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = (ConvAdditionalLoveLetterTag) obj;
        return ValueObject.util_equals(this.tag, convAdditionalLoveLetterTag.tag) && ValueObject.util_equals(this.tagDesc, convAdditionalLoveLetterTag.tagDesc);
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
        String str = this.tag;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tagDesc;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tag == null) {
            this.tag = "";
        }
        if (this.tagDesc == null) {
            this.tagDesc = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
