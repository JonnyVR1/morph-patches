package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class JmpTarget extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jmptarget";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 1)
    public String page;
    public static ProtobufAdapter<JmpTarget> PROTOBUF_ADAPTER = new MessageNanoAdapter<JmpTarget>() { // from class: com.p1.mobile.putong.core.data.JmpTarget.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(JmpTarget jmpTarget) {
            String str = jmpTarget.page;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = jmpTarget.deeplink;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) jmpTarget).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public JmpTarget m13767parse(nb5 nb5Var) throws IOException {
            JmpTarget jmpTarget = new JmpTarget();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (jmpTarget.page == null) {
                        jmpTarget.page = "";
                    }
                    if (jmpTarget.deeplink != null) {
                        break;
                    }
                    jmpTarget.deeplink = "";
                    break;
                }
                if (iU == 10) {
                    jmpTarget.page = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (jmpTarget.page == null) {
                            jmpTarget.page = "";
                        }
                        if (jmpTarget.deeplink != null) {
                            break;
                        }
                        jmpTarget.deeplink = "";
                        return jmpTarget;
                    }
                    jmpTarget.deeplink = nb5Var.s();
                }
            }
            return jmpTarget;
        }

        public void serialize(JmpTarget jmpTarget, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jmpTarget.page;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = jmpTarget.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<JmpTarget> JSON_ADAPTER = new ObjectJsonAdapter<JmpTarget>() { // from class: com.p1.mobile.putong.core.data.JmpTarget.2
        public Class getDataClass() {
            return JmpTarget.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public JmpTarget m13768newInstance() {
            return new JmpTarget();
        }

        public boolean parseField(JmpTarget jmpTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("page")) {
                jmpTarget.page = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("deeplink")) {
                return false;
            }
            jmpTarget.deeplink = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(JmpTarget jmpTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("page") || str.equals("deeplink")) {
                return true;
            }
            return super.parseFieldCheck(jmpTarget, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(JmpTarget jmpTarget, JsonGenerator jsonGenerator) throws IOException {
            String str = jmpTarget.page;
            if (str != null) {
                jsonGenerator.writeStringField("page", str);
            }
            String str2 = jmpTarget.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField("deeplink", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JmpTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JmpTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JmpTarget new_() {
        JmpTarget jmpTarget = new JmpTarget();
        jmpTarget.nullCheck();
        return jmpTarget;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JmpTarget m13766clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.page;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deeplink;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.page == null) {
            this.page = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
