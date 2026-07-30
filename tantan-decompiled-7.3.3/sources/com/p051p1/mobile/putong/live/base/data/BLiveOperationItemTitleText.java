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
public class BLiveOperationItemTitleText extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemTitleText> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemTitleText>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemTitleText.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemTitleText.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemTitleText newInstance() {
            return new BLiveOperationItemTitleText();
        }

        public boolean parseField(BLiveOperationItemTitleText bLiveOperationItemTitleText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showRules")) {
                bLiveOperationItemTitleText.showRules = BLiveOperationItemTitleTextRules.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("content")) {
                return false;
            }
            bLiveOperationItemTitleText.content = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemTitleText bLiveOperationItemTitleText, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItemTitleText.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            if (bLiveOperationItemTitleText.showRules != null) {
                jsonGenerator.writeFieldName("showRules");
                BLiveOperationItemTitleTextRules.JSON_ADAPTER.serialize(bLiveOperationItemTitleText.showRules, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemTitleText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitemtitletext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOperationItemTitleTextRules showRules;

    public static BLiveOperationItemTitleText new_() {
        BLiveOperationItemTitleText bLiveOperationItemTitleText = new BLiveOperationItemTitleText();
        bLiveOperationItemTitleText.nullCheck();
        return bLiveOperationItemTitleText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemTitleText mo225055clone() {
        BLiveOperationItemTitleText bLiveOperationItemTitleText = new BLiveOperationItemTitleText();
        bLiveOperationItemTitleText.content = this.content;
        BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules = this.showRules;
        if (bLiveOperationItemTitleTextRules != null) {
            bLiveOperationItemTitleText.showRules = bLiveOperationItemTitleTextRules.mo225055clone();
        }
        return bLiveOperationItemTitleText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemTitleText)) {
            return false;
        }
        BLiveOperationItemTitleText bLiveOperationItemTitleText = (BLiveOperationItemTitleText) obj;
        return ValueObject.util_equals(this.content, bLiveOperationItemTitleText.content) && ValueObject.util_equals(this.showRules, bLiveOperationItemTitleText.showRules);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOperationItemTitleTextRules bLiveOperationItemTitleTextRules = this.showRules;
        int iHashCode2 = iHashCode + (bLiveOperationItemTitleTextRules != null ? bLiveOperationItemTitleTextRules.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.showRules == null) {
            this.showRules = BLiveOperationItemTitleTextRules.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
