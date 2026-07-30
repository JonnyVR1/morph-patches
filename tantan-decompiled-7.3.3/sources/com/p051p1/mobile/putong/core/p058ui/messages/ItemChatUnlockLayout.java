package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.c4q;
import p153l.g9c0;
import p153l.gta;
import p153l.uqb0;
import p153l.ux6;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatUnlockLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NewTalkProgressView f31729a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31730b;

    /* JADX INFO: renamed from: c */
    public TextView f31731c;

    /* JADX INFO: renamed from: d */
    public VText f31732d;

    public ItemChatUnlockLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49271a(View view) {
        c4q.m107956a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MessagesAct m49272b() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m49273c(User user, Message message) {
        int i = 0;
        if (NullChecker.m82486a(m49272b().f32488f.f82482k) && m49272b().f32488f.f82482k.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
            uqb0.f180374G.m127125Q0(this.f31730b, ux6.m198404b(user).profileSmall());
        } else {
            CoreModule.m30933P().m143412i().mo180566y2(this.f31730b, ux6.m198403a(user).profileSmall(), 0);
        }
        if (CoreModule.m30933P().m143412i().mo180459e1(message.cid, message.f56859id)) {
            i = 25;
        } else if (CoreModule.m30933P().m143412i().mo180531r3(message.cid, message.f56859id)) {
            i = 50;
        } else if (CoreModule.m30933P().m143412i().mo180498l4(message.cid, message.f56859id)) {
            i = 75;
        }
        this.f31731c.setText(String.format("已解锁%s%%", i + ""));
        this.f31729a.setProgress(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49271a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31731c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31732d.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemChatUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
