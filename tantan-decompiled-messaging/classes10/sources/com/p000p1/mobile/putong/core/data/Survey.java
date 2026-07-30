package com.p000p1.mobile.putong.core.data;

import android.text.TextUtils;
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
public class Survey extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "survey";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f173id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String submittedTips;
    public static ProtobufAdapter<Survey> PROTOBUF_ADAPTER = new MessageNanoAdapter<Survey>() { // from class: com.p1.mobile.putong.core.data.Survey.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Survey survey) {
            String str = survey.f173id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = survey.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = survey.submittedTips;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) survey).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Survey m15838parse(nb5 nb5Var) throws IOException {
            Survey survey = new Survey();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (survey.f173id == null) {
                        survey.f173id = "";
                    }
                    if (survey.status == null) {
                        survey.status = "";
                    }
                    if (survey.submittedTips != null) {
                        break;
                    }
                    survey.submittedTips = "";
                    break;
                }
                if (iU == 10) {
                    survey.f173id = nb5Var.s();
                } else if (iU == 18) {
                    survey.status = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (survey.f173id == null) {
                            survey.f173id = "";
                        }
                        if (survey.status == null) {
                            survey.status = "";
                        }
                        if (survey.submittedTips != null) {
                            break;
                        }
                        survey.submittedTips = "";
                        return survey;
                    }
                    survey.submittedTips = nb5Var.s();
                }
            }
            return survey;
        }

        public void serialize(Survey survey, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = survey.f173id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = survey.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = survey.submittedTips;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<Survey> JSON_ADAPTER = new ObjectJsonAdapter<Survey>() { // from class: com.p1.mobile.putong.core.data.Survey.2
        public Class getDataClass() {
            return Survey.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Survey m15839newInstance() {
            return new Survey();
        }

        public boolean parseField(Survey survey, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    survey.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    survey.f173id = jsonParser.getValueAsString();
                    return false;
                case "submittedTips":
                    survey.submittedTips = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Survey survey, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                    return true;
                case "id":
                    return false;
                case "submittedTips":
                    return true;
                default:
                    return super.parseFieldCheck(survey, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Survey survey, JsonGenerator jsonGenerator) throws IOException {
            String str = survey.f173id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = survey.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
            String str3 = survey.submittedTips;
            if (str3 != null) {
                jsonGenerator.writeStringField("submittedTips", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Survey) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Survey) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Survey new_() {
        Survey survey = new Survey();
        survey.nullCheck();
        return survey;
    }

    public static Survey parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (Survey) JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Survey m15837clone() {
        Survey survey = new Survey();
        survey.f173id = this.f173id;
        survey.status = this.status;
        survey.submittedTips = this.submittedTips;
        return survey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Survey)) {
            return false;
        }
        Survey survey = (Survey) obj;
        return ValueObject.util_equals(this.f173id, survey.f173id) && ValueObject.util_equals(this.status, survey.status) && ValueObject.util_equals(this.submittedTips, survey.submittedTips);
    }

    public String getClassParseName() {
        return "survey";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f173id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.submittedTips;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f173id == null) {
            this.f173id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.submittedTips == null) {
            this.submittedTips = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
