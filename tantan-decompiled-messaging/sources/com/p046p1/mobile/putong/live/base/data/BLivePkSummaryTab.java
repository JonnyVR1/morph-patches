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
public class BLivePkSummaryTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkSummaryTab> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkSummaryTab>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkSummaryTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkSummaryTab.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkSummaryTab newInstance() {
            return new BLivePkSummaryTab();
        }

        public boolean parseField(BLivePkSummaryTab bLivePkSummaryTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("type")) {
                return false;
            }
            bLivePkSummaryTab.type = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkSummaryTab bLivePkSummaryTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkSummaryTab.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkSummaryTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepksummarytab";

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLivePkSummaryTab new_() {
        BLivePkSummaryTab bLivePkSummaryTab = new BLivePkSummaryTab();
        bLivePkSummaryTab.nullCheck();
        return bLivePkSummaryTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkSummaryTab mo223809clone() {
        BLivePkSummaryTab bLivePkSummaryTab = new BLivePkSummaryTab();
        bLivePkSummaryTab.type = this.type;
        return bLivePkSummaryTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLivePkSummaryTab) {
            return ValueObject.util_equals(this.type, ((BLivePkSummaryTab) obj).type);
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
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
