package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import p147v.VImage;
import p147v.VText;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpChatButton extends ExpOperationButton {
    public ExpChatButton(@NonNull Context context) {
        super(context);
        m50824b();
    }

    /* JADX INFO: renamed from: b */
    public void m50824b() {
        this.f33159b.setText("立即聊天");
        this.f33159b.setTextColor(-1);
        boolean zM194665L3 = upa.m194665L3();
        VImage vImage = this.f33158a;
        if (zM194665L3) {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.f189175Al));
            setBackgroundResource(x2c0.f190243in);
        } else {
            vImage.setImageDrawable(getResources().getDrawable(x2c0.f189175Al));
            setBackgroundResource(x2c0.f190243in);
        }
    }

    public void setStyle(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton.ProfileButtonType profileButtonType2 = ProfileButton.ProfileButtonType.Chat;
        VText vText = this.f33159b;
        if (profileButtonType == profileButtonType2) {
            vText.setText("");
            boolean zM194665L3 = upa.m194665L3();
            VImage vImage = this.f33158a;
            if (zM194665L3) {
                vImage.setImageDrawable(getResources().getDrawable(x2c0.f189239Cl));
                setBackgroundResource(x2c0.f189207Bl);
                return;
            } else {
                vImage.setImageDrawable(getResources().getDrawable(x2c0.f189175Al));
                setBackgroundResource(x2c0.f190243in);
                return;
            }
        }
        vText.setText("立即聊天");
        boolean zM194665L4 = upa.m194665L3();
        VImage vImage2 = this.f33158a;
        if (zM194665L4) {
            vImage2.setImageDrawable(getResources().getDrawable(x2c0.f189175Al));
            setBackgroundResource(x2c0.f190243in);
        } else {
            vImage2.setImageDrawable(getResources().getDrawable(x2c0.f189175Al));
            setBackgroundResource(x2c0.f190243in);
        }
    }

    public ExpChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50824b();
    }

    public ExpChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50824b();
    }
}
