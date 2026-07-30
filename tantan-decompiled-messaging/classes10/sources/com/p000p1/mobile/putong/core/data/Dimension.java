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
public class Dimension extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dimension";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int value;
    public static ProtobufAdapter<Dimension> PROTOBUF_ADAPTER = new MessageNanoAdapter<Dimension>() { // from class: com.p1.mobile.putong.core.data.Dimension.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Dimension dimension) {
            String str = dimension.key;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, dimension.value);
            ((MessageNano) dimension).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Dimension m12609parse(nb5 nb5Var) throws IOException {
            Dimension dimension = new Dimension();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dimension.key != null) {
                        break;
                    }
                    dimension.key = "";
                    break;
                }
                if (iU == 10) {
                    dimension.key = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (dimension.key != null) {
                            break;
                        }
                        dimension.key = "";
                        return dimension;
                    }
                    dimension.value = nb5Var.j();
                }
            }
            return dimension;
        }

        public void serialize(Dimension dimension, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dimension.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, dimension.value);
        }
    };
    public static JsonAdapter<Dimension> JSON_ADAPTER = new ObjectJsonAdapter<Dimension>() { // from class: com.p1.mobile.putong.core.data.Dimension.2
        public Class getDataClass() {
            return Dimension.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Dimension m12610newInstance() {
            return new Dimension();
        }

        public boolean parseField(Dimension dimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("key")) {
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
            if (str.equals("key") || str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(dimension, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Dimension dimension, JsonGenerator jsonGenerator) throws IOException {
            String str = dimension.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            jsonGenerator.writeNumberField("value", dimension.value);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Dimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Dimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Dimension new_() {
        Dimension dimension = new Dimension();
        dimension.nullCheck();
        return dimension;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Dimension m12608clone() {
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
