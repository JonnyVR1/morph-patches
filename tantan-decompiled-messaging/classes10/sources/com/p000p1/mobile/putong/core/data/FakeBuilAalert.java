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
public class FakeBuilAalert extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakebuilaalert";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String link;
    public static ProtobufAdapter<FakeBuilAalert> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeBuilAalert>() { // from class: com.p1.mobile.putong.core.data.FakeBuilAalert.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakeBuilAalert fakeBuilAalert) {
            String str = fakeBuilAalert.content;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = fakeBuilAalert.link;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = fakeBuilAalert.button;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) fakeBuilAalert).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakeBuilAalert m12705parse(nb5 nb5Var) throws IOException {
            FakeBuilAalert fakeBuilAalert = new FakeBuilAalert();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    fakeBuilAalert.content = nb5Var.s();
                } else if (iU == 18) {
                    fakeBuilAalert.link = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    fakeBuilAalert.button = nb5Var.s();
                }
            }
            return fakeBuilAalert;
        }

        public void serialize(FakeBuilAalert fakeBuilAalert, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fakeBuilAalert.content;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = fakeBuilAalert.link;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = fakeBuilAalert.button;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<FakeBuilAalert> JSON_ADAPTER = new ObjectJsonAdapter<FakeBuilAalert>() { // from class: com.p1.mobile.putong.core.data.FakeBuilAalert.2
        public Class getDataClass() {
            return FakeBuilAalert.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakeBuilAalert m12706newInstance() {
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

        public void serializeFields(FakeBuilAalert fakeBuilAalert, JsonGenerator jsonGenerator) throws IOException {
            String str = fakeBuilAalert.content;
            if (str != null) {
                jsonGenerator.writeStringField(Content.TYPE, str);
            }
            String str2 = fakeBuilAalert.link;
            if (str2 != null) {
                jsonGenerator.writeStringField("link", str2);
            }
            String str3 = fakeBuilAalert.button;
            if (str3 != null) {
                jsonGenerator.writeStringField(Button.TYPE, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeBuilAalert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeBuilAalert) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeBuilAalert new_() {
        FakeBuilAalert fakeBuilAalert = new FakeBuilAalert();
        fakeBuilAalert.nullCheck();
        return fakeBuilAalert;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakeBuilAalert m12704clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
