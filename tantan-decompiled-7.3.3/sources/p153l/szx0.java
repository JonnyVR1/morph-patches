package p153l;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzjc;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class szx0 implements shy0 {

    /* JADX INFO: renamed from: a */
    public final zzjc f171435a;

    public szx0(zzjc zzjcVar) {
        zzjc zzjcVar2 = (zzjc) i2y0.m138254f(zzjcVar, "output");
        this.f171435a = zzjcVar2;
        zzjcVar2.f10334a = this;
    }

    /* JADX INFO: renamed from: N */
    public static szx0 m188687N(zzjc zzjcVar) {
        szx0 szx0Var = zzjcVar.f10334a;
        return szx0Var != null ? szx0Var : new szx0(zzjcVar);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: A */
    public final void mo185954A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof f6y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14742P(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14707e0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14707e0 += zzjc.m14707e0(list.get(i3).longValue());
            }
            this.f171435a.mo14746Y(iM14707e0);
            while (i2 < list.size()) {
                this.f171435a.mo14744R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        if (!z) {
            while (i2 < f6y0Var.size()) {
                this.f171435a.mo14742P(i, f6y0Var.mo102379e(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14707e1 = 0;
        for (int i4 = 0; i4 < f6y0Var.size(); i4++) {
            iM14707e1 += zzjc.m14707e0(f6y0Var.mo102379e(i4));
        }
        this.f171435a.mo14746Y(iM14707e1);
        while (i2 < f6y0Var.size()) {
            this.f171435a.mo14744R(f6y0Var.mo102379e(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: B */
    public final void mo185955B(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof m2y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.m14734C0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14726s0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14726s0 += zzjc.m14726s0(list.get(i3).intValue());
            }
            this.f171435a.mo14746Y(iM14726s0);
            while (i2 < list.size()) {
                this.f171435a.m14733B0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        if (!z) {
            while (i2 < m2y0Var.size()) {
                this.f171435a.m14734C0(i, m2y0Var.m156911c(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14726s1 = 0;
        for (int i4 = 0; i4 < m2y0Var.size(); i4++) {
            iM14726s1 += zzjc.m14726s0(m2y0Var.m156911c(i4));
        }
        this.f171435a.mo14746Y(iM14726s1);
        while (i2 < m2y0Var.size()) {
            this.f171435a.m14733B0(m2y0Var.m156911c(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: C */
    public final void mo185956C(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof f6y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14753o(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14698W = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14698W += zzjc.m14698W(list.get(i3).longValue());
            }
            this.f171435a.mo14746Y(iM14698W);
            while (i2 < list.size()) {
                this.f171435a.mo14759u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        if (!z) {
            while (i2 < f6y0Var.size()) {
                this.f171435a.mo14753o(i, f6y0Var.mo102379e(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14698W2 = 0;
        for (int i4 = 0; i4 < f6y0Var.size(); i4++) {
            iM14698W2 += zzjc.m14698W(f6y0Var.mo102379e(i4));
        }
        this.f171435a.mo14746Y(iM14698W2);
        while (i2 < f6y0Var.size()) {
            this.f171435a.mo14759u(f6y0Var.mo102379e(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: D */
    public final void mo185957D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof m2y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14752n(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14710g0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14710g0 += zzjc.m14710g0(list.get(i3).intValue());
            }
            this.f171435a.mo14746Y(iM14710g0);
            while (i2 < list.size()) {
                this.f171435a.mo14751m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        if (!z) {
            while (i2 < m2y0Var.size()) {
                this.f171435a.mo14752n(i, m2y0Var.m156911c(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14710g1 = 0;
        for (int i4 = 0; i4 < m2y0Var.size(); i4++) {
            iM14710g1 += zzjc.m14710g0(m2y0Var.m156911c(i4));
        }
        this.f171435a.mo14746Y(iM14710g1);
        while (i2 < m2y0Var.size()) {
            this.f171435a.mo14751m(m2y0Var.m156911c(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: E */
    public final void mo185958E(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof x1y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.m14740N(i, list.get(i2).floatValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14704d = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14704d += zzjc.m14704d(list.get(i3).floatValue());
            }
            this.f171435a.mo14746Y(iM14704d);
            while (i2 < list.size()) {
                this.f171435a.m14737K(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        x1y0 x1y0Var = (x1y0) list;
        if (!z) {
            while (i2 < x1y0Var.size()) {
                this.f171435a.m14740N(i, x1y0Var.m209120f(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14704d2 = 0;
        for (int i4 = 0; i4 < x1y0Var.size(); i4++) {
            iM14704d2 += zzjc.m14704d(x1y0Var.m209120f(i4));
        }
        this.f171435a.mo14746Y(iM14704d2);
        while (i2 < x1y0Var.size()) {
            this.f171435a.m14737K(x1y0Var.m209120f(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: F */
    public final void mo185959F(int i, Object obj, ocy0 ocy0Var) throws IOException {
        zzjc zzjcVar = this.f171435a;
        zzjcVar.mo14747Z(i, 3);
        ocy0Var.mo14510a((m9y0) obj, zzjcVar.f10334a);
        zzjcVar.mo14747Z(i, 4);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: G */
    public final void mo185960G(int i, Object obj, ocy0 ocy0Var) throws IOException {
        this.f171435a.mo14757s(i, (m9y0) obj, ocy0Var);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: H */
    public final void mo185961H(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof m2y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14749f0(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14732z0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14732z0 += zzjc.m14732z0(list.get(i3).intValue());
            }
            this.f171435a.mo14746Y(iM14732z0);
            while (i2 < list.size()) {
                this.f171435a.mo14746Y(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        if (!z) {
            while (i2 < m2y0Var.size()) {
                this.f171435a.mo14749f0(i, m2y0Var.m156911c(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14732z1 = 0;
        for (int i4 = 0; i4 < m2y0Var.size(); i4++) {
            iM14732z1 += zzjc.m14732z0(m2y0Var.m156911c(i4));
        }
        this.f171435a.mo14746Y(iM14732z1);
        while (i2 < m2y0Var.size()) {
            this.f171435a.mo14746Y(m2y0Var.m156911c(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: I */
    public final void mo185962I(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof n5y0)) {
            while (i2 < list.size()) {
                this.f171435a.mo14755q(i, list.get(i2));
                i2++;
            }
            return;
        }
        n5y0 n5y0Var = (n5y0) list;
        while (i2 < list.size()) {
            Object objZza = n5y0Var.zza(i2);
            boolean z = objZza instanceof String;
            zzjc zzjcVar = this.f171435a;
            if (z) {
                zzjcVar.mo14755q(i, (String) objZza);
            } else {
                zzjcVar.mo14754p(i, (zzik) objZza);
            }
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: J */
    public final void mo185963J(int i, List<zzik> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f171435a.mo14754p(i, list.get(i2));
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: K */
    public final void mo185964K(int i, List<?> list, ocy0 ocy0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo185959F(i, list.get(i2), ocy0Var);
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: L */
    public final void mo185965L(int i, List<?> list, ocy0 ocy0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo185960G(i, list.get(i2), ocy0Var);
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: M */
    public final <K, V> void mo185966M(int i, h7y0<K, V> h7y0Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f171435a.mo14747Z(i, 2);
            this.f171435a.mo14746Y(m7y0.m157349a(h7y0Var, entry.getKey(), entry.getValue()));
            m7y0.m157350b(this.f171435a, h7y0Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: a */
    public final void mo185967a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof m2y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14741O(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14701b0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14701b0 += zzjc.m14701b0(list.get(i3).intValue());
            }
            this.f171435a.mo14746Y(iM14701b0);
            while (i2 < list.size()) {
                this.f171435a.mo14738L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        if (!z) {
            while (i2 < m2y0Var.size()) {
                this.f171435a.mo14741O(i, m2y0Var.m156911c(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14701b1 = 0;
        for (int i4 = 0; i4 < m2y0Var.size(); i4++) {
            iM14701b1 += zzjc.m14701b0(m2y0Var.m156911c(i4));
        }
        this.f171435a.mo14746Y(iM14701b1);
        while (i2 < m2y0Var.size()) {
            this.f171435a.mo14738L(m2y0Var.m156911c(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: b */
    public final void mo185968b(int i, long j) throws IOException {
        this.f171435a.mo14753o(i, j);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: c */
    public final void mo185969c(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof f6y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.m14760u0(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14721n0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14721n0 += zzjc.m14721n0(list.get(i3).longValue());
            }
            this.f171435a.mo14746Y(iM14721n0);
            while (i2 < list.size()) {
                this.f171435a.m14762v0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        if (!z) {
            while (i2 < f6y0Var.size()) {
                this.f171435a.m14760u0(i, f6y0Var.mo102379e(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14721n1 = 0;
        for (int i4 = 0; i4 < f6y0Var.size(); i4++) {
            iM14721n1 += zzjc.m14721n0(f6y0Var.mo102379e(i4));
        }
        this.f171435a.mo14746Y(iM14721n1);
        while (i2 < f6y0Var.size()) {
            this.f171435a.m14762v0(f6y0Var.mo102379e(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: d */
    public final void mo185970d(int i, String str) throws IOException {
        this.f171435a.mo14755q(i, str);
    }

    @Override // p153l.shy0
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void mo185971e(int i) throws IOException {
        this.f171435a.mo14747Z(i, 3);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: f */
    public final void mo185972f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof f6y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14753o(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14716j0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14716j0 += zzjc.m14716j0(list.get(i3).longValue());
            }
            this.f171435a.mo14746Y(iM14716j0);
            while (i2 < list.size()) {
                this.f171435a.mo14759u(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        if (!z) {
            while (i2 < f6y0Var.size()) {
                this.f171435a.mo14753o(i, f6y0Var.mo102379e(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14716j1 = 0;
        for (int i4 = 0; i4 < f6y0Var.size(); i4++) {
            iM14716j1 += zzjc.m14716j0(f6y0Var.mo102379e(i4));
        }
        this.f171435a.mo14746Y(iM14716j1);
        while (i2 < f6y0Var.size()) {
            this.f171435a.mo14759u(f6y0Var.mo102379e(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: g */
    public final void mo185973g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof m2y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14741O(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14718k0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14718k0 += zzjc.m14718k0(list.get(i3).intValue());
            }
            this.f171435a.mo14746Y(iM14718k0);
            while (i2 < list.size()) {
                this.f171435a.mo14738L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        if (!z) {
            while (i2 < m2y0Var.size()) {
                this.f171435a.mo14741O(i, m2y0Var.m156911c(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14718k1 = 0;
        for (int i4 = 0; i4 < m2y0Var.size(); i4++) {
            iM14718k1 += zzjc.m14718k0(m2y0Var.m156911c(i4));
        }
        this.f171435a.mo14746Y(iM14718k1);
        while (i2 < m2y0Var.size()) {
            this.f171435a.mo14738L(m2y0Var.m156911c(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: h */
    public final void mo185974h(int i, boolean z) throws IOException {
        this.f171435a.mo14758t(i, z);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: i */
    public final void mo185975i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof f6y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14742P(i, list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14725r0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14725r0 += zzjc.m14725r0(list.get(i3).longValue());
            }
            this.f171435a.mo14746Y(iM14725r0);
            while (i2 < list.size()) {
                this.f171435a.mo14744R(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        f6y0 f6y0Var = (f6y0) list;
        if (!z) {
            while (i2 < f6y0Var.size()) {
                this.f171435a.mo14742P(i, f6y0Var.mo102379e(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14725r1 = 0;
        for (int i4 = 0; i4 < f6y0Var.size(); i4++) {
            iM14725r1 += zzjc.m14725r0(f6y0Var.mo102379e(i4));
        }
        this.f171435a.mo14746Y(iM14725r1);
        while (i2 < f6y0Var.size()) {
            this.f171435a.mo14744R(f6y0Var.mo102379e(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: j */
    public final void mo185976j(int i, long j) throws IOException {
        this.f171435a.mo14742P(i, j);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: k */
    public final void mo185977k(int i, int i2) throws IOException {
        this.f171435a.mo14752n(i, i2);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: l */
    public final void mo185978l(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof fvx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14758t(i, list.get(i2).booleanValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14715j = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14715j += zzjc.m14715j(list.get(i3).booleanValue());
            }
            this.f171435a.mo14746Y(iM14715j);
            while (i2 < list.size()) {
                this.f171435a.m14745S(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        fvx0 fvx0Var = (fvx0) list;
        if (!z) {
            while (i2 < fvx0Var.size()) {
                this.f171435a.mo14758t(i, fvx0Var.m127744f(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14715j2 = 0;
        for (int i4 = 0; i4 < fvx0Var.size(); i4++) {
            iM14715j2 += zzjc.m14715j(fvx0Var.m127744f(i4));
        }
        this.f171435a.mo14746Y(iM14715j2);
        while (i2 < fvx0Var.size()) {
            this.f171435a.m14745S(fvx0Var.m127744f(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: m */
    public final void mo185979m(int i, int i2) throws IOException {
        this.f171435a.mo14741O(i, i2);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: n */
    public final void mo185980n(int i, long j) throws IOException {
        this.f171435a.mo14753o(i, j);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: o */
    public final void mo185981o(int i, Object obj) throws IOException {
        boolean z = obj instanceof zzik;
        zzjc zzjcVar = this.f171435a;
        if (z) {
            zzjcVar.mo14743Q(i, (zzik) obj);
        } else {
            zzjcVar.mo14756r(i, (m9y0) obj);
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: p */
    public final void mo185982p(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof ozx0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.m14739M(i, list.get(i2).doubleValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14702c = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14702c += zzjc.m14702c(list.get(i3).doubleValue());
            }
            this.f171435a.mo14746Y(iM14702c);
            while (i2 < list.size()) {
                this.f171435a.m14736J(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        ozx0 ozx0Var = (ozx0) list;
        if (!z) {
            while (i2 < ozx0Var.size()) {
                this.f171435a.m14739M(i, ozx0Var.m170008f(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14702c2 = 0;
        for (int i4 = 0; i4 < ozx0Var.size(); i4++) {
            iM14702c2 += zzjc.m14702c(ozx0Var.m170008f(i4));
        }
        this.f171435a.mo14746Y(iM14702c2);
        while (i2 < ozx0Var.size()) {
            this.f171435a.m14736J(ozx0Var.m170008f(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: q */
    public final void mo185983q(int i, int i2) throws IOException {
        this.f171435a.mo14741O(i, i2);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: r */
    public final void mo185984r(int i, double d) throws IOException {
        this.f171435a.m14739M(i, d);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: s */
    public final void mo185985s(int i, float f) throws IOException {
        this.f171435a.m14740N(i, f);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: t */
    public final void mo185986t(int i, int i2) throws IOException {
        this.f171435a.mo14749f0(i, i2);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: u */
    public final void mo185987u(int i, int i2) throws IOException {
        this.f171435a.mo14752n(i, i2);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: v */
    public final void mo185988v(int i, long j) throws IOException {
        this.f171435a.m14760u0(i, j);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: w */
    public final void mo185989w(int i, int i2) throws IOException {
        this.f171435a.m14734C0(i, i2);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: x */
    public final void mo185990x(int i, long j) throws IOException {
        this.f171435a.mo14742P(i, j);
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: y */
    public final void mo185991y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof m2y0)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.f171435a.mo14752n(i, list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            this.f171435a.mo14747Z(i, 2);
            int iM14722o0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM14722o0 += zzjc.m14722o0(list.get(i3).intValue());
            }
            this.f171435a.mo14746Y(iM14722o0);
            while (i2 < list.size()) {
                this.f171435a.mo14751m(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        m2y0 m2y0Var = (m2y0) list;
        if (!z) {
            while (i2 < m2y0Var.size()) {
                this.f171435a.mo14752n(i, m2y0Var.m156911c(i2));
                i2++;
            }
            return;
        }
        this.f171435a.mo14747Z(i, 2);
        int iM14722o1 = 0;
        for (int i4 = 0; i4 < m2y0Var.size(); i4++) {
            iM14722o1 += zzjc.m14722o0(m2y0Var.m156911c(i4));
        }
        this.f171435a.mo14746Y(iM14722o1);
        while (i2 < m2y0Var.size()) {
            this.f171435a.mo14751m(m2y0Var.m156911c(i2));
            i2++;
        }
    }

    @Override // p153l.shy0
    /* JADX INFO: renamed from: z */
    public final void mo185992z(int i, zzik zzikVar) throws IOException {
        this.f171435a.mo14754p(i, zzikVar);
    }

    @Override // p153l.shy0
    @Deprecated
    public final void zza(int i) throws IOException {
        this.f171435a.mo14747Z(i, 4);
    }

    @Override // p153l.shy0
    public final int zza() {
        return 1;
    }
}
