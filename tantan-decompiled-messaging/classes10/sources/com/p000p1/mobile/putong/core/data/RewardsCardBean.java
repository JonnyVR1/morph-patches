package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Gender;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class RewardsCardBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rewardscardbean";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Gender gender;

    @ProtobufIndex(index = 1)
    public int number;
    public static ProtobufAdapter<RewardsCardBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<RewardsCardBean>() { // from class: com.p1.mobile.putong.core.data.RewardsCardBean.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RewardsCardBean rewardsCardBean) {
            int iH = CodedOutputByteBufferNano.h(1, rewardsCardBean.number);
            Gender gender = rewardsCardBean.gender;
            if (gender != null) {
                iH += CodedOutputByteBufferNano.l(2, gender, Gender.PROTOBUF_ADAPTER);
            }
            ((MessageNano) rewardsCardBean).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RewardsCardBean m15439parse(nb5 nb5Var) throws IOException {
            RewardsCardBean rewardsCardBean = new RewardsCardBean();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (rewardsCardBean.gender != null) {
                        break;
                    }
                    rewardsCardBean.gender = Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    rewardsCardBean.number = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (rewardsCardBean.gender != null) {
                            break;
                        }
                        rewardsCardBean.gender = Gender.JSON_ADAPTER.defaultEnum();
                        return rewardsCardBean;
                    }
                    rewardsCardBean.gender = (Gender) nb5Var.l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return rewardsCardBean;
        }

        public void serialize(RewardsCardBean rewardsCardBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, rewardsCardBean.number);
            Gender gender = rewardsCardBean.gender;
            if (gender != null) {
                codedOutputByteBufferNano.K(2, gender, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RewardsCardBean> JSON_ADAPTER = new ObjectJsonAdapter<RewardsCardBean>() { // from class: com.p1.mobile.putong.core.data.RewardsCardBean.2
        public Class getDataClass() {
            return RewardsCardBean.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RewardsCardBean m15440newInstance() {
            return new RewardsCardBean();
        }

        public boolean parseField(RewardsCardBean rewardsCardBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gender")) {
                rewardsCardBean.gender = (Gender) Gender.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals(FigureMessageType.number)) {
                return false;
            }
            rewardsCardBean.number = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(RewardsCardBean rewardsCardBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gender") || str.equals(FigureMessageType.number)) {
                return true;
            }
            return super.parseFieldCheck(rewardsCardBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RewardsCardBean rewardsCardBean, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FigureMessageType.number, rewardsCardBean.number);
            if (rewardsCardBean.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(rewardsCardBean.gender, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RewardsCardBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RewardsCardBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RewardsCardBean new_() {
        RewardsCardBean rewardsCardBean = new RewardsCardBean();
        rewardsCardBean.nullCheck();
        return rewardsCardBean;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RewardsCardBean m15438clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.number) * 41;
        Gender gender = this.gender;
        int iHashCode = i2 + (gender != null ? gender.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.gender == null) {
            this.gender = Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
