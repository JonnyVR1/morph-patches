package com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.FateRadarSearchConditions;
import p153l.tfw;
import p153l.ufw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarFilterPairedUserAct extends PutongCoreMvpAct<tfw, ufw> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m42918a2(Context context, String str, FateRadarSearchConditions fateRadarSearchConditions) {
        Intent intent = new Intent(context, (Class<?>) LoveRadarFilterPairedUserAct.class);
        intent.putExtra("data_key", fateRadarSearchConditions);
        intent.putExtra("targetPage", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public tfw mo30949Y1() {
        return new tfw(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public ufw mo30950Z1() {
        return new ufw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return super.pageId();
    }
}
