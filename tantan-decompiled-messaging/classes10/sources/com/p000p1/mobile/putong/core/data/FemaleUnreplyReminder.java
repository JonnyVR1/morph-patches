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
public class FemaleUnreplyReminder extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "femaleunreplyreminder";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String refMessageID;

    @NonNull
    @ProtobufIndex(index = 1)
    public String remindInfo;
    public static ProtobufAdapter<FemaleUnreplyReminder> PROTOBUF_ADAPTER = new MessageNanoAdapter<FemaleUnreplyReminder>() { // from class: com.p1.mobile.putong.core.data.FemaleUnreplyReminder.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FemaleUnreplyReminder femaleUnreplyReminder) {
            String str = femaleUnreplyReminder.remindInfo;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = femaleUnreplyReminder.refMessageID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) femaleUnreplyReminder).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FemaleUnreplyReminder m12763parse(nb5 nb5Var) throws IOException {
            FemaleUnreplyReminder femaleUnreplyReminder = new FemaleUnreplyReminder();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (femaleUnreplyReminder.remindInfo == null) {
                        femaleUnreplyReminder.remindInfo = "";
                    }
                    if (femaleUnreplyReminder.refMessageID != null) {
                        break;
                    }
                    femaleUnreplyReminder.refMessageID = "";
                    break;
                }
                if (iU == 10) {
                    femaleUnreplyReminder.remindInfo = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (femaleUnreplyReminder.remindInfo == null) {
                            femaleUnreplyReminder.remindInfo = "";
                        }
                        if (femaleUnreplyReminder.refMessageID != null) {
                            break;
                        }
                        femaleUnreplyReminder.refMessageID = "";
                        return femaleUnreplyReminder;
                    }
                    femaleUnreplyReminder.refMessageID = nb5Var.s();
                }
            }
            return femaleUnreplyReminder;
        }

        public void serialize(FemaleUnreplyReminder femaleUnreplyReminder, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = femaleUnreplyReminder.remindInfo;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = femaleUnreplyReminder.refMessageID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FemaleUnreplyReminder> JSON_ADAPTER = new ObjectJsonAdapter<FemaleUnreplyReminder>() { // from class: com.p1.mobile.putong.core.data.FemaleUnreplyReminder.2
        public Class getDataClass() {
            return FemaleUnreplyReminder.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FemaleUnreplyReminder m12764newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FemaleUnreplyReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FemaleUnreplyReminder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FemaleUnreplyReminder new_() {
        FemaleUnreplyReminder femaleUnreplyReminder = new FemaleUnreplyReminder();
        femaleUnreplyReminder.nullCheck();
        return femaleUnreplyReminder;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FemaleUnreplyReminder m12762clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.remindInfo;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.refMessageID;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.remindInfo == null) {
            this.remindInfo = "";
        }
        if (this.refMessageID == null) {
            this.refMessageID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
