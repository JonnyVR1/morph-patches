package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.OMSFontStyle;
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
public class BLiveVoiceGiftWallPics extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallPics> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallPics>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallPics.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallPics.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallPics newInstance() {
            return new BLiveVoiceGiftWallPics();
        }

        public boolean parseField(BLiveVoiceGiftWallPics bLiveVoiceGiftWallPics, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(CreditScoreTaskType.pic)) {
                bLiveVoiceGiftWallPics.pic = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(OMSFontStyle.light)) {
                return false;
            }
            bLiveVoiceGiftWallPics.light = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallPics bLiveVoiceGiftWallPics, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGiftWallPics.pic;
            if (str != null) {
                jsonGenerator.writeStringField(CreditScoreTaskType.pic, str);
            }
            jsonGenerator.writeBooleanField(OMSFontStyle.light, bLiveVoiceGiftWallPics.light);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallPics) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwallpics";

    @ProtobufIndex(index = 2)
    public boolean light;

    @NonNull
    @ProtobufIndex(index = 1)
    public String pic;

    public static BLiveVoiceGiftWallPics new_() {
        BLiveVoiceGiftWallPics bLiveVoiceGiftWallPics = new BLiveVoiceGiftWallPics();
        bLiveVoiceGiftWallPics.nullCheck();
        return bLiveVoiceGiftWallPics;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallPics mo225055clone() {
        BLiveVoiceGiftWallPics bLiveVoiceGiftWallPics = new BLiveVoiceGiftWallPics();
        bLiveVoiceGiftWallPics.pic = this.pic;
        bLiveVoiceGiftWallPics.light = this.light;
        return bLiveVoiceGiftWallPics;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftWallPics)) {
            return false;
        }
        BLiveVoiceGiftWallPics bLiveVoiceGiftWallPics = (BLiveVoiceGiftWallPics) obj;
        return ValueObject.util_equals(this.pic, bLiveVoiceGiftWallPics.pic) && this.light == bLiveVoiceGiftWallPics.light;
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
        String str = this.pic;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.light ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pic == null) {
            this.pic = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
