package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
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
public class ColdStartLayer extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coldstartlayer";

    @NonNull
    @ProtobufIndex(index = 4)
    public String display;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f21112id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<ColdStartLayer> PROTOBUF_ADAPTER = new MessageNanoAdapter<ColdStartLayer>() { // from class: com.p1.mobile.putong.core.data.ColdStartLayer.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ColdStartLayer coldStartLayer) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, coldStartLayer.f21112id);
            String str = coldStartLayer.name;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = coldStartLayer.url;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = coldStartLayer.display;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            coldStartLayer.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ColdStartLayer parse(nc5 nc5Var) throws IOException {
            ColdStartLayer coldStartLayer = new ColdStartLayer();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    coldStartLayer.f21112id = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    coldStartLayer.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    coldStartLayer.url = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
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
                    coldStartLayer.display = nc5Var.m162495s();
                }
            }
            return coldStartLayer;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ColdStartLayer coldStartLayer, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, coldStartLayer.f21112id);
            String str = coldStartLayer.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = coldStartLayer.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = coldStartLayer.display;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<ColdStartLayer> JSON_ADAPTER = new ObjectJsonAdapter<ColdStartLayer>() { // from class: com.p1.mobile.putong.core.data.ColdStartLayer.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ColdStartLayer.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ColdStartLayer newInstance() {
            return new ColdStartLayer();
        }

        public boolean parseField(ColdStartLayer coldStartLayer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    coldStartLayer.f21112id = jsonParser.getValueAsInt();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ColdStartLayer coldStartLayer, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", coldStartLayer.f21112id);
            String str = coldStartLayer.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = coldStartLayer.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = coldStartLayer.display;
            if (str3 != null) {
                jsonGenerator.writeStringField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ColdStartLayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ColdStartLayer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ColdStartLayer new_() {
        ColdStartLayer coldStartLayer = new ColdStartLayer();
        coldStartLayer.nullCheck();
        return coldStartLayer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ColdStartLayer mo225055clone() {
        ColdStartLayer coldStartLayer = new ColdStartLayer();
        coldStartLayer.f21112id = this.f21112id;
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
        return this.f21112id == coldStartLayer.f21112id && ValueObject.util_equals(this.name, coldStartLayer.name) && ValueObject.util_equals(this.url, coldStartLayer.url) && ValueObject.util_equals(this.display, coldStartLayer.display);
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
        int i2 = ((i * 41) + this.f21112id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.display;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
