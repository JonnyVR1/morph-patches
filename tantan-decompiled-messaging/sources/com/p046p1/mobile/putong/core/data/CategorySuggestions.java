package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class CategorySuggestions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "categorysuggestions";

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, List<String>> department;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> food;

    @NonNull
    @ProtobufIndex(index = 3)
    public Map<String, List<String>> hometown;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> industry;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> literature;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> movies;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> music;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> personality;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> places;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> sports;
    public static ProtobufAdapter<CategorySuggestions> PROTOBUF_ADAPTER = new MessageNanoAdapter<CategorySuggestions>() { // from class: com.p1.mobile.putong.core.data.CategorySuggestions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CategorySuggestions categorySuggestions) {
            List<String> list = categorySuggestions.industry;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            Map<String, List<String>> map = categorySuggestions.department;
            if (map != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            Map<String, List<String>> map2 = categorySuggestions.hometown;
            if (map2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, map2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            List<String> list2 = categorySuggestions.personality;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = categorySuggestions.music;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = categorySuggestions.sports;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = categorySuggestions.literature;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = categorySuggestions.food;
            if (list6 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = categorySuggestions.places;
            if (list7 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = categorySuggestions.movies;
            if (list8 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(10, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            categorySuggestions.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CategorySuggestions parse(nb5 nb5Var) throws IOException {
            CategorySuggestions categorySuggestions = new CategorySuggestions();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (categorySuggestions.industry == null) {
                            categorySuggestions.industry = new ArrayList();
                        }
                        if (categorySuggestions.department == null) {
                            categorySuggestions.department = Collections.EMPTY_MAP;
                        }
                        if (categorySuggestions.hometown == null) {
                            categorySuggestions.hometown = Collections.EMPTY_MAP;
                        }
                        if (categorySuggestions.personality == null) {
                            categorySuggestions.personality = new ArrayList();
                        }
                        if (categorySuggestions.music == null) {
                            categorySuggestions.music = new ArrayList();
                        }
                        if (categorySuggestions.sports == null) {
                            categorySuggestions.sports = new ArrayList();
                        }
                        if (categorySuggestions.literature == null) {
                            categorySuggestions.literature = new ArrayList();
                        }
                        if (categorySuggestions.food == null) {
                            categorySuggestions.food = new ArrayList();
                        }
                        if (categorySuggestions.places == null) {
                            categorySuggestions.places = new ArrayList();
                        }
                        if (categorySuggestions.movies == null) {
                            categorySuggestions.movies = new ArrayList();
                        }
                        break;
                    case 10:
                        categorySuggestions.industry = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        categorySuggestions.department = (Map) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
                        continue;
                    case 26:
                        categorySuggestions.hometown = (Map) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
                        continue;
                    case 34:
                        categorySuggestions.personality = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        categorySuggestions.music = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        categorySuggestions.sports = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        categorySuggestions.literature = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        categorySuggestions.food = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        categorySuggestions.places = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        categorySuggestions.movies = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (categorySuggestions.industry == null) {
                            categorySuggestions.industry = new ArrayList();
                        }
                        if (categorySuggestions.department == null) {
                            categorySuggestions.department = Collections.EMPTY_MAP;
                        }
                        if (categorySuggestions.hometown == null) {
                            categorySuggestions.hometown = Collections.EMPTY_MAP;
                        }
                        if (categorySuggestions.personality == null) {
                            categorySuggestions.personality = new ArrayList();
                        }
                        if (categorySuggestions.music == null) {
                            categorySuggestions.music = new ArrayList();
                        }
                        if (categorySuggestions.sports == null) {
                            categorySuggestions.sports = new ArrayList();
                        }
                        if (categorySuggestions.literature == null) {
                            categorySuggestions.literature = new ArrayList();
                        }
                        if (categorySuggestions.food == null) {
                            categorySuggestions.food = new ArrayList();
                        }
                        if (categorySuggestions.places == null) {
                            categorySuggestions.places = new ArrayList();
                        }
                        if (categorySuggestions.movies == null) {
                            categorySuggestions.movies = new ArrayList();
                            return categorySuggestions;
                        }
                        break;
                }
            }
            return categorySuggestions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CategorySuggestions categorySuggestions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = categorySuggestions.industry;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            Map<String, List<String>> map = categorySuggestions.department;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(2, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            Map<String, List<String>> map2 = categorySuggestions.hometown;
            if (map2 != null) {
                codedOutputByteBufferNano.m17254K(3, map2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            List<String> list2 = categorySuggestions.personality;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = categorySuggestions.music;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(5, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = categorySuggestions.sports;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(6, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = categorySuggestions.literature;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(7, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = categorySuggestions.food;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(8, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = categorySuggestions.places;
            if (list7 != null) {
                codedOutputByteBufferNano.m17254K(9, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = categorySuggestions.movies;
            if (list8 != null) {
                codedOutputByteBufferNano.m17254K(10, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CategorySuggestions> JSON_ADAPTER = new ObjectJsonAdapter<CategorySuggestions>() { // from class: com.p1.mobile.putong.core.data.CategorySuggestions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CategorySuggestions.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CategorySuggestions newInstance() {
            return new CategorySuggestions();
        }

        public boolean parseField(CategorySuggestions categorySuggestions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "literature":
                    categorySuggestions.literature = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "movies":
                    categorySuggestions.movies = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "places":
                    categorySuggestions.places = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "sports":
                    categorySuggestions.sports = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hometown":
                    categorySuggestions.hometown = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER(), str2);
                    return true;
                case "personality":
                    categorySuggestions.personality = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "food":
                    categorySuggestions.food = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "music":
                    categorySuggestions.music = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "industry":
                    categorySuggestions.industry = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "department":
                    categorySuggestions.department = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER(), str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CategorySuggestions categorySuggestions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "literature":
                case "movies":
                case "places":
                case "sports":
                case "hometown":
                case "personality":
                case "food":
                case "music":
                case "industry":
                case "department":
                    return true;
                default:
                    return super.parseFieldCheck(categorySuggestions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CategorySuggestions categorySuggestions, JsonGenerator jsonGenerator) throws IOException {
            if (categorySuggestions.industry != null) {
                jsonGenerator.writeFieldName("industry");
                JsonAdapter.serializeArray(categorySuggestions.industry, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.department != null) {
                jsonGenerator.writeFieldName("department");
                JsonAdapter.serializeMap(categorySuggestions.department, jsonGenerator, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            if (categorySuggestions.hometown != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.hometown);
                JsonAdapter.serializeMap(categorySuggestions.hometown, jsonGenerator, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            if (categorySuggestions.personality != null) {
                jsonGenerator.writeFieldName("personality");
                JsonAdapter.serializeArray(categorySuggestions.personality, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.music != null) {
                jsonGenerator.writeFieldName("music");
                JsonAdapter.serializeArray(categorySuggestions.music, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.sports != null) {
                jsonGenerator.writeFieldName("sports");
                JsonAdapter.serializeArray(categorySuggestions.sports, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.literature != null) {
                jsonGenerator.writeFieldName("literature");
                JsonAdapter.serializeArray(categorySuggestions.literature, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.food != null) {
                jsonGenerator.writeFieldName("food");
                JsonAdapter.serializeArray(categorySuggestions.food, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.places != null) {
                jsonGenerator.writeFieldName("places");
                JsonAdapter.serializeArray(categorySuggestions.places, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (categorySuggestions.movies != null) {
                jsonGenerator.writeFieldName("movies");
                JsonAdapter.serializeArray(categorySuggestions.movies, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CategorySuggestions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CategorySuggestions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35236a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35238c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m35239d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m35241f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m35242k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m35243l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m35244m(String str) {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m35245n(String str) {
        return str;
    }

    public static CategorySuggestions new_() {
        CategorySuggestions categorySuggestions = new CategorySuggestions();
        categorySuggestions.nullCheck();
        return categorySuggestions;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m35246o(String str) {
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m35247p(String str) {
        return str;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CategorySuggestions mo223809clone() {
        CategorySuggestions categorySuggestions = new CategorySuggestions();
        List<String> list = this.industry;
        if (list != null) {
            categorySuggestions.industry = ValueObject.util_map(list, new w9j() { // from class: l.wm4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35236a((String) obj);
                }
            });
        }
        Map<String, List<String>> map = this.department;
        if (map != null) {
            categorySuggestions.department = ValueObject.util_map(map, new w9j() { // from class: l.xm4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new w9j() { // from class: l.tm4
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return CategorySuggestions.m35245n((String) obj2);
                        }
                    });
                }
            });
        }
        Map<String, List<String>> map2 = this.hometown;
        if (map2 != null) {
            categorySuggestions.hometown = ValueObject.util_map(map2, new w9j() { // from class: l.ym4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new w9j() { // from class: l.vm4
                        @Override // p149l.w9j
                        public final Object call(Object obj2) {
                            return CategorySuggestions.m35243l((String) obj2);
                        }
                    });
                }
            });
        }
        List<String> list2 = this.personality;
        if (list2 != null) {
            categorySuggestions.personality = ValueObject.util_map(list2, new w9j() { // from class: l.zm4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35239d((String) obj);
                }
            });
        }
        List<String> list3 = this.music;
        if (list3 != null) {
            categorySuggestions.music = ValueObject.util_map(list3, new w9j() { // from class: l.an4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35246o((String) obj);
                }
            });
        }
        List<String> list4 = this.sports;
        if (list4 != null) {
            categorySuggestions.sports = ValueObject.util_map(list4, new w9j() { // from class: l.bn4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35241f((String) obj);
                }
            });
        }
        List<String> list5 = this.literature;
        if (list5 != null) {
            categorySuggestions.literature = ValueObject.util_map(list5, new w9j() { // from class: l.cn4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35247p((String) obj);
                }
            });
        }
        List<String> list6 = this.food;
        if (list6 != null) {
            categorySuggestions.food = ValueObject.util_map(list6, new w9j() { // from class: l.dn4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35238c((String) obj);
                }
            });
        }
        List<String> list7 = this.places;
        if (list7 != null) {
            categorySuggestions.places = ValueObject.util_map(list7, new w9j() { // from class: l.en4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35244m((String) obj);
                }
            });
        }
        List<String> list8 = this.movies;
        if (list8 != null) {
            categorySuggestions.movies = ValueObject.util_map(list8, new w9j() { // from class: l.um4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CategorySuggestions.m35242k((String) obj);
                }
            });
        }
        return categorySuggestions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategorySuggestions)) {
            return false;
        }
        CategorySuggestions categorySuggestions = (CategorySuggestions) obj;
        return ValueObject.util_equals(this.industry, categorySuggestions.industry) && ValueObject.util_equals(this.department, categorySuggestions.department) && ValueObject.util_equals(this.hometown, categorySuggestions.hometown) && ValueObject.util_equals(this.personality, categorySuggestions.personality) && ValueObject.util_equals(this.music, categorySuggestions.music) && ValueObject.util_equals(this.sports, categorySuggestions.sports) && ValueObject.util_equals(this.literature, categorySuggestions.literature) && ValueObject.util_equals(this.food, categorySuggestions.food) && ValueObject.util_equals(this.places, categorySuggestions.places) && ValueObject.util_equals(this.movies, categorySuggestions.movies);
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
        List<String> list = this.industry;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Map<String, List<String>> map = this.department;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 41;
        Map<String, List<String>> map2 = this.hometown;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 41;
        List<String> list2 = this.personality;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.music;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.sports;
        int iHashCode6 = (iHashCode5 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.literature;
        int iHashCode7 = (iHashCode6 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.food;
        int iHashCode8 = (iHashCode7 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<String> list7 = this.places;
        int iHashCode9 = (iHashCode8 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<String> list8 = this.movies;
        int iHashCode10 = iHashCode9 + (list8 != null ? list8.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.industry == null) {
            this.industry = new ArrayList();
        }
        if (this.department == null) {
            this.department = Collections.EMPTY_MAP;
        }
        if (this.hometown == null) {
            this.hometown = Collections.EMPTY_MAP;
        }
        if (this.personality == null) {
            this.personality = new ArrayList();
        }
        if (this.music == null) {
            this.music = new ArrayList();
        }
        if (this.sports == null) {
            this.sports = new ArrayList();
        }
        if (this.literature == null) {
            this.literature = new ArrayList();
        }
        if (this.food == null) {
            this.food = new ArrayList();
        }
        if (this.places == null) {
            this.places = new ArrayList();
        }
        if (this.movies == null) {
            this.movies = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
