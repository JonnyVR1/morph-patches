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
public class UserId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userid";

    @NonNull
    @ProtobufIndex(index = 1)
    public String UserId;
    public static ProtobufAdapter<UserId> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserId>() { // from class: com.p1.mobile.putong.core.data.UserId.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserId userId) {
            String str = userId.UserId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) userId).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserId m16120parse(nb5 nb5Var) throws IOException {
            UserId userId = new UserId();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userId.UserId != null) {
                        break;
                    }
                    userId.UserId = "";
                    break;
                }
                if (iU != 10) {
                    if (userId.UserId != null) {
                        break;
                    }
                    userId.UserId = "";
                    return userId;
                }
                userId.UserId = nb5Var.s();
            }
            return userId;
        }

        public void serialize(UserId userId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userId.UserId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<UserId> JSON_ADAPTER = new ObjectJsonAdapter<UserId>() { // from class: com.p1.mobile.putong.core.data.UserId.2
        public Class getDataClass() {
            return UserId.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserId m16121newInstance() {
            return new UserId();
        }

        public boolean parseField(UserId userId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("UserId")) {
                return false;
            }
            userId.UserId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(UserId userId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("UserId")) {
                return true;
            }
            return super.parseFieldCheck(userId, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(UserId userId, JsonGenerator jsonGenerator) throws IOException {
            String str = userId.UserId;
            if (str != null) {
                jsonGenerator.writeStringField("UserId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserId new_() {
        UserId userId = new UserId();
        userId.nullCheck();
        return userId;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserId m16119clone() {
        UserId userId = new UserId();
        userId.UserId = this.UserId;
        return userId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserId) {
            return ValueObject.util_equals(this.UserId, ((UserId) obj).UserId);
        }
        return false;
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
        String str = this.UserId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.UserId == null) {
            this.UserId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
