package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class MessageAndMedia extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<MessageAndMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAndMedia>() { // from class: com.p1.mobile.putong.core.data.MessageAndMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageAndMedia messageAndMedia) {
            Message message = messageAndMedia.message;
            int iM17285l = message != null ? CodedOutputByteBufferNano.m17285l(1, message, Message.PROTOBUF_ADAPTER) : 0;
            Media media = messageAndMedia.media;
            if (media != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, media, Media.PROTOBUF_ADAPTER);
            }
            messageAndMedia.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageAndMedia parse(nc5 nc5Var) throws IOException {
            MessageAndMedia messageAndMedia = new MessageAndMedia();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageAndMedia.message != null) {
                        break;
                    }
                    messageAndMedia.message = Message.new_();
                    break;
                }
                if (iM162497u == 10) {
                    messageAndMedia.message = (Message) nc5Var.m162488l(Message.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (messageAndMedia.message != null) {
                            break;
                        }
                        messageAndMedia.message = Message.new_();
                        return messageAndMedia;
                    }
                    messageAndMedia.media = (Media) nc5Var.m162488l(Media.PROTOBUF_ADAPTER);
                }
            }
            return messageAndMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageAndMedia messageAndMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Message message = messageAndMedia.message;
            if (message != null) {
                codedOutputByteBufferNano.m17309K(1, message, Message.PROTOBUF_ADAPTER);
            }
            Media media = messageAndMedia.media;
            if (media != null) {
                codedOutputByteBufferNano.m17309K(2, media, Media.PROTOBUF_ADAPTER);
            }
        }
    };
    public static final String TYPE = "messageandmedia";

    @NonNull
    @ProtobufIndex(index = 2)
    public Media media;

    @NonNull
    @ProtobufIndex(index = 1)
    public Message message;

    public MessageAndMedia(Media media, Message message) {
        this.media = media;
        this.message = message;
    }

    public static MessageAndMedia new_() {
        MessageAndMedia messageAndMedia = new MessageAndMedia();
        messageAndMedia.nullCheck();
        return messageAndMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageAndMedia mo225055clone() {
        MessageAndMedia messageAndMedia = new MessageAndMedia();
        Message message = this.message;
        if (message != null) {
            messageAndMedia.message = message.mo225055clone();
        }
        Media media = this.media;
        if (media != null) {
            messageAndMedia.media = media.mo225055clone();
        }
        return messageAndMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageAndMedia)) {
            return false;
        }
        MessageAndMedia messageAndMedia = (MessageAndMedia) obj;
        return ValueObject.util_equals(this.message, messageAndMedia.message) && ValueObject.util_equals(this.media, messageAndMedia.media);
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
        Message message = this.message;
        int iHashCode = (i2 + (message != null ? message.hashCode() : 0)) * 41;
        Media media = this.media;
        int iHashCode2 = iHashCode + (media != null ? media.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = Message.new_();
        }
    }

    public MessageAndMedia() {
    }
}
