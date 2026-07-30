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
public class NavigationTriggerDialog extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "navigationtriggerdialog";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProductCategory defaultCategory;
    public static ProtobufAdapter<NavigationTriggerDialog> PROTOBUF_ADAPTER = new MessageNanoAdapter<NavigationTriggerDialog>() { // from class: com.p1.mobile.putong.core.data.NavigationTriggerDialog.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NavigationTriggerDialog navigationTriggerDialog) {
            ProductCategory productCategory = navigationTriggerDialog.defaultCategory;
            int iM17230l = productCategory != null ? CodedOutputByteBufferNano.m17230l(1, productCategory, ProductCategory.PROTOBUF_ADAPTER) : 0;
            navigationTriggerDialog.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NavigationTriggerDialog parse(nb5 nb5Var) throws IOException {
            NavigationTriggerDialog navigationTriggerDialog = new NavigationTriggerDialog();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (navigationTriggerDialog.defaultCategory != null) {
                        break;
                    }
                    navigationTriggerDialog.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u != 10) {
                    if (navigationTriggerDialog.defaultCategory != null) {
                        break;
                    }
                    navigationTriggerDialog.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    return navigationTriggerDialog;
                }
                navigationTriggerDialog.defaultCategory = (ProductCategory) nb5Var.m158743l(ProductCategory.PROTOBUF_ADAPTER);
            }
            return navigationTriggerDialog;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NavigationTriggerDialog navigationTriggerDialog, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProductCategory productCategory = navigationTriggerDialog.defaultCategory;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17254K(1, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NavigationTriggerDialog> JSON_ADAPTER = new ObjectJsonAdapter<NavigationTriggerDialog>() { // from class: com.p1.mobile.putong.core.data.NavigationTriggerDialog.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NavigationTriggerDialog.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NavigationTriggerDialog newInstance() {
            return new NavigationTriggerDialog();
        }

        public boolean parseField(NavigationTriggerDialog navigationTriggerDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("defaultCategory")) {
                return false;
            }
            navigationTriggerDialog.defaultCategory = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(NavigationTriggerDialog navigationTriggerDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("defaultCategory")) {
                return true;
            }
            return super.parseFieldCheck(navigationTriggerDialog, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NavigationTriggerDialog navigationTriggerDialog, JsonGenerator jsonGenerator) throws IOException {
            if (navigationTriggerDialog.defaultCategory != null) {
                jsonGenerator.writeFieldName("defaultCategory");
                ProductCategory.JSON_ADAPTER.serialize(navigationTriggerDialog.defaultCategory, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NavigationTriggerDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NavigationTriggerDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NavigationTriggerDialog new_() {
        NavigationTriggerDialog navigationTriggerDialog = new NavigationTriggerDialog();
        navigationTriggerDialog.nullCheck();
        return navigationTriggerDialog;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NavigationTriggerDialog mo223809clone() {
        NavigationTriggerDialog navigationTriggerDialog = new NavigationTriggerDialog();
        navigationTriggerDialog.defaultCategory = this.defaultCategory;
        return navigationTriggerDialog;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NavigationTriggerDialog) {
            return ValueObject.util_equals(this.defaultCategory, ((NavigationTriggerDialog) obj).defaultCategory);
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
        ProductCategory productCategory = this.defaultCategory;
        int iHashCode = i2 + (productCategory != null ? productCategory.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.defaultCategory == null) {
            this.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
