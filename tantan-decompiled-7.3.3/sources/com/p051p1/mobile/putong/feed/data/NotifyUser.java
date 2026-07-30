package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes13.dex */
public class NotifyUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notifyuser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<NotifyUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotifyUser>() { // from class: com.p1.mobile.putong.feed.data.NotifyUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NotifyUser notifyUser) {
            String str = notifyUser.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = notifyUser.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            notifyUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NotifyUser parse(nc5 nc5Var) throws IOException {
            NotifyUser notifyUser = new NotifyUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (notifyUser.userId == null) {
                        notifyUser.userId = "";
                    }
                    if (notifyUser.name != null) {
                        break;
                    }
                    notifyUser.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    notifyUser.userId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (notifyUser.userId == null) {
                            notifyUser.userId = "";
                        }
                        if (notifyUser.name != null) {
                            break;
                        }
                        notifyUser.name = "";
                        return notifyUser;
                    }
                    notifyUser.name = nc5Var.m162495s();
                }
            }
            return notifyUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NotifyUser notifyUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = notifyUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = notifyUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<NotifyUser> JSON_ADAPTER = new ObjectJsonAdapter<NotifyUser>() { // from class: com.p1.mobile.putong.feed.data.NotifyUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NotifyUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NotifyUser newInstance() {
            return new NotifyUser();
        }

        public boolean parseField(NotifyUser notifyUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                notifyUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            notifyUser.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(NotifyUser notifyUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(notifyUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotifyUser notifyUser, JsonGenerator jsonGenerator) throws IOException {
            String str = notifyUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = notifyUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotifyUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotifyUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotifyUser new_() {
        NotifyUser notifyUser = new NotifyUser();
        notifyUser.nullCheck();
        return notifyUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NotifyUser mo225055clone() {
        NotifyUser notifyUser = new NotifyUser();
        notifyUser.userId = this.userId;
        notifyUser.name = this.name;
        return notifyUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotifyUser)) {
            return false;
        }
        NotifyUser notifyUser = (NotifyUser) obj;
        return ValueObject.util_equals(this.userId, notifyUser.userId) && ValueObject.util_equals(this.name, notifyUser.name);
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
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
