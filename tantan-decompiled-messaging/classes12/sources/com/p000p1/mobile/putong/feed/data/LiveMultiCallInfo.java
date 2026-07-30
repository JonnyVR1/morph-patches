package com.p000p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveMultiCallInfo liveMultiCallInfo) {
            String str = liveMultiCallInfo.role;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.ownerRoomId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) liveMultiCallInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveMultiCallInfo m19560parse(nb5 nb5Var) throws IOException {
            LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveMultiCallInfo.role == null) {
                        liveMultiCallInfo.role = "";
                    }
                    if (liveMultiCallInfo.ownerRoomId != null) {
                        break;
                    }
                    liveMultiCallInfo.ownerRoomId = "";
                    break;
                }
                if (iU == 10) {
                    liveMultiCallInfo.role = nb5Var.s();
                } else if (iU == 16) {
                    liveMultiCallInfo.onGoing = nb5Var.g();
                } else {
                    if (iU != 26) {
                        if (liveMultiCallInfo.role == null) {
                            liveMultiCallInfo.role = "";
                        }
                        if (liveMultiCallInfo.ownerRoomId != null) {
                            break;
                        }
                        liveMultiCallInfo.ownerRoomId = "";
                        return liveMultiCallInfo;
                    }
                    liveMultiCallInfo.ownerRoomId = nb5Var.s();
                }
            }
            return liveMultiCallInfo;
        }

        public void serialize(LiveMultiCallInfo liveMultiCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMultiCallInfo.role;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, liveMultiCallInfo.onGoing);
            String str2 = liveMultiCallInfo.ownerRoomId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<LiveMultiCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveMultiCallInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveMultiCallInfo.2
        public Class getDataClass() {
            return LiveMultiCallInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveMultiCallInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveMultiCallInfo new_() {
        LiveMultiCallInfo liveMultiCallInfo = new LiveMultiCallInfo();
        liveMultiCallInfo.nullCheck();
        return liveMultiCallInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveMultiCallInfo m19559clone() {
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

    public String getClassParseName() {
        return "livemulticallinfo";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.role;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.onGoing ? 1231 : 1237)) * 41;
        String str2 = this.ownerRoomId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isSameContent(LiveMultiCallInfo liveMultiCallInfo) {
        return this.onGoing == liveMultiCallInfo.onGoing && TextUtils.equals(this.role, liveMultiCallInfo.role);
    }

    public void nullCheck() {
        if (this.role == null) {
            this.role = "";
        }
        if (this.ownerRoomId == null) {
            this.ownerRoomId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public String toString() {
        return "LiveMultiCallInfo{role='" + this.role + "', onGoing=" + this.onGoing + '}';
    }
}
