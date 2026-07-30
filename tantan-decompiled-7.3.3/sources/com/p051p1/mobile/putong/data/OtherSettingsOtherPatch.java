package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class OtherSettingsOtherPatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "othersettingsotherpatch";

    @NonNull
    @ProtobufIndex(index = 1)
    public OtherSettingsOthers other;
    public static ProtobufAdapter<OtherSettingsOtherPatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<OtherSettingsOtherPatch>() { // from class: com.p1.mobile.putong.data.OtherSettingsOtherPatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OtherSettingsOtherPatch otherSettingsOtherPatch) {
            OtherSettingsOthers otherSettingsOthers = otherSettingsOtherPatch.other;
            int iM17285l = otherSettingsOthers != null ? CodedOutputByteBufferNano.m17285l(1, otherSettingsOthers, OtherSettingsOthers.PROTOBUF_ADAPTER) : 0;
            otherSettingsOtherPatch.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OtherSettingsOtherPatch parse(nc5 nc5Var) throws IOException {
            OtherSettingsOtherPatch otherSettingsOtherPatch = new OtherSettingsOtherPatch();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (otherSettingsOtherPatch.other != null) {
                        break;
                    }
                    otherSettingsOtherPatch.other = OtherSettingsOthers.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (otherSettingsOtherPatch.other != null) {
                        break;
                    }
                    otherSettingsOtherPatch.other = OtherSettingsOthers.new_();
                    return otherSettingsOtherPatch;
                }
                otherSettingsOtherPatch.other = (OtherSettingsOthers) nc5Var.m162488l(OtherSettingsOthers.PROTOBUF_ADAPTER);
            }
            return otherSettingsOtherPatch;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OtherSettingsOtherPatch otherSettingsOtherPatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OtherSettingsOthers otherSettingsOthers = otherSettingsOtherPatch.other;
            if (otherSettingsOthers != null) {
                codedOutputByteBufferNano.m17309K(1, otherSettingsOthers, OtherSettingsOthers.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OtherSettingsOtherPatch> JSON_ADAPTER = new ObjectJsonAdapter<OtherSettingsOtherPatch>() { // from class: com.p1.mobile.putong.data.OtherSettingsOtherPatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OtherSettingsOtherPatch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OtherSettingsOtherPatch newInstance() {
            return new OtherSettingsOtherPatch();
        }

        public boolean parseField(OtherSettingsOtherPatch otherSettingsOtherPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("other")) {
                return false;
            }
            otherSettingsOtherPatch.other = OtherSettingsOthers.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OtherSettingsOtherPatch otherSettingsOtherPatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("other")) {
                return true;
            }
            return super.parseFieldCheck(otherSettingsOtherPatch, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OtherSettingsOtherPatch otherSettingsOtherPatch, JsonGenerator jsonGenerator) throws IOException {
            if (otherSettingsOtherPatch.other != null) {
                jsonGenerator.writeFieldName("other");
                OtherSettingsOthers.JSON_ADAPTER.serialize(otherSettingsOtherPatch.other, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OtherSettingsOtherPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OtherSettingsOtherPatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OtherSettingsOtherPatch new_() {
        OtherSettingsOtherPatch otherSettingsOtherPatch = new OtherSettingsOtherPatch();
        otherSettingsOtherPatch.nullCheck();
        return otherSettingsOtherPatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OtherSettingsOtherPatch mo225055clone() {
        OtherSettingsOtherPatch otherSettingsOtherPatch = new OtherSettingsOtherPatch();
        OtherSettingsOthers otherSettingsOthers = this.other;
        if (otherSettingsOthers != null) {
            otherSettingsOtherPatch.other = otherSettingsOthers.mo225055clone();
        }
        return otherSettingsOtherPatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OtherSettingsOtherPatch) {
            return ValueObject.util_equals(obj, ((OtherSettingsOtherPatch) obj).other);
        }
        return false;
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
        OtherSettingsOthers otherSettingsOthers = this.other;
        int iHashCode = i2 + (otherSettingsOthers != null ? otherSettingsOthers.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.other == null) {
            this.other = OtherSettingsOthers.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
