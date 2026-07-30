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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSuperGodReward extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuperGodReward> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuperGodReward>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuperGodReward.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuperGodReward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuperGodReward newInstance() {
            return new BLiveSuperGodReward();
        }

        public boolean parseField(BLiveSuperGodReward bLiveSuperGodReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resourceId":
                    bLiveSuperGodReward.resourceId = jsonParser.getValueAsString();
                    return true;
                case "iconGrey":
                    bLiveSuperGodReward.iconGrey = jsonParser.getValueAsString();
                    return true;
                case "resourceType":
                    bLiveSuperGodReward.resourceType = jsonParser.getValueAsString();
                    return true;
                case "coverUrl":
                    bLiveSuperGodReward.coverUrl = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    bLiveSuperGodReward.desc = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveSuperGodReward.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveSuperGodReward.title = jsonParser.getValueAsString();
                    return true;
                case "resourceUrl":
                    bLiveSuperGodReward.resourceUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuperGodReward bLiveSuperGodReward, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuperGodReward.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveSuperGodReward.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            String str3 = bLiveSuperGodReward.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveSuperGodReward.iconGrey;
            if (str4 != null) {
                jsonGenerator.writeStringField("iconGrey", str4);
            }
            String str5 = bLiveSuperGodReward.resourceType;
            if (str5 != null) {
                jsonGenerator.writeStringField("resourceType", str5);
            }
            String str6 = bLiveSuperGodReward.resourceId;
            if (str6 != null) {
                jsonGenerator.writeStringField("resourceId", str6);
            }
            String str7 = bLiveSuperGodReward.resourceUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("resourceUrl", str7);
            }
            String str8 = bLiveSuperGodReward.coverUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("coverUrl", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuperGodReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesupergodreward";

    @NonNull
    @ProtobufIndex(index = 8)
    public String coverUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconGrey;

    @NonNull
    @ProtobufIndex(index = 6)
    public String resourceId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String resourceType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String resourceUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveSuperGodReward new_() {
        BLiveSuperGodReward bLiveSuperGodReward = new BLiveSuperGodReward();
        bLiveSuperGodReward.nullCheck();
        return bLiveSuperGodReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuperGodReward mo225055clone() {
        BLiveSuperGodReward bLiveSuperGodReward = new BLiveSuperGodReward();
        bLiveSuperGodReward.title = this.title;
        bLiveSuperGodReward.desc = this.desc;
        bLiveSuperGodReward.icon = this.icon;
        bLiveSuperGodReward.iconGrey = this.iconGrey;
        bLiveSuperGodReward.resourceType = this.resourceType;
        bLiveSuperGodReward.resourceId = this.resourceId;
        bLiveSuperGodReward.resourceUrl = this.resourceUrl;
        bLiveSuperGodReward.coverUrl = this.coverUrl;
        return bLiveSuperGodReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuperGodReward)) {
            return false;
        }
        BLiveSuperGodReward bLiveSuperGodReward = (BLiveSuperGodReward) obj;
        return ValueObject.util_equals(this.title, bLiveSuperGodReward.title) && ValueObject.util_equals(this.desc, bLiveSuperGodReward.desc) && ValueObject.util_equals(this.icon, bLiveSuperGodReward.icon) && ValueObject.util_equals(this.iconGrey, bLiveSuperGodReward.iconGrey) && ValueObject.util_equals(this.resourceType, bLiveSuperGodReward.resourceType) && ValueObject.util_equals(this.resourceId, bLiveSuperGodReward.resourceId) && ValueObject.util_equals(this.resourceUrl, bLiveSuperGodReward.resourceUrl) && ValueObject.util_equals(this.coverUrl, bLiveSuperGodReward.coverUrl);
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
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.iconGrey;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.resourceType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.resourceId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.resourceUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.coverUrl;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.iconGrey == null) {
            this.iconGrey = "";
        }
        if (this.resourceType == null) {
            this.resourceType = "";
        }
        if (this.resourceId == null) {
            this.resourceId = "";
        }
        if (this.resourceUrl == null) {
            this.resourceUrl = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
