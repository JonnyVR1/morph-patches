package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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

/* JADX INFO: loaded from: classes10.dex */
public class TalkUnitData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talkunitdata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21261id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String question;

    @Nullable
    @ProtobufIndex(index = 5)
    public User user;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<TalkUnitData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkUnitData>() { // from class: com.p1.mobile.putong.core.data.TalkUnitData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TalkUnitData talkUnitData) {
            String str = talkUnitData.f21261id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = talkUnitData.userId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = talkUnitData.value;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = talkUnitData.question;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            User user = talkUnitData.user;
            if (user != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, user, User.PROTOBUF_ADAPTER);
            }
            talkUnitData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TalkUnitData parse(nc5 nc5Var) throws IOException {
            TalkUnitData talkUnitData = new TalkUnitData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (talkUnitData.f21261id == null) {
                        talkUnitData.f21261id = "";
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
                if (iM162497u == 10) {
                    talkUnitData.f21261id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    talkUnitData.userId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    talkUnitData.value = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    talkUnitData.question = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (talkUnitData.f21261id == null) {
                            talkUnitData.f21261id = "";
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
                    talkUnitData.user = (User) nc5Var.m162488l(User.PROTOBUF_ADAPTER);
                }
            }
            return talkUnitData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TalkUnitData talkUnitData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkUnitData.f21261id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = talkUnitData.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = talkUnitData.value;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = talkUnitData.question;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            User user = talkUnitData.user;
            if (user != null) {
                codedOutputByteBufferNano.m17309K(5, user, User.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkUnitData> JSON_ADAPTER = new ObjectJsonAdapter<TalkUnitData>() { // from class: com.p1.mobile.putong.core.data.TalkUnitData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TalkUnitData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TalkUnitData newInstance() {
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
                    talkUnitData.f21261id = jsonParser.getValueAsString();
                    return false;
                case "user":
                    talkUnitData.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TalkUnitData talkUnitData, JsonGenerator jsonGenerator) throws IOException {
            String str = talkUnitData.f21261id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkUnitData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkUnitData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkUnitData new_() {
        TalkUnitData talkUnitData = new TalkUnitData();
        talkUnitData.nullCheck();
        return talkUnitData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TalkUnitData mo225055clone() {
        TalkUnitData talkUnitData = new TalkUnitData();
        talkUnitData.f21261id = this.f21261id;
        talkUnitData.userId = this.userId;
        talkUnitData.value = this.value;
        talkUnitData.question = this.question;
        User user = this.user;
        if (user != null) {
            talkUnitData.user = user.mo225055clone();
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
        return ValueObject.util_equals(this.f21261id, talkUnitData.f21261id) && ValueObject.util_equals(this.userId, talkUnitData.userId) && ValueObject.util_equals(this.value, talkUnitData.value) && ValueObject.util_equals(this.question, talkUnitData.question) && ValueObject.util_equals(this.user, talkUnitData.user);
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
        String str = this.f21261id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.question;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        User user = this.user;
        int iHashCode5 = iHashCode4 + (user != null ? user.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21261id == null) {
            this.f21261id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
