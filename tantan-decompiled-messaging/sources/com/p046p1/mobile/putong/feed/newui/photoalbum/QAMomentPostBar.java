package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.j760;
import p149l.oe40;
import p149l.okb0;
import p149l.uqd0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class QAMomentPostBar extends MomentPostBar {

    /* JADX INFO: renamed from: A */
    public uqd0 f41341A;

    /* JADX INFO: renamed from: u */
    public FrameLayout f41342u;

    /* JADX INFO: renamed from: v */
    public TextView f41343v;

    /* JADX INFO: renamed from: w */
    public ImageView f41344w;

    /* JADX INFO: renamed from: x */
    public ImageView f41345x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f41346y;

    /* JADX INFO: renamed from: z */
    public ProgressBar f41347z;

    public QAMomentPostBar(@NonNull Context context) {
        super(context);
        this.f41341A = new uqd0("current_qa_topic_post_moment_id", null);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: D */
    public void mo63233D() {
        this.f41015c = this.f41343v;
        this.f41016d = this.f41344w;
        this.f41017e = this.f41345x;
        this.f41018f = this.f41347z;
    }

    /* JADX INFO: renamed from: H */
    public final void m63870H(View view) {
        okb0.m164840a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m63871I(View view) {
        this.f41032t.call(view);
    }

    /* JADX INFO: renamed from: J */
    public void m63872J() {
        String str = this.f41341A.get();
        if (NullChecker.m81303a(str)) {
            this.f41021i = FeedModule.f38854c.m60709X3(str);
        }
        if (this.f41021i == null) {
            return;
        }
        this.f41341A.clear();
        this.f41021i = null;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: j */
    public void mo63238j(j760<Integer, Moment> j760Var) {
        long j;
        int i;
        int iIntValue = j760Var.f116564a.intValue();
        if (iIntValue == 6) {
            return;
        }
        if (iIntValue != 4 && (!xdl0.m208349O0(this) || getHeight() == 0)) {
            m63230A();
        }
        Moment moment = j760Var.f116565b;
        this.f41022j = this.f41347z.getProgress();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                this.f41341A.put(moment.f56011id);
                return;
            }
            Runnable runnable = null;
            if (iIntValue == 2) {
                j = (long) this.f41024l;
                i = 475;
            } else if (iIntValue == 3) {
                j = (long) this.f41025m;
                i = 495;
            } else if (iIntValue != 4) {
                j = 0;
                i = 0;
                if (iIntValue == 5) {
                    this.f41022j = 0;
                    mo63253z(true);
                }
            } else {
                oe40.m163799A0(new j760(6, null));
                this.f41021i = null;
                runnable = new Runnable() { // from class: l.nkb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f139388a.m63242n();
                    }
                };
                this.f41341A.clear();
                j = 10;
                i = 500;
            }
            m63251x(j, this.f41022j, i, runnable);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: k */
    public void mo63239k() {
        m63242n();
        if (this.f41341A.get() == null) {
            return;
        }
        Moment momentM60709X3 = FeedModule.f38854c.m60709X3(this.f41341A.get());
        this.f41021i = momentM60709X3;
        if (momentM60709X3 == null) {
            return;
        }
        this.f41341A.clear();
        this.f41029q.call(this.f41021i);
        this.f41021i = null;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: m */
    public void mo63241m() {
        m63870H(this);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: o */
    public void mo63243o(int i) {
        this.f41030r = true;
        this.f41344w.setOnClickListener(new View.OnClickListener() { // from class: l.kkb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123540a.m63871I(view);
            }
        });
        this.f41345x.setOnClickListener(new View.OnClickListener() { // from class: l.lkb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128460a.m63873s(view);
            }
        });
        m63236h().duringCreated(oe40.m163823Y()).subscribe(new e30() { // from class: l.mkb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134304a.mo63238j((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m63873s(View view) {
        this.f41032t.call(view);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: y */
    public void mo63252y(Moment moment) {
        if (this.f41030r) {
            this.f41021i = moment;
            m63230A();
            m63251x((long) this.f41023k, 0, 350, null);
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: z */
    public void mo63253z(boolean z) {
        xdl0.m208344M(this.f41342u, z);
        xdl0.m208344M(this.f41346y, !z);
    }

    public QAMomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41341A = new uqd0("current_qa_topic_post_moment_id", null);
    }

    public QAMomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41341A = new uqd0("current_qa_topic_post_moment_id", null);
    }
}
