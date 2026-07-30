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
public class VoiceCallAdditional extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicecalladditional";

    @NonNull
    @ProtobufIndex(index = 2)
    public String acceptedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String rejectedTime;
    public static ProtobufAdapter<VoiceCallAdditional> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceCallAdditional>() { // from class: com.p1.mobile.putong.core.data.VoiceCallAdditional.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceCallAdditional voiceCallAdditional) {
            String str = voiceCallAdditional.rejectedTime;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voiceCallAdditional.acceptedTime;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            voiceCallAdditional.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceCallAdditional parse(nc5 nc5Var) throws IOException {
            VoiceCallAdditional voiceCallAdditional = new VoiceCallAdditional();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceCallAdditional.rejectedTime == null) {
                        voiceCallAdditional.rejectedTime = "";
                    }
                    if (voiceCallAdditional.acceptedTime != null) {
                        break;
                    }
                    voiceCallAdditional.acceptedTime = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceCallAdditional.rejectedTime = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (voiceCallAdditional.rejectedTime == null) {
                            voiceCallAdditional.rejectedTime = "";
                        }
                        if (voiceCallAdditional.acceptedTime != null) {
                            break;
                        }
                        voiceCallAdditional.acceptedTime = "";
                        return voiceCallAdditional;
                    }
                    voiceCallAdditional.acceptedTime = nc5Var.m162495s();
                }
            }
            return voiceCallAdditional;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceCallAdditional voiceCallAdditional, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceCallAdditional.rejectedTime;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voiceCallAdditional.acceptedTime;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<VoiceCallAdditional> JSON_ADAPTER = new ObjectJsonAdapter<VoiceCallAdditional>() { // from class: com.p1.mobile.putong.core.data.VoiceCallAdditional.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceCallAdditional.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceCallAdditional newInstance() {
            return new VoiceCallAdditional();
        }

        public boolean parseField(VoiceCallAdditional voiceCallAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("acceptedTime")) {
                voiceCallAdditional.acceptedTime = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("rejectedTime")) {
                return false;
            }
            voiceCallAdditional.rejectedTime = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceCallAdditional voiceCallAdditional, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("acceptedTime") || str.equals("rejectedTime")) {
                return true;
            }
            return super.parseFieldCheck(voiceCallAdditional, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceCallAdditional voiceCallAdditional, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceCallAdditional.rejectedTime;
            if (str != null) {
                jsonGenerator.writeStringField("rejectedTime", str);
            }
            String str2 = voiceCallAdditional.acceptedTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("acceptedTime", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceCallAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceCallAdditional) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceCallAdditional new_() {
        VoiceCallAdditional voiceCallAdditional = new VoiceCallAdditional();
        voiceCallAdditional.nullCheck();
        return voiceCallAdditional;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceCallAdditional mo225055clone() {
        VoiceCallAdditional voiceCallAdditional = new VoiceCallAdditional();
        voiceCallAdditional.rejectedTime = this.rejectedTime;
        voiceCallAdditional.acceptedTime = this.acceptedTime;
        return voiceCallAdditional;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceCallAdditional)) {
            return false;
        }
        VoiceCallAdditional voiceCallAdditional = (VoiceCallAdditional) obj;
        return ValueObject.util_equals(this.rejectedTime, voiceCallAdditional.rejectedTime) && ValueObject.util_equals(this.acceptedTime, voiceCallAdditional.acceptedTime);
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
        String str = this.rejectedTime;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.acceptedTime;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.rejectedTime == null) {
            this.rejectedTime = "";
        }
        if (this.acceptedTime == null) {
            this.acceptedTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
