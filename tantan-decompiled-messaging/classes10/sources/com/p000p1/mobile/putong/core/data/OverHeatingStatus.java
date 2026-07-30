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
public class OverHeatingStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "overheatingstatus";

    @ProtobufIndex(index = 1)
    public boolean isHot;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isStop;
    public static ProtobufAdapter<OverHeatingStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<OverHeatingStatus>() { // from class: com.p1.mobile.putong.core.data.OverHeatingStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OverHeatingStatus overHeatingStatus) {
            int iB = CodedOutputByteBufferNano.b(1, overHeatingStatus.isHot) + CodedOutputByteBufferNano.b(2, overHeatingStatus.isStop);
            ((MessageNano) overHeatingStatus).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OverHeatingStatus m14715parse(nb5 nb5Var) throws IOException {
            OverHeatingStatus overHeatingStatus = new OverHeatingStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    overHeatingStatus.isHot = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return overHeatingStatus;
                    }
                    overHeatingStatus.isStop = nb5Var.g();
                }
            }
        }

        public void serialize(OverHeatingStatus overHeatingStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, overHeatingStatus.isHot);
            codedOutputByteBufferNano.A(2, overHeatingStatus.isStop);
        }
    };
    public static JsonAdapter<OverHeatingStatus> JSON_ADAPTER = new ObjectJsonAdapter<OverHeatingStatus>() { // from class: com.p1.mobile.putong.core.data.OverHeatingStatus.2
        public Class getDataClass() {
            return OverHeatingStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OverHeatingStatus m14716newInstance() {
            return new OverHeatingStatus();
        }

        public boolean parseField(OverHeatingStatus overHeatingStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isStop")) {
                overHeatingStatus.isStop = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isHot")) {
                return false;
            }
            overHeatingStatus.isHot = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(OverHeatingStatus overHeatingStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isStop") || str.equals("isHot")) {
                return true;
            }
            return super.parseFieldCheck(overHeatingStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(OverHeatingStatus overHeatingStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHot", overHeatingStatus.isHot);
            jsonGenerator.writeBooleanField("isStop", overHeatingStatus.isStop);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OverHeatingStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OverHeatingStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OverHeatingStatus new_() {
        OverHeatingStatus overHeatingStatus = new OverHeatingStatus();
        overHeatingStatus.nullCheck();
        return overHeatingStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OverHeatingStatus m14714clone() {
        OverHeatingStatus overHeatingStatus = new OverHeatingStatus();
        overHeatingStatus.isHot = this.isHot;
        overHeatingStatus.isStop = this.isStop;
        return overHeatingStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverHeatingStatus)) {
            return false;
        }
        OverHeatingStatus overHeatingStatus = (OverHeatingStatus) obj;
        return this.isHot == overHeatingStatus.isHot && this.isStop == overHeatingStatus.isStop;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isHot ? 1231 : 1237)) * 41) + (this.isStop ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
