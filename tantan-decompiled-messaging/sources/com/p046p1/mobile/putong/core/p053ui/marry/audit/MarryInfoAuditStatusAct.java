package com.p046p1.mobile.putong.core.p053ui.marry.audit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.j760;
import p149l.jzw;
import p149l.qzw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryInfoAuditStatusAct extends PutongCoreMvpAct<jzw, qzw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m47401Z1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MarryInfoAuditStatusAct.class);
        intent.putExtra("page_from", str);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static void m47402c2(Intent intent) {
        intent.putExtra("open_home", true);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jzw mo29951X1() {
        return new jzw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public qzw mo29952Y1() {
        return new qzw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        String stringExtra = getIntent().getStringExtra("page_from");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "mode_switching";
        }
        this.pageHelper.m109040p(j760.m140076a("source", stringExtra));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_marriage_intro";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        setStatusBarColor(0);
    }
}
