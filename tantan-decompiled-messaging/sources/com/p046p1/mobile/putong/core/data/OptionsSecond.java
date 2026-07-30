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
public class OptionsSecond extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "optionssecond";

    @ProtobufIndex(index = 4)
    public boolean exclusive;

    @NonNull
    @ProtobufIndex(index = 3)
    public OptionsIcon icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20464id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String placeholder;

    @ProtobufIndex(index = 6)
    public boolean requireInput;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<OptionsSecond> PROTOBUF_ADAPTER = new MessageNanoAdapter<OptionsSecond>() { // from class: com.p1.mobile.putong.core.data.OptionsSecond.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OptionsSecond optionsSecond) {
            String str = optionsSecond.f20464id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = optionsSecond.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            OptionsIcon optionsIcon = optionsSecond.icon;
            if (optionsIcon != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(4, optionsSecond.exclusive);
            String str3 = optionsSecond.placeholder;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(6, optionsSecond.requireInput);
            optionsSecond.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OptionsSecond parse(nb5 nb5Var) throws IOException {
            OptionsSecond optionsSecond = new OptionsSecond();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (optionsSecond.f20464id == null) {
                        optionsSecond.f20464id = "";
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
                if (iM158752u == 10) {
                    optionsSecond.f20464id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    optionsSecond.text = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    optionsSecond.icon = (OptionsIcon) nb5Var.m158743l(OptionsIcon.PROTOBUF_ADAPTER);
                } else if (iM158752u == 32) {
                    optionsSecond.exclusive = nb5Var.m158738g();
                } else if (iM158752u == 42) {
                    optionsSecond.placeholder = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
                        if (optionsSecond.f20464id == null) {
                            optionsSecond.f20464id = "";
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
                    optionsSecond.requireInput = nb5Var.m158738g();
                }
            }
            return optionsSecond;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OptionsSecond optionsSecond, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = optionsSecond.f20464id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = optionsSecond.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            OptionsIcon optionsIcon = optionsSecond.icon;
            if (optionsIcon != null) {
                codedOutputByteBufferNano.m17254K(3, optionsIcon, OptionsIcon.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(4, optionsSecond.exclusive);
            String str3 = optionsSecond.placeholder;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            codedOutputByteBufferNano.m17244A(6, optionsSecond.requireInput);
        }
    };
    public static JsonAdapter<OptionsSecond> JSON_ADAPTER = new ObjectJsonAdapter<OptionsSecond>() { // from class: com.p1.mobile.putong.core.data.OptionsSecond.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OptionsSecond.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OptionsSecond newInstance() {
            return new OptionsSecond();
        }

        public boolean parseField(OptionsSecond optionsSecond, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "requireInput":
                    optionsSecond.requireInput = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    optionsSecond.f20464id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    optionsSecond.icon = OptionsIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OptionsSecond optionsSecond, JsonGenerator jsonGenerator) throws IOException {
            String str = optionsSecond.f20464id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = optionsSecond.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            if (optionsSecond.icon != null) {
                jsonGenerator.writeFieldName("icon");
                OptionsIcon.JSON_ADAPTER.serialize(optionsSecond.icon, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("exclusive", optionsSecond.exclusive);
            String str3 = optionsSecond.placeholder;
            if (str3 != null) {
                jsonGenerator.writeStringField("placeholder", str3);
            }
            jsonGenerator.writeBooleanField("requireInput", optionsSecond.requireInput);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OptionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OptionsSecond) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OptionsSecond new_() {
        OptionsSecond optionsSecond = new OptionsSecond();
        optionsSecond.nullCheck();
        return optionsSecond;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OptionsSecond mo223809clone() {
        OptionsSecond optionsSecond = new OptionsSecond();
        optionsSecond.f20464id = this.f20464id;
        optionsSecond.text = this.text;
        OptionsIcon optionsIcon = this.icon;
        if (optionsIcon != null) {
            optionsSecond.icon = optionsIcon.mo223809clone();
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
        return ValueObject.util_equals(this.f20464id, optionsSecond.f20464id) && ValueObject.util_equals(this.text, optionsSecond.text) && ValueObject.util_equals(this.icon, optionsSecond.icon) && this.exclusive == optionsSecond.exclusive && ValueObject.util_equals(this.placeholder, optionsSecond.placeholder) && this.requireInput == optionsSecond.requireInput;
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
        String str = this.f20464id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        OptionsIcon optionsIcon = this.icon;
        int iHashCode3 = (((iHashCode2 + (optionsIcon != null ? optionsIcon.hashCode() : 0)) * 41) + (this.exclusive ? 1231 : 1237)) * 41;
        String str3 = this.placeholder;
        int iHashCode4 = ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.requireInput ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public Options mapToOptions() {
        Options optionsNew_ = Options.new_();
        optionsNew_.f20463id = this.f20464id;
        optionsNew_.requireInput = this.requireInput;
        optionsNew_.exclusive = this.exclusive;
        optionsNew_.icon = this.icon;
        optionsNew_.placeholder = this.placeholder;
        optionsNew_.text = this.text;
        return optionsNew_;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20464id == null) {
            this.f20464id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
