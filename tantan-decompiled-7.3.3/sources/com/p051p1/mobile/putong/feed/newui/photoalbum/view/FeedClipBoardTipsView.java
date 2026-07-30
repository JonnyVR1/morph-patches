package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.bnl0;
import p153l.dwg;
import p153l.l51;
import p153l.lbc0;
import p153l.r1j0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedClipBoardTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f43205a;

    /* JADX INFO: renamed from: b */
    public String f43206b;

    /* JADX INFO: renamed from: c */
    public x20 f43207c;

    public FeedClipBoardTipsView(Context context) {
        super(context);
        m66276c(context);
    }

    /* JADX INFO: renamed from: b */
    public View m66275b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dwg.m118413b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m66276c(Context context) {
        addView(m66275b(LayoutInflater.from(context), this));
        m66277d();
    }

    /* JADX INFO: renamed from: d */
    public final void m66277d() {
        bnl0.m105509E0(this.f43205a, new View.OnClickListener() { // from class: l.cwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84122a.m66278e(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m66278e(View view) {
        l51.m152911q(this.f43206b);
        r1j0.m179420g(getContext().getString(R$string.f39740F0));
        if (NullChecker.m82486a(this.f43207c)) {
            this.f43207c.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m66279f(String str, boolean z, x20 x20Var) {
        this.f43206b = str;
        this.f43207c = x20Var;
        VFrame vFrame = this.f43205a;
        if (z) {
            vFrame.setBackgroundResource(lbc0.f130831E0);
        } else {
            vFrame.setBackgroundResource(lbc0.f130823D0);
        }
    }

    public FeedClipBoardTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66276c(context);
    }

    public FeedClipBoardTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66276c(context);
    }
}
