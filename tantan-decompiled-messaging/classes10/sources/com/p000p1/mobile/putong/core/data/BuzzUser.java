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
public class BuzzUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzuser";

    @ProtobufIndex(index = 6)
    public int age;

    @NonNull
    @ProtobufIndex(index = 4)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String buzzToken;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String gender;

    @ProtobufIndex(index = 7)
    public boolean isBlur;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<BuzzUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzUser>() { // from class: com.p1.mobile.putong.core.data.BuzzUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BuzzUser buzzUser) {
            String str = buzzUser.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = buzzUser.buzzToken;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = buzzUser.gender;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = buzzUser.avatar;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = buzzUser.name;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iH = iO + CodedOutputByteBufferNano.h(6, buzzUser.age) + CodedOutputByteBufferNano.b(7, buzzUser.isBlur);
            ((MessageNano) buzzUser).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BuzzUser m11843parse(nb5 nb5Var) throws IOException {
            BuzzUser buzzUser = new BuzzUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (buzzUser.userId == null) {
                        buzzUser.userId = "";
                    }
                    if (buzzUser.buzzToken == null) {
                        buzzUser.buzzToken = "";
                    }
                    if (buzzUser.gender == null) {
                        buzzUser.gender = "";
                    }
                    if (buzzUser.avatar == null) {
                        buzzUser.avatar = "";
                    }
                    if (buzzUser.name != null) {
                        break;
                    }
                    buzzUser.name = "";
                    break;
                }
                if (iU == 10) {
                    buzzUser.userId = nb5Var.s();
                } else if (iU == 18) {
                    buzzUser.buzzToken = nb5Var.s();
                } else if (iU == 26) {
                    buzzUser.gender = nb5Var.s();
                } else if (iU == 34) {
                    buzzUser.avatar = nb5Var.s();
                } else if (iU == 42) {
                    buzzUser.name = nb5Var.s();
                } else if (iU == 48) {
                    buzzUser.age = nb5Var.j();
                } else {
                    if (iU != 56) {
                        if (buzzUser.userId == null) {
                            buzzUser.userId = "";
                        }
                        if (buzzUser.buzzToken == null) {
                            buzzUser.buzzToken = "";
                        }
                        if (buzzUser.gender == null) {
                            buzzUser.gender = "";
                        }
                        if (buzzUser.avatar == null) {
                            buzzUser.avatar = "";
                        }
                        if (buzzUser.name != null) {
                            break;
                        }
                        buzzUser.name = "";
                        return buzzUser;
                    }
                    buzzUser.isBlur = nb5Var.g();
                }
            }
            return buzzUser;
        }

        public void serialize(BuzzUser buzzUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = buzzUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = buzzUser.buzzToken;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = buzzUser.gender;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = buzzUser.avatar;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = buzzUser.name;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.G(6, buzzUser.age);
            codedOutputByteBufferNano.A(7, buzzUser.isBlur);
        }
    };
    public static JsonAdapter<BuzzUser> JSON_ADAPTER = new ObjectJsonAdapter<BuzzUser>() { // from class: com.p1.mobile.putong.core.data.BuzzUser.2
        public Class getDataClass() {
            return BuzzUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BuzzUser m11844newInstance() {
            return new BuzzUser();
        }

        public boolean parseField(BuzzUser buzzUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    buzzUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    buzzUser.gender = jsonParser.getValueAsString();
                    return true;
                case "isBlur":
                    buzzUser.isBlur = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    buzzUser.userId = jsonParser.getValueAsString();
                    return true;
                case "age":
                    buzzUser.age = jsonParser.getValueAsInt();
                    return true;
                case "name":
                    buzzUser.name = jsonParser.getValueAsString();
                    return true;
                case "buzzToken":
                    buzzUser.buzzToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BuzzUser buzzUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                case "gender":
                case "isBlur":
                case "userId":
                case "age":
                case "name":
                case "buzzToken":
                    return true;
                default:
                    return super.parseFieldCheck(buzzUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(BuzzUser buzzUser, JsonGenerator jsonGenerator) throws IOException {
            String str = buzzUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = buzzUser.buzzToken;
            if (str2 != null) {
                jsonGenerator.writeStringField("buzzToken", str2);
            }
            String str3 = buzzUser.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            String str4 = buzzUser.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str4);
            }
            String str5 = buzzUser.name;
            if (str5 != null) {
                jsonGenerator.writeStringField("name", str5);
            }
            jsonGenerator.writeNumberField("age", buzzUser.age);
            jsonGenerator.writeBooleanField("isBlur", buzzUser.isBlur);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzUser new_() {
        BuzzUser buzzUser = new BuzzUser();
        buzzUser.nullCheck();
        return buzzUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuzzUser m11842clone() {
        BuzzUser buzzUser = new BuzzUser();
        buzzUser.userId = this.userId;
        buzzUser.buzzToken = this.buzzToken;
        buzzUser.gender = this.gender;
        buzzUser.avatar = this.avatar;
        buzzUser.name = this.name;
        buzzUser.age = this.age;
        buzzUser.isBlur = this.isBlur;
        return buzzUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuzzUser)) {
            return false;
        }
        BuzzUser buzzUser = (BuzzUser) obj;
        return ValueObject.util_equals(this.userId, buzzUser.userId) && ValueObject.util_equals(this.buzzToken, buzzUser.buzzToken) && ValueObject.util_equals(this.gender, buzzUser.gender) && ValueObject.util_equals(this.avatar, buzzUser.avatar) && ValueObject.util_equals(this.name, buzzUser.name) && this.age == buzzUser.age && this.isBlur == buzzUser.isBlur;
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
        String str2 = this.buzzToken;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.name;
        int iHashCode5 = ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.age) * 41) + (this.isBlur ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.buzzToken == null) {
            this.buzzToken = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
