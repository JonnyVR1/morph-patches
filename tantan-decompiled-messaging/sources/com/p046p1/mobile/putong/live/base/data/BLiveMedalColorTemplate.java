package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalIcon;
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
public class BLiveMedalColorTemplate extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMedalColorTemplate> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMedalColorTemplate>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMedalColorTemplate.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMedalColorTemplate.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMedalColorTemplate newInstance() {
            return new BLiveMedalColorTemplate();
        }

        public boolean parseField(BLiveMedalColorTemplate bLiveMedalColorTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backgroundUrl":
                    bLiveMedalColorTemplate.backgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "backgroundLargeUrl":
                    bLiveMedalColorTemplate.backgroundLargeUrl = jsonParser.getValueAsString();
                    return true;
                case "backgroundSmallUrl":
                    bLiveMedalColorTemplate.backgroundSmallUrl = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveMedalColorTemplate.name = jsonParser.getValueAsString();
                    return true;
                case "icons":
                    bLiveMedalColorTemplate.icons = JsonAdapter.parseArray(jsonParser, BLiveMedalIcon.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "backgroundMiddleUrl":
                    bLiveMedalColorTemplate.backgroundMiddleUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMedalColorTemplate bLiveMedalColorTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMedalColorTemplate.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveMedalColorTemplate.backgroundUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundUrl", str2);
            }
            if (bLiveMedalColorTemplate.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(bLiveMedalColorTemplate.icons, jsonGenerator, BLiveMedalIcon.JSON_ADAPTER);
            }
            String str3 = bLiveMedalColorTemplate.backgroundSmallUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("backgroundSmallUrl", str3);
            }
            String str4 = bLiveMedalColorTemplate.backgroundMiddleUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("backgroundMiddleUrl", str4);
            }
            String str5 = bLiveMedalColorTemplate.backgroundLargeUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("backgroundLargeUrl", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMedalColorTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemedalcolortemplate";

    @NonNull
    @ProtobufIndex(index = 6)
    public String backgroundLargeUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String backgroundMiddleUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String backgroundSmallUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String backgroundUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveMedalIcon> icons;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveMedalColorTemplate new_() {
        BLiveMedalColorTemplate bLiveMedalColorTemplate = new BLiveMedalColorTemplate();
        bLiveMedalColorTemplate.nullCheck();
        return bLiveMedalColorTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMedalColorTemplate mo223809clone() {
        BLiveMedalColorTemplate bLiveMedalColorTemplate = new BLiveMedalColorTemplate();
        bLiveMedalColorTemplate.name = this.name;
        bLiveMedalColorTemplate.backgroundUrl = this.backgroundUrl;
        List<BLiveMedalIcon> list = this.icons;
        if (list != null) {
            bLiveMedalColorTemplate.icons = ValueObject.util_map(list, new w9j() { // from class: l.e22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveMedalIcon) obj).mo223809clone();
                }
            });
        }
        bLiveMedalColorTemplate.backgroundSmallUrl = this.backgroundSmallUrl;
        bLiveMedalColorTemplate.backgroundMiddleUrl = this.backgroundMiddleUrl;
        bLiveMedalColorTemplate.backgroundLargeUrl = this.backgroundLargeUrl;
        return bLiveMedalColorTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMedalColorTemplate)) {
            return false;
        }
        BLiveMedalColorTemplate bLiveMedalColorTemplate = (BLiveMedalColorTemplate) obj;
        return ValueObject.util_equals(this.name, bLiveMedalColorTemplate.name) && ValueObject.util_equals(this.backgroundUrl, bLiveMedalColorTemplate.backgroundUrl) && ValueObject.util_equals(this.icons, bLiveMedalColorTemplate.icons) && ValueObject.util_equals(this.backgroundSmallUrl, bLiveMedalColorTemplate.backgroundSmallUrl) && ValueObject.util_equals(this.backgroundMiddleUrl, bLiveMedalColorTemplate.backgroundMiddleUrl) && ValueObject.util_equals(this.backgroundLargeUrl, bLiveMedalColorTemplate.backgroundLargeUrl);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveMedalIcon> list = this.icons;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.backgroundSmallUrl;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.backgroundMiddleUrl;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.backgroundLargeUrl;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.backgroundUrl == null) {
            this.backgroundUrl = "";
        }
        if (this.icons == null) {
            this.icons = new ArrayList();
        }
        if (this.backgroundSmallUrl == null) {
            this.backgroundSmallUrl = "";
        }
        if (this.backgroundMiddleUrl == null) {
            this.backgroundMiddleUrl = "";
        }
        if (this.backgroundLargeUrl == null) {
            this.backgroundLargeUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
