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
public class RecentConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentconversation";

    @ProtobufIndex(index = 2)
    public boolean isOnline;

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserID;
    public static ProtobufAdapter<RecentConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentConversation>() { // from class: com.p1.mobile.putong.core.data.RecentConversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecentConversation recentConversation) {
            String str = recentConversation.otherUserID;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, recentConversation.isOnline);
            recentConversation.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecentConversation parse(nc5 nc5Var) throws IOException {
            RecentConversation recentConversation = new RecentConversation();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (recentConversation.otherUserID != null) {
                        break;
                    }
                    recentConversation.otherUserID = "";
                    break;
                }
                if (iM162497u == 10) {
                    recentConversation.otherUserID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (recentConversation.otherUserID != null) {
                            break;
                        }
                        recentConversation.otherUserID = "";
                        return recentConversation;
                    }
                    recentConversation.isOnline = nc5Var.m162483g();
                }
            }
            return recentConversation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecentConversation recentConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recentConversation.otherUserID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, recentConversation.isOnline);
        }
    };
    public static JsonAdapter<RecentConversation> JSON_ADAPTER = new ObjectJsonAdapter<RecentConversation>() { // from class: com.p1.mobile.putong.core.data.RecentConversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecentConversation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecentConversation newInstance() {
            return new RecentConversation();
        }

        public boolean parseField(RecentConversation recentConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("otherUserID")) {
                recentConversation.otherUserID = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("isOnline")) {
                return false;
            }
            recentConversation.isOnline = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(RecentConversation recentConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("otherUserID") || str.equals("isOnline")) {
                return true;
            }
            return super.parseFieldCheck(recentConversation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecentConversation recentConversation, JsonGenerator jsonGenerator) throws IOException {
            String str = recentConversation.otherUserID;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserID", str);
            }
            jsonGenerator.writeBooleanField("isOnline", recentConversation.isOnline);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentConversation new_() {
        RecentConversation recentConversation = new RecentConversation();
        recentConversation.nullCheck();
        return recentConversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecentConversation mo225055clone() {
        RecentConversation recentConversation = new RecentConversation();
        recentConversation.otherUserID = this.otherUserID;
        recentConversation.isOnline = this.isOnline;
        return recentConversation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecentConversation)) {
            return false;
        }
        RecentConversation recentConversation = (RecentConversation) obj;
        return ValueObject.util_equals(this.otherUserID, recentConversation.otherUserID) && this.isOnline == recentConversation.isOnline;
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
        String str = this.otherUserID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isOnline ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.otherUserID == null) {
            this.otherUserID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
