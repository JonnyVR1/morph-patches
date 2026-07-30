package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Portrait;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SeePortrait extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeportrait";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Portrait> portraits;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean reachedDailyMaxNum;

    @ProtobufIndex(index = 1)
    public boolean reachedMaxNum;
    public static ProtobufAdapter<SeePortrait> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeePortrait>() { // from class: com.p1.mobile.putong.core.data.SeePortrait.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeePortrait seePortrait) {
            int iB = CodedOutputByteBufferNano.b(1, seePortrait.reachedMaxNum);
            List<Portrait> list = seePortrait.portraits;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(2, list, Portrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(3, seePortrait.reachedDailyMaxNum);
            ((MessageNano) seePortrait).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeePortrait m15531parse(nb5 nb5Var) throws IOException {
            SeePortrait seePortrait = new SeePortrait();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seePortrait.portraits != null) {
                        break;
                    }
                    seePortrait.portraits = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    seePortrait.reachedMaxNum = nb5Var.g();
                } else if (iU == 18) {
                    seePortrait.portraits = (List) nb5Var.l(Portrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 24) {
                        if (seePortrait.portraits != null) {
                            break;
                        }
                        seePortrait.portraits = new ArrayList();
                        return seePortrait;
                    }
                    seePortrait.reachedDailyMaxNum = nb5Var.g();
                }
            }
            return seePortrait;
        }

        public void serialize(SeePortrait seePortrait, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, seePortrait.reachedMaxNum);
            List<Portrait> list = seePortrait.portraits;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Portrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(3, seePortrait.reachedDailyMaxNum);
        }
    };
    public static JsonAdapter<SeePortrait> JSON_ADAPTER = new ObjectJsonAdapter<SeePortrait>() { // from class: com.p1.mobile.putong.core.data.SeePortrait.2
        public Class getDataClass() {
            return SeePortrait.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeePortrait m15532newInstance() {
            return new SeePortrait();
        }

        public boolean parseField(SeePortrait seePortrait, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reachedMaxNum":
                    seePortrait.reachedMaxNum = jsonParser.getValueAsBoolean();
                    return true;
                case "reachedDailyMaxNum":
                    seePortrait.reachedDailyMaxNum = jsonParser.getValueAsBoolean();
                    return true;
                case "portraits":
                    seePortrait.portraits = JsonAdapter.parseArray(jsonParser, Portrait.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeePortrait seePortrait, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reachedMaxNum":
                case "reachedDailyMaxNum":
                case "portraits":
                    return true;
                default:
                    return super.parseFieldCheck(seePortrait, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SeePortrait seePortrait, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("reachedMaxNum", seePortrait.reachedMaxNum);
            if (seePortrait.portraits != null) {
                jsonGenerator.writeFieldName("portraits");
                JsonAdapter.serializeArray(seePortrait.portraits, jsonGenerator, Portrait.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("reachedDailyMaxNum", seePortrait.reachedDailyMaxNum);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeePortrait) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeePortrait) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeePortrait new_() {
        SeePortrait seePortrait = new SeePortrait();
        seePortrait.nullCheck();
        return seePortrait;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeePortrait m15530clone() {
        SeePortrait seePortrait = new SeePortrait();
        seePortrait.reachedMaxNum = this.reachedMaxNum;
        List<Portrait> list = this.portraits;
        if (list != null) {
            seePortrait.portraits = ValueObject.util_map(list, new w9j() { // from class: l.xae0
                public final Object call(Object obj) {
                    return ((Portrait) obj).m14828clone();
                }
            });
        }
        seePortrait.reachedDailyMaxNum = this.reachedDailyMaxNum;
        return seePortrait;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeePortrait)) {
            return false;
        }
        SeePortrait seePortrait = (SeePortrait) obj;
        return this.reachedMaxNum == seePortrait.reachedMaxNum && ValueObject.util_equals(this.portraits, seePortrait.portraits) && this.reachedDailyMaxNum == seePortrait.reachedDailyMaxNum;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.reachedMaxNum ? 1231 : 1237)) * 41;
        List<Portrait> list = this.portraits;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.reachedDailyMaxNum ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.portraits == null) {
            this.portraits = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
