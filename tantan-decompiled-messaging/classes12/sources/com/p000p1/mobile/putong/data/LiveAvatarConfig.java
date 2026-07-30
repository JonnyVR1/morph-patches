package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class LiveAvatarConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveavatarconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public LiveAvatarFrameConfig frameConfig;
    public static ProtobufAdapter<LiveAvatarConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveAvatarConfig>() { // from class: com.p1.mobile.putong.data.LiveAvatarConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveAvatarConfig liveAvatarConfig) {
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveAvatarConfig.frameConfig;
            int iL = liveAvatarFrameConfig != null ? CodedOutputByteBufferNano.l(1, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) liveAvatarConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveAvatarConfig m18325parse(nb5 nb5Var) throws IOException {
            LiveAvatarConfig liveAvatarConfig = new LiveAvatarConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveAvatarConfig.frameConfig != null) {
                        break;
                    }
                    liveAvatarConfig.frameConfig = LiveAvatarFrameConfig.new_();
                    break;
                }
                if (iU != 10) {
                    if (liveAvatarConfig.frameConfig != null) {
                        break;
                    }
                    liveAvatarConfig.frameConfig = LiveAvatarFrameConfig.new_();
                    return liveAvatarConfig;
                }
                liveAvatarConfig.frameConfig = (LiveAvatarFrameConfig) nb5Var.l(LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
            return liveAvatarConfig;
        }

        public void serialize(LiveAvatarConfig liveAvatarConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveAvatarFrameConfig liveAvatarFrameConfig = liveAvatarConfig.frameConfig;
            if (liveAvatarFrameConfig != null) {
                codedOutputByteBufferNano.K(1, liveAvatarFrameConfig, LiveAvatarFrameConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveAvatarConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveAvatarConfig>() { // from class: com.p1.mobile.putong.data.LiveAvatarConfig.2
        public Class getDataClass() {
            return LiveAvatarConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveAvatarConfig mo17830newInstance() {
            return new LiveAvatarConfig();
        }

        public boolean parseField(LiveAvatarConfig liveAvatarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("frameConfig")) {
                return false;
            }
            liveAvatarConfig.frameConfig = (LiveAvatarFrameConfig) LiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiveAvatarConfig liveAvatarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("frameConfig")) {
                return true;
            }
            return super.parseFieldCheck(liveAvatarConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveAvatarConfig liveAvatarConfig, JsonGenerator jsonGenerator) throws IOException {
            if (liveAvatarConfig.frameConfig != null) {
                jsonGenerator.writeFieldName("frameConfig");
                LiveAvatarFrameConfig.JSON_ADAPTER.serialize(liveAvatarConfig.frameConfig, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAvatarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveAvatarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveAvatarConfig new_() {
        LiveAvatarConfig liveAvatarConfig = new LiveAvatarConfig();
        liveAvatarConfig.nullCheck();
        return liveAvatarConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveAvatarConfig m18324clone() {
        LiveAvatarConfig liveAvatarConfig = new LiveAvatarConfig();
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.frameConfig;
        if (liveAvatarFrameConfig != null) {
            liveAvatarConfig.frameConfig = liveAvatarFrameConfig.m18327clone();
        }
        return liveAvatarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LiveAvatarConfig) {
            return ValueObject.util_equals(this.frameConfig, ((LiveAvatarConfig) obj).frameConfig);
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
        LiveAvatarFrameConfig liveAvatarFrameConfig = this.frameConfig;
        int iHashCode = i2 + (liveAvatarFrameConfig != null ? liveAvatarFrameConfig.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.frameConfig == null) {
            this.frameConfig = LiveAvatarFrameConfig.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
