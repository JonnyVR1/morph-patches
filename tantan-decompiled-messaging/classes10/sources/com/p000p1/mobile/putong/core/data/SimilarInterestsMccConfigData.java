package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
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
public class SimilarInterestsMccConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsmccconfigdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> items;

    @ProtobufIndex(index = 1)
    public int swipeCount;
    public static ProtobufAdapter<SimilarInterestsMccConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsMccConfigData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsMccConfigData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimilarInterestsMccConfigData similarInterestsMccConfigData) {
            int iH = CodedOutputByteBufferNano.h(1, similarInterestsMccConfigData.swipeCount);
            List<String> list = similarInterestsMccConfigData.items;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) similarInterestsMccConfigData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsMccConfigData m15656parse(nb5 nb5Var) throws IOException {
            SimilarInterestsMccConfigData similarInterestsMccConfigData = new SimilarInterestsMccConfigData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (similarInterestsMccConfigData.items != null) {
                        break;
                    }
                    similarInterestsMccConfigData.items = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    similarInterestsMccConfigData.swipeCount = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (similarInterestsMccConfigData.items != null) {
                            break;
                        }
                        similarInterestsMccConfigData.items = new ArrayList();
                        return similarInterestsMccConfigData;
                    }
                    similarInterestsMccConfigData.items = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return similarInterestsMccConfigData;
        }

        public void serialize(SimilarInterestsMccConfigData similarInterestsMccConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, similarInterestsMccConfigData.swipeCount);
            List<String> list = similarInterestsMccConfigData.items;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SimilarInterestsMccConfigData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsMccConfigData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsMccConfigData.2
        public Class getDataClass() {
            return SimilarInterestsMccConfigData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimilarInterestsMccConfigData m15657newInstance() {
            return new SimilarInterestsMccConfigData();
        }

        public boolean parseField(SimilarInterestsMccConfigData similarInterestsMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("items")) {
                similarInterestsMccConfigData.items = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("swipeCount")) {
                return false;
            }
            similarInterestsMccConfigData.swipeCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SimilarInterestsMccConfigData similarInterestsMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("items") || str.equals("swipeCount")) {
                return true;
            }
            return super.parseFieldCheck(similarInterestsMccConfigData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SimilarInterestsMccConfigData similarInterestsMccConfigData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeCount", similarInterestsMccConfigData.swipeCount);
            if (similarInterestsMccConfigData.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(similarInterestsMccConfigData.items, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m646a(String str) {
        return str;
    }

    public static SimilarInterestsMccConfigData new_() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData = new SimilarInterestsMccConfigData();
        similarInterestsMccConfigData.nullCheck();
        return similarInterestsMccConfigData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimilarInterestsMccConfigData m15655clone() {
        SimilarInterestsMccConfigData similarInterestsMccConfigData = new SimilarInterestsMccConfigData();
        similarInterestsMccConfigData.swipeCount = this.swipeCount;
        List<String> list = this.items;
        if (list != null) {
            similarInterestsMccConfigData.items = ValueObject.util_map(list, new w9j() { // from class: l.tff0
                public final Object call(Object obj) {
                    return SimilarInterestsMccConfigData.m646a((String) obj);
                }
            });
        }
        return similarInterestsMccConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsMccConfigData)) {
            return false;
        }
        SimilarInterestsMccConfigData similarInterestsMccConfigData = (SimilarInterestsMccConfigData) obj;
        return this.swipeCount == similarInterestsMccConfigData.swipeCount && ValueObject.util_equals(this.items, similarInterestsMccConfigData.items);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.swipeCount) * 41;
        List<String> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
