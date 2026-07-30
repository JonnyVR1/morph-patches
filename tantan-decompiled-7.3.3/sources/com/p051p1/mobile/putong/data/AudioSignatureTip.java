package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.AudioSignatureTip;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class AudioSignatureTip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "audiosignaturetip";

    @ProtobufIndex(index = 1)
    public long time;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<AudioSignatureTip> PROTOBUF_ADAPTER = new MessageNanoAdapter<AudioSignatureTip>() { // from class: com.p1.mobile.putong.data.AudioSignatureTip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AudioSignatureTip audioSignatureTip) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, audioSignatureTip.time);
            List<String> list = audioSignatureTip.userIds;
            if (list != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            audioSignatureTip.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AudioSignatureTip parse(nc5 nc5Var) throws IOException {
            AudioSignatureTip audioSignatureTip = new AudioSignatureTip();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (audioSignatureTip.userIds != null) {
                        break;
                    }
                    audioSignatureTip.userIds = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    audioSignatureTip.time = nc5Var.m162487k();
                } else {
                    if (iM162497u != 18) {
                        if (audioSignatureTip.userIds != null) {
                            break;
                        }
                        audioSignatureTip.userIds = new ArrayList();
                        return audioSignatureTip;
                    }
                    audioSignatureTip.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return audioSignatureTip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AudioSignatureTip audioSignatureTip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, audioSignatureTip.time);
            List<String> list = audioSignatureTip.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AudioSignatureTip> JSON_ADAPTER = new ObjectJsonAdapter<AudioSignatureTip>() { // from class: com.p1.mobile.putong.data.AudioSignatureTip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AudioSignatureTip.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AudioSignatureTip newInstance() {
            return new AudioSignatureTip();
        }

        public boolean parseField(AudioSignatureTip audioSignatureTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userIds")) {
                audioSignatureTip.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("time")) {
                return false;
            }
            audioSignatureTip.time = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(AudioSignatureTip audioSignatureTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userIds") || str.equals("time")) {
                return true;
            }
            return super.parseFieldCheck(audioSignatureTip, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AudioSignatureTip audioSignatureTip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("time", audioSignatureTip.time);
            if (audioSignatureTip.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(audioSignatureTip.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioSignatureTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioSignatureTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60858a(String str) {
        return str;
    }

    public static AudioSignatureTip new_() {
        AudioSignatureTip audioSignatureTip = new AudioSignatureTip();
        audioSignatureTip.nullCheck();
        return audioSignatureTip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AudioSignatureTip mo225055clone() {
        AudioSignatureTip audioSignatureTip = new AudioSignatureTip();
        audioSignatureTip.time = this.time;
        List<String> list = this.userIds;
        if (list != null) {
            audioSignatureTip.userIds = ValueObject.util_map(list, new qcj() { // from class: l.md1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AudioSignatureTip.m60858a((String) obj);
                }
            });
        }
        return audioSignatureTip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSignatureTip)) {
            return false;
        }
        AudioSignatureTip audioSignatureTip = (AudioSignatureTip) obj;
        return this.time == audioSignatureTip.time && ValueObject.util_equals(this.userIds, audioSignatureTip.userIds);
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
        long j = this.time;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        List<String> list = this.userIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
