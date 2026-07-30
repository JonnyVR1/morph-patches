package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e51;
import l.rol;
import org.jetbrains.annotations.NotNull;
import p007l.cg4;
import p007l.kjb0;
import p007l.sf4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CaptionAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public sf4 f5086c;

    /* JADX INFO: renamed from: d */
    public cg4 f5087d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m7774X1(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent((Context) act, (Class<?>) CaptionAct.class);
        intent.putExtra("images", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m7775Y1(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent((Context) act, (Class<?>) CaptionAct.class);
        intent.putExtra("images", arrayList);
        intent.setType("image/*");
        intent.setAction("action_send_with_media");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m7776Z1() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: a2 */
    private sf4 m7777a2() {
        if (NullChecker.a(this.f5086c)) {
            return this.f5086c;
        }
        sf4 sf4Var = new sf4(this);
        this.f5086c = sf4Var;
        return sf4Var;
    }

    @MainThread
    @NotNull
    /* JADX INFO: renamed from: b2 */
    public final cg4 m7778b2() {
        if (NullChecker.a(this.f5087d)) {
            return this.f5087d;
        }
        cg4 cg4Var = new cg4(this);
        this.f5087d = cg4Var;
        return cg4Var;
    }

    public void finish() {
        if (NullChecker.a(this.f5087d)) {
            this.f5087d.m9165u();
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5087d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5086c = m7777a2();
        cg4 cg4VarM7778b2 = m7778b2();
        this.f5087d = cg4VarM7778b2;
        this.f5086c.C(cg4VarM7778b2);
        this.f5086c.Z();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f5086c.m14132a0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m7777a2().m14141r0(i, i2, intent);
    }

    public void onBackPressed() {
        this.f5087d.m9148H(new d30() { // from class: l.qf4
            public final void call() {
                this.f12221a.m7776Z1();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return m7778b2().m9149I(menu);
    }

    public void onPickImagesResult(List<Media> list) {
        this.f5086c.m14142s0(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Bundle bundle) {
        super/*android.app.Activity*/.onRestoreInstanceState(bundle);
        this.f5086c.m14139o0(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f5086c.m14145x0(bundle);
    }

    public String pageId() {
        return "p_edit_moments_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        if (!FeedModule.m1139F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.b(getIntent())) {
                e51.p(intent, getIntent());
            }
            intent.putExtra("after_signin", 1);
            kjb0.m11446J(this, intent);
            finish();
        }
        super.preCreateView(bundle);
    }
}
