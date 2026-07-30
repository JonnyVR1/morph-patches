package com.p051p1.mobile.putong.core.newui.loveletter.search;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.dew;
import p153l.vdw;
import p153l.x7c0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterSearchAct extends PutongMvpAct<vdw, dew> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m40622Z1(Context context) {
        return new Intent(context, (Class<?>) LoveLetterSearchAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public vdw mo29671X1() {
        return new vdw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dew mo29672Y1() {
        return new dew(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        this.act.overridePendingTransition(x7c0.f192711z, x7c0.f192685B);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_search_result";
    }
}
