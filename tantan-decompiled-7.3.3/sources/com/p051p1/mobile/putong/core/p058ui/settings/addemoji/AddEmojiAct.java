package com.p051p1.mobile.putong.core.p058ui.settings.addemoji;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.dbc0;
import p153l.l51;
import p153l.pf60;
import p153l.q80;
import p153l.r80;
import p153l.x7c0;

/* JADX INFO: loaded from: classes12.dex */
public class AddEmojiAct extends PutongMvpAct<q80, r80> {

    /* JADX INFO: renamed from: e */
    public String f36744e;

    /* JADX INFO: renamed from: f */
    public boolean f36745f = false;

    /* JADX INFO: renamed from: g */
    public boolean f36746g = false;

    /* JADX INFO: renamed from: a2 */
    public static Intent m56413a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AddEmojiAct.class);
        intent.putExtra("extra_show_anim", false);
        intent.putExtra("extra_from_other_people", false);
        intent.putExtra("edit_emoji_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m56414b2(Context context, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) AddEmojiAct.class);
        intent.putExtra("extra_show_anim", z);
        intent.putExtra("extra_from_other_people", z2);
        intent.putExtra("edit_emoji_from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public q80 mo29671X1() {
        return new q80(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public r80 mo29672Y1() {
        return new r80(this);
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m56417e2() {
        if (this.f36745f && NullChecker.m82486a(this.act.toolbar())) {
            this.act.toolbar().setNavigationIcon(dbc0.f87012g6);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        if (this.f36745f) {
            overridePendingTransition(0, x7c0.f192684A);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((r80) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((q80) this.f17891c).mo40473a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((q80) this.f17891c).m175723m0(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_my_emoji";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f36745f = getIntent().getBooleanExtra("extra_show_anim", false);
        this.f36746g = getIntent().getBooleanExtra("extra_from_other_people", false);
        this.f36744e = getIntent().getStringExtra("edit_emoji_from");
        ((q80) this.f17891c).m175725o0(this.f36746g);
        if (NullChecker.m82486a(this.f36744e)) {
            this.pageHelper.m152781p(pf60.m172085a("emoji_show_from", this.f36744e));
        }
        l51.m152887G(new Runnable() { // from class: l.l80
            @Override // java.lang.Runnable
            public final void run() {
                this.f130403a.m56417e2();
            }
        });
    }
}
