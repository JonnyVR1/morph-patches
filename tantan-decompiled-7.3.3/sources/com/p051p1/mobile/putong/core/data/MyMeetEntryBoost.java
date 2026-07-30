package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class MyMeetEntryBoost extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mymeetentryboost";

    @NonNull
    @ProtobufIndex(index = 1)
    public BoostStatus status;
    public static ProtobufAdapter<MyMeetEntryBoost> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyMeetEntryBoost>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryBoost.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyMeetEntryBoost myMeetEntryBoost) {
            BoostStatus boostStatus = myMeetEntryBoost.status;
            int iM17285l = boostStatus != null ? CodedOutputByteBufferNano.m17285l(1, boostStatus, BoostStatus.PROTOBUF_ADAPTER) : 0;
            myMeetEntryBoost.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyMeetEntryBoost parse(nc5 nc5Var) throws IOException {
            MyMeetEntryBoost myMeetEntryBoost = new MyMeetEntryBoost();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (myMeetEntryBoost.status != null) {
                        break;
                    }
                    myMeetEntryBoost.status = BoostStatus.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (myMeetEntryBoost.status != null) {
                        break;
                    }
                    myMeetEntryBoost.status = BoostStatus.new_();
                    return myMeetEntryBoost;
                }
                myMeetEntryBoost.status = (BoostStatus) nc5Var.m162488l(BoostStatus.PROTOBUF_ADAPTER);
            }
            return myMeetEntryBoost;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyMeetEntryBoost myMeetEntryBoost, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BoostStatus boostStatus = myMeetEntryBoost.status;
            if (boostStatus != null) {
                codedOutputByteBufferNano.m17309K(1, boostStatus, BoostStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MyMeetEntryBoost> JSON_ADAPTER = new ObjectJsonAdapter<MyMeetEntryBoost>() { // from class: com.p1.mobile.putong.core.data.MyMeetEntryBoost.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyMeetEntryBoost.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyMeetEntryBoost newInstance() {
            return new MyMeetEntryBoost();
        }

        public boolean parseField(MyMeetEntryBoost myMeetEntryBoost, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            myMeetEntryBoost.status = BoostStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MyMeetEntryBoost myMeetEntryBoost, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(myMeetEntryBoost, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyMeetEntryBoost myMeetEntryBoost, JsonGenerator jsonGenerator) throws IOException {
            if (myMeetEntryBoost.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BoostStatus.JSON_ADAPTER.serialize(myMeetEntryBoost.status, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyMeetEntryBoost) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyMeetEntryBoost) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyMeetEntryBoost new_() {
        MyMeetEntryBoost myMeetEntryBoost = new MyMeetEntryBoost();
        myMeetEntryBoost.nullCheck();
        return myMeetEntryBoost;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyMeetEntryBoost mo225055clone() {
        MyMeetEntryBoost myMeetEntryBoost = new MyMeetEntryBoost();
        BoostStatus boostStatus = this.status;
        if (boostStatus != null) {
            myMeetEntryBoost.status = boostStatus.mo225055clone();
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
        BoostStatus boostStatus = this.status;
        int iHashCode = i2 + (boostStatus != null ? boostStatus.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = BoostStatus.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
