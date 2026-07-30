package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.DetectMedia;
import com.p000p1.mobile.putong.data.DetectText;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class DetectRequest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detectrequest";

    @NonNull
    @ProtobufIndex(index = 1)
    public DetectCategoryType category;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<DetectMedia> media;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<DetectText> text;
    public static ProtobufAdapter<DetectRequest> PROTOBUF_ADAPTER = new MessageNanoAdapter<DetectRequest>() { // from class: com.p1.mobile.putong.data.DetectRequest.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DetectRequest detectRequest) {
            DetectCategoryType detectCategoryType = detectRequest.category;
            int iL = detectCategoryType != null ? CodedOutputByteBufferNano.l(1, detectCategoryType, DetectCategoryType.PROTOBUF_ADAPTER) : 0;
            List<DetectText> list = detectRequest.text;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(2, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMedia> list2 = detectRequest.media;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(3, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) detectRequest).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DetectRequest m17962parse(nb5 nb5Var) throws IOException {
            DetectRequest detectRequest = new DetectRequest();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (detectRequest.category == null) {
                        detectRequest.category = (DetectCategoryType) DetectCategoryType.JSON_ADAPTER.defaultEnum();
                    }
                    if (detectRequest.text == null) {
                        detectRequest.text = new ArrayList();
                    }
                    if (detectRequest.media != null) {
                        break;
                    }
                    detectRequest.media = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    detectRequest.category = (DetectCategoryType) nb5Var.l(DetectCategoryType.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    detectRequest.text = (List) nb5Var.l(DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (detectRequest.category == null) {
                            detectRequest.category = (DetectCategoryType) DetectCategoryType.JSON_ADAPTER.defaultEnum();
                        }
                        if (detectRequest.text == null) {
                            detectRequest.text = new ArrayList();
                        }
                        if (detectRequest.media != null) {
                            break;
                        }
                        detectRequest.media = new ArrayList();
                        return detectRequest;
                    }
                    detectRequest.media = (List) nb5Var.l(DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return detectRequest;
        }

        public void serialize(DetectRequest detectRequest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            DetectCategoryType detectCategoryType = detectRequest.category;
            if (detectCategoryType != null) {
                codedOutputByteBufferNano.K(1, detectCategoryType, DetectCategoryType.PROTOBUF_ADAPTER);
            }
            List<DetectText> list = detectRequest.text;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMedia> list2 = detectRequest.media;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DetectRequest> JSON_ADAPTER = new ObjectJsonAdapter<DetectRequest>() { // from class: com.p1.mobile.putong.data.DetectRequest.2
        public Class getDataClass() {
            return DetectRequest.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DetectRequest mo17830newInstance() {
            return new DetectRequest();
        }

        public boolean parseField(DetectRequest detectRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "text":
                    detectRequest.text = JsonAdapter.parseArray(jsonParser, DetectText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    detectRequest.category = (DetectCategoryType) DetectCategoryType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "media":
                    detectRequest.media = JsonAdapter.parseArray(jsonParser, DetectMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DetectRequest detectRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "text":
                case "category":
                case "media":
                    return true;
                default:
                    return super.parseFieldCheck(detectRequest, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectRequest detectRequest, JsonGenerator jsonGenerator) throws IOException {
            if (detectRequest.category != null) {
                jsonGenerator.writeFieldName("category");
                DetectCategoryType.JSON_ADAPTER.serialize(detectRequest.category, jsonGenerator, true);
            }
            if (detectRequest.text != null) {
                jsonGenerator.writeFieldName("text");
                JsonAdapter.serializeArray(detectRequest.text, jsonGenerator, DetectText.JSON_ADAPTER);
            }
            if (detectRequest.media != null) {
                jsonGenerator.writeFieldName(Media.TYPE);
                JsonAdapter.serializeArray(detectRequest.media, jsonGenerator, DetectMedia.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectRequest new_() {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.nullCheck();
        return detectRequest;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DetectRequest m17961clone() {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = this.category;
        List<DetectText> list = this.text;
        if (list != null) {
            detectRequest.text = ValueObject.util_map(list, new w9j() { // from class: l.wwd
                public final Object call(Object obj) {
                    return ((DetectText) obj).m17964clone();
                }
            });
        }
        List<DetectMedia> list2 = this.media;
        if (list2 != null) {
            detectRequest.media = ValueObject.util_map(list2, new w9j() { // from class: l.xwd
                public final Object call(Object obj) {
                    return ((DetectMedia) obj).m17958clone();
                }
            });
        }
        return detectRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetectRequest)) {
            return false;
        }
        DetectRequest detectRequest = (DetectRequest) obj;
        return ValueObject.util_equals(this.category, detectRequest.category) && ValueObject.util_equals(this.text, detectRequest.text) && ValueObject.util_equals(this.media, detectRequest.media);
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
        DetectCategoryType detectCategoryType = this.category;
        int iHashCode = (i2 + (detectCategoryType != null ? detectCategoryType.hashCode() : 0)) * 41;
        List<DetectText> list = this.text;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<DetectMedia> list2 = this.media;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.category == null) {
            this.category = (DetectCategoryType) DetectCategoryType.JSON_ADAPTER.defaultEnum();
        }
        if (this.text == null) {
            this.text = new ArrayList();
        }
        if (this.media == null) {
            this.media = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
