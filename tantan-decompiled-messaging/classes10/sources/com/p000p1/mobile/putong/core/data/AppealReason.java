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
public class AppealReason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealreason";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String detail;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<AppealReason> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealReason>() { // from class: com.p1.mobile.putong.core.data.AppealReason.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AppealReason appealReason) {
            String str = appealReason.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = appealReason.detail;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) appealReason).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AppealReason m11649parse(nb5 nb5Var) throws IOException {
            AppealReason appealReason = new AppealReason();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (appealReason.type == null) {
                        appealReason.type = "";
                    }
                    if (appealReason.detail != null) {
                        break;
                    }
                    appealReason.detail = "";
                    break;
                }
                if (iU == 10) {
                    appealReason.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (appealReason.type == null) {
                            appealReason.type = "";
                        }
                        if (appealReason.detail != null) {
                            break;
                        }
                        appealReason.detail = "";
                        return appealReason;
                    }
                    appealReason.detail = nb5Var.s();
                }
            }
            return appealReason;
        }

        public void serialize(AppealReason appealReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealReason.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = appealReason.detail;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AppealReason> JSON_ADAPTER = new ObjectJsonAdapter<AppealReason>() { // from class: com.p1.mobile.putong.core.data.AppealReason.2
        public Class getDataClass() {
            return AppealReason.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AppealReason m11650newInstance() {
            return new AppealReason();
        }

        public boolean parseField(AppealReason appealReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("detail")) {
                appealReason.detail = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            appealReason.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AppealReason appealReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("detail") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(appealReason, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AppealReason appealReason, JsonGenerator jsonGenerator) throws IOException {
            String str = appealReason.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = appealReason.detail;
            if (str2 != null) {
                jsonGenerator.writeStringField("detail", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealReason new_() {
        AppealReason appealReason = new AppealReason();
        appealReason.nullCheck();
        return appealReason;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppealReason m11648clone() {
        AppealReason appealReason = new AppealReason();
        appealReason.type = this.type;
        appealReason.detail = this.detail;
        return appealReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealReason)) {
            return false;
        }
        AppealReason appealReason = (AppealReason) obj;
        return ValueObject.util_equals(this.type, appealReason.type) && ValueObject.util_equals(this.detail, appealReason.detail);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.detail;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.detail == null) {
            this.detail = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
