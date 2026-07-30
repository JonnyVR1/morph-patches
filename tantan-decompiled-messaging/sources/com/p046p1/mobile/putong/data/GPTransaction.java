package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.GPAffiliateTransaction;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class GPTransaction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gptransaction";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPAffiliateTransaction> affiliateTransactions;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mmuid;

    @NonNull
    @ProtobufIndex(index = 3)
    public String smid;

    @NonNull
    @ProtobufIndex(index = 4)
    public String source;
    public static ProtobufAdapter<GPTransaction> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPTransaction>() { // from class: com.p1.mobile.putong.data.GPTransaction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPTransaction gPTransaction) {
            List<GPAffiliateTransaction> list = gPTransaction.affiliateTransactions;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, GPAffiliateTransaction.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = gPTransaction.mmuid;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = gPTransaction.smid;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = gPTransaction.source;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            gPTransaction.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPTransaction parse(nb5 nb5Var) throws IOException {
            GPTransaction gPTransaction = new GPTransaction();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPTransaction.affiliateTransactions == null) {
                        gPTransaction.affiliateTransactions = new ArrayList();
                    }
                    if (gPTransaction.mmuid == null) {
                        gPTransaction.mmuid = "";
                    }
                    if (gPTransaction.smid == null) {
                        gPTransaction.smid = "";
                    }
                    if (gPTransaction.source != null) {
                        break;
                    }
                    gPTransaction.source = "";
                    break;
                }
                if (iM158752u == 10) {
                    gPTransaction.affiliateTransactions = (List) nb5Var.m158743l(GPAffiliateTransaction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    gPTransaction.mmuid = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    gPTransaction.smid = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (gPTransaction.affiliateTransactions == null) {
                            gPTransaction.affiliateTransactions = new ArrayList();
                        }
                        if (gPTransaction.mmuid == null) {
                            gPTransaction.mmuid = "";
                        }
                        if (gPTransaction.smid == null) {
                            gPTransaction.smid = "";
                        }
                        if (gPTransaction.source != null) {
                            break;
                        }
                        gPTransaction.source = "";
                        return gPTransaction;
                    }
                    gPTransaction.source = nb5Var.m158750s();
                }
            }
            return gPTransaction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPTransaction gPTransaction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPAffiliateTransaction> list = gPTransaction.affiliateTransactions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, GPAffiliateTransaction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = gPTransaction.mmuid;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = gPTransaction.smid;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = gPTransaction.source;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<GPTransaction> JSON_ADAPTER = new ObjectJsonAdapter<GPTransaction>() { // from class: com.p1.mobile.putong.data.GPTransaction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPTransaction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPTransaction newInstance() {
            return new GPTransaction();
        }

        public boolean parseField(GPTransaction gPTransaction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "source":
                    gPTransaction.source = jsonParser.getValueAsString();
                    return true;
                case "smid":
                    gPTransaction.smid = jsonParser.getValueAsString();
                    return true;
                case "mmuid":
                    gPTransaction.mmuid = jsonParser.getValueAsString();
                    return true;
                case "affiliateTransactions":
                    gPTransaction.affiliateTransactions = JsonAdapter.parseArray(jsonParser, GPAffiliateTransaction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPTransaction gPTransaction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "source":
                case "smid":
                case "mmuid":
                case "affiliateTransactions":
                    return true;
                default:
                    return super.parseFieldCheck(gPTransaction, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPTransaction gPTransaction, JsonGenerator jsonGenerator) throws IOException {
            if (gPTransaction.affiliateTransactions != null) {
                jsonGenerator.writeFieldName("affiliateTransactions");
                JsonAdapter.serializeArray(gPTransaction.affiliateTransactions, jsonGenerator, GPAffiliateTransaction.JSON_ADAPTER);
            }
            String str = gPTransaction.mmuid;
            if (str != null) {
                jsonGenerator.writeStringField("mmuid", str);
            }
            String str2 = gPTransaction.smid;
            if (str2 != null) {
                jsonGenerator.writeStringField("smid", str2);
            }
            String str3 = gPTransaction.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPTransaction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPTransaction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPTransaction new_() {
        GPTransaction gPTransaction = new GPTransaction();
        gPTransaction.nullCheck();
        return gPTransaction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPTransaction mo223809clone() {
        GPTransaction gPTransaction = new GPTransaction();
        List<GPAffiliateTransaction> list = this.affiliateTransactions;
        if (list != null) {
            gPTransaction.affiliateTransactions = ValueObject.util_map(list, new w9j() { // from class: l.tgj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GPAffiliateTransaction) obj).mo223809clone();
                }
            });
        }
        gPTransaction.mmuid = this.mmuid;
        gPTransaction.smid = this.smid;
        gPTransaction.source = this.source;
        return gPTransaction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPTransaction)) {
            return false;
        }
        GPTransaction gPTransaction = (GPTransaction) obj;
        return ValueObject.util_equals(this.affiliateTransactions, gPTransaction.affiliateTransactions) && ValueObject.util_equals(this.mmuid, gPTransaction.mmuid) && ValueObject.util_equals(this.smid, gPTransaction.smid) && ValueObject.util_equals(this.source, gPTransaction.source);
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
        List<GPAffiliateTransaction> list = this.affiliateTransactions;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.mmuid;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.smid;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.affiliateTransactions == null) {
            this.affiliateTransactions = new ArrayList();
        }
        if (this.mmuid == null) {
            this.mmuid = "";
        }
        if (this.smid == null) {
            this.smid = "";
        }
        if (this.source == null) {
            this.source = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
