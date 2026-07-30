package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class FriendInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendinfo";

    @ProtobufIndex(index = 2)
    public double lastActivity;

    @NonNull
    @ProtobufIndex(index = 3)
    public FriendSuggestInfo suggest;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<FriendInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendInfo>() { // from class: com.p1.mobile.putong.core.data.FriendInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FriendInfo friendInfo) {
            String str = friendInfo.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17222d(2, friendInfo.lastActivity);
            FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
            if (friendSuggestInfo != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, friendSuggestInfo, FriendSuggestInfo.PROTOBUF_ADAPTER);
            }
            friendInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendInfo parse(nb5 nb5Var) throws IOException {
            FriendInfo friendInfo = new FriendInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (friendInfo.userId == null) {
                        friendInfo.userId = "";
                    }
                    if (friendInfo.suggest != null) {
                        break;
                    }
                    friendInfo.suggest = FriendSuggestInfo.new_();
                    break;
                }
                if (iM158752u == 10) {
                    friendInfo.userId = nb5Var.m158750s();
                } else if (iM158752u == 17) {
                    friendInfo.lastActivity = nb5Var.m158739h();
                } else {
                    if (iM158752u != 26) {
                        if (friendInfo.userId == null) {
                            friendInfo.userId = "";
                        }
                        if (friendInfo.suggest != null) {
                            break;
                        }
                        friendInfo.suggest = FriendSuggestInfo.new_();
                        return friendInfo;
                    }
                    friendInfo.suggest = (FriendSuggestInfo) nb5Var.m158743l(FriendSuggestInfo.PROTOBUF_ADAPTER);
                }
            }
            return friendInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendInfo friendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17246C(2, friendInfo.lastActivity);
            FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
            if (friendSuggestInfo != null) {
                codedOutputByteBufferNano.m17254K(3, friendSuggestInfo, FriendSuggestInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FriendInfo> JSON_ADAPTER = new ObjectJsonAdapter<FriendInfo>() { // from class: com.p1.mobile.putong.core.data.FriendInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FriendInfo newInstance() {
            return new FriendInfo();
        }

        public boolean parseField(FriendInfo friendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "suggest":
                    friendInfo.suggest = FriendSuggestInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    friendInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "lastActivity":
                    friendInfo.lastActivity = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FriendInfo friendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "suggest":
                case "userId":
                case "lastActivity":
                    return true;
                default:
                    return super.parseFieldCheck(friendInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FriendInfo friendInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = friendInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeFieldName("lastActivity");
            Converter.API_TIME.serialize(Double.valueOf(friendInfo.lastActivity), jsonGenerator, true);
            if (friendInfo.suggest != null) {
                jsonGenerator.writeFieldName("suggest");
                FriendSuggestInfo.JSON_ADAPTER.serialize(friendInfo.suggest, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendInfo new_() {
        FriendInfo friendInfo = new FriendInfo();
        friendInfo.nullCheck();
        return friendInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FriendInfo mo223809clone() {
        FriendInfo friendInfo = new FriendInfo();
        friendInfo.userId = this.userId;
        friendInfo.lastActivity = this.lastActivity;
        FriendSuggestInfo friendSuggestInfo = this.suggest;
        if (friendSuggestInfo != null) {
            friendInfo.suggest = friendSuggestInfo.mo223809clone();
        }
        return friendInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendInfo)) {
            return false;
        }
        FriendInfo friendInfo = (FriendInfo) obj;
        return ValueObject.util_equals(this.userId, friendInfo.userId) && this.lastActivity == friendInfo.lastActivity && ValueObject.util_equals(this.suggest, friendInfo.suggest);
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
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.lastActivity);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        FriendSuggestInfo friendSuggestInfo = this.suggest;
        int iHashCode2 = i3 + (friendSuggestInfo != null ? friendSuggestInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.suggest == null) {
            this.suggest = FriendSuggestInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
