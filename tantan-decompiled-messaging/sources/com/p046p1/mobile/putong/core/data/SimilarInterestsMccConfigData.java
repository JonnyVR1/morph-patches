package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class SimilarInterestsMccConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsmccconfigdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> items;

    @ProtobufIndex(index = 1)
    public int swipeCount;
    public static ProtobufAdapter<SimilarInterestsMccConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsMccConfigData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsMccConfigData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsMccConfigData similarInterestsMccConfigData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, similarInterestsMccConfigData.swipeCount);
            List<String> list = similarInterestsMccConfigData.items;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            similarInterestsMccConfigData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsMccConfigData parse(nb5 nb5Var) throws IOException {
            SimilarInterestsMccConfigData similarInterestsMccConfigData = new SimilarInterestsMccConfigData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (similarInterestsMccConfigData.items != null) {
                        break;
                    }
                    similarInterestsMccConfigData.items = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    similarInterestsMccConfigData.swipeCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (similarInterestsMccConfigData.items != null) {
                            break;
                        }
                        similarInterestsMccConfigData.items = new ArrayList();
                        return similarInterestsMccConfigData;
                    }
                    similarInterestsMccConfigData.items = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return similarInterestsMccConfigData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsMccConfigData similarInterestsMccConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, similarInterestsMccConfigData.swipeCount);
            List<String> list = similarInterestsMccConfigData.items;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SimilarInterestsMccConfigData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsMccConfigData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsMccConfigData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsMccConfigData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsMccConfigData newInstance() {
            return new SimilarInterestsMccConfigData();
        }

        public boolean parseField(SimilarInterestsMccConfigData similarInterestsMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.ITEMS)) {
                similarInterestsMccConfigData.items = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("swipeCount")) {
                return false;
            }
            similarInterestsMccConfigData.swipeCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SimilarInterestsMccConfigData similarInterestsMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.ITEMS) || str.equals("swipeCount")) {
                return true;
            }
            return super.parseFieldCheck(similarInterestsMccConfigData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsMccConfigData similarInterestsMccConfigData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeCount", similarInterestsMccConfigData.swipeCount);
            if (similarInterestsMccConfigData.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(similarInterestsMccConfigData.items, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35844a(String str) {
        return str;
    }

    public static SimilarInterestsMccConfigData new_() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData = new SimilarInterestsMccConfigData();
        similarInterestsMccConfigData.nullCheck();
        return similarInterestsMccConfigData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsMccConfigData mo223809clone() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData = new SimilarInterestsMccConfigData();
        similarInterestsMccConfigData.swipeCount = this.swipeCount;
        List<String> list = this.items;
        if (list != null) {
            similarInterestsMccConfigData.items = ValueObject.util_map(list, new w9j() { // from class: l.tff0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SimilarInterestsMccConfigData.m35844a((String) obj);
                }
            });
        }
        return similarInterestsMccConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsMccConfigData)) {
            return false;
        }
        SimilarInterestsMccConfigData similarInterestsMccConfigData = (SimilarInterestsMccConfigData) obj;
        return this.swipeCount == similarInterestsMccConfigData.swipeCount && ValueObject.util_equals(this.items, similarInterestsMccConfigData.items);
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
        int i2 = ((i * 41) + this.swipeCount) * 41;
        List<String> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
