package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.Relationship;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class SpotLightForceMatchData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightforcematchdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Conversation> conversions;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Relationship> relationships;
    public static ProtobufAdapter<SpotLightForceMatchData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightForceMatchData>() { // from class: com.p1.mobile.putong.core.data.SpotLightForceMatchData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpotLightForceMatchData spotLightForceMatchData) {
            List<Conversation> list = spotLightForceMatchData.conversions;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Relationship> list2 = spotLightForceMatchData.relationships;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            spotLightForceMatchData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpotLightForceMatchData parse(nc5 nc5Var) throws IOException {
            SpotLightForceMatchData spotLightForceMatchData = new SpotLightForceMatchData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (spotLightForceMatchData.conversions == null) {
                        spotLightForceMatchData.conversions = new ArrayList();
                    }
                    if (spotLightForceMatchData.relationships != null) {
                        break;
                    }
                    spotLightForceMatchData.relationships = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    spotLightForceMatchData.conversions = (List) nc5Var.m162488l(Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (spotLightForceMatchData.conversions == null) {
                            spotLightForceMatchData.conversions = new ArrayList();
                        }
                        if (spotLightForceMatchData.relationships != null) {
                            break;
                        }
                        spotLightForceMatchData.relationships = new ArrayList();
                        return spotLightForceMatchData;
                    }
                    spotLightForceMatchData.relationships = (List) nc5Var.m162488l(Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return spotLightForceMatchData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpotLightForceMatchData spotLightForceMatchData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Conversation> list = spotLightForceMatchData.conversions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Relationship> list2 = spotLightForceMatchData.relationships;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SpotLightForceMatchData> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightForceMatchData>() { // from class: com.p1.mobile.putong.core.data.SpotLightForceMatchData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpotLightForceMatchData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpotLightForceMatchData newInstance() {
            return new SpotLightForceMatchData();
        }

        public boolean parseField(SpotLightForceMatchData spotLightForceMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("conversions")) {
                spotLightForceMatchData.conversions = JsonAdapter.parseArray(jsonParser, Conversation.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("relationships")) {
                return false;
            }
            spotLightForceMatchData.relationships = JsonAdapter.parseArray(jsonParser, Relationship.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(SpotLightForceMatchData spotLightForceMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("conversions") || str.equals("relationships")) {
                return true;
            }
            return super.parseFieldCheck(spotLightForceMatchData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpotLightForceMatchData spotLightForceMatchData, JsonGenerator jsonGenerator) throws IOException {
            if (spotLightForceMatchData.conversions != null) {
                jsonGenerator.writeFieldName("conversions");
                JsonAdapter.serializeArray(spotLightForceMatchData.conversions, jsonGenerator, Conversation.JSON_ADAPTER);
            }
            if (spotLightForceMatchData.relationships != null) {
                jsonGenerator.writeFieldName("relationships");
                JsonAdapter.serializeArray(spotLightForceMatchData.relationships, jsonGenerator, Relationship.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightForceMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightForceMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightForceMatchData new_() {
        SpotLightForceMatchData spotLightForceMatchData = new SpotLightForceMatchData();
        spotLightForceMatchData.nullCheck();
        return spotLightForceMatchData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpotLightForceMatchData mo225055clone() {
        SpotLightForceMatchData spotLightForceMatchData = new SpotLightForceMatchData();
        List<Conversation> list = this.conversions;
        if (list != null) {
            spotLightForceMatchData.conversions = ValueObject.util_map(list, new qcj() { // from class: l.uxf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Conversation) obj).mo225055clone();
                }
            });
        }
        List<Relationship> list2 = this.relationships;
        if (list2 != null) {
            spotLightForceMatchData.relationships = ValueObject.util_map(list2, new qcj() { // from class: l.vxf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Relationship) obj).mo225055clone();
                }
            });
        }
        return spotLightForceMatchData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotLightForceMatchData)) {
            return false;
        }
        SpotLightForceMatchData spotLightForceMatchData = (SpotLightForceMatchData) obj;
        return ValueObject.util_equals(this.conversions, spotLightForceMatchData.conversions) && ValueObject.util_equals(this.relationships, spotLightForceMatchData.relationships);
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
        List<Conversation> list = this.conversions;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Relationship> list2 = this.relationships;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.conversions == null) {
            this.conversions = new ArrayList();
        }
        if (this.relationships == null) {
            this.relationships = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
