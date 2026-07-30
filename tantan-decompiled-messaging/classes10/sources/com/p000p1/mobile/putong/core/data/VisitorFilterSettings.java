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
public class VisitorFilterSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorfiltersettings";

    @ProtobufIndex(index = 1)
    public int distance;

    @NonNull
    @ProtobufIndex(index = 4)
    public VisitorFilterType filter;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int maxAge;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int minAge;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public VisitorSortType sort;
    public static ProtobufAdapter<VisitorFilterSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorFilterSettings>() { // from class: com.p1.mobile.putong.core.data.VisitorFilterSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VisitorFilterSettings visitorFilterSettings) {
            int iH = CodedOutputByteBufferNano.h(1, visitorFilterSettings.distance) + CodedOutputByteBufferNano.h(2, visitorFilterSettings.minAge) + CodedOutputByteBufferNano.h(3, visitorFilterSettings.maxAge);
            VisitorFilterType visitorFilterType = visitorFilterSettings.filter;
            if (visitorFilterType != null) {
                iH += CodedOutputByteBufferNano.l(4, visitorFilterType, VisitorFilterType.PROTOBUF_ADAPTER);
            }
            VisitorSortType visitorSortType = visitorFilterSettings.sort;
            if (visitorSortType != null) {
                iH += CodedOutputByteBufferNano.l(5, visitorSortType, VisitorSortType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) visitorFilterSettings).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VisitorFilterSettings m16240parse(nb5 nb5Var) throws IOException {
            VisitorFilterSettings visitorFilterSettings = new VisitorFilterSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (visitorFilterSettings.filter == null) {
                        visitorFilterSettings.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.defaultEnum();
                    }
                    if (visitorFilterSettings.sort != null) {
                        break;
                    }
                    visitorFilterSettings.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    visitorFilterSettings.distance = nb5Var.j();
                } else if (iU == 16) {
                    visitorFilterSettings.minAge = nb5Var.j();
                } else if (iU == 24) {
                    visitorFilterSettings.maxAge = nb5Var.j();
                } else if (iU == 34) {
                    visitorFilterSettings.filter = (VisitorFilterType) nb5Var.l(VisitorFilterType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (visitorFilterSettings.filter == null) {
                            visitorFilterSettings.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.defaultEnum();
                        }
                        if (visitorFilterSettings.sort != null) {
                            break;
                        }
                        visitorFilterSettings.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.defaultEnum();
                        return visitorFilterSettings;
                    }
                    visitorFilterSettings.sort = (VisitorSortType) nb5Var.l(VisitorSortType.PROTOBUF_ADAPTER);
                }
            }
            return visitorFilterSettings;
        }

        public void serialize(VisitorFilterSettings visitorFilterSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, visitorFilterSettings.distance);
            codedOutputByteBufferNano.G(2, visitorFilterSettings.minAge);
            codedOutputByteBufferNano.G(3, visitorFilterSettings.maxAge);
            VisitorFilterType visitorFilterType = visitorFilterSettings.filter;
            if (visitorFilterType != null) {
                codedOutputByteBufferNano.K(4, visitorFilterType, VisitorFilterType.PROTOBUF_ADAPTER);
            }
            VisitorSortType visitorSortType = visitorFilterSettings.sort;
            if (visitorSortType != null) {
                codedOutputByteBufferNano.K(5, visitorSortType, VisitorSortType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VisitorFilterSettings> JSON_ADAPTER = new ObjectJsonAdapter<VisitorFilterSettings>() { // from class: com.p1.mobile.putong.core.data.VisitorFilterSettings.2
        public Class getDataClass() {
            return VisitorFilterSettings.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VisitorFilterSettings m16241newInstance() {
            return new VisitorFilterSettings();
        }

        public boolean parseField(VisitorFilterSettings visitorFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "filter":
                    visitorFilterSettings.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "maxAge":
                    visitorFilterSettings.maxAge = jsonParser.getValueAsInt();
                    return true;
                case "minAge":
                    visitorFilterSettings.minAge = jsonParser.getValueAsInt();
                    return true;
                case "sort":
                    visitorFilterSettings.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "distance":
                    visitorFilterSettings.distance = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorFilterSettings visitorFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "filter":
                case "maxAge":
                case "minAge":
                case "sort":
                case "distance":
                    return true;
                default:
                    return super.parseFieldCheck(visitorFilterSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(VisitorFilterSettings visitorFilterSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("distance", visitorFilterSettings.distance);
            jsonGenerator.writeNumberField("minAge", visitorFilterSettings.minAge);
            jsonGenerator.writeNumberField("maxAge", visitorFilterSettings.maxAge);
            if (visitorFilterSettings.filter != null) {
                jsonGenerator.writeFieldName("filter");
                VisitorFilterType.JSON_ADAPTER.serialize(visitorFilterSettings.filter, jsonGenerator, true);
            }
            if (visitorFilterSettings.sort != null) {
                jsonGenerator.writeFieldName("sort");
                VisitorSortType.JSON_ADAPTER.serialize(visitorFilterSettings.sort, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorFilterSettings new_() {
        VisitorFilterSettings visitorFilterSettings = new VisitorFilterSettings();
        visitorFilterSettings.nullCheck();
        return visitorFilterSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VisitorFilterSettings m16239clone() {
        VisitorFilterSettings visitorFilterSettings = new VisitorFilterSettings();
        visitorFilterSettings.distance = this.distance;
        visitorFilterSettings.minAge = this.minAge;
        visitorFilterSettings.maxAge = this.maxAge;
        visitorFilterSettings.filter = this.filter;
        visitorFilterSettings.sort = this.sort;
        return visitorFilterSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorFilterSettings)) {
            return false;
        }
        VisitorFilterSettings visitorFilterSettings = (VisitorFilterSettings) obj;
        return this.distance == visitorFilterSettings.distance && this.minAge == visitorFilterSettings.minAge && this.maxAge == visitorFilterSettings.maxAge && ValueObject.util_equals(this.filter, visitorFilterSettings.filter) && ValueObject.util_equals(this.sort, visitorFilterSettings.sort);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((i * 41) + this.distance) * 41) + this.minAge) * 41) + this.maxAge) * 41;
        VisitorFilterType visitorFilterType = this.filter;
        int iHashCode = (i2 + (visitorFilterType != null ? visitorFilterType.hashCode() : 0)) * 41;
        VisitorSortType visitorSortType = this.sort;
        int iHashCode2 = iHashCode + (visitorSortType != null ? visitorSortType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.filter == null) {
            this.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.defaultEnum();
        }
        if (this.sort == null) {
            this.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
