package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class UserMedal extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usermedal";

    @ProtobufIndex(index = 3)
    public long expireTime;

    @ProtobufIndex(index = 6)
    public int familyGrade;

    @ProtobufIndex(index = 10)
    public boolean familyLight;

    @NonNull
    @ProtobufIndex(index = 5)
    public String familyText;

    @ProtobufIndex(index = 4)
    public int fanbaseGrade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39679id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveID;

    @NonNull
    @ProtobufIndex(index = 8)
    public String voiceFanbaseColor;

    @ProtobufIndex(index = 7)
    public int voiceFanbaseGrade;

    @NonNull
    @ProtobufIndex(index = 9)
    public String voiceFanbaseText;
    public static ProtobufAdapter<UserMedal> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserMedal>() { // from class: com.p1.mobile.putong.data.UserMedal.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserMedal userMedal) {
            String str = userMedal.f39679id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = userMedal.liveID;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(3, userMedal.expireTime) + CodedOutputByteBufferNano.m17281h(4, userMedal.fanbaseGrade);
            String str3 = userMedal.familyText;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(6, userMedal.familyGrade) + CodedOutputByteBufferNano.m17281h(7, userMedal.voiceFanbaseGrade);
            String str4 = userMedal.voiceFanbaseColor;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(8, str4);
            }
            String str5 = userMedal.voiceFanbaseText;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(9, str5);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(10, userMedal.familyLight);
            userMedal.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserMedal parse(nc5 nc5Var) throws IOException {
            UserMedal userMedal = new UserMedal();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (userMedal.f39679id == null) {
                            userMedal.f39679id = "";
                        }
                        if (userMedal.liveID == null) {
                            userMedal.liveID = "";
                        }
                        if (userMedal.familyText == null) {
                            userMedal.familyText = "";
                        }
                        if (userMedal.voiceFanbaseColor == null) {
                            userMedal.voiceFanbaseColor = "";
                        }
                        if (userMedal.voiceFanbaseText == null) {
                            userMedal.voiceFanbaseText = "";
                        }
                        break;
                    case 10:
                        userMedal.f39679id = nc5Var.m162495s();
                        continue;
                    case 18:
                        userMedal.liveID = nc5Var.m162495s();
                        continue;
                    case 24:
                        userMedal.expireTime = nc5Var.m162487k();
                        continue;
                    case 32:
                        userMedal.fanbaseGrade = nc5Var.m162486j();
                        continue;
                    case 42:
                        userMedal.familyText = nc5Var.m162495s();
                        continue;
                    case 48:
                        userMedal.familyGrade = nc5Var.m162486j();
                        continue;
                    case 56:
                        userMedal.voiceFanbaseGrade = nc5Var.m162486j();
                        continue;
                    case 66:
                        userMedal.voiceFanbaseColor = nc5Var.m162495s();
                        continue;
                    case 74:
                        userMedal.voiceFanbaseText = nc5Var.m162495s();
                        continue;
                    case 80:
                        userMedal.familyLight = nc5Var.m162483g();
                        continue;
                    default:
                        if (userMedal.f39679id == null) {
                            userMedal.f39679id = "";
                        }
                        if (userMedal.liveID == null) {
                            userMedal.liveID = "";
                        }
                        if (userMedal.familyText == null) {
                            userMedal.familyText = "";
                        }
                        if (userMedal.voiceFanbaseColor == null) {
                            userMedal.voiceFanbaseColor = "";
                        }
                        if (userMedal.voiceFanbaseText == null) {
                            userMedal.voiceFanbaseText = "";
                            return userMedal;
                        }
                        break;
                }
            }
            return userMedal;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserMedal userMedal, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userMedal.f39679id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = userMedal.liveID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17307I(3, userMedal.expireTime);
            codedOutputByteBufferNano.m17305G(4, userMedal.fanbaseGrade);
            String str3 = userMedal.familyText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            codedOutputByteBufferNano.m17305G(6, userMedal.familyGrade);
            codedOutputByteBufferNano.m17305G(7, userMedal.voiceFanbaseGrade);
            String str4 = userMedal.voiceFanbaseColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(8, str4);
            }
            String str5 = userMedal.voiceFanbaseText;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(9, str5);
            }
            codedOutputByteBufferNano.m17299A(10, userMedal.familyLight);
        }
    };
    public static JsonAdapter<UserMedal> JSON_ADAPTER = new ObjectJsonAdapter<UserMedal>() { // from class: com.p1.mobile.putong.data.UserMedal.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserMedal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserMedal newInstance() {
            return new UserMedal();
        }

        public boolean parseField(UserMedal userMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveID":
                    userMedal.liveID = jsonParser.getValueAsString();
                    return true;
                case "familyGrade":
                    userMedal.familyGrade = jsonParser.getValueAsInt();
                    return true;
                case "familyLight":
                    userMedal.familyLight = jsonParser.getValueAsBoolean();
                    return true;
                case "expireTime":
                    userMedal.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    userMedal.f39679id = jsonParser.getValueAsString();
                    return false;
                case "fanbaseGrade":
                    userMedal.fanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "familyText":
                    userMedal.familyText = jsonParser.getValueAsString();
                    return true;
                case "voiceFanbaseColor":
                    userMedal.voiceFanbaseColor = jsonParser.getValueAsString();
                    return true;
                case "voiceFanbaseGrade":
                    userMedal.voiceFanbaseGrade = jsonParser.getValueAsInt();
                    return true;
                case "voiceFanbaseText":
                    userMedal.voiceFanbaseText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserMedal userMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveID":
                case "familyGrade":
                case "familyLight":
                case "expireTime":
                    return true;
                case "id":
                    return false;
                case "fanbaseGrade":
                case "familyText":
                case "voiceFanbaseColor":
                case "voiceFanbaseGrade":
                case "voiceFanbaseText":
                    return true;
                default:
                    return super.parseFieldCheck(userMedal, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserMedal userMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = userMedal.f39679id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = userMedal.liveID;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveID", str2);
            }
            jsonGenerator.writeNumberField("expireTime", userMedal.expireTime);
            jsonGenerator.writeNumberField("fanbaseGrade", userMedal.fanbaseGrade);
            String str3 = userMedal.familyText;
            if (str3 != null) {
                jsonGenerator.writeStringField("familyText", str3);
            }
            jsonGenerator.writeNumberField("familyGrade", userMedal.familyGrade);
            jsonGenerator.writeNumberField("voiceFanbaseGrade", userMedal.voiceFanbaseGrade);
            String str4 = userMedal.voiceFanbaseColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceFanbaseColor", str4);
            }
            String str5 = userMedal.voiceFanbaseText;
            if (str5 != null) {
                jsonGenerator.writeStringField("voiceFanbaseText", str5);
            }
            jsonGenerator.writeBooleanField("familyLight", userMedal.familyLight);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserMedal new_() {
        UserMedal userMedal = new UserMedal();
        userMedal.nullCheck();
        return userMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserMedal mo225055clone() {
        UserMedal userMedal = new UserMedal();
        userMedal.f39679id = this.f39679id;
        userMedal.liveID = this.liveID;
        userMedal.expireTime = this.expireTime;
        userMedal.fanbaseGrade = this.fanbaseGrade;
        userMedal.familyText = this.familyText;
        userMedal.familyGrade = this.familyGrade;
        userMedal.voiceFanbaseGrade = this.voiceFanbaseGrade;
        userMedal.voiceFanbaseColor = this.voiceFanbaseColor;
        userMedal.voiceFanbaseText = this.voiceFanbaseText;
        userMedal.familyLight = this.familyLight;
        return userMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserMedal)) {
            return false;
        }
        UserMedal userMedal = (UserMedal) obj;
        return ValueObject.util_equals(this.f39679id, userMedal.f39679id) && ValueObject.util_equals(this.liveID, userMedal.liveID) && this.expireTime == userMedal.expireTime && this.fanbaseGrade == userMedal.fanbaseGrade && ValueObject.util_equals(this.familyText, userMedal.familyText) && this.familyGrade == userMedal.familyGrade && this.voiceFanbaseGrade == userMedal.voiceFanbaseGrade && ValueObject.util_equals(this.voiceFanbaseColor, userMedal.voiceFanbaseColor) && ValueObject.util_equals(this.voiceFanbaseText, userMedal.voiceFanbaseText) && this.familyLight == userMedal.familyLight;
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
        String str = this.f39679id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveID;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.fanbaseGrade) * 41;
        String str3 = this.familyText;
        int iHashCode3 = (((((i3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.familyGrade) * 41) + this.voiceFanbaseGrade) * 41;
        String str4 = this.voiceFanbaseColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.voiceFanbaseText;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.familyLight ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39679id == null) {
            this.f39679id = "";
        }
        if (this.liveID == null) {
            this.liveID = "";
        }
        if (this.familyText == null) {
            this.familyText = "";
        }
        if (this.voiceFanbaseColor == null) {
            this.voiceFanbaseColor = "";
        }
        if (this.voiceFanbaseText == null) {
            this.voiceFanbaseText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
