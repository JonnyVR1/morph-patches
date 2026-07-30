package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.VoiceLiveState;
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
public class VoiceLiveState extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivestate";

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> avatars;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> messages;

    @NonNull
    @ProtobufIndex(index = 2)
    public String state;

    @NonNull
    @ProtobufIndex(index = 8)
    public String title;

    @NonNull
    @ProtobufIndex(index = 7)
    public String topDesc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String voiceRoomId;
    public static ProtobufAdapter<VoiceLiveState> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveState>() { // from class: com.p1.mobile.putong.data.VoiceLiveState.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveState voiceLiveState) {
            String str = voiceLiveState.voiceRoomId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voiceLiveState.state;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = voiceLiveState.voiceLiveId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = voiceLiveState.anchorId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            List<String> list = voiceLiveState.messages;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceLiveState.avatars;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = voiceLiveState.topDesc;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            String str6 = voiceLiveState.title;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            voiceLiveState.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveState parse(nc5 nc5Var) throws IOException {
            VoiceLiveState voiceLiveState = new VoiceLiveState();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceLiveState.state == null) {
                        voiceLiveState.state = "";
                    }
                    if (voiceLiveState.voiceLiveId == null) {
                        voiceLiveState.voiceLiveId = "";
                    }
                    if (voiceLiveState.voiceRoomId == null) {
                        voiceLiveState.voiceRoomId = "";
                    }
                    if (voiceLiveState.anchorId == null) {
                        voiceLiveState.anchorId = "";
                    }
                    if (voiceLiveState.messages == null) {
                        voiceLiveState.messages = new ArrayList();
                    }
                    if (voiceLiveState.avatars == null) {
                        voiceLiveState.avatars = new ArrayList();
                    }
                    if (voiceLiveState.topDesc == null) {
                        voiceLiveState.topDesc = "";
                    }
                    if (voiceLiveState.title != null) {
                        break;
                    }
                    voiceLiveState.title = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceLiveState.voiceRoomId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    voiceLiveState.state = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    voiceLiveState.voiceLiveId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    voiceLiveState.anchorId = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    voiceLiveState.messages = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 50) {
                    voiceLiveState.avatars = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 58) {
                    voiceLiveState.topDesc = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (voiceLiveState.state == null) {
                            voiceLiveState.state = "";
                        }
                        if (voiceLiveState.voiceLiveId == null) {
                            voiceLiveState.voiceLiveId = "";
                        }
                        if (voiceLiveState.voiceRoomId == null) {
                            voiceLiveState.voiceRoomId = "";
                        }
                        if (voiceLiveState.anchorId == null) {
                            voiceLiveState.anchorId = "";
                        }
                        if (voiceLiveState.messages == null) {
                            voiceLiveState.messages = new ArrayList();
                        }
                        if (voiceLiveState.avatars == null) {
                            voiceLiveState.avatars = new ArrayList();
                        }
                        if (voiceLiveState.topDesc == null) {
                            voiceLiveState.topDesc = "";
                        }
                        if (voiceLiveState.title != null) {
                            break;
                        }
                        voiceLiveState.title = "";
                        return voiceLiveState;
                    }
                    voiceLiveState.title = nc5Var.m162495s();
                }
            }
            return voiceLiveState;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveState voiceLiveState, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveState.voiceRoomId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voiceLiveState.state;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = voiceLiveState.voiceLiveId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = voiceLiveState.anchorId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            List<String> list = voiceLiveState.messages;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceLiveState.avatars;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = voiceLiveState.topDesc;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            String str6 = voiceLiveState.title;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
        }
    };
    public static JsonAdapter<VoiceLiveState> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveState>() { // from class: com.p1.mobile.putong.data.VoiceLiveState.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveState.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveState newInstance() {
            return new VoiceLiveState();
        }

        public boolean parseField(VoiceLiveState voiceLiveState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topDesc":
                    voiceLiveState.topDesc = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    voiceLiveState.anchorId = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    voiceLiveState.avatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "messages":
                    voiceLiveState.messages = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "voiceLiveId":
                    voiceLiveState.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    voiceLiveState.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "state":
                    voiceLiveState.state = jsonParser.getValueAsString();
                    return true;
                case "title":
                    voiceLiveState.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceLiveState voiceLiveState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "topDesc":
                case "anchorId":
                case "avatars":
                case "messages":
                case "voiceLiveId":
                case "voiceRoomId":
                case "state":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(voiceLiveState, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveState voiceLiveState, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveState.state;
            if (str != null) {
                jsonGenerator.writeStringField("state", str);
            }
            String str2 = voiceLiveState.voiceLiveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str2);
            }
            String str3 = voiceLiveState.voiceRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str3);
            }
            String str4 = voiceLiveState.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            if (voiceLiveState.messages != null) {
                jsonGenerator.writeFieldName("messages");
                JsonAdapter.serializeArray(voiceLiveState.messages, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceLiveState.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(voiceLiveState.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = voiceLiveState.topDesc;
            if (str5 != null) {
                jsonGenerator.writeStringField("topDesc", str5);
            }
            String str6 = voiceLiveState.title;
            if (str6 != null) {
                jsonGenerator.writeStringField("title", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61350a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61351b(String str) {
        return str;
    }

    public static VoiceLiveState new_() {
        VoiceLiveState voiceLiveState = new VoiceLiveState();
        voiceLiveState.nullCheck();
        return voiceLiveState;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveState mo225055clone() {
        VoiceLiveState voiceLiveState = new VoiceLiveState();
        voiceLiveState.state = this.state;
        voiceLiveState.voiceLiveId = this.voiceLiveId;
        voiceLiveState.voiceRoomId = this.voiceRoomId;
        voiceLiveState.anchorId = this.anchorId;
        List<String> list = this.messages;
        if (list != null) {
            voiceLiveState.messages = ValueObject.util_map(list, new qcj() { // from class: l.e5o0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VoiceLiveState.m61350a((String) obj);
                }
            });
        }
        List<String> list2 = this.avatars;
        if (list2 != null) {
            voiceLiveState.avatars = ValueObject.util_map(list2, new qcj() { // from class: l.f5o0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VoiceLiveState.m61351b((String) obj);
                }
            });
        }
        voiceLiveState.topDesc = this.topDesc;
        voiceLiveState.title = this.title;
        return voiceLiveState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveState)) {
            return false;
        }
        VoiceLiveState voiceLiveState = (VoiceLiveState) obj;
        return ValueObject.util_equals(this.state, voiceLiveState.state) && ValueObject.util_equals(this.voiceLiveId, voiceLiveState.voiceLiveId) && ValueObject.util_equals(this.voiceRoomId, voiceLiveState.voiceRoomId) && ValueObject.util_equals(this.anchorId, voiceLiveState.anchorId) && ValueObject.util_equals(this.messages, voiceLiveState.messages) && ValueObject.util_equals(this.avatars, voiceLiveState.avatars) && ValueObject.util_equals(this.topDesc, voiceLiveState.topDesc) && ValueObject.util_equals(this.title, voiceLiveState.title);
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.voiceLiveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.messages;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.avatars;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str5 = this.topDesc;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.title;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
        if (this.topDesc == null) {
            this.topDesc = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
