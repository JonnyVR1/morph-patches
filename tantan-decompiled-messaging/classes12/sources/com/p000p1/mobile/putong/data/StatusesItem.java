package com.p000p1.mobile.putong.data;

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
public class StatusesItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statusesitem";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<StatusesItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<StatusesItem>() { // from class: com.p1.mobile.putong.data.StatusesItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StatusesItem statusesItem) {
            int iH = CodedOutputByteBufferNano.h(1, statusesItem.code);
            String str = statusesItem.text;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) statusesItem).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StatusesItem m19025parse(nb5 nb5Var) throws IOException {
            StatusesItem statusesItem = new StatusesItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (statusesItem.text != null) {
                        break;
                    }
                    statusesItem.text = "";
                    break;
                }
                if (iU == 8) {
                    statusesItem.code = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (statusesItem.text != null) {
                            break;
                        }
                        statusesItem.text = "";
                        return statusesItem;
                    }
                    statusesItem.text = nb5Var.s();
                }
            }
            return statusesItem;
        }

        public void serialize(StatusesItem statusesItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, statusesItem.code);
            String str = statusesItem.text;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<StatusesItem> JSON_ADAPTER = new ObjectJsonAdapter<StatusesItem>() { // from class: com.p1.mobile.putong.data.StatusesItem.2
        public Class getDataClass() {
            return StatusesItem.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public StatusesItem mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StatusesItem statusesItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", statusesItem.code);
            String str = statusesItem.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StatusesItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StatusesItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StatusesItem new_() {
        StatusesItem statusesItem = new StatusesItem();
        statusesItem.nullCheck();
        return statusesItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StatusesItem m19024clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
