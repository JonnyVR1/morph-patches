package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.MomentBoostVouchers;
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
public class Vouchers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "vouchers";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MomentBoostVouchers> generalVouchers;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<MomentBoostVouchers> svipVouchers;
    public static ProtobufAdapter<Vouchers> PROTOBUF_ADAPTER = new MessageNanoAdapter<Vouchers>() { // from class: com.p1.mobile.putong.feed.data.Vouchers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Vouchers vouchers) {
            List<MomentBoostVouchers> list = vouchers.generalVouchers;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<MomentBoostVouchers> list2 = vouchers.svipVouchers;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            vouchers.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Vouchers parse(nb5 nb5Var) throws IOException {
            Vouchers vouchers = new Vouchers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (vouchers.generalVouchers == null) {
                        vouchers.generalVouchers = new ArrayList();
                    }
                    if (vouchers.svipVouchers != null) {
                        break;
                    }
                    vouchers.svipVouchers = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    vouchers.generalVouchers = (List) nb5Var.m158743l(MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (vouchers.generalVouchers == null) {
                            vouchers.generalVouchers = new ArrayList();
                        }
                        if (vouchers.svipVouchers != null) {
                            break;
                        }
                        vouchers.svipVouchers = new ArrayList();
                        return vouchers;
                    }
                    vouchers.svipVouchers = (List) nb5Var.m158743l(MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return vouchers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Vouchers vouchers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MomentBoostVouchers> list = vouchers.generalVouchers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentBoostVouchers> list2 = vouchers.svipVouchers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Vouchers> JSON_ADAPTER = new ObjectJsonAdapter<Vouchers>() { // from class: com.p1.mobile.putong.feed.data.Vouchers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Vouchers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Vouchers newInstance() {
            return new Vouchers();
        }

        public boolean parseField(Vouchers vouchers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("svipVouchers")) {
                vouchers.svipVouchers = JsonAdapter.parseArray(jsonParser, MomentBoostVouchers.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("generalVouchers")) {
                return false;
            }
            vouchers.generalVouchers = JsonAdapter.parseArray(jsonParser, MomentBoostVouchers.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Vouchers vouchers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("svipVouchers") || str.equals("generalVouchers")) {
                return true;
            }
            return super.parseFieldCheck(vouchers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Vouchers vouchers, JsonGenerator jsonGenerator) throws IOException {
            if (vouchers.generalVouchers != null) {
                jsonGenerator.writeFieldName("generalVouchers");
                JsonAdapter.serializeArray(vouchers.generalVouchers, jsonGenerator, MomentBoostVouchers.JSON_ADAPTER);
            }
            if (vouchers.svipVouchers != null) {
                jsonGenerator.writeFieldName("svipVouchers");
                JsonAdapter.serializeArray(vouchers.svipVouchers, jsonGenerator, MomentBoostVouchers.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Vouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Vouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Vouchers new_() {
        Vouchers vouchers = new Vouchers();
        vouchers.nullCheck();
        return vouchers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Vouchers mo223809clone() {
        Vouchers vouchers = new Vouchers();
        List<MomentBoostVouchers> list = this.generalVouchers;
        if (list != null) {
            vouchers.generalVouchers = ValueObject.util_map(list, new w9j() { // from class: l.cep0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MomentBoostVouchers) obj).mo223809clone();
                }
            });
        }
        List<MomentBoostVouchers> list2 = this.svipVouchers;
        if (list2 != null) {
            vouchers.svipVouchers = ValueObject.util_map(list2, new w9j() { // from class: l.dep0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MomentBoostVouchers) obj).mo223809clone();
                }
            });
        }
        return vouchers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vouchers)) {
            return false;
        }
        Vouchers vouchers = (Vouchers) obj;
        return ValueObject.util_equals(this.generalVouchers, vouchers.generalVouchers) && ValueObject.util_equals(this.svipVouchers, vouchers.svipVouchers);
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
        List<MomentBoostVouchers> list = this.generalVouchers;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<MomentBoostVouchers> list2 = this.svipVouchers;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.generalVouchers == null) {
            this.generalVouchers = new ArrayList();
        }
        if (this.svipVouchers == null) {
            this.svipVouchers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
