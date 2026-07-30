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
public class LabelParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<LabelParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelParams>() { // from class: com.p1.mobile.putong.core.data.LabelParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LabelParams labelParams) {
            String str = labelParams.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = labelParams.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) labelParams).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LabelParams m13805parse(nb5 nb5Var) throws IOException {
            LabelParams labelParams = new LabelParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (labelParams.key == null) {
                        labelParams.key = "";
                    }
                    if (labelParams.value != null) {
                        break;
                    }
                    labelParams.value = "";
                    break;
                }
                if (iU == 10) {
                    labelParams.key = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (labelParams.key == null) {
                            labelParams.key = "";
                        }
                        if (labelParams.value != null) {
                            break;
                        }
                        labelParams.value = "";
                        return labelParams;
                    }
                    labelParams.value = nb5Var.s();
                }
            }
            return labelParams;
        }

        public void serialize(LabelParams labelParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelParams.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = labelParams.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LabelParams> JSON_ADAPTER = new ObjectJsonAdapter<LabelParams>() { // from class: com.p1.mobile.putong.core.data.LabelParams.2
        public Class getDataClass() {
            return LabelParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LabelParams m13806newInstance() {
            return new LabelParams();
        }

        public boolean parseField(LabelParams labelParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("key")) {
                labelParams.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            labelParams.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LabelParams labelParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("key") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(labelParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LabelParams labelParams, JsonGenerator jsonGenerator) throws IOException {
            String str = labelParams.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            String str2 = labelParams.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelParams new_() {
        LabelParams labelParams = new LabelParams();
        labelParams.nullCheck();
        return labelParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LabelParams m13804clone() {
        LabelParams labelParams = new LabelParams();
        labelParams.key = this.key;
        labelParams.value = this.value;
        return labelParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelParams)) {
            return false;
        }
        LabelParams labelParams = (LabelParams) obj;
        return ValueObject.util_equals(this.key, labelParams.key) && ValueObject.util_equals(this.value, labelParams.value);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
