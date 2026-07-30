package com.p046p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class LiveMultiCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livemulticallinfo";

    @ProtobufIndex(index = 2)
    public boolean onGoing;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ownerRoomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String role;
    public static ProtobufAdapter<LiveMultiCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveMultiCallInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveMultiCallInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveMultiCallInfo liveMultiCallInfo) {
            String str = liveMultiCallInfo.role;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.ownerRoomId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            liveMultiCallInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveMultiCallInfo parse(nb5 nb5Var) throws IOException {
            LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveMultiCallInfo.role == null) {
                        liveMultiCallInfo.role = "";
                    }
                    if (liveMultiCallInfo.ownerRoomId != null) {
                        break;
                    }
                    liveMultiCallInfo.ownerRoomId = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveMultiCallInfo.role = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    liveMultiCallInfo.onGoing = nb5Var.m158738g();
                } else {
                    if (iM158752u != 26) {
                        if (liveMultiCallInfo.role == null) {
                            liveMultiCallInfo.role = "";
                        }
                        if (liveMultiCallInfo.ownerRoomId != null) {
                            break;
                        }
                        liveMultiCallInfo.ownerRoomId = "";
                        return liveMultiCallInfo;
                    }
                    liveMultiCallInfo.ownerRoomId = nb5Var.m158750s();
                }
            }
            return liveMultiCallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveMultiCallInfo liveMultiCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMultiCallInfo.role;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.ownerRoomId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<LiveMultiCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveMultiCallInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveMultiCallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveMultiCallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveMultiCallInfo newInstance() {
            return new LiveMultiCallInfo();
        }

        public boolean parseField(LiveMultiCallInfo liveMultiCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "onGoing":
                    liveMultiCallInfo.onGoing = jsonParser.getValueAsBoolean();
                    return true;
                case "ownerRoomId":
                    liveMultiCallInfo.ownerRoomId = jsonParser.getValueAsString();
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
                case "ownerRoomId":
                case "role":
                    return true;
                default:
                    return super.parseFieldCheck(liveMultiCallInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMultiCallInfo liveMultiCallInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMultiCallInfo.role;
            if (str != null) {
                jsonGenerator.writeStringField("role", str);
            }
            jsonGenerator.writeBooleanField("onGoing", liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.ownerRoomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("ownerRoomId", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public LiveMultiCallInfo mo223809clone() {
        LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
        liveMultiCallInfo.role = this.role;
        liveMultiCallInfo.onGoing = this.onGoing;
        liveMultiCallInfo.ownerRoomId = this.ownerRoomId;
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
        return ValueObject.util_equals(this.role, liveMultiCallInfo.role) && this.onGoing == liveMultiCallInfo.onGoing && ValueObject.util_equals(this.ownerRoomId, liveMultiCallInfo.ownerRoomId);
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
        String str = this.role;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.onGoing ? 1231 : 1237)) * 41;
        String str2 = this.ownerRoomId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isSameContent(LiveMultiCallInfo liveMultiCallInfo) {
        return this.onGoing == liveMultiCallInfo.onGoing && TextUtils.equals(this.role, liveMultiCallInfo.role);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.role == null) {
            this.role = "";
        }
        if (this.ownerRoomId == null) {
            this.ownerRoomId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    @Override // com.google.protobuf.nano.MessageNano
    public String toString() {
        return "LiveMultiCallInfo{role='" + this.role + "', onGoing=" + this.onGoing + '}';
    }
}
