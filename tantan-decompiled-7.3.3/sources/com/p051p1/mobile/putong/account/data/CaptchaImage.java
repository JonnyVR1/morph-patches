package com.p051p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes9.dex */
public class CaptchaImage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "captchaimage";

    @NonNull
    @ProtobufIndex(index = 1)
    public CaptchaChars chars;
    public static ProtobufAdapter<CaptchaImage> PROTOBUF_ADAPTER = new MessageNanoAdapter<CaptchaImage>() { // from class: com.p1.mobile.putong.account.data.CaptchaImage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CaptchaImage captchaImage) {
            CaptchaChars captchaChars = captchaImage.chars;
            int iM17285l = captchaChars != null ? CodedOutputByteBufferNano.m17285l(1, captchaChars, CaptchaChars.PROTOBUF_ADAPTER) : 0;
            captchaImage.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CaptchaImage parse(nc5 nc5Var) throws IOException {
            CaptchaImage captchaImage = new CaptchaImage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (captchaImage.chars != null) {
                        break;
                    }
                    captchaImage.chars = CaptchaChars.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (captchaImage.chars != null) {
                        break;
                    }
                    captchaImage.chars = CaptchaChars.new_();
                    return captchaImage;
                }
                captchaImage.chars = (CaptchaChars) nc5Var.m162488l(CaptchaChars.PROTOBUF_ADAPTER);
            }
            return captchaImage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CaptchaImage captchaImage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CaptchaChars captchaChars = captchaImage.chars;
            if (captchaChars != null) {
                codedOutputByteBufferNano.m17309K(1, captchaChars, CaptchaChars.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CaptchaImage> JSON_ADAPTER = new ObjectJsonAdapter<CaptchaImage>() { // from class: com.p1.mobile.putong.account.data.CaptchaImage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CaptchaImage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CaptchaImage newInstance() {
            return new CaptchaImage();
        }

        public boolean parseField(CaptchaImage captchaImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("chars")) {
                return false;
            }
            captchaImage.chars = CaptchaChars.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CaptchaImage captchaImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("chars")) {
                return true;
            }
            return super.parseFieldCheck(captchaImage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CaptchaImage captchaImage, JsonGenerator jsonGenerator) throws IOException {
            if (captchaImage.chars != null) {
                jsonGenerator.writeFieldName("chars");
                CaptchaChars.JSON_ADAPTER.serialize(captchaImage.chars, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CaptchaImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CaptchaImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CaptchaImage new_() {
        CaptchaImage captchaImage = new CaptchaImage();
        captchaImage.nullCheck();
        return captchaImage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CaptchaImage mo225055clone() {
        CaptchaImage captchaImage = new CaptchaImage();
        CaptchaChars captchaChars = this.chars;
        if (captchaChars != null) {
            captchaImage.chars = captchaChars.mo225055clone();
        }
        return captchaImage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CaptchaImage) {
            return ValueObject.util_equals(this.chars, ((CaptchaImage) obj).chars);
        }
        return false;
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
        CaptchaChars captchaChars = this.chars;
        int iHashCode = i2 + (captchaChars != null ? captchaChars.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.chars == null) {
            this.chars = CaptchaChars.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
