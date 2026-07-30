package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IntlNightClubConfig;
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
public class IntlNightClubData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlnightclubdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IntlNightClubConfig> clubs;
    public static ProtobufAdapter<IntlNightClubData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlNightClubData>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlNightClubData intlNightClubData) {
            List<IntlNightClubConfig> list = intlNightClubData.clubs;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, IntlNightClubConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) intlNightClubData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlNightClubData m13653parse(nb5 nb5Var) throws IOException {
            IntlNightClubData intlNightClubData = new IntlNightClubData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlNightClubData.clubs != null) {
                        break;
                    }
                    intlNightClubData.clubs = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (intlNightClubData.clubs != null) {
                        break;
                    }
                    intlNightClubData.clubs = new ArrayList();
                    return intlNightClubData;
                }
                intlNightClubData.clubs = (List) nb5Var.l(IntlNightClubConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return intlNightClubData;
        }

        public void serialize(IntlNightClubData intlNightClubData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IntlNightClubConfig> list = intlNightClubData.clubs;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, IntlNightClubConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlNightClubData> JSON_ADAPTER = new ObjectJsonAdapter<IntlNightClubData>() { // from class: com.p1.mobile.putong.core.data.IntlNightClubData.2
        public Class getDataClass() {
            return IntlNightClubData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlNightClubData m13654newInstance() {
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

        public void serializeFields(IntlNightClubData intlNightClubData, JsonGenerator jsonGenerator) throws IOException {
            if (intlNightClubData.clubs != null) {
                jsonGenerator.writeFieldName("clubs");
                JsonAdapter.serializeArray(intlNightClubData.clubs, jsonGenerator, IntlNightClubConfig.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlNightClubData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlNightClubData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlNightClubData new_() {
        IntlNightClubData intlNightClubData = new IntlNightClubData();
        intlNightClubData.nullCheck();
        return intlNightClubData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlNightClubData m13652clone() {
        IntlNightClubData intlNightClubData = new IntlNightClubData();
        List<IntlNightClubConfig> list = this.clubs;
        if (list != null) {
            intlNightClubData.clubs = ValueObject.util_map(list, new w9j() { // from class: l.qoo
                public final Object call(Object obj) {
                    return ((IntlNightClubConfig) obj).m13648clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<IntlNightClubConfig> list = this.clubs;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.clubs == null) {
            this.clubs = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
