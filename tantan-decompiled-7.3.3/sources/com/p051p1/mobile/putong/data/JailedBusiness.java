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
public class JailedBusiness extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jailedbusiness";

    @NonNull
    @ProtobufIndex(index = 4)
    public JailedGroupChat changeProfile;

    @NonNull
    @ProtobufIndex(index = 8)
    public JailedGroupChat chat;

    @NonNull
    @ProtobufIndex(index = 6)
    public JailedGroupChat greeting;

    @NonNull
    @ProtobufIndex(index = 1)
    public JailedGroupChat groupChat;

    @NonNull
    @ProtobufIndex(index = 7)
    public JailedGroupChat live;

    @NonNull
    @ProtobufIndex(index = 2)
    public JailedGroupChat moment;

    @NonNull
    @ProtobufIndex(index = 3)
    public JailedGroupChat momentComment;

    @NonNull
    @ProtobufIndex(index = 5)
    public JailedGroupChat swipe;
    public static ProtobufAdapter<JailedBusiness> PROTOBUF_ADAPTER = new MessageNanoAdapter<JailedBusiness>() { // from class: com.p1.mobile.putong.data.JailedBusiness.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(JailedBusiness jailedBusiness) {
            JailedGroupChat jailedGroupChat = jailedBusiness.groupChat;
            int iM17285l = jailedGroupChat != null ? CodedOutputByteBufferNano.m17285l(1, jailedGroupChat, JailedGroupChat.PROTOBUF_ADAPTER) : 0;
            JailedGroupChat jailedGroupChat2 = jailedBusiness.moment;
            if (jailedGroupChat2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, jailedGroupChat2, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat3 = jailedBusiness.momentComment;
            if (jailedGroupChat3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, jailedGroupChat3, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat4 = jailedBusiness.changeProfile;
            if (jailedGroupChat4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, jailedGroupChat4, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat5 = jailedBusiness.swipe;
            if (jailedGroupChat5 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, jailedGroupChat5, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat6 = jailedBusiness.greeting;
            if (jailedGroupChat6 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, jailedGroupChat6, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat7 = jailedBusiness.live;
            if (jailedGroupChat7 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(7, jailedGroupChat7, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat8 = jailedBusiness.chat;
            if (jailedGroupChat8 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(8, jailedGroupChat8, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            jailedBusiness.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public JailedBusiness parse(nc5 nc5Var) throws IOException {
            JailedBusiness jailedBusiness = new JailedBusiness();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (jailedBusiness.groupChat == null) {
                        jailedBusiness.groupChat = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.moment == null) {
                        jailedBusiness.moment = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.momentComment == null) {
                        jailedBusiness.momentComment = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.changeProfile == null) {
                        jailedBusiness.changeProfile = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.swipe == null) {
                        jailedBusiness.swipe = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.greeting == null) {
                        jailedBusiness.greeting = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.live == null) {
                        jailedBusiness.live = JailedGroupChat.new_();
                    }
                    if (jailedBusiness.chat != null) {
                        break;
                    }
                    jailedBusiness.chat = JailedGroupChat.new_();
                    break;
                }
                if (iM162497u == 10) {
                    jailedBusiness.groupChat = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    jailedBusiness.moment = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    jailedBusiness.momentComment = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    jailedBusiness.changeProfile = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    jailedBusiness.swipe = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 50) {
                    jailedBusiness.greeting = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 58) {
                    jailedBusiness.live = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 66) {
                        if (jailedBusiness.groupChat == null) {
                            jailedBusiness.groupChat = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.moment == null) {
                            jailedBusiness.moment = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.momentComment == null) {
                            jailedBusiness.momentComment = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.changeProfile == null) {
                            jailedBusiness.changeProfile = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.swipe == null) {
                            jailedBusiness.swipe = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.greeting == null) {
                            jailedBusiness.greeting = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.live == null) {
                            jailedBusiness.live = JailedGroupChat.new_();
                        }
                        if (jailedBusiness.chat != null) {
                            break;
                        }
                        jailedBusiness.chat = JailedGroupChat.new_();
                        return jailedBusiness;
                    }
                    jailedBusiness.chat = (JailedGroupChat) nc5Var.m162488l(JailedGroupChat.PROTOBUF_ADAPTER);
                }
            }
            return jailedBusiness;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(JailedBusiness jailedBusiness, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            JailedGroupChat jailedGroupChat = jailedBusiness.groupChat;
            if (jailedGroupChat != null) {
                codedOutputByteBufferNano.m17309K(1, jailedGroupChat, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat2 = jailedBusiness.moment;
            if (jailedGroupChat2 != null) {
                codedOutputByteBufferNano.m17309K(2, jailedGroupChat2, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat3 = jailedBusiness.momentComment;
            if (jailedGroupChat3 != null) {
                codedOutputByteBufferNano.m17309K(3, jailedGroupChat3, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat4 = jailedBusiness.changeProfile;
            if (jailedGroupChat4 != null) {
                codedOutputByteBufferNano.m17309K(4, jailedGroupChat4, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat5 = jailedBusiness.swipe;
            if (jailedGroupChat5 != null) {
                codedOutputByteBufferNano.m17309K(5, jailedGroupChat5, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat6 = jailedBusiness.greeting;
            if (jailedGroupChat6 != null) {
                codedOutputByteBufferNano.m17309K(6, jailedGroupChat6, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat7 = jailedBusiness.live;
            if (jailedGroupChat7 != null) {
                codedOutputByteBufferNano.m17309K(7, jailedGroupChat7, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat8 = jailedBusiness.chat;
            if (jailedGroupChat8 != null) {
                codedOutputByteBufferNano.m17309K(8, jailedGroupChat8, JailedGroupChat.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<JailedBusiness> JSON_ADAPTER = new ObjectJsonAdapter<JailedBusiness>() { // from class: com.p1.mobile.putong.data.JailedBusiness.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return JailedBusiness.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public JailedBusiness newInstance() {
            return new JailedBusiness();
        }

        public boolean parseField(JailedBusiness jailedBusiness, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "MOMENT":
                    jailedBusiness.moment = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "groupChat":
                    jailedBusiness.groupChat = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "CHANGE_PROFILE":
                    jailedBusiness.changeProfile = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "CHAT":
                    jailedBusiness.chat = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "LIVE":
                    jailedBusiness.live = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "MOMENT_COMMENT":
                    jailedBusiness.momentComment = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "SWIPE":
                    jailedBusiness.swipe = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "GREETING":
                    jailedBusiness.greeting = JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(JailedBusiness jailedBusiness, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "MOMENT":
                case "groupChat":
                case "CHANGE_PROFILE":
                case "CHAT":
                case "LIVE":
                case "MOMENT_COMMENT":
                case "SWIPE":
                case "GREETING":
                    return true;
                default:
                    return super.parseFieldCheck(jailedBusiness, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(JailedBusiness jailedBusiness, JsonGenerator jsonGenerator) throws IOException {
            if (jailedBusiness.groupChat != null) {
                jsonGenerator.writeFieldName("groupChat");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.groupChat, jsonGenerator, true);
            }
            if (jailedBusiness.moment != null) {
                jsonGenerator.writeFieldName("MOMENT");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.moment, jsonGenerator, true);
            }
            if (jailedBusiness.momentComment != null) {
                jsonGenerator.writeFieldName("MOMENT_COMMENT");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.momentComment, jsonGenerator, true);
            }
            if (jailedBusiness.changeProfile != null) {
                jsonGenerator.writeFieldName("CHANGE_PROFILE");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.changeProfile, jsonGenerator, true);
            }
            if (jailedBusiness.swipe != null) {
                jsonGenerator.writeFieldName("SWIPE");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.swipe, jsonGenerator, true);
            }
            if (jailedBusiness.greeting != null) {
                jsonGenerator.writeFieldName("GREETING");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.greeting, jsonGenerator, true);
            }
            if (jailedBusiness.live != null) {
                jsonGenerator.writeFieldName("LIVE");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.live, jsonGenerator, true);
            }
            if (jailedBusiness.chat != null) {
                jsonGenerator.writeFieldName("CHAT");
                JailedGroupChat.JSON_ADAPTER.serialize(jailedBusiness.chat, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JailedBusiness) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JailedBusiness) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JailedBusiness new_() {
        JailedBusiness jailedBusiness = new JailedBusiness();
        jailedBusiness.nullCheck();
        return jailedBusiness;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public JailedBusiness mo225055clone() {
        JailedBusiness jailedBusiness = new JailedBusiness();
        JailedGroupChat jailedGroupChat = this.groupChat;
        if (jailedGroupChat != null) {
            jailedBusiness.groupChat = jailedGroupChat.mo225055clone();
        }
        JailedGroupChat jailedGroupChat2 = this.moment;
        if (jailedGroupChat2 != null) {
            jailedBusiness.moment = jailedGroupChat2.mo225055clone();
        }
        JailedGroupChat jailedGroupChat3 = this.momentComment;
        if (jailedGroupChat3 != null) {
            jailedBusiness.momentComment = jailedGroupChat3.mo225055clone();
        }
        JailedGroupChat jailedGroupChat4 = this.changeProfile;
        if (jailedGroupChat4 != null) {
            jailedBusiness.changeProfile = jailedGroupChat4.mo225055clone();
        }
        JailedGroupChat jailedGroupChat5 = this.swipe;
        if (jailedGroupChat5 != null) {
            jailedBusiness.swipe = jailedGroupChat5.mo225055clone();
        }
        JailedGroupChat jailedGroupChat6 = this.greeting;
        if (jailedGroupChat6 != null) {
            jailedBusiness.greeting = jailedGroupChat6.mo225055clone();
        }
        JailedGroupChat jailedGroupChat7 = this.live;
        if (jailedGroupChat7 != null) {
            jailedBusiness.live = jailedGroupChat7.mo225055clone();
        }
        JailedGroupChat jailedGroupChat8 = this.chat;
        if (jailedGroupChat8 != null) {
            jailedBusiness.chat = jailedGroupChat8.mo225055clone();
        }
        return jailedBusiness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JailedBusiness)) {
            return false;
        }
        JailedBusiness jailedBusiness = (JailedBusiness) obj;
        return ValueObject.util_equals(this.groupChat, jailedBusiness.groupChat) && ValueObject.util_equals(this.moment, jailedBusiness.moment) && ValueObject.util_equals(this.momentComment, jailedBusiness.momentComment) && ValueObject.util_equals(this.changeProfile, jailedBusiness.changeProfile) && ValueObject.util_equals(this.swipe, jailedBusiness.swipe) && ValueObject.util_equals(this.greeting, jailedBusiness.greeting) && ValueObject.util_equals(this.live, jailedBusiness.live) && ValueObject.util_equals(this.chat, jailedBusiness.chat);
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
        JailedGroupChat jailedGroupChat = this.groupChat;
        int iHashCode = (i2 + (jailedGroupChat != null ? jailedGroupChat.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat2 = this.moment;
        int iHashCode2 = (iHashCode + (jailedGroupChat2 != null ? jailedGroupChat2.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat3 = this.momentComment;
        int iHashCode3 = (iHashCode2 + (jailedGroupChat3 != null ? jailedGroupChat3.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat4 = this.changeProfile;
        int iHashCode4 = (iHashCode3 + (jailedGroupChat4 != null ? jailedGroupChat4.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat5 = this.swipe;
        int iHashCode5 = (iHashCode4 + (jailedGroupChat5 != null ? jailedGroupChat5.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat6 = this.greeting;
        int iHashCode6 = (iHashCode5 + (jailedGroupChat6 != null ? jailedGroupChat6.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat7 = this.live;
        int iHashCode7 = (iHashCode6 + (jailedGroupChat7 != null ? jailedGroupChat7.hashCode() : 0)) * 41;
        JailedGroupChat jailedGroupChat8 = this.chat;
        int iHashCode8 = iHashCode7 + (jailedGroupChat8 != null ? jailedGroupChat8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupChat == null) {
            this.groupChat = JailedGroupChat.new_();
        }
        if (this.moment == null) {
            this.moment = JailedGroupChat.new_();
        }
        if (this.momentComment == null) {
            this.momentComment = JailedGroupChat.new_();
        }
        if (this.changeProfile == null) {
            this.changeProfile = JailedGroupChat.new_();
        }
        if (this.swipe == null) {
            this.swipe = JailedGroupChat.new_();
        }
        if (this.greeting == null) {
            this.greeting = JailedGroupChat.new_();
        }
        if (this.live == null) {
            this.live = JailedGroupChat.new_();
        }
        if (this.chat == null) {
            this.chat = JailedGroupChat.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
