package com.p051p1.mobile.putong.live.external.intl.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlPushSwitch;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.intl.common.IntlMediaNoticeSettingView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VFrame;
import p153l.bnl0;
import p153l.bsj0;
import p153l.dhw;
import p153l.fdn;
import p153l.i4g0;
import p153l.jeo;
import p153l.jyb;
import p153l.vxr;
import p153l.y20;
import p153l.yvr;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010!R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+¨\u00061"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/common/IntlMediaNoticeSettingView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "m", "()V", "k", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "j", "(Lcom/p1/mobile/android/app/Act;)V", "", "pushType", "", "toggle", "n", "(Ljava/lang/String;Z)V", "h", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VFrame;", "a", "Lv/VFrame;", "get_live_notice", "()Lv/VFrame;", "set_live_notice", "(Lv/VFrame;)V", "_live_notice", "b", "get_voice_notice", "set_voice_notice", "_voice_notice", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
        m71100g(layoutInflaterFrom, this);
        m71104k();
    }

    /* JADX INFO: renamed from: a */
    public static void m71094a(IntlMediaNoticeSettingView intlMediaNoticeSettingView, View view) {
        intlMediaNoticeSettingView.m71107n("voice", bsj0.m106262T(intlMediaNoticeSettingView.get_voice_notice()));
    }

    /* JADX INFO: renamed from: b */
    public static void m71095b(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: c */
    public static void m71096c(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: d */
    public static void m71097d(IntlMediaNoticeSettingView intlMediaNoticeSettingView, View view) {
        intlMediaNoticeSettingView.m71107n("live", bsj0.m106262T(intlMediaNoticeSettingView.get_live_notice()));
    }

    /* JADX INFO: renamed from: e */
    public static void m71098e(IntlMediaNoticeSettingView intlMediaNoticeSettingView, BLiveIntlPushSwitch bLiveIntlPushSwitch) {
        bsj0.m106284t(intlMediaNoticeSettingView.get_live_notice(), bLiveIntlPushSwitch.isOpenLiveStatus);
        bsj0.m106284t(intlMediaNoticeSettingView.get_voice_notice(), bLiveIntlPushSwitch.isOpenVoiceLiveStatus);
    }

    /* JADX INFO: renamed from: f */
    public static void m71099f(Throwable th) {
        yvr.m217557c(th);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m71100g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM144603b = jeo.m144603b(this, inflater, parent);
        viewM144603b.getClass();
        return viewM144603b;
    }

    @NotNull
    public final VFrame get_live_notice() {
        VFrame vFrame = this._live_notice;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_live_notice");
        return null;
    }

    @NotNull
    public final VFrame get_voice_notice() {
        VFrame vFrame = this._voice_notice;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_voice_notice");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Act m71101h() {
        Context context = getContext();
        if (context instanceof Act) {
            return (Act) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m71102i() {
        bnl0.m105509E0(get_live_notice(), new View.OnClickListener() { // from class: l.feo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMediaNoticeSettingView.m71097d(this.f98696a, view);
            }
        });
        bnl0.m105509E0(get_voice_notice(), new View.OnClickListener() { // from class: l.geo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlMediaNoticeSettingView.m71094a(this.f103847a, view);
            }
        });
        bnl0.m105524M(get_live_notice(), vxr.m203876d().m170986L0());
        bnl0.m105524M(get_voice_notice(), vxr.m203876d().m170989N0());
    }

    /* JADX INFO: renamed from: j */
    public final void m71103j(Act act) {
        C22421c c22421cDuringCreated;
        if (act == null || (c22421cDuringCreated = act.duringCreated(fdn.INSTANCE.m125122r())) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(dhw.m115826e(new y20() { // from class: l.deo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m71098e(this.f88058a, (BLiveIntlPushSwitch) obj);
            }
        }, new y20() { // from class: l.eeo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m71095b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m71104k() {
        setOrientation(1);
        m71102i();
        m71103j(m71101h());
    }

    /* JADX INFO: renamed from: l */
    public final void m71105l(String pushType, boolean toggle) {
        i4g0.m138523u(Intrinsics.m88377d("live", pushType) ? "e_intl_live_push" : "e_intl_audio_push", "p_privacy_and_permission_settings_view", jyb.m147494Y(Intrinsics.m88377d("live", pushType) ? "live_switch_status" : "audio_switch_status", toggle ? "on" : BLiveOperationTitleShowType.off));
    }

    /* JADX INFO: renamed from: m */
    public final void m71106m() {
    }

    /* JADX INFO: renamed from: n */
    public final void m71107n(String pushType, boolean toggle) {
        C22421c c22421cDuringCreated;
        m71105l(pushType, toggle);
        Act actM71101h = m71101h();
        if (actM71101h == null || (c22421cDuringCreated = actM71101h.duringCreated(fdn.INSTANCE.m125125u(pushType, toggle))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(dhw.m115826e(new y20() { // from class: l.heo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m71096c((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.ieo
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlMediaNoticeSettingView.m71099f((Throwable) obj);
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
