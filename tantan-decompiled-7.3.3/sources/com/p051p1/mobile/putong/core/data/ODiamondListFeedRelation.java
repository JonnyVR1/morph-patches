package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondListFeedRelation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistfeedrelation";

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherStatus;

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<ODiamondListFeedRelation> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListFeedRelation>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedRelation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondListFeedRelation oDiamondListFeedRelation) {
            String str = oDiamondListFeedRelation.status;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = oDiamondListFeedRelation.otherStatus;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            oDiamondListFeedRelation.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondListFeedRelation parse(nc5 nc5Var) throws IOException {
            ODiamondListFeedRelation oDiamondListFeedRelation = new ODiamondListFeedRelation();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondListFeedRelation.status == null) {
                        oDiamondListFeedRelation.status = "";
                    }
                    if (oDiamondListFeedRelation.otherStatus != null) {
                        break;
                    }
                    oDiamondListFeedRelation.otherStatus = "";
                    break;
                }
                if (iM162497u == 10) {
                    oDiamondListFeedRelation.status = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (oDiamondListFeedRelation.status == null) {
                            oDiamondListFeedRelation.status = "";
                        }
                        if (oDiamondListFeedRelation.otherStatus != null) {
                            break;
                        }
                        oDiamondListFeedRelation.otherStatus = "";
                        return oDiamondListFeedRelation;
                    }
                    oDiamondListFeedRelation.otherStatus = nc5Var.m162495s();
                }
            }
            return oDiamondListFeedRelation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondListFeedRelation oDiamondListFeedRelation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondListFeedRelation.status;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = oDiamondListFeedRelation.otherStatus;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<ODiamondListFeedRelation> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListFeedRelation>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedRelation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondListFeedRelation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondListFeedRelation newInstance() {
            return new ODiamondListFeedRelation();
        }

        public boolean parseField(ODiamondListFeedRelation oDiamondListFeedRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("otherStatus")) {
                oDiamondListFeedRelation.otherStatus = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            oDiamondListFeedRelation.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ODiamondListFeedRelation oDiamondListFeedRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("otherStatus") || str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(oDiamondListFeedRelation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondListFeedRelation oDiamondListFeedRelation, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondListFeedRelation.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
            String str2 = oDiamondListFeedRelation.otherStatus;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherStatus", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListFeedRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListFeedRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondListFeedRelation new_() {
        ODiamondListFeedRelation oDiamondListFeedRelation = new ODiamondListFeedRelation();
        oDiamondListFeedRelation.nullCheck();
        return oDiamondListFeedRelation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondListFeedRelation mo225055clone() {
        ODiamondListFeedRelation oDiamondListFeedRelation = new ODiamondListFeedRelation();
        oDiamondListFeedRelation.status = this.status;
        oDiamondListFeedRelation.otherStatus = this.otherStatus;
        return oDiamondListFeedRelation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondListFeedRelation)) {
            return false;
        }
        ODiamondListFeedRelation oDiamondListFeedRelation = (ODiamondListFeedRelation) obj;
        return ValueObject.util_equals(this.status, oDiamondListFeedRelation.status) && ValueObject.util_equals(this.otherStatus, oDiamondListFeedRelation.otherStatus);
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
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherStatus;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.otherStatus == null) {
            this.otherStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
