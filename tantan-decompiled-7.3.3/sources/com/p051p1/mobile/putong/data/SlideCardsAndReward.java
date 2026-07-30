package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class SlideCardsAndReward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "slidecardsandreward";

    @ProtobufIndex(index = 2)
    public int rewards;

    @ProtobufIndex(index = 1)
    public int slideTheCard;
    public static ProtobufAdapter<SlideCardsAndReward> PROTOBUF_ADAPTER = new MessageNanoAdapter<SlideCardsAndReward>() { // from class: com.p1.mobile.putong.data.SlideCardsAndReward.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SlideCardsAndReward slideCardsAndReward) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, slideCardsAndReward.slideTheCard) + CodedOutputByteBufferNano.m17281h(2, slideCardsAndReward.rewards);
            slideCardsAndReward.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SlideCardsAndReward parse(nc5 nc5Var) throws IOException {
            SlideCardsAndReward slideCardsAndReward = new SlideCardsAndReward();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    slideCardsAndReward.slideTheCard = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return slideCardsAndReward;
                    }
                    slideCardsAndReward.rewards = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SlideCardsAndReward slideCardsAndReward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, slideCardsAndReward.slideTheCard);
            codedOutputByteBufferNano.m17305G(2, slideCardsAndReward.rewards);
        }
    };
    public static JsonAdapter<SlideCardsAndReward> JSON_ADAPTER = new ObjectJsonAdapter<SlideCardsAndReward>() { // from class: com.p1.mobile.putong.data.SlideCardsAndReward.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SlideCardsAndReward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SlideCardsAndReward newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SlideCardsAndReward slideCardsAndReward, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("slideTheCard", slideCardsAndReward.slideTheCard);
            jsonGenerator.writeNumberField("rewards", slideCardsAndReward.rewards);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SlideCardsAndReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SlideCardsAndReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SlideCardsAndReward new_() {
        SlideCardsAndReward slideCardsAndReward = new SlideCardsAndReward();
        slideCardsAndReward.nullCheck();
        return slideCardsAndReward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SlideCardsAndReward mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.slideTheCard) * 41) + this.rewards;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
