package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.GooglePlayOrders;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class GooglePlayOrdersData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "googleplayordersdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GooglePlayOrders> googlePlayOrders;
    public static ProtobufAdapter<GooglePlayOrdersData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GooglePlayOrdersData>() { // from class: com.p1.mobile.putong.data.GooglePlayOrdersData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GooglePlayOrdersData googlePlayOrdersData) {
            List<GooglePlayOrders> list = googlePlayOrdersData.googlePlayOrders;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            googlePlayOrdersData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GooglePlayOrdersData parse(nc5 nc5Var) throws IOException {
            GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (googlePlayOrdersData.googlePlayOrders != null) {
                        break;
                    }
                    googlePlayOrdersData.googlePlayOrders = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (googlePlayOrdersData.googlePlayOrders != null) {
                        break;
                    }
                    googlePlayOrdersData.googlePlayOrders = new ArrayList();
                    return googlePlayOrdersData;
                }
                googlePlayOrdersData.googlePlayOrders = (List) nc5Var.m162488l(GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return googlePlayOrdersData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GooglePlayOrdersData googlePlayOrdersData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GooglePlayOrders> list = googlePlayOrdersData.googlePlayOrders;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GooglePlayOrdersData> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlayOrdersData>() { // from class: com.p1.mobile.putong.data.GooglePlayOrdersData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GooglePlayOrdersData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GooglePlayOrdersData newInstance() {
            return new GooglePlayOrdersData();
        }

        public boolean parseField(GooglePlayOrdersData googlePlayOrdersData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("googlePlayOrders")) {
                return false;
            }
            googlePlayOrdersData.googlePlayOrders = JsonAdapter.parseArray(jsonParser, GooglePlayOrders.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GooglePlayOrdersData googlePlayOrdersData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("googlePlayOrders")) {
                return true;
            }
            return super.parseFieldCheck(googlePlayOrdersData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GooglePlayOrdersData googlePlayOrdersData, JsonGenerator jsonGenerator) throws IOException {
            if (googlePlayOrdersData.googlePlayOrders != null) {
                jsonGenerator.writeFieldName("googlePlayOrders");
                JsonAdapter.serializeArray(googlePlayOrdersData.googlePlayOrders, jsonGenerator, GooglePlayOrders.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlayOrdersData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GooglePlayOrdersData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GooglePlayOrdersData new_() {
        GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
        googlePlayOrdersData.nullCheck();
        return googlePlayOrdersData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GooglePlayOrdersData mo225055clone() {
        GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
        List<GooglePlayOrders> list = this.googlePlayOrders;
        if (list != null) {
            googlePlayOrdersData.googlePlayOrders = ValueObject.util_map(list, new qcj() { // from class: l.y6k
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GooglePlayOrders) obj).mo225055clone();
                }
            });
        }
        return googlePlayOrdersData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GooglePlayOrdersData) {
            return ValueObject.util_equals(this.googlePlayOrders, ((GooglePlayOrdersData) obj).googlePlayOrders);
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
        List<GooglePlayOrders> list = this.googlePlayOrders;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.googlePlayOrders == null) {
            this.googlePlayOrders = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
