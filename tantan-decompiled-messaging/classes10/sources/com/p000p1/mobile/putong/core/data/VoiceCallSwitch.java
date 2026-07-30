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
public class VoiceCallSwitch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicecallswitch";

    @ProtobufIndex(index = 1)
    public boolean voiceCall;
    public static ProtobufAdapter<VoiceCallSwitch> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceCallSwitch>() { // from class: com.p1.mobile.putong.core.data.VoiceCallSwitch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceCallSwitch voiceCallSwitch) {
            int iB = CodedOutputByteBufferNano.b(1, voiceCallSwitch.voiceCall);
            ((MessageNano) voiceCallSwitch).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceCallSwitch m16281parse(nb5 nb5Var) throws IOException {
            VoiceCallSwitch voiceCallSwitch = new VoiceCallSwitch();
            while (nb5Var.u() == 8) {
                voiceCallSwitch.voiceCall = nb5Var.g();
            }
            return voiceCallSwitch;
        }

        public void serialize(VoiceCallSwitch voiceCallSwitch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, voiceCallSwitch.voiceCall);
        }
    };
    public static JsonAdapter<VoiceCallSwitch> JSON_ADAPTER = new ObjectJsonAdapter<VoiceCallSwitch>() { // from class: com.p1.mobile.putong.core.data.VoiceCallSwitch.2
        public Class getDataClass() {
            return VoiceCallSwitch.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VoiceCallSwitch m16282newInstance() {
            return new VoiceCallSwitch();
        }

        public boolean parseField(VoiceCallSwitch voiceCallSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("voiceCall")) {
                return false;
            }
            voiceCallSwitch.voiceCall = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(VoiceCallSwitch voiceCallSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("voiceCall")) {
                return true;
            }
            return super.parseFieldCheck(voiceCallSwitch, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(VoiceCallSwitch voiceCallSwitch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("voiceCall", voiceCallSwitch.voiceCall);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceCallSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceCallSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceCallSwitch new_() {
        VoiceCallSwitch voiceCallSwitch = new VoiceCallSwitch();
        voiceCallSwitch.nullCheck();
        return voiceCallSwitch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceCallSwitch m16280clone() {
        VoiceCallSwitch voiceCallSwitch = new VoiceCallSwitch();
        voiceCallSwitch.voiceCall = this.voiceCall;
        return voiceCallSwitch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof VoiceCallSwitch) && this.voiceCall == ((VoiceCallSwitch) obj).voiceCall;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.voiceCall ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
