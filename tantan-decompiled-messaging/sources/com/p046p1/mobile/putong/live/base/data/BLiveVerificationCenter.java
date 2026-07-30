package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVerificationCenter extends CopyObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVerificationCenter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVerificationCenter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVerificationCenter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVerificationCenter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVerificationCenter newInstance() {
            return new BLiveVerificationCenter();
        }

        public boolean parseField(BLiveVerificationCenter bLiveVerificationCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    bLiveVerificationCenter.anchor = BLiveVerificationAnchor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "anchorType":
                    bLiveVerificationCenter.anchorType = jsonParser.getValueAsString();
                    return true;
                case "idCard":
                    bLiveVerificationCenter.idCard = BLiveIdCardVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    bLiveVerificationCenter.userId = jsonParser.getValueAsString();
                    return true;
                case "voiceAnchor":
                    bLiveVerificationCenter.voiceAnchor = BLiveVerificationAnchor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "identity":
                    bLiveVerificationCenter.identity = BLiveIdentity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVerificationCenter.f56008id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveVerificationCenter.verificationType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVerificationCenter bLiveVerificationCenter, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVerificationCenter.f56008id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVerificationCenter.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveVerificationCenter.verificationType;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            if (bLiveVerificationCenter.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveVerificationAnchor.JSON_ADAPTER.serialize(bLiveVerificationCenter.anchor, jsonGenerator, true);
            }
            if (bLiveVerificationCenter.identity != null) {
                jsonGenerator.writeFieldName("identity");
                BLiveIdentity.JSON_ADAPTER.serialize(bLiveVerificationCenter.identity, jsonGenerator, true);
            }
            if (bLiveVerificationCenter.voiceAnchor != null) {
                jsonGenerator.writeFieldName("voiceAnchor");
                BLiveVerificationAnchor.JSON_ADAPTER.serialize(bLiveVerificationCenter.voiceAnchor, jsonGenerator, true);
            }
            String str4 = bLiveVerificationCenter.anchorType;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorType", str4);
            }
            if (bLiveVerificationCenter.idCard != null) {
                jsonGenerator.writeFieldName("idCard");
                BLiveIdCardVerificationInfo.JSON_ADAPTER.serialize(bLiveVerificationCenter.idCard, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVerificationCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveverificationcenter";

    @Nullable
    public BLiveVerificationAnchor anchor;

    @NonNull
    @ProtobufIndex(index = 53)
    public String anchorType;

    @Nullable
    @ProtobufIndex(index = 54)
    public BLiveIdCardVerificationInfo idCard;

    @Nullable
    public BLiveIdentity identity;

    @NonNull
    @ProtobufIndex(index = 51)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 52)
    public String verificationType;

    @Nullable
    public BLiveVerificationAnchor voiceAnchor;

    public static BLiveVerificationCenter new_() {
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        bLiveVerificationCenter.nullCheck();
        return bLiveVerificationCenter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVerificationCenter mo223809clone() {
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        bLiveVerificationCenter._id = this._id;
        bLiveVerificationCenter.f56008id = this.f56008id;
        bLiveVerificationCenter.userId = this.userId;
        bLiveVerificationCenter.verificationType = this.verificationType;
        BLiveVerificationAnchor bLiveVerificationAnchor = this.anchor;
        if (bLiveVerificationAnchor != null) {
            bLiveVerificationCenter.anchor = bLiveVerificationAnchor.mo223809clone();
        }
        BLiveIdentity bLiveIdentity = this.identity;
        if (bLiveIdentity != null) {
            bLiveVerificationCenter.identity = bLiveIdentity.mo223809clone();
        }
        BLiveVerificationAnchor bLiveVerificationAnchor2 = this.voiceAnchor;
        if (bLiveVerificationAnchor2 != null) {
            bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor2.mo223809clone();
        }
        bLiveVerificationCenter.anchorType = this.anchorType;
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = this.idCard;
        if (bLiveIdCardVerificationInfo != null) {
            bLiveVerificationCenter.idCard = bLiveIdCardVerificationInfo.mo223809clone();
        }
        return bLiveVerificationCenter;
    }

    @Override // com.tantanapp.common.data.CopyObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVerificationCenter)) {
            return false;
        }
        BLiveVerificationCenter bLiveVerificationCenter = (BLiveVerificationCenter) obj;
        return super.equals(obj) && ValueObject.util_equals(this.userId, bLiveVerificationCenter.userId) && ValueObject.util_equals(this.verificationType, bLiveVerificationCenter.verificationType) && ValueObject.util_equals(this.anchor, bLiveVerificationCenter.anchor) && ValueObject.util_equals(this.identity, bLiveVerificationCenter.identity) && ValueObject.util_equals(this.voiceAnchor, bLiveVerificationCenter.voiceAnchor) && ValueObject.util_equals(this.anchorType, bLiveVerificationCenter.anchorType) && ValueObject.util_equals(this.idCard, bLiveVerificationCenter.idCard);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.CopyObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.verificationType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveVerificationAnchor bLiveVerificationAnchor = this.anchor;
        int iHashCode4 = (iHashCode3 + (bLiveVerificationAnchor != null ? bLiveVerificationAnchor.hashCode() : 0)) * 41;
        BLiveIdentity bLiveIdentity = this.identity;
        int iHashCode5 = (iHashCode4 + (bLiveIdentity != null ? bLiveIdentity.hashCode() : 0)) * 41;
        BLiveVerificationAnchor bLiveVerificationAnchor2 = this.voiceAnchor;
        int iHashCode6 = (iHashCode5 + (bLiveVerificationAnchor2 != null ? bLiveVerificationAnchor2.hashCode() : 0)) * 41;
        String str3 = this.anchorType;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = this.idCard;
        int iHashCode8 = iHashCode7 + (bLiveIdCardVerificationInfo != null ? bLiveIdCardVerificationInfo.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.verificationType == null) {
            this.verificationType = "";
        }
        if (this.anchorType == null) {
            this.anchorType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
