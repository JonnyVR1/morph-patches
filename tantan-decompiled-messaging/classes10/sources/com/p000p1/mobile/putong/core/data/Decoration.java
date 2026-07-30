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
public class Decoration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decoration";

    @NonNull
    @ProtobufIndex(index = 1)
    public DecorationBags bags;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public DecorationCounter boughtRes;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public DecorationBags propsInfo;
    public static ProtobufAdapter<Decoration> PROTOBUF_ADAPTER = new MessageNanoAdapter<Decoration>() { // from class: com.p1.mobile.putong.core.data.Decoration.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Decoration decoration) {
            DecorationBags decorationBags = decoration.bags;
            int iL = decorationBags != null ? CodedOutputByteBufferNano.l(1, decorationBags, DecorationBags.PROTOBUF_ADAPTER) : 0;
            DecorationBags decorationBags2 = decoration.propsInfo;
            if (decorationBags2 != null) {
                iL += CodedOutputByteBufferNano.l(2, decorationBags2, DecorationBags.PROTOBUF_ADAPTER);
            }
            DecorationCounter decorationCounter = decoration.boughtRes;
            if (decorationCounter != null) {
                iL += CodedOutputByteBufferNano.l(3, decorationCounter, DecorationCounter.PROTOBUF_ADAPTER);
            }
            ((MessageNano) decoration).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Decoration m12587parse(nb5 nb5Var) throws IOException {
            Decoration decoration = new Decoration();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (decoration.bags == null) {
                        decoration.bags = DecorationBags.new_();
                    }
                    if (decoration.propsInfo == null) {
                        decoration.propsInfo = DecorationBags.new_();
                    }
                    if (decoration.boughtRes != null) {
                        break;
                    }
                    decoration.boughtRes = DecorationCounter.new_();
                    break;
                }
                if (iU == 10) {
                    decoration.bags = (DecorationBags) nb5Var.l(DecorationBags.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    decoration.propsInfo = (DecorationBags) nb5Var.l(DecorationBags.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (decoration.bags == null) {
                            decoration.bags = DecorationBags.new_();
                        }
                        if (decoration.propsInfo == null) {
                            decoration.propsInfo = DecorationBags.new_();
                        }
                        if (decoration.boughtRes != null) {
                            break;
                        }
                        decoration.boughtRes = DecorationCounter.new_();
                        return decoration;
                    }
                    decoration.boughtRes = (DecorationCounter) nb5Var.l(DecorationCounter.PROTOBUF_ADAPTER);
                }
            }
            return decoration;
        }

        public void serialize(Decoration decoration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            DecorationBags decorationBags = decoration.bags;
            if (decorationBags != null) {
                codedOutputByteBufferNano.K(1, decorationBags, DecorationBags.PROTOBUF_ADAPTER);
            }
            DecorationBags decorationBags2 = decoration.propsInfo;
            if (decorationBags2 != null) {
                codedOutputByteBufferNano.K(2, decorationBags2, DecorationBags.PROTOBUF_ADAPTER);
            }
            DecorationCounter decorationCounter = decoration.boughtRes;
            if (decorationCounter != null) {
                codedOutputByteBufferNano.K(3, decorationCounter, DecorationCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Decoration> JSON_ADAPTER = new ObjectJsonAdapter<Decoration>() { // from class: com.p1.mobile.putong.core.data.Decoration.2
        public Class getDataClass() {
            return Decoration.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Decoration m12588newInstance() {
            return new Decoration();
        }

        public boolean parseField(Decoration decoration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "boughtRes":
                    decoration.boughtRes = (DecorationCounter) DecorationCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "propsInfo":
                    decoration.propsInfo = (DecorationBags) DecorationBags.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bags":
                    decoration.bags = (DecorationBags) DecorationBags.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Decoration decoration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "boughtRes":
                case "propsInfo":
                case "bags":
                    return true;
                default:
                    return super.parseFieldCheck(decoration, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Decoration decoration, JsonGenerator jsonGenerator) throws IOException {
            if (decoration.bags != null) {
                jsonGenerator.writeFieldName(Bags.TYPE);
                DecorationBags.JSON_ADAPTER.serialize(decoration.bags, jsonGenerator, true);
            }
            if (decoration.propsInfo != null) {
                jsonGenerator.writeFieldName("propsInfo");
                DecorationBags.JSON_ADAPTER.serialize(decoration.propsInfo, jsonGenerator, true);
            }
            if (decoration.boughtRes != null) {
                jsonGenerator.writeFieldName("boughtRes");
                DecorationCounter.JSON_ADAPTER.serialize(decoration.boughtRes, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Decoration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Decoration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Decoration new_() {
        Decoration decoration = new Decoration();
        decoration.nullCheck();
        return decoration;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Decoration m12586clone() {
        Decoration decoration = new Decoration();
        DecorationBags decorationBags = this.bags;
        if (decorationBags != null) {
            decoration.bags = decorationBags.m12590clone();
        }
        DecorationBags decorationBags2 = this.propsInfo;
        if (decorationBags2 != null) {
            decoration.propsInfo = decorationBags2.m12590clone();
        }
        DecorationCounter decorationCounter = this.boughtRes;
        if (decorationCounter != null) {
            decoration.boughtRes = decorationCounter.m12594clone();
        }
        return decoration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Decoration)) {
            return false;
        }
        Decoration decoration = (Decoration) obj;
        return ValueObject.util_equals(this.bags, decoration.bags) && ValueObject.util_equals(this.propsInfo, decoration.propsInfo) && ValueObject.util_equals(this.boughtRes, decoration.boughtRes);
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
        DecorationBags decorationBags = this.bags;
        int iHashCode = (i2 + (decorationBags != null ? decorationBags.hashCode() : 0)) * 41;
        DecorationBags decorationBags2 = this.propsInfo;
        int iHashCode2 = (iHashCode + (decorationBags2 != null ? decorationBags2.hashCode() : 0)) * 41;
        DecorationCounter decorationCounter = this.boughtRes;
        int iHashCode3 = iHashCode2 + (decorationCounter != null ? decorationCounter.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.bags == null) {
            this.bags = DecorationBags.new_();
        }
        if (this.propsInfo == null) {
            this.propsInfo = DecorationBags.new_();
        }
        if (this.boughtRes == null) {
            this.boughtRes = DecorationCounter.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
