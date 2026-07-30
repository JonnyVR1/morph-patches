package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LiteratureConfig;
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
public class LiteratureConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "literatureconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String category;

    @NonNull
    @ProtobufIndex(index = 6)
    public String headUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38766id;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> kinds;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;
    public static ProtobufAdapter<LiteratureConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiteratureConfig>() { // from class: com.p1.mobile.putong.data.LiteratureConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiteratureConfig literatureConfig) {
            String str = literatureConfig.f38766id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = literatureConfig.category;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = literatureConfig.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = literatureConfig.title;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            List<String> list = literatureConfig.kinds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = literatureConfig.headUrl;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            literatureConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiteratureConfig parse(nb5 nb5Var) throws IOException {
            LiteratureConfig literatureConfig = new LiteratureConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (literatureConfig.f38766id == null) {
                        literatureConfig.f38766id = "";
                    }
                    if (literatureConfig.category == null) {
                        literatureConfig.category = "";
                    }
                    if (literatureConfig.icon == null) {
                        literatureConfig.icon = "";
                    }
                    if (literatureConfig.title == null) {
                        literatureConfig.title = "";
                    }
                    if (literatureConfig.kinds == null) {
                        literatureConfig.kinds = new ArrayList();
                    }
                    if (literatureConfig.headUrl != null) {
                        break;
                    }
                    literatureConfig.headUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    literatureConfig.f38766id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    literatureConfig.category = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    literatureConfig.icon = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    literatureConfig.title = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    literatureConfig.kinds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (literatureConfig.f38766id == null) {
                            literatureConfig.f38766id = "";
                        }
                        if (literatureConfig.category == null) {
                            literatureConfig.category = "";
                        }
                        if (literatureConfig.icon == null) {
                            literatureConfig.icon = "";
                        }
                        if (literatureConfig.title == null) {
                            literatureConfig.title = "";
                        }
                        if (literatureConfig.kinds == null) {
                            literatureConfig.kinds = new ArrayList();
                        }
                        if (literatureConfig.headUrl != null) {
                            break;
                        }
                        literatureConfig.headUrl = "";
                        return literatureConfig;
                    }
                    literatureConfig.headUrl = nb5Var.m158750s();
                }
            }
            return literatureConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiteratureConfig literatureConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = literatureConfig.f38766id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = literatureConfig.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = literatureConfig.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = literatureConfig.title;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            List<String> list = literatureConfig.kinds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = literatureConfig.headUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
        }
    };
    public static JsonAdapter<LiteratureConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiteratureConfig>() { // from class: com.p1.mobile.putong.data.LiteratureConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiteratureConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiteratureConfig newInstance() {
            return new LiteratureConfig();
        }

        public boolean parseField(LiteratureConfig literatureConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    literatureConfig.f38766id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    literatureConfig.icon = jsonParser.getValueAsString();
                    return true;
                case "category":
                    literatureConfig.category = jsonParser.getValueAsString();
                    return true;
                case "kinds":
                    literatureConfig.kinds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    literatureConfig.title = jsonParser.getValueAsString();
                    return true;
                case "headUrl":
                    literatureConfig.headUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiteratureConfig literatureConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "icon":
                case "category":
                case "kinds":
                case "title":
                case "headUrl":
                    return true;
                default:
                    return super.parseFieldCheck(literatureConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiteratureConfig literatureConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = literatureConfig.f38766id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = literatureConfig.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
            String str3 = literatureConfig.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = literatureConfig.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            if (literatureConfig.kinds != null) {
                jsonGenerator.writeFieldName("kinds");
                JsonAdapter.serializeArray(literatureConfig.kinds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = literatureConfig.headUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("headUrl", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiteratureConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiteratureConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59825a(String str) {
        return str;
    }

    public static LiteratureConfig new_() {
        LiteratureConfig literatureConfig = new LiteratureConfig();
        literatureConfig.nullCheck();
        return literatureConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiteratureConfig mo223809clone() {
        LiteratureConfig literatureConfig = new LiteratureConfig();
        literatureConfig.f38766id = this.f38766id;
        literatureConfig.category = this.category;
        literatureConfig.icon = this.icon;
        literatureConfig.title = this.title;
        List<String> list = this.kinds;
        if (list != null) {
            literatureConfig.kinds = ValueObject.util_map(list, new w9j() { // from class: l.bor
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiteratureConfig.m59825a((String) obj);
                }
            });
        }
        literatureConfig.headUrl = this.headUrl;
        return literatureConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiteratureConfig)) {
            return false;
        }
        LiteratureConfig literatureConfig = (LiteratureConfig) obj;
        return ValueObject.util_equals(this.f38766id, literatureConfig.f38766id) && ValueObject.util_equals(this.category, literatureConfig.category) && ValueObject.util_equals(this.icon, literatureConfig.icon) && ValueObject.util_equals(this.title, literatureConfig.title) && ValueObject.util_equals(this.kinds, literatureConfig.kinds) && ValueObject.util_equals(this.headUrl, literatureConfig.headUrl);
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
        String str = this.f38766id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.kinds;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.headUrl;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38766id == null) {
            this.f38766id = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.kinds == null) {
            this.kinds = new ArrayList();
        }
        if (this.headUrl == null) {
            this.headUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
