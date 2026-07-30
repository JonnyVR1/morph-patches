package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class PurchaseSavePopUserID extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasesavepopuserid";

    @ProtobufIndex(index = 2)
    public int superLikeCountBy;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<PurchaseSavePopUserID> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseSavePopUserID>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePopUserID.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurchaseSavePopUserID purchaseSavePopUserID) {
            String str = purchaseSavePopUserID.userID;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, purchaseSavePopUserID.superLikeCountBy);
            purchaseSavePopUserID.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurchaseSavePopUserID parse(nc5 nc5Var) throws IOException {
            PurchaseSavePopUserID purchaseSavePopUserID = new PurchaseSavePopUserID();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (purchaseSavePopUserID.userID != null) {
                        break;
                    }
                    purchaseSavePopUserID.userID = "";
                    break;
                }
                if (iM162497u == 10) {
                    purchaseSavePopUserID.userID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (purchaseSavePopUserID.userID != null) {
                            break;
                        }
                        purchaseSavePopUserID.userID = "";
                        return purchaseSavePopUserID;
                    }
                    purchaseSavePopUserID.superLikeCountBy = nc5Var.m162486j();
                }
            }
            return purchaseSavePopUserID;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurchaseSavePopUserID purchaseSavePopUserID, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = purchaseSavePopUserID.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, purchaseSavePopUserID.superLikeCountBy);
        }
    };
    public static JsonAdapter<PurchaseSavePopUserID> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseSavePopUserID>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePopUserID.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurchaseSavePopUserID.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurchaseSavePopUserID newInstance() {
            return new PurchaseSavePopUserID();
        }

        public boolean parseField(PurchaseSavePopUserID purchaseSavePopUserID, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("superLikeCountBy")) {
                purchaseSavePopUserID.superLikeCountBy = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("userID")) {
                return false;
            }
            purchaseSavePopUserID.userID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PurchaseSavePopUserID purchaseSavePopUserID, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("superLikeCountBy") || str.equals("userID")) {
                return true;
            }
            return super.parseFieldCheck(purchaseSavePopUserID, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PurchaseSavePopUserID purchaseSavePopUserID, JsonGenerator jsonGenerator) throws IOException {
            String str = purchaseSavePopUserID.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            jsonGenerator.writeNumberField("superLikeCountBy", purchaseSavePopUserID.superLikeCountBy);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseSavePopUserID) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseSavePopUserID) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseSavePopUserID new_() {
        PurchaseSavePopUserID purchaseSavePopUserID = new PurchaseSavePopUserID();
        purchaseSavePopUserID.nullCheck();
        return purchaseSavePopUserID;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurchaseSavePopUserID mo225055clone() {
        PurchaseSavePopUserID purchaseSavePopUserID = new PurchaseSavePopUserID();
        purchaseSavePopUserID.userID = this.userID;
        purchaseSavePopUserID.superLikeCountBy = this.superLikeCountBy;
        return purchaseSavePopUserID;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseSavePopUserID)) {
            return false;
        }
        PurchaseSavePopUserID purchaseSavePopUserID = (PurchaseSavePopUserID) obj;
        return ValueObject.util_equals(this.userID, purchaseSavePopUserID.userID) && this.superLikeCountBy == purchaseSavePopUserID.superLikeCountBy;
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
        String str = this.userID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.superLikeCountBy;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
