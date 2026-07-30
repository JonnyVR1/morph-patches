package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.settings.IntlPersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.addemoji.AddEmojiAct;
import com.p051p1.mobile.putong.core.p058ui.settings.personaldetails.IntlPersonalDetailsPresenter;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0004\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\tJ\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\tJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\tJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010+\u001a\u0004\bJ\u0010-\"\u0004\bK\u0010/R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010+\u001a\u0004\bV\u0010-\"\u0004\bW\u0010/R\"\u0010\\\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010Q\"\u0004\b[\u0010SR\"\u0010`\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010+\u001a\u0004\b^\u0010-\"\u0004\b_\u0010/R\"\u0010d\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010O\u001a\u0004\bb\u0010Q\"\u0004\bc\u0010SR\"\u0010h\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010+\u001a\u0004\bf\u0010-\"\u0004\bg\u0010/R\"\u0010l\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010O\u001a\u0004\bj\u0010Q\"\u0004\bk\u0010SR\"\u0010p\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010+\u001a\u0004\bn\u0010-\"\u0004\bo\u0010/R\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010+\u001a\u0004\bz\u0010-\"\u0004\b{\u0010/R#\u0010\u0080\u0001\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010O\u001a\u0004\b~\u0010Q\"\u0004\b\u007f\u0010SR)\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u001c\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0093\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008c\u0001\u001a\u0006\b\u0093\u0001\u0010\u008e\u0001\"\u0006\b\u0094\u0001\u0010\u0090\u0001R\"\u0010\u0099\u0001\u001a\r \u0096\u0001*\u0005\u0018\u00010\u0095\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009a\u0001"}, m88121d2 = {"Ll/hvo;", "Ll/iam;", "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;)V", "", "c0", "()V", "g0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "H", "(Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "r", "h0", "l0", "b0", "Lcom/p1/mobile/putong/data/User;", "editingUser", "i0", "(Lcom/p1/mobile/putong/data/User;)V", "a", "Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/settings/IntlPersonalDetailsAct;", "setAct", "Lv/VLinear;", "b", "Lv/VLinear;", "get_root", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", p7f.GPS_DIRECTION_TRUE, "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VProgressBar;", Constants.INAPP_DATA_TAG, "Lv/VProgressBar;", "Q", "()Lv/VProgressBar;", "set_loading_block", "(Lv/VProgressBar;)V", "_loading_block", "Lv/VScroll;", "e", "Lv/VScroll;", "W", "()Lv/VScroll;", "set_scroll", "(Lv/VScroll;)V", "_scroll", "f", BloodType.f39576O, "set_full_name", "_full_name", "Lv/VText;", "g", "Lv/VText;", "P", "()Lv/VText;", "set_full_name_text", "(Lv/VText;)V", "_full_name_text", "h", "K", "set_birthdate", "_birthdate", RXScreenCaptureService.KEY_INDEX, "L", "set_birthdate_text", "_birthdate_text", "j", "R", "set_my_gender", "_my_gender", "k", p7f.LATITUDE_SOUTH, "set_my_gender_text", "_my_gender_text", BLiveStormDanmakuGiftResourceType.f45292l, "M", "set_blood_type", "_blood_type", "m", "N", "set_blood_type_text", "_blood_type_text", "n", "U", "set_profile_type", "_profile_type", "Lv/VSwitch;", "o", "Lv/VSwitch;", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Lv/VSwitch;", "set_profile_type_profile_check", "(Lv/VSwitch;)V", "_profile_type_profile_check", "p", "I", "set_add_emoji", "_add_emoji", "q", "get_add_emoji_text", "set_add_emoji_text", "_add_emoji_text", "Lv/VDraweeView;", "Lv/VDraweeView;", "J", "()Lv/VDraweeView;", "set_add_emoji_emoji", "(Lv/VDraweeView;)V", "_add_emoji_emoji", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/ui/settings/personaldetails/IntlPersonalDetailsPresenter;", "", Constants.KEY_T, "Z", "getFirstGenderChange", "()Z", "setFirstGenderChange", "(Z)V", "firstGenderChange", "u", "isFormAgeFake", "setFormAgeFake", "Ll/l4g0;", "kotlin.jvm.PlatformType", ResourceDirection.f39656v, "Ll/l4g0;", "pageHelper", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class hvo implements iam<IntlPersonalDetailsPresenter> {

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
    public final l4g0 pageHelper;

    public hvo(@NotNull IntlPersonalDetailsAct intlPersonalDetailsAct) {
        intlPersonalDetailsAct.getClass();
        this.act = intlPersonalDetailsAct;
        this.firstGenderChange = true;
        this.pageHelper = w1e.m204399c("p_clone_cannot_change_gender", Dialog.class.getName());
    }

    /* JADX INFO: renamed from: A */
    public static void m137327A(final hvo hvoVar, View view) {
        final ArrayList arrayList = new ArrayList();
        Act act = hvoVar.getAct();
        act.getClass();
        String string = act.getResources().getString(R$string.f19632s0);
        string.getClass();
        arrayList.add(string);
        Act act2 = hvoVar.getAct();
        act2.getClass();
        String string2 = act2.getResources().getString(R$string.f19694u0);
        string2.getClass();
        arrayList.add(string2);
        Act act3 = hvoVar.getAct();
        act3.getClass();
        String string3 = act3.getResources().getString(R$string.f19725v0);
        string3.getClass();
        arrayList.add(string3);
        Act act4 = hvoVar.getAct();
        act4.getClass();
        String string4 = act4.getResources().getString(R$string.f19663t0);
        string4.getClass();
        arrayList.add(string4);
        Act act5 = hvoVar.getAct();
        act5.getClass();
        String string5 = act5.getResources().getString(R$string.f19756w0);
        string5.getClass();
        arrayList.add(string5);
        final ArrayList arrayListM147507f0 = jyb.m147507f0("A", "B", BloodType.f39576O, BloodType.f39574AB, "UNKNOWN");
        arrayListM147507f0.getClass();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_blood_type_dialog", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        hvoVar.getAct().dialog().m21502E0(R$string.f19601r0).m21534e0(arrayList).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.gvo
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                hvo.m137334Z(arrayList, hvoVar, arrayListM147507f0, dialog, view2, i, charSequence);
            }
        }).m21540k0(R$string.f19138c).m21525V(new DialogInterface.OnDismissListener() { // from class: l.iuo
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hvo.m137336a0(l4g0VarM204399c, dialogInterface);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: B */
    public static void m137328B() {
        i4g0.m138520r("e_clone_cannot_change_gender_got_it", "p_clone_cannot_change_gender");
    }

    /* JADX INFO: renamed from: C */
    public static void m137329C(hvo hvoVar, DialogInterface dialogInterface) {
        w1e.m204401e(hvoVar.pageHelper);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: E */
    public static Unit m137330E(User user, final hvo hvoVar) {
        Settings settings = user.settings;
        settings.getClass();
        final List<SettingGroups> list = settings.settingGroups;
        if (jyb.m147479J(list)) {
            VText vTextM137367L = hvoVar.m137367L();
            vTextM137367L.getClass();
            vTextM137367L.setTextColor(k3d0.m148005a(c9c0.f80405c0));
            bnl0.m105509E0(hvoVar.m137366K(), null);
        } else {
            list.getClass();
            SettingGroups settingGroups = list.get(0);
            settingGroups.getClass();
            if (settingGroups.profile.birthChanged) {
                VText vTextM137367L2 = hvoVar.m137367L();
                vTextM137367L2.getClass();
                vTextM137367L2.setTextColor(k3d0.m148005a(c9c0.f80405c0));
                bnl0.m105509E0(hvoVar.m137366K(), null);
            } else {
                VText vTextM137367L3 = hvoVar.m137367L();
                vTextM137367L3.getClass();
                vTextM137367L3.setTextColor(k3d0.m148005a(c9c0.f80374S1));
                bnl0.m105509E0(hvoVar.m137366K(), new View.OnClickListener() { // from class: l.muo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        hvo.m137347j0(list, hvoVar, view);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static void m137331F(hvo hvoVar) {
        i4g0.m138520r("e_clone_cannot_change_gender_concat_us", "p_clone_cannot_change_gender");
        new dtf0(hvoVar.act).m117853a();
    }

    /* JADX INFO: renamed from: X */
    public static final void m137332X(hvo hvoVar, String str) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m56823G0(str);
    }

    /* JADX INFO: renamed from: Y */
    public static final String m137333Y(Spannable spannable) {
        spannable.getClass();
        return bsj0.m106254L(spannable.toString());
    }

    /* JADX INFO: renamed from: Z */
    public static final void m137334Z(List list, hvo hvoVar, List list2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i < list.size()) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
            if (intlPersonalDetailsPresenter == null) {
                Intrinsics.m88391r("presenter");
                intlPersonalDetailsPresenter = null;
            }
            intlPersonalDetailsPresenter.m56820C0(BloodType.get((String) list2.get(i)));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m137336a0(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m137337b(hvo hvoVar, View view) {
        i4g0.m138520r("e_clone_show_gender_on_profile", "p_edit_basic_info_view");
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m56824H0(!hvoVar.m137377V().isChecked());
        hvoVar.m137377V().setChecked(!hvoVar.m137377V().isChecked());
    }

    /* JADX INFO: renamed from: c */
    public static void m137338c(hvo hvoVar, View view) {
        hvoVar.m137380c0();
    }

    /* JADX INFO: renamed from: d */
    public static void m137339d(hvo hvoVar, View view) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m56824H0(hvoVar.m137377V().isChecked());
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m137340d0(hvo hvoVar, double d) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m56819A0(d);
    }

    /* JADX INFO: renamed from: e */
    public static void m137341e(final hvo hvoVar, View view) {
        w1e.C20993b c20993bM204419D = w1e.m204400d(hvoVar.act).m204420E(1).m204419D(50);
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        c20993bM204419D.m204423H(intlPersonalDetailsPresenter.m56827r0()).m204421F(new y20() { // from class: l.nuo
            @Override // p153l.y20
            public final void call(Object obj) {
                hvo.m137332X(this.f143723a, (String) obj);
            }
        }).m204425J(new qcj() { // from class: l.ouo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hvo.m137333Y((Spannable) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m137342e0(hvo hvoVar) {
        hvoVar.m137380c0();
    }

    /* JADX INFO: renamed from: i */
    public static void m137345i(hvo hvoVar) {
        VLinear vLinearM137366K = hvoVar.m137366K();
        vLinearM137366K.getClass();
        vLinearM137366K.performClick();
    }

    /* JADX INFO: renamed from: j */
    public static void m137346j(hvo hvoVar, View view) {
        hvoVar.m137381g0();
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m137347j0(List list, final hvo hvoVar, View view) {
        if (vb0.m200642d()) {
            i4g0.m138492A("e_age_verify_edit_age", "p_edit_basic_info_view", jyb.m147494Y("edit_failed_reason", "verify_pending"));
            o1j0.m165649w(R$string.f18626L);
            return;
        }
        if (vb0.m200643e()) {
            i4g0.m138492A("e_age_verify_edit_age", "p_edit_basic_info_view", jyb.m147494Y("edit_failed_reason", "verify_succeed"));
            o1j0.m165649w(R$string.f18595K);
        } else {
            if (jyb.m147479J(list)) {
                return;
            }
            Object obj = list.get(0);
            obj.getClass();
            if (((SettingGroups) obj).profile.birthChanged) {
                return;
            }
            new jl80.C17971a(hvoVar.act).m146056y0(hvoVar.act.string(R$string.f19827y9)).m146051t0(hvoVar.act.string(R$string.f19796x9)).m146034c0(hvoVar.act.getString(R$string.f19734v9), new Runnable() { // from class: l.vuo
                @Override // java.lang.Runnable
                public final void run() {
                    hvo.m137349k0(this.f185825a);
                }
            }).m146021P(true).m146049r0();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m137349k0(hvo hvoVar) {
        hvoVar.m137380c0();
    }

    /* JADX INFO: renamed from: l */
    public static void m137350l(hvo hvoVar) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        intlPersonalDetailsPresenter.m56831z0();
    }

    /* JADX INFO: renamed from: m */
    public static void m137351m(Boolean bool) {
    }

    /* JADX INFO: renamed from: s */
    public static void m137355s(hvo hvoVar, View view) {
        hvoVar.getAct().onBackPressed();
    }

    /* JADX INFO: renamed from: w */
    public static void m137358w(final hvo hvoVar, final double d) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        if (d == intlPersonalDetailsPresenter.m56825p0()) {
            return;
        }
        new jl80.C17971a(hvoVar.act).m146056y0(pzi0.f154855b.format(Double.valueOf(d))).m146051t0(hvoVar.act.string(R$string.f19765w9)).m146034c0(hvoVar.act.getString(R$string.f19292h), new Runnable() { // from class: l.wuo
            @Override // java.lang.Runnable
            public final void run() {
                hvo.m137340d0(this.f190878a, d);
            }
        }).m146029X(hvoVar.act.string(R$string.f19817y), new Runnable() { // from class: l.xuo
            @Override // java.lang.Runnable
            public final void run() {
                hvo.m137342e0(this.f196300a);
            }
        }).m146021P(true).m146049r0();
        if (hvoVar.isFormAgeFake) {
            Settings settings = CoreModule.f18264c.f20381e0.m116593na().settings;
            settings.getClass();
            if (d == settings.birthdate.doubleValue()) {
                return;
            }
            Act act = hvoVar.getAct();
            Media media = CoreModule.f18264c.f20381e0.m116593na().pictures.get(0);
            Act act2 = hvoVar.getAct();
            act2.getClass();
            qtk.m178003V0(act, false, media, act2.string(R$string.f18307Al), new Runnable() { // from class: l.yuo
                @Override // java.lang.Runnable
                public final void run() {
                    hvo.m137344f0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public static Double m137359x(hvo hvoVar) {
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = hvoVar.presenter;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        return Double.valueOf(intlPersonalDetailsPresenter.m56825p0());
    }

    /* JADX INFO: renamed from: y */
    public static void m137360y(hvo hvoVar, View view) {
        hvoVar.getAct().startActivityForResult(AddEmojiAct.m56413a2(hvoVar.getContext(), "personal_information"), 532);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m137362G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM142346b = ivo.m142346b(this, inflater, parent);
        viewM142346b.getClass();
        return viewM142346b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull IntlPersonalDetailsPresenter presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final VLinear m137364I() {
        VLinear vLinear = this._add_emoji;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_add_emoji");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VDraweeView m137365J() {
        VDraweeView vDraweeView = this._add_emoji_emoji;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_add_emoji_emoji");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VLinear m137366K() {
        VLinear vLinear = this._birthdate;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_birthdate");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m137367L() {
        VText vText = this._birthdate_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_birthdate_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VLinear m137368M() {
        VLinear vLinear = this._blood_type;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_blood_type");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m137369N() {
        VText vText = this._blood_type_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_blood_type_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VLinear m137370O() {
        VLinear vLinear = this._full_name;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_full_name");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VText m137371P() {
        VText vText = this._full_name_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_full_name_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VProgressBar m137372Q() {
        VProgressBar vProgressBar = this._loading_block;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m88391r("_loading_block");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VLinear m137373R() {
        VLinear vLinear = this._my_gender;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_my_gender");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m137374S() {
        VText vText = this._my_gender_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_my_gender_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final VNavigationBar m137375T() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final VLinear m137376U() {
        VLinear vLinear = this._profile_type;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_profile_type");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final VSwitch m137377V() {
        VSwitch vSwitch = this._profile_type_profile_check;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.m88391r("_profile_type_profile_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final VScroll m137378W() {
        VScroll vScroll = this._scroll;
        if (vScroll != null) {
            return vScroll;
        }
        Intrinsics.m88391r("_scroll");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m137379b0() {
        VScroll vScrollM137378W = m137378W();
        vScrollM137378W.getClass();
        if (vScrollM137378W.getVisibility() == 4) {
            VScroll vScrollM137378W2 = m137378W();
            vScrollM137378W2.getClass();
            vScrollM137378W2.setVisibility(0);
            VProgressBar vProgressBarM137372Q = m137372Q();
            vProgressBarM137372Q.getClass();
            vProgressBarM137372Q.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m137380c0() {
        CoreDlg.m46176I1(this.act, new pcj() { // from class: l.juo
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hvo.m137359x(this.f122729a);
            }
        }, new y20() { // from class: l.kuo
            @Override // p153l.y20
            public final void call(Object obj) {
                hvo.m137358w(this.f128911a, ((Double) obj).doubleValue());
            }
        }, new y20() { // from class: l.luo
            @Override // p153l.y20
            public final void call(Object obj) {
                hvo.m137351m((Boolean) obj);
            }
        });
        i4g0.m138526x("e_edit_basic_info_calendar", "p_edit_basic_info_view");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX INFO: renamed from: g0 */
    public final void m137381g0() {
        Settings settings;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        Settings settings2;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.presenter;
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter3 = this.presenter;
        if (intlPersonalDetailsPresenter3 == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter3 = null;
        }
        User editingUser = intlPersonalDetailsPresenter3.getEditingUser();
        if (intlPersonalDetailsPresenter.m56830y0((editingUser == null || (settings2 = editingUser.settings) == null) ? null : settings2.getSettingGroup())) {
            IntlPersonalDetailsPresenter intlPersonalDetailsPresenter4 = this.presenter;
            if (intlPersonalDetailsPresenter4 == null) {
                Intrinsics.m88391r("presenter");
            } else {
                intlPersonalDetailsPresenter2 = intlPersonalDetailsPresenter4;
            }
            User editingUser2 = intlPersonalDetailsPresenter2.getEditingUser();
            ?? M88377d = (editingUser2 == null || (settings = editingUser2.settings) == null || (settingGroup = settings.getSettingGroup()) == null || (intlMoreGender = settingGroup.gender) == null) ? 0 : Intrinsics.m88377d(intlMoreGender.canUpdate, Boolean.TRUE);
            i4g0.m138523u("e_clone_edit_gender", "p_edit_basic_info_view", jyb.m147494Y("if_can_edit_gender", Integer.valueOf((int) M88377d)));
            if (M88377d != 0) {
                new jl80.C17971a(this.act).m146056y0(this.act.string(R$string.f18456Ff)).m146034c0(this.act.getString(R$string.f18425Ef), new Runnable() { // from class: l.quo
                    @Override // java.lang.Runnable
                    public final void run() {
                        hvo.m137350l(this.f159594a);
                    }
                }).m146021P(true).m146049r0();
            } else {
                w1e.m204402f(this.pageHelper);
                new jl80.C17971a(this.act).m146056y0(this.act.string(R$string.f18702Nf)).m146051t0(this.act.string(R$string.f18672Mf)).m146034c0(this.act.getString(R$string.f18642Lf), new Runnable() { // from class: l.ruo
                    @Override // java.lang.Runnable
                    public final void run() {
                        hvo.m137328B();
                    }
                }).m146029X(this.act.string(R$string.f18611Kf), new Runnable() { // from class: l.tuo
                    @Override // java.lang.Runnable
                    public final void run() {
                        hvo.m137331F(this.f176201a);
                    }
                }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.uuo
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        hvo.m137329C(this.f181084a, dialogInterface);
                    }
                }).m146021P(true).m146049r0();
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m137382h0() {
        this.isFormAgeFake = true;
        l51.m152886F(getAct(), new Runnable() { // from class: l.puo
            @Override // java.lang.Runnable
            public final void run() {
                hvo.m137345i(this.f154207a);
            }
        });
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: i0 */
    public final void m137383i0(@NotNull final User editingUser) {
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
        VLinear vLinearM137376U = m137376U();
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter = this.presenter;
        String str = null;
        if (intlPersonalDetailsPresenter == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter = null;
        }
        Settings settings2 = editingUser.settings;
        vLinearM137376U.setVisibility(intlPersonalDetailsPresenter.m56830y0(settings2 != null ? settings2.getSettingGroup() : null) ? 0 : 8);
        VSwitch vSwitchM137377V = m137377V();
        Settings settings3 = editingUser.settings;
        vSwitchM137377V.setChecked((settings3 == null || (settingGroup3 = settings3.getSettingGroup()) == null || (intlMoreGender3 = settingGroup3.gender) == null || (bool = intlMoreGender3.showOnProfile) == null) ? false : bool.booleanValue());
        Gender gender = editingUser.gender;
        gender.getClass();
        Settings settings4 = editingUser.settings;
        if (settings4 == null || (settingGroup2 = settings4.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null || (intlGender = intlMoreGender2.newGender) == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter2 = this.presenter;
        if (intlPersonalDetailsPresenter2 == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter2 = null;
        }
        Settings settings5 = editingUser.settings;
        if (!intlPersonalDetailsPresenter2.m56830y0(settings5 != null ? settings5.getSettingGroup() : null) || TEnum.equals(intlGender, IntlGender.get("unknown_"))) {
            intlGender = IntlGender.get(gender.toString());
        }
        IntlPersonalDetailsPresenter intlPersonalDetailsPresenter3 = this.presenter;
        if (intlPersonalDetailsPresenter3 == null) {
            Intrinsics.m88391r("presenter");
            intlPersonalDetailsPresenter3 = null;
        }
        Settings settings6 = editingUser.settings;
        if (intlPersonalDetailsPresenter3.m56830y0(settings6 != null ? settings6.getSettingGroup() : null) && (settings = editingUser.settings) != null && (settingGroup = settings.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
            str = intlMoreGender.subGender;
        }
        m137374S().setText(uqb0.f180396b0.f170324a.mo29156Lr(intlGender, str));
        m137371P().setText(editingUser.name);
        VText vTextM137367L = m137367L();
        SimpleDateFormat simpleDateFormat = pzi0.f154855b;
        Settings settings7 = editingUser.settings;
        settings7.getClass();
        vTextM137367L.setText(simpleDateFormat.format(settings7.birthdate));
        if (!jyb.m147479J(editingUser.profile.extensions.physical.bloodType)) {
            m137369N().setText(r43.m179738a(editingUser.profile.extensions.physical.bloodType.get(0)));
        }
        new Function0() { // from class: l.huo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hvo.m137330E(editingUser, this);
            }
        };
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m137362G(inflater, parent);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m137384l0() {
        bnl0.m105524M(m137364I(), false);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (jyb.m147479J(userM116600p9.profile.extensions.interest.emoji)) {
            m137365J().setImageResource(dbc0.f85985A8);
            return;
        }
        uqb0.f180374G.m127115L0(m137365J(), uqb0.f180392X.m135325n(userM116600p9.profile.extensions.interest.emoji.get(0)) + ".png");
    }

    /* JADX INFO: renamed from: r */
    public final void m137385r() {
        m137375T().getLeftIconContainer().setBackgroundResource(dbc0.f87333q);
        m137375T().setTitle(R$string.f18950Vn);
        m137375T().setLeftIconOnClick(new View.OnClickListener() { // from class: l.suo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137355s(this.f170703a, view);
            }
        });
        m137370O().setOnClickListener(new View.OnClickListener() { // from class: l.zuo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137341e(this.f206144a, view);
            }
        });
        bnl0.m105509E0(m137376U(), new View.OnClickListener() { // from class: l.avo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137337b(this.f73633a, view);
            }
        });
        bnl0.m105509E0(m137377V(), new View.OnClickListener() { // from class: l.bvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137339d(this.f78614a, view);
            }
        });
        m137366K().setOnClickListener(new View.OnClickListener() { // from class: l.cvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137338c(this.f84021a, view);
            }
        });
        m137373R().setOnClickListener(new View.OnClickListener() { // from class: l.dvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137346j(this.f90936a, view);
            }
        });
        bnl0.m105525M0(m137368M(), r43.m179739b());
        m137368M().setOnClickListener(new View.OnClickListener() { // from class: l.evo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137327A(this.f96016a, view);
            }
        });
        m137384l0();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.fvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hvo.m137360y(this.f101054a, view);
            }
        };
        VLinear vLinearM137364I = m137364I();
        vLinearM137364I.getClass();
        vLinearM137364I.setOnClickListener(onClickListener);
        VDraweeView vDraweeViewM137365J = m137365J();
        vDraweeViewM137365J.getClass();
        vDraweeViewM137365J.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m137344f0() {
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
