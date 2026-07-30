package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p149l.a1c0;
import p149l.c3c0;
import p149l.f1q;
import p149l.ura;

/* JADX INFO: loaded from: classes11.dex */
public class ItemBirthdayTip extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f25231a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f25232b;

    public ItemBirthdayTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m41662a(View view) {
        f1q.m119143a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m41663b(User user) {
        this.f25232b.setText(String.format("%s今天生日", (user == null || user.isFemale()) ? "她" : "他"));
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25231a.setImageResource(c3c0.f78887v5);
            return;
        }
        boolean zMo158424o5 = CoreModule.m29935P().m94658i().mo158424o5();
        VImage vImage = this.f25231a;
        if (zMo158424o5) {
            vImage.setImageResource(c3c0.f78878u5);
        } else {
            vImage.setImageResource(c3c0.f78569L2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41662a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25232b.setTextColor(getResources().getColor(a1c0.f67155i));
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
