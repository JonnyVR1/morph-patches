package com.p000p1.mobile.putong.live.livingroom.voice.membermanager.settlein;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MemberManagerSettleInHeaderItemIView extends VText {
    public MemberManagerSettleInHeaderItemIView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public void m8876l(int i, int i2) {
        String str;
        if (i == 1) {
            str = "人已入驻";
        } else if (i != 2) {
            str = i != 3 ? "人在线" : "个上麦申请待处理";
        } else {
            str = "个入驻申请待处理";
        }
        setText(i2 + str);
    }

    public MemberManagerSettleInHeaderItemIView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MemberManagerSettleInHeaderItemIView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
