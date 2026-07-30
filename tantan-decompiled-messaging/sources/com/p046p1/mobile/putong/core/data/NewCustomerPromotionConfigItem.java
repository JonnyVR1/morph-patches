package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class NewCustomerPromotionConfigItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newcustomerpromotionconfigitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String label;

    @NonNull
    @ProtobufIndex(index = 2)
    public String unitText;
    public static ProtobufAdapter<NewCustomerPromotionConfigItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewCustomerPromotionConfigItem>() { // from class: com.p1.mobile.putong.core.data.NewCustomerPromotionConfigItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem) {
            String str = newCustomerPromotionConfigItem.label;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = newCustomerPromotionConfigItem.unitText;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            newCustomerPromotionConfigItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewCustomerPromotionConfigItem parse(nb5 nb5Var) throws IOException {
            NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = new NewCustomerPromotionConfigItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (newCustomerPromotionConfigItem.label == null) {
                        newCustomerPromotionConfigItem.label = "";
                    }
                    if (newCustomerPromotionConfigItem.unitText != null) {
                        break;
                    }
                    newCustomerPromotionConfigItem.unitText = "";
                    break;
                }
                if (iM158752u == 10) {
                    newCustomerPromotionConfigItem.label = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (newCustomerPromotionConfigItem.label == null) {
                            newCustomerPromotionConfigItem.label = "";
                        }
                        if (newCustomerPromotionConfigItem.unitText != null) {
                            break;
                        }
                        newCustomerPromotionConfigItem.unitText = "";
                        return newCustomerPromotionConfigItem;
                    }
                    newCustomerPromotionConfigItem.unitText = nb5Var.m158750s();
                }
            }
            return newCustomerPromotionConfigItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newCustomerPromotionConfigItem.label;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = newCustomerPromotionConfigItem.unitText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<NewCustomerPromotionConfigItem> JSON_ADAPTER = new ObjectJsonAdapter<NewCustomerPromotionConfigItem>() { // from class: com.p1.mobile.putong.core.data.NewCustomerPromotionConfigItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewCustomerPromotionConfigItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewCustomerPromotionConfigItem newInstance() {
            return new NewCustomerPromotionConfigItem();
        }

        public boolean parseField(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("selectedTagText")) {
                newCustomerPromotionConfigItem.label = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("selectedUnitPurchaseText")) {
                return false;
            }
            newCustomerPromotionConfigItem.unitText = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("selectedTagText") || str.equals("selectedUnitPurchaseText")) {
                return true;
            }
            return super.parseFieldCheck(newCustomerPromotionConfigItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem, JsonGenerator jsonGenerator) throws IOException {
            String str = newCustomerPromotionConfigItem.label;
            if (str != null) {
                jsonGenerator.writeStringField("selectedTagText", str);
            }
            String str2 = newCustomerPromotionConfigItem.unitText;
            if (str2 != null) {
                jsonGenerator.writeStringField("selectedUnitPurchaseText", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewCustomerPromotionConfigItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewCustomerPromotionConfigItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewCustomerPromotionConfigItem new_() {
        NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = new NewCustomerPromotionConfigItem();
        newCustomerPromotionConfigItem.nullCheck();
        return newCustomerPromotionConfigItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewCustomerPromotionConfigItem mo223809clone() {
        NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = new NewCustomerPromotionConfigItem();
        newCustomerPromotionConfigItem.label = this.label;
        newCustomerPromotionConfigItem.unitText = this.unitText;
        return newCustomerPromotionConfigItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewCustomerPromotionConfigItem)) {
            return false;
        }
        NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = (NewCustomerPromotionConfigItem) obj;
        return ValueObject.util_equals(this.label, newCustomerPromotionConfigItem.label) && ValueObject.util_equals(this.unitText, newCustomerPromotionConfigItem.unitText);
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
        String str = this.label;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.unitText;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.label == null) {
            this.label = "";
        }
        if (this.unitText == null) {
            this.unitText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
