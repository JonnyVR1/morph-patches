package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.settings.IntlPersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.addemoji.AddEmojiAct;
import com.p046p1.mobile.putong.core.p053ui.settings.personaldetails.IntlPersonalDetailsPresenter;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VSwitch;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0004\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010-\"\u0004\bK\u0010/R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010+\u001a\u0004\bV\u0010-\"\u0004\bW\u0010/R\"\u0010\\\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010Q\"\u0004\b[\u0010SR\"\u0010`\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010+\u001a\u0004\b^\u0010-\"\u0004\b_\u0010/R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010h\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010+\u001a\u0004\bf\u0010-\"\u0004\bg\u0010/R\"\u0010l\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010O\u001a\u0004\bj\u0010Q\"\u0004\bk\u0010SR\"\u0010p\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010+\u001a\u0004\bn\u0010-\"\u0004\bo\u0010/R\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010+\u001a\u0004\bz\u0010-\"\u0004\b{\u0010/R#\u0010\u0080\u0001\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010O\u001a\u0004\b~\u0010Q\"\u0004\b\u007f\u0010SR)\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0093\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008c\u0001\u001a\u0006\b\u0093\u0001\u0010\u008e\u0001\"\u0006\b\u0094\u0001\u0010\u0090\u0001R\"\u0010\u0099\u0001\u001a\r \u0096\u0001*\u0005\u0018\u00010\u0095\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, m87232d2 = {"Ll/hto;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;)V", "", "c0", "()V", "g0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "H", "(Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "r", "h0", "l0", "b0", "Lcom/p1/mobile/putong/data/User;", "editingUser", "i0", "(Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "setAct", "Lv/VLinear;", "b", "Lv/VLinear;", "get_root", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", j6f.GPS_DIRECTION_TRUE, "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VProgressBar;", Constants.INAPP_DATA_TAG, "Lv/VProgressBar;", "Q", "()Lv/VProgressBar;", "set_loading_block", "(Lv/VProgressBar;)V", "_loading_block", "Lv/VScroll;", "e", "Lv/VScroll;", "W", "()Lv/VScroll;", "set_scroll", "(Lv/VScroll;)V", "_scroll", "f", BloodType.f38728O, "set_full_name", "_full_name", "Lv/VText;", "g", "Lv/VText;", "P", "()Lv/VText;", "set_full_name_text", "(Lv/VText;)V", "_full_name_text", "h", "K", "set_birthdate", "_birthdate", RXScreenCaptureService.KEY_INDEX, "L", "set_birthdate_text", "_birthdate_text", "j", "R", "set_my_gender", "_my_gender", "k", j6f.LATITUDE_SOUTH, "set_my_gender_text", "_my_gender_text", BLiveStormDanmakuGiftResourceType.f44444l, "M", "set_blood_type", "_blood_type", "m", "N", "set_blood_type_text", "_blood_type_text", "n", "U", "set_profile_type", "_profile_type", "Lv/VSwitch;", "o", "Lv/VSwitch;", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VSwitch;", "set_profile_type_profile_check", "(Lv/VSwitch;)V", "_profile_type_profile_check", "p", "I", "set_add_emoji", "_add_emoji", "q", "get_add_emoji_text", "set_add_emoji_text", "_add_emoji_text", "Lv/VDraweeView;", "Lv/VDraweeView;", "J", "()Lv/VDraweeView;", "set_add_emoji_emoji", "(Lv/VDraweeView;)V", "_add_emoji_emoji", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "", Constants.KEY_T, "Z", "getFirstGenderChange", "()Z", "setFirstGenderChange", "(Z)V", "firstGenderChange", "u", "isFormAgeFake", "setFormAgeFake", "Ll/cwf0;", "kotlin.jvm.PlatformType", ResourceDirection.f38808v, "Ll/cwf0;", "pageHelper", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hto implements s7m<IntlPersonalDetailsPresenter> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public IntlPersonalDetailsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VProgressBar _loading_block;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VScroll _scroll;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _full_name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _full_name_text;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VLinear _birthdate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _birthdate_text;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VLinear _my_gender;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _my_gender_text;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VLinear _blood_type;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _blood_type_text;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VLinear _profile_type;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VSwitch _profile_type_profile_check;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VLinear _add_emoji;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _add_emoji_text;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VDraweeView _add_emoji_emoji;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public IntlPersonalDetailsPresenter presenter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean firstGenderChange;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean isFormAgeFake;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final cwf0 pageHelper;

    public hto(@NotNull IntlPersonalDetailsAct intlPersonalDetailsAct) {
        intlPersonalDetailsAct.getClass();
        this.act = intlPersonalDetailsAct;
        this.firstGenderChange = true;
        this.pageHelper = i0e.m133794c("p_clone_cannot_change_gender", Dialog.class.getName());
    }

    /* JADX INFO: renamed from: A */
    public static void m132872A(final hto htoVar, View view) {
        final ArrayList arrayList = new ArrayList();
        Act act = htoVar.getAct();
        act.getClass();
        String string = act.getResources().getString(R$string.f18899s0);
        string.getClass();
        arrayList.add(string);
        Act act2 = htoVar.getAct();
        act2.getClass();
        String string2 = act2.getResources().getString(R$string.f18959u0);
        string2.getClass();
        arrayList.add(string2);
        Act act3 = htoVar.getAct();
        act3.getClass();
        String string3 = act3.getResources().getString(R$string.f18989v0);
        string3.getClass();
        arrayList.add(string3);
        Act act4 = htoVar.getAct();
        act4.getClass();
        String string4 = act4.getResources().getString(R$string.f18929t0);
        string4.getClass();
        arrayList.add(string4);
        Act act5 = htoVar.getAct();
        act5.getClass();
        String string5 = act5.getResources().getString(R$string.f19019w0);
        string5.getClass();
        arrayList.add(string5);
        final ArrayList arrayListM200324f0 = vwb.m200324f0("A", "B", BloodType.f38728O, BloodType.f38726AB, "UNKNOWN");
        arrayListM200324f0.getClass();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_blood_type_dialog", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        htoVar.getAct().dialog().m20503E0(R$string.f18869r0).m20535e0(arrayList).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.gto
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                hto.m132879Z(arrayList, htoVar, arrayListM200324f0, dialog, view2, i, charSequence);
            }
        }).m20541k0(R$string.f18408c).m20526V(new DialogInterface.OnDismissListener() { // from class: l.iso
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hto.m132881a0(cwf0VarM133794c, dialogInterface);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: B */
    public static void m132873B() {
        zvf0.m220396r("e_clone_cannot_change_gender_got_it", "p_clone_cannot_change_gender");
    }

    /* JADX INFO: renamed from: C */
    public static void m132874C(hto htoVar, DialogInterface dialogInterface) {
        i0e.m133796e(htoVar.pageHelper);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: E */
    public static Unit m132875E(User user, final hto htoVar) {
        Settings settings = user.settings;
        settings.getClass();
        final List<SettingGroups> list = settings.settingGroups;
        if (vwb.m200296J(list)) {
            VText vTextM132912L = htoVar.m132912L();
            vTextM132912L.getClass();
            vTextM132912L.setTextColor(hvc0.m133154a(w0c0.f183832b0));
            xdl0.m208329E0(htoVar.m132911K(), null);
        } else {
            list.getClass();
            SettingGroups settingGroups = list.get(0);
            settingGroups.getClass();
            if (settingGroups.profile.birthChanged) {
                VText vTextM132912L2 = htoVar.m132912L();
                vTextM132912L2.getClass();
                vTextM132912L2.setTextColor(hvc0.m133154a(w0c0.f183832b0));
                xdl0.m208329E0(htoVar.m132911K(), null);
            } else {
                VText vTextM132912L3 = htoVar.m132912L();
                vTextM132912L3.getClass();
                vTextM132912L3.setTextColor(hvc0.m133154a(w0c0.f183802R1));
                xdl0.m208329E0(htoVar.m132911K(), new View.OnClickListener() { // from class: l.mso
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hto.m132892j0(list, htoVar, view);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static void m132876F(hto htoVar) {
        zvf0.m220396r("e_clone_cannot_change_gender_concat_us", "p_clone_cannot_change_gender");
        new ukf0(htoVar.act).m194154a();
    }

    /* JADX INFO: renamed from: X */
    public static final void m132877X(hto htoVar, String str) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m55640G0(str);
    }

    /* JADX INFO: renamed from: Y */
    public static final String m132878Y(Spannable spannable) {
        spannable.getClass();
        return yij0.m214934L(spannable.toString());
    }

    /* JADX INFO: renamed from: Z */
    public static final void m132879Z(List list, hto htoVar, List list2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i < list.size()) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
            if (intlPersonalDetailsPresenter == null) {
                Intrinsics.m87502r("presenter");
                intlPersonalDetailsPresenter = null;
            }
            intlPersonalDetailsPresenter.m55637C0(BloodType.get((String) list2.get(i)));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m132881a0(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m132882b(hto htoVar, View view) {
        zvf0.m220396r("e_clone_show_gender_on_profile", "p_edit_basic_info_view");
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m55641H0(!htoVar.m132922V().isChecked());
        htoVar.m132922V().setChecked(!htoVar.m132922V().isChecked());
    }

    /* JADX INFO: renamed from: c */
    public static void m132883c(hto htoVar, View view) {
        htoVar.m132925c0();
    }

    /* JADX INFO: renamed from: d */
    public static void m132884d(hto htoVar, View view) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m55641H0(htoVar.m132922V().isChecked());
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m132885d0(hto htoVar, double d) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m55636A0(d);
    }

    /* JADX INFO: renamed from: e */
    public static void m132886e(final hto htoVar, View view) {
        i0e.C17451b c17451bM133814D = i0e.m133795d(htoVar.act).m133815E(1).m133814D(50);
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        c17451bM133814D.m133818H(intlPersonalDetailsPresenter.m55644r0()).m133816F(new e30() { // from class: l.nso
            @Override // p149l.e30
            public final void call(Object obj) {
                hto.m132877X(this.f140283a, (String) obj);
            }
        }).m133820J(new w9j() { // from class: l.oso
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return hto.m132878Y((Spannable) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m132887e0(hto htoVar) {
        htoVar.m132925c0();
    }

    /* JADX INFO: renamed from: i */
    public static void m132890i(hto htoVar) {
        VLinear vLinearM132911K = htoVar.m132911K();
        vLinearM132911K.getClass();
        vLinearM132911K.performClick();
    }

    /* JADX INFO: renamed from: j */
    public static void m132891j(hto htoVar, View view) {
        htoVar.m132926g0();
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m132892j0(List list, final hto htoVar, View view) {
        if (zb0.m217807d()) {
            zvf0.m220368A("e_age_verify_edit_age", "p_edit_basic_info_view", vwb.m200311Y("edit_failed_reason", "verify_pending"));
            lsi0.m151593w(R$string.f17896L);
            return;
        }
        if (zb0.m217808e()) {
            zvf0.m220368A("e_age_verify_edit_age", "p_edit_basic_info_view", vwb.m200311Y("edit_failed_reason", "verify_succeed"));
            lsi0.m151593w(R$string.f17866K);
        } else {
            if (vwb.m200296J(list)) {
                return;
            }
            Object obj = list.get(0);
            obj.getClass();
            if (((SettingGroups) obj).profile.birthChanged) {
                return;
            }
            new dd80.C16336a(htoVar.act).m110996y0(htoVar.act.string(R$string.f18908s9)).m110991t0(htoVar.act.string(R$string.f18878r9)).m110974c0(htoVar.act.getString(R$string.f18818p9), new Runnable() { // from class: l.vso
                @Override // java.lang.Runnable
                public final void run() {
                    hto.m132894k0(this.f182860a);
                }
            }).m110961P(true).m110989r0();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m132894k0(hto htoVar) {
        htoVar.m132925c0();
    }

    /* JADX INFO: renamed from: l */
    public static void m132895l(hto htoVar) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m55648z0();
    }

    /* JADX INFO: renamed from: m */
    public static void m132896m(Boolean bool) {
    }

    /* JADX INFO: renamed from: s */
    public static void m132900s(hto htoVar, View view) {
        htoVar.getAct().onBackPressed();
    }

    /* JADX INFO: renamed from: w */
    public static void m132903w(final hto htoVar, final double d) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        if (d == intlPersonalDetailsPresenter.m55642p0()) {
            return;
        }
        new dd80.C16336a(htoVar.act).m110996y0(mqi0.f135250b.format(Double.valueOf(d))).m110991t0(htoVar.act.string(R$string.f18848q9)).m110974c0(htoVar.act.getString(R$string.f18562h), new Runnable() { // from class: l.wso
            @Override // java.lang.Runnable
            public final void run() {
                hto.m132885d0(this.f187954a, d);
            }
        }).m110969X(htoVar.act.string(R$string.f19078y), new Runnable() { // from class: l.xso
            @Override // java.lang.Runnable
            public final void run() {
                hto.m132887e0(this.f194294a);
            }
        }).m110961P(true).m110989r0();
        if (htoVar.isFormAgeFake) {
            Settings settings = CoreModule.f17545c.f19639e0.m169520na().settings;
            settings.getClass();
            if (d == settings.birthdate.doubleValue()) {
                return;
            }
            Act act = htoVar.getAct();
            Media media = CoreModule.f17545c.f19639e0.m169520na().pictures.get(0);
            Act act2 = htoVar.getAct();
            act2.getClass();
            ark.m98453V0(act, false, media, act2.string(R$string.f18491el), new Runnable() { // from class: l.yso
                @Override // java.lang.Runnable
                public final void run() {
                    hto.m132889f0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public static Double m132904x(hto htoVar) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        return Double.valueOf(intlPersonalDetailsPresenter.m55642p0());
    }

    /* JADX INFO: renamed from: y */
    public static void m132905y(hto htoVar, View view) {
        htoVar.getAct().startActivityForResult(AddEmojiAct.m55230Z1(htoVar.getContext(), "personal_information"), 532);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m132907G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM138229b = ito.m138229b(this, inflater, parent);
        viewM138229b.getClass();
        return viewM138229b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull IntlPersonalDetailsPresenter presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VLinear m132909I() {
        VLinear vLinear = this._add_emoji;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_add_emoji");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VDraweeView m132910J() {
        VDraweeView vDraweeView = this._add_emoji_emoji;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_add_emoji_emoji");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VLinear m132911K() {
        VLinear vLinear = this._birthdate;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_birthdate");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m132912L() {
        VText vText = this._birthdate_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_birthdate_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m132913M() {
        VLinear vLinear = this._blood_type;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_blood_type");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m132914N() {
        VText vText = this._blood_type_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_blood_type_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m132915O() {
        VLinear vLinear = this._full_name;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_full_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m132916P() {
        VText vText = this._full_name_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_full_name_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VProgressBar m132917Q() {
        VProgressBar vProgressBar = this._loading_block;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m87502r("_loading_block");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VLinear m132918R() {
        VLinear vLinear = this._my_gender;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_my_gender");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m132919S() {
        VText vText = this._my_gender_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_my_gender_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VNavigationBar m132920T() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VLinear m132921U() {
        VLinear vLinear = this._profile_type;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_profile_type");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VSwitch m132922V() {
        VSwitch vSwitch = this._profile_type_profile_check;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.m87502r("_profile_type_profile_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VScroll m132923W() {
        VScroll vScroll = this._scroll;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.m87502r("_scroll");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m132924b0() {
        VScroll vScrollM132923W = m132923W();
        vScrollM132923W.getClass();
        if (vScrollM132923W.getVisibility() == 4) {
            VScroll vScrollM132923W2 = m132923W();
            vScrollM132923W2.getClass();
            vScrollM132923W2.setVisibility(0);
            VProgressBar vProgressBarM132917Q = m132917Q();
            vProgressBarM132917Q.getClass();
            vProgressBarM132917Q.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m132925c0() {
        CoreDlg.m44993I1(this.act, new v9j() { // from class: l.jso
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return hto.m132904x(this.f119528a);
            }
        }, new e30() { // from class: l.kso
            @Override // p149l.e30
            public final void call(Object obj) {
                hto.m132903w(this.f124495a, ((Double) obj).doubleValue());
            }
        }, new e30() { // from class: l.lso
            @Override // p149l.e30
            public final void call(Object obj) {
                hto.m132896m((Boolean) obj);
            }
        });
        zvf0.m220402x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX INFO: renamed from: g0 */
    public final void m132926g0() {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Settings settings2;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.presenter;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter3 = this.presenter;
        if (intlPersonalDetailsPresenter3 == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter3 = null;
        }
        User editingUser = intlPersonalDetailsPresenter3.getEditingUser();
        if (intlPersonalDetailsPresenter.m55647y0((editingUser == null || (settings2 = editingUser.settings) == null) ? null : settings2.getSettingGroup())) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter4 = this.presenter;
            if (intlPersonalDetailsPresenter4 == null) {
                Intrinsics.m87502r("presenter");
            } else {
                intlPersonalDetailsPresenter2 = intlPersonalDetailsPresenter4;
            }
            User editingUser2 = intlPersonalDetailsPresenter2.getEditingUser();
            ?? M87488d = (editingUser2 == null || (settings = editingUser2.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) ? 0 : Intrinsics.m87488d(intlMoreGender.canUpdate, Boolean.TRUE);
            zvf0.m220399u("e_clone_edit_gender", "p_edit_basic_info_view", vwb.m200311Y("if_can_edit_gender", Integer.valueOf((int) M87488d)));
            if (M87488d != 0) {
                new dd80.C16336a(this.act).m110996y0(this.act.string(R$string.f18762nf)).m110974c0(this.act.getString(R$string.f18731mf), new Runnable() { // from class: l.qso
                    @Override // java.lang.Runnable
                    public final void run() {
                        hto.m132895l(this.f156262a);
                    }
                }).m110961P(true).m110989r0();
            } else {
                i0e.m133797f(this.pageHelper);
                new dd80.C16336a(this.act).m110996y0(this.act.string(R$string.f19004vf)).m110991t0(this.act.string(R$string.f18974uf)).m110974c0(this.act.getString(R$string.f18944tf), new Runnable() { // from class: l.rso
                    @Override // java.lang.Runnable
                    public final void run() {
                        hto.m132873B();
                    }
                }).m110969X(this.act.string(R$string.f18914sf), new Runnable() { // from class: l.tso
                    @Override // java.lang.Runnable
                    public final void run() {
                        hto.m132876F(this.f171948a);
                    }
                }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.uso
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        hto.m132874C(this.f177994a, dialogInterface);
                    }
                }).m110961P(true).m110989r0();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m132927h0() {
        this.isFormAgeFake = true;
        e51.m114741F(getAct(), new Runnable() { // from class: l.pso
            @Override // java.lang.Runnable
            public final void run() {
                hto.m132890i(this.f151024a);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: i0 */
    public final void m132928i0(@NotNull final User editingUser) {
        IntlGender intlGender;
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        SettingGroups settingGroup3;
        IntlMoreGender intlMoreGender3;
        Boolean bool;
        editingUser.getClass();
        VLinear vLinearM132921U = m132921U();
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.presenter;
        String str = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        Settings settings2 = editingUser.settings;
        vLinearM132921U.setVisibility(intlPersonalDetailsPresenter.m55647y0(settings2 != null ? settings2.getSettingGroup() : null) ? 0 : 8);
        VSwitch vSwitchM132922V = m132922V();
        Settings settings3 = editingUser.settings;
        vSwitchM132922V.setChecked((settings3 == null || (settingGroup3 = settings3.getSettingGroup()) == null || (intlMoreGender3 = settingGroup3.gender) == null || (bool = intlMoreGender3.showOnProfile) == null) ? false : bool.booleanValue());
        Gender gender = editingUser.gender;
        gender.getClass();
        Settings settings4 = editingUser.settings;
        if (settings4 == null || (settingGroup2 = settings4.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null || (intlGender = intlMoreGender2.newGender) == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = this.presenter;
        if (intlPersonalDetailsPresenter2 == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter2 = null;
        }
        Settings settings5 = editingUser.settings;
        if (!intlPersonalDetailsPresenter2.m55647y0(settings5 != null ? settings5.getSettingGroup() : null) || TEnum.equals(intlGender, IntlGender.get("unknown_"))) {
            intlGender = IntlGender.get(gender.toString());
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter3 = this.presenter;
        if (intlPersonalDetailsPresenter3 == null) {
            Intrinsics.m87502r("presenter");
            intlPersonalDetailsPresenter3 = null;
        }
        Settings settings6 = editingUser.settings;
        if (intlPersonalDetailsPresenter3.m55647y0(settings6 != null ? settings6.getSettingGroup() : null) && (settings = editingUser.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
            str = intlMoreGender.subGender;
        }
        m132919S().setText(qib0.f154713b0.f139230a.mo28157Lr(intlGender, str));
        m132916P().setText(editingUser.name);
        VText vTextM132912L = m132912L();
        SimpleDateFormat simpleDateFormat = mqi0.f135250b;
        Settings settings7 = editingUser.settings;
        settings7.getClass();
        vTextM132912L.setText(simpleDateFormat.format(settings7.birthdate));
        if (!vwb.m200296J(editingUser.profile.extensions.physical.bloodType)) {
            m132914N().setText(b43.m100167a(editingUser.profile.extensions.physical.bloodType.get(0)));
        }
        new Function0() { // from class: l.hso
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hto.m132875E(editingUser, this);
            }
        };
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m132907G(inflater, parent);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m132929l0() {
        xdl0.m208344M(m132909I(), false);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (vwb.m200296J(userM169527p9.profile.extensions.interest.emoji)) {
            m132910J().setImageResource(x2c0.f190771z8);
            return;
        }
        qib0.f154691G.m102331L0(m132910J(), qib0.f154709X.m126254n(userM169527p9.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: r */
    public final void m132930r() {
        m132920T().getLeftIconContainer().setBackgroundResource(x2c0.f190442p);
        m132920T().setTitle(R$string.f19132zn);
        m132920T().setLeftIconOnClick(new View.OnClickListener() { // from class: l.sso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132900s(this.f166230a, view);
            }
        });
        m132915O().setOnClickListener(new View.OnClickListener() { // from class: l.zso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132886e(this.f204619a, view);
            }
        });
        xdl0.m208329E0(m132921U(), new View.OnClickListener() { // from class: l.ato
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132882b(this.f71636a, view);
            }
        });
        xdl0.m208329E0(m132922V(), new View.OnClickListener() { // from class: l.bto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132884d(this.f77252a, view);
            }
        });
        m132911K().setOnClickListener(new View.OnClickListener() { // from class: l.cto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132883c(this.f82494a, view);
            }
        });
        m132918R().setOnClickListener(new View.OnClickListener() { // from class: l.dto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132891j(this.f87864a, view);
            }
        });
        xdl0.m208345M0(m132913M(), b43.m100168b());
        m132913M().setOnClickListener(new View.OnClickListener() { // from class: l.eto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132872A(this.f93164a, view);
            }
        });
        m132929l0();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.fto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m132905y(this.f99227a, view);
            }
        };
        VLinear vLinearM132909I = m132909I();
        vLinearM132909I.getClass();
        vLinearM132909I.setOnClickListener(onClickListener);
        VDraweeView vDraweeViewM132910J = m132910J();
        vDraweeViewM132910J.getClass();
        vDraweeViewM132910J.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m132889f0() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
