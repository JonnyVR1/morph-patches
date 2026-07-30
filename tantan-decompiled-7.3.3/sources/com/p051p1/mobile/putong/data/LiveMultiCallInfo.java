package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class LiveMultiCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livemulticallinfo";

    @ProtobufIndex(index = 2)
    public boolean onGoing;

    @NonNull
    @ProtobufIndex(index = 1)
    public String onGoingMultiCallId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String onGoingMultiCallOwnerRoomId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String onGoingMultiCallRole;

    @NonNull
    @ProtobufIndex(index = 3)
    public String role;
    public static ProtobufAdapter<LiveMultiCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveMultiCallInfo>() { // from class: com.p1.mobile.putong.data.LiveMultiCallInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveMultiCallInfo liveMultiCallInfo) {
            String str = liveMultiCallInfo.onGoingMultiCallId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.role;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = liveMultiCallInfo.onGoingMultiCallOwnerRoomId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = liveMultiCallInfo.onGoingMultiCallRole;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            liveMultiCallInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveMultiCallInfo parse(nc5 nc5Var) throws IOException {
            LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveMultiCallInfo.onGoingMultiCallId == null) {
                        liveMultiCallInfo.onGoingMultiCallId = "";
                    }
                    if (liveMultiCallInfo.role == null) {
                        liveMultiCallInfo.role = "";
                    }
                    if (liveMultiCallInfo.onGoingMultiCallOwnerRoomId == null) {
                        liveMultiCallInfo.onGoingMultiCallOwnerRoomId = "";
                    }
                    if (liveMultiCallInfo.onGoingMultiCallRole != null) {
                        break;
                    }
                    liveMultiCallInfo.onGoingMultiCallRole = "";
                    break;
                }
                if (iM162497u == 10) {
                    liveMultiCallInfo.onGoingMultiCallId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    liveMultiCallInfo.onGoing = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    liveMultiCallInfo.role = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    liveMultiCallInfo.onGoingMultiCallOwnerRoomId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (liveMultiCallInfo.onGoingMultiCallId == null) {
                            liveMultiCallInfo.onGoingMultiCallId = "";
                        }
                        if (liveMultiCallInfo.role == null) {
                            liveMultiCallInfo.role = "";
                        }
                        if (liveMultiCallInfo.onGoingMultiCallOwnerRoomId == null) {
                            liveMultiCallInfo.onGoingMultiCallOwnerRoomId = "";
                        }
                        if (liveMultiCallInfo.onGoingMultiCallRole != null) {
                            break;
                        }
                        liveMultiCallInfo.onGoingMultiCallRole = "";
                        return liveMultiCallInfo;
                    }
                    liveMultiCallInfo.onGoingMultiCallRole = nc5Var.m162495s();
                }
            }
            return liveMultiCallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveMultiCallInfo liveMultiCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMultiCallInfo.onGoingMultiCallId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.role;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = liveMultiCallInfo.onGoingMultiCallOwnerRoomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = liveMultiCallInfo.onGoingMultiCallRole;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
        }
    };
    public static JsonAdapter<LiveMultiCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveMultiCallInfo>() { // from class: com.p1.mobile.putong.data.LiveMultiCallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveMultiCallInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveMultiCallInfo newInstance() {
            return new LiveMultiCallInfo();
        }

        public boolean parseField(LiveMultiCallInfo liveMultiCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "onGoing":
                    liveMultiCallInfo.onGoing = jsonParser.getValueAsBoolean();
                    return true;
                case "onGoingMultiCallOwnerRoomId":
                    liveMultiCallInfo.onGoingMultiCallOwnerRoomId = jsonParser.getValueAsString();
                    return true;
                case "onGoingMultiCallId":
                    liveMultiCallInfo.onGoingMultiCallId = jsonParser.getValueAsString();
                    return true;
                case "onGoingMultiCallRole":
                    liveMultiCallInfo.onGoingMultiCallRole = jsonParser.getValueAsString();
                    return true;
                case "role":
                    liveMultiCallInfo.role = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveMultiCallInfo liveMultiCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "onGoing":
                case "onGoingMultiCallOwnerRoomId":
                case "onGoingMultiCallId":
                case "onGoingMultiCallRole":
                case "role":
                    return true;
                default:
                    return super.parseFieldCheck(liveMultiCallInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMultiCallInfo liveMultiCallInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMultiCallInfo.onGoingMultiCallId;
            if (str != null) {
                jsonGenerator.writeStringField("onGoingMultiCallId", str);
            }
            jsonGenerator.writeBooleanField("onGoing", liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.role;
            if (str2 != null) {
                jsonGenerator.writeStringField("role", str2);
            }
            String str3 = liveMultiCallInfo.onGoingMultiCallOwnerRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("onGoingMultiCallOwnerRoomId", str3);
            }
            String str4 = liveMultiCallInfo.onGoingMultiCallRole;
            if (str4 != null) {
                jsonGenerator.writeStringField("onGoingMultiCallRole", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveMultiCallInfo new_() {
        LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
        liveMultiCallInfo.nullCheck();
        return liveMultiCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveMultiCallInfo mo225055clone() {
        LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
        liveMultiCallInfo.onGoingMultiCallId = this.onGoingMultiCallId;
        liveMultiCallInfo.onGoing = this.onGoing;
        liveMultiCallInfo.role = this.role;
        liveMultiCallInfo.onGoingMultiCallOwnerRoomId = this.onGoingMultiCallOwnerRoomId;
        liveMultiCallInfo.onGoingMultiCallRole = this.onGoingMultiCallRole;
        return liveMultiCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveMultiCallInfo)) {
            return false;
        }
        LiveMultiCallInfo liveMultiCallInfo = (LiveMultiCallInfo) obj;
        return ValueObject.util_equals(this.onGoingMultiCallId, liveMultiCallInfo.onGoingMultiCallId) && this.onGoing == liveMultiCallInfo.onGoing && ValueObject.util_equals(this.role, liveMultiCallInfo.role) && ValueObject.util_equals(this.onGoingMultiCallOwnerRoomId, liveMultiCallInfo.onGoingMultiCallOwnerRoomId) && ValueObject.util_equals(this.onGoingMultiCallRole, liveMultiCallInfo.onGoingMultiCallRole);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "livemulticallinfo";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.onGoingMultiCallId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.onGoing ? 1231 : 1237)) * 41;
        String str2 = this.role;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.onGoingMultiCallOwnerRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.onGoingMultiCallRole;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.onGoingMultiCallId == null) {
            this.onGoingMultiCallId = "";
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.onGoingMultiCallOwnerRoomId == null) {
            this.onGoingMultiCallOwnerRoomId = "";
        }
        if (this.onGoingMultiCallRole == null) {
            this.onGoingMultiCallRole = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
