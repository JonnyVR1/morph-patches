package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.FeedPostTitleTagConfig;
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
public class FeedPostTitleTagConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedposttitletagconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String from;

    @NonNull
    @ProtobufIndex(index = 3)
    public String hint;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> titles;
    public static ProtobufAdapter<FeedPostTitleTagConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedPostTitleTagConfig>() { // from class: com.p1.mobile.putong.feed.data.FeedPostTitleTagConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedPostTitleTagConfig feedPostTitleTagConfig) {
            String str = feedPostTitleTagConfig.from;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = feedPostTitleTagConfig.titles;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = feedPostTitleTagConfig.hint;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            feedPostTitleTagConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedPostTitleTagConfig parse(nb5 nb5Var) throws IOException {
            FeedPostTitleTagConfig feedPostTitleTagConfig = new FeedPostTitleTagConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (feedPostTitleTagConfig.from == null) {
                        feedPostTitleTagConfig.from = "";
                    }
                    if (feedPostTitleTagConfig.titles == null) {
                        feedPostTitleTagConfig.titles = new ArrayList();
                    }
                    if (feedPostTitleTagConfig.hint != null) {
                        break;
                    }
                    feedPostTitleTagConfig.hint = "";
                    break;
                }
                if (iM158752u == 10) {
                    feedPostTitleTagConfig.from = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    feedPostTitleTagConfig.titles = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (feedPostTitleTagConfig.from == null) {
                            feedPostTitleTagConfig.from = "";
                        }
                        if (feedPostTitleTagConfig.titles == null) {
                            feedPostTitleTagConfig.titles = new ArrayList();
                        }
                        if (feedPostTitleTagConfig.hint != null) {
                            break;
                        }
                        feedPostTitleTagConfig.hint = "";
                        return feedPostTitleTagConfig;
                    }
                    feedPostTitleTagConfig.hint = nb5Var.m158750s();
                }
            }
            return feedPostTitleTagConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedPostTitleTagConfig feedPostTitleTagConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedPostTitleTagConfig.from;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = feedPostTitleTagConfig.titles;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = feedPostTitleTagConfig.hint;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<FeedPostTitleTagConfig> JSON_ADAPTER = new ObjectJsonAdapter<FeedPostTitleTagConfig>() { // from class: com.p1.mobile.putong.feed.data.FeedPostTitleTagConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedPostTitleTagConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedPostTitleTagConfig newInstance() {
            return new FeedPostTitleTagConfig();
        }

        public boolean parseField(FeedPostTitleTagConfig feedPostTitleTagConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titles":
                    feedPostTitleTagConfig.titles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "from":
                    feedPostTitleTagConfig.from = jsonParser.getValueAsString();
                    return true;
                case "hint":
                    feedPostTitleTagConfig.hint = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FeedPostTitleTagConfig feedPostTitleTagConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "titles":
                case "from":
                case "hint":
                    return true;
                default:
                    return super.parseFieldCheck(feedPostTitleTagConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedPostTitleTagConfig feedPostTitleTagConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = feedPostTitleTagConfig.from;
            if (str != null) {
                jsonGenerator.writeStringField("from", str);
            }
            if (feedPostTitleTagConfig.titles != null) {
                jsonGenerator.writeFieldName("titles");
                JsonAdapter.serializeArray(feedPostTitleTagConfig.titles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = feedPostTitleTagConfig.hint;
            if (str2 != null) {
                jsonGenerator.writeStringField(TrackReferenceTypeBox.TYPE1, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedPostTitleTagConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedPostTitleTagConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60842a(String str) {
        return str;
    }

    public static FeedPostTitleTagConfig new_() {
        FeedPostTitleTagConfig feedPostTitleTagConfig = new FeedPostTitleTagConfig();
        feedPostTitleTagConfig.nullCheck();
        return feedPostTitleTagConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedPostTitleTagConfig mo223809clone() {
        FeedPostTitleTagConfig feedPostTitleTagConfig = new FeedPostTitleTagConfig();
        feedPostTitleTagConfig.from = this.from;
        List<String> list = this.titles;
        if (list != null) {
            feedPostTitleTagConfig.titles = ValueObject.util_map(list, new w9j() { // from class: l.pvh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FeedPostTitleTagConfig.m60842a((String) obj);
                }
            });
        }
        feedPostTitleTagConfig.hint = this.hint;
        return feedPostTitleTagConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedPostTitleTagConfig)) {
            return false;
        }
        FeedPostTitleTagConfig feedPostTitleTagConfig = (FeedPostTitleTagConfig) obj;
        return ValueObject.util_equals(this.from, feedPostTitleTagConfig.from) && ValueObject.util_equals(this.titles, feedPostTitleTagConfig.titles) && ValueObject.util_equals(this.hint, feedPostTitleTagConfig.hint);
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
        String str = this.from;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.titles;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.hint;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.from == null) {
            this.from = "";
        }
        if (this.titles == null) {
            this.titles = new ArrayList();
        }
        if (this.hint == null) {
            this.hint = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
