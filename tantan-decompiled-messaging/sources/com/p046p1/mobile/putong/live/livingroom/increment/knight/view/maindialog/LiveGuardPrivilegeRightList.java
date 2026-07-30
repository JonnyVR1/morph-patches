package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import p147v.VRecyclerView;
import p149l.e30;
import p149l.isk;
import p149l.mpw;
import p149l.urs;
import p149l.vrs;
import p149l.xdl0;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeRightList extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeRightList f50501d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f50502e;

    /* JADX INFO: renamed from: f */
    public LiveGuardPrivilegeActiveButton f50503f;

    public LiveGuardPrivilegeRightList(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74691i0(View view) {
        vrs.m199750a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m74692j0(mpw.C18528a c18528a, String str) {
        this.f50503f.m74681Z(str, c18528a);
    }

    /* JADX INFO: renamed from: k0 */
    public void m74693k0(zqs zqsVar, mpw.C18528a c18528a, boolean z) {
        urs ursVar = new urs(this.f50502e);
        ursVar.m195122G(c18528a.f135113j);
        this.f50502e.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f50502e.setAdapter(ursVar);
        m74694l0(zqsVar, c18528a, z);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74694l0(zqs zqsVar, final mpw.C18528a c18528a, boolean z) {
        if (z) {
            xdl0.m208345M0(this.f50503f, false);
            return;
        }
        boolean z2 = !c18528a.f135109f || ((isk) zqsVar.f47706b).m138013e4(c18528a.f135104a);
        xdl0.m208345M0(this.f50503f, z2);
        if (z2) {
            this.f50503f.m74680Y(zqsVar, c18528a);
            zqsVar.m219889K(new e30() { // from class: l.trs
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171842a.m74692j0(c18528a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m74695m0() {
        this.f50503f.m74682a0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74691i0(this);
    }

    public LiveGuardPrivilegeRightList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeRightList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
