package com.p046p1.mobile.putong.core.p053ui.settings.addemoji;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.e51;
import p149l.j760;
import p149l.rzb0;
import p149l.u80;
import p149l.v80;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
public class AddEmojiAct extends PutongMvpAct<u80, v80> {

    /* JADX INFO: renamed from: e */
    public String f35896e;

    /* JADX INFO: renamed from: f */
    public boolean f35897f = false;

    /* JADX INFO: renamed from: g */
    public boolean f35898g = false;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m55230Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) AddEmojiAct.class);
        intent.putExtra("extra_show_anim", false);
        intent.putExtra("extra_from_other_people", false);
        intent.putExtra("edit_emoji_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m55231a2(Context context, boolean z, boolean z2, String str) {
        Intent intent = new Intent(context, (Class<?>) AddEmojiAct.class);
        intent.putExtra("extra_show_anim", z);
        intent.putExtra("extra_from_other_people", z2);
        intent.putExtra("edit_emoji_from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public u80 mo28672V1() {
        return new u80(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public v80 mo28673X1() {
        return new v80(this);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m55234d2() {
        if (this.f35897f && NullChecker.m81303a(this.act.toolbar())) {
            this.act.toolbar().setNavigationIcon(x2c0.f190131f6);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        if (this.f35897f) {
            overridePendingTransition(0, rzb0.f161627A);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((v80) this.f17173d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((u80) this.f17172c).mo39470a0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return ((u80) this.f17172c).m192177m0(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_my_emoji";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f35897f = getIntent().getBooleanExtra("extra_show_anim", false);
        this.f35898g = getIntent().getBooleanExtra("extra_from_other_people", false);
        this.f35896e = getIntent().getStringExtra("edit_emoji_from");
        ((u80) this.f17172c).m192179o0(this.f35898g);
        if (NullChecker.m81303a(this.f35896e)) {
            this.pageHelper.m109040p(j760.m140076a("emoji_show_from", this.f35896e));
        }
        e51.m114742G(new Runnable() { // from class: l.p80
            @Override // java.lang.Runnable
            public final void run() {
                this.f147556a.m55234d2();
            }
        });
    }
}
