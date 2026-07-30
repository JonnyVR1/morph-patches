package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class Swipes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipes";

    @ProtobufIndex(index = 2)
    public int lastCount;

    @ProtobufIndex(index = 1)
    public int todayCount;
    public static ProtobufAdapter<Swipes> PROTOBUF_ADAPTER = new MessageNanoAdapter<Swipes>() { // from class: com.p1.mobile.putong.data.Swipes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Swipes swipes) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, swipes.todayCount) + CodedOutputByteBufferNano.m17226h(2, swipes.lastCount);
            swipes.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Swipes parse(nb5 nb5Var) throws IOException {
            Swipes swipes = new Swipes();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    swipes.todayCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return swipes;
                    }
                    swipes.lastCount = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Swipes swipes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, swipes.todayCount);
            codedOutputByteBufferNano.m17250G(2, swipes.lastCount);
        }
    };
    public static JsonAdapter<Swipes> JSON_ADAPTER = new ObjectJsonAdapter<Swipes>() { // from class: com.p1.mobile.putong.data.Swipes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Swipes.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Swipes newInstance() {
            return new Swipes();
        }

        public boolean parseField(Swipes swipes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("todayCount")) {
                swipes.todayCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("lastCount")) {
                return false;
            }
            swipes.lastCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Swipes swipes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("todayCount") || str.equals("lastCount")) {
                return true;
            }
            return super.parseFieldCheck(swipes, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Swipes swipes, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("todayCount", swipes.todayCount);
            jsonGenerator.writeNumberField("lastCount", swipes.lastCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Swipes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Swipes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Swipes new_() {
        Swipes swipes = new Swipes();
        swipes.nullCheck();
        return swipes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Swipes mo223809clone() {
        Swipes swipes = new Swipes();
        swipes.todayCount = this.todayCount;
        swipes.lastCount = this.lastCount;
        return swipes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Swipes)) {
            return false;
        }
        Swipes swipes = (Swipes) obj;
        return this.todayCount == swipes.todayCount && this.lastCount == swipes.lastCount;
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
        int i2 = (((i * 41) + this.todayCount) * 41) + this.lastCount;
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
