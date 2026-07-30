package com.p000p1.mobile.putong.core.data;

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
public class SelectionUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectionuser";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f161id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean vague;
    public static ProtobufAdapter<SelectionUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectionUser>() { // from class: com.p1.mobile.putong.core.data.SelectionUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SelectionUser selectionUser) {
            int iH = CodedOutputByteBufferNano.h(1, selectionUser.f161id) + CodedOutputByteBufferNano.b(2, selectionUser.vague);
            ((MessageNano) selectionUser).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SelectionUser m15573parse(nb5 nb5Var) throws IOException {
            SelectionUser selectionUser = new SelectionUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    selectionUser.f161id = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return selectionUser;
                    }
                    selectionUser.vague = nb5Var.g();
                }
            }
        }

        public void serialize(SelectionUser selectionUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, selectionUser.f161id);
            codedOutputByteBufferNano.A(2, selectionUser.vague);
        }
    };
    public static JsonAdapter<SelectionUser> JSON_ADAPTER = new ObjectJsonAdapter<SelectionUser>() { // from class: com.p1.mobile.putong.core.data.SelectionUser.2
        public Class getDataClass() {
            return SelectionUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SelectionUser m15574newInstance() {
            return new SelectionUser();
        }

        public boolean parseField(SelectionUser selectionUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                selectionUser.f161id = jsonParser.getValueAsInt();
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

        public void serializeFields(SelectionUser selectionUser, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", selectionUser.f161id);
            jsonGenerator.writeBooleanField("vague", selectionUser.vague);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectionUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectionUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectionUser new_() {
        SelectionUser selectionUser = new SelectionUser();
        selectionUser.nullCheck();
        return selectionUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SelectionUser m15572clone() {
        SelectionUser selectionUser = new SelectionUser();
        selectionUser.f161id = this.f161id;
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
        return this.f161id == selectionUser.f161id && this.vague == selectionUser.vague;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.f161id) * 41) + (this.vague ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
