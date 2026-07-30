package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.MomentBoostVouchers;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Vouchers vouchers) {
            List<MomentBoostVouchers> list = vouchers.generalVouchers;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<MomentBoostVouchers> list2 = vouchers.svipVouchers;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) vouchers).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Vouchers m19834parse(nb5 nb5Var) throws IOException {
            Vouchers vouchers = new Vouchers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (vouchers.generalVouchers == null) {
                        vouchers.generalVouchers = new ArrayList();
                    }
                    if (vouchers.svipVouchers != null) {
                        break;
                    }
                    vouchers.svipVouchers = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    vouchers.generalVouchers = (List) nb5Var.l(MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (vouchers.generalVouchers == null) {
                            vouchers.generalVouchers = new ArrayList();
                        }
                        if (vouchers.svipVouchers != null) {
                            break;
                        }
                        vouchers.svipVouchers = new ArrayList();
                        return vouchers;
                    }
                    vouchers.svipVouchers = (List) nb5Var.l(MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return vouchers;
        }

        public void serialize(Vouchers vouchers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MomentBoostVouchers> list = vouchers.generalVouchers;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentBoostVouchers> list2 = vouchers.svipVouchers;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, MomentBoostVouchers.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Vouchers> JSON_ADAPTER = new ObjectJsonAdapter<Vouchers>() { // from class: com.p1.mobile.putong.feed.data.Vouchers.2
        public Class getDataClass() {
            return Vouchers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Vouchers mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Vouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Vouchers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Vouchers new_() {
        Vouchers vouchers = new Vouchers();
        vouchers.nullCheck();
        return vouchers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Vouchers m19833clone() {
        Vouchers vouchers = new Vouchers();
        List<MomentBoostVouchers> list = this.generalVouchers;
        if (list != null) {
            vouchers.generalVouchers = ValueObject.util_map(list, new w9j() { // from class: l.cep0
                public final Object call(Object obj) {
                    return ((MomentBoostVouchers) obj).m19601clone();
                }
            });
        }
        List<MomentBoostVouchers> list2 = this.svipVouchers;
        if (list2 != null) {
            vouchers.svipVouchers = ValueObject.util_map(list2, new w9j() { // from class: l.dep0
                public final Object call(Object obj) {
                    return ((MomentBoostVouchers) obj).m19601clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<MomentBoostVouchers> list = this.generalVouchers;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<MomentBoostVouchers> list2 = this.svipVouchers;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.generalVouchers == null) {
            this.generalVouchers = new ArrayList();
        }
        if (this.svipVouchers == null) {
            this.svipVouchers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
