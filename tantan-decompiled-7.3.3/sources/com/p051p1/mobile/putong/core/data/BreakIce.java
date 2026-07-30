package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class BreakIce extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "breakice";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public String kind;

    @NonNull
    @ProtobufIndex(index = 4)
    public String response_uuid;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tipId;
    public static ProtobufAdapter<BreakIce> PROTOBUF_ADAPTER = new MessageNanoAdapter<BreakIce>() { // from class: com.p1.mobile.putong.core.data.BreakIce.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BreakIce breakIce) {
            String str = breakIce.content;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = breakIce.tipId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = breakIce.kind;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = breakIce.response_uuid;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            breakIce.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BreakIce parse(nc5 nc5Var) throws IOException {
            BreakIce breakIce = new BreakIce();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (breakIce.content == null) {
                        breakIce.content = "";
                    }
                    if (breakIce.tipId == null) {
                        breakIce.tipId = "";
                    }
                    if (breakIce.kind == null) {
                        breakIce.kind = "";
                    }
                    if (breakIce.response_uuid != null) {
                        break;
                    }
                    breakIce.response_uuid = "";
                    break;
                }
                if (iM162497u == 10) {
                    breakIce.content = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    breakIce.tipId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    breakIce.kind = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (breakIce.content == null) {
                            breakIce.content = "";
                        }
                        if (breakIce.tipId == null) {
                            breakIce.tipId = "";
                        }
                        if (breakIce.kind == null) {
                            breakIce.kind = "";
                        }
                        if (breakIce.response_uuid != null) {
                            break;
                        }
                        breakIce.response_uuid = "";
                        return breakIce;
                    }
                    breakIce.response_uuid = nc5Var.m162495s();
                }
            }
            return breakIce;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BreakIce breakIce, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = breakIce.content;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = breakIce.tipId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = breakIce.kind;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = breakIce.response_uuid;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<BreakIce> JSON_ADAPTER = new ObjectJsonAdapter<BreakIce>() { // from class: com.p1.mobile.putong.core.data.BreakIce.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BreakIce.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BreakIce newInstance() {
            return new BreakIce();
        }

        public boolean parseField(BreakIce breakIce, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "kind":
                    breakIce.kind = jsonParser.getValueAsString();
                    return true;
                case "tipId":
                    breakIce.tipId = jsonParser.getValueAsString();
                    return true;
                case "content":
                    breakIce.content = jsonParser.getValueAsString();
                    return true;
                case "response_uuid":
                    breakIce.response_uuid = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BreakIce breakIce, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "kind":
                case "tipId":
                case "content":
                case "response_uuid":
                    return true;
                default:
                    return super.parseFieldCheck(breakIce, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BreakIce breakIce, JsonGenerator jsonGenerator) throws IOException {
            String str = breakIce.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = breakIce.tipId;
            if (str2 != null) {
                jsonGenerator.writeStringField("tipId", str2);
            }
            String str3 = breakIce.kind;
            if (str3 != null) {
                jsonGenerator.writeStringField("kind", str3);
            }
            String str4 = breakIce.response_uuid;
            if (str4 != null) {
                jsonGenerator.writeStringField("response_uuid", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BreakIce new_() {
        BreakIce breakIce = new BreakIce();
        breakIce.nullCheck();
        return breakIce;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BreakIce mo225055clone() {
        BreakIce breakIce = new BreakIce();
        breakIce.content = this.content;
        breakIce.tipId = this.tipId;
        breakIce.kind = this.kind;
        breakIce.response_uuid = this.response_uuid;
        return breakIce;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BreakIce)) {
            return false;
        }
        BreakIce breakIce = (BreakIce) obj;
        return ValueObject.util_equals(this.content, breakIce.content) && ValueObject.util_equals(this.tipId, breakIce.tipId) && ValueObject.util_equals(this.kind, breakIce.kind) && ValueObject.util_equals(this.response_uuid, breakIce.response_uuid);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tipId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.kind;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.response_uuid;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.tipId == null) {
            this.tipId = "";
        }
        if (this.kind == null) {
            this.kind = "";
        }
        if (this.response_uuid == null) {
            this.response_uuid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
