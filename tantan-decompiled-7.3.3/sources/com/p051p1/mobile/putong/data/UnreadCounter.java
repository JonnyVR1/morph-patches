package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class UnreadCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "unreadcounter";

    @ProtobufIndex(index = 2)
    public int comments;

    @ProtobufIndex(index = 1)
    public int interests;
    public static ProtobufAdapter<UnreadCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<UnreadCounter>() { // from class: com.p1.mobile.putong.data.UnreadCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UnreadCounter unreadCounter) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, unreadCounter.interests) + CodedOutputByteBufferNano.m17281h(2, unreadCounter.comments);
            unreadCounter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UnreadCounter parse(nc5 nc5Var) throws IOException {
            UnreadCounter unreadCounter = new UnreadCounter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    unreadCounter.interests = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return unreadCounter;
                    }
                    unreadCounter.comments = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UnreadCounter unreadCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, unreadCounter.interests);
            codedOutputByteBufferNano.m17305G(2, unreadCounter.comments);
        }
    };
    public static JsonAdapter<UnreadCounter> JSON_ADAPTER = new ObjectJsonAdapter<UnreadCounter>() { // from class: com.p1.mobile.putong.data.UnreadCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UnreadCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UnreadCounter newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UnreadCounter unreadCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("interests", unreadCounter.interests);
            jsonGenerator.writeNumberField("comments", unreadCounter.comments);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UnreadCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UnreadCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UnreadCounter new_() {
        UnreadCounter unreadCounter = new UnreadCounter();
        unreadCounter.nullCheck();
        return unreadCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UnreadCounter mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.interests) * 41) + this.comments;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
