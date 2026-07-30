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
public class SeeMatchGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seematchgroup";

    @ProtobufIndex(index = 4)
    public boolean matchPageEnabled;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean seeListEnabled;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int seeNum;

    @ProtobufIndex(index = 1)
    public int signUpDays;
    public static ProtobufAdapter<SeeMatchGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeMatchGroup>() { // from class: com.p1.mobile.putong.core.data.SeeMatchGroup.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeMatchGroup seeMatchGroup) {
            int iH = CodedOutputByteBufferNano.h(1, seeMatchGroup.signUpDays) + CodedOutputByteBufferNano.h(2, seeMatchGroup.seeNum) + CodedOutputByteBufferNano.b(3, seeMatchGroup.seeListEnabled) + CodedOutputByteBufferNano.b(4, seeMatchGroup.matchPageEnabled);
            ((MessageNano) seeMatchGroup).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeMatchGroup m15519parse(nb5 nb5Var) throws IOException {
            SeeMatchGroup seeMatchGroup = new SeeMatchGroup();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    seeMatchGroup.signUpDays = nb5Var.j();
                } else if (iU == 16) {
                    seeMatchGroup.seeNum = nb5Var.j();
                } else if (iU == 24) {
                    seeMatchGroup.seeListEnabled = nb5Var.g();
                } else {
                    if (iU != 32) {
                        return seeMatchGroup;
                    }
                    seeMatchGroup.matchPageEnabled = nb5Var.g();
                }
            }
        }

        public void serialize(SeeMatchGroup seeMatchGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, seeMatchGroup.signUpDays);
            codedOutputByteBufferNano.G(2, seeMatchGroup.seeNum);
            codedOutputByteBufferNano.A(3, seeMatchGroup.seeListEnabled);
            codedOutputByteBufferNano.A(4, seeMatchGroup.matchPageEnabled);
        }
    };
    public static JsonAdapter<SeeMatchGroup> JSON_ADAPTER = new ObjectJsonAdapter<SeeMatchGroup>() { // from class: com.p1.mobile.putong.core.data.SeeMatchGroup.2
        public Class getDataClass() {
            return SeeMatchGroup.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeMatchGroup m15520newInstance() {
            return new SeeMatchGroup();
        }

        public boolean parseField(SeeMatchGroup seeMatchGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "matchPageEnabled":
                    seeMatchGroup.matchPageEnabled = jsonParser.getValueAsBoolean();
                    return true;
                case "signUpDays":
                    seeMatchGroup.signUpDays = jsonParser.getValueAsInt();
                    return true;
                case "seeListEnabled":
                    seeMatchGroup.seeListEnabled = jsonParser.getValueAsBoolean();
                    return true;
                case "seeNum":
                    seeMatchGroup.seeNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeMatchGroup seeMatchGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "matchPageEnabled":
                case "signUpDays":
                case "seeListEnabled":
                case "seeNum":
                    return true;
                default:
                    return super.parseFieldCheck(seeMatchGroup, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SeeMatchGroup seeMatchGroup, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("signUpDays", seeMatchGroup.signUpDays);
            jsonGenerator.writeNumberField("seeNum", seeMatchGroup.seeNum);
            jsonGenerator.writeBooleanField("seeListEnabled", seeMatchGroup.seeListEnabled);
            jsonGenerator.writeBooleanField("matchPageEnabled", seeMatchGroup.matchPageEnabled);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeMatchGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeMatchGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeMatchGroup new_() {
        SeeMatchGroup seeMatchGroup = new SeeMatchGroup();
        seeMatchGroup.nullCheck();
        return seeMatchGroup;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeMatchGroup m15518clone() {
        SeeMatchGroup seeMatchGroup = new SeeMatchGroup();
        seeMatchGroup.signUpDays = this.signUpDays;
        seeMatchGroup.seeNum = this.seeNum;
        seeMatchGroup.seeListEnabled = this.seeListEnabled;
        seeMatchGroup.matchPageEnabled = this.matchPageEnabled;
        return seeMatchGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeMatchGroup)) {
            return false;
        }
        SeeMatchGroup seeMatchGroup = (SeeMatchGroup) obj;
        return this.signUpDays == seeMatchGroup.signUpDays && this.seeNum == seeMatchGroup.seeNum && this.seeListEnabled == seeMatchGroup.seeListEnabled && this.matchPageEnabled == seeMatchGroup.matchPageEnabled;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.signUpDays) * 41) + this.seeNum) * 41) + (this.seeListEnabled ? 1231 : 1237)) * 41) + (this.matchPageEnabled ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
