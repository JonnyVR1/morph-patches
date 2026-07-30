package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class ChristmasMatchMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "christmasmatchmsgdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Media> media;

    @NonNull
    @ProtobufIndex(index = 2)
    public ChristmasMatchMsgDataText text;
    public static ProtobufAdapter<ChristmasMatchMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChristmasMatchMsgData>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChristmasMatchMsgData christmasMatchMsgData) {
            List<Media> list = christmasMatchMsgData.media;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ChristmasMatchMsgDataText christmasMatchMsgDataText = christmasMatchMsgData.text;
            if (christmasMatchMsgDataText != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, christmasMatchMsgDataText, ChristmasMatchMsgDataText.PROTOBUF_ADAPTER);
            }
            christmasMatchMsgData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChristmasMatchMsgData parse(nb5 nb5Var) throws IOException {
            ChristmasMatchMsgData christmasMatchMsgData = new ChristmasMatchMsgData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (christmasMatchMsgData.media == null) {
                        christmasMatchMsgData.media = new ArrayList();
                    }
                    if (christmasMatchMsgData.text != null) {
                        break;
                    }
                    christmasMatchMsgData.text = ChristmasMatchMsgDataText.new_();
                    break;
                }
                if (iM158752u == 10) {
                    christmasMatchMsgData.media = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (christmasMatchMsgData.media == null) {
                            christmasMatchMsgData.media = new ArrayList();
                        }
                        if (christmasMatchMsgData.text != null) {
                            break;
                        }
                        christmasMatchMsgData.text = ChristmasMatchMsgDataText.new_();
                        return christmasMatchMsgData;
                    }
                    christmasMatchMsgData.text = (ChristmasMatchMsgDataText) nb5Var.m158743l(ChristmasMatchMsgDataText.PROTOBUF_ADAPTER);
                }
            }
            return christmasMatchMsgData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChristmasMatchMsgData christmasMatchMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Media> list = christmasMatchMsgData.media;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ChristmasMatchMsgDataText christmasMatchMsgDataText = christmasMatchMsgData.text;
            if (christmasMatchMsgDataText != null) {
                codedOutputByteBufferNano.m17254K(2, christmasMatchMsgDataText, ChristmasMatchMsgDataText.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChristmasMatchMsgData> JSON_ADAPTER = new ObjectJsonAdapter<ChristmasMatchMsgData>() { // from class: com.p1.mobile.putong.core.data.ChristmasMatchMsgData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChristmasMatchMsgData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChristmasMatchMsgData newInstance() {
            return new ChristmasMatchMsgData();
        }

        public boolean parseField(ChristmasMatchMsgData christmasMatchMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                christmasMatchMsgData.text = ChristmasMatchMsgDataText.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChristmasMatchMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChristmasMatchMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChristmasMatchMsgData new_() {
        ChristmasMatchMsgData christmasMatchMsgData = new ChristmasMatchMsgData();
        christmasMatchMsgData.nullCheck();
        return christmasMatchMsgData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChristmasMatchMsgData mo223809clone() {
        ChristmasMatchMsgData christmasMatchMsgData = new ChristmasMatchMsgData();
        List<Media> list = this.media;
        if (list != null) {
            christmasMatchMsgData.media = ValueObject.util_map(list, new w9j() { // from class: l.k35
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        ChristmasMatchMsgDataText christmasMatchMsgDataText = this.text;
        if (christmasMatchMsgDataText != null) {
            christmasMatchMsgData.text = christmasMatchMsgDataText.mo223809clone();
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
        List<Media> list = this.media;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        ChristmasMatchMsgDataText christmasMatchMsgDataText = this.text;
        int iHashCode2 = iHashCode + (christmasMatchMsgDataText != null ? christmasMatchMsgDataText.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.text == null) {
            this.text = ChristmasMatchMsgDataText.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
