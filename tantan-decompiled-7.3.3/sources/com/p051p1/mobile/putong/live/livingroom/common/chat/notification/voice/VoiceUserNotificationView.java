package com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings;
import p153l.bnl0;
import p153l.i6t;
import p153l.leo0;
import p153l.meo0;
import p153l.t8p0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceUserNotificationView extends LiveVoiceChatUserNotificationViewBindings<t8p0> {

    /* JADX INFO: renamed from: e */
    public final y20<leo0> f49798e;

    public VoiceUserNotificationView(Context context) {
        super(context);
        this.f49798e = new y20() { // from class: l.u8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178066a.m73956f((leo0) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m73954j() {
        T t = this.f49169a;
        if (t != 0) {
            ((t8p0) t).m189683M3();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceChatUserNotificationViewBindings, p153l.iam
    public void destroy() {
        this.f49171c.m73944p();
        this.f49172d.m73944p();
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: e */
    public boolean m73955e() {
        return this.f49171c.isShowing() && this.f49172d.isShowing();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73956f(leo0 leo0Var) {
        T t = this.f49169a;
        if (t != 0) {
            ((t8p0) t).m189684N3();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73957i(leo0 leo0Var, leo0 leo0Var2) {
        T t = this.f49169a;
        if (t != 0) {
            meo0.m158065d((i6t) t, leo0Var);
            ((t8p0) this.f49169a).m189681K3(leo0Var2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m73958k(final leo0 leo0Var) {
        if (m73955e()) {
            return;
        }
        y20<leo0> y20Var = new y20() { // from class: l.v8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182888a.m73957i(leo0Var, (leo0) obj);
            }
        };
        x20 x20Var = new x20() { // from class: l.w8p0
            @Override // p153l.x20
            public final void call() {
                this.f187924a.m73954j();
            }
        };
        meo0.m158066e((i6t) this.f49169a, leo0Var);
        bnl0.m105524M(this, true);
        if (!bnl0.m105529O0(this.f49171c)) {
            this.f49171c.m73946s(leo0Var, y20Var, x20Var, this.f49798e);
            bnl0.m105525M0(this.f49171c, true);
        } else {
            if (bnl0.m105529O0(this.f49172d)) {
                return;
            }
            this.f49172d.m73946s(leo0Var, y20Var, x20Var, this.f49798e);
            bnl0.m105525M0(this.f49172d, true);
        }
    }

    public VoiceUserNotificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49798e = new y20() { // from class: l.u8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178066a.m73956f((leo0) obj);
            }
        };
    }

    public VoiceUserNotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49798e = new y20() { // from class: l.u8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178066a.m73956f((leo0) obj);
            }
        };
    }
}
