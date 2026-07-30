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
public class SeePortraitCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeportraitcounter";

    @ProtobufIndex(index = 1)
    public int dailyCounter;
    public static ProtobufAdapter<SeePortraitCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeePortraitCounter>() { // from class: com.p1.mobile.putong.core.data.SeePortraitCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeePortraitCounter seePortraitCounter) {
            int iH = CodedOutputByteBufferNano.h(1, seePortraitCounter.dailyCounter);
            ((MessageNano) seePortraitCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeePortraitCounter m15535parse(nb5 nb5Var) throws IOException {
            SeePortraitCounter seePortraitCounter = new SeePortraitCounter();
            while (nb5Var.u() == 8) {
                seePortraitCounter.dailyCounter = nb5Var.j();
            }
            return seePortraitCounter;
        }

        public void serialize(SeePortraitCounter seePortraitCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, seePortraitCounter.dailyCounter);
        }
    };
    public static JsonAdapter<SeePortraitCounter> JSON_ADAPTER = new ObjectJsonAdapter<SeePortraitCounter>() { // from class: com.p1.mobile.putong.core.data.SeePortraitCounter.2
        public Class getDataClass() {
            return SeePortraitCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeePortraitCounter m15536newInstance() {
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

        public void serializeFields(SeePortraitCounter seePortraitCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("dailyCounter", seePortraitCounter.dailyCounter);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeePortraitCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeePortraitCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeePortraitCounter new_() {
        SeePortraitCounter seePortraitCounter = new SeePortraitCounter();
        seePortraitCounter.nullCheck();
        return seePortraitCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeePortraitCounter m15534clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.dailyCounter;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
