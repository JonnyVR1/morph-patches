package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class SpotLightUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightusers";

    @NonNull
    @ProtobufIndex(index = 1)
    public SpotLightLiveInfo liveInfo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public SpotLightSeeInfo seeInfo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public User userInfo;
    public static ProtobufAdapter<SpotLightUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightUsers>() { // from class: com.p1.mobile.putong.core.data.SpotLightUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpotLightUsers spotLightUsers) {
            SpotLightLiveInfo spotLightLiveInfo = spotLightUsers.liveInfo;
            int iL = spotLightLiveInfo != null ? CodedOutputByteBufferNano.l(1, spotLightLiveInfo, SpotLightLiveInfo.PROTOBUF_ADAPTER) : 0;
            User user = spotLightUsers.userInfo;
            if (user != null) {
                iL += CodedOutputByteBufferNano.l(2, user, User.PROTOBUF_ADAPTER);
            }
            SpotLightSeeInfo spotLightSeeInfo = spotLightUsers.seeInfo;
            if (spotLightSeeInfo != null) {
                iL += CodedOutputByteBufferNano.l(3, spotLightSeeInfo, SpotLightSeeInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) spotLightUsers).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpotLightUsers m15722parse(nb5 nb5Var) throws IOException {
            SpotLightUsers spotLightUsers = new SpotLightUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    spotLightUsers.liveInfo = (SpotLightLiveInfo) nb5Var.l(SpotLightLiveInfo.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    spotLightUsers.userInfo = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
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
                    spotLightUsers.seeInfo = (SpotLightSeeInfo) nb5Var.l(SpotLightSeeInfo.PROTOBUF_ADAPTER);
                }
            }
            return spotLightUsers;
        }

        public void serialize(SpotLightUsers spotLightUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SpotLightLiveInfo spotLightLiveInfo = spotLightUsers.liveInfo;
            if (spotLightLiveInfo != null) {
                codedOutputByteBufferNano.K(1, spotLightLiveInfo, SpotLightLiveInfo.PROTOBUF_ADAPTER);
            }
            User user = spotLightUsers.userInfo;
            if (user != null) {
                codedOutputByteBufferNano.K(2, user, User.PROTOBUF_ADAPTER);
            }
            SpotLightSeeInfo spotLightSeeInfo = spotLightUsers.seeInfo;
            if (spotLightSeeInfo != null) {
                codedOutputByteBufferNano.K(3, spotLightSeeInfo, SpotLightSeeInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SpotLightUsers> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightUsers>() { // from class: com.p1.mobile.putong.core.data.SpotLightUsers.2
        public Class getDataClass() {
            return SpotLightUsers.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpotLightUsers m15723newInstance() {
            return new SpotLightUsers();
        }

        public boolean parseField(SpotLightUsers spotLightUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userInfo":
                    spotLightUsers.userInfo = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveInfo":
                    spotLightUsers.liveInfo = (SpotLightLiveInfo) SpotLightLiveInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "seeInfo":
                    spotLightUsers.seeInfo = (SpotLightSeeInfo) SpotLightSeeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightUsers new_() {
        SpotLightUsers spotLightUsers = new SpotLightUsers();
        spotLightUsers.nullCheck();
        return spotLightUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpotLightUsers m15721clone() {
        SpotLightUsers spotLightUsers = new SpotLightUsers();
        SpotLightLiveInfo spotLightLiveInfo = this.liveInfo;
        if (spotLightLiveInfo != null) {
            spotLightUsers.liveInfo = spotLightLiveInfo.m15713clone();
        }
        SpotLightSeeInfo spotLightSeeInfo = this.seeInfo;
        if (spotLightSeeInfo != null) {
            spotLightUsers.seeInfo = spotLightSeeInfo.m15717clone();
        }
        User user = this.userInfo;
        if (user != null) {
            spotLightUsers.userInfo = user.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
