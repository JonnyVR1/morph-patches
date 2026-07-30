package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class IntlMarketConfigEntrypoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigentrypoint";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon_url;
    public static ProtobufAdapter<IntlMarketConfigEntrypoint> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigEntrypoint>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEntrypoint.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint) {
            String str = intlMarketConfigEntrypoint.icon_url;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            intlMarketConfigEntrypoint.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketConfigEntrypoint parse(nc5 nc5Var) throws IOException {
            IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = new IntlMarketConfigEntrypoint();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlMarketConfigEntrypoint.icon_url != null) {
                        break;
                    }
                    intlMarketConfigEntrypoint.icon_url = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (intlMarketConfigEntrypoint.icon_url != null) {
                        break;
                    }
                    intlMarketConfigEntrypoint.icon_url = "";
                    return intlMarketConfigEntrypoint;
                }
                intlMarketConfigEntrypoint.icon_url = nc5Var.m162495s();
            }
            return intlMarketConfigEntrypoint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketConfigEntrypoint.icon_url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<IntlMarketConfigEntrypoint> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigEntrypoint>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEntrypoint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketConfigEntrypoint.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketConfigEntrypoint newInstance() {
            return new IntlMarketConfigEntrypoint();
        }

        public boolean parseField(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("icon_url")) {
                return false;
            }
            intlMarketConfigEntrypoint.icon_url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("icon_url")) {
                return true;
            }
            return super.parseFieldCheck(intlMarketConfigEntrypoint, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketConfigEntrypoint.icon_url;
            if (str != null) {
                jsonGenerator.writeStringField("icon_url", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigEntrypoint new_() {
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = new IntlMarketConfigEntrypoint();
        intlMarketConfigEntrypoint.nullCheck();
        return intlMarketConfigEntrypoint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketConfigEntrypoint mo225055clone() {
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = new IntlMarketConfigEntrypoint();
        intlMarketConfigEntrypoint.icon_url = this.icon_url;
        return intlMarketConfigEntrypoint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlMarketConfigEntrypoint) {
            return ValueObject.util_equals(this.icon_url, ((IntlMarketConfigEntrypoint) obj).icon_url);
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
        String str = this.icon_url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon_url == null) {
            this.icon_url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
