package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.VoiceAvatarFrame;
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
public class VoiceAvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceavatarframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> f296id;
    public static ProtobufAdapter<VoiceAvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceAvatarFrame>() { // from class: com.p1.mobile.putong.data.VoiceAvatarFrame.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceAvatarFrame voiceAvatarFrame) {
            List<String> list = voiceAvatarFrame.f296id;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = voiceAvatarFrame.expiredTime;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) voiceAvatarFrame).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceAvatarFrame m19341parse(nb5 nb5Var) throws IOException {
            VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceAvatarFrame.f296id == null) {
                        voiceAvatarFrame.f296id = new ArrayList();
                    }
                    if (voiceAvatarFrame.expiredTime != null) {
                        break;
                    }
                    voiceAvatarFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    voiceAvatarFrame.f296id = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (voiceAvatarFrame.f296id == null) {
                            voiceAvatarFrame.f296id = new ArrayList();
                        }
                        if (voiceAvatarFrame.expiredTime != null) {
                            break;
                        }
                        voiceAvatarFrame.expiredTime = new ArrayList();
                        return voiceAvatarFrame;
                    }
                    voiceAvatarFrame.expiredTime = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return voiceAvatarFrame;
        }

        public void serialize(VoiceAvatarFrame voiceAvatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = voiceAvatarFrame.f296id;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceAvatarFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VoiceAvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<VoiceAvatarFrame>() { // from class: com.p1.mobile.putong.data.VoiceAvatarFrame.2
        public Class getDataClass() {
            return VoiceAvatarFrame.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceAvatarFrame mo17830newInstance() {
            return new VoiceAvatarFrame();
        }

        public boolean parseField(VoiceAvatarFrame voiceAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTime")) {
                voiceAvatarFrame.expiredTime = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            voiceAvatarFrame.f296id = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return false;
        }

        public boolean parseFieldCheck(VoiceAvatarFrame voiceAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expiredTime")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(voiceAvatarFrame, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceAvatarFrame voiceAvatarFrame, JsonGenerator jsonGenerator) throws IOException {
            if (voiceAvatarFrame.f296id != null) {
                jsonGenerator.writeFieldName("id");
                JsonAdapter.serializeArray(voiceAvatarFrame.f296id, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceAvatarFrame.expiredTime != null) {
                jsonGenerator.writeFieldName("expiredTime");
                JsonAdapter.serializeArray(voiceAvatarFrame.expiredTime, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1080a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1081b(String str) {
        return str;
    }

    public static VoiceAvatarFrame new_() {
        VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
        voiceAvatarFrame.nullCheck();
        return voiceAvatarFrame;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceAvatarFrame m19340clone() {
        VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
        List<String> list = this.f296id;
        if (list != null) {
            voiceAvatarFrame.f296id = ValueObject.util_map(list, new w9j() { // from class: l.eim0
                public final Object call(Object obj) {
                    return VoiceAvatarFrame.m1080a((String) obj);
                }
            });
        }
        List<String> list2 = this.expiredTime;
        if (list2 != null) {
            voiceAvatarFrame.expiredTime = ValueObject.util_map(list2, new w9j() { // from class: l.fim0
                public final Object call(Object obj) {
                    return VoiceAvatarFrame.m1081b((String) obj);
                }
            });
        }
        return voiceAvatarFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceAvatarFrame)) {
            return false;
        }
        VoiceAvatarFrame voiceAvatarFrame = (VoiceAvatarFrame) obj;
        return ValueObject.util_equals(this.f296id, voiceAvatarFrame.f296id) && ValueObject.util_equals(this.expiredTime, voiceAvatarFrame.expiredTime);
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
        List<String> list = this.f296id;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.expiredTime;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f296id == null) {
            this.f296id = new ArrayList();
        }
        if (this.expiredTime == null) {
            this.expiredTime = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
