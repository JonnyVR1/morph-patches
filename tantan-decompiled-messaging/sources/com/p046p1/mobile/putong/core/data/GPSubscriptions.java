package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.GPSubscription;
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
public class GPSubscriptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpsubscriptions";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPSubscription> googeplaySubscriptions;
    public static ProtobufAdapter<GPSubscriptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPSubscriptions>() { // from class: com.p1.mobile.putong.core.data.GPSubscriptions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPSubscriptions gPSubscriptions) {
            List<GPSubscription> list = gPSubscriptions.googeplaySubscriptions;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, GPSubscription.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            gPSubscriptions.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPSubscriptions parse(nb5 nb5Var) throws IOException {
            GPSubscriptions gPSubscriptions = new GPSubscriptions();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPSubscriptions.googeplaySubscriptions != null) {
                        break;
                    }
                    gPSubscriptions.googeplaySubscriptions = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (gPSubscriptions.googeplaySubscriptions != null) {
                        break;
                    }
                    gPSubscriptions.googeplaySubscriptions = new ArrayList();
                    return gPSubscriptions;
                }
                gPSubscriptions.googeplaySubscriptions = (List) nb5Var.m158743l(GPSubscription.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPSubscriptions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPSubscriptions gPSubscriptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPSubscription> list = gPSubscriptions.googeplaySubscriptions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, GPSubscription.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPSubscriptions> JSON_ADAPTER = new ObjectJsonAdapter<GPSubscriptions>() { // from class: com.p1.mobile.putong.core.data.GPSubscriptions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPSubscriptions.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPSubscriptions newInstance() {
            return new GPSubscriptions();
        }

        public boolean parseField(GPSubscriptions gPSubscriptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("googeplaySubscriptions")) {
                return false;
            }
            gPSubscriptions.googeplaySubscriptions = JsonAdapter.parseArray(jsonParser, GPSubscription.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPSubscriptions gPSubscriptions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("googeplaySubscriptions")) {
                return true;
            }
            return super.parseFieldCheck(gPSubscriptions, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPSubscriptions gPSubscriptions, JsonGenerator jsonGenerator) throws IOException {
            if (gPSubscriptions.googeplaySubscriptions != null) {
                jsonGenerator.writeFieldName("googeplaySubscriptions");
                JsonAdapter.serializeArray(gPSubscriptions.googeplaySubscriptions, jsonGenerator, GPSubscription.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPSubscriptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPSubscriptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPSubscriptions new_() {
        GPSubscriptions gPSubscriptions = new GPSubscriptions();
        gPSubscriptions.nullCheck();
        return gPSubscriptions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPSubscriptions mo223809clone() {
        GPSubscriptions gPSubscriptions = new GPSubscriptions();
        List<GPSubscription> list = this.googeplaySubscriptions;
        if (list != null) {
            gPSubscriptions.googeplaySubscriptions = ValueObject.util_map(list, new w9j() { // from class: l.ngj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GPSubscription) obj).mo223809clone();
                }
            });
        }
        return gPSubscriptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GPSubscriptions) {
            return ValueObject.util_equals(this.googeplaySubscriptions, ((GPSubscriptions) obj).googeplaySubscriptions);
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
        List<GPSubscription> list = this.googeplaySubscriptions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.googeplaySubscriptions == null) {
            this.googeplaySubscriptions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
