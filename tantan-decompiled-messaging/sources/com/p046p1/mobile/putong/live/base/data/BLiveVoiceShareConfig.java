package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceShareConfig;
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
public class BLiveVoiceShareConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceShareConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceShareConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceShareConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceShareConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceShareConfig newInstance() {
            return new BLiveVoiceShareConfig();
        }

        public boolean parseField(BLiveVoiceShareConfig bLiveVoiceShareConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentTitles":
                    bLiveVoiceShareConfig.momentTitles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "qqShareUrl":
                    bLiveVoiceShareConfig.qqShareUrl = jsonParser.getValueAsString();
                    return true;
                case "wechatShareUrl":
                    bLiveVoiceShareConfig.wechatShareUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceShareConfig bLiveVoiceShareConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVoiceShareConfig.momentTitles != null) {
                jsonGenerator.writeFieldName("momentTitles");
                JsonAdapter.serializeArray(bLiveVoiceShareConfig.momentTitles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveVoiceShareConfig.wechatShareUrl;
            if (str != null) {
                jsonGenerator.writeStringField("wechatShareUrl", str);
            }
            String str2 = bLiveVoiceShareConfig.qqShareUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("qqShareUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceShareConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceshareconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> momentTitles;

    @NonNull
    @ProtobufIndex(index = 3)
    public String qqShareUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String wechatShareUrl;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68442a(String str) {
        return str;
    }

    public static BLiveVoiceShareConfig new_() {
        BLiveVoiceShareConfig bLiveVoiceShareConfig = new BLiveVoiceShareConfig();
        bLiveVoiceShareConfig.nullCheck();
        return bLiveVoiceShareConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceShareConfig mo223809clone() {
        BLiveVoiceShareConfig bLiveVoiceShareConfig = new BLiveVoiceShareConfig();
        List<String> list = this.momentTitles;
        if (list != null) {
            bLiveVoiceShareConfig.momentTitles = ValueObject.util_map(list, new w9j() { // from class: l.w92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceShareConfig.m68442a((String) obj);
                }
            });
        }
        bLiveVoiceShareConfig.wechatShareUrl = this.wechatShareUrl;
        bLiveVoiceShareConfig.qqShareUrl = this.qqShareUrl;
        return bLiveVoiceShareConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceShareConfig)) {
            return false;
        }
        BLiveVoiceShareConfig bLiveVoiceShareConfig = (BLiveVoiceShareConfig) obj;
        return ValueObject.util_equals(this.momentTitles, bLiveVoiceShareConfig.momentTitles) && ValueObject.util_equals(this.wechatShareUrl, bLiveVoiceShareConfig.wechatShareUrl) && ValueObject.util_equals(this.qqShareUrl, bLiveVoiceShareConfig.qqShareUrl);
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
        List<String> list = this.momentTitles;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.wechatShareUrl;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.qqShareUrl;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentTitles == null) {
            this.momentTitles = new ArrayList();
        }
        if (this.wechatShareUrl == null) {
            this.wechatShareUrl = "";
        }
        if (this.qqShareUrl == null) {
            this.qqShareUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
