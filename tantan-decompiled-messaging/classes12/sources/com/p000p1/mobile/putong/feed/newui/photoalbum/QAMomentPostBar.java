package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.uqd0;
import l.xdl0;
import p007l.oe40;
import p007l.okb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class QAMomentPostBar extends MomentPostBar {

    /* JADX INFO: renamed from: A */
    public uqd0 f2802A;

    /* JADX INFO: renamed from: u */
    public FrameLayout f2803u;

    /* JADX INFO: renamed from: v */
    public TextView f2804v;

    /* JADX INFO: renamed from: w */
    public ImageView f2805w;

    /* JADX INFO: renamed from: x */
    public ImageView f2806x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f2807y;

    /* JADX INFO: renamed from: z */
    public ProgressBar f2808z;

    public QAMomentPostBar(@NonNull Context context) {
        super(context);
        this.f2802A = new uqd0("current_qa_topic_post_moment_id", (String) null);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: D */
    public void mo4250D() {
        this.f2476c = this.f2804v;
        this.f2477d = this.f2805w;
        this.f2478e = this.f2806x;
        this.f2479f = this.f2808z;
    }

    /* JADX INFO: renamed from: H */
    public final void m4904H(View view) {
        okb0.m12653a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4905I(View view) {
        this.f2493t.call(view);
    }

    /* JADX INFO: renamed from: J */
    public void m4906J() {
        String str = (String) this.f2802A.get();
        if (NullChecker.a(str)) {
            this.f2482i = FeedModule.f315c.m1635X3(str);
        }
        if (this.f2482i == null) {
            return;
        }
        this.f2802A.clear();
        this.f2482i = null;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: j */
    public void mo4255j(j760<Integer, Moment> j760Var) {
        long j;
        int i;
        int iIntValue = ((Integer) j760Var.a).intValue();
        if (iIntValue == 6) {
            return;
        }
        if (iIntValue != 4 && (!xdl0.O0(this) || getHeight() == 0)) {
            m4247A();
        }
        Moment moment = (Moment) j760Var.b;
        this.f2483j = this.f2808z.getProgress();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                this.f2802A.put(((DbObject) moment).id);
                return;
            }
            Runnable runnable = null;
            if (iIntValue == 2) {
                j = (long) this.f2485l;
                i = 475;
            } else if (iIntValue == 3) {
                j = (long) this.f2486m;
                i = 495;
            } else if (iIntValue != 4) {
                j = 0;
                i = 0;
                if (iIntValue == 5) {
                    this.f2483j = 0;
                    mo4270z(true);
                }
            } else {
                oe40.m12536A0(new j760(6, (Object) null));
                this.f2482i = null;
                runnable = new Runnable() { // from class: l.nkb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10819a.m4259n();
                    }
                };
                this.f2802A.clear();
                j = 10;
                i = 500;
            }
            m4268x(j, this.f2483j, i, runnable);
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: k */
    public void mo4256k() {
        m4259n();
        if (this.f2802A.get() == null) {
            return;
        }
        Moment momentM1635X3 = FeedModule.f315c.m1635X3((String) this.f2802A.get());
        this.f2482i = momentM1635X3;
        if (momentM1635X3 == null) {
            return;
        }
        this.f2802A.clear();
        this.f2490q.call(this.f2482i);
        this.f2482i = null;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: m */
    public void mo4258m() {
        m4904H(this);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: o */
    public void mo4260o(int i) {
        this.f2491r = true;
        this.f2805w.setOnClickListener(new View.OnClickListener() { // from class: l.kkb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9741a.m4905I(view);
            }
        });
        this.f2806x.setOnClickListener(new View.OnClickListener() { // from class: l.lkb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10058a.m4907s(view);
            }
        });
        m4253h().duringCreated(oe40.m12560Y()).subscribe(new e30() { // from class: l.mkb0
            public final void call(Object obj) {
                this.f10483a.mo4255j((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m4907s(View view) {
        this.f2493t.call(view);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: y */
    public void mo4269y(Moment moment) {
        if (this.f2491r) {
            this.f2482i = moment;
            m4247A();
            m4268x((long) this.f2484k, 0, 350, null);
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: z */
    public void mo4270z(boolean z) {
        xdl0.M(this.f2803u, z);
        xdl0.M(this.f2807y, !z);
    }

    public QAMomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2802A = new uqd0("current_qa_topic_post_moment_id", (String) null);
    }

    public QAMomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2802A = new uqd0("current_qa_topic_post_moment_id", (String) null);
    }
}
