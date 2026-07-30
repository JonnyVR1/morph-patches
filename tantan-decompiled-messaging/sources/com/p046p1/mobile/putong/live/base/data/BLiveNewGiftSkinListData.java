package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkinTab;
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
public class BLiveNewGiftSkinListData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftSkinListData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftSkinListData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftSkinListData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftSkinListData newInstance() {
            return new BLiveNewGiftSkinListData();
        }

        public boolean parseField(BLiveNewGiftSkinListData bLiveNewGiftSkinListData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "process":
                    bLiveNewGiftSkinListData.process = BLiveCommonCount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    bLiveNewGiftSkinListData.name = jsonParser.getValueAsString();
                    return true;
                case "tabs":
                    bLiveNewGiftSkinListData.tabs = JsonAdapter.parseArray(jsonParser, BLiveNewGiftSkinTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "skins":
                    bLiveNewGiftSkinListData.skins = JsonAdapter.parseArray(jsonParser, BLiveNewGiftSkin.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftSkinListData bLiveNewGiftSkinListData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftSkinListData.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (bLiveNewGiftSkinListData.process != null) {
                jsonGenerator.writeFieldName("process");
                BLiveCommonCount.JSON_ADAPTER.serialize(bLiveNewGiftSkinListData.process, jsonGenerator, true);
            }
            if (bLiveNewGiftSkinListData.tabs != null) {
                jsonGenerator.writeFieldName("tabs");
                JsonAdapter.serializeArray(bLiveNewGiftSkinListData.tabs, jsonGenerator, BLiveNewGiftSkinTab.JSON_ADAPTER);
            }
            if (bLiveNewGiftSkinListData.skins != null) {
                jsonGenerator.writeFieldName("skins");
                JsonAdapter.serializeArray(bLiveNewGiftSkinListData.skins, jsonGenerator, BLiveNewGiftSkin.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftSkinListData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftskinlistdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveCommonCount process;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveNewGiftSkin> skins;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveNewGiftSkinTab> tabs;

    public static BLiveNewGiftSkinListData new_() {
        BLiveNewGiftSkinListData bLiveNewGiftSkinListData = new BLiveNewGiftSkinListData();
        bLiveNewGiftSkinListData.nullCheck();
        return bLiveNewGiftSkinListData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftSkinListData mo223809clone() {
        BLiveNewGiftSkinListData bLiveNewGiftSkinListData = new BLiveNewGiftSkinListData();
        bLiveNewGiftSkinListData.name = this.name;
        BLiveCommonCount bLiveCommonCount = this.process;
        if (bLiveCommonCount != null) {
            bLiveNewGiftSkinListData.process = bLiveCommonCount.mo223809clone();
        }
        List<BLiveNewGiftSkinTab> list = this.tabs;
        if (list != null) {
            bLiveNewGiftSkinListData.tabs = ValueObject.util_map(list, new w9j() { // from class: l.c32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveNewGiftSkinTab) obj).mo223809clone();
                }
            });
        }
        List<BLiveNewGiftSkin> list2 = this.skins;
        if (list2 != null) {
            bLiveNewGiftSkinListData.skins = ValueObject.util_map(list2, new w9j() { // from class: l.d32
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveNewGiftSkin) obj).mo223809clone();
                }
            });
        }
        return bLiveNewGiftSkinListData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftSkinListData)) {
            return false;
        }
        BLiveNewGiftSkinListData bLiveNewGiftSkinListData = (BLiveNewGiftSkinListData) obj;
        return ValueObject.util_equals(this.name, bLiveNewGiftSkinListData.name) && ValueObject.util_equals(this.process, bLiveNewGiftSkinListData.process) && ValueObject.util_equals(this.tabs, bLiveNewGiftSkinListData.tabs) && ValueObject.util_equals(this.skins, bLiveNewGiftSkinListData.skins);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveCommonCount bLiveCommonCount = this.process;
        int iHashCode2 = (iHashCode + (bLiveCommonCount != null ? bLiveCommonCount.hashCode() : 0)) * 41;
        List<BLiveNewGiftSkinTab> list = this.tabs;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveNewGiftSkin> list2 = this.skins;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.process == null) {
            this.process = BLiveCommonCount.new_();
        }
        if (this.tabs == null) {
            this.tabs = new ArrayList();
        }
        if (this.skins == null) {
            this.skins = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
