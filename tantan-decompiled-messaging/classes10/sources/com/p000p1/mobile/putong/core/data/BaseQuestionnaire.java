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
public class BaseQuestionnaire extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "basequestionnaire";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<BaseQuestionnaire> PROTOBUF_ADAPTER = new MessageNanoAdapter<BaseQuestionnaire>() { // from class: com.p1.mobile.putong.core.data.BaseQuestionnaire.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BaseQuestionnaire baseQuestionnaire) {
            String str = baseQuestionnaire.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = baseQuestionnaire.description;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) baseQuestionnaire).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BaseQuestionnaire m11747parse(nb5 nb5Var) throws IOException {
            BaseQuestionnaire baseQuestionnaire = new BaseQuestionnaire();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (baseQuestionnaire.title == null) {
                        baseQuestionnaire.title = "";
                    }
                    if (baseQuestionnaire.description != null) {
                        break;
                    }
                    baseQuestionnaire.description = "";
                    break;
                }
                if (iU == 10) {
                    baseQuestionnaire.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (baseQuestionnaire.title == null) {
                            baseQuestionnaire.title = "";
                        }
                        if (baseQuestionnaire.description != null) {
                            break;
                        }
                        baseQuestionnaire.description = "";
                        return baseQuestionnaire;
                    }
                    baseQuestionnaire.description = nb5Var.s();
                }
            }
            return baseQuestionnaire;
        }

        public void serialize(BaseQuestionnaire baseQuestionnaire, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = baseQuestionnaire.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = baseQuestionnaire.description;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<BaseQuestionnaire> JSON_ADAPTER = new ObjectJsonAdapter<BaseQuestionnaire>() { // from class: com.p1.mobile.putong.core.data.BaseQuestionnaire.2
        public Class getDataClass() {
            return BaseQuestionnaire.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BaseQuestionnaire m11748newInstance() {
            return new BaseQuestionnaire();
        }

        public boolean parseField(BaseQuestionnaire baseQuestionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("description")) {
                baseQuestionnaire.description = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return false;
            }
            baseQuestionnaire.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BaseQuestionnaire baseQuestionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("description") || str.equals(KnowMyselfShareParams.PARAMS_TITLE)) {
                return true;
            }
            return super.parseFieldCheck(baseQuestionnaire, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BaseQuestionnaire baseQuestionnaire, JsonGenerator jsonGenerator) throws IOException {
            String str = baseQuestionnaire.title;
            if (str != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str);
            }
            String str2 = baseQuestionnaire.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BaseQuestionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BaseQuestionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BaseQuestionnaire new_() {
        BaseQuestionnaire baseQuestionnaire = new BaseQuestionnaire();
        baseQuestionnaire.nullCheck();
        return baseQuestionnaire;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BaseQuestionnaire m11746clone() {
        BaseQuestionnaire baseQuestionnaire = new BaseQuestionnaire();
        baseQuestionnaire.title = this.title;
        baseQuestionnaire.description = this.description;
        return baseQuestionnaire;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseQuestionnaire)) {
            return false;
        }
        BaseQuestionnaire baseQuestionnaire = (BaseQuestionnaire) obj;
        return ValueObject.util_equals(this.title, baseQuestionnaire.title) && ValueObject.util_equals(this.description, baseQuestionnaire.description);
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
        String str2 = this.description;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
