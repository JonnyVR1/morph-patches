package com.p046p1.mobile.putong.core.data;

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
public class AwardCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "awardcounter";

    @ProtobufIndex(index = 1)
    public int awardCount;

    @ProtobufIndex(index = 2)
    public int showCount;
    public static ProtobufAdapter<AwardCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<AwardCounter>() { // from class: com.p1.mobile.putong.core.data.AwardCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AwardCounter awardCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, awardCounter.awardCount) + CodedOutputByteBufferNano.m17226h(2, awardCounter.showCount);
            awardCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AwardCounter parse(nb5 nb5Var) throws IOException {
            AwardCounter awardCounter = new AwardCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    awardCounter.awardCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return awardCounter;
                    }
                    awardCounter.showCount = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AwardCounter awardCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, awardCounter.awardCount);
            codedOutputByteBufferNano.m17250G(2, awardCounter.showCount);
        }
    };
    public static JsonAdapter<AwardCounter> JSON_ADAPTER = new ObjectJsonAdapter<AwardCounter>() { // from class: com.p1.mobile.putong.core.data.AwardCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AwardCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AwardCounter newInstance() {
            return new AwardCounter();
        }

        public boolean parseField(AwardCounter awardCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showCount")) {
                awardCounter.showCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("awardCount")) {
                return false;
            }
            awardCounter.awardCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(AwardCounter awardCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showCount") || str.equals("awardCount")) {
                return true;
            }
            return super.parseFieldCheck(awardCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AwardCounter awardCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("awardCount", awardCounter.awardCount);
            jsonGenerator.writeNumberField("showCount", awardCounter.showCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwardCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwardCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwardCounter new_() {
        AwardCounter awardCounter = new AwardCounter();
        awardCounter.nullCheck();
        return awardCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AwardCounter mo223809clone() {
        AwardCounter awardCounter = new AwardCounter();
        awardCounter.awardCount = this.awardCount;
        awardCounter.showCount = this.showCount;
        return awardCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwardCounter)) {
            return false;
        }
        AwardCounter awardCounter = (AwardCounter) obj;
        return this.awardCount == awardCounter.awardCount && this.showCount == awardCounter.showCount;
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
        int i2 = (((i * 41) + this.awardCount) * 41) + this.showCount;
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
