package com.p000p1.mobile.putong.feed.newui.camera;

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
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import l.bt0;
import l.d30;
import l.e30;
import l.ib1;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.s7m;
import l.t100;
import l.zvf0;
import p007l.f3c0;
import p007l.gn10;
import p007l.io10;
import p007l.jn10;
import p007l.sti;
import p007l.v1h;
import p007l.w1h;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicAggregateAct extends ReloadSoAct implements s7m<io10> {

    /* JADX INFO: renamed from: c */
    public RecyclerView f784c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f785d;

    /* JADX INFO: renamed from: e */
    public TextView f786e;

    /* JADX INFO: renamed from: f */
    public ImageView f787f;

    /* JADX INFO: renamed from: g */
    public ImageView f788g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f789h;

    /* JADX INFO: renamed from: i */
    public ImageView f790i;

    /* JADX INFO: renamed from: j */
    public TextView f791j;

    /* JADX INFO: renamed from: k */
    public TextView f792k;

    /* JADX INFO: renamed from: l */
    public ImageView f793l;

    /* JADX INFO: renamed from: m */
    public Music f794m;

    /* JADX INFO: renamed from: n */
    public jn10 f795n;

    /* JADX INFO: renamed from: o */
    public boolean f796o;

    /* JADX INFO: renamed from: p */
    public boolean f797p;

    /* JADX INFO: renamed from: q */
    public boolean f798q;

    /* JADX INFO: renamed from: r */
    public int f799r;

    /* JADX INFO: renamed from: s */
    public io10 f800s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicAggregateAct$a */
    public class C1992a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f801a;

        public C1992a(GridLayoutManager gridLayoutManager) {
            this.f801a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m2006f(int i) {
            if (MusicAggregateAct.this.f784c.getAdapter().getItemViewType(i) == 2) {
                return 1;
            }
            return this.f801a.m();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicAggregateAct$b */
    public class C1993b extends RecyclerView.t {
        public C1993b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            MusicAggregateAct.this.f799r += i2;
            int iD = t100.d(200.0f);
            int i3 = MusicAggregateAct.this.f799r;
            MusicAggregateAct musicAggregateAct = MusicAggregateAct.this;
            if (i3 <= iD) {
                float f = (musicAggregateAct.f799r / iD) * 255.0f;
                MusicAggregateAct.this.f789h.setAlpha(f);
                MusicAggregateAct.this.f789h.setBackgroundColor(Color.argb((int) f, 255, 255, 255));
            } else {
                musicAggregateAct.f789h.setBackgroundColor(-1);
            }
            if (MusicAggregateAct.this.f799r < t100.d(60.0f)) {
                MusicAggregateAct.this.m1991C2(true);
            } else if (Math.abs(i2) > 5) {
                MusicAggregateAct.this.m1991C2(i2 < 0);
            }
        }
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m1982k2(Context context, Music music) {
        Intent intent = new Intent(context, (Class<?>) MusicAggregateAct.class);
        intent.putExtra("extra_music", music);
        intent.putExtra("extra_need_back_music", false);
        return intent;
    }

    /* JADX INFO: renamed from: m2 */
    private void m1983m2() {
        new io10(this).C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m1984r2() {
        this.f800s.m11018t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m1985s2(View view) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC)) {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        } else if (sti.m14315a()) {
            v1h.m15219P0(act(), new d30() { // from class: l.en10
                public final void call() {
                    lsi0.w(R$string.f444U1);
                }
            }, false, new d30() { // from class: l.fn10
                public final void call() {
                    this.f8167a.m1984r2();
                }
            }, w1h.f14361a);
        } else {
            this.f800s.m11018t0();
            zvf0.r("e_moment_post", "p_camera_music_aggregation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m1986u2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m1987v2(View view) {
        finish();
    }

    /* JADX INFO: renamed from: A2 */
    public void m1988A2(List<Moment> list) {
        this.f795n.m11249P(list);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m1989B2() {
        this.f790i.setImageDrawable(FeedModule.f316d.m16527Pb().mo15083j(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m1990C0() {
        return this;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m1991C2(boolean z) {
        bt0.e(this.f785d);
        if (this.f796o == z) {
            return;
        }
        this.f796o = z;
        bt0.l(this.f785d, View.TRANSLATION_Y, 0L, 300L, bt0.b, new float[]{z ? t100.d(300.0f) : 0, z ? 0 : t100.d(300.0f)}).start();
    }

    /* JADX INFO: renamed from: D2 */
    public void m1992D2() {
        if (NullChecker.b(this.f800s)) {
            this.f800s.m11016N0();
        }
    }

    /* JADX INFO: renamed from: E2 */
    public void m1993E2() {
        this.f788g.setImageResource(this.f794m.favor ? f3c0.f7946x6 : f3c0.f7938w6);
        this.f793l.setImageResource(this.f794m.favor ? f3c0.f7946x6 : f3c0.f7954y6);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: h2 */
    public View m1994h2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gn10.m10492b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m1994h2(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        m1983m2();
        this.f800s.m11017a0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ym10
            public final void call(Object obj) {
                this.f15473a.m2000p2((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2, reason: merged with bridge method [inline-methods] */
    public void m1995i1(io10 io10Var) {
        this.f800s = io10Var;
    }

    /* JADX INFO: renamed from: n2 */
    public void m1998n2(Moment moment) {
        this.f795n.m11243J(moment);
    }

    /* JADX INFO: renamed from: o2 */
    public jn10 m1999o2() {
        return this.f795n;
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m2000p2(c cVar) {
        if (cVar == c.i) {
            m2005z2(false);
        } else if (cVar == c.j) {
            this.f795n.m11252S();
            this.f800s.m11016N0();
        }
    }

    public String pageId() {
        return "p_camera_music_aggregation";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Music music = (Music) getIntent().getSerializableExtra("extra_music");
        this.f794m = music;
        this.f800s.f9107a = music;
        this.f798q = getIntent().getBooleanExtra("extra_need_back_music", false);
        if (this.f794m == null) {
            finish();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m2001q2(MusicContent musicContent) {
        this.f800s.m11016N0();
        this.f800s.m11015L0(musicContent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void m2002r() {
        getSupportActionBar().m();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.v(new C1992a(gridLayoutManager));
        if (!"zh".equals(getResources().getConfiguration().locale.getLanguage())) {
            this.f786e.setText("");
            ViewGroup.LayoutParams layoutParams = this.f785d.getLayoutParams();
            layoutParams.width = t100.d(80.0f);
            this.f785d.setLayoutParams(layoutParams);
        }
        this.f784c.setLayoutManager(gridLayoutManager);
        jn10 jn10Var = new jn10(this, this.f800s);
        this.f795n = jn10Var;
        jn10Var.m11250Q(this.f794m);
        this.f784c.setAdapter(this.f795n);
        this.f795n.m11251R(new e30() { // from class: l.zm10
            public final void call(Object obj) {
                this.f15802a.m2001q2((MusicContent) obj);
            }
        });
        this.f785d.setOnClickListener(new View.OnClickListener() { // from class: l.an10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5785a.m1985s2(view);
            }
        });
        m1993E2();
        ImageView imageView = this.f788g;
        final io10 io10Var = this.f800s;
        Objects.requireNonNull(io10Var);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.bn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io10Var.m11014J0(view);
            }
        });
        ImageView imageView2 = this.f793l;
        final io10 io10Var2 = this.f800s;
        Objects.requireNonNull(io10Var2);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.bn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io10Var2.m11014J0(view);
            }
        });
        if (TextUtils.equals(this.f794m.source, "default")) {
            this.f791j.setText("@" + this.f794m.name);
            this.f792k.setText(((Act) this).act.getString(R$string.f330B1));
        } else {
            this.f792k.setText(this.f794m.name);
            this.f791j.setVisibility(8);
        }
        this.f787f.setOnClickListener(new View.OnClickListener() { // from class: l.cn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6695a.m1986u2(view);
            }
        });
        this.f790i.setOnClickListener(new View.OnClickListener() { // from class: l.dn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7006a.m1987v2(view);
            }
        });
        this.f784c.addOnScrollListener(new C1993b());
        m1989B2();
    }

    /* JADX INFO: renamed from: w2 */
    public void m2003w2() {
        this.f795n.m11247N();
    }

    /* JADX INFO: renamed from: y2 */
    public void m2004y2(Music music) {
        this.f794m = music;
        this.f795n.m11250Q(music);
    }

    /* JADX INFO: renamed from: z2 */
    public void m2005z2(boolean z) {
        this.f797p = z;
        this.f800s.f9108b = z;
    }
}
