package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.DecorationProps;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DecorationBags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationbags";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<DecorationProps> borderProps;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<DecorationProps> stickerProps;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<DecorationProps> tagProps;
    public static ProtobufAdapter<DecorationBags> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationBags>() { // from class: com.p1.mobile.putong.core.data.DecorationBags.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DecorationBags decorationBags) {
            List<DecorationProps> list = decorationBags.tagProps;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<DecorationProps> list2 = decorationBags.stickerProps;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DecorationProps> list3 = decorationBags.borderProps;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) decorationBags).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DecorationBags m12591parse(nb5 nb5Var) throws IOException {
            DecorationBags decorationBags = new DecorationBags();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (decorationBags.tagProps == null) {
                        decorationBags.tagProps = new ArrayList();
                    }
                    if (decorationBags.stickerProps == null) {
                        decorationBags.stickerProps = new ArrayList();
                    }
                    if (decorationBags.borderProps != null) {
                        break;
                    }
                    decorationBags.borderProps = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    decorationBags.tagProps = (List) nb5Var.l(DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    decorationBags.stickerProps = (List) nb5Var.l(DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (decorationBags.tagProps == null) {
                            decorationBags.tagProps = new ArrayList();
                        }
                        if (decorationBags.stickerProps == null) {
                            decorationBags.stickerProps = new ArrayList();
                        }
                        if (decorationBags.borderProps != null) {
                            break;
                        }
                        decorationBags.borderProps = new ArrayList();
                        return decorationBags;
                    }
                    decorationBags.borderProps = (List) nb5Var.l(DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return decorationBags;
        }

        public void serialize(DecorationBags decorationBags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<DecorationProps> list = decorationBags.tagProps;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DecorationProps> list2 = decorationBags.stickerProps;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<DecorationProps> list3 = decorationBags.borderProps;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, DecorationProps.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<DecorationBags> JSON_ADAPTER = new ObjectJsonAdapter<DecorationBags>() { // from class: com.p1.mobile.putong.core.data.DecorationBags.2
        public Class getDataClass() {
            return DecorationBags.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DecorationBags m12592newInstance() {
            return new DecorationBags();
        }

        public boolean parseField(DecorationBags decorationBags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "stickerProps":
                    decorationBags.stickerProps = JsonAdapter.parseArray(jsonParser, DecorationProps.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tagProps":
                    decorationBags.tagProps = JsonAdapter.parseArray(jsonParser, DecorationProps.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "borderProps":
                    decorationBags.borderProps = JsonAdapter.parseArray(jsonParser, DecorationProps.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DecorationBags decorationBags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "stickerProps":
                case "tagProps":
                case "borderProps":
                    return true;
                default:
                    return super.parseFieldCheck(decorationBags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(DecorationBags decorationBags, JsonGenerator jsonGenerator) throws IOException {
            if (decorationBags.tagProps != null) {
                jsonGenerator.writeFieldName("tagProps");
                JsonAdapter.serializeArray(decorationBags.tagProps, jsonGenerator, DecorationProps.JSON_ADAPTER);
            }
            if (decorationBags.stickerProps != null) {
                jsonGenerator.writeFieldName("stickerProps");
                JsonAdapter.serializeArray(decorationBags.stickerProps, jsonGenerator, DecorationProps.JSON_ADAPTER);
            }
            if (decorationBags.borderProps != null) {
                jsonGenerator.writeFieldName("borderProps");
                JsonAdapter.serializeArray(decorationBags.borderProps, jsonGenerator, DecorationProps.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationBags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationBags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationBags new_() {
        DecorationBags decorationBags = new DecorationBags();
        decorationBags.nullCheck();
        return decorationBags;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DecorationBags m12590clone() {
        DecorationBags decorationBags = new DecorationBags();
        List<DecorationProps> list = this.tagProps;
        if (list != null) {
            decorationBags.tagProps = ValueObject.util_map(list, new w9j() { // from class: l.lhd
                public final Object call(Object obj) {
                    return ((DecorationProps) obj).m12598clone();
                }
            });
        }
        List<DecorationProps> list2 = this.stickerProps;
        if (list2 != null) {
            decorationBags.stickerProps = ValueObject.util_map(list2, new w9j() { // from class: l.mhd
                public final Object call(Object obj) {
                    return ((DecorationProps) obj).m12598clone();
                }
            });
        }
        List<DecorationProps> list3 = this.borderProps;
        if (list3 != null) {
            decorationBags.borderProps = ValueObject.util_map(list3, new w9j() { // from class: l.nhd
                public final Object call(Object obj) {
                    return ((DecorationProps) obj).m12598clone();
                }
            });
        }
        return decorationBags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationBags)) {
            return false;
        }
        DecorationBags decorationBags = (DecorationBags) obj;
        return ValueObject.util_equals(this.tagProps, decorationBags.tagProps) && ValueObject.util_equals(this.stickerProps, decorationBags.stickerProps) && ValueObject.util_equals(this.borderProps, decorationBags.borderProps);
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
        List<DecorationProps> list = this.tagProps;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<DecorationProps> list2 = this.stickerProps;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<DecorationProps> list3 = this.borderProps;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.tagProps == null) {
            this.tagProps = new ArrayList();
        }
        if (this.stickerProps == null) {
            this.stickerProps = new ArrayList();
        }
        if (this.borderProps == null) {
            this.borderProps = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
