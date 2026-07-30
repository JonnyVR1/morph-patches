package p149l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mqx0 implements m8y0 {

    /* JADX INFO: renamed from: a */
    public final zzjc f135312a;

    public mqx0(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) ctx0.m108708f(zzjcVar, "output");
        this.f135312a = zzjcVar2;
        zzjcVar2.f10297a = this;
    }

    /* JADX INFO: renamed from: N */
    public static mqx0 m156008N(zzjc zzjcVar) {
        mqx0 mqx0Var = zzjcVar.f10297a;
        return mqx0Var != null ? mqx0Var : new mqx0(zzjcVar);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: A */
    public final void mo153525A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zwx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14688P(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14653e0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14653e0 += zzjc.m14653e0(list.get(i3).longValue());
            }
            this.f135312a.mo14692Y(iM14653e0);
            while (i2 < list.size()) {
                this.f135312a.mo14690R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        if (!z) {
            while (i2 < zwx0Var.size()) {
                this.f135312a.mo14688P(i, zwx0Var.mo200056e(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14653e1 = 0;
        for (int i4 = 0; i4 < zwx0Var.size(); i4++) {
            iM14653e1 += zzjc.m14653e0(zwx0Var.mo200056e(i4));
        }
        this.f135312a.mo14692Y(iM14653e1);
        while (i2 < zwx0Var.size()) {
            this.f135312a.mo14690R(zwx0Var.mo200056e(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: B */
    public final void mo153526B(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof gtx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.m14680C0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14672s0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14672s0 += zzjc.m14672s0(list.get(i3).intValue());
            }
            this.f135312a.mo14692Y(iM14672s0);
            while (i2 < list.size()) {
                this.f135312a.m14679B0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        if (!z) {
            while (i2 < gtx0Var.size()) {
                this.f135312a.m14680C0(i, gtx0Var.m128007c(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14672s1 = 0;
        for (int i4 = 0; i4 < gtx0Var.size(); i4++) {
            iM14672s1 += zzjc.m14672s0(gtx0Var.m128007c(i4));
        }
        this.f135312a.mo14692Y(iM14672s1);
        while (i2 < gtx0Var.size()) {
            this.f135312a.m14679B0(gtx0Var.m128007c(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: C */
    public final void mo153527C(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zwx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14699o(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14644W = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14644W += zzjc.m14644W(list.get(i3).longValue());
            }
            this.f135312a.mo14692Y(iM14644W);
            while (i2 < list.size()) {
                this.f135312a.mo14705u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        if (!z) {
            while (i2 < zwx0Var.size()) {
                this.f135312a.mo14699o(i, zwx0Var.mo200056e(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14644W2 = 0;
        for (int i4 = 0; i4 < zwx0Var.size(); i4++) {
            iM14644W2 += zzjc.m14644W(zwx0Var.mo200056e(i4));
        }
        this.f135312a.mo14692Y(iM14644W2);
        while (i2 < zwx0Var.size()) {
            this.f135312a.mo14705u(zwx0Var.mo200056e(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: D */
    public final void mo153528D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof gtx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14698n(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14656g0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14656g0 += zzjc.m14656g0(list.get(i3).intValue());
            }
            this.f135312a.mo14692Y(iM14656g0);
            while (i2 < list.size()) {
                this.f135312a.mo14697m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        if (!z) {
            while (i2 < gtx0Var.size()) {
                this.f135312a.mo14698n(i, gtx0Var.m128007c(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14656g1 = 0;
        for (int i4 = 0; i4 < gtx0Var.size(); i4++) {
            iM14656g1 += zzjc.m14656g0(gtx0Var.m128007c(i4));
        }
        this.f135312a.mo14692Y(iM14656g1);
        while (i2 < gtx0Var.size()) {
            this.f135312a.mo14697m(gtx0Var.m128007c(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: E */
    public final void mo153529E(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof rsx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.m14686N(i, list.get(i2).floatValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14650d = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14650d += zzjc.m14650d(list.get(i3).floatValue());
            }
            this.f135312a.mo14692Y(iM14650d);
            while (i2 < list.size()) {
                this.f135312a.m14683K(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        rsx0 rsx0Var = (rsx0) list;
        if (!z) {
            while (i2 < rsx0Var.size()) {
                this.f135312a.m14686N(i, rsx0Var.m180745f(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14650d2 = 0;
        for (int i4 = 0; i4 < rsx0Var.size(); i4++) {
            iM14650d2 += zzjc.m14650d(rsx0Var.m180745f(i4));
        }
        this.f135312a.mo14692Y(iM14650d2);
        while (i2 < rsx0Var.size()) {
            this.f135312a.m14683K(rsx0Var.m180745f(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: F */
    public final void mo153530F(int i, Object obj, i3y0 i3y0Var) throws IOException {
        zzjc zzjcVar = this.f135312a;
        zzjcVar.mo14693Z(i, 3);
        i3y0Var.mo14456a((g0y0) obj, zzjcVar.f10297a);
        zzjcVar.mo14693Z(i, 4);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: G */
    public final void mo153531G(int i, Object obj, i3y0 i3y0Var) throws IOException {
        this.f135312a.mo14703s(i, (g0y0) obj, i3y0Var);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: H */
    public final void mo153532H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof gtx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14695f0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14678z0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14678z0 += zzjc.m14678z0(list.get(i3).intValue());
            }
            this.f135312a.mo14692Y(iM14678z0);
            while (i2 < list.size()) {
                this.f135312a.mo14692Y(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        if (!z) {
            while (i2 < gtx0Var.size()) {
                this.f135312a.mo14695f0(i, gtx0Var.m128007c(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14678z1 = 0;
        for (int i4 = 0; i4 < gtx0Var.size(); i4++) {
            iM14678z1 += zzjc.m14678z0(gtx0Var.m128007c(i4));
        }
        this.f135312a.mo14692Y(iM14678z1);
        while (i2 < gtx0Var.size()) {
            this.f135312a.mo14692Y(gtx0Var.m128007c(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: I */
    public final void mo153533I(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof hwx0)) {
            while (i2 < list.size()) {
                this.f135312a.mo14701q(i, list.get(i2));
                i2++;
            }
            return;
        }
        hwx0 hwx0Var = (hwx0) list;
        while (i2 < list.size()) {
            Object objZza = hwx0Var.zza(i2);
            boolean z = objZza instanceof String;
            zzjc zzjcVar = this.f135312a;
            if (z) {
                zzjcVar.mo14701q(i, (String) objZza);
            } else {
                zzjcVar.mo14700p(i, (zzik) objZza);
            }
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: J */
    public final void mo153534J(int i, List<zzik> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f135312a.mo14700p(i, list.get(i2));
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: K */
    public final void mo153535K(int i, List<?> list, i3y0 i3y0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo153530F(i, list.get(i2), i3y0Var);
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: L */
    public final void mo153536L(int i, List<?> list, i3y0 i3y0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo153531G(i, list.get(i2), i3y0Var);
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: M */
    public final <K, V> void mo153537M(int i, byx0<K, V> byx0Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f135312a.mo14693Z(i, 2);
            this.f135312a.mo14692Y(gyx0.m128787a(byx0Var, entry.getKey(), entry.getValue()));
            gyx0.m128788b(this.f135312a, byx0Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: a */
    public final void mo153538a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof gtx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14687O(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14647b0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14647b0 += zzjc.m14647b0(list.get(i3).intValue());
            }
            this.f135312a.mo14692Y(iM14647b0);
            while (i2 < list.size()) {
                this.f135312a.mo14684L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        if (!z) {
            while (i2 < gtx0Var.size()) {
                this.f135312a.mo14687O(i, gtx0Var.m128007c(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14647b1 = 0;
        for (int i4 = 0; i4 < gtx0Var.size(); i4++) {
            iM14647b1 += zzjc.m14647b0(gtx0Var.m128007c(i4));
        }
        this.f135312a.mo14692Y(iM14647b1);
        while (i2 < gtx0Var.size()) {
            this.f135312a.mo14684L(gtx0Var.m128007c(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: b */
    public final void mo153539b(int i, long j) throws IOException {
        this.f135312a.mo14699o(i, j);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: c */
    public final void mo153540c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zwx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.m14706u0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14667n0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14667n0 += zzjc.m14667n0(list.get(i3).longValue());
            }
            this.f135312a.mo14692Y(iM14667n0);
            while (i2 < list.size()) {
                this.f135312a.m14708v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        if (!z) {
            while (i2 < zwx0Var.size()) {
                this.f135312a.m14706u0(i, zwx0Var.mo200056e(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14667n1 = 0;
        for (int i4 = 0; i4 < zwx0Var.size(); i4++) {
            iM14667n1 += zzjc.m14667n0(zwx0Var.mo200056e(i4));
        }
        this.f135312a.mo14692Y(iM14667n1);
        while (i2 < zwx0Var.size()) {
            this.f135312a.m14708v0(zwx0Var.mo200056e(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: d */
    public final void mo153541d(int i, String str) throws IOException {
        this.f135312a.mo14701q(i, str);
    }

    @Override // p149l.m8y0
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void mo153542e(int i) throws IOException {
        this.f135312a.mo14693Z(i, 3);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: f */
    public final void mo153543f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zwx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14699o(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14662j0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14662j0 += zzjc.m14662j0(list.get(i3).longValue());
            }
            this.f135312a.mo14692Y(iM14662j0);
            while (i2 < list.size()) {
                this.f135312a.mo14705u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        if (!z) {
            while (i2 < zwx0Var.size()) {
                this.f135312a.mo14699o(i, zwx0Var.mo200056e(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14662j1 = 0;
        for (int i4 = 0; i4 < zwx0Var.size(); i4++) {
            iM14662j1 += zzjc.m14662j0(zwx0Var.mo200056e(i4));
        }
        this.f135312a.mo14692Y(iM14662j1);
        while (i2 < zwx0Var.size()) {
            this.f135312a.mo14705u(zwx0Var.mo200056e(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: g */
    public final void mo153544g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof gtx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14687O(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14664k0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14664k0 += zzjc.m14664k0(list.get(i3).intValue());
            }
            this.f135312a.mo14692Y(iM14664k0);
            while (i2 < list.size()) {
                this.f135312a.mo14684L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        if (!z) {
            while (i2 < gtx0Var.size()) {
                this.f135312a.mo14687O(i, gtx0Var.m128007c(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14664k1 = 0;
        for (int i4 = 0; i4 < gtx0Var.size(); i4++) {
            iM14664k1 += zzjc.m14664k0(gtx0Var.m128007c(i4));
        }
        this.f135312a.mo14692Y(iM14664k1);
        while (i2 < gtx0Var.size()) {
            this.f135312a.mo14684L(gtx0Var.m128007c(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: h */
    public final void mo153545h(int i, boolean z) throws IOException {
        this.f135312a.mo14704t(i, z);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: i */
    public final void mo153546i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zwx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14688P(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14671r0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14671r0 += zzjc.m14671r0(list.get(i3).longValue());
            }
            this.f135312a.mo14692Y(iM14671r0);
            while (i2 < list.size()) {
                this.f135312a.mo14690R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        zwx0 zwx0Var = (zwx0) list;
        if (!z) {
            while (i2 < zwx0Var.size()) {
                this.f135312a.mo14688P(i, zwx0Var.mo200056e(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14671r1 = 0;
        for (int i4 = 0; i4 < zwx0Var.size(); i4++) {
            iM14671r1 += zzjc.m14671r0(zwx0Var.mo200056e(i4));
        }
        this.f135312a.mo14692Y(iM14671r1);
        while (i2 < zwx0Var.size()) {
            this.f135312a.mo14690R(zwx0Var.mo200056e(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: j */
    public final void mo153547j(int i, long j) throws IOException {
        this.f135312a.mo14688P(i, j);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: k */
    public final void mo153548k(int i, int i2) throws IOException {
        this.f135312a.mo14698n(i, i2);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: l */
    public final void mo153549l(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zlx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14704t(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14661j = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14661j += zzjc.m14661j(list.get(i3).booleanValue());
            }
            this.f135312a.mo14692Y(iM14661j);
            while (i2 < list.size()) {
                this.f135312a.m14691S(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        zlx0 zlx0Var = (zlx0) list;
        if (!z) {
            while (i2 < zlx0Var.size()) {
                this.f135312a.mo14704t(i, zlx0Var.m219296f(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14661j2 = 0;
        for (int i4 = 0; i4 < zlx0Var.size(); i4++) {
            iM14661j2 += zzjc.m14661j(zlx0Var.m219296f(i4));
        }
        this.f135312a.mo14692Y(iM14661j2);
        while (i2 < zlx0Var.size()) {
            this.f135312a.m14691S(zlx0Var.m219296f(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: m */
    public final void mo153550m(int i, int i2) throws IOException {
        this.f135312a.mo14687O(i, i2);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: n */
    public final void mo153551n(int i, long j) throws IOException {
        this.f135312a.mo14699o(i, j);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: o */
    public final void mo153552o(int i, Object obj) throws IOException {
        boolean z = obj instanceof zzik;
        zzjc zzjcVar = this.f135312a;
        if (z) {
            zzjcVar.mo14689Q(i, (zzik) obj);
        } else {
            zzjcVar.mo14702r(i, (g0y0) obj);
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: p */
    public final void mo153553p(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof iqx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.m14685M(i, list.get(i2).doubleValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14648c = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14648c += zzjc.m14648c(list.get(i3).doubleValue());
            }
            this.f135312a.mo14692Y(iM14648c);
            while (i2 < list.size()) {
                this.f135312a.m14682J(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        iqx0 iqx0Var = (iqx0) list;
        if (!z) {
            while (i2 < iqx0Var.size()) {
                this.f135312a.m14685M(i, iqx0Var.m137812f(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14648c2 = 0;
        for (int i4 = 0; i4 < iqx0Var.size(); i4++) {
            iM14648c2 += zzjc.m14648c(iqx0Var.m137812f(i4));
        }
        this.f135312a.mo14692Y(iM14648c2);
        while (i2 < iqx0Var.size()) {
            this.f135312a.m14682J(iqx0Var.m137812f(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: q */
    public final void mo153554q(int i, int i2) throws IOException {
        this.f135312a.mo14687O(i, i2);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: r */
    public final void mo153555r(int i, double d) throws IOException {
        this.f135312a.m14685M(i, d);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: s */
    public final void mo153556s(int i, float f) throws IOException {
        this.f135312a.m14686N(i, f);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: t */
    public final void mo153557t(int i, int i2) throws IOException {
        this.f135312a.mo14695f0(i, i2);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: u */
    public final void mo153558u(int i, int i2) throws IOException {
        this.f135312a.mo14698n(i, i2);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: v */
    public final void mo153559v(int i, long j) throws IOException {
        this.f135312a.m14706u0(i, j);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: w */
    public final void mo153560w(int i, int i2) throws IOException {
        this.f135312a.m14680C0(i, i2);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: x */
    public final void mo153561x(int i, long j) throws IOException {
        this.f135312a.mo14688P(i, j);
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: y */
    public final void mo153562y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof gtx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f135312a.mo14698n(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f135312a.mo14693Z(i, 2);
            int iM14668o0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14668o0 += zzjc.m14668o0(list.get(i3).intValue());
            }
            this.f135312a.mo14692Y(iM14668o0);
            while (i2 < list.size()) {
                this.f135312a.mo14697m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        gtx0 gtx0Var = (gtx0) list;
        if (!z) {
            while (i2 < gtx0Var.size()) {
                this.f135312a.mo14698n(i, gtx0Var.m128007c(i2));
                i2++;
            }
            return;
        }
        this.f135312a.mo14693Z(i, 2);
        int iM14668o1 = 0;
        for (int i4 = 0; i4 < gtx0Var.size(); i4++) {
            iM14668o1 += zzjc.m14668o0(gtx0Var.m128007c(i4));
        }
        this.f135312a.mo14692Y(iM14668o1);
        while (i2 < gtx0Var.size()) {
            this.f135312a.mo14697m(gtx0Var.m128007c(i2));
            i2++;
        }
    }

    @Override // p149l.m8y0
    /* JADX INFO: renamed from: z */
    public final void mo153563z(int i, zzik zzikVar) throws IOException {
        this.f135312a.mo14700p(i, zzikVar);
    }

    @Override // p149l.m8y0
    @Deprecated
    public final void zza(int i) throws IOException {
        this.f135312a.mo14693Z(i, 4);
    }

    @Override // p149l.m8y0
    public final int zza() {
        return 1;
    }
}
