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
public class MigrateAwardDialogData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migrateawarddialogdata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String picUrl;

    @ProtobufIndex(index = 1)
    public boolean showDialog;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public MigrateTextsData texts;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<MigrateAwardDialogData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateAwardDialogData>() { // from class: com.p1.mobile.putong.core.data.MigrateAwardDialogData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MigrateAwardDialogData migrateAwardDialogData) {
            int iB = CodedOutputByteBufferNano.b(1, migrateAwardDialogData.showDialog);
            String str = migrateAwardDialogData.type;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            MigrateTextsData migrateTextsData = migrateAwardDialogData.texts;
            if (migrateTextsData != null) {
                iB += CodedOutputByteBufferNano.l(3, migrateTextsData, MigrateTextsData.PROTOBUF_ADAPTER);
            }
            String str2 = migrateAwardDialogData.picUrl;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) migrateAwardDialogData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MigrateAwardDialogData m14307parse(nb5 nb5Var) throws IOException {
            MigrateAwardDialogData migrateAwardDialogData = new MigrateAwardDialogData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    migrateAwardDialogData.showDialog = nb5Var.g();
                } else if (iU == 18) {
                    migrateAwardDialogData.type = nb5Var.s();
                } else if (iU == 26) {
                    migrateAwardDialogData.texts = (MigrateTextsData) nb5Var.l(MigrateTextsData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
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
                    migrateAwardDialogData.picUrl = nb5Var.s();
                }
            }
            return migrateAwardDialogData;
        }

        public void serialize(MigrateAwardDialogData migrateAwardDialogData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, migrateAwardDialogData.showDialog);
            String str = migrateAwardDialogData.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            MigrateTextsData migrateTextsData = migrateAwardDialogData.texts;
            if (migrateTextsData != null) {
                codedOutputByteBufferNano.K(3, migrateTextsData, MigrateTextsData.PROTOBUF_ADAPTER);
            }
            String str2 = migrateAwardDialogData.picUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<MigrateAwardDialogData> JSON_ADAPTER = new ObjectJsonAdapter<MigrateAwardDialogData>() { // from class: com.p1.mobile.putong.core.data.MigrateAwardDialogData.2
        public Class getDataClass() {
            return MigrateAwardDialogData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MigrateAwardDialogData m14308newInstance() {
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
                    migrateAwardDialogData.texts = (MigrateTextsData) MigrateTextsData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateAwardDialogData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateAwardDialogData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateAwardDialogData new_() {
        MigrateAwardDialogData migrateAwardDialogData = new MigrateAwardDialogData();
        migrateAwardDialogData.nullCheck();
        return migrateAwardDialogData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MigrateAwardDialogData m14306clone() {
        MigrateAwardDialogData migrateAwardDialogData = new MigrateAwardDialogData();
        migrateAwardDialogData.showDialog = this.showDialog;
        migrateAwardDialogData.type = this.type;
        MigrateTextsData migrateTextsData = this.texts;
        if (migrateTextsData != null) {
            migrateAwardDialogData.texts = migrateTextsData.m14322clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
