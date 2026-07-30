package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveGiftExtraTopChatInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraTopChatInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraTopChatInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraTopChatInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraTopChatInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraTopChatInfo newInstance() {
            return new BLiveGiftExtraTopChatInfo();
        }

        public boolean parseField(BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("topChatText")) {
                return false;
            }
            bLiveGiftExtraTopChatInfo.topChatText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraTopChatInfo.topChatText;
            if (str != null) {
                jsonGenerator.writeStringField("topChatText", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraTopChatInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextratopchatinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String topChatText;

    public static BLiveGiftExtraTopChatInfo new_() {
        BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfo = new BLiveGiftExtraTopChatInfo();
        bLiveGiftExtraTopChatInfo.nullCheck();
        return bLiveGiftExtraTopChatInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraTopChatInfo mo223809clone() {
        BLiveGiftExtraTopChatInfo bLiveGiftExtraTopChatInfo = new BLiveGiftExtraTopChatInfo();
        bLiveGiftExtraTopChatInfo.topChatText = this.topChatText;
        return bLiveGiftExtraTopChatInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveGiftExtraTopChatInfo) {
            return ValueObject.util_equals(this.topChatText, ((BLiveGiftExtraTopChatInfo) obj).topChatText);
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
        String str = this.topChatText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topChatText == null) {
            this.topChatText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
