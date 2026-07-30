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
public class ConversationProperty extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationproperty";

    @NonNull
    @ProtobufIndex(index = 10)
    public BoostInfo boost;

    @NonNull
    @ProtobufIndex(index = 2)
    public ChatInterrupt chatInterrupt;

    @NonNull
    @ProtobufIndex(index = 12)
    public ConversationTag conversationTag;

    @NonNull
    @ProtobufIndex(index = 3)
    public ConversationIceBreaking iceBreaking;

    @NonNull
    @ProtobufIndex(index = 7)
    public IntlChatSource intl_chat_source;

    @NonNull
    @ProtobufIndex(index = 8)
    public ConversationLoveBuzz intl_love_buzz;

    @NonNull
    @ProtobufIndex(index = 11)
    public LikedMeInfo likedMe;

    @Nullable
    @ProtobufIndex(index = 13)
    public LimitedTrialSee limitedTrialSee;

    @NonNull
    @ProtobufIndex(index = 1)
    public ConversationLiveVipInfo liveVIP;

    @NonNull
    @ProtobufIndex(index = 9)
    public LoveScript loveScript;

    @NonNull
    @ProtobufIndex(index = 4)
    public ConversationQuickChat quickchat;

    @NonNull
    @ProtobufIndex(index = 5)
    public ConversationSoulMatch2 soulmatch2;

    @NonNull
    @ProtobufIndex(index = 6)
    public TacitTest tacitTest;
    public static ProtobufAdapter<ConversationProperty> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationProperty>() { // from class: com.p1.mobile.putong.core.data.ConversationProperty.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationProperty conversationProperty) {
            ConversationLiveVipInfo conversationLiveVipInfo = conversationProperty.liveVIP;
            int iM17230l = conversationLiveVipInfo != null ? CodedOutputByteBufferNano.m17230l(1, conversationLiveVipInfo, ConversationLiveVipInfo.PROTOBUF_ADAPTER) : 0;
            ChatInterrupt chatInterrupt = conversationProperty.chatInterrupt;
            if (chatInterrupt != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, chatInterrupt, ChatInterrupt.PROTOBUF_ADAPTER);
            }
            ConversationIceBreaking conversationIceBreaking = conversationProperty.iceBreaking;
            if (conversationIceBreaking != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, conversationIceBreaking, ConversationIceBreaking.PROTOBUF_ADAPTER);
            }
            ConversationQuickChat conversationQuickChat = conversationProperty.quickchat;
            if (conversationQuickChat != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, conversationQuickChat, ConversationQuickChat.PROTOBUF_ADAPTER);
            }
            ConversationSoulMatch2 conversationSoulMatch2 = conversationProperty.soulmatch2;
            if (conversationSoulMatch2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, conversationSoulMatch2, ConversationSoulMatch2.PROTOBUF_ADAPTER);
            }
            TacitTest tacitTest = conversationProperty.tacitTest;
            if (tacitTest != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(6, tacitTest, TacitTest.PROTOBUF_ADAPTER);
            }
            IntlChatSource intlChatSource = conversationProperty.intl_chat_source;
            if (intlChatSource != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(7, intlChatSource, IntlChatSource.PROTOBUF_ADAPTER);
            }
            ConversationLoveBuzz conversationLoveBuzz = conversationProperty.intl_love_buzz;
            if (conversationLoveBuzz != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(8, conversationLoveBuzz, ConversationLoveBuzz.PROTOBUF_ADAPTER);
            }
            LoveScript loveScript = conversationProperty.loveScript;
            if (loveScript != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(9, loveScript, LoveScript.PROTOBUF_ADAPTER);
            }
            BoostInfo boostInfo = conversationProperty.boost;
            if (boostInfo != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(10, boostInfo, BoostInfo.PROTOBUF_ADAPTER);
            }
            LikedMeInfo likedMeInfo = conversationProperty.likedMe;
            if (likedMeInfo != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(11, likedMeInfo, LikedMeInfo.PROTOBUF_ADAPTER);
            }
            ConversationTag conversationTag = conversationProperty.conversationTag;
            if (conversationTag != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(12, conversationTag, ConversationTag.PROTOBUF_ADAPTER);
            }
            LimitedTrialSee limitedTrialSee = conversationProperty.limitedTrialSee;
            if (limitedTrialSee != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(13, limitedTrialSee, LimitedTrialSee.PROTOBUF_ADAPTER);
            }
            conversationProperty.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationProperty parse(nb5 nb5Var) throws IOException {
            ConversationProperty conversationProperty = new ConversationProperty();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (conversationProperty.liveVIP == null) {
                            conversationProperty.liveVIP = ConversationLiveVipInfo.new_();
                        }
                        if (conversationProperty.chatInterrupt == null) {
                            conversationProperty.chatInterrupt = ChatInterrupt.new_();
                        }
                        if (conversationProperty.iceBreaking == null) {
                            conversationProperty.iceBreaking = ConversationIceBreaking.new_();
                        }
                        if (conversationProperty.quickchat == null) {
                            conversationProperty.quickchat = ConversationQuickChat.new_();
                        }
                        if (conversationProperty.soulmatch2 == null) {
                            conversationProperty.soulmatch2 = ConversationSoulMatch2.new_();
                        }
                        if (conversationProperty.tacitTest == null) {
                            conversationProperty.tacitTest = TacitTest.new_();
                        }
                        if (conversationProperty.intl_chat_source == null) {
                            conversationProperty.intl_chat_source = IntlChatSource.new_();
                        }
                        if (conversationProperty.intl_love_buzz == null) {
                            conversationProperty.intl_love_buzz = ConversationLoveBuzz.new_();
                        }
                        if (conversationProperty.loveScript == null) {
                            conversationProperty.loveScript = LoveScript.new_();
                        }
                        if (conversationProperty.boost == null) {
                            conversationProperty.boost = BoostInfo.new_();
                        }
                        if (conversationProperty.likedMe == null) {
                            conversationProperty.likedMe = LikedMeInfo.new_();
                        }
                        if (conversationProperty.conversationTag == null) {
                            conversationProperty.conversationTag = ConversationTag.new_();
                        }
                        break;
                    case 10:
                        conversationProperty.liveVIP = (ConversationLiveVipInfo) nb5Var.m158743l(ConversationLiveVipInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        conversationProperty.chatInterrupt = (ChatInterrupt) nb5Var.m158743l(ChatInterrupt.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        conversationProperty.iceBreaking = (ConversationIceBreaking) nb5Var.m158743l(ConversationIceBreaking.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        conversationProperty.quickchat = (ConversationQuickChat) nb5Var.m158743l(ConversationQuickChat.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        conversationProperty.soulmatch2 = (ConversationSoulMatch2) nb5Var.m158743l(ConversationSoulMatch2.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        conversationProperty.tacitTest = (TacitTest) nb5Var.m158743l(TacitTest.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        conversationProperty.intl_chat_source = (IntlChatSource) nb5Var.m158743l(IntlChatSource.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        conversationProperty.intl_love_buzz = (ConversationLoveBuzz) nb5Var.m158743l(ConversationLoveBuzz.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        conversationProperty.loveScript = (LoveScript) nb5Var.m158743l(LoveScript.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        conversationProperty.boost = (BoostInfo) nb5Var.m158743l(BoostInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        conversationProperty.likedMe = (LikedMeInfo) nb5Var.m158743l(LikedMeInfo.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        conversationProperty.conversationTag = (ConversationTag) nb5Var.m158743l(ConversationTag.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        conversationProperty.limitedTrialSee = (LimitedTrialSee) nb5Var.m158743l(LimitedTrialSee.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (conversationProperty.liveVIP == null) {
                            conversationProperty.liveVIP = ConversationLiveVipInfo.new_();
                        }
                        if (conversationProperty.chatInterrupt == null) {
                            conversationProperty.chatInterrupt = ChatInterrupt.new_();
                        }
                        if (conversationProperty.iceBreaking == null) {
                            conversationProperty.iceBreaking = ConversationIceBreaking.new_();
                        }
                        if (conversationProperty.quickchat == null) {
                            conversationProperty.quickchat = ConversationQuickChat.new_();
                        }
                        if (conversationProperty.soulmatch2 == null) {
                            conversationProperty.soulmatch2 = ConversationSoulMatch2.new_();
                        }
                        if (conversationProperty.tacitTest == null) {
                            conversationProperty.tacitTest = TacitTest.new_();
                        }
                        if (conversationProperty.intl_chat_source == null) {
                            conversationProperty.intl_chat_source = IntlChatSource.new_();
                        }
                        if (conversationProperty.intl_love_buzz == null) {
                            conversationProperty.intl_love_buzz = ConversationLoveBuzz.new_();
                        }
                        if (conversationProperty.loveScript == null) {
                            conversationProperty.loveScript = LoveScript.new_();
                        }
                        if (conversationProperty.boost == null) {
                            conversationProperty.boost = BoostInfo.new_();
                        }
                        if (conversationProperty.likedMe == null) {
                            conversationProperty.likedMe = LikedMeInfo.new_();
                        }
                        if (conversationProperty.conversationTag == null) {
                            conversationProperty.conversationTag = ConversationTag.new_();
                            return conversationProperty;
                        }
                        break;
                }
            }
            return conversationProperty;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationProperty conversationProperty, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ConversationLiveVipInfo conversationLiveVipInfo = conversationProperty.liveVIP;
            if (conversationLiveVipInfo != null) {
                codedOutputByteBufferNano.m17254K(1, conversationLiveVipInfo, ConversationLiveVipInfo.PROTOBUF_ADAPTER);
            }
            ChatInterrupt chatInterrupt = conversationProperty.chatInterrupt;
            if (chatInterrupt != null) {
                codedOutputByteBufferNano.m17254K(2, chatInterrupt, ChatInterrupt.PROTOBUF_ADAPTER);
            }
            ConversationIceBreaking conversationIceBreaking = conversationProperty.iceBreaking;
            if (conversationIceBreaking != null) {
                codedOutputByteBufferNano.m17254K(3, conversationIceBreaking, ConversationIceBreaking.PROTOBUF_ADAPTER);
            }
            ConversationQuickChat conversationQuickChat = conversationProperty.quickchat;
            if (conversationQuickChat != null) {
                codedOutputByteBufferNano.m17254K(4, conversationQuickChat, ConversationQuickChat.PROTOBUF_ADAPTER);
            }
            ConversationSoulMatch2 conversationSoulMatch2 = conversationProperty.soulmatch2;
            if (conversationSoulMatch2 != null) {
                codedOutputByteBufferNano.m17254K(5, conversationSoulMatch2, ConversationSoulMatch2.PROTOBUF_ADAPTER);
            }
            TacitTest tacitTest = conversationProperty.tacitTest;
            if (tacitTest != null) {
                codedOutputByteBufferNano.m17254K(6, tacitTest, TacitTest.PROTOBUF_ADAPTER);
            }
            IntlChatSource intlChatSource = conversationProperty.intl_chat_source;
            if (intlChatSource != null) {
                codedOutputByteBufferNano.m17254K(7, intlChatSource, IntlChatSource.PROTOBUF_ADAPTER);
            }
            ConversationLoveBuzz conversationLoveBuzz = conversationProperty.intl_love_buzz;
            if (conversationLoveBuzz != null) {
                codedOutputByteBufferNano.m17254K(8, conversationLoveBuzz, ConversationLoveBuzz.PROTOBUF_ADAPTER);
            }
            LoveScript loveScript = conversationProperty.loveScript;
            if (loveScript != null) {
                codedOutputByteBufferNano.m17254K(9, loveScript, LoveScript.PROTOBUF_ADAPTER);
            }
            BoostInfo boostInfo = conversationProperty.boost;
            if (boostInfo != null) {
                codedOutputByteBufferNano.m17254K(10, boostInfo, BoostInfo.PROTOBUF_ADAPTER);
            }
            LikedMeInfo likedMeInfo = conversationProperty.likedMe;
            if (likedMeInfo != null) {
                codedOutputByteBufferNano.m17254K(11, likedMeInfo, LikedMeInfo.PROTOBUF_ADAPTER);
            }
            ConversationTag conversationTag = conversationProperty.conversationTag;
            if (conversationTag != null) {
                codedOutputByteBufferNano.m17254K(12, conversationTag, ConversationTag.PROTOBUF_ADAPTER);
            }
            LimitedTrialSee limitedTrialSee = conversationProperty.limitedTrialSee;
            if (limitedTrialSee != null) {
                codedOutputByteBufferNano.m17254K(13, limitedTrialSee, LimitedTrialSee.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationProperty> JSON_ADAPTER = new ObjectJsonAdapter<ConversationProperty>() { // from class: com.p1.mobile.putong.core.data.ConversationProperty.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationProperty.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationProperty newInstance() {
            return new ConversationProperty();
        }

        public boolean parseField(ConversationProperty conversationProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "soulmatch2":
                    conversationProperty.soulmatch2 = ConversationSoulMatch2.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "loveScript":
                    conversationProperty.loveScript = LoveScript.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tacitTest":
                    conversationProperty.tacitTest = TacitTest.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "intl_love_buzz":
                    conversationProperty.intl_love_buzz = ConversationLoveBuzz.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "conversationTag":
                    conversationProperty.conversationTag = ConversationTag.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "boost":
                    conversationProperty.boost = BoostInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "likedMe":
                    conversationProperty.likedMe = LikedMeInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveVIP":
                    conversationProperty.liveVIP = ConversationLiveVipInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatInterrupt":
                    conversationProperty.chatInterrupt = ChatInterrupt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "iceBreaking":
                    conversationProperty.iceBreaking = ConversationIceBreaking.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quickchat":
                    conversationProperty.quickchat = ConversationQuickChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "limitedTrialSee":
                    conversationProperty.limitedTrialSee = LimitedTrialSee.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "intl_chat_source":
                    conversationProperty.intl_chat_source = IntlChatSource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationProperty conversationProperty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "soulmatch2":
                case "loveScript":
                case "tacitTest":
                case "intl_love_buzz":
                case "conversationTag":
                case "boost":
                case "likedMe":
                case "liveVIP":
                case "chatInterrupt":
                case "iceBreaking":
                case "quickchat":
                case "limitedTrialSee":
                case "intl_chat_source":
                    return true;
                default:
                    return super.parseFieldCheck(conversationProperty, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationProperty conversationProperty, JsonGenerator jsonGenerator) throws IOException {
            if (conversationProperty.liveVIP != null) {
                jsonGenerator.writeFieldName("liveVIP");
                ConversationLiveVipInfo.JSON_ADAPTER.serialize(conversationProperty.liveVIP, jsonGenerator, true);
            }
            if (conversationProperty.chatInterrupt != null) {
                jsonGenerator.writeFieldName("chatInterrupt");
                ChatInterrupt.JSON_ADAPTER.serialize(conversationProperty.chatInterrupt, jsonGenerator, true);
            }
            if (conversationProperty.iceBreaking != null) {
                jsonGenerator.writeFieldName("iceBreaking");
                ConversationIceBreaking.JSON_ADAPTER.serialize(conversationProperty.iceBreaking, jsonGenerator, true);
            }
            if (conversationProperty.quickchat != null) {
                jsonGenerator.writeFieldName("quickchat");
                ConversationQuickChat.JSON_ADAPTER.serialize(conversationProperty.quickchat, jsonGenerator, true);
            }
            if (conversationProperty.soulmatch2 != null) {
                jsonGenerator.writeFieldName("soulmatch2");
                ConversationSoulMatch2.JSON_ADAPTER.serialize(conversationProperty.soulmatch2, jsonGenerator, true);
            }
            if (conversationProperty.tacitTest != null) {
                jsonGenerator.writeFieldName("tacitTest");
                TacitTest.JSON_ADAPTER.serialize(conversationProperty.tacitTest, jsonGenerator, true);
            }
            if (conversationProperty.intl_chat_source != null) {
                jsonGenerator.writeFieldName("intl_chat_source");
                IntlChatSource.JSON_ADAPTER.serialize(conversationProperty.intl_chat_source, jsonGenerator, true);
            }
            if (conversationProperty.intl_love_buzz != null) {
                jsonGenerator.writeFieldName("intl_love_buzz");
                ConversationLoveBuzz.JSON_ADAPTER.serialize(conversationProperty.intl_love_buzz, jsonGenerator, true);
            }
            if (conversationProperty.loveScript != null) {
                jsonGenerator.writeFieldName("loveScript");
                LoveScript.JSON_ADAPTER.serialize(conversationProperty.loveScript, jsonGenerator, true);
            }
            if (conversationProperty.boost != null) {
                jsonGenerator.writeFieldName("boost");
                BoostInfo.JSON_ADAPTER.serialize(conversationProperty.boost, jsonGenerator, true);
            }
            if (conversationProperty.likedMe != null) {
                jsonGenerator.writeFieldName("likedMe");
                LikedMeInfo.JSON_ADAPTER.serialize(conversationProperty.likedMe, jsonGenerator, true);
            }
            if (conversationProperty.conversationTag != null) {
                jsonGenerator.writeFieldName("conversationTag");
                ConversationTag.JSON_ADAPTER.serialize(conversationProperty.conversationTag, jsonGenerator, true);
            }
            if (conversationProperty.limitedTrialSee != null) {
                jsonGenerator.writeFieldName("limitedTrialSee");
                LimitedTrialSee.JSON_ADAPTER.serialize(conversationProperty.limitedTrialSee, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationProperty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationProperty new_() {
        ConversationProperty conversationProperty = new ConversationProperty();
        conversationProperty.nullCheck();
        return conversationProperty;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationProperty mo223809clone() {
        ConversationProperty conversationProperty = new ConversationProperty();
        ConversationLiveVipInfo conversationLiveVipInfo = this.liveVIP;
        if (conversationLiveVipInfo != null) {
            conversationProperty.liveVIP = conversationLiveVipInfo.mo223809clone();
        }
        ChatInterrupt chatInterrupt = this.chatInterrupt;
        if (chatInterrupt != null) {
            conversationProperty.chatInterrupt = chatInterrupt.mo223809clone();
        }
        ConversationIceBreaking conversationIceBreaking = this.iceBreaking;
        if (conversationIceBreaking != null) {
            conversationProperty.iceBreaking = conversationIceBreaking.mo223809clone();
        }
        ConversationQuickChat conversationQuickChat = this.quickchat;
        if (conversationQuickChat != null) {
            conversationProperty.quickchat = conversationQuickChat.mo223809clone();
        }
        ConversationSoulMatch2 conversationSoulMatch2 = this.soulmatch2;
        if (conversationSoulMatch2 != null) {
            conversationProperty.soulmatch2 = conversationSoulMatch2.mo223809clone();
        }
        TacitTest tacitTest = this.tacitTest;
        if (tacitTest != null) {
            conversationProperty.tacitTest = tacitTest.mo223809clone();
        }
        IntlChatSource intlChatSource = this.intl_chat_source;
        if (intlChatSource != null) {
            conversationProperty.intl_chat_source = intlChatSource.mo223809clone();
        }
        ConversationLoveBuzz conversationLoveBuzz = this.intl_love_buzz;
        if (conversationLoveBuzz != null) {
            conversationProperty.intl_love_buzz = conversationLoveBuzz.mo223809clone();
        }
        LoveScript loveScript = this.loveScript;
        if (loveScript != null) {
            conversationProperty.loveScript = loveScript.mo223809clone();
        }
        BoostInfo boostInfo = this.boost;
        if (boostInfo != null) {
            conversationProperty.boost = boostInfo.mo223809clone();
        }
        LikedMeInfo likedMeInfo = this.likedMe;
        if (likedMeInfo != null) {
            conversationProperty.likedMe = likedMeInfo.mo223809clone();
        }
        ConversationTag conversationTag = this.conversationTag;
        if (conversationTag != null) {
            conversationProperty.conversationTag = conversationTag.mo223809clone();
        }
        LimitedTrialSee limitedTrialSee = this.limitedTrialSee;
        if (limitedTrialSee != null) {
            conversationProperty.limitedTrialSee = limitedTrialSee.mo223809clone();
        }
        return conversationProperty;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationProperty)) {
            return false;
        }
        ConversationProperty conversationProperty = (ConversationProperty) obj;
        return ValueObject.util_equals(this.liveVIP, conversationProperty.liveVIP) && ValueObject.util_equals(this.chatInterrupt, conversationProperty.chatInterrupt) && ValueObject.util_equals(this.iceBreaking, conversationProperty.iceBreaking) && ValueObject.util_equals(this.quickchat, conversationProperty.quickchat) && ValueObject.util_equals(this.soulmatch2, conversationProperty.soulmatch2) && ValueObject.util_equals(this.tacitTest, conversationProperty.tacitTest) && ValueObject.util_equals(this.intl_chat_source, conversationProperty.intl_chat_source) && ValueObject.util_equals(this.intl_love_buzz, conversationProperty.intl_love_buzz) && ValueObject.util_equals(this.loveScript, conversationProperty.loveScript) && ValueObject.util_equals(this.boost, conversationProperty.boost) && ValueObject.util_equals(this.likedMe, conversationProperty.likedMe) && ValueObject.util_equals(this.conversationTag, conversationProperty.conversationTag) && ValueObject.util_equals(this.limitedTrialSee, conversationProperty.limitedTrialSee);
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
        ConversationLiveVipInfo conversationLiveVipInfo = this.liveVIP;
        int iHashCode = (i2 + (conversationLiveVipInfo != null ? conversationLiveVipInfo.hashCode() : 0)) * 41;
        ChatInterrupt chatInterrupt = this.chatInterrupt;
        int iHashCode2 = (iHashCode + (chatInterrupt != null ? chatInterrupt.hashCode() : 0)) * 41;
        ConversationIceBreaking conversationIceBreaking = this.iceBreaking;
        int iHashCode3 = (iHashCode2 + (conversationIceBreaking != null ? conversationIceBreaking.hashCode() : 0)) * 41;
        ConversationQuickChat conversationQuickChat = this.quickchat;
        int iHashCode4 = (iHashCode3 + (conversationQuickChat != null ? conversationQuickChat.hashCode() : 0)) * 41;
        ConversationSoulMatch2 conversationSoulMatch2 = this.soulmatch2;
        int iHashCode5 = (iHashCode4 + (conversationSoulMatch2 != null ? conversationSoulMatch2.hashCode() : 0)) * 41;
        TacitTest tacitTest = this.tacitTest;
        int iHashCode6 = (iHashCode5 + (tacitTest != null ? tacitTest.hashCode() : 0)) * 41;
        IntlChatSource intlChatSource = this.intl_chat_source;
        int iHashCode7 = (iHashCode6 + (intlChatSource != null ? intlChatSource.hashCode() : 0)) * 41;
        ConversationLoveBuzz conversationLoveBuzz = this.intl_love_buzz;
        int iHashCode8 = (iHashCode7 + (conversationLoveBuzz != null ? conversationLoveBuzz.hashCode() : 0)) * 41;
        LoveScript loveScript = this.loveScript;
        int iHashCode9 = (iHashCode8 + (loveScript != null ? loveScript.hashCode() : 0)) * 41;
        BoostInfo boostInfo = this.boost;
        int iHashCode10 = (iHashCode9 + (boostInfo != null ? boostInfo.hashCode() : 0)) * 41;
        LikedMeInfo likedMeInfo = this.likedMe;
        int iHashCode11 = (iHashCode10 + (likedMeInfo != null ? likedMeInfo.hashCode() : 0)) * 41;
        ConversationTag conversationTag = this.conversationTag;
        int iHashCode12 = (iHashCode11 + (conversationTag != null ? conversationTag.hashCode() : 0)) * 41;
        LimitedTrialSee limitedTrialSee = this.limitedTrialSee;
        int iHashCode13 = iHashCode12 + (limitedTrialSee != null ? limitedTrialSee.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveVIP == null) {
            this.liveVIP = ConversationLiveVipInfo.new_();
        }
        if (this.chatInterrupt == null) {
            this.chatInterrupt = ChatInterrupt.new_();
        }
        if (this.iceBreaking == null) {
            this.iceBreaking = ConversationIceBreaking.new_();
        }
        if (this.quickchat == null) {
            this.quickchat = ConversationQuickChat.new_();
        }
        if (this.soulmatch2 == null) {
            this.soulmatch2 = ConversationSoulMatch2.new_();
        }
        if (this.tacitTest == null) {
            this.tacitTest = TacitTest.new_();
        }
        if (this.intl_chat_source == null) {
            this.intl_chat_source = IntlChatSource.new_();
        }
        if (this.intl_love_buzz == null) {
            this.intl_love_buzz = ConversationLoveBuzz.new_();
        }
        if (this.loveScript == null) {
            this.loveScript = LoveScript.new_();
        }
        if (this.boost == null) {
            this.boost = BoostInfo.new_();
        }
        if (this.likedMe == null) {
            this.likedMe = LikedMeInfo.new_();
        }
        if (this.conversationTag == null) {
            this.conversationTag = ConversationTag.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
