package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class H5PayOrderConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5payorderconfigdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String itemId;

    @ProtobufIndex(index = 2)
    public double price;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<H5PayOrderConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5PayOrderConfigData>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderConfigData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(H5PayOrderConfigData h5PayOrderConfigData) {
            String str = h5PayOrderConfigData.title;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17222d(2, h5PayOrderConfigData.price);
            String str2 = h5PayOrderConfigData.itemId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            h5PayOrderConfigData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public H5PayOrderConfigData parse(nb5 nb5Var) throws IOException {
            H5PayOrderConfigData h5PayOrderConfigData = new H5PayOrderConfigData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (h5PayOrderConfigData.title == null) {
                        h5PayOrderConfigData.title = "";
                    }
                    if (h5PayOrderConfigData.itemId != null) {
                        break;
                    }
                    h5PayOrderConfigData.itemId = "";
                    break;
                }
                if (iM158752u == 10) {
                    h5PayOrderConfigData.title = nb5Var.m158750s();
                } else if (iM158752u == 17) {
                    h5PayOrderConfigData.price = nb5Var.m158739h();
                } else {
                    if (iM158752u != 26) {
                        if (h5PayOrderConfigData.title == null) {
                            h5PayOrderConfigData.title = "";
                        }
                        if (h5PayOrderConfigData.itemId != null) {
                            break;
                        }
                        h5PayOrderConfigData.itemId = "";
                        return h5PayOrderConfigData;
                    }
                    h5PayOrderConfigData.itemId = nb5Var.m158750s();
                }
            }
            return h5PayOrderConfigData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(H5PayOrderConfigData h5PayOrderConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5PayOrderConfigData.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17246C(2, h5PayOrderConfigData.price);
            String str2 = h5PayOrderConfigData.itemId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<H5PayOrderConfigData> JSON_ADAPTER = new ObjectJsonAdapter<H5PayOrderConfigData>() { // from class: com.p1.mobile.putong.core.data.H5PayOrderConfigData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return H5PayOrderConfigData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public H5PayOrderConfigData newInstance() {
            return new H5PayOrderConfigData();
        }

        public boolean parseField(H5PayOrderConfigData h5PayOrderConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "itemId":
                    h5PayOrderConfigData.itemId = jsonParser.getValueAsString();
                    return true;
                case "price":
                    h5PayOrderConfigData.price = jsonParser.getValueAsDouble();
                    return true;
                case "title":
                    h5PayOrderConfigData.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(H5PayOrderConfigData h5PayOrderConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "itemId":
                case "price":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(h5PayOrderConfigData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5PayOrderConfigData h5PayOrderConfigData, JsonGenerator jsonGenerator) throws IOException {
            String str = h5PayOrderConfigData.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, h5PayOrderConfigData.price);
            String str2 = h5PayOrderConfigData.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5PayOrderConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5PayOrderConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5PayOrderConfigData new_() {
        H5PayOrderConfigData h5PayOrderConfigData = new H5PayOrderConfigData();
        h5PayOrderConfigData.nullCheck();
        return h5PayOrderConfigData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public H5PayOrderConfigData mo223809clone() {
        H5PayOrderConfigData h5PayOrderConfigData = new H5PayOrderConfigData();
        h5PayOrderConfigData.title = this.title;
        h5PayOrderConfigData.price = this.price;
        h5PayOrderConfigData.itemId = this.itemId;
        return h5PayOrderConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5PayOrderConfigData)) {
            return false;
        }
        H5PayOrderConfigData h5PayOrderConfigData = (H5PayOrderConfigData) obj;
        return ValueObject.util_equals(this.title, h5PayOrderConfigData.title) && this.price == h5PayOrderConfigData.price && ValueObject.util_equals(this.itemId, h5PayOrderConfigData.itemId);
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
        String str = this.title;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.price);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.itemId;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
