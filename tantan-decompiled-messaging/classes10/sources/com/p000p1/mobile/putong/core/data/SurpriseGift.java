package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SurpriseGift extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "surprisegift";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ChatPartners chatPartners;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String matchUserId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String surpriseGiftType;
    public static ProtobufAdapter<SurpriseGift> PROTOBUF_ADAPTER = new MessageNanoAdapter<SurpriseGift>() { // from class: com.p1.mobile.putong.core.data.SurpriseGift.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SurpriseGift surpriseGift) {
            String str = surpriseGift.surpriseGiftType;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = surpriseGift.matchUserId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ChatPartners chatPartners = surpriseGift.chatPartners;
            if (chatPartners != null) {
                iO += CodedOutputByteBufferNano.l(3, chatPartners, ChatPartners.PROTOBUF_ADAPTER);
            }
            ((MessageNano) surpriseGift).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SurpriseGift m15834parse(nb5 nb5Var) throws IOException {
            SurpriseGift surpriseGift = new SurpriseGift();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (surpriseGift.surpriseGiftType == null) {
                        surpriseGift.surpriseGiftType = "";
                    }
                    if (surpriseGift.matchUserId == null) {
                        surpriseGift.matchUserId = "";
                    }
                    if (surpriseGift.chatPartners != null) {
                        break;
                    }
                    surpriseGift.chatPartners = ChatPartners.new_();
                    break;
                }
                if (iU == 10) {
                    surpriseGift.surpriseGiftType = nb5Var.s();
                } else if (iU == 18) {
                    surpriseGift.matchUserId = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (surpriseGift.surpriseGiftType == null) {
                            surpriseGift.surpriseGiftType = "";
                        }
                        if (surpriseGift.matchUserId == null) {
                            surpriseGift.matchUserId = "";
                        }
                        if (surpriseGift.chatPartners != null) {
                            break;
                        }
                        surpriseGift.chatPartners = ChatPartners.new_();
                        return surpriseGift;
                    }
                    surpriseGift.chatPartners = (ChatPartners) nb5Var.l(ChatPartners.PROTOBUF_ADAPTER);
                }
            }
            return surpriseGift;
        }

        public void serialize(SurpriseGift surpriseGift, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = surpriseGift.surpriseGiftType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = surpriseGift.matchUserId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            ChatPartners chatPartners = surpriseGift.chatPartners;
            if (chatPartners != null) {
                codedOutputByteBufferNano.K(3, chatPartners, ChatPartners.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SurpriseGift> JSON_ADAPTER = new ObjectJsonAdapter<SurpriseGift>() { // from class: com.p1.mobile.putong.core.data.SurpriseGift.2
        public Class getDataClass() {
            return SurpriseGift.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SurpriseGift m15835newInstance() {
            return new SurpriseGift();
        }

        public boolean parseField(SurpriseGift surpriseGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chatPartners":
                    surpriseGift.chatPartners = (ChatPartners) ChatPartners.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "surpriseGiftType":
                    surpriseGift.surpriseGiftType = jsonParser.getValueAsString();
                    return true;
                case "matchUserId":
                    surpriseGift.matchUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SurpriseGift surpriseGift, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "chatPartners":
                case "surpriseGiftType":
                case "matchUserId":
                    return true;
                default:
                    return super.parseFieldCheck(surpriseGift, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SurpriseGift surpriseGift, JsonGenerator jsonGenerator) throws IOException {
            String str = surpriseGift.surpriseGiftType;
            if (str != null) {
                jsonGenerator.writeStringField("surpriseGiftType", str);
            }
            String str2 = surpriseGift.matchUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("matchUserId", str2);
            }
            if (surpriseGift.chatPartners != null) {
                jsonGenerator.writeFieldName("chatPartners");
                ChatPartners.JSON_ADAPTER.serialize(surpriseGift.chatPartners, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SurpriseGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SurpriseGift) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SurpriseGift new_() {
        SurpriseGift surpriseGift = new SurpriseGift();
        surpriseGift.nullCheck();
        return surpriseGift;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SurpriseGift m15833clone() {
        SurpriseGift surpriseGift = new SurpriseGift();
        surpriseGift.surpriseGiftType = this.surpriseGiftType;
        surpriseGift.matchUserId = this.matchUserId;
        ChatPartners chatPartners = this.chatPartners;
        if (chatPartners != null) {
            surpriseGift.chatPartners = chatPartners.m12116clone();
        }
        return surpriseGift;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurpriseGift)) {
            return false;
        }
        SurpriseGift surpriseGift = (SurpriseGift) obj;
        return ValueObject.util_equals(this.surpriseGiftType, surpriseGift.surpriseGiftType) && ValueObject.util_equals(this.matchUserId, surpriseGift.matchUserId) && ValueObject.util_equals(this.chatPartners, surpriseGift.chatPartners);
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
        String str = this.surpriseGiftType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.matchUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        ChatPartners chatPartners = this.chatPartners;
        int iHashCode3 = iHashCode2 + (chatPartners != null ? chatPartners.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.surpriseGiftType == null) {
            this.surpriseGiftType = "";
        }
        if (this.matchUserId == null) {
            this.matchUserId = "";
        }
        if (this.chatPartners == null) {
            this.chatPartners = ChatPartners.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
