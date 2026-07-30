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
public class VoiceLiveExtension extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceliveextension";

    @NonNull
    @ProtobufIndex(index = 2)
    public String specialShowBackgroundUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String specialShowName;
    public static ProtobufAdapter<VoiceLiveExtension> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveExtension>() { // from class: com.p1.mobile.putong.data.VoiceLiveExtension.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveExtension voiceLiveExtension) {
            String str = voiceLiveExtension.specialShowName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voiceLiveExtension.specialShowBackgroundUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            voiceLiveExtension.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveExtension parse(nc5 nc5Var) throws IOException {
            VoiceLiveExtension voiceLiveExtension = new VoiceLiveExtension();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceLiveExtension.specialShowName == null) {
                        voiceLiveExtension.specialShowName = "";
                    }
                    if (voiceLiveExtension.specialShowBackgroundUrl != null) {
                        break;
                    }
                    voiceLiveExtension.specialShowBackgroundUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceLiveExtension.specialShowName = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (voiceLiveExtension.specialShowName == null) {
                            voiceLiveExtension.specialShowName = "";
                        }
                        if (voiceLiveExtension.specialShowBackgroundUrl != null) {
                            break;
                        }
                        voiceLiveExtension.specialShowBackgroundUrl = "";
                        return voiceLiveExtension;
                    }
                    voiceLiveExtension.specialShowBackgroundUrl = nc5Var.m162495s();
                }
            }
            return voiceLiveExtension;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveExtension voiceLiveExtension, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveExtension.specialShowName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voiceLiveExtension.specialShowBackgroundUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<VoiceLiveExtension> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveExtension>() { // from class: com.p1.mobile.putong.data.VoiceLiveExtension.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveExtension.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveExtension newInstance() {
            return new VoiceLiveExtension();
        }

        public boolean parseField(VoiceLiveExtension voiceLiveExtension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("specialShowBackgroundUrl")) {
                voiceLiveExtension.specialShowBackgroundUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("specialShowName")) {
                return false;
            }
            voiceLiveExtension.specialShowName = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VoiceLiveExtension voiceLiveExtension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("specialShowBackgroundUrl") || str.equals("specialShowName")) {
                return true;
            }
            return super.parseFieldCheck(voiceLiveExtension, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveExtension voiceLiveExtension, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveExtension.specialShowName;
            if (str != null) {
                jsonGenerator.writeStringField("specialShowName", str);
            }
            String str2 = voiceLiveExtension.specialShowBackgroundUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("specialShowBackgroundUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveExtension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveExtension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveExtension new_() {
        VoiceLiveExtension voiceLiveExtension = new VoiceLiveExtension();
        voiceLiveExtension.nullCheck();
        return voiceLiveExtension;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveExtension mo225055clone() {
        VoiceLiveExtension voiceLiveExtension = new VoiceLiveExtension();
        voiceLiveExtension.specialShowName = this.specialShowName;
        voiceLiveExtension.specialShowBackgroundUrl = this.specialShowBackgroundUrl;
        return voiceLiveExtension;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveExtension)) {
            return false;
        }
        VoiceLiveExtension voiceLiveExtension = (VoiceLiveExtension) obj;
        return ValueObject.util_equals(this.specialShowName, voiceLiveExtension.specialShowName) && ValueObject.util_equals(this.specialShowBackgroundUrl, voiceLiveExtension.specialShowBackgroundUrl);
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
        String str = this.specialShowName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.specialShowBackgroundUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.specialShowName == null) {
            this.specialShowName = "";
        }
        if (this.specialShowBackgroundUrl == null) {
            this.specialShowBackgroundUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
