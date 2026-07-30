package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import l.upa;
import l.x2c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpChatButton extends ExpOperationButton {
    public ExpChatButton(@NonNull Context context) {
        super(context);
        m1270b();
    }

    /* JADX INFO: renamed from: b */
    public void m1270b() {
        this.f981b.setText("立即聊天");
        this.f981b.setTextColor(-1);
        boolean zL3 = upa.L3();
        VImage vImage = this.f980a;
        if (zL3) {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.Al));
            setBackgroundResource(x2c0.in);
        } else {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.Al));
            setBackgroundResource(x2c0.in);
        }
    }

    public void setStyle(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton.ProfileButtonType profileButtonType2 = ProfileButton.ProfileButtonType.Chat;
        VText vText = this.f981b;
        if (profileButtonType == profileButtonType2) {
            vText.setText("");
            boolean zL3 = upa.L3();
            VImage vImage = this.f980a;
            if (zL3) {
                vImage.setImageDrawable(getResources().getDrawable(x2c0.Cl));
                setBackgroundResource(x2c0.Bl);
                return;
            } else {
                vImage.setImageDrawable(getResources().getDrawable(x2c0.Al));
                setBackgroundResource(x2c0.in);
                return;
            }
        }
        vText.setText("立即聊天");
        boolean zL4 = upa.L3();
        VImage vImage2 = this.f980a;
        if (zL4) {
            vImage2.setImageDrawable(getResources().getDrawable(x2c0.Al));
            setBackgroundResource(x2c0.in);
        } else {
            vImage2.setImageDrawable(getResources().getDrawable(x2c0.Al));
            setBackgroundResource(x2c0.in);
        }
    }

    public ExpChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1270b();
    }

    public ExpChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1270b();
    }
}
