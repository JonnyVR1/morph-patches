package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedSelectParams feedSelectParams) {
            String str = feedSelectParams.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = feedSelectParams.param;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            feedSelectParams.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedSelectParams parse(nb5 nb5Var) throws IOException {
            FeedSelectParams feedSelectParams = new FeedSelectParams();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (feedSelectParams.name == null) {
                        feedSelectParams.name = "";
                    }
                    if (feedSelectParams.param != null) {
                        break;
                    }
                    feedSelectParams.param = "";
                    break;
                }
                if (iM158752u == 10) {
                    feedSelectParams.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (feedSelectParams.name == null) {
                            feedSelectParams.name = "";
                        }
                        if (feedSelectParams.param != null) {
                            break;
                        }
                        feedSelectParams.param = "";
                        return feedSelectParams;
                    }
                    feedSelectParams.param = nb5Var.m158750s();
                }
            }
            return feedSelectParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedSelectParams feedSelectParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedSelectParams.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = feedSelectParams.param;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<FeedSelectParams> JSON_ADAPTER = new ObjectJsonAdapter<FeedSelectParams>() { // from class: com.p1.mobile.putong.feed.data.FeedSelectParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedSelectParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedSelectParams newInstance() {
            return new FeedSelectParams();
        }

        public boolean parseField(FeedSelectParams feedSelectParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
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
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME) || str.equals("param")) {
                return true;
            }
            return super.parseFieldCheck(feedSelectParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedSelectParams feedSelectParams, JsonGenerator jsonGenerator) throws IOException {
            String str = feedSelectParams.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = feedSelectParams.param;
            if (str2 != null) {
                jsonGenerator.writeStringField("param", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedSelectParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedSelectParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedSelectParams new_() {
        FeedSelectParams feedSelectParams = new FeedSelectParams();
        feedSelectParams.nullCheck();
        return feedSelectParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedSelectParams mo223809clone() {
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.param;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.param == null) {
            this.param = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
