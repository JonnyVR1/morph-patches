package com.p046p1.mobile.putong.live.livingroom.virtual.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualCallListBottomViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p149l.i3c0;
import p149l.w8u;
import p149l.xdl0;
import p149l.zwu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001f\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR#\u0010!\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b \u0010\u001bR#\u0010#\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\"\u0010\u001b¨\u0006$"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualCallListBottomViewBindings;", "Ll/zwu;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "onFinishInflate", "", "isAnchor", "isMute", "isAlreadyCall", RXScreenCaptureService.KEY_INDEX, "(ZZZ)V", "visible", "j", "(Z)V", "", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", "getVOICE_MUTED", "()Ljava/lang/String;", "VOICE_MUTED", "h", "getSHUT_VOICE", "SHUT_VOICE", "getAPPLICATION", "APPLICATION", "getMANAGEMENT", "MANAGEMENT", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVirtualCallListBottomView extends LiveVirtualCallListBottomViewBindings<zwu> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy VOICE_MUTED;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy SHUT_VOICE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy APPLICATION;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy MANAGEMENT;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVirtualCallListBottomView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.VOICE_MUTED = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.bxu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m77314f();
            }
        });
        this.SHUT_VOICE = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.cxu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m77311c();
            }
        });
        this.APPLICATION = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.dxu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m77312d();
            }
        });
        this.MANAGEMENT = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.exu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m77313e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m77310b(LiveVirtualCallListBottomView liveVirtualCallListBottomView, View view) {
        String string = liveVirtualCallListBottomView.f48077e.getText().toString();
        if (Intrinsics.m87488d(liveVirtualCallListBottomView.getVOICE_MUTED(), string)) {
            ((zwu) liveVirtualCallListBottomView.f48073a).m220697R3(true);
            return;
        }
        if (Intrinsics.m87488d(liveVirtualCallListBottomView.getSHUT_VOICE(), string)) {
            ((zwu) liveVirtualCallListBottomView.f48073a).m220697R3(false);
        } else if (Intrinsics.m87488d(liveVirtualCallListBottomView.getAPPLICATION(), string)) {
            ((zwu) liveVirtualCallListBottomView.f48073a).m220700W3();
        } else if (Intrinsics.m87488d(liveVirtualCallListBottomView.getMANAGEMENT(), string)) {
            ((zwu) liveVirtualCallListBottomView.f48073a).m220699U3();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m77311c() {
        return w8u.m202217t(R$string.f46664Ej);
    }

    /* JADX INFO: renamed from: d */
    public static String m77312d() {
        return w8u.m202217t(R$string.f47634xf);
    }

    /* JADX INFO: renamed from: e */
    public static String m77313e() {
        return w8u.m202217t(R$string.f47047Wh);
    }

    /* JADX INFO: renamed from: f */
    public static String m77314f() {
        return w8u.m202217t(R$string.f47198di);
    }

    private final String getAPPLICATION() {
        return (String) this.APPLICATION.getValue();
    }

    private final String getMANAGEMENT() {
        return (String) this.MANAGEMENT.getValue();
    }

    private final String getSHUT_VOICE() {
        return (String) this.SHUT_VOICE.getValue();
    }

    private final String getVOICE_MUTED() {
        return (String) this.VOICE_MUTED.getValue();
    }

    /* JADX INFO: renamed from: r */
    private final void m77315r() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.axu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVirtualCallListBottomView.m77310b(this.f72234a, view);
            }
        });
        xdl0.m208344M(this.f48078f, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m77316i(boolean isAnchor, boolean isMute, boolean isAlreadyCall) {
        int i;
        int i2;
        String application;
        m77317j(true);
        if (isAlreadyCall) {
            if (isMute) {
                application = getVOICE_MUTED();
                application.getClass();
                i = i3c0.f110815O9;
            } else {
                i = i3c0.f110826P9;
                application = getSHUT_VOICE();
                application.getClass();
            }
            i2 = i3c0.f110835Q7;
        } else {
            i = i3c0.f110891V8;
            i2 = i3c0.f111106o0;
            application = getAPPLICATION();
            application.getClass();
        }
        this.f48076d.setImageResource(i);
        this.f48075c.setBackgroundResource(i2);
        this.f48077e.setText(application);
    }

    /* JADX INFO: renamed from: j */
    public final void m77317j(boolean visible) {
        xdl0.m208344M(this, visible);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualCallListBottomViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77315r();
    }
}
