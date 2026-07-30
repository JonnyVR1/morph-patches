package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class StatusesItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statusesitem";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<StatusesItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<StatusesItem>() { // from class: com.p1.mobile.putong.data.StatusesItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StatusesItem statusesItem) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, statusesItem.code);
            String str = statusesItem.text;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            statusesItem.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StatusesItem parse(nb5 nb5Var) throws IOException {
            StatusesItem statusesItem = new StatusesItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (statusesItem.text != null) {
                        break;
                    }
                    statusesItem.text = "";
                    break;
                }
                if (iM158752u == 8) {
                    statusesItem.code = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (statusesItem.text != null) {
                            break;
                        }
                        statusesItem.text = "";
                        return statusesItem;
                    }
                    statusesItem.text = nb5Var.m158750s();
                }
            }
            return statusesItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StatusesItem statusesItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, statusesItem.code);
            String str = statusesItem.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<StatusesItem> JSON_ADAPTER = new ObjectJsonAdapter<StatusesItem>() { // from class: com.p1.mobile.putong.data.StatusesItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StatusesItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StatusesItem newInstance() {
            return new StatusesItem();
        }

        public boolean parseField(StatusesItem statusesItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("code")) {
                statusesItem.code = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            statusesItem.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(StatusesItem statusesItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("code") || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(statusesItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StatusesItem statusesItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", statusesItem.code);
            String str = statusesItem.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StatusesItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StatusesItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StatusesItem new_() {
        StatusesItem statusesItem = new StatusesItem();
        statusesItem.nullCheck();
        return statusesItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StatusesItem mo223809clone() {
        StatusesItem statusesItem = new StatusesItem();
        statusesItem.code = this.code;
        statusesItem.text = this.text;
        return statusesItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatusesItem)) {
            return false;
        }
        StatusesItem statusesItem = (StatusesItem) obj;
        return this.code == statusesItem.code && ValueObject.util_equals(this.text, statusesItem.text);
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
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
