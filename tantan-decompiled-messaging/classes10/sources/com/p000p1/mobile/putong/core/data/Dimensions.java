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
public class Dimensions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dimensions";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int value;
    public static ProtobufAdapter<Dimensions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Dimensions>() { // from class: com.p1.mobile.putong.core.data.Dimensions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Dimensions dimensions) {
            String str = dimensions.key;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, dimensions.value);
            ((MessageNano) dimensions).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Dimensions m12613parse(nb5 nb5Var) throws IOException {
            Dimensions dimensions = new Dimensions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dimensions.key != null) {
                        break;
                    }
                    dimensions.key = "";
                    break;
                }
                if (iU == 10) {
                    dimensions.key = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (dimensions.key != null) {
                            break;
                        }
                        dimensions.key = "";
                        return dimensions;
                    }
                    dimensions.value = nb5Var.j();
                }
            }
            return dimensions;
        }

        public void serialize(Dimensions dimensions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dimensions.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, dimensions.value);
        }
    };
    public static JsonAdapter<Dimensions> JSON_ADAPTER = new ObjectJsonAdapter<Dimensions>() { // from class: com.p1.mobile.putong.core.data.Dimensions.2
        public Class getDataClass() {
            return Dimensions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Dimensions m12614newInstance() {
            return new Dimensions();
        }

        public boolean parseField(Dimensions dimensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("key")) {
                dimensions.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            dimensions.value = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Dimensions dimensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("key") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(dimensions, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Dimensions dimensions, JsonGenerator jsonGenerator) throws IOException {
            String str = dimensions.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            jsonGenerator.writeNumberField("value", dimensions.value);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Dimensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Dimensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Dimensions new_() {
        Dimensions dimensions = new Dimensions();
        dimensions.nullCheck();
        return dimensions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Dimensions m12612clone() {
        Dimensions dimensions = new Dimensions();
        dimensions.key = this.key;
        dimensions.value = this.value;
        return dimensions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dimensions)) {
            return false;
        }
        Dimensions dimensions = (Dimensions) obj;
        return ValueObject.util_equals(this.key, dimensions.key) && this.value == dimensions.value;
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
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.value;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
