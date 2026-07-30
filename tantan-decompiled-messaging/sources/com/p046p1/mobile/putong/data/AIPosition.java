package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
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
public class AIPosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aiposition";

    /* JADX INFO: renamed from: x */
    @ProtobufIndex(index = 1)
    public int f38717x;

    /* JADX INFO: renamed from: y */
    @ProtobufIndex(index = 2)
    public int f38718y;
    public static ProtobufAdapter<AIPosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIPosition>() { // from class: com.p1.mobile.putong.data.AIPosition.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AIPosition aIPosition) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, aIPosition.f38717x) + CodedOutputByteBufferNano.m17226h(2, aIPosition.f38718y);
            aIPosition.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AIPosition parse(nb5 nb5Var) throws IOException {
            AIPosition aIPosition = new AIPosition();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    aIPosition.f38717x = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return aIPosition;
                    }
                    aIPosition.f38718y = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AIPosition aIPosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, aIPosition.f38717x);
            codedOutputByteBufferNano.m17250G(2, aIPosition.f38718y);
        }
    };
    public static JsonAdapter<AIPosition> JSON_ADAPTER = new ObjectJsonAdapter<AIPosition>() { // from class: com.p1.mobile.putong.data.AIPosition.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AIPosition.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AIPosition newInstance() {
            return new AIPosition();
        }

        public boolean parseField(AIPosition aIPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BaseSei.f13930X)) {
                aIPosition.f38717x = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(BaseSei.f13931Y)) {
                return false;
            }
            aIPosition.f38718y = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(AIPosition aIPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(BaseSei.f13930X) || str.equals(BaseSei.f13931Y)) {
                return true;
            }
            return super.parseFieldCheck(aIPosition, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AIPosition aIPosition, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BaseSei.f13930X, aIPosition.f38717x);
            jsonGenerator.writeNumberField(BaseSei.f13931Y, aIPosition.f38718y);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public AIPosition(int i, int i2) {
        this.f38717x = i;
        this.f38718y = i2;
    }

    public static AIPosition new_() {
        AIPosition aIPosition = new AIPosition();
        aIPosition.nullCheck();
        return aIPosition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AIPosition mo223809clone() {
        AIPosition aIPosition = new AIPosition();
        aIPosition.f38717x = this.f38717x;
        aIPosition.f38718y = this.f38718y;
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
        return this.f38717x == aIPosition.f38717x && this.f38718y == aIPosition.f38718y;
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
        int i2 = (((i * 41) + this.f38717x) * 41) + this.f38718y;
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

    public AIPosition() {
    }
}
