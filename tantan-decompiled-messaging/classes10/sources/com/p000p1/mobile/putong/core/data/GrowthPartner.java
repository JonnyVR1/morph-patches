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
public class GrowthPartner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthpartner";

    @ProtobufIndex(index = 1)
    public boolean isOpen;
    public static ProtobufAdapter<GrowthPartner> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthPartner>() { // from class: com.p1.mobile.putong.core.data.GrowthPartner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthPartner growthPartner) {
            int iB = CodedOutputByteBufferNano.b(1, growthPartner.isOpen);
            ((MessageNano) growthPartner).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthPartner m13147parse(nb5 nb5Var) throws IOException {
            GrowthPartner growthPartner = new GrowthPartner();
            while (nb5Var.u() == 8) {
                growthPartner.isOpen = nb5Var.g();
            }
            return growthPartner;
        }

        public void serialize(GrowthPartner growthPartner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, growthPartner.isOpen);
        }
    };
    public static JsonAdapter<GrowthPartner> JSON_ADAPTER = new ObjectJsonAdapter<GrowthPartner>() { // from class: com.p1.mobile.putong.core.data.GrowthPartner.2
        public Class getDataClass() {
            return GrowthPartner.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthPartner m13148newInstance() {
            return new GrowthPartner();
        }

        public boolean parseField(GrowthPartner growthPartner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isOpen")) {
                return false;
            }
            growthPartner.isOpen = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GrowthPartner growthPartner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isOpen")) {
                return true;
            }
            return super.parseFieldCheck(growthPartner, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GrowthPartner growthPartner, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", growthPartner.isOpen);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthPartner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthPartner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthPartner new_() {
        GrowthPartner growthPartner = new GrowthPartner();
        growthPartner.nullCheck();
        return growthPartner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthPartner m13146clone() {
        GrowthPartner growthPartner = new GrowthPartner();
        growthPartner.isOpen = this.isOpen;
        return growthPartner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GrowthPartner) && this.isOpen == ((GrowthPartner) obj).isOpen;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isOpen ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
