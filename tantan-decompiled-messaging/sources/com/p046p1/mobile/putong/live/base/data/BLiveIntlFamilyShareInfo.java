package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.SchemeKey;
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
public class BLiveIntlFamilyShareInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlFamilyShareInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlFamilyShareInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlFamilyShareInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlFamilyShareInfo newInstance() {
            return new BLiveIntlFamilyShareInfo();
        }

        public boolean parseField(BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveIntlFamilyShareInfo.f44389id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveIntlFamilyShareInfo.name = jsonParser.getValueAsString();
                    return true;
                case "liveCover":
                    bLiveIntlFamilyShareInfo.liveCover = jsonParser.getValueAsString();
                    return true;
                case "liveTitle":
                    bLiveIntlFamilyShareInfo.liveTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlFamilyShareInfo.f44389id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveIntlFamilyShareInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveIntlFamilyShareInfo.liveCover;
            if (str3 != null) {
                jsonGenerator.writeStringField(SchemeKey.liveCover, str3);
            }
            String str4 = bLiveIntlFamilyShareInfo.liveTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveTitle", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlFamilyShareInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlfamilyshareinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44389id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveCover;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    public static BLiveIntlFamilyShareInfo new_() {
        BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo = new BLiveIntlFamilyShareInfo();
        bLiveIntlFamilyShareInfo.nullCheck();
        return bLiveIntlFamilyShareInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlFamilyShareInfo mo223809clone() {
        BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo = new BLiveIntlFamilyShareInfo();
        bLiveIntlFamilyShareInfo.f44389id = this.f44389id;
        bLiveIntlFamilyShareInfo.name = this.name;
        bLiveIntlFamilyShareInfo.liveCover = this.liveCover;
        bLiveIntlFamilyShareInfo.liveTitle = this.liveTitle;
        return bLiveIntlFamilyShareInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlFamilyShareInfo)) {
            return false;
        }
        BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo = (BLiveIntlFamilyShareInfo) obj;
        return ValueObject.util_equals(this.f44389id, bLiveIntlFamilyShareInfo.f44389id) && ValueObject.util_equals(this.name, bLiveIntlFamilyShareInfo.name) && ValueObject.util_equals(this.liveCover, bLiveIntlFamilyShareInfo.liveCover) && ValueObject.util_equals(this.liveTitle, bLiveIntlFamilyShareInfo.liveTitle);
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
        String str = this.f44389id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveCover;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveTitle;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44389id == null) {
            this.f44389id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.liveCover == null) {
            this.liveCover = "";
        }
        if (this.liveTitle == null) {
            this.liveTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
