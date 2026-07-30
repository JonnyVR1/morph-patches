package com.p046p1.mobile.putong.core.data;

import androidx.core.app.NotificationCompat;
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
public class FateRadarSwitchStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradarswitchstatus";

    @ProtobufIndex(index = 1)
    public boolean status;
    public static ProtobufAdapter<FateRadarSwitchStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadarSwitchStatus>() { // from class: com.p1.mobile.putong.core.data.FateRadarSwitchStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FateRadarSwitchStatus fateRadarSwitchStatus) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, fateRadarSwitchStatus.status);
            fateRadarSwitchStatus.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FateRadarSwitchStatus parse(nb5 nb5Var) throws IOException {
            FateRadarSwitchStatus fateRadarSwitchStatus = new FateRadarSwitchStatus();
            while (nb5Var.m158752u() == 8) {
                fateRadarSwitchStatus.status = nb5Var.m158738g();
            }
            return fateRadarSwitchStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FateRadarSwitchStatus fateRadarSwitchStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, fateRadarSwitchStatus.status);
        }
    };
    public static JsonAdapter<FateRadarSwitchStatus> JSON_ADAPTER = new ObjectJsonAdapter<FateRadarSwitchStatus>() { // from class: com.p1.mobile.putong.core.data.FateRadarSwitchStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FateRadarSwitchStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FateRadarSwitchStatus newInstance() {
            return new FateRadarSwitchStatus();
        }

        public boolean parseField(FateRadarSwitchStatus fateRadarSwitchStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            fateRadarSwitchStatus.status = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(FateRadarSwitchStatus fateRadarSwitchStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(fateRadarSwitchStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FateRadarSwitchStatus fateRadarSwitchStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(NotificationCompat.CATEGORY_STATUS, fateRadarSwitchStatus.status);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadarSwitchStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadarSwitchStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadarSwitchStatus new_() {
        FateRadarSwitchStatus fateRadarSwitchStatus = new FateRadarSwitchStatus();
        fateRadarSwitchStatus.nullCheck();
        return fateRadarSwitchStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FateRadarSwitchStatus mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.status ? 1231 : 1237);
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
