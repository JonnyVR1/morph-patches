package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p153l.f3q;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemBirthdayTip extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f25973a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f25974b;

    public ItemBirthdayTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m42673a(View view) {
        f3q.m123773a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m42674b(User user) {
        this.f25974b.setText(String.format("%s今天生日", (user == null || user.isFemale()) ? "她" : "他"));
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f25973a.setImageResource(ibc0.f114162v5);
            return;
        }
        boolean zMo180516o5 = CoreModule.m30933P().m143412i().mo180516o5();
        VImage vImage = this.f25973a;
        if (zMo180516o5) {
            vImage.setImageResource(ibc0.f114153u5);
        } else {
            vImage.setImageResource(ibc0.f113844L2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42673a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f25974b.setTextColor(getResources().getColor(g9c0.f102819i));
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
