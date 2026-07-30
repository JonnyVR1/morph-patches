package com.p046p1.mobile.putong.core.data;

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
public class MeetConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "meetconversation";

    @ProtobufIndex(index = 3)
    public int hotLevel;

    @ProtobufIndex(index = 1)
    public boolean isHot;

    @ProtobufIndex(index = 2)
    public boolean isStop;
    public static ProtobufAdapter<MeetConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<MeetConversation>() { // from class: com.p1.mobile.putong.core.data.MeetConversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MeetConversation meetConversation) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, meetConversation.isHot) + CodedOutputByteBufferNano.m17220b(2, meetConversation.isStop) + CodedOutputByteBufferNano.m17226h(3, meetConversation.hotLevel);
            meetConversation.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MeetConversation parse(nb5 nb5Var) throws IOException {
            MeetConversation meetConversation = new MeetConversation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    meetConversation.isHot = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    meetConversation.isStop = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        return meetConversation;
                    }
                    meetConversation.hotLevel = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MeetConversation meetConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, meetConversation.isHot);
            codedOutputByteBufferNano.m17244A(2, meetConversation.isStop);
            codedOutputByteBufferNano.m17250G(3, meetConversation.hotLevel);
        }
    };
    public static JsonAdapter<MeetConversation> JSON_ADAPTER = new ObjectJsonAdapter<MeetConversation>() { // from class: com.p1.mobile.putong.core.data.MeetConversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MeetConversation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MeetConversation newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MeetConversation meetConversation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHot", meetConversation.isHot);
            jsonGenerator.writeBooleanField("isStop", meetConversation.isStop);
            jsonGenerator.writeNumberField("hotLevel", meetConversation.hotLevel);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MeetConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MeetConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MeetConversation new_() {
        MeetConversation meetConversation = new MeetConversation();
        meetConversation.nullCheck();
        return meetConversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MeetConversation mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.isHot ? 1231 : 1237)) * 41) + (this.isStop ? 1231 : 1237)) * 41) + this.hotLevel;
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
