package com.p051p1.mobile.putong.core.data;

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
public class BuzzResolution extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzresolution";

    @ProtobufIndex(index = 1)
    public int height;

    @ProtobufIndex(index = 2)
    public int width;
    public static ProtobufAdapter<BuzzResolution> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzResolution>() { // from class: com.p1.mobile.putong.core.data.BuzzResolution.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BuzzResolution buzzResolution) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, buzzResolution.height) + CodedOutputByteBufferNano.m17281h(2, buzzResolution.width);
            buzzResolution.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BuzzResolution parse(nc5 nc5Var) throws IOException {
            BuzzResolution buzzResolution = new BuzzResolution();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    buzzResolution.height = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return buzzResolution;
                    }
                    buzzResolution.width = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BuzzResolution buzzResolution, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, buzzResolution.height);
            codedOutputByteBufferNano.m17305G(2, buzzResolution.width);
        }
    };
    public static JsonAdapter<BuzzResolution> JSON_ADAPTER = new ObjectJsonAdapter<BuzzResolution>() { // from class: com.p1.mobile.putong.core.data.BuzzResolution.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BuzzResolution.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BuzzResolution newInstance() {
            return new BuzzResolution();
        }

        public boolean parseField(BuzzResolution buzzResolution, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("height")) {
                buzzResolution.height = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("width")) {
                return false;
            }
            buzzResolution.width = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BuzzResolution buzzResolution, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("height") || str.equals("width")) {
                return true;
            }
            return super.parseFieldCheck(buzzResolution, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuzzResolution buzzResolution, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("height", buzzResolution.height);
            jsonGenerator.writeNumberField("width", buzzResolution.width);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzResolution) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzResolution) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzResolution new_() {
        BuzzResolution buzzResolution = new BuzzResolution();
        buzzResolution.nullCheck();
        return buzzResolution;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BuzzResolution mo225055clone() {
        BuzzResolution buzzResolution = new BuzzResolution();
        buzzResolution.height = this.height;
        buzzResolution.width = this.width;
        return buzzResolution;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuzzResolution)) {
            return false;
        }
        BuzzResolution buzzResolution = (BuzzResolution) obj;
        return this.height == buzzResolution.height && this.width == buzzResolution.width;
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
        int i2 = (((i * 41) + this.height) * 41) + this.width;
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
}
