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
public class IntlMarketStickerOptionsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketstickeroptionsdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String desc;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f88id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String img_url;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String sub_desc;
    public static ProtobufAdapter<IntlMarketStickerOptionsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketStickerOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlMarketStickerOptionsData intlMarketStickerOptionsData) {
            int iH = CodedOutputByteBufferNano.h(1, intlMarketStickerOptionsData.f88id);
            String str = intlMarketStickerOptionsData.img_url;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = intlMarketStickerOptionsData.desc;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            int iB = iH + CodedOutputByteBufferNano.b(4, intlMarketStickerOptionsData.isSelected);
            String str3 = intlMarketStickerOptionsData.sub_desc;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) intlMarketStickerOptionsData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlMarketStickerOptionsData m13631parse(nb5 nb5Var) throws IOException {
            IntlMarketStickerOptionsData intlMarketStickerOptionsData = new IntlMarketStickerOptionsData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlMarketStickerOptionsData.img_url == null) {
                        intlMarketStickerOptionsData.img_url = "";
                    }
                    if (intlMarketStickerOptionsData.desc == null) {
                        intlMarketStickerOptionsData.desc = "";
                    }
                    if (intlMarketStickerOptionsData.sub_desc != null) {
                        break;
                    }
                    intlMarketStickerOptionsData.sub_desc = "";
                    break;
                }
                if (iU == 8) {
                    intlMarketStickerOptionsData.f88id = nb5Var.j();
                } else if (iU == 18) {
                    intlMarketStickerOptionsData.img_url = nb5Var.s();
                } else if (iU == 26) {
                    intlMarketStickerOptionsData.desc = nb5Var.s();
                } else if (iU == 32) {
                    intlMarketStickerOptionsData.isSelected = nb5Var.g();
                } else {
                    if (iU != 42) {
                        if (intlMarketStickerOptionsData.img_url == null) {
                            intlMarketStickerOptionsData.img_url = "";
                        }
                        if (intlMarketStickerOptionsData.desc == null) {
                            intlMarketStickerOptionsData.desc = "";
                        }
                        if (intlMarketStickerOptionsData.sub_desc != null) {
                            break;
                        }
                        intlMarketStickerOptionsData.sub_desc = "";
                        return intlMarketStickerOptionsData;
                    }
                    intlMarketStickerOptionsData.sub_desc = nb5Var.s();
                }
            }
            return intlMarketStickerOptionsData;
        }

        public void serialize(IntlMarketStickerOptionsData intlMarketStickerOptionsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, intlMarketStickerOptionsData.f88id);
            String str = intlMarketStickerOptionsData.img_url;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = intlMarketStickerOptionsData.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.A(4, intlMarketStickerOptionsData.isSelected);
            String str3 = intlMarketStickerOptionsData.sub_desc;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<IntlMarketStickerOptionsData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketStickerOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData.2
        public Class getDataClass() {
            return IntlMarketStickerOptionsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlMarketStickerOptionsData m13632newInstance() {
            return new IntlMarketStickerOptionsData();
        }

        public boolean parseField(IntlMarketStickerOptionsData intlMarketStickerOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sub_desc":
                    intlMarketStickerOptionsData.sub_desc = jsonParser.getValueAsString();
                    return true;
                case "id":
                    intlMarketStickerOptionsData.f88id = jsonParser.getValueAsInt();
                    return false;
                case "desc":
                    intlMarketStickerOptionsData.desc = jsonParser.getValueAsString();
                    return true;
                case "isSelected":
                    intlMarketStickerOptionsData.isSelected = jsonParser.getValueAsBoolean();
                    return true;
                case "img_url":
                    intlMarketStickerOptionsData.img_url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketStickerOptionsData intlMarketStickerOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sub_desc":
                    return true;
                case "id":
                    return false;
                case "desc":
                case "isSelected":
                case "img_url":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketStickerOptionsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlMarketStickerOptionsData intlMarketStickerOptionsData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", intlMarketStickerOptionsData.f88id);
            String str = intlMarketStickerOptionsData.img_url;
            if (str != null) {
                jsonGenerator.writeStringField("img_url", str);
            }
            String str2 = intlMarketStickerOptionsData.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField("desc", str2);
            }
            jsonGenerator.writeBooleanField("isSelected", intlMarketStickerOptionsData.isSelected);
            String str3 = intlMarketStickerOptionsData.sub_desc;
            if (str3 != null) {
                jsonGenerator.writeStringField("sub_desc", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketStickerOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketStickerOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketStickerOptionsData new_() {
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = new IntlMarketStickerOptionsData();
        intlMarketStickerOptionsData.nullCheck();
        return intlMarketStickerOptionsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlMarketStickerOptionsData m13630clone() {
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = new IntlMarketStickerOptionsData();
        intlMarketStickerOptionsData.f88id = this.f88id;
        intlMarketStickerOptionsData.img_url = this.img_url;
        intlMarketStickerOptionsData.desc = this.desc;
        intlMarketStickerOptionsData.isSelected = this.isSelected;
        intlMarketStickerOptionsData.sub_desc = this.sub_desc;
        return intlMarketStickerOptionsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketStickerOptionsData)) {
            return false;
        }
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = (IntlMarketStickerOptionsData) obj;
        return this.f88id == intlMarketStickerOptionsData.f88id && ValueObject.util_equals(this.img_url, intlMarketStickerOptionsData.img_url) && ValueObject.util_equals(this.desc, intlMarketStickerOptionsData.desc) && this.isSelected == intlMarketStickerOptionsData.isSelected && ValueObject.util_equals(this.sub_desc, intlMarketStickerOptionsData.sub_desc);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f88id) * 41;
        String str = this.img_url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237)) * 41;
        String str3 = this.sub_desc;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.img_url == null) {
            this.img_url = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.sub_desc == null) {
            this.sub_desc = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
