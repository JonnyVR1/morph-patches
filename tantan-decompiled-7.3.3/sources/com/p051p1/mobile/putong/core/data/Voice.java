package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.VoiceLiveTag;
import com.p051p1.mobile.putong.data.Room;
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

/* JADX INFO: loaded from: classes10.dex */
public class Voice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voice";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21273id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<VoiceLiveTag> liveAttributeTags;

    @NonNull
    @ProtobufIndex(index = 5)
    public Room room;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceRoomId;
    public static ProtobufAdapter<Voice> PROTOBUF_ADAPTER = new MessageNanoAdapter<Voice>() { // from class: com.p1.mobile.putong.core.data.Voice.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Voice voice) {
            String str = voice.f21273id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voice.userId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = voice.voiceRoomId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            List<VoiceLiveTag> list = voice.liveAttributeTags;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, VoiceLiveTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Room room = voice.room;
            if (room != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, room, Room.PROTOBUF_ADAPTER);
            }
            voice.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Voice parse(nc5 nc5Var) throws IOException {
            Voice voice = new Voice();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voice.f21273id == null) {
                        voice.f21273id = "";
                    }
                    if (voice.userId == null) {
                        voice.userId = "";
                    }
                    if (voice.voiceRoomId == null) {
                        voice.voiceRoomId = "";
                    }
                    if (voice.liveAttributeTags == null) {
                        voice.liveAttributeTags = new ArrayList();
                    }
                    if (voice.room != null) {
                        break;
                    }
                    voice.room = Room.new_();
                    break;
                }
                if (iM162497u == 10) {
                    voice.f21273id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    voice.userId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    voice.voiceRoomId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    voice.liveAttributeTags = (List) nc5Var.m162488l(VoiceLiveTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 42) {
                        if (voice.f21273id == null) {
                            voice.f21273id = "";
                        }
                        if (voice.userId == null) {
                            voice.userId = "";
                        }
                        if (voice.voiceRoomId == null) {
                            voice.voiceRoomId = "";
                        }
                        if (voice.liveAttributeTags == null) {
                            voice.liveAttributeTags = new ArrayList();
                        }
                        if (voice.room != null) {
                            break;
                        }
                        voice.room = Room.new_();
                        return voice;
                    }
                    voice.room = (Room) nc5Var.m162488l(Room.PROTOBUF_ADAPTER);
                }
            }
            return voice;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Voice voice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voice.f21273id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voice.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = voice.voiceRoomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            List<VoiceLiveTag> list = voice.liveAttributeTags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, VoiceLiveTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Room room = voice.room;
            if (room != null) {
                codedOutputByteBufferNano.m17309K(5, room, Room.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Voice> JSON_ADAPTER = new ObjectJsonAdapter<Voice>() { // from class: com.p1.mobile.putong.core.data.Voice.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Voice.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Voice newInstance() {
            return new Voice();
        }

        public boolean parseField(Voice voice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    voice.userId = jsonParser.getValueAsString();
                    return true;
                case "liveAttributeTags":
                    voice.liveAttributeTags = JsonAdapter.parseArray(jsonParser, VoiceLiveTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "voiceRoomId":
                    voice.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    voice.f21273id = jsonParser.getValueAsString();
                    return false;
                case "room":
                    voice.room = Room.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Voice voice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "liveAttributeTags":
                case "voiceRoomId":
                    return true;
                case "id":
                    return false;
                case "room":
                    return true;
                default:
                    return super.parseFieldCheck(voice, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Voice voice, JsonGenerator jsonGenerator) throws IOException {
            String str = voice.f21273id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voice.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = voice.voiceRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str3);
            }
            if (voice.liveAttributeTags != null) {
                jsonGenerator.writeFieldName("liveAttributeTags");
                JsonAdapter.serializeArray(voice.liveAttributeTags, jsonGenerator, VoiceLiveTag.JSON_ADAPTER);
            }
            if (voice.room != null) {
                jsonGenerator.writeFieldName("room");
                Room.JSON_ADAPTER.serialize(voice.room, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Voice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Voice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Voice new_() {
        Voice voice = new Voice();
        voice.nullCheck();
        return voice;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Voice mo225055clone() {
        Voice voice = new Voice();
        voice.f21273id = this.f21273id;
        voice.userId = this.userId;
        voice.voiceRoomId = this.voiceRoomId;
        List<VoiceLiveTag> list = this.liveAttributeTags;
        if (list != null) {
            voice.liveAttributeTags = ValueObject.util_map(list, new qcj() { // from class: l.bkm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceLiveTag) obj).mo225055clone();
                }
            });
        }
        Room room = this.room;
        if (room != null) {
            voice.room = room.mo225055clone();
        }
        return voice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Voice)) {
            return false;
        }
        Voice voice = (Voice) obj;
        return ValueObject.util_equals(this.f21273id, voice.f21273id) && ValueObject.util_equals(this.userId, voice.userId) && ValueObject.util_equals(this.voiceRoomId, voice.voiceRoomId) && ValueObject.util_equals(this.liveAttributeTags, voice.liveAttributeTags) && ValueObject.util_equals(this.room, voice.room);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "voice";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21273id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<VoiceLiveTag> list = this.liveAttributeTags;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        Room room = this.room;
        int iHashCode5 = iHashCode4 + (room != null ? room.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21273id == null) {
            this.f21273id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.liveAttributeTags == null) {
            this.liveAttributeTags = new ArrayList();
        }
        if (this.room == null) {
            this.room = Room.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
