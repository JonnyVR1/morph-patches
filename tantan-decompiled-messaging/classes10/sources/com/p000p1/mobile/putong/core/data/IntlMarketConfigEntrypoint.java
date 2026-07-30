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
public class IntlMarketConfigEntrypoint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketconfigentrypoint";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon_url;
    public static ProtobufAdapter<IntlMarketConfigEntrypoint> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketConfigEntrypoint>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEntrypoint.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint) {
            String str = intlMarketConfigEntrypoint.icon_url;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) intlMarketConfigEntrypoint).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigEntrypoint m13583parse(nb5 nb5Var) throws IOException {
            IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = new IntlMarketConfigEntrypoint();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketConfigEntrypoint.icon_url != null) {
                        break;
                    }
                    intlMarketConfigEntrypoint.icon_url = "";
                    break;
                }
                if (iU != 10) {
                    if (intlMarketConfigEntrypoint.icon_url != null) {
                        break;
                    }
                    intlMarketConfigEntrypoint.icon_url = "";
                    return intlMarketConfigEntrypoint;
                }
                intlMarketConfigEntrypoint.icon_url = nb5Var.s();
            }
            return intlMarketConfigEntrypoint;
        }

        public void serialize(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlMarketConfigEntrypoint.icon_url;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<IntlMarketConfigEntrypoint> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketConfigEntrypoint>() { // from class: com.p1.mobile.putong.core.data.IntlMarketConfigEntrypoint.2
        public Class getDataClass() {
            return IntlMarketConfigEntrypoint.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketConfigEntrypoint m13584newInstance() {
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

        public void serializeFields(IntlMarketConfigEntrypoint intlMarketConfigEntrypoint, JsonGenerator jsonGenerator) throws IOException {
            String str = intlMarketConfigEntrypoint.icon_url;
            if (str != null) {
                jsonGenerator.writeStringField("icon_url", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketConfigEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketConfigEntrypoint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketConfigEntrypoint new_() {
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint = new IntlMarketConfigEntrypoint();
        intlMarketConfigEntrypoint.nullCheck();
        return intlMarketConfigEntrypoint;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketConfigEntrypoint m13582clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.icon_url;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.icon_url == null) {
            this.icon_url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
