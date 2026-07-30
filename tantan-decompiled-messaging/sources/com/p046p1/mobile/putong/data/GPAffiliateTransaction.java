package com.p046p1.mobile.putong.data;

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
import com.tencent.open.SocialOperation;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class GPAffiliateTransaction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpaffiliatetransaction";

    @NonNull
    @ProtobufIndex(index = 2)
    public String purchaseData;

    @NonNull
    @ProtobufIndex(index = 1)
    public String signature;
    public static ProtobufAdapter<GPAffiliateTransaction> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPAffiliateTransaction>() { // from class: com.p1.mobile.putong.data.GPAffiliateTransaction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPAffiliateTransaction gPAffiliateTransaction) {
            String str = gPAffiliateTransaction.signature;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = gPAffiliateTransaction.purchaseData;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            gPAffiliateTransaction.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPAffiliateTransaction parse(nb5 nb5Var) throws IOException {
            GPAffiliateTransaction gPAffiliateTransaction = new GPAffiliateTransaction();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPAffiliateTransaction.signature == null) {
                        gPAffiliateTransaction.signature = "";
                    }
                    if (gPAffiliateTransaction.purchaseData != null) {
                        break;
                    }
                    gPAffiliateTransaction.purchaseData = "";
                    break;
                }
                if (iM158752u == 10) {
                    gPAffiliateTransaction.signature = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (gPAffiliateTransaction.signature == null) {
                            gPAffiliateTransaction.signature = "";
                        }
                        if (gPAffiliateTransaction.purchaseData != null) {
                            break;
                        }
                        gPAffiliateTransaction.purchaseData = "";
                        return gPAffiliateTransaction;
                    }
                    gPAffiliateTransaction.purchaseData = nb5Var.m158750s();
                }
            }
            return gPAffiliateTransaction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPAffiliateTransaction gPAffiliateTransaction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPAffiliateTransaction.signature;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = gPAffiliateTransaction.purchaseData;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<GPAffiliateTransaction> JSON_ADAPTER = new ObjectJsonAdapter<GPAffiliateTransaction>() { // from class: com.p1.mobile.putong.data.GPAffiliateTransaction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPAffiliateTransaction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPAffiliateTransaction newInstance() {
            return new GPAffiliateTransaction();
        }

        public boolean parseField(GPAffiliateTransaction gPAffiliateTransaction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("purchaseData")) {
                gPAffiliateTransaction.purchaseData = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(SocialOperation.GAME_SIGNATURE)) {
                return false;
            }
            gPAffiliateTransaction.signature = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GPAffiliateTransaction gPAffiliateTransaction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("purchaseData") || str.equals(SocialOperation.GAME_SIGNATURE)) {
                return true;
            }
            return super.parseFieldCheck(gPAffiliateTransaction, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPAffiliateTransaction gPAffiliateTransaction, JsonGenerator jsonGenerator) throws IOException {
            String str = gPAffiliateTransaction.signature;
            if (str != null) {
                jsonGenerator.writeStringField(SocialOperation.GAME_SIGNATURE, str);
            }
            String str2 = gPAffiliateTransaction.purchaseData;
            if (str2 != null) {
                jsonGenerator.writeStringField("purchaseData", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPAffiliateTransaction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPAffiliateTransaction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPAffiliateTransaction new_() {
        GPAffiliateTransaction gPAffiliateTransaction = new GPAffiliateTransaction();
        gPAffiliateTransaction.nullCheck();
        return gPAffiliateTransaction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPAffiliateTransaction mo223809clone() {
        GPAffiliateTransaction gPAffiliateTransaction = new GPAffiliateTransaction();
        gPAffiliateTransaction.signature = this.signature;
        gPAffiliateTransaction.purchaseData = this.purchaseData;
        return gPAffiliateTransaction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPAffiliateTransaction)) {
            return false;
        }
        GPAffiliateTransaction gPAffiliateTransaction = (GPAffiliateTransaction) obj;
        return ValueObject.util_equals(this.signature, gPAffiliateTransaction.signature) && ValueObject.util_equals(this.purchaseData, gPAffiliateTransaction.purchaseData);
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
        String str = this.signature;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.purchaseData;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.signature == null) {
            this.signature = "";
        }
        if (this.purchaseData == null) {
            this.purchaseData = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
