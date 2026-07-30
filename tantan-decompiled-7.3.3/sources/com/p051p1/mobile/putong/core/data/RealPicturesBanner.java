package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class RealPicturesBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesbanner";

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @NonNull
    @ProtobufIndex(index = 1)
    public RealPicturesBannerText text;
    public static ProtobufAdapter<RealPicturesBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesBanner>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBanner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RealPicturesBanner realPicturesBanner) {
            RealPicturesBannerText realPicturesBannerText = realPicturesBanner.text;
            int iM17285l = realPicturesBannerText != null ? CodedOutputByteBufferNano.m17285l(1, realPicturesBannerText, RealPicturesBannerText.PROTOBUF_ADAPTER) : 0;
            String str = realPicturesBanner.status;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            realPicturesBanner.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealPicturesBanner parse(nc5 nc5Var) throws IOException {
            RealPicturesBanner realPicturesBanner = new RealPicturesBanner();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (realPicturesBanner.text == null) {
                        realPicturesBanner.text = RealPicturesBannerText.new_();
                    }
                    if (realPicturesBanner.status != null) {
                        break;
                    }
                    realPicturesBanner.status = "";
                    break;
                }
                if (iM162497u == 10) {
                    realPicturesBanner.text = (RealPicturesBannerText) nc5Var.m162488l(RealPicturesBannerText.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (realPicturesBanner.text == null) {
                            realPicturesBanner.text = RealPicturesBannerText.new_();
                        }
                        if (realPicturesBanner.status != null) {
                            break;
                        }
                        realPicturesBanner.status = "";
                        return realPicturesBanner;
                    }
                    realPicturesBanner.status = nc5Var.m162495s();
                }
            }
            return realPicturesBanner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealPicturesBanner realPicturesBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RealPicturesBannerText realPicturesBannerText = realPicturesBanner.text;
            if (realPicturesBannerText != null) {
                codedOutputByteBufferNano.m17309K(1, realPicturesBannerText, RealPicturesBannerText.PROTOBUF_ADAPTER);
            }
            String str = realPicturesBanner.status;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<RealPicturesBanner> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesBanner>() { // from class: com.p1.mobile.putong.core.data.RealPicturesBanner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealPicturesBanner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RealPicturesBanner newInstance() {
            return new RealPicturesBanner();
        }

        public boolean parseField(RealPicturesBanner realPicturesBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                realPicturesBanner.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            realPicturesBanner.text = RealPicturesBannerText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RealPicturesBanner realPicturesBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS) || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(realPicturesBanner, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RealPicturesBanner realPicturesBanner, JsonGenerator jsonGenerator) throws IOException {
            if (realPicturesBanner.text != null) {
                jsonGenerator.writeFieldName("text");
                RealPicturesBannerText.JSON_ADAPTER.serialize(realPicturesBanner.text, jsonGenerator, true);
            }
            String str = realPicturesBanner.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesBanner new_() {
        RealPicturesBanner realPicturesBanner = new RealPicturesBanner();
        realPicturesBanner.nullCheck();
        return realPicturesBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RealPicturesBanner mo225055clone() {
        RealPicturesBanner realPicturesBanner = new RealPicturesBanner();
        RealPicturesBannerText realPicturesBannerText = this.text;
        if (realPicturesBannerText != null) {
            realPicturesBanner.text = realPicturesBannerText.mo225055clone();
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
        RealPicturesBannerText realPicturesBannerText = this.text;
        int iHashCode = (i2 + (realPicturesBannerText != null ? realPicturesBannerText.hashCode() : 0)) * 41;
        String str = this.status;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = RealPicturesBannerText.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
