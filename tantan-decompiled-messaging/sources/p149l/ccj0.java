package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p046p1.mobile.putong.core.data.TtcMigrateDisplayUserInfoData;
import com.p046p1.mobile.putong.core.newui.ttcmigrate.TtcAccountMigrateDisplayAct;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00101\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00105\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+\"\u0004\b4\u0010-R\"\u00108\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R\"\u0010<\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\"\u0010@\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R\"\u0010C\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R\"\u0010F\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010)\u001a\u0004\b2\u0010+\"\u0004\bE\u0010-R\"\u0010H\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\bD\u0010+\"\u0004\bG\u0010-¨\u0006I"}, m87232d2 = {"Ll/ccj0;", "Ll/s7m;", "Ll/zbj0;", "Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/zbj0;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;", "data", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;)V", "a", "Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", "getAct", "()Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "b", "Lcom/facebook/drawee/view/SimpleDraweeView;", "f", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "set_iv_ttc_avatar", "(Lcom/facebook/drawee/view/SimpleDraweeView;)V", "_iv_ttc_avatar", "Lv/VText;", "Lv/VText;", "n", "()Lv/VText;", "set_tv_ttc_name", "(Lv/VText;)V", "_tv_ttc_name", "k", "set_tv_ttc_id", "_tv_ttc_id", "e", "m", "set_tv_ttc_match_num", "_tv_ttc_match_num", BLiveStormDanmakuGiftResourceType.f44444l, "set_tv_ttc_like_num", "_tv_ttc_like_num", "g", RXScreenCaptureService.KEY_INDEX, "set_iv_ttt_avatar", "_iv_ttt_avatar", "h", "q", "set_tv_ttt_name", "_tv_ttt_name", "p", "set_tv_ttt_id", "_tv_ttt_id", "j", "set_continue_btn", "_continue_btn", "set_tv_contact", "_tv_contact", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ccj0 implements s7m<zbj0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TtcAccountMigrateDisplayAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public SimpleDraweeView _iv_ttc_avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _tv_ttc_name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _tv_ttc_id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tv_ttc_match_num;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _tv_ttc_like_num;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public SimpleDraweeView _iv_ttt_avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _tv_ttt_name;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _tv_ttt_id;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _continue_btn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _tv_contact;

    public ccj0(@NotNull TtcAccountMigrateDisplayAct ttcAccountMigrateDisplayAct) {
        ttcAccountMigrateDisplayAct.getClass();
        this.act = ttcAccountMigrateDisplayAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m106050a(ccj0 ccj0Var, View view) {
        new ukf0(ccj0Var.act).m194154a();
        zvf0.m220396r("e_clone_choose_account_contact_us", "p_clone_choose_account");
    }

    /* JADX INFO: renamed from: b */
    public static void m106051b(ccj0 ccj0Var, View view) {
        zvf0.m220396r("e_clone_choose_account_continue", "p_clone_choose_account");
        ccj0Var.act.m66873d2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m106052c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM110715b = dcj0.m110715b(this, inflater, parent);
        viewM110715b.getClass();
        return viewM110715b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final VText m106054e() {
        VText vText = this._continue_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_continue_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final SimpleDraweeView m106055f() {
        SimpleDraweeView simpleDraweeView = this._iv_ttc_avatar;
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        Intrinsics.m87502r("_iv_ttc_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SimpleDraweeView m106056i() {
        SimpleDraweeView simpleDraweeView = this._iv_ttt_avatar;
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        Intrinsics.m87502r("_iv_ttt_avatar");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m106052c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m106057j() {
        VText vText = this._tv_contact;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_contact");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m106058k() {
        VText vText = this._tv_ttc_id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_ttc_id");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m106059l() {
        VText vText = this._tv_ttc_like_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_ttc_like_num");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m106060m() {
        VText vText = this._tv_ttc_match_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_ttc_match_num");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m106061n() {
        VText vText = this._tv_ttc_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_ttc_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VText m106062p() {
        VText vText = this._tv_ttt_id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_ttt_id");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VText m106063q() {
        VText vText = this._tv_ttt_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_ttt_name");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m106064s(@NotNull TtcMigrateDisplayData data) {
        data.getClass();
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = data.userList.ttcUser;
        qib0.f154691G.m102335N0(m106055f(), ttcMigrateDisplayUserInfoData.avatar, false);
        m106061n().setText(ttcMigrateDisplayUserInfoData.nickname);
        m106058k().setText("ID：" + ttcMigrateDisplayUserInfoData.f20524id);
        m106060m().setText(String.valueOf(ttcMigrateDisplayUserInfoData.matchNum));
        m106059l().setText(String.valueOf(ttcMigrateDisplayUserInfoData.likedYouNum));
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = data.userList.tttUser;
        qib0.f154691G.m102335N0(m106056i(), ttcMigrateDisplayUserInfoData2.avatar, false);
        m106063q().setText(ttcMigrateDisplayUserInfoData2.nickname);
        m106062p().setText("ID：" + ttcMigrateDisplayUserInfoData2.f20524id);
        xdl0.m208329E0(m106054e(), new View.OnClickListener() { // from class: l.acj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccj0.m106051b(this.f68860a, view);
            }
        });
        xdl0.m208329E0(m106057j(), new View.OnClickListener() { // from class: l.bcj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccj0.m106050a(this.f74944a, view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable zbj0 presenter) {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
