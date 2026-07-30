package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OmsMerCuryData;
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
import java.util.Collections;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OmsMerCuryData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsmercurydata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f261id;

    @NonNull
    @ProtobufIndex(index = 3)
    public Map<String, String> server;

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSMercuryType type;
    public static ProtobufAdapter<OmsMerCuryData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsMerCuryData>() { // from class: com.p1.mobile.putong.data.OmsMerCuryData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsMerCuryData omsMerCuryData) {
            String str = omsMerCuryData.f261id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            OMSMercuryType oMSMercuryType = omsMerCuryData.type;
            if (oMSMercuryType != null) {
                iO += CodedOutputByteBufferNano.h(2, oMSMercuryType.ordinal());
            }
            Map<String, String> map = omsMerCuryData.server;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(3, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            OMSMercuryType oMSMercuryType2 = omsMerCuryData.type;
            if (oMSMercuryType2 != null) {
                iO += CodedOutputByteBufferNano.l(4, oMSMercuryType2, OMSMercuryType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) omsMerCuryData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsMerCuryData m18723parse(nb5 nb5Var) throws IOException {
            OmsMerCuryData omsMerCuryData = new OmsMerCuryData();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (omsMerCuryData.type == null && numValueOf != null) {
                        omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (omsMerCuryData.f261id == null) {
                        omsMerCuryData.f261id = "";
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
                if (iU == 10) {
                    omsMerCuryData.f261id = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    omsMerCuryData.server = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
                } else {
                    if (iU != 34) {
                        if (omsMerCuryData.type == null && numValueOf != null) {
                            omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (omsMerCuryData.f261id == null) {
                            omsMerCuryData.f261id = "";
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
                    omsMerCuryData.type = (OMSMercuryType) nb5Var.l(OMSMercuryType.PROTOBUF_ADAPTER);
                }
            }
            return omsMerCuryData;
        }

        public void serialize(OmsMerCuryData omsMerCuryData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = omsMerCuryData.f261id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            OMSMercuryType oMSMercuryType = omsMerCuryData.type;
            if (oMSMercuryType != null) {
                codedOutputByteBufferNano.G(2, oMSMercuryType.ordinal());
            }
            Map<String, String> map = omsMerCuryData.server;
            if (map != null) {
                codedOutputByteBufferNano.K(3, map, ProtobufAdapter.STRING_ADAPTER.MAP_ADAPTER());
            }
            OMSMercuryType oMSMercuryType2 = omsMerCuryData.type;
            if (oMSMercuryType2 != null) {
                codedOutputByteBufferNano.K(4, oMSMercuryType2, OMSMercuryType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OmsMerCuryData> JSON_ADAPTER = new ObjectJsonAdapter<OmsMerCuryData>() { // from class: com.p1.mobile.putong.data.OmsMerCuryData.2
        public Class getDataClass() {
            return OmsMerCuryData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsMerCuryData mo17830newInstance() {
            return new OmsMerCuryData();
        }

        public boolean parseField(OmsMerCuryData omsMerCuryData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "server":
                    omsMerCuryData.server = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "id":
                    omsMerCuryData.f261id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    omsMerCuryData.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsMerCuryData omsMerCuryData, JsonGenerator jsonGenerator) throws IOException {
            String str = omsMerCuryData.f261id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsMerCuryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsMerCuryData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m885a(String str) {
        return str;
    }

    public static OmsMerCuryData new_() {
        OmsMerCuryData omsMerCuryData = new OmsMerCuryData();
        omsMerCuryData.nullCheck();
        return omsMerCuryData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsMerCuryData m18722clone() {
        OmsMerCuryData omsMerCuryData = new OmsMerCuryData();
        omsMerCuryData.f261id = this.f261id;
        omsMerCuryData.type = this.type;
        Map<String, String> map = this.server;
        if (map != null) {
            omsMerCuryData.server = ValueObject.util_map(map, new w9j() { // from class: l.jc50
                public final Object call(Object obj) {
                    return OmsMerCuryData.m885a((String) obj);
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
        return ValueObject.util_equals(this.f261id, omsMerCuryData.f261id) && ValueObject.util_equals(this.type, omsMerCuryData.type) && ValueObject.util_equals(this.server, omsMerCuryData.server);
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
        String str = this.f261id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        OMSMercuryType oMSMercuryType = this.type;
        int iHashCode2 = (iHashCode + (oMSMercuryType != null ? oMSMercuryType.hashCode() : 0)) * 41;
        Map<String, String> map = this.server;
        int iHashCode3 = iHashCode2 + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f261id == null) {
            this.f261id = "";
        }
        if (this.type == null) {
            this.type = (OMSMercuryType) OMSMercuryType.JSON_ADAPTER.defaultEnum();
        }
        if (this.server == null) {
            this.server = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
