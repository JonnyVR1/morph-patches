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
public class OccasionComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "occasioncomponent";

    @ProtobufIndex(index = 6)
    public int days;

    @ProtobufIndex(index = 4)
    public int intervalDays;

    @NonNull
    @ProtobufIndex(index = 2)
    public String pageId;

    @ProtobufIndex(index = 3)
    public int readCount;

    @ProtobufIndex(index = 5)
    public int showTimes;

    @NonNull
    @ProtobufIndex(index = 1)
    public OccasionType type;
    public static ProtobufAdapter<OccasionComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OccasionComponent>() { // from class: com.p1.mobile.putong.feed.data.OccasionComponent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OccasionComponent occasionComponent) {
            OccasionType occasionType = occasionComponent.type;
            int iL = occasionType != null ? CodedOutputByteBufferNano.l(1, occasionType, OccasionType.PROTOBUF_ADAPTER) : 0;
            String str = occasionComponent.pageId;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            int iH = iL + CodedOutputByteBufferNano.h(3, occasionComponent.readCount) + CodedOutputByteBufferNano.h(4, occasionComponent.intervalDays) + CodedOutputByteBufferNano.h(5, occasionComponent.showTimes) + CodedOutputByteBufferNano.h(6, occasionComponent.days);
            ((MessageNano) occasionComponent).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OccasionComponent m19687parse(nb5 nb5Var) throws IOException {
            OccasionComponent occasionComponent = new OccasionComponent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (occasionComponent.type == null) {
                        occasionComponent.type = (OccasionType) OccasionType.JSON_ADAPTER.defaultEnum();
                    }
                    if (occasionComponent.pageId != null) {
                        break;
                    }
                    occasionComponent.pageId = "";
                    break;
                }
                if (iU == 10) {
                    occasionComponent.type = (OccasionType) nb5Var.l(OccasionType.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    occasionComponent.pageId = nb5Var.s();
                } else if (iU == 24) {
                    occasionComponent.readCount = nb5Var.j();
                } else if (iU == 32) {
                    occasionComponent.intervalDays = nb5Var.j();
                } else if (iU == 40) {
                    occasionComponent.showTimes = nb5Var.j();
                } else {
                    if (iU != 48) {
                        if (occasionComponent.type == null) {
                            occasionComponent.type = (OccasionType) OccasionType.JSON_ADAPTER.defaultEnum();
                        }
                        if (occasionComponent.pageId != null) {
                            break;
                        }
                        occasionComponent.pageId = "";
                        return occasionComponent;
                    }
                    occasionComponent.days = nb5Var.j();
                }
            }
            return occasionComponent;
        }

        public void serialize(OccasionComponent occasionComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OccasionType occasionType = occasionComponent.type;
            if (occasionType != null) {
                codedOutputByteBufferNano.K(1, occasionType, OccasionType.PROTOBUF_ADAPTER);
            }
            String str = occasionComponent.pageId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(3, occasionComponent.readCount);
            codedOutputByteBufferNano.G(4, occasionComponent.intervalDays);
            codedOutputByteBufferNano.G(5, occasionComponent.showTimes);
            codedOutputByteBufferNano.G(6, occasionComponent.days);
        }
    };
    public static JsonAdapter<OccasionComponent> JSON_ADAPTER = new ObjectJsonAdapter<OccasionComponent>() { // from class: com.p1.mobile.putong.feed.data.OccasionComponent.2
        public Class getDataClass() {
            return OccasionComponent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OccasionComponent mo17830newInstance() {
            return new OccasionComponent();
        }

        public boolean parseField(OccasionComponent occasionComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showTimes":
                    occasionComponent.showTimes = jsonParser.getValueAsInt();
                    return true;
                case "intervalDays":
                    occasionComponent.intervalDays = jsonParser.getValueAsInt();
                    return true;
                case "readCount":
                    occasionComponent.readCount = jsonParser.getValueAsInt();
                    return true;
                case "pageId":
                    occasionComponent.pageId = jsonParser.getValueAsString();
                    return true;
                case "days":
                    occasionComponent.days = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    occasionComponent.type = (OccasionType) OccasionType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OccasionComponent occasionComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showTimes":
                case "intervalDays":
                case "readCount":
                case "pageId":
                case "days":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(occasionComponent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OccasionComponent occasionComponent, JsonGenerator jsonGenerator) throws IOException {
            if (occasionComponent.type != null) {
                jsonGenerator.writeFieldName("type");
                OccasionType.JSON_ADAPTER.serialize(occasionComponent.type, jsonGenerator, true);
            }
            String str = occasionComponent.pageId;
            if (str != null) {
                jsonGenerator.writeStringField("pageId", str);
            }
            jsonGenerator.writeNumberField("readCount", occasionComponent.readCount);
            jsonGenerator.writeNumberField("intervalDays", occasionComponent.intervalDays);
            jsonGenerator.writeNumberField("showTimes", occasionComponent.showTimes);
            jsonGenerator.writeNumberField("days", occasionComponent.days);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OccasionComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OccasionComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OccasionComponent new_() {
        OccasionComponent occasionComponent = new OccasionComponent();
        occasionComponent.nullCheck();
        return occasionComponent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OccasionComponent m19686clone() {
        OccasionComponent occasionComponent = new OccasionComponent();
        occasionComponent.type = this.type;
        occasionComponent.pageId = this.pageId;
        occasionComponent.readCount = this.readCount;
        occasionComponent.intervalDays = this.intervalDays;
        occasionComponent.showTimes = this.showTimes;
        occasionComponent.days = this.days;
        return occasionComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OccasionComponent)) {
            return false;
        }
        OccasionComponent occasionComponent = (OccasionComponent) obj;
        return ValueObject.util_equals(this.type, occasionComponent.type) && ValueObject.util_equals(this.pageId, occasionComponent.pageId) && this.readCount == occasionComponent.readCount && this.intervalDays == occasionComponent.intervalDays && this.showTimes == occasionComponent.showTimes && this.days == occasionComponent.days;
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
        OccasionType occasionType = this.type;
        int iHashCode = (i2 + (occasionType != null ? occasionType.hashCode() : 0)) * 41;
        String str = this.pageId;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.readCount) * 41) + this.intervalDays) * 41) + this.showTimes) * 41) + this.days;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = (OccasionType) OccasionType.JSON_ADAPTER.defaultEnum();
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
