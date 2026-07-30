package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorCounter visitorCounter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, visitorCounter.newCnt) + CodedOutputByteBufferNano.m17226h(2, visitorCounter.totalCnt);
            List<String> list = visitorCounter.avatars;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            visitorCounter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorCounter parse(nb5 nb5Var) throws IOException {
            VisitorCounter visitorCounter = new VisitorCounter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (visitorCounter.avatars != null) {
                        break;
                    }
                    visitorCounter.avatars = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    visitorCounter.newCnt = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    visitorCounter.totalCnt = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (visitorCounter.avatars != null) {
                            break;
                        }
                        visitorCounter.avatars = new ArrayList();
                        return visitorCounter;
                    }
                    visitorCounter.avatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return visitorCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorCounter visitorCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, visitorCounter.newCnt);
            codedOutputByteBufferNano.m17250G(2, visitorCounter.totalCnt);
            List<String> list = visitorCounter.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VisitorCounter> JSON_ADAPTER = new ObjectJsonAdapter<VisitorCounter>() { // from class: com.p1.mobile.putong.data.VisitorCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorCounter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorCounter visitorCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newCnt", visitorCounter.newCnt);
            jsonGenerator.writeNumberField("totalCnt", visitorCounter.totalCnt);
            if (visitorCounter.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(visitorCounter.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60159a(String str) {
        return str;
    }

    public static VisitorCounter new_() {
        VisitorCounter visitorCounter = new VisitorCounter();
        visitorCounter.nullCheck();
        return visitorCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorCounter mo223809clone() {
        VisitorCounter visitorCounter = new VisitorCounter();
        visitorCounter.newCnt = this.newCnt;
        visitorCounter.totalCnt = this.totalCnt;
        List<String> list = this.avatars;
        if (list != null) {
            visitorCounter.avatars = ValueObject.util_map(list, new w9j() { // from class: l.v5m0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VisitorCounter.m60159a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.newCnt) * 41) + this.totalCnt) * 41;
        List<String> list = this.avatars;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
