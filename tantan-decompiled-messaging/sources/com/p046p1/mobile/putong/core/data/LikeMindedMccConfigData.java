package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LikeMindedMccConfigData;
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
public class LikeMindedMccConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindedmccconfigdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> items;

    @ProtobufIndex(index = 1)
    public int swipeCount;
    public static ProtobufAdapter<LikeMindedMccConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedMccConfigData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedMccConfigData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedMccConfigData likeMindedMccConfigData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, likeMindedMccConfigData.swipeCount);
            List<String> list = likeMindedMccConfigData.items;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            likeMindedMccConfigData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedMccConfigData parse(nb5 nb5Var) throws IOException {
            LikeMindedMccConfigData likeMindedMccConfigData = new LikeMindedMccConfigData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (likeMindedMccConfigData.items != null) {
                        break;
                    }
                    likeMindedMccConfigData.items = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    likeMindedMccConfigData.swipeCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (likeMindedMccConfigData.items != null) {
                            break;
                        }
                        likeMindedMccConfigData.items = new ArrayList();
                        return likeMindedMccConfigData;
                    }
                    likeMindedMccConfigData.items = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return likeMindedMccConfigData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedMccConfigData likeMindedMccConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, likeMindedMccConfigData.swipeCount);
            List<String> list = likeMindedMccConfigData.items;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LikeMindedMccConfigData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedMccConfigData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedMccConfigData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedMccConfigData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedMccConfigData newInstance() {
            return new LikeMindedMccConfigData();
        }

        public boolean parseField(LikeMindedMccConfigData likeMindedMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.ITEMS)) {
                likeMindedMccConfigData.items = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("swipeCount")) {
                return false;
            }
            likeMindedMccConfigData.swipeCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(LikeMindedMccConfigData likeMindedMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.ITEMS) || str.equals("swipeCount")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedMccConfigData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedMccConfigData likeMindedMccConfigData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeCount", likeMindedMccConfigData.swipeCount);
            if (likeMindedMccConfigData.items != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.ITEMS);
                JsonAdapter.serializeArray(likeMindedMccConfigData.items, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35642a(String str) {
        return str;
    }

    public static LikeMindedMccConfigData new_() {
        LikeMindedMccConfigData likeMindedMccConfigData = new LikeMindedMccConfigData();
        likeMindedMccConfigData.nullCheck();
        return likeMindedMccConfigData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedMccConfigData mo223809clone() {
        LikeMindedMccConfigData likeMindedMccConfigData = new LikeMindedMccConfigData();
        likeMindedMccConfigData.swipeCount = this.swipeCount;
        List<String> list = this.items;
        if (list != null) {
            likeMindedMccConfigData.items = ValueObject.util_map(list, new w9j() { // from class: l.qdr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LikeMindedMccConfigData.m35642a((String) obj);
                }
            });
        }
        return likeMindedMccConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedMccConfigData)) {
            return false;
        }
        LikeMindedMccConfigData likeMindedMccConfigData = (LikeMindedMccConfigData) obj;
        return this.swipeCount == likeMindedMccConfigData.swipeCount && ValueObject.util_equals(this.items, likeMindedMccConfigData.items);
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
