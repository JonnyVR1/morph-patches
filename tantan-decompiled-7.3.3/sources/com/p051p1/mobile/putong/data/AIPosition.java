package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
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
public class AIPosition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aiposition";

    /* JADX INFO: renamed from: x */
    @ProtobufIndex(index = 1)
    public int f39565x;

    /* JADX INFO: renamed from: y */
    @ProtobufIndex(index = 2)
    public int f39566y;
    public static ProtobufAdapter<AIPosition> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIPosition>() { // from class: com.p1.mobile.putong.data.AIPosition.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AIPosition aIPosition) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, aIPosition.f39565x) + CodedOutputByteBufferNano.m17281h(2, aIPosition.f39566y);
            aIPosition.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AIPosition parse(nc5 nc5Var) throws IOException {
            AIPosition aIPosition = new AIPosition();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    aIPosition.f39565x = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return aIPosition;
                    }
                    aIPosition.f39566y = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AIPosition aIPosition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, aIPosition.f39565x);
            codedOutputByteBufferNano.m17305G(2, aIPosition.f39566y);
        }
    };
    public static JsonAdapter<AIPosition> JSON_ADAPTER = new ObjectJsonAdapter<AIPosition>() { // from class: com.p1.mobile.putong.data.AIPosition.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AIPosition.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AIPosition newInstance() {
            return new AIPosition();
        }

        public boolean parseField(AIPosition aIPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BaseSei.f14624X)) {
                aIPosition.f39565x = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(BaseSei.f14625Y)) {
                return false;
            }
            aIPosition.f39566y = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(AIPosition aIPosition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(BaseSei.f14624X) || str.equals(BaseSei.f14625Y)) {
                return true;
            }
            return super.parseFieldCheck(aIPosition, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AIPosition aIPosition, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BaseSei.f14624X, aIPosition.f39565x);
            jsonGenerator.writeNumberField(BaseSei.f14625Y, aIPosition.f39566y);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIPosition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public AIPosition(int i, int i2) {
        this.f39565x = i;
        this.f39566y = i2;
    }

    public static AIPosition new_() {
        AIPosition aIPosition = new AIPosition();
        aIPosition.nullCheck();
        return aIPosition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AIPosition mo225055clone() {
        AIPosition aIPosition = new AIPosition();
        aIPosition.f39565x = this.f39565x;
        aIPosition.f39566y = this.f39566y;
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
        return this.f39565x == aIPosition.f39565x && this.f39566y == aIPosition.f39566y;
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
        int i2 = (((i * 41) + this.f39565x) * 41) + this.f39566y;
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
