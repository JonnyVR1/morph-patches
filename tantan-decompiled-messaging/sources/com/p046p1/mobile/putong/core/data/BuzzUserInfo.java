package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
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

/* JADX INFO: loaded from: classes10.dex */
public class BuzzUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzuserinfo";

    @ProtobufIndex(index = 1)
    public int age;

    @NonNull
    @ProtobufIndex(index = 2)
    public String gender;

    @NonNull
    @ProtobufIndex(index = 3)
    public String lookingForGender;

    @NonNull
    @ProtobufIndex(index = 5)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BuzzUserInfo buzzUserInfo) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, buzzUserInfo.age);
            String str = buzzUserInfo.gender;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = buzzUserInfo.lookingForGender;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(4, buzzUserInfo.popLevel);
            String str3 = buzzUserInfo.modStatus;
            if (str3 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            int iM17220b = iM17226h2 + CodedOutputByteBufferNano.m17220b(6, buzzUserInfo.vipStatus) + CodedOutputByteBufferNano.m17220b(7, buzzUserInfo.svipStatus) + CodedOutputByteBufferNano.m17220b(8, buzzUserInfo.seeStatus);
            buzzUserInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BuzzUserInfo parse(nb5 nb5Var) throws IOException {
            BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 8) {
                    buzzUserInfo.age = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    buzzUserInfo.gender = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    buzzUserInfo.lookingForGender = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    buzzUserInfo.popLevel = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    buzzUserInfo.modStatus = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    buzzUserInfo.vipStatus = nb5Var.m158738g();
                } else if (iM158752u == 56) {
                    buzzUserInfo.svipStatus = nb5Var.m158738g();
                } else {
                    if (iM158752u != 64) {
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
                    buzzUserInfo.seeStatus = nb5Var.m158738g();
                }
            }
            return buzzUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BuzzUserInfo buzzUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, buzzUserInfo.age);
            String str = buzzUserInfo.gender;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = buzzUserInfo.lookingForGender;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17250G(4, buzzUserInfo.popLevel);
            String str3 = buzzUserInfo.modStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            codedOutputByteBufferNano.m17244A(6, buzzUserInfo.vipStatus);
            codedOutputByteBufferNano.m17244A(7, buzzUserInfo.svipStatus);
            codedOutputByteBufferNano.m17244A(8, buzzUserInfo.seeStatus);
        }
    };
    public static JsonAdapter<BuzzUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<BuzzUserInfo>() { // from class: com.p1.mobile.putong.core.data.BuzzUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BuzzUserInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BuzzUserInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuzzUserInfo buzzUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, buzzUserInfo.age);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzUserInfo new_() {
        BuzzUserInfo buzzUserInfo = new BuzzUserInfo();
        buzzUserInfo.nullCheck();
        return buzzUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BuzzUserInfo mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
