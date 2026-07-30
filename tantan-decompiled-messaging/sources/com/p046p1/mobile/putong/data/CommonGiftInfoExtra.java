package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class CommonGiftInfoExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commongiftinfoextra";

    @Nullable
    public StickerURL stickerURL;
    public static ProtobufAdapter<CommonGiftInfoExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonGiftInfoExtra>() { // from class: com.p1.mobile.putong.data.CommonGiftInfoExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommonGiftInfoExtra parse(nb5 nb5Var) throws IOException {
            CommonGiftInfoExtra commonGiftInfoExtra = new CommonGiftInfoExtra();
            nb5Var.m158752u();
            return commonGiftInfoExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommonGiftInfoExtra commonGiftInfoExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommonGiftInfoExtra commonGiftInfoExtra) {
            commonGiftInfoExtra.cachedSize = 0;
            return 0;
        }
    };
    public static JsonAdapter<CommonGiftInfoExtra> JSON_ADAPTER = new ObjectJsonAdapter<CommonGiftInfoExtra>() { // from class: com.p1.mobile.putong.data.CommonGiftInfoExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommonGiftInfoExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommonGiftInfoExtra newInstance() {
            return new CommonGiftInfoExtra();
        }

        public boolean parseField(CommonGiftInfoExtra commonGiftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("stickerURL")) {
                return false;
            }
            commonGiftInfoExtra.stickerURL = StickerURL.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CommonGiftInfoExtra commonGiftInfoExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("stickerURL")) {
                return true;
            }
            return super.parseFieldCheck(commonGiftInfoExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonGiftInfoExtra commonGiftInfoExtra, JsonGenerator jsonGenerator) throws IOException {
            if (commonGiftInfoExtra.stickerURL != null) {
                jsonGenerator.writeFieldName("stickerURL");
                StickerURL.JSON_ADAPTER.serialize(commonGiftInfoExtra.stickerURL, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonGiftInfoExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonGiftInfoExtra new_() {
        CommonGiftInfoExtra commonGiftInfoExtra = new CommonGiftInfoExtra();
        commonGiftInfoExtra.nullCheck();
        return commonGiftInfoExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommonGiftInfoExtra mo223809clone() {
        CommonGiftInfoExtra commonGiftInfoExtra = new CommonGiftInfoExtra();
        StickerURL stickerURL = this.stickerURL;
        if (stickerURL != null) {
            commonGiftInfoExtra.stickerURL = stickerURL.mo223809clone();
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
        StickerURL stickerURL = this.stickerURL;
        int iHashCode = i2 + (stickerURL != null ? stickerURL.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
