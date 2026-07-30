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
public class Complain extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "complain";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f33id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean splashScreenForward;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<Complain> PROTOBUF_ADAPTER = new MessageNanoAdapter<Complain>() { // from class: com.p1.mobile.putong.core.data.Complain.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Complain complain) {
            String str = complain.f33id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = complain.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, complain.splashScreenForward);
            ((MessageNano) complain).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Complain m12233parse(nb5 nb5Var) throws IOException {
            Complain complain = new Complain();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (complain.f33id == null) {
                        complain.f33id = "";
                    }
                    if (complain.type != null) {
                        break;
                    }
                    complain.type = "";
                    break;
                }
                if (iU == 10) {
                    complain.f33id = nb5Var.s();
                } else if (iU == 18) {
                    complain.type = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (complain.f33id == null) {
                            complain.f33id = "";
                        }
                        if (complain.type != null) {
                            break;
                        }
                        complain.type = "";
                        return complain;
                    }
                    complain.splashScreenForward = nb5Var.g();
                }
            }
            return complain;
        }

        public void serialize(Complain complain, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = complain.f33id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = complain.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, complain.splashScreenForward);
        }
    };
    public static JsonAdapter<Complain> JSON_ADAPTER = new ObjectJsonAdapter<Complain>() { // from class: com.p1.mobile.putong.core.data.Complain.2
        public Class getDataClass() {
            return Complain.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Complain m12234newInstance() {
            return new Complain();
        }

        public boolean parseField(Complain complain, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    complain.f33id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    complain.type = jsonParser.getValueAsString();
                    return true;
                case "splashScreenForward":
                    complain.splashScreenForward = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Complain complain, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "splashScreenForward":
                    return true;
                default:
                    return super.parseFieldCheck(complain, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Complain complain, JsonGenerator jsonGenerator) throws IOException {
            String str = complain.f33id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = complain.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("splashScreenForward", complain.splashScreenForward);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Complain) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Complain) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Complain new_() {
        Complain complain = new Complain();
        complain.nullCheck();
        return complain;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Complain m12232clone() {
        Complain complain = new Complain();
        complain.f33id = this.f33id;
        complain.type = this.type;
        complain.splashScreenForward = this.splashScreenForward;
        return complain;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Complain)) {
            return false;
        }
        Complain complain = (Complain) obj;
        return ValueObject.util_equals(this.f33id, complain.f33id) && ValueObject.util_equals(this.type, complain.type) && this.splashScreenForward == complain.splashScreenForward;
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
        String str = this.f33id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.splashScreenForward ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f33id == null) {
            this.f33id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
