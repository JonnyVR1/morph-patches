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
public class Picks extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picks";

    @ProtobufIndex(index = 1)
    public int todayLikedCount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean todayPaidProps;
    public static ProtobufAdapter<Picks> PROTOBUF_ADAPTER = new MessageNanoAdapter<Picks>() { // from class: com.p1.mobile.putong.core.data.Picks.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Picks picks) {
            int iH = CodedOutputByteBufferNano.h(1, picks.todayLikedCount) + CodedOutputByteBufferNano.b(2, picks.todayPaidProps);
            ((MessageNano) picks).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Picks m14775parse(nb5 nb5Var) throws IOException {
            Picks picks = new Picks();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    picks.todayLikedCount = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return picks;
                    }
                    picks.todayPaidProps = nb5Var.g();
                }
            }
        }

        public void serialize(Picks picks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, picks.todayLikedCount);
            codedOutputByteBufferNano.A(2, picks.todayPaidProps);
        }
    };
    public static JsonAdapter<Picks> JSON_ADAPTER = new ObjectJsonAdapter<Picks>() { // from class: com.p1.mobile.putong.core.data.Picks.2
        public Class getDataClass() {
            return Picks.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Picks m14776newInstance() {
            return new Picks();
        }

        public boolean parseField(Picks picks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("todayPaidProps")) {
                picks.todayPaidProps = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("todayLikedCount")) {
                return false;
            }
            picks.todayLikedCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(Picks picks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("todayPaidProps") || str.equals("todayLikedCount")) {
                return true;
            }
            return super.parseFieldCheck(picks, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Picks picks, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("todayLikedCount", picks.todayLikedCount);
            jsonGenerator.writeBooleanField("todayPaidProps", picks.todayPaidProps);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Picks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Picks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Picks new_() {
        Picks picks = new Picks();
        picks.nullCheck();
        return picks;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Picks m14774clone() {
        Picks picks = new Picks();
        picks.todayLikedCount = this.todayLikedCount;
        picks.todayPaidProps = this.todayPaidProps;
        return picks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Picks)) {
            return false;
        }
        Picks picks = (Picks) obj;
        return this.todayLikedCount == picks.todayLikedCount && this.todayPaidProps == picks.todayPaidProps;
    }

    public String getClassParseName() {
        return "picks";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.todayLikedCount) * 41) + (this.todayPaidProps ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
