package com.p000p1.mobile.putong.feed.newui.camera;

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
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.MusicCenterAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.io.Serializable;
import java.util.List;
import l.d30;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.w9j;
import l.xdl0;
import l.z9j;
import p007l.cp10;
import p007l.dt10;
import p007l.e1c0;
import p007l.kuv;
import p007l.uzb0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicCenterAct extends ReloadSoAct {

    /* JADX INFO: renamed from: c */
    public ImageView f818c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f819d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f820e;

    /* JADX INFO: renamed from: f */
    public TextView f821f;

    /* JADX INFO: renamed from: g */
    public C2003a f822g;

    /* JADX INFO: renamed from: h */
    public int f823h;

    /* JADX INFO: renamed from: i */
    public String f824i = "hot";

    /* JADX INFO: renamed from: j */
    public final a<String> f825j = a.c("hot");

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicCenterAct$a */
    public class C1994a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f826a;

        public C1994a(GridLayoutManager gridLayoutManager) {
            this.f826a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m2070f(int i) {
            int itemViewType = MusicCenterAct.this.f819d.getAdapter().getItemViewType(i);
            if (itemViewType == 1) {
                return 3;
            }
            if (itemViewType == 2) {
                return 4;
            }
            return this.f826a.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m2036A2(List list) {
        xdl0.M(this.f820e, list.isEmpty());
        this.f822g.m2248W(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public /* synthetic */ void m2037B2(Throwable th) {
        xdl0.M(this.f820e, true);
    }

    /* JADX INFO: renamed from: H2 */
    private void m2038H2() {
        this.f818c.setImageResource(FeedModule.f316d.m16527Pb().mo15087n(this));
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m2040X1() {
        dt10.m9579o(dt10.m9568d());
        dt10.m9572h();
        kuv.m11529k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m2056u2(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m2057z2(c cVar) {
        boolean z = TextUtils.isEmpty(this.f824i) || TextUtils.equals(this.f824i, "hot");
        if (cVar == c.i && z) {
            this.f822g.m2257e0((List) FeedModule.f314b.m1448h2("hot").e(), "hot");
        } else if (cVar == c.j) {
            this.f822g.m2240N();
            dt10.m9579o(dt10.m9568d());
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ List m2058C2(List list, List list2, List list3, String str) {
        if (TextUtils.isEmpty(this.f824i) || TextUtils.equals(this.f824i, "hot")) {
            return list;
        }
        return (TextUtils.isEmpty(this.f824i) || TextUtils.equals(this.f824i, "fav")) ? list2 : list3;
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m2059D2(List list) {
        this.f822g.m2251Z(list, "favor", this.f824i);
    }

    /* JADX INFO: renamed from: E2 */
    public final void m2060E2(String str) {
        if (TextUtils.equals(str, this.f824i)) {
            return;
        }
        this.f822g.m2240N();
        m2062I2();
        this.f824i = str;
        this.f825j.onNext(str);
        str.getClass();
        if (str.equals("fav")) {
            FeedModule.f314b.m1420L2();
        } else if (str.equals("hot")) {
            FeedModule.f314b.m1423O2("hot");
        }
        this.f823h = -1;
    }

    /* JADX INFO: renamed from: F2 */
    public void m2061F2(MusicContent musicContent) {
        dt10.m9578n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: I2 */
    public void m2062I2() {
        dt10.m9579o(dt10.m9568d());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2063p2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.zo10
            public final void call(Object obj) {
                this.f15815a.m2069y2((Bundle) obj);
            }
        }, new d30() { // from class: l.ap10
            public final void call() {
                MusicCenterAct.m2040X1();
            }
        });
    }

    public void initSubscription() {
        super.initSubscription();
        duringCreated(FeedModule.f314b.m1422N2()).subscribe(mkd0.H(new e30() { // from class: l.lo10
            public final void call(Object obj) {
                this.f10079a.m2036A2((List) obj);
            }
        }, new e30() { // from class: l.to10
            public final void call(Object obj) {
                this.f13366a.m2037B2((Throwable) obj);
            }
        }));
        duringCreated(mkd0.t(FeedModule.f314b.m1431T2("hot"), FeedModule.f314b.m1444d2(), kuv.m11528j(), this.f825j, new z9j() { // from class: l.uo10
            /* JADX INFO: renamed from: b */
            public final Object m15124b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f13903a.m2058C2((List) obj, (List) obj2, (List) obj3, (String) obj4);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.vo10
            public final void call(Object obj) {
                this.f14255a.m2059D2((List) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.wo10
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.xo10
            public final void call(Object obj) {
                kuv.m11525g();
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.yo10
            public final void call(Object obj) {
                this.f15481a.m2057z2((c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        act().overridePendingTransition(0, uzb0.f13996j);
    }

    /* JADX INFO: renamed from: p2 */
    public View m2063p2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cp10.m9210b(this, layoutInflater, viewGroup);
    }

    public String pageId() {
        return "p_camera_music_library";
    }

    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f7128a));
    }

    /* JADX INFO: renamed from: q2 */
    public void m2064q2() {
        if (this.f822g.getItemCount() == this.f823h) {
            return;
        }
        this.f823h = this.f822g.getItemCount();
        String str = this.f824i;
        str.getClass();
        switch (str) {
            case "fav":
                duringCreated(FeedModule.f314b.m1445e2()).subscribe(mkd0.H(new e30() { // from class: l.ro10
                    public final void call(Object obj) {
                        this.f12705a.m2066s2((Boolean) obj);
                    }
                }, new e30() { // from class: l.so10
                    public final void call(Object obj) {
                        lsi0.h(R$string.f592q1);
                    }
                }));
                break;
            case "hot":
                duringCreated(FeedModule.f314b.m1433U2("hot")).subscribe(mkd0.H(new e30() { // from class: l.po10
                    public final void call(Object obj) {
                        this.f11893a.m2065r2((Boolean) obj);
                    }
                }, new e30() { // from class: l.qo10
                    public final void call(Object obj) {
                        lsi0.h(R$string.f592q1);
                    }
                }));
                break;
            case "local":
                kuv.m11527i();
                break;
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m2065r2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f822g.m2252a0();
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m2066s2(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        this.f822g.m2252a0();
    }

    public void setTheme() {
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m2067v2(MusicContent musicContent) {
        m2062I2();
        m2061F2(musicContent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m2068w2(MusicContent musicContent) {
        Intent intent = new Intent();
        intent.putExtra("result_selected", (Serializable) musicContent);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m2069y2(Bundle bundle) {
        getSupportActionBar().m();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 12);
        gridLayoutManager.v(new C1994a(gridLayoutManager));
        this.f819d.setLayoutManager(gridLayoutManager);
        C2003a c2003a = new C2003a(this);
        this.f822g = c2003a;
        c2003a.m2247V(new e30() { // from class: l.bp10
            public final void call(Object obj) {
                this.f6398a.m2060E2((String) obj);
            }
        });
        this.f819d.setAdapter(this.f822g);
        FeedModule.f314b.m1423O2("hot");
        this.f818c.setOnClickListener(new View.OnClickListener() { // from class: l.mo10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10527a.m2056u2(view);
            }
        });
        this.f822g.m2249X(new e30() { // from class: l.no10
            public final void call(Object obj) {
                this.f10842a.m2067v2((MusicContent) obj);
            }
        });
        this.f822g.m2250Y(new e30() { // from class: l.oo10
            public final void call(Object obj) {
                this.f11545a.m2068w2((MusicContent) obj);
            }
        });
        m2038H2();
    }
}
