package com.immomo.momomediaext.filter.beauty;

import android.graphics.PointF;
import android.util.SparseArray;
import com.alibaba.fastjson.asm.Opcodes;
import com.effectsar.labcv.effectsdk.BefFaceInfo;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes7.dex */
public class FacePointConfig {
    private static int NUM_STEP = 6;
    public static SparseArray<TransformPointConfig> points68 = new SparseArray<>(68);
    public static SparseArray<TransformPointConfig> points96 = new SparseArray<>(96);
    private BefFaceInfo.FacePoint[] facePoints;

    static {
        transform68Points();
        transform96Points();
    }

    private static void transform68Points() {
        points68.put(0, new TransformPointConfig(0));
        points68.put(1, new TransformPointConfig(2));
        points68.put(2, new TransformPointConfig(4));
        points68.put(3, new TransformPointConfig(6));
        points68.put(4, new TransformPointConfig(8));
        points68.put(5, new TransformPointConfig(10));
        points68.put(6, new TransformPointConfig(12));
        points68.put(7, new TransformPointConfig(14));
        points68.put(8, new TransformPointConfig(16));
        points68.put(9, new TransformPointConfig(18));
        points68.put(10, new TransformPointConfig(20));
        points68.put(11, new TransformPointConfig(22));
        points68.put(12, new TransformPointConfig(24));
        points68.put(13, new TransformPointConfig(26));
        points68.put(14, new TransformPointConfig(28));
        points68.put(15, new TransformPointConfig(30));
        points68.put(16, new TransformPointConfig(32));
        points68.put(17, new TransformPointConfig(33));
        points68.put(18, new TransformPointConfig(34));
        points68.put(19, new TransformPointConfig(35));
        points68.put(20, new TransformPointConfig(36));
        points68.put(21, new TransformPointConfig(37));
        points68.put(22, new TransformPointConfig(38));
        points68.put(23, new TransformPointConfig(39));
        points68.put(24, new TransformPointConfig(40));
        points68.put(25, new TransformPointConfig(41));
        points68.put(26, new TransformPointConfig(42));
        points68.put(27, new TransformPointConfig(43));
        points68.put(28, new TransformPointConfig(44));
        points68.put(29, new TransformPointConfig(45));
        points68.put(30, new TransformPointConfig(46));
        points68.put(31, new TransformPointConfig(47));
        points68.put(32, new TransformPointConfig(48));
        points68.put(33, new TransformPointConfig(49));
        points68.put(34, new TransformPointConfig(50));
        points68.put(35, new TransformPointConfig(51));
        points68.put(36, new TransformPointConfig(52));
        points68.put(37, new TransformPointConfig(53));
        points68.put(38, new TransformPointConfig(54));
        points68.put(39, new TransformPointConfig(55));
        points68.put(40, new TransformPointConfig(56));
        points68.put(41, new TransformPointConfig(57));
        points68.put(42, new TransformPointConfig(58));
        points68.put(43, new TransformPointConfig(59));
        points68.put(44, new TransformPointConfig(60));
        points68.put(45, new TransformPointConfig(61));
        points68.put(46, new TransformPointConfig(62));
        points68.put(47, new TransformPointConfig(63));
        points68.put(48, new TransformPointConfig(84));
        points68.put(49, new TransformPointConfig(85));
        points68.put(50, new TransformPointConfig(86));
        points68.put(51, new TransformPointConfig(87));
        points68.put(52, new TransformPointConfig(88));
        points68.put(53, new TransformPointConfig(89));
        points68.put(54, new TransformPointConfig(90));
        points68.put(55, new TransformPointConfig(91));
        points68.put(56, new TransformPointConfig(92));
        points68.put(57, new TransformPointConfig(93));
        points68.put(58, new TransformPointConfig(94));
        points68.put(59, new TransformPointConfig(95));
        points68.put(60, new TransformPointConfig(96));
        points68.put(61, new TransformPointConfig(97));
        points68.put(62, new TransformPointConfig(98));
        points68.put(63, new TransformPointConfig(99));
        points68.put(64, new TransformPointConfig(100));
        points68.put(65, new TransformPointConfig(101));
        points68.put(66, new TransformPointConfig(102));
        points68.put(67, new TransformPointConfig(103));
    }

