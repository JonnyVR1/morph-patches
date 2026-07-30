package com.p000p1.mobile.putong.feed.newui.mediapicker.newcaption;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.NewMomentDraft;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.ggi;
import l.hpd0;
import l.mkd0;
import l.qnd;
import l.rol;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xck0;
import l.xdl0;
import p007l.a8c0;
import p007l.e1c0;
import p007l.ki20;
import p007l.kjb0;
import p007l.oe40;
import p007l.xia;
import p007l.xvg;
import p007l.zi20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewCaptionAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public final int f2052c = 1;

    /* JADX INFO: renamed from: d */
    public final int f2053d = 2;

    /* JADX INFO: renamed from: e */
    public String f2054e = "camera";

    /* JADX INFO: renamed from: f */
    public ggi<NewMomentDraft> f2055f = new ggi<>(new qnd("new_moment_draft_text", (String) null, FeedModule.m1139F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: g */
    public ggi<NewMomentDraft> f2056g = new ggi<>(new qnd("new_moment_draft_media", (String) null, FeedModule.m1139F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: h */
    public hpd0 f2057h;

    /* JADX INFO: renamed from: i */
    public hpd0 f2058i;

    /* JADX INFO: renamed from: j */
    public int f2059j;

    /* JADX INFO: renamed from: k */
    public boolean f2060k;

    /* JADX INFO: renamed from: l */
    public boolean f2061l;

    /* JADX INFO: renamed from: m */
    public ki20 f2062m;

    /* JADX INFO: renamed from: n */
    public zi20 f2063n;

    /* JADX INFO: renamed from: o */
    public MenuItem f2064o;

    /* JADX INFO: renamed from: p */
    public e30<MenuItem> f2065p;

    /* JADX INFO: renamed from: q */
    public TextView f2066q;

    public NewCaptionAct() {
        xia xiaVar = FeedModule.f316d;
        this.f2057h = xiaVar.f14956V;
        this.f2058i = xiaVar.f14954U;
        this.f2059j = 1;
        this.f2065p = xck0.a(500, new e30() { // from class: l.wh20
            public final void call(Object obj) {
                this.f14545a.m3671v2((MenuItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m3652o2(Context context, ArrayList<Media> arrayList, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewCaptionAct.class);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("read_draft", z);
        return intent;
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m3653p2(Context context, ArrayList<Media> arrayList, boolean z, TopicMoment topicMoment, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) NewCaptionAct.class);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("read_draft", z);
        intent.putExtra("extra_topic", topicMoment);
        intent.putExtra("extra_from", str);
        intent.putExtra("extra_from_attend_btn", z2);
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    private void m3654q2(d30 d30Var) {
        int i = this.f2059j;
        if (i == 1) {
            this.f2057h.put(Boolean.FALSE);
            this.f2055f.c();
        } else if (i == 2) {
            this.f2058i.put(Boolean.FALSE);
            this.f2056g.c();
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m3655r2() {
        creates(new e30() { // from class: l.xh20
            public final void call(Object obj) {
                this.f14896a.m3657u2((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    private void m3656s2() {
        this.f2061l = getIntent().getBooleanExtra("extra_from_attend_btn", false);
        String stringExtra = getIntent().getStringExtra("extra_from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = this.f2054e;
        }
        this.f2054e = stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m3657u2(Bundle bundle) {
        setTitle("编辑内容");
        toolbar().setTitleTextAppearance(this, a8c0.f5647p);
        this.f2060k = getIntent().getBooleanExtra("read_draft", false);
        if (this.f2062m.m11428h0()) {
            this.f2059j = 2;
        }
        if (this.f2059j == 1 && ((Boolean) this.f2057h.get()).booleanValue()) {
            m3668K2(this.f2055f);
        } else if (this.f2059j == 2 && ((Boolean) this.f2058i.get()).booleanValue() && this.f2060k) {
            m3668K2(this.f2056g);
        }
        getWindow().setSoftInputMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m3658y2() {
        m3670M2(new d30() { // from class: l.ai20
            public final void call() {
                this.f5750a.m3672w2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m3659z2() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m3660A2() {
        m3654q2(new d30() { // from class: l.ci20
            public final void call() {
                this.f6654a.m3659z2();
            }
        });
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m3661B2() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ boolean m3662C2(MenuItem menuItem) {
        this.f2065p.call(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ Boolean m3663D2() {
        Iterator it = vwb.n(xdl0.s(toolbar()), new w9j() { // from class: l.bi20
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            this.f2066q = textView;
            if (!TextUtils.isEmpty(textView.getText())) {
                this.f2066q.setTypeface(eqh0.c(3));
                this.f2066q.setTextSize(18.0f);
                m3669L2();
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m3664E2(ggi.a aVar) {
        progressDismiss();
        if (aVar == null) {
            return;
        }
        this.f2062m.m11434n0((NewMomentDraft) aVar.a);
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m3665F2(d30 d30Var) {
        progressDismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m3666H2(final d30 d30Var) {
        NewMomentDraft newMomentDraftNew_ = NewMomentDraft.new_();
        newMomentDraftNew_.images = this.f2062m.m11426f0();
        newMomentDraftNew_.text = this.f2063n.m17413n();
        if (this.f2059j == 1 && newMomentDraftNew_.images.size() > 0) {
            this.f2059j = 2;
            this.f2057h.put(Boolean.FALSE);
        } else if (this.f2059j == 2 && newMomentDraftNew_.images.size() == 0) {
            this.f2059j = 1;
            this.f2058i.put(Boolean.FALSE);
        }
        int i = this.f2059j;
        newMomentDraftNew_.type = i;
        if (i == 1) {
            this.f2055f.p(newMomentDraftNew_);
            this.f2057h.put(Boolean.TRUE);
        } else if (i == 2) {
            this.f2056g.p(newMomentDraftNew_);
            this.f2058i.put(Boolean.TRUE);
        }
        e51.G(new Runnable() { // from class: l.th20
            @Override // java.lang.Runnable
            public final void run() {
                this.f13298a.m3665F2(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: I2, reason: merged with bridge method [inline-methods] */
    public final boolean m3671v2(MenuItem menuItem) {
        if (isFinishing()) {
            return true;
        }
        Moment momentNew_ = Moment.new_();
        momentNew_.media = this.f2062m.m11426f0();
        momentNew_.value = this.f2063n.m17413n();
        momentNew_.location = this.f2063n.m17412m();
        oe40.m12555T(((Act) this).act, momentNew_, null);
        m3654q2(null);
        finish();
        return true;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m3668K2(ggi<NewMomentDraft> ggiVar) {
        progress(R$string.f462X1);
        duringCreated(ggiVar.k().compose(mkd0.C())).subscribe(mkd0.G(new e30() { // from class: l.rh20
            public final void call(Object obj) {
                this.f12646a.m3664E2((ggi.a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public void m3669L2() {
        boolean z = !this.f2063n.m17414p() && this.f2062m.m11427g0();
        if (NullChecker.a(this.f2064o)) {
            this.f2064o.setEnabled(z);
        }
        if (NullChecker.a(this.f2066q)) {
            this.f2066q.setTextColor(z ? act().getResources().getColor(e1c0.f7126Y) : act().getResources().getColor(e1c0.f7127Z));
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m3670M2(final d30 d30Var) {
        progress(R$string.f445U2);
        e51.y(new Runnable() { // from class: l.sh20
            @Override // java.lang.Runnable
            public final void run() {
                this.f12953a.m3666H2(d30Var);
            }
        });
    }

    public void finish() {
        this.f2063n.m17416s(this);
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2063n.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f2062m = new ki20(this);
        zi20 zi20Var = new zi20(this);
        this.f2063n = zi20Var;
        this.f2062m.C(zi20Var);
        this.f2062m.m11429i0();
    }

    public void initSubscription() {
        super.initSubscription();
        m3655r2();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f2062m.m11431k0(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (this.f2062m.m11427g0()) {
            new xvg(this).m16864j(R$string.f372I1).m16863i(R$string.f468Y1, new Runnable() { // from class: l.qh20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12237a.m3658y2();
                }
            }).m16862h(R$string.f604s1, new Runnable() { // from class: l.uh20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13834a.m3660A2();
                }
            }).show();
        } else {
            m3654q2(new d30() { // from class: l.vh20
                public final void call() {
                    this.f14171a.m3661B2();
                }
            });
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem onMenuItemClickListener = menu.add(actionItemPadding(((Act) this).act.getString(R$string.f456W1))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.yh20
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f15429a.m3662C2(menuItem);
            }
        });
        this.f2064o = onMenuItemClickListener;
        onMenuItemClickListener.setShowAsAction(2);
        m3669L2();
        pendChangeActionButtonTypeface();
        return true;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2062m.m11432l0(intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_images", this.f2062m.m11426f0());
    }

    public void pendChangeActionButtonTypeface() {
        xdl0.b0(findViewById(R.id.content), new v9j() { // from class: l.zh20
            public final Object call() {
                return this.f15737a.m3663D2();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        if (!FeedModule.m1139F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.b(getIntent())) {
                e51.p(intent, getIntent());
            }
            intent.putExtra("after_signin", 1);
            kjb0.m11446J(((Act) this).act, intent);
            finish();
        }
        this.f2062m.m11433m0(getIntent(), bundle);
        setSwipeBackEnable(false);
        m3656s2();
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m3672w2() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }
}
