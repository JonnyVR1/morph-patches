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
public class MatePlanSingleSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mateplansinglesettings";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f100id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean single;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long type;
    public static ProtobufAdapter<MatePlanSingleSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatePlanSingleSettings>() { // from class: com.p1.mobile.putong.core.data.MatePlanSingleSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatePlanSingleSettings matePlanSingleSettings) {
            String str = matePlanSingleSettings.f100id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, matePlanSingleSettings.type) + CodedOutputByteBufferNano.b(3, matePlanSingleSettings.single);
            ((MessageNano) matePlanSingleSettings).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatePlanSingleSettings m14089parse(nb5 nb5Var) throws IOException {
            MatePlanSingleSettings matePlanSingleSettings = new MatePlanSingleSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (matePlanSingleSettings.f100id != null) {
                        break;
                    }
                    matePlanSingleSettings.f100id = "";
                    break;
                }
                if (iU == 10) {
                    matePlanSingleSettings.f100id = nb5Var.s();
                } else if (iU == 16) {
                    matePlanSingleSettings.type = nb5Var.k();
                } else {
                    if (iU != 24) {
                        if (matePlanSingleSettings.f100id != null) {
                            break;
                        }
                        matePlanSingleSettings.f100id = "";
                        return matePlanSingleSettings;
                    }
                    matePlanSingleSettings.single = nb5Var.g();
                }
            }
            return matePlanSingleSettings;
        }

        public void serialize(MatePlanSingleSettings matePlanSingleSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matePlanSingleSettings.f100id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, matePlanSingleSettings.type);
            codedOutputByteBufferNano.A(3, matePlanSingleSettings.single);
        }
    };
    public static JsonAdapter<MatePlanSingleSettings> JSON_ADAPTER = new ObjectJsonAdapter<MatePlanSingleSettings>() { // from class: com.p1.mobile.putong.core.data.MatePlanSingleSettings.2
        public Class getDataClass() {
            return MatePlanSingleSettings.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatePlanSingleSettings m14090newInstance() {
            return new MatePlanSingleSettings();
        }

        public boolean parseField(MatePlanSingleSettings matePlanSingleSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "single":
                    matePlanSingleSettings.single = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    matePlanSingleSettings.f100id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    matePlanSingleSettings.type = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatePlanSingleSettings matePlanSingleSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "single":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(matePlanSingleSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MatePlanSingleSettings matePlanSingleSettings, JsonGenerator jsonGenerator) throws IOException {
            String str = matePlanSingleSettings.f100id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("type", matePlanSingleSettings.type);
            jsonGenerator.writeBooleanField("single", matePlanSingleSettings.single);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatePlanSingleSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatePlanSingleSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatePlanSingleSettings new_() {
        MatePlanSingleSettings matePlanSingleSettings = new MatePlanSingleSettings();
        matePlanSingleSettings.nullCheck();
        return matePlanSingleSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatePlanSingleSettings m14088clone() {
        MatePlanSingleSettings matePlanSingleSettings = new MatePlanSingleSettings();
        matePlanSingleSettings.f100id = this.f100id;
        matePlanSingleSettings.type = this.type;
        matePlanSingleSettings.single = this.single;
        return matePlanSingleSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatePlanSingleSettings)) {
            return false;
        }
        MatePlanSingleSettings matePlanSingleSettings = (MatePlanSingleSettings) obj;
        return ValueObject.util_equals(this.f100id, matePlanSingleSettings.f100id) && this.type == matePlanSingleSettings.type && this.single == matePlanSingleSettings.single;
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
        String str = this.f100id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.type;
        int i3 = ((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + (this.single ? 1231 : 1237);
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f100id == null) {
            this.f100id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
