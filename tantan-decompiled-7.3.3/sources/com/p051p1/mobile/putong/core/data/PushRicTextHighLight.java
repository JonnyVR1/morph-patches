package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class PushRicTextHighLight extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushrictexthighlight";

    @ProtobufIndex(index = 1)
    public int index;

    @ProtobufIndex(index = 2)
    public int length;
    public static ProtobufAdapter<PushRicTextHighLight> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushRicTextHighLight>() { // from class: com.p1.mobile.putong.core.data.PushRicTextHighLight.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PushRicTextHighLight pushRicTextHighLight) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, pushRicTextHighLight.index) + CodedOutputByteBufferNano.m17281h(2, pushRicTextHighLight.length);
            pushRicTextHighLight.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PushRicTextHighLight parse(nc5 nc5Var) throws IOException {
            PushRicTextHighLight pushRicTextHighLight = new PushRicTextHighLight();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    pushRicTextHighLight.index = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return pushRicTextHighLight;
                    }
                    pushRicTextHighLight.length = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PushRicTextHighLight pushRicTextHighLight, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, pushRicTextHighLight.index);
            codedOutputByteBufferNano.m17305G(2, pushRicTextHighLight.length);
        }
    };
    public static JsonAdapter<PushRicTextHighLight> JSON_ADAPTER = new ObjectJsonAdapter<PushRicTextHighLight>() { // from class: com.p1.mobile.putong.core.data.PushRicTextHighLight.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PushRicTextHighLight.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PushRicTextHighLight newInstance() {
            return new PushRicTextHighLight();
        }

        public boolean parseField(PushRicTextHighLight pushRicTextHighLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("length")) {
                pushRicTextHighLight.length = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.INDEX)) {
                return false;
            }
            pushRicTextHighLight.index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PushRicTextHighLight pushRicTextHighLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("length") || str.equals(FirebaseAnalytics.Param.INDEX)) {
                return true;
            }
            return super.parseFieldCheck(pushRicTextHighLight, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushRicTextHighLight pushRicTextHighLight, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, pushRicTextHighLight.index);
            jsonGenerator.writeNumberField("length", pushRicTextHighLight.length);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushRicTextHighLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushRicTextHighLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushRicTextHighLight new_() {
        PushRicTextHighLight pushRicTextHighLight = new PushRicTextHighLight();
        pushRicTextHighLight.nullCheck();
        return pushRicTextHighLight;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PushRicTextHighLight mo225055clone() {
        PushRicTextHighLight pushRicTextHighLight = new PushRicTextHighLight();
        pushRicTextHighLight.index = this.index;
        pushRicTextHighLight.length = this.length;
        return pushRicTextHighLight;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushRicTextHighLight)) {
            return false;
        }
        PushRicTextHighLight pushRicTextHighLight = (PushRicTextHighLight) obj;
        return this.index == pushRicTextHighLight.index && this.length == pushRicTextHighLight.length;
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
        int i2 = (((i * 41) + this.index) * 41) + this.length;
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
