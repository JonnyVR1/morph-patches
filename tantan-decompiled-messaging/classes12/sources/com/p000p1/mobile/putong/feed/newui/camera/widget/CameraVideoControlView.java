package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import l.ftd0;
import l.ib1;
import l.osi0;
import l.qib0;
import l.t100;
import l.xdl0;
import l.z91;
import p007l.f3c0;
import p007l.kc4;
import p007l.p84;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraVideoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: m */
    public static final String f1029m = CameraPhotoControlView.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public RecordButton f1030a;

    /* JADX INFO: renamed from: b */
    public VFrame f1031b;

    /* JADX INFO: renamed from: c */
    public CameraMenuView f1032c;

    /* JADX INFO: renamed from: d */
    public FeedRedDotView f1033d;

    /* JADX INFO: renamed from: e */
    public CameraMenuView f1034e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f1035f;

    /* JADX INFO: renamed from: g */
    public ImageView f1036g;

    /* JADX INFO: renamed from: h */
    public ImageView f1037h;

    /* JADX INFO: renamed from: i */
    public int f1038i;

    /* JADX INFO: renamed from: j */
    public p84 f1039j;

    /* JADX INFO: renamed from: k */
    public boolean f1040k;

    /* JADX INFO: renamed from: l */
    public final z91 f1041l;

    public CameraVideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1041l = new C2009a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2400h(View view) {
        kc4.m11406a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public Act m2401i() {
        return getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m2402j() {
        m2403k();
        m2412t();
    }

    /* JADX INFO: renamed from: k */
    public final void m2403k() {
        int i = this.f1038i;
        if (i != 2) {
            if (i == 4) {
                this.f1038i = 5;
                return;
            } else if (i != 5) {
                return;
            }
        }
        this.f1038i = 4;
    }

    /* JADX INFO: renamed from: l */
    public final void m2404l() {
        m2414v();
        this.f1038i = 1;
    }

    /* JADX INFO: renamed from: m */
    public void m2405m() {
        this.f1038i = 2;
    }

    /* JADX INFO: renamed from: n */
    public void m2406n(Media media) {
        CameraMenuView cameraMenuView = this.f1034e;
        if (media == null) {
            cameraMenuView.getDraweeLayout().setBackgroundResource(f3c0.f7884q0);
            return;
        }
        cameraMenuView.getDraweeView().setBackgroundResource(f3c0.f7892r0);
        VDraweeView draweeView = this.f1034e.getDraweeView();
        draweeView.getHierarchy().H(new RoundingParams().v(false).s(xdl0.w(5.0f)));
        draweeView.getHierarchy().w(ftd0.h);
        int iD = t100.d(3.0f);
        draweeView.setPadding(iD, iD, iD, iD);
        qib0.G.m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2407o(View view) {
        if (NullChecker.a(this.f1039j)) {
            this.f1039j.mo12941i(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2400h(this);
        m2404l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m2408p(View view) {
        if (NullChecker.a(this.f1039j)) {
            this.f1039j.mo12943v(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2409q(View view) {
        if (NullChecker.a(this.f1039j)) {
            this.f1039j.mo12940f(view);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m2410r(View view) {
        if (this.f1038i == 1) {
            return;
        }
        if (NullChecker.a(this.f1039j) && this.f1039j.mo12942p()) {
            return;
        }
        m2416x();
        if (!PermissionHelper.b(new String[]{"android.permission.RECORD_AUDIO"})) {
            PermissionHelper.c().r(new String[]{"android.permission.RECORD_AUDIO"}).w(false).u(true).i(m2401i());
            return;
        }
        int i = this.f1038i;
        if (i == 2 || i == 5) {
            ib1.b().f(f1029m, AudioBusinessType.NORMAL, this.f1041l);
        } else {
            ib1.b().a(f1029m);
            m2402j();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m2411s(View view) {
        this.f1038i = 6;
        m2412t();
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        this.f1030a.setActivated(z);
    }

    public void setCallback(p84 p84Var) {
        this.f1039j = p84Var;
    }

    public void setState(int i) {
        this.f1038i = i;
        m2412t();
    }

    /* JADX INFO: renamed from: t */
    public final void m2412t() {
        if (NullChecker.a(this.f1039j)) {
            this.f1039j.onStateChanged(this.f1038i);
        }
        int i = this.f1038i;
        if (i == 2) {
            this.f1031b.setVisibility(0);
            this.f1034e.setVisibility(0);
            this.f1035f.setVisibility(8);
            this.f1030a.setState(1);
            return;
        }
        if (i == 4) {
            this.f1031b.setVisibility(8);
            this.f1034e.setVisibility(8);
            this.f1035f.setVisibility(8);
            this.f1030a.setState(2);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f1031b.setVisibility(0);
        this.f1034e.setVisibility(8);
        this.f1035f.setVisibility(0);
        this.f1030a.setState(1);
    }

    /* JADX INFO: renamed from: u */
    public void m2413u() {
        this.f1038i = 1;
    }

    /* JADX INFO: renamed from: v */
    public final void m2414v() {
        this.f1032c.setOnClickListener(new View.OnClickListener() { // from class: l.fc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8066a.m2407o(view);
            }
        });
        xdl0.E0(this.f1034e, new View.OnClickListener() { // from class: l.gc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8418a.m2408p(view);
            }
        });
        this.f1036g.setOnClickListener(new View.OnClickListener() { // from class: l.hc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8672a.m2409q(view);
            }
        });
        this.f1030a.setOnClickListener(new View.OnClickListener() { // from class: l.ic4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8984a.m2410r(view);
            }
        });
        this.f1037h.setOnClickListener(new View.OnClickListener() { // from class: l.jc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9310a.m2411s(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m2415w(boolean z) {
        xdl0.M(this.f1033d, z);
    }

    /* JADX INFO: renamed from: x */
    public final void m2416x() {
        if (this.f1040k) {
            return;
        }
        this.f1040k = true;
    }

    public CameraVideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraVideoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView$a */
    public class C2009a implements z91 {
        public C2009a() {
        }

        /* JADX INFO: renamed from: b */
        public void m2417b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (CameraVideoControlView.this.f1038i == 4) {
                CameraVideoControlView.this.m2402j();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2419d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.b().g(str, audioBusinessType, z91Var);
                CameraVideoControlView.this.m2402j();
            }
        }

        public void success() {
            CameraVideoControlView.this.m2402j();
        }

        /* JADX INFO: renamed from: c */
        public void m2418c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
        }
    }
}
