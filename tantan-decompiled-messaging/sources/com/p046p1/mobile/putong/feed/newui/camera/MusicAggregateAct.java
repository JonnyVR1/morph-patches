package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.f3c0;
import p149l.gn10;
import p149l.ib1;
import p149l.io10;
import p149l.jn10;
import p149l.mkd0;
import p149l.osi0;
import p149l.s7m;
import p149l.sti;
import p149l.t100;
import p149l.v1h;
import p149l.w1h;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class MusicAggregateAct extends ReloadSoAct implements s7m<io10> {

    /* JADX INFO: renamed from: c */
    public RecyclerView f39323c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f39324d;

    /* JADX INFO: renamed from: e */
    public TextView f39325e;

    /* JADX INFO: renamed from: f */
    public ImageView f39326f;

    /* JADX INFO: renamed from: g */
    public ImageView f39327g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f39328h;

    /* JADX INFO: renamed from: i */
    public ImageView f39329i;

    /* JADX INFO: renamed from: j */
    public TextView f39330j;

    /* JADX INFO: renamed from: k */
    public TextView f39331k;

    /* JADX INFO: renamed from: l */
    public ImageView f39332l;

    /* JADX INFO: renamed from: m */
    public Music f39333m;

    /* JADX INFO: renamed from: n */
    public jn10 f39334n;

    /* JADX INFO: renamed from: o */
    public boolean f39335o;

    /* JADX INFO: renamed from: p */
    public boolean f39336p;

    /* JADX INFO: renamed from: q */
    public boolean f39337q;

    /* JADX INFO: renamed from: r */
    public int f39338r;

    /* JADX INFO: renamed from: s */
    public io10 f39339s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicAggregateAct$a */
    public class C11148a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f39340a;

        public C11148a(GridLayoutManager gridLayoutManager) {
            this.f39340a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (MusicAggregateAct.this.f39323c.getAdapter().getItemViewType(i) == 2) {
                return 1;
            }
            return this.f39340a.m3317m();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicAggregateAct$b */
    public class C11149b extends RecyclerView.AbstractC0582t {
        public C11149b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            MusicAggregateAct.this.f39338r += i2;
            int iM186890d = t100.m186890d(200.0f);
            int i3 = MusicAggregateAct.this.f39338r;
            MusicAggregateAct musicAggregateAct = MusicAggregateAct.this;
            if (i3 <= iM186890d) {
                float f = (musicAggregateAct.f39338r / iM186890d) * 255.0f;
                MusicAggregateAct.this.f39328h.setAlpha(f);
                MusicAggregateAct.this.f39328h.setBackgroundColor(Color.argb((int) f, 255, 255, 255));
            } else {
                musicAggregateAct.f39328h.setBackgroundColor(-1);
            }
            if (MusicAggregateAct.this.f39338r < t100.m186890d(60.0f)) {
                MusicAggregateAct.this.m61060C2(true);
            } else if (Math.abs(i2) > 5) {
                MusicAggregateAct.this.m61060C2(i2 < 0);
            }
        }
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m61052k2(Context context, Music music) {
        Intent intent = new Intent(context, (Class<?>) MusicAggregateAct.class);
        intent.putExtra("extra_music", music);
        intent.putExtra("extra_need_back_music", false);
        return intent;
    }

    /* JADX INFO: renamed from: m2 */
    private void m61053m2() {
        new io10(this).mo51532C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m61054r2() {
        this.f39339s.m137280t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m61055s2(View view) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        } else if (sti.m185955a()) {
            v1h.m196580P0(act(), new d30() { // from class: l.en10
                @Override // p149l.d30
                public final void call() {
                    lsi0.m151593w(R$string.f38983U1);
                }
            }, false, new d30() { // from class: l.fn10
                @Override // p149l.d30
                public final void call() {
                    this.f98396a.m61054r2();
                }
            }, w1h.f184003a);
        } else {
            this.f39339s.m137280t0();
            zvf0.m220396r("e_moment_post", "p_camera_music_aggregation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m61056u2(View view) {
        m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m61057v2(View view) {
        m47815F2();
    }

    /* JADX INFO: renamed from: A2 */
    public void m61058A2(List<Moment> list) {
        this.f39334n.m142257P(list);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m61059B2() {
        this.f39329i.setImageDrawable(FeedModule.f38855d.m209346Pb().mo193138j(this));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m61060C2(boolean z) {
        bt0.m103732e(this.f39324d);
        if (this.f39335o == z) {
            return;
        }
        this.f39335o = z;
        bt0.m103739l(this.f39324d, View.TRANSLATION_Y, 0L, 300L, bt0.f77155b, z ? t100.m186890d(300.0f) : 0, z ? 0 : t100.m186890d(300.0f)).start();
    }

    /* JADX INFO: renamed from: D2 */
    public void m61061D2() {
        if (NullChecker.m81304b(this.f39339s)) {
            this.f39339s.m137279N0();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m61062E2() {
        this.f39327g.setImageResource(this.f39333m.favor ? f3c0.f94663x6 : f3c0.f94655w6);
        this.f39332l.setImageResource(this.f39333m.favor ? f3c0.f94663x6 : f3c0.f94671y6);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: h2 */
    public View m61063h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gn10.m127099b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m61063h2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m61053m2();
        this.f39339s.mo39470a0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ym10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198955a.m61068p2((C4319c) obj);
            }
        }));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(io10 io10Var) {
        this.f39339s = io10Var;
    }

    /* JADX INFO: renamed from: n2 */
    public void m61066n2(Moment moment) {
        this.f39334n.m142251J(moment);
    }

    /* JADX INFO: renamed from: o2 */
    public jn10 m61067o2() {
        return this.f39334n;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m61068p2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m61073z2(false);
        } else if (c4319c == C4319c.f15549j) {
            this.f39334n.m142260S();
            this.f39339s.m137279N0();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_music_aggregation";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Music music = (Music) getIntent().getSerializableExtra("extra_music");
        this.f39333m = music;
        this.f39339s.f114090a = music;
        this.f39337q = getIntent().getBooleanExtra("extra_need_back_music", false);
        if (this.f39333m == null) {
            m47815F2();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m61069q2(MusicContent musicContent) {
        this.f39339s.m137279N0();
        this.f39339s.m137278L0(musicContent);
    }

    /* JADX INFO: renamed from: r */
    public void m61070r() {
        getSupportActionBar().mo134126m();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.m3326v(new C11148a(gridLayoutManager));
        if (!"zh".equals(getResources().getConfiguration().locale.getLanguage())) {
            this.f39325e.setText("");
            ViewGroup.LayoutParams layoutParams = this.f39324d.getLayoutParams();
            layoutParams.width = t100.m186890d(80.0f);
            this.f39324d.setLayoutParams(layoutParams);
        }
        this.f39323c.setLayoutManager(gridLayoutManager);
        jn10 jn10Var = new jn10(this, this.f39339s);
        this.f39334n = jn10Var;
        jn10Var.m142258Q(this.f39333m);
        this.f39323c.setAdapter(this.f39334n);
        this.f39334n.m142259R(new e30() { // from class: l.zm10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203688a.m61069q2((MusicContent) obj);
            }
        });
        this.f39324d.setOnClickListener(new View.OnClickListener() { // from class: l.an10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70697a.m61055s2(view);
            }
        });
        m61062E2();
        ImageView imageView = this.f39327g;
        final io10 io10Var = this.f39339s;
        Objects.requireNonNull(io10Var);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.bn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io10Var.m137277J0(view);
            }
        });
        ImageView imageView2 = this.f39332l;
        final io10 io10Var2 = this.f39339s;
        Objects.requireNonNull(io10Var2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.bn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io10Var2.m137277J0(view);
            }
        });
        if (TextUtils.equals(this.f39333m.source, "default")) {
            this.f39330j.setText("@" + this.f39333m.name);
            this.f39331k.setText(this.act.getString(R$string.f38869B1));
        } else {
            this.f39331k.setText(this.f39333m.name);
            this.f39330j.setVisibility(8);
        }
        this.f39326f.setOnClickListener(new View.OnClickListener() { // from class: l.cn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81637a.m61056u2(view);
            }
        });
        this.f39329i.setOnClickListener(new View.OnClickListener() { // from class: l.dn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87020a.m61057v2(view);
            }
        });
        this.f39323c.addOnScrollListener(new C11149b());
        m61059B2();
    }

    /* JADX INFO: renamed from: w2 */
    public void m61071w2() {
        this.f39334n.m142255N();
    }

    /* JADX INFO: renamed from: y2 */
    public void m61072y2(Music music) {
        this.f39333m = music;
        this.f39334n.m142258Q(music);
    }

    /* JADX INFO: renamed from: z2 */
    public void m61073z2(boolean z) {
        this.f39336p = z;
        this.f39339s.f114091b = z;
    }
}
