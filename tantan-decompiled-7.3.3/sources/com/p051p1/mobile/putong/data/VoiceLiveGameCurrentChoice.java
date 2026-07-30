package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VoiceLiveGameCurrentChoice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivegamecurrentchoice";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39685id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<VoiceLiveGameCurrentChoice> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveGameCurrentChoice>() { // from class: com.p1.mobile.putong.data.VoiceLiveGameCurrentChoice.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice) {
            String str = voiceLiveGameCurrentChoice.f39685id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voiceLiveGameCurrentChoice.type;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            voiceLiveGameCurrentChoice.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveGameCurrentChoice parse(nc5 nc5Var) throws IOException {
            VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = new VoiceLiveGameCurrentChoice();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceLiveGameCurrentChoice.f39685id == null) {
                        voiceLiveGameCurrentChoice.f39685id = "";
                    }
                    if (voiceLiveGameCurrentChoice.type != null) {
                        break;
                    }
                    voiceLiveGameCurrentChoice.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceLiveGameCurrentChoice.f39685id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (voiceLiveGameCurrentChoice.f39685id == null) {
                            voiceLiveGameCurrentChoice.f39685id = "";
                        }
                        if (voiceLiveGameCurrentChoice.type != null) {
                            break;
                        }
                        voiceLiveGameCurrentChoice.type = "";
                        return voiceLiveGameCurrentChoice;
                    }
                    voiceLiveGameCurrentChoice.type = nc5Var.m162495s();
                }
            }
            return voiceLiveGameCurrentChoice;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveGameCurrentChoice.f39685id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voiceLiveGameCurrentChoice.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<VoiceLiveGameCurrentChoice> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveGameCurrentChoice>() { // from class: com.p1.mobile.putong.data.VoiceLiveGameCurrentChoice.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveGameCurrentChoice.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveGameCurrentChoice newInstance() {
            return new VoiceLiveGameCurrentChoice();
        }

        public boolean parseField(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                voiceLiveGameCurrentChoice.f39685id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveGameCurrentChoice.f39685id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceLiveGameCurrentChoice.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveGameCurrentChoice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveGameCurrentChoice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveGameCurrentChoice new_() {
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = new VoiceLiveGameCurrentChoice();
        voiceLiveGameCurrentChoice.nullCheck();
        return voiceLiveGameCurrentChoice;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveGameCurrentChoice mo225055clone() {
        VoiceLiveGameCurrentChoice voiceLiveGameCurrentChoice = new VoiceLiveGameCurrentChoice();
        voiceLiveGameCurrentChoice.f39685id = this.f39685id;
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
        return ValueObject.util_equals(this.f39685id, voiceLiveGameCurrentChoice.f39685id) && ValueObject.util_equals(this.type, voiceLiveGameCurrentChoice.type);
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
        String str = this.f39685id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39685id == null) {
            this.f39685id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
