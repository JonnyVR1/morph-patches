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
public class LabelIconStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labeliconstyle";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LabelIconStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelIconStyle>() { // from class: com.p1.mobile.putong.core.data.LabelIconStyle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LabelIconStyle labelIconStyle) {
            String str = labelIconStyle.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = labelIconStyle.iconUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) labelIconStyle).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LabelIconStyle m13801parse(nb5 nb5Var) throws IOException {
            LabelIconStyle labelIconStyle = new LabelIconStyle();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (labelIconStyle.type == null) {
                        labelIconStyle.type = "";
                    }
                    if (labelIconStyle.iconUrl != null) {
                        break;
                    }
                    labelIconStyle.iconUrl = "";
                    break;
                }
                if (iU == 10) {
                    labelIconStyle.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (labelIconStyle.type == null) {
                            labelIconStyle.type = "";
                        }
                        if (labelIconStyle.iconUrl != null) {
                            break;
                        }
                        labelIconStyle.iconUrl = "";
                        return labelIconStyle;
                    }
                    labelIconStyle.iconUrl = nb5Var.s();
                }
            }
            return labelIconStyle;
        }

        public void serialize(LabelIconStyle labelIconStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelIconStyle.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = labelIconStyle.iconUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LabelIconStyle> JSON_ADAPTER = new ObjectJsonAdapter<LabelIconStyle>() { // from class: com.p1.mobile.putong.core.data.LabelIconStyle.2
        public Class getDataClass() {
            return LabelIconStyle.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LabelIconStyle m13802newInstance() {
            return new LabelIconStyle();
        }

        public boolean parseField(LabelIconStyle labelIconStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                labelIconStyle.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("iconUrl")) {
                return false;
            }
            labelIconStyle.iconUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LabelIconStyle labelIconStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("iconUrl")) {
                return true;
            }
            return super.parseFieldCheck(labelIconStyle, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LabelIconStyle labelIconStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = labelIconStyle.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = labelIconStyle.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelIconStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelIconStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelIconStyle new_() {
        LabelIconStyle labelIconStyle = new LabelIconStyle();
        labelIconStyle.nullCheck();
        return labelIconStyle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LabelIconStyle m13800clone() {
        LabelIconStyle labelIconStyle = new LabelIconStyle();
        labelIconStyle.type = this.type;
        labelIconStyle.iconUrl = this.iconUrl;
        return labelIconStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelIconStyle)) {
            return false;
        }
        LabelIconStyle labelIconStyle = (LabelIconStyle) obj;
        return ValueObject.util_equals(this.type, labelIconStyle.type) && ValueObject.util_equals(this.iconUrl, labelIconStyle.iconUrl);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
