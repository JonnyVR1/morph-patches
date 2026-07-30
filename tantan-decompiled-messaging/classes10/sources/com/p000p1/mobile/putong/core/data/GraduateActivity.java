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
public class GraduateActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "graduateactivity";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String endTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String entranceUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String startTime;
    public static ProtobufAdapter<GraduateActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<GraduateActivity>() { // from class: com.p1.mobile.putong.core.data.GraduateActivity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GraduateActivity graduateActivity) {
            String str = graduateActivity.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = graduateActivity.startTime;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = graduateActivity.endTime;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = graduateActivity.entranceUrl;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) graduateActivity).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GraduateActivity m13001parse(nb5 nb5Var) throws IOException {
            GraduateActivity graduateActivity = new GraduateActivity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (graduateActivity.name == null) {
                        graduateActivity.name = "";
                    }
                    if (graduateActivity.startTime == null) {
                        graduateActivity.startTime = "";
                    }
                    if (graduateActivity.endTime == null) {
                        graduateActivity.endTime = "";
                    }
                    if (graduateActivity.entranceUrl != null) {
                        break;
                    }
                    graduateActivity.entranceUrl = "";
                    break;
                }
                if (iU == 10) {
                    graduateActivity.name = nb5Var.s();
                } else if (iU == 18) {
                    graduateActivity.startTime = nb5Var.s();
                } else if (iU == 26) {
                    graduateActivity.endTime = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (graduateActivity.name == null) {
                            graduateActivity.name = "";
                        }
                        if (graduateActivity.startTime == null) {
                            graduateActivity.startTime = "";
                        }
                        if (graduateActivity.endTime == null) {
                            graduateActivity.endTime = "";
                        }
                        if (graduateActivity.entranceUrl != null) {
                            break;
                        }
                        graduateActivity.entranceUrl = "";
                        return graduateActivity;
                    }
                    graduateActivity.entranceUrl = nb5Var.s();
                }
            }
            return graduateActivity;
        }

        public void serialize(GraduateActivity graduateActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = graduateActivity.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = graduateActivity.startTime;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = graduateActivity.endTime;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = graduateActivity.entranceUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<GraduateActivity> JSON_ADAPTER = new ObjectJsonAdapter<GraduateActivity>() { // from class: com.p1.mobile.putong.core.data.GraduateActivity.2
        public Class getDataClass() {
            return GraduateActivity.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GraduateActivity m13002newInstance() {
            return new GraduateActivity();
        }

        public boolean parseField(GraduateActivity graduateActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    graduateActivity.startTime = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    graduateActivity.endTime = jsonParser.getValueAsString();
                    return true;
                case "entranceUrl":
                    graduateActivity.entranceUrl = jsonParser.getValueAsString();
                    return true;
                case "name":
                    graduateActivity.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GraduateActivity graduateActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "entranceUrl":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(graduateActivity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GraduateActivity graduateActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = graduateActivity.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = graduateActivity.startTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("startTime", str2);
            }
            String str3 = graduateActivity.endTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("endTime", str3);
            }
            String str4 = graduateActivity.entranceUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("entranceUrl", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GraduateActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GraduateActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GraduateActivity new_() {
        GraduateActivity graduateActivity = new GraduateActivity();
        graduateActivity.nullCheck();
        return graduateActivity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GraduateActivity m13000clone() {
        GraduateActivity graduateActivity = new GraduateActivity();
        graduateActivity.name = this.name;
        graduateActivity.startTime = this.startTime;
        graduateActivity.endTime = this.endTime;
        graduateActivity.entranceUrl = this.entranceUrl;
        return graduateActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GraduateActivity)) {
            return false;
        }
        GraduateActivity graduateActivity = (GraduateActivity) obj;
        return ValueObject.util_equals(this.name, graduateActivity.name) && ValueObject.util_equals(this.startTime, graduateActivity.startTime) && ValueObject.util_equals(this.endTime, graduateActivity.endTime) && ValueObject.util_equals(this.entranceUrl, graduateActivity.entranceUrl);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.startTime;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.endTime;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.entranceUrl;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.entranceUrl == null) {
            this.entranceUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
