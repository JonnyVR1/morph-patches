package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveDanmakuItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDanmakuItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDanmakuItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDanmakuItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDanmakuItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDanmakuItem newInstance() {
            return new BLiveDanmakuItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveDanmakuItem bLiveDanmakuItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1868521062:
                    if (str.equals("subType")) {
                        b = 0;
                    }
                    break;
                case -1338781920:
                    if (str.equals("payAmount")) {
                        b = 1;
                    }
                    break;
                case -1165461084:
                    if (str.equals("priority")) {
                        b = 2;
                    }
                    break;
                case -1102434521:
                    if (str.equals("liveId")) {
                        b = 3;
                    }
                    break;
                case -971181392:
                    if (str.equals("anchorId")) {
                        b = 4;
                    }
                    break;
                case -925319338:
                    if (str.equals("roomId")) {
                        b = 5;
                    }
                    break;
                case -858803723:
                    if (str.equals("typeId")) {
                        b = 6;
                    }
                    break;
                case -775588976:
                    if (str.equals(MatchFrom.scenario)) {
                        b = 7;
                    }
                    break;
                case -215819606:
                    if (str.equals("userHierarchy")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 10;
                    }
                    break;
                case 109780401:
                    if (str.equals("style")) {
                        b = 11;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 12;
                    }
                    break;
                case 1638765110:
                    if (str.equals("iconUrl")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveDanmakuItem.subType = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveDanmakuItem.payAmount = jsonParser.getValueAsInt();
                    return true;
                case 2:
                    bLiveDanmakuItem.priority = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveDanmakuItem.liveId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveDanmakuItem.anchorId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveDanmakuItem.roomId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveDanmakuItem.typeId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveDanmakuItem.scenario = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveDanmakuItem.userHierarchy = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveDanmakuItem.f45202id = jsonParser.getValueAsString();
                    return false;
                case 10:
                    bLiveDanmakuItem.type = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveDanmakuItem.style = BLiveDanmakuItemStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveDanmakuItem.content = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveDanmakuItem.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDanmakuItem bLiveDanmakuItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveDanmakuItem.f45202id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveDanmakuItem.scenario;
            if (str2 != null) {
                jsonGenerator.writeStringField(MatchFrom.scenario, str2);
            }
            String str3 = bLiveDanmakuItem.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveDanmakuItem.roomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomId", str4);
            }
            String str5 = bLiveDanmakuItem.anchorId;
            if (str5 != null) {
                jsonGenerator.writeStringField("anchorId", str5);
            }
            jsonGenerator.writeNumberField("userHierarchy", bLiveDanmakuItem.userHierarchy);
            String str6 = bLiveDanmakuItem.iconUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("iconUrl", str6);
            }
            String str7 = bLiveDanmakuItem.typeId;
            if (str7 != null) {
                jsonGenerator.writeStringField("typeId", str7);
            }
            String str8 = bLiveDanmakuItem.type;
            if (str8 != null) {
                jsonGenerator.writeStringField("type", str8);
            }
            String str9 = bLiveDanmakuItem.subType;
            if (str9 != null) {
                jsonGenerator.writeStringField("subType", str9);
            }
            jsonGenerator.writeNumberField("payAmount", bLiveDanmakuItem.payAmount);
            String str10 = bLiveDanmakuItem.content;
            if (str10 != null) {
                jsonGenerator.writeStringField("content", str10);
            }
            String str11 = bLiveDanmakuItem.priority;
            if (str11 != null) {
                jsonGenerator.writeStringField("priority", str11);
            }
            if (bLiveDanmakuItem.style != null) {
                jsonGenerator.writeFieldName("style");
                BLiveDanmakuItemStyle.JSON_ADAPTER.serialize(bLiveDanmakuItem.style, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDanmakuItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedanmakuitem";

    @NonNull
    @ProtobufIndex(index = 5)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 12)
    public String content;

    @NonNull
    @ProtobufIndex(index = 7)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45202id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @ProtobufIndex(index = 11)
    public int payAmount;

    @NonNull
    @ProtobufIndex(index = 13)
    public String priority;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String scenario;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveDanmakuItemStyle style;

    @NonNull
    @ProtobufIndex(index = 10)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 9)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public String typeId;

    @ProtobufIndex(index = 6)
    public int userHierarchy;

    public static BLiveDanmakuItem new_() {
        BLiveDanmakuItem bLiveDanmakuItem = new BLiveDanmakuItem();
        bLiveDanmakuItem.nullCheck();
        return bLiveDanmakuItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDanmakuItem mo225055clone() {
        BLiveDanmakuItem bLiveDanmakuItem = new BLiveDanmakuItem();
        bLiveDanmakuItem.f45202id = this.f45202id;
        bLiveDanmakuItem.scenario = this.scenario;
        bLiveDanmakuItem.liveId = this.liveId;
        bLiveDanmakuItem.roomId = this.roomId;
        bLiveDanmakuItem.anchorId = this.anchorId;
        bLiveDanmakuItem.userHierarchy = this.userHierarchy;
        bLiveDanmakuItem.iconUrl = this.iconUrl;
        bLiveDanmakuItem.typeId = this.typeId;
        bLiveDanmakuItem.type = this.type;
        bLiveDanmakuItem.subType = this.subType;
        bLiveDanmakuItem.payAmount = this.payAmount;
        bLiveDanmakuItem.content = this.content;
        bLiveDanmakuItem.priority = this.priority;
        BLiveDanmakuItemStyle bLiveDanmakuItemStyle = this.style;
        if (bLiveDanmakuItemStyle != null) {
            bLiveDanmakuItem.style = bLiveDanmakuItemStyle.mo225055clone();
        }
        return bLiveDanmakuItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDanmakuItem)) {
            return false;
        }
        BLiveDanmakuItem bLiveDanmakuItem = (BLiveDanmakuItem) obj;
        return ValueObject.util_equals(this.f45202id, bLiveDanmakuItem.f45202id) && ValueObject.util_equals(this.scenario, bLiveDanmakuItem.scenario) && ValueObject.util_equals(this.liveId, bLiveDanmakuItem.liveId) && ValueObject.util_equals(this.roomId, bLiveDanmakuItem.roomId) && ValueObject.util_equals(this.anchorId, bLiveDanmakuItem.anchorId) && this.userHierarchy == bLiveDanmakuItem.userHierarchy && ValueObject.util_equals(this.iconUrl, bLiveDanmakuItem.iconUrl) && ValueObject.util_equals(this.typeId, bLiveDanmakuItem.typeId) && ValueObject.util_equals(this.type, bLiveDanmakuItem.type) && ValueObject.util_equals(this.subType, bLiveDanmakuItem.subType) && this.payAmount == bLiveDanmakuItem.payAmount && ValueObject.util_equals(this.content, bLiveDanmakuItem.content) && ValueObject.util_equals(this.priority, bLiveDanmakuItem.priority) && ValueObject.util_equals(this.style, bLiveDanmakuItem.style);
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
        String str = this.f45202id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scenario;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.roomId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.anchorId;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.userHierarchy) * 41;
        String str6 = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.typeId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.type;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.subType;
        int iHashCode9 = (((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41) + this.payAmount) * 41;
        String str10 = this.content;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.priority;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        BLiveDanmakuItemStyle bLiveDanmakuItemStyle = this.style;
        int iHashCode12 = iHashCode11 + (bLiveDanmakuItemStyle != null ? bLiveDanmakuItemStyle.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45202id == null) {
            this.f45202id = "";
        }
        if (this.scenario == null) {
            this.scenario = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.typeId == null) {
            this.typeId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.subType == null) {
            this.subType = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.priority == null) {
            this.priority = "";
        }
        if (this.style == null) {
            this.style = BLiveDanmakuItemStyle.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
