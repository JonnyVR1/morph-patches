package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LoveLetterContent;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.io.IOException;
import p147v.VText;
import p149l.a1c0;
import p149l.qsz;
import p149l.s6z;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageLoveLetterGuideView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Medium f32430a;

    /* JADX INFO: renamed from: b */
    public VText f32431b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f32432c;

    /* JADX INFO: renamed from: d */
    public User f32433d;

    /* JADX INFO: renamed from: e */
    public LoveLetterContent f32434e;

    /* JADX INFO: renamed from: f */
    public String f32435f;

    public MessageLoveLetterGuideView(@NonNull Context context) {
        super(context);
        this.f32434e = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49938b(View view) {
        s6z.m182476a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m49939c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m49940d() {
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49941e(qsz qszVar, LoveLetterContent loveLetterContent, User user, View view) {
        m49943g(false, qszVar, loveLetterContent);
        CoreModule.m29935P().m94651a().mo158212C1(m49939c(), user.f56011id);
    }

    /* JADX INFO: renamed from: f */
    public void m49942f(final User user, Message message, final qsz qszVar) {
        this.f32433d = user;
        if (!TextUtils.equals(message.localExtraInfo, this.f32435f)) {
            try {
                this.f32434e = LoveLetterContent.JSON_ADAPTER.parse(message.localExtraInfo);
            } catch (IOException unused) {
            }
            this.f32435f = message.localExtraInfo;
        }
        LoveLetterContent loveLetterContent = this.f32434e;
        if (loveLetterContent == null) {
            xdl0.m208344M(this, false);
            return;
        }
        this.f32430a.setText(loveLetterContent.title);
        this.f32431b.setText(this.f32434e.subTitle);
        this.f32432c.setText(String.format("给%s写情书", user.isFemale() ? "她" : "他"));
        xdl0.m208344M(this, true);
        final LoveLetterContent loveLetterContent2 = this.f32434e;
        xdl0.m208329E0(this.f32432c, new View.OnClickListener() { // from class: l.r6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157993a.m49941e(qszVar, loveLetterContent2, user, view);
            }
        });
        m49943g(true, qszVar, this.f32434e);
    }

    /* JADX INFO: renamed from: g */
    public final void m49943g(boolean z, qsz qszVar, LoveLetterContent loveLetterContent) {
        if (!z) {
            zvf0.m220399u("e_love_letter_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("to_uid", this.f32433d.f56011id), vwb.m200311Y("trigger_type", Integer.valueOf(loveLetterContent.triggerType)));
        } else {
            if (qszVar.m176377a("e_love_letter_guide")) {
                return;
            }
            qszVar.m176378b("e_love_letter_guide");
            zvf0.m220368A("e_love_letter_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("to_uid", this.f32433d.f56011id), vwb.m200311Y("trigger_type", Integer.valueOf(loveLetterContent.triggerType)));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49938b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f32430a.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f32431b.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f32432c.setTextColor(getResources().getColor(a1c0.f67156j));
        }
        m49940d();
    }

    public MessageLoveLetterGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32434e = null;
    }

    public MessageLoveLetterGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32434e = null;
    }
}
