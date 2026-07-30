package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.VoiceLiveTag;
import com.p1.mobile.putong.data.Room;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Voice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voice";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f193id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<VoiceLiveTag> liveAttributeTags;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public Room room;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String voiceRoomId;
    public static ProtobufAdapter<Voice> PROTOBUF_ADAPTER = new MessageNanoAdapter<Voice>() { // from class: com.p1.mobile.putong.core.data.Voice.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Voice voice) {
            String str = voice.f193id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voice.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = voice.voiceRoomId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            List<VoiceLiveTag> list = voice.liveAttributeTags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, VoiceLiveTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Room room = voice.room;
            if (room != null) {
                iO += CodedOutputByteBufferNano.l(5, room, Room.PROTOBUF_ADAPTER);
            }
            ((MessageNano) voice).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Voice m16259parse(nb5 nb5Var) throws IOException {
            Voice voice = new Voice();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voice.f193id == null) {
                        voice.f193id = "";
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
                if (iU == 10) {
                    voice.f193id = nb5Var.s();
                } else if (iU == 18) {
                    voice.userId = nb5Var.s();
                } else if (iU == 26) {
                    voice.voiceRoomId = nb5Var.s();
                } else if (iU == 34) {
                    voice.liveAttributeTags = (List) nb5Var.l(VoiceLiveTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
                        if (voice.f193id == null) {
                            voice.f193id = "";
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
                    voice.room = (Room) nb5Var.l(Room.PROTOBUF_ADAPTER);
                }
            }
            return voice;
        }

        public void serialize(Voice voice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voice.f193id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voice.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = voice.voiceRoomId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            List<VoiceLiveTag> list = voice.liveAttributeTags;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, VoiceLiveTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Room room = voice.room;
            if (room != null) {
                codedOutputByteBufferNano.K(5, room, Room.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Voice> JSON_ADAPTER = new ObjectJsonAdapter<Voice>() { // from class: com.p1.mobile.putong.core.data.Voice.2
        public Class getDataClass() {
            return Voice.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Voice m16260newInstance() {
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
                    voice.f193id = jsonParser.getValueAsString();
                    return false;
                case "room":
                    voice.room = (Room) Room.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(Voice voice, JsonGenerator jsonGenerator) throws IOException {
            String str = voice.f193id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Voice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Voice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Voice new_() {
        Voice voice = new Voice();
        voice.nullCheck();
        return voice;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Voice m16258clone() {
        Voice voice = new Voice();
        voice.f193id = this.f193id;
        voice.userId = this.userId;
        voice.voiceRoomId = this.voiceRoomId;
        List<VoiceLiveTag> list = this.liveAttributeTags;
        if (list != null) {
            voice.liveAttributeTags = ValueObject.util_map(list, new w9j() { // from class: l.xam0
                public final Object call(Object obj) {
                    return ((VoiceLiveTag) obj).m16288clone();
                }
            });
        }
        Room room = this.room;
        if (room != null) {
            voice.room = room.clone();
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
        return ValueObject.util_equals(this.f193id, voice.f193id) && ValueObject.util_equals(this.userId, voice.userId) && ValueObject.util_equals(this.voiceRoomId, voice.voiceRoomId) && ValueObject.util_equals(this.liveAttributeTags, voice.liveAttributeTags) && ValueObject.util_equals(this.room, voice.room);
    }

    public String getClassParseName() {
        return "voice";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f193id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<VoiceLiveTag> list = this.liveAttributeTags;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        Room room = this.room;
        int iHashCode5 = iHashCode4 + (room != null ? room.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f193id == null) {
            this.f193id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
