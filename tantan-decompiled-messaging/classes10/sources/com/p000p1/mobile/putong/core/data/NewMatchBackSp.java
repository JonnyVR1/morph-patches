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
public class NewMatchBackSp extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchbacksp";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long lastUpdateTime;

    @ProtobufIndex(index = 1)
    public int num;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<NewMatchBackSp> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchBackSp>() { // from class: com.p1.mobile.putong.core.data.NewMatchBackSp.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewMatchBackSp newMatchBackSp) {
            int iH = CodedOutputByteBufferNano.h(1, newMatchBackSp.num);
            String str = newMatchBackSp.userId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            int iJ = iH + CodedOutputByteBufferNano.j(3, newMatchBackSp.lastUpdateTime);
            ((MessageNano) newMatchBackSp).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewMatchBackSp m14511parse(nb5 nb5Var) throws IOException {
            NewMatchBackSp newMatchBackSp = new NewMatchBackSp();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newMatchBackSp.userId != null) {
                        break;
                    }
                    newMatchBackSp.userId = "";
                    break;
                }
                if (iU == 8) {
                    newMatchBackSp.num = nb5Var.j();
                } else if (iU == 18) {
                    newMatchBackSp.userId = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (newMatchBackSp.userId != null) {
                            break;
                        }
                        newMatchBackSp.userId = "";
                        return newMatchBackSp;
                    }
                    newMatchBackSp.lastUpdateTime = nb5Var.k();
                }
            }
            return newMatchBackSp;
        }

        public void serialize(NewMatchBackSp newMatchBackSp, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, newMatchBackSp.num);
            String str = newMatchBackSp.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.I(3, newMatchBackSp.lastUpdateTime);
        }
    };
    public static JsonAdapter<NewMatchBackSp> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchBackSp>() { // from class: com.p1.mobile.putong.core.data.NewMatchBackSp.2
        public Class getDataClass() {
            return NewMatchBackSp.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewMatchBackSp m14512newInstance() {
            return new NewMatchBackSp();
        }

        public boolean parseField(NewMatchBackSp newMatchBackSp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    newMatchBackSp.userId = jsonParser.getValueAsString();
                    return true;
                case "lastUpdateTime":
                    newMatchBackSp.lastUpdateTime = jsonParser.getValueAsLong();
                    return true;
                case "num":
                    newMatchBackSp.num = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewMatchBackSp newMatchBackSp, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "lastUpdateTime":
                case "num":
                    return true;
                default:
                    return super.parseFieldCheck(newMatchBackSp, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(NewMatchBackSp newMatchBackSp, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("num", newMatchBackSp.num);
            String str = newMatchBackSp.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("lastUpdateTime", newMatchBackSp.lastUpdateTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchBackSp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchBackSp) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchBackSp new_() {
        NewMatchBackSp newMatchBackSp = new NewMatchBackSp();
        newMatchBackSp.nullCheck();
        return newMatchBackSp;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewMatchBackSp m14510clone() {
        NewMatchBackSp newMatchBackSp = new NewMatchBackSp();
        newMatchBackSp.num = this.num;
        newMatchBackSp.userId = this.userId;
        newMatchBackSp.lastUpdateTime = this.lastUpdateTime;
        return newMatchBackSp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMatchBackSp)) {
            return false;
        }
        NewMatchBackSp newMatchBackSp = (NewMatchBackSp) obj;
        return this.num == newMatchBackSp.num && ValueObject.util_equals(this.userId, newMatchBackSp.userId) && this.lastUpdateTime == newMatchBackSp.lastUpdateTime;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.num) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.lastUpdateTime;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
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
