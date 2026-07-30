package com.p051p1.mobile.putong.live.livingroom.virtual.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualCallListBottomViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.azu;
import p153l.bnl0;
import p153l.obc0;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001f\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR#\u0010!\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b \u0010\u001bR#\u0010#\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\"\u0010\u001b¨\u0006$"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualCallListBottomViewBindings;", "Ll/azu;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "onFinishInflate", "", "isAnchor", "isMute", "isAlreadyCall", RXScreenCaptureService.KEY_INDEX, "(ZZZ)V", "visible", "j", "(Z)V", "", "kotlin.jvm.PlatformType", "g", "Lkotlin/Lazy;", "getVOICE_MUTED", "()Ljava/lang/String;", "VOICE_MUTED", "h", "getSHUT_VOICE", "SHUT_VOICE", "getAPPLICATION", "APPLICATION", "getMANAGEMENT", "MANAGEMENT", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVirtualCallListBottomView extends LiveVirtualCallListBottomViewBindings<azu> {

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
        this.VOICE_MUTED = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.czu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m78497f();
            }
        });
        this.SHUT_VOICE = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.dzu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m78494c();
            }
        });
        this.APPLICATION = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.ezu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m78495d();
            }
        });
        this.MANAGEMENT = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.fzu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVirtualCallListBottomView.m78496e();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m78493b(LiveVirtualCallListBottomView liveVirtualCallListBottomView, View view) {
        String string = liveVirtualCallListBottomView.f48925e.getText().toString();
        if (Intrinsics.m88377d(liveVirtualCallListBottomView.getVOICE_MUTED(), string)) {
            ((azu) liveVirtualCallListBottomView.f48921a).m101093R3(true);
            return;
        }
        if (Intrinsics.m88377d(liveVirtualCallListBottomView.getSHUT_VOICE(), string)) {
            ((azu) liveVirtualCallListBottomView.f48921a).m101093R3(false);
        } else if (Intrinsics.m88377d(liveVirtualCallListBottomView.getAPPLICATION(), string)) {
            ((azu) liveVirtualCallListBottomView.f48921a).m101096W3();
        } else if (Intrinsics.m88377d(liveVirtualCallListBottomView.getMANAGEMENT(), string)) {
            ((azu) liveVirtualCallListBottomView.f48921a).m101095U3();
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m78494c() {
        return xau.m209910t(R$string.f47512Ej);
    }

    /* JADX INFO: renamed from: d */
    public static String m78495d() {
        return xau.m209910t(R$string.f48482xf);
    }

    /* JADX INFO: renamed from: e */
    public static String m78496e() {
        return xau.m209910t(R$string.f47895Wh);
    }

    /* JADX INFO: renamed from: f */
    public static String m78497f() {
        return xau.m209910t(R$string.f48046di);
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
    private final void m78498r() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVirtualCallListBottomView.m78493b(this.f79176a, view);
            }
        });
        bnl0.m105524M(this.f48926f, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m78499i(boolean isAnchor, boolean isMute, boolean isAlreadyCall) {
        int i;
        int i2;
        String application;
        m78500j(true);
        if (isAlreadyCall) {
            if (isMute) {
                application = getVOICE_MUTED();
                application.getClass();
                i = obc0.f146143O9;
            } else {
                i = obc0.f146154P9;
                application = getSHUT_VOICE();
                application.getClass();
            }
            i2 = obc0.f146163Q7;
        } else {
            i = obc0.f146219V8;
            i2 = obc0.f146434o0;
            application = getAPPLICATION();
            application.getClass();
        }
        this.f48924d.setImageResource(i);
        this.f48923c.setBackgroundResource(i2);
        this.f48925e.setText(application);
    }

    /* JADX INFO: renamed from: j */
    public final void m78500j(boolean visible) {
        bnl0.m105524M(this, visible);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualCallListBottomViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78498r();
    }
}
