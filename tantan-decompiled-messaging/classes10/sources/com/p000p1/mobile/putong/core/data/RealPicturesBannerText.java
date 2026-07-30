package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class RealPicturesBannerText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesbannertext";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String button;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<RealPicturesBannerText> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesBannerText>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBannerText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RealPicturesBannerText realPicturesBannerText) {
            String str = realPicturesBannerText.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = realPicturesBannerText.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = realPicturesBannerText.button;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) realPicturesBannerText).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RealPicturesBannerText m15261parse(nb5 nb5Var) throws IOException {
            RealPicturesBannerText realPicturesBannerText = new RealPicturesBannerText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (realPicturesBannerText.title == null) {
                        realPicturesBannerText.title = "";
                    }
                    if (realPicturesBannerText.subTitle == null) {
                        realPicturesBannerText.subTitle = "";
                    }
                    if (realPicturesBannerText.button != null) {
                        break;
                    }
                    realPicturesBannerText.button = "";
                    break;
                }
                if (iU == 10) {
                    realPicturesBannerText.title = nb5Var.s();
                } else if (iU == 18) {
                    realPicturesBannerText.subTitle = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (realPicturesBannerText.title == null) {
                            realPicturesBannerText.title = "";
                        }
                        if (realPicturesBannerText.subTitle == null) {
                            realPicturesBannerText.subTitle = "";
                        }
                        if (realPicturesBannerText.button != null) {
                            break;
                        }
                        realPicturesBannerText.button = "";
                        return realPicturesBannerText;
                    }
                    realPicturesBannerText.button = nb5Var.s();
                }
            }
            return realPicturesBannerText;
        }

        public void serialize(RealPicturesBannerText realPicturesBannerText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = realPicturesBannerText.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = realPicturesBannerText.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = realPicturesBannerText.button;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<RealPicturesBannerText> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesBannerText>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBannerText.2
        public Class getDataClass() {
            return RealPicturesBannerText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RealPicturesBannerText m15262newInstance() {
            return new RealPicturesBannerText();
        }

        public boolean parseField(RealPicturesBannerText realPicturesBannerText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    realPicturesBannerText.subTitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    realPicturesBannerText.button = jsonParser.getValueAsString();
                    return true;
                case "title":
                    realPicturesBannerText.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RealPicturesBannerText realPicturesBannerText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "button":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(realPicturesBannerText, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RealPicturesBannerText realPicturesBannerText, JsonGenerator jsonGenerator) throws IOException {
            String str = realPicturesBannerText.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = realPicturesBannerText.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = realPicturesBannerText.button;
            if (str3 != null) {
                jsonGenerator.writeStringField(Button.TYPE, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesBannerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesBannerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesBannerText new_() {
        RealPicturesBannerText realPicturesBannerText = new RealPicturesBannerText();
        realPicturesBannerText.nullCheck();
        return realPicturesBannerText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RealPicturesBannerText m15260clone() {
        RealPicturesBannerText realPicturesBannerText = new RealPicturesBannerText();
        realPicturesBannerText.title = this.title;
        realPicturesBannerText.subTitle = this.subTitle;
        realPicturesBannerText.button = this.button;
        return realPicturesBannerText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealPicturesBannerText)) {
            return false;
        }
        RealPicturesBannerText realPicturesBannerText = (RealPicturesBannerText) obj;
        return ValueObject.util_equals(this.title, realPicturesBannerText.title) && ValueObject.util_equals(this.subTitle, realPicturesBannerText.subTitle) && ValueObject.util_equals(this.button, realPicturesBannerText.button);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.button;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.button == null) {
            this.button = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
