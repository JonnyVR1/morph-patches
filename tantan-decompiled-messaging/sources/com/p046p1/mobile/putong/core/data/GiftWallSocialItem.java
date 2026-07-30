package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Gender;
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
public class GiftWallSocialItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallsocialitem";

    @ProtobufIndex(index = 1)
    public boolean canChat;

    @NonNull
    @ProtobufIndex(index = 6)
    public Gender gender;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftAmount;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userID;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userName;
    public static ProtobufAdapter<GiftWallSocialItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallSocialItem>() { // from class: com.p1.mobile.putong.core.data.GiftWallSocialItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftWallSocialItem giftWallSocialItem) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, giftWallSocialItem.canChat);
            String str = giftWallSocialItem.giftAmount;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = giftWallSocialItem.userAvatar;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = giftWallSocialItem.userID;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = giftWallSocialItem.userName;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            Gender gender = giftWallSocialItem.gender;
            if (gender != null) {
                iM17220b += CodedOutputByteBufferNano.m17226h(6, gender.ordinal());
            }
            Gender gender2 = giftWallSocialItem.gender;
            if (gender2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, gender2, Gender.PROTOBUF_ADAPTER);
            }
            giftWallSocialItem.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftWallSocialItem parse(nb5 nb5Var) throws IOException {
            GiftWallSocialItem giftWallSocialItem = new GiftWallSocialItem();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftWallSocialItem.gender == null && numValueOf != null) {
                        giftWallSocialItem.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (giftWallSocialItem.giftAmount == null) {
                        giftWallSocialItem.giftAmount = "";
                    }
                    if (giftWallSocialItem.userAvatar == null) {
                        giftWallSocialItem.userAvatar = "";
                    }
                    if (giftWallSocialItem.userID == null) {
                        giftWallSocialItem.userID = "";
                    }
                    if (giftWallSocialItem.userName == null) {
                        giftWallSocialItem.userName = "";
                    }
                    if (giftWallSocialItem.gender != null) {
                        break;
                    }
                    giftWallSocialItem.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    giftWallSocialItem.canChat = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    giftWallSocialItem.giftAmount = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    giftWallSocialItem.userAvatar = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    giftWallSocialItem.userID = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    giftWallSocialItem.userName = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 58) {
                        if (giftWallSocialItem.gender == null && numValueOf != null) {
                            giftWallSocialItem.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (giftWallSocialItem.giftAmount == null) {
                            giftWallSocialItem.giftAmount = "";
                        }
                        if (giftWallSocialItem.userAvatar == null) {
                            giftWallSocialItem.userAvatar = "";
                        }
                        if (giftWallSocialItem.userID == null) {
                            giftWallSocialItem.userID = "";
                        }
                        if (giftWallSocialItem.userName == null) {
                            giftWallSocialItem.userName = "";
                        }
                        if (giftWallSocialItem.gender != null) {
                            break;
                        }
                        giftWallSocialItem.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        return giftWallSocialItem;
                    }
                    giftWallSocialItem.gender = (Gender) nb5Var.m158743l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return giftWallSocialItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftWallSocialItem giftWallSocialItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, giftWallSocialItem.canChat);
            String str = giftWallSocialItem.giftAmount;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = giftWallSocialItem.userAvatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = giftWallSocialItem.userID;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = giftWallSocialItem.userName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            Gender gender = giftWallSocialItem.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17250G(6, gender.ordinal());
            }
            Gender gender2 = giftWallSocialItem.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17254K(7, gender2, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftWallSocialItem> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallSocialItem>() { // from class: com.p1.mobile.putong.core.data.GiftWallSocialItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftWallSocialItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftWallSocialItem newInstance() {
            return new GiftWallSocialItem();
        }

        public boolean parseField(GiftWallSocialItem giftWallSocialItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    giftWallSocialItem.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userID":
                    giftWallSocialItem.userID = jsonParser.getValueAsString();
                    return true;
                case "giftAmount":
                    giftWallSocialItem.giftAmount = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    giftWallSocialItem.userName = jsonParser.getValueAsString();
                    return true;
                case "canChat":
                    giftWallSocialItem.canChat = jsonParser.getValueAsBoolean();
                    return true;
                case "userAvatar":
                    giftWallSocialItem.userAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftWallSocialItem giftWallSocialItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                case "userID":
                case "giftAmount":
                case "userName":
                case "canChat":
                case "userAvatar":
                    return true;
                default:
                    return super.parseFieldCheck(giftWallSocialItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftWallSocialItem giftWallSocialItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canChat", giftWallSocialItem.canChat);
            String str = giftWallSocialItem.giftAmount;
            if (str != null) {
                jsonGenerator.writeStringField("giftAmount", str);
            }
            String str2 = giftWallSocialItem.userAvatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("userAvatar", str2);
            }
            String str3 = giftWallSocialItem.userID;
            if (str3 != null) {
                jsonGenerator.writeStringField("userID", str3);
            }
            String str4 = giftWallSocialItem.userName;
            if (str4 != null) {
                jsonGenerator.writeStringField("userName", str4);
            }
            if (giftWallSocialItem.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(giftWallSocialItem.gender, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallSocialItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallSocialItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallSocialItem new_() {
        GiftWallSocialItem giftWallSocialItem = new GiftWallSocialItem();
        giftWallSocialItem.nullCheck();
        return giftWallSocialItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftWallSocialItem mo223809clone() {
        GiftWallSocialItem giftWallSocialItem = new GiftWallSocialItem();
        giftWallSocialItem.canChat = this.canChat;
        giftWallSocialItem.giftAmount = this.giftAmount;
        giftWallSocialItem.userAvatar = this.userAvatar;
        giftWallSocialItem.userID = this.userID;
        giftWallSocialItem.userName = this.userName;
        giftWallSocialItem.gender = this.gender;
        return giftWallSocialItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftWallSocialItem)) {
            return false;
        }
        GiftWallSocialItem giftWallSocialItem = (GiftWallSocialItem) obj;
        return this.canChat == giftWallSocialItem.canChat && ValueObject.util_equals(this.giftAmount, giftWallSocialItem.giftAmount) && ValueObject.util_equals(this.userAvatar, giftWallSocialItem.userAvatar) && ValueObject.util_equals(this.userID, giftWallSocialItem.userID) && ValueObject.util_equals(this.userName, giftWallSocialItem.userName) && ValueObject.util_equals(this.gender, giftWallSocialItem.gender);
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
        int i2 = ((i * 41) + (this.canChat ? 1231 : 1237)) * 41;
        String str = this.giftAmount;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userAvatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userID;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode5 = iHashCode4 + (gender != null ? gender.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftAmount == null) {
            this.giftAmount = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
