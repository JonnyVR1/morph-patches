package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRankInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRankInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRankInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRankInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRankInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRankInfo newInstance() {
            return new BLiveRankInfo();
        }

        public boolean parseField(BLiveRankInfo bLiveRankInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rankImage":
                    bLiveRankInfo.rankImage = jsonParser.getValueAsString();
                    return true;
                case "rankName":
                    bLiveRankInfo.rankName = jsonParser.getValueAsString();
                    return true;
                case "rankSvga":
                    bLiveRankInfo.rankSvga = jsonParser.getValueAsString();
                    return true;
                case "division":
                    bLiveRankInfo.division = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRankInfo bLiveRankInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRankInfo.division;
            if (str != null) {
                jsonGenerator.writeStringField("division", str);
            }
            String str2 = bLiveRankInfo.rankName;
            if (str2 != null) {
                jsonGenerator.writeStringField("rankName", str2);
            }
            String str3 = bLiveRankInfo.rankImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("rankImage", str3);
            }
            String str4 = bLiveRankInfo.rankSvga;
            if (str4 != null) {
                jsonGenerator.writeStringField("rankSvga", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRankInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverankinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String division;

    @NonNull
    @ProtobufIndex(index = 3)
    public String rankImage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String rankName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String rankSvga;

    public static BLiveRankInfo new_() {
        BLiveRankInfo bLiveRankInfo = new BLiveRankInfo();
        bLiveRankInfo.nullCheck();
        return bLiveRankInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRankInfo mo223809clone() {
        BLiveRankInfo bLiveRankInfo = new BLiveRankInfo();
        bLiveRankInfo.division = this.division;
        bLiveRankInfo.rankName = this.rankName;
        bLiveRankInfo.rankImage = this.rankImage;
        bLiveRankInfo.rankSvga = this.rankSvga;
        return bLiveRankInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRankInfo)) {
            return false;
        }
        BLiveRankInfo bLiveRankInfo = (BLiveRankInfo) obj;
        return ValueObject.util_equals(this.division, bLiveRankInfo.division) && ValueObject.util_equals(this.rankName, bLiveRankInfo.rankName) && ValueObject.util_equals(this.rankImage, bLiveRankInfo.rankImage) && ValueObject.util_equals(this.rankSvga, bLiveRankInfo.rankSvga);
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
        String str = this.division;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.rankName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rankImage;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.rankSvga;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.division == null) {
            this.division = "";
        }
        if (this.rankName == null) {
            this.rankName = "";
        }
        if (this.rankImage == null) {
            this.rankImage = "";
        }
        if (this.rankSvga == null) {
            this.rankSvga = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
