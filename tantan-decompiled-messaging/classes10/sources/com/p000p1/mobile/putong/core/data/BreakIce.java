package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BreakIce extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "breakice";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String kind;

    @NonNull
    @ProtobufIndex(index = 4)
    public String response_uuid;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tipId;
    public static ProtobufAdapter<BreakIce> PROTOBUF_ADAPTER = new MessageNanoAdapter<BreakIce>() { // from class: com.p1.mobile.putong.core.data.BreakIce.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BreakIce breakIce) {
            String str = breakIce.content;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = breakIce.tipId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = breakIce.kind;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = breakIce.response_uuid;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) breakIce).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BreakIce m11815parse(nb5 nb5Var) throws IOException {
            BreakIce breakIce = new BreakIce();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    breakIce.content = nb5Var.s();
                } else if (iU == 18) {
                    breakIce.tipId = nb5Var.s();
                } else if (iU == 26) {
                    breakIce.kind = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    breakIce.response_uuid = nb5Var.s();
                }
            }
            return breakIce;
        }

        public void serialize(BreakIce breakIce, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = breakIce.content;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = breakIce.tipId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = breakIce.kind;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = breakIce.response_uuid;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<BreakIce> JSON_ADAPTER = new ObjectJsonAdapter<BreakIce>() { // from class: com.p1.mobile.putong.core.data.BreakIce.2
        public Class getDataClass() {
            return BreakIce.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BreakIce m11816newInstance() {
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

        public void serializeFields(BreakIce breakIce, JsonGenerator jsonGenerator) throws IOException {
            String str = breakIce.content;
            if (str != null) {
                jsonGenerator.writeStringField(Content.TYPE, str);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BreakIce new_() {
        BreakIce breakIce = new BreakIce();
        breakIce.nullCheck();
        return breakIce;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BreakIce m11814clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
