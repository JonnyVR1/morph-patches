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
public class UserRecordData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userrecorddata";

    @ProtobufIndex(index = 1)
    public boolean isPop;

    @NonNull
    @ProtobufIndex(index = 3)
    public String link;

    @ProtobufIndex(index = 2)
    public int popLimit;
    public static ProtobufAdapter<UserRecordData> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserRecordData>() { // from class: com.p1.mobile.putong.data.UserRecordData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserRecordData userRecordData) {
            int iB = CodedOutputByteBufferNano.b(1, userRecordData.isPop) + CodedOutputByteBufferNano.h(2, userRecordData.popLimit);
            String str = userRecordData.link;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) userRecordData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserRecordData m19214parse(nb5 nb5Var) throws IOException {
            UserRecordData userRecordData = new UserRecordData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userRecordData.link != null) {
                        break;
                    }
                    userRecordData.link = "";
                    break;
                }
                if (iU == 8) {
                    userRecordData.isPop = nb5Var.g();
                } else if (iU == 16) {
                    userRecordData.popLimit = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (userRecordData.link != null) {
                            break;
                        }
                        userRecordData.link = "";
                        return userRecordData;
                    }
                    userRecordData.link = nb5Var.s();
                }
            }
            return userRecordData;
        }

        public void serialize(UserRecordData userRecordData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, userRecordData.isPop);
            codedOutputByteBufferNano.G(2, userRecordData.popLimit);
            String str = userRecordData.link;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<UserRecordData> JSON_ADAPTER = new ObjectJsonAdapter<UserRecordData>() { // from class: com.p1.mobile.putong.data.UserRecordData.2
        public Class getDataClass() {
            return UserRecordData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserRecordData mo17830newInstance() {
            return new UserRecordData();
        }

        public boolean parseField(UserRecordData userRecordData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "link":
                    userRecordData.link = jsonParser.getValueAsString();
                    return true;
                case "isPop":
                    userRecordData.isPop = jsonParser.getValueAsBoolean();
                    return true;
                case "popLimit":
                    userRecordData.popLimit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserRecordData userRecordData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "link":
                case "isPop":
                case "popLimit":
                    return true;
                default:
                    return super.parseFieldCheck(userRecordData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserRecordData userRecordData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isPop", userRecordData.isPop);
            jsonGenerator.writeNumberField("popLimit", userRecordData.popLimit);
            String str = userRecordData.link;
            if (str != null) {
                jsonGenerator.writeStringField(Link.TYPE, str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserRecordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserRecordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserRecordData new_() {
        UserRecordData userRecordData = new UserRecordData();
        userRecordData.nullCheck();
        return userRecordData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserRecordData m19213clone() {
        UserRecordData userRecordData = new UserRecordData();
        userRecordData.isPop = this.isPop;
        userRecordData.popLimit = this.popLimit;
        userRecordData.link = this.link;
        return userRecordData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserRecordData)) {
            return false;
        }
        UserRecordData userRecordData = (UserRecordData) obj;
        return this.isPop == userRecordData.isPop && this.popLimit == userRecordData.popLimit && ValueObject.util_equals(this.link, userRecordData.link);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.isPop ? 1231 : 1237)) * 41) + this.popLimit) * 41;
        String str = this.link;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.link == null) {
            this.link = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
