package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class GiftInfoExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftinfoextra";

    @Nullable
    @ProtobufIndex(index = 4)
    public String blessingText;

    @Nullable
    @ProtobufIndex(index = 5)
    public String grayURL;

    @NonNull
    @ProtobufIndex(index = 1)
    public String messageTips;

    @NonNull
    @ProtobufIndex(index = 2)
    public String noQuotaToast;

    @Nullable
    @ProtobufIndex(index = 3)
    public String shopGuide;

    @Nullable
    public StickerURL stickerURL;

    @Nullable
    public GiftInfoStyle style;
    public static ProtobufAdapter<GiftInfoExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftInfoExtra>() { // from class: com.p1.mobile.putong.core.data.GiftInfoExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftInfoExtra giftInfoExtra) {
            String str = giftInfoExtra.messageTips;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = giftInfoExtra.noQuotaToast;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = giftInfoExtra.shopGuide;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = giftInfoExtra.blessingText;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = giftInfoExtra.grayURL;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            giftInfoExtra.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftInfoExtra parse(nc5 nc5Var) throws IOException {
            GiftInfoExtra giftInfoExtra = new GiftInfoExtra();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (giftInfoExtra.messageTips == null) {
                        giftInfoExtra.messageTips = "";
                    }
                    if (giftInfoExtra.noQuotaToast != null) {
                        break;
                    }
                    giftInfoExtra.noQuotaToast = "";
                    break;
                }
                if (iM162497u == 10) {
                    giftInfoExtra.messageTips = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    giftInfoExtra.noQuotaToast = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    giftInfoExtra.shopGuide = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    giftInfoExtra.blessingText = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (giftInfoExtra.messageTips == null) {
                            giftInfoExtra.messageTips = "";
                        }
                        if (giftInfoExtra.noQuotaToast != null) {
                            break;
                        }
                        giftInfoExtra.noQuotaToast = "";
                        return giftInfoExtra;
                    }
                    giftInfoExtra.grayURL = nc5Var.m162495s();
                }
            }
            return giftInfoExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftInfoExtra giftInfoExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftInfoExtra.messageTips;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = giftInfoExtra.noQuotaToast;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = giftInfoExtra.shopGuide;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = giftInfoExtra.blessingText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = giftInfoExtra.grayURL;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
        }
    };
    public static JsonAdapter<GiftInfoExtra> JSON_ADAPTER = new ObjectJsonAdapter<GiftInfoExtra>() { // from class: com.p1.mobile.putong.core.data.GiftInfoExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftInfoExtra.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftInfoExtra newInstance() {
            return new GiftInfoExtra();
        }

        public boolean parseField(GiftInfoExtra giftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "shopGuide":
                    giftInfoExtra.shopGuide = jsonParser.getValueAsString();
                    return true;
                case "noQuotaToast":
                    giftInfoExtra.noQuotaToast = jsonParser.getValueAsString();
                    return true;
                case "stickerURL":
                    giftInfoExtra.stickerURL = StickerURL.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "messageTips":
                    giftInfoExtra.messageTips = jsonParser.getValueAsString();
                    return true;
                case "blessingText":
                    giftInfoExtra.blessingText = jsonParser.getValueAsString();
                    return true;
                case "style":
                    giftInfoExtra.style = GiftInfoStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "grayURL":
                    giftInfoExtra.grayURL = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftInfoExtra giftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "shopGuide":
                case "noQuotaToast":
                case "stickerURL":
                case "messageTips":
                case "blessingText":
                case "style":
                case "grayURL":
                    return true;
                default:
                    return super.parseFieldCheck(giftInfoExtra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftInfoExtra giftInfoExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = giftInfoExtra.messageTips;
            if (str != null) {
                jsonGenerator.writeStringField("messageTips", str);
            }
            String str2 = giftInfoExtra.noQuotaToast;
            if (str2 != null) {
                jsonGenerator.writeStringField("noQuotaToast", str2);
            }
            if (giftInfoExtra.style != null) {
                jsonGenerator.writeFieldName("style");
                GiftInfoStyle.JSON_ADAPTER.serialize(giftInfoExtra.style, jsonGenerator, true);
            }
            String str3 = giftInfoExtra.shopGuide;
            if (str3 != null) {
                jsonGenerator.writeStringField("shopGuide", str3);
            }
            String str4 = giftInfoExtra.blessingText;
            if (str4 != null) {
                jsonGenerator.writeStringField("blessingText", str4);
            }
            String str5 = giftInfoExtra.grayURL;
            if (str5 != null) {
                jsonGenerator.writeStringField("grayURL", str5);
            }
            if (giftInfoExtra.stickerURL != null) {
                jsonGenerator.writeFieldName("stickerURL");
                StickerURL.JSON_ADAPTER.serialize(giftInfoExtra.stickerURL, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftInfoExtra new_() {
        GiftInfoExtra giftInfoExtra = new GiftInfoExtra();
        giftInfoExtra.nullCheck();
        return giftInfoExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftInfoExtra mo225055clone() {
        GiftInfoExtra giftInfoExtra = new GiftInfoExtra();
        giftInfoExtra.messageTips = this.messageTips;
        giftInfoExtra.noQuotaToast = this.noQuotaToast;
        GiftInfoStyle giftInfoStyle = this.style;
        if (giftInfoStyle != null) {
            giftInfoExtra.style = giftInfoStyle.mo225055clone();
        }
        giftInfoExtra.shopGuide = this.shopGuide;
        giftInfoExtra.blessingText = this.blessingText;
        giftInfoExtra.grayURL = this.grayURL;
        StickerURL stickerURL = this.stickerURL;
        if (stickerURL != null) {
            giftInfoExtra.stickerURL = stickerURL.mo225055clone();
        }
        return giftInfoExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInfoExtra)) {
            return false;
        }
        GiftInfoExtra giftInfoExtra = (GiftInfoExtra) obj;
        return ValueObject.util_equals(this.messageTips, giftInfoExtra.messageTips) && ValueObject.util_equals(this.noQuotaToast, giftInfoExtra.noQuotaToast) && ValueObject.util_equals(this.style, giftInfoExtra.style) && ValueObject.util_equals(this.shopGuide, giftInfoExtra.shopGuide) && ValueObject.util_equals(this.blessingText, giftInfoExtra.blessingText) && ValueObject.util_equals(this.grayURL, giftInfoExtra.grayURL) && ValueObject.util_equals(this.stickerURL, giftInfoExtra.stickerURL);
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
        String str = this.messageTips;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.noQuotaToast;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        GiftInfoStyle giftInfoStyle = this.style;
        int iHashCode3 = (iHashCode2 + (giftInfoStyle != null ? giftInfoStyle.hashCode() : 0)) * 41;
        String str3 = this.shopGuide;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.blessingText;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.grayURL;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        StickerURL stickerURL = this.stickerURL;
        int iHashCode7 = iHashCode6 + (stickerURL != null ? stickerURL.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.messageTips == null) {
            this.messageTips = "";
        }
        if (this.noQuotaToast == null) {
            this.noQuotaToast = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
