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
public class DetectMediaInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detectmediainfo";

    @ProtobufIndex(index = 2)
    public int index;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<DetectMediaInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<DetectMediaInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectMediaInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DetectMediaInfo detectMediaInfo) {
            String str = detectMediaInfo.url;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, detectMediaInfo.index);
            String str2 = detectMediaInfo.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) detectMediaInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DetectMediaInfo m19476parse(nb5 nb5Var) throws IOException {
            DetectMediaInfo detectMediaInfo = new DetectMediaInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (detectMediaInfo.url == null) {
                        detectMediaInfo.url = "";
                    }
                    if (detectMediaInfo.type != null) {
                        break;
                    }
                    detectMediaInfo.type = "";
                    break;
                }
                if (iU == 10) {
                    detectMediaInfo.url = nb5Var.s();
                } else if (iU == 16) {
                    detectMediaInfo.index = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (detectMediaInfo.url == null) {
                            detectMediaInfo.url = "";
                        }
                        if (detectMediaInfo.type != null) {
                            break;
                        }
                        detectMediaInfo.type = "";
                        return detectMediaInfo;
                    }
                    detectMediaInfo.type = nb5Var.s();
                }
            }
            return detectMediaInfo;
        }

        public void serialize(DetectMediaInfo detectMediaInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = detectMediaInfo.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, detectMediaInfo.index);
            String str2 = detectMediaInfo.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<DetectMediaInfo> JSON_ADAPTER = new ObjectJsonAdapter<DetectMediaInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectMediaInfo.2
        public Class getDataClass() {
            return DetectMediaInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DetectMediaInfo mo17830newInstance() {
            return new DetectMediaInfo();
        }

        public boolean parseField(DetectMediaInfo detectMediaInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "url":
                    detectMediaInfo.url = jsonParser.getValueAsString();
                    return true;
                case "type":
                    detectMediaInfo.type = jsonParser.getValueAsString();
                    return true;
                case "index":
                    detectMediaInfo.index = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DetectMediaInfo detectMediaInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "url":
                case "type":
                case "index":
                    return true;
                default:
                    return super.parseFieldCheck(detectMediaInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectMediaInfo detectMediaInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = detectMediaInfo.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField("index", detectMediaInfo.index);
            String str2 = detectMediaInfo.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectMediaInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectMediaInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectMediaInfo new_() {
        DetectMediaInfo detectMediaInfo = new DetectMediaInfo();
        detectMediaInfo.nullCheck();
        return detectMediaInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DetectMediaInfo m19475clone() {
        DetectMediaInfo detectMediaInfo = new DetectMediaInfo();
        detectMediaInfo.url = this.url;
        detectMediaInfo.index = this.index;
        detectMediaInfo.type = this.type;
        return detectMediaInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetectMediaInfo)) {
            return false;
        }
        DetectMediaInfo detectMediaInfo = (DetectMediaInfo) obj;
        return ValueObject.util_equals(this.url, detectMediaInfo.url) && this.index == detectMediaInfo.index && ValueObject.util_equals(this.type, detectMediaInfo.type);
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
        String str = this.url;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.index) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
