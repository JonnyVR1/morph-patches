package com.p051p1.mobile.putong.feed.newui.camera;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MusicCategory;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.io.Serializable;
import java.util.List;
import p153l.bnl0;
import p153l.hz10;
import p153l.iam;
import p153l.k9c0;
import p153l.psd0;
import p153l.xy10;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicListAct extends ReloadSoAct implements iam<hz10> {

    /* JADX INFO: renamed from: c */
    public ImageView f40232c;

    /* JADX INFO: renamed from: d */
    public TextView f40233d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f40234e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f40235f;

    /* JADX INFO: renamed from: g */
    public TextView f40236g;

    /* JADX INFO: renamed from: h */
    public MusicCategory f40237h;

    /* JADX INFO: renamed from: i */
    public C11323b f40238i;

    /* JADX INFO: renamed from: j */
    public hz10 f40239j;

    /* JADX INFO: renamed from: c2 */
    public static Intent m62373c2(Context context, MusicCategory musicCategory) {
        Intent intent = new Intent(context, (Class<?>) MusicListAct.class);
        intent.putExtra("extra_category", musicCategory);
        return intent;
    }

    /* JADX INFO: renamed from: e2 */
    private void m62374e2() {
        new hz10(this).mo52715C(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m62375h2(View view) {
        m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m62376i2(MusicContent musicContent) {
        this.f40239j.m137801u0();
        this.f40239j.m137800t0(musicContent);
    }

    /* JADX INFO: renamed from: o2 */
    private void m62377o2() {
        this.f40232c.setImageDrawable(FeedModule.f39703d.m145587Pb().mo144667b(this));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: b2 */
    public View m62378b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xy10.m213602b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hz10 hz10Var) {
        this.f40239j = hz10Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m62380g2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f40238i.m62512S(FeedModule.f39701b.m61706h2(this.f40237h.category).m222761e());
        } else if (c4470c == C4470c.f16268j) {
            this.f40238i.m62506M();
            this.f40239j.m137801u0();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62378b2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ty10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176631a.m62380g2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m62381k2(MusicContent musicContent) {
        Intent intent = new Intent();
        intent.putExtra("result_selected", (Serializable) musicContent);
        setResult(-1, intent);
        m51642n2();
    }

    /* JADX INFO: renamed from: l2 */
    public void m62382l2(List<Music> list) {
        this.f40238i.m62512S(list);
    }

    /* JADX INFO: renamed from: m2 */
    public void m62383m2(boolean z) {
        bnl0.m105524M(this.f40235f, z);
    }

    /* JADX INFO: renamed from: n2 */
    public void m62384n2() {
        this.f40238i.m62513T();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            m51642n2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(k9c0.f124495a));
        MusicCategory musicCategory = (MusicCategory) getIntent().getSerializableExtra("extra_category");
        this.f40237h = musicCategory;
        if (musicCategory == null) {
            m51642n2();
        }
        m62374e2();
        this.f40239j.m137796m0(this.f40237h);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m62385r() {
        getSupportActionBar().mo102186m();
        this.f40233d.setText(this.f40237h.name);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        this.f40234e.setLayoutManager(linearLayoutManager);
        C11323b c11323b = new C11323b(this, this.f40239j);
        this.f40238i = c11323b;
        this.f40234e.setAdapter(c11323b);
        this.f40232c.setOnClickListener(new View.OnClickListener() { // from class: l.uy10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181531a.m62375h2(view);
            }
        });
        this.f40238i.m62510Q(new y20() { // from class: l.vy10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186317a.m62376i2((MusicContent) obj);
            }
        });
        this.f40238i.m62511R(new y20() { // from class: l.wy10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191565a.m62381k2((MusicContent) obj);
            }
        });
        m62377o2();
    }
}
