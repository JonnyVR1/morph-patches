package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewCustomerPromotionConfigItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newcustomerpromotionconfigitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String label;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String unitText;
    public static ProtobufAdapter<NewCustomerPromotionConfigItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewCustomerPromotionConfigItem>() { // from class: com.p1.mobile.putong.core.data.NewCustomerPromotionConfigItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem) {
            String str = newCustomerPromotionConfigItem.label;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = newCustomerPromotionConfigItem.unitText;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) newCustomerPromotionConfigItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewCustomerPromotionConfigItem m14499parse(nb5 nb5Var) throws IOException {
            NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = new NewCustomerPromotionConfigItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newCustomerPromotionConfigItem.label == null) {
                        newCustomerPromotionConfigItem.label = "";
                    }
                    if (newCustomerPromotionConfigItem.unitText != null) {
                        break;
                    }
                    newCustomerPromotionConfigItem.unitText = "";
                    break;
                }
                if (iU == 10) {
                    newCustomerPromotionConfigItem.label = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (newCustomerPromotionConfigItem.label == null) {
                            newCustomerPromotionConfigItem.label = "";
                        }
                        if (newCustomerPromotionConfigItem.unitText != null) {
                            break;
                        }
                        newCustomerPromotionConfigItem.unitText = "";
                        return newCustomerPromotionConfigItem;
                    }
                    newCustomerPromotionConfigItem.unitText = nb5Var.s();
                }
            }
            return newCustomerPromotionConfigItem;
        }

        public void serialize(NewCustomerPromotionConfigItem newCustomerPromotionConfigItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = newCustomerPromotionConfigItem.label;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = newCustomerPromotionConfigItem.unitText;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<NewCustomerPromotionConfigItem> JSON_ADAPTER = new ObjectJsonAdapter<NewCustomerPromotionConfigItem>() { // from class: com.p1.mobile.putong.core.data.NewCustomerPromotionConfigItem.2
        public Class getDataClass() {
            return NewCustomerPromotionConfigItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewCustomerPromotionConfigItem m14500newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewCustomerPromotionConfigItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewCustomerPromotionConfigItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewCustomerPromotionConfigItem new_() {
        NewCustomerPromotionConfigItem newCustomerPromotionConfigItem = new NewCustomerPromotionConfigItem();
        newCustomerPromotionConfigItem.nullCheck();
        return newCustomerPromotionConfigItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewCustomerPromotionConfigItem m14498clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.label;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.unitText;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.label == null) {
            this.label = "";
        }
        if (this.unitText == null) {
            this.unitText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
