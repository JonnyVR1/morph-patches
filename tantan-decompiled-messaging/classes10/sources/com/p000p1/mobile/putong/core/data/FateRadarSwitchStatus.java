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
public class FateRadarSwitchStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradarswitchstatus";

    @ProtobufIndex(index = 1)
    public boolean status;
    public static ProtobufAdapter<FateRadarSwitchStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadarSwitchStatus>() { // from class: com.p1.mobile.putong.core.data.FateRadarSwitchStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FateRadarSwitchStatus fateRadarSwitchStatus) {
            int iB = CodedOutputByteBufferNano.b(1, fateRadarSwitchStatus.status);
            ((MessageNano) fateRadarSwitchStatus).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FateRadarSwitchStatus m12753parse(nb5 nb5Var) throws IOException {
            FateRadarSwitchStatus fateRadarSwitchStatus = new FateRadarSwitchStatus();
            while (nb5Var.u() == 8) {
                fateRadarSwitchStatus.status = nb5Var.g();
            }
            return fateRadarSwitchStatus;
        }

        public void serialize(FateRadarSwitchStatus fateRadarSwitchStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, fateRadarSwitchStatus.status);
        }
    };
    public static JsonAdapter<FateRadarSwitchStatus> JSON_ADAPTER = new ObjectJsonAdapter<FateRadarSwitchStatus>() { // from class: com.p1.mobile.putong.core.data.FateRadarSwitchStatus.2
        public Class getDataClass() {
            return FateRadarSwitchStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FateRadarSwitchStatus m12754newInstance() {
            return new FateRadarSwitchStatus();
        }

        public boolean parseField(FateRadarSwitchStatus fateRadarSwitchStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            fateRadarSwitchStatus.status = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(FateRadarSwitchStatus fateRadarSwitchStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(fateRadarSwitchStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(FateRadarSwitchStatus fateRadarSwitchStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("status", fateRadarSwitchStatus.status);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadarSwitchStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadarSwitchStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadarSwitchStatus new_() {
        FateRadarSwitchStatus fateRadarSwitchStatus = new FateRadarSwitchStatus();
        fateRadarSwitchStatus.nullCheck();
        return fateRadarSwitchStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FateRadarSwitchStatus m12752clone() {
        FateRadarSwitchStatus fateRadarSwitchStatus = new FateRadarSwitchStatus();
        fateRadarSwitchStatus.status = this.status;
        return fateRadarSwitchStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FateRadarSwitchStatus) && this.status == ((FateRadarSwitchStatus) obj).status;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.status ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
