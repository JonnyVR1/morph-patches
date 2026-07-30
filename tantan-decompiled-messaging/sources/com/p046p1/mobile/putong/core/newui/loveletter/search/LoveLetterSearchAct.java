package com.p046p1.mobile.putong.core.newui.loveletter.search;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.fcw;
import p149l.rzb0;
import p149l.xbw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterSearchAct extends PutongMvpAct<xbw, fcw> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m39619Y1(Context context) {
        return new Intent(context, (Class<?>) LoveLetterSearchAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public xbw mo28672V1() {
        return new xbw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public fcw mo28673X1() {
        return new fcw(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        this.act.overridePendingTransition(rzb0.f161654z, rzb0.f161628B);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_search_result";
    }
}
