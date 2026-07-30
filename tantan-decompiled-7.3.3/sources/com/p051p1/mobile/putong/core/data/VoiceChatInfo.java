package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class VoiceChatInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicechatinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String conversationID;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherID;
    public static ProtobufAdapter<VoiceChatInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceChatInfo>() { // from class: com.p1.mobile.putong.core.data.VoiceChatInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceChatInfo voiceChatInfo) {
            String str = voiceChatInfo.conversationID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voiceChatInfo.otherID;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            voiceChatInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceChatInfo parse(nc5 nc5Var) throws IOException {
            VoiceChatInfo voiceChatInfo = new VoiceChatInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceChatInfo.conversationID == null) {
                        voiceChatInfo.conversationID = "";
                    }
                    if (voiceChatInfo.otherID != null) {
                        break;
                    }
                    voiceChatInfo.otherID = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceChatInfo.conversationID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (voiceChatInfo.conversationID == null) {
                            voiceChatInfo.conversationID = "";
                        }
                        if (voiceChatInfo.otherID != null) {
                            break;
                        }
                        voiceChatInfo.otherID = "";
                        return voiceChatInfo;
                    }
                    voiceChatInfo.otherID = nc5Var.m162495s();
                }
            }
            return voiceChatInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceChatInfo voiceChatInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceChatInfo.conversationID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voiceChatInfo.otherID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<VoiceChatInfo> JSON_ADAPTER = new ObjectJsonAdapter<VoiceChatInfo>() { // from class: com.p1.mobile.putong.core.data.VoiceChatInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceChatInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceChatInfo newInstance() {
            return new VoiceChatInfo();
        }

        public boolean parseField(VoiceChatInfo voiceChatInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("conversationID")) {
                voiceChatInfo.conversationID = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("otherID")) {
                return false;
            }
            voiceChatInfo.otherID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceChatInfo voiceChatInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("conversationID") || str.equals("otherID")) {
                return true;
            }
            return super.parseFieldCheck(voiceChatInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceChatInfo voiceChatInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceChatInfo.conversationID;
            if (str != null) {
                jsonGenerator.writeStringField("conversationID", str);
            }
            String str2 = voiceChatInfo.otherID;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherID", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceChatInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceChatInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceChatInfo new_() {
        VoiceChatInfo voiceChatInfo = new VoiceChatInfo();
        voiceChatInfo.nullCheck();
        return voiceChatInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceChatInfo mo225055clone() {
        VoiceChatInfo voiceChatInfo = new VoiceChatInfo();
        voiceChatInfo.conversationID = this.conversationID;
        voiceChatInfo.otherID = this.otherID;
        return voiceChatInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceChatInfo)) {
            return false;
        }
        VoiceChatInfo voiceChatInfo = (VoiceChatInfo) obj;
        return ValueObject.util_equals(this.conversationID, voiceChatInfo.conversationID) && ValueObject.util_equals(this.otherID, voiceChatInfo.otherID);
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
        String str = this.conversationID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherID;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.conversationID == null) {
            this.conversationID = "";
        }
        if (this.otherID == null) {
            this.otherID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
