package org.spongycastle.math.p135ec.tools;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.spongycastle.asn1.p132x9.ECNamedCurveTable;
import org.spongycastle.asn1.p132x9.X9ECParameters;
import org.spongycastle.crypto.p133ec.CustomNamedCurves;
import org.spongycastle.math.p135ec.ECAlgorithms;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.math.p135ec.ECFieldElement;
import org.spongycastle.util.Integers;
import p153l.wg3;
import p153l.wpg0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class TraceOptimizer {
    private static final BigInteger ONE = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: R */
    private static final SecureRandom f207790R = new SecureRandom();

    private static int calculateTrace(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        ECFieldElement eCFieldElementSquare = eCFieldElement;
        for (int i = 1; i < fieldSize; i++) {
            eCFieldElementSquare = eCFieldElementSquare.square();
            eCFieldElement = eCFieldElement.add(eCFieldElementSquare);
        }
        BigInteger bigInteger = eCFieldElement.toBigInteger();
        if (bigInteger.bitLength() <= 1) {
            return bigInteger.intValue();
        }
        wpg0.m207458a();
        return 0;
    }

    private static ArrayList enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void implPrintNonZeroTraceBits(X9ECParameters x9ECParameters) {
        ECCurve curve = x9ECParameters.getCurve();
        int fieldSize = curve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fieldSize; i++) {
            if (calculateTrace(curve.fromBigInteger(ONE.shiftLeft(i))) != 0) {
                arrayList.add(Integers.valueOf(i));
                System.out.print(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i);
            }
        }
        System.out.println();
        for (int i2 = 0; i2 < 1000; i2++) {
            BigInteger bigInteger = new BigInteger(fieldSize, f207790R);
            int iCalculateTrace = calculateTrace(curve.fromBigInteger(bigInteger));
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i4)).intValue())) {
                    i3 ^= 1;
                }
            }
            if (iCalculateTrace != i3) {
                wtq0.m207906a("Optimized-trace sanity check failed");
                return;
            }
        }
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
                implPrintNonZeroTraceBits(byName);
            }
        }
    }

    public static void printNonZeroTraceBits(X9ECParameters x9ECParameters) {
        if (ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            implPrintNonZeroTraceBits(x9ECParameters);
        } else {
            wg3.m206174a("Trace only defined over characteristic-2 fields");
        }
    }
}
