package com.p000p1.mobile.putong.feed.data;

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
public class CloseWindowComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "closewindowcomponent";

    @ProtobufIndex(index = 1)
    public boolean show;
    public static ProtobufAdapter<CloseWindowComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<CloseWindowComponent>() { // from class: com.p1.mobile.putong.feed.data.CloseWindowComponent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CloseWindowComponent closeWindowComponent) {
            int iB = CodedOutputByteBufferNano.b(1, closeWindowComponent.show);
            ((MessageNano) closeWindowComponent).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CloseWindowComponent m19461parse(nb5 nb5Var) throws IOException {
            CloseWindowComponent closeWindowComponent = new CloseWindowComponent();
            while (nb5Var.u() == 8) {
                closeWindowComponent.show = nb5Var.g();
            }
            return closeWindowComponent;
        }

        public void serialize(CloseWindowComponent closeWindowComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, closeWindowComponent.show);
        }
    };
    public static JsonAdapter<CloseWindowComponent> JSON_ADAPTER = new ObjectJsonAdapter<CloseWindowComponent>() { // from class: com.p1.mobile.putong.feed.data.CloseWindowComponent.2
        public Class getDataClass() {
            return CloseWindowComponent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CloseWindowComponent mo17830newInstance() {
            return new CloseWindowComponent();
        }

        public boolean parseField(CloseWindowComponent closeWindowComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("show")) {
                return false;
            }
            closeWindowComponent.show = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CloseWindowComponent closeWindowComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("show")) {
                return true;
            }
            return super.parseFieldCheck(closeWindowComponent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CloseWindowComponent closeWindowComponent, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", closeWindowComponent.show);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CloseWindowComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CloseWindowComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CloseWindowComponent new_() {
        CloseWindowComponent closeWindowComponent = new CloseWindowComponent();
        closeWindowComponent.nullCheck();
        return closeWindowComponent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CloseWindowComponent m19460clone() {
        CloseWindowComponent closeWindowComponent = new CloseWindowComponent();
        closeWindowComponent.show = this.show;
        return closeWindowComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CloseWindowComponent) && this.show == ((CloseWindowComponent) obj).show;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.show ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
