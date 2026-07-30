package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.NavigationIntent;
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
public class VoiceCallSwitch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicecallswitch";

    @ProtobufIndex(index = 1)
    public boolean voiceCall;
    public static ProtobufAdapter<VoiceCallSwitch> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceCallSwitch>() { // from class: com.p1.mobile.putong.core.data.VoiceCallSwitch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceCallSwitch voiceCallSwitch) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, voiceCallSwitch.voiceCall);
            voiceCallSwitch.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceCallSwitch parse(nc5 nc5Var) throws IOException {
            VoiceCallSwitch voiceCallSwitch = new VoiceCallSwitch();
            while (nc5Var.m162497u() == 8) {
                voiceCallSwitch.voiceCall = nc5Var.m162483g();
            }
            return voiceCallSwitch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceCallSwitch voiceCallSwitch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, voiceCallSwitch.voiceCall);
        }
    };
    public static JsonAdapter<VoiceCallSwitch> JSON_ADAPTER = new ObjectJsonAdapter<VoiceCallSwitch>() { // from class: com.p1.mobile.putong.core.data.VoiceCallSwitch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceCallSwitch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceCallSwitch newInstance() {
            return new VoiceCallSwitch();
        }

        public boolean parseField(VoiceCallSwitch voiceCallSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NavigationIntent.voiceCall)) {
                return false;
            }
            voiceCallSwitch.voiceCall = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(VoiceCallSwitch voiceCallSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NavigationIntent.voiceCall)) {
                return true;
            }
            return super.parseFieldCheck(voiceCallSwitch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceCallSwitch voiceCallSwitch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(NavigationIntent.voiceCall, voiceCallSwitch.voiceCall);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceCallSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceCallSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceCallSwitch new_() {
        VoiceCallSwitch voiceCallSwitch = new VoiceCallSwitch();
        voiceCallSwitch.nullCheck();
        return voiceCallSwitch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceCallSwitch mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.voiceCall ? 1231 : 1237);
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
