package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftSkinTab;
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
public class BLiveNewGiftSkinTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftSkinTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftSkinTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftSkinTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftSkinTab.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftSkinTab newInstance() {
            return new BLiveNewGiftSkinTab();
        }

        public boolean parseField(BLiveNewGiftSkinTab bLiveNewGiftSkinTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                bLiveNewGiftSkinTab.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("skinIds")) {
                return false;
            }
            bLiveNewGiftSkinTab.skinIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftSkinTab bLiveNewGiftSkinTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftSkinTab.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (bLiveNewGiftSkinTab.skinIds != null) {
                jsonGenerator.writeFieldName("skinIds");
                JsonAdapter.serializeArray(bLiveNewGiftSkinTab.skinIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftSkinTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftskintab";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> skinIds;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69262a(String str) {
        return str;
    }

    public static BLiveNewGiftSkinTab new_() {
        BLiveNewGiftSkinTab bLiveNewGiftSkinTab = new BLiveNewGiftSkinTab();
        bLiveNewGiftSkinTab.nullCheck();
        return bLiveNewGiftSkinTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftSkinTab mo225055clone() {
        BLiveNewGiftSkinTab bLiveNewGiftSkinTab = new BLiveNewGiftSkinTab();
        bLiveNewGiftSkinTab.name = this.name;
        List<String> list = this.skinIds;
        if (list != null) {
            bLiveNewGiftSkinTab.skinIds = ValueObject.util_map(list, new qcj() { // from class: l.l32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveNewGiftSkinTab.m69262a((String) obj);
                }
            });
        }
        return bLiveNewGiftSkinTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftSkinTab)) {
            return false;
        }
        BLiveNewGiftSkinTab bLiveNewGiftSkinTab = (BLiveNewGiftSkinTab) obj;
        return ValueObject.util_equals(this.name, bLiveNewGiftSkinTab.name) && ValueObject.util_equals(this.skinIds, bLiveNewGiftSkinTab.skinIds);
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
        List<String> list = this.skinIds;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.skinIds == null) {
            this.skinIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
