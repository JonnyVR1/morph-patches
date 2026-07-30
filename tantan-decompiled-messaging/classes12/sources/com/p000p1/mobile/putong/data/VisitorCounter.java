package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.VisitorCounter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VisitorCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorcounter";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> avatars;

    @ProtobufIndex(index = 1)
    public int newCnt;

    @ProtobufIndex(index = 2)
    public int totalCnt;
    public static ProtobufAdapter<VisitorCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorCounter>() { // from class: com.p1.mobile.putong.data.VisitorCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VisitorCounter visitorCounter) {
            int iH = CodedOutputByteBufferNano.h(1, visitorCounter.newCnt) + CodedOutputByteBufferNano.h(2, visitorCounter.totalCnt);
            List<String> list = visitorCounter.avatars;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) visitorCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VisitorCounter m19332parse(nb5 nb5Var) throws IOException {
            VisitorCounter visitorCounter = new VisitorCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (visitorCounter.avatars != null) {
                        break;
                    }
                    visitorCounter.avatars = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    visitorCounter.newCnt = nb5Var.j();
                } else if (iU == 16) {
                    visitorCounter.totalCnt = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (visitorCounter.avatars != null) {
                            break;
                        }
                        visitorCounter.avatars = new ArrayList();
                        return visitorCounter;
                    }
                    visitorCounter.avatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return visitorCounter;
        }

        public void serialize(VisitorCounter visitorCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, visitorCounter.newCnt);
            codedOutputByteBufferNano.G(2, visitorCounter.totalCnt);
            List<String> list = visitorCounter.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VisitorCounter> JSON_ADAPTER = new ObjectJsonAdapter<VisitorCounter>() { // from class: com.p1.mobile.putong.data.VisitorCounter.2
        public Class getDataClass() {
            return VisitorCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VisitorCounter mo17830newInstance() {
            return new VisitorCounter();
        }

        public boolean parseField(VisitorCounter visitorCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "newCnt":
                    visitorCounter.newCnt = jsonParser.getValueAsInt();
                    return true;
                case "totalCnt":
                    visitorCounter.totalCnt = jsonParser.getValueAsInt();
                    return true;
                case "avatars":
                    visitorCounter.avatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorCounter visitorCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "newCnt":
                case "totalCnt":
                case "avatars":
                    return true;
                default:
                    return super.parseFieldCheck(visitorCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorCounter visitorCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCnt", visitorCounter.newCnt);
            jsonGenerator.writeNumberField("totalCnt", visitorCounter.totalCnt);
            if (visitorCounter.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(visitorCounter.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1077a(String str) {
        return str;
    }

    public static VisitorCounter new_() {
        VisitorCounter visitorCounter = new VisitorCounter();
        visitorCounter.nullCheck();
        return visitorCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VisitorCounter m19331clone() {
        VisitorCounter visitorCounter = new VisitorCounter();
        visitorCounter.newCnt = this.newCnt;
        visitorCounter.totalCnt = this.totalCnt;
        List<String> list = this.avatars;
        if (list != null) {
            visitorCounter.avatars = ValueObject.util_map(list, new w9j() { // from class: l.v5m0
                public final Object call(Object obj) {
                    return VisitorCounter.m1077a((String) obj);
                }
            });
        }
        return visitorCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorCounter)) {
            return false;
        }
        VisitorCounter visitorCounter = (VisitorCounter) obj;
        return this.newCnt == visitorCounter.newCnt && this.totalCnt == visitorCounter.totalCnt && ValueObject.util_equals(this.avatars, visitorCounter.avatars);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.newCnt) * 41) + this.totalCnt) * 41;
        List<String> list = this.avatars;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
