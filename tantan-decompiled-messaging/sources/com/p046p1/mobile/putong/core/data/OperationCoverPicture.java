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
public class OperationCoverPicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "operationcoverpicture";

    @ProtobufIndex(index = 3)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;

    @ProtobufIndex(index = 2)
    public int width;
    public static ProtobufAdapter<OperationCoverPicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<OperationCoverPicture>() { // from class: com.p1.mobile.putong.core.data.OperationCoverPicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OperationCoverPicture operationCoverPicture) {
            String str = operationCoverPicture.url;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, operationCoverPicture.width) + CodedOutputByteBufferNano.m17226h(3, operationCoverPicture.height);
            operationCoverPicture.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OperationCoverPicture parse(nb5 nb5Var) throws IOException {
            OperationCoverPicture operationCoverPicture = new OperationCoverPicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (operationCoverPicture.url != null) {
                        break;
                    }
                    operationCoverPicture.url = "";
                    break;
                }
                if (iM158752u == 10) {
                    operationCoverPicture.url = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    operationCoverPicture.width = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (operationCoverPicture.url != null) {
                            break;
                        }
                        operationCoverPicture.url = "";
                        return operationCoverPicture;
                    }
                    operationCoverPicture.height = nb5Var.m158741j();
                }
            }
            return operationCoverPicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OperationCoverPicture operationCoverPicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = operationCoverPicture.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, operationCoverPicture.width);
            codedOutputByteBufferNano.m17250G(3, operationCoverPicture.height);
        }
    };
    public static JsonAdapter<OperationCoverPicture> JSON_ADAPTER = new ObjectJsonAdapter<OperationCoverPicture>() { // from class: com.p1.mobile.putong.core.data.OperationCoverPicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OperationCoverPicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OperationCoverPicture newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OperationCoverPicture operationCoverPicture, JsonGenerator jsonGenerator) throws IOException {
            String str = operationCoverPicture.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField("width", operationCoverPicture.width);
            jsonGenerator.writeNumberField("height", operationCoverPicture.height);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OperationCoverPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OperationCoverPicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OperationCoverPicture new_() {
        OperationCoverPicture operationCoverPicture = new OperationCoverPicture();
        operationCoverPicture.nullCheck();
        return operationCoverPicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OperationCoverPicture mo223809clone() {
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
        String str = this.url;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.width) * 41) + this.height;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
