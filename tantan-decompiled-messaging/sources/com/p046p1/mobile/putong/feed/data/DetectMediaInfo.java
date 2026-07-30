package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DetectMediaInfo detectMediaInfo) {
            String str = detectMediaInfo.url;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, detectMediaInfo.index);
            String str2 = detectMediaInfo.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            detectMediaInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DetectMediaInfo parse(nb5 nb5Var) throws IOException {
            DetectMediaInfo detectMediaInfo = new DetectMediaInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (detectMediaInfo.url == null) {
                        detectMediaInfo.url = "";
                    }
                    if (detectMediaInfo.type != null) {
                        break;
                    }
                    detectMediaInfo.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    detectMediaInfo.url = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    detectMediaInfo.index = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (detectMediaInfo.url == null) {
                            detectMediaInfo.url = "";
                        }
                        if (detectMediaInfo.type != null) {
                            break;
                        }
                        detectMediaInfo.type = "";
                        return detectMediaInfo;
                    }
                    detectMediaInfo.type = nb5Var.m158750s();
                }
            }
            return detectMediaInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DetectMediaInfo detectMediaInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = detectMediaInfo.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, detectMediaInfo.index);
            String str2 = detectMediaInfo.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<DetectMediaInfo> JSON_ADAPTER = new ObjectJsonAdapter<DetectMediaInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectMediaInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DetectMediaInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DetectMediaInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectMediaInfo detectMediaInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = detectMediaInfo.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, detectMediaInfo.index);
            String str2 = detectMediaInfo.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectMediaInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectMediaInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectMediaInfo new_() {
        DetectMediaInfo detectMediaInfo = new DetectMediaInfo();
        detectMediaInfo.nullCheck();
        return detectMediaInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DetectMediaInfo mo223809clone() {
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
