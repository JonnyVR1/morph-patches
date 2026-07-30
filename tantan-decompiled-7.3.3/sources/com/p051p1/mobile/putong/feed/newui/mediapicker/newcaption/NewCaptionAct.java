package com.p051p1.mobile.putong.feed.newui.mediapicker.newcaption;

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
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.NewMomentDraft;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.cn40;
import p153l.crl;
import p153l.dji;
import p153l.dmk0;
import p153l.fgc0;
import p153l.jka;
import p153l.jr20;
import p153l.jxd0;
import p153l.jyb;
import p153l.k9c0;
import p153l.l51;
import p153l.lyh0;
import p153l.mxg;
import p153l.orb0;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.uq20;
import p153l.vod;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class NewCaptionAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public final int f41439c = 1;

    /* JADX INFO: renamed from: d */
    public final int f41440d = 2;

    /* JADX INFO: renamed from: e */
    public String f41441e = "camera";

    /* JADX INFO: renamed from: f */
    public dji<NewMomentDraft> f41442f = new dji<>(new vod("new_moment_draft_text", null, FeedModule.m61405F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: g */
    public dji<NewMomentDraft> f41443g = new dji<>(new vod("new_moment_draft_media", null, FeedModule.m61405F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: h */
    public jxd0 f41444h;

    /* JADX INFO: renamed from: i */
    public jxd0 f41445i;

    /* JADX INFO: renamed from: j */
    public int f41446j;

    /* JADX INFO: renamed from: k */
    public boolean f41447k;

    /* JADX INFO: renamed from: l */
    public boolean f41448l;

    /* JADX INFO: renamed from: m */
    public uq20 f41449m;

    /* JADX INFO: renamed from: n */
    public jr20 f41450n;

    /* JADX INFO: renamed from: o */
    public MenuItem f41451o;

    /* JADX INFO: renamed from: p */
    public y20<MenuItem> f41452p;

    /* JADX INFO: renamed from: q */
    public TextView f41453q;

    public NewCaptionAct() {
        jka jkaVar = FeedModule.f39703d;
        this.f41444h = jkaVar.f121331V;
        this.f41445i = jkaVar.f121329U;
        this.f41446j = 1;
        this.f41452p = dmk0.m116962a(500, new y20() { // from class: l.gq20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105642a.m63849w2((MenuItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m63814A2() {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m63831p2(Context context, ArrayList<Media> arrayList, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewCaptionAct.class);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("read_draft", z);
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m63832q2(Context context, ArrayList<Media> arrayList, boolean z, TopicMoment topicMoment, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) NewCaptionAct.class);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("read_draft", z);
        intent.putExtra("extra_topic", topicMoment);
        intent.putExtra("extra_from", str);
        intent.putExtra("extra_from_attend_btn", z2);
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    private void m63833r2(x20 x20Var) {
        int i = this.f41446j;
        if (i == 1) {
            this.f41444h.put(Boolean.FALSE);
            this.f41442f.m116099c();
        } else if (i == 2) {
            this.f41445i.put(Boolean.FALSE);
            this.f41443g.m116099c();
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: s2 */
    private void m63834s2() {
        creates(new y20() { // from class: l.hq20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111068a.m63836v2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    private void m63835u2() {
        this.f41448l = getIntent().getBooleanExtra("extra_from_attend_btn", false);
        String stringExtra = getIntent().getStringExtra("extra_from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = this.f41441e;
        }
        this.f41441e = stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m63836v2(Bundle bundle) {
        setTitle("编辑内容");
        toolbar().setTitleTextAppearance(this, fgc0.f98913p);
        this.f41447k = getIntent().getBooleanExtra("read_draft", false);
        if (this.f41449m.m197202h0()) {
            this.f41446j = 2;
        }
        if (this.f41446j == 1 && this.f41444h.get().booleanValue()) {
            m63846L2(this.f41442f);
        } else if (this.f41446j == 2 && this.f41445i.get().booleanValue() && this.f41447k) {
            m63846L2(this.f41443g);
        }
        getWindow().setSoftInputMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m63837z2() {
        m63848N2(new x20() { // from class: l.kq20
            @Override // p153l.x20
            public final void call() {
                this.f128152a.m63850y2();
            }
        });
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m63838B2() {
        m63833r2(new x20() { // from class: l.mq20
            @Override // p153l.x20
            public final void call() {
                this.f137996a.m63814A2();
            }
        });
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m63839C2() {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ boolean m63840D2(MenuItem menuItem) {
        this.f41452p.call(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ Boolean m63841E2() {
        Iterator it = jyb.m147522n(bnl0.m105579s(toolbar()), new qcj() { // from class: l.lq20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            this.f41453q = textView;
            if (!TextUtils.isEmpty(textView.getText())) {
                this.f41453q.setTypeface(lyh0.m156283c(3));
                this.f41453q.setTextSize(18.0f);
                m63847M2();
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m63842F2(dji.C16549a c16549a) {
        progressDismiss();
        if (c16549a == null) {
            return;
        }
        this.f41449m.m197208n0((NewMomentDraft) c16549a.f88861a);
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m63843H2(x20 x20Var) {
        progressDismiss();
        x20Var.call();
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m63844I2(final x20 x20Var) {
        NewMomentDraft newMomentDraftNew_ = NewMomentDraft.new_();
        newMomentDraftNew_.images = this.f41449m.m197200f0();
        newMomentDraftNew_.text = this.f41450n.m146689n();
        if (this.f41446j == 1 && newMomentDraftNew_.images.size() > 0) {
            this.f41446j = 2;
            this.f41444h.put(Boolean.FALSE);
        } else if (this.f41446j == 2 && newMomentDraftNew_.images.size() == 0) {
            this.f41446j = 1;
            this.f41445i.put(Boolean.FALSE);
        }
        int i = this.f41446j;
        newMomentDraftNew_.type = i;
        if (i == 1) {
            this.f41442f.m116110p(newMomentDraftNew_);
            this.f41444h.put(Boolean.TRUE);
        } else if (i == 2) {
            this.f41443g.m116110p(newMomentDraftNew_);
            this.f41445i.put(Boolean.TRUE);
        }
        l51.m152887G(new Runnable() { // from class: l.dq20
            @Override // java.lang.Runnable
            public final void run() {
                this.f90103a.m63843H2(x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: K2, reason: merged with bridge method [inline-methods] */
    public final boolean m63849w2(MenuItem menuItem) {
        if (isFinishing()) {
            return true;
        }
        Moment momentNew_ = Moment.new_();
        momentNew_.media = this.f41449m.m197200f0();
        momentNew_.value = this.f41450n.m146689n();
        momentNew_.location = this.f41450n.m146688m();
        cn40.m111368T(this.act, momentNew_, null);
        m63833r2(null);
        m68056e2();
        return true;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m63846L2(dji<NewMomentDraft> djiVar) {
        progress(R$string.f39849X1);
        duringCreated((C22421c) djiVar.m116105k().compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.bq20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77848a.m63842F2((dji.C16549a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public void m63847M2() {
        boolean z = !this.f41450n.m146690p() && this.f41449m.m197201g0();
        if (NullChecker.m82486a(this.f41451o)) {
            this.f41451o.setEnabled(z);
        }
        if (NullChecker.m82486a(this.f41453q)) {
            this.f41453q.setTextColor(z ? act().getResources().getColor(k9c0.f124493Y) : act().getResources().getColor(k9c0.f124494Z));
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final void m63848N2(final x20 x20Var) {
        progress(R$string.f39832U2);
        l51.m152919y(new Runnable() { // from class: l.cq20
            @Override // java.lang.Runnable
            public final void run() {
                this.f83066a.m63844I2(x20Var);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        this.f41450n.m146692s(this);
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41450n.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f41449m = new uq20(this);
        jr20 jr20Var = new jr20(this);
        this.f41450n = jr20Var;
        this.f41449m.mo52715C(jr20Var);
        this.f41449m.m197203i0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m63834s2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f41449m.m197205k0(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f41449m.m197201g0()) {
            new mxg(this).m160668j(R$string.f39759I1).m160667i(R$string.f39855Y1, new Runnable() { // from class: l.aq20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72782a.m63837z2();
                }
            }).m160666h(R$string.f39991s1, new Runnable() { // from class: l.eq20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95294a.m63838B2();
                }
            }).show();
        } else {
            m63833r2(new x20() { // from class: l.fq20
                @Override // p153l.x20
                public final void call() {
                    this.f100243a.m63839C2();
                }
            });
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem onMenuItemClickListener = menu.add(actionItemPadding(this.act.getString(R$string.f39843W1))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.iq20
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f116328a.m63840D2(menuItem);
            }
        });
        this.f41451o = onMenuItemClickListener;
        onMenuItemClickListener.setShowAsAction(2);
        m63847M2();
        pendChangeActionButtonTypeface();
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f41449m.m197206l0(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_images", this.f41449m.m197200f0());
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void pendChangeActionButtonTypeface() {
        bnl0.m105546b0(findViewById(R.id.content), new pcj() { // from class: l.jq20
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f122180a.m63841E2();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (!FeedModule.m61405F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.m82487b(getIntent())) {
                l51.m152910p(intent, getIntent());
            }
            intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 1);
            orb0.m168881J(this.act, intent);
            m68056e2();
        }
        this.f41449m.m197207m0(getIntent(), bundle);
        setSwipeBackEnable(false);
        m63835u2();
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m63850y2() {
        super.onBackPressed();
    }
}
