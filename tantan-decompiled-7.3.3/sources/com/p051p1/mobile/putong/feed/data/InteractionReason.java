package com.p051p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class InteractionReason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "interactionreason";

    @ProtobufIndex(index = 1)
    public boolean haveMoreInteraction;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @ProtobufIndex(index = 2)
    public boolean isInteraction;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<InteractionReason> PROTOBUF_ADAPTER = new MessageNanoAdapter<InteractionReason>() { // from class: com.p1.mobile.putong.feed.data.InteractionReason.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InteractionReason interactionReason) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, interactionReason.haveMoreInteraction) + CodedOutputByteBufferNano.m17275b(2, interactionReason.isInteraction);
            String str = interactionReason.icon;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = interactionReason.text;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = interactionReason.type;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            interactionReason.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InteractionReason parse(nc5 nc5Var) throws IOException {
            InteractionReason interactionReason = new InteractionReason();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (interactionReason.icon == null) {
                        interactionReason.icon = "";
                    }
                    if (interactionReason.text == null) {
                        interactionReason.text = "";
                    }
                    if (interactionReason.type != null) {
                        break;
                    }
                    interactionReason.type = "";
                    break;
                }
                if (iM162497u == 8) {
                    interactionReason.haveMoreInteraction = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    interactionReason.isInteraction = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    interactionReason.icon = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    interactionReason.text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (interactionReason.icon == null) {
                            interactionReason.icon = "";
                        }
                        if (interactionReason.text == null) {
                            interactionReason.text = "";
                        }
                        if (interactionReason.type != null) {
                            break;
                        }
                        interactionReason.type = "";
                        return interactionReason;
                    }
                    interactionReason.type = nc5Var.m162495s();
                }
            }
            return interactionReason;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InteractionReason interactionReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, interactionReason.haveMoreInteraction);
            codedOutputByteBufferNano.m17299A(2, interactionReason.isInteraction);
            String str = interactionReason.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = interactionReason.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = interactionReason.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<InteractionReason> JSON_ADAPTER = new ObjectJsonAdapter<InteractionReason>() { // from class: com.p1.mobile.putong.feed.data.InteractionReason.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InteractionReason.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InteractionReason newInstance() {
            return new InteractionReason();
        }

        public boolean parseField(InteractionReason interactionReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "icon":
                    interactionReason.icon = jsonParser.getValueAsString();
                    return true;
                case "text":
                    interactionReason.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    interactionReason.type = jsonParser.getValueAsString();
                    return true;
                case "isInteraction":
                    interactionReason.isInteraction = jsonParser.getValueAsBoolean();
                    return true;
                case "haveMoreInteraction":
                    interactionReason.haveMoreInteraction = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InteractionReason interactionReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "icon":
                case "text":
                case "type":
                case "isInteraction":
                case "haveMoreInteraction":
                    return true;
                default:
                    return super.parseFieldCheck(interactionReason, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InteractionReason interactionReason, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("haveMoreInteraction", interactionReason.haveMoreInteraction);
            jsonGenerator.writeBooleanField("isInteraction", interactionReason.isInteraction);
            String str = interactionReason.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = interactionReason.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = interactionReason.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InteractionReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InteractionReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InteractionReason new_() {
        InteractionReason interactionReason = new InteractionReason();
        interactionReason.nullCheck();
        return interactionReason;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InteractionReason mo225055clone() {
        InteractionReason interactionReason = new InteractionReason();
        interactionReason.haveMoreInteraction = this.haveMoreInteraction;
        interactionReason.isInteraction = this.isInteraction;
        interactionReason.icon = this.icon;
        interactionReason.text = this.text;
        interactionReason.type = this.type;
        return interactionReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InteractionReason)) {
            return false;
        }
        InteractionReason interactionReason = (InteractionReason) obj;
        return this.haveMoreInteraction == interactionReason.haveMoreInteraction && this.isInteraction == interactionReason.isInteraction && ValueObject.util_equals(this.icon, interactionReason.icon) && ValueObject.util_equals(this.text, interactionReason.text) && ValueObject.util_equals(this.type, interactionReason.type);
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
        int i2 = ((((i * 41) + (this.haveMoreInteraction ? 1231 : 1237)) * 41) + (this.isInteraction ? 1231 : 1237)) * 41;
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.text == null) {
            this.text = "";
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
