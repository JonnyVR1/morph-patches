package com.p000p1.mobile.putong.feed.newui.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MusicCategory;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.io.Serializable;
import java.util.List;
import l.e30;
import l.mkd0;
import l.s7m;
import l.xdl0;
import p007l.e1c0;
import p007l.pq10;
import p007l.zq10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicListAct extends ReloadSoAct implements s7m<zq10> {

    /* JADX INFO: renamed from: c */
    public ImageView f845c;

    /* JADX INFO: renamed from: d */
    public TextView f846d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f847e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f848f;

    /* JADX INFO: renamed from: g */
    public TextView f849g;

    /* JADX INFO: renamed from: h */
    public MusicCategory f850h;

    /* JADX INFO: renamed from: i */
    public C2004b f851i;

    /* JADX INFO: renamed from: j */
    public zq10 f852j;

    /* JADX INFO: renamed from: b2 */
    public static Intent m2123b2(Context context, MusicCategory musicCategory) {
        Intent intent = new Intent(context, (Class<?>) MusicListAct.class);
        intent.putExtra("extra_category", musicCategory);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    private void m2124d2() {
        new zq10(this).C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m2125g2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m2126h2(MusicContent musicContent) {
        this.f852j.m17531u0();
        this.f852j.m17530t0(musicContent);
    }

    /* JADX INFO: renamed from: n2 */
    private void m2127n2() {
        this.f845c.setImageDrawable(FeedModule.f316d.m16527Pb().mo15075b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2128C0() {
        return this;
    }

    /* JADX INFO: renamed from: a2 */
    public View m2129a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pq10.m13198b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void m2132i1(zq10 zq10Var) {
        this.f852j = zq10Var;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m2131e2(c cVar) {
        if (cVar == c.i) {
            this.f851i.m2276S((List) FeedModule.f314b.m1448h2(this.f850h.category).e());
        } else if (cVar == c.j) {
            this.f851i.m2270M();
            this.f852j.m17531u0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m2133i2(MusicContent musicContent) {
        Intent intent = new Intent();
        intent.putExtra("result_selected", (Serializable) musicContent);
        setResult(-1, intent);
        finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2129a2(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.lq10
            public final void call(Object obj) {
                this.f10101a.m2131e2((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public void m2134k2(List<Music> list) {
        this.f851i.m2276S(list);
    }

    /* JADX INFO: renamed from: l2 */
    public void m2135l2(boolean z) {
        xdl0.M(this.f848f, z);
    }

    /* JADX INFO: renamed from: m2 */
    public void m2136m2() {
        this.f851i.m2277T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f7128a));
        MusicCategory musicCategory = (MusicCategory) getIntent().getSerializableExtra("extra_category");
        this.f850h = musicCategory;
        if (musicCategory == null) {
            finish();
        }
        m2124d2();
        this.f852j.m17526m0(this.f850h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m2137r() {
        getSupportActionBar().m();
        this.f846d.setText(this.f850h.name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.f847e.setLayoutManager(linearLayoutManager);
        C2004b c2004b = new C2004b(this, this.f852j);
        this.f851i = c2004b;
        this.f847e.setAdapter(c2004b);
        this.f845c.setOnClickListener(new View.OnClickListener() { // from class: l.mq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10541a.m2125g2(view);
            }
        });
        this.f851i.m2274Q(new e30() { // from class: l.nq10
            public final void call(Object obj) {
                this.f10851a.m2126h2((MusicContent) obj);
            }
        });
        this.f851i.m2275R(new e30() { // from class: l.oq10
            public final void call(Object obj) {
                this.f11554a.m2133i2((MusicContent) obj);
            }
        });
        m2127n2();
    }
}
