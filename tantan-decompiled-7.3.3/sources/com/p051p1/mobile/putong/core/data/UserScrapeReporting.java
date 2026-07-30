package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.UserScrapeReporting;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class UserScrapeReporting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userscrapereporting";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> keywords;
    public static ProtobufAdapter<UserScrapeReporting> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserScrapeReporting>() { // from class: com.p1.mobile.putong.core.data.UserScrapeReporting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserScrapeReporting userScrapeReporting) {
            List<String> list = userScrapeReporting.keywords;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            userScrapeReporting.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserScrapeReporting parse(nc5 nc5Var) throws IOException {
            UserScrapeReporting userScrapeReporting = new UserScrapeReporting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userScrapeReporting.keywords != null) {
                        break;
                    }
                    userScrapeReporting.keywords = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (userScrapeReporting.keywords != null) {
                        break;
                    }
                    userScrapeReporting.keywords = new ArrayList();
                    return userScrapeReporting;
                }
                userScrapeReporting.keywords = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return userScrapeReporting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserScrapeReporting userScrapeReporting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = userScrapeReporting.keywords;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserScrapeReporting> JSON_ADAPTER = new ObjectJsonAdapter<UserScrapeReporting>() { // from class: com.p1.mobile.putong.core.data.UserScrapeReporting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserScrapeReporting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserScrapeReporting newInstance() {
            return new UserScrapeReporting();
        }

        public boolean parseField(UserScrapeReporting userScrapeReporting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("keywords")) {
                return false;
            }
            userScrapeReporting.keywords = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(UserScrapeReporting userScrapeReporting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("keywords")) {
                return true;
            }
            return super.parseFieldCheck(userScrapeReporting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserScrapeReporting userScrapeReporting, JsonGenerator jsonGenerator) throws IOException {
            if (userScrapeReporting.keywords != null) {
                jsonGenerator.writeFieldName("keywords");
                JsonAdapter.serializeArray(userScrapeReporting.keywords, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserScrapeReporting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserScrapeReporting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36896a(String str) {
        return str;
    }

    public static UserScrapeReporting new_() {
        UserScrapeReporting userScrapeReporting = new UserScrapeReporting();
        userScrapeReporting.nullCheck();
        return userScrapeReporting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserScrapeReporting mo225055clone() {
        UserScrapeReporting userScrapeReporting = new UserScrapeReporting();
        List<String> list = this.keywords;
        if (list != null) {
            userScrapeReporting.keywords = ValueObject.util_map(list, new qcj() { // from class: l.gik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserScrapeReporting.m36896a((String) obj);
                }
            });
        }
        return userScrapeReporting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UserScrapeReporting) {
            return ValueObject.util_equals(this.keywords, ((UserScrapeReporting) obj).keywords);
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
        List<String> list = this.keywords;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.keywords == null) {
            this.keywords = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
