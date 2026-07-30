package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.ga1;
import p153l.h1e0;
import p153l.jd4;
import p153l.lbc0;
import p153l.o94;
import p153l.pb1;
import p153l.qa00;
import p153l.r1j0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class CameraVideoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: m */
    public static final String f40416m = CameraPhotoControlView.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public RecordButton f40417a;

    /* JADX INFO: renamed from: b */
    public VFrame f40418b;

    /* JADX INFO: renamed from: c */
    public CameraMenuView f40419c;

    /* JADX INFO: renamed from: d */
    public FeedRedDotView f40420d;

    /* JADX INFO: renamed from: e */
    public CameraMenuView f40421e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f40422f;

    /* JADX INFO: renamed from: g */
    public ImageView f40423g;

    /* JADX INFO: renamed from: h */
    public ImageView f40424h;

    /* JADX INFO: renamed from: i */
    public int f40425i;

    /* JADX INFO: renamed from: j */
    public o94 f40426j;

    /* JADX INFO: renamed from: k */
    public boolean f40427k;

    /* JADX INFO: renamed from: l */
    public final ga1 f40428l;

    public CameraVideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40428l = new C11328a();
    }

    /* JADX INFO: renamed from: h */
    public final void m62634h(View view) {
        jd4.m144403a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public Act m62635i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m62636j() {
        m62637k();
        m62646t();
    }

    /* JADX INFO: renamed from: k */
    public final void m62637k() {
        int i = this.f40425i;
        if (i != 2) {
            if (i == 4) {
                this.f40425i = 5;
                return;
            } else if (i != 5) {
                return;
            }
        }
        this.f40425i = 4;
    }

    /* JADX INFO: renamed from: l */
    public final void m62638l() {
        m62648v();
        this.f40425i = 1;
    }

    /* JADX INFO: renamed from: m */
    public void m62639m() {
        this.f40425i = 2;
    }

    /* JADX INFO: renamed from: n */
    public void m62640n(Media media) {
        CameraMenuView cameraMenuView = this.f40421e;
        if (media == null) {
            cameraMenuView.getDraweeLayout().setBackgroundResource(lbc0.f131119q0);
            return;
        }
        cameraMenuView.getDraweeView().setBackgroundResource(lbc0.f131127r0);
        VDraweeView draweeView = this.f40421e.getDraweeView();
        draweeView.getHierarchy().m207045H(new RoundingParams().m8322v(false).m8319s(bnl0.m105587w(5.0f)));
        draweeView.getHierarchy().m207062w(h1e0.f107451h);
        int iM175859d = qa00.m175859d(3.0f);
        draweeView.setPadding(iM175859d, iM175859d, iM175859d, iM175859d);
        uqb0.f180374G.m127150m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m62641o(View view) {
        if (NullChecker.m82486a(this.f40426j)) {
            this.f40426j.mo166673i(view);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62634h(this);
        m62638l();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m62642p(View view) {
        if (NullChecker.m82486a(this.f40426j)) {
            this.f40426j.mo166675v(view);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m62643q(View view) {
        if (NullChecker.m82486a(this.f40426j)) {
            this.f40426j.mo166672f(view);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m62644r(View view) {
        if (this.f40425i == 1) {
            return;
        }
        if (NullChecker.m82486a(this.f40426j) && this.f40426j.mo166674p()) {
            return;
        }
        m62650x();
        if (!PermissionHelper.m81064b("android.permission.RECORD_AUDIO")) {
            PermissionHelper.m81065c().m81083r("android.permission.RECORD_AUDIO").m81088w(false).m81086u(true).m81074i(m62635i());
            return;
        }
        int i = this.f40425i;
        if (i == 2 || i == 5) {
            pb1.m171472b().mo171477f(f40416m, AudioBusinessType.NORMAL, this.f40428l);
        } else {
            pb1.m171472b().mo171473a(f40416m);
            m62636j();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m62645s(View view) {
        this.f40425i = 6;
        m62646t();
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        this.f40417a.setActivated(z);
    }

    public void setCallback(o94 o94Var) {
        this.f40426j = o94Var;
    }

    public void setState(int i) {
        this.f40425i = i;
        m62646t();
    }

    /* JADX INFO: renamed from: t */
    public final void m62646t() {
        if (NullChecker.m82486a(this.f40426j)) {
            this.f40426j.onStateChanged(this.f40425i);
        }
        int i = this.f40425i;
        if (i == 2) {
            this.f40418b.setVisibility(0);
            this.f40421e.setVisibility(0);
            this.f40422f.setVisibility(8);
            this.f40417a.setState(1);
            return;
        }
        if (i == 4) {
            this.f40418b.setVisibility(8);
            this.f40421e.setVisibility(8);
            this.f40422f.setVisibility(8);
            this.f40417a.setState(2);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f40418b.setVisibility(0);
        this.f40421e.setVisibility(8);
        this.f40422f.setVisibility(0);
        this.f40417a.setState(1);
    }

    /* JADX INFO: renamed from: u */
    public void m62647u() {
        this.f40425i = 1;
    }

    /* JADX INFO: renamed from: v */
    public final void m62648v() {
        this.f40419c.setOnClickListener(new View.OnClickListener() { // from class: l.ed4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93139a.m62641o(view);
            }
        });
        bnl0.m105509E0(this.f40421e, new View.OnClickListener() { // from class: l.fd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98318a.m62642p(view);
            }
        });
        this.f40423g.setOnClickListener(new View.OnClickListener() { // from class: l.gd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103624a.m62643q(view);
            }
        });
        this.f40417a.setOnClickListener(new View.OnClickListener() { // from class: l.hd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108783a.m62644r(view);
            }
        });
        this.f40424h.setOnClickListener(new View.OnClickListener() { // from class: l.id4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114470a.m62645s(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m62649w(boolean z) {
        bnl0.m105524M(this.f40420d, z);
    }

    /* JADX INFO: renamed from: x */
    public final void m62650x() {
        if (this.f40427k) {
            return;
        }
        this.f40427k = true;
    }

    public CameraVideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraVideoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.CameraVideoControlView$a */
    public class C11328a implements ga1 {
        public C11328a() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (CameraVideoControlView.this.f40425i == 4) {
                CameraVideoControlView.this.m62636j();
            }
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                CameraVideoControlView.this.m62636j();
            }
        }

        @Override // p153l.ga1
        public void success() {
            CameraVideoControlView.this.m62636j();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: c */
        public void mo62651c(String str, AudioBusinessType audioBusinessType, String str2, ga1 ga1Var) {
        }
    }
}
