package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import l.a1c0;
import l.c3c0;
import l.f1q;
import l.ura;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ItemBirthdayTip extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f4009a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f4010b;

    public ItemBirthdayTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5786a(View view) {
        f1q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5787b(User user) {
        this.f4010b.setText(String.format("%s今天生日", (user == null || user.isFemale()) ? "她" : "他"));
        if (ura.e().d().I4()) {
            this.f4009a.setImageResource(c3c0.v5);
            return;
        }
        boolean zO5 = CoreModule.P().i().o5();
        VImage vImage = this.f4009a;
        if (zO5) {
            vImage.setImageResource(c3c0.u5);
        } else {
            vImage.setImageResource(c3c0.L2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5786a(this);
        if (ura.e().d().I4()) {
            this.f4010b.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemBirthdayTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemBirthdayTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ItemBirthdayTip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
