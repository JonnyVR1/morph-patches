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
public class LeftSwipeLimitConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "leftswipelimitconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public PurchaseDialogConfigTrigger swipeLimit;
    public static ProtobufAdapter<LeftSwipeLimitConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LeftSwipeLimitConfig>() { // from class: com.p1.mobile.putong.core.data.LeftSwipeLimitConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LeftSwipeLimitConfig leftSwipeLimitConfig) {
            PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = leftSwipeLimitConfig.swipeLimit;
            int iM17230l = purchaseDialogConfigTrigger != null ? CodedOutputByteBufferNano.m17230l(1, purchaseDialogConfigTrigger, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER) : 0;
            leftSwipeLimitConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LeftSwipeLimitConfig parse(nb5 nb5Var) throws IOException {
            LeftSwipeLimitConfig leftSwipeLimitConfig = new LeftSwipeLimitConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (leftSwipeLimitConfig.swipeLimit != null) {
                        break;
                    }
                    leftSwipeLimitConfig.swipeLimit = PurchaseDialogConfigTrigger.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (leftSwipeLimitConfig.swipeLimit != null) {
                        break;
                    }
                    leftSwipeLimitConfig.swipeLimit = PurchaseDialogConfigTrigger.new_();
                    return leftSwipeLimitConfig;
                }
                leftSwipeLimitConfig.swipeLimit = (PurchaseDialogConfigTrigger) nb5Var.m158743l(PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER);
            }
            return leftSwipeLimitConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LeftSwipeLimitConfig leftSwipeLimitConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = leftSwipeLimitConfig.swipeLimit;
            if (purchaseDialogConfigTrigger != null) {
                codedOutputByteBufferNano.m17254K(1, purchaseDialogConfigTrigger, PurchaseDialogConfigTrigger.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LeftSwipeLimitConfig> JSON_ADAPTER = new ObjectJsonAdapter<LeftSwipeLimitConfig>() { // from class: com.p1.mobile.putong.core.data.LeftSwipeLimitConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LeftSwipeLimitConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LeftSwipeLimitConfig newInstance() {
            return new LeftSwipeLimitConfig();
        }

        public boolean parseField(LeftSwipeLimitConfig leftSwipeLimitConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("swipeLimit")) {
                return false;
            }
            leftSwipeLimitConfig.swipeLimit = PurchaseDialogConfigTrigger.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LeftSwipeLimitConfig leftSwipeLimitConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("swipeLimit")) {
                return true;
            }
            return super.parseFieldCheck(leftSwipeLimitConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LeftSwipeLimitConfig leftSwipeLimitConfig, JsonGenerator jsonGenerator) throws IOException {
            if (leftSwipeLimitConfig.swipeLimit != null) {
                jsonGenerator.writeFieldName("swipeLimit");
                PurchaseDialogConfigTrigger.JSON_ADAPTER.serialize(leftSwipeLimitConfig.swipeLimit, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LeftSwipeLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LeftSwipeLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LeftSwipeLimitConfig new_() {
        LeftSwipeLimitConfig leftSwipeLimitConfig = new LeftSwipeLimitConfig();
        leftSwipeLimitConfig.nullCheck();
        return leftSwipeLimitConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LeftSwipeLimitConfig mo223809clone() {
        LeftSwipeLimitConfig leftSwipeLimitConfig = new LeftSwipeLimitConfig();
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = this.swipeLimit;
        if (purchaseDialogConfigTrigger != null) {
            leftSwipeLimitConfig.swipeLimit = purchaseDialogConfigTrigger.mo223809clone();
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
        PurchaseDialogConfigTrigger purchaseDialogConfigTrigger = this.swipeLimit;
        int iHashCode = i2 + (purchaseDialogConfigTrigger != null ? purchaseDialogConfigTrigger.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.swipeLimit == null) {
            this.swipeLimit = PurchaseDialogConfigTrigger.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
