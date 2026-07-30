package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
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
public class ChatProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatprofile";

    @Nullable
    @ProtobufIndex(index = 3)
    public ChatGuideMedia guideMedia;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IceBreakingQuestion> iceBreakingQuestions;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ChatProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatProfile>() { // from class: com.p1.mobile.putong.core.data.ChatProfile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatProfile chatProfile) {
            String str = chatProfile.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<IceBreakingQuestion> list = chatProfile.iceBreakingQuestions;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChatGuideMedia chatGuideMedia = chatProfile.guideMedia;
            if (chatGuideMedia != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, chatGuideMedia, ChatGuideMedia.PROTOBUF_ADAPTER);
            }
            chatProfile.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatProfile parse(nc5 nc5Var) throws IOException {
            ChatProfile chatProfile = new ChatProfile();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatProfile.userId == null) {
                        chatProfile.userId = "";
                    }
                    if (chatProfile.iceBreakingQuestions != null) {
                        break;
                    }
                    chatProfile.iceBreakingQuestions = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    chatProfile.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    chatProfile.iceBreakingQuestions = (List) nc5Var.m162488l(IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (chatProfile.userId == null) {
                            chatProfile.userId = "";
                        }
                        if (chatProfile.iceBreakingQuestions != null) {
                            break;
                        }
                        chatProfile.iceBreakingQuestions = new ArrayList();
                        return chatProfile;
                    }
                    chatProfile.guideMedia = (ChatGuideMedia) nc5Var.m162488l(ChatGuideMedia.PROTOBUF_ADAPTER);
                }
            }
            return chatProfile;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatProfile chatProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatProfile.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<IceBreakingQuestion> list = chatProfile.iceBreakingQuestions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, IceBreakingQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChatGuideMedia chatGuideMedia = chatProfile.guideMedia;
            if (chatGuideMedia != null) {
                codedOutputByteBufferNano.m17309K(3, chatGuideMedia, ChatGuideMedia.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatProfile> JSON_ADAPTER = new ObjectJsonAdapter<ChatProfile>() { // from class: com.p1.mobile.putong.core.data.ChatProfile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatProfile.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatProfile newInstance() {
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
                    chatProfile.guideMedia = ChatGuideMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatProfile new_() {
        ChatProfile chatProfile = new ChatProfile();
        chatProfile.nullCheck();
        return chatProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatProfile mo225055clone() {
        ChatProfile chatProfile = new ChatProfile();
        chatProfile.userId = this.userId;
        List<IceBreakingQuestion> list = this.iceBreakingQuestions;
        if (list != null) {
            chatProfile.iceBreakingQuestions = ValueObject.util_map(list, new qcj() { // from class: l.x25
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IceBreakingQuestion) obj).mo225055clone();
                }
            });
        }
        ChatGuideMedia chatGuideMedia = this.guideMedia;
        if (chatGuideMedia != null) {
            chatProfile.guideMedia = chatGuideMedia.mo225055clone();
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<IceBreakingQuestion> list = this.iceBreakingQuestions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        ChatGuideMedia chatGuideMedia = this.guideMedia;
        int iHashCode3 = iHashCode2 + (chatGuideMedia != null ? chatGuideMedia.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.iceBreakingQuestions == null) {
            this.iceBreakingQuestions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
