package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import p151v.VImage;
import p151v.VText;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpChatButton extends ExpOperationButton {
    public ExpChatButton(@NonNull Context context) {
        super(context);
        m52007b();
    }

    /* JADX INFO: renamed from: b */
    public void m52007b() {
        this.f34007b.setText("立即聊天");
        this.f34007b.setTextColor(-1);
        boolean zM131596L3 = gra.m131596L3();
        VImage vImage = this.f34006a;
        if (zM131596L3) {
            vImage.setImageDrawable(getResources().getDrawable(dbc0.f87290om));
            setBackgroundResource(dbc0.f86704Wn);
        } else {
            vImage.setImageDrawable(getResources().getDrawable(dbc0.f87290om));
            setBackgroundResource(dbc0.f86704Wn);
        }
    }

    public void setStyle(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton.ProfileButtonType profileButtonType2 = ProfileButton.ProfileButtonType.Chat;
        VText vText = this.f34007b;
        if (profileButtonType == profileButtonType2) {
            vText.setText("");
            boolean zM131596L3 = gra.m131596L3();
            VImage vImage = this.f34006a;
            if (zM131596L3) {
                vImage.setImageDrawable(getResources().getDrawable(dbc0.f87356qm));
                setBackgroundResource(dbc0.f87323pm);
                return;
            } else {
                vImage.setImageDrawable(getResources().getDrawable(dbc0.f87290om));
                setBackgroundResource(dbc0.f86704Wn);
                return;
            }
        }
        vText.setText("立即聊天");
        boolean zM131596L4 = gra.m131596L3();
        VImage vImage2 = this.f34006a;
        if (zM131596L4) {
            vImage2.setImageDrawable(getResources().getDrawable(dbc0.f87290om));
            setBackgroundResource(dbc0.f86704Wn);
        } else {
            vImage2.setImageDrawable(getResources().getDrawable(dbc0.f87290om));
            setBackgroundResource(dbc0.f86704Wn);
        }
    }

    public ExpChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52007b();
    }

    public ExpChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52007b();
    }
}
