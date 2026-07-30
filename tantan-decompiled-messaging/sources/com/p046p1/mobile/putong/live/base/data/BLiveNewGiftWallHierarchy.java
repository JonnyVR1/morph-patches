package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Grade;
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
public class BLiveNewGiftWallHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallHierarchy.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallHierarchy newInstance() {
            return new BLiveNewGiftWallHierarchy();
        }

        public boolean parseField(BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "smallIcon":
                    bLiveNewGiftWallHierarchy.smallIcon = jsonParser.getValueAsString();
                    return true;
                case "progress":
                    bLiveNewGiftWallHierarchy.progress = BLiveNewGiftWallProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tabBgUrl":
                    bLiveNewGiftWallHierarchy.tabBgUrl = jsonParser.getValueAsString();
                    return true;
                case "cardBgUrl":
                    bLiveNewGiftWallHierarchy.cardBgUrl = jsonParser.getValueAsString();
                    return true;
                case "smallIconBgUrl":
                    bLiveNewGiftWallHierarchy.smallIconBgUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveNewGiftWallHierarchy.f44412id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveNewGiftWallHierarchy.name = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveNewGiftWallHierarchy.grade = jsonParser.getValueAsInt();
                    return true;
                case "needSweepLight":
                    bLiveNewGiftWallHierarchy.needSweepLight = jsonParser.getValueAsBoolean();
                    return true;
                case "largeIcon":
                    bLiveNewGiftWallHierarchy.largeIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallHierarchy.f44412id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveNewGiftWallHierarchy.grade);
            String str2 = bLiveNewGiftWallHierarchy.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeBooleanField("needSweepLight", bLiveNewGiftWallHierarchy.needSweepLight);
            if (bLiveNewGiftWallHierarchy.progress != null) {
                jsonGenerator.writeFieldName("progress");
                BLiveNewGiftWallProgress.JSON_ADAPTER.serialize(bLiveNewGiftWallHierarchy.progress, jsonGenerator, true);
            }
            String str3 = bLiveNewGiftWallHierarchy.smallIcon;
            if (str3 != null) {
                jsonGenerator.writeStringField("smallIcon", str3);
            }
            String str4 = bLiveNewGiftWallHierarchy.smallIconBgUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("smallIconBgUrl", str4);
            }
            String str5 = bLiveNewGiftWallHierarchy.largeIcon;
            if (str5 != null) {
                jsonGenerator.writeStringField("largeIcon", str5);
            }
            String str6 = bLiveNewGiftWallHierarchy.tabBgUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("tabBgUrl", str6);
            }
            String str7 = bLiveNewGiftWallHierarchy.cardBgUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("cardBgUrl", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallhierarchy";

    @NonNull
    @ProtobufIndex(index = 10)
    public String cardBgUrl;

    @ProtobufIndex(index = 2)
    public int grade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44412id;

    @NonNull
    @ProtobufIndex(index = 8)
    public String largeIcon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @ProtobufIndex(index = 4)
    public boolean needSweepLight;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveNewGiftWallProgress progress;

    @NonNull
    @ProtobufIndex(index = 6)
    public String smallIcon;

    @NonNull
    @ProtobufIndex(index = 7)
    public String smallIconBgUrl;

    @NonNull
    @ProtobufIndex(index = 9)
    public String tabBgUrl;

    public static BLiveNewGiftWallHierarchy new_() {
        BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = new BLiveNewGiftWallHierarchy();
        bLiveNewGiftWallHierarchy.nullCheck();
        return bLiveNewGiftWallHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallHierarchy mo223809clone() {
        BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = new BLiveNewGiftWallHierarchy();
        bLiveNewGiftWallHierarchy.f44412id = this.f44412id;
        bLiveNewGiftWallHierarchy.grade = this.grade;
        bLiveNewGiftWallHierarchy.name = this.name;
        bLiveNewGiftWallHierarchy.needSweepLight = this.needSweepLight;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = this.progress;
        if (bLiveNewGiftWallProgress != null) {
            bLiveNewGiftWallHierarchy.progress = bLiveNewGiftWallProgress.mo223809clone();
        }
        bLiveNewGiftWallHierarchy.smallIcon = this.smallIcon;
        bLiveNewGiftWallHierarchy.smallIconBgUrl = this.smallIconBgUrl;
        bLiveNewGiftWallHierarchy.largeIcon = this.largeIcon;
        bLiveNewGiftWallHierarchy.tabBgUrl = this.tabBgUrl;
        bLiveNewGiftWallHierarchy.cardBgUrl = this.cardBgUrl;
        return bLiveNewGiftWallHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallHierarchy)) {
            return false;
        }
        BLiveNewGiftWallHierarchy bLiveNewGiftWallHierarchy = (BLiveNewGiftWallHierarchy) obj;
        return ValueObject.util_equals(this.f44412id, bLiveNewGiftWallHierarchy.f44412id) && this.grade == bLiveNewGiftWallHierarchy.grade && ValueObject.util_equals(this.name, bLiveNewGiftWallHierarchy.name) && this.needSweepLight == bLiveNewGiftWallHierarchy.needSweepLight && ValueObject.util_equals(this.progress, bLiveNewGiftWallHierarchy.progress) && ValueObject.util_equals(this.smallIcon, bLiveNewGiftWallHierarchy.smallIcon) && ValueObject.util_equals(this.smallIconBgUrl, bLiveNewGiftWallHierarchy.smallIconBgUrl) && ValueObject.util_equals(this.largeIcon, bLiveNewGiftWallHierarchy.largeIcon) && ValueObject.util_equals(this.tabBgUrl, bLiveNewGiftWallHierarchy.tabBgUrl) && ValueObject.util_equals(this.cardBgUrl, bLiveNewGiftWallHierarchy.cardBgUrl);
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
        String str = this.f44412id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.grade) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.needSweepLight ? 1231 : 1237)) * 41;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = this.progress;
        int iHashCode3 = (iHashCode2 + (bLiveNewGiftWallProgress != null ? bLiveNewGiftWallProgress.hashCode() : 0)) * 41;
        String str3 = this.smallIcon;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.smallIconBgUrl;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.largeIcon;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.tabBgUrl;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.cardBgUrl;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44412id == null) {
            this.f44412id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.progress == null) {
            this.progress = BLiveNewGiftWallProgress.new_();
        }
        if (this.smallIcon == null) {
            this.smallIcon = "";
        }
        if (this.smallIconBgUrl == null) {
            this.smallIconBgUrl = "";
        }
        if (this.largeIcon == null) {
            this.largeIcon = "";
        }
        if (this.tabBgUrl == null) {
            this.tabBgUrl = "";
        }
        if (this.cardBgUrl == null) {
            this.cardBgUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
