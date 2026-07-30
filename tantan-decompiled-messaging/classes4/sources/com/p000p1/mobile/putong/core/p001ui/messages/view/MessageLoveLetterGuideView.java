package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LoveLetterContent;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.io.IOException;
import l.a1c0;
import l.j760;
import l.qsz;
import l.s6z;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageLoveLetterGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f252a;

    /* JADX INFO: renamed from: b */
    public VText f253b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f254c;

    /* JADX INFO: renamed from: d */
    public User f255d;

    /* JADX INFO: renamed from: e */
    public LoveLetterContent f256e;

    /* JADX INFO: renamed from: f */
    public String f257f;

    public MessageLoveLetterGuideView(@NonNull Context context) {
        super(context);
        this.f256e = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m360b(View view) {
        s6z.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m361c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m362d() {
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m363e(qsz qszVar, LoveLetterContent loveLetterContent, User user, View view) {
        m365g(false, qszVar, loveLetterContent);
        CoreModule.P().a().C1(m361c(), ((DbObject) user).id);
    }

    /* JADX INFO: renamed from: f */
    public void m364f(final User user, Message message, final qsz qszVar) {
        this.f255d = user;
        if (!TextUtils.equals(message.localExtraInfo, this.f257f)) {
            try {
                this.f256e = (LoveLetterContent) LoveLetterContent.JSON_ADAPTER.parse(message.localExtraInfo);
            } catch (IOException unused) {
            }
            this.f257f = message.localExtraInfo;
        }
        LoveLetterContent loveLetterContent = this.f256e;
        if (loveLetterContent == null) {
            xdl0.M(this, false);
            return;
        }
        this.f252a.setText(loveLetterContent.title);
        this.f253b.setText(this.f256e.subTitle);
        this.f254c.setText(String.format("给%s写情书", user.isFemale() ? "她" : "他"));
        xdl0.M(this, true);
        final LoveLetterContent loveLetterContent2 = this.f256e;
        xdl0.E0(this.f254c, new View.OnClickListener() { // from class: l.r6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18401a.m363e(qszVar, loveLetterContent2, user, view);
            }
        });
        m365g(true, qszVar, this.f256e);
    }

    /* JADX INFO: renamed from: g */
    public final void m365g(boolean z, qsz qszVar, LoveLetterContent loveLetterContent) {
        if (!z) {
            zvf0.u("e_love_letter_guide", "p_chat_view", new j760[]{vwb.Y("to_uid", ((DbObject) this.f255d).id), vwb.Y("trigger_type", Integer.valueOf(loveLetterContent.triggerType))});
        } else {
            if (qszVar.a("e_love_letter_guide")) {
                return;
            }
            qszVar.b("e_love_letter_guide");
            zvf0.A("e_love_letter_guide", "p_chat_view", new j760[]{vwb.Y("to_uid", ((DbObject) this.f255d).id), vwb.Y("trigger_type", Integer.valueOf(loveLetterContent.triggerType))});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m360b(this);
        if (ura.e().d().I4()) {
            this.f252a.setTextColor(getResources().getColor(a1c0.g));
            this.f253b.setTextColor(getResources().getColor(a1c0.i));
            this.f254c.setTextColor(getResources().getColor(a1c0.j));
        }
        m362d();
    }

    public MessageLoveLetterGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f256e = null;
    }

    public MessageLoveLetterGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f256e = null;
    }
}
