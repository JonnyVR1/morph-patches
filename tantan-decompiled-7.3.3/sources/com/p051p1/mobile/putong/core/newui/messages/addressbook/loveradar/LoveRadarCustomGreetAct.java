package com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.GreetingItem;
import p153l.nfw;
import p153l.qfw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarCustomGreetAct extends PutongCoreMvpAct<nfw, qfw> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m42915a2(Context context, GreetingItem greetingItem) {
        Intent intent = new Intent(context, (Class<?>) LoveRadarCustomGreetAct.class);
        intent.putExtra("data_key", greetingItem);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public nfw mo30949Y1() {
        return new nfw(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public qfw mo30950Z1() {
        return new qfw(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_love_radar_sayhi";
    }
}
