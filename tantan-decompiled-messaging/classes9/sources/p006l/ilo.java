package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.IntlMoreGenderConfig;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlGenderItem;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SubGender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0003J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100¨\u00064"}, d2 = {"Ll/ilo;", "", "<init>", "()V", "Lcom/p1/mobile/putong/account/data/IntlMoreGenderConfig;", "i", "()Lcom/p1/mobile/putong/account/data/IntlMoreGenderConfig;", "", "a", "", "j", "()Z", "Lcom/p1/mobile/putong/data/SettingGroups;", "settings", "k", "(Lcom/p1/mobile/putong/data/SettingGroups;)Z", "Lcom/p1/mobile/putong/data/IntlGender;", "gender", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "b", "(Lcom/p1/mobile/putong/data/IntlGender;)Ljava/util/List;", "", "option", "d", "(Lcom/p1/mobile/putong/data/IntlGender;Ljava/lang/String;)Ljava/lang/String;", "e", "genderString", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "h", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/SignUpData;)Z", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/SubGender;", "profileShowGender", "Ll/glo$b;", "dismissListener", "l", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/SubGender;Lcom/p1/mobile/putong/data/IntlGender;ZLl/glo$b;)V", "f", "g", "n", "m", "c", "(Lcom/p1/mobile/putong/data/IntlGender;)Ljava/lang/String;", "Lcom/p1/mobile/putong/account/data/IntlMoreGenderConfig;", "moreGenderConfig", "Ljava/util/List;", "MAN_GENDER_DATA_LIST", "WOMAN_GENDER_DATA_LIST", "NON_BINARY_GENDER_DATA_LIST", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class ilo {

    @NotNull
    public static final ilo INSTANCE = new ilo();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static IntlMoreGenderConfig moreGenderConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<IntlGenderItem> MAN_GENDER_DATA_LIST;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<IntlGenderItem> WOMAN_GENDER_DATA_LIST;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final List<IntlGenderItem> NON_BINARY_GENDER_DATA_LIST;

    static {
        IntlMoreGenderConfig intlMoreGenderConfigNew_ = IntlMoreGenderConfig.new_();
        intlMoreGenderConfigNew_.getClass();
        moreGenderConfig = intlMoreGenderConfigNew_;
        IntlGenderItem intlGenderItem = new IntlGenderItem();
        intlGenderItem.id = SubGender.get("Cis Man");
        intlGenderItem.title = App.e.getString(R$string.f193f1);
        intlGenderItem.desc = App.e.getString(R$string.f199g1);
        Unit unit = Unit.INSTANCE;
        IntlGenderItem intlGenderItem2 = new IntlGenderItem();
        intlGenderItem2.id = SubGender.get("Intersex Man");
        intlGenderItem2.title = App.e.getString(R$string.f205h1);
        intlGenderItem2.desc = App.e.getString(R$string.f211i1);
        IntlGenderItem intlGenderItem3 = new IntlGenderItem();
        intlGenderItem3.id = SubGender.get("Trans Man");
        intlGenderItem3.title = App.e.getString(R$string.f217j1);
        intlGenderItem3.desc = App.e.getString(R$string.f223k1);
        IntlGenderItem intlGenderItem4 = new IntlGenderItem();
        intlGenderItem4.id = SubGender.get("Transmasculine");
        intlGenderItem4.title = App.e.getString(R$string.f229l1);
        intlGenderItem4.desc = App.e.getString(R$string.f235m1);
        MAN_GENDER_DATA_LIST = CollectionsKt.listOf(new IntlGenderItem[]{intlGenderItem, intlGenderItem2, intlGenderItem3, intlGenderItem4});
        IntlGenderItem intlGenderItem5 = new IntlGenderItem();
        intlGenderItem5.id = SubGender.get("Cis Woman");
        intlGenderItem5.title = App.e.getString(R$string.f88L1);
        intlGenderItem5.desc = App.e.getString(R$string.f93M1);
        IntlGenderItem intlGenderItem6 = new IntlGenderItem();
        intlGenderItem6.id = SubGender.get("Intersex Woman");
        intlGenderItem6.title = App.e.getString(R$string.f98N1);
        intlGenderItem6.desc = App.e.getString(R$string.f103O1);
        IntlGenderItem intlGenderItem7 = new IntlGenderItem();
        intlGenderItem7.id = SubGender.get("Trans Woman");
        intlGenderItem7.title = App.e.getString(R$string.f118R1);
        intlGenderItem7.desc = App.e.getString(R$string.f123S1);
        IntlGenderItem intlGenderItem8 = new IntlGenderItem();
        intlGenderItem8.id = SubGender.get("Transfeminine");
        intlGenderItem8.title = App.e.getString(R$string.f108P1);
        intlGenderItem8.desc = App.e.getString(R$string.f113Q1);
        WOMAN_GENDER_DATA_LIST = CollectionsKt.listOf(new IntlGenderItem[]{intlGenderItem5, intlGenderItem6, intlGenderItem7, intlGenderItem8});
        IntlGenderItem intlGenderItem9 = new IntlGenderItem();
        intlGenderItem9.id = SubGender.get("Agender");
        intlGenderItem9.title = App.e.getString(R$string.f241n1);
        intlGenderItem9.desc = App.e.getString(R$string.f247o1);
        IntlGenderItem intlGenderItem10 = new IntlGenderItem();
        intlGenderItem10.id = SubGender.get("Bigender");
        intlGenderItem10.title = App.e.getString(R$string.f253p1);
        intlGenderItem10.desc = App.e.getString(R$string.f258q1);
        IntlGenderItem intlGenderItem11 = new IntlGenderItem();
        intlGenderItem11.id = SubGender.get("Genderfluid");
        intlGenderItem11.title = App.e.getString(R$string.f263r1);
        intlGenderItem11.desc = App.e.getString(R$string.f268s1);
        IntlGenderItem intlGenderItem12 = new IntlGenderItem();
        intlGenderItem12.id = SubGender.get("Gender Questioning");
        intlGenderItem12.title = App.e.getString(R$string.f283v1);
        intlGenderItem12.desc = App.e.getString(R$string.f288w1);
        IntlGenderItem intlGenderItem13 = new IntlGenderItem();
        intlGenderItem13.id = SubGender.get("Genderqueer");
        intlGenderItem13.title = App.e.getString(R$string.f273t1);
        intlGenderItem13.desc = App.e.getString(R$string.f278u1);
        IntlGenderItem intlGenderItem14 = new IntlGenderItem();
        intlGenderItem14.id = SubGender.get("Intersex");
        intlGenderItem14.title = App.e.getString(R$string.f293x1);
        intlGenderItem14.desc = App.e.getString(R$string.f298y1);
        IntlGenderItem intlGenderItem15 = new IntlGenderItem();
        intlGenderItem15.id = SubGender.get("Nonbinary");
        intlGenderItem15.title = App.e.getString(R$string.f303z1);
        intlGenderItem15.desc = App.e.getString(R$string.f33A1);
        IntlGenderItem intlGenderItem16 = new IntlGenderItem();
        intlGenderItem16.id = SubGender.get("Pangender");
        intlGenderItem16.title = App.e.getString(R$string.f38B1);
        intlGenderItem16.desc = App.e.getString(R$string.f43C1);
        IntlGenderItem intlGenderItem17 = new IntlGenderItem();
        intlGenderItem17.id = SubGender.get("Trans Person");
        intlGenderItem17.title = App.e.getString(R$string.f68H1);
        intlGenderItem17.desc = App.e.getString(R$string.f73I1);
        IntlGenderItem intlGenderItem18 = new IntlGenderItem();
        intlGenderItem18.id = SubGender.get("Transfeminine");
        intlGenderItem18.title = App.e.getString(R$string.f48D1);
        intlGenderItem18.desc = App.e.getString(R$string.f53E1);
        IntlGenderItem intlGenderItem19 = new IntlGenderItem();
        intlGenderItem19.id = SubGender.get("Transmasculine");
        intlGenderItem19.title = App.e.getString(R$string.f58F1);
        intlGenderItem19.desc = App.e.getString(R$string.f63G1);
        IntlGenderItem intlGenderItem20 = new IntlGenderItem();
        intlGenderItem20.id = SubGender.get("Two-Spirit");
        intlGenderItem20.title = App.e.getString(R$string.f78J1);
        intlGenderItem20.desc = App.e.getString(R$string.f83K1);
        NON_BINARY_GENDER_DATA_LIST = CollectionsKt.listOf(new IntlGenderItem[]{intlGenderItem9, intlGenderItem10, intlGenderItem11, intlGenderItem12, intlGenderItem13, intlGenderItem14, intlGenderItem15, intlGenderItem16, intlGenderItem17, intlGenderItem18, intlGenderItem19, intlGenderItem20});
    }

    /* JADX INFO: renamed from: a */
    public final void m16730a() {
        IntlMoreGenderConfig intlMoreGenderConfigNew_ = IntlMoreGenderConfig.new_();
        intlMoreGenderConfigNew_.getClass();
        moreGenderConfig = intlMoreGenderConfigNew_;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<IntlGenderItem> m16731b(@NotNull IntlGender gender) {
        gender.getClass();
        if (Intrinsics.d(gender, IntlGender.get("male"))) {
            List<IntlGenderItem> list = MAN_GENDER_DATA_LIST;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntlGenderItem) it.next()).clone());
            }
            return arrayList;
        }
        if (Intrinsics.d(gender, IntlGender.get("female"))) {
            List<IntlGenderItem> list2 = WOMAN_GENDER_DATA_LIST;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((IntlGenderItem) it2.next()).clone());
            }
            return arrayList2;
        }
        if (!Intrinsics.d(gender, IntlGender.get("nonbinary"))) {
            return CollectionsKt.emptyList();
        }
        List<IntlGenderItem> list3 = NON_BINARY_GENDER_DATA_LIST;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((IntlGenderItem) it3.next()).clone());
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: c */
    public final String m16732c(IntlGender gender) {
        if (Intrinsics.d(gender, IntlGender.get("male"))) {
            String string = App.e.getString(R$string.f125S3);
            string.getClass();
            return string;
        }
        if (Intrinsics.d(gender, IntlGender.get("female"))) {
            String string2 = App.e.getString(R$string.f130T3);
            string2.getClass();
            return string2;
        }
        if (!Intrinsics.d(gender, IntlGender.get("nonbinary"))) {
            return "";
        }
        String string3 = App.e.getString(R$string.f153Y1);
        string3.getClass();
        return string3;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m16733d(@NotNull IntlGender gender, @Nullable String option) {
        gender.getClass();
        if (option == null || TextUtils.isEmpty(option)) {
            return String.valueOf(m16732c(gender));
        }
        return m16732c(gender) + ", " + m16734e(gender, option);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m16734e(@NotNull IntlGender gender, @NotNull String option) {
        Object next;
        String str;
        gender.getClass();
        option.getClass();
        Iterator<T> it = m16731b(gender).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((IntlGenderItem) next).id.toString(), option));
        IntlGenderItem intlGenderItem = (IntlGenderItem) next;
        return (intlGenderItem == null || (str = intlGenderItem.title) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public final void m16735f() {
        zvf0.r("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: g */
    public final void m16736g() {
        zvf0.x("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: h */
    public final boolean m16737h(@NotNull String genderString, @NotNull SignUpData data) {
        genderString.getClass();
        data.getClass();
        return !m16739j() ? TEnum.equals(data.gender, genderString) : TEnum.equals(data.newGender, genderString);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final IntlMoreGenderConfig m16738i() {
        if (moreGenderConfig.disabledMcc.isEmpty()) {
            try {
                Object objV = RemoteConfig.x().v("ttt_lgbt_gender_for_ttt", IntlMoreGenderConfig.JSON_ADAPTER);
                objV.getClass();
                IntlMoreGenderConfig intlMoreGenderConfig = (IntlMoreGenderConfig) objV;
                if (NullChecker.a(intlMoreGenderConfig)) {
                    moreGenderConfig = intlMoreGenderConfig;
                }
            } catch (Exception unused) {
            }
        }
        return moreGenderConfig;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16739j() {
        return m16738i().enable && !m16738i().disabledMcc.contains(String.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16740k(@Nullable SettingGroups settings) {
        if (settings == null || !m16738i().enable) {
            return false;
        }
        return !m16738i().disabledMcc.contains(String.valueOf(qib0.f19808f0)) || settings.hasIntlMoreGenderSetting();
    }

    /* JADX INFO: renamed from: l */
    public final void m16741l(@NotNull Act act, @Nullable SubGender option, @NotNull IntlGender gender, boolean profileShowGender, @Nullable glo.InterfaceC0767b dismissListener) {
        act.getClass();
        gender.getClass();
        new glo(act).m15864r(m16731b(gender), option, profileShowGender, dismissListener);
    }

    /* JADX INFO: renamed from: m */
    public final void m16742m() {
        zvf0.r("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: n */
    public final void m16743n() {
        zvf0.x("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }
}
