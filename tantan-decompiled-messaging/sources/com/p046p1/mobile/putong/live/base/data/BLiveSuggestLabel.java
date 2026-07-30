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
public class BLiveSuggestLabel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSuggestLabel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSuggestLabel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSuggestLabel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSuggestLabel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSuggestLabel newInstance() {
            return new BLiveSuggestLabel();
        }

        public boolean parseField(BLiveSuggestLabel bLiveSuggestLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveSuggestLabel.f44449id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveSuggestLabel.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    bLiveSuggestLabel.value = jsonParser.getValueAsString();
                    return true;
                case "templateId":
                    bLiveSuggestLabel.templateId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSuggestLabel bLiveSuggestLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSuggestLabel.f44449id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSuggestLabel.templateId;
            if (str2 != null) {
                jsonGenerator.writeStringField("templateId", str2);
            }
            String str3 = bLiveSuggestLabel.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            String str4 = bLiveSuggestLabel.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSuggestLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesuggestlabel";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44449id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String templateId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;

    public static BLiveSuggestLabel new_() {
        BLiveSuggestLabel bLiveSuggestLabel = new BLiveSuggestLabel();
        bLiveSuggestLabel.nullCheck();
        return bLiveSuggestLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSuggestLabel mo223809clone() {
        BLiveSuggestLabel bLiveSuggestLabel = new BLiveSuggestLabel();
        bLiveSuggestLabel.f44449id = this.f44449id;
        bLiveSuggestLabel.templateId = this.templateId;
        bLiveSuggestLabel.value = this.value;
        bLiveSuggestLabel.type = this.type;
        return bLiveSuggestLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSuggestLabel)) {
            return false;
        }
        BLiveSuggestLabel bLiveSuggestLabel = (BLiveSuggestLabel) obj;
        return ValueObject.util_equals(this.f44449id, bLiveSuggestLabel.f44449id) && ValueObject.util_equals(this.templateId, bLiveSuggestLabel.templateId) && ValueObject.util_equals(this.value, bLiveSuggestLabel.value) && ValueObject.util_equals(this.type, bLiveSuggestLabel.type);
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
        String str = this.f44449id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.templateId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44449id == null) {
            this.f44449id = "";
        }
        if (this.templateId == null) {
            this.templateId = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
