package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.GooglePlayOrders;
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
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            googlePlayOrdersData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GooglePlayOrdersData parse(nb5 nb5Var) throws IOException {
            GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (googlePlayOrdersData.googlePlayOrders != null) {
                        break;
                    }
                    googlePlayOrdersData.googlePlayOrders = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (googlePlayOrdersData.googlePlayOrders != null) {
                        break;
                    }
                    googlePlayOrdersData.googlePlayOrders = new ArrayList();
                    return googlePlayOrdersData;
                }
                googlePlayOrdersData.googlePlayOrders = (List) nb5Var.m158743l(GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return googlePlayOrdersData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GooglePlayOrdersData googlePlayOrdersData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GooglePlayOrders> list = googlePlayOrdersData.googlePlayOrders;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GooglePlayOrdersData> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlayOrdersData>() { // from class: com.p1.mobile.putong.data.GooglePlayOrdersData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GooglePlayOrdersData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GooglePlayOrdersData googlePlayOrdersData, JsonGenerator jsonGenerator) throws IOException {
            if (googlePlayOrdersData.googlePlayOrders != null) {
                jsonGenerator.writeFieldName("googlePlayOrders");
                JsonAdapter.serializeArray(googlePlayOrdersData.googlePlayOrders, jsonGenerator, GooglePlayOrders.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlayOrdersData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public GooglePlayOrdersData mo223809clone() {
        GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
        List<GooglePlayOrders> list = this.googlePlayOrders;
        if (list != null) {
            googlePlayOrdersData.googlePlayOrders = ValueObject.util_map(list, new w9j() { // from class: l.g4k
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GooglePlayOrders) obj).mo223809clone();
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
