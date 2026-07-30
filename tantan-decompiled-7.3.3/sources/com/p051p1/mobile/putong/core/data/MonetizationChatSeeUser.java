package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MonetizationChatSeeUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "monetizationchatseeuser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<MonetizationChatSeeUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<MonetizationChatSeeUser>() { // from class: com.p1.mobile.putong.core.data.MonetizationChatSeeUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MonetizationChatSeeUser monetizationChatSeeUser) {
            String str = monetizationChatSeeUser.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = monetizationChatSeeUser.avatar;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = monetizationChatSeeUser.title;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = monetizationChatSeeUser.subTitle;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            monetizationChatSeeUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MonetizationChatSeeUser parse(nc5 nc5Var) throws IOException {
            MonetizationChatSeeUser monetizationChatSeeUser = new MonetizationChatSeeUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    monetizationChatSeeUser.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    monetizationChatSeeUser.avatar = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    monetizationChatSeeUser.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
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
                    monetizationChatSeeUser.subTitle = nc5Var.m162495s();
                }
            }
            return monetizationChatSeeUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MonetizationChatSeeUser monetizationChatSeeUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = monetizationChatSeeUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = monetizationChatSeeUser.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = monetizationChatSeeUser.title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = monetizationChatSeeUser.subTitle;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<MonetizationChatSeeUser> JSON_ADAPTER = new ObjectJsonAdapter<MonetizationChatSeeUser>() { // from class: com.p1.mobile.putong.core.data.MonetizationChatSeeUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MonetizationChatSeeUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MonetizationChatSeeUser newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MonetizationChatSeeUser monetizationChatSeeUser, JsonGenerator jsonGenerator) throws IOException {
            String str = monetizationChatSeeUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = monetizationChatSeeUser.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
            String str3 = monetizationChatSeeUser.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = monetizationChatSeeUser.subTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("subTitle", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MonetizationChatSeeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MonetizationChatSeeUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MonetizationChatSeeUser new_() {
        MonetizationChatSeeUser monetizationChatSeeUser = new MonetizationChatSeeUser();
        monetizationChatSeeUser.nullCheck();
        return monetizationChatSeeUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MonetizationChatSeeUser mo225055clone() {
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.subTitle;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
