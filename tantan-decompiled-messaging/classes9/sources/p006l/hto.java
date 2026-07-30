package p006l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.IntlPersonalDetailsAct;
import com.p000p1.mobile.putong.core.p004ui.settings.addemoji.AddEmojiAct;
import com.p000p1.mobile.putong.core.p004ui.settings.personaldetails.IntlPersonalDetailsPresenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlMoreGender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ark;
import l.cwf0;
import l.dd80;
import l.e30;
import l.e51;
import l.hvc0;
import l.i0e;
import l.ito;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.s7m;
import l.ukf0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VLinear;
import v.VProgressBar;
import v.VScroll;
import v.VSwitch;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0004\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010-\"\u0004\bK\u0010/R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010+\u001a\u0004\bV\u0010-\"\u0004\bW\u0010/R\"\u0010\\\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010Q\"\u0004\b[\u0010SR\"\u0010`\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010+\u001a\u0004\b^\u0010-\"\u0004\b_\u0010/R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010h\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010+\u001a\u0004\bf\u0010-\"\u0004\bg\u0010/R\"\u0010l\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010O\u001a\u0004\bj\u0010Q\"\u0004\bk\u0010SR\"\u0010p\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010+\u001a\u0004\bn\u0010-\"\u0004\bo\u0010/R\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010+\u001a\u0004\bz\u0010-\"\u0004\b{\u0010/R#\u0010\u0080\u0001\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010O\u001a\u0004\b~\u0010Q\"\u0004\b\u007f\u0010SR)\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0093\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008c\u0001\u001a\u0006\b\u0093\u0001\u0010\u008e\u0001\"\u0006\b\u0094\u0001\u0010\u0090\u0001R\"\u0010\u0099\u0001\u001a\r \u0096\u0001*\u0005\u0018\u00010\u0095\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, d2 = {"Ll/hto;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;)V", "", "c0", "()V", "g0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "H", "(Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "r", "h0", "l0", "b0", "Lcom/p1/mobile/putong/data/User;", "editingUser", "i0", "(Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "setAct", "Lv/VLinear;", "b", "Lv/VLinear;", "get_root", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "T", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VProgressBar;", "d", "Lv/VProgressBar;", "Q", "()Lv/VProgressBar;", "set_loading_block", "(Lv/VProgressBar;)V", "_loading_block", "Lv/VScroll;", "e", "Lv/VScroll;", "W", "()Lv/VScroll;", "set_scroll", "(Lv/VScroll;)V", "_scroll", "f", "O", "set_full_name", "_full_name", "Lv/VText;", "g", "Lv/VText;", "P", "()Lv/VText;", "set_full_name_text", "(Lv/VText;)V", "_full_name_text", "h", "K", "set_birthdate", "_birthdate", "i", "L", "set_birthdate_text", "_birthdate_text", "j", "R", "set_my_gender", "_my_gender", "k", "S", "set_my_gender_text", "_my_gender_text", "l", "M", "set_blood_type", "_blood_type", "m", "N", "set_blood_type_text", "_blood_type_text", "n", "U", "set_profile_type", "_profile_type", "Lv/VSwitch;", "o", "Lv/VSwitch;", "V", "()Lv/VSwitch;", "set_profile_type_profile_check", "(Lv/VSwitch;)V", "_profile_type_profile_check", "p", "I", "set_add_emoji", "_add_emoji", "q", "get_add_emoji_text", "set_add_emoji_text", "_add_emoji_text", "Lv/VDraweeView;", "Lv/VDraweeView;", "J", "()Lv/VDraweeView;", "set_add_emoji_emoji", "(Lv/VDraweeView;)V", "_add_emoji_emoji", "s", "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "", "t", "Z", "getFirstGenderChange", "()Z", "setFirstGenderChange", "(Z)V", "firstGenderChange", "u", "isFormAgeFake", "setFormAgeFake", "Ll/cwf0;", "kotlin.jvm.PlatformType", "v", "Ll/cwf0;", "pageHelper", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.pageHelper = i0e.c("p_clone_cannot_change_gender", Dialog.class.getName());
    }

    /* JADX INFO: renamed from: A */
    public static void m16319A(final hto htoVar, View view) {
        final ArrayList arrayList = new ArrayList();
        Act act = htoVar.act();
        act.getClass();
        String string = act.getResources().getString(R$string.f2888s0);
        string.getClass();
        arrayList.add(string);
        Act act2 = htoVar.act();
        act2.getClass();
        String string2 = act2.getResources().getString(R$string.f2948u0);
        string2.getClass();
        arrayList.add(string2);
        Act act3 = htoVar.act();
        act3.getClass();
        String string3 = act3.getResources().getString(R$string.f2978v0);
        string3.getClass();
        arrayList.add(string3);
        Act act4 = htoVar.act();
        act4.getClass();
        String string4 = act4.getResources().getString(R$string.f2918t0);
        string4.getClass();
        arrayList.add(string4);
        Act act5 = htoVar.act();
        act5.getClass();
        String string5 = act5.getResources().getString(R$string.f3008w0);
        string5.getClass();
        arrayList.add(string5);
        final ArrayList arrayListF0 = vwb.f0(new String[]{"A", "B", "O", "AB", "UNKNOWN"});
        arrayListF0.getClass();
        final cwf0 cwf0VarC = i0e.c("p_blood_type_dialog", Dialog.class.getName());
        i0e.f(cwf0VarC);
        htoVar.act().dialog().E0(R$string.f2858r0).e0(arrayList).g0(new Dialog.g() { // from class: l.gto
            /* JADX INFO: renamed from: a */
            public final void m15993a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                hto.m16326Z(arrayList, htoVar, arrayListF0, dialog, view2, i, charSequence);
            }
        }).k0(R$string.f2397c).V(new DialogInterface.OnDismissListener() { // from class: l.iso
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hto.m16328a0(cwf0VarC, dialogInterface);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: B */
    public static void m16320B() {
        zvf0.r("e_clone_cannot_change_gender_got_it", "p_clone_cannot_change_gender");
    }

    /* JADX INFO: renamed from: C */
    public static void m16321C(hto htoVar, DialogInterface dialogInterface) {
        i0e.e(htoVar.pageHelper);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: E */
    public static Unit m16322E(User user, final hto htoVar) {
        Settings settings = user.settings;
        settings.getClass();
        final List list = settings.settingGroups;
        if (vwb.J(list)) {
            VText vTextM16360L = htoVar.m16360L();
            vTextM16360L.getClass();
            vTextM16360L.setTextColor(hvc0.a(w0c0.f24672b0));
            xdl0.E0(htoVar.m16359K(), (View.OnClickListener) null);
        } else {
            list.getClass();
            Object obj = list.get(0);
            obj.getClass();
            if (((SettingGroups) obj).profile.birthChanged) {
                VText vTextM16360L2 = htoVar.m16360L();
                vTextM16360L2.getClass();
                vTextM16360L2.setTextColor(hvc0.a(w0c0.f24672b0));
                xdl0.E0(htoVar.m16359K(), (View.OnClickListener) null);
            } else {
                VText vTextM16360L3 = htoVar.m16360L();
                vTextM16360L3.getClass();
                vTextM16360L3.setTextColor(hvc0.a(w0c0.f24642R1));
                xdl0.E0(htoVar.m16359K(), new View.OnClickListener() { // from class: l.mso
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hto.m16339j0(list, htoVar, view);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static void m16323F(hto htoVar) {
        zvf0.r("e_clone_cannot_change_gender_concat_us", "p_clone_cannot_change_gender");
        new ukf0(htoVar.act).a();
    }

    /* JADX INFO: renamed from: X */
    public static final void m16324X(hto htoVar, String str) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m9035G0(str);
    }

    /* JADX INFO: renamed from: Y */
    public static final String m16325Y(Spannable spannable) {
        spannable.getClass();
        return yij0.L(spannable.toString());
    }

    /* JADX INFO: renamed from: Z */
    public static final void m16326Z(List list, hto htoVar, List list2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i < list.size()) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
            if (intlPersonalDetailsPresenter == null) {
                Intrinsics.r("presenter");
                intlPersonalDetailsPresenter = null;
            }
            intlPersonalDetailsPresenter.m9032C0(BloodType.get((String) list2.get(i)));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m16328a0(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m16329b(hto htoVar, View view) {
        zvf0.r("e_clone_show_gender_on_profile", "p_edit_basic_info_view");
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m9036H0(!htoVar.m16370V().isChecked());
        htoVar.m16370V().setChecked(!htoVar.m16370V().isChecked());
    }

    /* JADX INFO: renamed from: c */
    public static void m16330c(hto htoVar, View view) {
        htoVar.m16373c0();
    }

    /* JADX INFO: renamed from: d */
    public static void m16331d(hto htoVar, View view) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m9036H0(htoVar.m16370V().isChecked());
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m16332d0(hto htoVar, double d) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m9031A0(d);
    }

    /* JADX INFO: renamed from: e */
    public static void m16333e(final hto htoVar, View view) {
        i0e.b bVarD = i0e.d(htoVar.act).E(1).D(50);
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        bVarD.H(intlPersonalDetailsPresenter.m9040r0()).F(new e30() { // from class: l.nso
            public final void call(Object obj) {
                hto.m16324X(this.f17838a, (String) obj);
            }
        }).J(new w9j() { // from class: l.oso
            public final Object call(Object obj) {
                return hto.m16325Y((Spannable) obj);
            }
        }).n().show();
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m16334e0(hto htoVar) {
        htoVar.m16373c0();
    }

    /* JADX INFO: renamed from: i */
    public static void m16337i(hto htoVar) {
        VLinear vLinearM16359K = htoVar.m16359K();
        vLinearM16359K.getClass();
        vLinearM16359K.performClick();
    }

    /* JADX INFO: renamed from: j */
    public static void m16338j(hto htoVar, View view) {
        htoVar.m16374g0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j0 */
    public static final void m16339j0(List list, final hto htoVar, View view) {
        if (zb0.m28637d()) {
            zvf0.A("e_age_verify_edit_age", "p_edit_basic_info_view", new j760[]{vwb.Y("edit_failed_reason", "verify_pending")});
            lsi0.w(R$string.f1885L);
            return;
        }
        if (zb0.m28638e()) {
            zvf0.A("e_age_verify_edit_age", "p_edit_basic_info_view", new j760[]{vwb.Y("edit_failed_reason", "verify_succeed")});
            lsi0.w(R$string.f1855K);
        } else {
            if (vwb.J(list)) {
                return;
            }
            Object obj = list.get(0);
            obj.getClass();
            if (((SettingGroups) obj).profile.birthChanged) {
                return;
            }
            new dd80.a(htoVar.act).y0(htoVar.act.string(R$string.f2897s9)).t0(htoVar.act.string(R$string.f2867r9)).c0(htoVar.act.getString(R$string.f2807p9), new Runnable() { // from class: l.vso
                @Override // java.lang.Runnable
                public final void run() {
                    hto.m16341k0(this.f24446a);
                }
            }).P(true).r0();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m16341k0(hto htoVar) {
        htoVar.m16373c0();
    }

    /* JADX INFO: renamed from: l */
    public static void m16342l(hto htoVar) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m9044z0();
    }

    /* JADX INFO: renamed from: m */
    public static void m16343m(Boolean bool) {
    }

    /* JADX INFO: renamed from: s */
    public static void m16347s(hto htoVar, View view) {
        htoVar.act().onBackPressed();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w */
    public static void m16350w(final hto htoVar, final double d) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        if (d == intlPersonalDetailsPresenter.m9038p0()) {
            return;
        }
        new dd80.a(htoVar.act).y0(mqi0.b.format(Double.valueOf(d))).t0(htoVar.act.string(R$string.f2837q9)).c0(htoVar.act.getString(R$string.f2551h), new Runnable() { // from class: l.wso
            @Override // java.lang.Runnable
            public final void run() {
                hto.m16332d0(this.f25388a, d);
            }
        }).X(htoVar.act.string(R$string.f3067y), new Runnable() { // from class: l.xso
            @Override // java.lang.Runnable
            public final void run() {
                hto.m16334e0(this.f27710a);
            }
        }).P(true).r0();
        if (htoVar.isFormAgeFake) {
            Settings settings = CoreModule.f1534c.f3628e0.m21483na().settings;
            settings.getClass();
            if (d == settings.birthdate.doubleValue()) {
                return;
            }
            Act act = htoVar.act();
            Media media = (Media) CoreModule.f1534c.f3628e0.m21483na().pictures.get(0);
            Act act2 = htoVar.act();
            act2.getClass();
            ark.V0(act, false, media, act2.string(R$string.f2480el), new Runnable() { // from class: l.yso
                @Override // java.lang.Runnable
                public final void run() {
                    hto.m16336f0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public static Double m16351x(hto htoVar) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = htoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        return Double.valueOf(intlPersonalDetailsPresenter.m9038p0());
    }

    /* JADX INFO: renamed from: y */
    public static void m16352y(hto htoVar, View view) {
        htoVar.act().startActivityForResult(AddEmojiAct.m8599Z1(htoVar.m16354C0(), "personal_information"), 532);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m16354C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m16355G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = ito.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m16377i1(@NotNull IntlPersonalDetailsPresenter presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VLinear m16357I() {
        VLinear vLinear = this._add_emoji;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_add_emoji");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VDraweeView m16358J() {
        VDraweeView vDraweeView = this._add_emoji_emoji;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_add_emoji_emoji");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VLinear m16359K() {
        VLinear vLinear = this._birthdate;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_birthdate");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m16360L() {
        VText vText = this._birthdate_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_birthdate_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m16361M() {
        VLinear vLinear = this._blood_type;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_blood_type");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m16362N() {
        VText vText = this._blood_type_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_blood_type_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m16363O() {
        VLinear vLinear = this._full_name;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_full_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m16364P() {
        VText vText = this._full_name_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_full_name_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VProgressBar m16365Q() {
        VProgressBar vProgressBar = this._loading_block;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.r("_loading_block");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VLinear m16366R() {
        VLinear vLinear = this._my_gender;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_my_gender");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m16367S() {
        VText vText = this._my_gender_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_my_gender_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VNavigationBar m16368T() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VLinear m16369U() {
        VLinear vLinear = this._profile_type;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_profile_type");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VSwitch m16370V() {
        VSwitch vSwitch = this._profile_type_profile_check;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.r("_profile_type_profile_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VScroll m16371W() {
        VScroll vScroll = this._scroll;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.r("_scroll");
        return null;
    }

    @NotNull
    public Act act() {
        return this.act;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m16372b0() {
        VScroll vScrollM16371W = m16371W();
        vScrollM16371W.getClass();
        if (vScrollM16371W.getVisibility() == 4) {
            VScroll vScrollM16371W2 = m16371W();
            vScrollM16371W2.getClass();
            vScrollM16371W2.setVisibility(0);
            VProgressBar vProgressBarM16365Q = m16365Q();
            vProgressBarM16365Q.getClass();
            vProgressBarM16365Q.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m16373c0() {
        CoreDlg.I1(this.act, new v9j() { // from class: l.jso
            public final Object call() {
                return hto.m16351x(this.f15376a);
            }
        }, new e30() { // from class: l.kso
            public final void call(Object obj) {
                hto.m16350w(this.f15984a, ((Double) obj).doubleValue());
            }
        }, new e30() { // from class: l.lso
            public final void call(Object obj) {
                hto.m16343m((Boolean) obj);
            }
        });
        zvf0.x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g0 */
    public final void m16374g0() {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Settings settings2;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.presenter;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter3 = this.presenter;
        if (intlPersonalDetailsPresenter3 == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter3 = null;
        }
        User userM9039q0 = intlPersonalDetailsPresenter3.getEditingUser();
        if (intlPersonalDetailsPresenter.m9043y0((userM9039q0 == null || (settings2 = userM9039q0.settings) == null) ? null : settings2.getSettingGroup())) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter4 = this.presenter;
            if (intlPersonalDetailsPresenter4 == null) {
                Intrinsics.r("presenter");
            } else {
                intlPersonalDetailsPresenter2 = intlPersonalDetailsPresenter4;
            }
            User userM9039q1 = intlPersonalDetailsPresenter2.getEditingUser();
            ?? D = (userM9039q1 == null || (settings = userM9039q1.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) ? 0 : Intrinsics.d(intlMoreGender.canUpdate, Boolean.TRUE);
            zvf0.u("e_clone_edit_gender", "p_edit_basic_info_view", new j760[]{vwb.Y("if_can_edit_gender", Integer.valueOf((int) D))});
            if (D != 0) {
                new dd80.a(this.act).y0(this.act.string(R$string.f2751nf)).c0(this.act.getString(R$string.f2720mf), new Runnable() { // from class: l.qso
                    @Override // java.lang.Runnable
                    public final void run() {
                        hto.m16342l(this.f20044a);
                    }
                }).P(true).r0();
            } else {
                i0e.f(this.pageHelper);
                new dd80.a(this.act).y0(this.act.string(R$string.f2993vf)).t0(this.act.string(R$string.f2963uf)).c0(this.act.getString(R$string.f2933tf), new Runnable() { // from class: l.rso
                    @Override // java.lang.Runnable
                    public final void run() {
                        hto.m16320B();
                    }
                }).X(this.act.string(R$string.f2903sf), new Runnable() { // from class: l.tso
                    @Override // java.lang.Runnable
                    public final void run() {
                        hto.m16323F(this.f22266a);
                    }
                }).n0(new DialogInterface.OnDismissListener() { // from class: l.uso
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        hto.m16321C(this.f23731a, dialogInterface);
                    }
                }).P(true).r0();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m16375h0() {
        this.isFormAgeFake = true;
        e51.F(act(), new Runnable() { // from class: l.pso
            @Override // java.lang.Runnable
            public final void run() {
                hto.m16337i(this.f19286a);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: i0 */
    public final void m16376i0(@NotNull final User editingUser) {
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
        VLinear vLinearM16369U = m16369U();
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.presenter;
        String str = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        Settings settings2 = editingUser.settings;
        vLinearM16369U.setVisibility(intlPersonalDetailsPresenter.m9043y0(settings2 != null ? settings2.getSettingGroup() : null) ? 0 : 8);
        VSwitch vSwitchM16370V = m16370V();
        Settings settings3 = editingUser.settings;
        vSwitchM16370V.setChecked((settings3 == null || (settingGroup3 = settings3.getSettingGroup()) == null || (intlMoreGender3 = settingGroup3.gender) == null || (bool = intlMoreGender3.showOnProfile) == null) ? false : bool.booleanValue());
        Gender gender = editingUser.gender;
        gender.getClass();
        Settings settings4 = editingUser.settings;
        if (settings4 == null || (settingGroup2 = settings4.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null || (intlGender = intlMoreGender2.newGender) == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = this.presenter;
        if (intlPersonalDetailsPresenter2 == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter2 = null;
        }
        Settings settings5 = editingUser.settings;
        if (!intlPersonalDetailsPresenter2.m9043y0(settings5 != null ? settings5.getSettingGroup() : null) || TEnum.equals(intlGender, IntlGender.get("unknown_"))) {
            intlGender = IntlGender.get(gender.toString());
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter3 = this.presenter;
        if (intlPersonalDetailsPresenter3 == null) {
            Intrinsics.r("presenter");
            intlPersonalDetailsPresenter3 = null;
        }
        Settings settings6 = editingUser.settings;
        if (intlPersonalDetailsPresenter3.m9043y0(settings6 != null ? settings6.getSettingGroup() : null) && (settings = editingUser.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
            str = intlMoreGender.subGender;
        }
        m16367S().setText(qib0.f19804b0.f17706a.mo52Lr(intlGender, str));
        m16364P().setText(editingUser.name);
        VText vTextM16360L = m16360L();
        SimpleDateFormat simpleDateFormat = mqi0.b;
        Settings settings7 = editingUser.settings;
        settings7.getClass();
        vTextM16360L.setText(simpleDateFormat.format(settings7.birthdate));
        if (!vwb.J(editingUser.profile.extensions.physical.bloodType)) {
            m16362N().setText(b43.m12518a((BloodType) editingUser.profile.extensions.physical.bloodType.get(0)));
        }
        new Function0() { // from class: l.hso
            public final Object invoke() {
                return hto.m16322E(editingUser, this);
            }
        };
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m16355G(inflater, parent);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m16378l0() {
        xdl0.M(m16357I(), false);
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (vwb.J(userM21490p9.profile.extensions.interest.emoji)) {
            m16358J().setImageResource(x2c0.f27307z8);
            return;
        }
        qib0.f19782G.m12744L0(m16358J(), qib0.f19800X.m15799n((String) userM21490p9.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: r */
    public final void m16379r() {
        m16368T().getLeftIconContainer().setBackgroundResource(x2c0.f26978p);
        m16368T().setTitle(R$string.f3121zn);
        m16368T().setLeftIconOnClick(new View.OnClickListener() { // from class: l.sso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16347s(this.f21640a, view);
            }
        });
        m16363O().setOnClickListener(new View.OnClickListener() { // from class: l.zso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16333e(this.f28959a, view);
            }
        });
        xdl0.E0(m16369U(), new View.OnClickListener() { // from class: l.ato
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16329b(this.f8510a, view);
            }
        });
        xdl0.E0(m16370V(), new View.OnClickListener() { // from class: l.bto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16331d(this.f9086a, view);
            }
        });
        m16359K().setOnClickListener(new View.OnClickListener() { // from class: l.cto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16330c(this.f9838a, view);
            }
        });
        m16366R().setOnClickListener(new View.OnClickListener() { // from class: l.dto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16338j(this.f10564a, view);
            }
        });
        xdl0.M0(m16361M(), b43.m12519b());
        m16361M().setOnClickListener(new View.OnClickListener() { // from class: l.eto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16319A(this.f11448a, view);
            }
        });
        m16378l0();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.fto
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hto.m16352y(this.f12903a, view);
            }
        };
        VLinear vLinearM16357I = m16357I();
        vLinearM16357I.getClass();
        vLinearM16357I.setOnClickListener(onClickListener);
        VDraweeView vDraweeViewM16358J = m16358J();
        vDraweeViewM16358J.getClass();
        vDraweeViewM16358J.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m16336f0() {
    }

    public void destroy() {
    }
}
