package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftNamingCardInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftNamingCardInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftNamingCardInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftNamingCardInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftNamingCardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftNamingCardInfo newInstance() {
            return new BLiveGiftNamingCardInfo();
        }

        public boolean parseField(BLiveGiftNamingCardInfo bLiveGiftNamingCardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("namingText")) {
                return false;
            }
            bLiveGiftNamingCardInfo.namingText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftNamingCardInfo bLiveGiftNamingCardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftNamingCardInfo.namingText;
            if (str != null) {
                jsonGenerator.writeStringField("namingText", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftNamingCardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftnamingcardinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String namingText;

    public static BLiveGiftNamingCardInfo new_() {
        BLiveGiftNamingCardInfo bLiveGiftNamingCardInfo = new BLiveGiftNamingCardInfo();
        bLiveGiftNamingCardInfo.nullCheck();
        return bLiveGiftNamingCardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftNamingCardInfo mo225055clone() {
        BLiveGiftNamingCardInfo bLiveGiftNamingCardInfo = new BLiveGiftNamingCardInfo();
        bLiveGiftNamingCardInfo.namingText = this.namingText;
        return bLiveGiftNamingCardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveGiftNamingCardInfo) {
            return ValueObject.util_equals(this.namingText, ((BLiveGiftNamingCardInfo) obj).namingText);
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
        String str = this.namingText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.namingText == null) {
            this.namingText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
