package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.FoulWords;
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
public class FoulWords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "foulwords";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> badMoodContains;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> badMoodExact;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> chatSearchContains;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> chatSearchExact;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> contains;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> exact;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> harassRegex;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> spoofing;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> spoofingNew;
    public static ProtobufAdapter<FoulWords> PROTOBUF_ADAPTER = new MessageNanoAdapter<FoulWords>() { // from class: com.p1.mobile.putong.data.FoulWords.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FoulWords foulWords) {
            List<String> list = foulWords.contains;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = foulWords.exact;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = foulWords.spoofing;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = foulWords.badMoodContains;
            if (list4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = foulWords.badMoodExact;
            if (list5 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = foulWords.harassRegex;
            if (list6 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = foulWords.spoofingNew;
            if (list7 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = foulWords.chatSearchContains;
            if (list8 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = foulWords.chatSearchExact;
            if (list9 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            foulWords.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FoulWords parse(nb5 nb5Var) throws IOException {
            FoulWords foulWords = new FoulWords();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (foulWords.contains == null) {
                        foulWords.contains = new ArrayList();
                    }
                    if (foulWords.exact == null) {
                        foulWords.exact = new ArrayList();
                    }
                    if (foulWords.spoofing == null) {
                        foulWords.spoofing = new ArrayList();
                    }
                    if (foulWords.badMoodContains == null) {
                        foulWords.badMoodContains = new ArrayList();
                    }
                    if (foulWords.badMoodExact == null) {
                        foulWords.badMoodExact = new ArrayList();
                    }
                    if (foulWords.harassRegex == null) {
                        foulWords.harassRegex = new ArrayList();
                    }
                    if (foulWords.spoofingNew == null) {
                        foulWords.spoofingNew = new ArrayList();
                    }
                    if (foulWords.chatSearchContains == null) {
                        foulWords.chatSearchContains = new ArrayList();
                    }
                    if (foulWords.chatSearchExact != null) {
                        break;
                    }
                    foulWords.chatSearchExact = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    foulWords.contains = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    foulWords.exact = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    foulWords.spoofing = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    foulWords.badMoodContains = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    foulWords.badMoodExact = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 50) {
                    foulWords.harassRegex = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 58) {
                    foulWords.spoofingNew = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 66) {
                    foulWords.chatSearchContains = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 74) {
                        if (foulWords.contains == null) {
                            foulWords.contains = new ArrayList();
                        }
                        if (foulWords.exact == null) {
                            foulWords.exact = new ArrayList();
                        }
                        if (foulWords.spoofing == null) {
                            foulWords.spoofing = new ArrayList();
                        }
                        if (foulWords.badMoodContains == null) {
                            foulWords.badMoodContains = new ArrayList();
                        }
                        if (foulWords.badMoodExact == null) {
                            foulWords.badMoodExact = new ArrayList();
                        }
                        if (foulWords.harassRegex == null) {
                            foulWords.harassRegex = new ArrayList();
                        }
                        if (foulWords.spoofingNew == null) {
                            foulWords.spoofingNew = new ArrayList();
                        }
                        if (foulWords.chatSearchContains == null) {
                            foulWords.chatSearchContains = new ArrayList();
                        }
                        if (foulWords.chatSearchExact != null) {
                            break;
                        }
                        foulWords.chatSearchExact = new ArrayList();
                        return foulWords;
                    }
                    foulWords.chatSearchExact = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return foulWords;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FoulWords foulWords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = foulWords.contains;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = foulWords.exact;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = foulWords.spoofing;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = foulWords.badMoodContains;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(4, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = foulWords.badMoodExact;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(5, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = foulWords.harassRegex;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(6, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list7 = foulWords.spoofingNew;
            if (list7 != null) {
                codedOutputByteBufferNano.m17254K(7, list7, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list8 = foulWords.chatSearchContains;
            if (list8 != null) {
                codedOutputByteBufferNano.m17254K(8, list8, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list9 = foulWords.chatSearchExact;
            if (list9 != null) {
                codedOutputByteBufferNano.m17254K(9, list9, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FoulWords> JSON_ADAPTER = new ObjectJsonAdapter<FoulWords>() { // from class: com.p1.mobile.putong.data.FoulWords.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FoulWords.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FoulWords newInstance() {
            return new FoulWords();
        }

        public boolean parseField(FoulWords foulWords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "spoofing":
                    foulWords.spoofing = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "chatSearchExact":
                    foulWords.chatSearchExact = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "badMoodContains":
                    foulWords.badMoodContains = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "contains":
                    foulWords.contains = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "spoofingNew":
                    foulWords.spoofingNew = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "harassRegex":
                    foulWords.harassRegex = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "exact":
                    foulWords.exact = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "badMoodExact":
                    foulWords.badMoodExact = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "chatSearchContains":
                    foulWords.chatSearchContains = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FoulWords foulWords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "spoofing":
                case "chatSearchExact":
                case "badMoodContains":
                case "contains":
                case "spoofingNew":
                case "harassRegex":
                case "exact":
                case "badMoodExact":
                case "chatSearchContains":
                    return true;
                default:
                    return super.parseFieldCheck(foulWords, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FoulWords foulWords, JsonGenerator jsonGenerator) throws IOException {
            if (foulWords.contains != null) {
                jsonGenerator.writeFieldName("contains");
                JsonAdapter.serializeArray(foulWords.contains, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.exact != null) {
                jsonGenerator.writeFieldName("exact");
                JsonAdapter.serializeArray(foulWords.exact, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.spoofing != null) {
                jsonGenerator.writeFieldName("spoofing");
                JsonAdapter.serializeArray(foulWords.spoofing, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.badMoodContains != null) {
                jsonGenerator.writeFieldName("badMoodContains");
                JsonAdapter.serializeArray(foulWords.badMoodContains, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.badMoodExact != null) {
                jsonGenerator.writeFieldName("badMoodExact");
                JsonAdapter.serializeArray(foulWords.badMoodExact, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.harassRegex != null) {
                jsonGenerator.writeFieldName("harassRegex");
                JsonAdapter.serializeArray(foulWords.harassRegex, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.spoofingNew != null) {
                jsonGenerator.writeFieldName("spoofingNew");
                JsonAdapter.serializeArray(foulWords.spoofingNew, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.chatSearchContains != null) {
                jsonGenerator.writeFieldName("chatSearchContains");
                JsonAdapter.serializeArray(foulWords.chatSearchContains, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (foulWords.chatSearchExact != null) {
                jsonGenerator.writeFieldName("chatSearchExact");
                JsonAdapter.serializeArray(foulWords.chatSearchExact, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FoulWords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FoulWords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59777a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59778b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59779c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m59780d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m59781e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m59782f(String str) {
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m59783k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m59784l(String str) {
        return str;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m59785m(String str) {
        return str;
    }

    public static FoulWords new_() {
        FoulWords foulWords = new FoulWords();
        foulWords.nullCheck();
        return foulWords;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FoulWords mo223809clone() {
        FoulWords foulWords = new FoulWords();
        List<String> list = this.contains;
        if (list != null) {
            foulWords.contains = ValueObject.util_map(list, new w9j() { // from class: l.i0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59783k((String) obj);
                }
            });
        }
        List<String> list2 = this.exact;
        if (list2 != null) {
            foulWords.exact = ValueObject.util_map(list2, new w9j() { // from class: l.j0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59780d((String) obj);
                }
            });
        }
        List<String> list3 = this.spoofing;
        if (list3 != null) {
            foulWords.spoofing = ValueObject.util_map(list3, new w9j() { // from class: l.k0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59778b((String) obj);
                }
            });
        }
        List<String> list4 = this.badMoodContains;
        if (list4 != null) {
            foulWords.badMoodContains = ValueObject.util_map(list4, new w9j() { // from class: l.l0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59781e((String) obj);
                }
            });
        }
        List<String> list5 = this.badMoodExact;
        if (list5 != null) {
            foulWords.badMoodExact = ValueObject.util_map(list5, new w9j() { // from class: l.m0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59779c((String) obj);
                }
            });
        }
        List<String> list6 = this.harassRegex;
        if (list6 != null) {
            foulWords.harassRegex = ValueObject.util_map(list6, new w9j() { // from class: l.n0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59782f((String) obj);
                }
            });
        }
        List<String> list7 = this.spoofingNew;
        if (list7 != null) {
            foulWords.spoofingNew = ValueObject.util_map(list7, new w9j() { // from class: l.o0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59784l((String) obj);
                }
            });
        }
        List<String> list8 = this.chatSearchContains;
        if (list8 != null) {
            foulWords.chatSearchContains = ValueObject.util_map(list8, new w9j() { // from class: l.p0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59777a((String) obj);
                }
            });
        }
        List<String> list9 = this.chatSearchExact;
        if (list9 != null) {
            foulWords.chatSearchExact = ValueObject.util_map(list9, new w9j() { // from class: l.q0j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FoulWords.m59785m((String) obj);
                }
            });
        }
        return foulWords;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FoulWords)) {
            return false;
        }
        FoulWords foulWords = (FoulWords) obj;
        return ValueObject.util_equals(this.contains, foulWords.contains) && ValueObject.util_equals(this.exact, foulWords.exact) && ValueObject.util_equals(this.spoofing, foulWords.spoofing) && ValueObject.util_equals(this.badMoodContains, foulWords.badMoodContains) && ValueObject.util_equals(this.badMoodExact, foulWords.badMoodExact) && ValueObject.util_equals(this.harassRegex, foulWords.harassRegex) && ValueObject.util_equals(this.spoofingNew, foulWords.spoofingNew) && ValueObject.util_equals(this.chatSearchContains, foulWords.chatSearchContains) && ValueObject.util_equals(this.chatSearchExact, foulWords.chatSearchExact);
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
        List<String> list = this.contains;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.exact;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.spoofing;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.badMoodContains;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.badMoodExact;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.harassRegex;
        int iHashCode6 = (iHashCode5 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<String> list7 = this.spoofingNew;
        int iHashCode7 = (iHashCode6 + (list7 != null ? list7.hashCode() : 0)) * 41;
        List<String> list8 = this.chatSearchContains;
        int iHashCode8 = (iHashCode7 + (list8 != null ? list8.hashCode() : 0)) * 41;
        List<String> list9 = this.chatSearchExact;
        int iHashCode9 = iHashCode8 + (list9 != null ? list9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.contains == null) {
            this.contains = new ArrayList();
        }
        if (this.exact == null) {
            this.exact = new ArrayList();
        }
        if (this.spoofing == null) {
            this.spoofing = new ArrayList();
        }
        if (this.badMoodContains == null) {
            this.badMoodContains = new ArrayList();
        }
        if (this.badMoodExact == null) {
            this.badMoodExact = new ArrayList();
        }
        if (this.harassRegex == null) {
            this.harassRegex = new ArrayList();
        }
        if (this.spoofingNew == null) {
            this.spoofingNew = new ArrayList();
        }
        if (this.chatSearchContains == null) {
            this.chatSearchContains = new ArrayList();
        }
        if (this.chatSearchExact == null) {
            this.chatSearchExact = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
