package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.PoiLocation;
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
public class PoiLocation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "poilocation";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<PoiLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<PoiLocation>() { // from class: com.p1.mobile.putong.feed.data.PoiLocation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PoiLocation poiLocation) {
            int iH = CodedOutputByteBufferNano.h(1, poiLocation.count);
            List<String> list = poiLocation.userIds;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) poiLocation).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PoiLocation m19714parse(nb5 nb5Var) throws IOException {
            PoiLocation poiLocation = new PoiLocation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (poiLocation.userIds != null) {
                        break;
                    }
                    poiLocation.userIds = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    poiLocation.count = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (poiLocation.userIds != null) {
                            break;
                        }
                        poiLocation.userIds = new ArrayList();
                        return poiLocation;
                    }
                    poiLocation.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return poiLocation;
        }

        public void serialize(PoiLocation poiLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, poiLocation.count);
            List<String> list = poiLocation.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PoiLocation> JSON_ADAPTER = new ObjectJsonAdapter<PoiLocation>() { // from class: com.p1.mobile.putong.feed.data.PoiLocation.2
        public Class getDataClass() {
            return PoiLocation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PoiLocation mo17830newInstance() {
            return new PoiLocation();
        }

        public boolean parseField(PoiLocation poiLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userIds")) {
                poiLocation.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            poiLocation.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PoiLocation poiLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userIds") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(poiLocation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PoiLocation poiLocation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", poiLocation.count);
            if (poiLocation.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(poiLocation.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1810a(String str) {
        return str;
    }

    public static PoiLocation new_() {
        PoiLocation poiLocation = new PoiLocation();
        poiLocation.nullCheck();
        return poiLocation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PoiLocation m19713clone() {
        PoiLocation poiLocation = new PoiLocation();
        poiLocation.count = this.count;
        List<String> list = this.userIds;
        if (list != null) {
            poiLocation.userIds = ValueObject.util_map(list, new w9j() { // from class: l.y980
                public final Object call(Object obj) {
                    return PoiLocation.m1810a((String) obj);
                }
            });
        }
        return poiLocation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiLocation)) {
            return false;
        }
        PoiLocation poiLocation = (PoiLocation) obj;
        return this.count == poiLocation.count && ValueObject.util_equals(this.userIds, poiLocation.userIds);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.count) * 41;
        List<String> list = this.userIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
