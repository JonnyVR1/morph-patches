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
public class BlackList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blacklist";

    @ProtobufIndex(index = 1)
    public boolean muted;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean mutedBy;
    public static ProtobufAdapter<BlackList> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlackList>() { // from class: com.p1.mobile.putong.core.data.BlackList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BlackList blackList) {
            int iB = CodedOutputByteBufferNano.b(1, blackList.muted) + CodedOutputByteBufferNano.b(2, blackList.mutedBy);
            ((MessageNano) blackList).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BlackList m11759parse(nb5 nb5Var) throws IOException {
            BlackList blackList = new BlackList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    blackList.muted = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return blackList;
                    }
                    blackList.mutedBy = nb5Var.g();
                }
            }
        }

        public void serialize(BlackList blackList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, blackList.muted);
            codedOutputByteBufferNano.A(2, blackList.mutedBy);
        }
    };
    public static JsonAdapter<BlackList> JSON_ADAPTER = new ObjectJsonAdapter<BlackList>() { // from class: com.p1.mobile.putong.core.data.BlackList.2
        public Class getDataClass() {
            return BlackList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BlackList m11760newInstance() {
            return new BlackList();
        }

        public boolean parseField(BlackList blackList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("muted")) {
                blackList.muted = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("mutedBy")) {
                return false;
            }
            blackList.mutedBy = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(BlackList blackList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("muted") || str.equals("mutedBy")) {
                return true;
            }
            return super.parseFieldCheck(blackList, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BlackList blackList, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("muted", blackList.muted);
            jsonGenerator.writeBooleanField("mutedBy", blackList.mutedBy);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlackList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlackList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BlackList new_() {
        BlackList blackList = new BlackList();
        blackList.nullCheck();
        return blackList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BlackList m11758clone() {
        BlackList blackList = new BlackList();
        blackList.muted = this.muted;
        blackList.mutedBy = this.mutedBy;
        return blackList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlackList)) {
            return false;
        }
        BlackList blackList = (BlackList) obj;
        return this.muted == blackList.muted && this.mutedBy == blackList.mutedBy;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.muted ? 1231 : 1237)) * 41) + (this.mutedBy ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
