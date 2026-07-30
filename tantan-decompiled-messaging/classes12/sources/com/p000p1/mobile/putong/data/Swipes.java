package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Swipes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipes";

    @ProtobufIndex(index = 2)
    public int lastCount;

    @ProtobufIndex(index = 1)
    public int todayCount;
    public static ProtobufAdapter<Swipes> PROTOBUF_ADAPTER = new MessageNanoAdapter<Swipes>() { // from class: com.p1.mobile.putong.data.Swipes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Swipes swipes) {
            int iH = CodedOutputByteBufferNano.h(1, swipes.todayCount) + CodedOutputByteBufferNano.h(2, swipes.lastCount);
            ((MessageNano) swipes).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Swipes m19073parse(nb5 nb5Var) throws IOException {
            Swipes swipes = new Swipes();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    swipes.todayCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return swipes;
                    }
                    swipes.lastCount = nb5Var.j();
                }
            }
        }

        public void serialize(Swipes swipes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, swipes.todayCount);
            codedOutputByteBufferNano.G(2, swipes.lastCount);
        }
    };
    public static JsonAdapter<Swipes> JSON_ADAPTER = new ObjectJsonAdapter<Swipes>() { // from class: com.p1.mobile.putong.data.Swipes.2
        public Class getDataClass() {
            return Swipes.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Swipes mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Swipes swipes, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("todayCount", swipes.todayCount);
            jsonGenerator.writeNumberField("lastCount", swipes.lastCount);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Swipes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Swipes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Swipes new_() {
        Swipes swipes = new Swipes();
        swipes.nullCheck();
        return swipes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Swipes m19072clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.todayCount) * 41) + this.lastCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
