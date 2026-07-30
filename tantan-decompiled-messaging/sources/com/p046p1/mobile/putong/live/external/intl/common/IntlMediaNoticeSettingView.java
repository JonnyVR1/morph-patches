package com.p046p1.mobile.putong.live.external.intl.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlPushSwitch;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.intl.common.IntlMediaNoticeSettingView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VFrame;
import p149l.e30;
import p149l.fbn;
import p149l.ffw;
import p149l.jco;
import p149l.uvr;
import p149l.vwb;
import p149l.xdl0;
import p149l.xtr;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010!R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+¨\u00061"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/common/IntlMediaNoticeSettingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "m", "()V", "k", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "j", "(Lcom/p1/mobile/android/app/Act;)V", "", "pushType", "", "toggle", "n", "(Ljava/lang/String;Z)V", "h", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VFrame;", "a", "Lv/VFrame;", "get_live_notice", "()Lv/VFrame;", "set_live_notice", "(Lv/VFrame;)V", "_live_notice", "b", "get_voice_notice", "set_voice_notice", "_voice_notice", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlMediaNoticeSettingView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _live_notice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _voice_notice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMediaNoticeSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        layoutInflaterFrom.getClass();
        m69917g(layoutInflaterFrom, this);
        m69921k();
    }

    /* JADX INFO: renamed from: a */
    public static void m69911a(IntlMediaNoticeSettingView intlMediaNoticeSettingView, View view) {
        intlMediaNoticeSettingView.m69924n("voice", yij0.m214942T(intlMediaNoticeSettingView.get_voice_notice()));
    }

    /* JADX INFO: renamed from: b */
    public static void m69912b(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: c */
    public static void m69913c(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: d */
    public static void m69914d(IntlMediaNoticeSettingView intlMediaNoticeSettingView, View view) {
        intlMediaNoticeSettingView.m69924n("live", yij0.m214942T(intlMediaNoticeSettingView.get_live_notice()));
    }

    /* JADX INFO: renamed from: e */
    public static void m69915e(IntlMediaNoticeSettingView intlMediaNoticeSettingView, BLiveIntlPushSwitch bLiveIntlPushSwitch) {
        yij0.m214964t(intlMediaNoticeSettingView.get_live_notice(), bLiveIntlPushSwitch.isOpenLiveStatus);
        yij0.m214964t(intlMediaNoticeSettingView.get_voice_notice(), bLiveIntlPushSwitch.isOpenVoiceLiveStatus);
    }

    /* JADX INFO: renamed from: f */
    public static void m69916f(Throwable th) {
        xtr.m211023c(th);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m69917g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM140990b = jco.m140990b(this, inflater, parent);
        viewM140990b.getClass();
        return viewM140990b;
    }

    @NotNull
    public final VFrame get_live_notice() {
        VFrame vFrame = this._live_notice;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_live_notice");
        return null;
    }

    @NotNull
    public final VFrame get_voice_notice() {
        VFrame vFrame = this._voice_notice;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_voice_notice");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Act m69918h() {
        Context context = getContext();
        if (context instanceof Act) {
            return (Act) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m69919i() {
        xdl0.m208329E0(get_live_notice(), new View.OnClickListener() { // from class: l.fco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMediaNoticeSettingView.m69914d(this.f96840a, view);
            }
        });
        xdl0.m208329E0(get_voice_notice(), new View.OnClickListener() { // from class: l.gco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMediaNoticeSettingView.m69911a(this.f102043a, view);
            }
        });
        xdl0.m208344M(get_live_notice(), uvr.m196087d().m162679L0());
        xdl0.m208344M(get_voice_notice(), uvr.m196087d().m162682N0());
    }

    /* JADX INFO: renamed from: j */
    public final void m69920j(Act act) {
        C22306c c22306cDuringCreated;
        if (act == null || (c22306cDuringCreated = act.duringCreated(fbn.INSTANCE.m120378r())) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(ffw.m121194e(new e30() { // from class: l.dco
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m69915e(this.f85480a, (BLiveIntlPushSwitch) obj);
            }
        }, new e30() { // from class: l.eco
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m69912b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m69921k() {
        setOrientation(1);
        m69919i();
        m69920j(m69918h());
    }

    /* JADX INFO: renamed from: l */
    public final void m69922l(String pushType, boolean toggle) {
        zvf0.m220399u(Intrinsics.m87488d("live", pushType) ? "e_intl_live_push" : "e_intl_audio_push", "p_privacy_and_permission_settings_view", vwb.m200311Y(Intrinsics.m87488d("live", pushType) ? "live_switch_status" : "audio_switch_status", toggle ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: m */
    public final void m69923m() {
    }

    /* JADX INFO: renamed from: n */
    public final void m69924n(String pushType, boolean toggle) {
        C22306c c22306cDuringCreated;
        m69922l(pushType, toggle);
        Act actM69918h = m69918h();
        if (actM69918h == null || (c22306cDuringCreated = actM69918h.duringCreated(fbn.INSTANCE.m120381u(pushType, toggle))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(ffw.m121194e(new e30() { // from class: l.hco
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m69913c((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.ico
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m69916f((Throwable) obj);
            }
        }));
    }

    public final void set_live_notice(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._live_notice = vFrame;
    }

    public final void set_voice_notice(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._voice_notice = vFrame;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlMediaNoticeSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlMediaNoticeSettingView(@NotNull Context context) {
        this(context, null, 0);
        context.getClass();
    }
}
