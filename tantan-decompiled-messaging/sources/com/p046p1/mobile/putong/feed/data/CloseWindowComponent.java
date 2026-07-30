package com.p046p1.mobile.putong.feed.data;

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
public class CloseWindowComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "closewindowcomponent";

    @ProtobufIndex(index = 1)
    public boolean show;
    public static ProtobufAdapter<CloseWindowComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<CloseWindowComponent>() { // from class: com.p1.mobile.putong.feed.data.CloseWindowComponent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CloseWindowComponent closeWindowComponent) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, closeWindowComponent.show);
            closeWindowComponent.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CloseWindowComponent parse(nb5 nb5Var) throws IOException {
            CloseWindowComponent closeWindowComponent = new CloseWindowComponent();
            while (nb5Var.m158752u() == 8) {
                closeWindowComponent.show = nb5Var.m158738g();
            }
            return closeWindowComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CloseWindowComponent closeWindowComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, closeWindowComponent.show);
        }
    };
    public static JsonAdapter<CloseWindowComponent> JSON_ADAPTER = new ObjectJsonAdapter<CloseWindowComponent>() { // from class: com.p1.mobile.putong.feed.data.CloseWindowComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CloseWindowComponent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CloseWindowComponent newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CloseWindowComponent closeWindowComponent, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", closeWindowComponent.show);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CloseWindowComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CloseWindowComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CloseWindowComponent new_() {
        CloseWindowComponent closeWindowComponent = new CloseWindowComponent();
        closeWindowComponent.nullCheck();
        return closeWindowComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CloseWindowComponent mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.show ? 1231 : 1237);
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
