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
public class VoiceAnchorVerifyResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceanchorverifyresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<VoiceAnchorVerifyResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceAnchorVerifyResult>() { // from class: com.p1.mobile.putong.core.data.VoiceAnchorVerifyResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceAnchorVerifyResult voiceAnchorVerifyResult) {
            String str = voiceAnchorVerifyResult.status;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            voiceAnchorVerifyResult.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceAnchorVerifyResult parse(nb5 nb5Var) throws IOException {
            VoiceAnchorVerifyResult voiceAnchorVerifyResult = new VoiceAnchorVerifyResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceAnchorVerifyResult.status != null) {
                        break;
                    }
                    voiceAnchorVerifyResult.status = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (voiceAnchorVerifyResult.status != null) {
                        break;
                    }
                    voiceAnchorVerifyResult.status = "";
                    return voiceAnchorVerifyResult;
                }
                voiceAnchorVerifyResult.status = nb5Var.m158750s();
            }
            return voiceAnchorVerifyResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceAnchorVerifyResult voiceAnchorVerifyResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceAnchorVerifyResult.status;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<VoiceAnchorVerifyResult> JSON_ADAPTER = new ObjectJsonAdapter<VoiceAnchorVerifyResult>() { // from class: com.p1.mobile.putong.core.data.VoiceAnchorVerifyResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceAnchorVerifyResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceAnchorVerifyResult newInstance() {
            return new VoiceAnchorVerifyResult();
        }

        public boolean parseField(VoiceAnchorVerifyResult voiceAnchorVerifyResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            voiceAnchorVerifyResult.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceAnchorVerifyResult voiceAnchorVerifyResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(voiceAnchorVerifyResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceAnchorVerifyResult voiceAnchorVerifyResult, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceAnchorVerifyResult.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceAnchorVerifyResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceAnchorVerifyResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceAnchorVerifyResult new_() {
        VoiceAnchorVerifyResult voiceAnchorVerifyResult = new VoiceAnchorVerifyResult();
        voiceAnchorVerifyResult.nullCheck();
        return voiceAnchorVerifyResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceAnchorVerifyResult mo223809clone() {
        VoiceAnchorVerifyResult voiceAnchorVerifyResult = new VoiceAnchorVerifyResult();
        voiceAnchorVerifyResult.status = this.status;
        return voiceAnchorVerifyResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceAnchorVerifyResult) {
            return ValueObject.util_equals(this.status, ((VoiceAnchorVerifyResult) obj).status);
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
