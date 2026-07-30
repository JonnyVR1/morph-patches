package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, friendInfo.lastActivity);
            FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
            if (friendSuggestInfo != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, friendSuggestInfo, FriendSuggestInfo.PROTOBUF_ADAPTER);
            }
            friendInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FriendInfo parse(nc5 nc5Var) throws IOException {
            FriendInfo friendInfo = new FriendInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (friendInfo.userId == null) {
                        friendInfo.userId = "";
                    }
                    if (friendInfo.suggest != null) {
                        break;
                    }
                    friendInfo.suggest = FriendSuggestInfo.new_();
                    break;
                }
                if (iM162497u == 10) {
                    friendInfo.userId = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    friendInfo.lastActivity = nc5Var.m162484h();
                } else {
                    if (iM162497u != 26) {
                        if (friendInfo.userId == null) {
                            friendInfo.userId = "";
                        }
                        if (friendInfo.suggest != null) {
                            break;
                        }
                        friendInfo.suggest = FriendSuggestInfo.new_();
                        return friendInfo;
                    }
                    friendInfo.suggest = (FriendSuggestInfo) nc5Var.m162488l(FriendSuggestInfo.PROTOBUF_ADAPTER);
                }
            }
            return friendInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FriendInfo friendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, friendInfo.lastActivity);
            FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
            if (friendSuggestInfo != null) {
                codedOutputByteBufferNano.m17309K(3, friendSuggestInfo, FriendSuggestInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FriendInfo> JSON_ADAPTER = new ObjectJsonAdapter<FriendInfo>() { // from class: com.p1.mobile.putong.core.data.FriendInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FriendInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public FriendInfo mo225055clone() {
        FriendInfo friendInfo = new FriendInfo();
        friendInfo.userId = this.userId;
        friendInfo.lastActivity = this.lastActivity;
        FriendSuggestInfo friendSuggestInfo = this.suggest;
        if (friendSuggestInfo != null) {
            friendInfo.suggest = friendSuggestInfo.mo225055clone();
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
