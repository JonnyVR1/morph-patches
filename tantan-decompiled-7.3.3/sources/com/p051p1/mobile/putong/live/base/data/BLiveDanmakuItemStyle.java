package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuItemStyle;
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
public class BLiveDanmakuItemStyle extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDanmakuItemStyle> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDanmakuItemStyle>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDanmakuItemStyle.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDanmakuItemStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDanmakuItemStyle newInstance() {
            return new BLiveDanmakuItemStyle();
        }

        public boolean parseField(BLiveDanmakuItemStyle bLiveDanmakuItemStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backgroundUrl":
                    bLiveDanmakuItemStyle.backgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "opacity":
                    bLiveDanmakuItemStyle.opacity = jsonParser.getValueAsInt();
                    return true;
                case "borderColor":
                    bLiveDanmakuItemStyle.borderColor = jsonParser.getValueAsString();
                    return true;
                case "borderColors":
                    bLiveDanmakuItemStyle.borderColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "backgroundColors":
                    bLiveDanmakuItemStyle.backgroundColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDanmakuItemStyle bLiveDanmakuItemStyle, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveDanmakuItemStyle.backgroundColors != null) {
                jsonGenerator.writeFieldName("backgroundColors");
                JsonAdapter.serializeArray(bLiveDanmakuItemStyle.backgroundColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("opacity", bLiveDanmakuItemStyle.opacity);
            String str = bLiveDanmakuItemStyle.borderColor;
            if (str != null) {
                jsonGenerator.writeStringField("borderColor", str);
            }
            String str2 = bLiveDanmakuItemStyle.backgroundUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundUrl", str2);
            }
            if (bLiveDanmakuItemStyle.borderColors != null) {
                jsonGenerator.writeFieldName("borderColors");
                JsonAdapter.serializeArray(bLiveDanmakuItemStyle.borderColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDanmakuItemStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedanmakuitemstyle";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> backgroundColors;

    @NonNull
    @ProtobufIndex(index = 4)
    public String backgroundUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String borderColor;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> borderColors;

    @ProtobufIndex(index = 2)
    public int opacity;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68950a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m68951b(String str) {
        return str;
    }

    public static BLiveDanmakuItemStyle new_() {
        BLiveDanmakuItemStyle bLiveDanmakuItemStyle = new BLiveDanmakuItemStyle();
        bLiveDanmakuItemStyle.nullCheck();
        return bLiveDanmakuItemStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDanmakuItemStyle mo225055clone() {
        BLiveDanmakuItemStyle bLiveDanmakuItemStyle = new BLiveDanmakuItemStyle();
        List<String> list = this.backgroundColors;
        if (list != null) {
            bLiveDanmakuItemStyle.backgroundColors = ValueObject.util_map(list, new qcj() { // from class: l.et1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveDanmakuItemStyle.m68950a((String) obj);
                }
            });
        }
        bLiveDanmakuItemStyle.opacity = this.opacity;
        bLiveDanmakuItemStyle.borderColor = this.borderColor;
        bLiveDanmakuItemStyle.backgroundUrl = this.backgroundUrl;
        List<String> list2 = this.borderColors;
        if (list2 != null) {
            bLiveDanmakuItemStyle.borderColors = ValueObject.util_map(list2, new qcj() { // from class: l.ft1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveDanmakuItemStyle.m68951b((String) obj);
                }
            });
        }
        return bLiveDanmakuItemStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDanmakuItemStyle)) {
            return false;
        }
        BLiveDanmakuItemStyle bLiveDanmakuItemStyle = (BLiveDanmakuItemStyle) obj;
        return ValueObject.util_equals(this.backgroundColors, bLiveDanmakuItemStyle.backgroundColors) && this.opacity == bLiveDanmakuItemStyle.opacity && ValueObject.util_equals(this.borderColor, bLiveDanmakuItemStyle.borderColor) && ValueObject.util_equals(this.backgroundUrl, bLiveDanmakuItemStyle.backgroundUrl) && ValueObject.util_equals(this.borderColors, bLiveDanmakuItemStyle.borderColors);
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
        List<String> list = this.backgroundColors;
        int iHashCode = (((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.opacity) * 41;
        String str = this.borderColor;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundUrl;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list2 = this.borderColors;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundColors == null) {
            this.backgroundColors = new ArrayList();
        }
        if (this.borderColor == null) {
            this.borderColor = "";
        }
        if (this.backgroundUrl == null) {
            this.backgroundUrl = "";
        }
        if (this.borderColors == null) {
            this.borderColors = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
