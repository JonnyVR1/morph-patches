package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class SelectionUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionuser";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f21241id;

    @ProtobufIndex(index = 2)
    public boolean vague;
    public static ProtobufAdapter<SelectionUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionUser>() { // from class: com.p1.mobile.putong.core.data.SelectionUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SelectionUser selectionUser) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, selectionUser.f21241id) + CodedOutputByteBufferNano.m17275b(2, selectionUser.vague);
            selectionUser.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SelectionUser parse(nc5 nc5Var) throws IOException {
            SelectionUser selectionUser = new SelectionUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    selectionUser.f21241id = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return selectionUser;
                    }
                    selectionUser.vague = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SelectionUser selectionUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, selectionUser.f21241id);
            codedOutputByteBufferNano.m17299A(2, selectionUser.vague);
        }
    };
    public static JsonAdapter<SelectionUser> JSON_ADAPTER = new ObjectJsonAdapter<SelectionUser>() { // from class: com.p1.mobile.putong.core.data.SelectionUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SelectionUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SelectionUser newInstance() {
            return new SelectionUser();
        }

        public boolean parseField(SelectionUser selectionUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                selectionUser.f21241id = jsonParser.getValueAsInt();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SelectionUser selectionUser, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", selectionUser.f21241id);
            jsonGenerator.writeBooleanField("vague", selectionUser.vague);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public SelectionUser mo225055clone() {
        SelectionUser selectionUser = new SelectionUser();
        selectionUser.f21241id = this.f21241id;
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
        return this.f21241id == selectionUser.f21241id && this.vague == selectionUser.vague;
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
        int i2 = (((i * 41) + this.f21241id) * 41) + (this.vague ? 1231 : 1237);
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
