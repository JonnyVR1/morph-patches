package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.OnVoiceCall;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class UserVoiceLiveCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "uservoicelivecallinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<OnVoiceCall> onVoiceCalls;
    public static ProtobufAdapter<UserVoiceLiveCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserVoiceLiveCallInfo>() { // from class: com.p1.mobile.putong.feed.data.UserVoiceLiveCallInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserVoiceLiveCallInfo userVoiceLiveCallInfo) {
            List<OnVoiceCall> list = userVoiceLiveCallInfo.onVoiceCalls;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, OnVoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            userVoiceLiveCallInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserVoiceLiveCallInfo parse(nc5 nc5Var) throws IOException {
            UserVoiceLiveCallInfo userVoiceLiveCallInfo = new UserVoiceLiveCallInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userVoiceLiveCallInfo.onVoiceCalls != null) {
                        break;
                    }
                    userVoiceLiveCallInfo.onVoiceCalls = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (userVoiceLiveCallInfo.onVoiceCalls != null) {
                        break;
                    }
                    userVoiceLiveCallInfo.onVoiceCalls = new ArrayList();
                    return userVoiceLiveCallInfo;
                }
                userVoiceLiveCallInfo.onVoiceCalls = (List) nc5Var.m162488l(OnVoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return userVoiceLiveCallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserVoiceLiveCallInfo userVoiceLiveCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<OnVoiceCall> list = userVoiceLiveCallInfo.onVoiceCalls;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, OnVoiceCall.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserVoiceLiveCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<UserVoiceLiveCallInfo>() { // from class: com.p1.mobile.putong.feed.data.UserVoiceLiveCallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserVoiceLiveCallInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserVoiceLiveCallInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserVoiceLiveCallInfo userVoiceLiveCallInfo, JsonGenerator jsonGenerator) throws IOException {
            if (userVoiceLiveCallInfo.onVoiceCalls != null) {
                jsonGenerator.writeFieldName("onVoiceCalls");
                JsonAdapter.serializeArray(userVoiceLiveCallInfo.onVoiceCalls, jsonGenerator, OnVoiceCall.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserVoiceLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserVoiceLiveCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UserVoiceLiveCallInfo new_() {
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = new UserVoiceLiveCallInfo();
        userVoiceLiveCallInfo.nullCheck();
        return userVoiceLiveCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserVoiceLiveCallInfo mo225055clone() {
        UserVoiceLiveCallInfo userVoiceLiveCallInfo = new UserVoiceLiveCallInfo();
        List<OnVoiceCall> list = this.onVoiceCalls;
        if (list != null) {
            userVoiceLiveCallInfo.onVoiceCalls = ValueObject.util_map(list, new qcj() { // from class: l.tkk0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OnVoiceCall) obj).mo225055clone();
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
        List<OnVoiceCall> list = this.onVoiceCalls;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.onVoiceCalls == null) {
            this.onVoiceCalls = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
