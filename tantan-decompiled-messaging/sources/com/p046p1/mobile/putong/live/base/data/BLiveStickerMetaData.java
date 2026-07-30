package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class BLiveStickerMetaData extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStickerMetaData> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStickerMetaData>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStickerMetaData.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStickerMetaData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStickerMetaData newInstance() {
            return new BLiveStickerMetaData();
        }

        public boolean parseField(BLiveStickerMetaData bLiveStickerMetaData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("Url")) {
                bLiveStickerMetaData.Url = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Constants.CLTAP_APP_VERSION)) {
                return false;
            }
            bLiveStickerMetaData.Version = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStickerMetaData bLiveStickerMetaData, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStickerMetaData.Url;
            if (str != null) {
                jsonGenerator.writeStringField("Url", str);
            }
            jsonGenerator.writeNumberField(Constants.CLTAP_APP_VERSION, bLiveStickerMetaData.Version);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStickerMetaData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestickermetadata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String Url;

    @ProtobufIndex(index = 2)
    public long Version;

    public static BLiveStickerMetaData new_() {
        BLiveStickerMetaData bLiveStickerMetaData = new BLiveStickerMetaData();
        bLiveStickerMetaData.nullCheck();
        return bLiveStickerMetaData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStickerMetaData mo223809clone() {
        BLiveStickerMetaData bLiveStickerMetaData = new BLiveStickerMetaData();
        bLiveStickerMetaData.Url = this.Url;
        bLiveStickerMetaData.Version = this.Version;
        return bLiveStickerMetaData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStickerMetaData)) {
            return false;
        }
        BLiveStickerMetaData bLiveStickerMetaData = (BLiveStickerMetaData) obj;
        return ValueObject.util_equals(this.Url, bLiveStickerMetaData.Url) && this.Version == bLiveStickerMetaData.Version;
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
        String str = this.Url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.Version;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.Url == null) {
            this.Url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
