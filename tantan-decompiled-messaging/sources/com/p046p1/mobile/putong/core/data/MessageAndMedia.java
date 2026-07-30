package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MessageAndMedia extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<MessageAndMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAndMedia>() { // from class: com.p1.mobile.putong.core.data.MessageAndMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageAndMedia messageAndMedia) {
            Message message = messageAndMedia.message;
            int iM17230l = message != null ? CodedOutputByteBufferNano.m17230l(1, message, Message.PROTOBUF_ADAPTER) : 0;
            Media media = messageAndMedia.media;
            if (media != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, media, Media.PROTOBUF_ADAPTER);
            }
            messageAndMedia.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageAndMedia parse(nb5 nb5Var) throws IOException {
            MessageAndMedia messageAndMedia = new MessageAndMedia();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageAndMedia.message != null) {
                        break;
                    }
                    messageAndMedia.message = Message.new_();
                    break;
                }
                if (iM158752u == 10) {
                    messageAndMedia.message = (Message) nb5Var.m158743l(Message.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (messageAndMedia.message != null) {
                            break;
                        }
                        messageAndMedia.message = Message.new_();
                        return messageAndMedia;
                    }
                    messageAndMedia.media = (Media) nb5Var.m158743l(Media.PROTOBUF_ADAPTER);
                }
            }
            return messageAndMedia;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageAndMedia messageAndMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Message message = messageAndMedia.message;
            if (message != null) {
                codedOutputByteBufferNano.m17254K(1, message, Message.PROTOBUF_ADAPTER);
            }
            Media media = messageAndMedia.media;
            if (media != null) {
                codedOutputByteBufferNano.m17254K(2, media, Media.PROTOBUF_ADAPTER);
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
    public MessageAndMedia mo223809clone() {
        MessageAndMedia messageAndMedia = new MessageAndMedia();
        Message message = this.message;
        if (message != null) {
            messageAndMedia.message = message.mo223809clone();
        }
        Media media = this.media;
        if (media != null) {
            messageAndMedia.media = media.mo223809clone();
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
