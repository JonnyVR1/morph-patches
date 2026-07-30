package p153l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public interface iwl {
    /* JADX INFO: renamed from: C */
    View mo50794C(int i);

    /* JADX INFO: renamed from: e */
    void mo50796e();

    int getCountHook();

    int getFirstVisiblePositionHook();

    int getHeaderViewsCountHook();

    int getLastVisiblePositionHook();

    int getListRenderHeight();

    ViewGroup getRealView();

    /* JADX INFO: renamed from: j */
    void mo50797j(int i, int i2);

    /* JADX INFO: renamed from: m */
    boolean mo50799m();

    /* JADX INFO: renamed from: n */
    void mo50800n(pn50 pn50Var);

    /* JADX INFO: renamed from: p */
    void mo50801p(int i);

    void setMessageAdapterHook(l900 l900Var);

    void setSelectionHook(int i);

    /* JADX INFO: renamed from: u */
    void mo50803u();

    /* JADX INFO: renamed from: x */
    void mo50805x(int i);

    /* JADX INFO: renamed from: A */
    default void mo50792A() {
    }

    /* JADX INFO: renamed from: d */
    default void mo50795d() {
    }

    /* JADX INFO: renamed from: l */
    default void mo50798l() {
    }

    /* JADX INFO: renamed from: s */
    default void mo50802s() {
    }

    /* JADX INFO: renamed from: v */
    default void mo50804v() {
    }

    /* JADX INFO: renamed from: B */
    default void mo50793B(pn50 pn50Var) {
    }
}
