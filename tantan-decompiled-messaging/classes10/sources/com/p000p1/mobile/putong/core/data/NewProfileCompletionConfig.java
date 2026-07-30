package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class NewProfileCompletionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newprofilecompletionconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int self_introduction_picture_num;

    @NonNull
    @ProtobufIndex(index = 1)
    public NewDatingPurpose weight;
    public static ProtobufAdapter<NewProfileCompletionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.NewProfileCompletionConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewProfileCompletionConfig newProfileCompletionConfig) {
            NewDatingPurpose newDatingPurpose = newProfileCompletionConfig.weight;
            int iL = (newDatingPurpose != null ? CodedOutputByteBufferNano.l(1, newDatingPurpose, NewDatingPurpose.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.h(2, newProfileCompletionConfig.self_introduction_picture_num);
            ((MessageNano) newProfileCompletionConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewProfileCompletionConfig m14527parse(nb5 nb5Var) throws IOException {
            NewProfileCompletionConfig newProfileCompletionConfig = new NewProfileCompletionConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (newProfileCompletionConfig.weight != null) {
                        break;
                    }
                    newProfileCompletionConfig.weight = NewDatingPurpose.new_();
                    break;
                }
                if (iU == 10) {
                    newProfileCompletionConfig.weight = (NewDatingPurpose) nb5Var.l(NewDatingPurpose.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 16) {
                        if (newProfileCompletionConfig.weight != null) {
                            break;
                        }
                        newProfileCompletionConfig.weight = NewDatingPurpose.new_();
                        return newProfileCompletionConfig;
                    }
                    newProfileCompletionConfig.self_introduction_picture_num = nb5Var.j();
                }
            }
            return newProfileCompletionConfig;
        }

        public void serialize(NewProfileCompletionConfig newProfileCompletionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NewDatingPurpose newDatingPurpose = newProfileCompletionConfig.weight;
            if (newDatingPurpose != null) {
                codedOutputByteBufferNano.K(1, newDatingPurpose, NewDatingPurpose.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(2, newProfileCompletionConfig.self_introduction_picture_num);
        }
    };
    public static JsonAdapter<NewProfileCompletionConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.NewProfileCompletionConfig.2
        public Class getDataClass() {
            return NewProfileCompletionConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewProfileCompletionConfig m14528newInstance() {
            return new NewProfileCompletionConfig();
        }

        public boolean parseField(NewProfileCompletionConfig newProfileCompletionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("weight")) {
                newProfileCompletionConfig.weight = (NewDatingPurpose) NewDatingPurpose.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("self_introduction_picture_num")) {
                return false;
            }
            newProfileCompletionConfig.self_introduction_picture_num = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(NewProfileCompletionConfig newProfileCompletionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("weight") || str.equals("self_introduction_picture_num")) {
                return true;
            }
            return super.parseFieldCheck(newProfileCompletionConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(NewProfileCompletionConfig newProfileCompletionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (newProfileCompletionConfig.weight != null) {
                jsonGenerator.writeFieldName("weight");
                NewDatingPurpose.JSON_ADAPTER.serialize(newProfileCompletionConfig.weight, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("self_introduction_picture_num", newProfileCompletionConfig.self_introduction_picture_num);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewProfileCompletionConfig new_() {
        NewProfileCompletionConfig newProfileCompletionConfig = new NewProfileCompletionConfig();
        newProfileCompletionConfig.nullCheck();
        return newProfileCompletionConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewProfileCompletionConfig m14526clone() {
        NewProfileCompletionConfig newProfileCompletionConfig = new NewProfileCompletionConfig();
        NewDatingPurpose newDatingPurpose = this.weight;
        if (newDatingPurpose != null) {
            newProfileCompletionConfig.weight = newDatingPurpose.m14502clone();
        }
        newProfileCompletionConfig.self_introduction_picture_num = this.self_introduction_picture_num;
        return newProfileCompletionConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewProfileCompletionConfig)) {
            return false;
        }
        NewProfileCompletionConfig newProfileCompletionConfig = (NewProfileCompletionConfig) obj;
        return ValueObject.util_equals(this.weight, newProfileCompletionConfig.weight) && this.self_introduction_picture_num == newProfileCompletionConfig.self_introduction_picture_num;
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
        NewDatingPurpose newDatingPurpose = this.weight;
        int iHashCode = ((i2 + (newDatingPurpose != null ? newDatingPurpose.hashCode() : 0)) * 41) + this.self_introduction_picture_num;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.weight == null) {
            this.weight = NewDatingPurpose.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
