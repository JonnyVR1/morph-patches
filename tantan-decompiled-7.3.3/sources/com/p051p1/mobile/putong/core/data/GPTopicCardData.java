package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
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
public class GPTopicCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gptopiccarddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<GPTopicCard> topicCards;
    public static ProtobufAdapter<GPTopicCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPTopicCardData>() { // from class: com.p1.mobile.putong.core.data.GPTopicCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPTopicCardData gPTopicCardData) {
            List<GPTopicCard> list = gPTopicCardData.topicCards;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, GPTopicCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            gPTopicCardData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPTopicCardData parse(nc5 nc5Var) throws IOException {
            GPTopicCardData gPTopicCardData = new GPTopicCardData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (gPTopicCardData.topicCards != null) {
                        break;
                    }
                    gPTopicCardData.topicCards = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (gPTopicCardData.topicCards != null) {
                        break;
                    }
                    gPTopicCardData.topicCards = new ArrayList();
                    return gPTopicCardData;
                }
                gPTopicCardData.topicCards = (List) nc5Var.m162488l(GPTopicCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPTopicCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPTopicCardData gPTopicCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPTopicCard> list = gPTopicCardData.topicCards;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, GPTopicCard.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPTopicCardData> JSON_ADAPTER = new ObjectJsonAdapter<GPTopicCardData>() { // from class: com.p1.mobile.putong.core.data.GPTopicCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPTopicCardData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPTopicCardData newInstance() {
            return new GPTopicCardData();
        }

        public boolean parseField(GPTopicCardData gPTopicCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("topicCards")) {
                return false;
            }
            gPTopicCardData.topicCards = JsonAdapter.parseArray(jsonParser, GPTopicCard.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPTopicCardData gPTopicCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("topicCards")) {
                return true;
            }
            return super.parseFieldCheck(gPTopicCardData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPTopicCardData gPTopicCardData, JsonGenerator jsonGenerator) throws IOException {
            if (gPTopicCardData.topicCards != null) {
                jsonGenerator.writeFieldName("topicCards");
                JsonAdapter.serializeArray(gPTopicCardData.topicCards, jsonGenerator, GPTopicCard.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPTopicCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPTopicCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPTopicCardData new_() {
        GPTopicCardData gPTopicCardData = new GPTopicCardData();
        gPTopicCardData.nullCheck();
        return gPTopicCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPTopicCardData mo225055clone() {
        GPTopicCardData gPTopicCardData = new GPTopicCardData();
        List<GPTopicCard> list = this.topicCards;
        if (list != null) {
            gPTopicCardData.topicCards = ValueObject.util_map(list, new qcj() { // from class: l.kjj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GPTopicCard) obj).mo225055clone();
                }
            });
        }
        return gPTopicCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GPTopicCardData) {
            return ValueObject.util_equals(this.topicCards, ((GPTopicCardData) obj).topicCards);
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
        List<GPTopicCard> list = this.topicCards;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topicCards == null) {
            this.topicCards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
