package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Dimension extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dimension";

    @ProtobufIndex(index = 2)
    public int height;

    @ProtobufIndex(index = 1)
    public int width;
    public static ProtobufAdapter<Dimension> PROTOBUF_ADAPTER = new MessageNanoAdapter<Dimension>() { // from class: com.p1.mobile.putong.data.Dimension.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Dimension dimension) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, dimension.width) + CodedOutputByteBufferNano.m17281h(2, dimension.height);
            dimension.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Dimension parse(nc5 nc5Var) throws IOException {
            Dimension dimension = new Dimension();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    dimension.width = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return dimension;
                    }
                    dimension.height = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Dimension dimension, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, dimension.width);
            codedOutputByteBufferNano.m17305G(2, dimension.height);
        }
    };
    public static JsonAdapter<Dimension> JSON_ADAPTER = new ObjectJsonAdapter<Dimension>() { // from class: com.p1.mobile.putong.data.Dimension.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Dimension.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Dimension newInstance() {
            return new Dimension();
        }

        public boolean parseField(Dimension dimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("height")) {
                dimension.height = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("width")) {
                return false;
            }
            dimension.width = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Dimension dimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("height") || str.equals("width")) {
                return true;
            }
            return super.parseFieldCheck(dimension, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Dimension dimension, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("width", dimension.width);
            jsonGenerator.writeNumberField("height", dimension.height);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Dimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Dimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public Dimension(int[] iArr) {
        this.width = Math.max(1, iArr[0]);
        this.height = Math.max(1, iArr[1]);
    }

    public static Dimension new_() {
        Dimension dimension = new Dimension();
        dimension.nullCheck();
        return dimension;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Dimension mo225055clone() {
        Dimension dimension = new Dimension();
        dimension.width = this.width;
        dimension.height = this.height;
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
        return this.width == dimension.width && this.height == dimension.height;
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
        int i2 = (((i * 41) + this.width) * 41) + this.height;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public Dimension() {
    }

    public Dimension(int i, int i2) {
        this.width = Math.max(1, i);
        this.height = Math.max(1, i2);
    }
}
