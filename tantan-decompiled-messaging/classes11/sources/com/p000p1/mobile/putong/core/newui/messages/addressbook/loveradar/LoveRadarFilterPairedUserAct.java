package com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.FateRadarSearchConditions;
import java.io.Serializable;
import p009l.vdw;
import p009l.wdw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveRadarFilterPairedUserAct extends PutongCoreMvpAct<vdw, wdw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m6045Z1(Context context, String str, FateRadarSearchConditions fateRadarSearchConditions) {
        Intent intent = new Intent(context, (Class<?>) LoveRadarFilterPairedUserAct.class);
        intent.putExtra("data_key", (Serializable) fateRadarSearchConditions);
        intent.putExtra("targetPage", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public vdw m6046X1() {
        return new vdw(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wdw m6047Y1() {
        return new wdw(this);
    }

    public String pageId() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.pageId();
    }
}
