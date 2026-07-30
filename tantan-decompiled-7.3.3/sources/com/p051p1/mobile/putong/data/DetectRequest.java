package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.DetectMedia;
import com.p051p1.mobile.putong.data.DetectText;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DetectRequest detectRequest) {
            DetectCategoryType detectCategoryType = detectRequest.category;
            int iM17285l = detectCategoryType != null ? CodedOutputByteBufferNano.m17285l(1, detectCategoryType, DetectCategoryType.PROTOBUF_ADAPTER) : 0;
            List<DetectText> list = detectRequest.text;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMedia> list2 = detectRequest.media;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            detectRequest.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DetectRequest parse(nc5 nc5Var) throws IOException {
            DetectRequest detectRequest = new DetectRequest();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    detectRequest.category = (DetectCategoryType) nc5Var.m162488l(DetectCategoryType.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    detectRequest.text = (List) nc5Var.m162488l(DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
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
                    detectRequest.media = (List) nc5Var.m162488l(DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return detectRequest;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DetectRequest detectRequest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            DetectCategoryType detectCategoryType = detectRequest.category;
            if (detectCategoryType != null) {
                codedOutputByteBufferNano.m17309K(1, detectCategoryType, DetectCategoryType.PROTOBUF_ADAPTER);
            }
            List<DetectText> list = detectRequest.text;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMedia> list2 = detectRequest.media;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(3, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DetectRequest> JSON_ADAPTER = new ObjectJsonAdapter<DetectRequest>() { // from class: com.p1.mobile.putong.data.DetectRequest.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DetectRequest.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DetectRequest newInstance() {
            return new DetectRequest();
        }

        public boolean parseField(DetectRequest detectRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "text":
                    detectRequest.text = JsonAdapter.parseArray(jsonParser, DetectText.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    detectRequest.category = DetectCategoryType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(detectRequest.media, jsonGenerator, DetectMedia.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectRequest new_() {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.nullCheck();
        return detectRequest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DetectRequest mo225055clone() {
        DetectRequest detectRequest = new DetectRequest();
        detectRequest.category = this.category;
        List<DetectText> list = this.text;
        if (list != null) {
            detectRequest.text = ValueObject.util_map(list, new qcj() { // from class: l.kyd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DetectText) obj).mo225055clone();
                }
            });
        }
        List<DetectMedia> list2 = this.media;
        if (list2 != null) {
            detectRequest.media = ValueObject.util_map(list2, new qcj() { // from class: l.lyd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DetectMedia) obj).mo225055clone();
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
        DetectCategoryType detectCategoryType = this.category;
        int iHashCode = (i2 + (detectCategoryType != null ? detectCategoryType.hashCode() : 0)) * 41;
        List<DetectText> list = this.text;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<DetectMedia> list2 = this.media;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
