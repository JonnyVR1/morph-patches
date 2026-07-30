package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.DiamondVIPPrivateMatch;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class DiamondVIPPrivateMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "diamondvipprivatematch";

    @ProtobufIndex(index = 3)
    @Deprecated
    public int beauty;

    @ProtobufIndex(index = 4)
    @Deprecated
    public int enthusiasm;

    @ProtobufIndex(index = 7)
    @Deprecated
    public int habbit;

    @ProtobufIndex(index = 6)
    @Deprecated
    public int profile;

    @ProtobufIndex(index = 5)
    @Deprecated
    public int serious;

    @NonNull
    @ProtobufIndex(index = 2)
    @Deprecated
    public List<String> styleForFemale;

    @NonNull
    @ProtobufIndex(index = 9)
    @Deprecated
    public List<String> styleForFemaleIdealType;

    @NonNull
    @ProtobufIndex(index = 11)
    @Deprecated
    public List<String> styleForFemalePriority;

    @NonNull
    @ProtobufIndex(index = 1)
    @Deprecated
    public List<String> styleForMale;

    @NonNull
    @ProtobufIndex(index = 8)
    @Deprecated
    public List<String> styleForMaleIdealType;

    @NonNull
    @ProtobufIndex(index = 10)
    @Deprecated
    public List<String> styleForMalePriority;
    public static ProtobufAdapter<DiamondVIPPrivateMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<DiamondVIPPrivateMatch>() { // from class: com.p1.mobile.putong.data.DiamondVIPPrivateMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DiamondVIPPrivateMatch diamondVIPPrivateMatch) {
            List<String> list = diamondVIPPrivateMatch.styleForMale;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = diamondVIPPrivateMatch.styleForFemale;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(3, diamondVIPPrivateMatch.beauty) + CodedOutputByteBufferNano.m17226h(4, diamondVIPPrivateMatch.enthusiasm) + CodedOutputByteBufferNano.m17226h(5, diamondVIPPrivateMatch.serious) + CodedOutputByteBufferNano.m17226h(6, diamondVIPPrivateMatch.profile) + CodedOutputByteBufferNano.m17226h(7, diamondVIPPrivateMatch.habbit);
            List<String> list3 = diamondVIPPrivateMatch.styleForMaleIdealType;
            if (list3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = diamondVIPPrivateMatch.styleForFemaleIdealType;
            if (list4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(9, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = diamondVIPPrivateMatch.styleForMalePriority;
            if (list5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(10, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = diamondVIPPrivateMatch.styleForFemalePriority;
            if (list6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(11, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            diamondVIPPrivateMatch.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DiamondVIPPrivateMatch parse(nb5 nb5Var) throws IOException {
            DiamondVIPPrivateMatch diamondVIPPrivateMatch = new DiamondVIPPrivateMatch();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (diamondVIPPrivateMatch.styleForMale == null) {
                            diamondVIPPrivateMatch.styleForMale = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForFemale == null) {
                            diamondVIPPrivateMatch.styleForFemale = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForMaleIdealType == null) {
                            diamondVIPPrivateMatch.styleForMaleIdealType = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForFemaleIdealType == null) {
                            diamondVIPPrivateMatch.styleForFemaleIdealType = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForMalePriority == null) {
                            diamondVIPPrivateMatch.styleForMalePriority = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForFemalePriority == null) {
                            diamondVIPPrivateMatch.styleForFemalePriority = new ArrayList();
                        }
                        break;
                    case 10:
                        diamondVIPPrivateMatch.styleForMale = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        diamondVIPPrivateMatch.styleForFemale = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 24:
                        diamondVIPPrivateMatch.beauty = nb5Var.m158741j();
                        continue;
                    case 32:
                        diamondVIPPrivateMatch.enthusiasm = nb5Var.m158741j();
                        continue;
                    case 40:
                        diamondVIPPrivateMatch.serious = nb5Var.m158741j();
                        continue;
                    case 48:
                        diamondVIPPrivateMatch.profile = nb5Var.m158741j();
                        continue;
                    case 56:
                        diamondVIPPrivateMatch.habbit = nb5Var.m158741j();
                        continue;
                    case 66:
                        diamondVIPPrivateMatch.styleForMaleIdealType = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        diamondVIPPrivateMatch.styleForFemaleIdealType = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        diamondVIPPrivateMatch.styleForMalePriority = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        diamondVIPPrivateMatch.styleForFemalePriority = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (diamondVIPPrivateMatch.styleForMale == null) {
                            diamondVIPPrivateMatch.styleForMale = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForFemale == null) {
                            diamondVIPPrivateMatch.styleForFemale = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForMaleIdealType == null) {
                            diamondVIPPrivateMatch.styleForMaleIdealType = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForFemaleIdealType == null) {
                            diamondVIPPrivateMatch.styleForFemaleIdealType = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForMalePriority == null) {
                            diamondVIPPrivateMatch.styleForMalePriority = new ArrayList();
                        }
                        if (diamondVIPPrivateMatch.styleForFemalePriority == null) {
                            diamondVIPPrivateMatch.styleForFemalePriority = new ArrayList();
                            return diamondVIPPrivateMatch;
                        }
                        break;
                }
            }
            return diamondVIPPrivateMatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DiamondVIPPrivateMatch diamondVIPPrivateMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = diamondVIPPrivateMatch.styleForMale;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = diamondVIPPrivateMatch.styleForFemale;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(3, diamondVIPPrivateMatch.beauty);
            codedOutputByteBufferNano.m17250G(4, diamondVIPPrivateMatch.enthusiasm);
            codedOutputByteBufferNano.m17250G(5, diamondVIPPrivateMatch.serious);
            codedOutputByteBufferNano.m17250G(6, diamondVIPPrivateMatch.profile);
            codedOutputByteBufferNano.m17250G(7, diamondVIPPrivateMatch.habbit);
            List<String> list3 = diamondVIPPrivateMatch.styleForMaleIdealType;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(8, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = diamondVIPPrivateMatch.styleForFemaleIdealType;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(9, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = diamondVIPPrivateMatch.styleForMalePriority;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(10, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = diamondVIPPrivateMatch.styleForFemalePriority;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(11, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DiamondVIPPrivateMatch> JSON_ADAPTER = new ObjectJsonAdapter<DiamondVIPPrivateMatch>() { // from class: com.p1.mobile.putong.data.DiamondVIPPrivateMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DiamondVIPPrivateMatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DiamondVIPPrivateMatch newInstance() {
            return new DiamondVIPPrivateMatch();
        }

        public boolean parseField(DiamondVIPPrivateMatch diamondVIPPrivateMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "styleForFemalePriority":
                    diamondVIPPrivateMatch.styleForFemalePriority = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "beauty":
                    diamondVIPPrivateMatch.beauty = jsonParser.getValueAsInt();
                    return true;
                case "habbit":
                    diamondVIPPrivateMatch.habbit = jsonParser.getValueAsInt();
                    return true;
                case "styleForMalePriority":
                    diamondVIPPrivateMatch.styleForMalePriority = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "profile":
                    diamondVIPPrivateMatch.profile = jsonParser.getValueAsInt();
                    return true;
                case "styleForFemale":
                    diamondVIPPrivateMatch.styleForFemale = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "styleForFemaleIdealType":
                    diamondVIPPrivateMatch.styleForFemaleIdealType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "styleForMaleIdealType":
                    diamondVIPPrivateMatch.styleForMaleIdealType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "styleForMale":
                    diamondVIPPrivateMatch.styleForMale = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "enthusiasm":
                    diamondVIPPrivateMatch.enthusiasm = jsonParser.getValueAsInt();
                    return true;
                case "serious":
                    diamondVIPPrivateMatch.serious = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DiamondVIPPrivateMatch diamondVIPPrivateMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "styleForFemalePriority":
                case "beauty":
                case "habbit":
                case "styleForMalePriority":
                case "profile":
                case "styleForFemale":
                case "styleForFemaleIdealType":
                case "styleForMaleIdealType":
                case "styleForMale":
                case "enthusiasm":
                case "serious":
                    return true;
                default:
                    return super.parseFieldCheck(diamondVIPPrivateMatch, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DiamondVIPPrivateMatch diamondVIPPrivateMatch, JsonGenerator jsonGenerator) throws IOException {
            if (diamondVIPPrivateMatch.styleForMale != null) {
                jsonGenerator.writeFieldName("styleForMale");
                JsonAdapter.serializeArray(diamondVIPPrivateMatch.styleForMale, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (diamondVIPPrivateMatch.styleForFemale != null) {
                jsonGenerator.writeFieldName("styleForFemale");
                JsonAdapter.serializeArray(diamondVIPPrivateMatch.styleForFemale, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("beauty", diamondVIPPrivateMatch.beauty);
            jsonGenerator.writeNumberField("enthusiasm", diamondVIPPrivateMatch.enthusiasm);
            jsonGenerator.writeNumberField("serious", diamondVIPPrivateMatch.serious);
            jsonGenerator.writeNumberField("profile", diamondVIPPrivateMatch.profile);
            jsonGenerator.writeNumberField("habbit", diamondVIPPrivateMatch.habbit);
            if (diamondVIPPrivateMatch.styleForMaleIdealType != null) {
                jsonGenerator.writeFieldName("styleForMaleIdealType");
                JsonAdapter.serializeArray(diamondVIPPrivateMatch.styleForMaleIdealType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (diamondVIPPrivateMatch.styleForFemaleIdealType != null) {
                jsonGenerator.writeFieldName("styleForFemaleIdealType");
                JsonAdapter.serializeArray(diamondVIPPrivateMatch.styleForFemaleIdealType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (diamondVIPPrivateMatch.styleForMalePriority != null) {
                jsonGenerator.writeFieldName("styleForMalePriority");
                JsonAdapter.serializeArray(diamondVIPPrivateMatch.styleForMalePriority, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (diamondVIPPrivateMatch.styleForFemalePriority != null) {
                jsonGenerator.writeFieldName("styleForFemalePriority");
                JsonAdapter.serializeArray(diamondVIPPrivateMatch.styleForFemalePriority, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DiamondVIPPrivateMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DiamondVIPPrivateMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59748a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59749b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59750c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m59751d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m59752e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m59753f(String str) {
        return str;
    }

    public static DiamondVIPPrivateMatch new_() {
        DiamondVIPPrivateMatch diamondVIPPrivateMatch = new DiamondVIPPrivateMatch();
        diamondVIPPrivateMatch.nullCheck();
        return diamondVIPPrivateMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DiamondVIPPrivateMatch mo223809clone() {
        DiamondVIPPrivateMatch diamondVIPPrivateMatch = new DiamondVIPPrivateMatch();
        List<String> list = this.styleForMale;
        if (list != null) {
            diamondVIPPrivateMatch.styleForMale = ValueObject.util_map(list, new w9j() { // from class: l.t0e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DiamondVIPPrivateMatch.m59748a((String) obj);
                }
            });
        }
        List<String> list2 = this.styleForFemale;
        if (list2 != null) {
            diamondVIPPrivateMatch.styleForFemale = ValueObject.util_map(list2, new w9j() { // from class: l.u0e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DiamondVIPPrivateMatch.m59752e((String) obj);
                }
            });
        }
        diamondVIPPrivateMatch.beauty = this.beauty;
        diamondVIPPrivateMatch.enthusiasm = this.enthusiasm;
        diamondVIPPrivateMatch.serious = this.serious;
        diamondVIPPrivateMatch.profile = this.profile;
        diamondVIPPrivateMatch.habbit = this.habbit;
        List<String> list3 = this.styleForMaleIdealType;
        if (list3 != null) {
            diamondVIPPrivateMatch.styleForMaleIdealType = ValueObject.util_map(list3, new w9j() { // from class: l.v0e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DiamondVIPPrivateMatch.m59753f((String) obj);
                }
            });
        }
        List<String> list4 = this.styleForFemaleIdealType;
        if (list4 != null) {
            diamondVIPPrivateMatch.styleForFemaleIdealType = ValueObject.util_map(list4, new w9j() { // from class: l.w0e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DiamondVIPPrivateMatch.m59750c((String) obj);
                }
            });
        }
        List<String> list5 = this.styleForMalePriority;
        if (list5 != null) {
            diamondVIPPrivateMatch.styleForMalePriority = ValueObject.util_map(list5, new w9j() { // from class: l.x0e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DiamondVIPPrivateMatch.m59751d((String) obj);
                }
            });
        }
        List<String> list6 = this.styleForFemalePriority;
        if (list6 != null) {
            diamondVIPPrivateMatch.styleForFemalePriority = ValueObject.util_map(list6, new w9j() { // from class: l.y0e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DiamondVIPPrivateMatch.m59749b((String) obj);
                }
            });
        }
        return diamondVIPPrivateMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiamondVIPPrivateMatch)) {
            return false;
        }
        DiamondVIPPrivateMatch diamondVIPPrivateMatch = (DiamondVIPPrivateMatch) obj;
        return ValueObject.util_equals(this.styleForMale, diamondVIPPrivateMatch.styleForMale) && ValueObject.util_equals(this.styleForFemale, diamondVIPPrivateMatch.styleForFemale) && this.beauty == diamondVIPPrivateMatch.beauty && this.enthusiasm == diamondVIPPrivateMatch.enthusiasm && this.serious == diamondVIPPrivateMatch.serious && this.profile == diamondVIPPrivateMatch.profile && this.habbit == diamondVIPPrivateMatch.habbit && ValueObject.util_equals(this.styleForMaleIdealType, diamondVIPPrivateMatch.styleForMaleIdealType) && ValueObject.util_equals(this.styleForFemaleIdealType, diamondVIPPrivateMatch.styleForFemaleIdealType) && ValueObject.util_equals(this.styleForMalePriority, diamondVIPPrivateMatch.styleForMalePriority) && ValueObject.util_equals(this.styleForFemalePriority, diamondVIPPrivateMatch.styleForFemalePriority);
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
        List<String> list = this.styleForMale;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.styleForFemale;
        int iHashCode2 = (((((((((((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.beauty) * 41) + this.enthusiasm) * 41) + this.serious) * 41) + this.profile) * 41) + this.habbit) * 41;
        List<String> list3 = this.styleForMaleIdealType;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.styleForFemaleIdealType;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.styleForMalePriority;
        int iHashCode5 = (iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.styleForFemalePriority;
        int iHashCode6 = iHashCode5 + (list6 != null ? list6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.styleForMale == null) {
            this.styleForMale = new ArrayList();
        }
        if (this.styleForFemale == null) {
            this.styleForFemale = new ArrayList();
        }
        if (this.styleForMaleIdealType == null) {
            this.styleForMaleIdealType = new ArrayList();
        }
        if (this.styleForFemaleIdealType == null) {
            this.styleForFemaleIdealType = new ArrayList();
        }
        if (this.styleForMalePriority == null) {
            this.styleForMalePriority = new ArrayList();
        }
        if (this.styleForFemalePriority == null) {
            this.styleForFemalePriority = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
