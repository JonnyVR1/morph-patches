package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.io.Serializable;
import java.util.List;
import p137rx.subjects.C22507a;
import p153l.a8c0;
import p153l.bnl0;
import p153l.k9c0;
import p153l.kx10;
import p153l.l120;
import p153l.lwv;
import p153l.psd0;
import p153l.qcj;
import p153l.tcj;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicCenterAct extends ReloadSoAct {

    /* JADX INFO: renamed from: c */
    public ImageView f40205c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f40206d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f40207e;

    /* JADX INFO: renamed from: f */
    public TextView f40208f;

    /* JADX INFO: renamed from: g */
    public C11322a f40209g;

    /* JADX INFO: renamed from: h */
    public int f40210h;

    /* JADX INFO: renamed from: i */
    public String f40211i = "hot";

    /* JADX INFO: renamed from: j */
    public final C22507a<String> f40212j = C22507a.m222759c("hot");

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicCenterAct$a */
    public class C11313a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f40213a;

        public C11313a(GridLayoutManager gridLayoutManager) {
            this.f40213a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            int itemViewType = MusicCenterAct.this.f40206d.getAdapter().getItemViewType(i);
            if (itemViewType == 1) {
                return 3;
            }
            if (itemViewType == 2) {
                return 4;
            }
            return this.f40213a.m3318m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m62287A2(C4470c c4470c) {
        boolean z = TextUtils.isEmpty(this.f40211i) || TextUtils.equals(this.f40211i, "hot");
        if (c4470c == C4470c.f16267i && z) {
            this.f40209g.m62496e0(FeedModule.f39701b.m61706h2("hot").m222761e(), "hot");
        } else if (c4470c == C4470c.f16268j) {
            this.f40209g.m62480N();
            l120.m152432o(l120.m152421d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m62288B2(List list) {
        bnl0.m105524M(this.f40207e, list.isEmpty());
        this.f40209g.m62488W(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m62289C2(Throwable th) {
        bnl0.m105524M(this.f40207e, true);
    }

    /* JADX INFO: renamed from: I2 */
    private void m62290I2() {
        this.f40205c.setImageResource(FeedModule.f39703d.m145587Pb().mo144679n(this));
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m62292Y1() {
        l120.m152432o(l120.m152421d());
        l120.m152425h();
        lwv.m156125k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m62308v2(View view) {
        onBackPressed();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ List m62309D2(List list, List list2, List list3, String str) {
        if (TextUtils.isEmpty(this.f40211i) || TextUtils.equals(this.f40211i, "hot")) {
            return list;
        }
        return (TextUtils.isEmpty(this.f40211i) || TextUtils.equals(this.f40211i, "fav")) ? list2 : list3;
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m62310E2(List list) {
        this.f40209g.m62491Z(list, "favor", this.f40211i);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m62311F2(String str) {
        if (TextUtils.equals(str, this.f40211i)) {
            return;
        }
        this.f40209g.m62480N();
        m62313K2();
        this.f40211i = str;
        this.f40212j.onNext(str);
        str.getClass();
        if (str.equals("fav")) {
            FeedModule.f39701b.m61678L2();
        } else if (str.equals("hot")) {
            FeedModule.f39701b.m61681O2("hot");
        }
        this.f40210h = -1;
    }

    /* JADX INFO: renamed from: H2 */
    public void m62312H2(MusicContent musicContent) {
        l120.m152431n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: K2 */
    public void m62313K2() {
        l120.m152432o(l120.m152421d());
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m62314q2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.hx10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111962a.m62320z2((Bundle) obj);
            }
        }, new x20() { // from class: l.ix10
            @Override // p153l.x20
            public final void call() {
                MusicCenterAct.m62292Y1();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(FeedModule.f39701b.m61680N2()).subscribe(psd0.m173597H(new y20() { // from class: l.tw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176368a.m62288B2((List) obj);
            }
        }, new y20() { // from class: l.bx10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78804a.m62289C2((Throwable) obj);
            }
        }));
        duringCreated(psd0.m173627t(FeedModule.f39701b.m61689T2("hot"), FeedModule.f39701b.m61702d2(), lwv.m156124j(), this.f40212j, new tcj() { // from class: l.cx10
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f84166a.m62309D2((List) obj, (List) obj2, (List) obj3, (String) obj4);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.dx10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91055a.m62310E2((List) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.ex10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.fx10
            @Override // p153l.y20
            public final void call(Object obj) {
                lwv.m156121g();
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.gx10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106881a.m62287A2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            m48999H2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        act().overridePendingTransition(0, a8c0.f68910j);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_music_library";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(k9c0.f124495a));
    }

    /* JADX INFO: renamed from: q2 */
    public View m62314q2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kx10.m151778b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r2 */
    public void m62315r2() {
        if (this.f40209g.getItemCount() == this.f40210h) {
            return;
        }
        this.f40210h = this.f40209g.getItemCount();
        String str = this.f40211i;
        str.getClass();
        switch (str) {
            case "fav":
                duringCreated(FeedModule.f39701b.m61703e2()).subscribe(psd0.m173597H(new y20() { // from class: l.zw10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f206317a.m62317u2((Boolean) obj);
                    }
                }, new y20() { // from class: l.ax10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o1j0.m165634h(R$string.f39979q1);
                    }
                }));
                break;
            case "hot":
                duringCreated(FeedModule.f39701b.m61691U2("hot")).subscribe(psd0.m173597H(new y20() { // from class: l.xw10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f196454a.m62316s2((Boolean) obj);
                    }
                }, new y20() { // from class: l.yw10
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o1j0.m165634h(R$string.f39979q1);
                    }
                }));
                break;
            case "local":
                lwv.m156123i();
                break;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m62316s2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f40209g.m62492a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m62317u2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f40209g.m62492a0();
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m62318w2(MusicContent musicContent) {
        m62313K2();
        m62312H2(musicContent);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m62319y2(MusicContent musicContent) {
        Intent intent = new Intent();
        intent.putExtra("result_selected", (Serializable) musicContent);
        setResult(-1, intent);
        m48999H2();
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m62320z2(Bundle bundle) {
        getSupportActionBar().mo102186m();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 12);
        gridLayoutManager.m3327v(new C11313a(gridLayoutManager));
        this.f40206d.setLayoutManager(gridLayoutManager);
        C11322a c11322a = new C11322a(this);
        this.f40209g = c11322a;
        c11322a.m62487V(new y20() { // from class: l.jx10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122982a.m62311F2((String) obj);
            }
        });
        this.f40206d.setAdapter(this.f40209g);
        FeedModule.f39701b.m61681O2("hot");
        this.f40205c.setOnClickListener(new View.OnClickListener() { // from class: l.uw10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181224a.m62308v2(view);
            }
        });
        this.f40209g.m62489X(new y20() { // from class: l.vw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186059a.m62318w2((MusicContent) obj);
            }
        });
        this.f40209g.m62490Y(new y20() { // from class: l.ww10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191131a.m62319y2((MusicContent) obj);
            }
        });
        m62290I2();
    }
}
