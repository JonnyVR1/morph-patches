package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VoiceLiveGameCurrentChoice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivegamecurrentchoice";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f298id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<VoiceLiveGameCurrentChoice> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveGameCurrentChoice>() { // from class: com.p1.mobile.putong.data.VoiceLiveGameCurrentChoice.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice) {
            String str = voiceLiveGameCurrentChoice.f298id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voiceLiveGameCurrentChoice.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) voiceLiveGameCurrentChoice).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceLiveGameCurrentChoice m19353parse(nb5 nb5Var) throws IOException {
            VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = new VoiceLiveGameCurrentChoice();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceLiveGameCurrentChoice.f298id == null) {
                        voiceLiveGameCurrentChoice.f298id = "";
                    }
                    if (voiceLiveGameCurrentChoice.type != null) {
                        break;
                    }
                    voiceLiveGameCurrentChoice.type = "";
                    break;
                }
                if (iU == 10) {
                    voiceLiveGameCurrentChoice.f298id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (voiceLiveGameCurrentChoice.f298id == null) {
                            voiceLiveGameCurrentChoice.f298id = "";
                        }
                        if (voiceLiveGameCurrentChoice.type != null) {
                            break;
                        }
                        voiceLiveGameCurrentChoice.type = "";
                        return voiceLiveGameCurrentChoice;
                    }
                    voiceLiveGameCurrentChoice.type = nb5Var.s();
                }
            }
            return voiceLiveGameCurrentChoice;
        }

        public void serialize(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveGameCurrentChoice.f298id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voiceLiveGameCurrentChoice.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<VoiceLiveGameCurrentChoice> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveGameCurrentChoice>() { // from class: com.p1.mobile.putong.data.VoiceLiveGameCurrentChoice.2
        public Class getDataClass() {
            return VoiceLiveGameCurrentChoice.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceLiveGameCurrentChoice mo17830newInstance() {
            return new VoiceLiveGameCurrentChoice();
        }

        public boolean parseField(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                voiceLiveGameCurrentChoice.f298id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            voiceLiveGameCurrentChoice.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(voiceLiveGameCurrentChoice, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveGameCurrentChoice.f298id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceLiveGameCurrentChoice.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveGameCurrentChoice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveGameCurrentChoice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveGameCurrentChoice new_() {
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = new VoiceLiveGameCurrentChoice();
        voiceLiveGameCurrentChoice.nullCheck();
        return voiceLiveGameCurrentChoice;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceLiveGameCurrentChoice m19352clone() {
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = new VoiceLiveGameCurrentChoice();
        voiceLiveGameCurrentChoice.f298id = this.f298id;
        voiceLiveGameCurrentChoice.type = this.type;
        return voiceLiveGameCurrentChoice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveGameCurrentChoice)) {
            return false;
        }
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = (VoiceLiveGameCurrentChoice) obj;
        return ValueObject.util_equals(this.f298id, voiceLiveGameCurrentChoice.f298id) && ValueObject.util_equals(this.type, voiceLiveGameCurrentChoice.type);
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
        String str = this.f298id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f298id == null) {
            this.f298id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
