package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TribeSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "tribesetting";

    @NonNull
    @ProtobufIndex(index = 1)
    public String transLang;
    public static ProtobufAdapter<TribeSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<TribeSetting>() { // from class: com.p1.mobile.putong.data.TribeSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TribeSetting tribeSetting) {
            String str = tribeSetting.transLang;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) tribeSetting).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TribeSetting m19115parse(nb5 nb5Var) throws IOException {
            TribeSetting tribeSetting = new TribeSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (tribeSetting.transLang != null) {
                        break;
                    }
                    tribeSetting.transLang = "";
                    break;
                }
                if (iU != 10) {
                    if (tribeSetting.transLang != null) {
                        break;
                    }
                    tribeSetting.transLang = "";
                    return tribeSetting;
                }
                tribeSetting.transLang = nb5Var.s();
            }
            return tribeSetting;
        }

        public void serialize(TribeSetting tribeSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = tribeSetting.transLang;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<TribeSetting> JSON_ADAPTER = new ObjectJsonAdapter<TribeSetting>() { // from class: com.p1.mobile.putong.data.TribeSetting.2
        public Class getDataClass() {
            return TribeSetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public TribeSetting mo17830newInstance() {
            return new TribeSetting();
        }

        public boolean parseField(TribeSetting tribeSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("transLang")) {
                return false;
            }
            tribeSetting.transLang = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TribeSetting tribeSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("transLang")) {
                return true;
            }
            return super.parseFieldCheck(tribeSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TribeSetting tribeSetting, JsonGenerator jsonGenerator) throws IOException {
            String str = tribeSetting.transLang;
            if (str != null) {
                jsonGenerator.writeStringField("transLang", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TribeSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TribeSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TribeSetting new_() {
        TribeSetting tribeSetting = new TribeSetting();
        tribeSetting.nullCheck();
        return tribeSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TribeSetting m19114clone() {
        TribeSetting tribeSetting = new TribeSetting();
        tribeSetting.transLang = this.transLang;
        return tribeSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TribeSetting) {
            return ValueObject.util_equals(this.transLang, ((TribeSetting) obj).transLang);
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
        String str = this.transLang;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.transLang == null) {
            this.transLang = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
