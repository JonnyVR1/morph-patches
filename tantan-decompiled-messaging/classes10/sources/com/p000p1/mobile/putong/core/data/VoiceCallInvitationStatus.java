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
public class VoiceCallInvitationStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicecallinvitationstatus";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<VoiceCallInvitationStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceCallInvitationStatus>() { // from class: com.p1.mobile.putong.core.data.VoiceCallInvitationStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceCallInvitationStatus voiceCallInvitationStatus) {
            String str = voiceCallInvitationStatus.status;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) voiceCallInvitationStatus).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceCallInvitationStatus m16275parse(nb5 nb5Var) throws IOException {
            VoiceCallInvitationStatus voiceCallInvitationStatus = new VoiceCallInvitationStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceCallInvitationStatus.status != null) {
                        break;
                    }
                    voiceCallInvitationStatus.status = "";
                    break;
                }
                if (iU != 10) {
                    if (voiceCallInvitationStatus.status != null) {
                        break;
                    }
                    voiceCallInvitationStatus.status = "";
                    return voiceCallInvitationStatus;
                }
                voiceCallInvitationStatus.status = nb5Var.s();
            }
            return voiceCallInvitationStatus;
        }

        public void serialize(VoiceCallInvitationStatus voiceCallInvitationStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceCallInvitationStatus.status;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<VoiceCallInvitationStatus> JSON_ADAPTER = new ObjectJsonAdapter<VoiceCallInvitationStatus>() { // from class: com.p1.mobile.putong.core.data.VoiceCallInvitationStatus.2
        public Class getDataClass() {
            return VoiceCallInvitationStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VoiceCallInvitationStatus m16276newInstance() {
            return new VoiceCallInvitationStatus();
        }

        public boolean parseField(VoiceCallInvitationStatus voiceCallInvitationStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            voiceCallInvitationStatus.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceCallInvitationStatus voiceCallInvitationStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(voiceCallInvitationStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(VoiceCallInvitationStatus voiceCallInvitationStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceCallInvitationStatus.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceCallInvitationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceCallInvitationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceCallInvitationStatus new_() {
        VoiceCallInvitationStatus voiceCallInvitationStatus = new VoiceCallInvitationStatus();
        voiceCallInvitationStatus.nullCheck();
        return voiceCallInvitationStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceCallInvitationStatus m16274clone() {
        VoiceCallInvitationStatus voiceCallInvitationStatus = new VoiceCallInvitationStatus();
        voiceCallInvitationStatus.status = this.status;
        return voiceCallInvitationStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceCallInvitationStatus) {
            return ValueObject.util_equals(this.status, ((VoiceCallInvitationStatus) obj).status);
        }
        return false;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.status;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
