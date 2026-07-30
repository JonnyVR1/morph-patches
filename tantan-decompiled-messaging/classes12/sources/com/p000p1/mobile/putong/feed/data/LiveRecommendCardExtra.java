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
public class LiveRecommendCardExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liverecommendcardextra";

    @NonNull
    @ProtobufIndex(index = 1)
    public String search;
    public static ProtobufAdapter<LiveRecommendCardExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRecommendCardExtra>() { // from class: com.p1.mobile.putong.feed.data.LiveRecommendCardExtra.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveRecommendCardExtra liveRecommendCardExtra) {
            String str = liveRecommendCardExtra.search;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) liveRecommendCardExtra).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveRecommendCardExtra m19569parse(nb5 nb5Var) throws IOException {
            LiveRecommendCardExtra liveRecommendCardExtra = new LiveRecommendCardExtra();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveRecommendCardExtra.search != null) {
                        break;
                    }
                    liveRecommendCardExtra.search = "";
                    break;
                }
                if (iU != 10) {
                    if (liveRecommendCardExtra.search != null) {
                        break;
                    }
                    liveRecommendCardExtra.search = "";
                    return liveRecommendCardExtra;
                }
                liveRecommendCardExtra.search = nb5Var.s();
            }
            return liveRecommendCardExtra;
        }

        public void serialize(LiveRecommendCardExtra liveRecommendCardExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveRecommendCardExtra.search;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<LiveRecommendCardExtra> JSON_ADAPTER = new ObjectJsonAdapter<LiveRecommendCardExtra>() { // from class: com.p1.mobile.putong.feed.data.LiveRecommendCardExtra.2
        public Class getDataClass() {
            return LiveRecommendCardExtra.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveRecommendCardExtra mo17830newInstance() {
            return new LiveRecommendCardExtra();
        }

        public boolean parseField(LiveRecommendCardExtra liveRecommendCardExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("search")) {
                return false;
            }
            liveRecommendCardExtra.search = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveRecommendCardExtra liveRecommendCardExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("search")) {
                return true;
            }
            return super.parseFieldCheck(liveRecommendCardExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRecommendCardExtra liveRecommendCardExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = liveRecommendCardExtra.search;
            if (str != null) {
                jsonGenerator.writeStringField("search", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRecommendCardExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRecommendCardExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRecommendCardExtra new_() {
        LiveRecommendCardExtra liveRecommendCardExtra = new LiveRecommendCardExtra();
        liveRecommendCardExtra.nullCheck();
        return liveRecommendCardExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveRecommendCardExtra m19568clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.search;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.search == null) {
            this.search = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
