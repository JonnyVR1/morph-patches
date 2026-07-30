package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MessageAndMedia extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<MessageAndMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAndMedia>() { // from class: com.p1.mobile.putong.core.data.MessageAndMedia.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageAndMedia messageAndMedia) {
            Message message = messageAndMedia.message;
            int iL = message != null ? CodedOutputByteBufferNano.l(1, message, Message.PROTOBUF_ADAPTER) : 0;
            Media media = messageAndMedia.media;
            if (media != null) {
                iL += CodedOutputByteBufferNano.l(2, media, Media.PROTOBUF_ADAPTER);
            }
            ((MessageNano) messageAndMedia).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageAndMedia m14172parse(nb5 nb5Var) throws IOException {
            MessageAndMedia messageAndMedia = new MessageAndMedia();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageAndMedia.message != null) {
                        break;
                    }
                    messageAndMedia.message = Message.new_();
                    break;
                }
                if (iU == 10) {
                    messageAndMedia.message = (Message) nb5Var.l(Message.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (messageAndMedia.message != null) {
                            break;
                        }
                        messageAndMedia.message = Message.new_();
                        return messageAndMedia;
                    }
                    messageAndMedia.media = (Media) nb5Var.l(Media.PROTOBUF_ADAPTER);
                }
            }
            return messageAndMedia;
        }

        public void serialize(MessageAndMedia messageAndMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Message message = messageAndMedia.message;
            if (message != null) {
                codedOutputByteBufferNano.K(1, message, Message.PROTOBUF_ADAPTER);
            }
            Media media = messageAndMedia.media;
            if (media != null) {
                codedOutputByteBufferNano.K(2, media, Media.PROTOBUF_ADAPTER);
            }
        }
    };
    public static final String TYPE = "messageandmedia";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageAndMedia m14171clone() {
        MessageAndMedia messageAndMedia = new MessageAndMedia();
        Message message = this.message;
        if (message != null) {
            messageAndMedia.message = message.m14153clone();
        }
        Media media = this.media;
        if (media != null) {
            messageAndMedia.media = media.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Message message = this.message;
        int iHashCode = (i2 + (message != null ? message.hashCode() : 0)) * 41;
        Media media = this.media;
        int iHashCode2 = iHashCode + (media != null ? media.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.message == null) {
            this.message = Message.new_();
        }
    }

    public MessageAndMedia() {
    }
}
