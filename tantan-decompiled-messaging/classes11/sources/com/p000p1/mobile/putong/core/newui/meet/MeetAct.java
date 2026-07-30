package com.p000p1.mobile.putong.core.newui.meet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.j760;
import l.vwb;
import l.xma;
import p009l.k7y;
import p009l.z5y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetAct extends PutongMvpAct<z5y, k7y> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m4580Y1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MeetAct.class);
        intent.putExtra("from", str);
        intent.putExtra("select_tab", str2);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public z5y m4581V1() {
        return new z5y(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public k7y m4582X1() {
        return new k7y(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((k7y) ((PutongMvpAct) this).d).inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(xma.L3()))});
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (((z5y) ((PutongMvpAct) this).c).m25623k0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
    }

    public String pageId() {
        return "p_meet";
    }
}
