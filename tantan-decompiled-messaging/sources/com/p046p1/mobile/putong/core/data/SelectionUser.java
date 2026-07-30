package com.p046p1.mobile.putong.core.data;

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
public class SelectionUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionuser";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f20499id;

    @ProtobufIndex(index = 2)
    public boolean vague;
    public static ProtobufAdapter<SelectionUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionUser>() { // from class: com.p1.mobile.putong.core.data.SelectionUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SelectionUser selectionUser) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, selectionUser.f20499id) + CodedOutputByteBufferNano.m17220b(2, selectionUser.vague);
            selectionUser.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SelectionUser parse(nb5 nb5Var) throws IOException {
            SelectionUser selectionUser = new SelectionUser();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    selectionUser.f20499id = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return selectionUser;
                    }
                    selectionUser.vague = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SelectionUser selectionUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, selectionUser.f20499id);
            codedOutputByteBufferNano.m17244A(2, selectionUser.vague);
        }
    };
    public static JsonAdapter<SelectionUser> JSON_ADAPTER = new ObjectJsonAdapter<SelectionUser>() { // from class: com.p1.mobile.putong.core.data.SelectionUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SelectionUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SelectionUser newInstance() {
            return new SelectionUser();
        }

        public boolean parseField(SelectionUser selectionUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                selectionUser.f20499id = jsonParser.getValueAsInt();
                return false;
            }
            if (!str.equals("vague")) {
                return false;
            }
            selectionUser.vague = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SelectionUser selectionUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("vague")) {
                return true;
            }
            return super.parseFieldCheck(selectionUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SelectionUser selectionUser, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", selectionUser.f20499id);
            jsonGenerator.writeBooleanField("vague", selectionUser.vague);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectionUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectionUser new_() {
        SelectionUser selectionUser = new SelectionUser();
        selectionUser.nullCheck();
        return selectionUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SelectionUser mo223809clone() {
        SelectionUser selectionUser = new SelectionUser();
        selectionUser.f20499id = this.f20499id;
        selectionUser.vague = this.vague;
        return selectionUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectionUser)) {
            return false;
        }
        SelectionUser selectionUser = (SelectionUser) obj;
        return this.f20499id == selectionUser.f20499id && this.vague == selectionUser.vague;
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
        int i2 = (((i * 41) + this.f20499id) * 41) + (this.vague ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