    private static void transform96Points() {
        points96.put(0, new TransformPointConfig(0));
        points96.put(1, new TransformPointConfig(2));
        points96.put(2, new TransformPointConfig(4));
        points96.put(3, new TransformPointConfig(6));
        points96.put(4, new TransformPointConfig(8));
        points96.put(5, new TransformPointConfig(10));
        points96.put(6, new TransformPointConfig(12));
        points96.put(7, new TransformPointConfig(14));
        points96.put(8, new TransformPointConfig(15));
        points96.put(9, new TransformPointConfig(16));
        points96.put(10, new TransformPointConfig(17));
        points96.put(11, new TransformPointConfig(18));
        points96.put(12, new TransformPointConfig(20));
        points96.put(13, new TransformPointConfig(22));
        points96.put(14, new TransformPointConfig(24));
        points96.put(15, new TransformPointConfig(26));
        points96.put(16, new TransformPointConfig(28));
        points96.put(17, new TransformPointConfig(30));
        points96.put(18, new TransformPointConfig(32));
        points96.put(19, new TransformPointConfig(33));
        points96.put(20, new TransformPointConfig(34));
        points96.put(21, new TransformPointConfig(35).interp(34, 35));
        points96.put(22, new TransformPointConfig(35).interp(35, 36).ratio(0.8f, 1.0f));
        points96.put(23, new TransformPointConfig(36).interp(36, 37).ratio(0.5f, 1.0f));
        points96.put(24, new TransformPointConfig(67));
        points96.put(25, new TransformPointConfig(66));
        points96.put(26, new TransformPointConfig(65).interp(65, 66).ratio(0.8f, 1.0f));
        points96.put(27, new TransformPointConfig(65).interp(64, 65));
        points96.put(28, new TransformPointConfig(64));
        points96.put(29, new TransformPointConfig(68));
        points96.put(30, new TransformPointConfig(39).interp(38, 39).ratio(1.1f, 1.0f));
        points96.put(31, new TransformPointConfig(40).interp(39, 40));
        points96.put(32, new TransformPointConfig(40).interp(40, 41).ratio(0.5f, 1.0f));
        points96.put(33, new TransformPointConfig(41));
        points96.put(34, new TransformPointConfig(42));
        points96.put(35, new TransformPointConfig(71));
        points96.put(36, new TransformPointConfig(70).interp(70, 71).ratio(0.5f, 1.0f));
        points96.put(37, new TransformPointConfig(70).interp(69, 70));
        points96.put(38, new TransformPointConfig(69));
        points96.put(39, new TransformPointConfig(52));
        points96.put(40, new TransformPointConfig(53).interp(52, 53));
        points96.put(41, new TransformPointConfig(53).interp(53, 72).ratio(0.3f, 0.0f));
        points96.put(42, new TransformPointConfig(72));
        points96.put(43, new TransformPointConfig(54).interp(72, 54).ratio(1.2f, 1.2f));
        points96.put(44, new TransformPointConfig(54).interp(54, 55).ratio(0.5f, 0.8f));
        points96.put(45, new TransformPointConfig(55));
        points96.put(46, new TransformPointConfig(56).interp(56, 55).ratio(0.3f, 0.3f));
        points96.put(47, new TransformPointConfig(56).interp(73, 56).ratio(1.0f, 1.0f));
        points96.put(48, new TransformPointConfig(73));
        points96.put(49, new TransformPointConfig(57).interp(57, 73).ratio(0.8f, 1.0f));
        points96.put(50, new TransformPointConfig(57).interp(52, 57).ratio(1.3f, 1.2f));
        points96.put(51, new TransformPointConfig(58));
        points96.put(52, new TransformPointConfig(59).interp(58, 59));
        points96.put(53, new TransformPointConfig(59).interp(59, 75).ratio(0.3f, 0.2f));
        points96.put(54, new TransformPointConfig(75));
        points96.put(55, new TransformPointConfig(60).interp(75, 60).ratio(1.5f, 1.5f));
        points96.put(56, new TransformPointConfig(60).interp(60, 61));
        points96.put(57, new TransformPointConfig(61));
        points96.put(58, new TransformPointConfig(62).interp(62, 61).ratio(0.5f, 0.0f));
        points96.put(59, new TransformPointConfig(62).interp(76, 62).ratio(1.0f, 0.1f));
        points96.put(60, new TransformPointConfig(76));
        points96.put(61, new TransformPointConfig(63));
        points96.put(62, new TransformPointConfig(63).interp(58, 63).ratio(1.0f, 0.5f));
        points96.put(63, new TransformPointConfig(78));
        points96.put(64, new TransformPointConfig(44).interp(78, 80).ratio(0.3f, 1.0f));
        points96.put(65, new TransformPointConfig(80));
        points96.put(66, new TransformPointConfig(82));
        points96.put(67, new TransformPointConfig(47));
        points96.put(68, new TransformPointConfig(48));
        points96.put(69, new TransformPointConfig(50));
        points96.put(70, new TransformPointConfig(51));
        points96.put(71, new TransformPointConfig(83));
        points96.put(72, new TransformPointConfig(81));
        points96.put(73, new TransformPointConfig(44).interp(79, 81).ratio(0.3f, 1.0f));
        points96.put(74, new TransformPointConfig(79));
        points96.put(75, new TransformPointConfig(46));
        points96.put(76, new TransformPointConfig(84));
        points96.put(77, new TransformPointConfig(85));
        points96.put(78, new TransformPointConfig(86));
        points96.put(79, new TransformPointConfig(87));
        points96.put(80, new TransformPointConfig(88));
        points96.put(81, new TransformPointConfig(89));
        points96.put(82, new TransformPointConfig(90));
        points96.put(83, new TransformPointConfig(91));
        points96.put(84, new TransformPointConfig(92));
        points96.put(85, new TransformPointConfig(93));
        points96.put(86, new TransformPointConfig(94));
        points96.put(87, new TransformPointConfig(95));
        points96.put(88, new TransformPointConfig(96));
        points96.put(89, new TransformPointConfig(97));
        points96.put(90, new TransformPointConfig(98));
        points96.put(91, new TransformPointConfig(99));
        points96.put(92, new TransformPointConfig(100));
        points96.put(93, new TransformPointConfig(101));
        points96.put(94, new TransformPointConfig(102));
        points96.put(95, new TransformPointConfig(103));
    }

