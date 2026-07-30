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
public class SalvagePopUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "salvagepopuser";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public SalvagePopUserType salvagePopUserType;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int superLikeCountBy;

    @NonNull
    @ProtobufIndex(index = 1)
    public User user;
    public static ProtobufAdapter<SalvagePopUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SalvagePopUser>() { // from class: com.p1.mobile.putong.core.data.SalvagePopUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SalvagePopUser salvagePopUser) {
            User user = salvagePopUser.user;
            int iL = user != null ? CodedOutputByteBufferNano.l(1, user, User.PROTOBUF_ADAPTER) : 0;
            SalvagePopUserType salvagePopUserType = salvagePopUser.salvagePopUserType;
            if (salvagePopUserType != null) {
                iL += CodedOutputByteBufferNano.l(2, salvagePopUserType, SalvagePopUserType.PROTOBUF_ADAPTER);
            }
            int iH = iL + CodedOutputByteBufferNano.h(3, salvagePopUser.superLikeCountBy);
            ((MessageNano) salvagePopUser).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SalvagePopUser m15471parse(nb5 nb5Var) throws IOException {
            SalvagePopUser salvagePopUser = new SalvagePopUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (salvagePopUser.user == null) {
                        salvagePopUser.user = User.new_();
                    }
                    if (salvagePopUser.salvagePopUserType != null) {
                        break;
                    }
                    salvagePopUser.salvagePopUserType = (SalvagePopUserType) SalvagePopUserType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    salvagePopUser.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    salvagePopUser.salvagePopUserType = (SalvagePopUserType) nb5Var.l(SalvagePopUserType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 24) {
                        if (salvagePopUser.user == null) {
                            salvagePopUser.user = User.new_();
                        }
                        if (salvagePopUser.salvagePopUserType != null) {
                            break;
                        }
                        salvagePopUser.salvagePopUserType = (SalvagePopUserType) SalvagePopUserType.JSON_ADAPTER.defaultEnum();
                        return salvagePopUser;
                    }
                    salvagePopUser.superLikeCountBy = nb5Var.j();
                }
            }
            return salvagePopUser;
        }

        public void serialize(SalvagePopUser salvagePopUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            User user = salvagePopUser.user;
            if (user != null) {
                codedOutputByteBufferNano.K(1, user, User.PROTOBUF_ADAPTER);
            }
            SalvagePopUserType salvagePopUserType = salvagePopUser.salvagePopUserType;
            if (salvagePopUserType != null) {
                codedOutputByteBufferNano.K(2, salvagePopUserType, SalvagePopUserType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(3, salvagePopUser.superLikeCountBy);
        }
    };
    public static JsonAdapter<SalvagePopUser> JSON_ADAPTER = new ObjectJsonAdapter<SalvagePopUser>() { // from class: com.p1.mobile.putong.core.data.SalvagePopUser.2
        public Class getDataClass() {
            return SalvagePopUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SalvagePopUser m15472newInstance() {
            return new SalvagePopUser();
        }

        public boolean parseField(SalvagePopUser salvagePopUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "superLikeCountBy":
                    salvagePopUser.superLikeCountBy = jsonParser.getValueAsInt();
                    return true;
                case "user":
                    salvagePopUser.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "salvagePopUserType":
                    salvagePopUser.salvagePopUserType = (SalvagePopUserType) SalvagePopUserType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SalvagePopUser salvagePopUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "superLikeCountBy":
                case "user":
                case "salvagePopUserType":
                    return true;
                default:
                    return super.parseFieldCheck(salvagePopUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SalvagePopUser salvagePopUser, JsonGenerator jsonGenerator) throws IOException {
            if (salvagePopUser.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(salvagePopUser.user, jsonGenerator, true);
            }
            if (salvagePopUser.salvagePopUserType != null) {
                jsonGenerator.writeFieldName("salvagePopUserType");
                SalvagePopUserType.JSON_ADAPTER.serialize(salvagePopUser.salvagePopUserType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("superLikeCountBy", salvagePopUser.superLikeCountBy);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SalvagePopUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SalvagePopUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SalvagePopUser new_() {
        SalvagePopUser salvagePopUser = new SalvagePopUser();
        salvagePopUser.nullCheck();
        return salvagePopUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SalvagePopUser m15470clone() {
        SalvagePopUser salvagePopUser = new SalvagePopUser();
        User user = this.user;
        if (user != null) {
            salvagePopUser.user = user.clone();
        }
        salvagePopUser.salvagePopUserType = this.salvagePopUserType;
        salvagePopUser.superLikeCountBy = this.superLikeCountBy;
        return salvagePopUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SalvagePopUser)) {
            return false;
        }
        SalvagePopUser salvagePopUser = (SalvagePopUser) obj;
        return ValueObject.util_equals(this.user, salvagePopUser.user) && ValueObject.util_equals(this.salvagePopUserType, salvagePopUser.salvagePopUserType) && this.superLikeCountBy == salvagePopUser.superLikeCountBy;
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
        User user = this.user;
        int iHashCode = (i2 + (user != null ? user.hashCode() : 0)) * 41;
        SalvagePopUserType salvagePopUserType = this.salvagePopUserType;
        int iHashCode2 = ((iHashCode + (salvagePopUserType != null ? salvagePopUserType.hashCode() : 0)) * 41) + this.superLikeCountBy;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.user == null) {
            this.user = User.new_();
        }
        if (this.salvagePopUserType == null) {
            this.salvagePopUserType = (SalvagePopUserType) SalvagePopUserType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
