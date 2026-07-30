package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
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
public class BLiveStartPageTemplate extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStartPageTemplate> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStartPageTemplate>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStartPageTemplate.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStartPageTemplate.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStartPageTemplate newInstance() {
            return new BLiveStartPageTemplate();
        }

        public boolean parseField(BLiveStartPageTemplate bLiveStartPageTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gameType":
                    bLiveStartPageTemplate.gameType = jsonParser.getValueAsString();
                    return true;
                case "template":
                    bLiveStartPageTemplate.template = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveStartPageTemplate.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveStartPageTemplate.name = jsonParser.getValueAsString();
                    return true;
                case "announcements":
                    bLiveStartPageTemplate.announcements = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isDefault":
                    bLiveStartPageTemplate.isDefault = jsonParser.getValueAsBoolean();
                    return true;
                case "liveMode":
                    bLiveStartPageTemplate.liveMode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStartPageTemplate bLiveStartPageTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStartPageTemplate.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeBooleanField("isDefault", bLiveStartPageTemplate.isDefault);
            String str2 = bLiveStartPageTemplate.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveStartPageTemplate.liveMode;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveMode", str3);
            }
            String str4 = bLiveStartPageTemplate.template;
            if (str4 != null) {
                jsonGenerator.writeStringField("template", str4);
            }
            String str5 = bLiveStartPageTemplate.gameType;
            if (str5 != null) {
                jsonGenerator.writeStringField("gameType", str5);
            }
            if (bLiveStartPageTemplate.announcements != null) {
                jsonGenerator.writeFieldName("announcements");
                JsonAdapter.serializeArray(bLiveStartPageTemplate.announcements, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStartPageTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestartpagetemplate";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> announcements;

    @NonNull
    @ProtobufIndex(index = 6)
    public String gameType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @ProtobufIndex(index = 2)
    public boolean isDefault;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveMode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String template;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68239a(String str) {
        return str;
    }

    public static BLiveStartPageTemplate new_() {
        BLiveStartPageTemplate bLiveStartPageTemplate = new BLiveStartPageTemplate();
        bLiveStartPageTemplate.nullCheck();
        return bLiveStartPageTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStartPageTemplate mo223809clone() {
        BLiveStartPageTemplate bLiveStartPageTemplate = new BLiveStartPageTemplate();
        bLiveStartPageTemplate.name = this.name;
        bLiveStartPageTemplate.isDefault = this.isDefault;
        bLiveStartPageTemplate.icon = this.icon;
        bLiveStartPageTemplate.liveMode = this.liveMode;
        bLiveStartPageTemplate.template = this.template;
        bLiveStartPageTemplate.gameType = this.gameType;
        List<String> list = this.announcements;
        if (list != null) {
            bLiveStartPageTemplate.announcements = ValueObject.util_map(list, new w9j() { // from class: l.c62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveStartPageTemplate.m68239a((String) obj);
                }
            });
        }
        return bLiveStartPageTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStartPageTemplate)) {
            return false;
        }
        BLiveStartPageTemplate bLiveStartPageTemplate = (BLiveStartPageTemplate) obj;
        return ValueObject.util_equals(this.name, bLiveStartPageTemplate.name) && this.isDefault == bLiveStartPageTemplate.isDefault && ValueObject.util_equals(this.icon, bLiveStartPageTemplate.icon) && ValueObject.util_equals(this.liveMode, bLiveStartPageTemplate.liveMode) && ValueObject.util_equals(this.template, bLiveStartPageTemplate.template) && ValueObject.util_equals(this.gameType, bLiveStartPageTemplate.gameType) && ValueObject.util_equals(this.announcements, bLiveStartPageTemplate.announcements);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isDefault ? 1231 : 1237)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveMode;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.template;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.gameType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list = this.announcements;
        int iHashCode6 = iHashCode5 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.liveMode == null) {
            this.liveMode = "";
        }
        if (this.template == null) {
            this.template = "";
        }
        if (this.gameType == null) {
            this.gameType = "";
        }
        if (this.announcements == null) {
            this.announcements = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
