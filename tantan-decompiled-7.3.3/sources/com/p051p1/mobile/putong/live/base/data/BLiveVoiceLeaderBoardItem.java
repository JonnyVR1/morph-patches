package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
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
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceLeaderBoardItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLeaderBoardItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLeaderBoardItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLeaderBoardItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLeaderBoardItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLeaderBoardItem newInstance() {
            return new BLiveVoiceLeaderBoardItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1564778586:
                    if (str.equals("anchorImage")) {
                        b = 0;
                    }
                    break;
                case -1413853096:
                    if (str.equals("amount")) {
                        b = 1;
                    }
                    break;
                case -1297294527:
                    if (str.equals("anchorMask")) {
                        b = 2;
                    }
                    break;
                case -1297264928:
                    if (str.equals("anchorName")) {
                        b = 3;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 4;
                    }
                    break;
                case -971181392:
                    if (str.equals("anchorId")) {
                        b = 5;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 6;
                    }
                    break;
                case -266696361:
                    if (str.equals("userMask")) {
                        b = 7;
                    }
                    break;
                case 102102:
                    if (str.equals("gap")) {
                        b = 8;
                    }
                    break;
                case 3492908:
                    if (str.equals(BLivePkCategory.rank)) {
                        b = 9;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 10;
                    }
                    break;
                case 997906181:
                    if (str.equals("liveState")) {
                        b = 11;
                    }
                    break;
                case 1343750747:
                    if (str.equals("msgType")) {
                        b = 12;
                    }
                    break;
                case 1955834413:
                    if (str.equals("honoredguestList")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceLeaderBoardItem.anchorImage = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceLeaderBoardItem.amount = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveVoiceLeaderBoardItem.anchorMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveVoiceLeaderBoardItem.anchorName = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceLeaderBoardItem.liveId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceLeaderBoardItem.anchorId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceLeaderBoardItem.roomId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceLeaderBoardItem.userMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveVoiceLeaderBoardItem.gap = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    bLiveVoiceLeaderBoardItem.rank = jsonParser.getValueAsLong();
                    return true;
                case 10:
                    bLiveVoiceLeaderBoardItem.type = BLiveVoiceRankingType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 11:
                    bLiveVoiceLeaderBoardItem.liveState = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceLeaderBoardItem.msgType = BLiveVoiceRankingMsgType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 13:
                    bLiveVoiceLeaderBoardItem.honoredguestList = JsonAdapter.parseArray(jsonParser, BLiveUserMask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveVoiceLeaderBoardItem.rank);
            String str = bLiveVoiceLeaderBoardItem.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = bLiveVoiceLeaderBoardItem.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveVoiceLeaderBoardItem.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveVoiceLeaderBoardItem.anchorName;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorName", str4);
            }
            String str5 = bLiveVoiceLeaderBoardItem.anchorImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("anchorImage", str5);
            }
            if (bLiveVoiceLeaderBoardItem.anchorMask != null) {
                jsonGenerator.writeFieldName("anchorMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceLeaderBoardItem.anchorMask, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("amount", bLiveVoiceLeaderBoardItem.amount);
            String str6 = bLiveVoiceLeaderBoardItem.liveState;
            if (str6 != null) {
                jsonGenerator.writeStringField("liveState", str6);
            }
            jsonGenerator.writeNumberField("gap", bLiveVoiceLeaderBoardItem.gap);
            if (bLiveVoiceLeaderBoardItem.honoredguestList != null) {
                jsonGenerator.writeFieldName("honoredguestList");
                JsonAdapter.serializeArray(bLiveVoiceLeaderBoardItem.honoredguestList, jsonGenerator, BLiveUserMask.JSON_ADAPTER);
            }
            if (bLiveVoiceLeaderBoardItem.userMask != null) {
                jsonGenerator.writeFieldName("userMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceLeaderBoardItem.userMask, jsonGenerator, true);
            }
            if (bLiveVoiceLeaderBoardItem.msgType != null) {
                jsonGenerator.writeFieldName("msgType");
                BLiveVoiceRankingMsgType.JSON_ADAPTER.serialize(bLiveVoiceLeaderBoardItem.msgType, jsonGenerator, true);
            }
            if (bLiveVoiceLeaderBoardItem.type != null) {
                jsonGenerator.writeFieldName("type");
                BLiveVoiceRankingType.JSON_ADAPTER.serialize(bLiveVoiceLeaderBoardItem.type, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLeaderBoardItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceleaderboarditem";

    @ProtobufIndex(index = 7)
    public long amount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String anchorImage;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveUserMask anchorMask;

    @NonNull
    @ProtobufIndex(index = 5)
    public String anchorName;

    @ProtobufIndex(index = 9)
    public long gap;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<BLiveUserMask> honoredguestList;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String liveState;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveVoiceRankingMsgType msgType;

    @ProtobufIndex(index = 1)
    public long rank;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 13)
    public BLiveVoiceRankingType type;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLiveUserMask userMask;

    public static BLiveVoiceLeaderBoardItem new_() {
        BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = new BLiveVoiceLeaderBoardItem();
        bLiveVoiceLeaderBoardItem.nullCheck();
        return bLiveVoiceLeaderBoardItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLeaderBoardItem mo225055clone() {
        BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = new BLiveVoiceLeaderBoardItem();
        bLiveVoiceLeaderBoardItem.rank = this.rank;
        bLiveVoiceLeaderBoardItem.anchorId = this.anchorId;
        bLiveVoiceLeaderBoardItem.roomId = this.roomId;
        bLiveVoiceLeaderBoardItem.liveId = this.liveId;
        bLiveVoiceLeaderBoardItem.anchorName = this.anchorName;
        bLiveVoiceLeaderBoardItem.anchorImage = this.anchorImage;
        BLiveUserMask bLiveUserMask = this.anchorMask;
        if (bLiveUserMask != null) {
            bLiveVoiceLeaderBoardItem.anchorMask = bLiveUserMask.mo225055clone();
        }
        bLiveVoiceLeaderBoardItem.amount = this.amount;
        bLiveVoiceLeaderBoardItem.liveState = this.liveState;
        bLiveVoiceLeaderBoardItem.gap = this.gap;
        List<BLiveUserMask> list = this.honoredguestList;
        if (list != null) {
            bLiveVoiceLeaderBoardItem.honoredguestList = ValueObject.util_map(list, new qcj() { // from class: l.g92
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUserMask) obj).mo225055clone();
                }
            });
        }
        BLiveUserMask bLiveUserMask2 = this.userMask;
        if (bLiveUserMask2 != null) {
            bLiveVoiceLeaderBoardItem.userMask = bLiveUserMask2.mo225055clone();
        }
        bLiveVoiceLeaderBoardItem.msgType = this.msgType;
        bLiveVoiceLeaderBoardItem.type = this.type;
        return bLiveVoiceLeaderBoardItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLeaderBoardItem)) {
            return false;
        }
        BLiveVoiceLeaderBoardItem bLiveVoiceLeaderBoardItem = (BLiveVoiceLeaderBoardItem) obj;
        return this.rank == bLiveVoiceLeaderBoardItem.rank && ValueObject.util_equals(this.anchorId, bLiveVoiceLeaderBoardItem.anchorId) && ValueObject.util_equals(this.roomId, bLiveVoiceLeaderBoardItem.roomId) && ValueObject.util_equals(this.liveId, bLiveVoiceLeaderBoardItem.liveId) && ValueObject.util_equals(this.anchorName, bLiveVoiceLeaderBoardItem.anchorName) && ValueObject.util_equals(this.anchorImage, bLiveVoiceLeaderBoardItem.anchorImage) && ValueObject.util_equals(this.anchorMask, bLiveVoiceLeaderBoardItem.anchorMask) && this.amount == bLiveVoiceLeaderBoardItem.amount && ValueObject.util_equals(this.liveState, bLiveVoiceLeaderBoardItem.liveState) && this.gap == bLiveVoiceLeaderBoardItem.gap && ValueObject.util_equals(this.honoredguestList, bLiveVoiceLeaderBoardItem.honoredguestList) && ValueObject.util_equals(this.userMask, bLiveVoiceLeaderBoardItem.userMask) && ValueObject.util_equals(this.msgType, bLiveVoiceLeaderBoardItem.msgType) && ValueObject.util_equals(this.type, bLiveVoiceLeaderBoardItem.type);
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
        long j = this.rank;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.anchorImage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.anchorMask;
        int iHashCode6 = bLiveUserMask != null ? bLiveUserMask.hashCode() : 0;
        long j2 = this.amount;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str6 = this.liveState;
        int iHashCode7 = str6 != null ? str6.hashCode() : 0;
        long j3 = this.gap;
        int i4 = (((i3 + iHashCode7) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<BLiveUserMask> list = this.honoredguestList;
        int iHashCode8 = (i4 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask2 = this.userMask;
        int iHashCode9 = (iHashCode8 + (bLiveUserMask2 != null ? bLiveUserMask2.hashCode() : 0)) * 41;
        BLiveVoiceRankingMsgType bLiveVoiceRankingMsgType = this.msgType;
        int iHashCode10 = (iHashCode9 + (bLiveVoiceRankingMsgType != null ? bLiveVoiceRankingMsgType.hashCode() : 0)) * 41;
        BLiveVoiceRankingType bLiveVoiceRankingType = this.type;
        int iHashCode11 = iHashCode10 + (bLiveVoiceRankingType != null ? bLiveVoiceRankingType.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.anchorImage == null) {
            this.anchorImage = "";
        }
        if (this.anchorMask == null) {
            this.anchorMask = BLiveUserMask.new_();
        }
        if (this.liveState == null) {
            this.liveState = "";
        }
        if (this.honoredguestList == null) {
            this.honoredguestList = new ArrayList();
        }
        if (this.userMask == null) {
            this.userMask = BLiveUserMask.new_();
        }
        if (this.msgType == null) {
            this.msgType = (BLiveVoiceRankingMsgType) BLiveVoiceRankingMsgType.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = (BLiveVoiceRankingType) BLiveVoiceRankingType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
