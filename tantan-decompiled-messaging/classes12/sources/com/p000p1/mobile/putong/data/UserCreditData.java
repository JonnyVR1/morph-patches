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
public class UserCreditData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usercreditdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String level;

    @ProtobufIndex(index = 1)
    public int score;
    public static ProtobufAdapter<UserCreditData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserCreditData>() { // from class: com.p1.mobile.putong.data.UserCreditData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserCreditData userCreditData) {
            int iH = CodedOutputByteBufferNano.h(1, userCreditData.score);
            String str = userCreditData.level;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) userCreditData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserCreditData m19172parse(nb5 nb5Var) throws IOException {
            UserCreditData userCreditData = new UserCreditData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userCreditData.level != null) {
                        break;
                    }
                    userCreditData.level = "";
                    break;
                }
                if (iU == 8) {
                    userCreditData.score = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (userCreditData.level != null) {
                            break;
                        }
                        userCreditData.level = "";
                        return userCreditData;
                    }
                    userCreditData.level = nb5Var.s();
                }
            }
            return userCreditData;
        }

        public void serialize(UserCreditData userCreditData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, userCreditData.score);
            String str = userCreditData.level;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<UserCreditData> JSON_ADAPTER = new ObjectJsonAdapter<UserCreditData>() { // from class: com.p1.mobile.putong.data.UserCreditData.2
        public Class getDataClass() {
            return UserCreditData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserCreditData mo17830newInstance() {
            return new UserCreditData();
        }

        public boolean parseField(UserCreditData userCreditData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("level")) {
                userCreditData.level = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("score")) {
                return false;
            }
            userCreditData.score = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UserCreditData userCreditData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("level") || str.equals("score")) {
                return true;
            }
            return super.parseFieldCheck(userCreditData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserCreditData userCreditData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("score", userCreditData.score);
            String str = userCreditData.level;
            if (str != null) {
                jsonGenerator.writeStringField("level", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserCreditData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserCreditData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserCreditData new_() {
        UserCreditData userCreditData = new UserCreditData();
        userCreditData.nullCheck();
        return userCreditData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserCreditData m19171clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.score) * 41;
        String str = this.level;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.level == null) {
            this.level = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
