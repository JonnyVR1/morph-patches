package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.User;
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
public class SpotLightUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightusers";

    @NonNull
    @ProtobufIndex(index = 1)
    public SpotLightLiveInfo liveInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public SpotLightSeeInfo seeInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public User userInfo;
    public static ProtobufAdapter<SpotLightUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightUsers>() { // from class: com.p1.mobile.putong.core.data.SpotLightUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpotLightUsers spotLightUsers) {
            SpotLightLiveInfo spotLightLiveInfo = spotLightUsers.liveInfo;
            int iM17230l = spotLightLiveInfo != null ? CodedOutputByteBufferNano.m17230l(1, spotLightLiveInfo, SpotLightLiveInfo.PROTOBUF_ADAPTER) : 0;
            User user = spotLightUsers.userInfo;
            if (user != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, user, User.PROTOBUF_ADAPTER);
            }
            SpotLightSeeInfo spotLightSeeInfo = spotLightUsers.seeInfo;
            if (spotLightSeeInfo != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, spotLightSeeInfo, SpotLightSeeInfo.PROTOBUF_ADAPTER);
            }
            spotLightUsers.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpotLightUsers parse(nb5 nb5Var) throws IOException {
            SpotLightUsers spotLightUsers = new SpotLightUsers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (spotLightUsers.liveInfo == null) {
                        spotLightUsers.liveInfo = SpotLightLiveInfo.new_();
                    }
                    if (spotLightUsers.seeInfo == null) {
                        spotLightUsers.seeInfo = SpotLightSeeInfo.new_();
                    }
                    if (spotLightUsers.userInfo != null) {
                        break;
                    }
                    spotLightUsers.userInfo = User.new_();
                    break;
                }
                if (iM158752u == 10) {
                    spotLightUsers.liveInfo = (SpotLightLiveInfo) nb5Var.m158743l(SpotLightLiveInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    spotLightUsers.userInfo = (User) nb5Var.m158743l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (spotLightUsers.liveInfo == null) {
                            spotLightUsers.liveInfo = SpotLightLiveInfo.new_();
                        }
                        if (spotLightUsers.seeInfo == null) {
                            spotLightUsers.seeInfo = SpotLightSeeInfo.new_();
                        }
                        if (spotLightUsers.userInfo != null) {
                            break;
                        }
                        spotLightUsers.userInfo = User.new_();
                        return spotLightUsers;
                    }
                    spotLightUsers.seeInfo = (SpotLightSeeInfo) nb5Var.m158743l(SpotLightSeeInfo.PROTOBUF_ADAPTER);
                }
            }
            return spotLightUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpotLightUsers spotLightUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SpotLightLiveInfo spotLightLiveInfo = spotLightUsers.liveInfo;
            if (spotLightLiveInfo != null) {
                codedOutputByteBufferNano.m17254K(1, spotLightLiveInfo, SpotLightLiveInfo.PROTOBUF_ADAPTER);
            }
            User user = spotLightUsers.userInfo;
            if (user != null) {
                codedOutputByteBufferNano.m17254K(2, user, User.PROTOBUF_ADAPTER);
            }
            SpotLightSeeInfo spotLightSeeInfo = spotLightUsers.seeInfo;
            if (spotLightSeeInfo != null) {
                codedOutputByteBufferNano.m17254K(3, spotLightSeeInfo, SpotLightSeeInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SpotLightUsers> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightUsers>() { // from class: com.p1.mobile.putong.core.data.SpotLightUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpotLightUsers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpotLightUsers newInstance() {
            return new SpotLightUsers();
        }

        public boolean parseField(SpotLightUsers spotLightUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userInfo":
                    spotLightUsers.userInfo = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveInfo":
                    spotLightUsers.liveInfo = SpotLightLiveInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "seeInfo":
                    spotLightUsers.seeInfo = SpotLightSeeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpotLightUsers spotLightUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userInfo":
                case "liveInfo":
                case "seeInfo":
                    return true;
                default:
                    return super.parseFieldCheck(spotLightUsers, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpotLightUsers spotLightUsers, JsonGenerator jsonGenerator) throws IOException {
            if (spotLightUsers.liveInfo != null) {
                jsonGenerator.writeFieldName("liveInfo");
                SpotLightLiveInfo.JSON_ADAPTER.serialize(spotLightUsers.liveInfo, jsonGenerator, true);
            }
            if (spotLightUsers.seeInfo != null) {
                jsonGenerator.writeFieldName("seeInfo");
                SpotLightSeeInfo.JSON_ADAPTER.serialize(spotLightUsers.seeInfo, jsonGenerator, true);
            }
            if (spotLightUsers.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                User.JSON_ADAPTER.serialize(spotLightUsers.userInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightUsers new_() {
        SpotLightUsers spotLightUsers = new SpotLightUsers();
        spotLightUsers.nullCheck();
        return spotLightUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpotLightUsers mo223809clone() {
        SpotLightUsers spotLightUsers = new SpotLightUsers();
        SpotLightLiveInfo spotLightLiveInfo = this.liveInfo;
        if (spotLightLiveInfo != null) {
            spotLightUsers.liveInfo = spotLightLiveInfo.mo223809clone();
        }
        SpotLightSeeInfo spotLightSeeInfo = this.seeInfo;
        if (spotLightSeeInfo != null) {
            spotLightUsers.seeInfo = spotLightSeeInfo.mo223809clone();
        }
        User user = this.userInfo;
        if (user != null) {
            spotLightUsers.userInfo = user.mo223809clone();
        }
        return spotLightUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotLightUsers)) {
            return false;
        }
        SpotLightUsers spotLightUsers = (SpotLightUsers) obj;
        return ValueObject.util_equals(this.liveInfo, spotLightUsers.liveInfo) && ValueObject.util_equals(this.seeInfo, spotLightUsers.seeInfo) && ValueObject.util_equals(this.userInfo, spotLightUsers.userInfo);
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
        SpotLightLiveInfo spotLightLiveInfo = this.liveInfo;
        int iHashCode = (i2 + (spotLightLiveInfo != null ? spotLightLiveInfo.hashCode() : 0)) * 41;
        SpotLightSeeInfo spotLightSeeInfo = this.seeInfo;
        int iHashCode2 = (iHashCode + (spotLightSeeInfo != null ? spotLightSeeInfo.hashCode() : 0)) * 41;
        User user = this.userInfo;
        int iHashCode3 = iHashCode2 + (user != null ? user.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveInfo == null) {
            this.liveInfo = SpotLightLiveInfo.new_();
        }
        if (this.seeInfo == null) {
            this.seeInfo = SpotLightSeeInfo.new_();
        }
        if (this.userInfo == null) {
            this.userInfo = User.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
