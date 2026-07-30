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
public class BLiveMultiPkBoardUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiPkBoardUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiPkBoardUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiPkBoardUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiPkBoardUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiPkBoardUser newInstance() {
            return new BLiveMultiPkBoardUser();
        }

        public boolean parseField(BLiveMultiPkBoardUser bLiveMultiPkBoardUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveMultiPkBoardUser.amount = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    bLiveMultiPkBoardUser.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveMultiPkBoardUser.userName = jsonParser.getValueAsString();
                    return true;
                case "hierarchyGrade":
                    bLiveMultiPkBoardUser.hierarchyGrade = jsonParser.getValueAsInt();
                    return true;
                case "gap":
                    bLiveMultiPkBoardUser.gap = jsonParser.getValueAsInt();
                    return true;
                case "rank":
                    bLiveMultiPkBoardUser.rank = jsonParser.getValueAsInt();
                    return true;
                case "userImage":
                    bLiveMultiPkBoardUser.userImage = jsonParser.getValueAsString();
                    return true;
                case "fanbaseInfo":
                    bLiveMultiPkBoardUser.fanbaseInfo = BLiveFanBaseInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiPkBoardUser bLiveMultiPkBoardUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiPkBoardUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("amount", bLiveMultiPkBoardUser.amount);
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveMultiPkBoardUser.rank);
            String str2 = bLiveMultiPkBoardUser.userImage;
            if (str2 != null) {
                jsonGenerator.writeStringField("userImage", str2);
            }
            String str3 = bLiveMultiPkBoardUser.userName;
            if (str3 != null) {
                jsonGenerator.writeStringField("userName", str3);
            }
            if (bLiveMultiPkBoardUser.fanbaseInfo != null) {
                jsonGenerator.writeFieldName("fanbaseInfo");
                BLiveFanBaseInfo.JSON_ADAPTER.serialize(bLiveMultiPkBoardUser.fanbaseInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("gap", bLiveMultiPkBoardUser.gap);
            jsonGenerator.writeNumberField("hierarchyGrade", bLiveMultiPkBoardUser.hierarchyGrade);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiPkBoardUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemultipkboarduser";

    @ProtobufIndex(index = 2)
    public int amount;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveFanBaseInfo fanbaseInfo;

    @ProtobufIndex(index = 7)
    public int gap;

    @ProtobufIndex(index = 8)
    public int hierarchyGrade;

    @ProtobufIndex(index = 3)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userName;

    public static BLiveMultiPkBoardUser new_() {
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = new BLiveMultiPkBoardUser();
        bLiveMultiPkBoardUser.nullCheck();
        return bLiveMultiPkBoardUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiPkBoardUser mo225055clone() {
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = new BLiveMultiPkBoardUser();
        bLiveMultiPkBoardUser.userId = this.userId;
        bLiveMultiPkBoardUser.amount = this.amount;
        bLiveMultiPkBoardUser.rank = this.rank;
        bLiveMultiPkBoardUser.userImage = this.userImage;
        bLiveMultiPkBoardUser.userName = this.userName;
        BLiveFanBaseInfo bLiveFanBaseInfo = this.fanbaseInfo;
        if (bLiveFanBaseInfo != null) {
            bLiveMultiPkBoardUser.fanbaseInfo = bLiveFanBaseInfo.mo225055clone();
        }
        bLiveMultiPkBoardUser.gap = this.gap;
        bLiveMultiPkBoardUser.hierarchyGrade = this.hierarchyGrade;
        return bLiveMultiPkBoardUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiPkBoardUser)) {
            return false;
        }
        BLiveMultiPkBoardUser bLiveMultiPkBoardUser = (BLiveMultiPkBoardUser) obj;
        return ValueObject.util_equals(this.userId, bLiveMultiPkBoardUser.userId) && this.amount == bLiveMultiPkBoardUser.amount && this.rank == bLiveMultiPkBoardUser.rank && ValueObject.util_equals(this.userImage, bLiveMultiPkBoardUser.userImage) && ValueObject.util_equals(this.userName, bLiveMultiPkBoardUser.userName) && ValueObject.util_equals(this.fanbaseInfo, bLiveMultiPkBoardUser.fanbaseInfo) && this.gap == bLiveMultiPkBoardUser.gap && this.hierarchyGrade == bLiveMultiPkBoardUser.hierarchyGrade;
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
        String str = this.userId;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.amount) * 41) + this.rank) * 41;
        String str2 = this.userImage;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveFanBaseInfo bLiveFanBaseInfo = this.fanbaseInfo;
        int iHashCode4 = ((((iHashCode3 + (bLiveFanBaseInfo != null ? bLiveFanBaseInfo.hashCode() : 0)) * 41) + this.gap) * 41) + this.hierarchyGrade;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.fanbaseInfo == null) {
            this.fanbaseInfo = BLiveFanBaseInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
