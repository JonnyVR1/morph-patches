package com.p051p1.mobile.putong.core.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class Survey extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "survey";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21253id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String submittedTips;
    public static ProtobufAdapter<Survey> PROTOBUF_ADAPTER = new MessageNanoAdapter<Survey>() { // from class: com.p1.mobile.putong.core.data.Survey.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Survey survey) {
            String str = survey.f21253id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = survey.status;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = survey.submittedTips;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            survey.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Survey parse(nc5 nc5Var) throws IOException {
            Survey survey = new Survey();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (survey.f21253id == null) {
                        survey.f21253id = "";
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
                if (iM162497u == 10) {
                    survey.f21253id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    survey.status = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (survey.f21253id == null) {
                            survey.f21253id = "";
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
                    survey.submittedTips = nc5Var.m162495s();
                }
            }
            return survey;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Survey survey, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = survey.f21253id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = survey.status;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = survey.submittedTips;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<Survey> JSON_ADAPTER = new ObjectJsonAdapter<Survey>() { // from class: com.p1.mobile.putong.core.data.Survey.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Survey.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Survey newInstance() {
            return new Survey();
        }

        public boolean parseField(Survey survey, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    survey.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    survey.f21253id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Survey survey, JsonGenerator jsonGenerator) throws IOException {
            String str = survey.f21253id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = survey.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            String str3 = survey.submittedTips;
            if (str3 != null) {
                jsonGenerator.writeStringField("submittedTips", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Survey) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            return JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Survey mo225055clone() {
        Survey survey = new Survey();
        survey.f21253id = this.f21253id;
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
        return ValueObject.util_equals(this.f21253id, survey.f21253id) && ValueObject.util_equals(this.status, survey.status) && ValueObject.util_equals(this.submittedTips, survey.submittedTips);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "survey";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21253id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.submittedTips;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21253id == null) {
            this.f21253id = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.submittedTips == null) {
            this.submittedTips = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
