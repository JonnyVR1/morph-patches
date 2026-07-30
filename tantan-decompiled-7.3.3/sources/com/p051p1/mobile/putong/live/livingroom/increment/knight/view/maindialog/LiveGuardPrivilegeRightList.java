package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import p151v.VRecyclerView;
import p153l.ats;
import p153l.bnl0;
import p153l.lsw;
import p153l.vts;
import p153l.wts;
import p153l.y20;
import p153l.yuk;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeRightList extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeRightList f51349d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f51350e;

    /* JADX INFO: renamed from: f */
    public LiveGuardPrivilegeActiveButton f51351f;

    public LiveGuardPrivilegeRightList(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75874i0(View view) {
        wts.m207907a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m75875j0(lsw.C18451a c18451a, String str) {
        this.f51351f.m75864Z(str, c18451a);
    }

    /* JADX INFO: renamed from: k0 */
    public void m75876k0(ats atsVar, lsw.C18451a c18451a, boolean z) {
        vts vtsVar = new vts(this.f51350e);
        vtsVar.m202764G(c18451a.f133489j);
        this.f51350e.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f51350e.setAdapter(vtsVar);
        m75877l0(atsVar, c18451a, z);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m75877l0(ats atsVar, final lsw.C18451a c18451a, boolean z) {
        if (z) {
            bnl0.m105525M0(this.f51351f, false);
            return;
        }
        boolean z2 = !c18451a.f133485f || ((yuk) atsVar.f48554b).m217413e4(c18451a.f133480a);
        bnl0.m105525M0(this.f51351f, z2);
        if (z2) {
            this.f51351f.m75863Y(atsVar, c18451a);
            atsVar.m100255K(new y20() { // from class: l.uts
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180991a.m75875j0(c18451a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m75878m0() {
        this.f51351f.m75865a0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75874i0(this);
    }

    public LiveGuardPrivilegeRightList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeRightList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
