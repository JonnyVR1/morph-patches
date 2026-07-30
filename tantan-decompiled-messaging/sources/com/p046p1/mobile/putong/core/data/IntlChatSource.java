package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlChatSource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlchatsource";

    @NonNull
    @ProtobufIndex(index = 1)
    public String source;
    public static ProtobufAdapter<IntlChatSource> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlChatSource>() { // from class: com.p1.mobile.putong.core.data.IntlChatSource.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlChatSource intlChatSource) {
            String str = intlChatSource.source;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            intlChatSource.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlChatSource parse(nb5 nb5Var) throws IOException {
            IntlChatSource intlChatSource = new IntlChatSource();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlChatSource.source != null) {
                        break;
                    }
                    intlChatSource.source = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (intlChatSource.source != null) {
                        break;
                    }
                    intlChatSource.source = "";
                    return intlChatSource;
                }
                intlChatSource.source = nb5Var.m158750s();
            }
            return intlChatSource;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlChatSource intlChatSource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlChatSource.source;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<IntlChatSource> JSON_ADAPTER = new ObjectJsonAdapter<IntlChatSource>() { // from class: com.p1.mobile.putong.core.data.IntlChatSource.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlChatSource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlChatSource newInstance() {
            return new IntlChatSource();
        }

        public boolean parseField(IntlChatSource intlChatSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("source")) {
                return false;
            }
            intlChatSource.source = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlChatSource intlChatSource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("source")) {
                return true;
            }
            return super.parseFieldCheck(intlChatSource, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlChatSource intlChatSource, JsonGenerator jsonGenerator) throws IOException {
            String str = intlChatSource.source;
            if (str != null) {
                jsonGenerator.writeStringField("source", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlChatSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlChatSource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlChatSource new_() {
        IntlChatSource intlChatSource = new IntlChatSource();
        intlChatSource.nullCheck();
        return intlChatSource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlChatSource mo223809clone() {
        IntlChatSource intlChatSource = new IntlChatSource();
        intlChatSource.source = this.source;
        return intlChatSource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlChatSource) {
            return ValueObject.util_equals(this.source, ((IntlChatSource) obj).source);
        }
        return false;
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
        String str = this.source;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
