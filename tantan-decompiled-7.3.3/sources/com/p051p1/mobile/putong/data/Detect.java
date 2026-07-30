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
public class Detect extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detect";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<DetectMedia> media;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<DetectText> text;
    public static ProtobufAdapter<Detect> PROTOBUF_ADAPTER = new MessageNanoAdapter<Detect>() { // from class: com.p1.mobile.putong.data.Detect.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Detect detect) {
            List<DetectText> list = detect.text;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<DetectMedia> list2 = detect.media;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            detect.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Detect parse(nc5 nc5Var) throws IOException {
            Detect detect = new Detect();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (detect.text == null) {
                        detect.text = new ArrayList();
                    }
                    if (detect.media != null) {
                        break;
                    }
                    detect.media = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    detect.text = (List) nc5Var.m162488l(DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (detect.text == null) {
                            detect.text = new ArrayList();
                        }
                        if (detect.media != null) {
                            break;
                        }
                        detect.media = new ArrayList();
                        return detect;
                    }
                    detect.media = (List) nc5Var.m162488l(DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return detect;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Detect detect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<DetectText> list = detect.text;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMedia> list2 = detect.media;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Detect> JSON_ADAPTER = new ObjectJsonAdapter<Detect>() { // from class: com.p1.mobile.putong.data.Detect.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Detect.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Detect newInstance() {
            return new Detect();
        }

        public boolean parseField(Detect detect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                detect.text = JsonAdapter.parseArray(jsonParser, DetectText.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("media")) {
                return false;
            }
            detect.media = JsonAdapter.parseArray(jsonParser, DetectMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Detect detect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("media")) {
                return true;
            }
            return super.parseFieldCheck(detect, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Detect detect, JsonGenerator jsonGenerator) throws IOException {
            if (detect.text != null) {
                jsonGenerator.writeFieldName("text");
                JsonAdapter.serializeArray(detect.text, jsonGenerator, DetectText.JSON_ADAPTER);
            }
            if (detect.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(detect.media, jsonGenerator, DetectMedia.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Detect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Detect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Detect new_() {
        Detect detect = new Detect();
        detect.nullCheck();
        return detect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Detect mo225055clone() {
        Detect detect = new Detect();
        List<DetectText> list = this.text;
        if (list != null) {
            detect.text = ValueObject.util_map(list, new qcj() { // from class: l.gyd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DetectText) obj).mo225055clone();
                }
            });
        }
        List<DetectMedia> list2 = this.media;
        if (list2 != null) {
            detect.media = ValueObject.util_map(list2, new qcj() { // from class: l.hyd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DetectMedia) obj).mo225055clone();
                }
            });
        }
        return detect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Detect)) {
            return false;
        }
        Detect detect = (Detect) obj;
        return ValueObject.util_equals(this.text, detect.text) && ValueObject.util_equals(this.media, detect.media);
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
        List<DetectText> list = this.text;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<DetectMedia> list2 = this.media;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
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
