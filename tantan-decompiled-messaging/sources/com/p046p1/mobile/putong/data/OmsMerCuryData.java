package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OmsMerCuryData;
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
import java.util.Collections;
import java.util.Map;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class OmsMerCuryData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsmercurydata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38800id;

    @NonNull
    @ProtobufIndex(index = 3)
    public Map<String, String> server;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSMercuryType type;
    public static ProtobufAdapter<OmsMerCuryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsMerCuryData>() { // from class: com.p1.mobile.putong.data.OmsMerCuryData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsMerCuryData omsMerCuryData) {
            String str = omsMerCuryData.f38800id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            OMSMercuryType oMSMercuryType = omsMerCuryData.type;
            if (oMSMercuryType != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, oMSMercuryType.ordinal());
            }
            Map<String, String> map = omsMerCuryData.server;
            if (map != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            OMSMercuryType oMSMercuryType2 = omsMerCuryData.type;
            if (oMSMercuryType2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, oMSMercuryType2, OMSMercuryType.PROTOBUF_ADAPTER);
            }
            omsMerCuryData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsMerCuryData parse(nb5 nb5Var) throws IOException {
            OmsMerCuryData omsMerCuryData = new OmsMerCuryData();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsMerCuryData.type == null && numValueOf != null) {
                        omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (omsMerCuryData.f38800id == null) {
                        omsMerCuryData.f38800id = "";
                    }
                    if (omsMerCuryData.type == null) {
                        omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.defaultEnum();
                    }
                    if (omsMerCuryData.server != null) {
                        break;
                    }
                    omsMerCuryData.server = Collections.EMPTY_MAP;
                    break;
                }
                if (iM158752u == 10) {
                    omsMerCuryData.f38800id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 26) {
                    omsMerCuryData.server = (Map) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                } else {
                    if (iM158752u != 34) {
                        if (omsMerCuryData.type == null && numValueOf != null) {
                            omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (omsMerCuryData.f38800id == null) {
                            omsMerCuryData.f38800id = "";
                        }
                        if (omsMerCuryData.type == null) {
                            omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.defaultEnum();
                        }
                        if (omsMerCuryData.server != null) {
                            break;
                        }
                        omsMerCuryData.server = Collections.EMPTY_MAP;
                        return omsMerCuryData;
                    }
                    omsMerCuryData.type = (OMSMercuryType) nb5Var.m158743l(OMSMercuryType.PROTOBUF_ADAPTER);
                }
            }
            return omsMerCuryData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsMerCuryData omsMerCuryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = omsMerCuryData.f38800id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            OMSMercuryType oMSMercuryType = omsMerCuryData.type;
            if (oMSMercuryType != null) {
                codedOutputByteBufferNano.m17250G(2, oMSMercuryType.ordinal());
            }
            Map<String, String> map = omsMerCuryData.server;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(3, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            OMSMercuryType oMSMercuryType2 = omsMerCuryData.type;
            if (oMSMercuryType2 != null) {
                codedOutputByteBufferNano.m17254K(4, oMSMercuryType2, OMSMercuryType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OmsMerCuryData> JSON_ADAPTER = new ObjectJsonAdapter<OmsMerCuryData>() { // from class: com.p1.mobile.putong.data.OmsMerCuryData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsMerCuryData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsMerCuryData newInstance() {
            return new OmsMerCuryData();
        }

        public boolean parseField(OmsMerCuryData omsMerCuryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "server":
                    omsMerCuryData.server = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "id":
                    omsMerCuryData.f38800id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    omsMerCuryData.type = OMSMercuryType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsMerCuryData omsMerCuryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "server":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(omsMerCuryData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsMerCuryData omsMerCuryData, JsonGenerator jsonGenerator) throws IOException {
            String str = omsMerCuryData.f38800id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (omsMerCuryData.type != null) {
                jsonGenerator.writeFieldName("type");
                OMSMercuryType.JSON_ADAPTER.serialize(omsMerCuryData.type, jsonGenerator, true);
            }
            if (omsMerCuryData.server != null) {
                jsonGenerator.writeFieldName("server");
                JsonAdapter.serializeMap(omsMerCuryData.server, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsMerCuryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsMerCuryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59967a(String str) {
        return str;
    }

    public static OmsMerCuryData new_() {
        OmsMerCuryData omsMerCuryData = new OmsMerCuryData();
        omsMerCuryData.nullCheck();
        return omsMerCuryData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsMerCuryData mo223809clone() {
        OmsMerCuryData omsMerCuryData = new OmsMerCuryData();
        omsMerCuryData.f38800id = this.f38800id;
        omsMerCuryData.type = this.type;
        Map<String, String> map = this.server;
        if (map != null) {
            omsMerCuryData.server = ValueObject.util_map(map, new w9j() { // from class: l.jc50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OmsMerCuryData.m59967a((String) obj);
                }
            });
        }
        return omsMerCuryData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsMerCuryData)) {
            return false;
        }
        OmsMerCuryData omsMerCuryData = (OmsMerCuryData) obj;
        return ValueObject.util_equals(this.f38800id, omsMerCuryData.f38800id) && ValueObject.util_equals(this.type, omsMerCuryData.type) && ValueObject.util_equals(this.server, omsMerCuryData.server);
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
        String str = this.f38800id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSMercuryType oMSMercuryType = this.type;
        int iHashCode2 = (iHashCode + (oMSMercuryType != null ? oMSMercuryType.hashCode() : 0)) * 41;
        Map<String, String> map = this.server;
        int iHashCode3 = iHashCode2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38800id == null) {
            this.f38800id = "";
        }
        if (this.type == null) {
            this.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.defaultEnum();
        }
        if (this.server == null) {
            this.server = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
