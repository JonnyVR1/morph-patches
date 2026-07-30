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
public class HappyBirthdaySuggestUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "happybirthdaysuggestuser";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String birthday;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f74id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String imgs;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @ProtobufIndex(index = 4)
    public boolean selected;
    public static ProtobufAdapter<HappyBirthdaySuggestUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<HappyBirthdaySuggestUser>() { // from class: com.p1.mobile.putong.core.data.HappyBirthdaySuggestUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HappyBirthdaySuggestUser happyBirthdaySuggestUser) {
            String str = happyBirthdaySuggestUser.f74id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = happyBirthdaySuggestUser.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = happyBirthdaySuggestUser.imgs;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, happyBirthdaySuggestUser.selected);
            String str4 = happyBirthdaySuggestUser.birthday;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) happyBirthdaySuggestUser).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HappyBirthdaySuggestUser m13219parse(nb5 nb5Var) throws IOException {
            HappyBirthdaySuggestUser happyBirthdaySuggestUser = new HappyBirthdaySuggestUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (happyBirthdaySuggestUser.f74id == null) {
                        happyBirthdaySuggestUser.f74id = "";
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
                if (iU == 10) {
                    happyBirthdaySuggestUser.f74id = nb5Var.s();
                } else if (iU == 18) {
                    happyBirthdaySuggestUser.name = nb5Var.s();
                } else if (iU == 26) {
                    happyBirthdaySuggestUser.imgs = nb5Var.s();
                } else if (iU == 32) {
                    happyBirthdaySuggestUser.selected = nb5Var.g();
                } else {
                    if (iU != 42) {
                        if (happyBirthdaySuggestUser.f74id == null) {
                            happyBirthdaySuggestUser.f74id = "";
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
                    happyBirthdaySuggestUser.birthday = nb5Var.s();
                }
            }
            return happyBirthdaySuggestUser;
        }

        public void serialize(HappyBirthdaySuggestUser happyBirthdaySuggestUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = happyBirthdaySuggestUser.f74id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = happyBirthdaySuggestUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = happyBirthdaySuggestUser.imgs;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, happyBirthdaySuggestUser.selected);
            String str4 = happyBirthdaySuggestUser.birthday;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<HappyBirthdaySuggestUser> JSON_ADAPTER = new ObjectJsonAdapter<HappyBirthdaySuggestUser>() { // from class: com.p1.mobile.putong.core.data.HappyBirthdaySuggestUser.2
        public Class getDataClass() {
            return HappyBirthdaySuggestUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HappyBirthdaySuggestUser m13220newInstance() {
            return new HappyBirthdaySuggestUser();
        }

        public boolean parseField(HappyBirthdaySuggestUser happyBirthdaySuggestUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    happyBirthdaySuggestUser.f74id = jsonParser.getValueAsString();
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

        public void serializeFields(HappyBirthdaySuggestUser happyBirthdaySuggestUser, JsonGenerator jsonGenerator) throws IOException {
            String str = happyBirthdaySuggestUser.f74id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = happyBirthdaySuggestUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = happyBirthdaySuggestUser.imgs;
            if (str3 != null) {
                jsonGenerator.writeStringField("imgs", str3);
            }
            jsonGenerator.writeBooleanField("selected", happyBirthdaySuggestUser.selected);
            String str4 = happyBirthdaySuggestUser.birthday;
            if (str4 != null) {
                jsonGenerator.writeStringField("birthday", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HappyBirthdaySuggestUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HappyBirthdaySuggestUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HappyBirthdaySuggestUser new_() {
        HappyBirthdaySuggestUser happyBirthdaySuggestUser = new HappyBirthdaySuggestUser();
        happyBirthdaySuggestUser.nullCheck();
        return happyBirthdaySuggestUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HappyBirthdaySuggestUser m13218clone() {
        HappyBirthdaySuggestUser happyBirthdaySuggestUser = new HappyBirthdaySuggestUser();
        happyBirthdaySuggestUser.f74id = this.f74id;
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
        return ValueObject.util_equals(this.f74id, happyBirthdaySuggestUser.f74id) && ValueObject.util_equals(this.name, happyBirthdaySuggestUser.name) && ValueObject.util_equals(this.imgs, happyBirthdaySuggestUser.imgs) && this.selected == happyBirthdaySuggestUser.selected && ValueObject.util_equals(this.birthday, happyBirthdaySuggestUser.birthday);
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
        String str = this.f74id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.imgs;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237)) * 41;
        String str4 = this.birthday;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f74id == null) {
            this.f74id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
