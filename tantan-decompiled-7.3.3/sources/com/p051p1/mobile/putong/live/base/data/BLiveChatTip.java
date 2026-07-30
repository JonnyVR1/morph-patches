package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveChatTip extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatTip> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatTip>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatTip.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatTip.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatTip newInstance() {
            return new BLiveChatTip();
        }

        public boolean parseField(BLiveChatTip bLiveChatTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tips":
                    bLiveChatTip.tips = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveChatTip.title = jsonParser.getValueAsString();
                    return true;
                case "isDefault":
                    bLiveChatTip.isDefault = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatTip bLiveChatTip, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveChatTip.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeBooleanField("isDefault", bLiveChatTip.isDefault);
            if (bLiveChatTip.tips != null) {
                jsonGenerator.writeFieldName("tips");
                JsonAdapter.serializeArray(bLiveChatTip.tips, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechattip";

    @ProtobufIndex(index = 2)
    public boolean isDefault;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> tips;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68929a(String str) {
        return str;
    }

    public static BLiveChatTip new_() {
        BLiveChatTip bLiveChatTip = new BLiveChatTip();
        bLiveChatTip.nullCheck();
        return bLiveChatTip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatTip mo225055clone() {
        BLiveChatTip bLiveChatTip = new BLiveChatTip();
        bLiveChatTip.title = this.title;
        bLiveChatTip.isDefault = this.isDefault;
        List<String> list = this.tips;
        if (list != null) {
            bLiveChatTip.tips = ValueObject.util_map(list, new qcj() { // from class: l.ss1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveChatTip.m68929a((String) obj);
                }
            });
        }
        return bLiveChatTip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatTip)) {
            return false;
        }
        BLiveChatTip bLiveChatTip = (BLiveChatTip) obj;
        return ValueObject.util_equals(this.title, bLiveChatTip.title) && this.isDefault == bLiveChatTip.isDefault && ValueObject.util_equals(this.tips, bLiveChatTip.tips);
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
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isDefault ? 1231 : 1237)) * 41;
        List<String> list = this.tips;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.tips == null) {
            this.tips = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
