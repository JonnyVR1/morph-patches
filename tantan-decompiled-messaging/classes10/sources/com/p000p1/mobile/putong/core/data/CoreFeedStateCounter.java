package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class CoreFeedStateCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corefeedstatecounter";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean haveMatchedState;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double latestStateCreatedTime;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CoreFeedStateCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreFeedStateCounter>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreFeedStateCounter coreFeedStateCounter) {
            int iH = CodedOutputByteBufferNano.h(1, coreFeedStateCounter.unread) + CodedOutputByteBufferNano.d(2, coreFeedStateCounter.latestStateCreatedTime) + CodedOutputByteBufferNano.b(3, coreFeedStateCounter.haveMatchedState);
            ((MessageNano) coreFeedStateCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreFeedStateCounter m12469parse(nb5 nb5Var) throws IOException {
            CoreFeedStateCounter coreFeedStateCounter = new CoreFeedStateCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    coreFeedStateCounter.unread = nb5Var.j();
                } else if (iU == 17) {
                    coreFeedStateCounter.latestStateCreatedTime = nb5Var.h();
                } else {
                    if (iU != 24) {
                        return coreFeedStateCounter;
                    }
                    coreFeedStateCounter.haveMatchedState = nb5Var.g();
                }
            }
        }

        public void serialize(CoreFeedStateCounter coreFeedStateCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, coreFeedStateCounter.unread);
            codedOutputByteBufferNano.C(2, coreFeedStateCounter.latestStateCreatedTime);
            codedOutputByteBufferNano.A(3, coreFeedStateCounter.haveMatchedState);
        }
    };
    public static JsonAdapter<CoreFeedStateCounter> JSON_ADAPTER = new ObjectJsonAdapter<CoreFeedStateCounter>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateCounter.2
        public Class getDataClass() {
            return CoreFeedStateCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreFeedStateCounter m12470newInstance() {
            return new CoreFeedStateCounter();
        }

        public boolean parseField(CoreFeedStateCounter coreFeedStateCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unread":
                    coreFeedStateCounter.unread = jsonParser.getValueAsInt();
                    return true;
                case "latestStateCreatedTime":
                    coreFeedStateCounter.latestStateCreatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "haveMatchedState":
                    coreFeedStateCounter.haveMatchedState = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreFeedStateCounter coreFeedStateCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unread":
                case "latestStateCreatedTime":
                case "haveMatchedState":
                    return true;
                default:
                    return super.parseFieldCheck(coreFeedStateCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CoreFeedStateCounter coreFeedStateCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, coreFeedStateCounter.unread);
            jsonGenerator.writeFieldName("latestStateCreatedTime");
            Converter.API_TIME.serialize(Double.valueOf(coreFeedStateCounter.latestStateCreatedTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("haveMatchedState", coreFeedStateCounter.haveMatchedState);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreFeedStateCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreFeedStateCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreFeedStateCounter new_() {
        CoreFeedStateCounter coreFeedStateCounter = new CoreFeedStateCounter();
        coreFeedStateCounter.nullCheck();
        return coreFeedStateCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreFeedStateCounter m12468clone() {
        CoreFeedStateCounter coreFeedStateCounter = new CoreFeedStateCounter();
        coreFeedStateCounter.unread = this.unread;
        coreFeedStateCounter.latestStateCreatedTime = this.latestStateCreatedTime;
        coreFeedStateCounter.haveMatchedState = this.haveMatchedState;
        return coreFeedStateCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreFeedStateCounter)) {
            return false;
        }
        CoreFeedStateCounter coreFeedStateCounter = (CoreFeedStateCounter) obj;
        return this.unread == coreFeedStateCounter.unread && this.latestStateCreatedTime == coreFeedStateCounter.latestStateCreatedTime && this.haveMatchedState == coreFeedStateCounter.haveMatchedState;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestStateCreatedTime);
        int i3 = (((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.haveMatchedState ? 1231 : 1237);
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
