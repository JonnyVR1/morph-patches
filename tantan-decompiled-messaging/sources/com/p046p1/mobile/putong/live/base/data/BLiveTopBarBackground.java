package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveTopBarBackground extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTopBarBackground> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTopBarBackground>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTopBarBackground.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTopBarBackground.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTopBarBackground newInstance() {
            return new BLiveTopBarBackground();
        }

        public boolean parseField(BLiveTopBarBackground bLiveTopBarBackground, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pictureUrl")) {
                bLiveTopBarBackground.pictureUrl = BLivePictureUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("color")) {
                return false;
            }
            bLiveTopBarBackground.color = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTopBarBackground bLiveTopBarBackground, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveTopBarBackground.pictureUrl != null) {
                jsonGenerator.writeFieldName("pictureUrl");
                BLivePictureUrl.JSON_ADAPTER.serialize(bLiveTopBarBackground.pictureUrl, jsonGenerator, true);
            }
            String str = bLiveTopBarBackground.color;
            if (str != null) {
                jsonGenerator.writeStringField("color", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTopBarBackground) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetopbarbackground";

    @Nullable
    @ProtobufIndex(index = 2)
    public String color;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLivePictureUrl pictureUrl;

    public static BLiveTopBarBackground new_() {
        BLiveTopBarBackground bLiveTopBarBackground = new BLiveTopBarBackground();
        bLiveTopBarBackground.nullCheck();
        return bLiveTopBarBackground;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTopBarBackground mo223809clone() {
        BLiveTopBarBackground bLiveTopBarBackground = new BLiveTopBarBackground();
        BLivePictureUrl bLivePictureUrl = this.pictureUrl;
        if (bLivePictureUrl != null) {
            bLiveTopBarBackground.pictureUrl = bLivePictureUrl.mo223809clone();
        }
        bLiveTopBarBackground.color = this.color;
        return bLiveTopBarBackground;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTopBarBackground)) {
            return false;
        }
        BLiveTopBarBackground bLiveTopBarBackground = (BLiveTopBarBackground) obj;
        return ValueObject.util_equals(this.pictureUrl, bLiveTopBarBackground.pictureUrl) && ValueObject.util_equals(this.color, bLiveTopBarBackground.color);
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
        BLivePictureUrl bLivePictureUrl = this.pictureUrl;
        int iHashCode = (i2 + (bLivePictureUrl != null ? bLivePictureUrl.hashCode() : 0)) * 41;
        String str = this.color;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
