package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class FriendInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "friendinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double lastActivity;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public FriendSuggestInfo suggest;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<FriendInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FriendInfo>() { // from class: com.p1.mobile.putong.core.data.FriendInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FriendInfo friendInfo) {
            String str = friendInfo.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, friendInfo.lastActivity);
            FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
            if (friendSuggestInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, friendSuggestInfo, FriendSuggestInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) friendInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FriendInfo m12853parse(nb5 nb5Var) throws IOException {
            FriendInfo friendInfo = new FriendInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (friendInfo.userId == null) {
                        friendInfo.userId = "";
                    }
                    if (friendInfo.suggest != null) {
                        break;
                    }
                    friendInfo.suggest = FriendSuggestInfo.new_();
                    break;
                }
                if (iU == 10) {
                    friendInfo.userId = nb5Var.s();
                } else if (iU == 17) {
                    friendInfo.lastActivity = nb5Var.h();
                } else {
                    if (iU != 26) {
                        if (friendInfo.userId == null) {
                            friendInfo.userId = "";
                        }
                        if (friendInfo.suggest != null) {
                            break;
                        }
                        friendInfo.suggest = FriendSuggestInfo.new_();
                        return friendInfo;
                    }
                    friendInfo.suggest = (FriendSuggestInfo) nb5Var.l(FriendSuggestInfo.PROTOBUF_ADAPTER);
                }
            }
            return friendInfo;
        }

        public void serialize(FriendInfo friendInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = friendInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, friendInfo.lastActivity);
            FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
            if (friendSuggestInfo != null) {
                codedOutputByteBufferNano.K(3, friendSuggestInfo, FriendSuggestInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FriendInfo> JSON_ADAPTER = new ObjectJsonAdapter<FriendInfo>() { // from class: com.p1.mobile.putong.core.data.FriendInfo.2
        public Class getDataClass() {
            return FriendInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FriendInfo m12854newInstance() {
            return new FriendInfo();
        }

        public boolean parseField(FriendInfo friendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "suggest":
                    friendInfo.suggest = (FriendSuggestInfo) FriendSuggestInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    friendInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "lastActivity":
                    friendInfo.lastActivity = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FriendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FriendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FriendInfo new_() {
        FriendInfo friendInfo = new FriendInfo();
        friendInfo.nullCheck();
        return friendInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FriendInfo m12852clone() {
        FriendInfo friendInfo = new FriendInfo();
        friendInfo.userId = this.userId;
        friendInfo.lastActivity = this.lastActivity;
        FriendSuggestInfo friendSuggestInfo = this.suggest;
        if (friendSuggestInfo != null) {
            friendInfo.suggest = friendSuggestInfo.m12856clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.suggest == null) {
            this.suggest = FriendSuggestInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
