package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveChatBox extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatBox> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatBox>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatBox.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatBox.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatBox newInstance() {
            return new BLiveChatBox();
        }

        public boolean parseField(BLiveChatBox bLiveChatBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("borderColor")) {
                bLiveChatBox.borderColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("content")) {
                return false;
            }
            bLiveChatBox.content = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatBox bLiveChatBox, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveChatBox.content != null) {
                jsonGenerator.writeFieldName("content");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveChatBox.content, jsonGenerator, true);
            }
            String str = bLiveChatBox.borderColor;
            if (str != null) {
                jsonGenerator.writeStringField("borderColor", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatbox";

    @Nullable
    @ProtobufIndex(index = 2)
    public String borderColor;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveCommonViewConfig content;

    public static BLiveChatBox new_() {
        BLiveChatBox bLiveChatBox = new BLiveChatBox();
        bLiveChatBox.nullCheck();
        return bLiveChatBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatBox mo225055clone() {
        BLiveChatBox bLiveChatBox = new BLiveChatBox();
        BLiveCommonViewConfig bLiveCommonViewConfig = this.content;
        if (bLiveCommonViewConfig != null) {
            bLiveChatBox.content = bLiveCommonViewConfig.mo225055clone();
        }
        bLiveChatBox.borderColor = this.borderColor;
        return bLiveChatBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatBox)) {
            return false;
        }
        BLiveChatBox bLiveChatBox = (BLiveChatBox) obj;
        return ValueObject.util_equals(this.content, bLiveChatBox.content) && ValueObject.util_equals(this.borderColor, bLiveChatBox.borderColor);
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
        BLiveCommonViewConfig bLiveCommonViewConfig = this.content;
        int iHashCode = (i2 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0)) * 41;
        String str = this.borderColor;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
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
