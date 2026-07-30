package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
public class JmpTarget extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jmptarget";

    @NonNull
    @ProtobufIndex(index = 2)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 1)
    public String page;
    public static ProtobufAdapter<JmpTarget> PROTOBUF_ADAPTER = new MessageNanoAdapter<JmpTarget>() { // from class: com.p1.mobile.putong.core.data.JmpTarget.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(JmpTarget jmpTarget) {
            String str = jmpTarget.page;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = jmpTarget.deeplink;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            jmpTarget.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public JmpTarget parse(nc5 nc5Var) throws IOException {
            JmpTarget jmpTarget = new JmpTarget();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (jmpTarget.page == null) {
                        jmpTarget.page = "";
                    }
                    if (jmpTarget.deeplink != null) {
                        break;
                    }
                    jmpTarget.deeplink = "";
                    break;
                }
                if (iM162497u == 10) {
                    jmpTarget.page = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (jmpTarget.page == null) {
                            jmpTarget.page = "";
                        }
                        if (jmpTarget.deeplink != null) {
                            break;
                        }
                        jmpTarget.deeplink = "";
                        return jmpTarget;
                    }
                    jmpTarget.deeplink = nc5Var.m162495s();
                }
            }
            return jmpTarget;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(JmpTarget jmpTarget, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jmpTarget.page;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = jmpTarget.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<JmpTarget> JSON_ADAPTER = new ObjectJsonAdapter<JmpTarget>() { // from class: com.p1.mobile.putong.core.data.JmpTarget.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return JmpTarget.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public JmpTarget newInstance() {
            return new JmpTarget();
        }

        public boolean parseField(JmpTarget jmpTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(OMSTemplateModeType.page)) {
                jmpTarget.page = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(LinkAction.deeplink)) {
                return false;
            }
            jmpTarget.deeplink = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(JmpTarget jmpTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(OMSTemplateModeType.page) || str.equals(LinkAction.deeplink)) {
                return true;
            }
            return super.parseFieldCheck(jmpTarget, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(JmpTarget jmpTarget, JsonGenerator jsonGenerator) throws IOException {
            String str = jmpTarget.page;
            if (str != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.page, str);
            }
            String str2 = jmpTarget.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JmpTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JmpTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JmpTarget new_() {
        JmpTarget jmpTarget = new JmpTarget();
        jmpTarget.nullCheck();
        return jmpTarget;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public JmpTarget mo225055clone() {
        JmpTarget jmpTarget = new JmpTarget();
        jmpTarget.page = this.page;
        jmpTarget.deeplink = this.deeplink;
        return jmpTarget;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JmpTarget)) {
            return false;
        }
        JmpTarget jmpTarget = (JmpTarget) obj;
        return ValueObject.util_equals(this.page, jmpTarget.page) && ValueObject.util_equals(this.deeplink, jmpTarget.deeplink);
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
        String str = this.page;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deeplink;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.page == null) {
            this.page = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
