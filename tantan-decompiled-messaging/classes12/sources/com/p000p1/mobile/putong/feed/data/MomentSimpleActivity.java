package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentSimpleActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsimpleactivity";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f696id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<MomentSimpleActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentSimpleActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentSimpleActivity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentSimpleActivity momentSimpleActivity) {
            String str = momentSimpleActivity.f696id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentSimpleActivity.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = momentSimpleActivity.url;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) momentSimpleActivity).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentSimpleActivity m19651parse(nb5 nb5Var) throws IOException {
            MomentSimpleActivity momentSimpleActivity = new MomentSimpleActivity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentSimpleActivity.f696id == null) {
                        momentSimpleActivity.f696id = "";
                    }
                    if (momentSimpleActivity.name == null) {
                        momentSimpleActivity.name = "";
                    }
                    if (momentSimpleActivity.url != null) {
                        break;
                    }
                    momentSimpleActivity.url = "";
                    break;
                }
                if (iU == 10) {
                    momentSimpleActivity.f696id = nb5Var.s();
                } else if (iU == 18) {
                    momentSimpleActivity.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (momentSimpleActivity.f696id == null) {
                            momentSimpleActivity.f696id = "";
                        }
                        if (momentSimpleActivity.name == null) {
                            momentSimpleActivity.name = "";
                        }
                        if (momentSimpleActivity.url != null) {
                            break;
                        }
                        momentSimpleActivity.url = "";
                        return momentSimpleActivity;
                    }
                    momentSimpleActivity.url = nb5Var.s();
                }
            }
            return momentSimpleActivity;
        }

        public void serialize(MomentSimpleActivity momentSimpleActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentSimpleActivity.f696id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentSimpleActivity.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = momentSimpleActivity.url;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<MomentSimpleActivity> JSON_ADAPTER = new ObjectJsonAdapter<MomentSimpleActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentSimpleActivity.2
        public Class getDataClass() {
            return MomentSimpleActivity.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentSimpleActivity mo17830newInstance() {
            return new MomentSimpleActivity();
        }

        public boolean parseField(MomentSimpleActivity momentSimpleActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    momentSimpleActivity.f696id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    momentSimpleActivity.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    momentSimpleActivity.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentSimpleActivity momentSimpleActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "url":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(momentSimpleActivity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentSimpleActivity momentSimpleActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = momentSimpleActivity.f696id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentSimpleActivity.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = momentSimpleActivity.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentSimpleActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentSimpleActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentSimpleActivity new_() {
        MomentSimpleActivity momentSimpleActivity = new MomentSimpleActivity();
        momentSimpleActivity.nullCheck();
        return momentSimpleActivity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentSimpleActivity m19650clone() {
        MomentSimpleActivity momentSimpleActivity = new MomentSimpleActivity();
        momentSimpleActivity.f696id = this.f696id;
        momentSimpleActivity.name = this.name;
        momentSimpleActivity.url = this.url;
        return momentSimpleActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentSimpleActivity)) {
            return false;
        }
        MomentSimpleActivity momentSimpleActivity = (MomentSimpleActivity) obj;
        return ValueObject.util_equals(this.f696id, momentSimpleActivity.f696id) && ValueObject.util_equals(this.name, momentSimpleActivity.name) && ValueObject.util_equals(this.url, momentSimpleActivity.url);
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
        String str = this.f696id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f696id == null) {
            this.f696id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
