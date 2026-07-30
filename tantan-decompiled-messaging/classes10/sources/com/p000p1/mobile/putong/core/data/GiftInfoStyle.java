package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GiftInfoStyle;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftInfoStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftinfostyle";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> backgroundColors;

    @Nullable
    public String nameColor;

    @Nullable
    public GiftInfoTag tag;
    public static ProtobufAdapter<GiftInfoStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftInfoStyle>() { // from class: com.p1.mobile.putong.core.data.GiftInfoStyle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftInfoStyle giftInfoStyle) {
            List<String> list = giftInfoStyle.backgroundColors;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) giftInfoStyle).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftInfoStyle m12949parse(nb5 nb5Var) throws IOException {
            GiftInfoStyle giftInfoStyle = new GiftInfoStyle();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (giftInfoStyle.backgroundColors != null) {
                        break;
                    }
                    giftInfoStyle.backgroundColors = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (giftInfoStyle.backgroundColors != null) {
                        break;
                    }
                    giftInfoStyle.backgroundColors = new ArrayList();
                    return giftInfoStyle;
                }
                giftInfoStyle.backgroundColors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return giftInfoStyle;
        }

        public void serialize(GiftInfoStyle giftInfoStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = giftInfoStyle.backgroundColors;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GiftInfoStyle> JSON_ADAPTER = new ObjectJsonAdapter<GiftInfoStyle>() { // from class: com.p1.mobile.putong.core.data.GiftInfoStyle.2
        public Class getDataClass() {
            return GiftInfoStyle.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftInfoStyle m12950newInstance() {
            return new GiftInfoStyle();
        }

        public boolean parseField(GiftInfoStyle giftInfoStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tag":
                    giftInfoStyle.tag = (GiftInfoTag) GiftInfoTag.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "nameColor":
                    giftInfoStyle.nameColor = jsonParser.getValueAsString();
                    return true;
                case "backgroundColors":
                    giftInfoStyle.backgroundColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftInfoStyle giftInfoStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tag":
                case "nameColor":
                case "backgroundColors":
                    return true;
                default:
                    return super.parseFieldCheck(giftInfoStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GiftInfoStyle giftInfoStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = giftInfoStyle.nameColor;
            if (str != null) {
                jsonGenerator.writeStringField("nameColor", str);
            }
            if (giftInfoStyle.backgroundColors != null) {
                jsonGenerator.writeFieldName("backgroundColors");
                JsonAdapter.serializeArray(giftInfoStyle.backgroundColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (giftInfoStyle.tag != null) {
                jsonGenerator.writeFieldName("tag");
                GiftInfoTag.JSON_ADAPTER.serialize(giftInfoStyle.tag, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftInfoStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftInfoStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m355a(String str) {
        return str;
    }

    public static GiftInfoStyle new_() {
        GiftInfoStyle giftInfoStyle = new GiftInfoStyle();
        giftInfoStyle.nullCheck();
        return giftInfoStyle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftInfoStyle m12948clone() {
        GiftInfoStyle giftInfoStyle = new GiftInfoStyle();
        giftInfoStyle.nameColor = this.nameColor;
        List<String> list = this.backgroundColors;
        if (list != null) {
            giftInfoStyle.backgroundColors = ValueObject.util_map(list, new w9j() { // from class: l.kqj
                public final Object call(Object obj) {
                    return GiftInfoStyle.m355a((String) obj);
                }
            });
        }
        GiftInfoTag giftInfoTag = this.tag;
        if (giftInfoTag != null) {
            giftInfoStyle.tag = giftInfoTag.m12952clone();
        }
        return giftInfoStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInfoStyle)) {
            return false;
        }
        GiftInfoStyle giftInfoStyle = (GiftInfoStyle) obj;
        return ValueObject.util_equals(this.nameColor, giftInfoStyle.nameColor) && ValueObject.util_equals(this.backgroundColors, giftInfoStyle.backgroundColors) && ValueObject.util_equals(this.tag, giftInfoStyle.tag);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.nameColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.backgroundColors;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        GiftInfoTag giftInfoTag = this.tag;
        int iHashCode3 = iHashCode2 + (giftInfoTag != null ? giftInfoTag.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.backgroundColors == null) {
            this.backgroundColors = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
