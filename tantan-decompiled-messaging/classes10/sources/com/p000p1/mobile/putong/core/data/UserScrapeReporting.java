package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UserScrapeReporting;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserScrapeReporting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "userscrapereporting";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> keywords;
    public static ProtobufAdapter<UserScrapeReporting> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserScrapeReporting>() { // from class: com.p1.mobile.putong.core.data.UserScrapeReporting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserScrapeReporting userScrapeReporting) {
            List<String> list = userScrapeReporting.keywords;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) userScrapeReporting).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserScrapeReporting m16172parse(nb5 nb5Var) throws IOException {
            UserScrapeReporting userScrapeReporting = new UserScrapeReporting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userScrapeReporting.keywords != null) {
                        break;
                    }
                    userScrapeReporting.keywords = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (userScrapeReporting.keywords != null) {
                        break;
                    }
                    userScrapeReporting.keywords = new ArrayList();
                    return userScrapeReporting;
                }
                userScrapeReporting.keywords = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return userScrapeReporting;
        }

        public void serialize(UserScrapeReporting userScrapeReporting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = userScrapeReporting.keywords;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<UserScrapeReporting> JSON_ADAPTER = new ObjectJsonAdapter<UserScrapeReporting>() { // from class: com.p1.mobile.putong.core.data.UserScrapeReporting.2
        public Class getDataClass() {
            return UserScrapeReporting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserScrapeReporting m16173newInstance() {
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

        public void serializeFields(UserScrapeReporting userScrapeReporting, JsonGenerator jsonGenerator) throws IOException {
            if (userScrapeReporting.keywords != null) {
                jsonGenerator.writeFieldName("keywords");
                JsonAdapter.serializeArray(userScrapeReporting.keywords, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserScrapeReporting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserScrapeReporting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m695a(String str) {
        return str;
    }

    public static UserScrapeReporting new_() {
        UserScrapeReporting userScrapeReporting = new UserScrapeReporting();
        userScrapeReporting.nullCheck();
        return userScrapeReporting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserScrapeReporting m16171clone() {
        UserScrapeReporting userScrapeReporting = new UserScrapeReporting();
        List<String> list = this.keywords;
        if (list != null) {
            userScrapeReporting.keywords = ValueObject.util_map(list, new w9j() { // from class: l.a9k0
                public final Object call(Object obj) {
                    return UserScrapeReporting.m695a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.keywords;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.keywords == null) {
            this.keywords = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
