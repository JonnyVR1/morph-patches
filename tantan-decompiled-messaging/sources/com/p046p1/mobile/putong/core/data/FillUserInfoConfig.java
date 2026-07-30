package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.FillUserInfoConfig;
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

/* JADX INFO: loaded from: classes10.dex */
public class FillUserInfoConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "filluserinfoconfig";

    @ProtobufIndex(index = 5)
    public int expire_days;

    @NonNull
    @ProtobufIndex(index = 2)
    public String female_avatar_url;

    @NonNull
    @ProtobufIndex(index = 4)
    public String female_name;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<String> female_other_tags;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> female_self_intro_tags_1;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<String> female_self_intro_tags_2;

    @NonNull
    @ProtobufIndex(index = 1)
    public String male_avatar_url;

    @NonNull
    @ProtobufIndex(index = 3)
    public String male_name;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<String> male_other_tags;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> male_self_intro_tags_1;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> male_self_intro_tags_2;
    public static ProtobufAdapter<FillUserInfoConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FillUserInfoConfig>() { // from class: com.p1.mobile.putong.core.data.FillUserInfoConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FillUserInfoConfig fillUserInfoConfig) {
            String str = fillUserInfoConfig.male_avatar_url;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = fillUserInfoConfig.female_avatar_url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = fillUserInfoConfig.male_name;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = fillUserInfoConfig.female_name;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, fillUserInfoConfig.expire_days);
            List<String> list = fillUserInfoConfig.male_self_intro_tags_1;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = fillUserInfoConfig.male_self_intro_tags_2;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = fillUserInfoConfig.female_self_intro_tags_1;
            if (list3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = fillUserInfoConfig.female_self_intro_tags_2;
            if (list4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(9, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = fillUserInfoConfig.male_other_tags;
            if (list5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(10, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = fillUserInfoConfig.female_other_tags;
            if (list6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(11, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            fillUserInfoConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FillUserInfoConfig parse(nb5 nb5Var) throws IOException {
            FillUserInfoConfig fillUserInfoConfig = new FillUserInfoConfig();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (fillUserInfoConfig.male_avatar_url == null) {
                            fillUserInfoConfig.male_avatar_url = "";
                        }
                        if (fillUserInfoConfig.female_avatar_url == null) {
                            fillUserInfoConfig.female_avatar_url = "";
                        }
                        if (fillUserInfoConfig.male_name == null) {
                            fillUserInfoConfig.male_name = "";
                        }
                        if (fillUserInfoConfig.female_name == null) {
                            fillUserInfoConfig.female_name = "";
                        }
                        if (fillUserInfoConfig.male_self_intro_tags_1 == null) {
                            fillUserInfoConfig.male_self_intro_tags_1 = new ArrayList();
                        }
                        if (fillUserInfoConfig.male_self_intro_tags_2 == null) {
                            fillUserInfoConfig.male_self_intro_tags_2 = new ArrayList();
                        }
                        if (fillUserInfoConfig.female_self_intro_tags_1 == null) {
                            fillUserInfoConfig.female_self_intro_tags_1 = new ArrayList();
                        }
                        if (fillUserInfoConfig.female_self_intro_tags_2 == null) {
                            fillUserInfoConfig.female_self_intro_tags_2 = new ArrayList();
                        }
                        if (fillUserInfoConfig.male_other_tags == null) {
                            fillUserInfoConfig.male_other_tags = new ArrayList();
                        }
                        if (fillUserInfoConfig.female_other_tags == null) {
                            fillUserInfoConfig.female_other_tags = new ArrayList();
                        }
                        break;
                    case 10:
                        fillUserInfoConfig.male_avatar_url = nb5Var.m158750s();
                        continue;
                    case 18:
                        fillUserInfoConfig.female_avatar_url = nb5Var.m158750s();
                        continue;
                    case 26:
                        fillUserInfoConfig.male_name = nb5Var.m158750s();
                        continue;
                    case 34:
                        fillUserInfoConfig.female_name = nb5Var.m158750s();
                        continue;
                    case 40:
                        fillUserInfoConfig.expire_days = nb5Var.m158741j();
                        continue;
                    case 50:
                        fillUserInfoConfig.male_self_intro_tags_1 = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        fillUserInfoConfig.male_self_intro_tags_2 = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 66:
                        fillUserInfoConfig.female_self_intro_tags_1 = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        fillUserInfoConfig.female_self_intro_tags_2 = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        fillUserInfoConfig.male_other_tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        fillUserInfoConfig.female_other_tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (fillUserInfoConfig.male_avatar_url == null) {
                            fillUserInfoConfig.male_avatar_url = "";
                        }
                        if (fillUserInfoConfig.female_avatar_url == null) {
                            fillUserInfoConfig.female_avatar_url = "";
                        }
                        if (fillUserInfoConfig.male_name == null) {
                            fillUserInfoConfig.male_name = "";
                        }
                        if (fillUserInfoConfig.female_name == null) {
                            fillUserInfoConfig.female_name = "";
                        }
                        if (fillUserInfoConfig.male_self_intro_tags_1 == null) {
                            fillUserInfoConfig.male_self_intro_tags_1 = new ArrayList();
                        }
                        if (fillUserInfoConfig.male_self_intro_tags_2 == null) {
                            fillUserInfoConfig.male_self_intro_tags_2 = new ArrayList();
                        }
                        if (fillUserInfoConfig.female_self_intro_tags_1 == null) {
                            fillUserInfoConfig.female_self_intro_tags_1 = new ArrayList();
                        }
                        if (fillUserInfoConfig.female_self_intro_tags_2 == null) {
                            fillUserInfoConfig.female_self_intro_tags_2 = new ArrayList();
                        }
                        if (fillUserInfoConfig.male_other_tags == null) {
                            fillUserInfoConfig.male_other_tags = new ArrayList();
                        }
                        if (fillUserInfoConfig.female_other_tags == null) {
                            fillUserInfoConfig.female_other_tags = new ArrayList();
                            return fillUserInfoConfig;
                        }
                        break;
                }
            }
            return fillUserInfoConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FillUserInfoConfig fillUserInfoConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fillUserInfoConfig.male_avatar_url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = fillUserInfoConfig.female_avatar_url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = fillUserInfoConfig.male_name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = fillUserInfoConfig.female_name;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17250G(5, fillUserInfoConfig.expire_days);
            List<String> list = fillUserInfoConfig.male_self_intro_tags_1;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = fillUserInfoConfig.male_self_intro_tags_2;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(7, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = fillUserInfoConfig.female_self_intro_tags_1;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(8, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list4 = fillUserInfoConfig.female_self_intro_tags_2;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(9, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list5 = fillUserInfoConfig.male_other_tags;
            if (list5 != null) {
                codedOutputByteBufferNano.m17254K(10, list5, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list6 = fillUserInfoConfig.female_other_tags;
            if (list6 != null) {
                codedOutputByteBufferNano.m17254K(11, list6, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FillUserInfoConfig> JSON_ADAPTER = new ObjectJsonAdapter<FillUserInfoConfig>() { // from class: com.p1.mobile.putong.core.data.FillUserInfoConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FillUserInfoConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FillUserInfoConfig newInstance() {
            return new FillUserInfoConfig();
        }

        public boolean parseField(FillUserInfoConfig fillUserInfoConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "male_name":
                    fillUserInfoConfig.male_name = jsonParser.getValueAsString();
                    return true;
                case "male_avatar_url":
                    fillUserInfoConfig.male_avatar_url = jsonParser.getValueAsString();
                    return true;
                case "male_other_tags":
                    fillUserInfoConfig.male_other_tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "female_avatar_url":
                    fillUserInfoConfig.female_avatar_url = jsonParser.getValueAsString();
                    return true;
                case "male_self_intro_tags_1":
                    fillUserInfoConfig.male_self_intro_tags_1 = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "male_self_intro_tags_2":
                    fillUserInfoConfig.male_self_intro_tags_2 = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "female_other_tags":
                    fillUserInfoConfig.female_other_tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "expire_days":
                    fillUserInfoConfig.expire_days = jsonParser.getValueAsInt();
                    return true;
                case "female_name":
                    fillUserInfoConfig.female_name = jsonParser.getValueAsString();
                    return true;
                case "female_self_intro_tags_1":
                    fillUserInfoConfig.female_self_intro_tags_1 = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "female_self_intro_tags_2":
                    fillUserInfoConfig.female_self_intro_tags_2 = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FillUserInfoConfig fillUserInfoConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "male_name":
                case "male_avatar_url":
                case "male_other_tags":
                case "female_avatar_url":
                case "male_self_intro_tags_1":
                case "male_self_intro_tags_2":
                case "female_other_tags":
                case "expire_days":
                case "female_name":
                case "female_self_intro_tags_1":
                case "female_self_intro_tags_2":
                    return true;
                default:
                    return super.parseFieldCheck(fillUserInfoConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FillUserInfoConfig fillUserInfoConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = fillUserInfoConfig.male_avatar_url;
            if (str != null) {
                jsonGenerator.writeStringField("male_avatar_url", str);
            }
            String str2 = fillUserInfoConfig.female_avatar_url;
            if (str2 != null) {
                jsonGenerator.writeStringField("female_avatar_url", str2);
            }
            String str3 = fillUserInfoConfig.male_name;
            if (str3 != null) {
                jsonGenerator.writeStringField("male_name", str3);
            }
            String str4 = fillUserInfoConfig.female_name;
            if (str4 != null) {
                jsonGenerator.writeStringField("female_name", str4);
            }
            jsonGenerator.writeNumberField("expire_days", fillUserInfoConfig.expire_days);
            if (fillUserInfoConfig.male_self_intro_tags_1 != null) {
                jsonGenerator.writeFieldName("male_self_intro_tags_1");
                JsonAdapter.serializeArray(fillUserInfoConfig.male_self_intro_tags_1, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (fillUserInfoConfig.male_self_intro_tags_2 != null) {
                jsonGenerator.writeFieldName("male_self_intro_tags_2");
                JsonAdapter.serializeArray(fillUserInfoConfig.male_self_intro_tags_2, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (fillUserInfoConfig.female_self_intro_tags_1 != null) {
                jsonGenerator.writeFieldName("female_self_intro_tags_1");
                JsonAdapter.serializeArray(fillUserInfoConfig.female_self_intro_tags_1, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (fillUserInfoConfig.female_self_intro_tags_2 != null) {
                jsonGenerator.writeFieldName("female_self_intro_tags_2");
                JsonAdapter.serializeArray(fillUserInfoConfig.female_self_intro_tags_2, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (fillUserInfoConfig.male_other_tags != null) {
                jsonGenerator.writeFieldName("male_other_tags");
                JsonAdapter.serializeArray(fillUserInfoConfig.male_other_tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (fillUserInfoConfig.female_other_tags != null) {
                jsonGenerator.writeFieldName("female_other_tags");
                JsonAdapter.serializeArray(fillUserInfoConfig.female_other_tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FillUserInfoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FillUserInfoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35524a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35525b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35526c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m35527d(String str) {
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m35528e(String str) {
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m35529f(String str) {
        return str;
    }

    public static FillUserInfoConfig new_() {
        FillUserInfoConfig fillUserInfoConfig = new FillUserInfoConfig();
        fillUserInfoConfig.nullCheck();
        return fillUserInfoConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FillUserInfoConfig mo223809clone() {
        FillUserInfoConfig fillUserInfoConfig = new FillUserInfoConfig();
        fillUserInfoConfig.male_avatar_url = this.male_avatar_url;
        fillUserInfoConfig.female_avatar_url = this.female_avatar_url;
        fillUserInfoConfig.male_name = this.male_name;
        fillUserInfoConfig.female_name = this.female_name;
        fillUserInfoConfig.expire_days = this.expire_days;
        List<String> list = this.male_self_intro_tags_1;
        if (list != null) {
            fillUserInfoConfig.male_self_intro_tags_1 = ValueObject.util_map(list, new w9j() { // from class: l.dii
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FillUserInfoConfig.m35528e((String) obj);
                }
            });
        }
        List<String> list2 = this.male_self_intro_tags_2;
        if (list2 != null) {
            fillUserInfoConfig.male_self_intro_tags_2 = ValueObject.util_map(list2, new w9j() { // from class: l.eii
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FillUserInfoConfig.m35525b((String) obj);
                }
            });
        }
        List<String> list3 = this.female_self_intro_tags_1;
        if (list3 != null) {
            fillUserInfoConfig.female_self_intro_tags_1 = ValueObject.util_map(list3, new w9j() { // from class: l.fii
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FillUserInfoConfig.m35527d((String) obj);
                }
            });
        }
        List<String> list4 = this.female_self_intro_tags_2;
        if (list4 != null) {
            fillUserInfoConfig.female_self_intro_tags_2 = ValueObject.util_map(list4, new w9j() { // from class: l.gii
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FillUserInfoConfig.m35524a((String) obj);
                }
            });
        }
        List<String> list5 = this.male_other_tags;
        if (list5 != null) {
            fillUserInfoConfig.male_other_tags = ValueObject.util_map(list5, new w9j() { // from class: l.hii
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FillUserInfoConfig.m35529f((String) obj);
                }
            });
        }
        List<String> list6 = this.female_other_tags;
        if (list6 != null) {
            fillUserInfoConfig.female_other_tags = ValueObject.util_map(list6, new w9j() { // from class: l.iii
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FillUserInfoConfig.m35526c((String) obj);
                }
            });
        }
        return fillUserInfoConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FillUserInfoConfig)) {
            return false;
        }
        FillUserInfoConfig fillUserInfoConfig = (FillUserInfoConfig) obj;
        return ValueObject.util_equals(this.male_avatar_url, fillUserInfoConfig.male_avatar_url) && ValueObject.util_equals(this.female_avatar_url, fillUserInfoConfig.female_avatar_url) && ValueObject.util_equals(this.male_name, fillUserInfoConfig.male_name) && ValueObject.util_equals(this.female_name, fillUserInfoConfig.female_name) && this.expire_days == fillUserInfoConfig.expire_days && ValueObject.util_equals(this.male_self_intro_tags_1, fillUserInfoConfig.male_self_intro_tags_1) && ValueObject.util_equals(this.male_self_intro_tags_2, fillUserInfoConfig.male_self_intro_tags_2) && ValueObject.util_equals(this.female_self_intro_tags_1, fillUserInfoConfig.female_self_intro_tags_1) && ValueObject.util_equals(this.female_self_intro_tags_2, fillUserInfoConfig.female_self_intro_tags_2) && ValueObject.util_equals(this.male_other_tags, fillUserInfoConfig.male_other_tags) && ValueObject.util_equals(this.female_other_tags, fillUserInfoConfig.female_other_tags);
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
        String str = this.male_avatar_url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.female_avatar_url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.male_name;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.female_name;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.expire_days) * 41;
        List<String> list = this.male_self_intro_tags_1;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.male_self_intro_tags_2;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.female_self_intro_tags_1;
        int iHashCode7 = (iHashCode6 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.female_self_intro_tags_2;
        int iHashCode8 = (iHashCode7 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<String> list5 = this.male_other_tags;
        int iHashCode9 = (iHashCode8 + (list5 != null ? list5.hashCode() : 0)) * 41;
        List<String> list6 = this.female_other_tags;
        int iHashCode10 = iHashCode9 + (list6 != null ? list6.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.male_avatar_url == null) {
            this.male_avatar_url = "";
        }
        if (this.female_avatar_url == null) {
            this.female_avatar_url = "";
        }
        if (this.male_name == null) {
            this.male_name = "";
        }
        if (this.female_name == null) {
            this.female_name = "";
        }
        if (this.male_self_intro_tags_1 == null) {
            this.male_self_intro_tags_1 = new ArrayList();
        }
        if (this.male_self_intro_tags_2 == null) {
            this.male_self_intro_tags_2 = new ArrayList();
        }
        if (this.female_self_intro_tags_1 == null) {
            this.female_self_intro_tags_1 = new ArrayList();
        }
        if (this.female_self_intro_tags_2 == null) {
            this.female_self_intro_tags_2 = new ArrayList();
        }
        if (this.male_other_tags == null) {
            this.male_other_tags = new ArrayList();
        }
        if (this.female_other_tags == null) {
            this.female_other_tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
