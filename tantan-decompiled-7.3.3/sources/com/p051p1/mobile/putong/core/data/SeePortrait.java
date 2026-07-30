package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Portrait;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class SeePortrait extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeportrait";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Portrait> portraits;

    @ProtobufIndex(index = 3)
    public boolean reachedDailyMaxNum;

    @ProtobufIndex(index = 1)
    public boolean reachedMaxNum;
    public static ProtobufAdapter<SeePortrait> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeePortrait>() { // from class: com.p1.mobile.putong.core.data.SeePortrait.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeePortrait seePortrait) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, seePortrait.reachedMaxNum);
            List<Portrait> list = seePortrait.portraits;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, list, Portrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(3, seePortrait.reachedDailyMaxNum);
            seePortrait.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeePortrait parse(nc5 nc5Var) throws IOException {
            SeePortrait seePortrait = new SeePortrait();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seePortrait.portraits != null) {
                        break;
                    }
                    seePortrait.portraits = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    seePortrait.reachedMaxNum = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    seePortrait.portraits = (List) nc5Var.m162488l(Portrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 24) {
                        if (seePortrait.portraits != null) {
                            break;
                        }
                        seePortrait.portraits = new ArrayList();
                        return seePortrait;
                    }
                    seePortrait.reachedDailyMaxNum = nc5Var.m162483g();
                }
            }
            return seePortrait;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeePortrait seePortrait, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, seePortrait.reachedMaxNum);
            List<Portrait> list = seePortrait.portraits;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, Portrait.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(3, seePortrait.reachedDailyMaxNum);
        }
    };
    public static JsonAdapter<SeePortrait> JSON_ADAPTER = new ObjectJsonAdapter<SeePortrait>() { // from class: com.p1.mobile.putong.core.data.SeePortrait.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeePortrait.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeePortrait newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeePortrait seePortrait, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("reachedMaxNum", seePortrait.reachedMaxNum);
            if (seePortrait.portraits != null) {
                jsonGenerator.writeFieldName("portraits");
                JsonAdapter.serializeArray(seePortrait.portraits, jsonGenerator, Portrait.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("reachedDailyMaxNum", seePortrait.reachedDailyMaxNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeePortrait) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeePortrait) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeePortrait new_() {
        SeePortrait seePortrait = new SeePortrait();
        seePortrait.nullCheck();
        return seePortrait;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeePortrait mo225055clone() {
        SeePortrait seePortrait = new SeePortrait();
        seePortrait.reachedMaxNum = this.reachedMaxNum;
        List<Portrait> list = this.portraits;
        if (list != null) {
            seePortrait.portraits = ValueObject.util_map(list, new qcj() { // from class: l.cje0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Portrait) obj).mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.reachedMaxNum ? 1231 : 1237)) * 41;
        List<Portrait> list = this.portraits;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.reachedDailyMaxNum ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.portraits == null) {
            this.portraits = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
