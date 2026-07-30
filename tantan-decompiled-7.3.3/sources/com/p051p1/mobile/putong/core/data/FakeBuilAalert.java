package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Link;
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

/* JADX INFO: loaded from: classes10.dex */
public class FakeBuilAalert extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakebuilaalert";

    @NonNull
    @ProtobufIndex(index = 3)
    public String button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 2)
    public String link;
    public static ProtobufAdapter<FakeBuilAalert> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeBuilAalert>() { // from class: com.p1.mobile.putong.core.data.FakeBuilAalert.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakeBuilAalert fakeBuilAalert) {
            String str = fakeBuilAalert.content;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = fakeBuilAalert.link;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = fakeBuilAalert.button;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            fakeBuilAalert.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakeBuilAalert parse(nc5 nc5Var) throws IOException {
            FakeBuilAalert fakeBuilAalert = new FakeBuilAalert();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fakeBuilAalert.content == null) {
                        fakeBuilAalert.content = "";
                    }
                    if (fakeBuilAalert.link == null) {
                        fakeBuilAalert.link = "";
                    }
                    if (fakeBuilAalert.button != null) {
                        break;
                    }
                    fakeBuilAalert.button = "";
                    break;
                }
                if (iM162497u == 10) {
                    fakeBuilAalert.content = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    fakeBuilAalert.link = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (fakeBuilAalert.content == null) {
                            fakeBuilAalert.content = "";
                        }
                        if (fakeBuilAalert.link == null) {
                            fakeBuilAalert.link = "";
                        }
                        if (fakeBuilAalert.button != null) {
                            break;
                        }
                        fakeBuilAalert.button = "";
                        return fakeBuilAalert;
                    }
                    fakeBuilAalert.button = nc5Var.m162495s();
                }
            }
            return fakeBuilAalert;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakeBuilAalert fakeBuilAalert, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakeBuilAalert.content;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = fakeBuilAalert.link;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = fakeBuilAalert.button;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<FakeBuilAalert> JSON_ADAPTER = new ObjectJsonAdapter<FakeBuilAalert>() { // from class: com.p1.mobile.putong.core.data.FakeBuilAalert.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakeBuilAalert.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakeBuilAalert newInstance() {
            return new FakeBuilAalert();
        }

        public boolean parseField(FakeBuilAalert fakeBuilAalert, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "button":
                    fakeBuilAalert.button = jsonParser.getValueAsString();
                    return true;
                case "link":
                    fakeBuilAalert.link = jsonParser.getValueAsString();
                    return true;
                case "content":
                    fakeBuilAalert.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakeBuilAalert fakeBuilAalert, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "button":
                case "link":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(fakeBuilAalert, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeBuilAalert fakeBuilAalert, JsonGenerator jsonGenerator) throws IOException {
            String str = fakeBuilAalert.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = fakeBuilAalert.link;
            if (str2 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str2);
            }
            String str3 = fakeBuilAalert.button;
            if (str3 != null) {
                jsonGenerator.writeStringField("button", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeBuilAalert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeBuilAalert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeBuilAalert new_() {
        FakeBuilAalert fakeBuilAalert = new FakeBuilAalert();
        fakeBuilAalert.nullCheck();
        return fakeBuilAalert;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakeBuilAalert mo225055clone() {
        FakeBuilAalert fakeBuilAalert = new FakeBuilAalert();
        fakeBuilAalert.content = this.content;
        fakeBuilAalert.link = this.link;
        fakeBuilAalert.button = this.button;
        return fakeBuilAalert;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeBuilAalert)) {
            return false;
        }
        FakeBuilAalert fakeBuilAalert = (FakeBuilAalert) obj;
        return ValueObject.util_equals(this.content, fakeBuilAalert.content) && ValueObject.util_equals(this.link, fakeBuilAalert.link) && ValueObject.util_equals(this.button, fakeBuilAalert.button);
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
        int i2 = i * 41;
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.button;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.button == null) {
            this.button = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
