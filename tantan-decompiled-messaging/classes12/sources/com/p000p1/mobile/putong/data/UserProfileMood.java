package com.p000p1.mobile.putong.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserProfileMood userProfileMood) {
            String str = userProfileMood.content;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = userProfileMood.moodId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, userProfileMood.createdTime) + CodedOutputByteBufferNano.d(4, userProfileMood.expireTime);
            ((MessageNano) userProfileMood).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserProfileMood m19208parse(nb5 nb5Var) throws IOException {
            UserProfileMood userProfileMood = new UserProfileMood();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userProfileMood.content == null) {
                        userProfileMood.content = "";
                    }
                    if (userProfileMood.moodId != null) {
                        break;
                    }
                    userProfileMood.moodId = "";
                    break;
                }
                if (iU == 10) {
                    userProfileMood.content = nb5Var.s();
                } else if (iU == 18) {
                    userProfileMood.moodId = nb5Var.s();
                } else if (iU == 25) {
                    userProfileMood.createdTime = nb5Var.h();
                } else {
                    if (iU != 33) {
                        if (userProfileMood.content == null) {
                            userProfileMood.content = "";
                        }
                        if (userProfileMood.moodId != null) {
                            break;
                        }
                        userProfileMood.moodId = "";
                        return userProfileMood;
                    }
                    userProfileMood.expireTime = nb5Var.h();
                }
            }
            return userProfileMood;
        }

        public void serialize(UserProfileMood userProfileMood, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userProfileMood.content;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = userProfileMood.moodId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, userProfileMood.createdTime);
            codedOutputByteBufferNano.C(4, userProfileMood.expireTime);
        }
    };
    public static JsonAdapter<UserProfileMood> JSON_ADAPTER = new ObjectJsonAdapter<UserProfileMood>() { // from class: com.p1.mobile.putong.data.UserProfileMood.2
        public Class getDataClass() {
            return UserProfileMood.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserProfileMood mo17830newInstance() {
            return new UserProfileMood();
        }

        public boolean parseField(UserProfileMood userProfileMood, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "moodId":
                    userProfileMood.moodId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    userProfileMood.expireTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    userProfileMood.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserProfileMood) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserProfileMood) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserProfileMood new_() {
        UserProfileMood userProfileMood = new UserProfileMood();
        userProfileMood.nullCheck();
        return userProfileMood;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserProfileMood m19207clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.moodId == null) {
            this.moodId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
