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
public class NavigationTriggerDialog extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "navigationtriggerdialog";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProductCategory defaultCategory;
    public static ProtobufAdapter<NavigationTriggerDialog> PROTOBUF_ADAPTER = new MessageNanoAdapter<NavigationTriggerDialog>() { // from class: com.p1.mobile.putong.core.data.NavigationTriggerDialog.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NavigationTriggerDialog navigationTriggerDialog) {
            ProductCategory productCategory = navigationTriggerDialog.defaultCategory;
            int iL = productCategory != null ? CodedOutputByteBufferNano.l(1, productCategory, ProductCategory.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) navigationTriggerDialog).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NavigationTriggerDialog m14475parse(nb5 nb5Var) throws IOException {
            NavigationTriggerDialog navigationTriggerDialog = new NavigationTriggerDialog();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (navigationTriggerDialog.defaultCategory != null) {
                        break;
                    }
                    navigationTriggerDialog.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU != 10) {
                    if (navigationTriggerDialog.defaultCategory != null) {
                        break;
                    }
                    navigationTriggerDialog.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    return navigationTriggerDialog;
                }
                navigationTriggerDialog.defaultCategory = (ProductCategory) nb5Var.l(ProductCategory.PROTOBUF_ADAPTER);
            }
            return navigationTriggerDialog;
        }

        public void serialize(NavigationTriggerDialog navigationTriggerDialog, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProductCategory productCategory = navigationTriggerDialog.defaultCategory;
            if (productCategory != null) {
                codedOutputByteBufferNano.K(1, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NavigationTriggerDialog> JSON_ADAPTER = new ObjectJsonAdapter<NavigationTriggerDialog>() { // from class: com.p1.mobile.putong.core.data.NavigationTriggerDialog.2
        public Class getDataClass() {
            return NavigationTriggerDialog.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NavigationTriggerDialog m14476newInstance() {
            return new NavigationTriggerDialog();
        }

        public boolean parseField(NavigationTriggerDialog navigationTriggerDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("defaultCategory")) {
                return false;
            }
            navigationTriggerDialog.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(NavigationTriggerDialog navigationTriggerDialog, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("defaultCategory")) {
                return true;
            }
            return super.parseFieldCheck(navigationTriggerDialog, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(NavigationTriggerDialog navigationTriggerDialog, JsonGenerator jsonGenerator) throws IOException {
            if (navigationTriggerDialog.defaultCategory != null) {
                jsonGenerator.writeFieldName("defaultCategory");
                ProductCategory.JSON_ADAPTER.serialize(navigationTriggerDialog.defaultCategory, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NavigationTriggerDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NavigationTriggerDialog) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NavigationTriggerDialog new_() {
        NavigationTriggerDialog navigationTriggerDialog = new NavigationTriggerDialog();
        navigationTriggerDialog.nullCheck();
        return navigationTriggerDialog;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NavigationTriggerDialog m14474clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        ProductCategory productCategory = this.defaultCategory;
        int iHashCode = i2 + (productCategory != null ? productCategory.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.defaultCategory == null) {
            this.defaultCategory = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
