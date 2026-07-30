package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class CoreFeedStateCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corefeedstatecounter";

    @ProtobufIndex(index = 3)
    public boolean haveMatchedState;

    @ProtobufIndex(index = 2)
    public double latestStateCreatedTime;

    @ProtobufIndex(index = 1)
    public int unread;
    public static ProtobufAdapter<CoreFeedStateCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreFeedStateCounter>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreFeedStateCounter coreFeedStateCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, coreFeedStateCounter.unread) + CodedOutputByteBufferNano.m17222d(2, coreFeedStateCounter.latestStateCreatedTime) + CodedOutputByteBufferNano.m17220b(3, coreFeedStateCounter.haveMatchedState);
            coreFeedStateCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreFeedStateCounter parse(nb5 nb5Var) throws IOException {
            CoreFeedStateCounter coreFeedStateCounter = new CoreFeedStateCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    coreFeedStateCounter.unread = nb5Var.m158741j();
                } else if (iM158752u == 17) {
                    coreFeedStateCounter.latestStateCreatedTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 24) {
                        return coreFeedStateCounter;
                    }
                    coreFeedStateCounter.haveMatchedState = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreFeedStateCounter coreFeedStateCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, coreFeedStateCounter.unread);
            codedOutputByteBufferNano.m17246C(2, coreFeedStateCounter.latestStateCreatedTime);
            codedOutputByteBufferNano.m17244A(3, coreFeedStateCounter.haveMatchedState);
        }
    };
    public static JsonAdapter<CoreFeedStateCounter> JSON_ADAPTER = new ObjectJsonAdapter<CoreFeedStateCounter>() { // from class: com.p1.mobile.putong.core.data.CoreFeedStateCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreFeedStateCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreFeedStateCounter newInstance() {
            return new CoreFeedStateCounter();
        }

        public boolean parseField(CoreFeedStateCounter coreFeedStateCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unread":
                    coreFeedStateCounter.unread = jsonParser.getValueAsInt();
                    return true;
                case "latestStateCreatedTime":
                    coreFeedStateCounter.latestStateCreatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreFeedStateCounter coreFeedStateCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, coreFeedStateCounter.unread);
            jsonGenerator.writeFieldName("latestStateCreatedTime");
            Converter.API_TIME.serialize(Double.valueOf(coreFeedStateCounter.latestStateCreatedTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("haveMatchedState", coreFeedStateCounter.haveMatchedState);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreFeedStateCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreFeedStateCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreFeedStateCounter new_() {
        CoreFeedStateCounter coreFeedStateCounter = new CoreFeedStateCounter();
        coreFeedStateCounter.nullCheck();
        return coreFeedStateCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreFeedStateCounter mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.unread;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestStateCreatedTime);
        int i3 = (((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.haveMatchedState ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
