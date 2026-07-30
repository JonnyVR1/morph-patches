package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.PoiLocation;
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
public class PoiLocation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "poilocation";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<PoiLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<PoiLocation>() { // from class: com.p1.mobile.putong.feed.data.PoiLocation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PoiLocation poiLocation) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, poiLocation.count);
            List<String> list = poiLocation.userIds;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            poiLocation.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PoiLocation parse(nb5 nb5Var) throws IOException {
            PoiLocation poiLocation = new PoiLocation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (poiLocation.userIds != null) {
                        break;
                    }
                    poiLocation.userIds = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    poiLocation.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (poiLocation.userIds != null) {
                            break;
                        }
                        poiLocation.userIds = new ArrayList();
                        return poiLocation;
                    }
                    poiLocation.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return poiLocation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PoiLocation poiLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, poiLocation.count);
            List<String> list = poiLocation.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<PoiLocation> JSON_ADAPTER = new ObjectJsonAdapter<PoiLocation>() { // from class: com.p1.mobile.putong.feed.data.PoiLocation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PoiLocation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PoiLocation newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PoiLocation poiLocation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", poiLocation.count);
            if (poiLocation.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(poiLocation.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60884a(String str) {
        return str;
    }

    public static PoiLocation new_() {
        PoiLocation poiLocation = new PoiLocation();
        poiLocation.nullCheck();
        return poiLocation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PoiLocation mo223809clone() {
        PoiLocation poiLocation = new PoiLocation();
        poiLocation.count = this.count;
        List<String> list = this.userIds;
        if (list != null) {
            poiLocation.userIds = ValueObject.util_map(list, new w9j() { // from class: l.y980
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PoiLocation.m60884a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.count) * 41;
        List<String> list = this.userIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
