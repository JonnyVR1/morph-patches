package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Media;
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
public class ChristmasMatchMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "christmasmatchmsgdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Media> media;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ChristmasMatchMsgDataText text;
    public static ProtobufAdapter<ChristmasMatchMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChristmasMatchMsgData>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChristmasMatchMsgData christmasMatchMsgData) {
            List<Media> list = christmasMatchMsgData.media;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ChristmasMatchMsgDataText christmasMatchMsgDataText = christmasMatchMsgData.text;
            if (christmasMatchMsgDataText != null) {
                iL += CodedOutputByteBufferNano.l(2, christmasMatchMsgDataText, ChristmasMatchMsgDataText.PROTOBUF_ADAPTER);
            }
            ((MessageNano) christmasMatchMsgData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChristmasMatchMsgData m12161parse(nb5 nb5Var) throws IOException {
            ChristmasMatchMsgData christmasMatchMsgData = new ChristmasMatchMsgData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (christmasMatchMsgData.media == null) {
                        christmasMatchMsgData.media = new ArrayList();
                    }
                    if (christmasMatchMsgData.text != null) {
                        break;
                    }
                    christmasMatchMsgData.text = ChristmasMatchMsgDataText.new_();
                    break;
                }
                if (iU == 10) {
                    christmasMatchMsgData.media = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (christmasMatchMsgData.media == null) {
                            christmasMatchMsgData.media = new ArrayList();
                        }
                        if (christmasMatchMsgData.text != null) {
                            break;
                        }
                        christmasMatchMsgData.text = ChristmasMatchMsgDataText.new_();
                        return christmasMatchMsgData;
                    }
                    christmasMatchMsgData.text = (ChristmasMatchMsgDataText) nb5Var.l(ChristmasMatchMsgDataText.PROTOBUF_ADAPTER);
                }
            }
            return christmasMatchMsgData;
        }

        public void serialize(ChristmasMatchMsgData christmasMatchMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = christmasMatchMsgData.media;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChristmasMatchMsgDataText christmasMatchMsgDataText = christmasMatchMsgData.text;
            if (christmasMatchMsgDataText != null) {
                codedOutputByteBufferNano.K(2, christmasMatchMsgDataText, ChristmasMatchMsgDataText.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChristmasMatchMsgData> JSON_ADAPTER = new ObjectJsonAdapter<ChristmasMatchMsgData>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgData.2
        public Class getDataClass() {
            return ChristmasMatchMsgData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChristmasMatchMsgData m12162newInstance() {
            return new ChristmasMatchMsgData();
        }

        public boolean parseField(ChristmasMatchMsgData christmasMatchMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                christmasMatchMsgData.text = (ChristmasMatchMsgDataText) ChristmasMatchMsgDataText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("media")) {
                return false;
            }
            christmasMatchMsgData.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChristmasMatchMsgData christmasMatchMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("media")) {
                return true;
            }
            return super.parseFieldCheck(christmasMatchMsgData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChristmasMatchMsgData christmasMatchMsgData, JsonGenerator jsonGenerator) throws IOException {
            if (christmasMatchMsgData.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(christmasMatchMsgData.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (christmasMatchMsgData.text != null) {
                jsonGenerator.writeFieldName("text");
                ChristmasMatchMsgDataText.JSON_ADAPTER.serialize(christmasMatchMsgData.text, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChristmasMatchMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChristmasMatchMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChristmasMatchMsgData new_() {
        ChristmasMatchMsgData christmasMatchMsgData = new ChristmasMatchMsgData();
        christmasMatchMsgData.nullCheck();
        return christmasMatchMsgData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChristmasMatchMsgData m12160clone() {
        ChristmasMatchMsgData christmasMatchMsgData = new ChristmasMatchMsgData();
        List<Media> list = this.media;
        if (list != null) {
            christmasMatchMsgData.media = ValueObject.util_map(list, new w9j() { // from class: l.k35
                public final Object call(Object obj) {
                    return ((Media) obj).clone();
                }
            });
        }
        ChristmasMatchMsgDataText christmasMatchMsgDataText = this.text;
        if (christmasMatchMsgDataText != null) {
            christmasMatchMsgData.text = christmasMatchMsgDataText.m12168clone();
        }
        return christmasMatchMsgData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChristmasMatchMsgData)) {
            return false;
        }
        ChristmasMatchMsgData christmasMatchMsgData = (ChristmasMatchMsgData) obj;
        return ValueObject.util_equals(this.media, christmasMatchMsgData.media) && ValueObject.util_equals(this.text, christmasMatchMsgData.text);
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
        List<Media> list = this.media;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        ChristmasMatchMsgDataText christmasMatchMsgDataText = this.text;
        int iHashCode2 = iHashCode + (christmasMatchMsgDataText != null ? christmasMatchMsgDataText.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.text == null) {
            this.text = ChristmasMatchMsgDataText.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
