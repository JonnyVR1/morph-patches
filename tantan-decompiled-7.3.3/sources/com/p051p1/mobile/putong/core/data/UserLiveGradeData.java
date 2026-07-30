package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class UserLiveGradeData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "userlivegradedata";

    @ProtobufIndex(index = 1)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 3)
    public String iconUrl;

    @ProtobufIndex(index = 2)
    public int wealth;
    public static ProtobufAdapter<UserLiveGradeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveGradeData>() { // from class: com.p1.mobile.putong.core.data.UserLiveGradeData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserLiveGradeData userLiveGradeData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, userLiveGradeData.grade) + CodedOutputByteBufferNano.m17281h(2, userLiveGradeData.wealth);
            String str = userLiveGradeData.iconUrl;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            userLiveGradeData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserLiveGradeData parse(nc5 nc5Var) throws IOException {
            UserLiveGradeData userLiveGradeData = new UserLiveGradeData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userLiveGradeData.iconUrl != null) {
                        break;
                    }
                    userLiveGradeData.iconUrl = "";
                    break;
                }
                if (iM162497u == 8) {
                    userLiveGradeData.grade = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    userLiveGradeData.wealth = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (userLiveGradeData.iconUrl != null) {
                            break;
                        }
                        userLiveGradeData.iconUrl = "";
                        return userLiveGradeData;
                    }
                    userLiveGradeData.iconUrl = nc5Var.m162495s();
                }
            }
            return userLiveGradeData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserLiveGradeData userLiveGradeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, userLiveGradeData.grade);
            codedOutputByteBufferNano.m17305G(2, userLiveGradeData.wealth);
            String str = userLiveGradeData.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<UserLiveGradeData> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveGradeData>() { // from class: com.p1.mobile.putong.core.data.UserLiveGradeData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserLiveGradeData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserLiveGradeData newInstance() {
            return new UserLiveGradeData();
        }

        public boolean parseField(UserLiveGradeData userLiveGradeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "wealth":
                    userLiveGradeData.wealth = jsonParser.getValueAsInt();
                    return true;
                case "grade":
                    userLiveGradeData.grade = jsonParser.getValueAsInt();
                    return true;
                case "iconUrl":
                    userLiveGradeData.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserLiveGradeData userLiveGradeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "wealth":
                case "grade":
                case "iconUrl":
                    return true;
                default:
                    return super.parseFieldCheck(userLiveGradeData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserLiveGradeData userLiveGradeData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, userLiveGradeData.grade);
            jsonGenerator.writeNumberField("wealth", userLiveGradeData.wealth);
            String str = userLiveGradeData.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveGradeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveGradeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveGradeData new_() {
        UserLiveGradeData userLiveGradeData = new UserLiveGradeData();
        userLiveGradeData.nullCheck();
        return userLiveGradeData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserLiveGradeData mo225055clone() {
        UserLiveGradeData userLiveGradeData = new UserLiveGradeData();
        userLiveGradeData.grade = this.grade;
        userLiveGradeData.wealth = this.wealth;
        userLiveGradeData.iconUrl = this.iconUrl;
        return userLiveGradeData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLiveGradeData)) {
            return false;
        }
        UserLiveGradeData userLiveGradeData = (UserLiveGradeData) obj;
        return this == obj && this.grade == userLiveGradeData.grade && this.wealth == userLiveGradeData.wealth && ValueObject.util_equals(this.iconUrl, userLiveGradeData.iconUrl);
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
        int iHashCode = ((((super.hashCode() * 41) + this.grade) * 41) + this.wealth) * 41;
        String str = this.iconUrl;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
