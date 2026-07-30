package p002l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public interface utl {
    /* JADX INFO: renamed from: C */
    View mo25C(int i);

    /* JADX INFO: renamed from: e */
    void mo27e();

    int getCountHook();

    int getFirstVisiblePositionHook();

    int getHeaderViewsCountHook();

    int getLastVisiblePositionHook();

    int getListRenderHeight();

    ViewGroup getRealView();

    /* JADX INFO: renamed from: j */
    void mo28j(int i, int i2);

    /* JADX INFO: renamed from: m */
    boolean mo30m();

    /* JADX INFO: renamed from: n */
    void mo31n(jf50 jf50Var);

    /* JADX INFO: renamed from: p */
    void mo32p(int i);

    void setMessageAdapterHook(o000 o000Var);

    void setSelectionHook(int i);

    /* JADX INFO: renamed from: u */
    void mo34u();

    /* JADX INFO: renamed from: x */
    void mo36x(int i);

    /* JADX INFO: renamed from: A */
    default void mo23A() {
    }

    /* JADX INFO: renamed from: d */
    default void mo26d() {
    }

    /* JADX INFO: renamed from: l */
    default void mo29l() {
    }

    /* JADX INFO: renamed from: s */
    default void mo33s() {
    }

    /* JADX INFO: renamed from: v */
    default void mo35v() {
    }

    /* JADX INFO: renamed from: B */
    default void mo24B(jf50 jf50Var) {
    }
}
