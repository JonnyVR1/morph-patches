package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PoiEmotionGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "poiemotionguide";

    @NonNull
    @ProtobufIndex(index = 1)
    public String emotionId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String guide;
    public static ProtobufAdapter<PoiEmotionGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<PoiEmotionGuide>() { // from class: com.p1.mobile.putong.feed.data.PoiEmotionGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PoiEmotionGuide poiEmotionGuide) {
            String str = poiEmotionGuide.emotionId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = poiEmotionGuide.guide;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) poiEmotionGuide).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PoiEmotionGuide m19705parse(nb5 nb5Var) throws IOException {
            PoiEmotionGuide poiEmotionGuide = new PoiEmotionGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (poiEmotionGuide.emotionId == null) {
                        poiEmotionGuide.emotionId = "";
                    }
                    if (poiEmotionGuide.guide != null) {
                        break;
                    }
                    poiEmotionGuide.guide = "";
                    break;
                }
                if (iU == 10) {
                    poiEmotionGuide.emotionId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (poiEmotionGuide.emotionId == null) {
                            poiEmotionGuide.emotionId = "";
                        }
                        if (poiEmotionGuide.guide != null) {
                            break;
                        }
                        poiEmotionGuide.guide = "";
                        return poiEmotionGuide;
                    }
                    poiEmotionGuide.guide = nb5Var.s();
                }
            }
            return poiEmotionGuide;
        }

        public void serialize(PoiEmotionGuide poiEmotionGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = poiEmotionGuide.emotionId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = poiEmotionGuide.guide;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<PoiEmotionGuide> JSON_ADAPTER = new ObjectJsonAdapter<PoiEmotionGuide>() { // from class: com.p1.mobile.putong.feed.data.PoiEmotionGuide.2
        public Class getDataClass() {
            return PoiEmotionGuide.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PoiEmotionGuide mo17830newInstance() {
            return new PoiEmotionGuide();
        }

        public boolean parseField(PoiEmotionGuide poiEmotionGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("guide")) {
                poiEmotionGuide.guide = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("emotionId")) {
                return false;
            }
            poiEmotionGuide.emotionId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PoiEmotionGuide poiEmotionGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("guide") || str.equals("emotionId")) {
                return true;
            }
            return super.parseFieldCheck(poiEmotionGuide, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PoiEmotionGuide poiEmotionGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = poiEmotionGuide.emotionId;
            if (str != null) {
                jsonGenerator.writeStringField("emotionId", str);
            }
            String str2 = poiEmotionGuide.guide;
            if (str2 != null) {
                jsonGenerator.writeStringField("guide", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiEmotionGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiEmotionGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PoiEmotionGuide new_() {
        PoiEmotionGuide poiEmotionGuide = new PoiEmotionGuide();
        poiEmotionGuide.nullCheck();
        return poiEmotionGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PoiEmotionGuide m19704clone() {
        PoiEmotionGuide poiEmotionGuide = new PoiEmotionGuide();
        poiEmotionGuide.emotionId = this.emotionId;
        poiEmotionGuide.guide = this.guide;
        return poiEmotionGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiEmotionGuide)) {
            return false;
        }
        PoiEmotionGuide poiEmotionGuide = (PoiEmotionGuide) obj;
        return ValueObject.util_equals(this.emotionId, poiEmotionGuide.emotionId) && ValueObject.util_equals(this.guide, poiEmotionGuide.guide);
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
        String str = this.emotionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.guide;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.emotionId == null) {
            this.emotionId = "";
        }
        if (this.guide == null) {
            this.guide = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
