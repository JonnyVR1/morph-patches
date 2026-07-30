package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceAnnouncementViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.bhn0;
import p153l.bnl0;
import p153l.czq;
import p153l.i6t;
import p153l.i9o0;
import p153l.obc0;
import p153l.q6s;
import p153l.qa00;
import p153l.ss0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/announcement/AnnouncementView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceAnnouncementViewBindings;", "Ll/ss0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "", VirtualVoiceMotionType.announcement, "e", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "", "isCollapse", "f", "(Z)V", RXScreenCaptureService.KEY_INDEX, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class AnnouncementView extends LiveVirtualVoiceAnnouncementViewBindings<ss0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m78552b(AnnouncementView announcementView) {
        bnl0.m105505C0(announcementView.f48944d, announcementView.f48945e.getHeight() + qa00.m175859d(113.0f));
    }

    /* JADX INFO: renamed from: c */
    public static Unit m78553c(AnnouncementView announcementView, View view) {
        view.getClass();
        ((ss0) announcementView.f48941a).m187668R3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m78554d() {
        VText vText = this.f48946f;
        T t = this.f48941a;
        t.getClass();
        bnl0.m105524M(vText, i9o0.m139137h((i6t) t));
        m78557i();
    }

    /* JADX INFO: renamed from: e */
    public final void m78555e(@NotNull String announcement) {
        announcement.getClass();
        VText vText = this.f48946f;
        T t = this.f48941a;
        t.getClass();
        bnl0.m105524M(vText, i9o0.m139137h((i6t) t));
        boolean zIsEmpty = TextUtils.isEmpty(announcement);
        VText vText2 = this.f48945e;
        if (zIsEmpty) {
            vText2.setText("欢迎加入本群，和大家一起聊天吧！");
        } else {
            vText2.setText(announcement);
        }
        m78557i();
    }

    /* JADX INFO: renamed from: f */
    public final void m78556f(boolean isCollapse) {
        bnl0.m105524M(this.f48944d, !isCollapse);
        this.f48943c.m78775b(new q6s(isCollapse, "res://drawable/" + obc0.f146467q9, "群公告板", false, 8, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m78557i() {
        T t = this.f48941a;
        t.getClass();
        boolean zM139137h = i9o0.m139137h((i6t) t);
        VText vText = this.f48945e;
        if (zM139137h) {
            vText.setMaxHeight(qa00.m175859d(60.0f));
        } else {
            vText.setMaxHeight(qa00.m175859d(200.0f));
        }
        this.f48945e.post(new Runnable() { // from class: l.ws0
            @Override // java.lang.Runnable
            public final void run() {
                AnnouncementView.m78552b(this.f190588a);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m78558r() {
        this.f48945e.setMovementMethod(ScrollingMovementMethod.getInstance());
        VText vText = this.f48946f;
        T t = this.f48941a;
        t.getClass();
        bnl0.m105524M(vText, i9o0.m139137h((i6t) t));
        bnl0.m105570n0(this);
        VText vText2 = this.f48946f;
        vText2.getClass();
        czq.m113347c(vText2, new Function1() { // from class: l.us0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnnouncementView.m78553c(this.f180722a, (View) obj);
            }
        });
        bnl0.m105552e0(this.f48943c, qa00.f156338y);
        bnl0.m105507D0(bhn0.m104350a(), this.f48944d);
        m78557i();
        this.f48943c.m78776c(new q6s(false, "res://drawable/" + obc0.f146467q9, "群公告板", false, 9, null));
        bnl0.m105525M0(this.f48943c, false);
        bnl0.m105525M0(this.f48944d, true);
    }
}
