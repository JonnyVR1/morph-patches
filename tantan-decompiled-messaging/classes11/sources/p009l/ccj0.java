package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.ttcmigrate.TtcAccountMigrateDisplayAct;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayUserInfoData;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.dcj0;
import l.qib0;
import l.s7m;
import l.ukf0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00101\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00105\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+\"\u0004\b4\u0010-R\"\u00108\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R\"\u0010<\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\"\u0010@\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R\"\u0010C\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R\"\u0010F\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010)\u001a\u0004\b2\u0010+\"\u0004\bE\u0010-R\"\u0010H\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\bD\u0010+\"\u0004\bG\u0010-¨\u0006I"}, d2 = {"Ll/ccj0;", "Ll/s7m;", "Ll/zbj0;", "Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "d", "(Ll/zbj0;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "s", "(Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;)V", "a", "Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", "getAct", "()Lcom/p1/mobile/putong/core/newui/ttcmigrate/TtcAccountMigrateDisplayAct;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "b", "Lcom/facebook/drawee/view/SimpleDraweeView;", "f", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "set_iv_ttc_avatar", "(Lcom/facebook/drawee/view/SimpleDraweeView;)V", "_iv_ttc_avatar", "Lv/VText;", "Lv/VText;", "n", "()Lv/VText;", "set_tv_ttc_name", "(Lv/VText;)V", "_tv_ttc_name", "k", "set_tv_ttc_id", "_tv_ttc_id", "e", "m", "set_tv_ttc_match_num", "_tv_ttc_match_num", "l", "set_tv_ttc_like_num", "_tv_ttc_like_num", "g", "i", "set_iv_ttt_avatar", "_iv_ttt_avatar", "h", "q", "set_tv_ttt_name", "_tv_ttt_name", "p", "set_tv_ttt_id", "_tv_ttt_id", "j", "set_continue_btn", "_continue_btn", "set_tv_contact", "_tv_contact", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m12479a(ccj0 ccj0Var, View view) {
        new ukf0(ccj0Var.act).a();
        zvf0.r("e_clone_choose_account_contact_us", "p_clone_choose_account");
    }

    /* JADX INFO: renamed from: b */
    public static void m12480b(ccj0 ccj0Var, View view) {
        zvf0.r("e_clone_choose_account_continue", "p_clone_choose_account");
        ccj0Var.act.finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12481C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m12482c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = dcj0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final VText m12484e() {
        VText vText = this._continue_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_continue_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final SimpleDraweeView m12485f() {
        SimpleDraweeView simpleDraweeView = this._iv_ttc_avatar;
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        Intrinsics.r("_iv_ttc_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SimpleDraweeView m12486i() {
        SimpleDraweeView simpleDraweeView = this._iv_ttt_avatar;
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        Intrinsics.r("_iv_ttt_avatar");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m12482c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m12488j() {
        VText vText = this._tv_contact;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_contact");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m12489k() {
        VText vText = this._tv_ttc_id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_ttc_id");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m12490l() {
        VText vText = this._tv_ttc_like_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_ttc_like_num");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m12491m() {
        VText vText = this._tv_ttc_match_num;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_ttc_match_num");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m12492n() {
        VText vText = this._tv_ttc_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_ttc_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VText m12493p() {
        VText vText = this._tv_ttt_id;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_ttt_id");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VText m12494q() {
        VText vText = this._tv_ttt_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tv_ttt_name");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m12495s(@NotNull TtcMigrateDisplayData data) {
        data.getClass();
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = data.userList.ttcUser;
        qib0.G.N0(m12485f(), ttcMigrateDisplayUserInfoData.avatar, false);
        m12492n().setText(ttcMigrateDisplayUserInfoData.nickname);
        m12489k().setText("ID：" + ttcMigrateDisplayUserInfoData.id);
        m12491m().setText(String.valueOf(ttcMigrateDisplayUserInfoData.matchNum));
        m12490l().setText(String.valueOf(ttcMigrateDisplayUserInfoData.likedYouNum));
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = data.userList.tttUser;
        qib0.G.N0(m12486i(), ttcMigrateDisplayUserInfoData2.avatar, false);
        m12494q().setText(ttcMigrateDisplayUserInfoData2.nickname);
        m12493p().setText("ID：" + ttcMigrateDisplayUserInfoData2.id);
        xdl0.E0(m12484e(), new View.OnClickListener() { // from class: l.acj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccj0.m12480b(this.f9398a, view);
            }
        });
        xdl0.E0(m12488j(), new View.OnClickListener() { // from class: l.bcj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ccj0.m12479a(this.f10010a, view);
            }
        });
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m12487i1(@Nullable zbj0 presenter) {
    }

    public void destroy() {
    }
}
