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
public class Option extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "option";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f124id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<Option> PROTOBUF_ADAPTER = new MessageNanoAdapter<Option>() { // from class: com.p1.mobile.putong.core.data.Option.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Option option) {
            String str = option.f124id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = option.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) option).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Option m14687parse(nb5 nb5Var) throws IOException {
            Option option = new Option();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (option.f124id == null) {
                        option.f124id = "";
                    }
                    if (option.text != null) {
                        break;
                    }
                    option.text = "";
                    break;
                }
                if (iU == 10) {
                    option.f124id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (option.f124id == null) {
                            option.f124id = "";
                        }
                        if (option.text != null) {
                            break;
                        }
                        option.text = "";
                        return option;
                    }
                    option.text = nb5Var.s();
                }
            }
            return option;
        }

        public void serialize(Option option, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = option.f124id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = option.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Option> JSON_ADAPTER = new ObjectJsonAdapter<Option>() { // from class: com.p1.mobile.putong.core.data.Option.2
        public Class getDataClass() {
            return Option.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Option m14688newInstance() {
            return new Option();
        }

        public boolean parseField(Option option, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                option.f124id = jsonParser.getValueAsString();
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

        public void serializeFields(Option option, JsonGenerator jsonGenerator) throws IOException {
            String str = option.f124id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = option.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Option) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Option) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Option new_() {
        Option option = new Option();
        option.nullCheck();
        return option;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Option m14686clone() {
        Option option = new Option();
        option.f124id = this.f124id;
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
        return ValueObject.util_equals(this.f124id, option.f124id) && ValueObject.util_equals(this.text, option.text);
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
        String str = this.f124id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f124id == null) {
            this.f124id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
