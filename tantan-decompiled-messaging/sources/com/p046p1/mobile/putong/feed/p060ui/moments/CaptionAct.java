package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.cg4;
import p149l.d30;
import p149l.e51;
import p149l.kjb0;
import p149l.rol;
import p149l.sf4;

/* JADX INFO: loaded from: classes12.dex */
public class CaptionAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public sf4 f43625c;

    /* JADX INFO: renamed from: d */
    public cg4 f43626d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m66583X1(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent(act, (Class<?>) CaptionAct.class);
        intent.putExtra("images", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m66584Y1(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent(act, (Class<?>) CaptionAct.class);
        intent.putExtra("images", arrayList);
        intent.setType("image/*");
        intent.setAction("action_send_with_media");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m66585Z1() {
        super.onBackPressed();
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: a2 */
    private sf4 m66586a2() {
        if (NullChecker.m81303a(this.f43625c)) {
            return this.f43625c;
        }
        sf4 sf4Var = new sf4(this);
        this.f43625c = sf4Var;
        return sf4Var;
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: b2 */
    public final cg4 m66587b2() {
        if (NullChecker.m81303a(this.f43626d)) {
            return this.f43626d;
        }
        cg4 cg4Var = new cg4(this);
        this.f43626d = cg4Var;
        return cg4Var;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        if (NullChecker.m81303a(this.f43626d)) {
            this.f43626d.m106690u();
        }
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43626d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f43625c = m66586a2();
        cg4 cg4VarM66587b2 = m66587b2();
        this.f43626d = cg4VarM66587b2;
        this.f43625c.mo51532C(cg4VarM66587b2);
        this.f43625c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f43625c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m66586a2().m183790r0(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f43626d.m106674H(new d30() { // from class: l.qf4
            @Override // p149l.d30
            public final void call() {
                this.f154082a.m66585Z1();
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return m66587b2().m106675I(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f43625c.m183791s0(list);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f43625c.m183788o0(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f43625c.m183794x0(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_moments_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (!FeedModule.m60221F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.m81304b(getIntent())) {
                e51.m114765p(intent, getIntent());
            }
            intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 1);
            kjb0.m146187J(this, intent);
            m66873d2();
        }
        super.preCreateView(bundle);
    }
}
