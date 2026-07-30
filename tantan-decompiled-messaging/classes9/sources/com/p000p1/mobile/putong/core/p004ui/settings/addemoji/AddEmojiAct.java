package com.p000p1.mobile.putong.core.p004ui.settings.addemoji;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.j760;
import p006l.rzb0;
import p006l.u80;
import p006l.v80;
import p006l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AddEmojiAct extends PutongMvpAct<u80, v80> {

    /* JADX INFO: renamed from: e */
    public String f5677e;

    /* JADX INFO: renamed from: f */
    public boolean f5678f = false;

    /* JADX INFO: renamed from: g */
    public boolean f5679g = false;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m8599Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AddEmojiAct.class);
        intent.putExtra("extra_show_anim", false);
        intent.putExtra("extra_from_other_people", false);
        intent.putExtra("edit_emoji_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m8600a2(Context context, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) AddEmojiAct.class);
        intent.putExtra("extra_show_anim", z);
        intent.putExtra("extra_from_other_people", z2);
        intent.putExtra("edit_emoji_from", str);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public u80 mo571V1() {
        return new u80(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public v80 mo572X1() {
        return new v80(this);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m8603d2() {
        if (this.f5678f && NullChecker.a(((Act) this).act.toolbar())) {
            ((Act) this).act.toolbar().setNavigationIcon(x2c0.f26667f6);
        }
    }

    public void finish() {
        super.finish();
        if (this.f5678f) {
            overridePendingTransition(0, rzb0.f20927A);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((v80) this.f1162d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongMvpAct, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        ((u80) this.f1161c).m25113a0();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return ((u80) this.f1161c).m25116m0(menu);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_edit_my_emoji";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f5678f = getIntent().getBooleanExtra("extra_show_anim", false);
        this.f5679g = getIntent().getBooleanExtra("extra_from_other_people", false);
        this.f5677e = getIntent().getStringExtra("edit_emoji_from");
        ((u80) this.f1161c).m25118o0(this.f5679g);
        if (NullChecker.a(this.f5677e)) {
            this.pageHelper.p(new j760[]{j760.a("emoji_show_from", this.f5677e)});
        }
        e51.G(new Runnable() { // from class: l.p80
            @Override // java.lang.Runnable
            public final void run() {
                this.f18624a.m8603d2();
            }
        });
    }
}
