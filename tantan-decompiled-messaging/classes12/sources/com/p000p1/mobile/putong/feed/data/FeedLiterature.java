package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.FeedLiterature;
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
    public String f681id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> kinds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<FeedLiterature> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedLiterature>() { // from class: com.p1.mobile.putong.feed.data.FeedLiterature.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedLiterature feedLiterature) {
            String str = feedLiterature.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = feedLiterature.category;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = feedLiterature.headUrl;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            List<String> list = feedLiterature.kinds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = feedLiterature.bgColor;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            List<String> list2 = feedLiterature.authors;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = feedLiterature.f681id;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = feedLiterature.counter;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(8, str6);
            }
            ((MessageNano) feedLiterature).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedLiterature m19491parse(nb5 nb5Var) throws IOException {
            FeedLiterature feedLiterature = new FeedLiterature();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                    if (feedLiterature.f681id == null) {
                        feedLiterature.f681id = "";
                    }
                    if (feedLiterature.counter != null) {
                        break;
                    }
                    feedLiterature.counter = "";
                    break;
                }
                if (iU == 10) {
                    feedLiterature.title = nb5Var.s();
                } else if (iU == 18) {
                    feedLiterature.category = nb5Var.s();
                } else if (iU == 26) {
                    feedLiterature.headUrl = nb5Var.s();
                } else if (iU == 34) {
                    feedLiterature.kinds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    feedLiterature.bgColor = nb5Var.s();
                } else if (iU == 50) {
                    feedLiterature.authors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 58) {
                    feedLiterature.f681id = nb5Var.s();
                } else {
                    if (iU != 66) {
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
                        if (feedLiterature.f681id == null) {
                            feedLiterature.f681id = "";
                        }
                        if (feedLiterature.counter != null) {
                            break;
                        }
                        feedLiterature.counter = "";
                        return feedLiterature;
                    }
                    feedLiterature.counter = nb5Var.s();
                }
            }
            return feedLiterature;
        }

        public void serialize(FeedLiterature feedLiterature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedLiterature.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = feedLiterature.category;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = feedLiterature.headUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            List<String> list = feedLiterature.kinds;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = feedLiterature.bgColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            List<String> list2 = feedLiterature.authors;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = feedLiterature.f681id;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = feedLiterature.counter;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
        }
    };
    public static JsonAdapter<FeedLiterature> JSON_ADAPTER = new ObjectJsonAdapter<FeedLiterature>() { // from class: com.p1.mobile.putong.feed.data.FeedLiterature.2
        public Class getDataClass() {
            return FeedLiterature.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FeedLiterature mo17830newInstance() {
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
                    feedLiterature.f681id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            String str5 = feedLiterature.f681id;
            if (str5 != null) {
                jsonGenerator.writeStringField("id", str5);
            }
            String str6 = feedLiterature.counter;
            if (str6 != null) {
                jsonGenerator.writeStringField(Counter.TYPE, str6);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedLiterature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedLiterature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1764a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1765b(String str) {
        return str;
    }

    public static FeedLiterature new_() {
        FeedLiterature feedLiterature = new FeedLiterature();
        feedLiterature.nullCheck();
        return feedLiterature;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedLiterature m19490clone() {
        FeedLiterature feedLiterature = new FeedLiterature();
        feedLiterature.title = this.title;
        feedLiterature.category = this.category;
        feedLiterature.headUrl = this.headUrl;
        List<String> list = this.kinds;
        if (list != null) {
            feedLiterature.kinds = ValueObject.util_map(list, new w9j() { // from class: l.ibh
                public final Object call(Object obj) {
                    return FeedLiterature.m1764a((String) obj);
                }
            });
        }
        feedLiterature.bgColor = this.bgColor;
        List<String> list2 = this.authors;
        if (list2 != null) {
            feedLiterature.authors = ValueObject.util_map(list2, new w9j() { // from class: l.jbh
                public final Object call(Object obj) {
                    return FeedLiterature.m1765b((String) obj);
                }
            });
        }
        feedLiterature.f681id = this.f681id;
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
        return ValueObject.util_equals(this.title, feedLiterature.title) && ValueObject.util_equals(this.category, feedLiterature.category) && ValueObject.util_equals(this.headUrl, feedLiterature.headUrl) && ValueObject.util_equals(this.kinds, feedLiterature.kinds) && ValueObject.util_equals(this.bgColor, feedLiterature.bgColor) && ValueObject.util_equals(this.authors, feedLiterature.authors) && ValueObject.util_equals(this.f681id, feedLiterature.f681id) && ValueObject.util_equals(this.counter, feedLiterature.counter);
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
        String str5 = this.f681id;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.counter;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

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
        if (this.f681id == null) {
            this.f681id = "";
        }
        if (this.counter == null) {
            this.counter = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
