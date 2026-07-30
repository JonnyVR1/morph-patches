package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SpryEmojiData;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: classes10.dex */
public class SpryEmojiData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spryemojidata";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> at_end;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> same_area;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> same_industry;
    public static ProtobufAdapter<SpryEmojiData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpryEmojiData>() { // from class: com.p1.mobile.putong.core.data.SpryEmojiData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpryEmojiData spryEmojiData) {
            List<String> list = spryEmojiData.same_industry;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = spryEmojiData.same_area;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = spryEmojiData.at_end;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            spryEmojiData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpryEmojiData parse(nb5 nb5Var) throws IOException {
            SpryEmojiData spryEmojiData = new SpryEmojiData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (spryEmojiData.same_industry == null) {
                        spryEmojiData.same_industry = new ArrayList();
                    }
                    if (spryEmojiData.same_area == null) {
                        spryEmojiData.same_area = new ArrayList();
                    }
                    if (spryEmojiData.at_end != null) {
                        break;
                    }
                    spryEmojiData.at_end = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    spryEmojiData.same_industry = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    spryEmojiData.same_area = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (spryEmojiData.same_industry == null) {
                            spryEmojiData.same_industry = new ArrayList();
                        }
                        if (spryEmojiData.same_area == null) {
                            spryEmojiData.same_area = new ArrayList();
                        }
                        if (spryEmojiData.at_end != null) {
                            break;
                        }
                        spryEmojiData.at_end = new ArrayList();
                        return spryEmojiData;
                    }
                    spryEmojiData.at_end = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return spryEmojiData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpryEmojiData spryEmojiData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = spryEmojiData.same_industry;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = spryEmojiData.same_area;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = spryEmojiData.at_end;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SpryEmojiData> JSON_ADAPTER = new ObjectJsonAdapter<SpryEmojiData>() { // from class: com.p1.mobile.putong.core.data.SpryEmojiData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpryEmojiData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpryEmojiData newInstance() {
            return new SpryEmojiData();
        }

        public boolean parseField(SpryEmojiData spryEmojiData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "at_end":
                    spryEmojiData.at_end = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "same_industry":
                    spryEmojiData.same_industry = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "same_area":
                    spryEmojiData.same_area = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpryEmojiData spryEmojiData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "at_end":
                case "same_industry":
                case "same_area":
                    return true;
                default:
                    return super.parseFieldCheck(spryEmojiData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpryEmojiData spryEmojiData, JsonGenerator jsonGenerator) throws IOException {
            if (spryEmojiData.same_industry != null) {
                jsonGenerator.writeFieldName("same_industry");
                JsonAdapter.serializeArray(spryEmojiData.same_industry, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (spryEmojiData.same_area != null) {
                jsonGenerator.writeFieldName("same_area");
                JsonAdapter.serializeArray(spryEmojiData.same_area, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (spryEmojiData.at_end != null) {
                jsonGenerator.writeFieldName("at_end");
                JsonAdapter.serializeArray(spryEmojiData.at_end, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpryEmojiData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpryEmojiData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35854a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35855b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35856c(String str) {
        return str;
    }

    public static SpryEmojiData new_() {
        SpryEmojiData spryEmojiData = new SpryEmojiData();
        spryEmojiData.nullCheck();
        return spryEmojiData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpryEmojiData mo223809clone() {
        SpryEmojiData spryEmojiData = new SpryEmojiData();
        List<String> list = this.same_industry;
        if (list != null) {
            spryEmojiData.same_industry = ValueObject.util_map(list, new w9j() { // from class: l.crf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SpryEmojiData.m35854a((String) obj);
                }
            });
        }
        List<String> list2 = this.same_area;
        if (list2 != null) {
            spryEmojiData.same_area = ValueObject.util_map(list2, new w9j() { // from class: l.drf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SpryEmojiData.m35856c((String) obj);
                }
            });
        }
        List<String> list3 = this.at_end;
        if (list3 != null) {
            spryEmojiData.at_end = ValueObject.util_map(list3, new w9j() { // from class: l.erf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SpryEmojiData.m35855b((String) obj);
                }
            });
        }
        return spryEmojiData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpryEmojiData)) {
            return false;
        }
        SpryEmojiData spryEmojiData = (SpryEmojiData) obj;
        return ValueObject.util_equals(this.same_industry, spryEmojiData.same_industry) && ValueObject.util_equals(this.same_area, spryEmojiData.same_area) && ValueObject.util_equals(this.at_end, spryEmojiData.at_end);
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
        List<String> list = this.same_industry;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.same_area;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.at_end;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.same_industry == null) {
            this.same_industry = new ArrayList();
        }
        if (this.same_area == null) {
            this.same_area = new ArrayList();
        }
        if (this.at_end == null) {
            this.at_end = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
