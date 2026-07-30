package com.p000p1.mobile.putong.core.data;

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
public class AwardCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "awardcounter";

    @ProtobufIndex(index = 1)
    public int awardCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int showCount;
    public static ProtobufAdapter<AwardCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<AwardCounter>() { // from class: com.p1.mobile.putong.core.data.AwardCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AwardCounter awardCounter) {
            int iH = CodedOutputByteBufferNano.h(1, awardCounter.awardCount) + CodedOutputByteBufferNano.h(2, awardCounter.showCount);
            ((MessageNano) awardCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AwardCounter m11695parse(nb5 nb5Var) throws IOException {
            AwardCounter awardCounter = new AwardCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    awardCounter.awardCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return awardCounter;
                    }
                    awardCounter.showCount = nb5Var.j();
                }
            }
        }

        public void serialize(AwardCounter awardCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, awardCounter.awardCount);
            codedOutputByteBufferNano.G(2, awardCounter.showCount);
        }
    };
    public static JsonAdapter<AwardCounter> JSON_ADAPTER = new ObjectJsonAdapter<AwardCounter>() { // from class: com.p1.mobile.putong.core.data.AwardCounter.2
        public Class getDataClass() {
            return AwardCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AwardCounter m11696newInstance() {
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

        public void serializeFields(AwardCounter awardCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("awardCount", awardCounter.awardCount);
            jsonGenerator.writeNumberField("showCount", awardCounter.showCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AwardCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AwardCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AwardCounter new_() {
        AwardCounter awardCounter = new AwardCounter();
        awardCounter.nullCheck();
        return awardCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AwardCounter m11694clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.awardCount) * 41) + this.showCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
