package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PoiGuide poiGuide) {
            String str = poiGuide.popWindowId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = poiGuide.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, poiGuide.count);
            String str3 = poiGuide.guide;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            poiGuide.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PoiGuide parse(nb5 nb5Var) throws IOException {
            PoiGuide poiGuide = new PoiGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    poiGuide.popWindowId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    poiGuide.title = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    poiGuide.count = nb5Var.m158741j();
                } else {
                    if (iM158752u != 34) {
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
                    poiGuide.guide = nb5Var.m158750s();
                }
            }
            return poiGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PoiGuide poiGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = poiGuide.popWindowId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = poiGuide.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, poiGuide.count);
            String str3 = poiGuide.guide;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<PoiGuide> JSON_ADAPTER = new ObjectJsonAdapter<PoiGuide>() { // from class: com.p1.mobile.putong.feed.data.PoiGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PoiGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PoiGuide newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PoiGuide new_() {
        PoiGuide poiGuide = new PoiGuide();
        poiGuide.nullCheck();
        return poiGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PoiGuide mo223809clone() {
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
        String str = this.popWindowId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count) * 41;
        String str3 = this.guide;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
