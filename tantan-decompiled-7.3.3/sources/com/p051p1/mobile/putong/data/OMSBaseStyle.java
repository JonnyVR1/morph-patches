package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSBaseStyle;
import com.p051p1.mobile.putong.data.OMSLocationType;
import com.p051p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class OMSBaseStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsbasestyle";

    @NonNull
    @ProtobufIndex(index = 23)
    public OMSLocationType alignment;

    @ProtobufIndex(index = 38)
    public boolean autoSwitch;

    @ProtobufIndex(index = 41)
    public int autoSwitchTime;

    @NonNull
    @ProtobufIndex(index = 18)
    public List<String> bgColors;

    @NonNull
    @ProtobufIndex(index = 19)
    public ResourceDirection bgColorsDirection;

    @NonNull
    @ProtobufIndex(index = 47)
    public String blurColor;

    @ProtobufIndex(index = 46)
    public float blurRadius;

    @NonNull
    @ProtobufIndex(index = 20)
    public String borderColor;

    @ProtobufIndex(index = 21)
    public float borderWidth;

    @ProtobufIndex(index = 39)
    public boolean canSlide;

    @ProtobufIndex(index = 61)
    public boolean checked;

    @ProtobufIndex(index = 22)
    public float cornerRadius;

    @NonNull
    @ProtobufIndex(index = 37)
    public ResourceDirection direction;

    @NonNull
    @ProtobufIndex(index = 33)
    public OMSLocationType distribution;

    @ProtobufIndex(index = 2)
    public float height;

    @NonNull
    @ProtobufIndex(index = 8)
    public OMSSizeType heightType;

    @NonNull
    @ProtobufIndex(index = 34)
    public List<Integer> imageSize;

    @NonNull
    @ProtobufIndex(index = 44)
    public String indicatorBgColor;

    @NonNull
    @ProtobufIndex(index = 43)
    public String indicatorColor;

    @ProtobufIndex(index = 45)
    public float indicatorRadius;

    @ProtobufIndex(index = 30)
    public float leftCapLayoutWidth;

    @ProtobufIndex(index = 28)
    public float leftCapWidth;

    @ProtobufIndex(index = 26)
    public float lineSpacing;

    @NonNull
    @ProtobufIndex(index = 24)
    public List<OMSLocationType> location;

    @ProtobufIndex(index = 16)
    public float marginBottom;

    @ProtobufIndex(index = 15)
    public float marginLeft;

    @ProtobufIndex(index = 17)
    public float marginRight;

    @ProtobufIndex(index = 14)
    public float marginTop;

    @ProtobufIndex(index = 6)
    public float maxHeight;

    @ProtobufIndex(index = 5)
    public float maxWidth;

    @ProtobufIndex(index = 4)
    public float minHeight;

    @ProtobufIndex(index = 3)
    public float minWidth;

    @ProtobufIndex(index = 25)
    public int numberOfLines;

    @ProtobufIndex(index = 35)
    public float offsetX;

    @ProtobufIndex(index = 36)
    public float offsetY;

    @ProtobufIndex(index = 12)
    public float paddingBottom;

    @ProtobufIndex(index = 11)
    public float paddingLeft;

    @ProtobufIndex(index = 13)
    public float paddingRight;

    @ProtobufIndex(index = 10)
    public float paddingTop;

    @ProtobufIndex(index = 9)
    public float ratio;

    @NonNull
    @ProtobufIndex(index = 27)
    public OMSImageScaleType scaleType;

    @NonNull
    @ProtobufIndex(index = 48)
    public String shadowColor;

    @ProtobufIndex(index = 50)
    public float shadowOpacity;

    @ProtobufIndex(index = 49)
    public float shadowRadius;

    @ProtobufIndex(index = 42)
    public boolean showIndicator;

    @ProtobufIndex(index = 32)
    public float spacing;

    @ProtobufIndex(index = 40)
    public int stayTime;

    @ProtobufIndex(index = 29)
    public float topCapHeight;

    @ProtobufIndex(index = 31)
    public float topCapLayoutHeight;

    @NonNull
    @ProtobufIndex(index = 51)
    public OMSUIType uiType;

    @ProtobufIndex(index = 1)
    public float width;

    @NonNull
    @ProtobufIndex(index = 7)
    public OMSSizeType widthType;
    public static ProtobufAdapter<OMSBaseStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSBaseStyle>() { // from class: com.p1.mobile.putong.data.OMSBaseStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSBaseStyle oMSBaseStyle) {
            int iM17279f = CodedOutputByteBufferNano.m17279f(1, oMSBaseStyle.width) + CodedOutputByteBufferNano.m17279f(2, oMSBaseStyle.height) + CodedOutputByteBufferNano.m17279f(3, oMSBaseStyle.minWidth) + CodedOutputByteBufferNano.m17279f(4, oMSBaseStyle.minHeight) + CodedOutputByteBufferNano.m17279f(5, oMSBaseStyle.maxWidth) + CodedOutputByteBufferNano.m17279f(6, oMSBaseStyle.maxHeight);
            OMSSizeType oMSSizeType = oMSBaseStyle.widthType;
            if (oMSSizeType != null) {
                iM17279f += CodedOutputByteBufferNano.m17281h(7, oMSSizeType.ordinal());
            }
            OMSSizeType oMSSizeType2 = oMSBaseStyle.heightType;
            if (oMSSizeType2 != null) {
                iM17279f += CodedOutputByteBufferNano.m17281h(8, oMSSizeType2.ordinal());
            }
            int iM17279f2 = iM17279f + CodedOutputByteBufferNano.m17279f(9, oMSBaseStyle.ratio) + CodedOutputByteBufferNano.m17279f(10, oMSBaseStyle.paddingTop) + CodedOutputByteBufferNano.m17279f(11, oMSBaseStyle.paddingLeft) + CodedOutputByteBufferNano.m17279f(12, oMSBaseStyle.paddingBottom) + CodedOutputByteBufferNano.m17279f(13, oMSBaseStyle.paddingRight) + CodedOutputByteBufferNano.m17279f(14, oMSBaseStyle.marginTop) + CodedOutputByteBufferNano.m17279f(15, oMSBaseStyle.marginLeft) + CodedOutputByteBufferNano.m17279f(16, oMSBaseStyle.marginBottom) + CodedOutputByteBufferNano.m17279f(17, oMSBaseStyle.marginRight);
            List<String> list = oMSBaseStyle.bgColors;
            if (list != null) {
                iM17279f2 += CodedOutputByteBufferNano.m17285l(18, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection != null) {
                iM17279f2 += CodedOutputByteBufferNano.m17281h(19, resourceDirection.ordinal());
            }
            String str = oMSBaseStyle.borderColor;
            if (str != null) {
                iM17279f2 += CodedOutputByteBufferNano.m17288o(20, str);
            }
            int iM17279f3 = iM17279f2 + CodedOutputByteBufferNano.m17279f(21, oMSBaseStyle.borderWidth) + CodedOutputByteBufferNano.m17279f(22, oMSBaseStyle.cornerRadius);
            OMSLocationType oMSLocationType = oMSBaseStyle.alignment;
            if (oMSLocationType != null) {
                iM17279f3 += CodedOutputByteBufferNano.m17281h(23, oMSLocationType.ordinal());
            }
            List<OMSLocationType> list2 = oMSBaseStyle.location;
            if (list2 != null) {
                iM17279f3 += CodedOutputByteBufferNano.m17285l(24, OMSLocationType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17279f3 + CodedOutputByteBufferNano.m17281h(25, oMSBaseStyle.numberOfLines) + CodedOutputByteBufferNano.m17279f(26, oMSBaseStyle.lineSpacing);
            OMSImageScaleType oMSImageScaleType = oMSBaseStyle.scaleType;
            if (oMSImageScaleType != null) {
                iM17281h += CodedOutputByteBufferNano.m17281h(27, oMSImageScaleType.ordinal());
            }
            int iM17279f4 = iM17281h + CodedOutputByteBufferNano.m17279f(28, oMSBaseStyle.leftCapWidth) + CodedOutputByteBufferNano.m17279f(29, oMSBaseStyle.topCapHeight) + CodedOutputByteBufferNano.m17279f(30, oMSBaseStyle.leftCapLayoutWidth) + CodedOutputByteBufferNano.m17279f(31, oMSBaseStyle.topCapLayoutHeight) + CodedOutputByteBufferNano.m17279f(32, oMSBaseStyle.spacing);
            OMSLocationType oMSLocationType2 = oMSBaseStyle.distribution;
            if (oMSLocationType2 != null) {
                iM17279f4 += CodedOutputByteBufferNano.m17281h(33, oMSLocationType2.ordinal());
            }
            List<Integer> list3 = oMSBaseStyle.imageSize;
            if (list3 != null) {
                iM17279f4 += CodedOutputByteBufferNano.m17285l(34, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17279f5 = iM17279f4 + CodedOutputByteBufferNano.m17279f(35, oMSBaseStyle.offsetX) + CodedOutputByteBufferNano.m17279f(36, oMSBaseStyle.offsetY);
            ResourceDirection resourceDirection2 = oMSBaseStyle.direction;
            if (resourceDirection2 != null) {
                iM17279f5 += CodedOutputByteBufferNano.m17281h(37, resourceDirection2.ordinal());
            }
            int iM17275b = iM17279f5 + CodedOutputByteBufferNano.m17275b(38, oMSBaseStyle.autoSwitch) + CodedOutputByteBufferNano.m17275b(39, oMSBaseStyle.canSlide) + CodedOutputByteBufferNano.m17281h(40, oMSBaseStyle.stayTime) + CodedOutputByteBufferNano.m17281h(41, oMSBaseStyle.autoSwitchTime) + CodedOutputByteBufferNano.m17275b(42, oMSBaseStyle.showIndicator);
            String str2 = oMSBaseStyle.indicatorColor;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(43, str2);
            }
            String str3 = oMSBaseStyle.indicatorBgColor;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(44, str3);
            }
            int iM17279f6 = iM17275b + CodedOutputByteBufferNano.m17279f(45, oMSBaseStyle.indicatorRadius) + CodedOutputByteBufferNano.m17279f(46, oMSBaseStyle.blurRadius);
            String str4 = oMSBaseStyle.blurColor;
            if (str4 != null) {
                iM17279f6 += CodedOutputByteBufferNano.m17288o(47, str4);
            }
            String str5 = oMSBaseStyle.shadowColor;
            if (str5 != null) {
                iM17279f6 += CodedOutputByteBufferNano.m17288o(48, str5);
            }
            int iM17279f7 = iM17279f6 + CodedOutputByteBufferNano.m17279f(49, oMSBaseStyle.shadowRadius) + CodedOutputByteBufferNano.m17279f(50, oMSBaseStyle.shadowOpacity);
            OMSUIType oMSUIType = oMSBaseStyle.uiType;
            if (oMSUIType != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17281h(51, oMSUIType.ordinal());
            }
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            if (oMSSizeType3 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(52, oMSSizeType3, OMSSizeType.PROTOBUF_ADAPTER);
            }
            OMSSizeType oMSSizeType4 = oMSBaseStyle.heightType;
            if (oMSSizeType4 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(53, oMSSizeType4, OMSSizeType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection3 = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection3 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(54, resourceDirection3, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType3 = oMSBaseStyle.alignment;
            if (oMSLocationType3 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(55, oMSLocationType3, OMSLocationType.PROTOBUF_ADAPTER);
            }
            List<OMSLocationType> list4 = oMSBaseStyle.location;
            if (list4 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(56, list4, OMSLocationType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSImageScaleType oMSImageScaleType2 = oMSBaseStyle.scaleType;
            if (oMSImageScaleType2 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(57, oMSImageScaleType2, OMSImageScaleType.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType4 = oMSBaseStyle.distribution;
            if (oMSLocationType4 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(58, oMSLocationType4, OMSLocationType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection4 = oMSBaseStyle.direction;
            if (resourceDirection4 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(59, resourceDirection4, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSUIType oMSUIType2 = oMSBaseStyle.uiType;
            if (oMSUIType2 != null) {
                iM17279f7 += CodedOutputByteBufferNano.m17285l(60, oMSUIType2, OMSUIType.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17279f7 + CodedOutputByteBufferNano.m17275b(61, oMSBaseStyle.checked);
            oMSBaseStyle.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSBaseStyle parse(nc5 nc5Var) throws IOException {
            OMSBaseStyle oMSBaseStyle = new OMSBaseStyle();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            Integer numValueOf4 = null;
            List list = null;
            Integer numValueOf5 = null;
            Integer numValueOf6 = null;
            Integer numValueOf7 = null;
            Integer numValueOf8 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (oMSBaseStyle.widthType == null && numValueOf != null) {
                            oMSBaseStyle.widthType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSBaseStyle.heightType == null && numValueOf2 != null) {
                            oMSBaseStyle.heightType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSBaseStyle.bgColorsDirection == null && numValueOf3 != null) {
                            oMSBaseStyle.bgColorsDirection = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (oMSBaseStyle.alignment == null && numValueOf4 != null) {
                            oMSBaseStyle.alignment = (OMSLocationType) OMSLocationType.JSON_ADAPTER.newTEnum(null, numValueOf4.intValue());
                        }
                        if (oMSBaseStyle.location == null && list != null) {
                            oMSBaseStyle.location = OMSLocationType.oldEnumCovertList(list);
                        }
                        if (oMSBaseStyle.scaleType == null && numValueOf5 != null) {
                            oMSBaseStyle.scaleType = (OMSImageScaleType) OMSImageScaleType.JSON_ADAPTER.newTEnum(null, numValueOf5.intValue());
                        }
                        if (oMSBaseStyle.distribution == null && numValueOf6 != null) {
                            oMSBaseStyle.distribution = (OMSLocationType) OMSLocationType.JSON_ADAPTER.newTEnum(null, numValueOf6.intValue());
                        }
                        if (oMSBaseStyle.direction == null && numValueOf7 != null) {
                            oMSBaseStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf7.intValue());
                        }
                        if (oMSBaseStyle.uiType == null && numValueOf8 != null) {
                            oMSBaseStyle.uiType = (OMSUIType) OMSUIType.JSON_ADAPTER.newTEnum(null, numValueOf8.intValue());
                        }
                        if (oMSBaseStyle.widthType == null) {
                            oMSBaseStyle.widthType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.heightType == null) {
                            oMSBaseStyle.heightType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.bgColors == null) {
                            oMSBaseStyle.bgColors = new ArrayList();
                        }
                        if (oMSBaseStyle.bgColorsDirection == null) {
                            oMSBaseStyle.bgColorsDirection = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.borderColor == null) {
                            oMSBaseStyle.borderColor = "";
                        }
                        if (oMSBaseStyle.alignment == null) {
                            oMSBaseStyle.alignment = (OMSLocationType) OMSLocationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.location == null) {
                            oMSBaseStyle.location = new ArrayList();
                        }
                        if (oMSBaseStyle.scaleType == null) {
                            oMSBaseStyle.scaleType = (OMSImageScaleType) OMSImageScaleType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.distribution == null) {
                            oMSBaseStyle.distribution = (OMSLocationType) OMSLocationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.imageSize == null) {
                            oMSBaseStyle.imageSize = new ArrayList();
                        }
                        if (oMSBaseStyle.direction == null) {
                            oMSBaseStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.indicatorColor == null) {
                            oMSBaseStyle.indicatorColor = "";
                        }
                        if (oMSBaseStyle.indicatorBgColor == null) {
                            oMSBaseStyle.indicatorBgColor = "";
                        }
                        if (oMSBaseStyle.blurColor == null) {
                            oMSBaseStyle.blurColor = "";
                        }
                        if (oMSBaseStyle.shadowColor == null) {
                            oMSBaseStyle.shadowColor = "";
                        }
                        if (oMSBaseStyle.uiType == null) {
                            oMSBaseStyle.uiType = (OMSUIType) OMSUIType.JSON_ADAPTER.defaultEnum();
                        }
                        break;
                    case 13:
                        oMSBaseStyle.width = nc5Var.m162485i();
                        continue;
                    case 21:
                        oMSBaseStyle.height = nc5Var.m162485i();
                        continue;
                    case 29:
                        oMSBaseStyle.minWidth = nc5Var.m162485i();
                        continue;
                    case 37:
                        oMSBaseStyle.minHeight = nc5Var.m162485i();
                        continue;
                    case 45:
                        oMSBaseStyle.maxWidth = nc5Var.m162485i();
                        continue;
                    case 53:
                        oMSBaseStyle.maxHeight = nc5Var.m162485i();
                        continue;
                    case 56:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 64:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 77:
                        oMSBaseStyle.ratio = nc5Var.m162485i();
                        continue;
                    case 85:
                        oMSBaseStyle.paddingTop = nc5Var.m162485i();
                        continue;
                    case EACTags.HEADER_LIST /* 93 */:
                        oMSBaseStyle.paddingLeft = nc5Var.m162485i();
                        continue;
                    case 101:
                        oMSBaseStyle.paddingBottom = nc5Var.m162485i();
                        continue;
                    case 109:
                        oMSBaseStyle.paddingRight = nc5Var.m162485i();
                        continue;
                    case 117:
                        oMSBaseStyle.marginTop = nc5Var.m162485i();
                        continue;
                    case 125:
                        oMSBaseStyle.marginLeft = nc5Var.m162485i();
                        continue;
                    case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA /* 133 */:
                        oMSBaseStyle.marginBottom = nc5Var.m162485i();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                        oMSBaseStyle.marginRight = nc5Var.m162485i();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        oMSBaseStyle.bgColors = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA /* 152 */:
                        numValueOf3 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 162:
                        oMSBaseStyle.borderColor = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                        oMSBaseStyle.borderWidth = nc5Var.m162485i();
                        continue;
                    case 181:
                        oMSBaseStyle.cornerRadius = nc5Var.m162485i();
                        continue;
                    case 184:
                        numValueOf4 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        list = (List) nc5Var.m162488l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 200:
                        oMSBaseStyle.numberOfLines = nc5Var.m162486j();
                        continue;
                    case 213:
                        oMSBaseStyle.lineSpacing = nc5Var.m162485i();
                        continue;
                    case 216:
                        numValueOf5 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 229:
                        oMSBaseStyle.leftCapWidth = nc5Var.m162485i();
                        continue;
                    case 237:
                        oMSBaseStyle.topCapHeight = nc5Var.m162485i();
                        continue;
                    case 245:
                        oMSBaseStyle.leftCapLayoutWidth = nc5Var.m162485i();
                        continue;
                    case 253:
                        oMSBaseStyle.topCapLayoutHeight = nc5Var.m162485i();
                        continue;
                    case 261:
                        oMSBaseStyle.spacing = nc5Var.m162485i();
                        continue;
                    case 264:
                        numValueOf6 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 274:
                        oMSBaseStyle.imageSize = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 285:
                        oMSBaseStyle.offsetX = nc5Var.m162485i();
                        continue;
                    case 293:
                        oMSBaseStyle.offsetY = nc5Var.m162485i();
                        continue;
                    case 296:
                        numValueOf7 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case HttpStatus.NOT_MODIFIED_304 /* 304 */:
                        oMSBaseStyle.autoSwitch = nc5Var.m162483g();
                        continue;
                    case 312:
                        oMSBaseStyle.canSlide = nc5Var.m162483g();
                        continue;
                    case 320:
                        oMSBaseStyle.stayTime = nc5Var.m162486j();
                        continue;
                    case 328:
                        oMSBaseStyle.autoSwitchTime = nc5Var.m162486j();
                        continue;
                    case 336:
                        oMSBaseStyle.showIndicator = nc5Var.m162483g();
                        continue;
                    case 346:
                        oMSBaseStyle.indicatorColor = nc5Var.m162495s();
                        continue;
                    case 354:
                        oMSBaseStyle.indicatorBgColor = nc5Var.m162495s();
                        continue;
                    case 365:
                        oMSBaseStyle.indicatorRadius = nc5Var.m162485i();
                        continue;
                    case 373:
                        oMSBaseStyle.blurRadius = nc5Var.m162485i();
                        continue;
                    case 378:
                        oMSBaseStyle.blurColor = nc5Var.m162495s();
                        continue;
                    case 386:
                        oMSBaseStyle.shadowColor = nc5Var.m162495s();
                        continue;
                    case 397:
                        oMSBaseStyle.shadowRadius = nc5Var.m162485i();
                        continue;
                    case HttpStatus.METHOD_NOT_ALLOWED_405 /* 405 */:
                        oMSBaseStyle.shadowOpacity = nc5Var.m162485i();
                        continue;
                    case HttpStatus.REQUEST_TIMEOUT_408 /* 408 */:
                        numValueOf8 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 418:
                        oMSBaseStyle.widthType = (OMSSizeType) nc5Var.m162488l(OMSSizeType.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        oMSBaseStyle.heightType = (OMSSizeType) nc5Var.m162488l(OMSSizeType.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        oMSBaseStyle.bgColorsDirection = (ResourceDirection) nc5Var.m162488l(ResourceDirection.PROTOBUF_ADAPTER);
                        continue;
                    case 442:
                        oMSBaseStyle.alignment = (OMSLocationType) nc5Var.m162488l(OMSLocationType.PROTOBUF_ADAPTER);
                        continue;
                    case 450:
                        oMSBaseStyle.location = (List) nc5Var.m162488l(OMSLocationType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 458:
                        oMSBaseStyle.scaleType = (OMSImageScaleType) nc5Var.m162488l(OMSImageScaleType.PROTOBUF_ADAPTER);
                        continue;
                    case 466:
                        oMSBaseStyle.distribution = (OMSLocationType) nc5Var.m162488l(OMSLocationType.PROTOBUF_ADAPTER);
                        continue;
                    case 474:
                        oMSBaseStyle.direction = (ResourceDirection) nc5Var.m162488l(ResourceDirection.PROTOBUF_ADAPTER);
                        continue;
                    case 482:
                        oMSBaseStyle.uiType = (OMSUIType) nc5Var.m162488l(OMSUIType.PROTOBUF_ADAPTER);
                        continue;
                    case 488:
                        oMSBaseStyle.checked = nc5Var.m162483g();
                        continue;
                    default:
                        if (oMSBaseStyle.widthType == null && numValueOf != null) {
                            oMSBaseStyle.widthType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSBaseStyle.heightType == null && numValueOf2 != null) {
                            oMSBaseStyle.heightType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (oMSBaseStyle.bgColorsDirection == null && numValueOf3 != null) {
                            oMSBaseStyle.bgColorsDirection = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (oMSBaseStyle.alignment == null && numValueOf4 != null) {
                            oMSBaseStyle.alignment = (OMSLocationType) OMSLocationType.JSON_ADAPTER.newTEnum(null, numValueOf4.intValue());
                        }
                        if (oMSBaseStyle.location == null && list != null) {
                            oMSBaseStyle.location = OMSLocationType.oldEnumCovertList(list);
                        }
                        if (oMSBaseStyle.scaleType == null && numValueOf5 != null) {
                            oMSBaseStyle.scaleType = (OMSImageScaleType) OMSImageScaleType.JSON_ADAPTER.newTEnum(null, numValueOf5.intValue());
                        }
                        if (oMSBaseStyle.distribution == null && numValueOf6 != null) {
                            oMSBaseStyle.distribution = (OMSLocationType) OMSLocationType.JSON_ADAPTER.newTEnum(null, numValueOf6.intValue());
                        }
                        if (oMSBaseStyle.direction == null && numValueOf7 != null) {
                            oMSBaseStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.newTEnum(null, numValueOf7.intValue());
                        }
                        if (oMSBaseStyle.uiType == null && numValueOf8 != null) {
                            oMSBaseStyle.uiType = (OMSUIType) OMSUIType.JSON_ADAPTER.newTEnum(null, numValueOf8.intValue());
                        }
                        if (oMSBaseStyle.widthType == null) {
                            oMSBaseStyle.widthType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.heightType == null) {
                            oMSBaseStyle.heightType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.bgColors == null) {
                            oMSBaseStyle.bgColors = new ArrayList();
                        }
                        if (oMSBaseStyle.bgColorsDirection == null) {
                            oMSBaseStyle.bgColorsDirection = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.borderColor == null) {
                            oMSBaseStyle.borderColor = "";
                        }
                        if (oMSBaseStyle.alignment == null) {
                            oMSBaseStyle.alignment = (OMSLocationType) OMSLocationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.location == null) {
                            oMSBaseStyle.location = new ArrayList();
                        }
                        if (oMSBaseStyle.scaleType == null) {
                            oMSBaseStyle.scaleType = (OMSImageScaleType) OMSImageScaleType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.distribution == null) {
                            oMSBaseStyle.distribution = (OMSLocationType) OMSLocationType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.imageSize == null) {
                            oMSBaseStyle.imageSize = new ArrayList();
                        }
                        if (oMSBaseStyle.direction == null) {
                            oMSBaseStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSBaseStyle.indicatorColor == null) {
                            oMSBaseStyle.indicatorColor = "";
                        }
                        if (oMSBaseStyle.indicatorBgColor == null) {
                            oMSBaseStyle.indicatorBgColor = "";
                        }
                        if (oMSBaseStyle.blurColor == null) {
                            oMSBaseStyle.blurColor = "";
                        }
                        if (oMSBaseStyle.shadowColor == null) {
                            oMSBaseStyle.shadowColor = "";
                        }
                        if (oMSBaseStyle.uiType == null) {
                            oMSBaseStyle.uiType = (OMSUIType) OMSUIType.JSON_ADAPTER.defaultEnum();
                            return oMSBaseStyle;
                        }
                        break;
                }
            }
            return oMSBaseStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSBaseStyle oMSBaseStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17303E(1, oMSBaseStyle.width);
            codedOutputByteBufferNano.m17303E(2, oMSBaseStyle.height);
            codedOutputByteBufferNano.m17303E(3, oMSBaseStyle.minWidth);
            codedOutputByteBufferNano.m17303E(4, oMSBaseStyle.minHeight);
            codedOutputByteBufferNano.m17303E(5, oMSBaseStyle.maxWidth);
            codedOutputByteBufferNano.m17303E(6, oMSBaseStyle.maxHeight);
            OMSSizeType oMSSizeType = oMSBaseStyle.widthType;
            if (oMSSizeType != null) {
                codedOutputByteBufferNano.m17305G(7, oMSSizeType.ordinal());
            }
            OMSSizeType oMSSizeType2 = oMSBaseStyle.heightType;
            if (oMSSizeType2 != null) {
                codedOutputByteBufferNano.m17305G(8, oMSSizeType2.ordinal());
            }
            codedOutputByteBufferNano.m17303E(9, oMSBaseStyle.ratio);
            codedOutputByteBufferNano.m17303E(10, oMSBaseStyle.paddingTop);
            codedOutputByteBufferNano.m17303E(11, oMSBaseStyle.paddingLeft);
            codedOutputByteBufferNano.m17303E(12, oMSBaseStyle.paddingBottom);
            codedOutputByteBufferNano.m17303E(13, oMSBaseStyle.paddingRight);
            codedOutputByteBufferNano.m17303E(14, oMSBaseStyle.marginTop);
            codedOutputByteBufferNano.m17303E(15, oMSBaseStyle.marginLeft);
            codedOutputByteBufferNano.m17303E(16, oMSBaseStyle.marginBottom);
            codedOutputByteBufferNano.m17303E(17, oMSBaseStyle.marginRight);
            List<String> list = oMSBaseStyle.bgColors;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(18, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection != null) {
                codedOutputByteBufferNano.m17305G(19, resourceDirection.ordinal());
            }
            String str = oMSBaseStyle.borderColor;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(20, str);
            }
            codedOutputByteBufferNano.m17303E(21, oMSBaseStyle.borderWidth);
            codedOutputByteBufferNano.m17303E(22, oMSBaseStyle.cornerRadius);
            OMSLocationType oMSLocationType = oMSBaseStyle.alignment;
            if (oMSLocationType != null) {
                codedOutputByteBufferNano.m17305G(23, oMSLocationType.ordinal());
            }
            List<OMSLocationType> list2 = oMSBaseStyle.location;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(24, OMSLocationType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(25, oMSBaseStyle.numberOfLines);
            codedOutputByteBufferNano.m17303E(26, oMSBaseStyle.lineSpacing);
            OMSImageScaleType oMSImageScaleType = oMSBaseStyle.scaleType;
            if (oMSImageScaleType != null) {
                codedOutputByteBufferNano.m17305G(27, oMSImageScaleType.ordinal());
            }
            codedOutputByteBufferNano.m17303E(28, oMSBaseStyle.leftCapWidth);
            codedOutputByteBufferNano.m17303E(29, oMSBaseStyle.topCapHeight);
            codedOutputByteBufferNano.m17303E(30, oMSBaseStyle.leftCapLayoutWidth);
            codedOutputByteBufferNano.m17303E(31, oMSBaseStyle.topCapLayoutHeight);
            codedOutputByteBufferNano.m17303E(32, oMSBaseStyle.spacing);
            OMSLocationType oMSLocationType2 = oMSBaseStyle.distribution;
            if (oMSLocationType2 != null) {
                codedOutputByteBufferNano.m17305G(33, oMSLocationType2.ordinal());
            }
            List<Integer> list3 = oMSBaseStyle.imageSize;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(34, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17303E(35, oMSBaseStyle.offsetX);
            codedOutputByteBufferNano.m17303E(36, oMSBaseStyle.offsetY);
            ResourceDirection resourceDirection2 = oMSBaseStyle.direction;
            if (resourceDirection2 != null) {
                codedOutputByteBufferNano.m17305G(37, resourceDirection2.ordinal());
            }
            codedOutputByteBufferNano.m17299A(38, oMSBaseStyle.autoSwitch);
            codedOutputByteBufferNano.m17299A(39, oMSBaseStyle.canSlide);
            codedOutputByteBufferNano.m17305G(40, oMSBaseStyle.stayTime);
            codedOutputByteBufferNano.m17305G(41, oMSBaseStyle.autoSwitchTime);
            codedOutputByteBufferNano.m17299A(42, oMSBaseStyle.showIndicator);
            String str2 = oMSBaseStyle.indicatorColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(43, str2);
            }
            String str3 = oMSBaseStyle.indicatorBgColor;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(44, str3);
            }
            codedOutputByteBufferNano.m17303E(45, oMSBaseStyle.indicatorRadius);
            codedOutputByteBufferNano.m17303E(46, oMSBaseStyle.blurRadius);
            String str4 = oMSBaseStyle.blurColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(47, str4);
            }
            String str5 = oMSBaseStyle.shadowColor;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(48, str5);
            }
            codedOutputByteBufferNano.m17303E(49, oMSBaseStyle.shadowRadius);
            codedOutputByteBufferNano.m17303E(50, oMSBaseStyle.shadowOpacity);
            OMSUIType oMSUIType = oMSBaseStyle.uiType;
            if (oMSUIType != null) {
                codedOutputByteBufferNano.m17305G(51, oMSUIType.ordinal());
            }
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            if (oMSSizeType3 != null) {
                codedOutputByteBufferNano.m17309K(52, oMSSizeType3, OMSSizeType.PROTOBUF_ADAPTER);
            }
            OMSSizeType oMSSizeType4 = oMSBaseStyle.heightType;
            if (oMSSizeType4 != null) {
                codedOutputByteBufferNano.m17309K(53, oMSSizeType4, OMSSizeType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection3 = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection3 != null) {
                codedOutputByteBufferNano.m17309K(54, resourceDirection3, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType3 = oMSBaseStyle.alignment;
            if (oMSLocationType3 != null) {
                codedOutputByteBufferNano.m17309K(55, oMSLocationType3, OMSLocationType.PROTOBUF_ADAPTER);
            }
            List<OMSLocationType> list4 = oMSBaseStyle.location;
            if (list4 != null) {
                codedOutputByteBufferNano.m17309K(56, list4, OMSLocationType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSImageScaleType oMSImageScaleType2 = oMSBaseStyle.scaleType;
            if (oMSImageScaleType2 != null) {
                codedOutputByteBufferNano.m17309K(57, oMSImageScaleType2, OMSImageScaleType.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType4 = oMSBaseStyle.distribution;
            if (oMSLocationType4 != null) {
                codedOutputByteBufferNano.m17309K(58, oMSLocationType4, OMSLocationType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection4 = oMSBaseStyle.direction;
            if (resourceDirection4 != null) {
                codedOutputByteBufferNano.m17309K(59, resourceDirection4, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSUIType oMSUIType2 = oMSBaseStyle.uiType;
            if (oMSUIType2 != null) {
                codedOutputByteBufferNano.m17309K(60, oMSUIType2, OMSUIType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(61, oMSBaseStyle.checked);
        }
    };
    public static JsonAdapter<OMSBaseStyle> JSON_ADAPTER = new ObjectJsonAdapter<OMSBaseStyle>() { // from class: com.p1.mobile.putong.data.OMSBaseStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSBaseStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSBaseStyle newInstance() {
            return new OMSBaseStyle();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(OMSBaseStyle oMSBaseStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2135499205:
                    if (str.equals("leftCapWidth")) {
                        b = 0;
                    }
                    break;
                case -2055688683:
                    if (str.equals("bgColors")) {
                        b = 1;
                    }
                    break;
                case -2012158909:
                    if (str.equals("spacing")) {
                        b = 2;
                    }
                    break;
                case -1999161540:
                    if (str.equals("blurColor")) {
                        b = 3;
                    }
                    break;
                case -1877911644:
                    if (str.equals("scaleType")) {
                        b = 4;
                    }
                    break;
                case -1795351602:
                    if (str.equals("topCapLayoutHeight")) {
                        b = 5;
                    }
                    break;
                case -1625116241:
                    if (str.equals("lineSpacing")) {
                        b = 6;
                    }
                    break;
                case -1621067310:
                    if (str.equals("shadowRadius")) {
                        b = 7;
                    }
                    break;
                case -1589741021:
                    if (str.equals("shadowColor")) {
                        b = 8;
                    }
                    break;
                case -1580708220:
                    if (str.equals("distribution")) {
                        b = 9;
                    }
                    break;
                case -1575751020:
                    if (str.equals("indicatorColor")) {
                        b = 10;
                    }
                    break;
                case -1548407259:
                    if (str.equals("offsetX")) {
                        b = 11;
                    }
                    break;
                case -1548407258:
                    if (str.equals("offsetY")) {
                        b = 12;
                    }
                    break;
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1428201511:
                    if (str.equals("blurRadius")) {
                        b = 14;
                    }
                    break;
                case -1375815020:
                    if (str.equals("minWidth")) {
                        b = 15;
                    }
                    break;
                case -1353314414:
                    if (str.equals("showIndicator")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1329887265:
                    if (str.equals("numberOfLines")) {
                        b = 17;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        b = 18;
                    }
                    break;
                case -1187377279:
                    if (str.equals("indicatorRadius")) {
                        b = 19;
                    }
                    break;
                case -1151572540:
                    if (str.equals("topCapHeight")) {
                        b = 20;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        b = 21;
                    }
                    break;
                case -962590849:
                    if (str.equals("direction")) {
                        b = 22;
                    }
                    break;
                case -949513525:
                    if (str.equals("shadowOpacity")) {
                        b = 23;
                    }
                    break;
                case -906066005:
                    if (str.equals("maxHeight")) {
                        b = 24;
                    }
                    break;
                case -878192644:
                    if (str.equals("imageSize")) {
                        b = 25;
                    }
                    break;
                case -845764626:
                    if (str.equals("uiType")) {
                        b = 26;
                    }
                    break;
                case -380157501:
                    if (str.equals("autoSwitch")) {
                        b = 27;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        b = 28;
                    }
                    break;
                case -137744447:
                    if (str.equals("canSlide")) {
                        b = 29;
                    }
                    break;
                case -133587431:
                    if (str.equals("minHeight")) {
                        b = 30;
                    }
                    break;
                case -51519968:
                    if (str.equals("widthType")) {
                        b = 31;
                    }
                    break;
                case 78802736:
                    if (str.equals("autoSwitchTime")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        b = 33;
                    }
                    break;
                case 108285963:
                    if (str.equals(OMSSizeType.ratio)) {
                        b = 34;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        b = 35;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        b = 36;
                    }
                    break;
                case 224293233:
                    if (str.equals("leftCapLayoutWidth")) {
                        b = 37;
                    }
                    break;
                case 400381634:
                    if (str.equals("maxWidth")) {
                        b = 38;
                    }
                    break;
                case 583595847:
                    if (str.equals("cornerRadius")) {
                        b = 39;
                    }
                    break;
                case 672321807:
                    if (str.equals("indicatorBgColor")) {
                        b = 40;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        b = 41;
                    }
                    break;
                case 722830999:
                    if (str.equals("borderColor")) {
                        b = 42;
                    }
                    break;
                case 741115130:
                    if (str.equals("borderWidth")) {
                        b = 43;
                    }
                    break;
                case 742313895:
                    if (str.equals("checked")) {
                        b = 44;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        b = 45;
                    }
                    break;
                case 1322318022:
                    if (str.equals("stayTime")) {
                        b = 46;
                    }
                    break;
                case 1417904362:
                    if (str.equals("bgColorsDirection")) {
                        b = 47;
                    }
                    break;
                case 1490397441:
                    if (str.equals("heightType")) {
                        b = 48;
                    }
                    break;
                case 1767875043:
                    if (str.equals("alignment")) {
                        b = 49;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 50;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        b = 51;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    oMSBaseStyle.leftCapWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case 1:
                    oMSBaseStyle.bgColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    oMSBaseStyle.spacing = (float) jsonParser.getValueAsDouble();
                    return true;
                case 3:
                    oMSBaseStyle.blurColor = jsonParser.getValueAsString();
                    return true;
                case 4:
                    oMSBaseStyle.scaleType = OMSImageScaleType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 5:
                    oMSBaseStyle.topCapLayoutHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case 6:
                    oMSBaseStyle.lineSpacing = (float) jsonParser.getValueAsDouble();
                    return true;
                case 7:
                    oMSBaseStyle.shadowRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case 8:
                    oMSBaseStyle.shadowColor = jsonParser.getValueAsString();
                    return true;
                case 9:
                    oMSBaseStyle.distribution = OMSLocationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 10:
                    oMSBaseStyle.indicatorColor = jsonParser.getValueAsString();
                    return true;
                case 11:
                    oMSBaseStyle.offsetX = (float) jsonParser.getValueAsDouble();
                    return true;
                case 12:
                    oMSBaseStyle.offsetY = (float) jsonParser.getValueAsDouble();
                    return true;
                case 13:
                    oMSBaseStyle.paddingLeft = (float) jsonParser.getValueAsDouble();
                    return true;
                case 14:
                    oMSBaseStyle.blurRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case 15:
                    oMSBaseStyle.minWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case 16:
                    oMSBaseStyle.showIndicator = jsonParser.getValueAsBoolean();
                    return true;
                case 17:
                    oMSBaseStyle.numberOfLines = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    oMSBaseStyle.height = (float) jsonParser.getValueAsDouble();
                    return true;
                case 19:
                    oMSBaseStyle.indicatorRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case 20:
                    oMSBaseStyle.topCapHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case 21:
                    oMSBaseStyle.marginTop = (float) jsonParser.getValueAsDouble();
                    return true;
                case 22:
                    oMSBaseStyle.direction = ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 23:
                    oMSBaseStyle.shadowOpacity = (float) jsonParser.getValueAsDouble();
                    return true;
                case 24:
                    oMSBaseStyle.maxHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case 25:
                    oMSBaseStyle.imageSize = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 26:
                    oMSBaseStyle.uiType = OMSUIType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 27:
                    oMSBaseStyle.autoSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case 28:
                    oMSBaseStyle.marginBottom = (float) jsonParser.getValueAsDouble();
                    return true;
                case 29:
                    oMSBaseStyle.canSlide = jsonParser.getValueAsBoolean();
                    return true;
                case 30:
                    oMSBaseStyle.minHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case 31:
                    oMSBaseStyle.widthType = OMSSizeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 32:
                    oMSBaseStyle.autoSwitchTime = jsonParser.getValueAsInt();
                    return true;
                case 33:
                    oMSBaseStyle.paddingTop = (float) jsonParser.getValueAsDouble();
                    return true;
                case 34:
                    oMSBaseStyle.ratio = (float) jsonParser.getValueAsDouble();
                    return true;
                case 35:
                    oMSBaseStyle.width = (float) jsonParser.getValueAsDouble();
                    return true;
                case 36:
                    oMSBaseStyle.paddingBottom = (float) jsonParser.getValueAsDouble();
                    return true;
                case 37:
                    oMSBaseStyle.leftCapLayoutWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case 38:
                    oMSBaseStyle.maxWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case 39:
                    oMSBaseStyle.cornerRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case 40:
                    oMSBaseStyle.indicatorBgColor = jsonParser.getValueAsString();
                    return true;
                case 41:
                    oMSBaseStyle.paddingRight = (float) jsonParser.getValueAsDouble();
                    return true;
                case 42:
                    oMSBaseStyle.borderColor = jsonParser.getValueAsString();
                    return true;
                case 43:
                    oMSBaseStyle.borderWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case 44:
                    oMSBaseStyle.checked = jsonParser.getValueAsBoolean();
                    return true;
                case 45:
                    oMSBaseStyle.marginRight = (float) jsonParser.getValueAsDouble();
                    return true;
                case 46:
                    oMSBaseStyle.stayTime = jsonParser.getValueAsInt();
                    return true;
                case 47:
                    oMSBaseStyle.bgColorsDirection = ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 48:
                    oMSBaseStyle.heightType = OMSSizeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 49:
                    oMSBaseStyle.alignment = OMSLocationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 50:
                    oMSBaseStyle.location = JsonAdapter.parseArray(jsonParser, OMSLocationType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 51:
                    oMSBaseStyle.marginLeft = (float) jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(OMSBaseStyle oMSBaseStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2135499205:
                    if (str.equals("leftCapWidth")) {
                        b = 0;
                    }
                    break;
                case -2055688683:
                    if (str.equals("bgColors")) {
                        b = 1;
                    }
                    break;
                case -2012158909:
                    if (str.equals("spacing")) {
                        b = 2;
                    }
                    break;
                case -1999161540:
                    if (str.equals("blurColor")) {
                        b = 3;
                    }
                    break;
                case -1877911644:
                    if (str.equals("scaleType")) {
                        b = 4;
                    }
                    break;
                case -1795351602:
                    if (str.equals("topCapLayoutHeight")) {
                        b = 5;
                    }
                    break;
                case -1625116241:
                    if (str.equals("lineSpacing")) {
                        b = 6;
                    }
                    break;
                case -1621067310:
                    if (str.equals("shadowRadius")) {
                        b = 7;
                    }
                    break;
                case -1589741021:
                    if (str.equals("shadowColor")) {
                        b = 8;
                    }
                    break;
                case -1580708220:
                    if (str.equals("distribution")) {
                        b = 9;
                    }
                    break;
                case -1575751020:
                    if (str.equals("indicatorColor")) {
                        b = 10;
                    }
                    break;
                case -1548407259:
                    if (str.equals("offsetX")) {
                        b = 11;
                    }
                    break;
                case -1548407258:
                    if (str.equals("offsetY")) {
                        b = 12;
                    }
                    break;
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case -1428201511:
                    if (str.equals("blurRadius")) {
                        b = 14;
                    }
                    break;
                case -1375815020:
                    if (str.equals("minWidth")) {
                        b = 15;
                    }
                    break;
                case -1353314414:
                    if (str.equals("showIndicator")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case -1329887265:
                    if (str.equals("numberOfLines")) {
                        b = 17;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        b = 18;
                    }
                    break;
                case -1187377279:
                    if (str.equals("indicatorRadius")) {
                        b = 19;
                    }
                    break;
                case -1151572540:
                    if (str.equals("topCapHeight")) {
                        b = 20;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        b = 21;
                    }
                    break;
                case -962590849:
                    if (str.equals("direction")) {
                        b = 22;
                    }
                    break;
                case -949513525:
                    if (str.equals("shadowOpacity")) {
                        b = 23;
                    }
                    break;
                case -906066005:
                    if (str.equals("maxHeight")) {
                        b = 24;
                    }
                    break;
                case -878192644:
                    if (str.equals("imageSize")) {
                        b = 25;
                    }
                    break;
                case -845764626:
                    if (str.equals("uiType")) {
                        b = 26;
                    }
                    break;
                case -380157501:
                    if (str.equals("autoSwitch")) {
                        b = 27;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        b = 28;
                    }
                    break;
                case -137744447:
                    if (str.equals("canSlide")) {
                        b = 29;
                    }
                    break;
                case -133587431:
                    if (str.equals("minHeight")) {
                        b = 30;
                    }
                    break;
                case -51519968:
                    if (str.equals("widthType")) {
                        b = 31;
                    }
                    break;
                case 78802736:
                    if (str.equals("autoSwitchTime")) {
                        b = HttpTokens.SPACE;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        b = 33;
                    }
                    break;
                case 108285963:
                    if (str.equals(OMSSizeType.ratio)) {
                        b = 34;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        b = 35;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        b = 36;
                    }
                    break;
                case 224293233:
                    if (str.equals("leftCapLayoutWidth")) {
                        b = 37;
                    }
                    break;
                case 400381634:
                    if (str.equals("maxWidth")) {
                        b = 38;
                    }
                    break;
                case 583595847:
                    if (str.equals("cornerRadius")) {
                        b = 39;
                    }
                    break;
                case 672321807:
                    if (str.equals("indicatorBgColor")) {
                        b = 40;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        b = 41;
                    }
                    break;
                case 722830999:
                    if (str.equals("borderColor")) {
                        b = 42;
                    }
                    break;
                case 741115130:
                    if (str.equals("borderWidth")) {
                        b = 43;
                    }
                    break;
                case 742313895:
                    if (str.equals("checked")) {
                        b = 44;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        b = 45;
                    }
                    break;
                case 1322318022:
                    if (str.equals("stayTime")) {
                        b = 46;
                    }
                    break;
                case 1417904362:
                    if (str.equals("bgColorsDirection")) {
                        b = 47;
                    }
                    break;
                case 1490397441:
                    if (str.equals("heightType")) {
                        b = 48;
                    }
                    break;
                case 1767875043:
                    if (str.equals("alignment")) {
                        b = 49;
                    }
                    break;
                case 1901043637:
                    if (str.equals("location")) {
                        b = 50;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        b = 51;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                    return true;
                default:
                    return super.parseFieldCheck(oMSBaseStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSBaseStyle oMSBaseStyle, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("width", oMSBaseStyle.width);
            jsonGenerator.writeNumberField("height", oMSBaseStyle.height);
            jsonGenerator.writeNumberField("minWidth", oMSBaseStyle.minWidth);
            jsonGenerator.writeNumberField("minHeight", oMSBaseStyle.minHeight);
            jsonGenerator.writeNumberField("maxWidth", oMSBaseStyle.maxWidth);
            jsonGenerator.writeNumberField("maxHeight", oMSBaseStyle.maxHeight);
            if (oMSBaseStyle.widthType != null) {
                jsonGenerator.writeFieldName("widthType");
                OMSSizeType.JSON_ADAPTER.serialize(oMSBaseStyle.widthType, jsonGenerator, true);
            }
            if (oMSBaseStyle.heightType != null) {
                jsonGenerator.writeFieldName("heightType");
                OMSSizeType.JSON_ADAPTER.serialize(oMSBaseStyle.heightType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(OMSSizeType.ratio, oMSBaseStyle.ratio);
            jsonGenerator.writeNumberField("paddingTop", oMSBaseStyle.paddingTop);
            jsonGenerator.writeNumberField("paddingLeft", oMSBaseStyle.paddingLeft);
            jsonGenerator.writeNumberField("paddingBottom", oMSBaseStyle.paddingBottom);
            jsonGenerator.writeNumberField("paddingRight", oMSBaseStyle.paddingRight);
            jsonGenerator.writeNumberField("marginTop", oMSBaseStyle.marginTop);
            jsonGenerator.writeNumberField("marginLeft", oMSBaseStyle.marginLeft);
            jsonGenerator.writeNumberField("marginBottom", oMSBaseStyle.marginBottom);
            jsonGenerator.writeNumberField("marginRight", oMSBaseStyle.marginRight);
            if (oMSBaseStyle.bgColors != null) {
                jsonGenerator.writeFieldName("bgColors");
                JsonAdapter.serializeArray(oMSBaseStyle.bgColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSBaseStyle.bgColorsDirection != null) {
                jsonGenerator.writeFieldName("bgColorsDirection");
                ResourceDirection.JSON_ADAPTER.serialize(oMSBaseStyle.bgColorsDirection, jsonGenerator, true);
            }
            String str = oMSBaseStyle.borderColor;
            if (str != null) {
                jsonGenerator.writeStringField("borderColor", str);
            }
            jsonGenerator.writeNumberField("borderWidth", oMSBaseStyle.borderWidth);
            jsonGenerator.writeNumberField("cornerRadius", oMSBaseStyle.cornerRadius);
            if (oMSBaseStyle.alignment != null) {
                jsonGenerator.writeFieldName("alignment");
                OMSLocationType.JSON_ADAPTER.serialize(oMSBaseStyle.alignment, jsonGenerator, true);
            }
            if (oMSBaseStyle.location != null) {
                jsonGenerator.writeFieldName("location");
                JsonAdapter.serializeArray(oMSBaseStyle.location, jsonGenerator, OMSLocationType.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("numberOfLines", oMSBaseStyle.numberOfLines);
            jsonGenerator.writeNumberField("lineSpacing", oMSBaseStyle.lineSpacing);
            if (oMSBaseStyle.scaleType != null) {
                jsonGenerator.writeFieldName("scaleType");
                OMSImageScaleType.JSON_ADAPTER.serialize(oMSBaseStyle.scaleType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("leftCapWidth", oMSBaseStyle.leftCapWidth);
            jsonGenerator.writeNumberField("topCapHeight", oMSBaseStyle.topCapHeight);
            jsonGenerator.writeNumberField("leftCapLayoutWidth", oMSBaseStyle.leftCapLayoutWidth);
            jsonGenerator.writeNumberField("topCapLayoutHeight", oMSBaseStyle.topCapLayoutHeight);
            jsonGenerator.writeNumberField("spacing", oMSBaseStyle.spacing);
            if (oMSBaseStyle.distribution != null) {
                jsonGenerator.writeFieldName("distribution");
                OMSLocationType.JSON_ADAPTER.serialize(oMSBaseStyle.distribution, jsonGenerator, true);
            }
            if (oMSBaseStyle.imageSize != null) {
                jsonGenerator.writeFieldName("imageSize");
                JsonAdapter.serializeArray(oMSBaseStyle.imageSize, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("offsetX", oMSBaseStyle.offsetX);
            jsonGenerator.writeNumberField("offsetY", oMSBaseStyle.offsetY);
            if (oMSBaseStyle.direction != null) {
                jsonGenerator.writeFieldName("direction");
                ResourceDirection.JSON_ADAPTER.serialize(oMSBaseStyle.direction, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("autoSwitch", oMSBaseStyle.autoSwitch);
            jsonGenerator.writeBooleanField("canSlide", oMSBaseStyle.canSlide);
            jsonGenerator.writeNumberField("stayTime", oMSBaseStyle.stayTime);
            jsonGenerator.writeNumberField("autoSwitchTime", oMSBaseStyle.autoSwitchTime);
            jsonGenerator.writeBooleanField("showIndicator", oMSBaseStyle.showIndicator);
            String str2 = oMSBaseStyle.indicatorColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("indicatorColor", str2);
            }
            String str3 = oMSBaseStyle.indicatorBgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("indicatorBgColor", str3);
            }
            jsonGenerator.writeNumberField("indicatorRadius", oMSBaseStyle.indicatorRadius);
            jsonGenerator.writeNumberField("blurRadius", oMSBaseStyle.blurRadius);
            String str4 = oMSBaseStyle.blurColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("blurColor", str4);
            }
            String str5 = oMSBaseStyle.shadowColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("shadowColor", str5);
            }
            jsonGenerator.writeNumberField("shadowRadius", oMSBaseStyle.shadowRadius);
            jsonGenerator.writeNumberField("shadowOpacity", oMSBaseStyle.shadowOpacity);
            if (oMSBaseStyle.uiType != null) {
                jsonGenerator.writeFieldName("uiType");
                OMSUIType.JSON_ADAPTER.serialize(oMSBaseStyle.uiType, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("checked", oMSBaseStyle.checked);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSBaseStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSBaseStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61067a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ OMSLocationType m61068b(OMSLocationType oMSLocationType) {
        return oMSLocationType;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m61069c(Integer num) {
        return num;
    }

    public static OMSBaseStyle new_() {
        OMSBaseStyle oMSBaseStyle = new OMSBaseStyle();
        oMSBaseStyle.nullCheck();
        return oMSBaseStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSBaseStyle mo225055clone() {
        OMSBaseStyle oMSBaseStyle = new OMSBaseStyle();
        oMSBaseStyle.width = this.width;
        oMSBaseStyle.height = this.height;
        oMSBaseStyle.minWidth = this.minWidth;
        oMSBaseStyle.minHeight = this.minHeight;
        oMSBaseStyle.maxWidth = this.maxWidth;
        oMSBaseStyle.maxHeight = this.maxHeight;
        oMSBaseStyle.widthType = this.widthType;
        oMSBaseStyle.heightType = this.heightType;
        oMSBaseStyle.ratio = this.ratio;
        oMSBaseStyle.paddingTop = this.paddingTop;
        oMSBaseStyle.paddingLeft = this.paddingLeft;
        oMSBaseStyle.paddingBottom = this.paddingBottom;
        oMSBaseStyle.paddingRight = this.paddingRight;
        oMSBaseStyle.marginTop = this.marginTop;
        oMSBaseStyle.marginLeft = this.marginLeft;
        oMSBaseStyle.marginBottom = this.marginBottom;
        oMSBaseStyle.marginRight = this.marginRight;
        List<String> list = this.bgColors;
        if (list != null) {
            oMSBaseStyle.bgColors = ValueObject.util_map(list, new qcj() { // from class: l.o650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSBaseStyle.m61067a((String) obj);
                }
            });
        }
        oMSBaseStyle.bgColorsDirection = this.bgColorsDirection;
        oMSBaseStyle.borderColor = this.borderColor;
        oMSBaseStyle.borderWidth = this.borderWidth;
        oMSBaseStyle.cornerRadius = this.cornerRadius;
        oMSBaseStyle.alignment = this.alignment;
        List<OMSLocationType> list2 = this.location;
        if (list2 != null) {
            oMSBaseStyle.location = ValueObject.util_map(list2, new qcj() { // from class: l.p650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSBaseStyle.m61068b((OMSLocationType) obj);
                }
            });
        }
        oMSBaseStyle.numberOfLines = this.numberOfLines;
        oMSBaseStyle.lineSpacing = this.lineSpacing;
        oMSBaseStyle.scaleType = this.scaleType;
        oMSBaseStyle.leftCapWidth = this.leftCapWidth;
        oMSBaseStyle.topCapHeight = this.topCapHeight;
        oMSBaseStyle.leftCapLayoutWidth = this.leftCapLayoutWidth;
        oMSBaseStyle.topCapLayoutHeight = this.topCapLayoutHeight;
        oMSBaseStyle.spacing = this.spacing;
        oMSBaseStyle.distribution = this.distribution;
        List<Integer> list3 = this.imageSize;
        if (list3 != null) {
            oMSBaseStyle.imageSize = ValueObject.util_map(list3, new qcj() { // from class: l.q650
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSBaseStyle.m61069c((Integer) obj);
                }
            });
        }
        oMSBaseStyle.offsetX = this.offsetX;
        oMSBaseStyle.offsetY = this.offsetY;
        oMSBaseStyle.direction = this.direction;
        oMSBaseStyle.autoSwitch = this.autoSwitch;
        oMSBaseStyle.canSlide = this.canSlide;
        oMSBaseStyle.stayTime = this.stayTime;
        oMSBaseStyle.autoSwitchTime = this.autoSwitchTime;
        oMSBaseStyle.showIndicator = this.showIndicator;
        oMSBaseStyle.indicatorColor = this.indicatorColor;
        oMSBaseStyle.indicatorBgColor = this.indicatorBgColor;
        oMSBaseStyle.indicatorRadius = this.indicatorRadius;
        oMSBaseStyle.blurRadius = this.blurRadius;
        oMSBaseStyle.blurColor = this.blurColor;
        oMSBaseStyle.shadowColor = this.shadowColor;
        oMSBaseStyle.shadowRadius = this.shadowRadius;
        oMSBaseStyle.shadowOpacity = this.shadowOpacity;
        oMSBaseStyle.uiType = this.uiType;
        oMSBaseStyle.checked = this.checked;
        return oMSBaseStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSBaseStyle)) {
            return false;
        }
        OMSBaseStyle oMSBaseStyle = (OMSBaseStyle) obj;
        return this.width == oMSBaseStyle.width && this.height == oMSBaseStyle.height && this.minWidth == oMSBaseStyle.minWidth && this.minHeight == oMSBaseStyle.minHeight && this.maxWidth == oMSBaseStyle.maxWidth && this.maxHeight == oMSBaseStyle.maxHeight && ValueObject.util_equals(this.widthType, oMSBaseStyle.widthType) && ValueObject.util_equals(this.heightType, oMSBaseStyle.heightType) && this.ratio == oMSBaseStyle.ratio && this.paddingTop == oMSBaseStyle.paddingTop && this.paddingLeft == oMSBaseStyle.paddingLeft && this.paddingBottom == oMSBaseStyle.paddingBottom && this.paddingRight == oMSBaseStyle.paddingRight && this.marginTop == oMSBaseStyle.marginTop && this.marginLeft == oMSBaseStyle.marginLeft && this.marginBottom == oMSBaseStyle.marginBottom && this.marginRight == oMSBaseStyle.marginRight && ValueObject.util_equals(this.bgColors, oMSBaseStyle.bgColors) && ValueObject.util_equals(this.bgColorsDirection, oMSBaseStyle.bgColorsDirection) && ValueObject.util_equals(this.borderColor, oMSBaseStyle.borderColor) && this.borderWidth == oMSBaseStyle.borderWidth && this.cornerRadius == oMSBaseStyle.cornerRadius && ValueObject.util_equals(this.alignment, oMSBaseStyle.alignment) && ValueObject.util_equals(this.location, oMSBaseStyle.location) && this.numberOfLines == oMSBaseStyle.numberOfLines && this.lineSpacing == oMSBaseStyle.lineSpacing && ValueObject.util_equals(this.scaleType, oMSBaseStyle.scaleType) && this.leftCapWidth == oMSBaseStyle.leftCapWidth && this.topCapHeight == oMSBaseStyle.topCapHeight && this.leftCapLayoutWidth == oMSBaseStyle.leftCapLayoutWidth && this.topCapLayoutHeight == oMSBaseStyle.topCapLayoutHeight && this.spacing == oMSBaseStyle.spacing && ValueObject.util_equals(this.distribution, oMSBaseStyle.distribution) && ValueObject.util_equals(this.imageSize, oMSBaseStyle.imageSize) && this.offsetX == oMSBaseStyle.offsetX && this.offsetY == oMSBaseStyle.offsetY && ValueObject.util_equals(this.direction, oMSBaseStyle.direction) && this.autoSwitch == oMSBaseStyle.autoSwitch && this.canSlide == oMSBaseStyle.canSlide && this.stayTime == oMSBaseStyle.stayTime && this.autoSwitchTime == oMSBaseStyle.autoSwitchTime && this.showIndicator == oMSBaseStyle.showIndicator && ValueObject.util_equals(this.indicatorColor, oMSBaseStyle.indicatorColor) && ValueObject.util_equals(this.indicatorBgColor, oMSBaseStyle.indicatorBgColor) && this.indicatorRadius == oMSBaseStyle.indicatorRadius && this.blurRadius == oMSBaseStyle.blurRadius && ValueObject.util_equals(this.blurColor, oMSBaseStyle.blurColor) && ValueObject.util_equals(this.shadowColor, oMSBaseStyle.shadowColor) && this.shadowRadius == oMSBaseStyle.shadowRadius && this.shadowOpacity == oMSBaseStyle.shadowOpacity && ValueObject.util_equals(this.uiType, oMSBaseStyle.uiType) && this.checked == oMSBaseStyle.checked;
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
        int iFloatToIntBits = ((((((((((((i * 41) + Float.floatToIntBits(this.width)) * 41) + Float.floatToIntBits(this.height)) * 41) + Float.floatToIntBits(this.minWidth)) * 41) + Float.floatToIntBits(this.minHeight)) * 41) + Float.floatToIntBits(this.maxWidth)) * 41) + Float.floatToIntBits(this.maxHeight)) * 41;
        OMSSizeType oMSSizeType = this.widthType;
        int iHashCode = (iFloatToIntBits + (oMSSizeType != null ? oMSSizeType.hashCode() : 0)) * 41;
        OMSSizeType oMSSizeType2 = this.heightType;
        int iHashCode2 = (((((((((((((((((((iHashCode + (oMSSizeType2 != null ? oMSSizeType2.hashCode() : 0)) * 41) + Float.floatToIntBits(this.ratio)) * 41) + Float.floatToIntBits(this.paddingTop)) * 41) + Float.floatToIntBits(this.paddingLeft)) * 41) + Float.floatToIntBits(this.paddingBottom)) * 41) + Float.floatToIntBits(this.paddingRight)) * 41) + Float.floatToIntBits(this.marginTop)) * 41) + Float.floatToIntBits(this.marginLeft)) * 41) + Float.floatToIntBits(this.marginBottom)) * 41) + Float.floatToIntBits(this.marginRight)) * 41;
        List<String> list = this.bgColors;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        ResourceDirection resourceDirection = this.bgColorsDirection;
        int iHashCode4 = (iHashCode3 + (resourceDirection != null ? resourceDirection.hashCode() : 0)) * 41;
        String str = this.borderColor;
        int iHashCode5 = (((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 41) + Float.floatToIntBits(this.borderWidth)) * 41) + Float.floatToIntBits(this.cornerRadius)) * 41;
        OMSLocationType oMSLocationType = this.alignment;
        int iHashCode6 = (iHashCode5 + (oMSLocationType != null ? oMSLocationType.hashCode() : 0)) * 41;
        List<OMSLocationType> list2 = this.location;
        int iHashCode7 = (((((iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.numberOfLines) * 41) + Float.floatToIntBits(this.lineSpacing)) * 41;
        OMSImageScaleType oMSImageScaleType = this.scaleType;
        int iHashCode8 = (((((((((((iHashCode7 + (oMSImageScaleType != null ? oMSImageScaleType.hashCode() : 0)) * 41) + Float.floatToIntBits(this.leftCapWidth)) * 41) + Float.floatToIntBits(this.topCapHeight)) * 41) + Float.floatToIntBits(this.leftCapLayoutWidth)) * 41) + Float.floatToIntBits(this.topCapLayoutHeight)) * 41) + Float.floatToIntBits(this.spacing)) * 41;
        OMSLocationType oMSLocationType2 = this.distribution;
        int iHashCode9 = (iHashCode8 + (oMSLocationType2 != null ? oMSLocationType2.hashCode() : 0)) * 41;
        List<Integer> list3 = this.imageSize;
        int iHashCode10 = (((((iHashCode9 + (list3 != null ? list3.hashCode() : 0)) * 41) + Float.floatToIntBits(this.offsetX)) * 41) + Float.floatToIntBits(this.offsetY)) * 41;
        ResourceDirection resourceDirection2 = this.direction;
        int iHashCode11 = (((((((((((iHashCode10 + (resourceDirection2 != null ? resourceDirection2.hashCode() : 0)) * 41) + (this.autoSwitch ? 1231 : 1237)) * 41) + (this.canSlide ? 1231 : 1237)) * 41) + this.stayTime) * 41) + this.autoSwitchTime) * 41) + (this.showIndicator ? 1231 : 1237)) * 41;
        String str2 = this.indicatorColor;
        int iHashCode12 = (iHashCode11 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.indicatorBgColor;
        int iHashCode13 = (((((iHashCode12 + (str3 != null ? str3.hashCode() : 0)) * 41) + Float.floatToIntBits(this.indicatorRadius)) * 41) + Float.floatToIntBits(this.blurRadius)) * 41;
        String str4 = this.blurColor;
        int iHashCode14 = (iHashCode13 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.shadowColor;
        int iHashCode15 = (((((iHashCode14 + (str5 != null ? str5.hashCode() : 0)) * 41) + Float.floatToIntBits(this.shadowRadius)) * 41) + Float.floatToIntBits(this.shadowOpacity)) * 41;
        OMSUIType oMSUIType = this.uiType;
        int iHashCode16 = ((iHashCode15 + (oMSUIType != null ? oMSUIType.hashCode() : 0)) * 41) + (this.checked ? 1231 : 1237);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.widthType == null) {
            this.widthType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.heightType == null) {
            this.heightType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.defaultEnum();
        }
        if (this.bgColors == null) {
            this.bgColors = new ArrayList();
        }
        if (this.bgColorsDirection == null) {
            this.bgColorsDirection = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
        }
        if (this.borderColor == null) {
            this.borderColor = "";
        }
        if (this.alignment == null) {
            this.alignment = (OMSLocationType) OMSLocationType.JSON_ADAPTER.defaultEnum();
        }
        if (this.location == null) {
            this.location = new ArrayList();
        }
        if (this.scaleType == null) {
            this.scaleType = (OMSImageScaleType) OMSImageScaleType.JSON_ADAPTER.defaultEnum();
        }
        if (this.distribution == null) {
            this.distribution = (OMSLocationType) OMSLocationType.JSON_ADAPTER.defaultEnum();
        }
        if (this.imageSize == null) {
            this.imageSize = new ArrayList();
        }
        if (this.direction == null) {
            this.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.defaultEnum();
        }
        if (this.indicatorColor == null) {
            this.indicatorColor = "";
        }
        if (this.indicatorBgColor == null) {
            this.indicatorBgColor = "";
        }
        if (this.blurColor == null) {
            this.blurColor = "";
        }
        if (this.shadowColor == null) {
            this.shadowColor = "";
        }
        if (this.uiType == null) {
            this.uiType = (OMSUIType) OMSUIType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
