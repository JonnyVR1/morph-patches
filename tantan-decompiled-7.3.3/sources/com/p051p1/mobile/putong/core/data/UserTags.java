package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class UserTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usertags";

    @ProtobufIndex(index = 1)
    public boolean liveBigR;

    @ProtobufIndex(index = 2)
    public boolean noSvipShowQuickchatBuy;

    @ProtobufIndex(index = 3)
    public boolean promotionShowSvip;

    @ProtobufIndex(index = 6)
    public boolean showFemaleAdCardInsert;

    @ProtobufIndex(index = 5)
    public boolean showFemaleAdPopUp;

    @ProtobufIndex(index = 4)
    public boolean showODiamondBanner;
    public static ProtobufAdapter<UserTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserTags>() { // from class: com.p1.mobile.putong.core.data.UserTags.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserTags userTags) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, userTags.liveBigR) + CodedOutputByteBufferNano.m17275b(2, userTags.noSvipShowQuickchatBuy) + CodedOutputByteBufferNano.m17275b(3, userTags.promotionShowSvip) + CodedOutputByteBufferNano.m17275b(4, userTags.showODiamondBanner) + CodedOutputByteBufferNano.m17275b(5, userTags.showFemaleAdPopUp) + CodedOutputByteBufferNano.m17275b(6, userTags.showFemaleAdCardInsert);
            userTags.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserTags parse(nc5 nc5Var) throws IOException {
            UserTags userTags = new UserTags();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    userTags.liveBigR = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    userTags.noSvipShowQuickchatBuy = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    userTags.promotionShowSvip = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    userTags.showODiamondBanner = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    userTags.showFemaleAdPopUp = nc5Var.m162483g();
                } else {
                    if (iM162497u != 48) {
                        return userTags;
                    }
                    userTags.showFemaleAdCardInsert = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserTags userTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, userTags.liveBigR);
            codedOutputByteBufferNano.m17299A(2, userTags.noSvipShowQuickchatBuy);
            codedOutputByteBufferNano.m17299A(3, userTags.promotionShowSvip);
            codedOutputByteBufferNano.m17299A(4, userTags.showODiamondBanner);
            codedOutputByteBufferNano.m17299A(5, userTags.showFemaleAdPopUp);
            codedOutputByteBufferNano.m17299A(6, userTags.showFemaleAdCardInsert);
        }
    };
    public static JsonAdapter<UserTags> JSON_ADAPTER = new ObjectJsonAdapter<UserTags>() { // from class: com.p1.mobile.putong.core.data.UserTags.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserTags.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserTags newInstance() {
            return new UserTags();
        }

        public boolean parseField(UserTags userTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showFemaleAdPopUp":
                    userTags.showFemaleAdPopUp = jsonParser.getValueAsBoolean();
                    return true;
                case "noSvipShowQuickchatBuy":
                    userTags.noSvipShowQuickchatBuy = jsonParser.getValueAsBoolean();
                    return true;
                case "showFemaleAdCardInsert":
                    userTags.showFemaleAdCardInsert = jsonParser.getValueAsBoolean();
                    return true;
                case "liveBigR":
                    userTags.liveBigR = jsonParser.getValueAsBoolean();
                    return true;
                case "showODiamondBanner":
                    userTags.showODiamondBanner = jsonParser.getValueAsBoolean();
                    return true;
                case "promotionShowSvip":
                    userTags.promotionShowSvip = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserTags userTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showFemaleAdPopUp":
                case "noSvipShowQuickchatBuy":
                case "showFemaleAdCardInsert":
                case "liveBigR":
                case "showODiamondBanner":
                case "promotionShowSvip":
                    return true;
                default:
                    return super.parseFieldCheck(userTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserTags userTags, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("liveBigR", userTags.liveBigR);
            jsonGenerator.writeBooleanField("noSvipShowQuickchatBuy", userTags.noSvipShowQuickchatBuy);
            jsonGenerator.writeBooleanField("promotionShowSvip", userTags.promotionShowSvip);
            jsonGenerator.writeBooleanField("showODiamondBanner", userTags.showODiamondBanner);
            jsonGenerator.writeBooleanField("showFemaleAdPopUp", userTags.showFemaleAdPopUp);
            jsonGenerator.writeBooleanField("showFemaleAdCardInsert", userTags.showFemaleAdCardInsert);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserTags new_() {
        UserTags userTags = new UserTags();
        userTags.nullCheck();
        return userTags;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserTags mo225055clone() {
        UserTags userTags = new UserTags();
        userTags.liveBigR = this.liveBigR;
        userTags.noSvipShowQuickchatBuy = this.noSvipShowQuickchatBuy;
        userTags.promotionShowSvip = this.promotionShowSvip;
        userTags.showODiamondBanner = this.showODiamondBanner;
        userTags.showFemaleAdPopUp = this.showFemaleAdPopUp;
        userTags.showFemaleAdCardInsert = this.showFemaleAdCardInsert;
        return userTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserTags)) {
            return false;
        }
        UserTags userTags = (UserTags) obj;
        return this.liveBigR == userTags.liveBigR && this.noSvipShowQuickchatBuy == userTags.noSvipShowQuickchatBuy && this.promotionShowSvip == userTags.promotionShowSvip && this.showODiamondBanner == userTags.showODiamondBanner && this.showFemaleAdPopUp == userTags.showFemaleAdPopUp && this.showFemaleAdCardInsert == userTags.showFemaleAdCardInsert;
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
        int i2 = (((((((((((i * 41) + (this.liveBigR ? 1231 : 1237)) * 41) + (this.noSvipShowQuickchatBuy ? 1231 : 1237)) * 41) + (this.promotionShowSvip ? 1231 : 1237)) * 41) + (this.showODiamondBanner ? 1231 : 1237)) * 41) + (this.showFemaleAdPopUp ? 1231 : 1237)) * 41) + (this.showFemaleAdCardInsert ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
