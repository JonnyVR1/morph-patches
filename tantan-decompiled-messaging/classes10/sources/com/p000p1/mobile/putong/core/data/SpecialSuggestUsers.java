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
public class SpecialSuggestUsers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "specialsuggestusers";

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SpecialSuggestUsers> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpecialSuggestUsers>() { // from class: com.p1.mobile.putong.core.data.SpecialSuggestUsers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpecialSuggestUsers specialSuggestUsers) {
            String str = specialSuggestUsers.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) specialSuggestUsers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpecialSuggestUsers m15702parse(nb5 nb5Var) throws IOException {
            SpecialSuggestUsers specialSuggestUsers = new SpecialSuggestUsers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (specialSuggestUsers.userId != null) {
                        break;
                    }
                    specialSuggestUsers.userId = "";
                    break;
                }
                if (iU != 10) {
                    if (specialSuggestUsers.userId != null) {
                        break;
                    }
                    specialSuggestUsers.userId = "";
                    return specialSuggestUsers;
                }
                specialSuggestUsers.userId = nb5Var.s();
            }
            return specialSuggestUsers;
        }

        public void serialize(SpecialSuggestUsers specialSuggestUsers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = specialSuggestUsers.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<SpecialSuggestUsers> JSON_ADAPTER = new ObjectJsonAdapter<SpecialSuggestUsers>() { // from class: com.p1.mobile.putong.core.data.SpecialSuggestUsers.2
        public Class getDataClass() {
            return SpecialSuggestUsers.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpecialSuggestUsers m15703newInstance() {
            return new SpecialSuggestUsers();
        }

        public boolean parseField(SpecialSuggestUsers specialSuggestUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userId")) {
                return false;
            }
            specialSuggestUsers.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SpecialSuggestUsers specialSuggestUsers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(specialSuggestUsers, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SpecialSuggestUsers specialSuggestUsers, JsonGenerator jsonGenerator) throws IOException {
            String str = specialSuggestUsers.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialSuggestUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialSuggestUsers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpecialSuggestUsers new_() {
        SpecialSuggestUsers specialSuggestUsers = new SpecialSuggestUsers();
        specialSuggestUsers.nullCheck();
        return specialSuggestUsers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpecialSuggestUsers m15701clone() {
        SpecialSuggestUsers specialSuggestUsers = new SpecialSuggestUsers();
        specialSuggestUsers.userId = this.userId;
        return specialSuggestUsers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpecialSuggestUsers) {
            return ValueObject.util_equals(this.userId, ((SpecialSuggestUsers) obj).userId);
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
        String str = this.userId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
