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
public class VoiceAnchorVerifyResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceanchorverifyresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<VoiceAnchorVerifyResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceAnchorVerifyResult>() { // from class: com.p1.mobile.putong.core.data.VoiceAnchorVerifyResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceAnchorVerifyResult voiceAnchorVerifyResult) {
            String str = voiceAnchorVerifyResult.status;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) voiceAnchorVerifyResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceAnchorVerifyResult m16263parse(nb5 nb5Var) throws IOException {
            VoiceAnchorVerifyResult voiceAnchorVerifyResult = new VoiceAnchorVerifyResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceAnchorVerifyResult.status != null) {
                        break;
                    }
                    voiceAnchorVerifyResult.status = "";
                    break;
                }
                if (iU != 10) {
                    if (voiceAnchorVerifyResult.status != null) {
                        break;
                    }
                    voiceAnchorVerifyResult.status = "";
                    return voiceAnchorVerifyResult;
                }
                voiceAnchorVerifyResult.status = nb5Var.s();
            }
            return voiceAnchorVerifyResult;
        }

        public void serialize(VoiceAnchorVerifyResult voiceAnchorVerifyResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceAnchorVerifyResult.status;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<VoiceAnchorVerifyResult> JSON_ADAPTER = new ObjectJsonAdapter<VoiceAnchorVerifyResult>() { // from class: com.p1.mobile.putong.core.data.VoiceAnchorVerifyResult.2
        public Class getDataClass() {
            return VoiceAnchorVerifyResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VoiceAnchorVerifyResult m16264newInstance() {
            return new VoiceAnchorVerifyResult();
        }

        public boolean parseField(VoiceAnchorVerifyResult voiceAnchorVerifyResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            voiceAnchorVerifyResult.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceAnchorVerifyResult voiceAnchorVerifyResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(voiceAnchorVerifyResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(VoiceAnchorVerifyResult voiceAnchorVerifyResult, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceAnchorVerifyResult.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceAnchorVerifyResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceAnchorVerifyResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceAnchorVerifyResult new_() {
        VoiceAnchorVerifyResult voiceAnchorVerifyResult = new VoiceAnchorVerifyResult();
        voiceAnchorVerifyResult.nullCheck();
        return voiceAnchorVerifyResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceAnchorVerifyResult m16262clone() {
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
