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
public class FateRadarSearchConditions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradarsearchconditions";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public FilterConditionsCustomItems customItems;

    @NonNull
    @ProtobufIndex(index = 1)
    public String option;
    public static ProtobufAdapter<FateRadarSearchConditions> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadarSearchConditions>() { // from class: com.p1.mobile.putong.core.data.FateRadarSearchConditions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FateRadarSearchConditions fateRadarSearchConditions) {
            String str = fateRadarSearchConditions.option;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            FilterConditionsCustomItems filterConditionsCustomItems = fateRadarSearchConditions.customItems;
            if (filterConditionsCustomItems != null) {
                iO += CodedOutputByteBufferNano.l(2, filterConditionsCustomItems, FilterConditionsCustomItems.PROTOBUF_ADAPTER);
            }
            ((MessageNano) fateRadarSearchConditions).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FateRadarSearchConditions m12749parse(nb5 nb5Var) throws IOException {
            FateRadarSearchConditions fateRadarSearchConditions = new FateRadarSearchConditions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fateRadarSearchConditions.option == null) {
                        fateRadarSearchConditions.option = "";
                    }
                    if (fateRadarSearchConditions.customItems != null) {
                        break;
                    }
                    fateRadarSearchConditions.customItems = FilterConditionsCustomItems.new_();
                    break;
                }
                if (iU == 10) {
                    fateRadarSearchConditions.option = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (fateRadarSearchConditions.option == null) {
                            fateRadarSearchConditions.option = "";
                        }
                        if (fateRadarSearchConditions.customItems != null) {
                            break;
                        }
                        fateRadarSearchConditions.customItems = FilterConditionsCustomItems.new_();
                        return fateRadarSearchConditions;
                    }
                    fateRadarSearchConditions.customItems = (FilterConditionsCustomItems) nb5Var.l(FilterConditionsCustomItems.PROTOBUF_ADAPTER);
                }
            }
            return fateRadarSearchConditions;
        }

        public void serialize(FateRadarSearchConditions fateRadarSearchConditions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fateRadarSearchConditions.option;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            FilterConditionsCustomItems filterConditionsCustomItems = fateRadarSearchConditions.customItems;
            if (filterConditionsCustomItems != null) {
                codedOutputByteBufferNano.K(2, filterConditionsCustomItems, FilterConditionsCustomItems.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FateRadarSearchConditions> JSON_ADAPTER = new ObjectJsonAdapter<FateRadarSearchConditions>() { // from class: com.p1.mobile.putong.core.data.FateRadarSearchConditions.2
        public Class getDataClass() {
            return FateRadarSearchConditions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FateRadarSearchConditions m12750newInstance() {
            return new FateRadarSearchConditions();
        }

        public boolean parseField(FateRadarSearchConditions fateRadarSearchConditions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("customItems")) {
                fateRadarSearchConditions.customItems = (FilterConditionsCustomItems) FilterConditionsCustomItems.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Option.TYPE)) {
                return false;
            }
            fateRadarSearchConditions.option = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FateRadarSearchConditions fateRadarSearchConditions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("customItems") || str.equals(Option.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(fateRadarSearchConditions, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(FateRadarSearchConditions fateRadarSearchConditions, JsonGenerator jsonGenerator) throws IOException {
            String str = fateRadarSearchConditions.option;
            if (str != null) {
                jsonGenerator.writeStringField(Option.TYPE, str);
            }
            if (fateRadarSearchConditions.customItems != null) {
                jsonGenerator.writeFieldName("customItems");
                FilterConditionsCustomItems.JSON_ADAPTER.serialize(fateRadarSearchConditions.customItems, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadarSearchConditions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadarSearchConditions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadarSearchConditions new_() {
        FateRadarSearchConditions fateRadarSearchConditions = new FateRadarSearchConditions();
        fateRadarSearchConditions.nullCheck();
        return fateRadarSearchConditions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FateRadarSearchConditions m12748clone() {
        FateRadarSearchConditions fateRadarSearchConditions = new FateRadarSearchConditions();
        fateRadarSearchConditions.option = this.option;
        FilterConditionsCustomItems filterConditionsCustomItems = this.customItems;
        if (filterConditionsCustomItems != null) {
            fateRadarSearchConditions.customItems = filterConditionsCustomItems.m12796clone();
        }
        return fateRadarSearchConditions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FateRadarSearchConditions)) {
            return false;
        }
        FateRadarSearchConditions fateRadarSearchConditions = (FateRadarSearchConditions) obj;
        return ValueObject.util_equals(this.option, fateRadarSearchConditions.option) && ValueObject.util_equals(this.customItems, fateRadarSearchConditions.customItems);
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
        String str = this.option;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FilterConditionsCustomItems filterConditionsCustomItems = this.customItems;
        int iHashCode2 = iHashCode + (filterConditionsCustomItems != null ? filterConditionsCustomItems.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.option == null) {
            this.option = "";
        }
        if (this.customItems == null) {
            this.customItems = FilterConditionsCustomItems.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
