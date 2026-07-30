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
public class BLiveGiftSkinBg extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSkinBg> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSkinBg>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSkinBg.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSkinBg.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSkinBg newInstance() {
            return new BLiveGiftSkinBg();
        }

        public boolean parseField(BLiveGiftSkinBg bLiveGiftSkinBg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("url")) {
                return false;
            }
            bLiveGiftSkinBg.url = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSkinBg bLiveGiftSkinBg, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftSkinBg.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSkinBg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftskinbg";

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    public static BLiveGiftSkinBg new_() {
        BLiveGiftSkinBg bLiveGiftSkinBg = new BLiveGiftSkinBg();
        bLiveGiftSkinBg.nullCheck();
        return bLiveGiftSkinBg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSkinBg mo223809clone() {
        BLiveGiftSkinBg bLiveGiftSkinBg = new BLiveGiftSkinBg();
        bLiveGiftSkinBg.url = this.url;
        return bLiveGiftSkinBg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveGiftSkinBg) {
            return ValueObject.util_equals(this.url, ((BLiveGiftSkinBg) obj).url);
        }
        return false;
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
        String str = this.url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
