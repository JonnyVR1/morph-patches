package com.p000p1.mobile.putong.core.data;

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
public class MsgIcebreakConfigV2 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "msgicebreakconfigv2";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int associateShowCountLimit;

    @ProtobufIndex(index = 4)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int iceBreakLastMessageShowCountLimit;

    @ProtobufIndex(index = 1)
    public int iceBreakLastMessageTimeLimit;
    public static ProtobufAdapter<MsgIcebreakConfigV2> PROTOBUF_ADAPTER = new MessageNanoAdapter<MsgIcebreakConfigV2>() { // from class: com.p1.mobile.putong.core.data.MsgIcebreakConfigV2.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MsgIcebreakConfigV2 msgIcebreakConfigV2) {
            int iH = CodedOutputByteBufferNano.h(1, msgIcebreakConfigV2.iceBreakLastMessageTimeLimit) + CodedOutputByteBufferNano.h(2, msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit) + CodedOutputByteBufferNano.h(3, msgIcebreakConfigV2.associateShowCountLimit) + CodedOutputByteBufferNano.b(4, msgIcebreakConfigV2.enable);
            ((MessageNano) msgIcebreakConfigV2).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MsgIcebreakConfigV2 m14397parse(nb5 nb5Var) throws IOException {
            MsgIcebreakConfigV2 msgIcebreakConfigV2 = new MsgIcebreakConfigV2();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    msgIcebreakConfigV2.iceBreakLastMessageTimeLimit = nb5Var.j();
                } else if (iU == 16) {
                    msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit = nb5Var.j();
                } else if (iU == 24) {
                    msgIcebreakConfigV2.associateShowCountLimit = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return msgIcebreakConfigV2;
                    }
                    msgIcebreakConfigV2.enable = nb5Var.g();
                }
            }
        }

        public void serialize(MsgIcebreakConfigV2 msgIcebreakConfigV2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, msgIcebreakConfigV2.iceBreakLastMessageTimeLimit);
            codedOutputByteBufferNano.G(2, msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit);
            codedOutputByteBufferNano.G(3, msgIcebreakConfigV2.associateShowCountLimit);
            codedOutputByteBufferNano.A(4, msgIcebreakConfigV2.enable);
        }
    };
    public static JsonAdapter<MsgIcebreakConfigV2> JSON_ADAPTER = new ObjectJsonAdapter<MsgIcebreakConfigV2>() { // from class: com.p1.mobile.putong.core.data.MsgIcebreakConfigV2.2
        public Class getDataClass() {
            return MsgIcebreakConfigV2.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MsgIcebreakConfigV2 m14398newInstance() {
            return new MsgIcebreakConfigV2();
        }

        public boolean parseField(MsgIcebreakConfigV2 msgIcebreakConfigV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iceBreakLastMessageTimeLimit":
                    msgIcebreakConfigV2.iceBreakLastMessageTimeLimit = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    msgIcebreakConfigV2.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "associateShowCountLimit":
                    msgIcebreakConfigV2.associateShowCountLimit = jsonParser.getValueAsInt();
                    return true;
                case "iceBreakLastMessageShowCountLimit":
                    msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MsgIcebreakConfigV2 msgIcebreakConfigV2, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iceBreakLastMessageTimeLimit":
                case "enable":
                case "associateShowCountLimit":
                case "iceBreakLastMessageShowCountLimit":
                    return true;
                default:
                    return super.parseFieldCheck(msgIcebreakConfigV2, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MsgIcebreakConfigV2 msgIcebreakConfigV2, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("iceBreakLastMessageTimeLimit", msgIcebreakConfigV2.iceBreakLastMessageTimeLimit);
            jsonGenerator.writeNumberField("iceBreakLastMessageShowCountLimit", msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit);
            jsonGenerator.writeNumberField("associateShowCountLimit", msgIcebreakConfigV2.associateShowCountLimit);
            jsonGenerator.writeBooleanField("enable", msgIcebreakConfigV2.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MsgIcebreakConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MsgIcebreakConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MsgIcebreakConfigV2 new_() {
        MsgIcebreakConfigV2 msgIcebreakConfigV2 = new MsgIcebreakConfigV2();
        msgIcebreakConfigV2.nullCheck();
        return msgIcebreakConfigV2;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MsgIcebreakConfigV2 m14396clone() {
        MsgIcebreakConfigV2 msgIcebreakConfigV2 = new MsgIcebreakConfigV2();
        msgIcebreakConfigV2.iceBreakLastMessageTimeLimit = this.iceBreakLastMessageTimeLimit;
        msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit = this.iceBreakLastMessageShowCountLimit;
        msgIcebreakConfigV2.associateShowCountLimit = this.associateShowCountLimit;
        msgIcebreakConfigV2.enable = this.enable;
        return msgIcebreakConfigV2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsgIcebreakConfigV2)) {
            return false;
        }
        MsgIcebreakConfigV2 msgIcebreakConfigV2 = (MsgIcebreakConfigV2) obj;
        return this.iceBreakLastMessageTimeLimit == msgIcebreakConfigV2.iceBreakLastMessageTimeLimit && this.iceBreakLastMessageShowCountLimit == msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit && this.associateShowCountLimit == msgIcebreakConfigV2.associateShowCountLimit && this.enable == msgIcebreakConfigV2.enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.iceBreakLastMessageTimeLimit) * 41) + this.iceBreakLastMessageShowCountLimit) * 41) + this.associateShowCountLimit) * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
