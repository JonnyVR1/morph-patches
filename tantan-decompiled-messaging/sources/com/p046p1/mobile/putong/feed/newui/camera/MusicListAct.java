package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MusicCategory;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.io.Serializable;
import java.util.List;
import p149l.e1c0;
import p149l.e30;
import p149l.mkd0;
import p149l.pq10;
import p149l.s7m;
import p149l.xdl0;
import p149l.zq10;

/* JADX INFO: loaded from: classes12.dex */
public class MusicListAct extends ReloadSoAct implements s7m<zq10> {

    /* JADX INFO: renamed from: c */
    public ImageView f39384c;

    /* JADX INFO: renamed from: d */
    public TextView f39385d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f39386e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f39387f;

    /* JADX INFO: renamed from: g */
    public TextView f39388g;

    /* JADX INFO: renamed from: h */
    public MusicCategory f39389h;

    /* JADX INFO: renamed from: i */
    public C11160b f39390i;

    /* JADX INFO: renamed from: j */
    public zq10 f39391j;

    /* JADX INFO: renamed from: b2 */
    public static Intent m61189b2(Context context, MusicCategory musicCategory) {
        Intent intent = new Intent(context, (Class<?>) MusicListAct.class);
        intent.putExtra("extra_category", musicCategory);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    private void m61190d2() {
        new zq10(this).mo51532C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m61191g2(View view) {
        m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m61192h2(MusicContent musicContent) {
        this.f39391j.m219834u0();
        this.f39391j.m219833t0(musicContent);
    }

    /* JADX INFO: renamed from: n2 */
    private void m61193n2() {
        this.f39384c.setImageDrawable(FeedModule.f38855d.m209346Pb().mo193130b(this));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: a2 */
    public View m61194a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pq10.m170875b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zq10 zq10Var) {
        this.f39391j = zq10Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m61196e2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f39390i.m61328S(FeedModule.f38853b.m60522h2(this.f39389h.category).m221515e());
        } else if (c4319c == C4319c.f15549j) {
            this.f39390i.m61322M();
            this.f39391j.m219834u0();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m61197i2(MusicContent musicContent) {
        Intent intent = new Intent();
        intent.putExtra("result_selected", (Serializable) musicContent);
        setResult(-1, intent);
        m50458m2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m61194a2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.lq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129267a.m61196e2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public void m61198k2(List<Music> list) {
        this.f39390i.m61328S(list);
    }

    /* JADX INFO: renamed from: l2 */
    public void m61199l2(boolean z) {
        xdl0.m208344M(this.f39387f, z);
    }

    /* JADX INFO: renamed from: m2 */
    public void m61200m2() {
        this.f39390i.m61329T();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            m50458m2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f88772a));
        MusicCategory musicCategory = (MusicCategory) getIntent().getSerializableExtra("extra_category");
        this.f39389h = musicCategory;
        if (musicCategory == null) {
            m50458m2();
        }
        m61190d2();
        this.f39391j.m219829m0(this.f39389h);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m61201r() {
        getSupportActionBar().mo134126m();
        this.f39385d.setText(this.f39389h.name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.f39386e.setLayoutManager(linearLayoutManager);
        C11160b c11160b = new C11160b(this, this.f39391j);
        this.f39390i = c11160b;
        this.f39386e.setAdapter(c11160b);
        this.f39384c.setOnClickListener(new View.OnClickListener() { // from class: l.mq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135146a.m61191g2(view);
            }
        });
        this.f39390i.m61326Q(new e30() { // from class: l.nq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140025a.m61192h2((MusicContent) obj);
            }
        });
        this.f39390i.m61327R(new e30() { // from class: l.oq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145074a.m61197i2((MusicContent) obj);
            }
        });
        m61193n2();
    }
}
