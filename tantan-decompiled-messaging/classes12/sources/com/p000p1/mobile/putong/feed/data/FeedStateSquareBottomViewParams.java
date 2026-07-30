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
public class FeedStateSquareBottomViewParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedstatesquarebottomviewparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 2)
    public int viewType;
    public static ProtobufAdapter<FeedStateSquareBottomViewParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedStateSquareBottomViewParams>() { // from class: com.p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams) {
            String str = feedStateSquareBottomViewParams.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, feedStateSquareBottomViewParams.viewType);
            ((MessageNano) feedStateSquareBottomViewParams).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedStateSquareBottomViewParams m19506parse(nb5 nb5Var) throws IOException {
            FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = new FeedStateSquareBottomViewParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (feedStateSquareBottomViewParams.name != null) {
                        break;
                    }
                    feedStateSquareBottomViewParams.name = "";
                    break;
                }
                if (iU == 10) {
                    feedStateSquareBottomViewParams.name = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (feedStateSquareBottomViewParams.name != null) {
                            break;
                        }
                        feedStateSquareBottomViewParams.name = "";
                        return feedStateSquareBottomViewParams;
                    }
                    feedStateSquareBottomViewParams.viewType = nb5Var.j();
                }
            }
            return feedStateSquareBottomViewParams;
        }

        public void serialize(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedStateSquareBottomViewParams.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, feedStateSquareBottomViewParams.viewType);
        }
    };
    public static JsonAdapter<FeedStateSquareBottomViewParams> JSON_ADAPTER = new ObjectJsonAdapter<FeedStateSquareBottomViewParams>() { // from class: com.p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams.2
        public Class getDataClass() {
            return FeedStateSquareBottomViewParams.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FeedStateSquareBottomViewParams mo17830newInstance() {
            return new FeedStateSquareBottomViewParams();
        }

        public boolean parseField(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("name")) {
                feedStateSquareBottomViewParams.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("viewType")) {
                return false;
            }
            feedStateSquareBottomViewParams.viewType = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("name") || str.equals("viewType")) {
                return true;
            }
            return super.parseFieldCheck(feedStateSquareBottomViewParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, JsonGenerator jsonGenerator) throws IOException {
            String str = feedStateSquareBottomViewParams.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeNumberField("viewType", feedStateSquareBottomViewParams.viewType);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedStateSquareBottomViewParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedStateSquareBottomViewParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedStateSquareBottomViewParams new_() {
        FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = new FeedStateSquareBottomViewParams();
        feedStateSquareBottomViewParams.nullCheck();
        return feedStateSquareBottomViewParams;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedStateSquareBottomViewParams m19505clone() {
        FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = new FeedStateSquareBottomViewParams();
        feedStateSquareBottomViewParams.name = this.name;
        feedStateSquareBottomViewParams.viewType = this.viewType;
        return feedStateSquareBottomViewParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedStateSquareBottomViewParams)) {
            return false;
        }
        FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = (FeedStateSquareBottomViewParams) obj;
        return ValueObject.util_equals(this.name, feedStateSquareBottomViewParams.name) && this.viewType == feedStateSquareBottomViewParams.viewType;
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
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.viewType;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
