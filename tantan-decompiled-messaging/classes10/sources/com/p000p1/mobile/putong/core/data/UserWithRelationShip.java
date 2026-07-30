package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Relationship;
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
public class UserWithRelationShip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userwithrelationship";

    @NonNull
    @ProtobufIndex(index = 1)
    public Relationship relationship;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<UserWithRelationShip> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserWithRelationShip>() { // from class: com.p1.mobile.putong.core.data.UserWithRelationShip.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserWithRelationShip userWithRelationShip) {
            Relationship relationship = userWithRelationShip.relationship;
            int iL = relationship != null ? CodedOutputByteBufferNano.l(1, relationship, Relationship.PROTOBUF_ADAPTER) : 0;
            String str = userWithRelationShip.userId;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) userWithRelationShip).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserWithRelationShip m16200parse(nb5 nb5Var) throws IOException {
            UserWithRelationShip userWithRelationShip = new UserWithRelationShip();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userWithRelationShip.userId == null) {
                        userWithRelationShip.userId = "";
                    }
                    if (userWithRelationShip.relationship != null) {
                        break;
                    }
                    userWithRelationShip.relationship = Relationship.new_();
                    break;
                }
                if (iU == 10) {
                    userWithRelationShip.relationship = (Relationship) nb5Var.l(Relationship.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (userWithRelationShip.userId == null) {
                            userWithRelationShip.userId = "";
                        }
                        if (userWithRelationShip.relationship != null) {
                            break;
                        }
                        userWithRelationShip.relationship = Relationship.new_();
                        return userWithRelationShip;
                    }
                    userWithRelationShip.userId = nb5Var.s();
                }
            }
            return userWithRelationShip;
        }

        public void serialize(UserWithRelationShip userWithRelationShip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Relationship relationship = userWithRelationShip.relationship;
            if (relationship != null) {
                codedOutputByteBufferNano.K(1, relationship, Relationship.PROTOBUF_ADAPTER);
            }
            String str = userWithRelationShip.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<UserWithRelationShip> JSON_ADAPTER = new ObjectJsonAdapter<UserWithRelationShip>() { // from class: com.p1.mobile.putong.core.data.UserWithRelationShip.2
        public Class getDataClass() {
            return UserWithRelationShip.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserWithRelationShip m16201newInstance() {
            return new UserWithRelationShip();
        }

        public boolean parseField(UserWithRelationShip userWithRelationShip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                userWithRelationShip.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("relationship")) {
                return false;
            }
            userWithRelationShip.relationship = (Relationship) Relationship.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserWithRelationShip userWithRelationShip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("relationship")) {
                return true;
            }
            return super.parseFieldCheck(userWithRelationShip, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UserWithRelationShip userWithRelationShip, JsonGenerator jsonGenerator) throws IOException {
            String str = userWithRelationShip.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (userWithRelationShip.relationship != null) {
                jsonGenerator.writeFieldName("relationship");
                Relationship.JSON_ADAPTER.serialize(userWithRelationShip.relationship, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserWithRelationShip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserWithRelationShip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserWithRelationShip new_() {
        UserWithRelationShip userWithRelationShip = new UserWithRelationShip();
        userWithRelationShip.nullCheck();
        return userWithRelationShip;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserWithRelationShip m16199clone() {
        UserWithRelationShip userWithRelationShip = new UserWithRelationShip();
        userWithRelationShip.userId = this.userId;
        Relationship relationship = this.relationship;
        if (relationship != null) {
            userWithRelationShip.relationship = relationship.clone();
        }
        return userWithRelationShip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserWithRelationShip)) {
            return false;
        }
        UserWithRelationShip userWithRelationShip = (UserWithRelationShip) obj;
        return ValueObject.util_equals(this.userId, userWithRelationShip.userId) && ValueObject.util_equals(this.relationship, userWithRelationShip.relationship);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Relationship relationship = this.relationship;
        int iHashCode2 = iHashCode + (relationship != null ? relationship.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.relationship == null) {
            this.relationship = Relationship.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
