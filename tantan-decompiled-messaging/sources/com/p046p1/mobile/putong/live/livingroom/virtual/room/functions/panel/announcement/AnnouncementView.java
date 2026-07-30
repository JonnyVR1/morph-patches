package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceAnnouncementViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.announcement.AnnouncementView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cxq;
import p149l.e0o0;
import p149l.h4t;
import p149l.i3c0;
import p149l.ns0;
import p149l.p4s;
import p149l.t100;
import p149l.x7n0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/announcement/AnnouncementView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceAnnouncementViewBindings;", "Ll/ns0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "", VirtualVoiceMotionType.announcement, "e", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "", "isCollapse", "f", "(Z)V", RXScreenCaptureService.KEY_INDEX, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class AnnouncementView extends LiveVirtualVoiceAnnouncementViewBindings<ns0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m77369b(AnnouncementView announcementView) {
        xdl0.m208325C0(announcementView.f48096d, announcementView.f48097e.getHeight() + t100.m186890d(113.0f));
    }

    /* JADX INFO: renamed from: c */
    public static Unit m77370c(AnnouncementView announcementView, View view) {
        view.getClass();
        ((ns0) announcementView.f48093a).m160755R3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m77371d() {
        VText vText = this.f48098f;
        T t = this.f48093a;
        t.getClass();
        xdl0.m208344M(vText, e0o0.m114322h((h4t) t));
        m77374i();
    }

    /* JADX INFO: renamed from: e */
    public final void m77372e(@NotNull String announcement) {
        announcement.getClass();
        VText vText = this.f48098f;
        T t = this.f48093a;
        t.getClass();
        xdl0.m208344M(vText, e0o0.m114322h((h4t) t));
        boolean zIsEmpty = TextUtils.isEmpty(announcement);
        VText vText2 = this.f48097e;
        if (zIsEmpty) {
            vText2.setText("欢迎加入本群，和大家一起聊天吧！");
        } else {
            vText2.setText(announcement);
        }
        m77374i();
    }

    /* JADX INFO: renamed from: f */
    public final void m77373f(boolean isCollapse) {
        xdl0.m208344M(this.f48096d, !isCollapse);
        this.f48095c.m77592b(new p4s(isCollapse, "res://drawable/" + i3c0.f111139q9, "群公告板", false, 8, null));
    }

    /* JADX INFO: renamed from: i */
    public final void m77374i() {
        T t = this.f48093a;
        t.getClass();
        boolean zM114322h = e0o0.m114322h((h4t) t);
        VText vText = this.f48097e;
        if (zM114322h) {
            vText.setMaxHeight(t100.m186890d(60.0f));
        } else {
            vText.setMaxHeight(t100.m186890d(200.0f));
        }
        this.f48097e.post(new Runnable() { // from class: l.rs0
            @Override // java.lang.Runnable
            public final void run() {
                AnnouncementView.m77369b(this.f160800a);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m77375r() {
        this.f48097e.setMovementMethod(ScrollingMovementMethod.getInstance());
        VText vText = this.f48098f;
        T t = this.f48093a;
        t.getClass();
        xdl0.m208344M(vText, e0o0.m114322h((h4t) t));
        xdl0.m208390n0(this);
        VText vText2 = this.f48098f;
        vText2.getClass();
        cxq.m109105c(vText2, new Function1() { // from class: l.ps0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnnouncementView.m77370c(this.f150965a, (View) obj);
            }
        });
        xdl0.m208372e0(this.f48095c, t100.f167276y);
        xdl0.m208327D0(x7n0.m207301a(), this.f48096d);
        m77374i();
        this.f48095c.m77593c(new p4s(false, "res://drawable/" + i3c0.f111139q9, "群公告板", false, 9, null));
        xdl0.m208345M0(this.f48095c, false);
        xdl0.m208345M0(this.f48096d, true);
    }
}
