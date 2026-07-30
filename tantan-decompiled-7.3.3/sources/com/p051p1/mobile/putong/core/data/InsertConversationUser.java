package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class InsertConversationUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertconversationuser";

    @NonNull
    @ProtobufIndex(index = 3)
    public Boolean clicked;

    @NonNull
    @ProtobufIndex(index = 2)
    public Long timeStamp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<InsertConversationUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertConversationUser>() { // from class: com.p1.mobile.putong.core.data.InsertConversationUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InsertConversationUser insertConversationUser) {
            String str = insertConversationUser.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Long l2 = insertConversationUser.timeStamp;
            if (l2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17283j(2, l2.longValue());
            }
            Boolean bool = insertConversationUser.clicked;
            if (bool != null) {
                iM17288o += CodedOutputByteBufferNano.m17275b(3, bool.booleanValue());
            }
            insertConversationUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InsertConversationUser parse(nc5 nc5Var) throws IOException {
            InsertConversationUser insertConversationUser = new InsertConversationUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (insertConversationUser.userId == null) {
                        insertConversationUser.userId = "";
                    }
                    if (insertConversationUser.timeStamp == null) {
                        insertConversationUser.timeStamp = 0L;
                    }
                    if (insertConversationUser.clicked != null) {
                        break;
                    }
                    insertConversationUser.clicked = Boolean.FALSE;
                    break;
                }
                if (iM162497u == 10) {
                    insertConversationUser.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    insertConversationUser.timeStamp = Long.valueOf(nc5Var.m162487k());
                } else {
                    if (iM162497u != 24) {
                        if (insertConversationUser.userId == null) {
                            insertConversationUser.userId = "";
                        }
                        if (insertConversationUser.timeStamp == null) {
                            insertConversationUser.timeStamp = 0L;
                        }
                        if (insertConversationUser.clicked != null) {
                            break;
                        }
                        insertConversationUser.clicked = Boolean.FALSE;
                        return insertConversationUser;
                    }
                    insertConversationUser.clicked = Boolean.valueOf(nc5Var.m162483g());
                }
            }
            return insertConversationUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InsertConversationUser insertConversationUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = insertConversationUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Long l2 = insertConversationUser.timeStamp;
            if (l2 != null) {
                codedOutputByteBufferNano.m17307I(2, l2.longValue());
            }
            Boolean bool = insertConversationUser.clicked;
            if (bool != null) {
                codedOutputByteBufferNano.m17299A(3, bool.booleanValue());
            }
        }
    };
    public static JsonAdapter<InsertConversationUser> JSON_ADAPTER = new ObjectJsonAdapter<InsertConversationUser>() { // from class: com.p1.mobile.putong.core.data.InsertConversationUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InsertConversationUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InsertConversationUser newInstance() {
            return new InsertConversationUser();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(InsertConversationUser insertConversationUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -836030906:
                    if (str.equals("userId")) {
                        b = 0;
                    }
                    break;
                case 25573622:
                    if (str.equals("timeStamp")) {
                        b = 1;
                    }
                    break;
                case 860524583:
                    if (str.equals("clicked")) {
                        b = 2;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    insertConversationUser.userId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    insertConversationUser.timeStamp = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Long.valueOf(jsonParser.getValueAsLong()) : null;
                    return true;
                case 2:
                    insertConversationUser.clicked = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Boolean.valueOf(jsonParser.getValueAsBoolean()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InsertConversationUser insertConversationUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "timeStamp":
                case "clicked":
                    return true;
                default:
                    return super.parseFieldCheck(insertConversationUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InsertConversationUser insertConversationUser, JsonGenerator jsonGenerator) throws IOException {
            String str = insertConversationUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            Long l2 = insertConversationUser.timeStamp;
            if (l2 != null) {
                jsonGenerator.writeNumberField("timeStamp", l2.longValue());
            }
            Boolean bool = insertConversationUser.clicked;
            if (bool != null) {
                jsonGenerator.writeBooleanField("clicked", bool.booleanValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertConversationUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertConversationUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertConversationUser new_() {
        InsertConversationUser insertConversationUser = new InsertConversationUser();
        insertConversationUser.nullCheck();
        return insertConversationUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InsertConversationUser mo225055clone() {
        InsertConversationUser insertConversationUser = new InsertConversationUser();
        insertConversationUser.userId = this.userId;
        insertConversationUser.timeStamp = this.timeStamp;
        insertConversationUser.clicked = this.clicked;
        return insertConversationUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InsertConversationUser)) {
            return false;
        }
        InsertConversationUser insertConversationUser = (InsertConversationUser) obj;
        return ValueObject.util_equals(this.userId, insertConversationUser.userId) && ValueObject.util_equals(this.timeStamp, insertConversationUser.timeStamp) && ValueObject.util_equals(this.clicked, insertConversationUser.clicked);
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
        Long l2 = this.timeStamp;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 41;
        Boolean bool = this.clicked;
        int iHashCode3 = iHashCode2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.timeStamp == null) {
            this.timeStamp = 0L;
        }
        if (this.clicked == null) {
            this.clicked = Boolean.FALSE;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
