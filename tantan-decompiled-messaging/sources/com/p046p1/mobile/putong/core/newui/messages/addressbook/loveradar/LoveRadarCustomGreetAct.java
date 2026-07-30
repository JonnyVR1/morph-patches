package com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.GreetingItem;
import p149l.pdw;
import p149l.sdw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarCustomGreetAct extends PutongCoreMvpAct<pdw, sdw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m41904Z1(Context context, GreetingItem greetingItem) {
        Intent intent = new Intent(context, (Class<?>) LoveRadarCustomGreetAct.class);
        intent.putExtra("data_key", greetingItem);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public pdw mo29951X1() {
        return new pdw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public sdw mo29952Y1() {
        return new sdw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_love_radar_sayhi";
    }
}
