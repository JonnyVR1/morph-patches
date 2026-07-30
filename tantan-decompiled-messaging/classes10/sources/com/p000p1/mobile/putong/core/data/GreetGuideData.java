package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GreetGuideData;
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
public class GreetGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetguidedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> abGroups;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> female;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> male;
    public static ProtobufAdapter<GreetGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetGuideData>() { // from class: com.p1.mobile.putong.core.data.GreetGuideData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetGuideData greetGuideData) {
            List<String> list = greetGuideData.abGroups;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = greetGuideData.male;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = greetGuideData.female;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) greetGuideData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetGuideData m13005parse(nb5 nb5Var) throws IOException {
            GreetGuideData greetGuideData = new GreetGuideData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    greetGuideData.abGroups = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    greetGuideData.male = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
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
                    greetGuideData.female = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return greetGuideData;
        }

        public void serialize(GreetGuideData greetGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = greetGuideData.abGroups;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = greetGuideData.male;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = greetGuideData.female;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GreetGuideData> JSON_ADAPTER = new ObjectJsonAdapter<GreetGuideData>() { // from class: com.p1.mobile.putong.core.data.GreetGuideData.2
        public Class getDataClass() {
            return GreetGuideData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetGuideData m13006newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m360a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m361b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m362c(String str) {
        return str;
    }

    public static GreetGuideData new_() {
        GreetGuideData greetGuideData = new GreetGuideData();
        greetGuideData.nullCheck();
        return greetGuideData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetGuideData m13004clone() {
        GreetGuideData greetGuideData = new GreetGuideData();
        List<String> list = this.abGroups;
        if (list != null) {
            greetGuideData.abGroups = ValueObject.util_map(list, new w9j() { // from class: l.m9k
                public final Object call(Object obj) {
                    return GreetGuideData.m361b((String) obj);
                }
            });
        }
        List<String> list2 = this.male;
        if (list2 != null) {
            greetGuideData.male = ValueObject.util_map(list2, new w9j() { // from class: l.n9k
                public final Object call(Object obj) {
                    return GreetGuideData.m360a((String) obj);
                }
            });
        }
        List<String> list3 = this.female;
        if (list3 != null) {
            greetGuideData.female = ValueObject.util_map(list3, new w9j() { // from class: l.o9k
                public final Object call(Object obj) {
                    return GreetGuideData.m362c((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
