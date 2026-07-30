package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c2q;
import p149l.qib0;
import p149l.rw6;
import p149l.ura;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatUnlockLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NewTalkProgressView f30881a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30882b;

    /* JADX INFO: renamed from: c */
    public TextView f30883c;

    /* JADX INFO: renamed from: d */
    public VText f30884d;

    public ItemChatUnlockLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48088a(View view) {
        c2q.m104917a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MessagesAct m48089b() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m48090c(User user, Message message) {
        int i = 0;
        if (NullChecker.m81303a(m48089b().f31640f.f96919k) && m48089b().f31640f.f96919k.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
            qib0.f154691G.m102341Q0(this.f30882b, rw6.m181386b(user).profileSmall());
        } else {
            CoreModule.m29935P().m94658i().mo158474y2(this.f30882b, rw6.m181385a(user).profileSmall(), 0);
        }
        if (CoreModule.m29935P().m94658i().mo158367e1(message.cid, message.f56011id)) {
            i = 25;
        } else if (CoreModule.m29935P().m94658i().mo158439r3(message.cid, message.f56011id)) {
            i = 50;
        } else if (CoreModule.m29935P().m94658i().mo158406l4(message.cid, message.f56011id)) {
            i = 75;
        }
        this.f30883c.setText(String.format("已解锁%s%%", i + ""));
        this.f30881a.setProgress(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48088a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30883c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30884d.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemChatUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
