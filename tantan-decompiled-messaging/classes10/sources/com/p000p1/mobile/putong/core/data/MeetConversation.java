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
public class MeetConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "meetconversation";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int hotLevel;

    @ProtobufIndex(index = 1)
    public boolean isHot;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isStop;
    public static ProtobufAdapter<MeetConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MeetConversation>() { // from class: com.p1.mobile.putong.core.data.MeetConversation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MeetConversation meetConversation) {
            int iB = CodedOutputByteBufferNano.b(1, meetConversation.isHot) + CodedOutputByteBufferNano.b(2, meetConversation.isStop) + CodedOutputByteBufferNano.h(3, meetConversation.hotLevel);
            ((MessageNano) meetConversation).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MeetConversation m14105parse(nb5 nb5Var) throws IOException {
            MeetConversation meetConversation = new MeetConversation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    meetConversation.isHot = nb5Var.g();
                } else if (iU == 16) {
                    meetConversation.isStop = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return meetConversation;
                    }
                    meetConversation.hotLevel = nb5Var.j();
                }
            }
        }

        public void serialize(MeetConversation meetConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, meetConversation.isHot);
            codedOutputByteBufferNano.A(2, meetConversation.isStop);
            codedOutputByteBufferNano.G(3, meetConversation.hotLevel);
        }
    };
    public static JsonAdapter<MeetConversation> JSON_ADAPTER = new ObjectJsonAdapter<MeetConversation>() { // from class: com.p1.mobile.putong.core.data.MeetConversation.2
        public Class getDataClass() {
            return MeetConversation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MeetConversation m14106newInstance() {
            return new MeetConversation();
        }

        public boolean parseField(MeetConversation meetConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isStop":
                    meetConversation.isStop = jsonParser.getValueAsBoolean();
                    return true;
                case "hotLevel":
                    meetConversation.hotLevel = jsonParser.getValueAsInt();
                    return true;
                case "isHot":
                    meetConversation.isHot = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MeetConversation meetConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isStop":
                case "hotLevel":
                case "isHot":
                    return true;
                default:
                    return super.parseFieldCheck(meetConversation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MeetConversation meetConversation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHot", meetConversation.isHot);
            jsonGenerator.writeBooleanField("isStop", meetConversation.isStop);
            jsonGenerator.writeNumberField("hotLevel", meetConversation.hotLevel);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MeetConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MeetConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MeetConversation new_() {
        MeetConversation meetConversation = new MeetConversation();
        meetConversation.nullCheck();
        return meetConversation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MeetConversation m14104clone() {
        MeetConversation meetConversation = new MeetConversation();
        meetConversation.isHot = this.isHot;
        meetConversation.isStop = this.isStop;
        meetConversation.hotLevel = this.hotLevel;
        return meetConversation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeetConversation)) {
            return false;
        }
        MeetConversation meetConversation = (MeetConversation) obj;
        return this.isHot == meetConversation.isHot && this.isStop == meetConversation.isStop && this.hotLevel == meetConversation.hotLevel;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.isHot ? 1231 : 1237)) * 41) + (this.isStop ? 1231 : 1237)) * 41) + this.hotLevel;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
