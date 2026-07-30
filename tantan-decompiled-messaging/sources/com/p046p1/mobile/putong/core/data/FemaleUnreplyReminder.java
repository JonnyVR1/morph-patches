package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class FemaleUnreplyReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "femaleunreplyreminder";

    @NonNull
    @ProtobufIndex(index = 2)
    public String refMessageID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String remindInfo;
    public static ProtobufAdapter<FemaleUnreplyReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<FemaleUnreplyReminder>() { // from class: com.p1.mobile.putong.core.data.FemaleUnreplyReminder.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FemaleUnreplyReminder femaleUnreplyReminder) {
            String str = femaleUnreplyReminder.remindInfo;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = femaleUnreplyReminder.refMessageID;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            femaleUnreplyReminder.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FemaleUnreplyReminder parse(nb5 nb5Var) throws IOException {
            FemaleUnreplyReminder femaleUnreplyReminder = new FemaleUnreplyReminder();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (femaleUnreplyReminder.remindInfo == null) {
                        femaleUnreplyReminder.remindInfo = "";
                    }
                    if (femaleUnreplyReminder.refMessageID != null) {
                        break;
                    }
                    femaleUnreplyReminder.refMessageID = "";
                    break;
                }
                if (iM158752u == 10) {
                    femaleUnreplyReminder.remindInfo = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (femaleUnreplyReminder.remindInfo == null) {
                            femaleUnreplyReminder.remindInfo = "";
                        }
                        if (femaleUnreplyReminder.refMessageID != null) {
                            break;
                        }
                        femaleUnreplyReminder.refMessageID = "";
                        return femaleUnreplyReminder;
                    }
                    femaleUnreplyReminder.refMessageID = nb5Var.m158750s();
                }
            }
            return femaleUnreplyReminder;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FemaleUnreplyReminder femaleUnreplyReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = femaleUnreplyReminder.remindInfo;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = femaleUnreplyReminder.refMessageID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<FemaleUnreplyReminder> JSON_ADAPTER = new ObjectJsonAdapter<FemaleUnreplyReminder>() { // from class: com.p1.mobile.putong.core.data.FemaleUnreplyReminder.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FemaleUnreplyReminder.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FemaleUnreplyReminder newInstance() {
            return new FemaleUnreplyReminder();
        }

        public boolean parseField(FemaleUnreplyReminder femaleUnreplyReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("refMessageID")) {
                femaleUnreplyReminder.refMessageID = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("remindInfo")) {
                return false;
            }
            femaleUnreplyReminder.remindInfo = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FemaleUnreplyReminder femaleUnreplyReminder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("refMessageID") || str.equals("remindInfo")) {
                return true;
            }
            return super.parseFieldCheck(femaleUnreplyReminder, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FemaleUnreplyReminder femaleUnreplyReminder, JsonGenerator jsonGenerator) throws IOException {
            String str = femaleUnreplyReminder.remindInfo;
            if (str != null) {
                jsonGenerator.writeStringField("remindInfo", str);
            }
            String str2 = femaleUnreplyReminder.refMessageID;
            if (str2 != null) {
                jsonGenerator.writeStringField("refMessageID", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FemaleUnreplyReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FemaleUnreplyReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FemaleUnreplyReminder new_() {
        FemaleUnreplyReminder femaleUnreplyReminder = new FemaleUnreplyReminder();
        femaleUnreplyReminder.nullCheck();
        return femaleUnreplyReminder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FemaleUnreplyReminder mo223809clone() {
        FemaleUnreplyReminder femaleUnreplyReminder = new FemaleUnreplyReminder();
        femaleUnreplyReminder.remindInfo = this.remindInfo;
        femaleUnreplyReminder.refMessageID = this.refMessageID;
        return femaleUnreplyReminder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FemaleUnreplyReminder)) {
            return false;
        }
        FemaleUnreplyReminder femaleUnreplyReminder = (FemaleUnreplyReminder) obj;
        return ValueObject.util_equals(this.remindInfo, femaleUnreplyReminder.remindInfo) && ValueObject.util_equals(this.refMessageID, femaleUnreplyReminder.refMessageID);
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
        String str = this.remindInfo;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.refMessageID;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.remindInfo == null) {
            this.remindInfo = "";
        }
        if (this.refMessageID == null) {
            this.refMessageID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
