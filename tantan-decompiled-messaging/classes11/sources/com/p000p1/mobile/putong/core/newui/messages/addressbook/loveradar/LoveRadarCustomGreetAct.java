package com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.GreetingItem;
import java.io.Serializable;
import p009l.pdw;
import p009l.sdw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveRadarCustomGreetAct extends PutongCoreMvpAct<pdw, sdw> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m6040Z1(Context context, GreetingItem greetingItem) {
        Intent intent = new Intent(context, (Class<?>) LoveRadarCustomGreetAct.class);
        intent.putExtra("data_key", (Serializable) greetingItem);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public pdw m6041X1() {
        return new pdw(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public sdw m6042Y1() {
        return new sdw(this);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
    }

    public String pageId() {
        return "p_love_radar_sayhi";
    }
}
