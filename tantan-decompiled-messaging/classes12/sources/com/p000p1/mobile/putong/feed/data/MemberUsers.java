package com.p000p1.mobile.putong.feed.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MemberUsers memberUsers) {
            String str = memberUsers.avatar;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = memberUsers.userID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) memberUsers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MemberUsers m19590parse(nb5 nb5Var) throws IOException {
            MemberUsers memberUsers = new MemberUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (memberUsers.avatar == null) {
                        memberUsers.avatar = "";
                    }
                    if (memberUsers.userID != null) {
                        break;
                    }
                    memberUsers.userID = "";
                    break;
                }
                if (iU == 10) {
                    memberUsers.avatar = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (memberUsers.avatar == null) {
                            memberUsers.avatar = "";
                        }
                        if (memberUsers.userID != null) {
                            break;
                        }
                        memberUsers.userID = "";
                        return memberUsers;
                    }
                    memberUsers.userID = nb5Var.s();
                }
            }
            return memberUsers;
        }

        public void serialize(MemberUsers memberUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = memberUsers.avatar;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = memberUsers.userID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<MemberUsers> JSON_ADAPTER = new ObjectJsonAdapter<MemberUsers>() { // from class: com.p1.mobile.putong.feed.data.MemberUsers.2
        public Class getDataClass() {
            return MemberUsers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MemberUsers mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MemberUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MemberUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MemberUsers new_() {
        MemberUsers memberUsers = new MemberUsers();
        memberUsers.nullCheck();
        return memberUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MemberUsers m19589clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.avatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userID;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.userID == null) {
            this.userID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
