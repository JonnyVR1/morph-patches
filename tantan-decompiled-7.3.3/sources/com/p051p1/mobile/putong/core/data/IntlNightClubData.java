package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlNightClubConfig;
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
public class IntlNightClubData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IntlNightClubConfig> clubs;
    public static ProtobufAdapter<IntlNightClubData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubData>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlNightClubData intlNightClubData) {
            List<IntlNightClubConfig> list = intlNightClubData.clubs;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, IntlNightClubConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            intlNightClubData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlNightClubData parse(nc5 nc5Var) throws IOException {
            IntlNightClubData intlNightClubData = new IntlNightClubData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlNightClubData.clubs != null) {
                        break;
                    }
                    intlNightClubData.clubs = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (intlNightClubData.clubs != null) {
                        break;
                    }
                    intlNightClubData.clubs = new ArrayList();
                    return intlNightClubData;
                }
                intlNightClubData.clubs = (List) nc5Var.m162488l(IntlNightClubConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return intlNightClubData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlNightClubData intlNightClubData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IntlNightClubConfig> list = intlNightClubData.clubs;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, IntlNightClubConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlNightClubData> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubData>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlNightClubData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlNightClubData newInstance() {
            return new IntlNightClubData();
        }

        public boolean parseField(IntlNightClubData intlNightClubData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("clubs")) {
                return false;
            }
            intlNightClubData.clubs = JsonAdapter.parseArray(jsonParser, IntlNightClubConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlNightClubData intlNightClubData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("clubs")) {
                return true;
            }
            return super.parseFieldCheck(intlNightClubData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlNightClubData intlNightClubData, JsonGenerator jsonGenerator) throws IOException {
            if (intlNightClubData.clubs != null) {
                jsonGenerator.writeFieldName("clubs");
                JsonAdapter.serializeArray(intlNightClubData.clubs, jsonGenerator, IntlNightClubConfig.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubData new_() {
        IntlNightClubData intlNightClubData = new IntlNightClubData();
        intlNightClubData.nullCheck();
        return intlNightClubData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlNightClubData mo225055clone() {
        IntlNightClubData intlNightClubData = new IntlNightClubData();
        List<IntlNightClubConfig> list = this.clubs;
        if (list != null) {
            intlNightClubData.clubs = ValueObject.util_map(list, new qcj() { // from class: l.qqo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IntlNightClubConfig) obj).mo225055clone();
                }
            });
        }
        return intlNightClubData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlNightClubData) {
            return ValueObject.util_equals(this.clubs, ((IntlNightClubData) obj).clubs);
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
        List<IntlNightClubConfig> list = this.clubs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.clubs == null) {
            this.clubs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
