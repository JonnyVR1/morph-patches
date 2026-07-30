package com.p051p1.mobile.putong.feed.newui.camera;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p153l.gt0;
import p153l.i4g0;
import p153l.iam;
import p153l.k3h;
import p153l.l3h;
import p153l.lbc0;
import p153l.ov10;
import p153l.owi;
import p153l.pb1;
import p153l.psd0;
import p153l.qa00;
import p153l.qw10;
import p153l.r1j0;
import p153l.rv10;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicAggregateAct extends ReloadSoAct implements iam<qw10> {

    /* JADX INFO: renamed from: c */
    public RecyclerView f40171c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f40172d;

    /* JADX INFO: renamed from: e */
    public TextView f40173e;

    /* JADX INFO: renamed from: f */
    public ImageView f40174f;

    /* JADX INFO: renamed from: g */
    public ImageView f40175g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f40176h;

    /* JADX INFO: renamed from: i */
    public ImageView f40177i;

    /* JADX INFO: renamed from: j */
    public TextView f40178j;

    /* JADX INFO: renamed from: k */
    public TextView f40179k;

    /* JADX INFO: renamed from: l */
    public ImageView f40180l;

    /* JADX INFO: renamed from: m */
    public Music f40181m;

    /* JADX INFO: renamed from: n */
    public rv10 f40182n;

    /* JADX INFO: renamed from: o */
    public boolean f40183o;

    /* JADX INFO: renamed from: p */
    public boolean f40184p;

    /* JADX INFO: renamed from: q */
    public boolean f40185q;

    /* JADX INFO: renamed from: r */
    public int f40186r;

    /* JADX INFO: renamed from: s */
    public qw10 f40187s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicAggregateAct$a */
    public class C11311a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f40188a;

        public C11311a(GridLayoutManager gridLayoutManager) {
            this.f40188a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (MusicAggregateAct.this.f40171c.getAdapter().getItemViewType(i) == 2) {
                return 1;
            }
            return this.f40188a.m3318m();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicAggregateAct$b */
    public class C11312b extends RecyclerView.AbstractC0584t {
        public C11312b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            MusicAggregateAct.this.f40186r += i2;
            int iM175859d = qa00.m175859d(200.0f);
            int i3 = MusicAggregateAct.this.f40186r;
            MusicAggregateAct musicAggregateAct = MusicAggregateAct.this;
            if (i3 <= iM175859d) {
                float f = (musicAggregateAct.f40186r / iM175859d) * 255.0f;
                MusicAggregateAct.this.f40176h.setAlpha(f);
                MusicAggregateAct.this.f40176h.setBackgroundColor(Color.argb((int) f, 255, 255, 255));
            } else {
                musicAggregateAct.f40176h.setBackgroundColor(-1);
            }
            if (MusicAggregateAct.this.f40186r < qa00.m175859d(60.0f)) {
                MusicAggregateAct.this.m62245D2(true);
            } else if (Math.abs(i2) > 5) {
                MusicAggregateAct.this.m62245D2(i2 < 0);
            }
        }
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m62236l2(Context context, Music music) {
        Intent intent = new Intent(context, (Class<?>) MusicAggregateAct.class);
        intent.putExtra("extra_music", music);
        intent.putExtra("extra_need_back_music", false);
        return intent;
    }

    /* JADX INFO: renamed from: n2 */
    private void m62237n2() {
        new qw10(this).mo52715C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m62238s2() {
        this.f40187s.m178445t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m62239u2(View view) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        } else if (owi.m169565a()) {
            k3h.m148057P0(act(), new x20() { // from class: l.mv10
                @Override // p153l.x20
                public final void call() {
                    o1j0.m165649w(R$string.f39831U1);
                }
            }, false, new x20() { // from class: l.nv10
                @Override // p153l.x20
                public final void call() {
                    this.f143758a.m62238s2();
                }
            }, l3h.f129875a);
        } else {
            this.f40187s.m178445t0();
            i4g0.m138520r("e_moment_post", "p_camera_music_aggregation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m62240v2(View view) {
        m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m62241w2(View view) {
        m48999H2();
    }

    /* JADX INFO: renamed from: A2 */
    public void m62242A2(boolean z) {
        this.f40184p = z;
        this.f40187s.f159849b = z;
    }

    /* JADX INFO: renamed from: B2 */
    public void m62243B2(List<Moment> list) {
        this.f40182n.m183246P(list);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m62244C2() {
        this.f40177i.setImageDrawable(FeedModule.f39703d.m145587Pb().mo144675j(this));
    }

    /* JADX INFO: renamed from: D2 */
    public final void m62245D2(boolean z) {
        gt0.m132159e(this.f40172d);
        if (this.f40183o == z) {
            return;
        }
        this.f40183o = z;
        gt0.m132166l(this.f40172d, View.TRANSLATION_Y, 0L, 300L, gt0.f106347b, z ? qa00.m175859d(300.0f) : 0, z ? 0 : qa00.m175859d(300.0f)).start();
    }

    /* JADX INFO: renamed from: E2 */
    public void m62246E2() {
        if (NullChecker.m82487b(this.f40187s)) {
            this.f40187s.m178444N0();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public void m62247F2() {
        this.f40175g.setImageResource(this.f40181m.favor ? lbc0.f131181x6 : lbc0.f131173w6);
        this.f40180l.setImageResource(this.f40181m.favor ? lbc0.f131181x6 : lbc0.f131189y6);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: i2 */
    public View m62248i2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ov10.m169411b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62248i2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m62237n2();
        this.f40187s.mo40473a0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.gv10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106596a.m62253q2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Act
    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qw10 qw10Var) {
        this.f40187s = qw10Var;
    }

    /* JADX INFO: renamed from: o2 */
    public void m62251o2(Moment moment) {
        this.f40182n.m183240J(moment);
    }

    /* JADX INFO: renamed from: p2 */
    public rv10 m62252p2() {
        return this.f40182n;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_music_aggregation";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Music music = (Music) getIntent().getSerializableExtra("extra_music");
        this.f40181m = music;
        this.f40187s.f159848a = music;
        this.f40185q = getIntent().getBooleanExtra("extra_need_back_music", false);
        if (this.f40181m == null) {
            m48999H2();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m62253q2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m62242A2(false);
        } else if (c4470c == C4470c.f16268j) {
            this.f40182n.m183249S();
            this.f40187s.m178444N0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m62254r() {
        getSupportActionBar().mo102186m();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.m3327v(new C11311a(gridLayoutManager));
        if (!"zh".equals(getResources().getConfiguration().locale.getLanguage())) {
            this.f40173e.setText("");
            ViewGroup.LayoutParams layoutParams = this.f40172d.getLayoutParams();
            layoutParams.width = qa00.m175859d(80.0f);
            this.f40172d.setLayoutParams(layoutParams);
        }
        this.f40171c.setLayoutManager(gridLayoutManager);
        rv10 rv10Var = new rv10(this, this.f40187s);
        this.f40182n = rv10Var;
        rv10Var.m183247Q(this.f40181m);
        this.f40171c.setAdapter(this.f40182n);
        this.f40182n.m183248R(new y20() { // from class: l.hv10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111722a.m62255r2((MusicContent) obj);
            }
        });
        this.f40172d.setOnClickListener(new View.OnClickListener() { // from class: l.iv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117010a.m62239u2(view);
            }
        });
        m62247F2();
        ImageView imageView = this.f40175g;
        final qw10 qw10Var = this.f40187s;
        Objects.requireNonNull(qw10Var);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.jv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qw10Var.m178442J0(view);
            }
        });
        ImageView imageView2 = this.f40180l;
        final qw10 qw10Var2 = this.f40187s;
        Objects.requireNonNull(qw10Var2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.jv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qw10Var2.m178442J0(view);
            }
        });
        if (TextUtils.equals(this.f40181m.source, "default")) {
            this.f40178j.setText("@" + this.f40181m.name);
            this.f40179k.setText(this.act.getString(R$string.f39717B1));
        } else {
            this.f40179k.setText(this.f40181m.name);
            this.f40178j.setVisibility(8);
        }
        this.f40174f.setOnClickListener(new View.OnClickListener() { // from class: l.kv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128939a.m62240v2(view);
            }
        });
        this.f40177i.setOnClickListener(new View.OnClickListener() { // from class: l.lv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133675a.m62241w2(view);
            }
        });
        this.f40171c.addOnScrollListener(new C11312b());
        m62244C2();
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m62255r2(MusicContent musicContent) {
        this.f40187s.m178444N0();
        this.f40187s.m178443L0(musicContent);
    }

    /* JADX INFO: renamed from: y2 */
    public void m62256y2() {
        this.f40182n.m183244N();
    }

    /* JADX INFO: renamed from: z2 */
    public void m62257z2(Music music) {
        this.f40181m = music;
        this.f40182n.m183247Q(music);
    }
}
