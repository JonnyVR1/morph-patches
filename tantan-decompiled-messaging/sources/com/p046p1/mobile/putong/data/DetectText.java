package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class DetectText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "detecttext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<DetectText> PROTOBUF_ADAPTER = new MessageNanoAdapter<DetectText>() { // from class: com.p1.mobile.putong.data.DetectText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DetectText detectText) {
            String str = detectText.key;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = detectText.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = detectText.type;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            detectText.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DetectText parse(nb5 nb5Var) throws IOException {
            DetectText detectText = new DetectText();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (detectText.key == null) {
                        detectText.key = "";
                    }
                    if (detectText.value == null) {
                        detectText.value = "";
                    }
                    if (detectText.type != null) {
                        break;
                    }
                    detectText.type = "";
                    break;
                }
                if (iM158752u == 10) {
                    detectText.key = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    detectText.value = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (detectText.key == null) {
                            detectText.key = "";
                        }
                        if (detectText.value == null) {
                            detectText.value = "";
                        }
                        if (detectText.type != null) {
                            break;
                        }
                        detectText.type = "";
                        return detectText;
                    }
                    detectText.type = nb5Var.m158750s();
                }
            }
            return detectText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DetectText detectText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = detectText.key;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = detectText.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = detectText.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<DetectText> JSON_ADAPTER = new ObjectJsonAdapter<DetectText>() { // from class: com.p1.mobile.putong.data.DetectText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DetectText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DetectText newInstance() {
            return new DetectText();
        }

        public boolean parseField(DetectText detectText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "key":
                    detectText.key = jsonParser.getValueAsString();
                    return true;
                case "type":
                    detectText.type = jsonParser.getValueAsString();
                    return true;
                case "value":
                    detectText.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DetectText detectText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "key":
                case "type":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(detectText, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DetectText detectText, JsonGenerator jsonGenerator) throws IOException {
            String str = detectText.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = detectText.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = detectText.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DetectText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DetectText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DetectText new_() {
        DetectText detectText = new DetectText();
        detectText.nullCheck();
        return detectText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DetectText mo223809clone() {
        DetectText detectText = new DetectText();
        detectText.key = this.key;
        detectText.value = this.value;
        detectText.type = this.type;
        return detectText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetectText)) {
            return false;
        }
        DetectText detectText = (DetectText) obj;
        return ValueObject.util_equals(this.key, detectText.key) && ValueObject.util_equals(this.value, detectText.value) && ValueObject.util_equals(this.type, detectText.type);
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
