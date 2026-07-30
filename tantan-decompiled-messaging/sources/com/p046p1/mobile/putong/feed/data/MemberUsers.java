package com.p046p1.mobile.putong.feed.data;

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
public class MemberUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "memberusers";

    @NonNull
    @ProtobufIndex(index = 1)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userID;
    public static ProtobufAdapter<MemberUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<MemberUsers>() { // from class: com.p1.mobile.putong.feed.data.MemberUsers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MemberUsers memberUsers) {
            String str = memberUsers.avatar;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = memberUsers.userID;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            memberUsers.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MemberUsers parse(nb5 nb5Var) throws IOException {
            MemberUsers memberUsers = new MemberUsers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (memberUsers.avatar == null) {
                        memberUsers.avatar = "";
                    }
                    if (memberUsers.userID != null) {
                        break;
                    }
                    memberUsers.userID = "";
                    break;
                }
                if (iM158752u == 10) {
                    memberUsers.avatar = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (memberUsers.avatar == null) {
                            memberUsers.avatar = "";
                        }
                        if (memberUsers.userID != null) {
                            break;
                        }
                        memberUsers.userID = "";
                        return memberUsers;
                    }
                    memberUsers.userID = nb5Var.m158750s();
                }
            }
            return memberUsers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MemberUsers memberUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = memberUsers.avatar;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = memberUsers.userID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<MemberUsers> JSON_ADAPTER = new ObjectJsonAdapter<MemberUsers>() { // from class: com.p1.mobile.putong.feed.data.MemberUsers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MemberUsers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MemberUsers newInstance() {
            return new MemberUsers();
        }

        public boolean parseField(MemberUsers memberUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("avatar")) {
                memberUsers.avatar = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("userID")) {
                return false;
            }
            memberUsers.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MemberUsers memberUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("avatar") || str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(memberUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MemberUsers memberUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = memberUsers.avatar;
            if (str != null) {
                jsonGenerator.writeStringField("avatar", str);
            }
            String str2 = memberUsers.userID;
            if (str2 != null) {
                jsonGenerator.writeStringField("userID", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MemberUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MemberUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MemberUsers new_() {
        MemberUsers memberUsers = new MemberUsers();
        memberUsers.nullCheck();
        return memberUsers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MemberUsers mo223809clone() {
        MemberUsers memberUsers = new MemberUsers();
        memberUsers.avatar = this.avatar;
        memberUsers.userID = this.userID;
        return memberUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemberUsers)) {
            return false;
        }
        MemberUsers memberUsers = (MemberUsers) obj;
        return ValueObject.util_equals(this.avatar, memberUsers.avatar) && ValueObject.util_equals(this.userID, memberUsers.userID);
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
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userID;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.userID == null) {
            this.userID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
