package com.p000p1.mobile.putong.feed.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NotifyUser notifyUser) {
            String str = notifyUser.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = notifyUser.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) notifyUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NotifyUser m19681parse(nb5 nb5Var) throws IOException {
            NotifyUser notifyUser = new NotifyUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (notifyUser.userId == null) {
                        notifyUser.userId = "";
                    }
                    if (notifyUser.name != null) {
                        break;
                    }
                    notifyUser.name = "";
                    break;
                }
                if (iU == 10) {
                    notifyUser.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (notifyUser.userId == null) {
                            notifyUser.userId = "";
                        }
                        if (notifyUser.name != null) {
                            break;
                        }
                        notifyUser.name = "";
                        return notifyUser;
                    }
                    notifyUser.name = nb5Var.s();
                }
            }
            return notifyUser;
        }

        public void serialize(NotifyUser notifyUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = notifyUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = notifyUser.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<NotifyUser> JSON_ADAPTER = new ObjectJsonAdapter<NotifyUser>() { // from class: com.p1.mobile.putong.feed.data.NotifyUser.2
        public Class getDataClass() {
            return NotifyUser.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NotifyUser mo17830newInstance() {
            return new NotifyUser();
        }

        public boolean parseField(NotifyUser notifyUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                notifyUser.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("name")) {
                return false;
            }
            notifyUser.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(NotifyUser notifyUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(notifyUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotifyUser notifyUser, JsonGenerator jsonGenerator) throws IOException {
            String str = notifyUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = notifyUser.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotifyUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotifyUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NotifyUser new_() {
        NotifyUser notifyUser = new NotifyUser();
        notifyUser.nullCheck();
        return notifyUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NotifyUser m19680clone() {
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
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
