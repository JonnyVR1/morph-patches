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
public class IsShowNewMyTab extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "isshownewmytab";

    @ProtobufIndex(index = 1)
    public boolean have_frame;

    @ProtobufIndex(index = 2)
    public boolean no_frame;
    public static ProtobufAdapter<IsShowNewMyTab> PROTOBUF_ADAPTER = new MessageNanoAdapter<IsShowNewMyTab>() { // from class: com.p1.mobile.putong.core.data.IsShowNewMyTab.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IsShowNewMyTab isShowNewMyTab) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, isShowNewMyTab.have_frame) + CodedOutputByteBufferNano.m17275b(2, isShowNewMyTab.no_frame);
            isShowNewMyTab.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IsShowNewMyTab parse(nc5 nc5Var) throws IOException {
            IsShowNewMyTab isShowNewMyTab = new IsShowNewMyTab();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    isShowNewMyTab.have_frame = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return isShowNewMyTab;
                    }
                    isShowNewMyTab.no_frame = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IsShowNewMyTab isShowNewMyTab, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, isShowNewMyTab.have_frame);
            codedOutputByteBufferNano.m17299A(2, isShowNewMyTab.no_frame);
        }
    };
    public static JsonAdapter<IsShowNewMyTab> JSON_ADAPTER = new ObjectJsonAdapter<IsShowNewMyTab>() { // from class: com.p1.mobile.putong.core.data.IsShowNewMyTab.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IsShowNewMyTab.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IsShowNewMyTab newInstance() {
            return new IsShowNewMyTab();
        }

        public boolean parseField(IsShowNewMyTab isShowNewMyTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("have_frame")) {
                isShowNewMyTab.have_frame = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("no_frame")) {
                return false;
            }
            isShowNewMyTab.no_frame = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(IsShowNewMyTab isShowNewMyTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("have_frame") || str.equals("no_frame")) {
                return true;
            }
            return super.parseFieldCheck(isShowNewMyTab, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IsShowNewMyTab isShowNewMyTab, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("have_frame", isShowNewMyTab.have_frame);
            jsonGenerator.writeBooleanField("no_frame", isShowNewMyTab.no_frame);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IsShowNewMyTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IsShowNewMyTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IsShowNewMyTab new_() {
        IsShowNewMyTab isShowNewMyTab = new IsShowNewMyTab();
        isShowNewMyTab.nullCheck();
        return isShowNewMyTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IsShowNewMyTab mo225055clone() {
        IsShowNewMyTab isShowNewMyTab = new IsShowNewMyTab();
        isShowNewMyTab.have_frame = this.have_frame;
        isShowNewMyTab.no_frame = this.no_frame;
        return isShowNewMyTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsShowNewMyTab)) {
            return false;
        }
        IsShowNewMyTab isShowNewMyTab = (IsShowNewMyTab) obj;
        return this.have_frame == isShowNewMyTab.have_frame && this.no_frame == isShowNewMyTab.no_frame;
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
        int i2 = (((i * 41) + (this.have_frame ? 1231 : 1237)) * 41) + (this.no_frame ? 1231 : 1237);
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
