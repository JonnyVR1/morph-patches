package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Literatures;
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
public class Literatures extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "literatures";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> authors;

    @NonNull
    @ProtobufIndex(index = 5)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String category;

    @NonNull
    @ProtobufIndex(index = 3)
    public String headUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f21175id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> kinds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<Literatures> PROTOBUF_ADAPTER = new MessageNanoAdapter<Literatures>() { // from class: com.p1.mobile.putong.core.data.Literatures.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Literatures literatures) {
            String str = literatures.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = literatures.category;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = literatures.headUrl;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            List<String> list = literatures.kinds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = literatures.bgColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            List<String> list2 = literatures.authors;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = literatures.f21175id;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            literatures.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Literatures parse(nc5 nc5Var) throws IOException {
            Literatures literatures = new Literatures();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (literatures.title == null) {
                        literatures.title = "";
                    }
                    if (literatures.category == null) {
                        literatures.category = "";
                    }
                    if (literatures.headUrl == null) {
                        literatures.headUrl = "";
                    }
                    if (literatures.kinds == null) {
                        literatures.kinds = new ArrayList();
                    }
                    if (literatures.bgColor == null) {
                        literatures.bgColor = "";
                    }
                    if (literatures.authors == null) {
                        literatures.authors = new ArrayList();
                    }
                    if (literatures.f21175id != null) {
                        break;
                    }
                    literatures.f21175id = "";
                    break;
                }
                if (iM162497u == 10) {
                    literatures.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    literatures.category = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    literatures.headUrl = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    literatures.kinds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    literatures.bgColor = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    literatures.authors = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 58) {
                        if (literatures.title == null) {
                            literatures.title = "";
                        }
                        if (literatures.category == null) {
                            literatures.category = "";
                        }
                        if (literatures.headUrl == null) {
                            literatures.headUrl = "";
                        }
                        if (literatures.kinds == null) {
                            literatures.kinds = new ArrayList();
                        }
                        if (literatures.bgColor == null) {
                            literatures.bgColor = "";
                        }
                        if (literatures.authors == null) {
                            literatures.authors = new ArrayList();
                        }
                        if (literatures.f21175id != null) {
                            break;
                        }
                        literatures.f21175id = "";
                        return literatures;
                    }
                    literatures.f21175id = nc5Var.m162495s();
                }
            }
            return literatures;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Literatures literatures, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = literatures.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = literatures.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = literatures.headUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            List<String> list = literatures.kinds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = literatures.bgColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            List<String> list2 = literatures.authors;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = literatures.f21175id;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
        }
    };
    public static JsonAdapter<Literatures> JSON_ADAPTER = new ObjectJsonAdapter<Literatures>() { // from class: com.p1.mobile.putong.core.data.Literatures.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Literatures.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Literatures newInstance() {
            return new Literatures();
        }

        public boolean parseField(Literatures literatures, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "authors":
                    literatures.authors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bgColor":
                    literatures.bgColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    literatures.f21175id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    literatures.category = jsonParser.getValueAsString();
                    return true;
                case "kinds":
                    literatures.kinds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    literatures.title = jsonParser.getValueAsString();
                    return true;
                case "headUrl":
                    literatures.headUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Literatures literatures, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "authors":
                case "bgColor":
                    return true;
                case "id":
                    return false;
                case "category":
                case "kinds":
                case "title":
                case "headUrl":
                    return true;
                default:
                    return super.parseFieldCheck(literatures, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Literatures literatures, JsonGenerator jsonGenerator) throws IOException {
            String str = literatures.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = literatures.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
            String str3 = literatures.headUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("headUrl", str3);
            }
            if (literatures.kinds != null) {
                jsonGenerator.writeFieldName("kinds");
                JsonAdapter.serializeArray(literatures.kinds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = literatures.bgColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgColor", str4);
            }
            if (literatures.authors != null) {
                jsonGenerator.writeFieldName("authors");
                JsonAdapter.serializeArray(literatures.authors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = literatures.f21175id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Literatures) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Literatures) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36650a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36651b(String str) {
        return str;
    }

    public static Literatures new_() {
        Literatures literatures = new Literatures();
        literatures.nullCheck();
        return literatures;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Literatures mo225055clone() {
        Literatures literatures = new Literatures();
        literatures.title = this.title;
        literatures.category = this.category;
        literatures.headUrl = this.headUrl;
        List<String> list = this.kinds;
        if (list != null) {
            literatures.kinds = ValueObject.util_map(list, new qcj() { // from class: l.gqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Literatures.m36651b((String) obj);
                }
            });
        }
        literatures.bgColor = this.bgColor;
        List<String> list2 = this.authors;
        if (list2 != null) {
            literatures.authors = ValueObject.util_map(list2, new qcj() { // from class: l.hqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Literatures.m36650a((String) obj);
                }
            });
        }
        literatures.f21175id = this.f21175id;
        return literatures;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Literatures)) {
            return false;
        }
        Literatures literatures = (Literatures) obj;
        return ValueObject.util_equals(this.title, literatures.title) && ValueObject.util_equals(this.category, literatures.category) && ValueObject.util_equals(this.headUrl, literatures.headUrl) && ValueObject.util_equals(this.kinds, literatures.kinds) && ValueObject.util_equals(this.bgColor, literatures.bgColor) && ValueObject.util_equals(this.authors, literatures.authors) && ValueObject.util_equals(this.f21175id, literatures.f21175id);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.headUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<String> list = this.kinds;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.bgColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list2 = this.authors;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str5 = this.f21175id;
        int iHashCode7 = iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.headUrl == null) {
            this.headUrl = "";
        }
        if (this.kinds == null) {
            this.kinds = new ArrayList();
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
        if (this.authors == null) {
            this.authors = new ArrayList();
        }
        if (this.f21175id == null) {
            this.f21175id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
