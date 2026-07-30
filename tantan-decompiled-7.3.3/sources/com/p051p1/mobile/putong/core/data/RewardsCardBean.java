package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Gender;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class RewardsCardBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rewardscardbean";

    @NonNull
    @ProtobufIndex(index = 2)
    public Gender gender;

    @ProtobufIndex(index = 1)
    public int number;
    public static ProtobufAdapter<RewardsCardBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<RewardsCardBean>() { // from class: com.p1.mobile.putong.core.data.RewardsCardBean.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RewardsCardBean rewardsCardBean) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, rewardsCardBean.number);
            Gender gender = rewardsCardBean.gender;
            if (gender != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, gender, Gender.PROTOBUF_ADAPTER);
            }
            rewardsCardBean.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RewardsCardBean parse(nc5 nc5Var) throws IOException {
            RewardsCardBean rewardsCardBean = new RewardsCardBean();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (rewardsCardBean.gender != null) {
                        break;
                    }
                    rewardsCardBean.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    rewardsCardBean.number = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (rewardsCardBean.gender != null) {
                            break;
                        }
                        rewardsCardBean.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        return rewardsCardBean;
                    }
                    rewardsCardBean.gender = (Gender) nc5Var.m162488l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return rewardsCardBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RewardsCardBean rewardsCardBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, rewardsCardBean.number);
            Gender gender = rewardsCardBean.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17309K(2, gender, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RewardsCardBean> JSON_ADAPTER = new ObjectJsonAdapter<RewardsCardBean>() { // from class: com.p1.mobile.putong.core.data.RewardsCardBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RewardsCardBean.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RewardsCardBean newInstance() {
            return new RewardsCardBean();
        }

        public boolean parseField(RewardsCardBean rewardsCardBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gender")) {
                rewardsCardBean.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("number")) {
                return false;
            }
            rewardsCardBean.number = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(RewardsCardBean rewardsCardBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gender") || str.equals("number")) {
                return true;
            }
            return super.parseFieldCheck(rewardsCardBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RewardsCardBean rewardsCardBean, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("number", rewardsCardBean.number);
            if (rewardsCardBean.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(rewardsCardBean.gender, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RewardsCardBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RewardsCardBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RewardsCardBean new_() {
        RewardsCardBean rewardsCardBean = new RewardsCardBean();
        rewardsCardBean.nullCheck();
        return rewardsCardBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RewardsCardBean mo225055clone() {
        RewardsCardBean rewardsCardBean = new RewardsCardBean();
        rewardsCardBean.number = this.number;
        rewardsCardBean.gender = this.gender;
        return rewardsCardBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RewardsCardBean)) {
            return false;
        }
        RewardsCardBean rewardsCardBean = (RewardsCardBean) obj;
        return this.number == rewardsCardBean.number && ValueObject.util_equals(this.gender, rewardsCardBean.gender);
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
        int i2 = ((i * 41) + this.number) * 41;
        Gender gender = this.gender;
        int iHashCode = i2 + (gender != null ? gender.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
