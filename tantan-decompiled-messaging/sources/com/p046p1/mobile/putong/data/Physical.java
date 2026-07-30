package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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

/* JADX INFO: loaded from: classes12.dex */
public class Physical extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "physical";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BloodType> bloodType;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> drink;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> fitness;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<String> height;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<String> heightImg;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> smoke;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> weight;
    public static ProtobufAdapter<Physical> PROTOBUF_ADAPTER = new MessageNanoAdapter<Physical>() { // from class: com.p1.mobile.putong.data.Physical.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Physical physical) {
            List<BloodType> list = physical.bloodType;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, BloodType.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<BloodType> list2 = physical.bloodType;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = physical.height;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = physical.heightImg;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = physical.weight;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = physical.fitness;
            if (list6 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = physical.drink;
            if (list7 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = physical.smoke;
            if (list8 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            physical.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Physical parse(nb5 nb5Var) throws IOException {
            Physical physical = new Physical();
            List list = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (physical.bloodType == null && list != null) {
                        physical.bloodType = BloodType.oldEnumCovertList(list);
                    }
                    if (physical.bloodType == null) {
                        physical.bloodType = new ArrayList();
                    }
                    if (physical.weight == null) {
                        physical.weight = new ArrayList();
                    }
                    if (physical.fitness == null) {
                        physical.fitness = new ArrayList();
                    }
                    if (physical.drink == null) {
                        physical.drink = new ArrayList();
                    }
                    if (physical.smoke != null) {
                        break;
                    }
                    physical.smoke = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    physical.bloodType = (List) nb5Var.m158743l(BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    physical.height = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    physical.heightImg = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    physical.weight = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 50) {
                    physical.fitness = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 58) {
                    physical.drink = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 66) {
                        if (physical.bloodType == null && list != null) {
                            physical.bloodType = BloodType.oldEnumCovertList(list);
                        }
                        if (physical.bloodType == null) {
                            physical.bloodType = new ArrayList();
                        }
                        if (physical.weight == null) {
                            physical.weight = new ArrayList();
                        }
                        if (physical.fitness == null) {
                            physical.fitness = new ArrayList();
                        }
                        if (physical.drink == null) {
                            physical.drink = new ArrayList();
                        }
                        if (physical.smoke != null) {
                            break;
                        }
                        physical.smoke = new ArrayList();
                        return physical;
                    }
                    physical.smoke = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return physical;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Physical physical, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<BloodType> list = physical.bloodType;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, BloodType.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BloodType> list2 = physical.bloodType;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, BloodType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = physical.height;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = physical.heightImg;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = physical.weight;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = physical.fitness;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = physical.drink;
            if (list7 != null) {
                codedOutputByteBufferNano.m17254K(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = physical.smoke;
            if (list8 != null) {
                codedOutputByteBufferNano.m17254K(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Physical> JSON_ADAPTER = new ObjectJsonAdapter<Physical>() { // from class: com.p1.mobile.putong.data.Physical.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Physical.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Physical newInstance() {
            return new Physical();
        }

        public boolean parseField(Physical physical, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "heightImg":
                    physical.heightImg = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "height":
                    physical.height = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "fitness":
                    physical.fitness = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "weight":
                    physical.weight = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "drink":
                    physical.drink = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "smoke":
                    physical.smoke = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bloodType":
                    physical.bloodType = JsonAdapter.parseArray(jsonParser, BloodType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Physical physical, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "heightImg":
                case "height":
                case "fitness":
                case "weight":
                case "drink":
                case "smoke":
                case "bloodType":
                    return true;
                default:
                    return super.parseFieldCheck(physical, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Physical physical, JsonGenerator jsonGenerator) throws IOException {
            if (physical.bloodType != null) {
                jsonGenerator.writeFieldName("bloodType");
                JsonAdapter.serializeArray(physical.bloodType, jsonGenerator, BloodType.JSON_ADAPTER);
            }
            if (physical.height != null) {
                jsonGenerator.writeFieldName("height");
                JsonAdapter.serializeArray(physical.height, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (physical.heightImg != null) {
                jsonGenerator.writeFieldName("heightImg");
                JsonAdapter.serializeArray(physical.heightImg, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (physical.weight != null) {
                jsonGenerator.writeFieldName("weight");
                JsonAdapter.serializeArray(physical.weight, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (physical.fitness != null) {
                jsonGenerator.writeFieldName("fitness");
                JsonAdapter.serializeArray(physical.fitness, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (physical.drink != null) {
                jsonGenerator.writeFieldName("drink");
                JsonAdapter.serializeArray(physical.drink, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (physical.smoke != null) {
                jsonGenerator.writeFieldName("smoke");
                JsonAdapter.serializeArray(physical.smoke, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Physical) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Physical) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59986a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59987b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59988c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m59989d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BloodType m59990e(BloodType bloodType) {
        return bloodType;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m59991f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m59992k(String str) {
        return str;
    }

    public static Physical new_() {
        Physical physical = new Physical();
        physical.nullCheck();
        return physical;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Physical mo223809clone() {
        Physical physical = new Physical();
        List<BloodType> list = this.bloodType;
        if (list != null) {
            physical.bloodType = ValueObject.util_map(list, new w9j() { // from class: l.ub70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59990e((BloodType) obj);
                }
            });
        }
        List<String> list2 = this.height;
        if (list2 != null) {
            physical.height = ValueObject.util_map(list2, new w9j() { // from class: l.vb70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59986a((String) obj);
                }
            });
        }
        List<String> list3 = this.heightImg;
        if (list3 != null) {
            physical.heightImg = ValueObject.util_map(list3, new w9j() { // from class: l.wb70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59988c((String) obj);
                }
            });
        }
        List<String> list4 = this.weight;
        if (list4 != null) {
            physical.weight = ValueObject.util_map(list4, new w9j() { // from class: l.xb70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59989d((String) obj);
                }
            });
        }
        List<String> list5 = this.fitness;
        if (list5 != null) {
            physical.fitness = ValueObject.util_map(list5, new w9j() { // from class: l.yb70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59991f((String) obj);
                }
            });
        }
        List<String> list6 = this.drink;
        if (list6 != null) {
            physical.drink = ValueObject.util_map(list6, new w9j() { // from class: l.zb70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59992k((String) obj);
                }
            });
        }
        List<String> list7 = this.smoke;
        if (list7 != null) {
            physical.smoke = ValueObject.util_map(list7, new w9j() { // from class: l.ac70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Physical.m59987b((String) obj);
                }
            });
        }
        return physical;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Physical)) {
            return false;
        }
        Physical physical = (Physical) obj;
        return ValueObject.util_equals(this.bloodType, physical.bloodType) && ValueObject.util_equals(this.height, physical.height) && ValueObject.util_equals(this.heightImg, physical.heightImg) && ValueObject.util_equals(this.weight, physical.weight) && ValueObject.util_equals(this.fitness, physical.fitness) && ValueObject.util_equals(this.drink, physical.drink) && ValueObject.util_equals(this.smoke, physical.smoke);
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
        List<BloodType> list = this.bloodType;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.height;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.heightImg;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.weight;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.fitness;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.drink;
        int iHashCode6 = (iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<String> list7 = this.smoke;
        int iHashCode7 = iHashCode6 + (list7 != null ? list7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.bloodType == null) {
            this.bloodType = new ArrayList();
        }
        if (this.weight == null) {
            this.weight = new ArrayList();
        }
        if (this.fitness == null) {
            this.fitness = new ArrayList();
        }
        if (this.drink == null) {
            this.drink = new ArrayList();
        }
        if (this.smoke == null) {
            this.smoke = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
