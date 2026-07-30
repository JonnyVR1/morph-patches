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
public class MonetizationChatSeeUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationchatseeuser";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<MonetizationChatSeeUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationChatSeeUser>() { // from class: com.p1.mobile.putong.core.data.MonetizationChatSeeUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MonetizationChatSeeUser monetizationChatSeeUser) {
            String str = monetizationChatSeeUser.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = monetizationChatSeeUser.avatar;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = monetizationChatSeeUser.title;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = monetizationChatSeeUser.subTitle;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) monetizationChatSeeUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MonetizationChatSeeUser m14353parse(nb5 nb5Var) throws IOException {
            MonetizationChatSeeUser monetizationChatSeeUser = new MonetizationChatSeeUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (monetizationChatSeeUser.userId == null) {
                        monetizationChatSeeUser.userId = "";
                    }
                    if (monetizationChatSeeUser.avatar == null) {
                        monetizationChatSeeUser.avatar = "";
                    }
                    if (monetizationChatSeeUser.title == null) {
                        monetizationChatSeeUser.title = "";
                    }
                    if (monetizationChatSeeUser.subTitle != null) {
                        break;
                    }
                    monetizationChatSeeUser.subTitle = "";
                    break;
                }
                if (iU == 10) {
                    monetizationChatSeeUser.userId = nb5Var.s();
                } else if (iU == 18) {
                    monetizationChatSeeUser.avatar = nb5Var.s();
                } else if (iU == 26) {
                    monetizationChatSeeUser.title = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (monetizationChatSeeUser.userId == null) {
                            monetizationChatSeeUser.userId = "";
                        }
                        if (monetizationChatSeeUser.avatar == null) {
                            monetizationChatSeeUser.avatar = "";
                        }
                        if (monetizationChatSeeUser.title == null) {
                            monetizationChatSeeUser.title = "";
                        }
                        if (monetizationChatSeeUser.subTitle != null) {
                            break;
                        }
                        monetizationChatSeeUser.subTitle = "";
                        return monetizationChatSeeUser;
                    }
                    monetizationChatSeeUser.subTitle = nb5Var.s();
                }
            }
            return monetizationChatSeeUser;
        }

        public void serialize(MonetizationChatSeeUser monetizationChatSeeUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = monetizationChatSeeUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = monetizationChatSeeUser.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = monetizationChatSeeUser.title;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = monetizationChatSeeUser.subTitle;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<MonetizationChatSeeUser> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationChatSeeUser>() { // from class: com.p1.mobile.putong.core.data.MonetizationChatSeeUser.2
        public Class getDataClass() {
            return MonetizationChatSeeUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MonetizationChatSeeUser m14354newInstance() {
            return new MonetizationChatSeeUser();
        }

        public boolean parseField(MonetizationChatSeeUser monetizationChatSeeUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    monetizationChatSeeUser.subTitle = jsonParser.getValueAsString();
                    return true;
                case "avatar":
                    monetizationChatSeeUser.avatar = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    monetizationChatSeeUser.userId = jsonParser.getValueAsString();
                    return true;
                case "title":
                    monetizationChatSeeUser.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MonetizationChatSeeUser monetizationChatSeeUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "avatar":
                case "userId":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(monetizationChatSeeUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MonetizationChatSeeUser monetizationChatSeeUser, JsonGenerator jsonGenerator) throws IOException {
            String str = monetizationChatSeeUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = monetizationChatSeeUser.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str2);
            }
            String str3 = monetizationChatSeeUser.title;
            if (str3 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str3);
            }
            String str4 = monetizationChatSeeUser.subTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subTitle", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationChatSeeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationChatSeeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationChatSeeUser new_() {
        MonetizationChatSeeUser monetizationChatSeeUser = new MonetizationChatSeeUser();
        monetizationChatSeeUser.nullCheck();
        return monetizationChatSeeUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MonetizationChatSeeUser m14352clone() {
        MonetizationChatSeeUser monetizationChatSeeUser = new MonetizationChatSeeUser();
        monetizationChatSeeUser.userId = this.userId;
        monetizationChatSeeUser.avatar = this.avatar;
        monetizationChatSeeUser.title = this.title;
        monetizationChatSeeUser.subTitle = this.subTitle;
        return monetizationChatSeeUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonetizationChatSeeUser)) {
            return false;
        }
        MonetizationChatSeeUser monetizationChatSeeUser = (MonetizationChatSeeUser) obj;
        return ValueObject.util_equals(this.userId, monetizationChatSeeUser.userId) && ValueObject.util_equals(this.avatar, monetizationChatSeeUser.avatar) && ValueObject.util_equals(this.title, monetizationChatSeeUser.title) && ValueObject.util_equals(this.subTitle, monetizationChatSeeUser.subTitle);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.subTitle;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
