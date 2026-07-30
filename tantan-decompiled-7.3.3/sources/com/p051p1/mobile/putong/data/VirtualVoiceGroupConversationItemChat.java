package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class VirtualVoiceGroupConversationItemChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "virtualvoicegroupconversationitemchat";

    @NonNull
    @ProtobufIndex(index = 6)
    public String commonMsg;

    @NonNull
    @ProtobufIndex(index = 4)
    public String currentMsg;

    @NonNull
    @ProtobufIndex(index = 3)
    public String currentSenderName;

    @ProtobufIndex(index = 2)
    public int currentSeq;

    @ProtobufIndex(index = 5)
    public long currentTime;

    @ProtobufIndex(index = 1)
    public int unreadedCount;
    public static ProtobufAdapter<VirtualVoiceGroupConversationItemChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<VirtualVoiceGroupConversationItemChat>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, virtualVoiceGroupConversationItemChat.unreadedCount) + CodedOutputByteBufferNano.m17281h(2, virtualVoiceGroupConversationItemChat.currentSeq);
            String str = virtualVoiceGroupConversationItemChat.currentSenderName;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = virtualVoiceGroupConversationItemChat.currentMsg;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            int iM17283j = iM17281h + CodedOutputByteBufferNano.m17283j(5, virtualVoiceGroupConversationItemChat.currentTime);
            String str3 = virtualVoiceGroupConversationItemChat.commonMsg;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(6, str3);
            }
            virtualVoiceGroupConversationItemChat.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceGroupConversationItemChat parse(nc5 nc5Var) throws IOException {
            VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = new VirtualVoiceGroupConversationItemChat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (virtualVoiceGroupConversationItemChat.currentSenderName == null) {
                        virtualVoiceGroupConversationItemChat.currentSenderName = "";
                    }
                    if (virtualVoiceGroupConversationItemChat.currentMsg == null) {
                        virtualVoiceGroupConversationItemChat.currentMsg = "";
                    }
                    if (virtualVoiceGroupConversationItemChat.commonMsg != null) {
                        break;
                    }
                    virtualVoiceGroupConversationItemChat.commonMsg = "";
                    break;
                }
                if (iM162497u == 8) {
                    virtualVoiceGroupConversationItemChat.unreadedCount = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    virtualVoiceGroupConversationItemChat.currentSeq = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    virtualVoiceGroupConversationItemChat.currentSenderName = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    virtualVoiceGroupConversationItemChat.currentMsg = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    virtualVoiceGroupConversationItemChat.currentTime = nc5Var.m162487k();
                } else {
                    if (iM162497u != 50) {
                        if (virtualVoiceGroupConversationItemChat.currentSenderName == null) {
                            virtualVoiceGroupConversationItemChat.currentSenderName = "";
                        }
                        if (virtualVoiceGroupConversationItemChat.currentMsg == null) {
                            virtualVoiceGroupConversationItemChat.currentMsg = "";
                        }
                        if (virtualVoiceGroupConversationItemChat.commonMsg != null) {
                            break;
                        }
                        virtualVoiceGroupConversationItemChat.commonMsg = "";
                        return virtualVoiceGroupConversationItemChat;
                    }
                    virtualVoiceGroupConversationItemChat.commonMsg = nc5Var.m162495s();
                }
            }
            return virtualVoiceGroupConversationItemChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, virtualVoiceGroupConversationItemChat.unreadedCount);
            codedOutputByteBufferNano.m17305G(2, virtualVoiceGroupConversationItemChat.currentSeq);
            String str = virtualVoiceGroupConversationItemChat.currentSenderName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = virtualVoiceGroupConversationItemChat.currentMsg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            codedOutputByteBufferNano.m17307I(5, virtualVoiceGroupConversationItemChat.currentTime);
            String str3 = virtualVoiceGroupConversationItemChat.commonMsg;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(6, str3);
            }
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversationItemChat> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversationItemChat>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceGroupConversationItemChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VirtualVoiceGroupConversationItemChat newInstance() {
            return new VirtualVoiceGroupConversationItemChat();
        }

        public boolean parseField(VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "commonMsg":
                    virtualVoiceGroupConversationItemChat.commonMsg = jsonParser.getValueAsString();
                    return true;
                case "currentMsg":
                    virtualVoiceGroupConversationItemChat.currentMsg = jsonParser.getValueAsString();
                    return true;
                case "currentSeq":
                    virtualVoiceGroupConversationItemChat.currentSeq = jsonParser.getValueAsInt();
                    return true;
                case "currentTime":
                    virtualVoiceGroupConversationItemChat.currentTime = jsonParser.getValueAsLong();
                    return true;
                case "unreadedCount":
                    virtualVoiceGroupConversationItemChat.unreadedCount = jsonParser.getValueAsInt();
                    return true;
                case "currentSenderName":
                    virtualVoiceGroupConversationItemChat.currentSenderName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "commonMsg":
                case "currentMsg":
                case "currentSeq":
                case "currentTime":
                case "unreadedCount":
                case "currentSenderName":
                    return true;
                default:
                    return super.parseFieldCheck(virtualVoiceGroupConversationItemChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadedCount", virtualVoiceGroupConversationItemChat.unreadedCount);
            jsonGenerator.writeNumberField("currentSeq", virtualVoiceGroupConversationItemChat.currentSeq);
            String str = virtualVoiceGroupConversationItemChat.currentSenderName;
            if (str != null) {
                jsonGenerator.writeStringField("currentSenderName", str);
            }
            String str2 = virtualVoiceGroupConversationItemChat.currentMsg;
            if (str2 != null) {
                jsonGenerator.writeStringField("currentMsg", str2);
            }
            jsonGenerator.writeNumberField("currentTime", virtualVoiceGroupConversationItemChat.currentTime);
            String str3 = virtualVoiceGroupConversationItemChat.commonMsg;
            if (str3 != null) {
                jsonGenerator.writeStringField("commonMsg", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversationItemChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceGroupConversationItemChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VirtualVoiceGroupConversationItemChat new_() {
        VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = new VirtualVoiceGroupConversationItemChat();
        virtualVoiceGroupConversationItemChat.nullCheck();
        return virtualVoiceGroupConversationItemChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VirtualVoiceGroupConversationItemChat mo225055clone() {
        VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = new VirtualVoiceGroupConversationItemChat();
        virtualVoiceGroupConversationItemChat.unreadedCount = this.unreadedCount;
        virtualVoiceGroupConversationItemChat.currentSeq = this.currentSeq;
        virtualVoiceGroupConversationItemChat.currentSenderName = this.currentSenderName;
        virtualVoiceGroupConversationItemChat.currentMsg = this.currentMsg;
        virtualVoiceGroupConversationItemChat.currentTime = this.currentTime;
        virtualVoiceGroupConversationItemChat.commonMsg = this.commonMsg;
        return virtualVoiceGroupConversationItemChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VirtualVoiceGroupConversationItemChat)) {
            return false;
        }
        VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = (VirtualVoiceGroupConversationItemChat) obj;
        return this.unreadedCount == virtualVoiceGroupConversationItemChat.unreadedCount && this.currentSeq == virtualVoiceGroupConversationItemChat.currentSeq && ValueObject.util_equals(this.currentSenderName, virtualVoiceGroupConversationItemChat.currentSenderName) && ValueObject.util_equals(this.currentMsg, virtualVoiceGroupConversationItemChat.currentMsg) && this.currentTime == virtualVoiceGroupConversationItemChat.currentTime && ValueObject.util_equals(this.commonMsg, virtualVoiceGroupConversationItemChat.commonMsg);
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
        int i2 = ((((i * 41) + this.unreadedCount) * 41) + this.currentSeq) * 41;
        String str = this.currentSenderName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.currentMsg;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.currentTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.commonMsg;
        int iHashCode3 = i3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.currentSenderName == null) {
            this.currentSenderName = "";
        }
        if (this.currentMsg == null) {
            this.currentMsg = "";
        }
        if (this.commonMsg == null) {
            this.commonMsg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
