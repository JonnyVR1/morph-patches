package com.p000p1.mobile.putong.feed.data;

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
public class ActivitySetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "activitysetting";

    @ProtobufIndex(index = 1)
    public boolean anonymous;
    public static ProtobufAdapter<ActivitySetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActivitySetting>() { // from class: com.p1.mobile.putong.feed.data.ActivitySetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActivitySetting activitySetting) {
            int iB = CodedOutputByteBufferNano.b(1, activitySetting.anonymous);
            ((MessageNano) activitySetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActivitySetting m19404parse(nb5 nb5Var) throws IOException {
            ActivitySetting activitySetting = new ActivitySetting();
            while (nb5Var.u() == 8) {
                activitySetting.anonymous = nb5Var.g();
            }
            return activitySetting;
        }

        public void serialize(ActivitySetting activitySetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, activitySetting.anonymous);
        }
    };
    public static JsonAdapter<ActivitySetting> JSON_ADAPTER = new ObjectJsonAdapter<ActivitySetting>() { // from class: com.p1.mobile.putong.feed.data.ActivitySetting.2
        public Class getDataClass() {
            return ActivitySetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ActivitySetting mo17830newInstance() {
            return new ActivitySetting();
        }

        public boolean parseField(ActivitySetting activitySetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("anonymous")) {
                return false;
            }
            activitySetting.anonymous = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ActivitySetting activitySetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("anonymous")) {
                return true;
            }
            return super.parseFieldCheck(activitySetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActivitySetting activitySetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("anonymous", activitySetting.anonymous);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActivitySetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActivitySetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActivitySetting new_() {
        ActivitySetting activitySetting = new ActivitySetting();
        activitySetting.nullCheck();
        return activitySetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActivitySetting m19403clone() {
        ActivitySetting activitySetting = new ActivitySetting();
        activitySetting.anonymous = this.anonymous;
        return activitySetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ActivitySetting) && this.anonymous == ((ActivitySetting) obj).anonymous;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.anonymous ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
