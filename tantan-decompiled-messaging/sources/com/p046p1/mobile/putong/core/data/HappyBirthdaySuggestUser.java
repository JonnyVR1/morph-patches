package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MatchFrom;
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
public class HappyBirthdaySuggestUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "happybirthdaysuggestuser";

    @NonNull
    @ProtobufIndex(index = 5)
    public String birthday;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20412id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String imgs;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 4)
    public boolean selected;
    public static ProtobufAdapter<HappyBirthdaySuggestUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<HappyBirthdaySuggestUser>() { // from class: com.p1.mobile.putong.core.data.HappyBirthdaySuggestUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HappyBirthdaySuggestUser happyBirthdaySuggestUser) {
            String str = happyBirthdaySuggestUser.f20412id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = happyBirthdaySuggestUser.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = happyBirthdaySuggestUser.imgs;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(4, happyBirthdaySuggestUser.selected);
            String str4 = happyBirthdaySuggestUser.birthday;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            happyBirthdaySuggestUser.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HappyBirthdaySuggestUser parse(nb5 nb5Var) throws IOException {
            HappyBirthdaySuggestUser happyBirthdaySuggestUser = new HappyBirthdaySuggestUser();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (happyBirthdaySuggestUser.f20412id == null) {
                        happyBirthdaySuggestUser.f20412id = "";
                    }
                    if (happyBirthdaySuggestUser.name == null) {
                        happyBirthdaySuggestUser.name = "";
                    }
                    if (happyBirthdaySuggestUser.imgs == null) {
                        happyBirthdaySuggestUser.imgs = "";
                    }
                    if (happyBirthdaySuggestUser.birthday != null) {
                        break;
                    }
                    happyBirthdaySuggestUser.birthday = "";
                    break;
                }
                if (iM158752u == 10) {
                    happyBirthdaySuggestUser.f20412id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    happyBirthdaySuggestUser.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    happyBirthdaySuggestUser.imgs = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    happyBirthdaySuggestUser.selected = nb5Var.m158738g();
                } else {
                    if (iM158752u != 42) {
                        if (happyBirthdaySuggestUser.f20412id == null) {
                            happyBirthdaySuggestUser.f20412id = "";
                        }
                        if (happyBirthdaySuggestUser.name == null) {
                            happyBirthdaySuggestUser.name = "";
                        }
                        if (happyBirthdaySuggestUser.imgs == null) {
                            happyBirthdaySuggestUser.imgs = "";
                        }
                        if (happyBirthdaySuggestUser.birthday != null) {
                            break;
                        }
                        happyBirthdaySuggestUser.birthday = "";
                        return happyBirthdaySuggestUser;
                    }
                    happyBirthdaySuggestUser.birthday = nb5Var.m158750s();
                }
            }
            return happyBirthdaySuggestUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HappyBirthdaySuggestUser happyBirthdaySuggestUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = happyBirthdaySuggestUser.f20412id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = happyBirthdaySuggestUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = happyBirthdaySuggestUser.imgs;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17244A(4, happyBirthdaySuggestUser.selected);
            String str4 = happyBirthdaySuggestUser.birthday;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
        }
    };
    public static JsonAdapter<HappyBirthdaySuggestUser> JSON_ADAPTER = new ObjectJsonAdapter<HappyBirthdaySuggestUser>() { // from class: com.p1.mobile.putong.core.data.HappyBirthdaySuggestUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HappyBirthdaySuggestUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HappyBirthdaySuggestUser newInstance() {
            return new HappyBirthdaySuggestUser();
        }

        public boolean parseField(HappyBirthdaySuggestUser happyBirthdaySuggestUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    happyBirthdaySuggestUser.f20412id = jsonParser.getValueAsString();
                    return false;
                case "imgs":
                    happyBirthdaySuggestUser.imgs = jsonParser.getValueAsString();
                    return true;
                case "name":
                    happyBirthdaySuggestUser.name = jsonParser.getValueAsString();
                    return true;
                case "birthday":
                    happyBirthdaySuggestUser.birthday = jsonParser.getValueAsString();
                    return true;
                case "selected":
                    happyBirthdaySuggestUser.selected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HappyBirthdaySuggestUser happyBirthdaySuggestUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "imgs":
                case "name":
                case "birthday":
                case "selected":
                    return true;
                default:
                    return super.parseFieldCheck(happyBirthdaySuggestUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HappyBirthdaySuggestUser happyBirthdaySuggestUser, JsonGenerator jsonGenerator) throws IOException {
            String str = happyBirthdaySuggestUser.f20412id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = happyBirthdaySuggestUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = happyBirthdaySuggestUser.imgs;
            if (str3 != null) {
                jsonGenerator.writeStringField("imgs", str3);
            }
            jsonGenerator.writeBooleanField(MatchFrom.selected, happyBirthdaySuggestUser.selected);
            String str4 = happyBirthdaySuggestUser.birthday;
            if (str4 != null) {
                jsonGenerator.writeStringField("birthday", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HappyBirthdaySuggestUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HappyBirthdaySuggestUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HappyBirthdaySuggestUser new_() {
        HappyBirthdaySuggestUser happyBirthdaySuggestUser = new HappyBirthdaySuggestUser();
        happyBirthdaySuggestUser.nullCheck();
        return happyBirthdaySuggestUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HappyBirthdaySuggestUser mo223809clone() {
        HappyBirthdaySuggestUser happyBirthdaySuggestUser = new HappyBirthdaySuggestUser();
        happyBirthdaySuggestUser.f20412id = this.f20412id;
        happyBirthdaySuggestUser.name = this.name;
        happyBirthdaySuggestUser.imgs = this.imgs;
        happyBirthdaySuggestUser.selected = this.selected;
        happyBirthdaySuggestUser.birthday = this.birthday;
        return happyBirthdaySuggestUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HappyBirthdaySuggestUser)) {
            return false;
        }
        HappyBirthdaySuggestUser happyBirthdaySuggestUser = (HappyBirthdaySuggestUser) obj;
        return ValueObject.util_equals(this.f20412id, happyBirthdaySuggestUser.f20412id) && ValueObject.util_equals(this.name, happyBirthdaySuggestUser.name) && ValueObject.util_equals(this.imgs, happyBirthdaySuggestUser.imgs) && this.selected == happyBirthdaySuggestUser.selected && ValueObject.util_equals(this.birthday, happyBirthdaySuggestUser.birthday);
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
        String str = this.f20412id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.imgs;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237)) * 41;
        String str4 = this.birthday;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20412id == null) {
            this.f20412id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.imgs == null) {
            this.imgs = "";
        }
        if (this.birthday == null) {
            this.birthday = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
