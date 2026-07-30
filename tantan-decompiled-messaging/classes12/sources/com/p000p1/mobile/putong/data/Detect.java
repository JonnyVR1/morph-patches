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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Detect detect) {
            List<DetectText> list = detect.text;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<DetectMedia> list2 = detect.media;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) detect).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Detect m17956parse(nb5 nb5Var) throws IOException {
            Detect detect = new Detect();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (detect.text == null) {
                        detect.text = new ArrayList();
                    }
                    if (detect.media != null) {
                        break;
                    }
                    detect.media = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    detect.text = (List) nb5Var.l(DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (detect.text == null) {
                            detect.text = new ArrayList();
                        }
                        if (detect.media != null) {
                            break;
                        }
                        detect.media = new ArrayList();
                        return detect;
                    }
                    detect.media = (List) nb5Var.l(DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return detect;
        }

        public void serialize(Detect detect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<DetectText> list = detect.text;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, DetectText.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DetectMedia> list2 = detect.media;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, DetectMedia.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Detect> JSON_ADAPTER = new ObjectJsonAdapter<Detect>() { // from class: com.p1.mobile.putong.data.Detect.2
        public Class getDataClass() {
            return Detect.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Detect mo17830newInstance() {
            return new Detect();
        }

        public boolean parseField(Detect detect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                detect.text = JsonAdapter.parseArray(jsonParser, DetectText.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Media.TYPE)) {
                return false;
            }
            detect.media = JsonAdapter.parseArray(jsonParser, DetectMedia.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Detect detect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals(Media.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(detect, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Detect detect, JsonGenerator jsonGenerator) throws IOException {
            if (detect.text != null) {
                jsonGenerator.writeFieldName("text");
                JsonAdapter.serializeArray(detect.text, jsonGenerator, DetectText.JSON_ADAPTER);
            }
            if (detect.media != null) {
                jsonGenerator.writeFieldName(Media.TYPE);
                JsonAdapter.serializeArray(detect.media, jsonGenerator, DetectMedia.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Detect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Detect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Detect new_() {
        Detect detect = new Detect();
        detect.nullCheck();
        return detect;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Detect m17955clone() {
        Detect detect = new Detect();
        List<DetectText> list = this.text;
        if (list != null) {
            detect.text = ValueObject.util_map(list, new w9j() { // from class: l.swd
                public final Object call(Object obj) {
                    return ((DetectText) obj).m17964clone();
                }
            });
        }
        List<DetectMedia> list2 = this.media;
        if (list2 != null) {
            detect.media = ValueObject.util_map(list2, new w9j() { // from class: l.twd
                public final Object call(Object obj) {
                    return ((DetectMedia) obj).m17958clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<DetectText> list = this.text;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<DetectMedia> list2 = this.media;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
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
