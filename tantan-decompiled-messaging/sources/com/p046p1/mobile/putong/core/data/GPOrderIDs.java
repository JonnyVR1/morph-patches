package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.GPOrderIDs;
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
public class GPOrderIDs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gporderids";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> googlePlayOrderIDs;
    public static ProtobufAdapter<GPOrderIDs> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPOrderIDs>() { // from class: com.p1.mobile.putong.core.data.GPOrderIDs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPOrderIDs gPOrderIDs) {
            List<String> list = gPOrderIDs.googlePlayOrderIDs;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            gPOrderIDs.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPOrderIDs parse(nb5 nb5Var) throws IOException {
            GPOrderIDs gPOrderIDs = new GPOrderIDs();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPOrderIDs.googlePlayOrderIDs != null) {
                        break;
                    }
                    gPOrderIDs.googlePlayOrderIDs = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (gPOrderIDs.googlePlayOrderIDs != null) {
                        break;
                    }
                    gPOrderIDs.googlePlayOrderIDs = new ArrayList();
                    return gPOrderIDs;
                }
                gPOrderIDs.googlePlayOrderIDs = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return gPOrderIDs;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPOrderIDs gPOrderIDs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = gPOrderIDs.googlePlayOrderIDs;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPOrderIDs> JSON_ADAPTER = new ObjectJsonAdapter<GPOrderIDs>() { // from class: com.p1.mobile.putong.core.data.GPOrderIDs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPOrderIDs.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPOrderIDs newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPOrderIDs gPOrderIDs, JsonGenerator jsonGenerator) throws IOException {
            if (gPOrderIDs.googlePlayOrderIDs != null) {
                jsonGenerator.writeFieldName("googlePlayOrderIDs");
                JsonAdapter.serializeArray(gPOrderIDs.googlePlayOrderIDs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPOrderIDs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPOrderIDs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35541a(String str) {
        return str;
    }

    public static GPOrderIDs new_() {
        GPOrderIDs gPOrderIDs = new GPOrderIDs();
        gPOrderIDs.nullCheck();
        return gPOrderIDs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPOrderIDs mo223809clone() {
        GPOrderIDs gPOrderIDs = new GPOrderIDs();
        List<String> list = this.googlePlayOrderIDs;
        if (list != null) {
            gPOrderIDs.googlePlayOrderIDs = ValueObject.util_map(list, new w9j() { // from class: l.gej
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return GPOrderIDs.m35541a((String) obj);
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
        List<String> list = this.googlePlayOrderIDs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.googlePlayOrderIDs == null) {
            this.googlePlayOrderIDs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
