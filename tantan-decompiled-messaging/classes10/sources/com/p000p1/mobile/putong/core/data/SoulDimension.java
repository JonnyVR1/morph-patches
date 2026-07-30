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
public class SoulDimension extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "souldimension";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int score;
    public static ProtobufAdapter<SoulDimension> PROTOBUF_ADAPTER = new MessageNanoAdapter<SoulDimension>() { // from class: com.p1.mobile.putong.core.data.SoulDimension.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SoulDimension soulDimension) {
            String str = soulDimension.name;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, soulDimension.score);
            String str2 = soulDimension.description;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) soulDimension).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SoulDimension m15688parse(nb5 nb5Var) throws IOException {
            SoulDimension soulDimension = new SoulDimension();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (soulDimension.name == null) {
                        soulDimension.name = "";
                    }
                    if (soulDimension.description != null) {
                        break;
                    }
                    soulDimension.description = "";
                    break;
                }
                if (iU == 10) {
                    soulDimension.name = nb5Var.s();
                } else if (iU == 16) {
                    soulDimension.score = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (soulDimension.name == null) {
                            soulDimension.name = "";
                        }
                        if (soulDimension.description != null) {
                            break;
                        }
                        soulDimension.description = "";
                        return soulDimension;
                    }
                    soulDimension.description = nb5Var.s();
                }
            }
            return soulDimension;
        }

        public void serialize(SoulDimension soulDimension, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = soulDimension.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, soulDimension.score);
            String str2 = soulDimension.description;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<SoulDimension> JSON_ADAPTER = new ObjectJsonAdapter<SoulDimension>() { // from class: com.p1.mobile.putong.core.data.SoulDimension.2
        public Class getDataClass() {
            return SoulDimension.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SoulDimension m15689newInstance() {
            return new SoulDimension();
        }

        public boolean parseField(SoulDimension soulDimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    soulDimension.description = jsonParser.getValueAsString();
                    return true;
                case "name":
                    soulDimension.name = jsonParser.getValueAsString();
                    return true;
                case "score":
                    soulDimension.score = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SoulDimension soulDimension, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "name":
                case "score":
                    return true;
                default:
                    return super.parseFieldCheck(soulDimension, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SoulDimension soulDimension, JsonGenerator jsonGenerator) throws IOException {
            String str = soulDimension.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            jsonGenerator.writeNumberField("score", soulDimension.score);
            String str2 = soulDimension.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SoulDimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SoulDimension) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SoulDimension new_() {
        SoulDimension soulDimension = new SoulDimension();
        soulDimension.nullCheck();
        return soulDimension;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SoulDimension m15687clone() {
        SoulDimension soulDimension = new SoulDimension();
        soulDimension.name = this.name;
        soulDimension.score = this.score;
        soulDimension.description = this.description;
        return soulDimension;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SoulDimension)) {
            return false;
        }
        SoulDimension soulDimension = (SoulDimension) obj;
        return ValueObject.util_equals(this.name, soulDimension.name) && this.score == soulDimension.score && ValueObject.util_equals(this.description, soulDimension.description);
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
        String str = this.name;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.score) * 41;
        String str2 = this.description;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
