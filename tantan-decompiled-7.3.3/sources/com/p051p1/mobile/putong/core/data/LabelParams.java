package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class LabelParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "labelparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<LabelParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<LabelParams>() { // from class: com.p1.mobile.putong.core.data.LabelParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LabelParams labelParams) {
            String str = labelParams.key;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = labelParams.value;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            labelParams.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LabelParams parse(nc5 nc5Var) throws IOException {
            LabelParams labelParams = new LabelParams();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (labelParams.key == null) {
                        labelParams.key = "";
                    }
                    if (labelParams.value != null) {
                        break;
                    }
                    labelParams.value = "";
                    break;
                }
                if (iM162497u == 10) {
                    labelParams.key = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (labelParams.key == null) {
                            labelParams.key = "";
                        }
                        if (labelParams.value != null) {
                            break;
                        }
                        labelParams.value = "";
                        return labelParams;
                    }
                    labelParams.value = nc5Var.m162495s();
                }
            }
            return labelParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LabelParams labelParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = labelParams.key;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = labelParams.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<LabelParams> JSON_ADAPTER = new ObjectJsonAdapter<LabelParams>() { // from class: com.p1.mobile.putong.core.data.LabelParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LabelParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LabelParams newInstance() {
            return new LabelParams();
        }

        public boolean parseField(LabelParams labelParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
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
            if (str.equals(Constants.KEY_KEY) || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(labelParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LabelParams labelParams, JsonGenerator jsonGenerator) throws IOException {
            String str = labelParams.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = labelParams.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LabelParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LabelParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LabelParams new_() {
        LabelParams labelParams = new LabelParams();
        labelParams.nullCheck();
        return labelParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LabelParams mo225055clone() {
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
