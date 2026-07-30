package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class MarryRedDot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marryreddot";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 3)
    public String mark;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MarryRedDot> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarryRedDot>() { // from class: com.p1.mobile.putong.core.data.MarryRedDot.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MarryRedDot marryRedDot) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, marryRedDot.enable);
            String str = marryRedDot.type;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = marryRedDot.mark;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            marryRedDot.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MarryRedDot parse(nb5 nb5Var) throws IOException {
            MarryRedDot marryRedDot = new MarryRedDot();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (marryRedDot.type == null) {
                        marryRedDot.type = "";
                    }
                    if (marryRedDot.mark != null) {
                        break;
                    }
                    marryRedDot.mark = "";
                    break;
                }
                if (iM158752u == 8) {
                    marryRedDot.enable = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    marryRedDot.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (marryRedDot.type == null) {
                            marryRedDot.type = "";
                        }
                        if (marryRedDot.mark != null) {
                            break;
                        }
                        marryRedDot.mark = "";
                        return marryRedDot;
                    }
                    marryRedDot.mark = nb5Var.m158750s();
                }
            }
            return marryRedDot;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MarryRedDot marryRedDot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, marryRedDot.enable);
            String str = marryRedDot.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = marryRedDot.mark;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<MarryRedDot> JSON_ADAPTER = new ObjectJsonAdapter<MarryRedDot>() { // from class: com.p1.mobile.putong.core.data.MarryRedDot.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MarryRedDot.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MarryRedDot newInstance() {
            return new MarryRedDot();
        }

        public boolean parseField(MarryRedDot marryRedDot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    marryRedDot.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "mark":
                    marryRedDot.mark = jsonParser.getValueAsString();
                    return true;
                case "type":
                    marryRedDot.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MarryRedDot marryRedDot, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "mark":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(marryRedDot, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MarryRedDot marryRedDot, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", marryRedDot.enable);
            String str = marryRedDot.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = marryRedDot.mark;
            if (str2 != null) {
                jsonGenerator.writeStringField("mark", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarryRedDot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarryRedDot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarryRedDot new_() {
        MarryRedDot marryRedDot = new MarryRedDot();
        marryRedDot.nullCheck();
        return marryRedDot;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MarryRedDot mo223809clone() {
        MarryRedDot marryRedDot = new MarryRedDot();
        marryRedDot.enable = this.enable;
        marryRedDot.type = this.type;
        marryRedDot.mark = this.mark;
        return marryRedDot;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarryRedDot)) {
            return false;
        }
        MarryRedDot marryRedDot = (MarryRedDot) obj;
        return this.enable == marryRedDot.enable && ValueObject.util_equals(this.type, marryRedDot.type) && ValueObject.util_equals(this.mark, marryRedDot.mark);
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
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mark;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.mark == null) {
            this.mark = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
