package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PoiGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "poiguide";

    @ProtobufIndex(index = 3)
    public int count;

    @NonNull
    @ProtobufIndex(index = 4)
    public String guide;
    public PoiGuidePopWindow mPoiGuidePopWindow;

    @NonNull
    @ProtobufIndex(index = 1)
    public String popWindowId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<PoiGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<PoiGuide>() { // from class: com.p1.mobile.putong.feed.data.PoiGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PoiGuide poiGuide) {
            String str = poiGuide.popWindowId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = poiGuide.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, poiGuide.count);
            String str3 = poiGuide.guide;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) poiGuide).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PoiGuide m19708parse(nb5 nb5Var) throws IOException {
            PoiGuide poiGuide = new PoiGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (poiGuide.popWindowId == null) {
                        poiGuide.popWindowId = "";
                    }
                    if (poiGuide.title == null) {
                        poiGuide.title = "";
                    }
                    if (poiGuide.guide != null) {
                        break;
                    }
                    poiGuide.guide = "";
                    break;
                }
                if (iU == 10) {
                    poiGuide.popWindowId = nb5Var.s();
                } else if (iU == 18) {
                    poiGuide.title = nb5Var.s();
                } else if (iU == 24) {
                    poiGuide.count = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (poiGuide.popWindowId == null) {
                            poiGuide.popWindowId = "";
                        }
                        if (poiGuide.title == null) {
                            poiGuide.title = "";
                        }
                        if (poiGuide.guide != null) {
                            break;
                        }
                        poiGuide.guide = "";
                        return poiGuide;
                    }
                    poiGuide.guide = nb5Var.s();
                }
            }
            return poiGuide;
        }

        public void serialize(PoiGuide poiGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = poiGuide.popWindowId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = poiGuide.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, poiGuide.count);
            String str3 = poiGuide.guide;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<PoiGuide> JSON_ADAPTER = new ObjectJsonAdapter<PoiGuide>() { // from class: com.p1.mobile.putong.feed.data.PoiGuide.2
        public Class getDataClass() {
            return PoiGuide.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PoiGuide mo17830newInstance() {
            return new PoiGuide();
        }

        public boolean parseField(PoiGuide poiGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "popWindowId":
                    poiGuide.popWindowId = jsonParser.getValueAsString();
                    return true;
                case "count":
                    poiGuide.count = jsonParser.getValueAsInt();
                    return true;
                case "guide":
                    poiGuide.guide = jsonParser.getValueAsString();
                    return true;
                case "title":
                    poiGuide.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PoiGuide poiGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "popWindowId":
                case "count":
                case "guide":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(poiGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PoiGuide poiGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = poiGuide.popWindowId;
            if (str != null) {
                jsonGenerator.writeStringField("popWindowId", str);
            }
            String str2 = poiGuide.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            jsonGenerator.writeNumberField("count", poiGuide.count);
            String str3 = poiGuide.guide;
            if (str3 != null) {
                jsonGenerator.writeStringField("guide", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PoiGuide new_() {
        PoiGuide poiGuide = new PoiGuide();
        poiGuide.nullCheck();
        return poiGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PoiGuide m19707clone() {
        PoiGuide poiGuide = new PoiGuide();
        poiGuide.popWindowId = this.popWindowId;
        poiGuide.title = this.title;
        poiGuide.count = this.count;
        poiGuide.guide = this.guide;
        return poiGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiGuide)) {
            return false;
        }
        PoiGuide poiGuide = (PoiGuide) obj;
        return ValueObject.util_equals(this.popWindowId, poiGuide.popWindowId) && ValueObject.util_equals(this.title, poiGuide.title) && this.count == poiGuide.count && ValueObject.util_equals(this.guide, poiGuide.guide);
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
        String str = this.popWindowId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count) * 41;
        String str3 = this.guide;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.popWindowId == null) {
            this.popWindowId = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.guide == null) {
            this.guide = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
