package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class Dimension extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dimension";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @ProtobufIndex(index = 2)
    public int value;
    public static ProtobufAdapter<Dimension> PROTOBUF_ADAPTER = new MessageNanoAdapter<Dimension>() { // from class: com.p1.mobile.putong.core.data.Dimension.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Dimension dimension) {
            String str = dimension.key;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, dimension.value);
            dimension.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Dimension parse(nb5 nb5Var) throws IOException {
            Dimension dimension = new Dimension();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (dimension.key != null) {
                        break;
                    }
                    dimension.key = "";
                    break;
                }
                if (iM158752u == 10) {
                    dimension.key = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (dimension.key != null) {
                            break;
                        }
                        dimension.key = "";
                        return dimension;
                    }
                    dimension.value = nb5Var.m158741j();
                }
            }
            return dimension;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Dimension dimension, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dimension.key;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, dimension.value);
        }
    };
    public static JsonAdapter<Dimension> JSON_ADAPTER = new ObjectJsonAdapter<Dimension>() { // from class: com.p1.mobile.putong.core.data.Dimension.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Dimension.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Dimension newInstance() {
            return new Dimension();
        }

        public boolean parseField(Dimension dimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
                dimension.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            dimension.value = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Dimension dimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Constants.KEY_KEY) || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(dimension, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Dimension dimension, JsonGenerator jsonGenerator) throws IOException {
            String str = dimension.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            jsonGenerator.writeNumberField("value", dimension.value);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Dimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Dimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Dimension new_() {
        Dimension dimension = new Dimension();
        dimension.nullCheck();
        return dimension;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Dimension mo223809clone() {
        Dimension dimension = new Dimension();
        dimension.key = this.key;
        dimension.value = this.value;
        return dimension;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) obj;
        return ValueObject.util_equals(this.key, dimension.key) && this.value == dimension.value;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "dimension";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.key;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.value;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
