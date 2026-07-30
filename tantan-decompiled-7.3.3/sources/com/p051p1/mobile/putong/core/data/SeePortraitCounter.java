package com.p051p1.mobile.putong.core.data;

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
public class SeePortraitCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeportraitcounter";

    @ProtobufIndex(index = 1)
    public int dailyCounter;
    public static ProtobufAdapter<SeePortraitCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeePortraitCounter>() { // from class: com.p1.mobile.putong.core.data.SeePortraitCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeePortraitCounter seePortraitCounter) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, seePortraitCounter.dailyCounter);
            seePortraitCounter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeePortraitCounter parse(nc5 nc5Var) throws IOException {
            SeePortraitCounter seePortraitCounter = new SeePortraitCounter();
            while (nc5Var.m162497u() == 8) {
                seePortraitCounter.dailyCounter = nc5Var.m162486j();
            }
            return seePortraitCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeePortraitCounter seePortraitCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, seePortraitCounter.dailyCounter);
        }
    };
    public static JsonAdapter<SeePortraitCounter> JSON_ADAPTER = new ObjectJsonAdapter<SeePortraitCounter>() { // from class: com.p1.mobile.putong.core.data.SeePortraitCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeePortraitCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeePortraitCounter newInstance() {
            return new SeePortraitCounter();
        }

        public boolean parseField(SeePortraitCounter seePortraitCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("dailyCounter")) {
                return false;
            }
            seePortraitCounter.dailyCounter = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SeePortraitCounter seePortraitCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("dailyCounter")) {
                return true;
            }
            return super.parseFieldCheck(seePortraitCounter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeePortraitCounter seePortraitCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("dailyCounter", seePortraitCounter.dailyCounter);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeePortraitCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeePortraitCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeePortraitCounter new_() {
        SeePortraitCounter seePortraitCounter = new SeePortraitCounter();
        seePortraitCounter.nullCheck();
        return seePortraitCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeePortraitCounter mo225055clone() {
        SeePortraitCounter seePortraitCounter = new SeePortraitCounter();
        seePortraitCounter.dailyCounter = this.dailyCounter;
        return seePortraitCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SeePortraitCounter) && this.dailyCounter == ((SeePortraitCounter) obj).dailyCounter;
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
        int i2 = (i * 41) + this.dailyCounter;
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
