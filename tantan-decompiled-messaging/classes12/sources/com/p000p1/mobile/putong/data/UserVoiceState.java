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
public class UserVoiceState extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uservoicestate";

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String state;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String voiceRoomId;
    public static ProtobufAdapter<UserVoiceState> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserVoiceState>() { // from class: com.p1.mobile.putong.data.UserVoiceState.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserVoiceState userVoiceState) {
            String str = userVoiceState.voiceRoomId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = userVoiceState.state;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = userVoiceState.voiceLiveId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = userVoiceState.anchorId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) userVoiceState).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserVoiceState m19241parse(nb5 nb5Var) throws IOException {
            UserVoiceState userVoiceState = new UserVoiceState();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userVoiceState.state == null) {
                        userVoiceState.state = "";
                    }
                    if (userVoiceState.voiceLiveId == null) {
                        userVoiceState.voiceLiveId = "";
                    }
                    if (userVoiceState.voiceRoomId == null) {
                        userVoiceState.voiceRoomId = "";
                    }
                    if (userVoiceState.anchorId != null) {
                        break;
                    }
                    userVoiceState.anchorId = "";
                    break;
                }
                if (iU == 10) {
                    userVoiceState.voiceRoomId = nb5Var.s();
                } else if (iU == 18) {
                    userVoiceState.state = nb5Var.s();
                } else if (iU == 26) {
                    userVoiceState.voiceLiveId = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (userVoiceState.state == null) {
                            userVoiceState.state = "";
                        }
                        if (userVoiceState.voiceLiveId == null) {
                            userVoiceState.voiceLiveId = "";
                        }
                        if (userVoiceState.voiceRoomId == null) {
                            userVoiceState.voiceRoomId = "";
                        }
                        if (userVoiceState.anchorId != null) {
                            break;
                        }
                        userVoiceState.anchorId = "";
                        return userVoiceState;
                    }
                    userVoiceState.anchorId = nb5Var.s();
                }
            }
            return userVoiceState;
        }

        public void serialize(UserVoiceState userVoiceState, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userVoiceState.voiceRoomId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = userVoiceState.state;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = userVoiceState.voiceLiveId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = userVoiceState.anchorId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<UserVoiceState> JSON_ADAPTER = new ObjectJsonAdapter<UserVoiceState>() { // from class: com.p1.mobile.putong.data.UserVoiceState.2
        public Class getDataClass() {
            return UserVoiceState.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserVoiceState mo17830newInstance() {
            return new UserVoiceState();
        }

        public boolean parseField(UserVoiceState userVoiceState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorId":
                    userVoiceState.anchorId = jsonParser.getValueAsString();
                    return true;
                case "voiceLiveId":
                    userVoiceState.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    userVoiceState.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "state":
                    userVoiceState.state = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserVoiceState userVoiceState, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "anchorId":
                case "voiceLiveId":
                case "voiceRoomId":
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(userVoiceState, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserVoiceState userVoiceState, JsonGenerator jsonGenerator) throws IOException {
            String str = userVoiceState.state;
            if (str != null) {
                jsonGenerator.writeStringField(Channel.state, str);
            }
            String str2 = userVoiceState.voiceLiveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str2);
            }
            String str3 = userVoiceState.voiceRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str3);
            }
            String str4 = userVoiceState.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserVoiceState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserVoiceState) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserVoiceState new_() {
        UserVoiceState userVoiceState = new UserVoiceState();
        userVoiceState.nullCheck();
        return userVoiceState;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserVoiceState m19240clone() {
        UserVoiceState userVoiceState = new UserVoiceState();
        userVoiceState.state = this.state;
        userVoiceState.voiceLiveId = this.voiceLiveId;
        userVoiceState.voiceRoomId = this.voiceRoomId;
        userVoiceState.anchorId = this.anchorId;
        return userVoiceState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserVoiceState)) {
            return false;
        }
        UserVoiceState userVoiceState = (UserVoiceState) obj;
        return ValueObject.util_equals(this.state, userVoiceState.state) && ValueObject.util_equals(this.voiceLiveId, userVoiceState.voiceLiveId) && ValueObject.util_equals(this.voiceRoomId, userVoiceState.voiceRoomId) && ValueObject.util_equals(this.anchorId, userVoiceState.anchorId);
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.voiceLiveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
