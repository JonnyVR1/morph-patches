package com.p000p1.mobile.putong.core.newui.loveletter.search;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.rzb0;
import p009l.fcw;
import p009l.xbw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterSearchAct extends PutongMvpAct<xbw, fcw> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m3693Y1(Context context) {
        return new Intent(context, (Class<?>) LoveLetterSearchAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public xbw m3694V1() {
        return new xbw(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public fcw m3695X1() {
        return new fcw(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        ((Act) this).act.overridePendingTransition(rzb0.z, rzb0.B);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    public String pageId() {
        return "p_search_result";
    }
}
