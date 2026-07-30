package com.p046p1.mobile.putong.live.external.page.setting.hideavatar.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.a0l;
import p149l.c0l;
import p149l.e30;
import p149l.g3c0;
import p149l.hxs;
import p149l.l1d0;
import p149l.lmj;
import p149l.lsi0;
import p149l.s9s;
import p149l.t100;
import p149l.vdt;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class HideAvatarItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f46184d;

    /* JADX INFO: renamed from: e */
    public VImage f46185e;

    /* JADX INFO: renamed from: f */
    public VImage f46186f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f46187g;

    /* JADX INFO: renamed from: h */
    public VText f46188h;

    /* JADX INFO: renamed from: i */
    public VText f46189i;

    /* JADX INFO: renamed from: j */
    public VButton f46190j;

    /* JADX INFO: renamed from: k */
    public VText f46191k;

    public HideAvatarItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70778i0(View view) {
        c0l.m104771a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m70779j0(a0l a0lVar, e30<a0l> e30Var) {
        if (a0lVar.m94438g().todayDisable || a0lVar.m94441j()) {
            return;
        }
        if (a0lVar.m94442k()) {
            lsi0.m151593w(R$string.f44144X0);
        } else if (a0lVar.m94439h() || a0lVar.m94440i()) {
            e30Var.call(a0lVar);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m70780k0(a0l a0lVar, e30 e30Var, View view) {
        m70779j0(a0lVar, e30Var);
    }

    /* JADX INFO: renamed from: l0 */
    public void m70781l0(a0l a0lVar) {
        BLiveRightItem bLiveRightItemM94438g = a0lVar.m94438g();
        Context context = getContext();
        this.f46190j.setBackgroundResource(g3c0.f100423j);
        this.f46190j.setTextColor(-1);
        if (bLiveRightItemM94438g.isActive() && bLiveRightItemM94438g.todayDisable) {
            this.f46190j.setText(context.getString(R$string.f44168g0));
        } else if (bLiveRightItemM94438g.isGray()) {
            this.f46190j.setText(context.getString(R$string.f44138U0));
            this.f46190j.setBackgroundResource(g3c0.f100417g);
            this.f46190j.setTextColor(Color.parseColor("#bfbfbf"));
        } else if (bLiveRightItemM94438g.isActive()) {
            this.f46190j.setText(context.getString(R$string.f44132R0));
        } else {
            boolean zIsLocked = bLiveRightItemM94438g.isLocked();
            VButton vButton = this.f46190j;
            if (zIsLocked) {
                vButton.setText(context.getString(R$string.f44171h0));
            } else {
                vButton.setText(context.getString(R$string.f44199q1));
            }
        }
        xdl0.m208344M(this.f46185e, bLiveRightItemM94438g.isEquipped());
        xdl0.m208344M(this.f46186f, bLiveRightItemM94438g.isLocked());
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: m0 */
    public void m70782m0(final a0l a0lVar, final e30<a0l> e30Var) {
        BLiveRightItem bLiveRightItemM94438g = a0lVar.m94438g();
        this.f46184d.setText(l1d0.m148160e(getContext(), bLiveRightItemM94438g));
        xdl0.m208345M0(this.f46184d, !bLiveRightItemM94438g.isGray());
        hxs.m133406s("context_common", this.f46187g, bLiveRightItemM94438g.getThumbnailUrl());
        this.f46188h.setText(lmj.m150590a(bLiveRightItemM94438g.rightName));
        this.f46189i.setText(lmj.m150590a(bLiveRightItemM94438g.description));
        int i = a0lVar.m94436e().switchCount;
        this.f46191k.setText(s9s.f163227a.getString(R$string.f44125O, Integer.valueOf(i)));
        xdl0.m208345M0(this.f46191k, i > 0);
        m70781l0(a0lVar);
        xdl0.m208329E0(this.f46190j, new View.OnClickListener() { // from class: l.b0l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72445a.m70780k0(a0lVar, e30Var, view);
            }
        });
        if (vdt.m198092b(2)) {
            return;
        }
        this.f46189i.setMaxLines(3);
        xdl0.m208360X(this.f46190j, t100.m186890d(12.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70778i0(this);
    }

    public HideAvatarItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HideAvatarItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
