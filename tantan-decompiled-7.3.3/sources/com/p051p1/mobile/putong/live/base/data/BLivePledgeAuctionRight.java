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
public class BLivePledgeAuctionRight extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePledgeAuctionRight> JSON_ADAPTER = new ObjectJsonAdapter<BLivePledgeAuctionRight>() { // from class: com.p1.mobile.putong.live.base.data.BLivePledgeAuctionRight.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePledgeAuctionRight.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePledgeAuctionRight newInstance() {
            return new BLivePledgeAuctionRight();
        }

        public boolean parseField(BLivePledgeAuctionRight bLivePledgeAuctionRight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLivePledgeAuctionRight.subTitle = jsonParser.getValueAsString();
                    return true;
                case "image":
                    bLivePledgeAuctionRight.image = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLivePledgeAuctionRight.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePledgeAuctionRight bLivePledgeAuctionRight, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePledgeAuctionRight.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLivePledgeAuctionRight.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = bLivePledgeAuctionRight.image;
            if (str3 != null) {
                jsonGenerator.writeStringField("image", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePledgeAuctionRight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepledgeauctionright";

    @NonNull
    @ProtobufIndex(index = 3)
    public String image;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLivePledgeAuctionRight new_() {
        BLivePledgeAuctionRight bLivePledgeAuctionRight = new BLivePledgeAuctionRight();
        bLivePledgeAuctionRight.nullCheck();
        return bLivePledgeAuctionRight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePledgeAuctionRight mo225055clone() {
        BLivePledgeAuctionRight bLivePledgeAuctionRight = new BLivePledgeAuctionRight();
        bLivePledgeAuctionRight.title = this.title;
        bLivePledgeAuctionRight.subTitle = this.subTitle;
        bLivePledgeAuctionRight.image = this.image;
        return bLivePledgeAuctionRight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePledgeAuctionRight)) {
            return false;
        }
        BLivePledgeAuctionRight bLivePledgeAuctionRight = (BLivePledgeAuctionRight) obj;
        return ValueObject.util_equals(this.title, bLivePledgeAuctionRight.title) && ValueObject.util_equals(this.subTitle, bLivePledgeAuctionRight.subTitle) && ValueObject.util_equals(this.image, bLivePledgeAuctionRight.image);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.image;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.image == null) {
            this.image = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
