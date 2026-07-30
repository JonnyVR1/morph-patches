package com.p000p1.mobile.putong.account.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CaptchaImage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "captchaimage";

    @NonNull
    @ProtobufIndex(index = 1)
    public CaptchaChars chars;
    public static ProtobufAdapter<CaptchaImage> PROTOBUF_ADAPTER = new MessageNanoAdapter<CaptchaImage>() { // from class: com.p1.mobile.putong.account.data.CaptchaImage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CaptchaImage captchaImage) {
            CaptchaChars captchaChars = captchaImage.chars;
            int iL = captchaChars != null ? CodedOutputByteBufferNano.l(1, captchaChars, CaptchaChars.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) captchaImage).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CaptchaImage m28919parse(nb5 nb5Var) throws IOException {
            CaptchaImage captchaImage = new CaptchaImage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (captchaImage.chars != null) {
                        break;
                    }
                    captchaImage.chars = CaptchaChars.new_();
                    break;
                }
                if (iU != 10) {
                    if (captchaImage.chars != null) {
                        break;
                    }
                    captchaImage.chars = CaptchaChars.new_();
                    return captchaImage;
                }
                captchaImage.chars = (CaptchaChars) nb5Var.l(CaptchaChars.PROTOBUF_ADAPTER);
            }
            return captchaImage;
        }

        public void serialize(CaptchaImage captchaImage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CaptchaChars captchaChars = captchaImage.chars;
            if (captchaChars != null) {
                codedOutputByteBufferNano.K(1, captchaChars, CaptchaChars.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CaptchaImage> JSON_ADAPTER = new ObjectJsonAdapter<CaptchaImage>() { // from class: com.p1.mobile.putong.account.data.CaptchaImage.2
        public Class getDataClass() {
            return CaptchaImage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CaptchaImage m28920newInstance() {
            return new CaptchaImage();
        }

        public boolean parseField(CaptchaImage captchaImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("chars")) {
                return false;
            }
            captchaImage.chars = (CaptchaChars) CaptchaChars.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CaptchaImage captchaImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("chars")) {
                return true;
            }
            return super.parseFieldCheck(captchaImage, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CaptchaImage captchaImage, JsonGenerator jsonGenerator) throws IOException {
            if (captchaImage.chars != null) {
                jsonGenerator.writeFieldName("chars");
                CaptchaChars.JSON_ADAPTER.serialize(captchaImage.chars, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CaptchaImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CaptchaImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CaptchaImage new_() {
        CaptchaImage captchaImage = new CaptchaImage();
        captchaImage.nullCheck();
        return captchaImage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CaptchaImage m28918clone() {
        CaptchaImage captchaImage = new CaptchaImage();
        CaptchaChars captchaChars = this.chars;
        if (captchaChars != null) {
            captchaImage.chars = captchaChars.m28910clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        CaptchaChars captchaChars = this.chars;
        int iHashCode = i2 + (captchaChars != null ? captchaChars.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.chars == null) {
            this.chars = CaptchaChars.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
