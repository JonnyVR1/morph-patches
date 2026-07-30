package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InputBoxComponent inputBoxComponent) {
            String str = inputBoxComponent.defaultContent;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = inputBoxComponent.hintContent;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, inputBoxComponent.editEnable) + CodedOutputByteBufferNano.h(4, inputBoxComponent.maxLines) + CodedOutputByteBufferNano.h(5, inputBoxComponent.maxWordCount);
            ((MessageNano) inputBoxComponent).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InputBoxComponent m19536parse(nb5 nb5Var) throws IOException {
            InputBoxComponent inputBoxComponent = new InputBoxComponent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (inputBoxComponent.defaultContent == null) {
                        inputBoxComponent.defaultContent = "";
                    }
                    if (inputBoxComponent.hintContent != null) {
                        break;
                    }
                    inputBoxComponent.hintContent = "";
                    break;
                }
                if (iU == 10) {
                    inputBoxComponent.defaultContent = nb5Var.s();
                } else if (iU == 18) {
                    inputBoxComponent.hintContent = nb5Var.s();
                } else if (iU == 24) {
                    inputBoxComponent.editEnable = nb5Var.g();
                } else if (iU == 32) {
                    inputBoxComponent.maxLines = nb5Var.j();
                } else {
                    if (iU != 40) {
                        if (inputBoxComponent.defaultContent == null) {
                            inputBoxComponent.defaultContent = "";
                        }
                        if (inputBoxComponent.hintContent != null) {
                            break;
                        }
                        inputBoxComponent.hintContent = "";
                        return inputBoxComponent;
                    }
                    inputBoxComponent.maxWordCount = nb5Var.j();
                }
            }
            return inputBoxComponent;
        }

        public void serialize(InputBoxComponent inputBoxComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inputBoxComponent.defaultContent;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = inputBoxComponent.hintContent;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, inputBoxComponent.editEnable);
            codedOutputByteBufferNano.G(4, inputBoxComponent.maxLines);
            codedOutputByteBufferNano.G(5, inputBoxComponent.maxWordCount);
        }
    };
    public static JsonAdapter<InputBoxComponent> JSON_ADAPTER = new ObjectJsonAdapter<InputBoxComponent>() { // from class: com.p1.mobile.putong.feed.data.InputBoxComponent.2
        public Class getDataClass() {
            return InputBoxComponent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public InputBoxComponent mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InputBoxComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InputBoxComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InputBoxComponent new_() {
        InputBoxComponent inputBoxComponent = new InputBoxComponent();
        inputBoxComponent.nullCheck();
        return inputBoxComponent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InputBoxComponent m19535clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.defaultContent;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.hintContent;
        int iHashCode2 = ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.editEnable ? 1231 : 1237)) * 41) + this.maxLines) * 41) + this.maxWordCount;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.defaultContent == null) {
            this.defaultContent = "";
        }
        if (this.hintContent == null) {
            this.hintContent = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
