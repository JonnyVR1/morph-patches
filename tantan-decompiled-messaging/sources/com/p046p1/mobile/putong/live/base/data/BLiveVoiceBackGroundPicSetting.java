package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
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
public class BLiveVoiceBackGroundPicSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceBackGroundPicSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceBackGroundPicSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPicSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceBackGroundPicSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceBackGroundPicSetting newInstance() {
            return new BLiveVoiceBackGroundPicSetting();
        }

        public boolean parseField(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("backGroundPics")) {
                bLiveVoiceBackGroundPicSetting.backGroundPics = JsonAdapter.parseArray(jsonParser, BLiveVoiceBackGroundPics.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("currentId")) {
                return false;
            }
            bLiveVoiceBackGroundPicSetting.currentId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceBackGroundPicSetting.currentId;
            if (str != null) {
                jsonGenerator.writeStringField("currentId", str);
            }
            if (bLiveVoiceBackGroundPicSetting.backGroundPics != null) {
                jsonGenerator.writeFieldName("backGroundPics");
                JsonAdapter.serializeArray(bLiveVoiceBackGroundPicSetting.backGroundPics, jsonGenerator, BLiveVoiceBackGroundPics.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceBackGroundPicSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicebackgroundpicsetting";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveVoiceBackGroundPics> backGroundPics;

    @NonNull
    @ProtobufIndex(index = 1)
    public String currentId;

    public static BLiveVoiceBackGroundPicSetting new_() {
        BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = new BLiveVoiceBackGroundPicSetting();
        bLiveVoiceBackGroundPicSetting.nullCheck();
        return bLiveVoiceBackGroundPicSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceBackGroundPicSetting mo223809clone() {
        BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = new BLiveVoiceBackGroundPicSetting();
        bLiveVoiceBackGroundPicSetting.currentId = this.currentId;
        List<BLiveVoiceBackGroundPics> list = this.backGroundPics;
        if (list != null) {
            bLiveVoiceBackGroundPicSetting.backGroundPics = ValueObject.util_map(list, new w9j() { // from class: l.a82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceBackGroundPics) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceBackGroundPicSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceBackGroundPicSetting)) {
            return false;
        }
        BLiveVoiceBackGroundPicSetting bLiveVoiceBackGroundPicSetting = (BLiveVoiceBackGroundPicSetting) obj;
        return ValueObject.util_equals(this.currentId, bLiveVoiceBackGroundPicSetting.currentId) && ValueObject.util_equals(this.backGroundPics, bLiveVoiceBackGroundPicSetting.backGroundPics);
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
        String str = this.currentId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveVoiceBackGroundPics> list = this.backGroundPics;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currentId == null) {
            this.currentId = "";
        }
        if (this.backGroundPics == null) {
            this.backGroundPics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
