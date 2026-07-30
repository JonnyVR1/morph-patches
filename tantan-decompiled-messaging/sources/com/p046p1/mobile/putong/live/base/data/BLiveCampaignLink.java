package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveCampaignLink extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCampaignLink> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCampaignLink>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCampaignLink.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCampaignLink.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCampaignLink newInstance() {
            return new BLiveCampaignLink();
        }

        public boolean parseField(BLiveCampaignLink bLiveCampaignLink, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("jumpUrl")) {
                bLiveCampaignLink.jumpUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            bLiveCampaignLink.text = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCampaignLink bLiveCampaignLink, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCampaignLink.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveCampaignLink.jumpUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCampaignLink) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecampaignlink";

    @NonNull
    @ProtobufIndex(index = 2)
    public String jumpUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    public static BLiveCampaignLink new_() {
        BLiveCampaignLink bLiveCampaignLink = new BLiveCampaignLink();
        bLiveCampaignLink.nullCheck();
        return bLiveCampaignLink;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCampaignLink mo223809clone() {
        BLiveCampaignLink bLiveCampaignLink = new BLiveCampaignLink();
        bLiveCampaignLink.text = this.text;
        bLiveCampaignLink.jumpUrl = this.jumpUrl;
        return bLiveCampaignLink;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCampaignLink)) {
            return false;
        }
        BLiveCampaignLink bLiveCampaignLink = (BLiveCampaignLink) obj;
        return ValueObject.util_equals(this.text, bLiveCampaignLink.text) && ValueObject.util_equals(this.jumpUrl, bLiveCampaignLink.jumpUrl);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.jumpUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
