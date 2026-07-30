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
public class MigrateTextsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "migratetextsdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String content;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String learnMore;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<MigrateTextsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<MigrateTextsData>() { // from class: com.p1.mobile.putong.core.data.MigrateTextsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MigrateTextsData migrateTextsData) {
            String str = migrateTextsData.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = migrateTextsData.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = migrateTextsData.learnMore;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) migrateTextsData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MigrateTextsData m14323parse(nb5 nb5Var) throws IOException {
            MigrateTextsData migrateTextsData = new MigrateTextsData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (migrateTextsData.title == null) {
                        migrateTextsData.title = "";
                    }
                    if (migrateTextsData.content == null) {
                        migrateTextsData.content = "";
                    }
                    if (migrateTextsData.learnMore != null) {
                        break;
                    }
                    migrateTextsData.learnMore = "";
                    break;
                }
                if (iU == 10) {
                    migrateTextsData.title = nb5Var.s();
                } else if (iU == 18) {
                    migrateTextsData.content = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (migrateTextsData.title == null) {
                            migrateTextsData.title = "";
                        }
                        if (migrateTextsData.content == null) {
                            migrateTextsData.content = "";
                        }
                        if (migrateTextsData.learnMore != null) {
                            break;
                        }
                        migrateTextsData.learnMore = "";
                        return migrateTextsData;
                    }
                    migrateTextsData.learnMore = nb5Var.s();
                }
            }
            return migrateTextsData;
        }

        public void serialize(MigrateTextsData migrateTextsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = migrateTextsData.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = migrateTextsData.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = migrateTextsData.learnMore;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<MigrateTextsData> JSON_ADAPTER = new ObjectJsonAdapter<MigrateTextsData>() { // from class: com.p1.mobile.putong.core.data.MigrateTextsData.2
        public Class getDataClass() {
            return MigrateTextsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MigrateTextsData m14324newInstance() {
            return new MigrateTextsData();
        }

        public boolean parseField(MigrateTextsData migrateTextsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "title":
                    migrateTextsData.title = jsonParser.getValueAsString();
                    return true;
                case "content":
                    migrateTextsData.content = jsonParser.getValueAsString();
                    return true;
                case "learnMore":
                    migrateTextsData.learnMore = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MigrateTextsData migrateTextsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "title":
                case "content":
                case "learnMore":
                    return true;
                default:
                    return super.parseFieldCheck(migrateTextsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MigrateTextsData migrateTextsData, JsonGenerator jsonGenerator) throws IOException {
            String str = migrateTextsData.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = migrateTextsData.content;
            if (str2 != null) {
                jsonGenerator.writeStringField(Content.TYPE, str2);
            }
            String str3 = migrateTextsData.learnMore;
            if (str3 != null) {
                jsonGenerator.writeStringField("learnMore", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MigrateTextsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MigrateTextsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MigrateTextsData new_() {
        MigrateTextsData migrateTextsData = new MigrateTextsData();
        migrateTextsData.nullCheck();
        return migrateTextsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MigrateTextsData m14322clone() {
        MigrateTextsData migrateTextsData = new MigrateTextsData();
        migrateTextsData.title = this.title;
        migrateTextsData.content = this.content;
        migrateTextsData.learnMore = this.learnMore;
        return migrateTextsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MigrateTextsData)) {
            return false;
        }
        MigrateTextsData migrateTextsData = (MigrateTextsData) obj;
        return ValueObject.util_equals(this.title, migrateTextsData.title) && ValueObject.util_equals(this.content, migrateTextsData.content) && ValueObject.util_equals(this.learnMore, migrateTextsData.learnMore);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.learnMore;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.learnMore == null) {
            this.learnMore = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
