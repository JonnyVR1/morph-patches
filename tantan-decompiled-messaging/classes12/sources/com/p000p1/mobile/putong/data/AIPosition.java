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
public class AIPosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aiposition";

    /* JADX INFO: renamed from: x */
    @ProtobufIndex(index = 1)
    public int f178x;

    /* JADX INFO: renamed from: y */
    @ProtobufIndex(index = 2)
    public int f179y;
    public static ProtobufAdapter<AIPosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIPosition>() { // from class: com.p1.mobile.putong.data.AIPosition.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AIPosition aIPosition) {
            int iH = CodedOutputByteBufferNano.h(1, aIPosition.f178x) + CodedOutputByteBufferNano.h(2, aIPosition.f179y);
            ((MessageNano) aIPosition).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AIPosition m17611parse(nb5 nb5Var) throws IOException {
            AIPosition aIPosition = new AIPosition();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    aIPosition.f178x = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return aIPosition;
                    }
                    aIPosition.f179y = nb5Var.j();
                }
            }
        }

        public void serialize(AIPosition aIPosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, aIPosition.f178x);
            codedOutputByteBufferNano.G(2, aIPosition.f179y);
        }
    };
    public static JsonAdapter<AIPosition> JSON_ADAPTER = new ObjectJsonAdapter<AIPosition>() { // from class: com.p1.mobile.putong.data.AIPosition.2
        public Class getDataClass() {
            return AIPosition.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AIPosition mo17830newInstance() {
            return new AIPosition();
        }

        public boolean parseField(AIPosition aIPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("x")) {
                aIPosition.f178x = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("y")) {
                return false;
            }
            aIPosition.f179y = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(AIPosition aIPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("x") || str.equals("y")) {
                return true;
            }
            return super.parseFieldCheck(aIPosition, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AIPosition aIPosition, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("x", aIPosition.f178x);
            jsonGenerator.writeNumberField("y", aIPosition.f179y);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public AIPosition(int i, int i2) {
        this.f178x = i;
        this.f179y = i2;
    }

    public static AIPosition new_() {
        AIPosition aIPosition = new AIPosition();
        aIPosition.nullCheck();
        return aIPosition;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AIPosition m17610clone() {
        AIPosition aIPosition = new AIPosition();
        aIPosition.f178x = this.f178x;
        aIPosition.f179y = this.f179y;
        return aIPosition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AIPosition)) {
            return false;
        }
        AIPosition aIPosition = (AIPosition) obj;
        return this.f178x == aIPosition.f178x && this.f179y == aIPosition.f179y;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.f178x) * 41) + this.f179y;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public AIPosition() {
    }
}
