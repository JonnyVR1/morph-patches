package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class VoiceCallInvitationStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicecallinvitationstatus";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<VoiceCallInvitationStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceCallInvitationStatus>() { // from class: com.p1.mobile.putong.core.data.VoiceCallInvitationStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceCallInvitationStatus voiceCallInvitationStatus) {
            String str = voiceCallInvitationStatus.status;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            voiceCallInvitationStatus.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceCallInvitationStatus parse(nb5 nb5Var) throws IOException {
            VoiceCallInvitationStatus voiceCallInvitationStatus = new VoiceCallInvitationStatus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceCallInvitationStatus.status != null) {
                        break;
                    }
                    voiceCallInvitationStatus.status = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (voiceCallInvitationStatus.status != null) {
                        break;
                    }
                    voiceCallInvitationStatus.status = "";
                    return voiceCallInvitationStatus;
                }
                voiceCallInvitationStatus.status = nb5Var.m158750s();
            }
            return voiceCallInvitationStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceCallInvitationStatus voiceCallInvitationStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceCallInvitationStatus.status;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<VoiceCallInvitationStatus> JSON_ADAPTER = new ObjectJsonAdapter<VoiceCallInvitationStatus>() { // from class: com.p1.mobile.putong.core.data.VoiceCallInvitationStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceCallInvitationStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceCallInvitationStatus newInstance() {
            return new VoiceCallInvitationStatus();
        }

        public boolean parseField(VoiceCallInvitationStatus voiceCallInvitationStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            voiceCallInvitationStatus.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceCallInvitationStatus voiceCallInvitationStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(voiceCallInvitationStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceCallInvitationStatus voiceCallInvitationStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceCallInvitationStatus.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceCallInvitationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceCallInvitationStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceCallInvitationStatus new_() {
        VoiceCallInvitationStatus voiceCallInvitationStatus = new VoiceCallInvitationStatus();
        voiceCallInvitationStatus.nullCheck();
        return voiceCallInvitationStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceCallInvitationStatus mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.status;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
