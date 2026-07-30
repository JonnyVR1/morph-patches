package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapBrief;
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
public class BLiveScrapTabData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapTabData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapTabData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapTabData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapTabData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapTabData newInstance() {
            return new BLiveScrapTabData();
        }

        public boolean parseField(BLiveScrapTabData bLiveScrapTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bubble":
                    bLiveScrapTabData.bubble = BLiveScrapBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveScrapTabData.type = jsonParser.getValueAsString();
                    return true;
                case "scrapBriefs":
                    bLiveScrapTabData.scrapBriefs = JsonAdapter.parseArray(jsonParser, BLiveScrapBrief.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapTabData bLiveScrapTabData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapTabData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (bLiveScrapTabData.scrapBriefs != null) {
                jsonGenerator.writeFieldName("scrapBriefs");
                JsonAdapter.serializeArray(bLiveScrapTabData.scrapBriefs, jsonGenerator, BLiveScrapBrief.JSON_ADAPTER);
            }
            if (bLiveScrapTabData.bubble != null) {
                jsonGenerator.writeFieldName("bubble");
                BLiveScrapBubble.JSON_ADAPTER.serialize(bLiveScrapTabData.bubble, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescraptabdata";

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveScrapBubble bubble;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveScrapBrief> scrapBriefs;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveScrapTabData new_() {
        BLiveScrapTabData bLiveScrapTabData = new BLiveScrapTabData();
        bLiveScrapTabData.nullCheck();
        return bLiveScrapTabData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapTabData mo223809clone() {
        BLiveScrapTabData bLiveScrapTabData = new BLiveScrapTabData();
        bLiveScrapTabData.type = this.type;
        List<BLiveScrapBrief> list = this.scrapBriefs;
        if (list != null) {
            bLiveScrapTabData.scrapBriefs = ValueObject.util_map(list, new w9j() { // from class: l.e52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveScrapBrief) obj).mo223809clone();
                }
            });
        }
        BLiveScrapBubble bLiveScrapBubble = this.bubble;
        if (bLiveScrapBubble != null) {
            bLiveScrapTabData.bubble = bLiveScrapBubble.mo223809clone();
        }
        return bLiveScrapTabData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapTabData)) {
            return false;
        }
        BLiveScrapTabData bLiveScrapTabData = (BLiveScrapTabData) obj;
        return ValueObject.util_equals(this.type, bLiveScrapTabData.type) && ValueObject.util_equals(this.scrapBriefs, bLiveScrapTabData.scrapBriefs) && ValueObject.util_equals(this.bubble, bLiveScrapTabData.bubble);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveScrapBrief> list = this.scrapBriefs;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        BLiveScrapBubble bLiveScrapBubble = this.bubble;
        int iHashCode3 = iHashCode2 + (bLiveScrapBubble != null ? bLiveScrapBubble.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
