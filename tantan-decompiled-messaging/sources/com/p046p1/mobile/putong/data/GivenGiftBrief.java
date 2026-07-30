package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.qib0;

/* JADX INFO: loaded from: classes12.dex */
public class GivenGiftBrief extends ValueObject implements Cloneable, Serializable {
    public static final int ADVANCED_GIFT_LEVEL = 200;
    public static final int LUXURY_GIFT_LEVEL = 300;
    public static final int MIDDLE_GIFT_LEVEL = 100;
    public static final int NORMAL_GIFT_LEVEL = 1;
    public static final String TYPE = "givengiftbrief";

    @NonNull
    @ProtobufIndex(index = 7)
    public String comboId;

    @ProtobufIndex(index = 8)
    public int combos;

    @ProtobufIndex(index = 12)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public String fpUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String from;

    @ProtobufIndex(index = 3)
    public int giftLevel;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f38758id;

    @ProtobufIndex(index = 13)
    public boolean isFirstGivenGift;

    @ProtobufIndex(index = 2)
    public int num;

    @ProtobufIndex(index = 9)
    public boolean pollFromNetwork;

    @ProtobufIndex(index = 11)
    public int remain;

    @ProtobufIndex(index = 10)
    public int stickFacePositionType;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userName;
    public static ProtobufAdapter<GivenGiftBrief> PROTOBUF_ADAPTER = new MessageNanoAdapter<GivenGiftBrief>() { // from class: com.p1.mobile.putong.data.GivenGiftBrief.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GivenGiftBrief givenGiftBrief) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, givenGiftBrief.f38758id) + CodedOutputByteBufferNano.m17226h(2, givenGiftBrief.num) + CodedOutputByteBufferNano.m17226h(3, givenGiftBrief.giftLevel);
            String str = givenGiftBrief.from;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str);
            }
            String str2 = givenGiftBrief.fpUrl;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            String str3 = givenGiftBrief.userName;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            String str4 = givenGiftBrief.comboId;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str4);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(8, givenGiftBrief.combos) + CodedOutputByteBufferNano.m17220b(9, givenGiftBrief.pollFromNetwork) + CodedOutputByteBufferNano.m17226h(10, givenGiftBrief.stickFacePositionType) + CodedOutputByteBufferNano.m17226h(11, givenGiftBrief.remain) + CodedOutputByteBufferNano.m17228j(12, givenGiftBrief.expiredTime) + CodedOutputByteBufferNano.m17220b(13, givenGiftBrief.isFirstGivenGift);
            givenGiftBrief.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GivenGiftBrief parse(nb5 nb5Var) throws IOException {
            GivenGiftBrief givenGiftBrief = new GivenGiftBrief();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (givenGiftBrief.from == null) {
                            givenGiftBrief.from = "";
                        }
                        if (givenGiftBrief.fpUrl == null) {
                            givenGiftBrief.fpUrl = "";
                        }
                        if (givenGiftBrief.userName == null) {
                            givenGiftBrief.userName = "";
                        }
                        if (givenGiftBrief.comboId == null) {
                            givenGiftBrief.comboId = "";
                        }
                        break;
                    case 8:
                        givenGiftBrief.f38758id = nb5Var.m158741j();
                        continue;
                    case 16:
                        givenGiftBrief.num = nb5Var.m158741j();
                        continue;
                    case 24:
                        givenGiftBrief.giftLevel = nb5Var.m158741j();
                        continue;
                    case 34:
                        givenGiftBrief.from = nb5Var.m158750s();
                        continue;
                    case 42:
                        givenGiftBrief.fpUrl = nb5Var.m158750s();
                        continue;
                    case 50:
                        givenGiftBrief.userName = nb5Var.m158750s();
                        continue;
                    case 58:
                        givenGiftBrief.comboId = nb5Var.m158750s();
                        continue;
                    case 64:
                        givenGiftBrief.combos = nb5Var.m158741j();
                        continue;
                    case 72:
                        givenGiftBrief.pollFromNetwork = nb5Var.m158738g();
                        continue;
                    case 80:
                        givenGiftBrief.stickFacePositionType = nb5Var.m158741j();
                        continue;
                    case 88:
                        givenGiftBrief.remain = nb5Var.m158741j();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        givenGiftBrief.expiredTime = nb5Var.m158742k();
                        continue;
                    case 104:
                        givenGiftBrief.isFirstGivenGift = nb5Var.m158738g();
                        continue;
                    default:
                        if (givenGiftBrief.from == null) {
                            givenGiftBrief.from = "";
                        }
                        if (givenGiftBrief.fpUrl == null) {
                            givenGiftBrief.fpUrl = "";
                        }
                        if (givenGiftBrief.userName == null) {
                            givenGiftBrief.userName = "";
                        }
                        if (givenGiftBrief.comboId == null) {
                            givenGiftBrief.comboId = "";
                            return givenGiftBrief;
                        }
                        break;
                }
            }
            return givenGiftBrief;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GivenGiftBrief givenGiftBrief, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, givenGiftBrief.f38758id);
            codedOutputByteBufferNano.m17250G(2, givenGiftBrief.num);
            codedOutputByteBufferNano.m17250G(3, givenGiftBrief.giftLevel);
            String str = givenGiftBrief.from;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            String str2 = givenGiftBrief.fpUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            String str3 = givenGiftBrief.userName;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            String str4 = givenGiftBrief.comboId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(7, str4);
            }
            codedOutputByteBufferNano.m17250G(8, givenGiftBrief.combos);
            codedOutputByteBufferNano.m17244A(9, givenGiftBrief.pollFromNetwork);
            codedOutputByteBufferNano.m17250G(10, givenGiftBrief.stickFacePositionType);
            codedOutputByteBufferNano.m17250G(11, givenGiftBrief.remain);
            codedOutputByteBufferNano.m17252I(12, givenGiftBrief.expiredTime);
            codedOutputByteBufferNano.m17244A(13, givenGiftBrief.isFirstGivenGift);
        }
    };
    public static JsonAdapter<GivenGiftBrief> JSON_ADAPTER = new ObjectJsonAdapter<GivenGiftBrief>() { // from class: com.p1.mobile.putong.data.GivenGiftBrief.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GivenGiftBrief.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GivenGiftBrief newInstance() {
            return new GivenGiftBrief();
        }

        public boolean parseField(GivenGiftBrief givenGiftBrief, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "combos":
                    givenGiftBrief.combos = jsonParser.getValueAsInt();
                    return true;
                case "remain":
                    givenGiftBrief.remain = jsonParser.getValueAsInt();
                    return true;
                case "stickFacePositionType":
                    givenGiftBrief.stickFacePositionType = jsonParser.getValueAsInt();
                    return true;
                case "userName":
                    givenGiftBrief.userName = jsonParser.getValueAsString();
                    return true;
                case "pollFromNetwork":
                    givenGiftBrief.pollFromNetwork = jsonParser.getValueAsBoolean();
                    return true;
                case "expiredTime":
                    givenGiftBrief.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    givenGiftBrief.f38758id = jsonParser.getValueAsInt();
                    return false;
                case "num":
                    givenGiftBrief.num = jsonParser.getValueAsInt();
                    return true;
                case "from":
                    givenGiftBrief.from = jsonParser.getValueAsString();
                    return true;
                case "fpUrl":
                    givenGiftBrief.fpUrl = jsonParser.getValueAsString();
                    return true;
                case "giftLevel":
                    givenGiftBrief.giftLevel = jsonParser.getValueAsInt();
                    return true;
                case "comboId":
                    givenGiftBrief.comboId = jsonParser.getValueAsString();
                    return true;
                case "isFirstGivenGift":
                    givenGiftBrief.isFirstGivenGift = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GivenGiftBrief givenGiftBrief, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "combos":
                case "remain":
                case "stickFacePositionType":
                case "userName":
                case "pollFromNetwork":
                case "expiredTime":
                    return true;
                case "id":
                    return false;
                case "num":
                case "from":
                case "fpUrl":
                case "giftLevel":
                case "comboId":
                case "isFirstGivenGift":
                    return true;
                default:
                    return super.parseFieldCheck(givenGiftBrief, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GivenGiftBrief givenGiftBrief, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", givenGiftBrief.f38758id);
            jsonGenerator.writeNumberField("num", givenGiftBrief.num);
            jsonGenerator.writeNumberField("giftLevel", givenGiftBrief.giftLevel);
            String str = givenGiftBrief.from;
            if (str != null) {
                jsonGenerator.writeStringField("from", str);
            }
            String str2 = givenGiftBrief.fpUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("fpUrl", str2);
            }
            String str3 = givenGiftBrief.userName;
            if (str3 != null) {
                jsonGenerator.writeStringField("userName", str3);
            }
            String str4 = givenGiftBrief.comboId;
            if (str4 != null) {
                jsonGenerator.writeStringField("comboId", str4);
            }
            jsonGenerator.writeNumberField("combos", givenGiftBrief.combos);
            jsonGenerator.writeBooleanField("pollFromNetwork", givenGiftBrief.pollFromNetwork);
            jsonGenerator.writeNumberField("stickFacePositionType", givenGiftBrief.stickFacePositionType);
            jsonGenerator.writeNumberField("remain", givenGiftBrief.remain);
            jsonGenerator.writeNumberField("expiredTime", givenGiftBrief.expiredTime);
            jsonGenerator.writeBooleanField("isFirstGivenGift", givenGiftBrief.isFirstGivenGift);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GivenGiftBrief) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GivenGiftBrief) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public enum GiftPriority {
        otherNormal,
        otherLuxury,
        owmNormal,
        ownLuxury
    }

    public static boolean isAniToPlay(int i) {
        return i == 100 || i == 200 || i == 300;
    }

    public static boolean isHighRankGift(int i) {
        return i == 200 || i == 300;
    }

    public static boolean isMiddleRankGift(int i) {
        return i == 100;
    }

    public static GivenGiftBrief new_() {
        GivenGiftBrief givenGiftBrief = new GivenGiftBrief();
        givenGiftBrief.nullCheck();
        return givenGiftBrief;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GivenGiftBrief mo223809clone() {
        GivenGiftBrief givenGiftBrief = new GivenGiftBrief();
        givenGiftBrief.f38758id = this.f38758id;
        givenGiftBrief.num = this.num;
        givenGiftBrief.giftLevel = this.giftLevel;
        givenGiftBrief.from = this.from;
        givenGiftBrief.fpUrl = this.fpUrl;
        givenGiftBrief.userName = this.userName;
        givenGiftBrief.comboId = this.comboId;
        givenGiftBrief.combos = this.combos;
        givenGiftBrief.pollFromNetwork = this.pollFromNetwork;
        givenGiftBrief.stickFacePositionType = this.stickFacePositionType;
        givenGiftBrief.remain = this.remain;
        givenGiftBrief.expiredTime = this.expiredTime;
        givenGiftBrief.isFirstGivenGift = this.isFirstGivenGift;
        return givenGiftBrief;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GivenGiftBrief)) {
            return false;
        }
        GivenGiftBrief givenGiftBrief = (GivenGiftBrief) obj;
        return this.f38758id == givenGiftBrief.f38758id && this.num == givenGiftBrief.num && this.giftLevel == givenGiftBrief.giftLevel && ValueObject.util_equals(this.from, givenGiftBrief.from) && ValueObject.util_equals(this.fpUrl, givenGiftBrief.fpUrl) && ValueObject.util_equals(this.userName, givenGiftBrief.userName) && ValueObject.util_equals(this.comboId, givenGiftBrief.comboId) && this.combos == givenGiftBrief.combos && this.pollFromNetwork == givenGiftBrief.pollFromNetwork && this.stickFacePositionType == givenGiftBrief.stickFacePositionType && this.remain == givenGiftBrief.remain && this.expiredTime == givenGiftBrief.expiredTime && this.isFirstGivenGift == givenGiftBrief.isFirstGivenGift;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public GiftPriority getGiftPriority() {
        boolean zEquals = this.from.equals(qib0.f154714c0.userId());
        int i = this.giftLevel;
        if (zEquals) {
            return isHighRankGift(i) ? GiftPriority.ownLuxury : GiftPriority.owmNormal;
        }
        return isHighRankGift(i) ? GiftPriority.otherLuxury : GiftPriority.otherNormal;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.f38758id) * 41) + this.num) * 41) + this.giftLevel) * 41;
        String str = this.from;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.fpUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.comboId;
        int iHashCode4 = (((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.combos) * 41) + (this.pollFromNetwork ? 1231 : 1237)) * 41) + this.stickFacePositionType) * 41) + this.remain) * 41;
        long j = this.expiredTime;
        int i3 = ((iHashCode4 + ((int) (j ^ (j >>> 32)))) * 41) + (this.isFirstGivenGift ? 1231 : 1237);
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.from == null) {
            this.from = "";
        }
        if (this.fpUrl == null) {
            this.fpUrl = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.comboId == null) {
            this.comboId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
