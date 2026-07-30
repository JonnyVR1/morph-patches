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
public class GiftWallRankInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallrankinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String city;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String country;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String district;

    @NonNull
    @ProtobufIndex(index = 4)
    public String province;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String rank;

    @NonNull
    @ProtobufIndex(index = 6)
    public RankLevel rankLevel;

    @ProtobufIndex(index = 7)
    public int totalGiftAmount;
    public static ProtobufAdapter<GiftWallRankInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallRankInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallRankInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftWallRankInfo giftWallRankInfo) {
            String str = giftWallRankInfo.city;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = giftWallRankInfo.country;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = giftWallRankInfo.district;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = giftWallRankInfo.province;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = giftWallRankInfo.rank;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            RankLevel rankLevel = giftWallRankInfo.rankLevel;
            if (rankLevel != null) {
                iO += CodedOutputByteBufferNano.h(6, rankLevel.ordinal());
            }
            int iH = iO + CodedOutputByteBufferNano.h(7, giftWallRankInfo.totalGiftAmount);
            RankLevel rankLevel2 = giftWallRankInfo.rankLevel;
            if (rankLevel2 != null) {
                iH += CodedOutputByteBufferNano.l(8, rankLevel2, RankLevel.PROTOBUF_ADAPTER);
            }
            ((MessageNano) giftWallRankInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftWallRankInfo m12973parse(nb5 nb5Var) throws IOException {
            GiftWallRankInfo giftWallRankInfo = new GiftWallRankInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (giftWallRankInfo.rankLevel == null && numValueOf != null) {
                        giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (giftWallRankInfo.city == null) {
                        giftWallRankInfo.city = "";
                    }
                    if (giftWallRankInfo.country == null) {
                        giftWallRankInfo.country = "";
                    }
                    if (giftWallRankInfo.district == null) {
                        giftWallRankInfo.district = "";
                    }
                    if (giftWallRankInfo.province == null) {
                        giftWallRankInfo.province = "";
                    }
                    if (giftWallRankInfo.rank == null) {
                        giftWallRankInfo.rank = "";
                    }
                    if (giftWallRankInfo.rankLevel != null) {
                        break;
                    }
                    giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    giftWallRankInfo.city = nb5Var.s();
                } else if (iU == 18) {
                    giftWallRankInfo.country = nb5Var.s();
                } else if (iU == 26) {
                    giftWallRankInfo.district = nb5Var.s();
                } else if (iU == 34) {
                    giftWallRankInfo.province = nb5Var.s();
                } else if (iU == 42) {
                    giftWallRankInfo.rank = nb5Var.s();
                } else if (iU == 48) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 56) {
                    giftWallRankInfo.totalGiftAmount = nb5Var.j();
                } else {
                    if (iU != 66) {
                        if (giftWallRankInfo.rankLevel == null && numValueOf != null) {
                            giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (giftWallRankInfo.city == null) {
                            giftWallRankInfo.city = "";
                        }
                        if (giftWallRankInfo.country == null) {
                            giftWallRankInfo.country = "";
                        }
                        if (giftWallRankInfo.district == null) {
                            giftWallRankInfo.district = "";
                        }
                        if (giftWallRankInfo.province == null) {
                            giftWallRankInfo.province = "";
                        }
                        if (giftWallRankInfo.rank == null) {
                            giftWallRankInfo.rank = "";
                        }
                        if (giftWallRankInfo.rankLevel != null) {
                            break;
                        }
                        giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.defaultEnum();
                        return giftWallRankInfo;
                    }
                    giftWallRankInfo.rankLevel = (RankLevel) nb5Var.l(RankLevel.PROTOBUF_ADAPTER);
                }
            }
            return giftWallRankInfo;
        }

        public void serialize(GiftWallRankInfo giftWallRankInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftWallRankInfo.city;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = giftWallRankInfo.country;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = giftWallRankInfo.district;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = giftWallRankInfo.province;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = giftWallRankInfo.rank;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            RankLevel rankLevel = giftWallRankInfo.rankLevel;
            if (rankLevel != null) {
                codedOutputByteBufferNano.G(6, rankLevel.ordinal());
            }
            codedOutputByteBufferNano.G(7, giftWallRankInfo.totalGiftAmount);
            RankLevel rankLevel2 = giftWallRankInfo.rankLevel;
            if (rankLevel2 != null) {
                codedOutputByteBufferNano.K(8, rankLevel2, RankLevel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftWallRankInfo> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallRankInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallRankInfo.2
        public Class getDataClass() {
            return GiftWallRankInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftWallRankInfo m12974newInstance() {
            return new GiftWallRankInfo();
        }

        public boolean parseField(GiftWallRankInfo giftWallRankInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "province":
                    giftWallRankInfo.province = jsonParser.getValueAsString();
                    return true;
                case "totalGiftAmount":
                    giftWallRankInfo.totalGiftAmount = jsonParser.getValueAsInt();
                    return true;
                case "rankLevel":
                    giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "city":
                    giftWallRankInfo.city = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    giftWallRankInfo.rank = jsonParser.getValueAsString();
                    return true;
                case "district":
                    giftWallRankInfo.district = jsonParser.getValueAsString();
                    return true;
                case "country":
                    giftWallRankInfo.country = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftWallRankInfo giftWallRankInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "province":
                case "totalGiftAmount":
                case "rankLevel":
                case "city":
                case "rank":
                case "district":
                case "country":
                    return true;
                default:
                    return super.parseFieldCheck(giftWallRankInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GiftWallRankInfo giftWallRankInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = giftWallRankInfo.city;
            if (str != null) {
                jsonGenerator.writeStringField(RankLevel.city, str);
            }
            String str2 = giftWallRankInfo.country;
            if (str2 != null) {
                jsonGenerator.writeStringField(RankLevel.country, str2);
            }
            String str3 = giftWallRankInfo.district;
            if (str3 != null) {
                jsonGenerator.writeStringField(RankLevel.district, str3);
            }
            String str4 = giftWallRankInfo.province;
            if (str4 != null) {
                jsonGenerator.writeStringField(RankLevel.province, str4);
            }
            String str5 = giftWallRankInfo.rank;
            if (str5 != null) {
                jsonGenerator.writeStringField("rank", str5);
            }
            if (giftWallRankInfo.rankLevel != null) {
                jsonGenerator.writeFieldName("rankLevel");
                RankLevel.JSON_ADAPTER.serialize(giftWallRankInfo.rankLevel, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("totalGiftAmount", giftWallRankInfo.totalGiftAmount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallRankInfo new_() {
        GiftWallRankInfo giftWallRankInfo = new GiftWallRankInfo();
        giftWallRankInfo.nullCheck();
        return giftWallRankInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftWallRankInfo m12972clone() {
        GiftWallRankInfo giftWallRankInfo = new GiftWallRankInfo();
        giftWallRankInfo.city = this.city;
        giftWallRankInfo.country = this.country;
        giftWallRankInfo.district = this.district;
        giftWallRankInfo.province = this.province;
        giftWallRankInfo.rank = this.rank;
        giftWallRankInfo.rankLevel = this.rankLevel;
        giftWallRankInfo.totalGiftAmount = this.totalGiftAmount;
        return giftWallRankInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftWallRankInfo)) {
            return false;
        }
        GiftWallRankInfo giftWallRankInfo = (GiftWallRankInfo) obj;
        return ValueObject.util_equals(this.city, giftWallRankInfo.city) && ValueObject.util_equals(this.country, giftWallRankInfo.country) && ValueObject.util_equals(this.district, giftWallRankInfo.district) && ValueObject.util_equals(this.province, giftWallRankInfo.province) && ValueObject.util_equals(this.rank, giftWallRankInfo.rank) && ValueObject.util_equals(this.rankLevel, giftWallRankInfo.rankLevel) && this.totalGiftAmount == giftWallRankInfo.totalGiftAmount;
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
        String str = this.city;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.district;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.province;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.rank;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        RankLevel rankLevel = this.rankLevel;
        int iHashCode6 = ((iHashCode5 + (rankLevel != null ? rankLevel.hashCode() : 0)) * 41) + this.totalGiftAmount;
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.city == null) {
            this.city = "";
        }
        if (this.country == null) {
            this.country = "";
        }
        if (this.district == null) {
            this.district = "";
        }
        if (this.province == null) {
            this.province = "";
        }
        if (this.rank == null) {
            this.rank = "";
        }
        if (this.rankLevel == null) {
            this.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
