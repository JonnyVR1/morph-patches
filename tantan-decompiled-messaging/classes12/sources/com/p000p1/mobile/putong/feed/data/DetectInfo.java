package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.DetectMediaInfo;
import com.p000p1.mobile.putong.feed.data.DetectTextInfo;
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
public class DetectInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detectinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<DetectMediaInfo> media;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<DetectTextInfo> text;
    public static ProtobufAdapter<DetectInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<DetectInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DetectInfo detectInfo) {
            List<DetectTextInfo> list = detectInfo.text;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, DetectTextInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<DetectMediaInfo> list2 = detectInfo.media;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, DetectMediaInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = detectInfo.category;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) detectInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DetectInfo m19473parse(nb5 nb5Var) throws IOException {
            DetectInfo detectInfo = new DetectInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (detectInfo.text == null) {
                        detectInfo.text = new ArrayList();
                    }
                    if (detectInfo.media == null) {
                        detectInfo.media = new ArrayList();
                    }
                    if (detectInfo.category != null) {
                        break;
                    }
                    detectInfo.category = "";
                    break;
                }
                if (iU == 10) {
                    detectInfo.text = (List) nb5Var.l(DetectTextInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    detectInfo.media = (List) nb5Var.l(DetectMediaInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (detectInfo.text == null) {
                            detectInfo.text = new ArrayList();
                        }
                        if (detectInfo.media == null) {
                            detectInfo.media = new ArrayList();
                        }
                        if (detectInfo.category != null) {
                            break;
                        }
                        detectInfo.category = "";
                        return detectInfo;
                    }
                    detectInfo.category = nb5Var.s();
                }
            }
            return detectInfo;
        }

        public void serialize(DetectInfo detectInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<DetectTextInfo> list = detectInfo.text;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, DetectTextInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMediaInfo> list2 = detectInfo.media;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, DetectMediaInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = detectInfo.category;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<DetectInfo> JSON_ADAPTER = new ObjectJsonAdapter<DetectInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectInfo.2
        public Class getDataClass() {
            return DetectInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DetectInfo mo17830newInstance() {
            return new DetectInfo();
        }

        public boolean parseField(DetectInfo detectInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "text":
                    detectInfo.text = JsonAdapter.parseArray(jsonParser, DetectTextInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "category":
                    detectInfo.category = jsonParser.getValueAsString();
                    return true;
                case "media":
                    detectInfo.media = JsonAdapter.parseArray(jsonParser, DetectMediaInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DetectInfo detectInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "text":
                case "category":
                case "media":
                    return true;
                default:
                    return super.parseFieldCheck(detectInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectInfo detectInfo, JsonGenerator jsonGenerator) throws IOException {
            if (detectInfo.text != null) {
                jsonGenerator.writeFieldName("text");
                JsonAdapter.serializeArray(detectInfo.text, jsonGenerator, DetectTextInfo.JSON_ADAPTER);
            }
            if (detectInfo.media != null) {
                jsonGenerator.writeFieldName(Media.TYPE);
                JsonAdapter.serializeArray(detectInfo.media, jsonGenerator, DetectMediaInfo.JSON_ADAPTER);
            }
            String str = detectInfo.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectInfo new_() {
        DetectInfo detectInfo = new DetectInfo();
        detectInfo.nullCheck();
        return detectInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DetectInfo m19472clone() {
        DetectInfo detectInfo = new DetectInfo();
        List<DetectTextInfo> list = this.text;
        if (list != null) {
            detectInfo.text = ValueObject.util_map(list, new w9j() { // from class: l.uwd
                public final Object call(Object obj) {
                    return ((DetectTextInfo) obj).m19478clone();
                }
            });
        }
        List<DetectMediaInfo> list2 = this.media;
        if (list2 != null) {
            detectInfo.media = ValueObject.util_map(list2, new w9j() { // from class: l.vwd
                public final Object call(Object obj) {
                    return ((DetectMediaInfo) obj).m19475clone();
                }
            });
        }
        detectInfo.category = this.category;
        return detectInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetectInfo)) {
            return false;
        }
        DetectInfo detectInfo = (DetectInfo) obj;
        return ValueObject.util_equals(this.text, detectInfo.text) && ValueObject.util_equals(this.media, detectInfo.media) && ValueObject.util_equals(this.category, detectInfo.category);
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
        List<DetectTextInfo> list = this.text;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<DetectMediaInfo> list2 = this.media;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.category;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = new ArrayList();
        }
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
