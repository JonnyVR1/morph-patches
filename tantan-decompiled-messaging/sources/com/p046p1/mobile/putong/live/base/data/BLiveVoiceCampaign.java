package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceCampaign extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCampaign> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCampaign>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCampaign.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCampaign newInstance() {
            return new BLiveVoiceCampaign();
        }

        public boolean parseField(BLiveVoiceCampaign bLiveVoiceCampaign, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "entranceSize":
                    bLiveVoiceCampaign.entranceSize = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "detailInset":
                    bLiveVoiceCampaign.detailInset = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "detailUrl":
                    bLiveVoiceCampaign.detailUrl = jsonParser.getValueAsString();
                    return true;
                case "validPeriod":
                    bLiveVoiceCampaign.validPeriod = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "entranceImage":
                    bLiveVoiceCampaign.entranceImage = jsonParser.getValueAsString();
                    return true;
                case "isH5HandleClick":
                    bLiveVoiceCampaign.isH5HandleClick = jsonParser.getValueAsBoolean();
                    return true;
                case "schema":
                    bLiveVoiceCampaign.schema = jsonParser.getValueAsString();
                    return true;
                case "carouselSeconds":
                    bLiveVoiceCampaign.carouselSeconds = jsonParser.getValueAsInt();
                    return true;
                case "entranceUrl":
                    bLiveVoiceCampaign.entranceUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceCampaign.f44490id = jsonParser.getValueAsString();
                    return false;
                case "campaignType":
                    bLiveVoiceCampaign.campaignType = jsonParser.getValueAsString();
                    return true;
                case "position":
                    bLiveVoiceCampaign.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCampaign bLiveVoiceCampaign, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCampaign.f44490id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceCampaign.campaignType;
            if (str2 != null) {
                jsonGenerator.writeStringField("campaignType", str2);
            }
            jsonGenerator.writeNumberField("position", bLiveVoiceCampaign.position);
            String str3 = bLiveVoiceCampaign.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
            String str4 = bLiveVoiceCampaign.detailUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("detailUrl", str4);
            }
            jsonGenerator.writeNumberField("carouselSeconds", bLiveVoiceCampaign.carouselSeconds);
            jsonGenerator.writeBooleanField("isH5HandleClick", bLiveVoiceCampaign.isH5HandleClick);
            if (bLiveVoiceCampaign.entranceSize != null) {
                jsonGenerator.writeFieldName("entranceSize");
                JsonAdapter.serializeArray(bLiveVoiceCampaign.entranceSize, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveVoiceCampaign.detailInset != null) {
                jsonGenerator.writeFieldName("detailInset");
                JsonAdapter.serializeArray(bLiveVoiceCampaign.detailInset, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            if (bLiveVoiceCampaign.validPeriod != null) {
                jsonGenerator.writeFieldName("validPeriod");
                JsonAdapter.serializeArray(bLiveVoiceCampaign.validPeriod, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            String str5 = bLiveVoiceCampaign.entranceUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("entranceUrl", str5);
            }
            String str6 = bLiveVoiceCampaign.entranceImage;
            if (str6 != null) {
                jsonGenerator.writeStringField("entranceImage", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecampaign";

    @NonNull
    @ProtobufIndex(index = 2)
    public String campaignType;

    @ProtobufIndex(index = 6)
    public int carouselSeconds;
    public int detailGravity;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<Integer> detailInset;

    @NonNull
    @ProtobufIndex(index = 5)
    public String detailUrl;

    @NonNull
    @ProtobufIndex(index = 12)
    public String entranceImage;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<Integer> entranceSize;

    @NonNull
    @ProtobufIndex(index = 11)
    public String entranceUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44490id;

    @ProtobufIndex(index = 7)
    public boolean isH5HandleClick;

    @ProtobufIndex(index = 3)
    public int position;

    @NonNull
    @ProtobufIndex(index = 4)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<Integer> validPeriod;
    public CommonH5Builder.BgType webBgType = CommonH5Builder.BgType.DEFAULT_BG;
    public boolean isNeedCloseBtn = true;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m68351a(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m68352b(Integer num) {
        return num;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m68353c(Integer num) {
        return num;
    }

    public static BLiveVoiceCampaign new_() {
        BLiveVoiceCampaign bLiveVoiceCampaign = new BLiveVoiceCampaign();
        bLiveVoiceCampaign.nullCheck();
        return bLiveVoiceCampaign;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCampaign mo223809clone() {
        BLiveVoiceCampaign bLiveVoiceCampaign = new BLiveVoiceCampaign();
        bLiveVoiceCampaign.f44490id = this.f44490id;
        bLiveVoiceCampaign.campaignType = this.campaignType;
        bLiveVoiceCampaign.position = this.position;
        bLiveVoiceCampaign.schema = this.schema;
        bLiveVoiceCampaign.detailUrl = this.detailUrl;
        bLiveVoiceCampaign.carouselSeconds = this.carouselSeconds;
        bLiveVoiceCampaign.isH5HandleClick = this.isH5HandleClick;
        List<Integer> list = this.entranceSize;
        if (list != null) {
            bLiveVoiceCampaign.entranceSize = ValueObject.util_map(list, new w9j() { // from class: l.f82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceCampaign.m68352b((Integer) obj);
                }
            });
        }
        List<Integer> list2 = this.detailInset;
        if (list2 != null) {
            bLiveVoiceCampaign.detailInset = ValueObject.util_map(list2, new w9j() { // from class: l.g82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceCampaign.m68353c((Integer) obj);
                }
            });
        }
        List<Integer> list3 = this.validPeriod;
        if (list3 != null) {
            bLiveVoiceCampaign.validPeriod = ValueObject.util_map(list3, new w9j() { // from class: l.h82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceCampaign.m68351a((Integer) obj);
                }
            });
        }
        bLiveVoiceCampaign.entranceUrl = this.entranceUrl;
        bLiveVoiceCampaign.entranceImage = this.entranceImage;
        return bLiveVoiceCampaign;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCampaign)) {
            return false;
        }
        BLiveVoiceCampaign bLiveVoiceCampaign = (BLiveVoiceCampaign) obj;
        return ValueObject.util_equals(this.f44490id, bLiveVoiceCampaign.f44490id) && ValueObject.util_equals(this.campaignType, bLiveVoiceCampaign.campaignType) && this.position == bLiveVoiceCampaign.position && ValueObject.util_equals(this.schema, bLiveVoiceCampaign.schema) && ValueObject.util_equals(this.detailUrl, bLiveVoiceCampaign.detailUrl) && this.carouselSeconds == bLiveVoiceCampaign.carouselSeconds && this.isH5HandleClick == bLiveVoiceCampaign.isH5HandleClick && ValueObject.util_equals(this.entranceSize, bLiveVoiceCampaign.entranceSize) && ValueObject.util_equals(this.detailInset, bLiveVoiceCampaign.detailInset) && ValueObject.util_equals(this.validPeriod, bLiveVoiceCampaign.validPeriod) && ValueObject.util_equals(this.entranceUrl, bLiveVoiceCampaign.entranceUrl) && ValueObject.util_equals(this.entranceImage, bLiveVoiceCampaign.entranceImage);
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
        String str = this.f44490id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.campaignType;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.position) * 41;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.detailUrl;
        int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.carouselSeconds) * 41) + (this.isH5HandleClick ? 1231 : 1237)) * 41;
        List<Integer> list = this.entranceSize;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.detailInset;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Integer> list3 = this.validPeriod;
        int iHashCode7 = (iHashCode6 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str5 = this.entranceUrl;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.entranceImage;
        int iHashCode9 = iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44490id == null) {
            this.f44490id = "";
        }
        if (this.campaignType == null) {
            this.campaignType = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.detailUrl == null) {
            this.detailUrl = "";
        }
        if (this.entranceSize == null) {
            this.entranceSize = new ArrayList();
        }
        if (this.detailInset == null) {
            this.detailInset = new ArrayList();
        }
        if (this.validPeriod == null) {
            this.validPeriod = new ArrayList();
        }
        if (this.entranceUrl == null) {
            this.entranceUrl = "";
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
