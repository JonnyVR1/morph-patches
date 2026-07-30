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
public class UserProfileMood extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userprofilemood";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @ProtobufIndex(index = 3)
    public double createdTime;

    @ProtobufIndex(index = 4)
    public double expireTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String moodId;
    public static ProtobufAdapter<UserProfileMood> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserProfileMood>() { // from class: com.p1.mobile.putong.data.UserProfileMood.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserProfileMood userProfileMood) {
            String str = userProfileMood.content;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = userProfileMood.moodId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, userProfileMood.createdTime) + CodedOutputByteBufferNano.m17277d(4, userProfileMood.expireTime);
            userProfileMood.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserProfileMood parse(nc5 nc5Var) throws IOException {
            UserProfileMood userProfileMood = new UserProfileMood();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userProfileMood.content == null) {
                        userProfileMood.content = "";
                    }
                    if (userProfileMood.moodId != null) {
                        break;
                    }
                    userProfileMood.moodId = "";
                    break;
                }
                if (iM162497u == 10) {
                    userProfileMood.content = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    userProfileMood.moodId = nc5Var.m162495s();
                } else if (iM162497u == 25) {
                    userProfileMood.createdTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 33) {
                        if (userProfileMood.content == null) {
                            userProfileMood.content = "";
                        }
                        if (userProfileMood.moodId != null) {
                            break;
                        }
                        userProfileMood.moodId = "";
                        return userProfileMood;
                    }
                    userProfileMood.expireTime = nc5Var.m162484h();
                }
            }
            return userProfileMood;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserProfileMood userProfileMood, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userProfileMood.content;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = userProfileMood.moodId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17301C(3, userProfileMood.createdTime);
            codedOutputByteBufferNano.m17301C(4, userProfileMood.expireTime);
        }
    };
    public static JsonAdapter<UserProfileMood> JSON_ADAPTER = new ObjectJsonAdapter<UserProfileMood>() { // from class: com.p1.mobile.putong.data.UserProfileMood.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserProfileMood.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserProfileMood newInstance() {
            return new UserProfileMood();
        }

        public boolean parseField(UserProfileMood userProfileMood, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "moodId":
                    userProfileMood.moodId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    userProfileMood.expireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "createdTime":
                    userProfileMood.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "content":
                    userProfileMood.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserProfileMood userProfileMood, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "moodId":
                case "expireTime":
                case "createdTime":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(userProfileMood, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserProfileMood userProfileMood, JsonGenerator jsonGenerator) throws IOException {
            String str = userProfileMood.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = userProfileMood.moodId;
            if (str2 != null) {
                jsonGenerator.writeStringField("moodId", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(userProfileMood.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("expireTime");
            jsonAdapter.serialize(Double.valueOf(userProfileMood.expireTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserProfileMood) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserProfileMood) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserProfileMood new_() {
        UserProfileMood userProfileMood = new UserProfileMood();
        userProfileMood.nullCheck();
        return userProfileMood;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserProfileMood mo225055clone() {
        UserProfileMood userProfileMood = new UserProfileMood();
        userProfileMood.content = this.content;
        userProfileMood.moodId = this.moodId;
        userProfileMood.createdTime = this.createdTime;
        userProfileMood.expireTime = this.expireTime;
        return userProfileMood;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserProfileMood)) {
            return false;
        }
        UserProfileMood userProfileMood = (UserProfileMood) obj;
        return ValueObject.util_equals(this.content, userProfileMood.content) && ValueObject.util_equals(this.moodId, userProfileMood.moodId) && this.createdTime == userProfileMood.createdTime && this.expireTime == userProfileMood.expireTime;
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.moodId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.expireTime);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.moodId == null) {
            this.moodId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
