package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.OnVoiceCall;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UserVoiceLiveCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uservoicelivecallinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<OnVoiceCall> onVoiceCalls;
    public static ProtobufAdapter<UserVoiceLiveCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserVoiceLiveCallInfo>() { // from class: com.p1.mobile.putong.feed.data.UserVoiceLiveCallInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserVoiceLiveCallInfo userVoiceLiveCallInfo) {
            List<OnVoiceCall> list = userVoiceLiveCallInfo.onVoiceCalls;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, OnVoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) userVoiceLiveCallInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserVoiceLiveCallInfo m19816parse(nb5 nb5Var) throws IOException {
            UserVoiceLiveCallInfo userVoiceLiveCallInfo = new UserVoiceLiveCallInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userVoiceLiveCallInfo.onVoiceCalls != null) {
                        break;
                    }
                    userVoiceLiveCallInfo.onVoiceCalls = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (userVoiceLiveCallInfo.onVoiceCalls != null) {
                        break;
                    }
                    userVoiceLiveCallInfo.onVoiceCalls = new ArrayList();
                    return userVoiceLiveCallInfo;
                }
                userVoiceLiveCallInfo.onVoiceCalls = (List) nb5Var.l(OnVoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return userVoiceLiveCallInfo;
        }

        public void serialize(UserVoiceLiveCallInfo userVoiceLiveCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OnVoiceCall> list = userVoiceLiveCallInfo.onVoiceCalls;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, OnVoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserVoiceLiveCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserVoiceLiveCallInfo>() { // from class: com.p1.mobile.putong.feed.data.UserVoiceLiveCallInfo.2
        public Class getDataClass() {
            return UserVoiceLiveCallInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public UserVoiceLiveCallInfo mo17830newInstance() {
            return new UserVoiceLiveCallInfo();
        }

        public boolean parseField(UserVoiceLiveCallInfo userVoiceLiveCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("onVoiceCalls")) {
                return false;
            }
            userVoiceLiveCallInfo.onVoiceCalls = JsonAdapter.parseArray(jsonParser, OnVoiceCall.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserVoiceLiveCallInfo userVoiceLiveCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("onVoiceCalls")) {
                return true;
            }
            return super.parseFieldCheck(userVoiceLiveCallInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserVoiceLiveCallInfo userVoiceLiveCallInfo, JsonGenerator jsonGenerator) throws IOException {
            if (userVoiceLiveCallInfo.onVoiceCalls != null) {
                jsonGenerator.writeFieldName("onVoiceCalls");
                JsonAdapter.serializeArray(userVoiceLiveCallInfo.onVoiceCalls, jsonGenerator, OnVoiceCall.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserVoiceLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserVoiceLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserVoiceLiveCallInfo new_() {
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = new UserVoiceLiveCallInfo();
        userVoiceLiveCallInfo.nullCheck();
        return userVoiceLiveCallInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserVoiceLiveCallInfo m19815clone() {
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = new UserVoiceLiveCallInfo();
        List<OnVoiceCall> list = this.onVoiceCalls;
        if (list != null) {
            userVoiceLiveCallInfo.onVoiceCalls = ValueObject.util_map(list, new w9j() { // from class: l.nbk0
                public final Object call(Object obj) {
                    return ((OnVoiceCall) obj).m19689clone();
                }
            });
        }
        return userVoiceLiveCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserVoiceLiveCallInfo) {
            return ValueObject.util_equals(this.onVoiceCalls, ((UserVoiceLiveCallInfo) obj).onVoiceCalls);
        }
        return false;
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
        List<OnVoiceCall> list = this.onVoiceCalls;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.onVoiceCalls == null) {
            this.onVoiceCalls = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
