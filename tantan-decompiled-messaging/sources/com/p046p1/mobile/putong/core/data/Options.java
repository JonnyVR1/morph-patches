package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.QuestionsSecond;
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

/* JADX INFO: loaded from: classes10.dex */
public class Options extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "options";

    @ProtobufIndex(index = 3)
    public boolean exclusive;

    @NonNull
    @ProtobufIndex(index = 4)
    public OptionsIcon icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20463id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String placeholder;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<QuestionsSecond> questions;

    @ProtobufIndex(index = 7)
    public boolean requireInput;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<Options> PROTOBUF_ADAPTER = new MessageNanoAdapter<Options>() { // from class: com.p1.mobile.putong.core.data.Options.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Options options) {
            String str = options.f20463id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = options.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, options.exclusive);
            OptionsIcon optionsIcon = options.icon;
            if (optionsIcon != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            String str3 = options.placeholder;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            List<QuestionsSecond> list = options.questions;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, list, QuestionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(7, options.requireInput);
            options.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Options parse(nb5 nb5Var) throws IOException {
            Options options = new Options();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (options.f20463id == null) {
                        options.f20463id = "";
                    }
                    if (options.text == null) {
                        options.text = "";
                    }
                    if (options.icon == null) {
                        options.icon = OptionsIcon.new_();
                    }
                    if (options.placeholder == null) {
                        options.placeholder = "";
                    }
                    if (options.questions != null) {
                        break;
                    }
                    options.questions = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    options.f20463id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    options.text = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    options.exclusive = nb5Var.m158738g();
                } else if (iM158752u == 34) {
                    options.icon = (OptionsIcon) nb5Var.m158743l(OptionsIcon.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    options.placeholder = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    options.questions = (List) nb5Var.m158743l(QuestionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 56) {
                        if (options.f20463id == null) {
                            options.f20463id = "";
                        }
                        if (options.text == null) {
                            options.text = "";
                        }
                        if (options.icon == null) {
                            options.icon = OptionsIcon.new_();
                        }
                        if (options.placeholder == null) {
                            options.placeholder = "";
                        }
                        if (options.questions != null) {
                            break;
                        }
                        options.questions = new ArrayList();
                        return options;
                    }
                    options.requireInput = nb5Var.m158738g();
                }
            }
            return options;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Options options, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = options.f20463id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = options.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, options.exclusive);
            OptionsIcon optionsIcon = options.icon;
            if (optionsIcon != null) {
                codedOutputByteBufferNano.m17254K(4, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            String str3 = options.placeholder;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            List<QuestionsSecond> list = options.questions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, QuestionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(7, options.requireInput);
        }
    };
    public static JsonAdapter<Options> JSON_ADAPTER = new ObjectJsonAdapter<Options>() { // from class: com.p1.mobile.putong.core.data.Options.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Options.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Options newInstance() {
            return new Options();
        }

        public boolean parseField(Options options, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questions":
                    options.questions = JsonAdapter.parseArray(jsonParser, QuestionsSecond.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "requireInput":
                    options.requireInput = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    options.f20463id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    options.icon = OptionsIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "text":
                    options.text = jsonParser.getValueAsString();
                    return true;
                case "placeholder":
                    options.placeholder = jsonParser.getValueAsString();
                    return true;
                case "exclusive":
                    options.exclusive = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Options options, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "questions":
                case "requireInput":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "text":
                case "placeholder":
                case "exclusive":
                    return true;
                default:
                    return super.parseFieldCheck(options, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Options options, JsonGenerator jsonGenerator) throws IOException {
            String str = options.f20463id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = options.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("exclusive", options.exclusive);
            if (options.icon != null) {
                jsonGenerator.writeFieldName("icon");
                OptionsIcon.JSON_ADAPTER.serialize(options.icon, jsonGenerator, true);
            }
            String str3 = options.placeholder;
            if (str3 != null) {
                jsonGenerator.writeStringField("placeholder", str3);
            }
            if (options.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(options.questions, jsonGenerator, QuestionsSecond.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("requireInput", options.requireInput);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Options) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Options) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Options new_() {
        Options options = new Options();
        options.nullCheck();
        return options;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Options mo223809clone() {
        Options options = new Options();
        options.f20463id = this.f20463id;
        options.text = this.text;
        options.exclusive = this.exclusive;
        OptionsIcon optionsIcon = this.icon;
        if (optionsIcon != null) {
            options.icon = optionsIcon.mo223809clone();
        }
        options.placeholder = this.placeholder;
        List<QuestionsSecond> list = this.questions;
        if (list != null) {
            options.questions = ValueObject.util_map(list, new w9j() { // from class: l.mx50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((QuestionsSecond) obj).mo223809clone();
                }
            });
        }
        options.requireInput = this.requireInput;
        return options;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return ValueObject.util_equals(this.f20463id, options.f20463id) && ValueObject.util_equals(this.text, options.text) && this.exclusive == options.exclusive && ValueObject.util_equals(this.icon, options.icon) && ValueObject.util_equals(this.placeholder, options.placeholder) && ValueObject.util_equals(this.questions, options.questions) && this.requireInput == options.requireInput;
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
        String str = this.f20463id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.exclusive ? 1231 : 1237)) * 41;
        OptionsIcon optionsIcon = this.icon;
        int iHashCode3 = (iHashCode2 + (optionsIcon != null ? optionsIcon.hashCode() : 0)) * 41;
        String str3 = this.placeholder;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<QuestionsSecond> list = this.questions;
        int iHashCode5 = ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + (this.requireInput ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20463id == null) {
            this.f20463id = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.icon == null) {
            this.icon = OptionsIcon.new_();
        }
        if (this.placeholder == null) {
            this.placeholder = "";
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
