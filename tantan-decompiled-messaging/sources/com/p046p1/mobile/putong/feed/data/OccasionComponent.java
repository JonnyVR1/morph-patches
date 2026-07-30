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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OccasionComponent occasionComponent) {
            OccasionType occasionType = occasionComponent.type;
            int iM17230l = occasionType != null ? CodedOutputByteBufferNano.m17230l(1, occasionType, OccasionType.PROTOBUF_ADAPTER) : 0;
            String str = occasionComponent.pageId;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(3, occasionComponent.readCount) + CodedOutputByteBufferNano.m17226h(4, occasionComponent.intervalDays) + CodedOutputByteBufferNano.m17226h(5, occasionComponent.showTimes) + CodedOutputByteBufferNano.m17226h(6, occasionComponent.days);
            occasionComponent.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OccasionComponent parse(nb5 nb5Var) throws IOException {
            OccasionComponent occasionComponent = new OccasionComponent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (occasionComponent.type == null) {
                        occasionComponent.type = (OccasionType) OccasionType.JSON_ADAPTER.defaultEnum();
                    }
                    if (occasionComponent.pageId != null) {
                        break;
                    }
                    occasionComponent.pageId = "";
                    break;
                }
                if (iM158752u == 10) {
                    occasionComponent.type = (OccasionType) nb5Var.m158743l(OccasionType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    occasionComponent.pageId = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    occasionComponent.readCount = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    occasionComponent.intervalDays = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    occasionComponent.showTimes = nb5Var.m158741j();
                } else {
                    if (iM158752u != 48) {
                        if (occasionComponent.type == null) {
                            occasionComponent.type = (OccasionType) OccasionType.JSON_ADAPTER.defaultEnum();
                        }
                        if (occasionComponent.pageId != null) {
                            break;
                        }
                        occasionComponent.pageId = "";
                        return occasionComponent;
                    }
                    occasionComponent.days = nb5Var.m158741j();
                }
            }
            return occasionComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OccasionComponent occasionComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OccasionType occasionType = occasionComponent.type;
            if (occasionType != null) {
                codedOutputByteBufferNano.m17254K(1, occasionType, OccasionType.PROTOBUF_ADAPTER);
            }
            String str = occasionComponent.pageId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(3, occasionComponent.readCount);
            codedOutputByteBufferNano.m17250G(4, occasionComponent.intervalDays);
            codedOutputByteBufferNano.m17250G(5, occasionComponent.showTimes);
            codedOutputByteBufferNano.m17250G(6, occasionComponent.days);
        }
    };
    public static JsonAdapter<OccasionComponent> JSON_ADAPTER = new ObjectJsonAdapter<OccasionComponent>() { // from class: com.p1.mobile.putong.feed.data.OccasionComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OccasionComponent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OccasionComponent newInstance() {
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
                    occasionComponent.type = OccasionType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OccasionComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OccasionComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OccasionComponent new_() {
        OccasionComponent occasionComponent = new OccasionComponent();
        occasionComponent.nullCheck();
        return occasionComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OccasionComponent mo223809clone() {
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
        OccasionType occasionType = this.type;
        int iHashCode = (i2 + (occasionType != null ? occasionType.hashCode() : 0)) * 41;
        String str = this.pageId;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.readCount) * 41) + this.intervalDays) * 41) + this.showTimes) * 41) + this.days;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (OccasionType) OccasionType.JSON_ADAPTER.defaultEnum();
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
