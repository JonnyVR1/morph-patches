package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.cn40;
import p153l.pf60;
import p153l.ssb0;
import p153l.wyd0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class QAMomentPostBar extends MomentPostBar {

    /* JADX INFO: renamed from: A */
    public wyd0 f42189A;

    /* JADX INFO: renamed from: u */
    public FrameLayout f42190u;

    /* JADX INFO: renamed from: v */
    public TextView f42191v;

    /* JADX INFO: renamed from: w */
    public ImageView f42192w;

    /* JADX INFO: renamed from: x */
    public ImageView f42193x;

    /* JADX INFO: renamed from: y */
    public FrameLayout f42194y;

    /* JADX INFO: renamed from: z */
    public ProgressBar f42195z;

    public QAMomentPostBar(@NonNull Context context) {
        super(context);
        this.f42189A = new wyd0("current_qa_topic_post_moment_id", null);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: D */
    public void mo64416D() {
        this.f41863c = this.f42191v;
        this.f41864d = this.f42192w;
        this.f41865e = this.f42193x;
        this.f41866f = this.f42195z;
    }

    /* JADX INFO: renamed from: H */
    public final void m65053H(View view) {
        ssb0.m187697a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m65054I(View view) {
        this.f41880t.call(view);
    }

    /* JADX INFO: renamed from: J */
    public void m65055J() {
        String str = this.f42189A.get();
        if (NullChecker.m82486a(str)) {
            this.f41869i = FeedModule.f39702c.m61893X3(str);
        }
        if (this.f41869i == null) {
            return;
        }
        this.f42189A.clear();
        this.f41869i = null;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: j */
    public void mo64421j(pf60<Integer, Moment> pf60Var) {
        long j;
        int i;
        int iIntValue = pf60Var.f152156a.intValue();
        if (iIntValue == 6) {
            return;
        }
        if (iIntValue != 4 && (!bnl0.m105529O0(this) || getHeight() == 0)) {
            m64413A();
        }
        Moment moment = pf60Var.f152157b;
        this.f41870j = this.f42195z.getProgress();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                this.f42189A.put(moment.f56859id);
                return;
            }
            Runnable runnable = null;
            if (iIntValue == 2) {
                j = (long) this.f41872l;
                i = 475;
            } else if (iIntValue == 3) {
                j = (long) this.f41873m;
                i = 495;
            } else if (iIntValue != 4) {
                j = 0;
                i = 0;
                if (iIntValue == 5) {
                    this.f41870j = 0;
                    mo64436z(true);
                }
            } else {
                cn40.m111349A0(new pf60(6, null));
                this.f41869i = null;
                runnable = new Runnable() { // from class: l.rsb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f164650a.m64425n();
                    }
                };
                this.f42189A.clear();
                j = 10;
                i = 500;
            }
            m64434x(j, this.f41870j, i, runnable);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: k */
    public void mo64422k() {
        m64425n();
        if (this.f42189A.get() == null) {
            return;
        }
        Moment momentM61893X3 = FeedModule.f39702c.m61893X3(this.f42189A.get());
        this.f41869i = momentM61893X3;
        if (momentM61893X3 == null) {
            return;
        }
        this.f42189A.clear();
        this.f41877q.call(this.f41869i);
        this.f41869i = null;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: m */
    public void mo64424m() {
        m65053H(this);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: o */
    public void mo64426o(int i) {
        this.f41878r = true;
        this.f42192w.setOnClickListener(new View.OnClickListener() { // from class: l.osb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148802a.m65054I(view);
            }
        });
        this.f42193x.setOnClickListener(new View.OnClickListener() { // from class: l.psb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153879a.m65056s(view);
            }
        });
        m64419h().duringCreated(cn40.m111373Y()).subscribe(new y20() { // from class: l.qsb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159277a.mo64421j((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m65056s(View view) {
        this.f41880t.call(view);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: y */
    public void mo64435y(Moment moment) {
        if (this.f41878r) {
            this.f41869i = moment;
            m64413A();
            m64434x((long) this.f41871k, 0, 350, null);
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.MomentPostBar
    /* JADX INFO: renamed from: z */
    public void mo64436z(boolean z) {
        bnl0.m105524M(this.f42190u, z);
        bnl0.m105524M(this.f42194y, !z);
    }

    public QAMomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42189A = new wyd0("current_qa_topic_post_moment_id", null);
    }

    public QAMomentPostBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42189A = new wyd0("current_qa_topic_post_moment_id", null);
    }
}
