package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VirtualVoiceLive;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class VirtualVoiceLive extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "virtualvoicelive";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> voiceImgId;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> voiceImgUrl;
    public static ProtobufAdapter<VirtualVoiceLive> PROTOBUF_ADAPTER = new MessageNanoAdapter<VirtualVoiceLive>() { // from class: com.p1.mobile.putong.data.VirtualVoiceLive.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VirtualVoiceLive virtualVoiceLive) {
            List<String> list = virtualVoiceLive.voiceImgId;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = virtualVoiceLive.voiceImgUrl;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            virtualVoiceLive.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceLive parse(nb5 nb5Var) throws IOException {
            VirtualVoiceLive virtualVoiceLive = new VirtualVoiceLive();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (virtualVoiceLive.voiceImgId == null) {
                        virtualVoiceLive.voiceImgId = new ArrayList();
                    }
                    if (virtualVoiceLive.voiceImgUrl != null) {
                        break;
                    }
                    virtualVoiceLive.voiceImgUrl = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    virtualVoiceLive.voiceImgId = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (virtualVoiceLive.voiceImgId == null) {
                            virtualVoiceLive.voiceImgId = new ArrayList();
                        }
                        if (virtualVoiceLive.voiceImgUrl != null) {
                            break;
                        }
                        virtualVoiceLive.voiceImgUrl = new ArrayList();
                        return virtualVoiceLive;
                    }
                    virtualVoiceLive.voiceImgUrl = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return virtualVoiceLive;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceLive virtualVoiceLive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = virtualVoiceLive.voiceImgId;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = virtualVoiceLive.voiceImgUrl;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VirtualVoiceLive> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceLive>() { // from class: com.p1.mobile.putong.data.VirtualVoiceLive.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceLive.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VirtualVoiceLive newInstance() {
            return new VirtualVoiceLive();
        }

        public boolean parseField(VirtualVoiceLive virtualVoiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("voiceImgId")) {
                virtualVoiceLive.voiceImgId = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("voiceImgUrl")) {
                return false;
            }
            virtualVoiceLive.voiceImgUrl = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VirtualVoiceLive virtualVoiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("voiceImgId") || str.equals("voiceImgUrl")) {
                return true;
            }
            return super.parseFieldCheck(virtualVoiceLive, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VirtualVoiceLive virtualVoiceLive, JsonGenerator jsonGenerator) throws IOException {
            if (virtualVoiceLive.voiceImgId != null) {
                jsonGenerator.writeFieldName("voiceImgId");
                JsonAdapter.serializeArray(virtualVoiceLive.voiceImgId, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (virtualVoiceLive.voiceImgUrl != null) {
                jsonGenerator.writeFieldName("voiceImgUrl");
                JsonAdapter.serializeArray(virtualVoiceLive.voiceImgUrl, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60157a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60158b(String str) {
        return str;
    }

    public static VirtualVoiceLive new_() {
        VirtualVoiceLive virtualVoiceLive = new VirtualVoiceLive();
        virtualVoiceLive.nullCheck();
        return virtualVoiceLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VirtualVoiceLive mo223809clone() {
        VirtualVoiceLive virtualVoiceLive = new VirtualVoiceLive();
        List<String> list = this.voiceImgId;
        if (list != null) {
            virtualVoiceLive.voiceImgId = ValueObject.util_map(list, new w9j() { // from class: l.izl0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VirtualVoiceLive.m60158b((String) obj);
                }
            });
        }
        List<String> list2 = this.voiceImgUrl;
        if (list2 != null) {
            virtualVoiceLive.voiceImgUrl = ValueObject.util_map(list2, new w9j() { // from class: l.jzl0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VirtualVoiceLive.m60157a((String) obj);
                }
            });
        }
        return virtualVoiceLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VirtualVoiceLive)) {
            return false;
        }
        VirtualVoiceLive virtualVoiceLive = (VirtualVoiceLive) obj;
        return ValueObject.util_equals(this.voiceImgId, virtualVoiceLive.voiceImgId) && ValueObject.util_equals(this.voiceImgUrl, virtualVoiceLive.voiceImgUrl);
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
        List<String> list = this.voiceImgId;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.voiceImgUrl;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.voiceImgId == null) {
            this.voiceImgId = new ArrayList();
        }
        if (this.voiceImgUrl == null) {
            this.voiceImgUrl = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
