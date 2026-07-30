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
public class RecentConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentconversation";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isOnline;

    @NonNull
    @ProtobufIndex(index = 1)
    public String otherUserID;
    public static ProtobufAdapter<RecentConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentConversation>() { // from class: com.p1.mobile.putong.core.data.RecentConversation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecentConversation recentConversation) {
            String str = recentConversation.otherUserID;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, recentConversation.isOnline);
            ((MessageNano) recentConversation).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecentConversation m15313parse(nb5 nb5Var) throws IOException {
            RecentConversation recentConversation = new RecentConversation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recentConversation.otherUserID != null) {
                        break;
                    }
                    recentConversation.otherUserID = "";
                    break;
                }
                if (iU == 10) {
                    recentConversation.otherUserID = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (recentConversation.otherUserID != null) {
                            break;
                        }
                        recentConversation.otherUserID = "";
                        return recentConversation;
                    }
                    recentConversation.isOnline = nb5Var.g();
                }
            }
            return recentConversation;
        }

        public void serialize(RecentConversation recentConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recentConversation.otherUserID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, recentConversation.isOnline);
        }
    };
    public static JsonAdapter<RecentConversation> JSON_ADAPTER = new ObjectJsonAdapter<RecentConversation>() { // from class: com.p1.mobile.putong.core.data.RecentConversation.2
        public Class getDataClass() {
            return RecentConversation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecentConversation m15314newInstance() {
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

        public void serializeFields(RecentConversation recentConversation, JsonGenerator jsonGenerator) throws IOException {
            String str = recentConversation.otherUserID;
            if (str != null) {
                jsonGenerator.writeStringField("otherUserID", str);
            }
            jsonGenerator.writeBooleanField("isOnline", recentConversation.isOnline);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentConversation new_() {
        RecentConversation recentConversation = new RecentConversation();
        recentConversation.nullCheck();
        return recentConversation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecentConversation m15312clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.otherUserID;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isOnline ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.otherUserID == null) {
            this.otherUserID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
