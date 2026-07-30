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
public class RealPicturesBannerText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesbannertext";

    @NonNull
    @ProtobufIndex(index = 3)
    public String button;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<RealPicturesBannerText> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesBannerText>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBannerText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RealPicturesBannerText realPicturesBannerText) {
            String str = realPicturesBannerText.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = realPicturesBannerText.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = realPicturesBannerText.button;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            realPicturesBannerText.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealPicturesBannerText parse(nb5 nb5Var) throws IOException {
            RealPicturesBannerText realPicturesBannerText = new RealPicturesBannerText();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    realPicturesBannerText.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    realPicturesBannerText.subTitle = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
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
                    realPicturesBannerText.button = nb5Var.m158750s();
                }
            }
            return realPicturesBannerText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealPicturesBannerText realPicturesBannerText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = realPicturesBannerText.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = realPicturesBannerText.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = realPicturesBannerText.button;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<RealPicturesBannerText> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesBannerText>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBannerText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealPicturesBannerText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RealPicturesBannerText newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RealPicturesBannerText realPicturesBannerText, JsonGenerator jsonGenerator) throws IOException {
            String str = realPicturesBannerText.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = realPicturesBannerText.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = realPicturesBannerText.button;
            if (str3 != null) {
                jsonGenerator.writeStringField("button", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesBannerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesBannerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesBannerText new_() {
        RealPicturesBannerText realPicturesBannerText = new RealPicturesBannerText();
        realPicturesBannerText.nullCheck();
        return realPicturesBannerText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RealPicturesBannerText mo223809clone() {
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.button;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
