package org.spongycastle.math.p131ec.tools;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.spongycastle.asn1.p128x9.ECNamedCurveTable;
import org.spongycastle.asn1.p128x9.X9ECParameters;
import org.spongycastle.crypto.p129ec.CustomNamedCurves;
import org.spongycastle.math.p131ec.ECAlgorithms;
import org.spongycastle.math.p131ec.ECFieldElement;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class F2mSqrtOptimizer {
    private static ArrayList enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    private static void implPrintRootZ(X9ECParameters x9ECParameters) {
        ECFieldElement eCFieldElementFromBigInteger = x9ECParameters.getCurve().fromBigInteger(BigInteger.valueOf(2L));
        ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.sqrt();
        System.out.println(eCFieldElementSqrt.toBigInteger().toString(16).toUpperCase());
        if (eCFieldElementSqrt.square().equals(eCFieldElementFromBigInteger)) {
            return;
        }
        qkq0.m175383a("Optimized-sqrt sanity check failed");
    }

    public static void main(String[] strArr) {
        TreeSet<String> treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        for (String str : treeSet) {
            X9ECParameters byName = CustomNamedCurves.getByName(str);
            if (byName == null) {
                byName = ECNamedCurveTable.getByName(str);
            }
            if (byName != null && ECAlgorithms.isF2mCurve(byName.getCurve())) {
                System.out.print(str + ":");
                implPrintRootZ(byName);
            }
        }
    }

    public static void printRootZ(X9ECParameters x9ECParameters) {
        if (ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            implPrintRootZ(x9ECParameters);
        } else {
            ig3.m135964a("Sqrt optimization only defined over characteristic-2 fields");
        }
    }
}
