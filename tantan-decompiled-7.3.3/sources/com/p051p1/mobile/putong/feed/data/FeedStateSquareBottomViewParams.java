package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateSquareBottomViewParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedstatesquarebottomviewparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = 2)
    public int viewType;
    public static ProtobufAdapter<FeedStateSquareBottomViewParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedStateSquareBottomViewParams>() { // from class: com.p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams) {
            String str = feedStateSquareBottomViewParams.name;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, feedStateSquareBottomViewParams.viewType);
            feedStateSquareBottomViewParams.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedStateSquareBottomViewParams parse(nc5 nc5Var) throws IOException {
            FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = new FeedStateSquareBottomViewParams();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (feedStateSquareBottomViewParams.name != null) {
                        break;
                    }
                    feedStateSquareBottomViewParams.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    feedStateSquareBottomViewParams.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (feedStateSquareBottomViewParams.name != null) {
                            break;
                        }
                        feedStateSquareBottomViewParams.name = "";
                        return feedStateSquareBottomViewParams;
                    }
                    feedStateSquareBottomViewParams.viewType = nc5Var.m162486j();
                }
            }
            return feedStateSquareBottomViewParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedStateSquareBottomViewParams.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, feedStateSquareBottomViewParams.viewType);
        }
    };
    public static JsonAdapter<FeedStateSquareBottomViewParams> JSON_ADAPTER = new ObjectJsonAdapter<FeedStateSquareBottomViewParams>() { // from class: com.p1.mobile.putong.feed.data.FeedStateSquareBottomViewParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedStateSquareBottomViewParams.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedStateSquareBottomViewParams newInstance() {
            return new FeedStateSquareBottomViewParams();
        }

        public boolean parseField(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
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
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME) || str.equals("viewType")) {
                return true;
            }
            return super.parseFieldCheck(feedStateSquareBottomViewParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedStateSquareBottomViewParams feedStateSquareBottomViewParams, JsonGenerator jsonGenerator) throws IOException {
            String str = feedStateSquareBottomViewParams.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            jsonGenerator.writeNumberField("viewType", feedStateSquareBottomViewParams.viewType);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedStateSquareBottomViewParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedStateSquareBottomViewParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedStateSquareBottomViewParams new_() {
        FeedStateSquareBottomViewParams feedStateSquareBottomViewParams = new FeedStateSquareBottomViewParams();
        feedStateSquareBottomViewParams.nullCheck();
        return feedStateSquareBottomViewParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedStateSquareBottomViewParams mo225055clone() {
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
        String str = this.name;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.viewType;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
