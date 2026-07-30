package com.p000p1.mobile.putong.core.data;

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
public class UserTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usertags";

    @ProtobufIndex(index = 1)
    public boolean liveBigR;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean noSvipShowQuickchatBuy;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean promotionShowSvip;

    @ProtobufIndex(index = 6)
    public boolean showFemaleAdCardInsert;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean showFemaleAdPopUp;

    @ProtobufIndex(index = 4)
    public boolean showODiamondBanner;
    public static ProtobufAdapter<UserTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserTags>() { // from class: com.p1.mobile.putong.core.data.UserTags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserTags userTags) {
            int iB = CodedOutputByteBufferNano.b(1, userTags.liveBigR) + CodedOutputByteBufferNano.b(2, userTags.noSvipShowQuickchatBuy) + CodedOutputByteBufferNano.b(3, userTags.promotionShowSvip) + CodedOutputByteBufferNano.b(4, userTags.showODiamondBanner) + CodedOutputByteBufferNano.b(5, userTags.showFemaleAdPopUp) + CodedOutputByteBufferNano.b(6, userTags.showFemaleAdCardInsert);
            ((MessageNano) userTags).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserTags m16192parse(nb5 nb5Var) throws IOException {
            UserTags userTags = new UserTags();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    userTags.liveBigR = nb5Var.g();
                } else if (iU == 16) {
                    userTags.noSvipShowQuickchatBuy = nb5Var.g();
                } else if (iU == 24) {
                    userTags.promotionShowSvip = nb5Var.g();
                } else if (iU == 32) {
                    userTags.showODiamondBanner = nb5Var.g();
                } else if (iU == 40) {
                    userTags.showFemaleAdPopUp = nb5Var.g();
                } else {
                    if (iU != 48) {
                        return userTags;
                    }
                    userTags.showFemaleAdCardInsert = nb5Var.g();
                }
            }
        }

        public void serialize(UserTags userTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, userTags.liveBigR);
            codedOutputByteBufferNano.A(2, userTags.noSvipShowQuickchatBuy);
            codedOutputByteBufferNano.A(3, userTags.promotionShowSvip);
            codedOutputByteBufferNano.A(4, userTags.showODiamondBanner);
            codedOutputByteBufferNano.A(5, userTags.showFemaleAdPopUp);
            codedOutputByteBufferNano.A(6, userTags.showFemaleAdCardInsert);
        }
    };
    public static JsonAdapter<UserTags> JSON_ADAPTER = new ObjectJsonAdapter<UserTags>() { // from class: com.p1.mobile.putong.core.data.UserTags.2
        public Class getDataClass() {
            return UserTags.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserTags m16193newInstance() {
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

        public void serializeFields(UserTags userTags, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("liveBigR", userTags.liveBigR);
            jsonGenerator.writeBooleanField("noSvipShowQuickchatBuy", userTags.noSvipShowQuickchatBuy);
            jsonGenerator.writeBooleanField("promotionShowSvip", userTags.promotionShowSvip);
            jsonGenerator.writeBooleanField("showODiamondBanner", userTags.showODiamondBanner);
            jsonGenerator.writeBooleanField("showFemaleAdPopUp", userTags.showFemaleAdPopUp);
            jsonGenerator.writeBooleanField("showFemaleAdCardInsert", userTags.showFemaleAdCardInsert);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserTags new_() {
        UserTags userTags = new UserTags();
        userTags.nullCheck();
        return userTags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserTags m16191clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.liveBigR ? 1231 : 1237)) * 41) + (this.noSvipShowQuickchatBuy ? 1231 : 1237)) * 41) + (this.promotionShowSvip ? 1231 : 1237)) * 41) + (this.showODiamondBanner ? 1231 : 1237)) * 41) + (this.showFemaleAdPopUp ? 1231 : 1237)) * 41) + (this.showFemaleAdCardInsert ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
