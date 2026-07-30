package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Relationship;
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
public class SpotLightForceMatchData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spotlightforcematchdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Conversation> conversions;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Relationship> relationships;
    public static ProtobufAdapter<SpotLightForceMatchData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpotLightForceMatchData>() { // from class: com.p1.mobile.putong.core.data.SpotLightForceMatchData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpotLightForceMatchData spotLightForceMatchData) {
            List<Conversation> list = spotLightForceMatchData.conversions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Relationship> list2 = spotLightForceMatchData.relationships;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) spotLightForceMatchData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpotLightForceMatchData m15706parse(nb5 nb5Var) throws IOException {
            SpotLightForceMatchData spotLightForceMatchData = new SpotLightForceMatchData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (spotLightForceMatchData.conversions == null) {
                        spotLightForceMatchData.conversions = new ArrayList();
                    }
                    if (spotLightForceMatchData.relationships != null) {
                        break;
                    }
                    spotLightForceMatchData.relationships = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    spotLightForceMatchData.conversions = (List) nb5Var.l(Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (spotLightForceMatchData.conversions == null) {
                            spotLightForceMatchData.conversions = new ArrayList();
                        }
                        if (spotLightForceMatchData.relationships != null) {
                            break;
                        }
                        spotLightForceMatchData.relationships = new ArrayList();
                        return spotLightForceMatchData;
                    }
                    spotLightForceMatchData.relationships = (List) nb5Var.l(Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return spotLightForceMatchData;
        }

        public void serialize(SpotLightForceMatchData spotLightForceMatchData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Conversation> list = spotLightForceMatchData.conversions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Conversation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Relationship> list2 = spotLightForceMatchData.relationships;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, Relationship.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SpotLightForceMatchData> JSON_ADAPTER = new ObjectJsonAdapter<SpotLightForceMatchData>() { // from class: com.p1.mobile.putong.core.data.SpotLightForceMatchData.2
        public Class getDataClass() {
            return SpotLightForceMatchData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpotLightForceMatchData m15707newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpotLightForceMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpotLightForceMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpotLightForceMatchData new_() {
        SpotLightForceMatchData spotLightForceMatchData = new SpotLightForceMatchData();
        spotLightForceMatchData.nullCheck();
        return spotLightForceMatchData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpotLightForceMatchData m15705clone() {
        SpotLightForceMatchData spotLightForceMatchData = new SpotLightForceMatchData();
        List<Conversation> list = this.conversions;
        if (list != null) {
            spotLightForceMatchData.conversions = ValueObject.util_map(list, new w9j() { // from class: l.lpf0
                public final Object call(Object obj) {
                    return ((Conversation) obj).m12312clone();
                }
            });
        }
        List<Relationship> list2 = this.relationships;
        if (list2 != null) {
            spotLightForceMatchData.relationships = ValueObject.util_map(list2, new w9j() { // from class: l.mpf0
                public final Object call(Object obj) {
                    return ((Relationship) obj).clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Conversation> list = this.conversions;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Relationship> list2 = this.relationships;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.conversions == null) {
            this.conversions = new ArrayList();
        }
        if (this.relationships == null) {
            this.relationships = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
