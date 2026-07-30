package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pp1 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f153469a;

    /* JADX INFO: renamed from: b */
    public final int f153470b;

    /* JADX INFO: renamed from: c */
    public final int f153471c;

    /* JADX INFO: renamed from: d */
    public final int f153472d;

    /* JADX INFO: renamed from: e */
    public final int f153473e;

    /* JADX INFO: renamed from: f */
    public final int f153474f;

    /* JADX INFO: renamed from: g */
    public final int f153475g;

    /* JADX INFO: renamed from: h */
    public final float f153476h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f153477i;

    public pp1(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.f153469a = list;
        this.f153470b = i;
        this.f153471c = i2;
        this.f153472d = i3;
        this.f153473e = i4;
        this.f153474f = i5;
        this.f153475g = i6;
        this.f153476h = f;
        this.f153477i = str;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m173174a(ig60 ig60Var) {
        int iM139801N = ig60Var.m139801N();
        int iM139816f = ig60Var.m139816f();
        ig60Var.m139809V(iM139801N);
        return lc5.m153624d(ig60Var.m139815e(), iM139816f, iM139801N);
    }

    /* JADX INFO: renamed from: b */
    public static pp1 m173175b(ig60 ig60Var) throws ParserException {
        String strM153621a;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        try {
            ig60Var.m139809V(4);
            int iM139795H = (ig60Var.m139795H() & 3) + 1;
            if (iM139795H == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM139795H2 = ig60Var.m139795H() & 31;
            for (int i6 = 0; i6 < iM139795H2; i6++) {
                arrayList.add(m173174a(ig60Var));
            }
            int iM139795H3 = ig60Var.m139795H();
            for (int i7 = 0; i7 < iM139795H3; i7++) {
                arrayList.add(m173174a(ig60Var));
            }
            if (iM139795H2 > 0) {
                jb20.C17914c c17914cM144194l = jb20.m144194l((byte[]) arrayList.get(0), iM139795H, ((byte[]) arrayList.get(0)).length);
                int i8 = c17914cM144194l.f119112f;
                int i9 = c17914cM144194l.f119113g;
                int i10 = c17914cM144194l.f119121o;
                int i11 = c17914cM144194l.f119122p;
                int i12 = c17914cM144194l.f119123q;
                float f2 = c17914cM144194l.f119114h;
                strM153621a = lc5.m153621a(c17914cM144194l.f119107a, c17914cM144194l.f119108b, c17914cM144194l.f119109c);
                i3 = i11;
                i4 = i12;
                f = f2;
                i = i8;
                i2 = i9;
                i5 = i10;
            } else {
                strM153621a = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                f = 1.0f;
                i5 = -1;
            }
            return new pp1(arrayList, iM139795H, i, i2, i5, i3, i4, f, strM153621a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
