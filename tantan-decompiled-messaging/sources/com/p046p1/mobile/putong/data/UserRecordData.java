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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserRecordData userRecordData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, userRecordData.isPop) + CodedOutputByteBufferNano.m17226h(2, userRecordData.popLimit);
            String str = userRecordData.link;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str);
            }
            userRecordData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserRecordData parse(nb5 nb5Var) throws IOException {
            UserRecordData userRecordData = new UserRecordData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (userRecordData.link != null) {
                        break;
                    }
                    userRecordData.link = "";
                    break;
                }
                if (iM158752u == 8) {
                    userRecordData.isPop = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    userRecordData.popLimit = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (userRecordData.link != null) {
                            break;
                        }
                        userRecordData.link = "";
                        return userRecordData;
                    }
                    userRecordData.link = nb5Var.m158750s();
                }
            }
            return userRecordData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserRecordData userRecordData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, userRecordData.isPop);
            codedOutputByteBufferNano.m17250G(2, userRecordData.popLimit);
            String str = userRecordData.link;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<UserRecordData> JSON_ADAPTER = new ObjectJsonAdapter<UserRecordData>() { // from class: com.p1.mobile.putong.data.UserRecordData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserRecordData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserRecordData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserRecordData userRecordData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isPop", userRecordData.isPop);
            jsonGenerator.writeNumberField("popLimit", userRecordData.popLimit);
            String str = userRecordData.link;
            if (str != null) {
                jsonGenerator.writeStringField(Link.TYPE, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserRecordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserRecordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserRecordData new_() {
        UserRecordData userRecordData = new UserRecordData();
        userRecordData.nullCheck();
        return userRecordData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserRecordData mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.isPop ? 1231 : 1237)) * 41) + this.popLimit) * 41;
        String str = this.link;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.link == null) {
            this.link = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
