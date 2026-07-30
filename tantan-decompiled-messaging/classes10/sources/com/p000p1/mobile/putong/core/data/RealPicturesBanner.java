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
public class RealPicturesBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesbanner";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;

    @NonNull
    @ProtobufIndex(index = 1)
    public RealPicturesBannerText text;
    public static ProtobufAdapter<RealPicturesBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesBanner>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBanner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RealPicturesBanner realPicturesBanner) {
            RealPicturesBannerText realPicturesBannerText = realPicturesBanner.text;
            int iL = realPicturesBannerText != null ? CodedOutputByteBufferNano.l(1, realPicturesBannerText, RealPicturesBannerText.PROTOBUF_ADAPTER) : 0;
            String str = realPicturesBanner.status;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) realPicturesBanner).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RealPicturesBanner m15257parse(nb5 nb5Var) throws IOException {
            RealPicturesBanner realPicturesBanner = new RealPicturesBanner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (realPicturesBanner.text == null) {
                        realPicturesBanner.text = RealPicturesBannerText.new_();
                    }
                    if (realPicturesBanner.status != null) {
                        break;
                    }
                    realPicturesBanner.status = "";
                    break;
                }
                if (iU == 10) {
                    realPicturesBanner.text = (RealPicturesBannerText) nb5Var.l(RealPicturesBannerText.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (realPicturesBanner.text == null) {
                            realPicturesBanner.text = RealPicturesBannerText.new_();
                        }
                        if (realPicturesBanner.status != null) {
                            break;
                        }
                        realPicturesBanner.status = "";
                        return realPicturesBanner;
                    }
                    realPicturesBanner.status = nb5Var.s();
                }
            }
            return realPicturesBanner;
        }

        public void serialize(RealPicturesBanner realPicturesBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RealPicturesBannerText realPicturesBannerText = realPicturesBanner.text;
            if (realPicturesBannerText != null) {
                codedOutputByteBufferNano.K(1, realPicturesBannerText, RealPicturesBannerText.PROTOBUF_ADAPTER);
            }
            String str = realPicturesBanner.status;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<RealPicturesBanner> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesBanner>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBanner.2
        public Class getDataClass() {
            return RealPicturesBanner.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RealPicturesBanner m15258newInstance() {
            return new RealPicturesBanner();
        }

        public boolean parseField(RealPicturesBanner realPicturesBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("status")) {
                realPicturesBanner.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            realPicturesBanner.text = (RealPicturesBannerText) RealPicturesBannerText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RealPicturesBanner realPicturesBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status") || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(realPicturesBanner, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RealPicturesBanner realPicturesBanner, JsonGenerator jsonGenerator) throws IOException {
            if (realPicturesBanner.text != null) {
                jsonGenerator.writeFieldName("text");
                RealPicturesBannerText.JSON_ADAPTER.serialize(realPicturesBanner.text, jsonGenerator, true);
            }
            String str = realPicturesBanner.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesBanner new_() {
        RealPicturesBanner realPicturesBanner = new RealPicturesBanner();
        realPicturesBanner.nullCheck();
        return realPicturesBanner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RealPicturesBanner m15256clone() {
        RealPicturesBanner realPicturesBanner = new RealPicturesBanner();
        RealPicturesBannerText realPicturesBannerText = this.text;
        if (realPicturesBannerText != null) {
            realPicturesBanner.text = realPicturesBannerText.m15260clone();
        }
        realPicturesBanner.status = this.status;
        return realPicturesBanner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealPicturesBanner)) {
            return false;
        }
        RealPicturesBanner realPicturesBanner = (RealPicturesBanner) obj;
        return ValueObject.util_equals(this.text, realPicturesBanner.text) && ValueObject.util_equals(this.status, realPicturesBanner.status);
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
        RealPicturesBannerText realPicturesBannerText = this.text;
        int iHashCode = (i2 + (realPicturesBannerText != null ? realPicturesBannerText.hashCode() : 0)) * 41;
        String str = this.status;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = RealPicturesBannerText.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
