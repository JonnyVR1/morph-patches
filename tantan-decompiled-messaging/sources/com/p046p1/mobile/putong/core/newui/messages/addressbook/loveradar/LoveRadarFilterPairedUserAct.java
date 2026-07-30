package com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.FateRadarSearchConditions;
import p149l.vdw;
import p149l.wdw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarFilterPairedUserAct extends PutongCoreMvpAct<vdw, wdw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m41907Z1(Context context, String str, FateRadarSearchConditions fateRadarSearchConditions) {
        Intent intent = new Intent(context, (Class<?>) LoveRadarFilterPairedUserAct.class);
        intent.putExtra("data_key", fateRadarSearchConditions);
        intent.putExtra("targetPage", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public vdw mo29951X1() {
        return new vdw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wdw mo29952Y1() {
        return new wdw(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return super.pageId();
    }
}
