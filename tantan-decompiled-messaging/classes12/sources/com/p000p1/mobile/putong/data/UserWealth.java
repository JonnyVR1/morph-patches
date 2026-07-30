package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.UserWealth;
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
public class UserWealth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userwealth";

    @Nullable
    @ProtobufIndex(index = 3)
    public List<String> car;

    @Nullable
    @ProtobufIndex(index = 8)
    public List<String> carImg;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<String> house;

    @Nullable
    @ProtobufIndex(index = 9)
    public List<String> houseImg;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<String> houseRegion;

    @Nullable
    @ProtobufIndex(index = 6)
    public List<String> houseSubRegion;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<String> lowIncome;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<String> monthlyCost;

    @Nullable
    @ProtobufIndex(index = 7)
    public List<String> pet;

    @Nullable
    @ProtobufIndex(index = 10)
    public List<String> petImg;

    @Nullable
    @ProtobufIndex(index = 1)
    public List<String> upperIncome;
    public static ProtobufAdapter<UserWealth> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserWealth>() { // from class: com.p1.mobile.putong.data.UserWealth.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserWealth userWealth) {
            List<String> list = userWealth.upperIncome;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = userWealth.lowIncome;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = userWealth.car;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = userWealth.house;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = userWealth.houseRegion;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = userWealth.houseSubRegion;
            if (list6 != null) {
                iL += CodedOutputByteBufferNano.l(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = userWealth.pet;
            if (list7 != null) {
                iL += CodedOutputByteBufferNano.l(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = userWealth.carImg;
            if (list8 != null) {
                iL += CodedOutputByteBufferNano.l(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = userWealth.houseImg;
            if (list9 != null) {
                iL += CodedOutputByteBufferNano.l(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = userWealth.petImg;
            if (list10 != null) {
                iL += CodedOutputByteBufferNano.l(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list11 = userWealth.monthlyCost;
            if (list11 != null) {
                iL += CodedOutputByteBufferNano.l(11, list11, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) userWealth).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserWealth m19244parse(nb5 nb5Var) throws IOException {
            UserWealth userWealth = new UserWealth();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (userWealth.monthlyCost == null) {
                            userWealth.monthlyCost = new ArrayList();
                        }
                        break;
                    case 10:
                        userWealth.upperIncome = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        userWealth.lowIncome = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        userWealth.car = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        userWealth.house = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        userWealth.houseRegion = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        userWealth.houseSubRegion = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        userWealth.pet = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        userWealth.carImg = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        userWealth.houseImg = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        userWealth.petImg = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        userWealth.monthlyCost = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (userWealth.monthlyCost == null) {
                            userWealth.monthlyCost = new ArrayList();
                            return userWealth;
                        }
                        break;
                }
            }
            return userWealth;
        }

        public void serialize(UserWealth userWealth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = userWealth.upperIncome;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = userWealth.lowIncome;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = userWealth.car;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = userWealth.house;
            if (list4 != null) {
                codedOutputByteBufferNano.K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = userWealth.houseRegion;
            if (list5 != null) {
                codedOutputByteBufferNano.K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = userWealth.houseSubRegion;
            if (list6 != null) {
                codedOutputByteBufferNano.K(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = userWealth.pet;
            if (list7 != null) {
                codedOutputByteBufferNano.K(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = userWealth.carImg;
            if (list8 != null) {
                codedOutputByteBufferNano.K(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = userWealth.houseImg;
            if (list9 != null) {
                codedOutputByteBufferNano.K(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list10 = userWealth.petImg;
            if (list10 != null) {
                codedOutputByteBufferNano.K(10, list10, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list11 = userWealth.monthlyCost;
            if (list11 != null) {
                codedOutputByteBufferNano.K(11, list11, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserWealth> JSON_ADAPTER = new ObjectJsonAdapter<UserWealth>() { // from class: com.p1.mobile.putong.data.UserWealth.2
        public Class getDataClass() {
            return UserWealth.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserWealth mo17830newInstance() {
            return new UserWealth();
        }

        public boolean parseField(UserWealth userWealth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "carImg":
                    userWealth.carImg = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "lowIncome":
                    userWealth.lowIncome = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "petImg":
                    userWealth.petImg = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "upperIncome":
                    userWealth.upperIncome = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "houseImg":
                    userWealth.houseImg = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "car":
                    userWealth.car = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pet":
                    userWealth.pet = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "house":
                    userWealth.house = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "houseRegion":
                    userWealth.houseRegion = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "houseSubRegion":
                    userWealth.houseSubRegion = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "monthlyCost":
                    userWealth.monthlyCost = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserWealth userWealth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "carImg":
                case "lowIncome":
                case "petImg":
                case "upperIncome":
                case "houseImg":
                case "car":
                case "pet":
                case "house":
                case "houseRegion":
                case "houseSubRegion":
                case "monthlyCost":
                    return true;
                default:
                    return super.parseFieldCheck(userWealth, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserWealth userWealth, JsonGenerator jsonGenerator) throws IOException {
            if (userWealth.upperIncome != null) {
                jsonGenerator.writeFieldName("upperIncome");
                JsonAdapter.serializeArray(userWealth.upperIncome, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.lowIncome != null) {
                jsonGenerator.writeFieldName("lowIncome");
                JsonAdapter.serializeArray(userWealth.lowIncome, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.car != null) {
                jsonGenerator.writeFieldName("car");
                JsonAdapter.serializeArray(userWealth.car, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.house != null) {
                jsonGenerator.writeFieldName("house");
                JsonAdapter.serializeArray(userWealth.house, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.houseRegion != null) {
                jsonGenerator.writeFieldName("houseRegion");
                JsonAdapter.serializeArray(userWealth.houseRegion, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.houseSubRegion != null) {
                jsonGenerator.writeFieldName("houseSubRegion");
                JsonAdapter.serializeArray(userWealth.houseSubRegion, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.pet != null) {
                jsonGenerator.writeFieldName(Pet.TYPE);
                JsonAdapter.serializeArray(userWealth.pet, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.carImg != null) {
                jsonGenerator.writeFieldName("carImg");
                JsonAdapter.serializeArray(userWealth.carImg, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.houseImg != null) {
                jsonGenerator.writeFieldName("houseImg");
                JsonAdapter.serializeArray(userWealth.houseImg, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.petImg != null) {
                jsonGenerator.writeFieldName("petImg");
                JsonAdapter.serializeArray(userWealth.petImg, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (userWealth.monthlyCost != null) {
                jsonGenerator.writeFieldName("monthlyCost");
                JsonAdapter.serializeArray(userWealth.monthlyCost, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserWealth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserWealth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1057a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1058b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m1059c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m1060d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m1061e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m1062f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m1063k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m1064l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m1065m(String str) {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m1066n(String str) {
        return str;
    }

    public static UserWealth new_() {
        UserWealth userWealth = new UserWealth();
        userWealth.nullCheck();
        return userWealth;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m1067o(String str) {
        return str;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserWealth m19243clone() {
        UserWealth userWealth = new UserWealth();
        List<String> list = this.upperIncome;
        if (list != null) {
            userWealth.upperIncome = ValueObject.util_map(list, new w9j() { // from class: l.pbk0
                public final Object call(Object obj) {
                    return UserWealth.m1061e((String) obj);
                }
            });
        }
        List<String> list2 = this.lowIncome;
        if (list2 != null) {
            userWealth.lowIncome = ValueObject.util_map(list2, new w9j() { // from class: l.sbk0
                public final Object call(Object obj) {
                    return UserWealth.m1060d((String) obj);
                }
            });
        }
        List<String> list3 = this.car;
        if (list3 != null) {
            userWealth.car = ValueObject.util_map(list3, new w9j() { // from class: l.tbk0
                public final Object call(Object obj) {
                    return UserWealth.m1058b((String) obj);
                }
            });
        }
        List<String> list4 = this.house;
        if (list4 != null) {
            userWealth.house = ValueObject.util_map(list4, new w9j() { // from class: l.ubk0
                public final Object call(Object obj) {
                    return UserWealth.m1066n((String) obj);
                }
            });
        }
        List<String> list5 = this.houseRegion;
        if (list5 != null) {
            userWealth.houseRegion = ValueObject.util_map(list5, new w9j() { // from class: l.vbk0
                public final Object call(Object obj) {
                    return UserWealth.m1064l((String) obj);
                }
            });
        }
        List<String> list6 = this.houseSubRegion;
        if (list6 != null) {
            userWealth.houseSubRegion = ValueObject.util_map(list6, new w9j() { // from class: l.wbk0
                public final Object call(Object obj) {
                    return UserWealth.m1062f((String) obj);
                }
            });
        }
        List<String> list7 = this.pet;
        if (list7 != null) {
            userWealth.pet = ValueObject.util_map(list7, new w9j() { // from class: l.xbk0
                public final Object call(Object obj) {
                    return UserWealth.m1063k((String) obj);
                }
            });
        }
        List<String> list8 = this.carImg;
        if (list8 != null) {
            userWealth.carImg = ValueObject.util_map(list8, new w9j() { // from class: l.ybk0
                public final Object call(Object obj) {
                    return UserWealth.m1067o((String) obj);
                }
            });
        }
        List<String> list9 = this.houseImg;
        if (list9 != null) {
            userWealth.houseImg = ValueObject.util_map(list9, new w9j() { // from class: l.zbk0
                public final Object call(Object obj) {
                    return UserWealth.m1059c((String) obj);
                }
            });
        }
        List<String> list10 = this.petImg;
        if (list10 != null) {
            userWealth.petImg = ValueObject.util_map(list10, new w9j() { // from class: l.qbk0
                public final Object call(Object obj) {
                    return UserWealth.m1057a((String) obj);
                }
            });
        }
        List<String> list11 = this.monthlyCost;
        if (list11 != null) {
            userWealth.monthlyCost = ValueObject.util_map(list11, new w9j() { // from class: l.rbk0
                public final Object call(Object obj) {
                    return UserWealth.m1065m((String) obj);
                }
            });
        }
        return userWealth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserWealth)) {
            return false;
        }
        UserWealth userWealth = (UserWealth) obj;
        return ValueObject.util_equals(this.upperIncome, userWealth.upperIncome) && ValueObject.util_equals(this.lowIncome, userWealth.lowIncome) && ValueObject.util_equals(this.car, userWealth.car) && ValueObject.util_equals(this.house, userWealth.house) && ValueObject.util_equals(this.houseRegion, userWealth.houseRegion) && ValueObject.util_equals(this.houseSubRegion, userWealth.houseSubRegion) && ValueObject.util_equals(this.pet, userWealth.pet) && ValueObject.util_equals(this.carImg, userWealth.carImg) && ValueObject.util_equals(this.houseImg, userWealth.houseImg) && ValueObject.util_equals(this.petImg, userWealth.petImg) && ValueObject.util_equals(this.monthlyCost, userWealth.monthlyCost);
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
        List<String> list = this.upperIncome;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.lowIncome;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.car;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.house;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.houseRegion;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.houseSubRegion;
        int iHashCode6 = (iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<String> list7 = this.pet;
        int iHashCode7 = (iHashCode6 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<String> list8 = this.carImg;
        int iHashCode8 = (iHashCode7 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<String> list9 = this.houseImg;
        int iHashCode9 = (iHashCode8 + (list9 != null ? list9.hashCode() : 0)) * 41;
        List<String> list10 = this.petImg;
        int iHashCode10 = (iHashCode9 + (list10 != null ? list10.hashCode() : 0)) * 41;
        List<String> list11 = this.monthlyCost;
        int iHashCode11 = iHashCode10 + (list11 != null ? list11.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode11;
        return iHashCode11;
    }

    public void nullCheck() {
        if (this.monthlyCost == null) {
            this.monthlyCost = new ArrayList();
        }
    }

    public UserWealth subtract(UserWealth userWealth) {
        UserWealth userWealth2 = new UserWealth();
        if (!ValueObject.util_equals(this.upperIncome, userWealth.upperIncome)) {
            userWealth2.upperIncome = this.upperIncome;
        }
        if (!ValueObject.util_equals(this.lowIncome, userWealth.lowIncome)) {
            userWealth2.lowIncome = this.lowIncome;
        }
        if (!ValueObject.util_equals(this.car, userWealth.car)) {
            userWealth2.car = this.car;
        }
        if (!ValueObject.util_equals(this.house, userWealth.house)) {
            userWealth2.house = this.house;
        }
        if (!ValueObject.util_equals(this.houseRegion, userWealth.houseRegion)) {
            userWealth2.houseRegion = this.houseRegion;
        }
        if (!ValueObject.util_equals(this.houseSubRegion, userWealth.houseSubRegion)) {
            userWealth2.houseSubRegion = this.houseSubRegion;
        }
        if (!ValueObject.util_equals(this.pet, userWealth.pet)) {
            userWealth2.pet = this.pet;
        }
        if (!ValueObject.util_equals(this.carImg, userWealth.carImg)) {
            userWealth2.carImg = this.carImg;
        }
        if (!ValueObject.util_equals(this.houseImg, userWealth.houseImg)) {
            userWealth2.houseImg = this.houseImg;
        }
        if (!ValueObject.util_equals(this.petImg, userWealth.petImg)) {
            userWealth2.petImg = this.petImg;
        }
        if (!ValueObject.util_equals(this.monthlyCost, userWealth.monthlyCost)) {
            userWealth2.monthlyCost = this.monthlyCost;
        }
        if (userWealth2.equals(new UserWealth())) {
            return null;
        }
        return userWealth2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
