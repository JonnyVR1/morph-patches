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
public class BLiveStealthPrivilege extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStealthPrivilege> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStealthPrivilege>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStealthPrivilege.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStealthPrivilege.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStealthPrivilege newInstance() {
            return new BLiveStealthPrivilege();
        }

        public boolean parseField(BLiveStealthPrivilege bLiveStealthPrivilege, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hiddenAnchorHierarchy":
                    bLiveStealthPrivilege.hiddenAnchorHierarchy = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hideLocation":
                    bLiveStealthPrivilege.hideLocation = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hideGroupConsumptionRank":
                    bLiveStealthPrivilege.hideGroupConsumptionRank = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hideLiveAvatar":
                    bLiveStealthPrivilege.hideLiveAvatar = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hideConsumeRecord":
                    bLiveStealthPrivilege.hideConsumeRecord = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStealthPrivilege bLiveStealthPrivilege, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveStealthPrivilege.hideConsumeRecord != null) {
                jsonGenerator.writeFieldName("hideConsumeRecord");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveStealthPrivilege.hideConsumeRecord, jsonGenerator, true);
            }
            if (bLiveStealthPrivilege.hideLiveAvatar != null) {
                jsonGenerator.writeFieldName("hideLiveAvatar");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveStealthPrivilege.hideLiveAvatar, jsonGenerator, true);
            }
            if (bLiveStealthPrivilege.hideLocation != null) {
                jsonGenerator.writeFieldName("hideLocation");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveStealthPrivilege.hideLocation, jsonGenerator, true);
            }
            if (bLiveStealthPrivilege.hideGroupConsumptionRank != null) {
                jsonGenerator.writeFieldName("hideGroupConsumptionRank");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveStealthPrivilege.hideGroupConsumptionRank, jsonGenerator, true);
            }
            if (bLiveStealthPrivilege.hiddenAnchorHierarchy != null) {
                jsonGenerator.writeFieldName("hiddenAnchorHierarchy");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveStealthPrivilege.hiddenAnchorHierarchy, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStealthPrivilege) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestealthprivilege";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveCommonConfig hiddenAnchorHierarchy;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCommonConfig hideConsumeRecord;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveCommonConfig hideGroupConsumptionRank;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveCommonConfig hideLiveAvatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveCommonConfig hideLocation;

    public static BLiveStealthPrivilege new_() {
        BLiveStealthPrivilege bLiveStealthPrivilege = new BLiveStealthPrivilege();
        bLiveStealthPrivilege.nullCheck();
        return bLiveStealthPrivilege;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStealthPrivilege mo225055clone() {
        BLiveStealthPrivilege bLiveStealthPrivilege = new BLiveStealthPrivilege();
        BLiveCommonConfig bLiveCommonConfig = this.hideConsumeRecord;
        if (bLiveCommonConfig != null) {
            bLiveStealthPrivilege.hideConsumeRecord = bLiveCommonConfig.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig2 = this.hideLiveAvatar;
        if (bLiveCommonConfig2 != null) {
            bLiveStealthPrivilege.hideLiveAvatar = bLiveCommonConfig2.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig3 = this.hideLocation;
        if (bLiveCommonConfig3 != null) {
            bLiveStealthPrivilege.hideLocation = bLiveCommonConfig3.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig4 = this.hideGroupConsumptionRank;
        if (bLiveCommonConfig4 != null) {
            bLiveStealthPrivilege.hideGroupConsumptionRank = bLiveCommonConfig4.mo225055clone();
        }
        BLiveCommonConfig bLiveCommonConfig5 = this.hiddenAnchorHierarchy;
        if (bLiveCommonConfig5 != null) {
            bLiveStealthPrivilege.hiddenAnchorHierarchy = bLiveCommonConfig5.mo225055clone();
        }
        return bLiveStealthPrivilege;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStealthPrivilege)) {
            return false;
        }
        BLiveStealthPrivilege bLiveStealthPrivilege = (BLiveStealthPrivilege) obj;
        return ValueObject.util_equals(this.hideConsumeRecord, bLiveStealthPrivilege.hideConsumeRecord) && ValueObject.util_equals(this.hideLiveAvatar, bLiveStealthPrivilege.hideLiveAvatar) && ValueObject.util_equals(this.hideLocation, bLiveStealthPrivilege.hideLocation) && ValueObject.util_equals(this.hideGroupConsumptionRank, bLiveStealthPrivilege.hideGroupConsumptionRank) && ValueObject.util_equals(this.hiddenAnchorHierarchy, bLiveStealthPrivilege.hiddenAnchorHierarchy);
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
        BLiveCommonConfig bLiveCommonConfig = this.hideConsumeRecord;
        int iHashCode = (i2 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig2 = this.hideLiveAvatar;
        int iHashCode2 = (iHashCode + (bLiveCommonConfig2 != null ? bLiveCommonConfig2.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig3 = this.hideLocation;
        int iHashCode3 = (iHashCode2 + (bLiveCommonConfig3 != null ? bLiveCommonConfig3.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig4 = this.hideGroupConsumptionRank;
        int iHashCode4 = (iHashCode3 + (bLiveCommonConfig4 != null ? bLiveCommonConfig4.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig5 = this.hiddenAnchorHierarchy;
        int iHashCode5 = iHashCode4 + (bLiveCommonConfig5 != null ? bLiveCommonConfig5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.hideConsumeRecord == null) {
            this.hideConsumeRecord = BLiveCommonConfig.new_();
        }
        if (this.hideLiveAvatar == null) {
            this.hideLiveAvatar = BLiveCommonConfig.new_();
        }
        if (this.hideLocation == null) {
            this.hideLocation = BLiveCommonConfig.new_();
        }
        if (this.hideGroupConsumptionRank == null) {
            this.hideGroupConsumptionRank = BLiveCommonConfig.new_();
        }
        if (this.hiddenAnchorHierarchy == null) {
            this.hiddenAnchorHierarchy = BLiveCommonConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
