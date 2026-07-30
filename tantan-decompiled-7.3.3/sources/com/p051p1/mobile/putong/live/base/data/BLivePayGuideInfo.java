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
public class BLivePayGuideInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePayGuideInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLivePayGuideInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLivePayGuideInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePayGuideInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePayGuideInfo newInstance() {
            return new BLivePayGuideInfo();
        }

        public boolean parseField(BLivePayGuideInfo bLivePayGuideInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLivePayGuideInfo.subTitle = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLivePayGuideInfo.title = jsonParser.getValueAsString();
                    return true;
                case "giftIcon":
                    bLivePayGuideInfo.giftIcon = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLivePayGuideInfo.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePayGuideInfo bLivePayGuideInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePayGuideInfo.giftIcon;
            if (str != null) {
                jsonGenerator.writeStringField("giftIcon", str);
            }
            String str2 = bLivePayGuideInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLivePayGuideInfo.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = bLivePayGuideInfo.content;
            if (str4 != null) {
                jsonGenerator.writeStringField("content", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePayGuideInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepayguideinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String content;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftIcon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLivePayGuideInfo new_() {
        BLivePayGuideInfo bLivePayGuideInfo = new BLivePayGuideInfo();
        bLivePayGuideInfo.nullCheck();
        return bLivePayGuideInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePayGuideInfo mo225055clone() {
        BLivePayGuideInfo bLivePayGuideInfo = new BLivePayGuideInfo();
        bLivePayGuideInfo.giftIcon = this.giftIcon;
        bLivePayGuideInfo.title = this.title;
        bLivePayGuideInfo.subTitle = this.subTitle;
        bLivePayGuideInfo.content = this.content;
        return bLivePayGuideInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePayGuideInfo)) {
            return false;
        }
        BLivePayGuideInfo bLivePayGuideInfo = (BLivePayGuideInfo) obj;
        return ValueObject.util_equals(this.giftIcon, bLivePayGuideInfo.giftIcon) && ValueObject.util_equals(this.title, bLivePayGuideInfo.title) && ValueObject.util_equals(this.subTitle, bLivePayGuideInfo.subTitle) && ValueObject.util_equals(this.content, bLivePayGuideInfo.content);
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
        String str = this.giftIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.content;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.content == null) {
            this.content = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
