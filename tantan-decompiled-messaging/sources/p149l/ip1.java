package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ip1 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f114242a;

    /* JADX INFO: renamed from: b */
    public final int f114243b;

    /* JADX INFO: renamed from: c */
    public final int f114244c;

    /* JADX INFO: renamed from: d */
    public final int f114245d;

    /* JADX INFO: renamed from: e */
    public final int f114246e;

    /* JADX INFO: renamed from: f */
    public final int f114247f;

    /* JADX INFO: renamed from: g */
    public final int f114248g;

    /* JADX INFO: renamed from: h */
    public final float f114249h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final String f114250i;

    public ip1(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, float f, @Nullable String str) {
        this.f114242a = list;
        this.f114243b = i;
        this.f114244c = i2;
        this.f114245d = i3;
        this.f114246e = i4;
        this.f114247f = i5;
        this.f114248g = i6;
        this.f114249h = f;
        this.f114250i = str;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m137436a(d860 d860Var) {
        int iM110285N = d860Var.m110285N();
        int iM110300f = d860Var.m110300f();
        d860Var.m110293V(iM110285N);
        return lb5.m149202d(d860Var.m110299e(), iM110300f, iM110285N);
    }

    /* JADX INFO: renamed from: b */
    public static ip1 m137437b(d860 d860Var) throws ParserException {
        String strM149199a;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        try {
            d860Var.m110293V(4);
            int iM110279H = (d860Var.m110279H() & 3) + 1;
            if (iM110279H == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM110279H2 = d860Var.m110279H() & 31;
            for (int i6 = 0; i6 < iM110279H2; i6++) {
                arrayList.add(m137436a(d860Var));
            }
            int iM110279H3 = d860Var.m110279H();
            for (int i7 = 0; i7 < iM110279H3; i7++) {
                arrayList.add(m137436a(d860Var));
            }
            if (iM110279H2 > 0) {
                b320.C15785c c15785cM100049l = b320.m100049l((byte[]) arrayList.get(0), iM110279H, ((byte[]) arrayList.get(0)).length);
                int i8 = c15785cM100049l.f72790f;
                int i9 = c15785cM100049l.f72791g;
                int i10 = c15785cM100049l.f72799o;
                int i11 = c15785cM100049l.f72800p;
                int i12 = c15785cM100049l.f72801q;
                float f2 = c15785cM100049l.f72792h;
                strM149199a = lb5.m149199a(c15785cM100049l.f72785a, c15785cM100049l.f72786b, c15785cM100049l.f72787c);
                i3 = i11;
                i4 = i12;
                f = f2;
                i = i8;
                i2 = i9;
                i5 = i10;
            } else {
                strM149199a = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                f = 1.0f;
                i5 = -1;
            }
            return new ip1(arrayList, iM110279H, i, i2, i5, i3, i4, f, strM149199a);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
