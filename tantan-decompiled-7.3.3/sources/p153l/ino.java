package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.IntlMoreGenderConfig;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlGenderItem;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SubGender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010&\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010\u0003J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u0003J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010,\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100¨\u00064"}, m88121d2 = {"Ll/ino;", "", "<init>", "()V", "Lcom/p1/mobile/putong/account/data/IntlMoreGenderConfig;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/account/data/IntlMoreGenderConfig;", "", "a", "", "j", "()Z", "Lcom/p1/mobile/putong/data/SettingGroups;", Settings.TYPE, "k", "(Lcom/p1/mobile/putong/data/SettingGroups;)Z", "Lcom/p1/mobile/putong/data/IntlGender;", "gender", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "b", "(Lcom/p1/mobile/putong/data/IntlGender;)Ljava/util/List;", "", Option.TYPE, Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/IntlGender;Ljava/lang/String;)Ljava/lang/String;", "e", "genderString", "Lcom/p1/mobile/putong/data/SignUpData;", "data", "h", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/SignUpData;)Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/SubGender;", "profileShowGender", "Ll/gno$b;", "dismissListener", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/SubGender;Lcom/p1/mobile/putong/data/IntlGender;ZLl/gno$b;)V", "f", "g", "n", "m", "c", "(Lcom/p1/mobile/putong/data/IntlGender;)Ljava/lang/String;", "Lcom/p1/mobile/putong/account/data/IntlMoreGenderConfig;", "moreGenderConfig", "Ljava/util/List;", "MAN_GENDER_DATA_LIST", "WOMAN_GENDER_DATA_LIST", "NON_BINARY_GENDER_DATA_LIST", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ino {

    @NotNull
    public static final ino INSTANCE = new ino();

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
        intlGenderItem.f39609id = SubGender.get(SubGender.Cis_Man);
        intlGenderItem.title = App.f16088e.getString(R$string.f16923f1);
        intlGenderItem.desc = App.f16088e.getString(R$string.f16929g1);
        Unit unit = Unit.INSTANCE;
        IntlGenderItem intlGenderItem2 = new IntlGenderItem();
        intlGenderItem2.f39609id = SubGender.get(SubGender.Intersex_Man);
        intlGenderItem2.title = App.f16088e.getString(R$string.f16935h1);
        intlGenderItem2.desc = App.f16088e.getString(R$string.f16941i1);
        IntlGenderItem intlGenderItem3 = new IntlGenderItem();
        intlGenderItem3.f39609id = SubGender.get(SubGender.Trans_Man);
        intlGenderItem3.title = App.f16088e.getString(R$string.f16947j1);
        intlGenderItem3.desc = App.f16088e.getString(R$string.f16953k1);
        IntlGenderItem intlGenderItem4 = new IntlGenderItem();
        intlGenderItem4.f39609id = SubGender.get(SubGender.Transmasculine);
        intlGenderItem4.title = App.f16088e.getString(R$string.f16959l1);
        intlGenderItem4.desc = App.f16088e.getString(R$string.f16965m1);
        MAN_GENDER_DATA_LIST = CollectionsKt.listOf((Object[]) new IntlGenderItem[]{intlGenderItem, intlGenderItem2, intlGenderItem3, intlGenderItem4});
        IntlGenderItem intlGenderItem5 = new IntlGenderItem();
        intlGenderItem5.f39609id = SubGender.get(SubGender.Cis_Woman);
        intlGenderItem5.title = App.f16088e.getString(R$string.f16818L1);
        intlGenderItem5.desc = App.f16088e.getString(R$string.f16823M1);
        IntlGenderItem intlGenderItem6 = new IntlGenderItem();
        intlGenderItem6.f39609id = SubGender.get(SubGender.Intersex_Woman);
        intlGenderItem6.title = App.f16088e.getString(R$string.f16828N1);
        intlGenderItem6.desc = App.f16088e.getString(R$string.f16833O1);
        IntlGenderItem intlGenderItem7 = new IntlGenderItem();
        intlGenderItem7.f39609id = SubGender.get(SubGender.Trans_Woman);
        intlGenderItem7.title = App.f16088e.getString(R$string.f16848R1);
        intlGenderItem7.desc = App.f16088e.getString(R$string.f16853S1);
        IntlGenderItem intlGenderItem8 = new IntlGenderItem();
        intlGenderItem8.f39609id = SubGender.get(SubGender.Transfeminine);
        intlGenderItem8.title = App.f16088e.getString(R$string.f16838P1);
        intlGenderItem8.desc = App.f16088e.getString(R$string.f16843Q1);
        WOMAN_GENDER_DATA_LIST = CollectionsKt.listOf((Object[]) new IntlGenderItem[]{intlGenderItem5, intlGenderItem6, intlGenderItem7, intlGenderItem8});
        IntlGenderItem intlGenderItem9 = new IntlGenderItem();
        intlGenderItem9.f39609id = SubGender.get(SubGender.Agender);
        intlGenderItem9.title = App.f16088e.getString(R$string.f16971n1);
        intlGenderItem9.desc = App.f16088e.getString(R$string.f16977o1);
        IntlGenderItem intlGenderItem10 = new IntlGenderItem();
        intlGenderItem10.f39609id = SubGender.get(SubGender.Bigender);
        intlGenderItem10.title = App.f16088e.getString(R$string.f16983p1);
        intlGenderItem10.desc = App.f16088e.getString(R$string.f16988q1);
        IntlGenderItem intlGenderItem11 = new IntlGenderItem();
        intlGenderItem11.f39609id = SubGender.get(SubGender.Genderfluid);
        intlGenderItem11.title = App.f16088e.getString(R$string.f16993r1);
        intlGenderItem11.desc = App.f16088e.getString(R$string.f16998s1);
        IntlGenderItem intlGenderItem12 = new IntlGenderItem();
        intlGenderItem12.f39609id = SubGender.get(SubGender.Gender_Questioning);
        intlGenderItem12.title = App.f16088e.getString(R$string.f17013v1);
        intlGenderItem12.desc = App.f16088e.getString(R$string.f17018w1);
        IntlGenderItem intlGenderItem13 = new IntlGenderItem();
        intlGenderItem13.f39609id = SubGender.get(SubGender.Genderqueer);
        intlGenderItem13.title = App.f16088e.getString(R$string.f17003t1);
        intlGenderItem13.desc = App.f16088e.getString(R$string.f17008u1);
        IntlGenderItem intlGenderItem14 = new IntlGenderItem();
        intlGenderItem14.f39609id = SubGender.get(SubGender.Intersex);
        intlGenderItem14.title = App.f16088e.getString(R$string.f17023x1);
        intlGenderItem14.desc = App.f16088e.getString(R$string.f17028y1);
        IntlGenderItem intlGenderItem15 = new IntlGenderItem();
        intlGenderItem15.f39609id = SubGender.get(SubGender.Nonbinary);
        intlGenderItem15.title = App.f16088e.getString(R$string.f17033z1);
        intlGenderItem15.desc = App.f16088e.getString(R$string.f16763A1);
        IntlGenderItem intlGenderItem16 = new IntlGenderItem();
        intlGenderItem16.f39609id = SubGender.get(SubGender.Pangender);
        intlGenderItem16.title = App.f16088e.getString(R$string.f16768B1);
        intlGenderItem16.desc = App.f16088e.getString(R$string.f16773C1);
        IntlGenderItem intlGenderItem17 = new IntlGenderItem();
        intlGenderItem17.f39609id = SubGender.get(SubGender.Trans_Person);
        intlGenderItem17.title = App.f16088e.getString(R$string.f16798H1);
        intlGenderItem17.desc = App.f16088e.getString(R$string.f16803I1);
        IntlGenderItem intlGenderItem18 = new IntlGenderItem();
        intlGenderItem18.f39609id = SubGender.get(SubGender.Transfeminine);
        intlGenderItem18.title = App.f16088e.getString(R$string.f16778D1);
        intlGenderItem18.desc = App.f16088e.getString(R$string.f16783E1);
        IntlGenderItem intlGenderItem19 = new IntlGenderItem();
        intlGenderItem19.f39609id = SubGender.get(SubGender.Transmasculine);
        intlGenderItem19.title = App.f16088e.getString(R$string.f16788F1);
        intlGenderItem19.desc = App.f16088e.getString(R$string.f16793G1);
        IntlGenderItem intlGenderItem20 = new IntlGenderItem();
        intlGenderItem20.f39609id = SubGender.get(SubGender.Two_Spirit);
        intlGenderItem20.title = App.f16088e.getString(R$string.f16808J1);
        intlGenderItem20.desc = App.f16088e.getString(R$string.f16813K1);
        NON_BINARY_GENDER_DATA_LIST = CollectionsKt.listOf((Object[]) new IntlGenderItem[]{intlGenderItem9, intlGenderItem10, intlGenderItem11, intlGenderItem12, intlGenderItem13, intlGenderItem14, intlGenderItem15, intlGenderItem16, intlGenderItem17, intlGenderItem18, intlGenderItem19, intlGenderItem20});
    }

    /* JADX INFO: renamed from: a */
    public final void m141155a() {
        IntlMoreGenderConfig intlMoreGenderConfigNew_ = IntlMoreGenderConfig.new_();
        intlMoreGenderConfigNew_.getClass();
        moreGenderConfig = intlMoreGenderConfigNew_;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<IntlGenderItem> m141156b(@NotNull IntlGender gender) {
        gender.getClass();
        if (Intrinsics.m88377d(gender, IntlGender.get("male"))) {
            List<IntlGenderItem> list = MAN_GENDER_DATA_LIST;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntlGenderItem) it.next()).mo225055clone());
            }
            return arrayList;
        }
        if (Intrinsics.m88377d(gender, IntlGender.get("female"))) {
            List<IntlGenderItem> list2 = WOMAN_GENDER_DATA_LIST;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((IntlGenderItem) it2.next()).mo225055clone());
            }
            return arrayList2;
        }
        if (!Intrinsics.m88377d(gender, IntlGender.get("nonbinary"))) {
            return CollectionsKt.emptyList();
        }
        List<IntlGenderItem> list3 = NON_BINARY_GENDER_DATA_LIST;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((IntlGenderItem) it3.next()).mo225055clone());
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: c */
    public final String m141157c(IntlGender gender) {
        if (Intrinsics.m88377d(gender, IntlGender.get("male"))) {
            String string = App.f16088e.getString(R$string.f16855S3);
            string.getClass();
            return string;
        }
        if (Intrinsics.m88377d(gender, IntlGender.get("female"))) {
            String string2 = App.f16088e.getString(R$string.f16860T3);
            string2.getClass();
            return string2;
        }
        if (!Intrinsics.m88377d(gender, IntlGender.get("nonbinary"))) {
            return "";
        }
        String string3 = App.f16088e.getString(R$string.f16883Y1);
        string3.getClass();
        return string3;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m141158d(@NotNull IntlGender gender, @Nullable String option) {
        gender.getClass();
        if (option == null || TextUtils.isEmpty(option)) {
            return String.valueOf(m141157c(gender));
        }
        return m141157c(gender) + ", " + m141159e(gender, option);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m141159e(@NotNull IntlGender gender, @NotNull String option) {
        Object next;
        String str;
        gender.getClass();
        option.getClass();
        Iterator<T> it = m141156b(gender).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m88377d(((IntlGenderItem) next).f39609id.toString(), option));
        IntlGenderItem intlGenderItem = (IntlGenderItem) next;
        return (intlGenderItem == null || (str = intlGenderItem.title) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public final void m141160f() {
        i4g0.m138520r("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: g */
    public final void m141161g() {
        i4g0.m138526x("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: h */
    public final boolean m141162h(@NotNull String genderString, @NotNull SignUpData data) {
        genderString.getClass();
        data.getClass();
        return !m141164j() ? TEnum.equals(data.gender, genderString) : TEnum.equals(data.newGender, genderString);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final IntlMoreGenderConfig m141163i() {
        if (moreGenderConfig.disabledMcc.isEmpty()) {
            try {
                Object objM80516v = RemoteConfig.m80481x().m80516v("ttt_lgbt_gender_for_ttt", IntlMoreGenderConfig.JSON_ADAPTER);
                objM80516v.getClass();
                IntlMoreGenderConfig intlMoreGenderConfig = (IntlMoreGenderConfig) objM80516v;
                if (NullChecker.m82486a(intlMoreGenderConfig)) {
                    moreGenderConfig = intlMoreGenderConfig;
                }
            } catch (Exception unused) {
            }
        }
        return moreGenderConfig;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m141164j() {
        return m141163i().enable && !m141163i().disabledMcc.contains(String.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m141165k(@Nullable SettingGroups settings) {
        if (settings == null || !m141163i().enable) {
            return false;
        }
        return !m141163i().disabledMcc.contains(String.valueOf(uqb0.f180400f0)) || settings.hasIntlMoreGenderSetting();
    }

    /* JADX INFO: renamed from: l */
    public final void m141166l(@NotNull Act act, @Nullable SubGender option, @NotNull IntlGender gender, boolean profileShowGender, @Nullable gno.InterfaceC17259b dismissListener) {
        act.getClass();
        gender.getClass();
        new gno(act).m130925r(m141156b(gender), option, profileShowGender, dismissListener);
    }

    /* JADX INFO: renamed from: m */
    public final void m141167m() {
        i4g0.m138520r("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: n */
    public final void m141168n() {
        i4g0.m138526x("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }
}
