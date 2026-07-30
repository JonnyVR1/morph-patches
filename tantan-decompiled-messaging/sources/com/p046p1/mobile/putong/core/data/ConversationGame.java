package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ConversationGame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationgame";

    @NonNull
    @ProtobufIndex(index = 4)
    public String gameName;

    @NonNull
    @ProtobufIndex(index = 1)
    public String gameText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String gameTextColor;

    @ProtobufIndex(index = 3)
    public int gameUnread;
    public static ProtobufAdapter<ConversationGame> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationGame>() { // from class: com.p1.mobile.putong.core.data.ConversationGame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationGame conversationGame) {
            String str = conversationGame.gameText;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = conversationGame.gameTextColor;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, conversationGame.gameUnread);
            String str3 = conversationGame.gameName;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            conversationGame.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationGame parse(nb5 nb5Var) throws IOException {
            ConversationGame conversationGame = new ConversationGame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationGame.gameText == null) {
                        conversationGame.gameText = "";
                    }
                    if (conversationGame.gameTextColor == null) {
                        conversationGame.gameTextColor = "";
                    }
                    if (conversationGame.gameName != null) {
                        break;
                    }
                    conversationGame.gameName = "";
                    break;
                }
                if (iM158752u == 10) {
                    conversationGame.gameText = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    conversationGame.gameTextColor = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    conversationGame.gameUnread = nb5Var.m158741j();
                } else {
                    if (iM158752u != 34) {
                        if (conversationGame.gameText == null) {
                            conversationGame.gameText = "";
                        }
                        if (conversationGame.gameTextColor == null) {
                            conversationGame.gameTextColor = "";
                        }
                        if (conversationGame.gameName != null) {
                            break;
                        }
                        conversationGame.gameName = "";
                        return conversationGame;
                    }
                    conversationGame.gameName = nb5Var.m158750s();
                }
            }
            return conversationGame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationGame conversationGame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationGame.gameText;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = conversationGame.gameTextColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, conversationGame.gameUnread);
            String str3 = conversationGame.gameName;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<ConversationGame> JSON_ADAPTER = new ObjectJsonAdapter<ConversationGame>() { // from class: com.p1.mobile.putong.core.data.ConversationGame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationGame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationGame newInstance() {
            return new ConversationGame();
        }

        public boolean parseField(ConversationGame conversationGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gameName":
                    conversationGame.gameName = jsonParser.getValueAsString();
                    return true;
                case "gameText":
                    conversationGame.gameText = jsonParser.getValueAsString();
                    return true;
                case "gameTextColor":
                    conversationGame.gameTextColor = jsonParser.getValueAsString();
                    return true;
                case "gameUnread":
                    conversationGame.gameUnread = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationGame conversationGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gameName":
                case "gameText":
                case "gameTextColor":
                case "gameUnread":
                    return true;
                default:
                    return super.parseFieldCheck(conversationGame, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationGame conversationGame, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationGame.gameText;
            if (str != null) {
                jsonGenerator.writeStringField("gameText", str);
            }
            String str2 = conversationGame.gameTextColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("gameTextColor", str2);
            }
            jsonGenerator.writeNumberField("gameUnread", conversationGame.gameUnread);
            String str3 = conversationGame.gameName;
            if (str3 != null) {
                jsonGenerator.writeStringField("gameName", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationGame new_() {
        ConversationGame conversationGame = new ConversationGame();
        conversationGame.nullCheck();
        return conversationGame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationGame mo223809clone() {
        ConversationGame conversationGame = new ConversationGame();
        conversationGame.gameText = this.gameText;
        conversationGame.gameTextColor = this.gameTextColor;
        conversationGame.gameUnread = this.gameUnread;
        conversationGame.gameName = this.gameName;
        return conversationGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationGame)) {
            return false;
        }
        ConversationGame conversationGame = (ConversationGame) obj;
        return ValueObject.util_equals(this.gameText, conversationGame.gameText) && ValueObject.util_equals(this.gameTextColor, conversationGame.gameTextColor) && this.gameUnread == conversationGame.gameUnread && ValueObject.util_equals(this.gameName, conversationGame.gameName);
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
        String str = this.gameText;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.gameTextColor;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.gameUnread) * 41;
        String str3 = this.gameName;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gameText == null) {
            this.gameText = "";
        }
        if (this.gameTextColor == null) {
            this.gameTextColor = "";
        }
        if (this.gameName == null) {
            this.gameName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
