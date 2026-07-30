package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GPSubscription;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GPSubscriptions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpsubscriptions";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPSubscription> googeplaySubscriptions;
    public static ProtobufAdapter<GPSubscriptions> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPSubscriptions>() { // from class: com.p1.mobile.putong.core.data.GPSubscriptions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPSubscriptions gPSubscriptions) {
            List<GPSubscription> list = gPSubscriptions.googeplaySubscriptions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, GPSubscription.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) gPSubscriptions).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPSubscriptions m12887parse(nb5 nb5Var) throws IOException {
            GPSubscriptions gPSubscriptions = new GPSubscriptions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPSubscriptions.googeplaySubscriptions != null) {
                        break;
                    }
                    gPSubscriptions.googeplaySubscriptions = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (gPSubscriptions.googeplaySubscriptions != null) {
                        break;
                    }
                    gPSubscriptions.googeplaySubscriptions = new ArrayList();
                    return gPSubscriptions;
                }
                gPSubscriptions.googeplaySubscriptions = (List) nb5Var.l(GPSubscription.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPSubscriptions;
        }

        public void serialize(GPSubscriptions gPSubscriptions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPSubscription> list = gPSubscriptions.googeplaySubscriptions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, GPSubscription.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPSubscriptions> JSON_ADAPTER = new ObjectJsonAdapter<GPSubscriptions>() { // from class: com.p1.mobile.putong.core.data.GPSubscriptions.2
        public Class getDataClass() {
            return GPSubscriptions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GPSubscriptions m12888newInstance() {
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

        public void serializeFields(GPSubscriptions gPSubscriptions, JsonGenerator jsonGenerator) throws IOException {
            if (gPSubscriptions.googeplaySubscriptions != null) {
                jsonGenerator.writeFieldName("googeplaySubscriptions");
                JsonAdapter.serializeArray(gPSubscriptions.googeplaySubscriptions, jsonGenerator, GPSubscription.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPSubscriptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPSubscriptions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPSubscriptions new_() {
        GPSubscriptions gPSubscriptions = new GPSubscriptions();
        gPSubscriptions.nullCheck();
        return gPSubscriptions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPSubscriptions m12886clone() {
        GPSubscriptions gPSubscriptions = new GPSubscriptions();
        List<GPSubscription> list = this.googeplaySubscriptions;
        if (list != null) {
            gPSubscriptions.googeplaySubscriptions = ValueObject.util_map(list, new w9j() { // from class: l.ngj
                public final Object call(Object obj) {
                    return ((GPSubscription) obj).m12882clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<GPSubscription> list = this.googeplaySubscriptions;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.googeplaySubscriptions == null) {
            this.googeplaySubscriptions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
