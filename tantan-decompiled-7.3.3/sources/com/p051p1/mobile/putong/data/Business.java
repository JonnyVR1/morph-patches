package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Business;
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

/* JADX INFO: loaded from: classes12.dex */
public class Business extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "business";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> avatarClose;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Long> avatarExpireTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> avatarID;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> cardType;
    public static ProtobufAdapter<Business> PROTOBUF_ADAPTER = new MessageNanoAdapter<Business>() { // from class: com.p1.mobile.putong.data.Business.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Business business) {
            List<String> list = business.cardType;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = business.avatarID;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list3 = business.avatarExpireTime;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = business.avatarClose;
            if (list4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            business.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Business parse(nc5 nc5Var) throws IOException {
            Business business = new Business();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (business.cardType == null) {
                        business.cardType = new ArrayList();
                    }
                    if (business.avatarID == null) {
                        business.avatarID = new ArrayList();
                    }
                    if (business.avatarExpireTime == null) {
                        business.avatarExpireTime = new ArrayList();
                    }
                    if (business.avatarClose != null) {
                        break;
                    }
                    business.avatarClose = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    business.cardType = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    business.avatarID = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 26) {
                    business.avatarExpireTime = (List) nc5Var.m162488l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 34) {
                        if (business.cardType == null) {
                            business.cardType = new ArrayList();
                        }
                        if (business.avatarID == null) {
                            business.avatarID = new ArrayList();
                        }
                        if (business.avatarExpireTime == null) {
                            business.avatarExpireTime = new ArrayList();
                        }
                        if (business.avatarClose != null) {
                            break;
                        }
                        business.avatarClose = new ArrayList();
                        return business;
                    }
                    business.avatarClose = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return business;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Business business, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = business.cardType;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = business.avatarID;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list3 = business.avatarExpireTime;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = business.avatarClose;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Business> JSON_ADAPTER = new ObjectJsonAdapter<Business>() { // from class: com.p1.mobile.putong.data.Business.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Business.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Business newInstance() {
            return new Business();
        }

        public boolean parseField(Business business, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cardType":
                    business.cardType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "avatarExpireTime":
                    business.avatarExpireTime = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "avatarClose":
                    business.avatarClose = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "avatarID":
                    business.avatarID = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Business business, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cardType":
                case "avatarExpireTime":
                case "avatarClose":
                case "avatarID":
                    return true;
                default:
                    return super.parseFieldCheck(business, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Business business, JsonGenerator jsonGenerator) throws IOException {
            if (business.cardType != null) {
                jsonGenerator.writeFieldName("cardType");
                JsonAdapter.serializeArray(business.cardType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (business.avatarID != null) {
                jsonGenerator.writeFieldName("avatarID");
                JsonAdapter.serializeArray(business.avatarID, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (business.avatarExpireTime != null) {
                jsonGenerator.writeFieldName("avatarExpireTime");
                JsonAdapter.serializeArray(business.avatarExpireTime, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            if (business.avatarClose != null) {
                jsonGenerator.writeFieldName("avatarClose");
                JsonAdapter.serializeArray(business.avatarClose, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Business) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Business) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60873a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Long m60874b(Long l2) {
        return l2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m60875c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m60876d(String str) {
        return str;
    }

    public static Business new_() {
        Business business = new Business();
        business.nullCheck();
        return business;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Business mo225055clone() {
        Business business = new Business();
        List<String> list = this.cardType;
        if (list != null) {
            business.cardType = ValueObject.util_map(list, new qcj() { // from class: l.ij3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Business.m60876d((String) obj);
                }
            });
        }
        List<String> list2 = this.avatarID;
        if (list2 != null) {
            business.avatarID = ValueObject.util_map(list2, new qcj() { // from class: l.jj3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Business.m60873a((String) obj);
                }
            });
        }
        List<Long> list3 = this.avatarExpireTime;
        if (list3 != null) {
            business.avatarExpireTime = ValueObject.util_map(list3, new qcj() { // from class: l.kj3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Business.m60874b((Long) obj);
                }
            });
        }
        List<String> list4 = this.avatarClose;
        if (list4 != null) {
            business.avatarClose = ValueObject.util_map(list4, new qcj() { // from class: l.lj3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Business.m60875c((String) obj);
                }
            });
        }
        return business;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Business)) {
            return false;
        }
        Business business = (Business) obj;
        return ValueObject.util_equals(this.cardType, business.cardType) && ValueObject.util_equals(this.avatarID, business.avatarID) && ValueObject.util_equals(this.avatarExpireTime, business.avatarExpireTime) && ValueObject.util_equals(this.avatarClose, business.avatarClose);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "business";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.cardType;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.avatarID;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Long> list3 = this.avatarExpireTime;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.avatarClose;
        int iHashCode4 = iHashCode3 + (list4 != null ? list4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cardType == null) {
            this.cardType = new ArrayList();
        }
        if (this.avatarID == null) {
            this.avatarID = new ArrayList();
        }
        if (this.avatarExpireTime == null) {
            this.avatarExpireTime = new ArrayList();
        }
        if (this.avatarClose == null) {
            this.avatarClose = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
