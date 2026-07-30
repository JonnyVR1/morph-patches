package com.p046p1.mobile.putong.data;

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
public class UserAvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "useravatarframe";

    @ProtobufIndex(index = 3)
    public long expireTime;

    @ProtobufIndex(index = 2)
    public boolean isShow;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<UserAvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserAvatarFrame>() { // from class: com.p1.mobile.putong.data.UserAvatarFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserAvatarFrame userAvatarFrame) {
            String str = userAvatarFrame.url;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, userAvatarFrame.isShow) + CodedOutputByteBufferNano.m17228j(3, userAvatarFrame.expireTime);
            userAvatarFrame.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserAvatarFrame parse(nb5 nb5Var) throws IOException {
            UserAvatarFrame userAvatarFrame = new UserAvatarFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userAvatarFrame.url != null) {
                        break;
                    }
                    userAvatarFrame.url = "";
                    break;
                }
                if (iM158752u == 10) {
                    userAvatarFrame.url = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    userAvatarFrame.isShow = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        if (userAvatarFrame.url != null) {
                            break;
                        }
                        userAvatarFrame.url = "";
                        return userAvatarFrame;
                    }
                    userAvatarFrame.expireTime = nb5Var.m158742k();
                }
            }
            return userAvatarFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserAvatarFrame userAvatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userAvatarFrame.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, userAvatarFrame.isShow);
            codedOutputByteBufferNano.m17252I(3, userAvatarFrame.expireTime);
        }
    };
    public static JsonAdapter<UserAvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<UserAvatarFrame>() { // from class: com.p1.mobile.putong.data.UserAvatarFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserAvatarFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserAvatarFrame newInstance() {
            return new UserAvatarFrame();
        }

        public boolean parseField(UserAvatarFrame userAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isShow":
                    userAvatarFrame.isShow = jsonParser.getValueAsBoolean();
                    return true;
                case "expireTime":
                    userAvatarFrame.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "url":
                    userAvatarFrame.url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserAvatarFrame userAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isShow":
                case "expireTime":
                case "url":
                    return true;
                default:
                    return super.parseFieldCheck(userAvatarFrame, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserAvatarFrame userAvatarFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = userAvatarFrame.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeBooleanField("isShow", userAvatarFrame.isShow);
            jsonGenerator.writeNumberField("expireTime", userAvatarFrame.expireTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserAvatarFrame new_() {
        UserAvatarFrame userAvatarFrame = new UserAvatarFrame();
        userAvatarFrame.nullCheck();
        return userAvatarFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserAvatarFrame mo223809clone() {
        UserAvatarFrame userAvatarFrame = new UserAvatarFrame();
        userAvatarFrame.url = this.url;
        userAvatarFrame.isShow = this.isShow;
        userAvatarFrame.expireTime = this.expireTime;
        return userAvatarFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAvatarFrame)) {
            return false;
        }
        UserAvatarFrame userAvatarFrame = (UserAvatarFrame) obj;
        return ValueObject.util_equals(this.url, userAvatarFrame.url) && this.isShow == userAvatarFrame.isShow && this.expireTime == userAvatarFrame.expireTime;
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
        String str = this.url;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isShow ? 1231 : 1237)) * 41;
        long j = this.expireTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
