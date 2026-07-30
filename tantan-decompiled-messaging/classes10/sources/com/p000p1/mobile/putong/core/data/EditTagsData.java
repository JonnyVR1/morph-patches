package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.EditTagsData;
import com.p000p1.mobile.putong.core.data.TagCategories;
import com.p000p1.mobile.putong.core.data.UrlTag;
import com.p000p1.mobile.putong.core.data.UserTagData;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class EditTagsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "edittagsdata";

    @ProtobufIndex(index = 4)
    public int maximumSelectableCount;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int minimumSelectableCount;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> picUrls;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> selectedTags;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<TagCategories> tagCategories;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<UserTagData> tags;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<UrlTag> urlTags;
    public static ProtobufAdapter<EditTagsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<EditTagsData>() { // from class: com.p1.mobile.putong.core.data.EditTagsData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(EditTagsData editTagsData) {
            List<UserTagData> list = editTagsData.tags;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<TagCategories> list2 = editTagsData.tagCategories;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = editTagsData.selectedTags;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iL + CodedOutputByteBufferNano.h(4, editTagsData.maximumSelectableCount) + CodedOutputByteBufferNano.h(5, editTagsData.minimumSelectableCount);
            List<String> list4 = editTagsData.picUrls;
            if (list4 != null) {
                iH += CodedOutputByteBufferNano.l(6, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<UrlTag> list5 = editTagsData.urlTags;
            if (list5 != null) {
                iH += CodedOutputByteBufferNano.l(7, list5, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) editTagsData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public EditTagsData m12637parse(nb5 nb5Var) throws IOException {
            EditTagsData editTagsData = new EditTagsData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (editTagsData.tags == null) {
                        editTagsData.tags = new ArrayList();
                    }
                    if (editTagsData.tagCategories == null) {
                        editTagsData.tagCategories = new ArrayList();
                    }
                    if (editTagsData.selectedTags == null) {
                        editTagsData.selectedTags = new ArrayList();
                    }
                    if (editTagsData.picUrls == null) {
                        editTagsData.picUrls = new ArrayList();
                    }
                    if (editTagsData.urlTags != null) {
                        break;
                    }
                    editTagsData.urlTags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    editTagsData.tags = (List) nb5Var.l(UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    editTagsData.tagCategories = (List) nb5Var.l(TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    editTagsData.selectedTags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 32) {
                    editTagsData.maximumSelectableCount = nb5Var.j();
                } else if (iU == 40) {
                    editTagsData.minimumSelectableCount = nb5Var.j();
                } else if (iU == 50) {
                    editTagsData.picUrls = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 58) {
                        if (editTagsData.tags == null) {
                            editTagsData.tags = new ArrayList();
                        }
                        if (editTagsData.tagCategories == null) {
                            editTagsData.tagCategories = new ArrayList();
                        }
                        if (editTagsData.selectedTags == null) {
                            editTagsData.selectedTags = new ArrayList();
                        }
                        if (editTagsData.picUrls == null) {
                            editTagsData.picUrls = new ArrayList();
                        }
                        if (editTagsData.urlTags != null) {
                            break;
                        }
                        editTagsData.urlTags = new ArrayList();
                        return editTagsData;
                    }
                    editTagsData.urlTags = (List) nb5Var.l(UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return editTagsData;
        }

        public void serialize(EditTagsData editTagsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<UserTagData> list = editTagsData.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, UserTagData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<TagCategories> list2 = editTagsData.tagCategories;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, TagCategories.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = editTagsData.selectedTags;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(4, editTagsData.maximumSelectableCount);
            codedOutputByteBufferNano.G(5, editTagsData.minimumSelectableCount);
            List<String> list4 = editTagsData.picUrls;
            if (list4 != null) {
                codedOutputByteBufferNano.K(6, list4, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<UrlTag> list5 = editTagsData.urlTags;
            if (list5 != null) {
                codedOutputByteBufferNano.K(7, list5, UrlTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<EditTagsData> JSON_ADAPTER = new ObjectJsonAdapter<EditTagsData>() { // from class: com.p1.mobile.putong.core.data.EditTagsData.2
        public Class getDataClass() {
            return EditTagsData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public EditTagsData m12638newInstance() {
            return new EditTagsData();
        }

        public boolean parseField(EditTagsData editTagsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "selectedTags":
                    editTagsData.selectedTags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tagCategories":
                    editTagsData.tagCategories = JsonAdapter.parseArray(jsonParser, TagCategories.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "maximumSelectableCount":
                    editTagsData.maximumSelectableCount = jsonParser.getValueAsInt();
                    return true;
                case "picUrls":
                    editTagsData.picUrls = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "urlTags":
                    editTagsData.urlTags = JsonAdapter.parseArray(jsonParser, UrlTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tags":
                    editTagsData.tags = JsonAdapter.parseArray(jsonParser, UserTagData.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "minimumSelectableCount":
                    editTagsData.minimumSelectableCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(EditTagsData editTagsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "selectedTags":
                case "tagCategories":
                case "maximumSelectableCount":
                case "picUrls":
                case "urlTags":
                case "tags":
                case "minimumSelectableCount":
                    return true;
                default:
                    return super.parseFieldCheck(editTagsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(EditTagsData editTagsData, JsonGenerator jsonGenerator) throws IOException {
            if (editTagsData.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(editTagsData.tags, jsonGenerator, UserTagData.JSON_ADAPTER);
            }
            if (editTagsData.tagCategories != null) {
                jsonGenerator.writeFieldName("tagCategories");
                JsonAdapter.serializeArray(editTagsData.tagCategories, jsonGenerator, TagCategories.JSON_ADAPTER);
            }
            if (editTagsData.selectedTags != null) {
                jsonGenerator.writeFieldName("selectedTags");
                JsonAdapter.serializeArray(editTagsData.selectedTags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("maximumSelectableCount", editTagsData.maximumSelectableCount);
            jsonGenerator.writeNumberField("minimumSelectableCount", editTagsData.minimumSelectableCount);
            if (editTagsData.picUrls != null) {
                jsonGenerator.writeFieldName("picUrls");
                JsonAdapter.serializeArray(editTagsData.picUrls, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (editTagsData.urlTags != null) {
                jsonGenerator.writeFieldName("urlTags");
                JsonAdapter.serializeArray(editTagsData.urlTags, jsonGenerator, UrlTag.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((EditTagsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((EditTagsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m313c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m314d(String str) {
        return str;
    }

    public static EditTagsData new_() {
        EditTagsData editTagsData = new EditTagsData();
        editTagsData.nullCheck();
        return editTagsData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public EditTagsData m12636clone() {
        EditTagsData editTagsData = new EditTagsData();
        List<UserTagData> list = this.tags;
        if (list != null) {
            editTagsData.tags = ValueObject.util_map(list, new w9j() { // from class: l.moe
                public final Object call(Object obj) {
                    return ((UserTagData) obj).m16187clone();
                }
            });
        }
        List<TagCategories> list2 = this.tagCategories;
        if (list2 != null) {
            editTagsData.tagCategories = ValueObject.util_map(list2, new w9j() { // from class: l.noe
                public final Object call(Object obj) {
                    return ((TagCategories) obj).m15901clone();
                }
            });
        }
        List<String> list3 = this.selectedTags;
        if (list3 != null) {
            editTagsData.selectedTags = ValueObject.util_map(list3, new w9j() { // from class: l.ooe
                public final Object call(Object obj) {
                    return EditTagsData.m313c((String) obj);
                }
            });
        }
        editTagsData.maximumSelectableCount = this.maximumSelectableCount;
        editTagsData.minimumSelectableCount = this.minimumSelectableCount;
        List<String> list4 = this.picUrls;
        if (list4 != null) {
            editTagsData.picUrls = ValueObject.util_map(list4, new w9j() { // from class: l.poe
                public final Object call(Object obj) {
                    return EditTagsData.m314d((String) obj);
                }
            });
        }
        List<UrlTag> list5 = this.urlTags;
        if (list5 != null) {
            editTagsData.urlTags = ValueObject.util_map(list5, new w9j() { // from class: l.qoe
                public final Object call(Object obj) {
                    return ((UrlTag) obj).m16083clone();
                }
            });
        }
        return editTagsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EditTagsData)) {
            return false;
        }
        EditTagsData editTagsData = (EditTagsData) obj;
        return ValueObject.util_equals(this.tags, editTagsData.tags) && ValueObject.util_equals(this.tagCategories, editTagsData.tagCategories) && ValueObject.util_equals(this.selectedTags, editTagsData.selectedTags) && this.maximumSelectableCount == editTagsData.maximumSelectableCount && this.minimumSelectableCount == editTagsData.minimumSelectableCount && ValueObject.util_equals(this.picUrls, editTagsData.picUrls) && ValueObject.util_equals(this.urlTags, editTagsData.urlTags);
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
        List<UserTagData> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<TagCategories> list2 = this.tagCategories;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.selectedTags;
        int iHashCode3 = (((((iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41) + this.maximumSelectableCount) * 41) + this.minimumSelectableCount) * 41;
        List<String> list4 = this.picUrls;
        int iHashCode4 = (iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<UrlTag> list5 = this.urlTags;
        int iHashCode5 = iHashCode4 + (list5 != null ? list5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.tagCategories == null) {
            this.tagCategories = new ArrayList();
        }
        if (this.selectedTags == null) {
            this.selectedTags = new ArrayList();
        }
        if (this.picUrls == null) {
            this.picUrls = new ArrayList();
        }
        if (this.urlTags == null) {
            this.urlTags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
