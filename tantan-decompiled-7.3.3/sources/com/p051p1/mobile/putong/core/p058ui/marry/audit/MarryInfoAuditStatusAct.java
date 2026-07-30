package com.p051p1.mobile.putong.core.p058ui.marry.audit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.i2x;
import p153l.p2x;
import p153l.pf60;

/* JADX INFO: loaded from: classes3.dex */
public class MarryInfoAuditStatusAct extends PutongCoreMvpAct<i2x, p2x> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m48584a2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MarryInfoAuditStatusAct.class);
        intent.putExtra("page_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static void m48585d2(Intent intent) {
        intent.putExtra("open_home", true);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public i2x mo30949Y1() {
        return new i2x(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public p2x mo30950Z1() {
        return new p2x(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("page_from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "mode_switching";
        }
        this.pageHelper.m152781p(pf60.m172085a("source", stringExtra));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_marriage_intro";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setStatusBarColor(0);
    }
}
