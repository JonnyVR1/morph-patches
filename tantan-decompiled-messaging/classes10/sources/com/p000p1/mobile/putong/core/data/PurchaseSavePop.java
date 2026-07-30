package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PurchaseSavePopUserID;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PurchaseSavePop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasesavepop";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<PurchaseSavePopUserID> rightSwipeList;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<PurchaseSavePopUserID> seeList;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<PurchaseSavePopUserID> ultraList;
    public static ProtobufAdapter<PurchaseSavePop> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseSavePop>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePop.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PurchaseSavePop purchaseSavePop) {
            List<PurchaseSavePopUserID> list = purchaseSavePop.seeList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<PurchaseSavePopUserID> list2 = purchaseSavePop.rightSwipeList;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseSavePopUserID> list3 = purchaseSavePop.ultraList;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) purchaseSavePop).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PurchaseSavePop m15085parse(nb5 nb5Var) throws IOException {
            PurchaseSavePop purchaseSavePop = new PurchaseSavePop();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (purchaseSavePop.seeList == null) {
                        purchaseSavePop.seeList = new ArrayList();
                    }
                    if (purchaseSavePop.rightSwipeList == null) {
                        purchaseSavePop.rightSwipeList = new ArrayList();
                    }
                    if (purchaseSavePop.ultraList != null) {
                        break;
                    }
                    purchaseSavePop.ultraList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    purchaseSavePop.seeList = (List) nb5Var.l(PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    purchaseSavePop.rightSwipeList = (List) nb5Var.l(PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (purchaseSavePop.seeList == null) {
                            purchaseSavePop.seeList = new ArrayList();
                        }
                        if (purchaseSavePop.rightSwipeList == null) {
                            purchaseSavePop.rightSwipeList = new ArrayList();
                        }
                        if (purchaseSavePop.ultraList != null) {
                            break;
                        }
                        purchaseSavePop.ultraList = new ArrayList();
                        return purchaseSavePop;
                    }
                    purchaseSavePop.ultraList = (List) nb5Var.l(PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return purchaseSavePop;
        }

        public void serialize(PurchaseSavePop purchaseSavePop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PurchaseSavePopUserID> list = purchaseSavePop.seeList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseSavePopUserID> list2 = purchaseSavePop.rightSwipeList;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseSavePopUserID> list3 = purchaseSavePop.ultraList;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PurchaseSavePop> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseSavePop>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePop.2
        public Class getDataClass() {
            return PurchaseSavePop.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PurchaseSavePop m15086newInstance() {
            return new PurchaseSavePop();
        }

        public boolean parseField(PurchaseSavePop purchaseSavePop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "rightSwipeList":
                    purchaseSavePop.rightSwipeList = JsonAdapter.parseArray(jsonParser, PurchaseSavePopUserID.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "ultraList":
                    purchaseSavePop.ultraList = JsonAdapter.parseArray(jsonParser, PurchaseSavePopUserID.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "seeList":
                    purchaseSavePop.seeList = JsonAdapter.parseArray(jsonParser, PurchaseSavePopUserID.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurchaseSavePop purchaseSavePop, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "rightSwipeList":
                case "ultraList":
                case "seeList":
                    return true;
                default:
                    return super.parseFieldCheck(purchaseSavePop, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PurchaseSavePop purchaseSavePop, JsonGenerator jsonGenerator) throws IOException {
            if (purchaseSavePop.seeList != null) {
                jsonGenerator.writeFieldName("seeList");
                JsonAdapter.serializeArray(purchaseSavePop.seeList, jsonGenerator, PurchaseSavePopUserID.JSON_ADAPTER);
            }
            if (purchaseSavePop.rightSwipeList != null) {
                jsonGenerator.writeFieldName("rightSwipeList");
                JsonAdapter.serializeArray(purchaseSavePop.rightSwipeList, jsonGenerator, PurchaseSavePopUserID.JSON_ADAPTER);
            }
            if (purchaseSavePop.ultraList != null) {
                jsonGenerator.writeFieldName("ultraList");
                JsonAdapter.serializeArray(purchaseSavePop.ultraList, jsonGenerator, PurchaseSavePopUserID.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseSavePop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseSavePop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseSavePop new_() {
        PurchaseSavePop purchaseSavePop = new PurchaseSavePop();
        purchaseSavePop.nullCheck();
        return purchaseSavePop;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PurchaseSavePop m15084clone() {
        PurchaseSavePop purchaseSavePop = new PurchaseSavePop();
        List<PurchaseSavePopUserID> list = this.seeList;
        if (list != null) {
            purchaseSavePop.seeList = ValueObject.util_map(list, new w9j() { // from class: l.f9b0
                public final Object call(Object obj) {
                    return ((PurchaseSavePopUserID) obj).m15088clone();
                }
            });
        }
        List<PurchaseSavePopUserID> list2 = this.rightSwipeList;
        if (list2 != null) {
            purchaseSavePop.rightSwipeList = ValueObject.util_map(list2, new w9j() { // from class: l.g9b0
                public final Object call(Object obj) {
                    return ((PurchaseSavePopUserID) obj).m15088clone();
                }
            });
        }
        List<PurchaseSavePopUserID> list3 = this.ultraList;
        if (list3 != null) {
            purchaseSavePop.ultraList = ValueObject.util_map(list3, new w9j() { // from class: l.h9b0
                public final Object call(Object obj) {
                    return ((PurchaseSavePopUserID) obj).m15088clone();
                }
            });
        }
        return purchaseSavePop;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseSavePop)) {
            return false;
        }
        PurchaseSavePop purchaseSavePop = (PurchaseSavePop) obj;
        return ValueObject.util_equals(this.seeList, purchaseSavePop.seeList) && ValueObject.util_equals(this.rightSwipeList, purchaseSavePop.rightSwipeList) && ValueObject.util_equals(this.ultraList, purchaseSavePop.ultraList);
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
        List<PurchaseSavePopUserID> list = this.seeList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<PurchaseSavePopUserID> list2 = this.rightSwipeList;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<PurchaseSavePopUserID> list3 = this.ultraList;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.seeList == null) {
            this.seeList = new ArrayList();
        }
        if (this.rightSwipeList == null) {
            this.rightSwipeList = new ArrayList();
        }
        if (this.ultraList == null) {
            this.ultraList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
