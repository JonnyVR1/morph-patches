package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLivePictureUrl extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePictureUrl> JSON_ADAPTER = new ObjectJsonAdapter<BLivePictureUrl>() { // from class: com.p1.mobile.putong.live.base.data.BLivePictureUrl.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePictureUrl.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePictureUrl newInstance() {
            return new BLivePictureUrl();
        }

        public boolean parseField(BLivePictureUrl bLivePictureUrl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("normal")) {
                bLivePictureUrl.normal = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("small")) {
                return false;
            }
            bLivePictureUrl.small = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePictureUrl bLivePictureUrl, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePictureUrl.normal;
            if (str != null) {
                jsonGenerator.writeStringField("normal", str);
            }
            String str2 = bLivePictureUrl.small;
            if (str2 != null) {
                jsonGenerator.writeStringField("small", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePictureUrl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepictureurl";

    @Nullable
    @ProtobufIndex(index = 1)
    public String normal;

    @Nullable
    @ProtobufIndex(index = 2)
    public String small;

    public static BLivePictureUrl new_() {
        BLivePictureUrl bLivePictureUrl = new BLivePictureUrl();
        bLivePictureUrl.nullCheck();
        return bLivePictureUrl;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePictureUrl mo223809clone() {
        BLivePictureUrl bLivePictureUrl = new BLivePictureUrl();
        bLivePictureUrl.normal = this.normal;
        bLivePictureUrl.small = this.small;
        return bLivePictureUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePictureUrl)) {
            return false;
        }
        BLivePictureUrl bLivePictureUrl = (BLivePictureUrl) obj;
        return ValueObject.util_equals(this.normal, bLivePictureUrl.normal) && ValueObject.util_equals(this.small, bLivePictureUrl.small);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Nullable
    public String getOptionUrl() {
        return !TextUtils.isEmpty(this.normal) ? this.normal : this.small;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.normal;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.small;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
