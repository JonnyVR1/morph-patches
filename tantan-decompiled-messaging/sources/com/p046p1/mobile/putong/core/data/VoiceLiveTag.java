package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class VoiceLiveTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivetag";

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<VoiceLiveTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveTag>() { // from class: com.p1.mobile.putong.core.data.VoiceLiveTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveTag voiceLiveTag) {
            String str = voiceLiveTag.text;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            voiceLiveTag.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveTag parse(nb5 nb5Var) throws IOException {
            VoiceLiveTag voiceLiveTag = new VoiceLiveTag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceLiveTag.text != null) {
                        break;
                    }
                    voiceLiveTag.text = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (voiceLiveTag.text != null) {
                        break;
                    }
                    voiceLiveTag.text = "";
                    return voiceLiveTag;
                }
                voiceLiveTag.text = nb5Var.m158750s();
            }
            return voiceLiveTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveTag voiceLiveTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveTag.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<VoiceLiveTag> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveTag>() { // from class: com.p1.mobile.putong.core.data.VoiceLiveTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveTag newInstance() {
            return new VoiceLiveTag();
        }

        public boolean parseField(VoiceLiveTag voiceLiveTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("text")) {
                return false;
            }
            voiceLiveTag.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceLiveTag voiceLiveTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(voiceLiveTag, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveTag voiceLiveTag, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveTag.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveTag new_() {
        VoiceLiveTag voiceLiveTag = new VoiceLiveTag();
        voiceLiveTag.nullCheck();
        return voiceLiveTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveTag mo223809clone() {
        VoiceLiveTag voiceLiveTag = new VoiceLiveTag();
        voiceLiveTag.text = this.text;
        return voiceLiveTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceLiveTag) {
            return ValueObject.util_equals(this.text, ((VoiceLiveTag) obj).text);
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
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
