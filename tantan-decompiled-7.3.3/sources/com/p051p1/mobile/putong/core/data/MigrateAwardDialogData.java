package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MigrateAwardDialogData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migrateawarddialogdata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String picUrl;

    @ProtobufIndex(index = 1)
    public boolean showDialog;

    @NonNull
    @ProtobufIndex(index = 3)
    public MigrateTextsData texts;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MigrateAwardDialogData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateAwardDialogData>() { // from class: com.p1.mobile.putong.core.data.MigrateAwardDialogData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MigrateAwardDialogData migrateAwardDialogData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, migrateAwardDialogData.showDialog);
            String str = migrateAwardDialogData.type;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            MigrateTextsData migrateTextsData = migrateAwardDialogData.texts;
            if (migrateTextsData != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, migrateTextsData, MigrateTextsData.PROTOBUF_ADAPTER);
            }
            String str2 = migrateAwardDialogData.picUrl;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            migrateAwardDialogData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MigrateAwardDialogData parse(nc5 nc5Var) throws IOException {
            MigrateAwardDialogData migrateAwardDialogData = new MigrateAwardDialogData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (migrateAwardDialogData.type == null) {
                        migrateAwardDialogData.type = "";
                    }
                    if (migrateAwardDialogData.texts == null) {
                        migrateAwardDialogData.texts = MigrateTextsData.new_();
                    }
                    if (migrateAwardDialogData.picUrl != null) {
                        break;
                    }
                    migrateAwardDialogData.picUrl = "";
                    break;
                }
                if (iM162497u == 8) {
                    migrateAwardDialogData.showDialog = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    migrateAwardDialogData.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    migrateAwardDialogData.texts = (MigrateTextsData) nc5Var.m162488l(MigrateTextsData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (migrateAwardDialogData.type == null) {
                            migrateAwardDialogData.type = "";
                        }
                        if (migrateAwardDialogData.texts == null) {
                            migrateAwardDialogData.texts = MigrateTextsData.new_();
                        }
                        if (migrateAwardDialogData.picUrl != null) {
                            break;
                        }
                        migrateAwardDialogData.picUrl = "";
                        return migrateAwardDialogData;
                    }
                    migrateAwardDialogData.picUrl = nc5Var.m162495s();
                }
            }
            return migrateAwardDialogData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MigrateAwardDialogData migrateAwardDialogData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, migrateAwardDialogData.showDialog);
            String str = migrateAwardDialogData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            MigrateTextsData migrateTextsData = migrateAwardDialogData.texts;
            if (migrateTextsData != null) {
                codedOutputByteBufferNano.m17309K(3, migrateTextsData, MigrateTextsData.PROTOBUF_ADAPTER);
            }
            String str2 = migrateAwardDialogData.picUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<MigrateAwardDialogData> JSON_ADAPTER = new ObjectJsonAdapter<MigrateAwardDialogData>() { // from class: com.p1.mobile.putong.core.data.MigrateAwardDialogData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MigrateAwardDialogData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MigrateAwardDialogData newInstance() {
            return new MigrateAwardDialogData();
        }

        public boolean parseField(MigrateAwardDialogData migrateAwardDialogData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picUrl":
                    migrateAwardDialogData.picUrl = jsonParser.getValueAsString();
                    return true;
                case "type":
                    migrateAwardDialogData.type = jsonParser.getValueAsString();
                    return true;
                case "texts":
                    migrateAwardDialogData.texts = MigrateTextsData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showDialog":
                    migrateAwardDialogData.showDialog = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MigrateAwardDialogData migrateAwardDialogData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picUrl":
                case "type":
                case "texts":
                case "showDialog":
                    return true;
                default:
                    return super.parseFieldCheck(migrateAwardDialogData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MigrateAwardDialogData migrateAwardDialogData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showDialog", migrateAwardDialogData.showDialog);
            String str = migrateAwardDialogData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (migrateAwardDialogData.texts != null) {
                jsonGenerator.writeFieldName("texts");
                MigrateTextsData.JSON_ADAPTER.serialize(migrateAwardDialogData.texts, jsonGenerator, true);
            }
            String str2 = migrateAwardDialogData.picUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("picUrl", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateAwardDialogData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateAwardDialogData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateAwardDialogData new_() {
        MigrateAwardDialogData migrateAwardDialogData = new MigrateAwardDialogData();
        migrateAwardDialogData.nullCheck();
        return migrateAwardDialogData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MigrateAwardDialogData mo225055clone() {
        MigrateAwardDialogData migrateAwardDialogData = new MigrateAwardDialogData();
        migrateAwardDialogData.showDialog = this.showDialog;
        migrateAwardDialogData.type = this.type;
        MigrateTextsData migrateTextsData = this.texts;
        if (migrateTextsData != null) {
            migrateAwardDialogData.texts = migrateTextsData.mo225055clone();
        }
        migrateAwardDialogData.picUrl = this.picUrl;
        return migrateAwardDialogData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MigrateAwardDialogData)) {
            return false;
        }
        MigrateAwardDialogData migrateAwardDialogData = (MigrateAwardDialogData) obj;
        return this.showDialog == migrateAwardDialogData.showDialog && ValueObject.util_equals(this.type, migrateAwardDialogData.type) && ValueObject.util_equals(this.texts, migrateAwardDialogData.texts) && ValueObject.util_equals(this.picUrl, migrateAwardDialogData.picUrl);
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
        int i2 = ((i * 41) + (this.showDialog ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MigrateTextsData migrateTextsData = this.texts;
        int iHashCode2 = (iHashCode + (migrateTextsData != null ? migrateTextsData.hashCode() : 0)) * 41;
        String str2 = this.picUrl;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.texts == null) {
            this.texts = MigrateTextsData.new_();
        }
        if (this.picUrl == null) {
            this.picUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
