package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.VoiceLiveState;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceLiveState voiceLiveState) {
            String str = voiceLiveState.voiceRoomId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voiceLiveState.state;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = voiceLiveState.voiceLiveId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = voiceLiveState.anchorId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            List<String> list = voiceLiveState.messages;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceLiveState.avatars;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = voiceLiveState.topDesc;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = voiceLiveState.title;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(8, str6);
            }
            ((MessageNano) voiceLiveState).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceLiveState m19356parse(nb5 nb5Var) throws IOException {
            VoiceLiveState voiceLiveState = new VoiceLiveState();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    voiceLiveState.voiceRoomId = nb5Var.s();
                } else if (iU == 18) {
                    voiceLiveState.state = nb5Var.s();
                } else if (iU == 26) {
                    voiceLiveState.voiceLiveId = nb5Var.s();
                } else if (iU == 34) {
                    voiceLiveState.anchorId = nb5Var.s();
                } else if (iU == 42) {
                    voiceLiveState.messages = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 50) {
                    voiceLiveState.avatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 58) {
                    voiceLiveState.topDesc = nb5Var.s();
                } else {
                    if (iU != 66) {
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
                    voiceLiveState.title = nb5Var.s();
                }
            }
            return voiceLiveState;
        }

        public void serialize(VoiceLiveState voiceLiveState, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveState.voiceRoomId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voiceLiveState.state;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = voiceLiveState.voiceLiveId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = voiceLiveState.anchorId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            List<String> list = voiceLiveState.messages;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceLiveState.avatars;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = voiceLiveState.topDesc;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = voiceLiveState.title;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
        }
    };
    public static JsonAdapter<VoiceLiveState> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveState>() { // from class: com.p1.mobile.putong.data.VoiceLiveState.2
        public Class getDataClass() {
            return VoiceLiveState.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceLiveState mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveState voiceLiveState, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveState.state;
            if (str != null) {
                jsonGenerator.writeStringField(Channel.state, str);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1084a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1085b(String str) {
        return str;
    }

    public static VoiceLiveState new_() {
        VoiceLiveState voiceLiveState = new VoiceLiveState();
        voiceLiveState.nullCheck();
        return voiceLiveState;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceLiveState m19355clone() {
        VoiceLiveState voiceLiveState = new VoiceLiveState();
        voiceLiveState.state = this.state;
        voiceLiveState.voiceLiveId = this.voiceLiveId;
        voiceLiveState.voiceRoomId = this.voiceRoomId;
        voiceLiveState.anchorId = this.anchorId;
        List<String> list = this.messages;
        if (list != null) {
            voiceLiveState.messages = ValueObject.util_map(list, new w9j() { // from class: l.awn0
                public final Object call(Object obj) {
                    return VoiceLiveState.m1084a((String) obj);
                }
            });
        }
        List<String> list2 = this.avatars;
        if (list2 != null) {
            voiceLiveState.avatars = ValueObject.util_map(list2, new w9j() { // from class: l.bwn0
                public final Object call(Object obj) {
                    return VoiceLiveState.m1085b((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
