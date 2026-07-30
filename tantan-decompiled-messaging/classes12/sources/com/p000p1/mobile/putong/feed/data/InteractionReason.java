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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InteractionReason interactionReason) {
            int iB = CodedOutputByteBufferNano.b(1, interactionReason.haveMoreInteraction) + CodedOutputByteBufferNano.b(2, interactionReason.isInteraction);
            String str = interactionReason.icon;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = interactionReason.text;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = interactionReason.type;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) interactionReason).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InteractionReason m19539parse(nb5 nb5Var) throws IOException {
            InteractionReason interactionReason = new InteractionReason();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    interactionReason.haveMoreInteraction = nb5Var.g();
                } else if (iU == 16) {
                    interactionReason.isInteraction = nb5Var.g();
                } else if (iU == 26) {
                    interactionReason.icon = nb5Var.s();
                } else if (iU == 34) {
                    interactionReason.text = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    interactionReason.type = nb5Var.s();
                }
            }
            return interactionReason;
        }

        public void serialize(InteractionReason interactionReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, interactionReason.haveMoreInteraction);
            codedOutputByteBufferNano.A(2, interactionReason.isInteraction);
            String str = interactionReason.icon;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = interactionReason.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = interactionReason.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<InteractionReason> JSON_ADAPTER = new ObjectJsonAdapter<InteractionReason>() { // from class: com.p1.mobile.putong.feed.data.InteractionReason.2
        public Class getDataClass() {
            return InteractionReason.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public InteractionReason mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InteractionReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InteractionReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InteractionReason new_() {
        InteractionReason interactionReason = new InteractionReason();
        interactionReason.nullCheck();
        return interactionReason;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InteractionReason m19538clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
