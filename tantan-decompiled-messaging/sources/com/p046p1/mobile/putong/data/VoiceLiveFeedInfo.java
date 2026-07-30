package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VoiceLiveFeedInfo;
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
public class VoiceLiveFeedInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivefeedinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> audienceIds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> tags;
    public static ProtobufAdapter<VoiceLiveFeedInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveFeedInfo>() { // from class: com.p1.mobile.putong.data.VoiceLiveFeedInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveFeedInfo voiceLiveFeedInfo) {
            String str = voiceLiveFeedInfo.liveId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = voiceLiveFeedInfo.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceLiveFeedInfo.audienceIds;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            voiceLiveFeedInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveFeedInfo parse(nb5 nb5Var) throws IOException {
            VoiceLiveFeedInfo voiceLiveFeedInfo = new VoiceLiveFeedInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceLiveFeedInfo.liveId == null) {
                        voiceLiveFeedInfo.liveId = "";
                    }
                    if (voiceLiveFeedInfo.tags == null) {
                        voiceLiveFeedInfo.tags = new ArrayList();
                    }
                    if (voiceLiveFeedInfo.audienceIds != null) {
                        break;
                    }
                    voiceLiveFeedInfo.audienceIds = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    voiceLiveFeedInfo.liveId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    voiceLiveFeedInfo.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (voiceLiveFeedInfo.liveId == null) {
                            voiceLiveFeedInfo.liveId = "";
                        }
                        if (voiceLiveFeedInfo.tags == null) {
                            voiceLiveFeedInfo.tags = new ArrayList();
                        }
                        if (voiceLiveFeedInfo.audienceIds != null) {
                            break;
                        }
                        voiceLiveFeedInfo.audienceIds = new ArrayList();
                        return voiceLiveFeedInfo;
                    }
                    voiceLiveFeedInfo.audienceIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return voiceLiveFeedInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveFeedInfo voiceLiveFeedInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveFeedInfo.liveId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = voiceLiveFeedInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceLiveFeedInfo.audienceIds;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VoiceLiveFeedInfo> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveFeedInfo>() { // from class: com.p1.mobile.putong.data.VoiceLiveFeedInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveFeedInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveFeedInfo newInstance() {
            return new VoiceLiveFeedInfo();
        }

        public boolean parseField(VoiceLiveFeedInfo voiceLiveFeedInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    voiceLiveFeedInfo.liveId = jsonParser.getValueAsString();
                    return true;
                case "tags":
                    voiceLiveFeedInfo.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "audienceIds":
                    voiceLiveFeedInfo.audienceIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceLiveFeedInfo voiceLiveFeedInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveId":
                case "tags":
                case "audienceIds":
                    return true;
                default:
                    return super.parseFieldCheck(voiceLiveFeedInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveFeedInfo voiceLiveFeedInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveFeedInfo.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            if (voiceLiveFeedInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(voiceLiveFeedInfo.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceLiveFeedInfo.audienceIds != null) {
                jsonGenerator.writeFieldName("audienceIds");
                JsonAdapter.serializeArray(voiceLiveFeedInfo.audienceIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveFeedInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveFeedInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60164a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60165b(String str) {
        return str;
    }

    public static VoiceLiveFeedInfo new_() {
        VoiceLiveFeedInfo voiceLiveFeedInfo = new VoiceLiveFeedInfo();
        voiceLiveFeedInfo.nullCheck();
        return voiceLiveFeedInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveFeedInfo mo223809clone() {
        VoiceLiveFeedInfo voiceLiveFeedInfo = new VoiceLiveFeedInfo();
        voiceLiveFeedInfo.liveId = this.liveId;
        List<String> list = this.tags;
        if (list != null) {
            voiceLiveFeedInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.bpn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceLiveFeedInfo.m60165b((String) obj);
                }
            });
        }
        List<String> list2 = this.audienceIds;
        if (list2 != null) {
            voiceLiveFeedInfo.audienceIds = ValueObject.util_map(list2, new w9j() { // from class: l.cpn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceLiveFeedInfo.m60164a((String) obj);
                }
            });
        }
        return voiceLiveFeedInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveFeedInfo)) {
            return false;
        }
        VoiceLiveFeedInfo voiceLiveFeedInfo = (VoiceLiveFeedInfo) obj;
        return ValueObject.util_equals(this.liveId, voiceLiveFeedInfo.liveId) && ValueObject.util_equals(this.tags, voiceLiveFeedInfo.tags) && ValueObject.util_equals(this.audienceIds, voiceLiveFeedInfo.audienceIds);
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.tags;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.audienceIds;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.audienceIds == null) {
            this.audienceIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
