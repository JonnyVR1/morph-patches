package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class CallRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "callrecord";

    @Nullable
    @ProtobufIndex(index = 1)
    public String callType;

    @Nullable
    @ProtobufIndex(index = 3)
    public String channelName;

    @Nullable
    @ProtobufIndex(index = 4)
    public String device;

    @ProtobufIndex(index = 2)
    public long duration;

    @ProtobufIndex(index = 5)
    public int status;
    public static ProtobufAdapter<CallRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<CallRecord>() { // from class: com.p1.mobile.putong.core.data.CallRecord.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CallRecord callRecord) {
            String str = callRecord.callType;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, callRecord.duration);
            String str2 = callRecord.channelName;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = callRecord.device;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, callRecord.status);
            callRecord.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CallRecord parse(nb5 nb5Var) throws IOException {
            CallRecord callRecord = new CallRecord();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    callRecord.callType = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    callRecord.duration = nb5Var.m158742k();
                } else if (iM158752u == 26) {
                    callRecord.channelName = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    callRecord.device = nb5Var.m158750s();
                } else {
                    if (iM158752u != 40) {
                        return callRecord;
                    }
                    callRecord.status = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CallRecord callRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = callRecord.callType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, callRecord.duration);
            String str2 = callRecord.channelName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = callRecord.device;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17250G(5, callRecord.status);
        }
    };
    public static JsonAdapter<CallRecord> JSON_ADAPTER = new ObjectJsonAdapter<CallRecord>() { // from class: com.p1.mobile.putong.core.data.CallRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CallRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CallRecord newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CallRecord callRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = callRecord.callType;
            if (str != null) {
                jsonGenerator.writeStringField("callType", str);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, callRecord.duration);
            String str2 = callRecord.channelName;
            if (str2 != null) {
                jsonGenerator.writeStringField("channelName", str2);
            }
            String str3 = callRecord.device;
            if (str3 != null) {
                jsonGenerator.writeStringField(Device.TYPE, str3);
            }
            jsonGenerator.writeNumberField(NotificationCompat.CATEGORY_STATUS, callRecord.status);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CallRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CallRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CallRecord new_() {
        CallRecord callRecord = new CallRecord();
        callRecord.nullCheck();
        return callRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CallRecord mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
