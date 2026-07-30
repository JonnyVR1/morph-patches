package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePkOwner extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkOwner> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkOwner>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkOwner.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkOwner.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkOwner newInstance() {
            return new BLivePkOwner();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLivePkOwner bLivePkOwner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2086349832:
                    if (str.equals("liveAnimation")) {
                        b = 0;
                    }
                    break;
                case -1130343222:
                    if (str.equals("winTimes")) {
                        b = 1;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 2;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 3;
                    }
                    break;
                case -859610604:
                    if (str.equals("imageUrl")) {
                        b = 4;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 5;
                    }
                    break;
                case -370038381:
                    if (str.equals("winIndicator")) {
                        b = 6;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 7;
                    }
                    break;
                case 104264043:
                    if (str.equals("muted")) {
                        b = 8;
                    }
                    break;
                case 106845584:
                    if (str.equals("point")) {
                        b = 9;
                    }
                    break;
                case 255733498:
                    if (str.equals("rankInfo")) {
                        b = 10;
                    }
                    break;
                case 335436465:
                    if (str.equals("pkRankWinTimes")) {
                        b = 11;
                    }
                    break;
                case 619951105:
                    if (str.equals("itemCardList")) {
                        b = 12;
                    }
                    break;
                case 717076388:
                    if (str.equals("rankAmount")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1375976184:
                    if (str.equals("contributors")) {
                        b = 14;
                    }
                    break;
                case 1586041031:
                    if (str.equals("rankWinTimesDesc")) {
                        b = 15;
                    }
                    break;
                case 1679608035:
                    if (str.equals("bountyAmount")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLivePkOwner.liveAnimation = BLivePkBountyResource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLivePkOwner.winTimes = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLivePkOwner.liveId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLivePkOwner.roomId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLivePkOwner.imageUrl = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLivePkOwner.userId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLivePkOwner.winIndicator = BLivePkBountyWinIndicator.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLivePkOwner.userName = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLivePkOwner.muted = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLivePkOwner.point = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLivePkOwner.rankInfo = BLiveRankInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLivePkOwner.pkRankWinTimes = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLivePkOwner.itemCardList = JsonAdapter.parseArray(jsonParser, BLivePKCardItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLivePkOwner.rankAmount = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLivePkOwner.contributors = JsonAdapter.parseArray(jsonParser, BLivePkContributor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLivePkOwner.rankWinTimesDesc = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLivePkOwner.bountyAmount = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkOwner bLivePkOwner, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkOwner.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLivePkOwner.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLivePkOwner.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = bLivePkOwner.userName;
            if (str4 != null) {
                jsonGenerator.writeStringField("userName", str4);
            }
            String str5 = bLivePkOwner.imageUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("imageUrl", str5);
            }
            if (bLivePkOwner.contributors != null) {
                jsonGenerator.writeFieldName("contributors");
                JsonAdapter.serializeArray(bLivePkOwner.contributors, jsonGenerator, BLivePkContributor.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("winTimes", bLivePkOwner.winTimes);
            jsonGenerator.writeNumberField("bountyAmount", bLivePkOwner.bountyAmount);
            if (bLivePkOwner.liveAnimation != null) {
                jsonGenerator.writeFieldName("liveAnimation");
                BLivePkBountyResource.JSON_ADAPTER.serialize(bLivePkOwner.liveAnimation, jsonGenerator, true);
            }
            if (bLivePkOwner.winIndicator != null) {
                jsonGenerator.writeFieldName("winIndicator");
                BLivePkBountyWinIndicator.JSON_ADAPTER.serialize(bLivePkOwner.winIndicator, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("muted", bLivePkOwner.muted);
            if (bLivePkOwner.rankInfo != null) {
                jsonGenerator.writeFieldName("rankInfo");
                BLiveRankInfo.JSON_ADAPTER.serialize(bLivePkOwner.rankInfo, jsonGenerator, true);
            }
            String str6 = bLivePkOwner.pkRankWinTimes;
            if (str6 != null) {
                jsonGenerator.writeStringField("pkRankWinTimes", str6);
            }
            String str7 = bLivePkOwner.point;
            if (str7 != null) {
                jsonGenerator.writeStringField("point", str7);
            }
            String str8 = bLivePkOwner.rankAmount;
            if (str8 != null) {
                jsonGenerator.writeStringField("rankAmount", str8);
            }
            String str9 = bLivePkOwner.rankWinTimesDesc;
            if (str9 != null) {
                jsonGenerator.writeStringField("rankWinTimesDesc", str9);
            }
            if (bLivePkOwner.itemCardList != null) {
                jsonGenerator.writeFieldName("itemCardList");
                JsonAdapter.serializeArray(bLivePkOwner.itemCardList, jsonGenerator, BLivePKCardItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkOwner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkowner";

    @ProtobufIndex(index = 8)
    public double bountyAmount;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLivePkContributor> contributors;

    @NonNull
    @ProtobufIndex(index = 5)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<BLivePKCardItem> itemCardList;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLivePkBountyResource liveAnimation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @ProtobufIndex(index = 11)
    public boolean muted;

    @NonNull
    @ProtobufIndex(index = 13)
    public String pkRankWinTimes;

    @NonNull
    @ProtobufIndex(index = 14)
    public String point;

    @NonNull
    @ProtobufIndex(index = 15)
    public String rankAmount;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveRankInfo rankInfo;

    @NonNull
    @ProtobufIndex(index = 16)
    public String rankWinTimesDesc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userName;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLivePkBountyWinIndicator winIndicator;

    @ProtobufIndex(index = 7)
    public long winTimes;

    public static BLivePkOwner new_() {
        BLivePkOwner bLivePkOwner = new BLivePkOwner();
        bLivePkOwner.nullCheck();
        return bLivePkOwner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkOwner mo223809clone() {
        BLivePkOwner bLivePkOwner = new BLivePkOwner();
        bLivePkOwner.userId = this.userId;
        bLivePkOwner.liveId = this.liveId;
        bLivePkOwner.roomId = this.roomId;
        bLivePkOwner.userName = this.userName;
        bLivePkOwner.imageUrl = this.imageUrl;
        List<BLivePkContributor> list = this.contributors;
        if (list != null) {
            bLivePkOwner.contributors = ValueObject.util_map(list, new w9j() { // from class: l.f42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePkContributor) obj).mo223809clone();
                }
            });
        }
        bLivePkOwner.winTimes = this.winTimes;
        bLivePkOwner.bountyAmount = this.bountyAmount;
        BLivePkBountyResource bLivePkBountyResource = this.liveAnimation;
        if (bLivePkBountyResource != null) {
            bLivePkOwner.liveAnimation = bLivePkBountyResource.mo223809clone();
        }
        BLivePkBountyWinIndicator bLivePkBountyWinIndicator = this.winIndicator;
        if (bLivePkBountyWinIndicator != null) {
            bLivePkOwner.winIndicator = bLivePkBountyWinIndicator.mo223809clone();
        }
        bLivePkOwner.muted = this.muted;
        BLiveRankInfo bLiveRankInfo = this.rankInfo;
        if (bLiveRankInfo != null) {
            bLivePkOwner.rankInfo = bLiveRankInfo.mo223809clone();
        }
        bLivePkOwner.pkRankWinTimes = this.pkRankWinTimes;
        bLivePkOwner.point = this.point;
        bLivePkOwner.rankAmount = this.rankAmount;
        bLivePkOwner.rankWinTimesDesc = this.rankWinTimesDesc;
        List<BLivePKCardItem> list2 = this.itemCardList;
        if (list2 != null) {
            bLivePkOwner.itemCardList = ValueObject.util_map(list2, new w9j() { // from class: l.g42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLivePKCardItem) obj).mo223809clone();
                }
            });
        }
        return bLivePkOwner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkOwner)) {
            return false;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) obj;
        return ValueObject.util_equals(this.userId, bLivePkOwner.userId) && ValueObject.util_equals(this.liveId, bLivePkOwner.liveId) && ValueObject.util_equals(this.roomId, bLivePkOwner.roomId) && ValueObject.util_equals(this.userName, bLivePkOwner.userName) && ValueObject.util_equals(this.imageUrl, bLivePkOwner.imageUrl) && ValueObject.util_equals(this.contributors, bLivePkOwner.contributors) && this.winTimes == bLivePkOwner.winTimes && this.bountyAmount == bLivePkOwner.bountyAmount && ValueObject.util_equals(this.liveAnimation, bLivePkOwner.liveAnimation) && ValueObject.util_equals(this.winIndicator, bLivePkOwner.winIndicator) && this.muted == bLivePkOwner.muted && ValueObject.util_equals(this.rankInfo, bLivePkOwner.rankInfo) && ValueObject.util_equals(this.pkRankWinTimes, bLivePkOwner.pkRankWinTimes) && ValueObject.util_equals(this.point, bLivePkOwner.point) && ValueObject.util_equals(this.rankAmount, bLivePkOwner.rankAmount) && ValueObject.util_equals(this.rankWinTimesDesc, bLivePkOwner.rankWinTimesDesc) && ValueObject.util_equals(this.itemCardList, bLivePkOwner.itemCardList);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLivePkContributor> list = this.contributors;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        long j = this.winTimes;
        int i3 = ((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.bountyAmount);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        BLivePkBountyResource bLivePkBountyResource = this.liveAnimation;
        int iHashCode7 = (i4 + (bLivePkBountyResource != null ? bLivePkBountyResource.hashCode() : 0)) * 41;
        BLivePkBountyWinIndicator bLivePkBountyWinIndicator = this.winIndicator;
        int iHashCode8 = (((iHashCode7 + (bLivePkBountyWinIndicator != null ? bLivePkBountyWinIndicator.hashCode() : 0)) * 41) + (this.muted ? 1231 : 1237)) * 41;
        BLiveRankInfo bLiveRankInfo = this.rankInfo;
        int iHashCode9 = (iHashCode8 + (bLiveRankInfo != null ? bLiveRankInfo.hashCode() : 0)) * 41;
        String str6 = this.pkRankWinTimes;
        int iHashCode10 = (iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.point;
        int iHashCode11 = (iHashCode10 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.rankAmount;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.rankWinTimesDesc;
        int iHashCode13 = (iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 41;
        List<BLivePKCardItem> list2 = this.itemCardList;
        int iHashCode14 = iHashCode13 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.contributors == null) {
            this.contributors = new ArrayList();
        }
        if (this.liveAnimation == null) {
            this.liveAnimation = BLivePkBountyResource.new_();
        }
        if (this.winIndicator == null) {
            this.winIndicator = BLivePkBountyWinIndicator.new_();
        }
        if (this.rankInfo == null) {
            this.rankInfo = BLiveRankInfo.new_();
        }
        if (this.pkRankWinTimes == null) {
            this.pkRankWinTimes = "";
        }
        if (this.point == null) {
            this.point = "";
        }
        if (this.rankAmount == null) {
            this.rankAmount = "";
        }
        if (this.rankWinTimesDesc == null) {
            this.rankWinTimesDesc = "";
        }
        if (this.itemCardList == null) {
            this.itemCardList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
