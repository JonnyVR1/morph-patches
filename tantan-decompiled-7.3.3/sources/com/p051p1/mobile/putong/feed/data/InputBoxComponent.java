package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes13.dex */
public class InputBoxComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "inputboxcomponent";

    @NonNull
    @ProtobufIndex(index = 1)
    public String defaultContent;

    @ProtobufIndex(index = 3)
    public boolean editEnable;

    @NonNull
    @ProtobufIndex(index = 2)
    public String hintContent;

    @ProtobufIndex(index = 4)
    public int maxLines;

    @ProtobufIndex(index = 5)
    public int maxWordCount;
    public static ProtobufAdapter<InputBoxComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<InputBoxComponent>() { // from class: com.p1.mobile.putong.feed.data.InputBoxComponent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InputBoxComponent inputBoxComponent) {
            String str = inputBoxComponent.defaultContent;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = inputBoxComponent.hintContent;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, inputBoxComponent.editEnable) + CodedOutputByteBufferNano.m17281h(4, inputBoxComponent.maxLines) + CodedOutputByteBufferNano.m17281h(5, inputBoxComponent.maxWordCount);
            inputBoxComponent.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InputBoxComponent parse(nc5 nc5Var) throws IOException {
            InputBoxComponent inputBoxComponent = new InputBoxComponent();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (inputBoxComponent.defaultContent == null) {
                        inputBoxComponent.defaultContent = "";
                    }
                    if (inputBoxComponent.hintContent != null) {
                        break;
                    }
                    inputBoxComponent.hintContent = "";
                    break;
                }
                if (iM162497u == 10) {
                    inputBoxComponent.defaultContent = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    inputBoxComponent.hintContent = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    inputBoxComponent.editEnable = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    inputBoxComponent.maxLines = nc5Var.m162486j();
                } else {
                    if (iM162497u != 40) {
                        if (inputBoxComponent.defaultContent == null) {
                            inputBoxComponent.defaultContent = "";
                        }
                        if (inputBoxComponent.hintContent != null) {
                            break;
                        }
                        inputBoxComponent.hintContent = "";
                        return inputBoxComponent;
                    }
                    inputBoxComponent.maxWordCount = nc5Var.m162486j();
                }
            }
            return inputBoxComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InputBoxComponent inputBoxComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inputBoxComponent.defaultContent;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = inputBoxComponent.hintContent;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, inputBoxComponent.editEnable);
            codedOutputByteBufferNano.m17305G(4, inputBoxComponent.maxLines);
            codedOutputByteBufferNano.m17305G(5, inputBoxComponent.maxWordCount);
        }
    };
    public static JsonAdapter<InputBoxComponent> JSON_ADAPTER = new ObjectJsonAdapter<InputBoxComponent>() { // from class: com.p1.mobile.putong.feed.data.InputBoxComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InputBoxComponent.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InputBoxComponent newInstance() {
            return new InputBoxComponent();
        }

        public boolean parseField(InputBoxComponent inputBoxComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "defaultContent":
                    inputBoxComponent.defaultContent = jsonParser.getValueAsString();
                    return true;
                case "maxWordCount":
                    inputBoxComponent.maxWordCount = jsonParser.getValueAsInt();
                    return true;
                case "hintContent":
                    inputBoxComponent.hintContent = jsonParser.getValueAsString();
                    return true;
                case "maxLines":
                    inputBoxComponent.maxLines = jsonParser.getValueAsInt();
                    return true;
                case "editEnable":
                    inputBoxComponent.editEnable = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InputBoxComponent inputBoxComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "defaultContent":
                case "maxWordCount":
                case "hintContent":
                case "maxLines":
                case "editEnable":
                    return true;
                default:
                    return super.parseFieldCheck(inputBoxComponent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InputBoxComponent inputBoxComponent, JsonGenerator jsonGenerator) throws IOException {
            String str = inputBoxComponent.defaultContent;
            if (str != null) {
                jsonGenerator.writeStringField("defaultContent", str);
            }
            String str2 = inputBoxComponent.hintContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("hintContent", str2);
            }
            jsonGenerator.writeBooleanField("editEnable", inputBoxComponent.editEnable);
            jsonGenerator.writeNumberField("maxLines", inputBoxComponent.maxLines);
            jsonGenerator.writeNumberField("maxWordCount", inputBoxComponent.maxWordCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InputBoxComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InputBoxComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InputBoxComponent new_() {
        InputBoxComponent inputBoxComponent = new InputBoxComponent();
        inputBoxComponent.nullCheck();
        return inputBoxComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InputBoxComponent mo225055clone() {
        InputBoxComponent inputBoxComponent = new InputBoxComponent();
        inputBoxComponent.defaultContent = this.defaultContent;
        inputBoxComponent.hintContent = this.hintContent;
        inputBoxComponent.editEnable = this.editEnable;
        inputBoxComponent.maxLines = this.maxLines;
        inputBoxComponent.maxWordCount = this.maxWordCount;
        return inputBoxComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputBoxComponent)) {
            return false;
        }
        InputBoxComponent inputBoxComponent = (InputBoxComponent) obj;
        return ValueObject.util_equals(this.defaultContent, inputBoxComponent.defaultContent) && ValueObject.util_equals(this.hintContent, inputBoxComponent.hintContent) && this.editEnable == inputBoxComponent.editEnable && this.maxLines == inputBoxComponent.maxLines && this.maxWordCount == inputBoxComponent.maxWordCount;
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
        String str = this.defaultContent;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.hintContent;
        int iHashCode2 = ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.editEnable ? 1231 : 1237)) * 41) + this.maxLines) * 41) + this.maxWordCount;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.defaultContent == null) {
            this.defaultContent = "";
        }
        if (this.hintContent == null) {
            this.hintContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
