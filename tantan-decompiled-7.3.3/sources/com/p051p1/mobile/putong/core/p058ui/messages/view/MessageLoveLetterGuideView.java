package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveLetterContent;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.io.IOException;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.n100;
import p153l.pfz;

/* JADX INFO: loaded from: classes4.dex */
public class MessageLoveLetterGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f33278a;

    /* JADX INFO: renamed from: b */
    public VText f33279b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f33280c;

    /* JADX INFO: renamed from: d */
    public User f33281d;

    /* JADX INFO: renamed from: e */
    public LoveLetterContent f33282e;

    /* JADX INFO: renamed from: f */
    public String f33283f;

    public MessageLoveLetterGuideView(@NonNull Context context) {
        super(context);
        this.f33282e = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m51121b(View view) {
        pfz.m172168a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m51122c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m51123d() {
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m51124e(n100 n100Var, LoveLetterContent loveLetterContent, User user, View view) {
        m51126g(false, n100Var, loveLetterContent);
        CoreModule.m30933P().m143405a().mo180304C1(m51122c(), user.f56859id);
    }

    /* JADX INFO: renamed from: f */
    public void m51125f(final User user, Message message, final n100 n100Var) {
        this.f33281d = user;
        if (!TextUtils.equals(message.localExtraInfo, this.f33283f)) {
            try {
                this.f33282e = LoveLetterContent.JSON_ADAPTER.parse(message.localExtraInfo);
            } catch (IOException unused) {
            }
            this.f33283f = message.localExtraInfo;
        }
        LoveLetterContent loveLetterContent = this.f33282e;
        if (loveLetterContent == null) {
            bnl0.m105524M(this, false);
            return;
        }
        this.f33278a.setText(loveLetterContent.title);
        this.f33279b.setText(this.f33282e.subTitle);
        this.f33280c.setText(String.format("给%s写情书", user.isFemale() ? "她" : "他"));
        bnl0.m105524M(this, true);
        final LoveLetterContent loveLetterContent2 = this.f33282e;
        bnl0.m105509E0(this.f33280c, new View.OnClickListener() { // from class: l.ofz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147172a.m51124e(n100Var, loveLetterContent2, user, view);
            }
        });
        m51126g(true, n100Var, this.f33282e);
    }

    /* JADX INFO: renamed from: g */
    public final void m51126g(boolean z, n100 n100Var, LoveLetterContent loveLetterContent) {
        if (!z) {
            i4g0.m138523u("e_love_letter_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("to_uid", this.f33281d.f56859id), jyb.m147494Y("trigger_type", Integer.valueOf(loveLetterContent.triggerType)));
        } else {
            if (n100Var.m161054a("e_love_letter_guide")) {
                return;
            }
            n100Var.m161055b("e_love_letter_guide");
            i4g0.m138492A("e_love_letter_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("to_uid", this.f33281d.f56859id), jyb.m147494Y("trigger_type", Integer.valueOf(loveLetterContent.triggerType)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51121b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f33278a.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f33279b.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f33280c.setTextColor(getResources().getColor(g9c0.f102820j));
        }
        m51123d();
    }

    public MessageLoveLetterGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33282e = null;
    }

    public MessageLoveLetterGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33282e = null;
    }
}
