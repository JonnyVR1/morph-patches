package com.p046p1.mobile.putong.data;

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
public class CreativeOms extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creativeoms";

    @NonNull
    @ProtobufIndex(index = 1)
    public CreativeType creativeType;

    @ProtobufIndex(index = 4)
    public boolean logoAreaClickable;

    @NonNull
    @ProtobufIndex(index = 3)
    public String logoRatio;

    @ProtobufIndex(index = 8)
    public int processMethod;

    @NonNull
    @ProtobufIndex(index = 5)
    public SkipPosition skipPosition;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<CreativeOms> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreativeOms>() { // from class: com.p1.mobile.putong.data.CreativeOms.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CreativeOms creativeOms) {
            CreativeType creativeType = creativeOms.creativeType;
            int iM17226h = creativeType != null ? CodedOutputByteBufferNano.m17226h(1, creativeType.ordinal()) : 0;
            String str = creativeOms.url;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = creativeOms.logoRatio;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(4, creativeOms.logoAreaClickable);
            SkipPosition skipPosition = creativeOms.skipPosition;
            if (skipPosition != null) {
                iM17220b += CodedOutputByteBufferNano.m17226h(5, skipPosition.ordinal());
            }
            CreativeType creativeType2 = creativeOms.creativeType;
            if (creativeType2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, creativeType2, CreativeType.PROTOBUF_ADAPTER);
            }
            SkipPosition skipPosition2 = creativeOms.skipPosition;
            if (skipPosition2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, skipPosition2, SkipPosition.PROTOBUF_ADAPTER);
            }
            int iM17226h2 = iM17220b + CodedOutputByteBufferNano.m17226h(8, creativeOms.processMethod);
            creativeOms.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CreativeOms parse(nb5 nb5Var) throws IOException {
            CreativeOms creativeOms = new CreativeOms();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (creativeOms.creativeType == null && numValueOf != null) {
                        creativeOms.creativeType = (CreativeType) CreativeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (creativeOms.skipPosition == null && numValueOf2 != null) {
                        creativeOms.skipPosition = (SkipPosition) SkipPosition.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                    }
                    if (creativeOms.creativeType == null) {
                        creativeOms.creativeType = (CreativeType) CreativeType.JSON_ADAPTER.defaultEnum();
                    }
                    if (creativeOms.url == null) {
                        creativeOms.url = "";
                    }
                    if (creativeOms.logoRatio == null) {
                        creativeOms.logoRatio = "";
                    }
                    if (creativeOms.skipPosition != null) {
                        break;
                    }
                    creativeOms.skipPosition = (SkipPosition) SkipPosition.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    creativeOms.url = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    creativeOms.logoRatio = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    creativeOms.logoAreaClickable = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 50) {
                    creativeOms.creativeType = (CreativeType) nb5Var.m158743l(CreativeType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 58) {
                    creativeOms.skipPosition = (SkipPosition) nb5Var.m158743l(SkipPosition.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 64) {
                        if (creativeOms.creativeType == null && numValueOf != null) {
                            creativeOms.creativeType = (CreativeType) CreativeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (creativeOms.skipPosition == null && numValueOf2 != null) {
                            creativeOms.skipPosition = (SkipPosition) SkipPosition.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (creativeOms.creativeType == null) {
                            creativeOms.creativeType = (CreativeType) CreativeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (creativeOms.url == null) {
                            creativeOms.url = "";
                        }
                        if (creativeOms.logoRatio == null) {
                            creativeOms.logoRatio = "";
                        }
                        if (creativeOms.skipPosition != null) {
                            break;
                        }
                        creativeOms.skipPosition = (SkipPosition) SkipPosition.JSON_ADAPTER.defaultEnum();
                        return creativeOms;
                    }
                    creativeOms.processMethod = nb5Var.m158741j();
                }
            }
            return creativeOms;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CreativeOms creativeOms, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CreativeType creativeType = creativeOms.creativeType;
            if (creativeType != null) {
                codedOutputByteBufferNano.m17250G(1, creativeType.ordinal());
            }
            String str = creativeOms.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = creativeOms.logoRatio;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17244A(4, creativeOms.logoAreaClickable);
            SkipPosition skipPosition = creativeOms.skipPosition;
            if (skipPosition != null) {
                codedOutputByteBufferNano.m17250G(5, skipPosition.ordinal());
            }
            CreativeType creativeType2 = creativeOms.creativeType;
            if (creativeType2 != null) {
                codedOutputByteBufferNano.m17254K(6, creativeType2, CreativeType.PROTOBUF_ADAPTER);
            }
            SkipPosition skipPosition2 = creativeOms.skipPosition;
            if (skipPosition2 != null) {
                codedOutputByteBufferNano.m17254K(7, skipPosition2, SkipPosition.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(8, creativeOms.processMethod);
        }
    };
    public static JsonAdapter<CreativeOms> JSON_ADAPTER = new ObjectJsonAdapter<CreativeOms>() { // from class: com.p1.mobile.putong.data.CreativeOms.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CreativeOms.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CreativeOms newInstance() {
            return new CreativeOms();
        }

        public boolean parseField(CreativeOms creativeOms, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "logoRatio":
                    creativeOms.logoRatio = jsonParser.getValueAsString();
                    return true;
                case "skipPosition":
                    creativeOms.skipPosition = SkipPosition.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "url":
                    creativeOms.url = jsonParser.getValueAsString();
                    return true;
                case "logoAreaClickable":
                    creativeOms.logoAreaClickable = jsonParser.getValueAsBoolean();
                    return true;
                case "processMethod":
                    creativeOms.processMethod = jsonParser.getValueAsInt();
                    return true;
                case "creativeType":
                    creativeOms.creativeType = CreativeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CreativeOms creativeOms, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "logoRatio":
                case "skipPosition":
                case "url":
                case "logoAreaClickable":
                case "processMethod":
                case "creativeType":
                    return true;
                default:
                    return super.parseFieldCheck(creativeOms, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CreativeOms creativeOms, JsonGenerator jsonGenerator) throws IOException {
            if (creativeOms.creativeType != null) {
                jsonGenerator.writeFieldName("creativeType");
                CreativeType.JSON_ADAPTER.serialize(creativeOms.creativeType, jsonGenerator, true);
            }
            String str = creativeOms.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            String str2 = creativeOms.logoRatio;
            if (str2 != null) {
                jsonGenerator.writeStringField("logoRatio", str2);
            }
            jsonGenerator.writeBooleanField("logoAreaClickable", creativeOms.logoAreaClickable);
            if (creativeOms.skipPosition != null) {
                jsonGenerator.writeFieldName("skipPosition");
                SkipPosition.JSON_ADAPTER.serialize(creativeOms.skipPosition, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("processMethod", creativeOms.processMethod);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreativeOms) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreativeOms) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreativeOms new_() {
        CreativeOms creativeOms = new CreativeOms();
        creativeOms.nullCheck();
        return creativeOms;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CreativeOms mo223809clone() {
        CreativeOms creativeOms = new CreativeOms();
        creativeOms.creativeType = this.creativeType;
        creativeOms.url = this.url;
        creativeOms.logoRatio = this.logoRatio;
        creativeOms.logoAreaClickable = this.logoAreaClickable;
        creativeOms.skipPosition = this.skipPosition;
        creativeOms.processMethod = this.processMethod;
        return creativeOms;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeOms)) {
            return false;
        }
        CreativeOms creativeOms = (CreativeOms) obj;
        return ValueObject.util_equals(this.creativeType, creativeOms.creativeType) && ValueObject.util_equals(this.url, creativeOms.url) && ValueObject.util_equals(this.logoRatio, creativeOms.logoRatio) && this.logoAreaClickable == creativeOms.logoAreaClickable && ValueObject.util_equals(this.skipPosition, creativeOms.skipPosition) && this.processMethod == creativeOms.processMethod;
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
        CreativeType creativeType = this.creativeType;
        int iHashCode = (i2 + (creativeType != null ? creativeType.hashCode() : 0)) * 41;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.logoRatio;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.logoAreaClickable ? 1231 : 1237)) * 41;
        SkipPosition skipPosition = this.skipPosition;
        int iHashCode4 = ((iHashCode3 + (skipPosition != null ? skipPosition.hashCode() : 0)) * 41) + this.processMethod;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.creativeType == null) {
            this.creativeType = (CreativeType) CreativeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.logoRatio == null) {
            this.logoRatio = "";
        }
        if (this.skipPosition == null) {
            this.skipPosition = (SkipPosition) SkipPosition.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
