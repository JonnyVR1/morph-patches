package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAuctionRelation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAuctionRelation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAuctionRelation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAuctionRelation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAuctionRelation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAuctionRelation newInstance() {
            return new BLiveAuctionRelation();
        }

        public boolean parseField(BLiveAuctionRelation bLiveAuctionRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tagImage":
                    bLiveAuctionRelation.tagImage = jsonParser.getValueAsString();
                    return true;
                case "auctionImage":
                    bLiveAuctionRelation.auctionImage = jsonParser.getValueAsString();
                    return true;
                case "startBgColor":
                    bLiveAuctionRelation.startBgColor = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    bLiveAuctionRelation.desc = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveAuctionRelation.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveAuctionRelation.type = jsonParser.getValueAsString();
                    return true;
                case "endBgColor":
                    bLiveAuctionRelation.endBgColor = jsonParser.getValueAsString();
                    return true;
                case "image":
                    bLiveAuctionRelation.image = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAuctionRelation bLiveAuctionRelation, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAuctionRelation.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveAuctionRelation.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = bLiveAuctionRelation.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str3);
            }
            String str4 = bLiveAuctionRelation.image;
            if (str4 != null) {
                jsonGenerator.writeStringField("image", str4);
            }
            String str5 = bLiveAuctionRelation.auctionImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("auctionImage", str5);
            }
            String str6 = bLiveAuctionRelation.startBgColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("startBgColor", str6);
            }
            String str7 = bLiveAuctionRelation.endBgColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("endBgColor", str7);
            }
            String str8 = bLiveAuctionRelation.tagImage;
            if (str8 != null) {
                jsonGenerator.writeStringField("tagImage", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAuctionRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveauctionrelation";

    @NonNull
    @ProtobufIndex(index = 5)
    public String auctionImage;

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 7)
    public String endBgColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String image;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String startBgColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String tagImage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveAuctionRelation new_() {
        BLiveAuctionRelation bLiveAuctionRelation = new BLiveAuctionRelation();
        bLiveAuctionRelation.nullCheck();
        return bLiveAuctionRelation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAuctionRelation mo223809clone() {
        BLiveAuctionRelation bLiveAuctionRelation = new BLiveAuctionRelation();
        bLiveAuctionRelation.name = this.name;
        bLiveAuctionRelation.type = this.type;
        bLiveAuctionRelation.desc = this.desc;
        bLiveAuctionRelation.image = this.image;
        bLiveAuctionRelation.auctionImage = this.auctionImage;
        bLiveAuctionRelation.startBgColor = this.startBgColor;
        bLiveAuctionRelation.endBgColor = this.endBgColor;
        bLiveAuctionRelation.tagImage = this.tagImage;
        return bLiveAuctionRelation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAuctionRelation)) {
            return false;
        }
        BLiveAuctionRelation bLiveAuctionRelation = (BLiveAuctionRelation) obj;
        return ValueObject.util_equals(this.name, bLiveAuctionRelation.name) && ValueObject.util_equals(this.type, bLiveAuctionRelation.type) && ValueObject.util_equals(this.desc, bLiveAuctionRelation.desc) && ValueObject.util_equals(this.image, bLiveAuctionRelation.image) && ValueObject.util_equals(this.auctionImage, bLiveAuctionRelation.auctionImage) && ValueObject.util_equals(this.startBgColor, bLiveAuctionRelation.startBgColor) && ValueObject.util_equals(this.endBgColor, bLiveAuctionRelation.endBgColor) && ValueObject.util_equals(this.tagImage, bLiveAuctionRelation.tagImage);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.image;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.auctionImage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.startBgColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.endBgColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.tagImage;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.image == null) {
            this.image = "";
        }
        if (this.auctionImage == null) {
            this.auctionImage = "";
        }
        if (this.startBgColor == null) {
            this.startBgColor = "";
        }
        if (this.endBgColor == null) {
            this.endBgColor = "";
        }
        if (this.tagImage == null) {
            this.tagImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
