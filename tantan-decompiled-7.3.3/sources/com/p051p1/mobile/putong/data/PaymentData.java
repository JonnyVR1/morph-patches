package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.AllowPayments;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.bkj0;
import p153l.jyb;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class PaymentData extends ValueObject implements Cloneable, Serializable {
    private static String CODA_TAG = null;
    private static String COOLS_TAG = null;
    private static String COP_TAH = null;
    public static final String FROM_LIVE_RECHARGE = "live_recharge";
    public static final String FROM_RESULT = "pay_result";
    public static final String FROM_TEAM = "tantan_assistant";
    public static final String FROM_WALLET = "wallet";
    public static final String TYPE = "paymentdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<AllowPayments> allowPayments;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> blackPayments;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> payments;
    public static ProtobufAdapter<PaymentData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PaymentData>() { // from class: com.p1.mobile.putong.data.PaymentData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PaymentData paymentData) {
            List<String> list = paymentData.payments;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = paymentData.blackPayments;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<AllowPayments> list3 = paymentData.allowPayments;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, AllowPayments.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            paymentData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PaymentData parse(nc5 nc5Var) throws IOException {
            PaymentData paymentData = new PaymentData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (paymentData.payments == null) {
                        paymentData.payments = new ArrayList();
                    }
                    if (paymentData.blackPayments == null) {
                        paymentData.blackPayments = new ArrayList();
                    }
                    if (paymentData.allowPayments != null) {
                        break;
                    }
                    paymentData.allowPayments = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    paymentData.payments = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    paymentData.blackPayments = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (paymentData.payments == null) {
                            paymentData.payments = new ArrayList();
                        }
                        if (paymentData.blackPayments == null) {
                            paymentData.blackPayments = new ArrayList();
                        }
                        if (paymentData.allowPayments != null) {
                            break;
                        }
                        paymentData.allowPayments = new ArrayList();
                        return paymentData;
                    }
                    paymentData.allowPayments = (List) nc5Var.m162488l(AllowPayments.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return paymentData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PaymentData paymentData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = paymentData.payments;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = paymentData.blackPayments;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<AllowPayments> list3 = paymentData.allowPayments;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, AllowPayments.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PaymentData> JSON_ADAPTER = new ObjectJsonAdapter<PaymentData>() { // from class: com.p1.mobile.putong.data.PaymentData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PaymentData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PaymentData newInstance() {
            return new PaymentData();
        }

        public boolean parseField(PaymentData paymentData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "allowPayments":
                    paymentData.allowPayments = JsonAdapter.parseArray(jsonParser, AllowPayments.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "blackPayments":
                    paymentData.blackPayments = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "payments":
                    paymentData.payments = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PaymentData paymentData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "allowPayments":
                case "blackPayments":
                case "payments":
                    return true;
                default:
                    return super.parseFieldCheck(paymentData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PaymentData paymentData, JsonGenerator jsonGenerator) throws IOException {
            if (paymentData.payments != null) {
                jsonGenerator.writeFieldName("payments");
                JsonAdapter.serializeArray(paymentData.payments, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (paymentData.blackPayments != null) {
                jsonGenerator.writeFieldName("blackPayments");
                JsonAdapter.serializeArray(paymentData.blackPayments, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (paymentData.allowPayments != null) {
                jsonGenerator.writeFieldName("allowPayments");
                JsonAdapter.serializeArray(paymentData.allowPayments, jsonGenerator, AllowPayments.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PaymentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PaymentData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    private boolean checkCoPayOnline(final String str) {
        return !jyb.m147520m(this.allowPayments, new qcj() { // from class: l.om60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                AllowPayments allowPayments = (AllowPayments) obj;
                return Boolean.valueOf(allowPayments.payments.contains(str) && uqb0.f180400f0 == allowPayments.signup_country);
            }
        });
    }

    private boolean checkCodaOnline(final String str) {
        return jyb.m147520m(this.allowPayments, new qcj() { // from class: l.nm60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AllowPayments) obj).payments.contains(str));
            }
        });
    }

    private boolean checkPCOnline(final String str) {
        return jyb.m147520m(this.allowPayments, new qcj() { // from class: l.pm60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                AllowPayments allowPayments = (AllowPayments) obj;
                return Boolean.valueOf(allowPayments.payments.contains(str) && uqb0.f180400f0 == allowPayments.signup_country);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m61163d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m61165f(String str) {
        return str;
    }

    public static PaymentData new_() {
        PaymentData paymentData = new PaymentData();
        paymentData.nullCheck();
        return paymentData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PaymentData mo225055clone() {
        PaymentData paymentData = new PaymentData();
        List<String> list = this.payments;
        if (list != null) {
            paymentData.payments = ValueObject.util_map(list, new qcj() { // from class: l.km60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PaymentData.m61165f((String) obj);
                }
            });
        }
        List<String> list2 = this.blackPayments;
        if (list2 != null) {
            paymentData.blackPayments = ValueObject.util_map(list2, new qcj() { // from class: l.lm60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return PaymentData.m61163d((String) obj);
                }
            });
        }
        List<AllowPayments> list3 = this.allowPayments;
        if (list3 != null) {
            paymentData.allowPayments = ValueObject.util_map(list3, new qcj() { // from class: l.mm60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AllowPayments) obj).mo225055clone();
                }
            });
        }
        return paymentData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentData)) {
            return false;
        }
        PaymentData paymentData = (PaymentData) obj;
        return ValueObject.util_equals(this.payments, paymentData.payments) && ValueObject.util_equals(this.blackPayments, paymentData.blackPayments) && ValueObject.util_equals(this.allowPayments, paymentData.allowPayments);
    }

    public String getCOutName() {
        if (TextUtils.isEmpty(COP_TAH)) {
            char[] cArr = {Constants.INAPP_POSITION_CENTER, 'e', 'k', Constants.INAPP_POSITION_TOP};
            COP_TAH = String.valueOf(cArr[0]) + ((char) (cArr[0] + 5)) + cArr[1] + cArr[0] + cArr[2] + ((char) (cArr[2] + 4)) + ((char) (cArr[2] + '\n')) + cArr[3];
        }
        return COP_TAH;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getCodaName() {
        if (TextUtils.isEmpty(CODA_TAG)) {
            char[] cArr = {Constants.INAPP_POSITION_CENTER, 'o', 'p', 'y'};
            CODA_TAG = String.valueOf(cArr[0]) + cArr[1] + ((char) (cArr[0] + 1)) + ((char) (cArr[0] - 2)) + cArr[2] + ((char) (cArr[0] - 2)) + cArr[3];
        }
        return CODA_TAG;
    }

    public String getPCName() {
        if (TextUtils.isEmpty(COOLS_TAG)) {
            char[] cArr = {'p', 'a', 'C', 's'};
            COOLS_TAG = String.valueOf(cArr[0]) + cArr[1] + ((char) (cArr[1] + 24)) + cArr[2] + ((char) (cArr[1] + 2)) + ((char) (cArr[1] + 2)) + ((char) (cArr[1] + 11)) + cArr[3];
        }
        return COOLS_TAG;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.payments;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.blackPayments;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<AllowPayments> list3 = this.allowPayments;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isCanUse(String str, String str2) {
        boolean zCheckCoPayOnline;
        if (this.allowPayments.size() <= 0) {
            zCheckCoPayOnline = false;
        } else if (str2.equals(getPCName())) {
            zCheckCoPayOnline = checkPCOnline(str2);
        } else {
            zCheckCoPayOnline = str2.equals(getCOutName()) ? checkCoPayOnline(str2) : checkCodaOnline(str2);
        }
        bkj0 bkj0Var = new bkj0(Boolean.valueOf(zCheckCoPayOnline), Boolean.valueOf(this.payments.contains(str2)), Boolean.valueOf(this.blackPayments.contains(str2)));
        if (!((Boolean) bkj0Var.f77081a).booleanValue()) {
            return false;
        }
        if (TextUtils.equals(str, FROM_TEAM)) {
            return str2.equals(getCOutName()) || !((Boolean) bkj0Var.f77083c).booleanValue();
        }
        if (TextUtils.equals(str, FROM_RESULT)) {
            return true;
        }
        if (str2.equals(getPCName()) && TextUtils.equals(str, "wallet")) {
            return !((Boolean) bkj0Var.f77083c).booleanValue() && ((Boolean) bkj0Var.f77082b).booleanValue();
        }
        return ((Boolean) bkj0Var.f77082b).booleanValue();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.payments == null) {
            this.payments = new ArrayList();
        }
        if (this.blackPayments == null) {
            this.blackPayments = new ArrayList();
        }
        if (this.allowPayments == null) {
            this.allowPayments = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
