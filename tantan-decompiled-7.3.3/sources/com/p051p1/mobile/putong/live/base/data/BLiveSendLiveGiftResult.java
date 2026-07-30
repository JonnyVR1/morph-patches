package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSendLiveGiftResult extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendLiveGiftResult> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendLiveGiftResult>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendLiveGiftResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendLiveGiftResult newInstance() {
            return new BLiveSendLiveGiftResult();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveSendLiveGiftResult bLiveSendLiveGiftResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2103655313:
                    if (str.equals("receiveMask")) {
                        b = 0;
                    }
                    break;
                case -1969830475:
                    if (str.equals("remainingDiamonds")) {
                        b = 1;
                    }
                    break;
                case -1920953811:
                    if (str.equals("givenGiftBrief")) {
                        b = 2;
                    }
                    break;
                case -1848837903:
                    if (str.equals("guildCall")) {
                        b = 3;
                    }
                    break;
                case -1468685616:
                    if (str.equals("effectExt")) {
                        b = 4;
                    }
                    break;
                case -1291437356:
                    if (str.equals("previewMask")) {
                        b = 5;
                    }
                    break;
                case -1207468233:
                    if (str.equals(BLiveActivity.TYPE_MULTI_CALL)) {
                        b = 6;
                    }
                    break;
                case -1067371963:
                    if (str.equals("tradeNo")) {
                        b = 7;
                    }
                    break;
                case -473799764:
                    if (str.equals("remainingTantanCoins")) {
                        b = 8;
                    }
                    break;
                case -115759078:
                    if (str.equals("bagSystemCommentStatus")) {
                        b = 9;
                    }
                    break;
                case 114843:
                    if (str.equals("tip")) {
                        b = 10;
                    }
                    break;
                case 3344108:
                    if (str.equals("mask")) {
                        b = 11;
                    }
                    break;
                case 763945543:
                    if (str.equals("remainingDurationSec")) {
                        b = 12;
                    }
                    break;
                case 1332438643:
                    if (str.equals("videoChat")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1595279582:
                    if (str.equals("senderShowMask")) {
                        b = 14;
                    }
                    break;
                case 2036039320:
                    if (str.equals("receiverShowMask")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveSendLiveGiftResult.receiveMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveSendLiveGiftResult.remainingDiamonds = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    bLiveSendLiveGiftResult.givenGiftBrief = BLiveGivenGiftBrief.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveSendLiveGiftResult.guildCall = BLiveGiftMultiCall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveSendLiveGiftResult.effectExt = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveSendLiveGiftResult.previewMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 6:
                    bLiveSendLiveGiftResult.multiCall = BLiveGiftMultiCall.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 7:
                    bLiveSendLiveGiftResult.tradeNo = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveSendLiveGiftResult.remainingTantanCoins = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    bLiveSendLiveGiftResult.bagSystemCommentStatus = BLivePacketSystemCommentStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveSendLiveGiftResult.tip = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveSendLiveGiftResult.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveSendLiveGiftResult.remainingDurationSec = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveSendLiveGiftResult.videoChat = BLiveGiftExtraVideoChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveSendLiveGiftResult.senderShowMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 15:
                    bLiveSendLiveGiftResult.receiverShowMask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendLiveGiftResult bLiveSendLiveGiftResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remainingTantanCoins", bLiveSendLiveGiftResult.remainingTantanCoins);
            if (bLiveSendLiveGiftResult.givenGiftBrief != null) {
                jsonGenerator.writeFieldName("givenGiftBrief");
                BLiveGivenGiftBrief.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.givenGiftBrief, jsonGenerator, true);
            }
            if (bLiveSendLiveGiftResult.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.mask, jsonGenerator, true);
            }
            String str = bLiveSendLiveGiftResult.tradeNo;
            if (str != null) {
                jsonGenerator.writeStringField("tradeNo", str);
            }
            String str2 = bLiveSendLiveGiftResult.effectExt;
            if (str2 != null) {
                jsonGenerator.writeStringField("effectExt", str2);
            }
            if (bLiveSendLiveGiftResult.multiCall != null) {
                jsonGenerator.writeFieldName(BLiveActivity.TYPE_MULTI_CALL);
                BLiveGiftMultiCall.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.multiCall, jsonGenerator, true);
            }
            if (bLiveSendLiveGiftResult.guildCall != null) {
                jsonGenerator.writeFieldName("guildCall");
                BLiveGiftMultiCall.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.guildCall, jsonGenerator, true);
            }
            if (bLiveSendLiveGiftResult.bagSystemCommentStatus != null) {
                jsonGenerator.writeFieldName("bagSystemCommentStatus");
                BLivePacketSystemCommentStatus.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.bagSystemCommentStatus, jsonGenerator, true);
            }
            if (bLiveSendLiveGiftResult.receiveMask != null) {
                jsonGenerator.writeFieldName("receiveMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.receiveMask, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("remainingDurationSec", bLiveSendLiveGiftResult.remainingDurationSec);
            String str3 = bLiveSendLiveGiftResult.tip;
            if (str3 != null) {
                jsonGenerator.writeStringField("tip", str3);
            }
            if (bLiveSendLiveGiftResult.videoChat != null) {
                jsonGenerator.writeFieldName("videoChat");
                BLiveGiftExtraVideoChat.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.videoChat, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("remainingDiamonds", bLiveSendLiveGiftResult.remainingDiamonds);
            if (bLiveSendLiveGiftResult.previewMask != null) {
                jsonGenerator.writeFieldName("previewMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.previewMask, jsonGenerator, true);
            }
            if (bLiveSendLiveGiftResult.senderShowMask != null) {
                jsonGenerator.writeFieldName("senderShowMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.senderShowMask, jsonGenerator, true);
            }
            if (bLiveSendLiveGiftResult.receiverShowMask != null) {
                jsonGenerator.writeFieldName("receiverShowMask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveSendLiveGiftResult.receiverShowMask, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendLiveGiftResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendlivegiftresult";

    @NonNull
    @ProtobufIndex(index = 8)
    public BLivePacketSystemCommentStatus bagSystemCommentStatus;

    @NonNull
    @ProtobufIndex(index = 5)
    public String effectExt;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveGivenGiftBrief givenGiftBrief;

    @Nullable
    @ProtobufIndex(index = 7)
    public BLiveGiftMultiCall guildCall;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUserMask mask;

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveGiftMultiCall multiCall;

    @Nullable
    @ProtobufIndex(index = 14)
    public BLiveUserMask previewMask;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveUserMask receiveMask;

    @Nullable
    @ProtobufIndex(index = 16)
    public BLiveUserMask receiverShowMask;

    @ProtobufIndex(index = 13)
    public long remainingDiamonds;

    @ProtobufIndex(index = 10)
    public long remainingDurationSec;

    @ProtobufIndex(index = 1)
    public long remainingTantanCoins;

    @Nullable
    @ProtobufIndex(index = 15)
    public BLiveUserMask senderShowMask;

    @NonNull
    @ProtobufIndex(index = 11)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 4)
    public String tradeNo;

    @NonNull
    @ProtobufIndex(index = 12)
    public BLiveGiftExtraVideoChat videoChat;

    public static BLiveSendLiveGiftResult new_() {
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = new BLiveSendLiveGiftResult();
        bLiveSendLiveGiftResult.nullCheck();
        return bLiveSendLiveGiftResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendLiveGiftResult mo225055clone() {
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = new BLiveSendLiveGiftResult();
        bLiveSendLiveGiftResult.remainingTantanCoins = this.remainingTantanCoins;
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.givenGiftBrief;
        if (bLiveGivenGiftBrief != null) {
            bLiveSendLiveGiftResult.givenGiftBrief = bLiveGivenGiftBrief.mo225055clone();
        }
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveSendLiveGiftResult.mask = bLiveUserMask.mo225055clone();
        }
        bLiveSendLiveGiftResult.tradeNo = this.tradeNo;
        bLiveSendLiveGiftResult.effectExt = this.effectExt;
        BLiveGiftMultiCall bLiveGiftMultiCall = this.multiCall;
        if (bLiveGiftMultiCall != null) {
            bLiveSendLiveGiftResult.multiCall = bLiveGiftMultiCall.mo225055clone();
        }
        BLiveGiftMultiCall bLiveGiftMultiCall2 = this.guildCall;
        if (bLiveGiftMultiCall2 != null) {
            bLiveSendLiveGiftResult.guildCall = bLiveGiftMultiCall2.mo225055clone();
        }
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.bagSystemCommentStatus;
        if (bLivePacketSystemCommentStatus != null) {
            bLiveSendLiveGiftResult.bagSystemCommentStatus = bLivePacketSystemCommentStatus.mo225055clone();
        }
        BLiveUserMask bLiveUserMask2 = this.receiveMask;
        if (bLiveUserMask2 != null) {
            bLiveSendLiveGiftResult.receiveMask = bLiveUserMask2.mo225055clone();
        }
        bLiveSendLiveGiftResult.remainingDurationSec = this.remainingDurationSec;
        bLiveSendLiveGiftResult.tip = this.tip;
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = this.videoChat;
        if (bLiveGiftExtraVideoChat != null) {
            bLiveSendLiveGiftResult.videoChat = bLiveGiftExtraVideoChat.mo225055clone();
        }
        bLiveSendLiveGiftResult.remainingDiamonds = this.remainingDiamonds;
        BLiveUserMask bLiveUserMask3 = this.previewMask;
        if (bLiveUserMask3 != null) {
            bLiveSendLiveGiftResult.previewMask = bLiveUserMask3.mo225055clone();
        }
        BLiveUserMask bLiveUserMask4 = this.senderShowMask;
        if (bLiveUserMask4 != null) {
            bLiveSendLiveGiftResult.senderShowMask = bLiveUserMask4.mo225055clone();
        }
        BLiveUserMask bLiveUserMask5 = this.receiverShowMask;
        if (bLiveUserMask5 != null) {
            bLiveSendLiveGiftResult.receiverShowMask = bLiveUserMask5.mo225055clone();
        }
        return bLiveSendLiveGiftResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendLiveGiftResult)) {
            return false;
        }
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = (BLiveSendLiveGiftResult) obj;
        return this.remainingTantanCoins == bLiveSendLiveGiftResult.remainingTantanCoins && ValueObject.util_equals(this.givenGiftBrief, bLiveSendLiveGiftResult.givenGiftBrief) && ValueObject.util_equals(this.mask, bLiveSendLiveGiftResult.mask) && ValueObject.util_equals(this.tradeNo, bLiveSendLiveGiftResult.tradeNo) && ValueObject.util_equals(this.effectExt, bLiveSendLiveGiftResult.effectExt) && ValueObject.util_equals(this.multiCall, bLiveSendLiveGiftResult.multiCall) && ValueObject.util_equals(this.guildCall, bLiveSendLiveGiftResult.guildCall) && ValueObject.util_equals(this.bagSystemCommentStatus, bLiveSendLiveGiftResult.bagSystemCommentStatus) && ValueObject.util_equals(this.receiveMask, bLiveSendLiveGiftResult.receiveMask) && this.remainingDurationSec == bLiveSendLiveGiftResult.remainingDurationSec && ValueObject.util_equals(this.tip, bLiveSendLiveGiftResult.tip) && ValueObject.util_equals(this.videoChat, bLiveSendLiveGiftResult.videoChat) && this.remainingDiamonds == bLiveSendLiveGiftResult.remainingDiamonds && ValueObject.util_equals(this.previewMask, bLiveSendLiveGiftResult.previewMask) && ValueObject.util_equals(this.senderShowMask, bLiveSendLiveGiftResult.senderShowMask) && ValueObject.util_equals(this.receiverShowMask, bLiveSendLiveGiftResult.receiverShowMask);
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
        long j = this.remainingTantanCoins;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.givenGiftBrief;
        int iHashCode = (i2 + (bLiveGivenGiftBrief != null ? bLiveGivenGiftBrief.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode2 = (iHashCode + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        String str = this.tradeNo;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.effectExt;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveGiftMultiCall bLiveGiftMultiCall = this.multiCall;
        int iHashCode5 = (iHashCode4 + (bLiveGiftMultiCall != null ? bLiveGiftMultiCall.hashCode() : 0)) * 41;
        BLiveGiftMultiCall bLiveGiftMultiCall2 = this.guildCall;
        int iHashCode6 = (iHashCode5 + (bLiveGiftMultiCall2 != null ? bLiveGiftMultiCall2.hashCode() : 0)) * 41;
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.bagSystemCommentStatus;
        int iHashCode7 = (iHashCode6 + (bLivePacketSystemCommentStatus != null ? bLivePacketSystemCommentStatus.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask2 = this.receiveMask;
        int iHashCode8 = bLiveUserMask2 != null ? bLiveUserMask2.hashCode() : 0;
        long j2 = this.remainingDurationSec;
        int i3 = (((iHashCode7 + iHashCode8) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str3 = this.tip;
        int iHashCode9 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChat = this.videoChat;
        int iHashCode10 = bLiveGiftExtraVideoChat != null ? bLiveGiftExtraVideoChat.hashCode() : 0;
        long j3 = this.remainingDiamonds;
        int i4 = (((iHashCode9 + iHashCode10) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        BLiveUserMask bLiveUserMask3 = this.previewMask;
        int iHashCode11 = (i4 + (bLiveUserMask3 != null ? bLiveUserMask3.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask4 = this.senderShowMask;
        int iHashCode12 = (iHashCode11 + (bLiveUserMask4 != null ? bLiveUserMask4.hashCode() : 0)) * 41;
        BLiveUserMask bLiveUserMask5 = this.receiverShowMask;
        int iHashCode13 = iHashCode12 + (bLiveUserMask5 != null ? bLiveUserMask5.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.givenGiftBrief == null) {
            this.givenGiftBrief = BLiveGivenGiftBrief.new_();
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.tradeNo == null) {
            this.tradeNo = "";
        }
        if (this.effectExt == null) {
            this.effectExt = "";
        }
        if (this.bagSystemCommentStatus == null) {
            this.bagSystemCommentStatus = BLivePacketSystemCommentStatus.new_();
        }
        if (this.receiveMask == null) {
            this.receiveMask = BLiveUserMask.new_();
        }
        if (this.tip == null) {
            this.tip = "";
        }
        if (this.videoChat == null) {
            this.videoChat = BLiveGiftExtraVideoChat.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
