package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class LiveRecommendCardExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liverecommendcardextra";

    @NonNull
    @ProtobufIndex(index = 1)
    public String search;
    public static ProtobufAdapter<LiveRecommendCardExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRecommendCardExtra>() { // from class: com.p1.mobile.putong.feed.data.LiveRecommendCardExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveRecommendCardExtra liveRecommendCardExtra) {
            String str = liveRecommendCardExtra.search;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            liveRecommendCardExtra.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveRecommendCardExtra parse(nb5 nb5Var) throws IOException {
            LiveRecommendCardExtra liveRecommendCardExtra = new LiveRecommendCardExtra();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveRecommendCardExtra.search != null) {
                        break;
                    }
                    liveRecommendCardExtra.search = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (liveRecommendCardExtra.search != null) {
                        break;
                    }
                    liveRecommendCardExtra.search = "";
                    return liveRecommendCardExtra;
                }
                liveRecommendCardExtra.search = nb5Var.m158750s();
            }
            return liveRecommendCardExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveRecommendCardExtra liveRecommendCardExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveRecommendCardExtra.search;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<LiveRecommendCardExtra> JSON_ADAPTER = new ObjectJsonAdapter<LiveRecommendCardExtra>() { // from class: com.p1.mobile.putong.feed.data.LiveRecommendCardExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveRecommendCardExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveRecommendCardExtra newInstance() {
            return new LiveRecommendCardExtra();
        }

        public boolean parseField(LiveRecommendCardExtra liveRecommendCardExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(FirebaseAnalytics.Event.SEARCH)) {
                return false;
            }
            liveRecommendCardExtra.search = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveRecommendCardExtra liveRecommendCardExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                return true;
            }
            return super.parseFieldCheck(liveRecommendCardExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRecommendCardExtra liveRecommendCardExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = liveRecommendCardExtra.search;
            if (str != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Event.SEARCH, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRecommendCardExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRecommendCardExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRecommendCardExtra new_() {
        LiveRecommendCardExtra liveRecommendCardExtra = new LiveRecommendCardExtra();
        liveRecommendCardExtra.nullCheck();
        return liveRecommendCardExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveRecommendCardExtra mo223809clone() {
        LiveRecommendCardExtra liveRecommendCardExtra = new LiveRecommendCardExtra();
        liveRecommendCardExtra.search = this.search;
        return liveRecommendCardExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveRecommendCardExtra) {
            return ValueObject.util_equals(this.search, ((LiveRecommendCardExtra) obj).search);
        }
        return false;
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
        String str = this.search;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.search == null) {
            this.search = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
