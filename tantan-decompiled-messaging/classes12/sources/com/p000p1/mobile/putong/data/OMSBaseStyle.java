package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSBaseStyle;
import com.p000p1.mobile.putong.data.OMSLocationType;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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

    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
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

    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSBaseStyle oMSBaseStyle) {
            int iF = CodedOutputByteBufferNano.f(1, oMSBaseStyle.width) + CodedOutputByteBufferNano.f(2, oMSBaseStyle.height) + CodedOutputByteBufferNano.f(3, oMSBaseStyle.minWidth) + CodedOutputByteBufferNano.f(4, oMSBaseStyle.minHeight) + CodedOutputByteBufferNano.f(5, oMSBaseStyle.maxWidth) + CodedOutputByteBufferNano.f(6, oMSBaseStyle.maxHeight);
            OMSSizeType oMSSizeType = oMSBaseStyle.widthType;
            if (oMSSizeType != null) {
                iF += CodedOutputByteBufferNano.h(7, oMSSizeType.ordinal());
            }
            OMSSizeType oMSSizeType2 = oMSBaseStyle.heightType;
            if (oMSSizeType2 != null) {
                iF += CodedOutputByteBufferNano.h(8, oMSSizeType2.ordinal());
            }
            int iF2 = iF + CodedOutputByteBufferNano.f(9, oMSBaseStyle.ratio) + CodedOutputByteBufferNano.f(10, oMSBaseStyle.paddingTop) + CodedOutputByteBufferNano.f(11, oMSBaseStyle.paddingLeft) + CodedOutputByteBufferNano.f(12, oMSBaseStyle.paddingBottom) + CodedOutputByteBufferNano.f(13, oMSBaseStyle.paddingRight) + CodedOutputByteBufferNano.f(14, oMSBaseStyle.marginTop) + CodedOutputByteBufferNano.f(15, oMSBaseStyle.marginLeft) + CodedOutputByteBufferNano.f(16, oMSBaseStyle.marginBottom) + CodedOutputByteBufferNano.f(17, oMSBaseStyle.marginRight);
            List<String> list = oMSBaseStyle.bgColors;
            if (list != null) {
                iF2 += CodedOutputByteBufferNano.l(18, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection != null) {
                iF2 += CodedOutputByteBufferNano.h(19, resourceDirection.ordinal());
            }
            String str = oMSBaseStyle.borderColor;
            if (str != null) {
                iF2 += CodedOutputByteBufferNano.o(20, str);
            }
            int iF3 = iF2 + CodedOutputByteBufferNano.f(21, oMSBaseStyle.borderWidth) + CodedOutputByteBufferNano.f(22, oMSBaseStyle.cornerRadius);
            OMSLocationType oMSLocationType = oMSBaseStyle.alignment;
            if (oMSLocationType != null) {
                iF3 += CodedOutputByteBufferNano.h(23, oMSLocationType.ordinal());
            }
            List<OMSLocationType> list2 = oMSBaseStyle.location;
            if (list2 != null) {
                iF3 += CodedOutputByteBufferNano.l(24, OMSLocationType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iF3 + CodedOutputByteBufferNano.h(25, oMSBaseStyle.numberOfLines) + CodedOutputByteBufferNano.f(26, oMSBaseStyle.lineSpacing);
            OMSImageScaleType oMSImageScaleType = oMSBaseStyle.scaleType;
            if (oMSImageScaleType != null) {
                iH += CodedOutputByteBufferNano.h(27, oMSImageScaleType.ordinal());
            }
            int iF4 = iH + CodedOutputByteBufferNano.f(28, oMSBaseStyle.leftCapWidth) + CodedOutputByteBufferNano.f(29, oMSBaseStyle.topCapHeight) + CodedOutputByteBufferNano.f(30, oMSBaseStyle.leftCapLayoutWidth) + CodedOutputByteBufferNano.f(31, oMSBaseStyle.topCapLayoutHeight) + CodedOutputByteBufferNano.f(32, oMSBaseStyle.spacing);
            OMSLocationType oMSLocationType2 = oMSBaseStyle.distribution;
            if (oMSLocationType2 != null) {
                iF4 += CodedOutputByteBufferNano.h(33, oMSLocationType2.ordinal());
            }
            List<Integer> list3 = oMSBaseStyle.imageSize;
            if (list3 != null) {
                iF4 += CodedOutputByteBufferNano.l(34, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iF5 = iF4 + CodedOutputByteBufferNano.f(35, oMSBaseStyle.offsetX) + CodedOutputByteBufferNano.f(36, oMSBaseStyle.offsetY);
            ResourceDirection resourceDirection2 = oMSBaseStyle.direction;
            if (resourceDirection2 != null) {
                iF5 += CodedOutputByteBufferNano.h(37, resourceDirection2.ordinal());
            }
            int iB = iF5 + CodedOutputByteBufferNano.b(38, oMSBaseStyle.autoSwitch) + CodedOutputByteBufferNano.b(39, oMSBaseStyle.canSlide) + CodedOutputByteBufferNano.h(40, oMSBaseStyle.stayTime) + CodedOutputByteBufferNano.h(41, oMSBaseStyle.autoSwitchTime) + CodedOutputByteBufferNano.b(42, oMSBaseStyle.showIndicator);
            String str2 = oMSBaseStyle.indicatorColor;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(43, str2);
            }
            String str3 = oMSBaseStyle.indicatorBgColor;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(44, str3);
            }
            int iF6 = iB + CodedOutputByteBufferNano.f(45, oMSBaseStyle.indicatorRadius) + CodedOutputByteBufferNano.f(46, oMSBaseStyle.blurRadius);
            String str4 = oMSBaseStyle.blurColor;
            if (str4 != null) {
                iF6 += CodedOutputByteBufferNano.o(47, str4);
            }
            String str5 = oMSBaseStyle.shadowColor;
            if (str5 != null) {
                iF6 += CodedOutputByteBufferNano.o(48, str5);
            }
            int iF7 = iF6 + CodedOutputByteBufferNano.f(49, oMSBaseStyle.shadowRadius) + CodedOutputByteBufferNano.f(50, oMSBaseStyle.shadowOpacity);
            OMSUIType oMSUIType = oMSBaseStyle.uiType;
            if (oMSUIType != null) {
                iF7 += CodedOutputByteBufferNano.h(51, oMSUIType.ordinal());
            }
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            if (oMSSizeType3 != null) {
                iF7 += CodedOutputByteBufferNano.l(52, oMSSizeType3, OMSSizeType.PROTOBUF_ADAPTER);
            }
            OMSSizeType oMSSizeType4 = oMSBaseStyle.heightType;
            if (oMSSizeType4 != null) {
                iF7 += CodedOutputByteBufferNano.l(53, oMSSizeType4, OMSSizeType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection3 = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection3 != null) {
                iF7 += CodedOutputByteBufferNano.l(54, resourceDirection3, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType3 = oMSBaseStyle.alignment;
            if (oMSLocationType3 != null) {
                iF7 += CodedOutputByteBufferNano.l(55, oMSLocationType3, OMSLocationType.PROTOBUF_ADAPTER);
            }
            List<OMSLocationType> list4 = oMSBaseStyle.location;
            if (list4 != null) {
                iF7 += CodedOutputByteBufferNano.l(56, list4, OMSLocationType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSImageScaleType oMSImageScaleType2 = oMSBaseStyle.scaleType;
            if (oMSImageScaleType2 != null) {
                iF7 += CodedOutputByteBufferNano.l(57, oMSImageScaleType2, OMSImageScaleType.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType4 = oMSBaseStyle.distribution;
            if (oMSLocationType4 != null) {
                iF7 += CodedOutputByteBufferNano.l(58, oMSLocationType4, OMSLocationType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection4 = oMSBaseStyle.direction;
            if (resourceDirection4 != null) {
                iF7 += CodedOutputByteBufferNano.l(59, resourceDirection4, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSUIType oMSUIType2 = oMSBaseStyle.uiType;
            if (oMSUIType2 != null) {
                iF7 += CodedOutputByteBufferNano.l(60, oMSUIType2, OMSUIType.PROTOBUF_ADAPTER);
            }
            int iB2 = iF7 + CodedOutputByteBufferNano.b(61, oMSBaseStyle.checked);
            ((MessageNano) oMSBaseStyle).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSBaseStyle m18576parse(nb5 nb5Var) throws IOException {
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
                switch (nb5Var.u()) {
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
                        oMSBaseStyle.width = nb5Var.i();
                        continue;
                    case 21:
                        oMSBaseStyle.height = nb5Var.i();
                        continue;
                    case 29:
                        oMSBaseStyle.minWidth = nb5Var.i();
                        continue;
                    case 37:
                        oMSBaseStyle.minHeight = nb5Var.i();
                        continue;
                    case 45:
                        oMSBaseStyle.maxWidth = nb5Var.i();
                        continue;
                    case 53:
                        oMSBaseStyle.maxHeight = nb5Var.i();
                        continue;
                    case 56:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 77:
                        oMSBaseStyle.ratio = nb5Var.i();
                        continue;
                    case 85:
                        oMSBaseStyle.paddingTop = nb5Var.i();
                        continue;
                    case 93:
                        oMSBaseStyle.paddingLeft = nb5Var.i();
                        continue;
                    case 101:
                        oMSBaseStyle.paddingBottom = nb5Var.i();
                        continue;
                    case 109:
                        oMSBaseStyle.paddingRight = nb5Var.i();
                        continue;
                    case 117:
                        oMSBaseStyle.marginTop = nb5Var.i();
                        continue;
                    case 125:
                        oMSBaseStyle.marginLeft = nb5Var.i();
                        continue;
                    case 133:
                        oMSBaseStyle.marginBottom = nb5Var.i();
                        continue;
                    case 141:
                        oMSBaseStyle.marginRight = nb5Var.i();
                        continue;
                    case 146:
                        oMSBaseStyle.bgColors = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 152:
                        numValueOf3 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 162:
                        oMSBaseStyle.borderColor = nb5Var.s();
                        continue;
                    case 173:
                        oMSBaseStyle.borderWidth = nb5Var.i();
                        continue;
                    case 181:
                        oMSBaseStyle.cornerRadius = nb5Var.i();
                        continue;
                    case 184:
                        numValueOf4 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 194:
                        list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case GivenGiftBrief.ADVANCED_GIFT_LEVEL /* 200 */:
                        oMSBaseStyle.numberOfLines = nb5Var.j();
                        continue;
                    case 213:
                        oMSBaseStyle.lineSpacing = nb5Var.i();
                        continue;
                    case 216:
                        numValueOf5 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 229:
                        oMSBaseStyle.leftCapWidth = nb5Var.i();
                        continue;
                    case 237:
                        oMSBaseStyle.topCapHeight = nb5Var.i();
                        continue;
                    case 245:
                        oMSBaseStyle.leftCapLayoutWidth = nb5Var.i();
                        continue;
                    case 253:
                        oMSBaseStyle.topCapLayoutHeight = nb5Var.i();
                        continue;
                    case 261:
                        oMSBaseStyle.spacing = nb5Var.i();
                        continue;
                    case 264:
                        numValueOf6 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 274:
                        oMSBaseStyle.imageSize = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 285:
                        oMSBaseStyle.offsetX = nb5Var.i();
                        continue;
                    case 293:
                        oMSBaseStyle.offsetY = nb5Var.i();
                        continue;
                    case 296:
                        numValueOf7 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 304:
                        oMSBaseStyle.autoSwitch = nb5Var.g();
                        continue;
                    case 312:
                        oMSBaseStyle.canSlide = nb5Var.g();
                        continue;
                    case 320:
                        oMSBaseStyle.stayTime = nb5Var.j();
                        continue;
                    case 328:
                        oMSBaseStyle.autoSwitchTime = nb5Var.j();
                        continue;
                    case 336:
                        oMSBaseStyle.showIndicator = nb5Var.g();
                        continue;
                    case 346:
                        oMSBaseStyle.indicatorColor = nb5Var.s();
                        continue;
                    case 354:
                        oMSBaseStyle.indicatorBgColor = nb5Var.s();
                        continue;
                    case 365:
                        oMSBaseStyle.indicatorRadius = nb5Var.i();
                        continue;
                    case 373:
                        oMSBaseStyle.blurRadius = nb5Var.i();
                        continue;
                    case 378:
                        oMSBaseStyle.blurColor = nb5Var.s();
                        continue;
                    case 386:
                        oMSBaseStyle.shadowColor = nb5Var.s();
                        continue;
                    case 397:
                        oMSBaseStyle.shadowRadius = nb5Var.i();
                        continue;
                    case 405:
                        oMSBaseStyle.shadowOpacity = nb5Var.i();
                        continue;
                    case 408:
                        numValueOf8 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 418:
                        oMSBaseStyle.widthType = (OMSSizeType) nb5Var.l(OMSSizeType.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        oMSBaseStyle.heightType = (OMSSizeType) nb5Var.l(OMSSizeType.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        oMSBaseStyle.bgColorsDirection = (ResourceDirection) nb5Var.l(ResourceDirection.PROTOBUF_ADAPTER);
                        continue;
                    case 442:
                        oMSBaseStyle.alignment = (OMSLocationType) nb5Var.l(OMSLocationType.PROTOBUF_ADAPTER);
                        continue;
                    case 450:
                        oMSBaseStyle.location = (List) nb5Var.l(OMSLocationType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 458:
                        oMSBaseStyle.scaleType = (OMSImageScaleType) nb5Var.l(OMSImageScaleType.PROTOBUF_ADAPTER);
                        continue;
                    case 466:
                        oMSBaseStyle.distribution = (OMSLocationType) nb5Var.l(OMSLocationType.PROTOBUF_ADAPTER);
                        continue;
                    case 474:
                        oMSBaseStyle.direction = (ResourceDirection) nb5Var.l(ResourceDirection.PROTOBUF_ADAPTER);
                        continue;
                    case 482:
                        oMSBaseStyle.uiType = (OMSUIType) nb5Var.l(OMSUIType.PROTOBUF_ADAPTER);
                        continue;
                    case 488:
                        oMSBaseStyle.checked = nb5Var.g();
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

        public void serialize(OMSBaseStyle oMSBaseStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.E(1, oMSBaseStyle.width);
            codedOutputByteBufferNano.E(2, oMSBaseStyle.height);
            codedOutputByteBufferNano.E(3, oMSBaseStyle.minWidth);
            codedOutputByteBufferNano.E(4, oMSBaseStyle.minHeight);
            codedOutputByteBufferNano.E(5, oMSBaseStyle.maxWidth);
            codedOutputByteBufferNano.E(6, oMSBaseStyle.maxHeight);
            OMSSizeType oMSSizeType = oMSBaseStyle.widthType;
            if (oMSSizeType != null) {
                codedOutputByteBufferNano.G(7, oMSSizeType.ordinal());
            }
            OMSSizeType oMSSizeType2 = oMSBaseStyle.heightType;
            if (oMSSizeType2 != null) {
                codedOutputByteBufferNano.G(8, oMSSizeType2.ordinal());
            }
            codedOutputByteBufferNano.E(9, oMSBaseStyle.ratio);
            codedOutputByteBufferNano.E(10, oMSBaseStyle.paddingTop);
            codedOutputByteBufferNano.E(11, oMSBaseStyle.paddingLeft);
            codedOutputByteBufferNano.E(12, oMSBaseStyle.paddingBottom);
            codedOutputByteBufferNano.E(13, oMSBaseStyle.paddingRight);
            codedOutputByteBufferNano.E(14, oMSBaseStyle.marginTop);
            codedOutputByteBufferNano.E(15, oMSBaseStyle.marginLeft);
            codedOutputByteBufferNano.E(16, oMSBaseStyle.marginBottom);
            codedOutputByteBufferNano.E(17, oMSBaseStyle.marginRight);
            List<String> list = oMSBaseStyle.bgColors;
            if (list != null) {
                codedOutputByteBufferNano.K(18, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ResourceDirection resourceDirection = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection != null) {
                codedOutputByteBufferNano.G(19, resourceDirection.ordinal());
            }
            String str = oMSBaseStyle.borderColor;
            if (str != null) {
                codedOutputByteBufferNano.R(20, str);
            }
            codedOutputByteBufferNano.E(21, oMSBaseStyle.borderWidth);
            codedOutputByteBufferNano.E(22, oMSBaseStyle.cornerRadius);
            OMSLocationType oMSLocationType = oMSBaseStyle.alignment;
            if (oMSLocationType != null) {
                codedOutputByteBufferNano.G(23, oMSLocationType.ordinal());
            }
            List<OMSLocationType> list2 = oMSBaseStyle.location;
            if (list2 != null) {
                codedOutputByteBufferNano.K(24, OMSLocationType.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(25, oMSBaseStyle.numberOfLines);
            codedOutputByteBufferNano.E(26, oMSBaseStyle.lineSpacing);
            OMSImageScaleType oMSImageScaleType = oMSBaseStyle.scaleType;
            if (oMSImageScaleType != null) {
                codedOutputByteBufferNano.G(27, oMSImageScaleType.ordinal());
            }
            codedOutputByteBufferNano.E(28, oMSBaseStyle.leftCapWidth);
            codedOutputByteBufferNano.E(29, oMSBaseStyle.topCapHeight);
            codedOutputByteBufferNano.E(30, oMSBaseStyle.leftCapLayoutWidth);
            codedOutputByteBufferNano.E(31, oMSBaseStyle.topCapLayoutHeight);
            codedOutputByteBufferNano.E(32, oMSBaseStyle.spacing);
            OMSLocationType oMSLocationType2 = oMSBaseStyle.distribution;
            if (oMSLocationType2 != null) {
                codedOutputByteBufferNano.G(33, oMSLocationType2.ordinal());
            }
            List<Integer> list3 = oMSBaseStyle.imageSize;
            if (list3 != null) {
                codedOutputByteBufferNano.K(34, list3, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.E(35, oMSBaseStyle.offsetX);
            codedOutputByteBufferNano.E(36, oMSBaseStyle.offsetY);
            ResourceDirection resourceDirection2 = oMSBaseStyle.direction;
            if (resourceDirection2 != null) {
                codedOutputByteBufferNano.G(37, resourceDirection2.ordinal());
            }
            codedOutputByteBufferNano.A(38, oMSBaseStyle.autoSwitch);
            codedOutputByteBufferNano.A(39, oMSBaseStyle.canSlide);
            codedOutputByteBufferNano.G(40, oMSBaseStyle.stayTime);
            codedOutputByteBufferNano.G(41, oMSBaseStyle.autoSwitchTime);
            codedOutputByteBufferNano.A(42, oMSBaseStyle.showIndicator);
            String str2 = oMSBaseStyle.indicatorColor;
            if (str2 != null) {
                codedOutputByteBufferNano.R(43, str2);
            }
            String str3 = oMSBaseStyle.indicatorBgColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(44, str3);
            }
            codedOutputByteBufferNano.E(45, oMSBaseStyle.indicatorRadius);
            codedOutputByteBufferNano.E(46, oMSBaseStyle.blurRadius);
            String str4 = oMSBaseStyle.blurColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(47, str4);
            }
            String str5 = oMSBaseStyle.shadowColor;
            if (str5 != null) {
                codedOutputByteBufferNano.R(48, str5);
            }
            codedOutputByteBufferNano.E(49, oMSBaseStyle.shadowRadius);
            codedOutputByteBufferNano.E(50, oMSBaseStyle.shadowOpacity);
            OMSUIType oMSUIType = oMSBaseStyle.uiType;
            if (oMSUIType != null) {
                codedOutputByteBufferNano.G(51, oMSUIType.ordinal());
            }
            OMSSizeType oMSSizeType3 = oMSBaseStyle.widthType;
            if (oMSSizeType3 != null) {
                codedOutputByteBufferNano.K(52, oMSSizeType3, OMSSizeType.PROTOBUF_ADAPTER);
            }
            OMSSizeType oMSSizeType4 = oMSBaseStyle.heightType;
            if (oMSSizeType4 != null) {
                codedOutputByteBufferNano.K(53, oMSSizeType4, OMSSizeType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection3 = oMSBaseStyle.bgColorsDirection;
            if (resourceDirection3 != null) {
                codedOutputByteBufferNano.K(54, resourceDirection3, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType3 = oMSBaseStyle.alignment;
            if (oMSLocationType3 != null) {
                codedOutputByteBufferNano.K(55, oMSLocationType3, OMSLocationType.PROTOBUF_ADAPTER);
            }
            List<OMSLocationType> list4 = oMSBaseStyle.location;
            if (list4 != null) {
                codedOutputByteBufferNano.K(56, list4, OMSLocationType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            OMSImageScaleType oMSImageScaleType2 = oMSBaseStyle.scaleType;
            if (oMSImageScaleType2 != null) {
                codedOutputByteBufferNano.K(57, oMSImageScaleType2, OMSImageScaleType.PROTOBUF_ADAPTER);
            }
            OMSLocationType oMSLocationType4 = oMSBaseStyle.distribution;
            if (oMSLocationType4 != null) {
                codedOutputByteBufferNano.K(58, oMSLocationType4, OMSLocationType.PROTOBUF_ADAPTER);
            }
            ResourceDirection resourceDirection4 = oMSBaseStyle.direction;
            if (resourceDirection4 != null) {
                codedOutputByteBufferNano.K(59, resourceDirection4, ResourceDirection.PROTOBUF_ADAPTER);
            }
            OMSUIType oMSUIType2 = oMSBaseStyle.uiType;
            if (oMSUIType2 != null) {
                codedOutputByteBufferNano.K(60, oMSUIType2, OMSUIType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(61, oMSBaseStyle.checked);
        }
    };
    public static JsonAdapter<OMSBaseStyle> JSON_ADAPTER = new ObjectJsonAdapter<OMSBaseStyle>() { // from class: com.p1.mobile.putong.data.OMSBaseStyle.2
        public Class getDataClass() {
            return OMSBaseStyle.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSBaseStyle mo17830newInstance() {
            return new OMSBaseStyle();
        }

        public boolean parseField(OMSBaseStyle oMSBaseStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "leftCapWidth":
                    oMSBaseStyle.leftCapWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case "bgColors":
                    oMSBaseStyle.bgColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "spacing":
                    oMSBaseStyle.spacing = (float) jsonParser.getValueAsDouble();
                    return true;
                case "blurColor":
                    oMSBaseStyle.blurColor = jsonParser.getValueAsString();
                    return true;
                case "scaleType":
                    oMSBaseStyle.scaleType = (OMSImageScaleType) OMSImageScaleType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "topCapLayoutHeight":
                    oMSBaseStyle.topCapLayoutHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case "lineSpacing":
                    oMSBaseStyle.lineSpacing = (float) jsonParser.getValueAsDouble();
                    return true;
                case "shadowRadius":
                    oMSBaseStyle.shadowRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case "shadowColor":
                    oMSBaseStyle.shadowColor = jsonParser.getValueAsString();
                    return true;
                case "distribution":
                    oMSBaseStyle.distribution = (OMSLocationType) OMSLocationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "indicatorColor":
                    oMSBaseStyle.indicatorColor = jsonParser.getValueAsString();
                    return true;
                case "offsetX":
                    oMSBaseStyle.offsetX = (float) jsonParser.getValueAsDouble();
                    return true;
                case "offsetY":
                    oMSBaseStyle.offsetY = (float) jsonParser.getValueAsDouble();
                    return true;
                case "paddingLeft":
                    oMSBaseStyle.paddingLeft = (float) jsonParser.getValueAsDouble();
                    return true;
                case "blurRadius":
                    oMSBaseStyle.blurRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case "minWidth":
                    oMSBaseStyle.minWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case "showIndicator":
                    oMSBaseStyle.showIndicator = jsonParser.getValueAsBoolean();
                    return true;
                case "numberOfLines":
                    oMSBaseStyle.numberOfLines = jsonParser.getValueAsInt();
                    return true;
                case "height":
                    oMSBaseStyle.height = (float) jsonParser.getValueAsDouble();
                    return true;
                case "indicatorRadius":
                    oMSBaseStyle.indicatorRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case "topCapHeight":
                    oMSBaseStyle.topCapHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case "marginTop":
                    oMSBaseStyle.marginTop = (float) jsonParser.getValueAsDouble();
                    return true;
                case "direction":
                    oMSBaseStyle.direction = (ResourceDirection) ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "shadowOpacity":
                    oMSBaseStyle.shadowOpacity = (float) jsonParser.getValueAsDouble();
                    return true;
                case "maxHeight":
                    oMSBaseStyle.maxHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case "imageSize":
                    oMSBaseStyle.imageSize = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "uiType":
                    oMSBaseStyle.uiType = (OMSUIType) OMSUIType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "autoSwitch":
                    oMSBaseStyle.autoSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "marginBottom":
                    oMSBaseStyle.marginBottom = (float) jsonParser.getValueAsDouble();
                    return true;
                case "canSlide":
                    oMSBaseStyle.canSlide = jsonParser.getValueAsBoolean();
                    return true;
                case "minHeight":
                    oMSBaseStyle.minHeight = (float) jsonParser.getValueAsDouble();
                    return true;
                case "widthType":
                    oMSBaseStyle.widthType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "autoSwitchTime":
                    oMSBaseStyle.autoSwitchTime = jsonParser.getValueAsInt();
                    return true;
                case "paddingTop":
                    oMSBaseStyle.paddingTop = (float) jsonParser.getValueAsDouble();
                    return true;
                case "ratio":
                    oMSBaseStyle.ratio = (float) jsonParser.getValueAsDouble();
                    return true;
                case "width":
                    oMSBaseStyle.width = (float) jsonParser.getValueAsDouble();
                    return true;
                case "paddingBottom":
                    oMSBaseStyle.paddingBottom = (float) jsonParser.getValueAsDouble();
                    return true;
                case "leftCapLayoutWidth":
                    oMSBaseStyle.leftCapLayoutWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case "maxWidth":
                    oMSBaseStyle.maxWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case "cornerRadius":
                    oMSBaseStyle.cornerRadius = (float) jsonParser.getValueAsDouble();
                    return true;
                case "indicatorBgColor":
                    oMSBaseStyle.indicatorBgColor = jsonParser.getValueAsString();
                    return true;
                case "paddingRight":
                    oMSBaseStyle.paddingRight = (float) jsonParser.getValueAsDouble();
                    return true;
                case "borderColor":
                    oMSBaseStyle.borderColor = jsonParser.getValueAsString();
                    return true;
                case "borderWidth":
                    oMSBaseStyle.borderWidth = (float) jsonParser.getValueAsDouble();
                    return true;
                case "checked":
                    oMSBaseStyle.checked = jsonParser.getValueAsBoolean();
                    return true;
                case "marginRight":
                    oMSBaseStyle.marginRight = (float) jsonParser.getValueAsDouble();
                    return true;
                case "stayTime":
                    oMSBaseStyle.stayTime = jsonParser.getValueAsInt();
                    return true;
                case "bgColorsDirection":
                    oMSBaseStyle.bgColorsDirection = (ResourceDirection) ResourceDirection.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "heightType":
                    oMSBaseStyle.heightType = (OMSSizeType) OMSSizeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "alignment":
                    oMSBaseStyle.alignment = (OMSLocationType) OMSLocationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "location":
                    oMSBaseStyle.location = JsonAdapter.parseArray(jsonParser, OMSLocationType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "marginLeft":
                    oMSBaseStyle.marginLeft = (float) jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSBaseStyle oMSBaseStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "leftCapWidth":
                case "bgColors":
                case "spacing":
                case "blurColor":
                case "scaleType":
                case "topCapLayoutHeight":
                case "lineSpacing":
                case "shadowRadius":
                case "shadowColor":
                case "distribution":
                case "indicatorColor":
                case "offsetX":
                case "offsetY":
                case "paddingLeft":
                case "blurRadius":
                case "minWidth":
                case "showIndicator":
                case "numberOfLines":
                case "height":
                case "indicatorRadius":
                case "topCapHeight":
                case "marginTop":
                case "direction":
                case "shadowOpacity":
                case "maxHeight":
                case "imageSize":
                case "uiType":
                case "autoSwitch":
                case "marginBottom":
                case "canSlide":
                case "minHeight":
                case "widthType":
                case "autoSwitchTime":
                case "paddingTop":
                case "ratio":
                case "width":
                case "paddingBottom":
                case "leftCapLayoutWidth":
                case "maxWidth":
                case "cornerRadius":
                case "indicatorBgColor":
                case "paddingRight":
                case "borderColor":
                case "borderWidth":
                case "checked":
                case "marginRight":
                case "stayTime":
                case "bgColorsDirection":
                case "heightType":
                case "alignment":
                case "location":
                case "marginLeft":
                    return true;
                default:
                    return super.parseFieldCheck(oMSBaseStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSBaseStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSBaseStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m801a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ OMSLocationType m802b(OMSLocationType oMSLocationType) {
        return oMSLocationType;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m803c(Integer num) {
        return num;
    }

    public static OMSBaseStyle new_() {
        OMSBaseStyle oMSBaseStyle = new OMSBaseStyle();
        oMSBaseStyle.nullCheck();
        return oMSBaseStyle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSBaseStyle m18575clone() {
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
            oMSBaseStyle.bgColors = ValueObject.util_map(list, new w9j() { // from class: l.zx40
                public final Object call(Object obj) {
                    return OMSBaseStyle.m801a((String) obj);
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
            oMSBaseStyle.location = ValueObject.util_map(list2, new w9j() { // from class: l.ay40
                public final Object call(Object obj) {
                    return OMSBaseStyle.m802b((OMSLocationType) obj);
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
            oMSBaseStyle.imageSize = ValueObject.util_map(list3, new w9j() { // from class: l.by40
                public final Object call(Object obj) {
                    return OMSBaseStyle.m803c((Integer) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode16;
        return iHashCode16;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
