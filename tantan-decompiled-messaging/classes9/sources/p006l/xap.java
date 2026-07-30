package p006l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlMoreGender;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.s7m;
import l.xdl0;
import l.yap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VCheckBox;
import v.VLinear;
import v.VSwitch;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R\"\u0010O\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R\"\u0010S\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\"\u0010W\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\"\u0010[\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<\"\u0004\bZ\u0010>R\"\u0010_\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\"\u0010b\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\"\u0010e\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010:\u001a\u0004\bc\u0010<\"\u0004\bd\u0010>R\"\u0010h\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010B\u001a\u0004\bf\u0010D\"\u0004\bg\u0010FR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010s\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\bq\u0010<\"\u0004\br\u0010>R\"\u0010v\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010:\u001a\u0004\bt\u0010<\"\u0004\bu\u0010>R\"\u0010}\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R'\u0010\u0084\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\bC\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010\u0087\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0087\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010\u0087\u0001¨\u0006\u008f\u0001"}, d2 = {"Ll/xap;", "Ll/s7m;", "Ll/nap;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/SettingGroups;", "data", "", "E", "(Lcom/p1/mobile/putong/data/SettingGroups;)V", "p", "()V", "n", "F", "", "C", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "l", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "m", "(Ll/nap;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "B", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", "x", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "get_gender_man", "()Lv/VLinear;", "set_gender_man", "(Lv/VLinear;)V", "_gender_man", "Lv/VText;", "d", "Lv/VText;", "get_gender_man_show_profile_text", "()Lv/VText;", "set_gender_man_show_profile_text", "(Lv/VText;)V", "_gender_man_show_profile_text", "Lv/VCheckBox;", "e", "Lv/VCheckBox;", "s", "()Lv/VCheckBox;", "set_gender_man_gender_man_check", "(Lv/VCheckBox;)V", "_gender_man_gender_man_check", "f", "get_gender_woman", "set_gender_woman", "_gender_woman", "g", "get_gender_woman_gender_woman_text", "set_gender_woman_gender_woman_text", "_gender_woman_gender_woman_text", "h", "w", "set_gender_woman_gender_woman_check", "_gender_woman_gender_woman_check", "i", "u", "set_gender_nonbinary", "_gender_nonbinary", "j", "get_gender_nonbinary_gender_nonbinary_text", "set_gender_nonbinary_gender_nonbinary_text", "_gender_nonbinary_gender_nonbinary_text", "k", "v", "set_gender_nonbinary_gender_nonbinary_check", "_gender_nonbinary_gender_nonbinary_check", "get_gender_everyone", "set_gender_everyone", "_gender_everyone", "get_gender_everyone_gender_everyone_text", "set_gender_everyone_gender_everyone_text", "_gender_everyone_gender_everyone_text", "q", "set_gender_everyone_gender_everyone_check", "_gender_everyone_gender_everyone_check", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "z", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_show_cis", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_show_cis", "get_show_cis_show_cis_title", "set_show_cis_show_cis_title", "_show_cis_show_cis_title", "get_show_cis_show_cis_desc", "set_show_cis_show_cis_desc", "_show_cis_show_cis_desc", "Lv/VSwitch;", "Lv/VSwitch;", "A", "()Lv/VSwitch;", "set_show_cis_show_cis_switch", "(Lv/VSwitch;)V", "_show_cis_show_cis_switch", "Lv/VButton;", "Lv/VButton;", "y", "()Lv/VButton;", "set_save_", "(Lv/VButton;)V", "_save_", "t", "Ll/nap;", "Z", "lookingForMan", "lookingForWoman", "lookingForNonBinary", "lookingForEveryone", "Lcom/p1/mobile/putong/data/SettingGroups;", "_data", "moreGenderEnable", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class xap implements s7m<nap> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _gender_man;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _gender_man_show_profile_text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VCheckBox _gender_man_gender_man_check;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _gender_woman;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _gender_woman_gender_woman_text;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VCheckBox _gender_woman_gender_woman_check;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _gender_nonbinary;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _gender_nonbinary_gender_nonbinary_text;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VCheckBox _gender_nonbinary_gender_nonbinary_check;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VLinear _gender_everyone;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _gender_everyone_gender_everyone_text;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VCheckBox _gender_everyone_gender_everyone_check;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ConstraintLayout _show_cis;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VText _show_cis_show_cis_title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _show_cis_show_cis_desc;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VSwitch _show_cis_show_cis_switch;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VButton _save_;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public nap presenter;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean lookingForMan;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean lookingForWoman;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean lookingForNonBinary;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean lookingForEveryone;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public SettingGroups _data;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean moreGenderEnable;

    public xap(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m27162a(xap xapVar, View view) {
        xapVar.act.finish();
    }

    /* JADX INFO: renamed from: b */
    public static void m27163b(xap xapVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xapVar.lookingForNonBinary = z;
        xapVar.m27181p();
    }

    /* JADX INFO: renamed from: c */
    public static void m27164c(xap xapVar, View view) {
        xapVar.m27176F();
    }

    /* JADX INFO: renamed from: d */
    public static void m27165d(xap xapVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xapVar.m27182q().setEnabled(!z);
        xapVar.lookingForEveryone = z;
        xapVar.m27180n();
        if (z) {
            xapVar.m27184s().setChecked(false);
            xapVar.m27187w().setChecked(false);
            xapVar.m27186v().setChecked(false);
        } else {
            xapVar.m27184s().setEnabled(!xapVar.m27184s().isChecked());
            xapVar.m27187w().setEnabled(!xapVar.m27187w().isChecked());
            xapVar.m27186v().setEnabled(!xapVar.m27186v().isChecked());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27166e(xap xapVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xapVar.lookingForMan = z;
        xapVar.m27181p();
    }

    /* JADX INFO: renamed from: f */
    public static void m27167f(xap xapVar, View view) {
        xapVar.m27176F();
    }

    /* JADX INFO: renamed from: i */
    public static void m27168i(xap xapVar, View view) {
        LookingFor lookingFor;
        List listBuild;
        SettingGroups settingGroups = null;
        if (xapVar.moreGenderEnable) {
            if (xapVar.lookingForEveryone) {
                listBuild = CollectionsKt.listOf(new LookingFor[]{LookingFor.get("male"), LookingFor.get("female"), LookingFor.get("nonbinary")});
            } else {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                if (xapVar.lookingForMan) {
                    LookingFor lookingFor2 = LookingFor.get("male");
                    lookingFor2.getClass();
                    listCreateListBuilder.add(lookingFor2);
                }
                if (xapVar.lookingForWoman) {
                    LookingFor lookingFor3 = LookingFor.get("female");
                    lookingFor3.getClass();
                    listCreateListBuilder.add(lookingFor3);
                }
                if (xapVar.lookingForNonBinary) {
                    LookingFor lookingFor4 = LookingFor.get("nonbinary");
                    lookingFor4.getClass();
                    listCreateListBuilder.add(lookingFor4);
                }
                listBuild = CollectionsKt.build(listCreateListBuilder);
            }
            SettingGroups settingGroups2 = xapVar._data;
            if (settingGroups2 == null) {
                Intrinsics.r("_data");
                settingGroups2 = null;
            }
            IntlMoreGender intlMoreGender = settingGroups2.gender;
            if (intlMoreGender != null) {
                intlMoreGender.lookingForGenders = listBuild;
            }
            SettingGroups settingGroups3 = xapVar._data;
            if (settingGroups3 == null) {
                Intrinsics.r("_data");
                settingGroups3 = null;
            }
            IntlMoreGender intlMoreGender2 = settingGroups3.gender;
            if (intlMoreGender2 != null) {
                intlMoreGender2.notShowCis = Boolean.valueOf(!xapVar.m27171A().isChecked());
            }
        } else {
            SettingGroups settingGroups4 = xapVar._data;
            if (settingGroups4 == null) {
                Intrinsics.r("_data");
                settingGroups4 = null;
            }
            UserSearchSettings userSearchSettings = settingGroups4.search;
            if (xapVar.m27184s().isChecked()) {
                lookingFor = LookingFor.get("male");
            } else if (xapVar.m27187w().isChecked()) {
                lookingFor = LookingFor.get("female");
            } else {
                lookingFor = xapVar.m27182q().isChecked() ? LookingFor.get("both") : LookingFor.get("both");
            }
            userSearchSettings.lookingForGender = lookingFor;
        }
        nap napVar = xapVar.presenter;
        if (napVar != null) {
            SettingGroups settingGroups5 = xapVar._data;
            if (settingGroups5 == null) {
                Intrinsics.r("_data");
            } else {
                settingGroups = settingGroups5;
            }
            napVar.m19996h0(settingGroups);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m27169j(xap xapVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xapVar.lookingForWoman = z;
        xapVar.m27181p();
    }

    /* JADX INFO: renamed from: k */
    public static void m27170k(xap xapVar, View view) {
        xapVar.m27176F();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VSwitch m27171A() {
        VSwitch vSwitch = this._show_cis_show_cis_switch;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.r("_show_cis_show_cis_switch");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m27172B(@NotNull SettingGroups data) {
        data.getClass();
        IntlMoreGender intlMoreGender = data.gender;
        if (intlMoreGender != null) {
            this.moreGenderEnable = qib0.f19804b0.f17706a.mo67rq(data);
            this._data = data;
            m27185u().setVisibility(this.moreGenderEnable ? 0 : 8);
            if (!this.moreGenderEnable) {
                m27175E(data);
                return;
            }
            List list = intlMoreGender.lookingForGenders;
            list.getClass();
            if (list.isEmpty()) {
                m27175E(data);
            } else if (list.size() > 2) {
                m27182q().setChecked(true);
            } else {
                m27184s().setChecked(list.contains(LookingFor.get("male")));
                m27187w().setChecked(list.contains(LookingFor.get("female")));
                m27186v().setChecked(list.contains(LookingFor.get("nonbinary")));
            }
            m27171A().setChecked(!intlMoreGender.notShowCis.booleanValue());
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: C */
    public final boolean m27173C() {
        IntlGender intlGender;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        SettingGroups settingGroup3;
        IntlMoreGender intlMoreGender3;
        try {
            User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
            Gender gender = userM21490p9.gender;
            gender.getClass();
            Settings settings = userM21490p9.settings;
            if (settings == null || (settingGroup3 = settings.getSettingGroup()) == null || (intlMoreGender3 = settingGroup3.gender) == null || (intlGender = intlMoreGender3.newGender) == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            Settings settings2 = userM21490p9.settings;
            String str = null;
            String str2 = (settings2 == null || (settingGroup2 = settings2.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null) ? null : intlMoreGender2.subGender;
            Settings settings3 = userM21490p9.settings;
            if (settings3 != null && (settingGroup = settings3.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
                str = intlMoreGender.subGender;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            boolean zEquals = TEnum.equals(intlGender, "male");
            boolean zEquals2 = TEnum.equals(intlGender, "female");
            return (zIsEmpty && (zEquals || zEquals2)) || (zEquals && Intrinsics.d("Cis Man", str2)) || (zEquals2 && Intrinsics.d("Cis Woman", str2));
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m27174C0() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m27175E(SettingGroups data) {
        boolean z = true;
        m27184s().setChecked(Intrinsics.d(data.search.lookingForGender, LookingFor.get("male")) || Intrinsics.d(data.search.lookingForGender, LookingFor.get("both")));
        VCheckBox vCheckBoxM27187w = m27187w();
        if (!Intrinsics.d(data.search.lookingForGender, LookingFor.get("female")) && !Intrinsics.d(data.search.lookingForGender, LookingFor.get("both"))) {
            z = false;
        }
        vCheckBoxM27187w.setChecked(z);
    }

    /* JADX INFO: renamed from: F */
    public final void m27176F() {
        if (this.lookingForMan && this.lookingForWoman && (this.lookingForNonBinary || !this.moreGenderEnable)) {
            m27182q().setChecked(true);
        }
        if ((this.lookingForMan || this.lookingForWoman || this.lookingForNonBinary) && this.lookingForEveryone) {
            m27182q().setChecked(false);
        }
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m27178l(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m27178l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = yap.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m27177i1(@Nullable nap presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: n */
    public final void m27180n() {
        m27190z().setVisibility(this.moreGenderEnable && m27173C() && !this.lookingForNonBinary && !this.lookingForEveryone ? 0 : 8);
    }

    /* JADX INFO: renamed from: p */
    public final void m27181p() {
        m27180n();
        boolean z = this.lookingForMan;
        if (z && !this.lookingForWoman && !this.lookingForNonBinary && !this.lookingForEveryone) {
            m27184s().setEnabled(false);
            m27187w().setEnabled(true);
            m27186v().setEnabled(true);
            m27182q().setEnabled(true);
            return;
        }
        if (!z && this.lookingForWoman && !this.lookingForNonBinary && !this.lookingForEveryone) {
            m27184s().setEnabled(true);
            m27187w().setEnabled(false);
            m27186v().setEnabled(true);
            m27182q().setEnabled(true);
            return;
        }
        if (z || this.lookingForWoman || !this.lookingForNonBinary || this.lookingForEveryone) {
            m27184s().setEnabled(true);
            m27187w().setEnabled(true);
            m27186v().setEnabled(true);
        } else {
            m27184s().setEnabled(true);
            m27187w().setEnabled(true);
            m27186v().setEnabled(false);
            m27182q().setEnabled(true);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VCheckBox m27182q() {
        VCheckBox vCheckBox = this._gender_everyone_gender_everyone_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_gender_everyone_gender_everyone_check");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m27183r() {
        m27188x().setLeftIconOnClick(new View.OnClickListener() { // from class: l.oap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xap.m27162a(this.f18125a, view);
            }
        });
        m27182q().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.pap
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xap.m27165d(this.f18663a, compoundButton, z);
            }
        });
        xdl0.E0(m27184s(), new View.OnClickListener() { // from class: l.qap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xap.m27167f(this.f19697a, view);
            }
        });
        xdl0.E0(m27187w(), new View.OnClickListener() { // from class: l.rap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xap.m27170k(this.f20468a, view);
            }
        });
        xdl0.E0(m27186v(), new View.OnClickListener() { // from class: l.sap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xap.m27164c(this.f21227a, view);
            }
        });
        m27184s().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.tap
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xap.m27166e(this.f21979a, compoundButton, z);
            }
        });
        m27187w().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.uap
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xap.m27169j(this.f23475a, compoundButton, z);
            }
        });
        m27186v().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vap
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xap.m27163b(this.f24238a, compoundButton, z);
            }
        });
        xdl0.E0(m27189y(), new View.OnClickListener() { // from class: l.wap
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xap.m27168i(this.f25070a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VCheckBox m27184s() {
        VCheckBox vCheckBox = this._gender_man_gender_man_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_gender_man_gender_man_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VLinear m27185u() {
        VLinear vLinear = this._gender_nonbinary;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_gender_nonbinary");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VCheckBox m27186v() {
        VCheckBox vCheckBox = this._gender_nonbinary_gender_nonbinary_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_gender_nonbinary_gender_nonbinary_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VCheckBox m27187w() {
        VCheckBox vCheckBox = this._gender_woman_gender_woman_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_gender_woman_gender_woman_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VNavigationBar m27188x() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VButton m27189y() {
        VButton vButton = this._save_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_save_");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final ConstraintLayout m27190z() {
        ConstraintLayout constraintLayout = this._show_cis;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_show_cis");
        return null;
    }

    public void destroy() {
    }
}
