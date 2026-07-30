package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.bh4;
import p153l.crl;
import p153l.l51;
import p153l.orb0;
import p153l.rg4;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class CaptionAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public rg4 f44473c;

    /* JADX INFO: renamed from: d */
    public bh4 f44474d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m67766Y1(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent(act, (Class<?>) CaptionAct.class);
        intent.putExtra("images", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m67767Z1(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent(act, (Class<?>) CaptionAct.class);
        intent.putExtra("images", arrayList);
        intent.setType("image/*");
        intent.setAction("action_send_with_media");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m67768a2() {
        super.onBackPressed();
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: b2 */
    private rg4 m67769b2() {
        if (NullChecker.m82486a(this.f44473c)) {
            return this.f44473c;
        }
        rg4 rg4Var = new rg4(this);
        this.f44473c = rg4Var;
        return rg4Var;
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: c2 */
    public final bh4 m67770c2() {
        if (NullChecker.m82486a(this.f44474d)) {
            return this.f44474d;
        }
        bh4 bh4Var = new bh4(this);
        this.f44474d = bh4Var;
        return bh4Var;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        if (NullChecker.m82486a(this.f44474d)) {
            this.f44474d.m104323u();
        }
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44474d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f44473c = m67769b2();
        bh4 bh4VarM67770c2 = m67770c2();
        this.f44474d = bh4VarM67770c2;
        this.f44473c.mo52715C(bh4VarM67770c2);
        this.f44473c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f44473c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m67769b2().m181327r0(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f44474d.m104307H(new x20() { // from class: l.pg4
            @Override // p153l.x20
            public final void call() {
                this.f152232a.m67768a2();
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return m67770c2().m104308I(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f44473c.m181328s0(list);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f44473c.m181325o0(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f44473c.m181331x0(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_moments_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (!FeedModule.m61405F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.m82487b(getIntent())) {
                l51.m152910p(intent, getIntent());
            }
            intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 1);
            orb0.m168881J(this, intent);
            m68056e2();
        }
        super.preCreateView(bundle);
    }
}
