package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallSubTab;
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
public class BLiveNewGiftWallSubTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallSubTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallSubTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallSubTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallSubTab.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallSubTab newInstance() {
            return new BLiveNewGiftWallSubTab();
        }

        public boolean parseField(BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "progress":
                    bLiveNewGiftWallSubTab.progress = BLiveNewGiftWallProgress.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveNewGiftWallSubTab.f44414id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveNewGiftWallSubTab.name = jsonParser.getValueAsString();
                    return true;
                case "giftIds":
                    bLiveNewGiftWallSubTab.giftIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallSubTab.f44414id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftWallSubTab.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (bLiveNewGiftWallSubTab.progress != null) {
                jsonGenerator.writeFieldName("progress");
                BLiveNewGiftWallProgress.JSON_ADAPTER.serialize(bLiveNewGiftWallSubTab.progress, jsonGenerator, true);
            }
            if (bLiveNewGiftWallSubTab.giftIds != null) {
                jsonGenerator.writeFieldName("giftIds");
                JsonAdapter.serializeArray(bLiveNewGiftWallSubTab.giftIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallSubTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallsubtab";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> giftIds;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44414id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveNewGiftWallProgress progress;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68091a(String str) {
        return str;
    }

    public static BLiveNewGiftWallSubTab new_() {
        BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab = new BLiveNewGiftWallSubTab();
        bLiveNewGiftWallSubTab.nullCheck();
        return bLiveNewGiftWallSubTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallSubTab mo223809clone() {
        BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab = new BLiveNewGiftWallSubTab();
        bLiveNewGiftWallSubTab.f44414id = this.f44414id;
        bLiveNewGiftWallSubTab.name = this.name;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = this.progress;
        if (bLiveNewGiftWallProgress != null) {
            bLiveNewGiftWallSubTab.progress = bLiveNewGiftWallProgress.mo223809clone();
        }
        List<String> list = this.giftIds;
        if (list != null) {
            bLiveNewGiftWallSubTab.giftIds = ValueObject.util_map(list, new w9j() { // from class: l.q32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveNewGiftWallSubTab.m68091a((String) obj);
                }
            });
        }
        return bLiveNewGiftWallSubTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallSubTab)) {
            return false;
        }
        BLiveNewGiftWallSubTab bLiveNewGiftWallSubTab = (BLiveNewGiftWallSubTab) obj;
        return ValueObject.util_equals(this.f44414id, bLiveNewGiftWallSubTab.f44414id) && ValueObject.util_equals(this.name, bLiveNewGiftWallSubTab.name) && ValueObject.util_equals(this.progress, bLiveNewGiftWallSubTab.progress) && ValueObject.util_equals(this.giftIds, bLiveNewGiftWallSubTab.giftIds);
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
        String str = this.f44414id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveNewGiftWallProgress bLiveNewGiftWallProgress = this.progress;
        int iHashCode3 = (iHashCode2 + (bLiveNewGiftWallProgress != null ? bLiveNewGiftWallProgress.hashCode() : 0)) * 41;
        List<String> list = this.giftIds;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44414id == null) {
            this.f44414id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.progress == null) {
            this.progress = BLiveNewGiftWallProgress.new_();
        }
        if (this.giftIds == null) {
            this.giftIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
