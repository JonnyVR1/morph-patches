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
public class ColdStartLayer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coldstartlayer";

    @NonNull
    @ProtobufIndex(index = 4)
    public String display;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f32id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String url;
    public static ProtobufAdapter<ColdStartLayer> PROTOBUF_ADAPTER = new MessageNanoAdapter<ColdStartLayer>() { // from class: com.p1.mobile.putong.core.data.ColdStartLayer.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ColdStartLayer coldStartLayer) {
            int iH = CodedOutputByteBufferNano.h(1, coldStartLayer.f32id);
            String str = coldStartLayer.name;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = coldStartLayer.url;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = coldStartLayer.display;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) coldStartLayer).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ColdStartLayer m12205parse(nb5 nb5Var) throws IOException {
            ColdStartLayer coldStartLayer = new ColdStartLayer();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coldStartLayer.name == null) {
                        coldStartLayer.name = "";
                    }
                    if (coldStartLayer.url == null) {
                        coldStartLayer.url = "";
                    }
                    if (coldStartLayer.display != null) {
                        break;
                    }
                    coldStartLayer.display = "";
                    break;
                }
                if (iU == 8) {
                    coldStartLayer.f32id = nb5Var.j();
                } else if (iU == 18) {
                    coldStartLayer.name = nb5Var.s();
                } else if (iU == 26) {
                    coldStartLayer.url = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (coldStartLayer.name == null) {
                            coldStartLayer.name = "";
                        }
                        if (coldStartLayer.url == null) {
                            coldStartLayer.url = "";
                        }
                        if (coldStartLayer.display != null) {
                            break;
                        }
                        coldStartLayer.display = "";
                        return coldStartLayer;
                    }
                    coldStartLayer.display = nb5Var.s();
                }
            }
            return coldStartLayer;
        }

        public void serialize(ColdStartLayer coldStartLayer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, coldStartLayer.f32id);
            String str = coldStartLayer.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = coldStartLayer.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = coldStartLayer.display;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<ColdStartLayer> JSON_ADAPTER = new ObjectJsonAdapter<ColdStartLayer>() { // from class: com.p1.mobile.putong.core.data.ColdStartLayer.2
        public Class getDataClass() {
            return ColdStartLayer.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ColdStartLayer m12206newInstance() {
            return new ColdStartLayer();
        }

        public boolean parseField(ColdStartLayer coldStartLayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    coldStartLayer.f32id = jsonParser.getValueAsInt();
                    return false;
                case "url":
                    coldStartLayer.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    coldStartLayer.name = jsonParser.getValueAsString();
                    return true;
                case "display":
                    coldStartLayer.display = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ColdStartLayer coldStartLayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "url":
                case "name":
                case "display":
                    return true;
                default:
                    return super.parseFieldCheck(coldStartLayer, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ColdStartLayer coldStartLayer, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", coldStartLayer.f32id);
            String str = coldStartLayer.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = coldStartLayer.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = coldStartLayer.display;
            if (str3 != null) {
                jsonGenerator.writeStringField("display", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ColdStartLayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ColdStartLayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ColdStartLayer new_() {
        ColdStartLayer coldStartLayer = new ColdStartLayer();
        coldStartLayer.nullCheck();
        return coldStartLayer;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ColdStartLayer m12204clone() {
        ColdStartLayer coldStartLayer = new ColdStartLayer();
        coldStartLayer.f32id = this.f32id;
        coldStartLayer.name = this.name;
        coldStartLayer.url = this.url;
        coldStartLayer.display = this.display;
        return coldStartLayer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ColdStartLayer)) {
            return false;
        }
        ColdStartLayer coldStartLayer = (ColdStartLayer) obj;
        return this.f32id == coldStartLayer.f32id && ValueObject.util_equals(this.name, coldStartLayer.name) && ValueObject.util_equals(this.url, coldStartLayer.url) && ValueObject.util_equals(this.display, coldStartLayer.display);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f32id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.display;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.display == null) {
            this.display = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
