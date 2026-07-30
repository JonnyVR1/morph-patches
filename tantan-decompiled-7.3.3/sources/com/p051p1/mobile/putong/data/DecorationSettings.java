package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class DecorationSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationsettings";

    @NonNull
    @ProtobufIndex(index = 3)
    public String border;

    @NonNull
    @ProtobufIndex(index = 2)
    public String sticker;

    @NonNull
    @ProtobufIndex(index = 1)
    public String tag;
    public static ProtobufAdapter<DecorationSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationSettings>() { // from class: com.p1.mobile.putong.data.DecorationSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DecorationSettings decorationSettings) {
            String str = decorationSettings.tag;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = decorationSettings.sticker;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = decorationSettings.border;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            decorationSettings.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DecorationSettings parse(nc5 nc5Var) throws IOException {
            DecorationSettings decorationSettings = new DecorationSettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (decorationSettings.tag == null) {
                        decorationSettings.tag = "";
                    }
                    if (decorationSettings.sticker == null) {
                        decorationSettings.sticker = "";
                    }
                    if (decorationSettings.border != null) {
                        break;
                    }
                    decorationSettings.border = "";
                    break;
                }
                if (iM162497u == 10) {
                    decorationSettings.tag = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    decorationSettings.sticker = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (decorationSettings.tag == null) {
                            decorationSettings.tag = "";
                        }
                        if (decorationSettings.sticker == null) {
                            decorationSettings.sticker = "";
                        }
                        if (decorationSettings.border != null) {
                            break;
                        }
                        decorationSettings.border = "";
                        return decorationSettings;
                    }
                    decorationSettings.border = nc5Var.m162495s();
                }
            }
            return decorationSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DecorationSettings decorationSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = decorationSettings.tag;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = decorationSettings.sticker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = decorationSettings.border;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<DecorationSettings> JSON_ADAPTER = new ObjectJsonAdapter<DecorationSettings>() { // from class: com.p1.mobile.putong.data.DecorationSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DecorationSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DecorationSettings newInstance() {
            return new DecorationSettings();
        }

        public boolean parseField(DecorationSettings decorationSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sticker":
                    decorationSettings.sticker = jsonParser.getValueAsString();
                    return true;
                case "border":
                    decorationSettings.border = jsonParser.getValueAsString();
                    return true;
                case "tag":
                    decorationSettings.tag = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DecorationSettings decorationSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sticker":
                case "border":
                case "tag":
                    return true;
                default:
                    return super.parseFieldCheck(decorationSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DecorationSettings decorationSettings, JsonGenerator jsonGenerator) throws IOException {
            String str = decorationSettings.tag;
            if (str != null) {
                jsonGenerator.writeStringField("tag", str);
            }
            String str2 = decorationSettings.sticker;
            if (str2 != null) {
                jsonGenerator.writeStringField("sticker", str2);
            }
            String str3 = decorationSettings.border;
            if (str3 != null) {
                jsonGenerator.writeStringField("border", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationSettings new_() {
        DecorationSettings decorationSettings = new DecorationSettings();
        decorationSettings.nullCheck();
        return decorationSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DecorationSettings mo225055clone() {
        DecorationSettings decorationSettings = new DecorationSettings();
        decorationSettings.tag = this.tag;
        decorationSettings.sticker = this.sticker;
        decorationSettings.border = this.border;
        return decorationSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationSettings)) {
            return false;
        }
        DecorationSettings decorationSettings = (DecorationSettings) obj;
        return ValueObject.util_equals(this.tag, decorationSettings.tag) && ValueObject.util_equals(this.sticker, decorationSettings.sticker) && ValueObject.util_equals(this.border, decorationSettings.border);
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
        String str = this.tag;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sticker;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.border;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tag == null) {
            this.tag = "";
        }
        if (this.sticker == null) {
            this.sticker = "";
        }
        if (this.border == null) {
            this.border = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
