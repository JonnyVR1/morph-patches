package com.p000p1.mobile.putong.core.data;

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
public class DatingFriendsApply extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingfriendsapply";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int unchatCount;

    @ProtobufIndex(index = 1)
    public int unreadCount;
    public static ProtobufAdapter<DatingFriendsApply> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingFriendsApply>() { // from class: com.p1.mobile.putong.core.data.DatingFriendsApply.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DatingFriendsApply datingFriendsApply) {
            int iH = CodedOutputByteBufferNano.h(1, datingFriendsApply.unreadCount) + CodedOutputByteBufferNano.h(2, datingFriendsApply.unchatCount);
            ((MessageNano) datingFriendsApply).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DatingFriendsApply m12575parse(nb5 nb5Var) throws IOException {
            DatingFriendsApply datingFriendsApply = new DatingFriendsApply();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    datingFriendsApply.unreadCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return datingFriendsApply;
                    }
                    datingFriendsApply.unchatCount = nb5Var.j();
                }
            }
        }

        public void serialize(DatingFriendsApply datingFriendsApply, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, datingFriendsApply.unreadCount);
            codedOutputByteBufferNano.G(2, datingFriendsApply.unchatCount);
        }
    };
    public static JsonAdapter<DatingFriendsApply> JSON_ADAPTER = new ObjectJsonAdapter<DatingFriendsApply>() { // from class: com.p1.mobile.putong.core.data.DatingFriendsApply.2
        public Class getDataClass() {
            return DatingFriendsApply.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DatingFriendsApply m12576newInstance() {
            return new DatingFriendsApply();
        }

        public boolean parseField(DatingFriendsApply datingFriendsApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unreadCount")) {
                datingFriendsApply.unreadCount = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("unchatCount")) {
                return false;
            }
            datingFriendsApply.unchatCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(DatingFriendsApply datingFriendsApply, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("unreadCount") || str.equals("unchatCount")) {
                return true;
            }
            return super.parseFieldCheck(datingFriendsApply, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(DatingFriendsApply datingFriendsApply, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("unreadCount", datingFriendsApply.unreadCount);
            jsonGenerator.writeNumberField("unchatCount", datingFriendsApply.unchatCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingFriendsApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingFriendsApply) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DatingFriendsApply new_() {
        DatingFriendsApply datingFriendsApply = new DatingFriendsApply();
        datingFriendsApply.nullCheck();
        return datingFriendsApply;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DatingFriendsApply m12574clone() {
        DatingFriendsApply datingFriendsApply = new DatingFriendsApply();
        datingFriendsApply.unreadCount = this.unreadCount;
        datingFriendsApply.unchatCount = this.unchatCount;
        return datingFriendsApply;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingFriendsApply)) {
            return false;
        }
        DatingFriendsApply datingFriendsApply = (DatingFriendsApply) obj;
        return this.unreadCount == datingFriendsApply.unreadCount && this.unchatCount == datingFriendsApply.unchatCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.unreadCount) * 41) + this.unchatCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
