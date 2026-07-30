package com.p051p1.mobile.putong.core.data;

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
public class MsgIcebreakConfigV2 extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "msgicebreakconfigv2";

    @ProtobufIndex(index = 3)
    public int associateShowCountLimit;

    @ProtobufIndex(index = 4)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int iceBreakLastMessageShowCountLimit;

    @ProtobufIndex(index = 1)
    public int iceBreakLastMessageTimeLimit;
    public static ProtobufAdapter<MsgIcebreakConfigV2> PROTOBUF_ADAPTER = new MessageNanoAdapter<MsgIcebreakConfigV2>() { // from class: com.p1.mobile.putong.core.data.MsgIcebreakConfigV2.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MsgIcebreakConfigV2 msgIcebreakConfigV2) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, msgIcebreakConfigV2.iceBreakLastMessageTimeLimit) + CodedOutputByteBufferNano.m17281h(2, msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit) + CodedOutputByteBufferNano.m17281h(3, msgIcebreakConfigV2.associateShowCountLimit) + CodedOutputByteBufferNano.m17275b(4, msgIcebreakConfigV2.enable);
            msgIcebreakConfigV2.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MsgIcebreakConfigV2 parse(nc5 nc5Var) throws IOException {
            MsgIcebreakConfigV2 msgIcebreakConfigV2 = new MsgIcebreakConfigV2();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    msgIcebreakConfigV2.iceBreakLastMessageTimeLimit = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    msgIcebreakConfigV2.associateShowCountLimit = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        return msgIcebreakConfigV2;
                    }
                    msgIcebreakConfigV2.enable = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MsgIcebreakConfigV2 msgIcebreakConfigV2, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, msgIcebreakConfigV2.iceBreakLastMessageTimeLimit);
            codedOutputByteBufferNano.m17305G(2, msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit);
            codedOutputByteBufferNano.m17305G(3, msgIcebreakConfigV2.associateShowCountLimit);
            codedOutputByteBufferNano.m17299A(4, msgIcebreakConfigV2.enable);
        }
    };
    public static JsonAdapter<MsgIcebreakConfigV2> JSON_ADAPTER = new ObjectJsonAdapter<MsgIcebreakConfigV2>() { // from class: com.p1.mobile.putong.core.data.MsgIcebreakConfigV2.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MsgIcebreakConfigV2.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MsgIcebreakConfigV2 newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MsgIcebreakConfigV2 msgIcebreakConfigV2, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("iceBreakLastMessageTimeLimit", msgIcebreakConfigV2.iceBreakLastMessageTimeLimit);
            jsonGenerator.writeNumberField("iceBreakLastMessageShowCountLimit", msgIcebreakConfigV2.iceBreakLastMessageShowCountLimit);
            jsonGenerator.writeNumberField("associateShowCountLimit", msgIcebreakConfigV2.associateShowCountLimit);
            jsonGenerator.writeBooleanField("enable", msgIcebreakConfigV2.enable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MsgIcebreakConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MsgIcebreakConfigV2) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MsgIcebreakConfigV2 new_() {
        MsgIcebreakConfigV2 msgIcebreakConfigV2 = new MsgIcebreakConfigV2();
        msgIcebreakConfigV2.nullCheck();
        return msgIcebreakConfigV2;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MsgIcebreakConfigV2 mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.iceBreakLastMessageTimeLimit) * 41) + this.iceBreakLastMessageShowCountLimit) * 41) + this.associateShowCountLimit) * 41) + (this.enable ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
