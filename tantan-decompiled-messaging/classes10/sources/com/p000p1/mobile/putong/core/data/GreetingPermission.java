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
public class GreetingPermission extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetingpermission";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String tips;
    public static ProtobufAdapter<GreetingPermission> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingPermission>() { // from class: com.p1.mobile.putong.core.data.GreetingPermission.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingPermission greetingPermission) {
            int iB = CodedOutputByteBufferNano.b(1, greetingPermission.enable);
            String str = greetingPermission.tips;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) greetingPermission).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingPermission m13049parse(nb5 nb5Var) throws IOException {
            GreetingPermission greetingPermission = new GreetingPermission();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingPermission.tips != null) {
                        break;
                    }
                    greetingPermission.tips = "";
                    break;
                }
                if (iU == 8) {
                    greetingPermission.enable = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (greetingPermission.tips != null) {
                            break;
                        }
                        greetingPermission.tips = "";
                        return greetingPermission;
                    }
                    greetingPermission.tips = nb5Var.s();
                }
            }
            return greetingPermission;
        }

        public void serialize(GreetingPermission greetingPermission, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, greetingPermission.enable);
            String str = greetingPermission.tips;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<GreetingPermission> JSON_ADAPTER = new ObjectJsonAdapter<GreetingPermission>() { // from class: com.p1.mobile.putong.core.data.GreetingPermission.2
        public Class getDataClass() {
            return GreetingPermission.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingPermission m13050newInstance() {
            return new GreetingPermission();
        }

        public boolean parseField(GreetingPermission greetingPermission, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                greetingPermission.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("tips")) {
                return false;
            }
            greetingPermission.tips = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GreetingPermission greetingPermission, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("tips")) {
                return true;
            }
            return super.parseFieldCheck(greetingPermission, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GreetingPermission greetingPermission, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", greetingPermission.enable);
            String str = greetingPermission.tips;
            if (str != null) {
                jsonGenerator.writeStringField("tips", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingPermission) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingPermission) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingPermission new_() {
        GreetingPermission greetingPermission = new GreetingPermission();
        greetingPermission.nullCheck();
        return greetingPermission;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingPermission m13048clone() {
        GreetingPermission greetingPermission = new GreetingPermission();
        greetingPermission.enable = this.enable;
        greetingPermission.tips = this.tips;
        return greetingPermission;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingPermission)) {
            return false;
        }
        GreetingPermission greetingPermission = (GreetingPermission) obj;
        return this.enable == greetingPermission.enable && ValueObject.util_equals(this.tips, greetingPermission.tips);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.tips;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.tips == null) {
            this.tips = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
