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
public class IsShowNewMyTab extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "isshownewmytab";

    @ProtobufIndex(index = 1)
    public boolean have_frame;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean no_frame;
    public static ProtobufAdapter<IsShowNewMyTab> PROTOBUF_ADAPTER = new MessageNanoAdapter<IsShowNewMyTab>() { // from class: com.p1.mobile.putong.core.data.IsShowNewMyTab.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IsShowNewMyTab isShowNewMyTab) {
            int iB = CodedOutputByteBufferNano.b(1, isShowNewMyTab.have_frame) + CodedOutputByteBufferNano.b(2, isShowNewMyTab.no_frame);
            ((MessageNano) isShowNewMyTab).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IsShowNewMyTab m13751parse(nb5 nb5Var) throws IOException {
            IsShowNewMyTab isShowNewMyTab = new IsShowNewMyTab();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    isShowNewMyTab.have_frame = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return isShowNewMyTab;
                    }
                    isShowNewMyTab.no_frame = nb5Var.g();
                }
            }
        }

        public void serialize(IsShowNewMyTab isShowNewMyTab, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, isShowNewMyTab.have_frame);
            codedOutputByteBufferNano.A(2, isShowNewMyTab.no_frame);
        }
    };
    public static JsonAdapter<IsShowNewMyTab> JSON_ADAPTER = new ObjectJsonAdapter<IsShowNewMyTab>() { // from class: com.p1.mobile.putong.core.data.IsShowNewMyTab.2
        public Class getDataClass() {
            return IsShowNewMyTab.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IsShowNewMyTab m13752newInstance() {
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

        public void serializeFields(IsShowNewMyTab isShowNewMyTab, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("have_frame", isShowNewMyTab.have_frame);
            jsonGenerator.writeBooleanField("no_frame", isShowNewMyTab.no_frame);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IsShowNewMyTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IsShowNewMyTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IsShowNewMyTab new_() {
        IsShowNewMyTab isShowNewMyTab = new IsShowNewMyTab();
        isShowNewMyTab.nullCheck();
        return isShowNewMyTab;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IsShowNewMyTab m13750clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.have_frame ? 1231 : 1237)) * 41) + (this.no_frame ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
