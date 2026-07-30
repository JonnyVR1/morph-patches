package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SubGender;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSearchSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R\"\u0010O\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010:\u001a\u0004\bM\u0010<\"\u0004\bN\u0010>R\"\u0010S\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\"\u0010W\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00102\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\"\u0010[\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<\"\u0004\bZ\u0010>R\"\u0010_\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\"\u0010b\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\"\u0010e\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010:\u001a\u0004\bc\u0010<\"\u0004\bd\u0010>R\"\u0010h\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010B\u001a\u0004\bf\u0010D\"\u0004\bg\u0010FR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010s\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\bq\u0010<\"\u0004\br\u0010>R\"\u0010v\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010:\u001a\u0004\bt\u0010<\"\u0004\bu\u0010>R\"\u0010}\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R'\u0010\u0084\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\bC\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010\u0087\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0087\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010\u0087\u0001¨\u0006\u008f\u0001"}, m88121d2 = {"Ll/xcp;", "Ll/iam;", "Ll/ncp;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Lcom/p1/mobile/putong/data/SettingGroups;", "data", "", "E", "(Lcom/p1/mobile/putong/data/SettingGroups;)V", "p", "()V", "n", "F", "", c4s.C_ZONE, "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f45292l, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "m", "(Ll/ncp;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "B", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/navigationbar/VNavigationBar;", "b", "Lv/navigationbar/VNavigationBar;", BaseSei.f14624X, "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VLinear;", "c", "Lv/VLinear;", "get_gender_man", "()Lv/VLinear;", "set_gender_man", "(Lv/VLinear;)V", "_gender_man", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "get_gender_man_show_profile_text", "()Lv/VText;", "set_gender_man_show_profile_text", "(Lv/VText;)V", "_gender_man_show_profile_text", "Lv/VCheckBox;", "e", "Lv/VCheckBox;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VCheckBox;", "set_gender_man_gender_man_check", "(Lv/VCheckBox;)V", "_gender_man_gender_man_check", "f", "get_gender_woman", "set_gender_woman", "_gender_woman", "g", "get_gender_woman_gender_woman_text", "set_gender_woman_gender_woman_text", "_gender_woman_gender_woman_text", "h", "w", "set_gender_woman_gender_woman_check", "_gender_woman_gender_woman_check", RXScreenCaptureService.KEY_INDEX, "u", "set_gender_nonbinary", "_gender_nonbinary", "j", "get_gender_nonbinary_gender_nonbinary_text", "set_gender_nonbinary_gender_nonbinary_text", "_gender_nonbinary_gender_nonbinary_text", "k", ResourceDirection.f39656v, "set_gender_nonbinary_gender_nonbinary_check", "_gender_nonbinary_gender_nonbinary_check", "get_gender_everyone", "set_gender_everyone", "_gender_everyone", "get_gender_everyone_gender_everyone_text", "set_gender_everyone_gender_everyone_text", "_gender_everyone_gender_everyone_text", "q", "set_gender_everyone_gender_everyone_check", "_gender_everyone_gender_everyone_check", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f14626Z, "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_show_cis", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_show_cis", "get_show_cis_show_cis_title", "set_show_cis_show_cis_title", "_show_cis_show_cis_title", "get_show_cis_show_cis_desc", "set_show_cis_show_cis_desc", "_show_cis_show_cis_desc", "Lv/VSwitch;", "Lv/VSwitch;", "A", "()Lv/VSwitch;", "set_show_cis_show_cis_switch", "(Lv/VSwitch;)V", "_show_cis_show_cis_switch", "Lv/VButton;", "Lv/VButton;", BaseSei.f14625Y, "()Lv/VButton;", "set_save_", "(Lv/VButton;)V", "_save_", Constants.KEY_T, "Ll/ncp;", "Z", "lookingForMan", "lookingForWoman", "lookingForNonBinary", "lookingForEveryone", "Lcom/p1/mobile/putong/data/SettingGroups;", "_data", "moreGenderEnable", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xcp implements iam<ncp> {

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
    public ncp presenter;

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

    public xcp(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m210240a(xcp xcpVar, View view) {
        xcpVar.act.m48999H2();
    }

    /* JADX INFO: renamed from: b */
    public static void m210241b(xcp xcpVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xcpVar.lookingForNonBinary = z;
        xcpVar.m210257p();
    }

    /* JADX INFO: renamed from: c */
    public static void m210242c(xcp xcpVar, View view) {
        xcpVar.m210253F();
    }

    /* JADX INFO: renamed from: d */
    public static void m210243d(xcp xcpVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xcpVar.m210258q().setEnabled(!z);
        xcpVar.lookingForEveryone = z;
        xcpVar.m210256n();
        if (z) {
            xcpVar.m210260s().setChecked(false);
            xcpVar.m210263w().setChecked(false);
            xcpVar.m210262v().setChecked(false);
        } else {
            xcpVar.m210260s().setEnabled(!xcpVar.m210260s().isChecked());
            xcpVar.m210263w().setEnabled(!xcpVar.m210263w().isChecked());
            xcpVar.m210262v().setEnabled(!xcpVar.m210262v().isChecked());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m210244e(xcp xcpVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xcpVar.lookingForMan = z;
        xcpVar.m210257p();
    }

    /* JADX INFO: renamed from: f */
    public static void m210245f(xcp xcpVar, View view) {
        xcpVar.m210253F();
    }

    /* JADX INFO: renamed from: i */
    public static void m210246i(xcp xcpVar, View view) {
        LookingFor lookingFor;
        List<LookingFor> listBuild;
        SettingGroups settingGroups = null;
        if (xcpVar.moreGenderEnable) {
            if (xcpVar.lookingForEveryone) {
                listBuild = CollectionsKt.listOf((Object[]) new LookingFor[]{LookingFor.get("male"), LookingFor.get("female"), LookingFor.get("nonbinary")});
            } else {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                if (xcpVar.lookingForMan) {
                    LookingFor lookingFor2 = LookingFor.get("male");
                    lookingFor2.getClass();
                    listCreateListBuilder.add(lookingFor2);
                }
                if (xcpVar.lookingForWoman) {
                    LookingFor lookingFor3 = LookingFor.get("female");
                    lookingFor3.getClass();
                    listCreateListBuilder.add(lookingFor3);
                }
                if (xcpVar.lookingForNonBinary) {
                    LookingFor lookingFor4 = LookingFor.get("nonbinary");
                    lookingFor4.getClass();
                    listCreateListBuilder.add(lookingFor4);
                }
                listBuild = CollectionsKt.build(listCreateListBuilder);
            }
            SettingGroups settingGroups2 = xcpVar._data;
            if (settingGroups2 == null) {
                Intrinsics.m88391r("_data");
                settingGroups2 = null;
            }
            IntlMoreGender intlMoreGender = settingGroups2.gender;
            if (intlMoreGender != null) {
                intlMoreGender.lookingForGenders = listBuild;
            }
            SettingGroups settingGroups3 = xcpVar._data;
            if (settingGroups3 == null) {
                Intrinsics.m88391r("_data");
                settingGroups3 = null;
            }
            IntlMoreGender intlMoreGender2 = settingGroups3.gender;
            if (intlMoreGender2 != null) {
                intlMoreGender2.notShowCis = Boolean.valueOf(!xcpVar.m210249A().isChecked());
            }
        } else {
            SettingGroups settingGroups4 = xcpVar._data;
            if (settingGroups4 == null) {
                Intrinsics.m88391r("_data");
                settingGroups4 = null;
            }
            UserSearchSettings userSearchSettings = settingGroups4.search;
            if (xcpVar.m210260s().isChecked()) {
                lookingFor = LookingFor.get("male");
            } else if (xcpVar.m210263w().isChecked()) {
                lookingFor = LookingFor.get("female");
            } else {
                lookingFor = xcpVar.m210258q().isChecked() ? LookingFor.get("both") : LookingFor.get("both");
            }
            userSearchSettings.lookingForGender = lookingFor;
        }
        ncp ncpVar = xcpVar.presenter;
        if (ncpVar != null) {
            SettingGroups settingGroups5 = xcpVar._data;
            if (settingGroups5 == null) {
                Intrinsics.m88391r("_data");
            } else {
                settingGroups = settingGroups5;
            }
            ncpVar.m162589h0(settingGroups);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m210247j(xcp xcpVar, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        xcpVar.lookingForWoman = z;
        xcpVar.m210257p();
    }

    /* JADX INFO: renamed from: k */
    public static void m210248k(xcp xcpVar, View view) {
        xcpVar.m210253F();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final VSwitch m210249A() {
        VSwitch vSwitch = this._show_cis_show_cis_switch;
        if (vSwitch != null) {
            return vSwitch;
        }
        Intrinsics.m88391r("_show_cis_show_cis_switch");
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m210250B(@NotNull SettingGroups data) {
        data.getClass();
        IntlMoreGender intlMoreGender = data.gender;
        if (intlMoreGender != null) {
            this.moreGenderEnable = uqb0.f180396b0.f170324a.mo29171rq(data);
            this._data = data;
            m210261u().setVisibility(this.moreGenderEnable ? 0 : 8);
            if (!this.moreGenderEnable) {
                m210252E(data);
                return;
            }
            List<LookingFor> list = intlMoreGender.lookingForGenders;
            list.getClass();
            if (list.isEmpty()) {
                m210252E(data);
            } else if (list.size() > 2) {
                m210258q().setChecked(true);
            } else {
                m210260s().setChecked(list.contains(LookingFor.get("male")));
                m210263w().setChecked(list.contains(LookingFor.get("female")));
                m210262v().setChecked(list.contains(LookingFor.get("nonbinary")));
            }
            m210249A().setChecked(!intlMoreGender.notShowCis.booleanValue());
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: C */
    public final boolean m210251C() {
        IntlGender intlGender;
        SettingGroups settingGroup;
        IntlMoreGender intlMoreGender;
        SettingGroups settingGroup2;
        IntlMoreGender intlMoreGender2;
        SettingGroups settingGroup3;
        IntlMoreGender intlMoreGender3;
        try {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            Gender gender = userM116600p9.gender;
            gender.getClass();
            Settings settings = userM116600p9.settings;
            if (settings == null || (settingGroup3 = settings.getSettingGroup()) == null || (intlMoreGender3 = settingGroup3.gender) == null || (intlGender = intlMoreGender3.newGender) == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            Settings settings2 = userM116600p9.settings;
            String str = null;
            String str2 = (settings2 == null || (settingGroup2 = settings2.getSettingGroup()) == null || (intlMoreGender2 = settingGroup2.gender) == null) ? null : intlMoreGender2.subGender;
            Settings settings3 = userM116600p9.settings;
            if (settings3 != null && (settingGroup = settings3.getSettingGroup()) != null && (intlMoreGender = settingGroup.gender) != null) {
                str = intlMoreGender.subGender;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            boolean zEquals = TEnum.equals(intlGender, "male");
            boolean zEquals2 = TEnum.equals(intlGender, "female");
            return (zIsEmpty && (zEquals || zEquals2)) || (zEquals && Intrinsics.m88377d(SubGender.Cis_Man, str2)) || (zEquals2 && Intrinsics.m88377d(SubGender.Cis_Woman, str2));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m210252E(SettingGroups data) {
        boolean z = true;
        m210260s().setChecked(Intrinsics.m88377d(data.search.lookingForGender, LookingFor.get("male")) || Intrinsics.m88377d(data.search.lookingForGender, LookingFor.get("both")));
        VCheckBox vCheckBoxM210263w = m210263w();
        if (!Intrinsics.m88377d(data.search.lookingForGender, LookingFor.get("female")) && !Intrinsics.m88377d(data.search.lookingForGender, LookingFor.get("both"))) {
            z = false;
        }
        vCheckBoxM210263w.setChecked(z);
    }

    /* JADX INFO: renamed from: F */
    public final void m210253F() {
        if (this.lookingForMan && this.lookingForWoman && (this.lookingForNonBinary || !this.moreGenderEnable)) {
            m210258q().setChecked(true);
        }
        if ((this.lookingForMan || this.lookingForWoman || this.lookingForNonBinary) && this.lookingForEveryone) {
            m210258q().setChecked(false);
        }
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m210254l(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final View m210254l(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM215172b = ycp.m215172b(this, inflater, parent);
        viewM215172b.getClass();
        return viewM215172b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable ncp presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: n */
    public final void m210256n() {
        m210266z().setVisibility(this.moreGenderEnable && m210251C() && !this.lookingForNonBinary && !this.lookingForEveryone ? 0 : 8);
    }

    /* JADX INFO: renamed from: p */
    public final void m210257p() {
        m210256n();
        boolean z = this.lookingForMan;
        if (z && !this.lookingForWoman && !this.lookingForNonBinary && !this.lookingForEveryone) {
            m210260s().setEnabled(false);
            m210263w().setEnabled(true);
            m210262v().setEnabled(true);
            m210258q().setEnabled(true);
            return;
        }
        if (!z && this.lookingForWoman && !this.lookingForNonBinary && !this.lookingForEveryone) {
            m210260s().setEnabled(true);
            m210263w().setEnabled(false);
            m210262v().setEnabled(true);
            m210258q().setEnabled(true);
            return;
        }
        if (z || this.lookingForWoman || !this.lookingForNonBinary || this.lookingForEveryone) {
            m210260s().setEnabled(true);
            m210263w().setEnabled(true);
            m210262v().setEnabled(true);
        } else {
            m210260s().setEnabled(true);
            m210263w().setEnabled(true);
            m210262v().setEnabled(false);
            m210258q().setEnabled(true);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VCheckBox m210258q() {
        VCheckBox vCheckBox = this._gender_everyone_gender_everyone_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_gender_everyone_gender_everyone_check");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m210259r() {
        m210264x().setLeftIconOnClick(new View.OnClickListener() { // from class: l.ocp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xcp.m210240a(this.f146725a, view);
            }
        });
        m210258q().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.pcp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xcp.m210243d(this.f151618a, compoundButton, z);
            }
        });
        bnl0.m105509E0(m210260s(), new View.OnClickListener() { // from class: l.qcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xcp.m210245f(this.f156612a, view);
            }
        });
        bnl0.m105509E0(m210263w(), new View.OnClickListener() { // from class: l.rcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xcp.m210248k(this.f162244a, view);
            }
        });
        bnl0.m105509E0(m210262v(), new View.OnClickListener() { // from class: l.scp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xcp.m210242c(this.f167274a, view);
            }
        });
        m210260s().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.tcp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xcp.m210244e(this.f173267a, compoundButton, z);
            }
        });
        m210263w().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ucp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xcp.m210247j(this.f178456a, compoundButton, z);
            }
        });
        m210262v().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vcp
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                xcp.m210241b(this.f183478a, compoundButton, z);
            }
        });
        bnl0.m105509E0(m210265y(), new View.OnClickListener() { // from class: l.wcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xcp.m210246i(this.f188487a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VCheckBox m210260s() {
        VCheckBox vCheckBox = this._gender_man_gender_man_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_gender_man_gender_man_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VLinear m210261u() {
        VLinear vLinear = this._gender_nonbinary;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_gender_nonbinary");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VCheckBox m210262v() {
        VCheckBox vCheckBox = this._gender_nonbinary_gender_nonbinary_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_gender_nonbinary_gender_nonbinary_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VCheckBox m210263w() {
        VCheckBox vCheckBox = this._gender_woman_gender_woman_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_gender_woman_gender_woman_check");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VNavigationBar m210264x() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final VButton m210265y() {
        VButton vButton = this._save_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_save_");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final ConstraintLayout m210266z() {
        ConstraintLayout constraintLayout = this._show_cis;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_show_cis");
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
