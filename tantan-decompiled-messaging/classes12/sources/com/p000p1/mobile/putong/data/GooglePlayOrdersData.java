package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.GooglePlayOrders;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GooglePlayOrdersData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "googleplayordersdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GooglePlayOrders> googlePlayOrders;
    public static ProtobufAdapter<GooglePlayOrdersData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GooglePlayOrdersData>() { // from class: com.p1.mobile.putong.data.GooglePlayOrdersData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GooglePlayOrdersData googlePlayOrdersData) {
            List<GooglePlayOrders> list = googlePlayOrdersData.googlePlayOrders;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) googlePlayOrdersData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GooglePlayOrdersData m18190parse(nb5 nb5Var) throws IOException {
            GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (googlePlayOrdersData.googlePlayOrders != null) {
                        break;
                    }
                    googlePlayOrdersData.googlePlayOrders = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (googlePlayOrdersData.googlePlayOrders != null) {
                        break;
                    }
                    googlePlayOrdersData.googlePlayOrders = new ArrayList();
                    return googlePlayOrdersData;
                }
                googlePlayOrdersData.googlePlayOrders = (List) nb5Var.l(GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return googlePlayOrdersData;
        }

        public void serialize(GooglePlayOrdersData googlePlayOrdersData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GooglePlayOrders> list = googlePlayOrdersData.googlePlayOrders;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, GooglePlayOrders.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GooglePlayOrdersData> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlayOrdersData>() { // from class: com.p1.mobile.putong.data.GooglePlayOrdersData.2
        public Class getDataClass() {
            return GooglePlayOrdersData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GooglePlayOrdersData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GooglePlayOrdersData googlePlayOrdersData, JsonGenerator jsonGenerator) throws IOException {
            if (googlePlayOrdersData.googlePlayOrders != null) {
                jsonGenerator.writeFieldName("googlePlayOrders");
                JsonAdapter.serializeArray(googlePlayOrdersData.googlePlayOrders, jsonGenerator, GooglePlayOrders.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlayOrdersData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GooglePlayOrdersData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GooglePlayOrdersData new_() {
        GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
        googlePlayOrdersData.nullCheck();
        return googlePlayOrdersData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GooglePlayOrdersData m18189clone() {
        GooglePlayOrdersData googlePlayOrdersData = new GooglePlayOrdersData();
        List<GooglePlayOrders> list = this.googlePlayOrders;
        if (list != null) {
            googlePlayOrdersData.googlePlayOrders = ValueObject.util_map(list, new w9j() { // from class: l.g4k
                public final Object call(Object obj) {
                    return ((GooglePlayOrders) obj).m18186clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<GooglePlayOrders> list = this.googlePlayOrders;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.googlePlayOrders == null) {
            this.googlePlayOrders = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
