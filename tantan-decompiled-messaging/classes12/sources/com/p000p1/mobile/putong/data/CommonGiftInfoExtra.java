package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CommonGiftInfoExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commongiftinfoextra";

    @Nullable
    public StickerURL stickerURL;
    public static ProtobufAdapter<CommonGiftInfoExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonGiftInfoExtra>() { // from class: com.p1.mobile.putong.data.CommonGiftInfoExtra.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommonGiftInfoExtra m17836parse(nb5 nb5Var) throws IOException {
            CommonGiftInfoExtra commonGiftInfoExtra = new CommonGiftInfoExtra();
            nb5Var.u();
            return commonGiftInfoExtra;
        }

        public void serialize(CommonGiftInfoExtra commonGiftInfoExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        public int computeAndCacheSize(CommonGiftInfoExtra commonGiftInfoExtra) {
            ((MessageNano) commonGiftInfoExtra).cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<CommonGiftInfoExtra> JSON_ADAPTER = new ObjectJsonAdapter<CommonGiftInfoExtra>() { // from class: com.p1.mobile.putong.data.CommonGiftInfoExtra.2
        public Class getDataClass() {
            return CommonGiftInfoExtra.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CommonGiftInfoExtra mo17830newInstance() {
            return new CommonGiftInfoExtra();
        }

        public boolean parseField(CommonGiftInfoExtra commonGiftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("stickerURL")) {
                return false;
            }
            commonGiftInfoExtra.stickerURL = (StickerURL) StickerURL.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CommonGiftInfoExtra commonGiftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("stickerURL")) {
                return true;
            }
            return super.parseFieldCheck(commonGiftInfoExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonGiftInfoExtra commonGiftInfoExtra, JsonGenerator jsonGenerator) throws IOException {
            if (commonGiftInfoExtra.stickerURL != null) {
                jsonGenerator.writeFieldName("stickerURL");
                StickerURL.JSON_ADAPTER.serialize(commonGiftInfoExtra.stickerURL, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonGiftInfoExtra new_() {
        CommonGiftInfoExtra commonGiftInfoExtra = new CommonGiftInfoExtra();
        commonGiftInfoExtra.nullCheck();
        return commonGiftInfoExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommonGiftInfoExtra m17835clone() {
        CommonGiftInfoExtra commonGiftInfoExtra = new CommonGiftInfoExtra();
        StickerURL stickerURL = this.stickerURL;
        if (stickerURL != null) {
            commonGiftInfoExtra.stickerURL = stickerURL.m19030clone();
        }
        return commonGiftInfoExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommonGiftInfoExtra) {
            return ValueObject.util_equals(this.stickerURL, ((CommonGiftInfoExtra) obj).stickerURL);
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
        StickerURL stickerURL = this.stickerURL;
        int iHashCode = i2 + (stickerURL != null ? stickerURL.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
