package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CoreExpandedCardConfigV2;
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
public class CoreExpandedCardConfigV2 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coreexpandedcardconfigv2";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> default_order;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> sections_order;
    public static ProtobufAdapter<CoreExpandedCardConfigV2> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreExpandedCardConfigV2>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfigV2.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreExpandedCardConfigV2 coreExpandedCardConfigV2) {
            List<String> list = coreExpandedCardConfigV2.sections_order;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = coreExpandedCardConfigV2.default_order;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) coreExpandedCardConfigV2).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreExpandedCardConfigV2 m12461parse(nb5 nb5Var) throws IOException {
            CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = new CoreExpandedCardConfigV2();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coreExpandedCardConfigV2.sections_order == null) {
                        coreExpandedCardConfigV2.sections_order = new ArrayList();
                    }
                    if (coreExpandedCardConfigV2.default_order != null) {
                        break;
                    }
                    coreExpandedCardConfigV2.default_order = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    coreExpandedCardConfigV2.sections_order = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (coreExpandedCardConfigV2.sections_order == null) {
                            coreExpandedCardConfigV2.sections_order = new ArrayList();
                        }
                        if (coreExpandedCardConfigV2.default_order != null) {
                            break;
                        }
                        coreExpandedCardConfigV2.default_order = new ArrayList();
                        return coreExpandedCardConfigV2;
                    }
                    coreExpandedCardConfigV2.default_order = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return coreExpandedCardConfigV2;
        }

        public void serialize(CoreExpandedCardConfigV2 coreExpandedCardConfigV2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = coreExpandedCardConfigV2.sections_order;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = coreExpandedCardConfigV2.default_order;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CoreExpandedCardConfigV2> JSON_ADAPTER = new ObjectJsonAdapter<CoreExpandedCardConfigV2>() { // from class: com.p1.mobile.putong.core.data.CoreExpandedCardConfigV2.2
        public Class getDataClass() {
            return CoreExpandedCardConfigV2.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreExpandedCardConfigV2 m12462newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreExpandedCardConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreExpandedCardConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m280a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m281b(String str) {
        return str;
    }

    public static CoreExpandedCardConfigV2 new_() {
        CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = new CoreExpandedCardConfigV2();
        coreExpandedCardConfigV2.nullCheck();
        return coreExpandedCardConfigV2;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreExpandedCardConfigV2 m12460clone() {
        CoreExpandedCardConfigV2 coreExpandedCardConfigV2 = new CoreExpandedCardConfigV2();
        List<String> list = this.sections_order;
        if (list != null) {
            coreExpandedCardConfigV2.sections_order = ValueObject.util_map(list, new w9j() { // from class: l.ap8
                public final Object call(Object obj) {
                    return CoreExpandedCardConfigV2.m280a((String) obj);
                }
            });
        }
        List<String> list2 = this.default_order;
        if (list2 != null) {
            coreExpandedCardConfigV2.default_order = ValueObject.util_map(list2, new w9j() { // from class: l.bp8
                public final Object call(Object obj) {
                    return CoreExpandedCardConfigV2.m281b((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.sections_order;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.default_order;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.sections_order == null) {
            this.sections_order = new ArrayList();
        }
        if (this.default_order == null) {
            this.default_order = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
