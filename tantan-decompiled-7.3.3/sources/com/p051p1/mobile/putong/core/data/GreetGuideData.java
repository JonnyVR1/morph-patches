package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.GreetGuideData;
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
public class GreetGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetguidedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> abGroups;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> female;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> male;
    public static ProtobufAdapter<GreetGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetGuideData>() { // from class: com.p1.mobile.putong.core.data.GreetGuideData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetGuideData greetGuideData) {
            List<String> list = greetGuideData.abGroups;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = greetGuideData.male;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = greetGuideData.female;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            greetGuideData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetGuideData parse(nc5 nc5Var) throws IOException {
            GreetGuideData greetGuideData = new GreetGuideData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (greetGuideData.abGroups == null) {
                        greetGuideData.abGroups = new ArrayList();
                    }
                    if (greetGuideData.male == null) {
                        greetGuideData.male = new ArrayList();
                    }
                    if (greetGuideData.female != null) {
                        break;
                    }
                    greetGuideData.female = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    greetGuideData.abGroups = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    greetGuideData.male = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (greetGuideData.abGroups == null) {
                            greetGuideData.abGroups = new ArrayList();
                        }
                        if (greetGuideData.male == null) {
                            greetGuideData.male = new ArrayList();
                        }
                        if (greetGuideData.female != null) {
                            break;
                        }
                        greetGuideData.female = new ArrayList();
                        return greetGuideData;
                    }
                    greetGuideData.female = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return greetGuideData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetGuideData greetGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = greetGuideData.abGroups;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = greetGuideData.male;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = greetGuideData.female;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GreetGuideData> JSON_ADAPTER = new ObjectJsonAdapter<GreetGuideData>() { // from class: com.p1.mobile.putong.core.data.GreetGuideData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetGuideData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetGuideData newInstance() {
            return new GreetGuideData();
        }

        public boolean parseField(GreetGuideData greetGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "female":
                    greetGuideData.female = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "male":
                    greetGuideData.male = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "abGroups":
                    greetGuideData.abGroups = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetGuideData greetGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "female":
                case "male":
                case "abGroups":
                    return true;
                default:
                    return super.parseFieldCheck(greetGuideData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetGuideData greetGuideData, JsonGenerator jsonGenerator) throws IOException {
            if (greetGuideData.abGroups != null) {
                jsonGenerator.writeFieldName("abGroups");
                JsonAdapter.serializeArray(greetGuideData.abGroups, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (greetGuideData.male != null) {
                jsonGenerator.writeFieldName("male");
                JsonAdapter.serializeArray(greetGuideData.male, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (greetGuideData.female != null) {
                jsonGenerator.writeFieldName("female");
                JsonAdapter.serializeArray(greetGuideData.female, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36561a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36562b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m36563c(String str) {
        return str;
    }

    public static GreetGuideData new_() {
        GreetGuideData greetGuideData = new GreetGuideData();
        greetGuideData.nullCheck();
        return greetGuideData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetGuideData mo225055clone() {
        GreetGuideData greetGuideData = new GreetGuideData();
        List<String> list = this.abGroups;
        if (list != null) {
            greetGuideData.abGroups = ValueObject.util_map(list, new qcj() { // from class: l.dck
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return GreetGuideData.m36562b((String) obj);
                }
            });
        }
        List<String> list2 = this.male;
        if (list2 != null) {
            greetGuideData.male = ValueObject.util_map(list2, new qcj() { // from class: l.eck
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return GreetGuideData.m36561a((String) obj);
                }
            });
        }
        List<String> list3 = this.female;
        if (list3 != null) {
            greetGuideData.female = ValueObject.util_map(list3, new qcj() { // from class: l.fck
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return GreetGuideData.m36563c((String) obj);
                }
            });
        }
        return greetGuideData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetGuideData)) {
            return false;
        }
        GreetGuideData greetGuideData = (GreetGuideData) obj;
        return ValueObject.util_equals(this.abGroups, greetGuideData.abGroups) && ValueObject.util_equals(this.male, greetGuideData.male) && ValueObject.util_equals(this.female, greetGuideData.female);
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
        List<String> list = this.abGroups;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.male;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.female;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.abGroups == null) {
            this.abGroups = new ArrayList();
        }
        if (this.male == null) {
            this.male = new ArrayList();
        }
        if (this.female == null) {
            this.female = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
