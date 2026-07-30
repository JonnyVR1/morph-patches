package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import l.e30;
import l.xdl0;
import p002l.isk;
import p002l.mpw;
import p002l.urs;
import p002l.vrs;
import p002l.zqs;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardPrivilegeRightList extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeRightList f6543d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f6544e;

    /* JADX INFO: renamed from: f */
    public LiveGuardPrivilegeActiveButton f6545f;

    public LiveGuardPrivilegeRightList(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8285i0(View view) {
        vrs.m24110a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m8286j0(mpw.C0681a c0681a, String str) {
        this.f6545f.m8275Z(str, c0681a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m8287k0(zqs zqsVar, mpw.C0681a c0681a, boolean z) {
        urs ursVar = new urs(this.f6544e);
        ursVar.m23589G(c0681a.f15541j);
        this.f6544e.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f6544e.setAdapter(ursVar);
        m8288l0(zqsVar, c0681a, z);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8288l0(zqs zqsVar, final mpw.C0681a c0681a, boolean z) {
        if (z) {
            xdl0.M0(this.f6545f, false);
            return;
        }
        boolean z2 = !c0681a.f15537f || ((isk) zqsVar.f3748b).m15352e4(c0681a.f15532a);
        xdl0.M0(this.f6545f, z2);
        if (z2) {
            this.f6545f.m8274Y(zqsVar, c0681a);
            zqsVar.m27517K(new e30() { // from class: l.trs
                public final void call(Object obj) {
                    this.f20361a.m8286j0(c0681a, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m8289m0() {
        this.f6545f.m8276a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8285i0(this);
    }

    public LiveGuardPrivilegeRightList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGuardPrivilegeRightList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
