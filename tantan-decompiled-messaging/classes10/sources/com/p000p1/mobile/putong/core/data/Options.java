package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.QuestionsSecond;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Options extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "options";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean exclusive;

    @NonNull
    @ProtobufIndex(index = 4)
    public OptionsIcon icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f125id;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String placeholder;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<QuestionsSecond> questions;

    @ProtobufIndex(index = 7)
    public boolean requireInput;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<Options> PROTOBUF_ADAPTER = new MessageNanoAdapter<Options>() { // from class: com.p1.mobile.putong.core.data.Options.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Options options) {
            String str = options.f125id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = options.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, options.exclusive);
            OptionsIcon optionsIcon = options.icon;
            if (optionsIcon != null) {
                iB += CodedOutputByteBufferNano.l(4, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            String str3 = options.placeholder;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(5, str3);
            }
            List<QuestionsSecond> list = options.questions;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(6, list, QuestionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(7, options.requireInput);
            ((MessageNano) options).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Options m14691parse(nb5 nb5Var) throws IOException {
            Options options = new Options();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (options.f125id == null) {
                        options.f125id = "";
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
                if (iU == 10) {
                    options.f125id = nb5Var.s();
                } else if (iU == 18) {
                    options.text = nb5Var.s();
                } else if (iU == 24) {
                    options.exclusive = nb5Var.g();
                } else if (iU == 34) {
                    options.icon = (OptionsIcon) nb5Var.l(OptionsIcon.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    options.placeholder = nb5Var.s();
                } else if (iU == 50) {
                    options.questions = (List) nb5Var.l(QuestionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 56) {
                        if (options.f125id == null) {
                            options.f125id = "";
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
                    options.requireInput = nb5Var.g();
                }
            }
            return options;
        }

        public void serialize(Options options, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = options.f125id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = options.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, options.exclusive);
            OptionsIcon optionsIcon = options.icon;
            if (optionsIcon != null) {
                codedOutputByteBufferNano.K(4, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            String str3 = options.placeholder;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            List<QuestionsSecond> list = options.questions;
            if (list != null) {
                codedOutputByteBufferNano.K(6, list, QuestionsSecond.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(7, options.requireInput);
        }
    };
    public static JsonAdapter<Options> JSON_ADAPTER = new ObjectJsonAdapter<Options>() { // from class: com.p1.mobile.putong.core.data.Options.2
        public Class getDataClass() {
            return Options.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Options m14692newInstance() {
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
                    options.f125id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    options.icon = (OptionsIcon) OptionsIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(Options options, JsonGenerator jsonGenerator) throws IOException {
            String str = options.f125id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = options.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("exclusive", options.exclusive);
            if (options.icon != null) {
                jsonGenerator.writeFieldName(HomeTabModuleTopicShowType.icon);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Options) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Options) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Options new_() {
        Options options = new Options();
        options.nullCheck();
        return options;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Options m14690clone() {
        Options options = new Options();
        options.f125id = this.f125id;
        options.text = this.text;
        options.exclusive = this.exclusive;
        OptionsIcon optionsIcon = this.icon;
        if (optionsIcon != null) {
            options.icon = optionsIcon.m14694clone();
        }
        options.placeholder = this.placeholder;
        List<QuestionsSecond> list = this.questions;
        if (list != null) {
            options.questions = ValueObject.util_map(list, new w9j() { // from class: l.mx50
                public final Object call(Object obj) {
                    return ((QuestionsSecond) obj).m15148clone();
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
        return ValueObject.util_equals(this.f125id, options.f125id) && ValueObject.util_equals(this.text, options.text) && this.exclusive == options.exclusive && ValueObject.util_equals(this.icon, options.icon) && ValueObject.util_equals(this.placeholder, options.placeholder) && ValueObject.util_equals(this.questions, options.questions) && this.requireInput == options.requireInput;
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
        String str = this.f125id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.exclusive ? 1231 : 1237)) * 41;
        OptionsIcon optionsIcon = this.icon;
        int iHashCode3 = (iHashCode2 + (optionsIcon != null ? optionsIcon.hashCode() : 0)) * 41;
        String str3 = this.placeholder;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<QuestionsSecond> list = this.questions;
        int iHashCode5 = ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + (this.requireInput ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f125id == null) {
            this.f125id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
