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
public class OptionsSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "optionssecond";

    @ProtobufIndex(index = 4)
    public boolean exclusive;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public OptionsIcon icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f126id;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String placeholder;

    @ProtobufIndex(index = 6)
    public boolean requireInput;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<OptionsSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<OptionsSecond>() { // from class: com.p1.mobile.putong.core.data.OptionsSecond.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OptionsSecond optionsSecond) {
            String str = optionsSecond.f126id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = optionsSecond.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            OptionsIcon optionsIcon = optionsSecond.icon;
            if (optionsIcon != null) {
                iO += CodedOutputByteBufferNano.l(3, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, optionsSecond.exclusive);
            String str3 = optionsSecond.placeholder;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(5, str3);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(6, optionsSecond.requireInput);
            ((MessageNano) optionsSecond).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OptionsSecond m14699parse(nb5 nb5Var) throws IOException {
            OptionsSecond optionsSecond = new OptionsSecond();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (optionsSecond.f126id == null) {
                        optionsSecond.f126id = "";
                    }
                    if (optionsSecond.text == null) {
                        optionsSecond.text = "";
                    }
                    if (optionsSecond.icon == null) {
                        optionsSecond.icon = OptionsIcon.new_();
                    }
                    if (optionsSecond.placeholder != null) {
                        break;
                    }
                    optionsSecond.placeholder = "";
                    break;
                }
                if (iU == 10) {
                    optionsSecond.f126id = nb5Var.s();
                } else if (iU == 18) {
                    optionsSecond.text = nb5Var.s();
                } else if (iU == 26) {
                    optionsSecond.icon = (OptionsIcon) nb5Var.l(OptionsIcon.PROTOBUF_ADAPTER);
                } else if (iU == 32) {
                    optionsSecond.exclusive = nb5Var.g();
                } else if (iU == 42) {
                    optionsSecond.placeholder = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (optionsSecond.f126id == null) {
                            optionsSecond.f126id = "";
                        }
                        if (optionsSecond.text == null) {
                            optionsSecond.text = "";
                        }
                        if (optionsSecond.icon == null) {
                            optionsSecond.icon = OptionsIcon.new_();
                        }
                        if (optionsSecond.placeholder != null) {
                            break;
                        }
                        optionsSecond.placeholder = "";
                        return optionsSecond;
                    }
                    optionsSecond.requireInput = nb5Var.g();
                }
            }
            return optionsSecond;
        }

        public void serialize(OptionsSecond optionsSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = optionsSecond.f126id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = optionsSecond.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            OptionsIcon optionsIcon = optionsSecond.icon;
            if (optionsIcon != null) {
                codedOutputByteBufferNano.K(3, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(4, optionsSecond.exclusive);
            String str3 = optionsSecond.placeholder;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.A(6, optionsSecond.requireInput);
        }
    };
    public static JsonAdapter<OptionsSecond> JSON_ADAPTER = new ObjectJsonAdapter<OptionsSecond>() { // from class: com.p1.mobile.putong.core.data.OptionsSecond.2
        public Class getDataClass() {
            return OptionsSecond.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OptionsSecond m14700newInstance() {
            return new OptionsSecond();
        }

        public boolean parseField(OptionsSecond optionsSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "requireInput":
                    optionsSecond.requireInput = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    optionsSecond.f126id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    optionsSecond.icon = (OptionsIcon) OptionsIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "text":
                    optionsSecond.text = jsonParser.getValueAsString();
                    return true;
                case "placeholder":
                    optionsSecond.placeholder = jsonParser.getValueAsString();
                    return true;
                case "exclusive":
                    optionsSecond.exclusive = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OptionsSecond optionsSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
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
                    return super.parseFieldCheck(optionsSecond, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OptionsSecond optionsSecond, JsonGenerator jsonGenerator) throws IOException {
            String str = optionsSecond.f126id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = optionsSecond.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            if (optionsSecond.icon != null) {
                jsonGenerator.writeFieldName(HomeTabModuleTopicShowType.icon);
                OptionsIcon.JSON_ADAPTER.serialize(optionsSecond.icon, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("exclusive", optionsSecond.exclusive);
            String str3 = optionsSecond.placeholder;
            if (str3 != null) {
                jsonGenerator.writeStringField("placeholder", str3);
            }
            jsonGenerator.writeBooleanField("requireInput", optionsSecond.requireInput);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OptionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OptionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OptionsSecond new_() {
        OptionsSecond optionsSecond = new OptionsSecond();
        optionsSecond.nullCheck();
        return optionsSecond;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OptionsSecond m14698clone() {
        OptionsSecond optionsSecond = new OptionsSecond();
        optionsSecond.f126id = this.f126id;
        optionsSecond.text = this.text;
        OptionsIcon optionsIcon = this.icon;
        if (optionsIcon != null) {
            optionsSecond.icon = optionsIcon.m14694clone();
        }
        optionsSecond.exclusive = this.exclusive;
        optionsSecond.placeholder = this.placeholder;
        optionsSecond.requireInput = this.requireInput;
        return optionsSecond;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OptionsSecond)) {
            return false;
        }
        OptionsSecond optionsSecond = (OptionsSecond) obj;
        return ValueObject.util_equals(this.f126id, optionsSecond.f126id) && ValueObject.util_equals(this.text, optionsSecond.text) && ValueObject.util_equals(this.icon, optionsSecond.icon) && this.exclusive == optionsSecond.exclusive && ValueObject.util_equals(this.placeholder, optionsSecond.placeholder) && this.requireInput == optionsSecond.requireInput;
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
        String str = this.f126id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        OptionsIcon optionsIcon = this.icon;
        int iHashCode3 = (((iHashCode2 + (optionsIcon != null ? optionsIcon.hashCode() : 0)) * 41) + (this.exclusive ? 1231 : 1237)) * 41;
        String str3 = this.placeholder;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.requireInput ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public Options mapToOptions() {
        Options optionsNew_ = Options.new_();
        optionsNew_.f125id = this.f126id;
        optionsNew_.requireInput = this.requireInput;
        optionsNew_.exclusive = this.exclusive;
        optionsNew_.icon = this.icon;
        optionsNew_.placeholder = this.placeholder;
        optionsNew_.text = this.text;
        return optionsNew_;
    }

    public void nullCheck() {
        if (this.f126id == null) {
            this.f126id = "";
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
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
