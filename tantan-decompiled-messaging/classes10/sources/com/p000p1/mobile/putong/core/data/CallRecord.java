package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class CallRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "callrecord";

    @Nullable
    @ProtobufIndex(index = 1)
    public String callType;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String channelName;

    @Nullable
    @ProtobufIndex(index = 4)
    public String device;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long duration;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int status;
    public static ProtobufAdapter<CallRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<CallRecord>() { // from class: com.p1.mobile.putong.core.data.CallRecord.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CallRecord callRecord) {
            String str = callRecord.callType;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, callRecord.duration);
            String str2 = callRecord.channelName;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = callRecord.device;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, callRecord.status);
            ((MessageNano) callRecord).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CallRecord m11853parse(nb5 nb5Var) throws IOException {
            CallRecord callRecord = new CallRecord();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    callRecord.callType = nb5Var.s();
                } else if (iU == 16) {
                    callRecord.duration = nb5Var.k();
                } else if (iU == 26) {
                    callRecord.channelName = nb5Var.s();
                } else if (iU == 34) {
                    callRecord.device = nb5Var.s();
                } else {
                    if (iU != 40) {
                        return callRecord;
                    }
                    callRecord.status = nb5Var.j();
                }
            }
        }

        public void serialize(CallRecord callRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = callRecord.callType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, callRecord.duration);
            String str2 = callRecord.channelName;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = callRecord.device;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            codedOutputByteBufferNano.G(5, callRecord.status);
        }
    };
    public static JsonAdapter<CallRecord> JSON_ADAPTER = new ObjectJsonAdapter<CallRecord>() { // from class: com.p1.mobile.putong.core.data.CallRecord.2
        public Class getDataClass() {
            return CallRecord.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CallRecord m11854newInstance() {
            return new CallRecord();
        }

        public boolean parseField(CallRecord callRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    callRecord.duration = jsonParser.getValueAsLong();
                    return true;
                case "device":
                    callRecord.device = jsonParser.getValueAsString();
                    return true;
                case "status":
                    callRecord.status = jsonParser.getValueAsInt();
                    return true;
                case "callType":
                    callRecord.callType = jsonParser.getValueAsString();
                    return true;
                case "channelName":
                    callRecord.channelName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CallRecord callRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "device":
                case "status":
                case "callType":
                case "channelName":
                    return true;
                default:
                    return super.parseFieldCheck(callRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CallRecord callRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = callRecord.callType;
            if (str != null) {
                jsonGenerator.writeStringField("callType", str);
            }
            jsonGenerator.writeNumberField("duration", callRecord.duration);
            String str2 = callRecord.channelName;
            if (str2 != null) {
                jsonGenerator.writeStringField("channelName", str2);
            }
            String str3 = callRecord.device;
            if (str3 != null) {
                jsonGenerator.writeStringField("device", str3);
            }
            jsonGenerator.writeNumberField("status", callRecord.status);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CallRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CallRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CallRecord new_() {
        CallRecord callRecord = new CallRecord();
        callRecord.nullCheck();
        return callRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CallRecord m11852clone() {
        CallRecord callRecord = new CallRecord();
        callRecord.callType = this.callType;
        callRecord.duration = this.duration;
        callRecord.channelName = this.channelName;
        callRecord.device = this.device;
        callRecord.status = this.status;
        return callRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CallRecord)) {
            return false;
        }
        CallRecord callRecord = (CallRecord) obj;
        return ValueObject.util_equals(this.callType, callRecord.callType) && this.duration == callRecord.duration && ValueObject.util_equals(this.channelName, callRecord.channelName) && ValueObject.util_equals(this.device, callRecord.device) && this.status == callRecord.status;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.callType;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.duration;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.channelName;
        int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.device;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.status;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
