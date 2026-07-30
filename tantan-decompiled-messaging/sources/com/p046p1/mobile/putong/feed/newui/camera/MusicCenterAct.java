package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.io.Serializable;
import java.util.List;
import p133rx.subjects.C22392a;
import p149l.cp10;
import p149l.d30;
import p149l.dt10;
import p149l.e1c0;
import p149l.e30;
import p149l.kuv;
import p149l.mkd0;
import p149l.uzb0;
import p149l.w9j;
import p149l.xdl0;
import p149l.z9j;

/* JADX INFO: loaded from: classes12.dex */
public class MusicCenterAct extends ReloadSoAct {

    /* JADX INFO: renamed from: c */
    public ImageView f39357c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f39358d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f39359e;

    /* JADX INFO: renamed from: f */
    public TextView f39360f;

    /* JADX INFO: renamed from: g */
    public C11159a f39361g;

    /* JADX INFO: renamed from: h */
    public int f39362h;

    /* JADX INFO: renamed from: i */
    public String f39363i = "hot";

    /* JADX INFO: renamed from: j */
    public final C22392a<String> f39364j = C22392a.m221513c("hot");

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicCenterAct$a */
    public class C11150a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f39365a;

        public C11150a(GridLayoutManager gridLayoutManager) {
            this.f39365a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            int itemViewType = MusicCenterAct.this.f39358d.getAdapter().getItemViewType(i);
            if (itemViewType == 1) {
                return 3;
            }
            if (itemViewType == 2) {
                return 4;
            }
            return this.f39365a.m3317m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m61103A2(List list) {
        xdl0.m208344M(this.f39359e, list.isEmpty());
        this.f39361g.m61304W(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m61104B2(Throwable th) {
        xdl0.m208344M(this.f39359e, true);
    }

    /* JADX INFO: renamed from: H2 */
    private void m61105H2() {
        this.f39357c.setImageResource(FeedModule.f38855d.m209346Pb().mo193142n(this));
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m61107X1() {
        dt10.m113523o(dt10.m113512d());
        dt10.m113516h();
        kuv.m147327k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m61123u2(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m61124z2(C4319c c4319c) {
        boolean z = TextUtils.isEmpty(this.f39363i) || TextUtils.equals(this.f39363i, "hot");
        if (c4319c == C4319c.f15548i && z) {
            this.f39361g.m61312e0(FeedModule.f38853b.m60522h2("hot").m221515e(), "hot");
        } else if (c4319c == C4319c.f15549j) {
            this.f39361g.m61296N();
            dt10.m113523o(dt10.m113512d());
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ List m61125C2(List list, List list2, List list3, String str) {
        if (TextUtils.isEmpty(this.f39363i) || TextUtils.equals(this.f39363i, "hot")) {
            return list;
        }
        return (TextUtils.isEmpty(this.f39363i) || TextUtils.equals(this.f39363i, "fav")) ? list2 : list3;
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m61126D2(List list) {
        this.f39361g.m61307Z(list, "favor", this.f39363i);
    }

    /* JADX INFO: renamed from: E2 */
    public final void m61127E2(String str) {
        if (TextUtils.equals(str, this.f39363i)) {
            return;
        }
        this.f39361g.m61296N();
        m61129I2();
        this.f39363i = str;
        this.f39364j.onNext(str);
        str.getClass();
        if (str.equals("fav")) {
            FeedModule.f38853b.m60494L2();
        } else if (str.equals("hot")) {
            FeedModule.f38853b.m60497O2("hot");
        }
        this.f39362h = -1;
    }

    /* JADX INFO: renamed from: F2 */
    public void m61128F2(MusicContent musicContent) {
        dt10.m113522n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: I2 */
    public void m61129I2() {
        dt10.m113523o(dt10.m113512d());
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m61130p2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.zo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204082a.m61136y2((Bundle) obj);
            }
        }, new d30() { // from class: l.ap10
            @Override // p149l.d30
            public final void call() {
                MusicCenterAct.m61107X1();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(FeedModule.f38853b.m60496N2()).subscribe(mkd0.m154956H(new e30() { // from class: l.lo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129058a.m61103A2((List) obj);
            }
        }, new e30() { // from class: l.to10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171313a.m61104B2((Throwable) obj);
            }
        }));
        duringCreated(mkd0.m154986t(FeedModule.f38853b.m60505T2("hot"), FeedModule.f38853b.m60518d2(), kuv.m147326j(), this.f39364j, new z9j() { // from class: l.uo10
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f177489a.m61125C2((List) obj, (List) obj2, (List) obj3, (String) obj4);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.vo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182329a.m61126D2((List) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.wo10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.xo10
            @Override // p149l.e30
            public final void call(Object obj) {
                kuv.m147323g();
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.yo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199255a.m61124z2((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            m47815F2();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        act().overridePendingTransition(0, uzb0.f178985j);
    }

    /* JADX INFO: renamed from: p2 */
    public View m61130p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cp10.m108048b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_music_library";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f88772a));
    }

    /* JADX INFO: renamed from: q2 */
    public void m61131q2() {
        if (this.f39361g.getItemCount() == this.f39362h) {
            return;
        }
        this.f39362h = this.f39361g.getItemCount();
        String str = this.f39363i;
        str.getClass();
        switch (str) {
            case "fav":
                duringCreated(FeedModule.f38853b.m60519e2()).subscribe(mkd0.m154956H(new e30() { // from class: l.ro10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f160346a.m61133s2((Boolean) obj);
                    }
                }, new e30() { // from class: l.so10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lsi0.m151578h(R$string.f39131q1);
                    }
                }));
                break;
            case "hot":
                duringCreated(FeedModule.f38853b.m60507U2("hot")).subscribe(mkd0.m154956H(new e30() { // from class: l.po10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f150445a.m61132r2((Boolean) obj);
                    }
                }, new e30() { // from class: l.qo10
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        lsi0.m151578h(R$string.f39131q1);
                    }
                }));
                break;
            case "local":
                kuv.m147325i();
                break;
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m61132r2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f39361g.m61308a0();
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m61133s2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f39361g.m61308a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m61134v2(MusicContent musicContent) {
        m61129I2();
        m61128F2(musicContent);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m61135w2(MusicContent musicContent) {
        Intent intent = new Intent();
        intent.putExtra("result_selected", (Serializable) musicContent);
        setResult(-1, intent);
        m47815F2();
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m61136y2(Bundle bundle) {
        getSupportActionBar().mo134126m();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 12);
        gridLayoutManager.m3326v(new C11150a(gridLayoutManager));
        this.f39358d.setLayoutManager(gridLayoutManager);
        C11159a c11159a = new C11159a(this);
        this.f39361g = c11159a;
        c11159a.m61303V(new e30() { // from class: l.bp10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76587a.m61127E2((String) obj);
            }
        });
        this.f39358d.setAdapter(this.f39361g);
        FeedModule.f38853b.m60497O2("hot");
        this.f39357c.setOnClickListener(new View.OnClickListener() { // from class: l.mo10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134821a.m61123u2(view);
            }
        });
        this.f39361g.m61305X(new e30() { // from class: l.no10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139813a.m61134v2((MusicContent) obj);
            }
        });
        this.f39361g.m61306Y(new e30() { // from class: l.oo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144841a.m61135w2((MusicContent) obj);
            }
        });
        m61105H2();
    }
}
