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
public class MyMeetEntryBoost extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryboost";

    @NonNull
    @ProtobufIndex(index = 1)
    public BoostStatus status;
    public static ProtobufAdapter<MyMeetEntryBoost> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryBoost>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryBoost.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MyMeetEntryBoost myMeetEntryBoost) {
            BoostStatus boostStatus = myMeetEntryBoost.status;
            int iL = boostStatus != null ? CodedOutputByteBufferNano.l(1, boostStatus, BoostStatus.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) myMeetEntryBoost).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryBoost m14401parse(nb5 nb5Var) throws IOException {
            MyMeetEntryBoost myMeetEntryBoost = new MyMeetEntryBoost();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (myMeetEntryBoost.status != null) {
                        break;
                    }
                    myMeetEntryBoost.status = BoostStatus.new_();
                    break;
                }
                if (iU != 10) {
                    if (myMeetEntryBoost.status != null) {
                        break;
                    }
                    myMeetEntryBoost.status = BoostStatus.new_();
                    return myMeetEntryBoost;
                }
                myMeetEntryBoost.status = (BoostStatus) nb5Var.l(BoostStatus.PROTOBUF_ADAPTER);
            }
            return myMeetEntryBoost;
        }

        public void serialize(MyMeetEntryBoost myMeetEntryBoost, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BoostStatus boostStatus = myMeetEntryBoost.status;
            if (boostStatus != null) {
                codedOutputByteBufferNano.K(1, boostStatus, BoostStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MyMeetEntryBoost> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryBoost>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryBoost.2
        public Class getDataClass() {
            return MyMeetEntryBoost.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MyMeetEntryBoost m14402newInstance() {
            return new MyMeetEntryBoost();
        }

        public boolean parseField(MyMeetEntryBoost myMeetEntryBoost, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            myMeetEntryBoost.status = (BoostStatus) BoostStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MyMeetEntryBoost myMeetEntryBoost, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(myMeetEntryBoost, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MyMeetEntryBoost myMeetEntryBoost, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntryBoost.status != null) {
                jsonGenerator.writeFieldName("status");
                BoostStatus.JSON_ADAPTER.serialize(myMeetEntryBoost.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryBoost) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryBoost) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntryBoost new_() {
        MyMeetEntryBoost myMeetEntryBoost = new MyMeetEntryBoost();
        myMeetEntryBoost.nullCheck();
        return myMeetEntryBoost;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MyMeetEntryBoost m14400clone() {
        MyMeetEntryBoost myMeetEntryBoost = new MyMeetEntryBoost();
        BoostStatus boostStatus = this.status;
        if (boostStatus != null) {
            myMeetEntryBoost.status = boostStatus.m11802clone();
        }
        return myMeetEntryBoost;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyMeetEntryBoost) {
            return ValueObject.util_equals(this.status, ((MyMeetEntryBoost) obj).status);
        }
        return false;
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
        BoostStatus boostStatus = this.status;
        int iHashCode = i2 + (boostStatus != null ? boostStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = BoostStatus.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
