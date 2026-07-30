package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AudioSignatureTip;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AudioSignatureTip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "audiosignaturetip";

    @ProtobufIndex(index = 1)
    public long time;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<AudioSignatureTip> PROTOBUF_ADAPTER = new MessageNanoAdapter<AudioSignatureTip>() { // from class: com.p1.mobile.putong.data.AudioSignatureTip.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AudioSignatureTip audioSignatureTip) {
            int iJ = CodedOutputByteBufferNano.j(1, audioSignatureTip.time);
            List<String> list = audioSignatureTip.userIds;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) audioSignatureTip).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AudioSignatureTip m17724parse(nb5 nb5Var) throws IOException {
            AudioSignatureTip audioSignatureTip = new AudioSignatureTip();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (audioSignatureTip.userIds != null) {
                        break;
                    }
                    audioSignatureTip.userIds = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    audioSignatureTip.time = nb5Var.k();
                } else {
                    if (iU != 18) {
                        if (audioSignatureTip.userIds != null) {
                            break;
                        }
                        audioSignatureTip.userIds = new ArrayList();
                        return audioSignatureTip;
                    }
                    audioSignatureTip.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return audioSignatureTip;
        }

        public void serialize(AudioSignatureTip audioSignatureTip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, audioSignatureTip.time);
            List<String> list = audioSignatureTip.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AudioSignatureTip> JSON_ADAPTER = new ObjectJsonAdapter<AudioSignatureTip>() { // from class: com.p1.mobile.putong.data.AudioSignatureTip.2
        public Class getDataClass() {
            return AudioSignatureTip.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AudioSignatureTip mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AudioSignatureTip audioSignatureTip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("time", audioSignatureTip.time);
            if (audioSignatureTip.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(audioSignatureTip.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AudioSignatureTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AudioSignatureTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m576a(String str) {
        return str;
    }

    public static AudioSignatureTip new_() {
        AudioSignatureTip audioSignatureTip = new AudioSignatureTip();
        audioSignatureTip.nullCheck();
        return audioSignatureTip;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AudioSignatureTip m17723clone() {
        AudioSignatureTip audioSignatureTip = new AudioSignatureTip();
        audioSignatureTip.time = this.time;
        List<String> list = this.userIds;
        if (list != null) {
            audioSignatureTip.userIds = ValueObject.util_map(list, new w9j() { // from class: l.fd1
                public final Object call(Object obj) {
                    return AudioSignatureTip.m576a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.time;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        List<String> list = this.userIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
