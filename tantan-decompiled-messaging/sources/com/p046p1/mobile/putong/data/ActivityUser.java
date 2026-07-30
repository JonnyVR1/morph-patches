package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import java.util.HashSet;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class ActivityUser extends ValueObject<ActivityUser> implements Cloneable, Serializable {
    public static final String TYPE = "activityuser";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @ProtobufIndex(index = 2)
    public long score;
    public static ProtobufAdapter<ActivityUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActivityUser>() { // from class: com.p1.mobile.putong.data.ActivityUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActivityUser activityUser) {
            String str = activityUser.action;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, activityUser.score);
            activityUser.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActivityUser parse(nb5 nb5Var) throws IOException {
            ActivityUser activityUser = new ActivityUser();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (activityUser.action != null) {
                        break;
                    }
                    activityUser.action = "";
                    break;
                }
                if (iM158752u == 10) {
                    activityUser.action = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (activityUser.action != null) {
                            break;
                        }
                        activityUser.action = "";
                        return activityUser;
                    }
                    activityUser.score = nb5Var.m158742k();
                }
            }
            return activityUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActivityUser activityUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = activityUser.action;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, activityUser.score);
        }
    };
    public static JsonAdapter<ActivityUser> JSON_ADAPTER = new ObjectJsonAdapter<ActivityUser>() { // from class: com.p1.mobile.putong.data.ActivityUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActivityUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActivityUser newInstance() {
            return new ActivityUser();
        }

        public boolean parseField(ActivityUser activityUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("action")) {
                activityUser.action = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(FirebaseAnalytics.Param.SCORE)) {
                return false;
            }
            activityUser.score = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(ActivityUser activityUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("action") || str.equals(FirebaseAnalytics.Param.SCORE)) {
                return true;
            }
            return super.parseFieldCheck(activityUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActivityUser activityUser, JsonGenerator jsonGenerator) throws IOException {
            String str = activityUser.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, activityUser.score);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActivityUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActivityUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActivityUser new_() {
        ActivityUser activityUser = new ActivityUser();
        activityUser.nullCheck();
        return activityUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActivityUser mo223809clone() {
        ActivityUser activityUser = new ActivityUser();
        activityUser.action = this.action;
        activityUser.score = this.score;
        return activityUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityUser)) {
            return false;
        }
        ActivityUser activityUser = (ActivityUser) obj;
        return ValueObject.util_equals(this.action, activityUser.action) && this.score == activityUser.score;
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.score;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(ActivityUser activityUser) {
        if (!shouldMergeData() || equals(activityUser)) {
            return;
        }
        if (!isFieldParsed("action")) {
            this.action = activityUser.action;
        }
        if (!isFieldParsed(FirebaseAnalytics.Param.SCORE)) {
            this.score = activityUser.score;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public ActivityUser subtract(ActivityUser activityUser) {
        ActivityUser activityUser2 = new ActivityUser();
        if (!ValueObject.util_equals(this.action, activityUser.action)) {
            activityUser2.action = this.action;
        }
        if (activityUser2.equals(new ActivityUser())) {
            return null;
        }
        return activityUser2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
