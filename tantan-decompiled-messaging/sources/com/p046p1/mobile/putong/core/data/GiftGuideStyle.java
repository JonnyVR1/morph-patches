package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class GiftGuideStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftguidestyle";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 3)
    public GiftGuideTipsType type;
    public static ProtobufAdapter<GiftGuideStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftGuideStyle>() { // from class: com.p1.mobile.putong.core.data.GiftGuideStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftGuideStyle giftGuideStyle) {
            String str = giftGuideStyle.icon;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = giftGuideStyle.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            GiftGuideTipsType giftGuideTipsType = giftGuideStyle.type;
            if (giftGuideTipsType != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, giftGuideTipsType.ordinal());
            }
            GiftGuideTipsType giftGuideTipsType2 = giftGuideStyle.type;
            if (giftGuideTipsType2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, giftGuideTipsType2, GiftGuideTipsType.PROTOBUF_ADAPTER);
            }
            giftGuideStyle.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftGuideStyle parse(nb5 nb5Var) throws IOException {
            GiftGuideStyle giftGuideStyle = new GiftGuideStyle();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftGuideStyle.type == null && numValueOf != null) {
                        giftGuideStyle.type = (GiftGuideTipsType) GiftGuideTipsType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (giftGuideStyle.icon == null) {
                        giftGuideStyle.icon = "";
                    }
                    if (giftGuideStyle.text == null) {
                        giftGuideStyle.text = "";
                    }
                    if (giftGuideStyle.type != null) {
                        break;
                    }
                    giftGuideStyle.type = (GiftGuideTipsType) GiftGuideTipsType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    giftGuideStyle.icon = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    giftGuideStyle.text = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 34) {
                        if (giftGuideStyle.type == null && numValueOf != null) {
                            giftGuideStyle.type = (GiftGuideTipsType) GiftGuideTipsType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (giftGuideStyle.icon == null) {
                            giftGuideStyle.icon = "";
                        }
                        if (giftGuideStyle.text == null) {
                            giftGuideStyle.text = "";
                        }
                        if (giftGuideStyle.type != null) {
                            break;
                        }
                        giftGuideStyle.type = (GiftGuideTipsType) GiftGuideTipsType.JSON_ADAPTER.defaultEnum();
                        return giftGuideStyle;
                    }
                    giftGuideStyle.type = (GiftGuideTipsType) nb5Var.m158743l(GiftGuideTipsType.PROTOBUF_ADAPTER);
                }
            }
            return giftGuideStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftGuideStyle giftGuideStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftGuideStyle.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = giftGuideStyle.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            GiftGuideTipsType giftGuideTipsType = giftGuideStyle.type;
            if (giftGuideTipsType != null) {
                codedOutputByteBufferNano.m17250G(3, giftGuideTipsType.ordinal());
            }
            GiftGuideTipsType giftGuideTipsType2 = giftGuideStyle.type;
            if (giftGuideTipsType2 != null) {
                codedOutputByteBufferNano.m17254K(4, giftGuideTipsType2, GiftGuideTipsType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftGuideStyle> JSON_ADAPTER = new ObjectJsonAdapter<GiftGuideStyle>() { // from class: com.p1.mobile.putong.core.data.GiftGuideStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftGuideStyle.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftGuideStyle newInstance() {
            return new GiftGuideStyle();
        }

        public boolean parseField(GiftGuideStyle giftGuideStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "icon":
                    giftGuideStyle.icon = jsonParser.getValueAsString();
                    return true;
                case "text":
                    giftGuideStyle.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    giftGuideStyle.type = GiftGuideTipsType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftGuideStyle giftGuideStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "icon":
                case "text":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(giftGuideStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftGuideStyle giftGuideStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = giftGuideStyle.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = giftGuideStyle.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            if (giftGuideStyle.type != null) {
                jsonGenerator.writeFieldName("type");
                GiftGuideTipsType.JSON_ADAPTER.serialize(giftGuideStyle.type, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftGuideStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftGuideStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftGuideStyle new_() {
        GiftGuideStyle giftGuideStyle = new GiftGuideStyle();
        giftGuideStyle.nullCheck();
        return giftGuideStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftGuideStyle mo223809clone() {
        GiftGuideStyle giftGuideStyle = new GiftGuideStyle();
        giftGuideStyle.icon = this.icon;
        giftGuideStyle.text = this.text;
        giftGuideStyle.type = this.type;
        return giftGuideStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftGuideStyle)) {
            return false;
        }
        GiftGuideStyle giftGuideStyle = (GiftGuideStyle) obj;
        return ValueObject.util_equals(this.icon, giftGuideStyle.icon) && ValueObject.util_equals(this.text, giftGuideStyle.text) && ValueObject.util_equals(this.type, giftGuideStyle.type);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        GiftGuideTipsType giftGuideTipsType = this.type;
        int iHashCode3 = iHashCode2 + (giftGuideTipsType != null ? giftGuideTipsType.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.type == null) {
            this.type = (GiftGuideTipsType) GiftGuideTipsType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
