package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class MomentSimpleActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentsimpleactivity";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39235id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<MomentSimpleActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentSimpleActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentSimpleActivity.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentSimpleActivity momentSimpleActivity) {
            String str = momentSimpleActivity.f39235id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = momentSimpleActivity.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = momentSimpleActivity.url;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            momentSimpleActivity.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentSimpleActivity parse(nb5 nb5Var) throws IOException {
            MomentSimpleActivity momentSimpleActivity = new MomentSimpleActivity();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentSimpleActivity.f39235id == null) {
                        momentSimpleActivity.f39235id = "";
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
                if (iM158752u == 10) {
                    momentSimpleActivity.f39235id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    momentSimpleActivity.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (momentSimpleActivity.f39235id == null) {
                            momentSimpleActivity.f39235id = "";
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
                    momentSimpleActivity.url = nb5Var.m158750s();
                }
            }
            return momentSimpleActivity;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentSimpleActivity momentSimpleActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentSimpleActivity.f39235id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = momentSimpleActivity.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = momentSimpleActivity.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<MomentSimpleActivity> JSON_ADAPTER = new ObjectJsonAdapter<MomentSimpleActivity>() { // from class: com.p1.mobile.putong.feed.data.MomentSimpleActivity.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentSimpleActivity.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentSimpleActivity newInstance() {
            return new MomentSimpleActivity();
        }

        public boolean parseField(MomentSimpleActivity momentSimpleActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    momentSimpleActivity.f39235id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentSimpleActivity momentSimpleActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = momentSimpleActivity.f39235id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = momentSimpleActivity.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = momentSimpleActivity.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentSimpleActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentSimpleActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentSimpleActivity new_() {
        MomentSimpleActivity momentSimpleActivity = new MomentSimpleActivity();
        momentSimpleActivity.nullCheck();
        return momentSimpleActivity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentSimpleActivity mo223809clone() {
        MomentSimpleActivity momentSimpleActivity = new MomentSimpleActivity();
        momentSimpleActivity.f39235id = this.f39235id;
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
        return ValueObject.util_equals(this.f39235id, momentSimpleActivity.f39235id) && ValueObject.util_equals(this.name, momentSimpleActivity.name) && ValueObject.util_equals(this.url, momentSimpleActivity.url);
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
        int i2 = i * 41;
        String str = this.f39235id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39235id == null) {
            this.f39235id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
