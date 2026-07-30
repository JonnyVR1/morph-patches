package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
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
public class BLiveChatMangerSettings extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatMangerSettings> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatMangerSettings>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatMangerSettings.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatMangerSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatMangerSettings newInstance() {
            return new BLiveChatMangerSettings();
        }

        public boolean parseField(BLiveChatMangerSettings bLiveChatMangerSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "shieldingWordMaxCount":
                    bLiveChatMangerSettings.shieldingWordMaxCount = jsonParser.getValueAsInt();
                    return true;
                case "jailedType":
                    bLiveChatMangerSettings.jailedType = BLiveChatJailedType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "shieldingWords":
                    bLiveChatMangerSettings.shieldingWords = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatMangerSettings bLiveChatMangerSettings, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveChatMangerSettings.jailedType != null) {
                jsonGenerator.writeFieldName("jailedType");
                BLiveChatJailedType.JSON_ADAPTER.serialize(bLiveChatMangerSettings.jailedType, jsonGenerator, true);
            }
            if (bLiveChatMangerSettings.shieldingWords != null) {
                jsonGenerator.writeFieldName("shieldingWords");
                JsonAdapter.serializeArray(bLiveChatMangerSettings.shieldingWords, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("shieldingWordMaxCount", bLiveChatMangerSettings.shieldingWordMaxCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatMangerSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatmangersettings";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveChatJailedType jailedType;

    @ProtobufIndex(index = 3)
    public int shieldingWordMaxCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> shieldingWords;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67744a(String str) {
        return str;
    }

    public static BLiveChatMangerSettings new_() {
        BLiveChatMangerSettings bLiveChatMangerSettings = new BLiveChatMangerSettings();
        bLiveChatMangerSettings.nullCheck();
        return bLiveChatMangerSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatMangerSettings mo223809clone() {
        BLiveChatMangerSettings bLiveChatMangerSettings = new BLiveChatMangerSettings();
        bLiveChatMangerSettings.jailedType = this.jailedType;
        List<String> list = this.shieldingWords;
        if (list != null) {
            bLiveChatMangerSettings.shieldingWords = ValueObject.util_map(list, new w9j() { // from class: l.js1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveChatMangerSettings.m67744a((String) obj);
                }
            });
        }
        bLiveChatMangerSettings.shieldingWordMaxCount = this.shieldingWordMaxCount;
        return bLiveChatMangerSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatMangerSettings)) {
            return false;
        }
        BLiveChatMangerSettings bLiveChatMangerSettings = (BLiveChatMangerSettings) obj;
        return ValueObject.util_equals(this.jailedType, bLiveChatMangerSettings.jailedType) && ValueObject.util_equals(this.shieldingWords, bLiveChatMangerSettings.shieldingWords) && this.shieldingWordMaxCount == bLiveChatMangerSettings.shieldingWordMaxCount;
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
        BLiveChatJailedType bLiveChatJailedType = this.jailedType;
        int iHashCode = (i2 + (bLiveChatJailedType != null ? bLiveChatJailedType.hashCode() : 0)) * 41;
        List<String> list = this.shieldingWords;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.shieldingWordMaxCount;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.jailedType == null) {
            this.jailedType = (BLiveChatJailedType) BLiveChatJailedType.JSON_ADAPTER.defaultEnum();
        }
        if (this.shieldingWords == null) {
            this.shieldingWords = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
