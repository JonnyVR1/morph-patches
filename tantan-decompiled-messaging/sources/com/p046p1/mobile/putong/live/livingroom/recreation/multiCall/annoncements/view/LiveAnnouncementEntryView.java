package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveAnnouncementEntryBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.cxq;
import p149l.ltr;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/annoncements/view/LiveAnnouncementEntryView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveAnnouncementEntryBindings;", "Ll/ltr;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "j0", "()V", "", "show", "setVisibility", "(Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveAnnouncementEntryView extends LiveAnnouncementEntryBindings<ltr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAnnouncementEntryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static Unit m75664i0(LiveAnnouncementEntryView liveAnnouncementEntryView, View view) {
        view.getClass();
        ((ltr) liveAnnouncementEntryView.f47957d).m151716M3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75665j0() {
        VText vText = this.f47959f;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.mtr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveAnnouncementEntryView.m75664i0(this.f135671a, (View) obj);
            }
        });
    }

    public final void setVisibility(boolean show) {
        xdl0.m208344M(getRoot(), show);
    }
}
