package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e51;
import l.osi0;
import l.xdl0;
import p007l.f3c0;
import p007l.oug;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedClipBoardTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f3818a;

    /* JADX INFO: renamed from: b */
    public String f3819b;

    /* JADX INFO: renamed from: c */
    public d30 f3820c;

    public FeedClipBoardTipsView(Context context) {
        super(context);
        m6194c(context);
    }

    /* JADX INFO: renamed from: b */
    public View m6193b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oug.m12857b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m6194c(Context context) {
        addView(m6193b(LayoutInflater.from(context), this));
        m6195d();
    }

    /* JADX INFO: renamed from: d */
    public final void m6195d() {
        xdl0.E0(this.f3818a, new View.OnClickListener() { // from class: l.nug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10887a.m6196e(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m6196e(View view) {
        e51.q(this.f3819b);
        osi0.g(getContext().getString(R$string.f353F0));
        if (NullChecker.a(this.f3820c)) {
            this.f3820c.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m6197f(String str, boolean z, d30 d30Var) {
        this.f3819b = str;
        this.f3820c = d30Var;
        VFrame vFrame = this.f3818a;
        if (z) {
            vFrame.setBackgroundResource(f3c0.f7596E0);
        } else {
            vFrame.setBackgroundResource(f3c0.f7588D0);
        }
    }

    public FeedClipBoardTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6194c(context);
    }

    public FeedClipBoardTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6194c(context);
    }
}
