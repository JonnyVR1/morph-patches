package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.PetInfo;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class PetInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "petinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> hasPet;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> name;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> petType;
    public static ProtobufAdapter<PetInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PetInfo>() { // from class: com.p1.mobile.putong.data.PetInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PetInfo petInfo) {
            List<String> list = petInfo.hasPet;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = petInfo.petType;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = petInfo.name;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) petInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PetInfo m18792parse(nb5 nb5Var) throws IOException {
            PetInfo petInfo = new PetInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (petInfo.hasPet == null) {
                        petInfo.hasPet = new ArrayList();
                    }
                    if (petInfo.petType == null) {
                        petInfo.petType = new ArrayList();
                    }
                    if (petInfo.name != null) {
                        break;
                    }
                    petInfo.name = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    petInfo.hasPet = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    petInfo.petType = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (petInfo.hasPet == null) {
                            petInfo.hasPet = new ArrayList();
                        }
                        if (petInfo.petType == null) {
                            petInfo.petType = new ArrayList();
                        }
                        if (petInfo.name != null) {
                            break;
                        }
                        petInfo.name = new ArrayList();
                        return petInfo;
                    }
                    petInfo.name = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return petInfo;
        }

        public void serialize(PetInfo petInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = petInfo.hasPet;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = petInfo.petType;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = petInfo.name;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PetInfo> JSON_ADAPTER = new ObjectJsonAdapter<PetInfo>() { // from class: com.p1.mobile.putong.data.PetInfo.2
        public Class getDataClass() {
            return PetInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PetInfo mo17830newInstance() {
            return new PetInfo();
        }

        public boolean parseField(PetInfo petInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hasPet":
                    petInfo.hasPet = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "petType":
                    petInfo.petType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "name":
                    petInfo.name = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PetInfo petInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hasPet":
                case "petType":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(petInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PetInfo petInfo, JsonGenerator jsonGenerator) throws IOException {
            if (petInfo.hasPet != null) {
                jsonGenerator.writeFieldName("hasPet");
                JsonAdapter.serializeArray(petInfo.hasPet, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (petInfo.petType != null) {
                jsonGenerator.writeFieldName("petType");
                JsonAdapter.serializeArray(petInfo.petType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (petInfo.name != null) {
                jsonGenerator.writeFieldName("name");
                JsonAdapter.serializeArray(petInfo.name, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m901a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m902b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m903c(String str) {
        return str;
    }

    public static PetInfo new_() {
        PetInfo petInfo = new PetInfo();
        petInfo.nullCheck();
        return petInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PetInfo m18791clone() {
        PetInfo petInfo = new PetInfo();
        List<String> list = this.hasPet;
        if (list != null) {
            petInfo.hasPet = ValueObject.util_map(list, new w9j() { // from class: l.to60
                public final Object call(Object obj) {
                    return PetInfo.m901a((String) obj);
                }
            });
        }
        List<String> list2 = this.petType;
        if (list2 != null) {
            petInfo.petType = ValueObject.util_map(list2, new w9j() { // from class: l.uo60
                public final Object call(Object obj) {
                    return PetInfo.m903c((String) obj);
                }
            });
        }
        List<String> list3 = this.name;
        if (list3 != null) {
            petInfo.name = ValueObject.util_map(list3, new w9j() { // from class: l.vo60
                public final Object call(Object obj) {
                    return PetInfo.m902b((String) obj);
                }
            });
        }
        return petInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PetInfo)) {
            return false;
        }
        PetInfo petInfo = (PetInfo) obj;
        return ValueObject.util_equals(this.hasPet, petInfo.hasPet) && ValueObject.util_equals(this.petType, petInfo.petType) && ValueObject.util_equals(this.name, petInfo.name);
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
        List<String> list = this.hasPet;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.petType;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.name;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.hasPet == null) {
            this.hasPet = new ArrayList();
        }
        if (this.petType == null) {
            this.petType = new ArrayList();
        }
        if (this.name == null) {
            this.name = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
