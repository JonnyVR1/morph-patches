package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMedal.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMedal newInstance() {
            return new BLiveMedal();
        }

        public boolean parseField(BLiveMedal bLiveMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "jumpUrl":
                    bLiveMedal.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "dynamicUrl":
                    bLiveMedal.dynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveMedal.f45245id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    bLiveMedal.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveMedal.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveMedal.type = jsonParser.getValueAsString();
                    return true;
                case "i18nName":
                    bLiveMedal.i18nName = jsonParser.getValueAsString();
                    return true;
                case "showPlaces":
                    bLiveMedal.showPlaces = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "i18nMainDescription":
                    bLiveMedal.i18nMainDescription = jsonParser.getValueAsString();
                    return true;
                case "i18nGuestDescription":
                    bLiveMedal.i18nGuestDescription = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMedal bLiveMedal, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMedal.f45245id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMedal.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            if (bLiveMedal.showPlaces != null) {
                jsonGenerator.writeFieldName("showPlaces");
                JsonAdapter.serializeArray(bLiveMedal.showPlaces, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = bLiveMedal.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = bLiveMedal.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveMedal.i18nName;
            if (str5 != null) {
                jsonGenerator.writeStringField("i18nName", str5);
            }
            String str6 = bLiveMedal.i18nMainDescription;
            if (str6 != null) {
                jsonGenerator.writeStringField("i18nMainDescription", str6);
            }
            String str7 = bLiveMedal.i18nGuestDescription;
            if (str7 != null) {
                jsonGenerator.writeStringField("i18nGuestDescription", str7);
            }
            String str8 = bLiveMedal.jumpUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("jumpUrl", str8);
            }
            String str9 = bLiveMedal.dynamicUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemedal";
    private static final String TYPE_FANBASE = "fanbase";

    @NonNull
    @ProtobufIndex(index = 10)
    public String dynamicUrl;

    @NonNull
    @ProtobufIndex(index = 8)
    public String i18nGuestDescription;

    @NonNull
    @ProtobufIndex(index = 7)
    public String i18nMainDescription;

    @NonNull
    @ProtobufIndex(index = 6)
    public String i18nName;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45245id;

    @NonNull
    @ProtobufIndex(index = 9)
    public String jumpUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> showPlaces;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69232a(String str) {
        return str;
    }

    public static BLiveMedal new_() {
        BLiveMedal bLiveMedal = new BLiveMedal();
        bLiveMedal.nullCheck();
        return bLiveMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMedal mo225055clone() {
        BLiveMedal bLiveMedal = new BLiveMedal();
        bLiveMedal.f45245id = this.f45245id;
        bLiveMedal.url = this.url;
        List<String> list = this.showPlaces;
        if (list != null) {
            bLiveMedal.showPlaces = ValueObject.util_map(list, new qcj() { // from class: l.k22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveMedal.m69232a((String) obj);
                }
            });
        }
        bLiveMedal.name = this.name;
        bLiveMedal.type = this.type;
        bLiveMedal.i18nName = this.i18nName;
        bLiveMedal.i18nMainDescription = this.i18nMainDescription;
        bLiveMedal.i18nGuestDescription = this.i18nGuestDescription;
        bLiveMedal.jumpUrl = this.jumpUrl;
        bLiveMedal.dynamicUrl = this.dynamicUrl;
        return bLiveMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMedal)) {
            return false;
        }
        BLiveMedal bLiveMedal = (BLiveMedal) obj;
        return ValueObject.util_equals(this.f45245id, bLiveMedal.f45245id) && ValueObject.util_equals(this.url, bLiveMedal.url) && ValueObject.util_equals(this.showPlaces, bLiveMedal.showPlaces) && ValueObject.util_equals(this.name, bLiveMedal.name) && ValueObject.util_equals(this.type, bLiveMedal.type) && ValueObject.util_equals(this.i18nName, bLiveMedal.i18nName) && ValueObject.util_equals(this.i18nMainDescription, bLiveMedal.i18nMainDescription) && ValueObject.util_equals(this.i18nGuestDescription, bLiveMedal.i18nGuestDescription) && ValueObject.util_equals(this.jumpUrl, bLiveMedal.jumpUrl) && ValueObject.util_equals(this.dynamicUrl, bLiveMedal.dynamicUrl);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @NonNull
    public String getDynamicUrl() {
        return this.dynamicUrl;
    }

    @NonNull
    public String getStaticUrl() {
        return this.url;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45245id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.showPlaces;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.i18nName;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.i18nMainDescription;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.i18nGuestDescription;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.jumpUrl;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.dynamicUrl;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    public boolean isFanbaseMedal() {
        return "fanbase".equals(this.type);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45245id == null) {
            this.f45245id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.showPlaces == null) {
            this.showPlaces = new ArrayList();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.i18nName == null) {
            this.i18nName = "";
        }
        if (this.i18nMainDescription == null) {
            this.i18nMainDescription = "";
        }
        if (this.i18nGuestDescription == null) {
            this.i18nGuestDescription = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
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
