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
public class NearbyBlock extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbyblock";

    @ProtobufIndex(index = 1)
    public boolean access;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean showPopUpInform;
    public static ProtobufAdapter<NearbyBlock> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyBlock>() { // from class: com.p1.mobile.putong.core.data.NearbyBlock.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NearbyBlock nearbyBlock) {
            int iB = CodedOutputByteBufferNano.b(1, nearbyBlock.access) + CodedOutputByteBufferNano.b(2, nearbyBlock.showPopUpInform);
            ((MessageNano) nearbyBlock).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NearbyBlock m14479parse(nb5 nb5Var) throws IOException {
            NearbyBlock nearbyBlock = new NearbyBlock();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    nearbyBlock.access = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return nearbyBlock;
                    }
                    nearbyBlock.showPopUpInform = nb5Var.g();
                }
            }
        }

        public void serialize(NearbyBlock nearbyBlock, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, nearbyBlock.access);
            codedOutputByteBufferNano.A(2, nearbyBlock.showPopUpInform);
        }
    };
    public static JsonAdapter<NearbyBlock> JSON_ADAPTER = new ObjectJsonAdapter<NearbyBlock>() { // from class: com.p1.mobile.putong.core.data.NearbyBlock.2
        public Class getDataClass() {
            return NearbyBlock.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NearbyBlock m14480newInstance() {
            return new NearbyBlock();
        }

        public boolean parseField(NearbyBlock nearbyBlock, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showPopUpInform")) {
                nearbyBlock.showPopUpInform = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("access")) {
                return false;
            }
            nearbyBlock.access = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(NearbyBlock nearbyBlock, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showPopUpInform") || str.equals("access")) {
                return true;
            }
            return super.parseFieldCheck(nearbyBlock, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(NearbyBlock nearbyBlock, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("access", nearbyBlock.access);
            jsonGenerator.writeBooleanField("showPopUpInform", nearbyBlock.showPopUpInform);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyBlock) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyBlock) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyBlock new_() {
        NearbyBlock nearbyBlock = new NearbyBlock();
        nearbyBlock.nullCheck();
        return nearbyBlock;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NearbyBlock m14478clone() {
        NearbyBlock nearbyBlock = new NearbyBlock();
        nearbyBlock.access = this.access;
        nearbyBlock.showPopUpInform = this.showPopUpInform;
        return nearbyBlock;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyBlock)) {
            return false;
        }
        NearbyBlock nearbyBlock = (NearbyBlock) obj;
        return this.access == nearbyBlock.access && this.showPopUpInform == nearbyBlock.showPopUpInform;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.access ? 1231 : 1237)) * 41) + (this.showPopUpInform ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
