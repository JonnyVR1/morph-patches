package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MessageMusic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagemusic";

    @NonNull
    @ProtobufIndex(index = 1)
    public String albumAudioId;

    @Nullable
    @ProtobufIndex(index = 2)
    public String albumCover;

    @Nullable
    @ProtobufIndex(index = 3)
    public String albumName;

    @Nullable
    @ProtobufIndex(index = 4)
    public String displayName;

    @NonNull
    @ProtobufIndex(index = 5)
    public String hash;

    @Nullable
    @ProtobufIndex(index = 10)
    public String previewUrl;

    @Nullable
    @ProtobufIndex(index = 6)
    public String singerName;

    @NonNull
    @ProtobufIndex(index = 7)
    public String songName;

    @ProtobufIndex(index = 8)
    public long timeLength;

    @Nullable
    @ProtobufIndex(index = 9)
    public String timeLengthStr;
    public static ProtobufAdapter<MessageMusic> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageMusic>() { // from class: com.p1.mobile.putong.core.data.MessageMusic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageMusic messageMusic) {
            String str = messageMusic.albumAudioId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageMusic.albumCover;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = messageMusic.albumName;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = messageMusic.displayName;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = messageMusic.hash;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = messageMusic.singerName;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = messageMusic.songName;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(8, messageMusic.timeLength);
            String str8 = messageMusic.timeLengthStr;
            if (str8 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(9, str8);
            }
            String str9 = messageMusic.previewUrl;
            if (str9 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(10, str9);
            }
            messageMusic.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageMusic parse(nb5 nb5Var) throws IOException {
            MessageMusic messageMusic = new MessageMusic();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (messageMusic.albumAudioId == null) {
                            messageMusic.albumAudioId = "";
                        }
                        if (messageMusic.hash == null) {
                            messageMusic.hash = "";
                        }
                        if (messageMusic.songName == null) {
                            messageMusic.songName = "";
                        }
                        break;
                    case 10:
                        messageMusic.albumAudioId = nb5Var.m158750s();
                        continue;
                    case 18:
                        messageMusic.albumCover = nb5Var.m158750s();
                        continue;
                    case 26:
                        messageMusic.albumName = nb5Var.m158750s();
                        continue;
                    case 34:
                        messageMusic.displayName = nb5Var.m158750s();
                        continue;
                    case 42:
                        messageMusic.hash = nb5Var.m158750s();
                        continue;
                    case 50:
                        messageMusic.singerName = nb5Var.m158750s();
                        continue;
                    case 58:
                        messageMusic.songName = nb5Var.m158750s();
                        continue;
                    case 64:
                        messageMusic.timeLength = nb5Var.m158742k();
                        continue;
                    case 74:
                        messageMusic.timeLengthStr = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        messageMusic.previewUrl = nb5Var.m158750s();
                        continue;
                    default:
                        if (messageMusic.albumAudioId == null) {
                            messageMusic.albumAudioId = "";
                        }
                        if (messageMusic.hash == null) {
                            messageMusic.hash = "";
                        }
                        if (messageMusic.songName == null) {
                            messageMusic.songName = "";
                            return messageMusic;
                        }
                        break;
                }
            }
            return messageMusic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageMusic messageMusic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageMusic.albumAudioId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageMusic.albumCover;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = messageMusic.albumName;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = messageMusic.displayName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = messageMusic.hash;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = messageMusic.singerName;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = messageMusic.songName;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            codedOutputByteBufferNano.m17252I(8, messageMusic.timeLength);
            String str8 = messageMusic.timeLengthStr;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(9, str8);
            }
            String str9 = messageMusic.previewUrl;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(10, str9);
            }
        }
    };
    public static JsonAdapter<MessageMusic> JSON_ADAPTER = new ObjectJsonAdapter<MessageMusic>() { // from class: com.p1.mobile.putong.core.data.MessageMusic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageMusic.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageMusic newInstance() {
            return new MessageMusic();
        }

        public boolean parseField(MessageMusic messageMusic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "albumCover":
                    messageMusic.albumCover = jsonParser.getValueAsString();
                    return true;
                case "previewUrl":
                    messageMusic.previewUrl = jsonParser.getValueAsString();
                    return true;
                case "hash":
                    messageMusic.hash = jsonParser.getValueAsString();
                    return true;
                case "albumName":
                    messageMusic.albumName = jsonParser.getValueAsString();
                    return true;
                case "timeLength":
                    messageMusic.timeLength = jsonParser.getValueAsLong();
                    return true;
                case "singerName":
                    messageMusic.singerName = jsonParser.getValueAsString();
                    return true;
                case "songName":
                    messageMusic.songName = jsonParser.getValueAsString();
                    return true;
                case "displayName":
                    messageMusic.displayName = jsonParser.getValueAsString();
                    return true;
                case "timeLengthStr":
                    messageMusic.timeLengthStr = jsonParser.getValueAsString();
                    return true;
                case "albumAudioId":
                    messageMusic.albumAudioId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageMusic messageMusic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "albumCover":
                case "previewUrl":
                case "hash":
                case "albumName":
                case "timeLength":
                case "singerName":
                case "songName":
                case "displayName":
                case "timeLengthStr":
                case "albumAudioId":
                    return true;
                default:
                    return super.parseFieldCheck(messageMusic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageMusic messageMusic, JsonGenerator jsonGenerator) throws IOException {
            String str = messageMusic.albumAudioId;
            if (str != null) {
                jsonGenerator.writeStringField("albumAudioId", str);
            }
            String str2 = messageMusic.albumCover;
            if (str2 != null) {
                jsonGenerator.writeStringField("albumCover", str2);
            }
            String str3 = messageMusic.albumName;
            if (str3 != null) {
                jsonGenerator.writeStringField("albumName", str3);
            }
            String str4 = messageMusic.displayName;
            if (str4 != null) {
                jsonGenerator.writeStringField("displayName", str4);
            }
            String str5 = messageMusic.hash;
            if (str5 != null) {
                jsonGenerator.writeStringField("hash", str5);
            }
            String str6 = messageMusic.singerName;
            if (str6 != null) {
                jsonGenerator.writeStringField("singerName", str6);
            }
            String str7 = messageMusic.songName;
            if (str7 != null) {
                jsonGenerator.writeStringField("songName", str7);
            }
            jsonGenerator.writeNumberField("timeLength", messageMusic.timeLength);
            String str8 = messageMusic.timeLengthStr;
            if (str8 != null) {
                jsonGenerator.writeStringField("timeLengthStr", str8);
            }
            String str9 = messageMusic.previewUrl;
            if (str9 != null) {
                jsonGenerator.writeStringField("previewUrl", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageMusic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageMusic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageMusic new_() {
        MessageMusic messageMusic = new MessageMusic();
        messageMusic.nullCheck();
        return messageMusic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageMusic mo223809clone() {
        MessageMusic messageMusic = new MessageMusic();
        messageMusic.albumAudioId = this.albumAudioId;
        messageMusic.albumCover = this.albumCover;
        messageMusic.albumName = this.albumName;
        messageMusic.displayName = this.displayName;
        messageMusic.hash = this.hash;
        messageMusic.singerName = this.singerName;
        messageMusic.songName = this.songName;
        messageMusic.timeLength = this.timeLength;
        messageMusic.timeLengthStr = this.timeLengthStr;
        messageMusic.previewUrl = this.previewUrl;
        return messageMusic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageMusic)) {
            return false;
        }
        MessageMusic messageMusic = (MessageMusic) obj;
        return ValueObject.util_equals(this.albumAudioId, messageMusic.albumAudioId) && ValueObject.util_equals(this.albumCover, messageMusic.albumCover) && ValueObject.util_equals(this.albumName, messageMusic.albumName) && ValueObject.util_equals(this.displayName, messageMusic.displayName) && ValueObject.util_equals(this.hash, messageMusic.hash) && ValueObject.util_equals(this.singerName, messageMusic.singerName) && ValueObject.util_equals(this.songName, messageMusic.songName) && this.timeLength == messageMusic.timeLength && ValueObject.util_equals(this.timeLengthStr, messageMusic.timeLengthStr) && ValueObject.util_equals(this.previewUrl, messageMusic.previewUrl);
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
        String str = this.albumAudioId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.albumCover;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.albumName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.hash;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.singerName;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.songName;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        long j = this.timeLength;
        int i3 = (((iHashCode6 + iHashCode7) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str8 = this.timeLengthStr;
        int iHashCode8 = (i3 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.previewUrl;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    public String musicKey() {
        return this.hash + "-" + this.albumAudioId + "-" + super.hashCode();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.albumAudioId == null) {
            this.albumAudioId = "";
        }
        if (this.hash == null) {
            this.hash = "";
        }
        if (this.songName == null) {
            this.songName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
