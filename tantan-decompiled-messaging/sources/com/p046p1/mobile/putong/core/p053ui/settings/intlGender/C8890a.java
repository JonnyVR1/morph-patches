package com.p046p1.mobile.putong.core.p053ui.settings.intlGender;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account_api.api.serviceprovider.api.AccountService;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.intlGender.C8890a;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.ajn;
import p149l.fjn;
import p149l.qib0;
import p149l.s7m;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.intlGender.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0004\u001a\u00020%H\u0016¢\u0006\u0004\b\u0004\u0010&J\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u000b¢\u0006\u0004\b(\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0006R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b\u0011\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u00103R\"\u0010E\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010/\u001a\u0004\bF\u00101\"\u0004\bG\u00103R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010@\u001a\u0004\b`\u0010B\"\u0004\ba\u0010DR\"\u0010e\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\bc\u00101\"\u0004\bd\u00103R\"\u0010i\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010K\u001a\u0004\bg\u0010M\"\u0004\bh\u0010OR\"\u0010m\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010S\u001a\u0004\bk\u0010U\"\u0004\bl\u0010WR\"\u0010q\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010Z\u001a\u0004\bo\u0010\\\"\u0004\bp\u0010^R\"\u0010u\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010@\u001a\u0004\bs\u0010B\"\u0004\bt\u0010DR\"\u0010x\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010/\u001a\u0004\bv\u00101\"\u0004\bw\u00103R\"\u0010{\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010K\u001a\u0004\by\u0010M\"\u0004\bz\u0010OR\"\u0010~\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010S\u001a\u0004\b|\u0010U\"\u0004\b}\u0010WR$\u0010\u0081\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\bA\u0010Z\u001a\u0004\b\u007f\u0010\\\"\u0005\b\u0080\u0001\u0010^R)\u0010\u0088\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\bf\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R$\u0010\u008a\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b[\u0010S\u001a\u0004\bj\u0010U\"\u0005\b\u0089\u0001\u0010WR$\u0010\u008c\u0001\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b\u0011\u0010S\u001a\u0004\bn\u0010U\"\u0005\b\u008b\u0001\u0010WR%\u0010\u008f\u0001\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bs\u0010K\u001a\u0005\b\u008d\u0001\u0010M\"\u0005\b\u008e\u0001\u0010OR)\u0010\u0096\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0097\u0001¨\u0006\u0098\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/settings/intlGender/a;", "Ll/s7m;", "Ll/ajn;", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct;)V", "Lv/VFrame;", OMSTemplateModeType.view, "", "gender", "", "k", "(Lv/VFrame;Ljava/lang/String;)V", BaseSei.f13932Z, "()V", "Landroid/view/ViewGroup;", ResourceDirection.f38808v, "Landroid/view/View;", "ic", "", "b", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/ViewGroup;Landroid/view/View;Z)V", "Landroid/view/LayoutInflater;", "inflater", "parent", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "f", "(Ll/ajn;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "r", "j", "a", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlGenderDetailsAct;", "setAct", "Lv/VLinear;", "Lv/VLinear;", "get_root", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", Constants.INAPP_DATA_TAG, "get_gender", "set_gender", "_gender", "Lv/VFrame;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VFrame;", "set_male", "(Lv/VFrame;)V", "_male", "get_male_gender", "set_male_gender", "_male_gender", "Lv/VIcon;", "g", "Lv/VIcon;", "get_male_gender_ic_male_gender_icon", "()Lv/VIcon;", "set_male_gender_ic_male_gender_icon", "(Lv/VIcon;)V", "_male_gender_ic_male_gender_icon", "Lv/VText;", "h", "Lv/VText;", "get_male_gender_tv_male_gender_text", "()Lv/VText;", "set_male_gender_tv_male_gender_text", "(Lv/VText;)V", "_male_gender_tv_male_gender_text", "Lv/VImage;", "Lv/VImage;", "u", "()Lv/VImage;", "set_male_ic", "(Lv/VImage;)V", "_male_ic", "p", "set_female", "_female", "get_female_gender", "set_female_gender", "_female_gender", BLiveStormDanmakuGiftResourceType.f44444l, "get_female_gender_ic_female_gender_icon", "set_female_gender_ic_female_gender_icon", "_female_gender_ic_female_gender_icon", "m", "get_female_gender_tv_female_gender_text", "set_female_gender_tv_female_gender_text", "_female_gender_tv_female_gender_text", "n", "q", "set_female_ic", "_female_ic", "o", "w", "set_nonbinary", "_nonbinary", "get_nonbinary_gender", "set_nonbinary_gender", "_nonbinary_gender", "get_nonbinary_gender_ic_nonbinary_gender_icon", "set_nonbinary_gender_ic_nonbinary_gender_icon", "_nonbinary_gender_ic_nonbinary_gender_icon", "get_nonbinary_gender_tv_nonbinary_gender_text", "set_nonbinary_gender_tv_nonbinary_gender_text", "_nonbinary_gender_tv_nonbinary_gender_text", BaseSei.f13930X, "set_nonbinary_ic", "_nonbinary_ic", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.KEY_T, "Landroidx/constraintlayout/widget/ConstraintLayout;", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_add_more_gender_entrance", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_add_more_gender_entrance", "set_add_more_gender_entrance_tv_more_gender", "_add_more_gender_entrance_tv_more_gender", "set_add_more_gender_entrance_tv_more_gender_add", "_add_more_gender_entrance_tv_more_gender_add", "get_add_more_gender_entrance_ic_more_gender", "set_add_more_gender_entrance_ic_more_gender", "_add_more_gender_entrance_ic_more_gender", "Lv/VButton;", "Lv/VButton;", BaseSei.f13931Y, "()Lv/VButton;", "set_save_", "(Lv/VButton;)V", "_save_", "Ll/ajn;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8890a implements s7m<ajn> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public IntlGenderDetailsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _gender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VFrame _male;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _male_gender;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VIcon _male_gender_ic_male_gender_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _male_gender_tv_male_gender_text;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _male_ic;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VFrame _female;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VLinear _female_gender;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VIcon _female_gender_ic_female_gender_icon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _female_gender_tv_female_gender_text;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _female_ic;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VFrame _nonbinary;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VLinear _nonbinary_gender;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VIcon _nonbinary_gender_ic_nonbinary_gender_icon;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VText _nonbinary_gender_tv_nonbinary_gender_text;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VImage _nonbinary_ic;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public ConstraintLayout _add_more_gender_entrance;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _add_more_gender_entrance_tv_more_gender;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _add_more_gender_entrance_tv_more_gender_add;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public VIcon _add_more_gender_entrance_ic_more_gender;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public VButton _save_;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public ajn presenter;

    public C8890a(@NotNull IntlGenderDetailsAct intlGenderDetailsAct) {
        intlGenderDetailsAct.getClass();
        this.act = intlGenderDetailsAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m55564a(C8890a c8890a, View view) {
        c8890a.act.m47815F2();
    }

    /* JADX INFO: renamed from: b */
    public static void m55565b(C8890a c8890a, View view) {
        ajn ajnVar = c8890a.presenter;
        if (ajnVar == null) {
            Intrinsics.m87502r("presenter");
            ajnVar = null;
        }
        ajnVar.m96998l0();
    }

    /* JADX INFO: renamed from: c */
    public static void m55566c(C8890a c8890a, String str, View view) {
        ajn ajnVar = c8890a.presenter;
        ajn ajnVar2 = null;
        if (ajnVar == null) {
            Intrinsics.m87502r("presenter");
            ajnVar = null;
        }
        if (!Intrinsics.m87488d(ajnVar.m96996j0(), IntlGender.get(str))) {
            ajn ajnVar3 = c8890a.presenter;
            if (ajnVar3 == null) {
                Intrinsics.m87502r("presenter");
                ajnVar3 = null;
            }
            ajnVar3.m97002r0("");
        }
        ajn ajnVar4 = c8890a.presenter;
        if (ajnVar4 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            ajnVar2 = ajnVar4;
        }
        ajnVar2.m97001q0(IntlGender.get(str));
        c8890a.m55585z();
    }

    /* JADX INFO: renamed from: d */
    public static void m55567d(C8890a c8890a, View view) {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        ajn ajnVar = c8890a.presenter;
        if (ajnVar == null) {
            Intrinsics.m87502r("presenter");
            ajnVar = null;
        }
        User user = ajnVar.get_user();
        if (user == null || (settings = user.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) {
            return;
        }
        IntlMoreGender intlMoreGenderMo223809clone = intlMoreGender.mo223809clone();
        intlMoreGenderMo223809clone.getClass();
        if (intlMoreGenderMo223809clone.newGender == null) {
            ajn ajnVar2 = c8890a.presenter;
            if (ajnVar2 == null) {
                Intrinsics.m87502r("presenter");
                ajnVar2 = null;
            }
            User user2 = ajnVar2.get_user();
            if ((user2 != null ? user2.gender : null) != null) {
                ajn ajnVar3 = c8890a.presenter;
                if (ajnVar3 == null) {
                    Intrinsics.m87502r("presenter");
                    ajnVar3 = null;
                }
                User user3 = ajnVar3.get_user();
                intlMoreGenderMo223809clone.newGender = IntlGender.get(String.valueOf(user3 != null ? user3.gender : null));
            }
        }
        c8890a.getAct().startActivityForResult(IntlAddGenderDetailsAct.INSTANCE.m55560a(c8890a.getAct(), intlMoreGenderMo223809clone), 2);
    }

    /* JADX INFO: renamed from: i */
    private final void m55568i(ViewGroup v2, View ic, boolean b) {
        v2.setSelected(b);
        xdl0.m208344M(ic, b);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.act;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m55569e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM121606b = fjn.m121606b(this, inflater, parent);
        viewM121606b.getClass();
        return viewM121606b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull ajn presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m55569e(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m55571j() {
        CharSequence text;
        ajn ajnVar = this.presenter;
        ajn ajnVar2 = null;
        if (ajnVar == null) {
            Intrinsics.m87502r("presenter");
            ajnVar = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(ajnVar.m96997k0());
        m55574m().setTextColor(this.act.getColor(!zIsEmpty ? w0c0.f183831b : w0c0.f183851h));
        xdl0.m208344M(m55575n(), zIsEmpty);
        VText vTextM55574m = m55574m();
        if (zIsEmpty) {
            text = this.act.getText(R$string.f17672Df);
        } else {
            AccountService accountService = qib0.f154713b0.f139230a;
            ajn ajnVar3 = this.presenter;
            if (ajnVar3 == null) {
                Intrinsics.m87502r("presenter");
                ajnVar3 = null;
            }
            IntlGender intlGenderM96996j0 = ajnVar3.m96996j0();
            ajn ajnVar4 = this.presenter;
            if (ajnVar4 == null) {
                Intrinsics.m87502r("presenter");
            } else {
                ajnVar2 = ajnVar4;
            }
            text = accountService.mo28157Lr(intlGenderM96996j0, ajnVar2.m96997k0());
        }
        vTextM55574m.setText(text);
    }

    /* JADX INFO: renamed from: k */
    public final void m55572k(VFrame view, final String gender) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ejn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8890a.m55566c(this.f91769a, gender, view2);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final ConstraintLayout m55573l() {
        ConstraintLayout constraintLayout = this._add_more_gender_entrance;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_add_more_gender_entrance");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m55574m() {
        VText vText = this._add_more_gender_entrance_tv_more_gender;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_add_more_gender_entrance_tv_more_gender");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m55575n() {
        VText vText = this._add_more_gender_entrance_tv_more_gender_add;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_add_more_gender_entrance_tv_more_gender_add");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VFrame m55576p() {
        VFrame vFrame = this._female;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_female");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VImage m55577q() {
        VImage vImage = this._female_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_female_ic");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m55578r() {
        m55581v().setLeftIconOnClick(new View.OnClickListener() { // from class: l.bjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8890a.m55564a(this.f75924a, view);
            }
        });
        m55572k(m55579s(), "male");
        m55572k(m55576p(), "female");
        m55572k(m55582w(), "nonbinary");
        xdl0.m208329E0(m55573l(), new View.OnClickListener() { // from class: l.cjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8890a.m55567d(this.f81209a, view);
            }
        });
        xdl0.m208329E0(m55584y(), new View.OnClickListener() { // from class: l.djn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8890a.m55565b(this.f86562a, view);
            }
        });
        m55585z();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VFrame m55579s() {
        VFrame vFrame = this._male;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_male");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VImage m55580u() {
        VImage vImage = this._male_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_male_ic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VNavigationBar m55581v() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VFrame m55582w() {
        VFrame vFrame = this._nonbinary;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_nonbinary");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VImage m55583x() {
        VImage vImage = this._nonbinary_ic;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_nonbinary_ic");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VButton m55584y() {
        VButton vButton = this._save_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_save_");
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final void m55585z() {
        VFrame vFrameM55579s = m55579s();
        VImage vImageM55580u = m55580u();
        ajn ajnVar = this.presenter;
        ajn ajnVar2 = null;
        if (ajnVar == null) {
            Intrinsics.m87502r("presenter");
            ajnVar = null;
        }
        m55568i(vFrameM55579s, vImageM55580u, TEnum.equals(ajnVar.m96996j0(), "male"));
        VFrame vFrameM55576p = m55576p();
        VImage vImageM55577q = m55577q();
        ajn ajnVar3 = this.presenter;
        if (ajnVar3 == null) {
            Intrinsics.m87502r("presenter");
            ajnVar3 = null;
        }
        m55568i(vFrameM55576p, vImageM55577q, TEnum.equals(ajnVar3.m96996j0(), "female"));
        VFrame vFrameM55582w = m55582w();
        VImage vImageM55583x = m55583x();
        ajn ajnVar4 = this.presenter;
        if (ajnVar4 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            ajnVar2 = ajnVar4;
        }
        m55568i(vFrameM55582w, vImageM55583x, TEnum.equals(ajnVar2.m96996j0(), "nonbinary"));
        m55571j();
    }
}
