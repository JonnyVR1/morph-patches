package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(JailedBusiness jailedBusiness) {
            JailedGroupChat jailedGroupChat = jailedBusiness.groupChat;
            int iL = jailedGroupChat != null ? CodedOutputByteBufferNano.l(1, jailedGroupChat, JailedGroupChat.PROTOBUF_ADAPTER) : 0;
            JailedGroupChat jailedGroupChat2 = jailedBusiness.moment;
            if (jailedGroupChat2 != null) {
                iL += CodedOutputByteBufferNano.l(2, jailedGroupChat2, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat3 = jailedBusiness.momentComment;
            if (jailedGroupChat3 != null) {
                iL += CodedOutputByteBufferNano.l(3, jailedGroupChat3, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat4 = jailedBusiness.changeProfile;
            if (jailedGroupChat4 != null) {
                iL += CodedOutputByteBufferNano.l(4, jailedGroupChat4, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat5 = jailedBusiness.swipe;
            if (jailedGroupChat5 != null) {
                iL += CodedOutputByteBufferNano.l(5, jailedGroupChat5, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat6 = jailedBusiness.greeting;
            if (jailedGroupChat6 != null) {
                iL += CodedOutputByteBufferNano.l(6, jailedGroupChat6, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat7 = jailedBusiness.live;
            if (jailedGroupChat7 != null) {
                iL += CodedOutputByteBufferNano.l(7, jailedGroupChat7, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat8 = jailedBusiness.chat;
            if (jailedGroupChat8 != null) {
                iL += CodedOutputByteBufferNano.l(8, jailedGroupChat8, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            ((MessageNano) jailedBusiness).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public JailedBusiness m18268parse(nb5 nb5Var) throws IOException {
            JailedBusiness jailedBusiness = new JailedBusiness();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    jailedBusiness.groupChat = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    jailedBusiness.moment = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    jailedBusiness.momentComment = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    jailedBusiness.changeProfile = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    jailedBusiness.swipe = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    jailedBusiness.greeting = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else if (iU == 58) {
                    jailedBusiness.live = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 66) {
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
                    jailedBusiness.chat = (JailedGroupChat) nb5Var.l(JailedGroupChat.PROTOBUF_ADAPTER);
                }
            }
            return jailedBusiness;
        }

        public void serialize(JailedBusiness jailedBusiness, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            JailedGroupChat jailedGroupChat = jailedBusiness.groupChat;
            if (jailedGroupChat != null) {
                codedOutputByteBufferNano.K(1, jailedGroupChat, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat2 = jailedBusiness.moment;
            if (jailedGroupChat2 != null) {
                codedOutputByteBufferNano.K(2, jailedGroupChat2, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat3 = jailedBusiness.momentComment;
            if (jailedGroupChat3 != null) {
                codedOutputByteBufferNano.K(3, jailedGroupChat3, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat4 = jailedBusiness.changeProfile;
            if (jailedGroupChat4 != null) {
                codedOutputByteBufferNano.K(4, jailedGroupChat4, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat5 = jailedBusiness.swipe;
            if (jailedGroupChat5 != null) {
                codedOutputByteBufferNano.K(5, jailedGroupChat5, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat6 = jailedBusiness.greeting;
            if (jailedGroupChat6 != null) {
                codedOutputByteBufferNano.K(6, jailedGroupChat6, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat7 = jailedBusiness.live;
            if (jailedGroupChat7 != null) {
                codedOutputByteBufferNano.K(7, jailedGroupChat7, JailedGroupChat.PROTOBUF_ADAPTER);
            }
            JailedGroupChat jailedGroupChat8 = jailedBusiness.chat;
            if (jailedGroupChat8 != null) {
                codedOutputByteBufferNano.K(8, jailedGroupChat8, JailedGroupChat.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<JailedBusiness> JSON_ADAPTER = new ObjectJsonAdapter<JailedBusiness>() { // from class: com.p1.mobile.putong.data.JailedBusiness.2
        public Class getDataClass() {
            return JailedBusiness.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public JailedBusiness mo17830newInstance() {
            return new JailedBusiness();
        }

        public boolean parseField(JailedBusiness jailedBusiness, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "MOMENT":
                    jailedBusiness.moment = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "groupChat":
                    jailedBusiness.groupChat = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "CHANGE_PROFILE":
                    jailedBusiness.changeProfile = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "CHAT":
                    jailedBusiness.chat = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "LIVE":
                    jailedBusiness.live = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "MOMENT_COMMENT":
                    jailedBusiness.momentComment = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "SWIPE":
                    jailedBusiness.swipe = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "GREETING":
                    jailedBusiness.greeting = (JailedGroupChat) JailedGroupChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JailedBusiness) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JailedBusiness) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JailedBusiness new_() {
        JailedBusiness jailedBusiness = new JailedBusiness();
        jailedBusiness.nullCheck();
        return jailedBusiness;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JailedBusiness m18267clone() {
        JailedBusiness jailedBusiness = new JailedBusiness();
        JailedGroupChat jailedGroupChat = this.groupChat;
        if (jailedGroupChat != null) {
            jailedBusiness.groupChat = jailedGroupChat.m18270clone();
        }
        JailedGroupChat jailedGroupChat2 = this.moment;
        if (jailedGroupChat2 != null) {
            jailedBusiness.moment = jailedGroupChat2.m18270clone();
        }
        JailedGroupChat jailedGroupChat3 = this.momentComment;
        if (jailedGroupChat3 != null) {
            jailedBusiness.momentComment = jailedGroupChat3.m18270clone();
        }
        JailedGroupChat jailedGroupChat4 = this.changeProfile;
        if (jailedGroupChat4 != null) {
            jailedBusiness.changeProfile = jailedGroupChat4.m18270clone();
        }
        JailedGroupChat jailedGroupChat5 = this.swipe;
        if (jailedGroupChat5 != null) {
            jailedBusiness.swipe = jailedGroupChat5.m18270clone();
        }
        JailedGroupChat jailedGroupChat6 = this.greeting;
        if (jailedGroupChat6 != null) {
            jailedBusiness.greeting = jailedGroupChat6.m18270clone();
        }
        JailedGroupChat jailedGroupChat7 = this.live;
        if (jailedGroupChat7 != null) {
            jailedBusiness.live = jailedGroupChat7.m18270clone();
        }
        JailedGroupChat jailedGroupChat8 = this.chat;
        if (jailedGroupChat8 != null) {
            jailedBusiness.chat = jailedGroupChat8.m18270clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
