package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.SuggestReason;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
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
public class SuggestReason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestreason";

    @NonNull
    @ProtobufIndex(index = 3)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> value;
    public static ProtobufAdapter<SuggestReason> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestReason>() { // from class: com.p1.mobile.putong.core.data.SuggestReason.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuggestReason suggestReason) {
            String str = suggestReason.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = suggestReason.value;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = suggestReason.owner;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            suggestReason.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuggestReason parse(nc5 nc5Var) throws IOException {
            SuggestReason suggestReason = new SuggestReason();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (suggestReason.type == null) {
                        suggestReason.type = "";
                    }
                    if (suggestReason.value == null) {
                        suggestReason.value = new ArrayList();
                    }
                    if (suggestReason.owner != null) {
                        break;
                    }
                    suggestReason.owner = "";
                    break;
                }
                if (iM162497u == 10) {
                    suggestReason.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    suggestReason.value = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (suggestReason.type == null) {
                            suggestReason.type = "";
                        }
                        if (suggestReason.value == null) {
                            suggestReason.value = new ArrayList();
                        }
                        if (suggestReason.owner != null) {
                            break;
                        }
                        suggestReason.owner = "";
                        return suggestReason;
                    }
                    suggestReason.owner = nc5Var.m162495s();
                }
            }
            return suggestReason;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuggestReason suggestReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = suggestReason.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = suggestReason.value;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = suggestReason.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<SuggestReason> JSON_ADAPTER = new ObjectJsonAdapter<SuggestReason>() { // from class: com.p1.mobile.putong.core.data.SuggestReason.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuggestReason.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuggestReason newInstance() {
            return new SuggestReason();
        }

        public boolean parseField(SuggestReason suggestReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "type":
                    suggestReason.type = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    suggestReason.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "value":
                    suggestReason.value = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SuggestReason suggestReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "type":
                case "owner":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(suggestReason, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuggestReason suggestReason, JsonGenerator jsonGenerator) throws IOException {
            String str = suggestReason.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (suggestReason.value != null) {
                jsonGenerator.writeFieldName("value");
                JsonAdapter.serializeArray(suggestReason.value, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (suggestReason.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(suggestReason.owner, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36868a(String str) {
        return str;
    }

    public static SuggestReason new_() {
        SuggestReason suggestReason = new SuggestReason();
        suggestReason.nullCheck();
        return suggestReason;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuggestReason mo225055clone() {
        SuggestReason suggestReason = new SuggestReason();
        suggestReason.type = this.type;
        List<String> list = this.value;
        if (list != null) {
            suggestReason.value = ValueObject.util_map(list, new qcj() { // from class: l.b2h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return SuggestReason.m36868a((String) obj);
                }
            });
        }
        suggestReason.owner = this.owner;
        return suggestReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestReason)) {
            return false;
        }
        SuggestReason suggestReason = (SuggestReason) obj;
        return ValueObject.util_equals(this.type, suggestReason.type) && ValueObject.util_equals(this.value, suggestReason.value) && ValueObject.util_equals(this.owner, suggestReason.owner);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.value;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.value == null) {
            this.value = new ArrayList();
        }
        if (this.owner == null) {
            this.owner = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
