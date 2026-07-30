package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
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
public class GiftWallRankInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftwallrankinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String city;

    @NonNull
    @ProtobufIndex(index = 2)
    public String country;

    @NonNull
    @ProtobufIndex(index = 3)
    public String district;

    @NonNull
    @ProtobufIndex(index = 4)
    public String province;

    @NonNull
    @ProtobufIndex(index = 5)
    public String rank;

    @NonNull
    @ProtobufIndex(index = 6)
    public RankLevel rankLevel;

    @ProtobufIndex(index = 7)
    public int totalGiftAmount;
    public static ProtobufAdapter<GiftWallRankInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftWallRankInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallRankInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftWallRankInfo giftWallRankInfo) {
            String str = giftWallRankInfo.city;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = giftWallRankInfo.country;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = giftWallRankInfo.district;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = giftWallRankInfo.province;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = giftWallRankInfo.rank;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            RankLevel rankLevel = giftWallRankInfo.rankLevel;
            if (rankLevel != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(6, rankLevel.ordinal());
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(7, giftWallRankInfo.totalGiftAmount);
            RankLevel rankLevel2 = giftWallRankInfo.rankLevel;
            if (rankLevel2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, rankLevel2, RankLevel.PROTOBUF_ADAPTER);
            }
            giftWallRankInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftWallRankInfo parse(nb5 nb5Var) throws IOException {
            GiftWallRankInfo giftWallRankInfo = new GiftWallRankInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftWallRankInfo.rankLevel == null && numValueOf != null) {
                        giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                if (iM158752u == 10) {
                    giftWallRankInfo.city = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    giftWallRankInfo.country = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    giftWallRankInfo.district = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    giftWallRankInfo.province = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    giftWallRankInfo.rank = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 56) {
                    giftWallRankInfo.totalGiftAmount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 66) {
                        if (giftWallRankInfo.rankLevel == null && numValueOf != null) {
                            giftWallRankInfo.rankLevel = (RankLevel) RankLevel.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                    giftWallRankInfo.rankLevel = (RankLevel) nb5Var.m158743l(RankLevel.PROTOBUF_ADAPTER);
                }
            }
            return giftWallRankInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftWallRankInfo giftWallRankInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftWallRankInfo.city;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = giftWallRankInfo.country;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = giftWallRankInfo.district;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = giftWallRankInfo.province;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = giftWallRankInfo.rank;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            RankLevel rankLevel = giftWallRankInfo.rankLevel;
            if (rankLevel != null) {
                codedOutputByteBufferNano.m17250G(6, rankLevel.ordinal());
            }
            codedOutputByteBufferNano.m17250G(7, giftWallRankInfo.totalGiftAmount);
            RankLevel rankLevel2 = giftWallRankInfo.rankLevel;
            if (rankLevel2 != null) {
                codedOutputByteBufferNano.m17254K(8, rankLevel2, RankLevel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftWallRankInfo> JSON_ADAPTER = new ObjectJsonAdapter<GiftWallRankInfo>() { // from class: com.p1.mobile.putong.core.data.GiftWallRankInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftWallRankInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftWallRankInfo newInstance() {
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
                    giftWallRankInfo.rankLevel = RankLevel.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftWallRankInfo giftWallRankInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = giftWallRankInfo.city;
            if (str != null) {
                jsonGenerator.writeStringField(RankLevel.city, str);
            }
            String str2 = giftWallRankInfo.country;
            if (str2 != null) {
                jsonGenerator.writeStringField("country", str2);
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
                jsonGenerator.writeStringField(BLivePkCategory.rank, str5);
            }
            if (giftWallRankInfo.rankLevel != null) {
                jsonGenerator.writeFieldName("rankLevel");
                RankLevel.JSON_ADAPTER.serialize(giftWallRankInfo.rankLevel, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("totalGiftAmount", giftWallRankInfo.totalGiftAmount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftWallRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftWallRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftWallRankInfo new_() {
        GiftWallRankInfo giftWallRankInfo = new GiftWallRankInfo();
        giftWallRankInfo.nullCheck();
        return giftWallRankInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftWallRankInfo mo223809clone() {
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
