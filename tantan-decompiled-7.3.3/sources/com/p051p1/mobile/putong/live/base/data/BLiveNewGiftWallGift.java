package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallSkin;
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
public class BLiveNewGiftWallGift extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallGift> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallGift>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallGift.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallGift newInstance() {
            return new BLiveNewGiftWallGift();
        }

        public boolean parseField(BLiveNewGiftWallGift bLiveNewGiftWallGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "originalId":
                    bLiveNewGiftWallGift.originalId = jsonParser.getValueAsString();
                    return true;
                case "contributorUserIds":
                    bLiveNewGiftWallGift.contributorUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isSkin":
                    bLiveNewGiftWallGift.isSkin = jsonParser.getValueAsBoolean();
                    return true;
                case "source":
                    bLiveNewGiftWallGift.source = jsonParser.getValueAsString();
                    return true;
                case "namedUserId":
                    bLiveNewGiftWallGift.namedUserId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveNewGiftWallGift.f45259id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    bLiveNewGiftWallGift.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveNewGiftWallGift.name = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveNewGiftWallGift.grade = jsonParser.getValueAsInt();
                    return true;
                case "skins":
                    bLiveNewGiftWallGift.skins = JsonAdapter.parseArray(jsonParser, BLiveNewGiftWallSkin.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "categoryId":
                    bLiveNewGiftWallGift.categoryId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallGift bLiveNewGiftWallGift, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallGift.f45259id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveNewGiftWallGift.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveNewGiftWallGift.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
            String str4 = bLiveNewGiftWallGift.categoryId;
            if (str4 != null) {
                jsonGenerator.writeStringField("categoryId", str4);
            }
            String str5 = bLiveNewGiftWallGift.namedUserId;
            if (str5 != null) {
                jsonGenerator.writeStringField("namedUserId", str5);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveNewGiftWallGift.grade);
            if (bLiveNewGiftWallGift.contributorUserIds != null) {
                jsonGenerator.writeFieldName("contributorUserIds");
                JsonAdapter.serializeArray(bLiveNewGiftWallGift.contributorUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveNewGiftWallGift.skins != null) {
                jsonGenerator.writeFieldName("skins");
                JsonAdapter.serializeArray(bLiveNewGiftWallGift.skins, jsonGenerator, BLiveNewGiftWallSkin.JSON_ADAPTER);
            }
            String str6 = bLiveNewGiftWallGift.name;
            if (str6 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str6);
            }
            String str7 = bLiveNewGiftWallGift.originalId;
            if (str7 != null) {
                jsonGenerator.writeStringField("originalId", str7);
            }
            jsonGenerator.writeBooleanField("isSkin", bLiveNewGiftWallGift.isSkin);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallgift";

    @NonNull
    @ProtobufIndex(index = 4)
    public String categoryId;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> contributorUserIds;

    @ProtobufIndex(index = 6)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45259id;

    @ProtobufIndex(index = 11)
    public boolean isSkin;

    @NonNull
    @ProtobufIndex(index = 9)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String namedUserId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String originalId;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveNewGiftWallSkin> skins;

    @NonNull
    @ProtobufIndex(index = 3)
    public String source;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69268a(String str) {
        return str;
    }

    public static BLiveNewGiftWallGift new_() {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = new BLiveNewGiftWallGift();
        bLiveNewGiftWallGift.nullCheck();
        return bLiveNewGiftWallGift;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallGift mo225055clone() {
        BLiveNewGiftWallGift bLiveNewGiftWallGift = new BLiveNewGiftWallGift();
        bLiveNewGiftWallGift.f45259id = this.f45259id;
        bLiveNewGiftWallGift.icon = this.icon;
        bLiveNewGiftWallGift.source = this.source;
        bLiveNewGiftWallGift.categoryId = this.categoryId;
        bLiveNewGiftWallGift.namedUserId = this.namedUserId;
        bLiveNewGiftWallGift.grade = this.grade;
        List<String> list = this.contributorUserIds;
        if (list != null) {
            bLiveNewGiftWallGift.contributorUserIds = ValueObject.util_map(list, new qcj() { // from class: l.r32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveNewGiftWallGift.m69268a((String) obj);
                }
            });
        }
        List<BLiveNewGiftWallSkin> list2 = this.skins;
        if (list2 != null) {
            bLiveNewGiftWallGift.skins = ValueObject.util_map(list2, new qcj() { // from class: l.s32
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveNewGiftWallSkin) obj).mo225055clone();
                }
            });
        }
        bLiveNewGiftWallGift.name = this.name;
        bLiveNewGiftWallGift.originalId = this.originalId;
        bLiveNewGiftWallGift.isSkin = this.isSkin;
        return bLiveNewGiftWallGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallGift)) {
            return false;
        }
        BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) obj;
        return ValueObject.util_equals(this.f45259id, bLiveNewGiftWallGift.f45259id) && ValueObject.util_equals(this.icon, bLiveNewGiftWallGift.icon) && ValueObject.util_equals(this.source, bLiveNewGiftWallGift.source) && ValueObject.util_equals(this.categoryId, bLiveNewGiftWallGift.categoryId) && ValueObject.util_equals(this.namedUserId, bLiveNewGiftWallGift.namedUserId) && this.grade == bLiveNewGiftWallGift.grade && ValueObject.util_equals(this.contributorUserIds, bLiveNewGiftWallGift.contributorUserIds) && ValueObject.util_equals(this.skins, bLiveNewGiftWallGift.skins) && ValueObject.util_equals(this.name, bLiveNewGiftWallGift.name) && ValueObject.util_equals(this.originalId, bLiveNewGiftWallGift.originalId) && this.isSkin == bLiveNewGiftWallGift.isSkin;
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
        String str = this.f45259id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.categoryId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.namedUserId;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.grade) * 41;
        List<String> list = this.contributorUserIds;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveNewGiftWallSkin> list2 = this.skins;
        int iHashCode7 = (iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str6 = this.name;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.originalId;
        int iHashCode9 = ((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41) + (this.isSkin ? 1231 : 1237);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45259id == null) {
            this.f45259id = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.source == null) {
            this.source = "";
        }
        if (this.categoryId == null) {
            this.categoryId = "";
        }
        if (this.namedUserId == null) {
            this.namedUserId = "";
        }
        if (this.contributorUserIds == null) {
            this.contributorUserIds = new ArrayList();
        }
        if (this.skins == null) {
            this.skins = new ArrayList();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.originalId == null) {
            this.originalId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
