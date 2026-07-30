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
public class FeedFlower extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedflower";

    @ProtobufIndex(index = 1)
    public int count;
    public static ProtobufAdapter<FeedFlower> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedFlower>() { // from class: com.p1.mobile.putong.data.FeedFlower.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedFlower feedFlower) {
            int iH = CodedOutputByteBufferNano.h(1, feedFlower.count);
            ((MessageNano) feedFlower).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedFlower m18094parse(nb5 nb5Var) throws IOException {
            FeedFlower feedFlower = new FeedFlower();
            while (nb5Var.u() == 8) {
                feedFlower.count = nb5Var.j();
            }
            return feedFlower;
        }

        public void serialize(FeedFlower feedFlower, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, feedFlower.count);
        }
    };
    public static JsonAdapter<FeedFlower> JSON_ADAPTER = new ObjectJsonAdapter<FeedFlower>() { // from class: com.p1.mobile.putong.data.FeedFlower.2
        public Class getDataClass() {
            return FeedFlower.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FeedFlower mo17830newInstance() {
            return new FeedFlower();
        }

        public boolean parseField(FeedFlower feedFlower, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("count")) {
                return false;
            }
            feedFlower.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(FeedFlower feedFlower, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(feedFlower, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedFlower feedFlower, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", feedFlower.count);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedFlower) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedFlower) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FeedFlower new_() {
        FeedFlower feedFlower = new FeedFlower();
        feedFlower.nullCheck();
        return feedFlower;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedFlower m18093clone() {
        FeedFlower feedFlower = new FeedFlower();
        feedFlower.count = this.count;
        return feedFlower;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FeedFlower) && this.count == ((FeedFlower) obj).count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
