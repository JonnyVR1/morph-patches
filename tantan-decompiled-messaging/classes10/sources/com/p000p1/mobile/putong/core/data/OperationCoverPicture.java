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
public class OperationCoverPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "operationcoverpicture";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int width;
    public static ProtobufAdapter<OperationCoverPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<OperationCoverPicture>() { // from class: com.p1.mobile.putong.core.data.OperationCoverPicture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OperationCoverPicture operationCoverPicture) {
            String str = operationCoverPicture.url;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, operationCoverPicture.width) + CodedOutputByteBufferNano.h(3, operationCoverPicture.height);
            ((MessageNano) operationCoverPicture).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OperationCoverPicture m14671parse(nb5 nb5Var) throws IOException {
            OperationCoverPicture operationCoverPicture = new OperationCoverPicture();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (operationCoverPicture.url != null) {
                        break;
                    }
                    operationCoverPicture.url = "";
                    break;
                }
                if (iU == 10) {
                    operationCoverPicture.url = nb5Var.s();
                } else if (iU == 16) {
                    operationCoverPicture.width = nb5Var.j();
                } else {
                    if (iU != 24) {
                        if (operationCoverPicture.url != null) {
                            break;
                        }
                        operationCoverPicture.url = "";
                        return operationCoverPicture;
                    }
                    operationCoverPicture.height = nb5Var.j();
                }
            }
            return operationCoverPicture;
        }

        public void serialize(OperationCoverPicture operationCoverPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = operationCoverPicture.url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, operationCoverPicture.width);
            codedOutputByteBufferNano.G(3, operationCoverPicture.height);
        }
    };
    public static JsonAdapter<OperationCoverPicture> JSON_ADAPTER = new ObjectJsonAdapter<OperationCoverPicture>() { // from class: com.p1.mobile.putong.core.data.OperationCoverPicture.2
        public Class getDataClass() {
            return OperationCoverPicture.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OperationCoverPicture m14672newInstance() {
            return new OperationCoverPicture();
        }

        public boolean parseField(OperationCoverPicture operationCoverPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    operationCoverPicture.height = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    operationCoverPicture.url = jsonParser.getValueAsString();
                    return true;
                case "width":
                    operationCoverPicture.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OperationCoverPicture operationCoverPicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "height":
                case "url":
                case "width":
                    return true;
                default:
                    return super.parseFieldCheck(operationCoverPicture, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OperationCoverPicture operationCoverPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = operationCoverPicture.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField("width", operationCoverPicture.width);
            jsonGenerator.writeNumberField(ProfileLikeCategoryType.height, operationCoverPicture.height);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OperationCoverPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OperationCoverPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OperationCoverPicture new_() {
        OperationCoverPicture operationCoverPicture = new OperationCoverPicture();
        operationCoverPicture.nullCheck();
        return operationCoverPicture;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OperationCoverPicture m14670clone() {
        OperationCoverPicture operationCoverPicture = new OperationCoverPicture();
        operationCoverPicture.url = this.url;
        operationCoverPicture.width = this.width;
        operationCoverPicture.height = this.height;
        return operationCoverPicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OperationCoverPicture)) {
            return false;
        }
        OperationCoverPicture operationCoverPicture = (OperationCoverPicture) obj;
        return ValueObject.util_equals(this.url, operationCoverPicture.url) && this.width == operationCoverPicture.width && this.height == operationCoverPicture.height;
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
        String str = this.url;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.width) * 41) + this.height;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
