package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAddStickerResult extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAddStickerResult> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAddStickerResult>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAddStickerResult.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAddStickerResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAddStickerResult newInstance() {
            return new BLiveAddStickerResult();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveAddStickerResult bLiveAddStickerResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1246042517:
                    if (str.equals("giftId")) {
                        b = 0;
                    }
                    break;
                case -389704538:
                    if (str.equals("contentArea")) {
                        b = 1;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 2;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 3;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 4;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 5;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = 6;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = 7;
                    }
                    break;
                case 365601008:
                    if (str.equals("fontSize")) {
                        b = 8;
                    }
                    break;
                case 382106123:
                    if (str.equals("maxCount")) {
                        b = 9;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        b = 10;
                    }
                    break;
                case 849019337:
                    if (str.equals("giftIcon")) {
                        b = 11;
                    }
                    break;
                case 951530617:
                    if (str.equals("content")) {
                        b = 12;
                    }
                    break;
                case 1173902155:
                    if (str.equals("animationUrl")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1304010549:
                    if (str.equals("templateId")) {
                        b = 14;
                    }
                    break;
                case 1901919544:
                    if (str.equals("stretchRange")) {
                        b = 15;
                    }
                    break;
                case 1912285522:
                    if (str.equals("boldText")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveAddStickerResult.giftId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveAddStickerResult.contentArea = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    bLiveAddStickerResult.f45177id = jsonParser.getValueAsString();
                    return false;
                case 3:
                    bLiveAddStickerResult.url = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveAddStickerResult.type = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveAddStickerResult.category = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveAddStickerResult.color = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveAddStickerResult.version = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    bLiveAddStickerResult.fontSize = jsonParser.getValueAsInt();
                    return true;
                case 9:
                    bLiveAddStickerResult.maxCount = jsonParser.getValueAsInt();
                    return true;
                case 10:
                    bLiveAddStickerResult.position = BLivePosition.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveAddStickerResult.giftIcon = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveAddStickerResult.content = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveAddStickerResult.animationUrl = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveAddStickerResult.templateId = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveAddStickerResult.stretchRange = BLiveStretchRange.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 16:
                    bLiveAddStickerResult.boldText = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAddStickerResult bLiveAddStickerResult, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAddStickerResult.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = bLiveAddStickerResult.f45177id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (bLiveAddStickerResult.position != null) {
                jsonGenerator.writeFieldName("position");
                BLivePosition.JSON_ADAPTER.serialize(bLiveAddStickerResult.position, jsonGenerator, true);
            }
            String str3 = bLiveAddStickerResult.templateId;
            if (str3 != null) {
                jsonGenerator.writeStringField("templateId", str3);
            }
            String str4 = bLiveAddStickerResult.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, bLiveAddStickerResult.version);
            String str5 = bLiveAddStickerResult.category;
            if (str5 != null) {
                jsonGenerator.writeStringField("category", str5);
            }
            String str6 = bLiveAddStickerResult.url;
            if (str6 != null) {
                jsonGenerator.writeStringField("url", str6);
            }
            String str7 = bLiveAddStickerResult.animationUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("animationUrl", str7);
            }
            jsonGenerator.writeNumberField("maxCount", bLiveAddStickerResult.maxCount);
            jsonGenerator.writeNumberField("fontSize", bLiveAddStickerResult.fontSize);
            String str8 = bLiveAddStickerResult.color;
            if (str8 != null) {
                jsonGenerator.writeStringField("color", str8);
            }
            jsonGenerator.writeBooleanField("boldText", bLiveAddStickerResult.boldText);
            String str9 = bLiveAddStickerResult.giftId;
            if (str9 != null) {
                jsonGenerator.writeStringField("giftId", str9);
            }
            String str10 = bLiveAddStickerResult.giftIcon;
            if (str10 != null) {
                jsonGenerator.writeStringField("giftIcon", str10);
            }
            if (bLiveAddStickerResult.stretchRange != null) {
                jsonGenerator.writeFieldName("stretchRange");
                BLiveStretchRange.JSON_ADAPTER.serialize(bLiveAddStickerResult.stretchRange, jsonGenerator, true);
            }
            if (bLiveAddStickerResult.contentArea != null) {
                jsonGenerator.writeFieldName("contentArea");
                JsonAdapter.serializeArray(bLiveAddStickerResult.contentArea, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAddStickerResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaddstickerresult";

    @NonNull
    @ProtobufIndex(index = 9)
    public String animationUrl;

    @ProtobufIndex(index = 13)
    public boolean boldText;

    @NonNull
    @ProtobufIndex(index = 7)
    public String category;

    @NonNull
    @ProtobufIndex(index = 12)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<Integer> contentArea;

    @ProtobufIndex(index = 11)
    public int fontSize;

    @NonNull
    @ProtobufIndex(index = 15)
    public String giftIcon;

    @NonNull
    @ProtobufIndex(index = 14)
    public String giftId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f45177id;

    @ProtobufIndex(index = 10)
    public int maxCount;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLivePosition position;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveStretchRange stretchRange;

    @NonNull
    @ProtobufIndex(index = 4)
    public String templateId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public String url;

    @ProtobufIndex(index = 6)
    public long version;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m68852a(Integer num) {
        return num;
    }

    public static BLiveAddStickerResult new_() {
        BLiveAddStickerResult bLiveAddStickerResult = new BLiveAddStickerResult();
        bLiveAddStickerResult.nullCheck();
        return bLiveAddStickerResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAddStickerResult mo225055clone() {
        BLiveAddStickerResult bLiveAddStickerResult = new BLiveAddStickerResult();
        bLiveAddStickerResult.content = this.content;
        bLiveAddStickerResult.f45177id = this.f45177id;
        BLivePosition bLivePosition = this.position;
        if (bLivePosition != null) {
            bLiveAddStickerResult.position = bLivePosition.mo225055clone();
        }
        bLiveAddStickerResult.templateId = this.templateId;
        bLiveAddStickerResult.type = this.type;
        bLiveAddStickerResult.version = this.version;
        bLiveAddStickerResult.category = this.category;
        bLiveAddStickerResult.url = this.url;
        bLiveAddStickerResult.animationUrl = this.animationUrl;
        bLiveAddStickerResult.maxCount = this.maxCount;
        bLiveAddStickerResult.fontSize = this.fontSize;
        bLiveAddStickerResult.color = this.color;
        bLiveAddStickerResult.boldText = this.boldText;
        bLiveAddStickerResult.giftId = this.giftId;
        bLiveAddStickerResult.giftIcon = this.giftIcon;
        BLiveStretchRange bLiveStretchRange = this.stretchRange;
        if (bLiveStretchRange != null) {
            bLiveAddStickerResult.stretchRange = bLiveStretchRange.mo225055clone();
        }
        List<Integer> list = this.contentArea;
        if (list != null) {
            bLiveAddStickerResult.contentArea = ValueObject.util_map(list, new qcj() { // from class: l.gr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveAddStickerResult.m68852a((Integer) obj);
                }
            });
        }
        return bLiveAddStickerResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAddStickerResult)) {
            return false;
        }
        BLiveAddStickerResult bLiveAddStickerResult = (BLiveAddStickerResult) obj;
        return ValueObject.util_equals(this.content, bLiveAddStickerResult.content) && ValueObject.util_equals(this.f45177id, bLiveAddStickerResult.f45177id) && ValueObject.util_equals(this.position, bLiveAddStickerResult.position) && ValueObject.util_equals(this.templateId, bLiveAddStickerResult.templateId) && ValueObject.util_equals(this.type, bLiveAddStickerResult.type) && this.version == bLiveAddStickerResult.version && ValueObject.util_equals(this.category, bLiveAddStickerResult.category) && ValueObject.util_equals(this.url, bLiveAddStickerResult.url) && ValueObject.util_equals(this.animationUrl, bLiveAddStickerResult.animationUrl) && this.maxCount == bLiveAddStickerResult.maxCount && this.fontSize == bLiveAddStickerResult.fontSize && ValueObject.util_equals(this.color, bLiveAddStickerResult.color) && this.boldText == bLiveAddStickerResult.boldText && ValueObject.util_equals(this.giftId, bLiveAddStickerResult.giftId) && ValueObject.util_equals(this.giftIcon, bLiveAddStickerResult.giftIcon) && ValueObject.util_equals(this.stretchRange, bLiveAddStickerResult.stretchRange) && ValueObject.util_equals(this.contentArea, bLiveAddStickerResult.contentArea);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f45177id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLivePosition bLivePosition = this.position;
        int iHashCode3 = (iHashCode2 + (bLivePosition != null ? bLivePosition.hashCode() : 0)) * 41;
        String str3 = this.templateId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        long j = this.version;
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str5 = this.category;
        int iHashCode6 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.url;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.animationUrl;
        int iHashCode8 = (((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41) + this.maxCount) * 41) + this.fontSize) * 41;
        String str8 = this.color;
        int iHashCode9 = (((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41) + (this.boldText ? 1231 : 1237)) * 41;
        String str9 = this.giftId;
        int iHashCode10 = (iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.giftIcon;
        int iHashCode11 = (iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 41;
        BLiveStretchRange bLiveStretchRange = this.stretchRange;
        int iHashCode12 = (iHashCode11 + (bLiveStretchRange != null ? bLiveStretchRange.hashCode() : 0)) * 41;
        List<Integer> list = this.contentArea;
        int iHashCode13 = iHashCode12 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.f45177id == null) {
            this.f45177id = "";
        }
        if (this.position == null) {
            this.position = BLivePosition.new_();
        }
        if (this.templateId == null) {
            this.templateId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.animationUrl == null) {
            this.animationUrl = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.giftIcon == null) {
            this.giftIcon = "";
        }
        if (this.stretchRange == null) {
            this.stretchRange = BLiveStretchRange.new_();
        }
        if (this.contentArea == null) {
            this.contentArea = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
