package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class UserCreditData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usercreditdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String level;

    @ProtobufIndex(index = 1)
    public int score;
    public static ProtobufAdapter<UserCreditData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserCreditData>() { // from class: com.p1.mobile.putong.data.UserCreditData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserCreditData userCreditData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, userCreditData.score);
            String str = userCreditData.level;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            userCreditData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserCreditData parse(nb5 nb5Var) throws IOException {
            UserCreditData userCreditData = new UserCreditData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userCreditData.level != null) {
                        break;
                    }
                    userCreditData.level = "";
                    break;
                }
                if (iM158752u == 8) {
                    userCreditData.score = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (userCreditData.level != null) {
                            break;
                        }
                        userCreditData.level = "";
                        return userCreditData;
                    }
                    userCreditData.level = nb5Var.m158750s();
                }
            }
            return userCreditData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserCreditData userCreditData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, userCreditData.score);
            String str = userCreditData.level;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<UserCreditData> JSON_ADAPTER = new ObjectJsonAdapter<UserCreditData>() { // from class: com.p1.mobile.putong.data.UserCreditData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserCreditData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserCreditData newInstance() {
            return new UserCreditData();
        }

        public boolean parseField(UserCreditData userCreditData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.LEVEL)) {
                userCreditData.level = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.SCORE)) {
                return false;
            }
            userCreditData.score = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UserCreditData userCreditData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.LEVEL) || str.equals(FirebaseAnalytics.Param.SCORE)) {
                return true;
            }
            return super.parseFieldCheck(userCreditData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserCreditData userCreditData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, userCreditData.score);
            String str = userCreditData.level;
            if (str != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.LEVEL, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserCreditData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserCreditData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserCreditData new_() {
        UserCreditData userCreditData = new UserCreditData();
        userCreditData.nullCheck();
        return userCreditData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserCreditData mo223809clone() {
        UserCreditData userCreditData = new UserCreditData();
        userCreditData.score = this.score;
        userCreditData.level = this.level;
        return userCreditData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserCreditData)) {
            return false;
        }
        UserCreditData userCreditData = (UserCreditData) obj;
        return this.score == userCreditData.score && ValueObject.util_equals(this.level, userCreditData.level);
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
        int i2 = ((i * 41) + this.score) * 41;
        String str = this.level;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.level == null) {
            this.level = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
