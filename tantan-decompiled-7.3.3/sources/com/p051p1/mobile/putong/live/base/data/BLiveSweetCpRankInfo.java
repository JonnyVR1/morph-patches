package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSweetCpRankInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSweetCpRankInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSweetCpRankInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSweetCpRankInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSweetCpRankInfo newInstance() {
            return new BLiveSweetCpRankInfo();
        }

        public boolean parseField(BLiveSweetCpRankInfo bLiveSweetCpRankInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    bLiveSweetCpRankInfo.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "meUserAvatar":
                    bLiveSweetCpRankInfo.meUserAvatar = jsonParser.getValueAsString();
                    return true;
                case "houseBackground":
                    bLiveSweetCpRankInfo.houseBackground = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveSweetCpRankInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "cpLuxuryValue":
                    bLiveSweetCpRankInfo.cpLuxuryValue = jsonParser.getValueAsDouble();
                    return true;
                case "cpUserAvatar":
                    bLiveSweetCpRankInfo.cpUserAvatar = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveSweetCpRankInfo.rank = jsonParser.getValueAsInt();
                    return true;
                case "houseName":
                    bLiveSweetCpRankInfo.houseName = jsonParser.getValueAsString();
                    return true;
                case "houseRank":
                    bLiveSweetCpRankInfo.houseRank = jsonParser.getValueAsInt();
                    return true;
                case "houseId":
                    bLiveSweetCpRankInfo.houseId = jsonParser.getValueAsString();
                    return true;
                case "houseImage":
                    bLiveSweetCpRankInfo.houseImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSweetCpRankInfo bLiveSweetCpRankInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveSweetCpRankInfo.rank);
            String str = bLiveSweetCpRankInfo.meUserAvatar;
            if (str != null) {
                jsonGenerator.writeStringField("meUserAvatar", str);
            }
            String str2 = bLiveSweetCpRankInfo.houseId;
            if (str2 != null) {
                jsonGenerator.writeStringField("houseId", str2);
            }
            String str3 = bLiveSweetCpRankInfo.cpUserAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("cpUserAvatar", str3);
            }
            String str4 = bLiveSweetCpRankInfo.houseName;
            if (str4 != null) {
                jsonGenerator.writeStringField("houseName", str4);
            }
            jsonGenerator.writeNumberField("houseRank", bLiveSweetCpRankInfo.houseRank);
            jsonGenerator.writeNumberField("cpLuxuryValue", bLiveSweetCpRankInfo.cpLuxuryValue);
            String str5 = bLiveSweetCpRankInfo.houseImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("houseImage", str5);
            }
            String str6 = bLiveSweetCpRankInfo.houseBackground;
            if (str6 != null) {
                jsonGenerator.writeStringField("houseBackground", str6);
            }
            String str7 = bLiveSweetCpRankInfo.userId;
            if (str7 != null) {
                jsonGenerator.writeStringField("userId", str7);
            }
            String str8 = bLiveSweetCpRankInfo.otherUserId;
            if (str8 != null) {
                jsonGenerator.writeStringField("otherUserId", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSweetCpRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesweetcprankinfo";

    @ProtobufIndex(index = 7)
    public double cpLuxuryValue;

    @NonNull
    @ProtobufIndex(index = 4)
    public String cpUserAvatar;

    @NonNull
    @ProtobufIndex(index = 9)
    public String houseBackground;

    @NonNull
    @ProtobufIndex(index = 3)
    public String houseId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String houseImage;

    @NonNull
    @ProtobufIndex(index = 5)
    public String houseName;

    @ProtobufIndex(index = 6)
    public int houseRank;

    @NonNull
    @ProtobufIndex(index = 2)
    public String meUserAvatar;

    @NonNull
    @ProtobufIndex(index = 11)
    public String otherUserId;

    @ProtobufIndex(index = 1)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 10)
    public String userId;

    public static BLiveSweetCpRankInfo new_() {
        BLiveSweetCpRankInfo bLiveSweetCpRankInfo = new BLiveSweetCpRankInfo();
        bLiveSweetCpRankInfo.nullCheck();
        return bLiveSweetCpRankInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSweetCpRankInfo mo225055clone() {
        BLiveSweetCpRankInfo bLiveSweetCpRankInfo = new BLiveSweetCpRankInfo();
        bLiveSweetCpRankInfo.rank = this.rank;
        bLiveSweetCpRankInfo.meUserAvatar = this.meUserAvatar;
        bLiveSweetCpRankInfo.houseId = this.houseId;
        bLiveSweetCpRankInfo.cpUserAvatar = this.cpUserAvatar;
        bLiveSweetCpRankInfo.houseName = this.houseName;
        bLiveSweetCpRankInfo.houseRank = this.houseRank;
        bLiveSweetCpRankInfo.cpLuxuryValue = this.cpLuxuryValue;
        bLiveSweetCpRankInfo.houseImage = this.houseImage;
        bLiveSweetCpRankInfo.houseBackground = this.houseBackground;
        bLiveSweetCpRankInfo.userId = this.userId;
        bLiveSweetCpRankInfo.otherUserId = this.otherUserId;
        return bLiveSweetCpRankInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSweetCpRankInfo)) {
            return false;
        }
        BLiveSweetCpRankInfo bLiveSweetCpRankInfo = (BLiveSweetCpRankInfo) obj;
        return this.rank == bLiveSweetCpRankInfo.rank && ValueObject.util_equals(this.meUserAvatar, bLiveSweetCpRankInfo.meUserAvatar) && ValueObject.util_equals(this.houseId, bLiveSweetCpRankInfo.houseId) && ValueObject.util_equals(this.cpUserAvatar, bLiveSweetCpRankInfo.cpUserAvatar) && ValueObject.util_equals(this.houseName, bLiveSweetCpRankInfo.houseName) && this.houseRank == bLiveSweetCpRankInfo.houseRank && this.cpLuxuryValue == bLiveSweetCpRankInfo.cpLuxuryValue && ValueObject.util_equals(this.houseImage, bLiveSweetCpRankInfo.houseImage) && ValueObject.util_equals(this.houseBackground, bLiveSweetCpRankInfo.houseBackground) && ValueObject.util_equals(this.userId, bLiveSweetCpRankInfo.userId) && ValueObject.util_equals(this.otherUserId, bLiveSweetCpRankInfo.otherUserId);
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
        int i2 = ((i * 41) + this.rank) * 41;
        String str = this.meUserAvatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.houseId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cpUserAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.houseName;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.houseRank;
        long jDoubleToLongBits = Double.doubleToLongBits(this.cpLuxuryValue);
        int i3 = ((iHashCode4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str5 = this.houseImage;
        int iHashCode5 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.houseBackground;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.otherUserId;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meUserAvatar == null) {
            this.meUserAvatar = "";
        }
        if (this.houseId == null) {
            this.houseId = "";
        }
        if (this.cpUserAvatar == null) {
            this.cpUserAvatar = "";
        }
        if (this.houseName == null) {
            this.houseName = "";
        }
        if (this.houseImage == null) {
            this.houseImage = "";
        }
        if (this.houseBackground == null) {
            this.houseBackground = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
