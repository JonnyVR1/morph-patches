package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.f3c0;
import p149l.ftd0;
import p149l.ib1;
import p149l.kc4;
import p149l.osi0;
import p149l.p84;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;
import p149l.z91;

/* JADX INFO: loaded from: classes12.dex */
public class CameraVideoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: m */
    public static final String f39568m = CameraPhotoControlView.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public RecordButton f39569a;

    /* JADX INFO: renamed from: b */
    public VFrame f39570b;

    /* JADX INFO: renamed from: c */
    public CameraMenuView f39571c;

    /* JADX INFO: renamed from: d */
    public FeedRedDotView f39572d;

    /* JADX INFO: renamed from: e */
    public CameraMenuView f39573e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f39574f;

    /* JADX INFO: renamed from: g */
    public ImageView f39575g;

    /* JADX INFO: renamed from: h */
    public ImageView f39576h;

    /* JADX INFO: renamed from: i */
    public int f39577i;

    /* JADX INFO: renamed from: j */
    public p84 f39578j;

    /* JADX INFO: renamed from: k */
    public boolean f39579k;

    /* JADX INFO: renamed from: l */
    public final z91 f39580l;

    public CameraVideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39580l = new C11165a();
    }

    /* JADX INFO: renamed from: h */
    public final void m61450h(View view) {
        kc4.m145346a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public Act m61451i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m61452j() {
        m61453k();
        m61462t();
    }

    /* JADX INFO: renamed from: k */
    public final void m61453k() {
        int i = this.f39577i;
        if (i != 2) {
            if (i == 4) {
                this.f39577i = 5;
                return;
            } else if (i != 5) {
                return;
            }
        }
        this.f39577i = 4;
    }

    /* JADX INFO: renamed from: l */
    public final void m61454l() {
        m61464v();
        this.f39577i = 1;
    }

    /* JADX INFO: renamed from: m */
    public void m61455m() {
        this.f39577i = 2;
    }

    /* JADX INFO: renamed from: n */
    public void m61456n(Media media) {
        CameraMenuView cameraMenuView = this.f39573e;
        if (media == null) {
            cameraMenuView.getDraweeLayout().setBackgroundResource(f3c0.f94601q0);
            return;
        }
        cameraMenuView.getDraweeView().setBackgroundResource(f3c0.f94609r0);
        VDraweeView draweeView = this.f39573e.getDraweeView();
        draweeView.getHierarchy().m112053H(new RoundingParams().m8268v(false).m8265s(xdl0.m208407w(5.0f)));
        draweeView.getHierarchy().m112076w(ftd0.f99184h);
        int iM186890d = t100.m186890d(3.0f);
        draweeView.setPadding(iM186890d, iM186890d, iM186890d, iM186890d);
        qib0.f154691G.m102367m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m61457o(View view) {
        if (NullChecker.m81303a(this.f39578j)) {
            this.f39578j.mo167787i(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61450h(this);
        m61454l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m61458p(View view) {
        if (NullChecker.m81303a(this.f39578j)) {
            this.f39578j.mo167789v(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m61459q(View view) {
        if (NullChecker.m81303a(this.f39578j)) {
            this.f39578j.mo167786f(view);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m61460r(View view) {
        if (this.f39577i == 1) {
            return;
        }
        if (NullChecker.m81303a(this.f39578j) && this.f39578j.mo167788p()) {
            return;
        }
        m61466x();
        if (!PermissionHelper.m79881b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m79882c().m79900r("android.permission.RECORD_AUDIO").m79905w(false).m79903u(true).m79891i(m61451i());
            return;
        }
        int i = this.f39577i;
        if (i == 2 || i == 5) {
            ib1.m135233b().mo135238f(f39568m, AudioBusinessType.NORMAL, this.f39580l);
        } else {
            ib1.m135233b().mo135234a(f39568m);
            m61452j();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m61461s(View view) {
        this.f39577i = 6;
        m61462t();
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        this.f39569a.setActivated(z);
    }

    public void setCallback(p84 p84Var) {
        this.f39578j = p84Var;
    }

    public void setState(int i) {
        this.f39577i = i;
        m61462t();
    }

    /* JADX INFO: renamed from: t */
    public final void m61462t() {
        if (NullChecker.m81303a(this.f39578j)) {
            this.f39578j.onStateChanged(this.f39577i);
        }
        int i = this.f39577i;
        if (i == 2) {
            this.f39570b.setVisibility(0);
            this.f39573e.setVisibility(0);
            this.f39574f.setVisibility(8);
            this.f39569a.setState(1);
            return;
        }
        if (i == 4) {
            this.f39570b.setVisibility(8);
            this.f39573e.setVisibility(8);
            this.f39574f.setVisibility(8);
            this.f39569a.setState(2);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f39570b.setVisibility(0);
        this.f39573e.setVisibility(8);
        this.f39574f.setVisibility(0);
        this.f39569a.setState(1);
    }

    /* JADX INFO: renamed from: u */
    public void m61463u() {
        this.f39577i = 1;
    }

    /* JADX INFO: renamed from: v */
    public final void m61464v() {
        this.f39571c.setOnClickListener(new View.OnClickListener() { // from class: l.fc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96766a.m61457o(view);
            }
        });
        xdl0.m208329E0(this.f39573e, new View.OnClickListener() { // from class: l.gc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101986a.m61458p(view);
            }
        });
        this.f39575g.setOnClickListener(new View.OnClickListener() { // from class: l.hc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107008a.m61459q(view);
            }
        });
        this.f39569a.setOnClickListener(new View.OnClickListener() { // from class: l.ic4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112427a.m61460r(view);
            }
        });
        this.f39576h.setOnClickListener(new View.OnClickListener() { // from class: l.jc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117260a.m61461s(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m61465w(boolean z) {
        xdl0.m208344M(this.f39572d, z);
    }

    /* JADX INFO: renamed from: x */
    public final void m61466x() {
        if (this.f39579k) {
            return;
        }
        this.f39579k = true;
    }

    public CameraVideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraVideoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView$a */
    public class C11165a implements z91 {
        public C11165a() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (CameraVideoControlView.this.f39577i == 4) {
                CameraVideoControlView.this.m61452j();
            }
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                CameraVideoControlView.this.m61452j();
            }
        }

        @Override // p149l.z91
        public void success() {
            CameraVideoControlView.this.m61452j();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: c */
        public void mo61467c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
        }
    }
}
