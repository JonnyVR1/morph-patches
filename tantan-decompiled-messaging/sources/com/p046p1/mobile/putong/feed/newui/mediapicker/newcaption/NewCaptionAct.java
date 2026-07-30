package com.p046p1.mobile.putong.feed.newui.mediapicker.newcaption;

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
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.NewMomentDraft;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p133rx.C22306c;
import p149l.a8c0;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.ggi;
import p149l.hpd0;
import p149l.ki20;
import p149l.kjb0;
import p149l.mkd0;
import p149l.oe40;
import p149l.qnd;
import p149l.rol;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xck0;
import p149l.xdl0;
import p149l.xia;
import p149l.xvg;
import p149l.zi20;

/* JADX INFO: loaded from: classes12.dex */
public class NewCaptionAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public final int f40591c = 1;

    /* JADX INFO: renamed from: d */
    public final int f40592d = 2;

    /* JADX INFO: renamed from: e */
    public String f40593e = "camera";

    /* JADX INFO: renamed from: f */
    public ggi<NewMomentDraft> f40594f = new ggi<>(new qnd("new_moment_draft_text", null, FeedModule.m60221F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: g */
    public ggi<NewMomentDraft> f40595g = new ggi<>(new qnd("new_moment_draft_media", null, FeedModule.m60221F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: h */
    public hpd0 f40596h;

    /* JADX INFO: renamed from: i */
    public hpd0 f40597i;

    /* JADX INFO: renamed from: j */
    public int f40598j;

    /* JADX INFO: renamed from: k */
    public boolean f40599k;

    /* JADX INFO: renamed from: l */
    public boolean f40600l;

    /* JADX INFO: renamed from: m */
    public ki20 f40601m;

    /* JADX INFO: renamed from: n */
    public zi20 f40602n;

    /* JADX INFO: renamed from: o */
    public MenuItem f40603o;

    /* JADX INFO: renamed from: p */
    public e30<MenuItem> f40604p;

    /* JADX INFO: renamed from: q */
    public TextView f40605q;

    public NewCaptionAct() {
        xia xiaVar = FeedModule.f38855d;
        this.f40596h = xiaVar.f193021V;
        this.f40597i = xiaVar.f193019U;
        this.f40598j = 1;
        this.f40604p = xck0.m208120a(500, new e30() { // from class: l.wh20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186356a.m62666v2((MenuItem) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m62647o2(Context context, ArrayList<Media> arrayList, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewCaptionAct.class);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("read_draft", z);
        return intent;
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m62648p2(Context context, ArrayList<Media> arrayList, boolean z, TopicMoment topicMoment, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) NewCaptionAct.class);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("read_draft", z);
        intent.putExtra("extra_topic", topicMoment);
        intent.putExtra("extra_from", str);
        intent.putExtra("extra_from_attend_btn", z2);
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    private void m62649q2(d30 d30Var) {
        int i = this.f40598j;
        if (i == 1) {
            this.f40596h.put(Boolean.FALSE);
            this.f40594f.m125967c();
        } else if (i == 2) {
            this.f40597i.put(Boolean.FALSE);
            this.f40595g.m125967c();
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: r2 */
    private void m62650r2() {
        creates(new e30() { // from class: l.xh20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192855a.m62652u2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    private void m62651s2() {
        this.f40600l = getIntent().getBooleanExtra("extra_from_attend_btn", false);
        String stringExtra = getIntent().getStringExtra("extra_from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = this.f40593e;
        }
        this.f40593e = stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m62652u2(Bundle bundle) {
        setTitle("编辑内容");
        toolbar().setTitleTextAppearance(this, a8c0.f68027p);
        this.f40599k = getIntent().getBooleanExtra("read_draft", false);
        if (this.f40601m.m146044h0()) {
            this.f40598j = 2;
        }
        if (this.f40598j == 1 && this.f40596h.get().booleanValue()) {
            m62663K2(this.f40594f);
        } else if (this.f40598j == 2 && this.f40597i.get().booleanValue() && this.f40599k) {
            m62663K2(this.f40595g);
        }
        getWindow().setSoftInputMode(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m62653y2() {
        m62665M2(new d30() { // from class: l.ai20
            @Override // p149l.d30
            public final void call() {
                this.f69951a.m62667w2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m62654z2() {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m62655A2() {
        m62649q2(new d30() { // from class: l.ci20
            @Override // p149l.d30
            public final void call() {
                this.f81030a.m62654z2();
            }
        });
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m62656B2() {
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ boolean m62657C2(MenuItem menuItem) {
        this.f40604p.call(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ Boolean m62658D2() {
        Iterator it = vwb.m200339n(xdl0.m208399s(toolbar()), new w9j() { // from class: l.bi20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) instanceof ActionMenuItemView);
            }
        }).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) ((View) it.next());
            this.f40605q = textView;
            if (!TextUtils.isEmpty(textView.getText())) {
                this.f40605q.setTypeface(eqh0.m117752c(3));
                this.f40605q.setTextSize(18.0f);
                m62664L2();
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m62659E2(ggi.C17074a c17074a) {
        progressDismiss();
        if (c17074a == null) {
            return;
        }
        this.f40601m.m146050n0((NewMomentDraft) c17074a.f102512a);
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m62660F2(d30 d30Var) {
        progressDismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m62661H2(final d30 d30Var) {
        NewMomentDraft newMomentDraftNew_ = NewMomentDraft.new_();
        newMomentDraftNew_.images = this.f40601m.m146042f0();
        newMomentDraftNew_.text = this.f40602n.m218922n();
        if (this.f40598j == 1 && newMomentDraftNew_.images.size() > 0) {
            this.f40598j = 2;
            this.f40596h.put(Boolean.FALSE);
        } else if (this.f40598j == 2 && newMomentDraftNew_.images.size() == 0) {
            this.f40598j = 1;
            this.f40597i.put(Boolean.FALSE);
        }
        int i = this.f40598j;
        newMomentDraftNew_.type = i;
        if (i == 1) {
            this.f40594f.m125978p(newMomentDraftNew_);
            this.f40596h.put(Boolean.TRUE);
        } else if (i == 2) {
            this.f40595g.m125978p(newMomentDraftNew_);
            this.f40597i.put(Boolean.TRUE);
        }
        e51.m114742G(new Runnable() { // from class: l.th20
            @Override // java.lang.Runnable
            public final void run() {
                this.f170182a.m62660F2(d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: I2, reason: merged with bridge method [inline-methods] */
    public final boolean m62666v2(MenuItem menuItem) {
        if (isFinishing()) {
            return true;
        }
        Moment momentNew_ = Moment.new_();
        momentNew_.media = this.f40601m.m146042f0();
        momentNew_.value = this.f40602n.m218922n();
        momentNew_.location = this.f40602n.m218921m();
        oe40.m163818T(this.act, momentNew_, null);
        m62649q2(null);
        m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m62663K2(ggi<NewMomentDraft> ggiVar) {
        progress(R$string.f39001X1);
        duringCreated((C22306c) ggiVar.m125973k().compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.rh20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159334a.m62659E2((ggi.C17074a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L2 */
    public void m62664L2() {
        boolean z = !this.f40602n.m218923p() && this.f40601m.m146043g0();
        if (NullChecker.m81303a(this.f40603o)) {
            this.f40603o.setEnabled(z);
        }
        if (NullChecker.m81303a(this.f40605q)) {
            this.f40605q.setTextColor(z ? act().getResources().getColor(e1c0.f88770Y) : act().getResources().getColor(e1c0.f88771Z));
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m62665M2(final d30 d30Var) {
        progress(R$string.f38984U2);
        e51.m114774y(new Runnable() { // from class: l.sh20
            @Override // java.lang.Runnable
            public final void run() {
                this.f164510a.m62661H2(d30Var);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        this.f40602n.m218925s(this);
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40602n.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f40601m = new ki20(this);
        zi20 zi20Var = new zi20(this);
        this.f40602n = zi20Var;
        this.f40601m.mo51532C(zi20Var);
        this.f40601m.m146045i0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m62650r2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f40601m.m146047k0(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f40601m.m146043g0()) {
            new xvg(this).m211291j(R$string.f38911I1).m211290i(R$string.f39007Y1, new Runnable() { // from class: l.qh20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154423a.m62653y2();
                }
            }).m211289h(R$string.f39143s1, new Runnable() { // from class: l.uh20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176479a.m62655A2();
                }
            }).show();
        } else {
            m62649q2(new d30() { // from class: l.vh20
                @Override // p149l.d30
                public final void call() {
                    this.f181466a.m62656B2();
                }
            });
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem onMenuItemClickListener = menu.add(actionItemPadding(this.act.getString(R$string.f38995W1))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.yh20
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f198268a.m62657C2(menuItem);
            }
        });
        this.f40603o = onMenuItemClickListener;
        onMenuItemClickListener.setShowAsAction(2);
        m62664L2();
        pendChangeActionButtonTypeface();
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f40601m.m146048l0(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_images", this.f40601m.m146042f0());
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void pendChangeActionButtonTypeface() {
        xdl0.m208366b0(findViewById(R.id.content), new v9j() { // from class: l.zh20
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f203127a.m62658D2();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (!FeedModule.m60221F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.m81304b(getIntent())) {
                e51.m114765p(intent, getIntent());
            }
            intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 1);
            kjb0.m146187J(this.act, intent);
            m66873d2();
        }
        this.f40601m.m146049m0(getIntent(), bundle);
        setSwipeBackEnable(false);
        m62651s2();
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m62667w2() {
        super.onBackPressed();
    }
}
