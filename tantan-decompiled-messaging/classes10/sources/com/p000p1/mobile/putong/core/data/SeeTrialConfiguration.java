package com.p000p1.mobile.putong.core.data;

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
public class SeeTrialConfiguration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seetrialconfiguration";

    @ProtobufIndex(index = 1)
    public long trialDuration;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long waitDuration;
    public static ProtobufAdapter<SeeTrialConfiguration> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeTrialConfiguration>() { // from class: com.p1.mobile.putong.core.data.SeeTrialConfiguration.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeTrialConfiguration seeTrialConfiguration) {
            int iJ = CodedOutputByteBufferNano.j(1, seeTrialConfiguration.trialDuration) + CodedOutputByteBufferNano.j(2, seeTrialConfiguration.waitDuration);
            ((MessageNano) seeTrialConfiguration).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeTrialConfiguration m15547parse(nb5 nb5Var) throws IOException {
            SeeTrialConfiguration seeTrialConfiguration = new SeeTrialConfiguration();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    seeTrialConfiguration.trialDuration = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return seeTrialConfiguration;
                    }
                    seeTrialConfiguration.waitDuration = nb5Var.k();
                }
            }
        }

        public void serialize(SeeTrialConfiguration seeTrialConfiguration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, seeTrialConfiguration.trialDuration);
            codedOutputByteBufferNano.I(2, seeTrialConfiguration.waitDuration);
        }
    };
    public static JsonAdapter<SeeTrialConfiguration> JSON_ADAPTER = new ObjectJsonAdapter<SeeTrialConfiguration>() { // from class: com.p1.mobile.putong.core.data.SeeTrialConfiguration.2
        public Class getDataClass() {
            return SeeTrialConfiguration.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeTrialConfiguration m15548newInstance() {
            return new SeeTrialConfiguration();
        }

        public boolean parseField(SeeTrialConfiguration seeTrialConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("waitDuration")) {
                seeTrialConfiguration.waitDuration = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("trialDuration")) {
                return false;
            }
            seeTrialConfiguration.trialDuration = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(SeeTrialConfiguration seeTrialConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("waitDuration") || str.equals("trialDuration")) {
                return true;
            }
            return super.parseFieldCheck(seeTrialConfiguration, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SeeTrialConfiguration seeTrialConfiguration, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trialDuration", seeTrialConfiguration.trialDuration);
            jsonGenerator.writeNumberField("waitDuration", seeTrialConfiguration.waitDuration);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeTrialConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeTrialConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeTrialConfiguration new_() {
        SeeTrialConfiguration seeTrialConfiguration = new SeeTrialConfiguration();
        seeTrialConfiguration.nullCheck();
        return seeTrialConfiguration;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeTrialConfiguration m15546clone() {
        SeeTrialConfiguration seeTrialConfiguration = new SeeTrialConfiguration();
        seeTrialConfiguration.trialDuration = this.trialDuration;
        seeTrialConfiguration.waitDuration = this.waitDuration;
        return seeTrialConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeTrialConfiguration)) {
            return false;
        }
        SeeTrialConfiguration seeTrialConfiguration = (SeeTrialConfiguration) obj;
        return this.trialDuration == seeTrialConfiguration.trialDuration && this.waitDuration == seeTrialConfiguration.waitDuration;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.trialDuration;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.waitDuration;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
