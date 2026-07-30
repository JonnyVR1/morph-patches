package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
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
public class VoiceCall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicecall";

    @NonNull
    @ProtobufIndex(index = 3)
    public String callee;

    @NonNull
    @ProtobufIndex(index = 5)
    public String calleeToken;

    @NonNull
    @ProtobufIndex(index = 2)
    public String caller;

    @NonNull
    @ProtobufIndex(index = 4)
    public String callerToken;

    @NonNull
    @ProtobufIndex(index = 6)
    public String channelName;

    @ProtobufIndex(index = 7)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public VoiceCallStatus status;
    public static ProtobufAdapter<VoiceCall> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceCall>() { // from class: com.p1.mobile.putong.core.data.VoiceCall.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceCall voiceCall) {
            VoiceCallStatus voiceCallStatus = voiceCall.status;
            int iM17226h = voiceCallStatus != null ? CodedOutputByteBufferNano.m17226h(1, voiceCallStatus.ordinal()) : 0;
            String str = voiceCall.caller;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = voiceCall.callee;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = voiceCall.callerToken;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = voiceCall.calleeToken;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = voiceCall.channelName;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            int iM17222d = iM17226h + CodedOutputByteBufferNano.m17222d(7, voiceCall.createdTime);
            VoiceCallStatus voiceCallStatus2 = voiceCall.status;
            if (voiceCallStatus2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(8, voiceCallStatus2, VoiceCallStatus.PROTOBUF_ADAPTER);
            }
            voiceCall.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceCall parse(nb5 nb5Var) throws IOException {
            VoiceCall voiceCall = new VoiceCall();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceCall.status == null && numValueOf != null) {
                        voiceCall.status = (VoiceCallStatus) VoiceCallStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (voiceCall.status == null) {
                        voiceCall.status = (VoiceCallStatus) VoiceCallStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (voiceCall.caller == null) {
                        voiceCall.caller = "";
                    }
                    if (voiceCall.callee == null) {
                        voiceCall.callee = "";
                    }
                    if (voiceCall.callerToken == null) {
                        voiceCall.callerToken = "";
                    }
                    if (voiceCall.calleeToken == null) {
                        voiceCall.calleeToken = "";
                    }
                    if (voiceCall.channelName != null) {
                        break;
                    }
                    voiceCall.channelName = "";
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    voiceCall.caller = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    voiceCall.callee = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    voiceCall.callerToken = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    voiceCall.calleeToken = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    voiceCall.channelName = nb5Var.m158750s();
                } else if (iM158752u == 57) {
                    voiceCall.createdTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 66) {
                        if (voiceCall.status == null && numValueOf != null) {
                            voiceCall.status = (VoiceCallStatus) VoiceCallStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (voiceCall.status == null) {
                            voiceCall.status = (VoiceCallStatus) VoiceCallStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (voiceCall.caller == null) {
                            voiceCall.caller = "";
                        }
                        if (voiceCall.callee == null) {
                            voiceCall.callee = "";
                        }
                        if (voiceCall.callerToken == null) {
                            voiceCall.callerToken = "";
                        }
                        if (voiceCall.calleeToken == null) {
                            voiceCall.calleeToken = "";
                        }
                        if (voiceCall.channelName != null) {
                            break;
                        }
                        voiceCall.channelName = "";
                        return voiceCall;
                    }
                    voiceCall.status = (VoiceCallStatus) nb5Var.m158743l(VoiceCallStatus.PROTOBUF_ADAPTER);
                }
            }
            return voiceCall;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceCall voiceCall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            VoiceCallStatus voiceCallStatus = voiceCall.status;
            if (voiceCallStatus != null) {
                codedOutputByteBufferNano.m17250G(1, voiceCallStatus.ordinal());
            }
            String str = voiceCall.caller;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = voiceCall.callee;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = voiceCall.callerToken;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = voiceCall.calleeToken;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = voiceCall.channelName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            codedOutputByteBufferNano.m17246C(7, voiceCall.createdTime);
            VoiceCallStatus voiceCallStatus2 = voiceCall.status;
            if (voiceCallStatus2 != null) {
                codedOutputByteBufferNano.m17254K(8, voiceCallStatus2, VoiceCallStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VoiceCall> JSON_ADAPTER = new ObjectJsonAdapter<VoiceCall>() { // from class: com.p1.mobile.putong.core.data.VoiceCall.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceCall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceCall newInstance() {
            return new VoiceCall();
        }

        public boolean parseField(VoiceCall voiceCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "callee":
                    voiceCall.callee = jsonParser.getValueAsString();
                    return true;
                case "caller":
                    voiceCall.caller = jsonParser.getValueAsString();
                    return true;
                case "status":
                    voiceCall.status = VoiceCallStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "createdTime":
                    voiceCall.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "channelName":
                    voiceCall.channelName = jsonParser.getValueAsString();
                    return true;
                case "calleeToken":
                    voiceCall.calleeToken = jsonParser.getValueAsString();
                    return true;
                case "callerToken":
                    voiceCall.callerToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceCall voiceCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "callee":
                case "caller":
                case "status":
                case "createdTime":
                case "channelName":
                case "calleeToken":
                case "callerToken":
                    return true;
                default:
                    return super.parseFieldCheck(voiceCall, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceCall voiceCall, JsonGenerator jsonGenerator) throws IOException {
            if (voiceCall.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                VoiceCallStatus.JSON_ADAPTER.serialize(voiceCall.status, jsonGenerator, true);
            }
            String str = voiceCall.caller;
            if (str != null) {
                jsonGenerator.writeStringField(BLiveRole.caller, str);
            }
            String str2 = voiceCall.callee;
            if (str2 != null) {
                jsonGenerator.writeStringField("callee", str2);
            }
            String str3 = voiceCall.callerToken;
            if (str3 != null) {
                jsonGenerator.writeStringField("callerToken", str3);
            }
            String str4 = voiceCall.calleeToken;
            if (str4 != null) {
                jsonGenerator.writeStringField("calleeToken", str4);
            }
            String str5 = voiceCall.channelName;
            if (str5 != null) {
                jsonGenerator.writeStringField("channelName", str5);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(voiceCall.createdTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceCall new_() {
        VoiceCall voiceCall = new VoiceCall();
        voiceCall.nullCheck();
        return voiceCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceCall mo223809clone() {
        VoiceCall voiceCall = new VoiceCall();
        voiceCall.status = this.status;
        voiceCall.caller = this.caller;
        voiceCall.callee = this.callee;
        voiceCall.callerToken = this.callerToken;
        voiceCall.calleeToken = this.calleeToken;
        voiceCall.channelName = this.channelName;
        voiceCall.createdTime = this.createdTime;
        return voiceCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceCall)) {
            return false;
        }
        VoiceCall voiceCall = (VoiceCall) obj;
        return ValueObject.util_equals(this.status, voiceCall.status) && ValueObject.util_equals(this.caller, voiceCall.caller) && ValueObject.util_equals(this.callee, voiceCall.callee) && ValueObject.util_equals(this.callerToken, voiceCall.callerToken) && ValueObject.util_equals(this.calleeToken, voiceCall.calleeToken) && ValueObject.util_equals(this.channelName, voiceCall.channelName) && this.createdTime == voiceCall.createdTime;
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
        VoiceCallStatus voiceCallStatus = this.status;
        int iHashCode = (i2 + (voiceCallStatus != null ? voiceCallStatus.hashCode() : 0)) * 41;
        String str = this.caller;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.callee;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.callerToken;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.calleeToken;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.channelName;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (VoiceCallStatus) VoiceCallStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.caller == null) {
            this.caller = "";
        }
        if (this.callee == null) {
            this.callee = "";
        }
        if (this.callerToken == null) {
            this.callerToken = "";
        }
        if (this.calleeToken == null) {
            this.calleeToken = "";
        }
        if (this.channelName == null) {
            this.channelName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
