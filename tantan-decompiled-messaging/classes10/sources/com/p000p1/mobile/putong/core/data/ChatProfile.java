package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IceBreakingQuestion;
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
public class ChatProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatprofile";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ChatGuideMedia guideMedia;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<IceBreakingQuestion> iceBreakingQuestions;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ChatProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatProfile>() { // from class: com.p1.mobile.putong.core.data.ChatProfile.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatProfile chatProfile) {
            String str = chatProfile.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<IceBreakingQuestion> list = chatProfile.iceBreakingQuestions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChatGuideMedia chatGuideMedia = chatProfile.guideMedia;
            if (chatGuideMedia != null) {
                iO += CodedOutputByteBufferNano.l(3, chatGuideMedia, ChatGuideMedia.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatProfile).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatProfile m12133parse(nb5 nb5Var) throws IOException {
            ChatProfile chatProfile = new ChatProfile();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatProfile.userId == null) {
                        chatProfile.userId = "";
                    }
                    if (chatProfile.iceBreakingQuestions != null) {
                        break;
                    }
                    chatProfile.iceBreakingQuestions = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatProfile.userId = nb5Var.s();
                } else if (iU == 18) {
                    chatProfile.iceBreakingQuestions = (List) nb5Var.l(IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (chatProfile.userId == null) {
                            chatProfile.userId = "";
                        }
                        if (chatProfile.iceBreakingQuestions != null) {
                            break;
                        }
                        chatProfile.iceBreakingQuestions = new ArrayList();
                        return chatProfile;
                    }
                    chatProfile.guideMedia = (ChatGuideMedia) nb5Var.l(ChatGuideMedia.PROTOBUF_ADAPTER);
                }
            }
            return chatProfile;
        }

        public void serialize(ChatProfile chatProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatProfile.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<IceBreakingQuestion> list = chatProfile.iceBreakingQuestions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChatGuideMedia chatGuideMedia = chatProfile.guideMedia;
            if (chatGuideMedia != null) {
                codedOutputByteBufferNano.K(3, chatGuideMedia, ChatGuideMedia.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatProfile> JSON_ADAPTER = new ObjectJsonAdapter<ChatProfile>() { // from class: com.p1.mobile.putong.core.data.ChatProfile.2
        public Class getDataClass() {
            return ChatProfile.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatProfile m12134newInstance() {
            return new ChatProfile();
        }

        public boolean parseField(ChatProfile chatProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iceBreakingQuestions":
                    chatProfile.iceBreakingQuestions = JsonAdapter.parseArray(jsonParser, IceBreakingQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    chatProfile.userId = jsonParser.getValueAsString();
                    return true;
                case "guideMedia":
                    chatProfile.guideMedia = (ChatGuideMedia) ChatGuideMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatProfile chatProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iceBreakingQuestions":
                case "userId":
                case "guideMedia":
                    return true;
                default:
                    return super.parseFieldCheck(chatProfile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatProfile chatProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = chatProfile.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (chatProfile.iceBreakingQuestions != null) {
                jsonGenerator.writeFieldName("iceBreakingQuestions");
                JsonAdapter.serializeArray(chatProfile.iceBreakingQuestions, jsonGenerator, IceBreakingQuestion.JSON_ADAPTER);
            }
            if (chatProfile.guideMedia != null) {
                jsonGenerator.writeFieldName("guideMedia");
                ChatGuideMedia.JSON_ADAPTER.serialize(chatProfile.guideMedia, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatProfile new_() {
        ChatProfile chatProfile = new ChatProfile();
        chatProfile.nullCheck();
        return chatProfile;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatProfile m12132clone() {
        ChatProfile chatProfile = new ChatProfile();
        chatProfile.userId = this.userId;
        List<IceBreakingQuestion> list = this.iceBreakingQuestions;
        if (list != null) {
            chatProfile.iceBreakingQuestions = ValueObject.util_map(list, new w9j() { // from class: l.y15
                public final Object call(Object obj) {
                    return ((IceBreakingQuestion) obj).m13400clone();
                }
            });
        }
        ChatGuideMedia chatGuideMedia = this.guideMedia;
        if (chatGuideMedia != null) {
            chatProfile.guideMedia = chatGuideMedia.m12048clone();
        }
        return chatProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatProfile)) {
            return false;
        }
        ChatProfile chatProfile = (ChatProfile) obj;
        return ValueObject.util_equals(this.userId, chatProfile.userId) && ValueObject.util_equals(this.iceBreakingQuestions, chatProfile.iceBreakingQuestions) && ValueObject.util_equals(this.guideMedia, chatProfile.guideMedia);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<IceBreakingQuestion> list = this.iceBreakingQuestions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        ChatGuideMedia chatGuideMedia = this.guideMedia;
        int iHashCode3 = iHashCode2 + (chatGuideMedia != null ? chatGuideMedia.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.iceBreakingQuestions == null) {
            this.iceBreakingQuestions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
