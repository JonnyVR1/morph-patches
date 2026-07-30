package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GPOrderIDs;
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
public class GPOrderIDs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gporderids";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> googlePlayOrderIDs;
    public static ProtobufAdapter<GPOrderIDs> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPOrderIDs>() { // from class: com.p1.mobile.putong.core.data.GPOrderIDs.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPOrderIDs gPOrderIDs) {
            List<String> list = gPOrderIDs.googlePlayOrderIDs;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) gPOrderIDs).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPOrderIDs m12875parse(nb5 nb5Var) throws IOException {
            GPOrderIDs gPOrderIDs = new GPOrderIDs();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (gPOrderIDs.googlePlayOrderIDs != null) {
                        break;
                    }
                    gPOrderIDs.googlePlayOrderIDs = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (gPOrderIDs.googlePlayOrderIDs != null) {
                        break;
                    }
                    gPOrderIDs.googlePlayOrderIDs = new ArrayList();
                    return gPOrderIDs;
                }
                gPOrderIDs.googlePlayOrderIDs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return gPOrderIDs;
        }

        public void serialize(GPOrderIDs gPOrderIDs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = gPOrderIDs.googlePlayOrderIDs;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPOrderIDs> JSON_ADAPTER = new ObjectJsonAdapter<GPOrderIDs>() { // from class: com.p1.mobile.putong.core.data.GPOrderIDs.2
        public Class getDataClass() {
            return GPOrderIDs.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GPOrderIDs m12876newInstance() {
            return new GPOrderIDs();
        }

        public boolean parseField(GPOrderIDs gPOrderIDs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("googlePlayOrderIDs")) {
                return false;
            }
            gPOrderIDs.googlePlayOrderIDs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPOrderIDs gPOrderIDs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("googlePlayOrderIDs")) {
                return true;
            }
            return super.parseFieldCheck(gPOrderIDs, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GPOrderIDs gPOrderIDs, JsonGenerator jsonGenerator) throws IOException {
            if (gPOrderIDs.googlePlayOrderIDs != null) {
                jsonGenerator.writeFieldName("googlePlayOrderIDs");
                JsonAdapter.serializeArray(gPOrderIDs.googlePlayOrderIDs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPOrderIDs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPOrderIDs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m343a(String str) {
        return str;
    }

    public static GPOrderIDs new_() {
        GPOrderIDs gPOrderIDs = new GPOrderIDs();
        gPOrderIDs.nullCheck();
        return gPOrderIDs;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPOrderIDs m12874clone() {
        GPOrderIDs gPOrderIDs = new GPOrderIDs();
        List<String> list = this.googlePlayOrderIDs;
        if (list != null) {
            gPOrderIDs.googlePlayOrderIDs = ValueObject.util_map(list, new w9j() { // from class: l.gej
                public final Object call(Object obj) {
                    return GPOrderIDs.m343a((String) obj);
                }
            });
        }
        return gPOrderIDs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GPOrderIDs) {
            return ValueObject.util_equals(this.googlePlayOrderIDs, ((GPOrderIDs) obj).googlePlayOrderIDs);
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
        List<String> list = this.googlePlayOrderIDs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.googlePlayOrderIDs == null) {
            this.googlePlayOrderIDs = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
