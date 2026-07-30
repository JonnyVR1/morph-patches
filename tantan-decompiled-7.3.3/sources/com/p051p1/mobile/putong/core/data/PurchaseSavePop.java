package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PurchaseSavePopUserID;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class PurchaseSavePop extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purchasesavepop";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<PurchaseSavePopUserID> rightSwipeList;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<PurchaseSavePopUserID> seeList;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<PurchaseSavePopUserID> ultraList;
    public static ProtobufAdapter<PurchaseSavePop> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurchaseSavePop>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePop.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurchaseSavePop purchaseSavePop) {
            List<PurchaseSavePopUserID> list = purchaseSavePop.seeList;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<PurchaseSavePopUserID> list2 = purchaseSavePop.rightSwipeList;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseSavePopUserID> list3 = purchaseSavePop.ultraList;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            purchaseSavePop.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurchaseSavePop parse(nc5 nc5Var) throws IOException {
            PurchaseSavePop purchaseSavePop = new PurchaseSavePop();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    purchaseSavePop.seeList = (List) nc5Var.m162488l(PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    purchaseSavePop.rightSwipeList = (List) nc5Var.m162488l(PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
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
                    purchaseSavePop.ultraList = (List) nc5Var.m162488l(PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return purchaseSavePop;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurchaseSavePop purchaseSavePop, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<PurchaseSavePopUserID> list = purchaseSavePop.seeList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseSavePopUserID> list2 = purchaseSavePop.rightSwipeList;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<PurchaseSavePopUserID> list3 = purchaseSavePop.ultraList;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, PurchaseSavePopUserID.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PurchaseSavePop> JSON_ADAPTER = new ObjectJsonAdapter<PurchaseSavePop>() { // from class: com.p1.mobile.putong.core.data.PurchaseSavePop.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurchaseSavePop.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurchaseSavePop newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurchaseSavePop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurchaseSavePop) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PurchaseSavePop new_() {
        PurchaseSavePop purchaseSavePop = new PurchaseSavePop();
        purchaseSavePop.nullCheck();
        return purchaseSavePop;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurchaseSavePop mo225055clone() {
        PurchaseSavePop purchaseSavePop = new PurchaseSavePop();
        List<PurchaseSavePopUserID> list = this.seeList;
        if (list != null) {
            purchaseSavePop.seeList = ValueObject.util_map(list, new qcj() { // from class: l.jhb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PurchaseSavePopUserID) obj).mo225055clone();
                }
            });
        }
        List<PurchaseSavePopUserID> list2 = this.rightSwipeList;
        if (list2 != null) {
            purchaseSavePop.rightSwipeList = ValueObject.util_map(list2, new qcj() { // from class: l.khb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PurchaseSavePopUserID) obj).mo225055clone();
                }
            });
        }
        List<PurchaseSavePopUserID> list3 = this.ultraList;
        if (list3 != null) {
            purchaseSavePop.ultraList = ValueObject.util_map(list3, new qcj() { // from class: l.lhb0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PurchaseSavePopUserID) obj).mo225055clone();
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
        List<PurchaseSavePopUserID> list = this.seeList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<PurchaseSavePopUserID> list2 = this.rightSwipeList;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<PurchaseSavePopUserID> list3 = this.ultraList;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
