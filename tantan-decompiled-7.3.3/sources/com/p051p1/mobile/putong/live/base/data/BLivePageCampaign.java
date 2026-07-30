package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignLink;
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
public class BLivePageCampaign extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePageCampaign> JSON_ADAPTER = new ObjectJsonAdapter<BLivePageCampaign>() { // from class: com.p1.mobile.putong.live.base.data.BLivePageCampaign.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePageCampaign.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePageCampaign newInstance() {
            return new BLivePageCampaign();
        }

        public boolean parseField(BLivePageCampaign bLivePageCampaign, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("title")) {
                bLivePageCampaign.title = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("campaignLinks")) {
                return false;
            }
            bLivePageCampaign.campaignLinks = JsonAdapter.parseArray(jsonParser, BLiveCampaignLink.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePageCampaign bLivePageCampaign, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePageCampaign.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            if (bLivePageCampaign.campaignLinks != null) {
                jsonGenerator.writeFieldName("campaignLinks");
                JsonAdapter.serializeArray(bLivePageCampaign.campaignLinks, jsonGenerator, BLiveCampaignLink.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePageCampaign) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepagecampaign";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveCampaignLink> campaignLinks;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLivePageCampaign new_() {
        BLivePageCampaign bLivePageCampaign = new BLivePageCampaign();
        bLivePageCampaign.nullCheck();
        return bLivePageCampaign;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePageCampaign mo225055clone() {
        BLivePageCampaign bLivePageCampaign = new BLivePageCampaign();
        bLivePageCampaign.title = this.title;
        List<BLiveCampaignLink> list = this.campaignLinks;
        if (list != null) {
            bLivePageCampaign.campaignLinks = ValueObject.util_map(list, new qcj() { // from class: l.g42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveCampaignLink) obj).mo225055clone();
                }
            });
        }
        return bLivePageCampaign;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePageCampaign)) {
            return false;
        }
        BLivePageCampaign bLivePageCampaign = (BLivePageCampaign) obj;
        return ValueObject.util_equals(this.title, bLivePageCampaign.title) && ValueObject.util_equals(this.campaignLinks, bLivePageCampaign.campaignLinks);
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
        List<BLiveCampaignLink> list = this.campaignLinks;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.campaignLinks == null) {
            this.campaignLinks = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
