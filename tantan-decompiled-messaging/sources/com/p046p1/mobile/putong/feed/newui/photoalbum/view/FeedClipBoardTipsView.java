package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.d30;
import p149l.e51;
import p149l.f3c0;
import p149l.osi0;
import p149l.oug;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedClipBoardTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f42357a;

    /* JADX INFO: renamed from: b */
    public String f42358b;

    /* JADX INFO: renamed from: c */
    public d30 f42359c;

    public FeedClipBoardTipsView(Context context) {
        super(context);
        m65093c(context);
    }

    /* JADX INFO: renamed from: b */
    public View m65092b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oug.m166068b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m65093c(Context context) {
        addView(m65092b(LayoutInflater.from(context), this));
        m65094d();
    }

    /* JADX INFO: renamed from: d */
    public final void m65094d() {
        xdl0.m208329E0(this.f42357a, new View.OnClickListener() { // from class: l.nug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140623a.m65095e(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m65095e(View view) {
        e51.m114766q(this.f42358b);
        osi0.m165783g(getContext().getString(R$string.f38892F0));
        if (NullChecker.m81303a(this.f42359c)) {
            this.f42359c.call();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m65096f(String str, boolean z, d30 d30Var) {
        this.f42358b = str;
        this.f42359c = d30Var;
        VFrame vFrame = this.f42357a;
        if (z) {
            vFrame.setBackgroundResource(f3c0.f94313E0);
        } else {
            vFrame.setBackgroundResource(f3c0.f94305D0);
        }
    }

    public FeedClipBoardTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65093c(context);
    }

    public FeedClipBoardTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65093c(context);
    }
}
