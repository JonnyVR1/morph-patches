package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class TalkUnitData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkunitdata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f181id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String question;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public User user;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String value;
    public static ProtobufAdapter<TalkUnitData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkUnitData>() { // from class: com.p1.mobile.putong.core.data.TalkUnitData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TalkUnitData talkUnitData) {
            String str = talkUnitData.f181id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = talkUnitData.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = talkUnitData.value;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = talkUnitData.question;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            User user = talkUnitData.user;
            if (user != null) {
                iO += CodedOutputByteBufferNano.l(5, user, User.PROTOBUF_ADAPTER);
            }
            ((MessageNano) talkUnitData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TalkUnitData m15930parse(nb5 nb5Var) throws IOException {
            TalkUnitData talkUnitData = new TalkUnitData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (talkUnitData.f181id == null) {
                        talkUnitData.f181id = "";
                    }
                    if (talkUnitData.userId == null) {
                        talkUnitData.userId = "";
                    }
                    if (talkUnitData.value == null) {
                        talkUnitData.value = "";
                    }
                    if (talkUnitData.question != null) {
                        break;
                    }
                    talkUnitData.question = "";
                    break;
                }
                if (iU == 10) {
                    talkUnitData.f181id = nb5Var.s();
                } else if (iU == 18) {
                    talkUnitData.userId = nb5Var.s();
                } else if (iU == 26) {
                    talkUnitData.value = nb5Var.s();
                } else if (iU == 34) {
                    talkUnitData.question = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (talkUnitData.f181id == null) {
                            talkUnitData.f181id = "";
                        }
                        if (talkUnitData.userId == null) {
                            talkUnitData.userId = "";
                        }
                        if (talkUnitData.value == null) {
                            talkUnitData.value = "";
                        }
                        if (talkUnitData.question != null) {
                            break;
                        }
                        talkUnitData.question = "";
                        return talkUnitData;
                    }
                    talkUnitData.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                }
            }
            return talkUnitData;
        }

        public void serialize(TalkUnitData talkUnitData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkUnitData.f181id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = talkUnitData.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = talkUnitData.value;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = talkUnitData.question;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            User user = talkUnitData.user;
            if (user != null) {
                codedOutputByteBufferNano.K(5, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkUnitData> JSON_ADAPTER = new ObjectJsonAdapter<TalkUnitData>() { // from class: com.p1.mobile.putong.core.data.TalkUnitData.2
        public Class getDataClass() {
            return TalkUnitData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TalkUnitData m15931newInstance() {
            return new TalkUnitData();
        }

        public boolean parseField(TalkUnitData talkUnitData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "question":
                    talkUnitData.question = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    talkUnitData.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    talkUnitData.f181id = jsonParser.getValueAsString();
                    return false;
                case "user":
                    talkUnitData.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "value":
                    talkUnitData.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TalkUnitData talkUnitData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "question":
                case "userId":
                    return true;
                case "id":
                    return false;
                case "user":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(talkUnitData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TalkUnitData talkUnitData, JsonGenerator jsonGenerator) throws IOException {
            String str = talkUnitData.f181id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = talkUnitData.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = talkUnitData.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            String str4 = talkUnitData.question;
            if (str4 != null) {
                jsonGenerator.writeStringField("question", str4);
            }
            if (talkUnitData.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(talkUnitData.user, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkUnitData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkUnitData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkUnitData new_() {
        TalkUnitData talkUnitData = new TalkUnitData();
        talkUnitData.nullCheck();
        return talkUnitData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TalkUnitData m15929clone() {
        TalkUnitData talkUnitData = new TalkUnitData();
        talkUnitData.f181id = this.f181id;
        talkUnitData.userId = this.userId;
        talkUnitData.value = this.value;
        talkUnitData.question = this.question;
        User user = this.user;
        if (user != null) {
            talkUnitData.user = user.clone();
        }
        return talkUnitData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TalkUnitData)) {
            return false;
        }
        TalkUnitData talkUnitData = (TalkUnitData) obj;
        return ValueObject.util_equals(this.f181id, talkUnitData.f181id) && ValueObject.util_equals(this.userId, talkUnitData.userId) && ValueObject.util_equals(this.value, talkUnitData.value) && ValueObject.util_equals(this.question, talkUnitData.question) && ValueObject.util_equals(this.user, talkUnitData.user);
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
        String str = this.f181id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.question;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        User user = this.user;
        int iHashCode5 = iHashCode4 + (user != null ? user.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f181id == null) {
            this.f181id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.question == null) {
            this.question = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
