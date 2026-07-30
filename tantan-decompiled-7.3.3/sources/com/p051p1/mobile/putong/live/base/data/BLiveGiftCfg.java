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
public class BLiveGiftCfg extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftCfg> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftCfg>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftCfg.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftCfg.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftCfg newInstance() {
            return new BLiveGiftCfg();
        }

        public boolean parseField(BLiveGiftCfg bLiveGiftCfg, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("backgroundUrl")) {
                bLiveGiftCfg.backgroundUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("position")) {
                return false;
            }
            bLiveGiftCfg.position = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftCfg bLiveGiftCfg, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("position", bLiveGiftCfg.position);
            String str = bLiveGiftCfg.backgroundUrl;
            if (str != null) {
                jsonGenerator.writeStringField("backgroundUrl", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftCfg) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftcfg";

    @NonNull
    @ProtobufIndex(index = 1)
    public String backgroundUrl;

    @ProtobufIndex(index = 2)
    public int position;

    public static BLiveGiftCfg new_() {
        BLiveGiftCfg bLiveGiftCfg = new BLiveGiftCfg();
        bLiveGiftCfg.nullCheck();
        return bLiveGiftCfg;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftCfg mo225055clone() {
        BLiveGiftCfg bLiveGiftCfg = new BLiveGiftCfg();
        bLiveGiftCfg.position = this.position;
        bLiveGiftCfg.backgroundUrl = this.backgroundUrl;
        return bLiveGiftCfg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftCfg)) {
            return false;
        }
        BLiveGiftCfg bLiveGiftCfg = (BLiveGiftCfg) obj;
        return this.position == bLiveGiftCfg.position && ValueObject.util_equals(this.backgroundUrl, bLiveGiftCfg.backgroundUrl);
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
        int i2 = ((i * 41) + this.position) * 41;
        String str = this.backgroundUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundUrl == null) {
            this.backgroundUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
