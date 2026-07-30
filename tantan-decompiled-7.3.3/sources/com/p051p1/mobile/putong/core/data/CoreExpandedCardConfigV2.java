package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CoreExpandedCardConfigV2;
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
public class CoreExpandedCardConfigV2 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreexpandedcardconfigv2";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> default_order;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> sections_order;
    public static ProtobufAdapter<CoreExpandedCardConfigV2> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreExpandedCardConfigV2>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfigV2.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreExpandedCardConfigV2 coreExpandedCardConfigV2) {
            List<String> list = coreExpandedCardConfigV2.sections_order;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = coreExpandedCardConfigV2.default_order;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            coreExpandedCardConfigV2.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreExpandedCardConfigV2 parse(nc5 nc5Var) throws IOException {
            CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = new CoreExpandedCardConfigV2();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (coreExpandedCardConfigV2.sections_order == null) {
                        coreExpandedCardConfigV2.sections_order = new ArrayList();
                    }
                    if (coreExpandedCardConfigV2.default_order != null) {
                        break;
                    }
                    coreExpandedCardConfigV2.default_order = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    coreExpandedCardConfigV2.sections_order = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (coreExpandedCardConfigV2.sections_order == null) {
                            coreExpandedCardConfigV2.sections_order = new ArrayList();
                        }
                        if (coreExpandedCardConfigV2.default_order != null) {
                            break;
                        }
                        coreExpandedCardConfigV2.default_order = new ArrayList();
                        return coreExpandedCardConfigV2;
                    }
                    coreExpandedCardConfigV2.default_order = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return coreExpandedCardConfigV2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreExpandedCardConfigV2 coreExpandedCardConfigV2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = coreExpandedCardConfigV2.sections_order;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = coreExpandedCardConfigV2.default_order;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CoreExpandedCardConfigV2> JSON_ADAPTER = new ObjectJsonAdapter<CoreExpandedCardConfigV2>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfigV2.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreExpandedCardConfigV2.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreExpandedCardConfigV2 newInstance() {
            return new CoreExpandedCardConfigV2();
        }

        public boolean parseField(CoreExpandedCardConfigV2 coreExpandedCardConfigV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("sections_order")) {
                coreExpandedCardConfigV2.sections_order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("default_order")) {
                return false;
            }
            coreExpandedCardConfigV2.default_order = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CoreExpandedCardConfigV2 coreExpandedCardConfigV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("sections_order") || str.equals("default_order")) {
                return true;
            }
            return super.parseFieldCheck(coreExpandedCardConfigV2, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreExpandedCardConfigV2 coreExpandedCardConfigV2, JsonGenerator jsonGenerator) throws IOException {
            if (coreExpandedCardConfigV2.sections_order != null) {
                jsonGenerator.writeFieldName("sections_order");
                JsonAdapter.serializeArray(coreExpandedCardConfigV2.sections_order, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (coreExpandedCardConfigV2.default_order != null) {
                jsonGenerator.writeFieldName("default_order");
                JsonAdapter.serializeArray(coreExpandedCardConfigV2.default_order, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreExpandedCardConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreExpandedCardConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36481a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36482b(String str) {
        return str;
    }

    public static CoreExpandedCardConfigV2 new_() {
        CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = new CoreExpandedCardConfigV2();
        coreExpandedCardConfigV2.nullCheck();
        return coreExpandedCardConfigV2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreExpandedCardConfigV2 mo225055clone() {
        CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = new CoreExpandedCardConfigV2();
        List<String> list = this.sections_order;
        if (list != null) {
            coreExpandedCardConfigV2.sections_order = ValueObject.util_map(list, new qcj() { // from class: l.fq8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreExpandedCardConfigV2.m36481a((String) obj);
                }
            });
        }
        List<String> list2 = this.default_order;
        if (list2 != null) {
            coreExpandedCardConfigV2.default_order = ValueObject.util_map(list2, new qcj() { // from class: l.gq8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreExpandedCardConfigV2.m36482b((String) obj);
                }
            });
        }
        return coreExpandedCardConfigV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreExpandedCardConfigV2)) {
            return false;
        }
        CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = (CoreExpandedCardConfigV2) obj;
        return ValueObject.util_equals(this.sections_order, coreExpandedCardConfigV2.sections_order) && ValueObject.util_equals(this.default_order, coreExpandedCardConfigV2.default_order);
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
        List<String> list = this.sections_order;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.default_order;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sections_order == null) {
            this.sections_order = new ArrayList();
        }
        if (this.default_order == null) {
            this.default_order = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
