package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
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
public class BLiveCampaign extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCampaign> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCampaign>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCampaign.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCampaign.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCampaign newInstance() {
            return new BLiveCampaign();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveCampaign bLiveCampaign, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2130603049:
                    if (str.equals("entranceSize")) {
                        b = 0;
                    }
                    break;
                case -2070551732:
                    if (str.equals("detailInset")) {
                        b = 1;
                    }
                    break;
                case -1973090466:
                    if (str.equals("detailUrl")) {
                        b = 2;
                    }
                    break;
                case -1850735395:
                    if (str.equals("validPeriod")) {
                        b = 3;
                    }
                    break;
                case -1633324987:
                    if (str.equals("entranceImage")) {
                        b = 4;
                    }
                    break;
                case -1188962263:
                    if (str.equals("isH5HandleClick")) {
                        b = 5;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        b = 6;
                    }
                    break;
                case -714394369:
                    if (str.equals("carouselSeconds")) {
                        b = 7;
                    }
                    break;
                case -258208885:
                    if (str.equals("popUpRules")) {
                        b = 8;
                    }
                    break;
                case -207274279:
                    if (str.equals("entranceUrl")) {
                        b = 9;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 10;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 11;
                    }
                    break;
                case 172620906:
                    if (str.equals("campaignType")) {
                        b = 12;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveCampaign.entranceSize = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 1:
                    bLiveCampaign.detailInset = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveCampaign.detailUrl = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveCampaign.validPeriod = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveCampaign.entranceImage = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveCampaign.isH5HandleClick = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    bLiveCampaign.schema = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveCampaign.carouselSeconds = jsonParser.getValueAsInt();
                    return true;
                case 8:
                    bLiveCampaign.popUpRules = BLivePopUpRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveCampaign.entranceUrl = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveCampaign.f45196id = jsonParser.getValueAsString();
                    return false;
                case 11:
                    bLiveCampaign.type = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveCampaign.campaignType = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveCampaign.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCampaign bLiveCampaign, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCampaign.f45196id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveCampaign.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("position", bLiveCampaign.position);
            String str3 = bLiveCampaign.entranceUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("entranceUrl", str3);
            }
            if (bLiveCampaign.entranceSize != null) {
                jsonGenerator.writeFieldName("entranceSize");
                JsonAdapter.serializeArray(bLiveCampaign.entranceSize, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            String str4 = bLiveCampaign.detailUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("detailUrl", str4);
            }
            if (bLiveCampaign.detailInset != null) {
                jsonGenerator.writeFieldName("detailInset");
                JsonAdapter.serializeArray(bLiveCampaign.detailInset, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            if (bLiveCampaign.validPeriod != null) {
                jsonGenerator.writeFieldName("validPeriod");
                JsonAdapter.serializeArray(bLiveCampaign.validPeriod, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            String str5 = bLiveCampaign.campaignType;
            if (str5 != null) {
                jsonGenerator.writeStringField("campaignType", str5);
            }
            jsonGenerator.writeBooleanField("isH5HandleClick", bLiveCampaign.isH5HandleClick);
            if (bLiveCampaign.popUpRules != null) {
                jsonGenerator.writeFieldName("popUpRules");
                BLivePopUpRules.JSON_ADAPTER.serialize(bLiveCampaign.popUpRules, jsonGenerator, true);
            }
            String str6 = bLiveCampaign.schema;
            if (str6 != null) {
                jsonGenerator.writeStringField("schema", str6);
            }
            jsonGenerator.writeNumberField("carouselSeconds", bLiveCampaign.carouselSeconds);
            String str7 = bLiveCampaign.entranceImage;
            if (str7 != null) {
                jsonGenerator.writeStringField("entranceImage", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecampaign";

    @NonNull
    @ProtobufIndex(index = 9)
    public String campaignType;

    @ProtobufIndex(index = 13)
    public int carouselSeconds;
    public int detailGravity;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<Double> detailInset;

    @NonNull
    @ProtobufIndex(index = 6)
    public String detailUrl;

    @NonNull
    @ProtobufIndex(index = 14)
    public String entranceImage;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<Integer> entranceSize;

    @NonNull
    @ProtobufIndex(index = 4)
    public String entranceUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45196id;

    @ProtobufIndex(index = 10)
    public boolean isH5HandleClick;

    @NonNull
    @ProtobufIndex(index = 11)
    public BLivePopUpRules popUpRules;

    @ProtobufIndex(index = 3)
    public int position;

    @NonNull
    @ProtobufIndex(index = 12)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Long> validPeriod;
    public CommonH5Builder.BgType webBgType = CommonH5Builder.BgType.DEFAULT_BG;
    public boolean isNeedCloseBtn = true;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m68917a(Long l2) {
        return l2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Double m68918b(Double d) {
        return d;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m68919c(Integer num) {
        return num;
    }

    public static BLiveCampaign new_() {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.nullCheck();
        return bLiveCampaign;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCampaign mo225055clone() {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.f45196id = this.f45196id;
        bLiveCampaign.type = this.type;
        bLiveCampaign.position = this.position;
        bLiveCampaign.entranceUrl = this.entranceUrl;
        List<Integer> list = this.entranceSize;
        if (list != null) {
            bLiveCampaign.entranceSize = ValueObject.util_map(list, new qcj() { // from class: l.ms1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveCampaign.m68919c((Integer) obj);
                }
            });
        }
        bLiveCampaign.detailUrl = this.detailUrl;
        List<Double> list2 = this.detailInset;
        if (list2 != null) {
            bLiveCampaign.detailInset = ValueObject.util_map(list2, new qcj() { // from class: l.ns1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveCampaign.m68918b((Double) obj);
                }
            });
        }
        List<Long> list3 = this.validPeriod;
        if (list3 != null) {
            bLiveCampaign.validPeriod = ValueObject.util_map(list3, new qcj() { // from class: l.os1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveCampaign.m68917a((Long) obj);
                }
            });
        }
        bLiveCampaign.campaignType = this.campaignType;
        bLiveCampaign.isH5HandleClick = this.isH5HandleClick;
        BLivePopUpRules bLivePopUpRules = this.popUpRules;
        if (bLivePopUpRules != null) {
            bLiveCampaign.popUpRules = bLivePopUpRules.mo225055clone();
        }
        bLiveCampaign.schema = this.schema;
        bLiveCampaign.carouselSeconds = this.carouselSeconds;
        bLiveCampaign.entranceImage = this.entranceImage;
        return bLiveCampaign;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCampaign)) {
            return false;
        }
        BLiveCampaign bLiveCampaign = (BLiveCampaign) obj;
        return ValueObject.util_equals(this.f45196id, bLiveCampaign.f45196id) && ValueObject.util_equals(this.type, bLiveCampaign.type) && this.position == bLiveCampaign.position && ValueObject.util_equals(this.entranceUrl, bLiveCampaign.entranceUrl) && ValueObject.util_equals(this.entranceSize, bLiveCampaign.entranceSize) && ValueObject.util_equals(this.detailUrl, bLiveCampaign.detailUrl) && ValueObject.util_equals(this.detailInset, bLiveCampaign.detailInset) && ValueObject.util_equals(this.validPeriod, bLiveCampaign.validPeriod) && ValueObject.util_equals(this.campaignType, bLiveCampaign.campaignType) && this.isH5HandleClick == bLiveCampaign.isH5HandleClick && ValueObject.util_equals(this.popUpRules, bLiveCampaign.popUpRules) && ValueObject.util_equals(this.schema, bLiveCampaign.schema) && this.carouselSeconds == bLiveCampaign.carouselSeconds && ValueObject.util_equals(this.entranceImage, bLiveCampaign.entranceImage);
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
        String str = this.f45196id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.position) * 41;
        String str3 = this.entranceUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<Integer> list = this.entranceSize;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.detailUrl;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<Double> list2 = this.detailInset;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Long> list3 = this.validPeriod;
        int iHashCode7 = (iHashCode6 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str5 = this.campaignType;
        int iHashCode8 = (((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.isH5HandleClick ? 1231 : 1237)) * 41;
        BLivePopUpRules bLivePopUpRules = this.popUpRules;
        int iHashCode9 = (iHashCode8 + (bLivePopUpRules != null ? bLivePopUpRules.hashCode() : 0)) * 41;
        String str6 = this.schema;
        int iHashCode10 = (((iHashCode9 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.carouselSeconds) * 41;
        String str7 = this.entranceImage;
        int iHashCode11 = iHashCode10 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    public boolean isImageType() {
        return !"".equals(this.entranceImage);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45196id == null) {
            this.f45196id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.entranceUrl == null) {
            this.entranceUrl = "";
        }
        if (this.entranceSize == null) {
            this.entranceSize = new ArrayList();
        }
        if (this.detailUrl == null) {
            this.detailUrl = "";
        }
        if (this.detailInset == null) {
            this.detailInset = new ArrayList();
        }
        if (this.validPeriod == null) {
            this.validPeriod = new ArrayList();
        }
        if (this.campaignType == null) {
            this.campaignType = "";
        }
        if (this.popUpRules == null) {
            this.popUpRules = BLivePopUpRules.new_();
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.entranceImage == null) {
            this.entranceImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
