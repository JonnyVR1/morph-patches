package com.p000p1.mobile.putong.data;

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
public class SlideCardsAndReward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "slidecardsandreward";

    @ProtobufIndex(index = 2)
    public int rewards;

    @ProtobufIndex(index = 1)
    public int slideTheCard;
    public static ProtobufAdapter<SlideCardsAndReward> PROTOBUF_ADAPTER = new MessageNanoAdapter<SlideCardsAndReward>() { // from class: com.p1.mobile.putong.data.SlideCardsAndReward.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SlideCardsAndReward slideCardsAndReward) {
            int iH = CodedOutputByteBufferNano.h(1, slideCardsAndReward.slideTheCard) + CodedOutputByteBufferNano.h(2, slideCardsAndReward.rewards);
            ((MessageNano) slideCardsAndReward).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SlideCardsAndReward m18983parse(nb5 nb5Var) throws IOException {
            SlideCardsAndReward slideCardsAndReward = new SlideCardsAndReward();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    slideCardsAndReward.slideTheCard = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return slideCardsAndReward;
                    }
                    slideCardsAndReward.rewards = nb5Var.j();
                }
            }
        }

        public void serialize(SlideCardsAndReward slideCardsAndReward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, slideCardsAndReward.slideTheCard);
            codedOutputByteBufferNano.G(2, slideCardsAndReward.rewards);
        }
    };
    public static JsonAdapter<SlideCardsAndReward> JSON_ADAPTER = new ObjectJsonAdapter<SlideCardsAndReward>() { // from class: com.p1.mobile.putong.data.SlideCardsAndReward.2
        public Class getDataClass() {
            return SlideCardsAndReward.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SlideCardsAndReward mo17830newInstance() {
            return new SlideCardsAndReward();
        }

        public boolean parseField(SlideCardsAndReward slideCardsAndReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("rewards")) {
                slideCardsAndReward.rewards = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("slideTheCard")) {
                return false;
            }
            slideCardsAndReward.slideTheCard = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SlideCardsAndReward slideCardsAndReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("rewards") || str.equals("slideTheCard")) {
                return true;
            }
            return super.parseFieldCheck(slideCardsAndReward, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SlideCardsAndReward slideCardsAndReward, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("slideTheCard", slideCardsAndReward.slideTheCard);
            jsonGenerator.writeNumberField("rewards", slideCardsAndReward.rewards);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SlideCardsAndReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SlideCardsAndReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SlideCardsAndReward new_() {
        SlideCardsAndReward slideCardsAndReward = new SlideCardsAndReward();
        slideCardsAndReward.nullCheck();
        return slideCardsAndReward;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SlideCardsAndReward m18982clone() {
        SlideCardsAndReward slideCardsAndReward = new SlideCardsAndReward();
        slideCardsAndReward.slideTheCard = this.slideTheCard;
        slideCardsAndReward.rewards = this.rewards;
        return slideCardsAndReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SlideCardsAndReward)) {
            return false;
        }
        SlideCardsAndReward slideCardsAndReward = (SlideCardsAndReward) obj;
        return this.slideTheCard == slideCardsAndReward.slideTheCard && this.rewards == slideCardsAndReward.rewards;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.slideTheCard) * 41) + this.rewards;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
