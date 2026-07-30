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
public class BLiveVoiceMedalWallItemHeaderUrl extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceMedalWallItemHeaderUrl> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceMedalWallItemHeaderUrl>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceMedalWallItemHeaderUrl.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceMedalWallItemHeaderUrl newInstance() {
            return new BLiveVoiceMedalWallItemHeaderUrl();
        }

        public boolean parseField(BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("staticUrl")) {
                bLiveVoiceMedalWallItemHeaderUrl.staticUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("dynamicUrl")) {
                return false;
            }
            bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceMedalWallItemHeaderUrl.staticUrl;
            if (str != null) {
                jsonGenerator.writeStringField("staticUrl", str);
            }
            String str2 = bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceMedalWallItemHeaderUrl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemedalwallitemheaderurl";

    @NonNull
    @ProtobufIndex(index = 1)
    public String dynamicUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String staticUrl;

    public static BLiveVoiceMedalWallItemHeaderUrl new_() {
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = new BLiveVoiceMedalWallItemHeaderUrl();
        bLiveVoiceMedalWallItemHeaderUrl.nullCheck();
        return bLiveVoiceMedalWallItemHeaderUrl;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceMedalWallItemHeaderUrl mo223809clone() {
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = new BLiveVoiceMedalWallItemHeaderUrl();
        bLiveVoiceMedalWallItemHeaderUrl.staticUrl = this.staticUrl;
        bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl = this.dynamicUrl;
        return bLiveVoiceMedalWallItemHeaderUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceMedalWallItemHeaderUrl)) {
            return false;
        }
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = (BLiveVoiceMedalWallItemHeaderUrl) obj;
        return ValueObject.util_equals(this.staticUrl, bLiveVoiceMedalWallItemHeaderUrl.staticUrl) && ValueObject.util_equals(this.dynamicUrl, bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl);
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
        String str = this.staticUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.dynamicUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.staticUrl == null) {
            this.staticUrl = "";
        }
        if (this.dynamicUrl == null) {
            this.dynamicUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
