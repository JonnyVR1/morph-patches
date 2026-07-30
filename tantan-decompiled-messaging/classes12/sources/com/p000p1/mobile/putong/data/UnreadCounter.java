package com.p000p1.mobile.putong.data;

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
public class UnreadCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "unreadcounter";

    @ProtobufIndex(index = 2)
    public int comments;

    @ProtobufIndex(index = 1)
    public int interests;
    public static ProtobufAdapter<UnreadCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<UnreadCounter>() { // from class: com.p1.mobile.putong.data.UnreadCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UnreadCounter unreadCounter) {
            int iH = CodedOutputByteBufferNano.h(1, unreadCounter.interests) + CodedOutputByteBufferNano.h(2, unreadCounter.comments);
            ((MessageNano) unreadCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UnreadCounter m19139parse(nb5 nb5Var) throws IOException {
            UnreadCounter unreadCounter = new UnreadCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    unreadCounter.interests = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return unreadCounter;
                    }
                    unreadCounter.comments = nb5Var.j();
                }
            }
        }

        public void serialize(UnreadCounter unreadCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, unreadCounter.interests);
            codedOutputByteBufferNano.G(2, unreadCounter.comments);
        }
    };
    public static JsonAdapter<UnreadCounter> JSON_ADAPTER = new ObjectJsonAdapter<UnreadCounter>() { // from class: com.p1.mobile.putong.data.UnreadCounter.2
        public Class getDataClass() {
            return UnreadCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UnreadCounter mo17830newInstance() {
            return new UnreadCounter();
        }

        public boolean parseField(UnreadCounter unreadCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("comments")) {
                unreadCounter.comments = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("interests")) {
                return false;
            }
            unreadCounter.interests = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UnreadCounter unreadCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("comments") || str.equals("interests")) {
                return true;
            }
            return super.parseFieldCheck(unreadCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UnreadCounter unreadCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("interests", unreadCounter.interests);
            jsonGenerator.writeNumberField("comments", unreadCounter.comments);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UnreadCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UnreadCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UnreadCounter new_() {
        UnreadCounter unreadCounter = new UnreadCounter();
        unreadCounter.nullCheck();
        return unreadCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UnreadCounter m19138clone() {
        UnreadCounter unreadCounter = new UnreadCounter();
        unreadCounter.interests = this.interests;
        unreadCounter.comments = this.comments;
        return unreadCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnreadCounter)) {
            return false;
        }
        UnreadCounter unreadCounter = (UnreadCounter) obj;
        return this.interests == unreadCounter.interests && this.comments == unreadCounter.comments;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.interests) * 41) + this.comments;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
