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
public class LeftSwipeLimitConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "leftswipelimitconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public PurchaseDialogConfigTrigger swipeLimit;
    public static ProtobufAdapter<LeftSwipeLimitConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LeftSwipeLimitConfig>() { // from class: com.p1.mobile.putong.core.data.LeftSwipeLimitConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LeftSwipeLimitConfig leftSwipeLimitConfig) {
            PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = leftSwipeLimitConfig.swipeLimit;
            int iL = purchaseDialogConfigTrigger != null ? CodedOutputByteBufferNano.l(1, purchaseDialogConfigTrigger, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) leftSwipeLimitConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LeftSwipeLimitConfig m13821parse(nb5 nb5Var) throws IOException {
            LeftSwipeLimitConfig leftSwipeLimitConfig = new LeftSwipeLimitConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (leftSwipeLimitConfig.swipeLimit != null) {
                        break;
                    }
                    leftSwipeLimitConfig.swipeLimit = PurchaseDialogConfigTrigger.new_();
                    break;
                }
                if (iU != 10) {
                    if (leftSwipeLimitConfig.swipeLimit != null) {
                        break;
                    }
                    leftSwipeLimitConfig.swipeLimit = PurchaseDialogConfigTrigger.new_();
                    return leftSwipeLimitConfig;
                }
                leftSwipeLimitConfig.swipeLimit = (PurchaseDialogConfigTrigger) nb5Var.l(PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER);
            }
            return leftSwipeLimitConfig;
        }

        public void serialize(LeftSwipeLimitConfig leftSwipeLimitConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = leftSwipeLimitConfig.swipeLimit;
            if (purchaseDialogConfigTrigger != null) {
                codedOutputByteBufferNano.K(1, purchaseDialogConfigTrigger, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LeftSwipeLimitConfig> JSON_ADAPTER = new ObjectJsonAdapter<LeftSwipeLimitConfig>() { // from class: com.p1.mobile.putong.core.data.LeftSwipeLimitConfig.2
        public Class getDataClass() {
            return LeftSwipeLimitConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LeftSwipeLimitConfig m13822newInstance() {
            return new LeftSwipeLimitConfig();
        }

        public boolean parseField(LeftSwipeLimitConfig leftSwipeLimitConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("swipeLimit")) {
                return false;
            }
            leftSwipeLimitConfig.swipeLimit = (PurchaseDialogConfigTrigger) PurchaseDialogConfigTrigger.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LeftSwipeLimitConfig leftSwipeLimitConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("swipeLimit")) {
                return true;
            }
            return super.parseFieldCheck(leftSwipeLimitConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LeftSwipeLimitConfig leftSwipeLimitConfig, JsonGenerator jsonGenerator) throws IOException {
            if (leftSwipeLimitConfig.swipeLimit != null) {
                jsonGenerator.writeFieldName("swipeLimit");
                PurchaseDialogConfigTrigger.JSON_ADAPTER.serialize(leftSwipeLimitConfig.swipeLimit, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LeftSwipeLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LeftSwipeLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LeftSwipeLimitConfig new_() {
        LeftSwipeLimitConfig leftSwipeLimitConfig = new LeftSwipeLimitConfig();
        leftSwipeLimitConfig.nullCheck();
        return leftSwipeLimitConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LeftSwipeLimitConfig m13820clone() {
        LeftSwipeLimitConfig leftSwipeLimitConfig = new LeftSwipeLimitConfig();
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = this.swipeLimit;
        if (purchaseDialogConfigTrigger != null) {
            leftSwipeLimitConfig.swipeLimit = purchaseDialogConfigTrigger.m15074clone();
        }
        return leftSwipeLimitConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LeftSwipeLimitConfig) {
            return ValueObject.util_equals(this.swipeLimit, ((LeftSwipeLimitConfig) obj).swipeLimit);
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
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = this.swipeLimit;
        int iHashCode = i2 + (purchaseDialogConfigTrigger != null ? purchaseDialogConfigTrigger.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.swipeLimit == null) {
            this.swipeLimit = PurchaseDialogConfigTrigger.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
