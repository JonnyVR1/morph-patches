package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PoiEmotionGuide poiEmotionGuide) {
            String str = poiEmotionGuide.emotionId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = poiEmotionGuide.guide;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            poiEmotionGuide.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PoiEmotionGuide parse(nc5 nc5Var) throws IOException {
            PoiEmotionGuide poiEmotionGuide = new PoiEmotionGuide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (poiEmotionGuide.emotionId == null) {
                        poiEmotionGuide.emotionId = "";
                    }
                    if (poiEmotionGuide.guide != null) {
                        break;
                    }
                    poiEmotionGuide.guide = "";
                    break;
                }
                if (iM162497u == 10) {
                    poiEmotionGuide.emotionId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (poiEmotionGuide.emotionId == null) {
                            poiEmotionGuide.emotionId = "";
                        }
                        if (poiEmotionGuide.guide != null) {
                            break;
                        }
                        poiEmotionGuide.guide = "";
                        return poiEmotionGuide;
                    }
                    poiEmotionGuide.guide = nc5Var.m162495s();
                }
            }
            return poiEmotionGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PoiEmotionGuide poiEmotionGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = poiEmotionGuide.emotionId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = poiEmotionGuide.guide;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<PoiEmotionGuide> JSON_ADAPTER = new ObjectJsonAdapter<PoiEmotionGuide>() { // from class: com.p1.mobile.putong.feed.data.PoiEmotionGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PoiEmotionGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PoiEmotionGuide newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiEmotionGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiEmotionGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PoiEmotionGuide new_() {
        PoiEmotionGuide poiEmotionGuide = new PoiEmotionGuide();
        poiEmotionGuide.nullCheck();
        return poiEmotionGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PoiEmotionGuide mo225055clone() {
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
        String str = this.emotionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.guide;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.emotionId == null) {
            this.emotionId = "";
        }
        if (this.guide == null) {
            this.guide = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
