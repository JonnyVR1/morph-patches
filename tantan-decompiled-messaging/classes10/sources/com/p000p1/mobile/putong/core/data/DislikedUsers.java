package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class DislikedUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "dislikedusers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f49id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public User userInfo;
    public static ProtobufAdapter<DislikedUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<DislikedUsers>() { // from class: com.p1.mobile.putong.core.data.DislikedUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DislikedUsers dislikedUsers) {
            String str = dislikedUsers.f49id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            User user = dislikedUsers.userInfo;
            if (user != null) {
                iO += CodedOutputByteBufferNano.l(2, user, User.PROTOBUF_ADAPTER);
            }
            ((MessageNano) dislikedUsers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DislikedUsers m12625parse(nb5 nb5Var) throws IOException {
            DislikedUsers dislikedUsers = new DislikedUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dislikedUsers.f49id == null) {
                        dislikedUsers.f49id = "";
                    }
                    if (dislikedUsers.userInfo != null) {
                        break;
                    }
                    dislikedUsers.userInfo = User.new_();
                    break;
                }
                if (iU == 10) {
                    dislikedUsers.f49id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (dislikedUsers.f49id == null) {
                            dislikedUsers.f49id = "";
                        }
                        if (dislikedUsers.userInfo != null) {
                            break;
                        }
                        dislikedUsers.userInfo = User.new_();
                        return dislikedUsers;
                    }
                    dislikedUsers.userInfo = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                }
            }
            return dislikedUsers;
        }

        public void serialize(DislikedUsers dislikedUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = dislikedUsers.f49id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            User user = dislikedUsers.userInfo;
            if (user != null) {
                codedOutputByteBufferNano.K(2, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<DislikedUsers> JSON_ADAPTER = new ObjectJsonAdapter<DislikedUsers>() { // from class: com.p1.mobile.putong.core.data.DislikedUsers.2
        public Class getDataClass() {
            return DislikedUsers.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DislikedUsers m12626newInstance() {
            return new DislikedUsers();
        }

        public boolean parseField(DislikedUsers dislikedUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userInfo")) {
                dislikedUsers.userInfo = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            dislikedUsers.f49id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(DislikedUsers dislikedUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userInfo")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(dislikedUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(DislikedUsers dislikedUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = dislikedUsers.f49id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (dislikedUsers.userInfo != null) {
                jsonGenerator.writeFieldName("userInfo");
                User.JSON_ADAPTER.serialize(dislikedUsers.userInfo, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DislikedUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DislikedUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DislikedUsers new_() {
        DislikedUsers dislikedUsers = new DislikedUsers();
        dislikedUsers.nullCheck();
        return dislikedUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DislikedUsers m12624clone() {
        DislikedUsers dislikedUsers = new DislikedUsers();
        dislikedUsers.f49id = this.f49id;
        User user = this.userInfo;
        if (user != null) {
            dislikedUsers.userInfo = user.clone();
        }
        return dislikedUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DislikedUsers)) {
            return false;
        }
        DislikedUsers dislikedUsers = (DislikedUsers) obj;
        return ValueObject.util_equals(this.f49id, dislikedUsers.f49id) && ValueObject.util_equals(this.userInfo, dislikedUsers.userInfo);
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
        String str = this.f49id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        User user = this.userInfo;
        int iHashCode2 = iHashCode + (user != null ? user.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f49id == null) {
            this.f49id = "";
        }
        if (this.userInfo == null) {
            this.userInfo = User.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
