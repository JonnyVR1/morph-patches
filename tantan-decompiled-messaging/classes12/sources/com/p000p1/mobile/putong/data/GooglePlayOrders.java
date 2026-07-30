package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GooglePlayOrders extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "googleplayorders";

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @NonNull
    @ProtobufIndex(index = 1)
    public String transactionId;
    public static ProtobufAdapter<GooglePlayOrders> PROTOBUF_ADAPTER = new MessageNanoAdapter<GooglePlayOrders>() { // from class: com.p1.mobile.putong.data.GooglePlayOrders.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GooglePlayOrders googlePlayOrders) {
            String str = googlePlayOrders.transactionId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = googlePlayOrders.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) googlePlayOrders).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GooglePlayOrders m18187parse(nb5 nb5Var) throws IOException {
            GooglePlayOrders googlePlayOrders = new GooglePlayOrders();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (googlePlayOrders.transactionId == null) {
                        googlePlayOrders.transactionId = "";
                    }
                    if (googlePlayOrders.status != null) {
                        break;
                    }
                    googlePlayOrders.status = "";
                    break;
                }
                if (iU == 10) {
                    googlePlayOrders.transactionId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (googlePlayOrders.transactionId == null) {
                            googlePlayOrders.transactionId = "";
                        }
                        if (googlePlayOrders.status != null) {
                            break;
                        }
                        googlePlayOrders.status = "";
                        return googlePlayOrders;
                    }
                    googlePlayOrders.status = nb5Var.s();
                }
            }
            return googlePlayOrders;
        }

        public void serialize(GooglePlayOrders googlePlayOrders, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = googlePlayOrders.transactionId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = googlePlayOrders.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<GooglePlayOrders> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlayOrders>() { // from class: com.p1.mobile.putong.data.GooglePlayOrders.2
        public Class getDataClass() {
            return GooglePlayOrders.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GooglePlayOrders mo17830newInstance() {
            return new GooglePlayOrders();
        }

        public boolean parseField(GooglePlayOrders googlePlayOrders, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("status")) {
                googlePlayOrders.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("transactionId")) {
                return false;
            }
            googlePlayOrders.transactionId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GooglePlayOrders googlePlayOrders, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status") || str.equals("transactionId")) {
                return true;
            }
            return super.parseFieldCheck(googlePlayOrders, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GooglePlayOrders googlePlayOrders, JsonGenerator jsonGenerator) throws IOException {
            String str = googlePlayOrders.transactionId;
            if (str != null) {
                jsonGenerator.writeStringField("transactionId", str);
            }
            String str2 = googlePlayOrders.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlayOrders) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GooglePlayOrders) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GooglePlayOrders new_() {
        GooglePlayOrders googlePlayOrders = new GooglePlayOrders();
        googlePlayOrders.nullCheck();
        return googlePlayOrders;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GooglePlayOrders m18186clone() {
        GooglePlayOrders googlePlayOrders = new GooglePlayOrders();
        googlePlayOrders.transactionId = this.transactionId;
        googlePlayOrders.status = this.status;
        return googlePlayOrders;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GooglePlayOrders)) {
            return false;
        }
        GooglePlayOrders googlePlayOrders = (GooglePlayOrders) obj;
        return ValueObject.util_equals(this.transactionId, googlePlayOrders.transactionId) && ValueObject.util_equals(this.status, googlePlayOrders.status);
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
        String str = this.transactionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.transactionId == null) {
            this.transactionId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
