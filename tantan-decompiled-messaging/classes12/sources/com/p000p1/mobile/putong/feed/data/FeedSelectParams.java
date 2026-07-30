package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSelectParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedselectparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 2)
    public String param;
    public static ProtobufAdapter<FeedSelectParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedSelectParams>() { // from class: com.p1.mobile.putong.feed.data.FeedSelectParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedSelectParams feedSelectParams) {
            String str = feedSelectParams.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = feedSelectParams.param;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) feedSelectParams).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedSelectParams m19503parse(nb5 nb5Var) throws IOException {
            FeedSelectParams feedSelectParams = new FeedSelectParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (feedSelectParams.name == null) {
                        feedSelectParams.name = "";
                    }
                    if (feedSelectParams.param != null) {
                        break;
                    }
                    feedSelectParams.param = "";
                    break;
                }
                if (iU == 10) {
                    feedSelectParams.name = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (feedSelectParams.name == null) {
                            feedSelectParams.name = "";
                        }
                        if (feedSelectParams.param != null) {
                            break;
                        }
                        feedSelectParams.param = "";
                        return feedSelectParams;
                    }
                    feedSelectParams.param = nb5Var.s();
                }
            }
            return feedSelectParams;
        }

        public void serialize(FeedSelectParams feedSelectParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedSelectParams.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = feedSelectParams.param;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FeedSelectParams> JSON_ADAPTER = new ObjectJsonAdapter<FeedSelectParams>() { // from class: com.p1.mobile.putong.feed.data.FeedSelectParams.2
        public Class getDataClass() {
            return FeedSelectParams.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FeedSelectParams mo17830newInstance() {
            return new FeedSelectParams();
        }

        public boolean parseField(FeedSelectParams feedSelectParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("name")) {
                feedSelectParams.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("param")) {
                return false;
            }
            feedSelectParams.param = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FeedSelectParams feedSelectParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name") || str.equals("param")) {
                return true;
            }
            return super.parseFieldCheck(feedSelectParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedSelectParams feedSelectParams, JsonGenerator jsonGenerator) throws IOException {
            String str = feedSelectParams.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = feedSelectParams.param;
            if (str2 != null) {
                jsonGenerator.writeStringField("param", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedSelectParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedSelectParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedSelectParams new_() {
        FeedSelectParams feedSelectParams = new FeedSelectParams();
        feedSelectParams.nullCheck();
        return feedSelectParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedSelectParams m19502clone() {
        FeedSelectParams feedSelectParams = new FeedSelectParams();
        feedSelectParams.name = this.name;
        feedSelectParams.param = this.param;
        return feedSelectParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedSelectParams)) {
            return false;
        }
        FeedSelectParams feedSelectParams = (FeedSelectParams) obj;
        return ValueObject.util_equals(this.name, feedSelectParams.name) && ValueObject.util_equals(this.param, feedSelectParams.param);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.param;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.param == null) {
            this.param = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
