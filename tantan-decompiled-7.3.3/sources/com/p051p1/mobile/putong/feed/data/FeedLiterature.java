package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.FeedLiterature;
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

/* JADX INFO: loaded from: classes13.dex */
public class FeedLiterature extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedliterature";

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
    @ProtobufIndex(index = 8)
    public String counter;

    @NonNull
    @ProtobufIndex(index = 3)
    public String headUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 7)
    public String f40068id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> kinds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<FeedLiterature> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedLiterature>() { // from class: com.p1.mobile.putong.feed.data.FeedLiterature.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedLiterature feedLiterature) {
            String str = feedLiterature.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = feedLiterature.category;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = feedLiterature.headUrl;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            List<String> list = feedLiterature.kinds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = feedLiterature.bgColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            List<String> list2 = feedLiterature.authors;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = feedLiterature.f40068id;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            String str6 = feedLiterature.counter;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            feedLiterature.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedLiterature parse(nc5 nc5Var) throws IOException {
            FeedLiterature feedLiterature = new FeedLiterature();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (feedLiterature.title == null) {
                        feedLiterature.title = "";
                    }
                    if (feedLiterature.category == null) {
                        feedLiterature.category = "";
                    }
                    if (feedLiterature.headUrl == null) {
                        feedLiterature.headUrl = "";
                    }
                    if (feedLiterature.kinds == null) {
                        feedLiterature.kinds = new ArrayList();
                    }
                    if (feedLiterature.bgColor == null) {
                        feedLiterature.bgColor = "";
                    }
                    if (feedLiterature.authors == null) {
                        feedLiterature.authors = new ArrayList();
                    }
                    if (feedLiterature.f40068id == null) {
                        feedLiterature.f40068id = "";
                    }
                    if (feedLiterature.counter != null) {
                        break;
                    }
                    feedLiterature.counter = "";
                    break;
                }
                if (iM162497u == 10) {
                    feedLiterature.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    feedLiterature.category = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    feedLiterature.headUrl = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    feedLiterature.kinds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    feedLiterature.bgColor = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    feedLiterature.authors = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 58) {
                    feedLiterature.f40068id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (feedLiterature.title == null) {
                            feedLiterature.title = "";
                        }
                        if (feedLiterature.category == null) {
                            feedLiterature.category = "";
                        }
                        if (feedLiterature.headUrl == null) {
                            feedLiterature.headUrl = "";
                        }
                        if (feedLiterature.kinds == null) {
                            feedLiterature.kinds = new ArrayList();
                        }
                        if (feedLiterature.bgColor == null) {
                            feedLiterature.bgColor = "";
                        }
                        if (feedLiterature.authors == null) {
                            feedLiterature.authors = new ArrayList();
                        }
                        if (feedLiterature.f40068id == null) {
                            feedLiterature.f40068id = "";
                        }
                        if (feedLiterature.counter != null) {
                            break;
                        }
                        feedLiterature.counter = "";
                        return feedLiterature;
                    }
                    feedLiterature.counter = nc5Var.m162495s();
                }
            }
            return feedLiterature;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedLiterature feedLiterature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedLiterature.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = feedLiterature.category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = feedLiterature.headUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            List<String> list = feedLiterature.kinds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = feedLiterature.bgColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            List<String> list2 = feedLiterature.authors;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = feedLiterature.f40068id;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            String str6 = feedLiterature.counter;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
        }
    };
    public static JsonAdapter<FeedLiterature> JSON_ADAPTER = new ObjectJsonAdapter<FeedLiterature>() { // from class: com.p1.mobile.putong.feed.data.FeedLiterature.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedLiterature.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedLiterature newInstance() {
            return new FeedLiterature();
        }

        public boolean parseField(FeedLiterature feedLiterature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "authors":
                    feedLiterature.authors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bgColor":
                    feedLiterature.bgColor = jsonParser.getValueAsString();
                    return true;
                case "id":
                    feedLiterature.f40068id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    feedLiterature.category = jsonParser.getValueAsString();
                    return true;
                case "kinds":
                    feedLiterature.kinds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    feedLiterature.title = jsonParser.getValueAsString();
                    return true;
                case "headUrl":
                    feedLiterature.headUrl = jsonParser.getValueAsString();
                    return true;
                case "counter":
                    feedLiterature.counter = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FeedLiterature feedLiterature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
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
                case "counter":
                    return true;
                default:
                    return super.parseFieldCheck(feedLiterature, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedLiterature feedLiterature, JsonGenerator jsonGenerator) throws IOException {
            String str = feedLiterature.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = feedLiterature.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
            String str3 = feedLiterature.headUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("headUrl", str3);
            }
            if (feedLiterature.kinds != null) {
                jsonGenerator.writeFieldName("kinds");
                JsonAdapter.serializeArray(feedLiterature.kinds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str4 = feedLiterature.bgColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgColor", str4);
            }
            if (feedLiterature.authors != null) {
                jsonGenerator.writeFieldName("authors");
                JsonAdapter.serializeArray(feedLiterature.authors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = feedLiterature.f40068id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
            String str6 = feedLiterature.counter;
            if (str6 != null) {
                jsonGenerator.writeStringField(Counter.TYPE, str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedLiterature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedLiterature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62022a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m62023b(String str) {
        return str;
    }

    public static FeedLiterature new_() {
        FeedLiterature feedLiterature = new FeedLiterature();
        feedLiterature.nullCheck();
        return feedLiterature;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedLiterature mo225055clone() {
        FeedLiterature feedLiterature = new FeedLiterature();
        feedLiterature.title = this.title;
        feedLiterature.category = this.category;
        feedLiterature.headUrl = this.headUrl;
        List<String> list = this.kinds;
        if (list != null) {
            feedLiterature.kinds = ValueObject.util_map(list, new qcj() { // from class: l.xch
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return FeedLiterature.m62022a((String) obj);
                }
            });
        }
        feedLiterature.bgColor = this.bgColor;
        List<String> list2 = this.authors;
        if (list2 != null) {
            feedLiterature.authors = ValueObject.util_map(list2, new qcj() { // from class: l.ych
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return FeedLiterature.m62023b((String) obj);
                }
            });
        }
        feedLiterature.f40068id = this.f40068id;
        feedLiterature.counter = this.counter;
        return feedLiterature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedLiterature)) {
            return false;
        }
        FeedLiterature feedLiterature = (FeedLiterature) obj;
        return ValueObject.util_equals(this.title, feedLiterature.title) && ValueObject.util_equals(this.category, feedLiterature.category) && ValueObject.util_equals(this.headUrl, feedLiterature.headUrl) && ValueObject.util_equals(this.kinds, feedLiterature.kinds) && ValueObject.util_equals(this.bgColor, feedLiterature.bgColor) && ValueObject.util_equals(this.authors, feedLiterature.authors) && ValueObject.util_equals(this.f40068id, feedLiterature.f40068id) && ValueObject.util_equals(this.counter, feedLiterature.counter);
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
        String str5 = this.f40068id;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.counter;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
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
        if (this.f40068id == null) {
            this.f40068id = "";
        }
        if (this.counter == null) {
            this.counter = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
