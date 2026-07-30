package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class UserLiveGradeData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "userlivegradedata";

    @ProtobufIndex(index = 1)
    public int grade;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String iconUrl;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int wealth;
    public static ProtobufAdapter<UserLiveGradeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserLiveGradeData>() { // from class: com.p1.mobile.putong.core.data.UserLiveGradeData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserLiveGradeData userLiveGradeData) {
            int iH = CodedOutputByteBufferNano.h(1, userLiveGradeData.grade) + CodedOutputByteBufferNano.h(2, userLiveGradeData.wealth);
            String str = userLiveGradeData.iconUrl;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) userLiveGradeData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserLiveGradeData m16132parse(nb5 nb5Var) throws IOException {
            UserLiveGradeData userLiveGradeData = new UserLiveGradeData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userLiveGradeData.iconUrl != null) {
                        break;
                    }
                    userLiveGradeData.iconUrl = "";
                    break;
                }
                if (iU == 8) {
                    userLiveGradeData.grade = nb5Var.j();
                } else if (iU == 16) {
                    userLiveGradeData.wealth = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (userLiveGradeData.iconUrl != null) {
                            break;
                        }
                        userLiveGradeData.iconUrl = "";
                        return userLiveGradeData;
                    }
                    userLiveGradeData.iconUrl = nb5Var.s();
                }
            }
            return userLiveGradeData;
        }

        public void serialize(UserLiveGradeData userLiveGradeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, userLiveGradeData.grade);
            codedOutputByteBufferNano.G(2, userLiveGradeData.wealth);
            String str = userLiveGradeData.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<UserLiveGradeData> JSON_ADAPTER = new ObjectJsonAdapter<UserLiveGradeData>() { // from class: com.p1.mobile.putong.core.data.UserLiveGradeData.2
        public Class getDataClass() {
            return UserLiveGradeData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserLiveGradeData m16133newInstance() {
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

        public void serializeFields(UserLiveGradeData userLiveGradeData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, userLiveGradeData.grade);
            jsonGenerator.writeNumberField("wealth", userLiveGradeData.wealth);
            String str = userLiveGradeData.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserLiveGradeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserLiveGradeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserLiveGradeData new_() {
        UserLiveGradeData userLiveGradeData = new UserLiveGradeData();
        userLiveGradeData.nullCheck();
        return userLiveGradeData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserLiveGradeData m16131clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((super.hashCode() * 41) + this.grade) * 41) + this.wealth) * 41;
        String str = this.iconUrl;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
