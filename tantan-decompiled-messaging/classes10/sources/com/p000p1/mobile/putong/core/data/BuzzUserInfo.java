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
public class BuzzUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzuserinfo";

    @ProtobufIndex(index = 1)
    public int age;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String gender;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String lookingForGender;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String modStatus;

    @ProtobufIndex(index = 4)
    public int popLevel;

    @ProtobufIndex(index = 8)
    public boolean seeStatus;

    @ProtobufIndex(index = 7)
    public boolean svipStatus;

    @ProtobufIndex(index = 6)
    public boolean vipStatus;
    public static ProtobufAdapter<BuzzUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzUserInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzUserInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BuzzUserInfo buzzUserInfo) {
            int iH = CodedOutputByteBufferNano.h(1, buzzUserInfo.age);
            String str = buzzUserInfo.gender;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = buzzUserInfo.lookingForGender;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, buzzUserInfo.popLevel);
            String str3 = buzzUserInfo.modStatus;
            if (str3 != null) {
                iH2 += CodedOutputByteBufferNano.o(5, str3);
            }
            int iB = iH2 + CodedOutputByteBufferNano.b(6, buzzUserInfo.vipStatus) + CodedOutputByteBufferNano.b(7, buzzUserInfo.svipStatus) + CodedOutputByteBufferNano.b(8, buzzUserInfo.seeStatus);
            ((MessageNano) buzzUserInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BuzzUserInfo m11847parse(nb5 nb5Var) throws IOException {
            BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (buzzUserInfo.gender == null) {
                        buzzUserInfo.gender = "";
                    }
                    if (buzzUserInfo.lookingForGender == null) {
                        buzzUserInfo.lookingForGender = "";
                    }
                    if (buzzUserInfo.modStatus != null) {
                        break;
                    }
                    buzzUserInfo.modStatus = "";
                    break;
                }
                if (iU == 8) {
                    buzzUserInfo.age = nb5Var.j();
                } else if (iU == 18) {
                    buzzUserInfo.gender = nb5Var.s();
                } else if (iU == 26) {
                    buzzUserInfo.lookingForGender = nb5Var.s();
                } else if (iU == 32) {
                    buzzUserInfo.popLevel = nb5Var.j();
                } else if (iU == 42) {
                    buzzUserInfo.modStatus = nb5Var.s();
                } else if (iU == 48) {
                    buzzUserInfo.vipStatus = nb5Var.g();
                } else if (iU == 56) {
                    buzzUserInfo.svipStatus = nb5Var.g();
                } else {
                    if (iU != 64) {
                        if (buzzUserInfo.gender == null) {
                            buzzUserInfo.gender = "";
                        }
                        if (buzzUserInfo.lookingForGender == null) {
                            buzzUserInfo.lookingForGender = "";
                        }
                        if (buzzUserInfo.modStatus != null) {
                            break;
                        }
                        buzzUserInfo.modStatus = "";
                        return buzzUserInfo;
                    }
                    buzzUserInfo.seeStatus = nb5Var.g();
                }
            }
            return buzzUserInfo;
        }

        public void serialize(BuzzUserInfo buzzUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, buzzUserInfo.age);
            String str = buzzUserInfo.gender;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = buzzUserInfo.lookingForGender;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, buzzUserInfo.popLevel);
            String str3 = buzzUserInfo.modStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.A(6, buzzUserInfo.vipStatus);
            codedOutputByteBufferNano.A(7, buzzUserInfo.svipStatus);
            codedOutputByteBufferNano.A(8, buzzUserInfo.seeStatus);
        }
    };
    public static JsonAdapter<BuzzUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<BuzzUserInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzUserInfo.2
        public Class getDataClass() {
            return BuzzUserInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BuzzUserInfo m11848newInstance() {
            return new BuzzUserInfo();
        }

        public boolean parseField(BuzzUserInfo buzzUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "vipStatus":
                    buzzUserInfo.vipStatus = jsonParser.getValueAsBoolean();
                    return true;
                case "gender":
                    buzzUserInfo.gender = jsonParser.getValueAsString();
                    return true;
                case "lookingForGender":
                    buzzUserInfo.lookingForGender = jsonParser.getValueAsString();
                    return true;
                case "age":
                    buzzUserInfo.age = jsonParser.getValueAsInt();
                    return true;
                case "seeStatus":
                    buzzUserInfo.seeStatus = jsonParser.getValueAsBoolean();
                    return true;
                case "popLevel":
                    buzzUserInfo.popLevel = jsonParser.getValueAsInt();
                    return true;
                case "svipStatus":
                    buzzUserInfo.svipStatus = jsonParser.getValueAsBoolean();
                    return true;
                case "modStatus":
                    buzzUserInfo.modStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BuzzUserInfo buzzUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "vipStatus":
                case "gender":
                case "lookingForGender":
                case "age":
                case "seeStatus":
                case "popLevel":
                case "svipStatus":
                case "modStatus":
                    return true;
                default:
                    return super.parseFieldCheck(buzzUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(BuzzUserInfo buzzUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("age", buzzUserInfo.age);
            String str = buzzUserInfo.gender;
            if (str != null) {
                jsonGenerator.writeStringField("gender", str);
            }
            String str2 = buzzUserInfo.lookingForGender;
            if (str2 != null) {
                jsonGenerator.writeStringField("lookingForGender", str2);
            }
            jsonGenerator.writeNumberField("popLevel", buzzUserInfo.popLevel);
            String str3 = buzzUserInfo.modStatus;
            if (str3 != null) {
                jsonGenerator.writeStringField("modStatus", str3);
            }
            jsonGenerator.writeBooleanField("vipStatus", buzzUserInfo.vipStatus);
            jsonGenerator.writeBooleanField("svipStatus", buzzUserInfo.svipStatus);
            jsonGenerator.writeBooleanField("seeStatus", buzzUserInfo.seeStatus);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzUserInfo new_() {
        BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
        buzzUserInfo.nullCheck();
        return buzzUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuzzUserInfo m11846clone() {
        BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
        buzzUserInfo.age = this.age;
        buzzUserInfo.gender = this.gender;
        buzzUserInfo.lookingForGender = this.lookingForGender;
        buzzUserInfo.popLevel = this.popLevel;
        buzzUserInfo.modStatus = this.modStatus;
        buzzUserInfo.vipStatus = this.vipStatus;
        buzzUserInfo.svipStatus = this.svipStatus;
        buzzUserInfo.seeStatus = this.seeStatus;
        return buzzUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuzzUserInfo)) {
            return false;
        }
        BuzzUserInfo buzzUserInfo = (BuzzUserInfo) obj;
        return this.age == buzzUserInfo.age && ValueObject.util_equals(this.gender, buzzUserInfo.gender) && ValueObject.util_equals(this.lookingForGender, buzzUserInfo.lookingForGender) && this.popLevel == buzzUserInfo.popLevel && ValueObject.util_equals(this.modStatus, buzzUserInfo.modStatus) && this.vipStatus == buzzUserInfo.vipStatus && this.svipStatus == buzzUserInfo.svipStatus && this.seeStatus == buzzUserInfo.seeStatus;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.age) * 41;
        String str = this.gender;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.lookingForGender;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.popLevel) * 41;
        String str3 = this.modStatus;
        int iHashCode3 = ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.vipStatus ? 1231 : 1237)) * 41) + (this.svipStatus ? 1231 : 1237)) * 41) + (this.seeStatus ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.lookingForGender == null) {
            this.lookingForGender = "";
        }
        if (this.modStatus == null) {
            this.modStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
