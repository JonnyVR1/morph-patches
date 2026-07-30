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
public class VoiceLiveTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivetag";

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<VoiceLiveTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveTag>() { // from class: com.p1.mobile.putong.core.data.VoiceLiveTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceLiveTag voiceLiveTag) {
            String str = voiceLiveTag.text;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) voiceLiveTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceLiveTag m16289parse(nb5 nb5Var) throws IOException {
            VoiceLiveTag voiceLiveTag = new VoiceLiveTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceLiveTag.text != null) {
                        break;
                    }
                    voiceLiveTag.text = "";
                    break;
                }
                if (iU != 10) {
                    if (voiceLiveTag.text != null) {
                        break;
                    }
                    voiceLiveTag.text = "";
                    return voiceLiveTag;
                }
                voiceLiveTag.text = nb5Var.s();
            }
            return voiceLiveTag;
        }

        public void serialize(VoiceLiveTag voiceLiveTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveTag.text;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<VoiceLiveTag> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveTag>() { // from class: com.p1.mobile.putong.core.data.VoiceLiveTag.2
        public Class getDataClass() {
            return VoiceLiveTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VoiceLiveTag m16290newInstance() {
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

        public void serializeFields(VoiceLiveTag voiceLiveTag, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveTag.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveTag new_() {
        VoiceLiveTag voiceLiveTag = new VoiceLiveTag();
        voiceLiveTag.nullCheck();
        return voiceLiveTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceLiveTag m16288clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
