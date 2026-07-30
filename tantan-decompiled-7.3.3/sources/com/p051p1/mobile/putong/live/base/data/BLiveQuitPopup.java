package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveQuitPopup extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveQuitPopup> JSON_ADAPTER = new ObjectJsonAdapter<BLiveQuitPopup>() { // from class: com.p1.mobile.putong.live.base.data.BLiveQuitPopup.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveQuitPopup.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveQuitPopup newInstance() {
            return new BLiveQuitPopup();
        }

        public boolean parseField(BLiveQuitPopup bLiveQuitPopup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "level2SuggestedLives":
                    bLiveQuitPopup.level2SuggestedLives = JsonAdapter.parseArray(jsonParser, BLiveSuggestLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "recommendPolicyIcon":
                    bLiveQuitPopup.recommendPolicyIcon = jsonParser.getValueAsString();
                    return true;
                case "recommendPolicyName":
                    bLiveQuitPopup.recommendPolicyName = jsonParser.getValueAsString();
                    return true;
                case "recommendPolicyImage":
                    bLiveQuitPopup.recommendPolicyImage = jsonParser.getValueAsString();
                    return true;
                case "giftInfo":
                    bLiveQuitPopup.giftInfo = BLiveCustomToast.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pageViewId":
                    bLiveQuitPopup.pageViewId = jsonParser.getValueAsString();
                    return true;
                case "customContent":
                    bLiveQuitPopup.customContent = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveQuitPopup bLiveQuitPopup, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveQuitPopup.level2SuggestedLives != null) {
                jsonGenerator.writeFieldName("level2SuggestedLives");
                JsonAdapter.serializeArray(bLiveQuitPopup.level2SuggestedLives, jsonGenerator, BLiveSuggestLive.JSON_ADAPTER);
            }
            String str = bLiveQuitPopup.recommendPolicyName;
            if (str != null) {
                jsonGenerator.writeStringField("recommendPolicyName", str);
            }
            String str2 = bLiveQuitPopup.recommendPolicyIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("recommendPolicyIcon", str2);
            }
            String str3 = bLiveQuitPopup.recommendPolicyImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("recommendPolicyImage", str3);
            }
            String str4 = bLiveQuitPopup.pageViewId;
            if (str4 != null) {
                jsonGenerator.writeStringField("pageViewId", str4);
            }
            String str5 = bLiveQuitPopup.customContent;
            if (str5 != null) {
                jsonGenerator.writeStringField("customContent", str5);
            }
            if (bLiveQuitPopup.giftInfo != null) {
                jsonGenerator.writeFieldName("giftInfo");
                BLiveCustomToast.JSON_ADAPTER.serialize(bLiveQuitPopup.giftInfo, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveQuitPopup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivequitpopup";

    @NonNull
    @ProtobufIndex(index = 6)
    public String customContent;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveCustomToast giftInfo;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveSuggestLive> level2SuggestedLives;

    @NonNull
    @ProtobufIndex(index = 5)
    public String pageViewId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String recommendPolicyIcon;

    @NonNull
    @ProtobufIndex(index = 4)
    public String recommendPolicyImage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String recommendPolicyName;

    public static BLiveQuitPopup new_() {
        BLiveQuitPopup bLiveQuitPopup = new BLiveQuitPopup();
        bLiveQuitPopup.nullCheck();
        return bLiveQuitPopup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveQuitPopup mo225055clone() {
        BLiveQuitPopup bLiveQuitPopup = new BLiveQuitPopup();
        List<BLiveSuggestLive> list = this.level2SuggestedLives;
        if (list != null) {
            bLiveQuitPopup.level2SuggestedLives = ValueObject.util_map(list, new qcj() { // from class: l.y42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).mo225055clone();
                }
            });
        }
        bLiveQuitPopup.recommendPolicyName = this.recommendPolicyName;
        bLiveQuitPopup.recommendPolicyIcon = this.recommendPolicyIcon;
        bLiveQuitPopup.recommendPolicyImage = this.recommendPolicyImage;
        bLiveQuitPopup.pageViewId = this.pageViewId;
        bLiveQuitPopup.customContent = this.customContent;
        BLiveCustomToast bLiveCustomToast = this.giftInfo;
        if (bLiveCustomToast != null) {
            bLiveQuitPopup.giftInfo = bLiveCustomToast.mo225055clone();
        }
        return bLiveQuitPopup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveQuitPopup)) {
            return false;
        }
        BLiveQuitPopup bLiveQuitPopup = (BLiveQuitPopup) obj;
        return ValueObject.util_equals(this.level2SuggestedLives, bLiveQuitPopup.level2SuggestedLives) && ValueObject.util_equals(this.recommendPolicyName, bLiveQuitPopup.recommendPolicyName) && ValueObject.util_equals(this.recommendPolicyIcon, bLiveQuitPopup.recommendPolicyIcon) && ValueObject.util_equals(this.recommendPolicyImage, bLiveQuitPopup.recommendPolicyImage) && ValueObject.util_equals(this.pageViewId, bLiveQuitPopup.pageViewId) && ValueObject.util_equals(this.customContent, bLiveQuitPopup.customContent) && ValueObject.util_equals(this.giftInfo, bLiveQuitPopup.giftInfo);
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
        List<BLiveSuggestLive> list = this.level2SuggestedLives;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.recommendPolicyName;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.recommendPolicyIcon;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.recommendPolicyImage;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pageViewId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.customContent;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveCustomToast bLiveCustomToast = this.giftInfo;
        int iHashCode7 = iHashCode6 + (bLiveCustomToast != null ? bLiveCustomToast.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.level2SuggestedLives == null) {
            this.level2SuggestedLives = new ArrayList();
        }
        if (this.recommendPolicyName == null) {
            this.recommendPolicyName = "";
        }
        if (this.recommendPolicyIcon == null) {
            this.recommendPolicyIcon = "";
        }
        if (this.recommendPolicyImage == null) {
            this.recommendPolicyImage = "";
        }
        if (this.pageViewId == null) {
            this.pageViewId = "";
        }
        if (this.customContent == null) {
            this.customContent = "";
        }
        if (this.giftInfo == null) {
            this.giftInfo = BLiveCustomToast.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
