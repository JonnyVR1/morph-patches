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
public class BLiveGiftSkinTop extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSkinTop> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSkinTop>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSkinTop.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSkinTop.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSkinTop newInstance() {
            return new BLiveGiftSkinTop();
        }

        public boolean parseField(BLiveGiftSkinTop bLiveGiftSkinTop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    bLiveGiftSkinTop.schema = jsonParser.getValueAsString();
                    return true;
                case "url":
                    bLiveGiftSkinTop.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveGiftSkinTop.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSkinTop bLiveGiftSkinTop, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftSkinTop.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveGiftSkinTop.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = bLiveGiftSkinTop.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField("schema", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSkinTop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftskintop";

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    public static BLiveGiftSkinTop new_() {
        BLiveGiftSkinTop bLiveGiftSkinTop = new BLiveGiftSkinTop();
        bLiveGiftSkinTop.nullCheck();
        return bLiveGiftSkinTop;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSkinTop mo223809clone() {
        BLiveGiftSkinTop bLiveGiftSkinTop = new BLiveGiftSkinTop();
        bLiveGiftSkinTop.type = this.type;
        bLiveGiftSkinTop.url = this.url;
        bLiveGiftSkinTop.schema = this.schema;
        return bLiveGiftSkinTop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftSkinTop)) {
            return false;
        }
        BLiveGiftSkinTop bLiveGiftSkinTop = (BLiveGiftSkinTop) obj;
        return ValueObject.util_equals(this.type, bLiveGiftSkinTop.type) && ValueObject.util_equals(this.url, bLiveGiftSkinTop.url) && ValueObject.util_equals(this.schema, bLiveGiftSkinTop.schema);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
