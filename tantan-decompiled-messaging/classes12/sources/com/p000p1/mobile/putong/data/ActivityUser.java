package com.p000p1.mobile.putong.data;

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
import java.util.HashSet;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActivityUser activityUser) {
            String str = activityUser.action;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, activityUser.score);
            ((MessageNano) activityUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActivityUser m17626parse(nb5 nb5Var) throws IOException {
            ActivityUser activityUser = new ActivityUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (activityUser.action != null) {
                        break;
                    }
                    activityUser.action = "";
                    break;
                }
                if (iU == 10) {
                    activityUser.action = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (activityUser.action != null) {
                            break;
                        }
                        activityUser.action = "";
                        return activityUser;
                    }
                    activityUser.score = nb5Var.k();
                }
            }
            return activityUser;
        }

        public void serialize(ActivityUser activityUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = activityUser.action;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, activityUser.score);
        }
    };
    public static JsonAdapter<ActivityUser> JSON_ADAPTER = new ObjectJsonAdapter<ActivityUser>() { // from class: com.p1.mobile.putong.data.ActivityUser.2
        public Class getDataClass() {
            return ActivityUser.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ActivityUser mo17830newInstance() {
            return new ActivityUser();
        }

        public boolean parseField(ActivityUser activityUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Action.TYPE)) {
                activityUser.action = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("score")) {
                return false;
            }
            activityUser.score = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(ActivityUser activityUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Action.TYPE) || str.equals("score")) {
                return true;
            }
            return super.parseFieldCheck(activityUser, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActivityUser activityUser, JsonGenerator jsonGenerator) throws IOException {
            String str = activityUser.action;
            if (str != null) {
                jsonGenerator.writeStringField(Action.TYPE, str);
            }
            jsonGenerator.writeNumberField("score", activityUser.score);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActivityUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActivityUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActivityUser new_() {
        ActivityUser activityUser = new ActivityUser();
        activityUser.nullCheck();
        return activityUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActivityUser m17625clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.score;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(ActivityUser activityUser) {
        if (!shouldMergeData() || equals(activityUser)) {
            return;
        }
        if (!isFieldParsed(Action.TYPE)) {
            this.action = activityUser.action;
        }
        if (!isFieldParsed("score")) {
            this.score = activityUser.score;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
