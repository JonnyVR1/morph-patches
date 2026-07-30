package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MembershipUpgradeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "membershipupgradeinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public ProductCategory category;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<MembershipUpgradeDurationInfo> duration;
    public static ProtobufAdapter<MembershipUpgradeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MembershipUpgradeInfo>() { // from class: com.p1.mobile.putong.core.data.MembershipUpgradeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MembershipUpgradeInfo membershipUpgradeInfo) {
            ProductCategory productCategory = membershipUpgradeInfo.category;
            int iM17285l = productCategory != null ? CodedOutputByteBufferNano.m17285l(1, productCategory, ProductCategory.PROTOBUF_ADAPTER) : 0;
            List<MembershipUpgradeDurationInfo> list = membershipUpgradeInfo.duration;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, MembershipUpgradeDurationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            membershipUpgradeInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MembershipUpgradeInfo parse(nc5 nc5Var) throws IOException {
            MembershipUpgradeInfo membershipUpgradeInfo = new MembershipUpgradeInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (membershipUpgradeInfo.category == null) {
                        membershipUpgradeInfo.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                    }
                    if (membershipUpgradeInfo.duration != null) {
                        break;
                    }
                    membershipUpgradeInfo.duration = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    membershipUpgradeInfo.category = (ProductCategory) nc5Var.m162488l(ProductCategory.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (membershipUpgradeInfo.category == null) {
                            membershipUpgradeInfo.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (membershipUpgradeInfo.duration != null) {
                            break;
                        }
                        membershipUpgradeInfo.duration = new ArrayList();
                        return membershipUpgradeInfo;
                    }
                    membershipUpgradeInfo.duration = (List) nc5Var.m162488l(MembershipUpgradeDurationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return membershipUpgradeInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MembershipUpgradeInfo membershipUpgradeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ProductCategory productCategory = membershipUpgradeInfo.category;
            if (productCategory != null) {
                codedOutputByteBufferNano.m17309K(1, productCategory, ProductCategory.PROTOBUF_ADAPTER);
            }
            List<MembershipUpgradeDurationInfo> list = membershipUpgradeInfo.duration;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, MembershipUpgradeDurationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MembershipUpgradeInfo> JSON_ADAPTER = new ObjectJsonAdapter<MembershipUpgradeInfo>() { // from class: com.p1.mobile.putong.core.data.MembershipUpgradeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MembershipUpgradeInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MembershipUpgradeInfo newInstance() {
            return new MembershipUpgradeInfo();
        }

        public boolean parseField(MembershipUpgradeInfo membershipUpgradeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration)) {
                membershipUpgradeInfo.duration = JsonAdapter.parseArray(jsonParser, MembershipUpgradeDurationInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("category")) {
                return false;
            }
            membershipUpgradeInfo.category = ProductCategory.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(MembershipUpgradeInfo membershipUpgradeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration) || str.equals("category")) {
                return true;
            }
            return super.parseFieldCheck(membershipUpgradeInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MembershipUpgradeInfo membershipUpgradeInfo, JsonGenerator jsonGenerator) throws IOException {
            if (membershipUpgradeInfo.category != null) {
                jsonGenerator.writeFieldName("category");
                ProductCategory.JSON_ADAPTER.serialize(membershipUpgradeInfo.category, jsonGenerator, true);
            }
            if (membershipUpgradeInfo.duration != null) {
                jsonGenerator.writeFieldName(BLiveOperationTitleShowType.duration);
                JsonAdapter.serializeArray(membershipUpgradeInfo.duration, jsonGenerator, MembershipUpgradeDurationInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MembershipUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MembershipUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MembershipUpgradeInfo new_() {
        MembershipUpgradeInfo membershipUpgradeInfo = new MembershipUpgradeInfo();
        membershipUpgradeInfo.nullCheck();
        return membershipUpgradeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MembershipUpgradeInfo mo225055clone() {
        MembershipUpgradeInfo membershipUpgradeInfo = new MembershipUpgradeInfo();
        membershipUpgradeInfo.category = this.category;
        List<MembershipUpgradeDurationInfo> list = this.duration;
        if (list != null) {
            membershipUpgradeInfo.duration = ValueObject.util_map(list, new qcj() { // from class: l.coy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((MembershipUpgradeDurationInfo) obj).mo225055clone();
                }
            });
        }
        return membershipUpgradeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MembershipUpgradeInfo)) {
            return false;
        }
        MembershipUpgradeInfo membershipUpgradeInfo = (MembershipUpgradeInfo) obj;
        return ValueObject.util_equals(this.category, membershipUpgradeInfo.category) && ValueObject.util_equals(this.duration, membershipUpgradeInfo.duration);
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
        ProductCategory productCategory = this.category;
        int iHashCode = (i2 + (productCategory != null ? productCategory.hashCode() : 0)) * 41;
        List<MembershipUpgradeDurationInfo> list = this.duration;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = (ProductCategory) ProductCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.duration == null) {
            this.duration = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
