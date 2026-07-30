package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes12.dex */
public class DetectMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detectmedia";

    @ProtobufIndex(index = 2)
    public int index;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<DetectMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<DetectMedia>() { // from class: com.p1.mobile.putong.data.DetectMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DetectMedia detectMedia) {
            String str = detectMedia.url;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, detectMedia.index);
            String str2 = detectMedia.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            detectMedia.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DetectMedia parse(nc5 nc5Var) throws IOException {
            DetectMedia detectMedia = new DetectMedia();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (detectMedia.url == null) {
                        detectMedia.url = "";
                    }
                    if (detectMedia.type != null) {
                        break;
                    }
                    detectMedia.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    detectMedia.url = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    detectMedia.index = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (detectMedia.url == null) {
                            detectMedia.url = "";
                        }
                        if (detectMedia.type != null) {
                            break;
                        }
                        detectMedia.type = "";
                        return detectMedia;
                    }
                    detectMedia.type = nc5Var.m162495s();
                }
            }
            return detectMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DetectMedia detectMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = detectMedia.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, detectMedia.index);
            String str2 = detectMedia.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<DetectMedia> JSON_ADAPTER = new ObjectJsonAdapter<DetectMedia>() { // from class: com.p1.mobile.putong.data.DetectMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DetectMedia.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DetectMedia newInstance() {
            return new DetectMedia();
        }

        public boolean parseField(DetectMedia detectMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "url":
                    detectMedia.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    detectMedia.type = jsonParser.getValueAsString();
                    return true;
                case "index":
                    detectMedia.index = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DetectMedia detectMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "url":
                case "type":
                case "index":
                    return true;
                default:
                    return super.parseFieldCheck(detectMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectMedia detectMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = detectMedia.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, detectMedia.index);
            String str2 = detectMedia.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectMedia new_() {
        DetectMedia detectMedia = new DetectMedia();
        detectMedia.nullCheck();
        return detectMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DetectMedia mo225055clone() {
        DetectMedia detectMedia = new DetectMedia();
        detectMedia.url = this.url;
        detectMedia.index = this.index;
        detectMedia.type = this.type;
        return detectMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetectMedia)) {
            return false;
        }
        DetectMedia detectMedia = (DetectMedia) obj;
        return ValueObject.util_equals(this.url, detectMedia.url) && this.index == detectMedia.index && ValueObject.util_equals(this.type, detectMedia.type);
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
        String str = this.url;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.index) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
