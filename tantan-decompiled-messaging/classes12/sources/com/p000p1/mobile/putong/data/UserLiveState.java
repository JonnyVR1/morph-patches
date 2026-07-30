package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.tenum.TEnum;
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
public class UserLiveState extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userlivestate";

    @NonNull
    @ProtobufIndex(index = 3)
    public UserLiveCallInfo callInfo;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cityId;

    @Nullable
    @ProtobufIndex(index = 2)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 4)
    public UserLiveLabel liveLabel;

    @NonNull
    @ProtobufIndex(index = 7)
    public LiveMultiCallInfo multiCallInfo;

    @Nullable
    @ProtobufIndex(index = 1)
    public LiveState state;
    public static ProtobufAdapter<UserLiveState> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveState>() { // from class: com.p1.mobile.putong.data.UserLiveState.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserLiveState userLiveState) {
            LiveState liveState = userLiveState.state;
            int iH = liveState != null ? CodedOutputByteBufferNano.h(1, liveState.ordinal()) : 0;
            String str = userLiveState.liveId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            UserLiveCallInfo userLiveCallInfo = userLiveState.callInfo;
            if (userLiveCallInfo != null) {
                iH += CodedOutputByteBufferNano.l(3, userLiveCallInfo, UserLiveCallInfo.PROTOBUF_ADAPTER);
            }
            UserLiveLabel userLiveLabel = userLiveState.liveLabel;
            if (userLiveLabel != null) {
                iH += CodedOutputByteBufferNano.l(4, userLiveLabel, UserLiveLabel.PROTOBUF_ADAPTER);
            }
            String str2 = userLiveState.cityId;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(5, str2);
            }
            LiveState liveState2 = userLiveState.state;
            if (liveState2 != null) {
                iH += CodedOutputByteBufferNano.l(6, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
            LiveMultiCallInfo liveMultiCallInfo = userLiveState.multiCallInfo;
            if (liveMultiCallInfo != null) {
                iH += CodedOutputByteBufferNano.l(7, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) userLiveState).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserLiveState m19190parse(nb5 nb5Var) throws IOException {
            UserLiveState userLiveState = new UserLiveState();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userLiveState.state == null && numValueOf != null) {
                        userLiveState.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (userLiveState.callInfo == null) {
                        userLiveState.callInfo = UserLiveCallInfo.new_();
                    }
                    if (userLiveState.liveLabel == null) {
                        userLiveState.liveLabel = UserLiveLabel.new_();
                    }
                    if (userLiveState.cityId == null) {
                        userLiveState.cityId = "";
                    }
                    if (userLiveState.multiCallInfo != null) {
                        break;
                    }
                    userLiveState.multiCallInfo = LiveMultiCallInfo.new_();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    userLiveState.liveId = nb5Var.s();
                } else if (iU == 26) {
                    userLiveState.callInfo = (UserLiveCallInfo) nb5Var.l(UserLiveCallInfo.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    userLiveState.liveLabel = (UserLiveLabel) nb5Var.l(UserLiveLabel.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    userLiveState.cityId = nb5Var.s();
                } else if (iU == 50) {
                    userLiveState.state = (LiveState) nb5Var.l(LiveState.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 58) {
                        if (userLiveState.state == null && numValueOf != null) {
                            userLiveState.state = (LiveState) LiveState.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (userLiveState.callInfo == null) {
                            userLiveState.callInfo = UserLiveCallInfo.new_();
                        }
                        if (userLiveState.liveLabel == null) {
                            userLiveState.liveLabel = UserLiveLabel.new_();
                        }
                        if (userLiveState.cityId == null) {
                            userLiveState.cityId = "";
                        }
                        if (userLiveState.multiCallInfo != null) {
                            break;
                        }
                        userLiveState.multiCallInfo = LiveMultiCallInfo.new_();
                        return userLiveState;
                    }
                    userLiveState.multiCallInfo = (LiveMultiCallInfo) nb5Var.l(LiveMultiCallInfo.PROTOBUF_ADAPTER);
                }
            }
            return userLiveState;
        }

        public void serialize(UserLiveState userLiveState, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveState liveState = userLiveState.state;
            if (liveState != null) {
                codedOutputByteBufferNano.G(1, liveState.ordinal());
            }
            String str = userLiveState.liveId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            UserLiveCallInfo userLiveCallInfo = userLiveState.callInfo;
            if (userLiveCallInfo != null) {
                codedOutputByteBufferNano.K(3, userLiveCallInfo, UserLiveCallInfo.PROTOBUF_ADAPTER);
            }
            UserLiveLabel userLiveLabel = userLiveState.liveLabel;
            if (userLiveLabel != null) {
                codedOutputByteBufferNano.K(4, userLiveLabel, UserLiveLabel.PROTOBUF_ADAPTER);
            }
            String str2 = userLiveState.cityId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            LiveState liveState2 = userLiveState.state;
            if (liveState2 != null) {
                codedOutputByteBufferNano.K(6, liveState2, LiveState.PROTOBUF_ADAPTER);
            }
            LiveMultiCallInfo liveMultiCallInfo = userLiveState.multiCallInfo;
            if (liveMultiCallInfo != null) {
                codedOutputByteBufferNano.K(7, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<UserLiveState> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveState>() { // from class: com.p1.mobile.putong.data.UserLiveState.2
        public Class getDataClass() {
            return UserLiveState.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserLiveState mo17830newInstance() {
            return new UserLiveState();
        }

        public boolean parseField(UserLiveState userLiveState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cityId":
                    userLiveState.cityId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    userLiveState.liveId = jsonParser.getValueAsString();
                    return true;
                case "callInfo":
                    userLiveState.callInfo = (UserLiveCallInfo) UserLiveCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "state":
                    userLiveState.state = (LiveState) LiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "liveLabel":
                    userLiveState.liveLabel = (UserLiveLabel) UserLiveLabel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "multiCallInfo":
                    userLiveState.multiCallInfo = (LiveMultiCallInfo) LiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserLiveState userLiveState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cityId":
                case "liveId":
                case "callInfo":
                case "state":
                case "liveLabel":
                case "multiCallInfo":
                    return true;
                default:
                    return super.parseFieldCheck(userLiveState, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveState userLiveState, JsonGenerator jsonGenerator) throws IOException {
            if (userLiveState.state != null) {
                jsonGenerator.writeFieldName(Channel.state);
                LiveState.JSON_ADAPTER.serialize(userLiveState.state, jsonGenerator, true);
            }
            String str = userLiveState.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            if (userLiveState.callInfo != null) {
                jsonGenerator.writeFieldName("callInfo");
                UserLiveCallInfo.JSON_ADAPTER.serialize(userLiveState.callInfo, jsonGenerator, true);
            }
            if (userLiveState.liveLabel != null) {
                jsonGenerator.writeFieldName("liveLabel");
                UserLiveLabel.JSON_ADAPTER.serialize(userLiveState.liveLabel, jsonGenerator, true);
            }
            String str2 = userLiveState.cityId;
            if (str2 != null) {
                jsonGenerator.writeStringField("cityId", str2);
            }
            if (userLiveState.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                LiveMultiCallInfo.JSON_ADAPTER.serialize(userLiveState.multiCallInfo, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveState new_() {
        UserLiveState userLiveState = new UserLiveState();
        userLiveState.nullCheck();
        return userLiveState;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserLiveState m19189clone() {
        UserLiveState userLiveState = new UserLiveState();
        userLiveState.state = this.state;
        userLiveState.liveId = this.liveId;
        UserLiveCallInfo userLiveCallInfo = this.callInfo;
        if (userLiveCallInfo != null) {
            userLiveState.callInfo = userLiveCallInfo.m19180clone();
        }
        UserLiveLabel userLiveLabel = this.liveLabel;
        if (userLiveLabel != null) {
            userLiveState.liveLabel = userLiveLabel.m19183clone();
        }
        userLiveState.cityId = this.cityId;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        if (liveMultiCallInfo != null) {
            userLiveState.multiCallInfo = liveMultiCallInfo.m18351clone();
        }
        return userLiveState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLiveState)) {
            return false;
        }
        UserLiveState userLiveState = (UserLiveState) obj;
        return ValueObject.util_equals(this.state, userLiveState.state) && ValueObject.util_equals(this.liveId, userLiveState.liveId) && ValueObject.util_equals(this.callInfo, userLiveState.callInfo) && ValueObject.util_equals(this.liveLabel, userLiveState.liveLabel) && ValueObject.util_equals(this.cityId, userLiveState.cityId) && ValueObject.util_equals(this.multiCallInfo, userLiveState.multiCallInfo);
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
        LiveState liveState = this.state;
        int iHashCode = (i2 + (liveState != null ? liveState.hashCode() : 0)) * 41;
        String str = this.liveId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        UserLiveCallInfo userLiveCallInfo = this.callInfo;
        int iHashCode3 = (iHashCode2 + (userLiveCallInfo != null ? userLiveCallInfo.hashCode() : 0)) * 41;
        UserLiveLabel userLiveLabel = this.liveLabel;
        int iHashCode4 = (iHashCode3 + (userLiveLabel != null ? userLiveLabel.hashCode() : 0)) * 41;
        String str2 = this.cityId;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        int iHashCode6 = iHashCode5 + (liveMultiCallInfo != null ? liveMultiCallInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public boolean isLiveOpened() {
        return TEnum.equals(this.state, "onlive") || TEnum.equals(this.state, LiveState.suspended);
    }

    public void nullCheck() {
        if (this.callInfo == null) {
            this.callInfo = UserLiveCallInfo.new_();
        }
        if (this.liveLabel == null) {
            this.liveLabel = UserLiveLabel.new_();
        }
        if (this.cityId == null) {
            this.cityId = "";
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = LiveMultiCallInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
