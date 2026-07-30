package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class NewProfileCompletionConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newprofilecompletionconfig";

    @ProtobufIndex(index = 2)
    public int self_introduction_picture_num;

    @NonNull
    @ProtobufIndex(index = 1)
    public NewDatingPurpose weight;
    public static ProtobufAdapter<NewProfileCompletionConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.NewProfileCompletionConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewProfileCompletionConfig newProfileCompletionConfig) {
            NewDatingPurpose newDatingPurpose = newProfileCompletionConfig.weight;
            int iM17285l = (newDatingPurpose != null ? CodedOutputByteBufferNano.m17285l(1, newDatingPurpose, NewDatingPurpose.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17281h(2, newProfileCompletionConfig.self_introduction_picture_num);
            newProfileCompletionConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewProfileCompletionConfig parse(nc5 nc5Var) throws IOException {
            NewProfileCompletionConfig newProfileCompletionConfig = new NewProfileCompletionConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (newProfileCompletionConfig.weight != null) {
                        break;
                    }
                    newProfileCompletionConfig.weight = NewDatingPurpose.new_();
                    break;
                }
                if (iM162497u == 10) {
                    newProfileCompletionConfig.weight = (NewDatingPurpose) nc5Var.m162488l(NewDatingPurpose.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 16) {
                        if (newProfileCompletionConfig.weight != null) {
                            break;
                        }
                        newProfileCompletionConfig.weight = NewDatingPurpose.new_();
                        return newProfileCompletionConfig;
                    }
                    newProfileCompletionConfig.self_introduction_picture_num = nc5Var.m162486j();
                }
            }
            return newProfileCompletionConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewProfileCompletionConfig newProfileCompletionConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NewDatingPurpose newDatingPurpose = newProfileCompletionConfig.weight;
            if (newDatingPurpose != null) {
                codedOutputByteBufferNano.m17309K(1, newDatingPurpose, NewDatingPurpose.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(2, newProfileCompletionConfig.self_introduction_picture_num);
        }
    };
    public static JsonAdapter<NewProfileCompletionConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewProfileCompletionConfig>() { // from class: com.p1.mobile.putong.core.data.NewProfileCompletionConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewProfileCompletionConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewProfileCompletionConfig newInstance() {
            return new NewProfileCompletionConfig();
        }

        public boolean parseField(NewProfileCompletionConfig newProfileCompletionConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("weight")) {
                newProfileCompletionConfig.weight = NewDatingPurpose.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewProfileCompletionConfig newProfileCompletionConfig, JsonGenerator jsonGenerator) throws IOException {
            if (newProfileCompletionConfig.weight != null) {
                jsonGenerator.writeFieldName("weight");
                NewDatingPurpose.JSON_ADAPTER.serialize(newProfileCompletionConfig.weight, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("self_introduction_picture_num", newProfileCompletionConfig.self_introduction_picture_num);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewProfileCompletionConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewProfileCompletionConfig new_() {
        NewProfileCompletionConfig newProfileCompletionConfig = new NewProfileCompletionConfig();
        newProfileCompletionConfig.nullCheck();
        return newProfileCompletionConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewProfileCompletionConfig mo225055clone() {
        NewProfileCompletionConfig newProfileCompletionConfig = new NewProfileCompletionConfig();
        NewDatingPurpose newDatingPurpose = this.weight;
        if (newDatingPurpose != null) {
            newProfileCompletionConfig.weight = newDatingPurpose.mo225055clone();
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
        NewDatingPurpose newDatingPurpose = this.weight;
        int iHashCode = ((i2 + (newDatingPurpose != null ? newDatingPurpose.hashCode() : 0)) * 41) + this.self_introduction_picture_num;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.weight == null) {
            this.weight = NewDatingPurpose.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
