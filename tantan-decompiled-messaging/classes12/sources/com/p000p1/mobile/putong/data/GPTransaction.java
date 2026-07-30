package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.GPAffiliateTransaction;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPTransaction gPTransaction) {
            List<GPAffiliateTransaction> list = gPTransaction.affiliateTransactions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, GPAffiliateTransaction.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = gPTransaction.mmuid;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = gPTransaction.smid;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = gPTransaction.source;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) gPTransaction).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPTransaction m18169parse(nb5 nb5Var) throws IOException {
            GPTransaction gPTransaction = new GPTransaction();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    gPTransaction.affiliateTransactions = (List) nb5Var.l(GPAffiliateTransaction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    gPTransaction.mmuid = nb5Var.s();
                } else if (iU == 26) {
                    gPTransaction.smid = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    gPTransaction.source = nb5Var.s();
                }
            }
            return gPTransaction;
        }

        public void serialize(GPTransaction gPTransaction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPAffiliateTransaction> list = gPTransaction.affiliateTransactions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, GPAffiliateTransaction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = gPTransaction.mmuid;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = gPTransaction.smid;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = gPTransaction.source;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<GPTransaction> JSON_ADAPTER = new ObjectJsonAdapter<GPTransaction>() { // from class: com.p1.mobile.putong.data.GPTransaction.2
        public Class getDataClass() {
            return GPTransaction.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GPTransaction mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPTransaction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPTransaction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPTransaction new_() {
        GPTransaction gPTransaction = new GPTransaction();
        gPTransaction.nullCheck();
        return gPTransaction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPTransaction m18168clone() {
        GPTransaction gPTransaction = new GPTransaction();
        List<GPAffiliateTransaction> list = this.affiliateTransactions;
        if (list != null) {
            gPTransaction.affiliateTransactions = ValueObject.util_map(list, new w9j() { // from class: l.tgj
                public final Object call(Object obj) {
                    return ((GPAffiliateTransaction) obj).m18129clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
