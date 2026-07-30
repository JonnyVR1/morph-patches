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
public class Option extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "option";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20462id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<Option> PROTOBUF_ADAPTER = new MessageNanoAdapter<Option>() { // from class: com.p1.mobile.putong.core.data.Option.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Option option) {
            String str = option.f20462id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = option.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            option.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Option parse(nb5 nb5Var) throws IOException {
            Option option = new Option();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (option.f20462id == null) {
                        option.f20462id = "";
                    }
                    if (option.text != null) {
                        break;
                    }
                    option.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    option.f20462id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (option.f20462id == null) {
                            option.f20462id = "";
                        }
                        if (option.text != null) {
                            break;
                        }
                        option.text = "";
                        return option;
                    }
                    option.text = nb5Var.m158750s();
                }
            }
            return option;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Option option, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = option.f20462id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = option.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<Option> JSON_ADAPTER = new ObjectJsonAdapter<Option>() { // from class: com.p1.mobile.putong.core.data.Option.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Option.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Option newInstance() {
            return new Option();
        }

        public boolean parseField(Option option, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                option.f20462id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("text")) {
                return false;
            }
            option.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Option option, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(option, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Option option, JsonGenerator jsonGenerator) throws IOException {
            String str = option.f20462id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = option.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Option) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Option) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Option new_() {
        Option option = new Option();
        option.nullCheck();
        return option;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Option mo223809clone() {
        Option option = new Option();
        option.f20462id = this.f20462id;
        option.text = this.text;
        return option;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Option)) {
            return false;
        }
        Option option = (Option) obj;
        return ValueObject.util_equals(this.f20462id, option.f20462id) && ValueObject.util_equals(this.text, option.text);
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
        String str = this.f20462id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20462id == null) {
            this.f20462id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