    public float[] convert96to104(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr.length != 192) {
            return null;
        }
        List<Float> listExtend96Points = extend96Points(fArr, f, f2, f3, f4);
        int size = listExtend96Points.size() / 2;
        int i = size + 96;
        List<PointF> listCurve4 = curve4(listExtend96Points.get(96).floatValue(), listExtend96Points.get(i).floatValue(), listExtend96Points.get(97).floatValue(), listExtend96Points.get(size + 97).floatValue(), listExtend96Points.get(98).floatValue(), listExtend96Points.get(size + 98).floatValue(), listExtend96Points.get(99).floatValue(), listExtend96Points.get(size + 99).floatValue());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 96; i2++) {
            arrayList.add(listExtend96Points.get(i2));
        }
        for (int i3 = 0; i3 < listCurve4.size(); i3++) {
            arrayList.add(Float.valueOf(listCurve4.get(i3).x));
        }
        while (size < i) {
            arrayList.add(listExtend96Points.get(size));
            size++;
        }
        for (int i4 = 0; i4 < listCurve4.size(); i4++) {
            arrayList.add(Float.valueOf(listCurve4.get(i4).y));
        }
        float[] fArr2 = new float[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            fArr2[i5] = ((Float) arrayList.get(i5)).floatValue();
        }
        return fArr2;
    }

    public List<PointF> curve4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f;
        float f10 = f2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PointF(f9, f10));
        int i = NUM_STEP;
        float f11 = 1.0f / (i + 1);
        float f12 = f11 * f11;
        float f13 = f12 * f11;
        float f14 = f11 * 3.0f;
        float f15 = f12 * 3.0f;
        float f16 = f12 * 6.0f;
        float f17 = 6.0f * f13;
        float f18 = (f9 - (f3 * 2.0f)) + f5;
        float f19 = (f10 - (2.0f * f4)) + f6;
        float f20 = (((f3 - f5) * 3.0f) - f9) + f7;
        float f21 = (((f4 - f6) * 3.0f) - f10) + f8;
        float f22 = ((f3 - f9) * f14) + (f18 * f15) + (f20 * f13);
        float f23 = ((f4 - f10) * f14) + (f15 * f19) + (f13 * f21);
        float f24 = f20 * f17;
        float f25 = (f18 * f16) + f24;
        float f26 = f21 * f17;
        float f27 = (f19 * f16) + f26;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                arrayList.add(new PointF(f7, f8));
                return arrayList;
            }
            f9 += f22;
            f10 += f23;
            f22 += f25;
            f23 += f27;
            f25 += f24;
            f27 += f26;
            arrayList.add(new PointF(f9, f10));
            i = i2;
        }
    }

    public void extTool(float[] fArr, int i, int i2, float f, List<Float> list, List<Float> list2) {
        float f2 = fArr[i2];
        float f3 = fArr[i];
        int i3 = i + 96;
        float f4 = fArr[i2 + 96] - fArr[i3];
        list.add(Float.valueOf(f3 + ((f2 - f3) * f)));
        list2.add(Float.valueOf(fArr[i3] + (f * f4)));
    }

    public List<Float> extend96Points(float[] fArr, float f, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        extTool(fArr, 66, 49, f, arrayList2, arrayList3);
        extTool(fArr, 66, 45, f2, arrayList2, arrayList3);
        extTool(fArr, 71, 51, f3, arrayList2, arrayList3);
        extTool(fArr, 71, 59, f4, arrayList2, arrayList3);
        for (int i = 0; i < fArr.length / 2; i++) {
            arrayList.add(Float.valueOf(fArr[i]));
        }
        arrayList.addAll(arrayList2);
        for (int length = fArr.length / 2; length < fArr.length; length++) {
            arrayList.add(Float.valueOf(fArr[length]));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public PointF get104PointAt(int i) {
        if (i < 96) {
            return get96PointAt(i);
        }
        PointF pointF = new PointF();
        PointF pointF2 = get96PointAt(0);
        PointF pointF3 = get96PointAt(19);
        PointF pointF4 = get96PointAt(18);
        PointF pointF5 = get96PointAt(16);
        PointF pointF6 = get96PointAt(2);
        PointF pointF7 = get96PointAt(23);
        PointF pointF8 = get96PointAt(24);
        float f = (pointF6.y - pointF2.y) * 0.8f;
        float f2 = (pointF5.y - pointF4.y) * 0.8f;
        switch (i) {
            case Opcodes.IADD /* 96 */:
                float f3 = pointF2.x;
                pointF.x = f3 + ((pointF3.x - f3) / 2.0f);
                pointF.y = pointF3.y - f;
                return pointF;
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
                PointF pointF9 = get96PointAt(21);
                pointF.x = pointF9.x;
                pointF.y = pointF9.y - f;
                return pointF;
            case EACTags.FCP_TEMPLATE /* 98 */:
                pointF.x = pointF7.x;
                pointF.y = pointF7.y - (f * 1.0f);
                return pointF;
            case 99:
                float f4 = pointF8.x;
                pointF.x = f4 + ((f4 - pointF7.x) / 2.0f);
                pointF.y = pointF8.y - (f * 1.5f);
                return pointF;
            case 100:
                pointF.x = get96PointAt(29).x - ((pointF8.x - pointF7.x) / 2.0f);
                pointF.y = pointF8.y - (f2 * 1.5f);
                return pointF;
            case 101:
                PointF pointF10 = get96PointAt(31);
                pointF.x = pointF10.x;
                pointF.y = pointF10.y - (f2 * 1.0f);
                return pointF;
            case 102:
                PointF pointF11 = get96PointAt(32);
                pointF.x = pointF11.x;
                pointF.y = pointF11.y - f2;
                return pointF;
            case 103:
                PointF pointF12 = get96PointAt(34);
                float f5 = pointF12.x;
                pointF.x = f5 + ((f5 - pointF4.x) / 2.0f);
                pointF.y = pointF12.y - f2;
                return pointF;
            default:
                return pointF;
        }
    }

    public PointF get96PointAt(int i) {
        int i2;
        PointF pointF = new PointF();
        if (this.facePoints == null) {
            return pointF;
        }
        TransformPointConfig transformPointConfig = points96.get(i);
        int i3 = transformPointConfig.interP1;
        if (i3 == -1 || (i2 = transformPointConfig.interP2) == -1) {
            pointF.x = this.facePoints[transformPointConfig.transformPoint].getX();
            pointF.y = this.facePoints[transformPointConfig.transformPoint].getY();
            return pointF;
        }
        BefFaceInfo.FacePoint[] facePointArr = this.facePoints;
        BefFaceInfo.FacePoint facePoint = facePointArr[i3];
        BefFaceInfo.FacePoint facePoint2 = facePointArr[i2];
        pointF.x = facePoint.getX() + (((facePoint2.getX() - facePoint.getX()) / 2.0f) * transformPointConfig.interRatioX);
        pointF.y = facePoint.getY() + (((facePoint2.getY() - facePoint.getY()) / 2.0f) * transformPointConfig.interRatioY);
        return pointF;
    }

    public FacePointConfig with(BefFaceInfo.FacePoint[] facePointArr, int i, int i2) {
        this.facePoints = facePointArr;
        return this;
    }
}
