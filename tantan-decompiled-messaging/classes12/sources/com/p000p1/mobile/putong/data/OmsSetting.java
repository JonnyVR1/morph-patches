package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OmsNewTags;
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
import java.util.HashSet;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OmsSetting extends ValueObject<OmsSetting> implements Cloneable, Serializable {
    public static final String TYPE = "omssetting";

    @NonNull
    @ProtobufIndex(index = 1)
    public MedalCard medalCard;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<OmsNewTags> tags;

    @NonNull
    @ProtobufIndex(index = 2)
    public ThemeView themeView;
    public static ProtobufAdapter<OmsSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsSetting>() { // from class: com.p1.mobile.putong.data.OmsSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OmsSetting omsSetting) {
            MedalCard medalCard = omsSetting.medalCard;
            int iL = medalCard != null ? CodedOutputByteBufferNano.l(1, medalCard, MedalCard.PROTOBUF_ADAPTER) : 0;
            ThemeView themeView = omsSetting.themeView;
            if (themeView != null) {
                iL += CodedOutputByteBufferNano.l(2, themeView, ThemeView.PROTOBUF_ADAPTER);
            }
            List<OmsNewTags> list = omsSetting.tags;
            if (list != null) {
                iL += CodedOutputByteBufferNano.l(3, list, OmsNewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) omsSetting).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OmsSetting m18729parse(nb5 nb5Var) throws IOException {
            OmsSetting omsSetting = new OmsSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (omsSetting.medalCard == null) {
                        omsSetting.medalCard = MedalCard.new_();
                    }
                    if (omsSetting.themeView == null) {
                        omsSetting.themeView = ThemeView.new_();
                    }
                    if (omsSetting.tags != null) {
                        break;
                    }
                    omsSetting.tags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    omsSetting.medalCard = (MedalCard) nb5Var.l(MedalCard.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    omsSetting.themeView = (ThemeView) nb5Var.l(ThemeView.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (omsSetting.medalCard == null) {
                            omsSetting.medalCard = MedalCard.new_();
                        }
                        if (omsSetting.themeView == null) {
                            omsSetting.themeView = ThemeView.new_();
                        }
                        if (omsSetting.tags != null) {
                            break;
                        }
                        omsSetting.tags = new ArrayList();
                        return omsSetting;
                    }
                    omsSetting.tags = (List) nb5Var.l(OmsNewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return omsSetting;
        }

        public void serialize(OmsSetting omsSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MedalCard medalCard = omsSetting.medalCard;
            if (medalCard != null) {
                codedOutputByteBufferNano.K(1, medalCard, MedalCard.PROTOBUF_ADAPTER);
            }
            ThemeView themeView = omsSetting.themeView;
            if (themeView != null) {
                codedOutputByteBufferNano.K(2, themeView, ThemeView.PROTOBUF_ADAPTER);
            }
            List<OmsNewTags> list = omsSetting.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, OmsNewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OmsSetting> JSON_ADAPTER = new ObjectJsonAdapter<OmsSetting>() { // from class: com.p1.mobile.putong.data.OmsSetting.2
        public Class getDataClass() {
            return OmsSetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OmsSetting mo17830newInstance() {
            return new OmsSetting();
        }

        public boolean parseField(OmsSetting omsSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tags":
                    omsSetting.tags = JsonAdapter.parseArray(jsonParser, OmsNewTags.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "themeView":
                    omsSetting.themeView = (ThemeView) ThemeView.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "medalCard":
                    omsSetting.medalCard = (MedalCard) MedalCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsSetting omsSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tags":
                case "themeView":
                case "medalCard":
                    return true;
                default:
                    return super.parseFieldCheck(omsSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsSetting omsSetting, JsonGenerator jsonGenerator) throws IOException {
            if (omsSetting.medalCard != null) {
                jsonGenerator.writeFieldName("medalCard");
                MedalCard.JSON_ADAPTER.serialize(omsSetting.medalCard, jsonGenerator, true);
            }
            if (omsSetting.themeView != null) {
                jsonGenerator.writeFieldName("themeView");
                ThemeView.JSON_ADAPTER.serialize(omsSetting.themeView, jsonGenerator, true);
            }
            if (omsSetting.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(omsSetting.tags, jsonGenerator, OmsNewTags.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsSetting new_() {
        OmsSetting omsSetting = new OmsSetting();
        omsSetting.nullCheck();
        return omsSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OmsSetting m18728clone() {
        OmsSetting omsSetting = new OmsSetting();
        MedalCard medalCard = this.medalCard;
        if (medalCard != null) {
            omsSetting.medalCard = medalCard.m18438clone();
        }
        ThemeView themeView = this.themeView;
        if (themeView != null) {
            omsSetting.themeView = themeView.m19093clone();
        }
        List<OmsNewTags> list = this.tags;
        if (list != null) {
            omsSetting.tags = ValueObject.util_map(list, new w9j() { // from class: l.oc50
                public final Object call(Object obj) {
                    return ((OmsNewTags) obj).m18725clone();
                }
            });
        }
        return omsSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsSetting)) {
            return false;
        }
        OmsSetting omsSetting = (OmsSetting) obj;
        return ValueObject.util_equals(this.medalCard, omsSetting.medalCard) && ValueObject.util_equals(this.themeView, omsSetting.themeView) && ValueObject.util_equals(this.tags, omsSetting.tags);
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
        MedalCard medalCard = this.medalCard;
        int iHashCode = (i2 + (medalCard != null ? medalCard.hashCode() : 0)) * 41;
        ThemeView themeView = this.themeView;
        int iHashCode2 = (iHashCode + (themeView != null ? themeView.hashCode() : 0)) * 41;
        List<OmsNewTags> list = this.tags;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(OmsSetting omsSetting) {
        if (!shouldMergeData() || equals(omsSetting)) {
            return;
        }
        if (!isFieldParsed("medalCard")) {
            this.medalCard = omsSetting.medalCard;
        }
        if (!isFieldParsed("themeView")) {
            this.themeView = omsSetting.themeView;
        }
        if (!isFieldParsed("tags")) {
            this.tags = omsSetting.tags;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.medalCard == null) {
            this.medalCard = MedalCard.new_();
        }
        if (this.themeView == null) {
            this.themeView = ThemeView.new_();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public OmsSetting subtract(OmsSetting omsSetting) {
        OmsSetting omsSetting2 = new OmsSetting();
        MedalCard medalCard = this.medalCard;
        if (medalCard != null) {
            omsSetting2.medalCard = medalCard.subtract(omsSetting.medalCard);
        }
        ThemeView themeView = this.themeView;
        if (themeView != null) {
            omsSetting2.themeView = themeView.subtract(omsSetting.themeView);
        }
        if (!ValueObject.util_equals(this.tags, omsSetting.tags)) {
            omsSetting2.tags = this.tags;
        }
        if (omsSetting2.equals(new OmsSetting())) {
            return null;
        }
        return omsSetting2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
