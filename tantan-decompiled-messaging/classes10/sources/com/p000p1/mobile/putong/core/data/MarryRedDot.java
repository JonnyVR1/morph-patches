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
public class MarryRedDot extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marryreddot";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String mark;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<MarryRedDot> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarryRedDot>() { // from class: com.p1.mobile.putong.core.data.MarryRedDot.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MarryRedDot marryRedDot) {
            int iB = CodedOutputByteBufferNano.b(1, marryRedDot.enable);
            String str = marryRedDot.type;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = marryRedDot.mark;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) marryRedDot).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MarryRedDot m14061parse(nb5 nb5Var) throws IOException {
            MarryRedDot marryRedDot = new MarryRedDot();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (marryRedDot.type == null) {
                        marryRedDot.type = "";
                    }
                    if (marryRedDot.mark != null) {
                        break;
                    }
                    marryRedDot.mark = "";
                    break;
                }
                if (iU == 8) {
                    marryRedDot.enable = nb5Var.g();
                } else if (iU == 18) {
                    marryRedDot.type = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (marryRedDot.type == null) {
                            marryRedDot.type = "";
                        }
                        if (marryRedDot.mark != null) {
                            break;
                        }
                        marryRedDot.mark = "";
                        return marryRedDot;
                    }
                    marryRedDot.mark = nb5Var.s();
                }
            }
            return marryRedDot;
        }

        public void serialize(MarryRedDot marryRedDot, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, marryRedDot.enable);
            String str = marryRedDot.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = marryRedDot.mark;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<MarryRedDot> JSON_ADAPTER = new ObjectJsonAdapter<MarryRedDot>() { // from class: com.p1.mobile.putong.core.data.MarryRedDot.2
        public Class getDataClass() {
            return MarryRedDot.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MarryRedDot m14062newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarryRedDot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarryRedDot) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarryRedDot new_() {
        MarryRedDot marryRedDot = new MarryRedDot();
        marryRedDot.nullCheck();
        return marryRedDot;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MarryRedDot m14060clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mark;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.mark == null) {
            this.mark = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
