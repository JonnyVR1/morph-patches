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
public class BLivePkPunishMotion extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkPunishMotion> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkPunishMotion>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkPunishMotion.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkPunishMotion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkPunishMotion newInstance() {
            return new BLivePkPunishMotion();
        }

        public boolean parseField(BLivePkPunishMotion bLivePkPunishMotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLivePkPunishMotion.description = jsonParser.getValueAsString();
                    return true;
                case "superUrl":
                    bLivePkPunishMotion.superUrl = jsonParser.getValueAsString();
                    return true;
                case "vipUrl":
                    bLivePkPunishMotion.vipUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLivePkPunishMotion.f44427id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    bLivePkPunishMotion.url = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLivePkPunishMotion.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkPunishMotion bLivePkPunishMotion, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkPunishMotion.f44427id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLivePkPunishMotion.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            String str3 = bLivePkPunishMotion.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = bLivePkPunishMotion.iconUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("iconUrl", str4);
            }
            String str5 = bLivePkPunishMotion.vipUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("vipUrl", str5);
            }
            String str6 = bLivePkPunishMotion.superUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("superUrl", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkPunishMotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkpunishmotion";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44427id;

    @NonNull
    @ProtobufIndex(index = 6)
    public String superUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    @NonNull
    @ProtobufIndex(index = 5)
    public String vipUrl;

    public static BLivePkPunishMotion new_() {
        BLivePkPunishMotion bLivePkPunishMotion = new BLivePkPunishMotion();
        bLivePkPunishMotion.nullCheck();
        return bLivePkPunishMotion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkPunishMotion mo223809clone() {
        BLivePkPunishMotion bLivePkPunishMotion = new BLivePkPunishMotion();
        bLivePkPunishMotion.f44427id = this.f44427id;
        bLivePkPunishMotion.description = this.description;
        bLivePkPunishMotion.url = this.url;
        bLivePkPunishMotion.iconUrl = this.iconUrl;
        bLivePkPunishMotion.vipUrl = this.vipUrl;
        bLivePkPunishMotion.superUrl = this.superUrl;
        return bLivePkPunishMotion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkPunishMotion)) {
            return false;
        }
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) obj;
        return ValueObject.util_equals(this.f44427id, bLivePkPunishMotion.f44427id) && ValueObject.util_equals(this.description, bLivePkPunishMotion.description) && ValueObject.util_equals(this.url, bLivePkPunishMotion.url) && ValueObject.util_equals(this.iconUrl, bLivePkPunishMotion.iconUrl) && ValueObject.util_equals(this.vipUrl, bLivePkPunishMotion.vipUrl) && ValueObject.util_equals(this.superUrl, bLivePkPunishMotion.superUrl);
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
        String str = this.f44427id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.vipUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.superUrl;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44427id == null) {
            this.f44427id = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.vipUrl == null) {
            this.vipUrl = "";
        }
        if (this.superUrl == null) {
            this.superUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
