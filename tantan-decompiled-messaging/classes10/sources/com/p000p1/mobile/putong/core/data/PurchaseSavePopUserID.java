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
public class PurchaseSavePopUserID extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasesavepopuserid";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int superLikeCountBy;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<PurchaseSavePopUserID> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseSavePopUserID>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePopUserID.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PurchaseSavePopUserID purchaseSavePopUserID) {
            String str = purchaseSavePopUserID.userID;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, purchaseSavePopUserID.superLikeCountBy);
            ((MessageNano) purchaseSavePopUserID).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PurchaseSavePopUserID m15089parse(nb5 nb5Var) throws IOException {
            PurchaseSavePopUserID purchaseSavePopUserID = new PurchaseSavePopUserID();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (purchaseSavePopUserID.userID != null) {
                        break;
                    }
                    purchaseSavePopUserID.userID = "";
                    break;
                }
                if (iU == 10) {
                    purchaseSavePopUserID.userID = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (purchaseSavePopUserID.userID != null) {
                            break;
                        }
                        purchaseSavePopUserID.userID = "";
                        return purchaseSavePopUserID;
                    }
                    purchaseSavePopUserID.superLikeCountBy = nb5Var.j();
                }
            }
            return purchaseSavePopUserID;
        }

        public void serialize(PurchaseSavePopUserID purchaseSavePopUserID, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = purchaseSavePopUserID.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, purchaseSavePopUserID.superLikeCountBy);
        }
    };
    public static JsonAdapter<PurchaseSavePopUserID> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseSavePopUserID>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePopUserID.2
        public Class getDataClass() {
            return PurchaseSavePopUserID.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PurchaseSavePopUserID m15090newInstance() {
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

        public void serializeFields(PurchaseSavePopUserID purchaseSavePopUserID, JsonGenerator jsonGenerator) throws IOException {
            String str = purchaseSavePopUserID.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            jsonGenerator.writeNumberField("superLikeCountBy", purchaseSavePopUserID.superLikeCountBy);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseSavePopUserID) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseSavePopUserID) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseSavePopUserID new_() {
        PurchaseSavePopUserID purchaseSavePopUserID = new PurchaseSavePopUserID();
        purchaseSavePopUserID.nullCheck();
        return purchaseSavePopUserID;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PurchaseSavePopUserID m15088clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.superLikeCountBy;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
