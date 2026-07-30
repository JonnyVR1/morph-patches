package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
public class DetectTextInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detecttextinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<DetectTextInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<DetectTextInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectTextInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DetectTextInfo detectTextInfo) {
            String str = detectTextInfo.key;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = detectTextInfo.value;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = detectTextInfo.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            detectTextInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DetectTextInfo parse(nc5 nc5Var) throws IOException {
            DetectTextInfo detectTextInfo = new DetectTextInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (detectTextInfo.key == null) {
                        detectTextInfo.key = "";
                    }
                    if (detectTextInfo.value == null) {
                        detectTextInfo.value = "";
                    }
                    if (detectTextInfo.type != null) {
                        break;
                    }
                    detectTextInfo.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    detectTextInfo.key = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    detectTextInfo.value = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (detectTextInfo.key == null) {
                            detectTextInfo.key = "";
                        }
                        if (detectTextInfo.value == null) {
                            detectTextInfo.value = "";
                        }
                        if (detectTextInfo.type != null) {
                            break;
                        }
                        detectTextInfo.type = "";
                        return detectTextInfo;
                    }
                    detectTextInfo.type = nc5Var.m162495s();
                }
            }
            return detectTextInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DetectTextInfo detectTextInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = detectTextInfo.key;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = detectTextInfo.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = detectTextInfo.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<DetectTextInfo> JSON_ADAPTER = new ObjectJsonAdapter<DetectTextInfo>() { // from class: com.p1.mobile.putong.feed.data.DetectTextInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DetectTextInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DetectTextInfo newInstance() {
            return new DetectTextInfo();
        }

        public boolean parseField(DetectTextInfo detectTextInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "key":
                    detectTextInfo.key = jsonParser.getValueAsString();
                    return true;
                case "type":
                    detectTextInfo.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    detectTextInfo.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DetectTextInfo detectTextInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "key":
                case "type":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(detectTextInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectTextInfo detectTextInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = detectTextInfo.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = detectTextInfo.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = detectTextInfo.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectTextInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectTextInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectTextInfo new_() {
        DetectTextInfo detectTextInfo = new DetectTextInfo();
        detectTextInfo.nullCheck();
        return detectTextInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DetectTextInfo mo225055clone() {
        DetectTextInfo detectTextInfo = new DetectTextInfo();
        detectTextInfo.key = this.key;
        detectTextInfo.value = this.value;
        detectTextInfo.type = this.type;
        return detectTextInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetectTextInfo)) {
            return false;
        }
        DetectTextInfo detectTextInfo = (DetectTextInfo) obj;
        return ValueObject.util_equals(this.key, detectTextInfo.key) && ValueObject.util_equals(this.value, detectTextInfo.value) && ValueObject.util_equals(this.type, detectTextInfo.type);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.value == null) {
            this.value = "";
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
