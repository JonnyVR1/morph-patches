package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class UserFeedbackInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userfeedbackinfo";

    @ProtobufIndex(index = 5)
    public boolean isGetFeedBackAI;

    @ProtobufIndex(index = 3)
    public boolean isGetFeedBackPeople;

    @ProtobufIndex(index = 4)
    public boolean isGetSumPopCount;

    @ProtobufIndex(index = 1)
    public int userInformedCount;

    @ProtobufIndex(index = 2)
    public int userPopFakePictureCount;
    public static ProtobufAdapter<UserFeedbackInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserFeedbackInfo>() { // from class: com.p1.mobile.putong.core.data.UserFeedbackInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserFeedbackInfo userFeedbackInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, userFeedbackInfo.userInformedCount) + CodedOutputByteBufferNano.m17226h(2, userFeedbackInfo.userPopFakePictureCount) + CodedOutputByteBufferNano.m17220b(3, userFeedbackInfo.isGetFeedBackPeople) + CodedOutputByteBufferNano.m17220b(4, userFeedbackInfo.isGetSumPopCount) + CodedOutputByteBufferNano.m17220b(5, userFeedbackInfo.isGetFeedBackAI);
            userFeedbackInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserFeedbackInfo parse(nb5 nb5Var) throws IOException {
            UserFeedbackInfo userFeedbackInfo = new UserFeedbackInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    userFeedbackInfo.userInformedCount = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    userFeedbackInfo.userPopFakePictureCount = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    userFeedbackInfo.isGetFeedBackPeople = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    userFeedbackInfo.isGetSumPopCount = nb5Var.m158738g();
                } else {
                    if (iM158752u != 40) {
                        return userFeedbackInfo;
                    }
                    userFeedbackInfo.isGetFeedBackAI = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserFeedbackInfo userFeedbackInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, userFeedbackInfo.userInformedCount);
            codedOutputByteBufferNano.m17250G(2, userFeedbackInfo.userPopFakePictureCount);
            codedOutputByteBufferNano.m17244A(3, userFeedbackInfo.isGetFeedBackPeople);
            codedOutputByteBufferNano.m17244A(4, userFeedbackInfo.isGetSumPopCount);
            codedOutputByteBufferNano.m17244A(5, userFeedbackInfo.isGetFeedBackAI);
        }
    };
    public static JsonAdapter<UserFeedbackInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserFeedbackInfo>() { // from class: com.p1.mobile.putong.core.data.UserFeedbackInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserFeedbackInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserFeedbackInfo newInstance() {
            return new UserFeedbackInfo();
        }

        public boolean parseField(UserFeedbackInfo userFeedbackInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userInformedCount":
                    userFeedbackInfo.userInformedCount = jsonParser.getValueAsInt();
                    return true;
                case "isGetFeedBackPeople":
                    userFeedbackInfo.isGetFeedBackPeople = jsonParser.getValueAsBoolean();
                    return true;
                case "isGetSumPopCount":
                    userFeedbackInfo.isGetSumPopCount = jsonParser.getValueAsBoolean();
                    return true;
                case "userPopFakePictureCount":
                    userFeedbackInfo.userPopFakePictureCount = jsonParser.getValueAsInt();
                    return true;
                case "isGetFeedBackAI":
                    userFeedbackInfo.isGetFeedBackAI = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserFeedbackInfo userFeedbackInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userInformedCount":
                case "isGetFeedBackPeople":
                case "isGetSumPopCount":
                case "userPopFakePictureCount":
                case "isGetFeedBackAI":
                    return true;
                default:
                    return super.parseFieldCheck(userFeedbackInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserFeedbackInfo userFeedbackInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("userInformedCount", userFeedbackInfo.userInformedCount);
            jsonGenerator.writeNumberField("userPopFakePictureCount", userFeedbackInfo.userPopFakePictureCount);
            jsonGenerator.writeBooleanField("isGetFeedBackPeople", userFeedbackInfo.isGetFeedBackPeople);
            jsonGenerator.writeBooleanField("isGetSumPopCount", userFeedbackInfo.isGetSumPopCount);
            jsonGenerator.writeBooleanField("isGetFeedBackAI", userFeedbackInfo.isGetFeedBackAI);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserFeedbackInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserFeedbackInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserFeedbackInfo new_() {
        UserFeedbackInfo userFeedbackInfo = new UserFeedbackInfo();
        userFeedbackInfo.nullCheck();
        return userFeedbackInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserFeedbackInfo mo223809clone() {
        UserFeedbackInfo userFeedbackInfo = new UserFeedbackInfo();
        userFeedbackInfo.userInformedCount = this.userInformedCount;
        userFeedbackInfo.userPopFakePictureCount = this.userPopFakePictureCount;
        userFeedbackInfo.isGetFeedBackPeople = this.isGetFeedBackPeople;
        userFeedbackInfo.isGetSumPopCount = this.isGetSumPopCount;
        userFeedbackInfo.isGetFeedBackAI = this.isGetFeedBackAI;
        return userFeedbackInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserFeedbackInfo)) {
            return false;
        }
        UserFeedbackInfo userFeedbackInfo = (UserFeedbackInfo) obj;
        return this.userInformedCount == userFeedbackInfo.userInformedCount && this.userPopFakePictureCount == userFeedbackInfo.userPopFakePictureCount && this.isGetFeedBackPeople == userFeedbackInfo.isGetFeedBackPeople && this.isGetSumPopCount == userFeedbackInfo.isGetSumPopCount && this.isGetFeedBackAI == userFeedbackInfo.isGetFeedBackAI;
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
        int i2 = (((((((((i * 41) + this.userInformedCount) * 41) + this.userPopFakePictureCount) * 41) + (this.isGetFeedBackPeople ? 1231 : 1237)) * 41) + (this.isGetSumPopCount ? 1231 : 1237)) * 41) + (this.isGetFeedBackAI ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
