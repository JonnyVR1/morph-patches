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
public class BLiveSendStormDanmaku extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSendStormDanmaku> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSendStormDanmaku>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSendStormDanmaku.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSendStormDanmaku.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSendStormDanmaku newInstance() {
            return new BLiveSendStormDanmaku();
        }

        public boolean parseField(BLiveSendStormDanmaku bLiveSendStormDanmaku, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                bLiveSendStormDanmaku.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("defaultCommentId")) {
                return false;
            }
            bLiveSendStormDanmaku.defaultCommentId = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSendStormDanmaku bLiveSendStormDanmaku, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSendStormDanmaku.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = bLiveSendStormDanmaku.defaultCommentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("defaultCommentId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSendStormDanmaku) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesendstormdanmaku";

    @Nullable
    @ProtobufIndex(index = 2)
    public String defaultCommentId;

    @Nullable
    @ProtobufIndex(index = 1)
    public String text;

    public static BLiveSendStormDanmaku new_() {
        BLiveSendStormDanmaku bLiveSendStormDanmaku = new BLiveSendStormDanmaku();
        bLiveSendStormDanmaku.nullCheck();
        return bLiveSendStormDanmaku;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSendStormDanmaku mo225055clone() {
        BLiveSendStormDanmaku bLiveSendStormDanmaku = new BLiveSendStormDanmaku();
        bLiveSendStormDanmaku.text = this.text;
        bLiveSendStormDanmaku.defaultCommentId = this.defaultCommentId;
        return bLiveSendStormDanmaku;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSendStormDanmaku)) {
            return false;
        }
        BLiveSendStormDanmaku bLiveSendStormDanmaku = (BLiveSendStormDanmaku) obj;
        return ValueObject.util_equals(this.text, bLiveSendStormDanmaku.text) && ValueObject.util_equals(this.defaultCommentId, bLiveSendStormDanmaku.defaultCommentId);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.defaultCommentId;
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
