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
public class PushRicTextHighLight extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushrictexthighlight";

    @ProtobufIndex(index = 1)
    public int index;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int length;
    public static ProtobufAdapter<PushRicTextHighLight> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushRicTextHighLight>() { // from class: com.p1.mobile.putong.core.data.PushRicTextHighLight.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PushRicTextHighLight pushRicTextHighLight) {
            int iH = CodedOutputByteBufferNano.h(1, pushRicTextHighLight.index) + CodedOutputByteBufferNano.h(2, pushRicTextHighLight.length);
            ((MessageNano) pushRicTextHighLight).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PushRicTextHighLight m15105parse(nb5 nb5Var) throws IOException {
            PushRicTextHighLight pushRicTextHighLight = new PushRicTextHighLight();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    pushRicTextHighLight.index = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return pushRicTextHighLight;
                    }
                    pushRicTextHighLight.length = nb5Var.j();
                }
            }
        }

        public void serialize(PushRicTextHighLight pushRicTextHighLight, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, pushRicTextHighLight.index);
            codedOutputByteBufferNano.G(2, pushRicTextHighLight.length);
        }
    };
    public static JsonAdapter<PushRicTextHighLight> JSON_ADAPTER = new ObjectJsonAdapter<PushRicTextHighLight>() { // from class: com.p1.mobile.putong.core.data.PushRicTextHighLight.2
        public Class getDataClass() {
            return PushRicTextHighLight.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PushRicTextHighLight m15106newInstance() {
            return new PushRicTextHighLight();
        }

        public boolean parseField(PushRicTextHighLight pushRicTextHighLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("length")) {
                pushRicTextHighLight.length = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("index")) {
                return false;
            }
            pushRicTextHighLight.index = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PushRicTextHighLight pushRicTextHighLight, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("length") || str.equals("index")) {
                return true;
            }
            return super.parseFieldCheck(pushRicTextHighLight, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PushRicTextHighLight pushRicTextHighLight, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("index", pushRicTextHighLight.index);
            jsonGenerator.writeNumberField("length", pushRicTextHighLight.length);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushRicTextHighLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushRicTextHighLight) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushRicTextHighLight new_() {
        PushRicTextHighLight pushRicTextHighLight = new PushRicTextHighLight();
        pushRicTextHighLight.nullCheck();
        return pushRicTextHighLight;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PushRicTextHighLight m15104clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.index) * 41) + this.length;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
