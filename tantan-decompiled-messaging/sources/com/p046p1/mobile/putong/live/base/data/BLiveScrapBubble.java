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
public class BLiveScrapBubble extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapBubble> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapBubble>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapBubble.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapBubble.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapBubble newInstance() {
            return new BLiveScrapBubble();
        }

        public boolean parseField(BLiveScrapBubble bLiveScrapBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationClickAction.scheme)) {
                bLiveScrapBubble.scheme = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            bLiveScrapBubble.title = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapBubble bLiveScrapBubble, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapBubble.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveScrapBubble.scheme;
            if (str2 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrapbubble";

    @NonNull
    @ProtobufIndex(index = 2)
    public String scheme;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    public static BLiveScrapBubble new_() {
        BLiveScrapBubble bLiveScrapBubble = new BLiveScrapBubble();
        bLiveScrapBubble.nullCheck();
        return bLiveScrapBubble;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapBubble mo223809clone() {
        BLiveScrapBubble bLiveScrapBubble = new BLiveScrapBubble();
        bLiveScrapBubble.title = this.title;
        bLiveScrapBubble.scheme = this.scheme;
        return bLiveScrapBubble;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapBubble)) {
            return false;
        }
        BLiveScrapBubble bLiveScrapBubble = (BLiveScrapBubble) obj;
        return ValueObject.util_equals(this.title, bLiveScrapBubble.title) && ValueObject.util_equals(this.scheme, bLiveScrapBubble.scheme);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.scheme;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
