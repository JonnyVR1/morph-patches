package p009l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.TribeSubset;
import com.p1.mobile.putong.core.data.TribeSubsetContent;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.uqd0;
import l.ura;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import l.zpd0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oho extends jq2<qho> {

    /* JADX INFO: renamed from: a */
    public final uqd0 f18050a;

    /* JADX INFO: renamed from: b */
    public final zpd0 f18051b;

    /* JADX INFO: renamed from: l.oho$a */
    public class C1078a extends TypeToken<List<TribeSubset>> {
        public C1078a() {
        }
    }

    public oho(mcr mcrVar) {
        super(mcrVar);
        this.f18050a = new uqd0("tribe_cache", "");
        this.f18051b = new zpd0("tribe_cache_time", 0L);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m19765f0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m19772m0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m19775p0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Boolean m19776q0(User user, User user2) {
        Profile profile;
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile2;
        Extensions extensions2;
        ProfileExtensionBasic profileExtensionBasic2;
        List list = null;
        List list2 = (user == null || (profile2 = user.profile) == null || (extensions2 = profile2.extensions) == null || (profileExtensionBasic2 = extensions2.basic) == null) ? null : profileExtensionBasic2.intlFriendPurposeV2;
        if (user2 != null && (profile = user2.profile) != null && (extensions = profile.extensions) != null && (profileExtensionBasic = extensions.basic) != null) {
            list = profileExtensionBasic.intlFriendPurposeV2;
        }
        return Boolean.valueOf(Objects.equals(list2, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m19777y0(Bundle bundle) {
        ((qho) ((jq2) this).viewModel).m20988r();
        m19783G0();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m19778A0(String str, String str2, String str3, String str4, String str5, Envelope envelope) {
        act().startActivityForResult(ura.e().d().xq(Y(), str, str2, str3, str4, str5), 1001);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m19779C0(List list) {
        if (list != null) {
            List<TribeSubset> listM19788N0 = m19788N0(list);
            ((qho) ((jq2) this).viewModel).m20986i(listM19788N0);
            m19789O0(listM19788N0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m19780D0(Throwable th) {
        m19782F0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m19781E0(TribeSubset tribeSubset, TribeSubsetContent tribeSubsetContent) {
        return Boolean.valueOf(m19794u0(tribeSubsetContent, tribeSubset.groupCategory));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m19782F0() {
        if (mqi0.m18550o() - ((Long) this.f18051b.get()).longValue() >= 86400000 || TextUtils.isEmpty((CharSequence) this.f18050a.get())) {
            return;
        }
        try {
            List<TribeSubset> list = (List) new Gson().fromJson((String) this.f18050a.get(), new C1078a().getType());
            if (vwb.J(list)) {
                return;
            }
            ((qho) ((jq2) this).viewModel).m20986i(m19788N0(list));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m19783G0() {
        m19782F0();
        m19784H0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m19784H0() {
        duringCreated(CoreModule.c.n1.L3()).subscribe(mkd0.H(new e30() { // from class: l.hho
            public final void call(Object obj) {
                this.f14090a.m19779C0((List) obj);
            }
        }, new e30() { // from class: l.iho
            public final void call(Object obj) {
                this.f14641a.m19780D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m19785I0(int i, int i2, Intent intent) {
        if (i != 1001) {
            return false;
        }
        m19783G0();
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public void m19786J0(boolean z) {
        if (z) {
            return;
        }
        m19783G0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m19787L0(String str, TribeSubsetContent tribeSubsetContent) {
        zvf0.u("e_intl_tribe_tribes_any_click", "p_intl_tribe_view", new j760[]{j760.a("intl_purpose", m19792s0()), j760.a("groupcategory", str), j760.a("tribe_subtype", tribeSubsetContent.subType)});
        if ("web".equals(tribeSubsetContent.action)) {
            if (TextUtils.isEmpty(tribeSubsetContent.jumpUrl)) {
                return;
            }
            CoreModule.P().a().ug(act(), Uri.parse("tantanapp://webview?url=" + tribeSubsetContent.jumpUrl));
            return;
        }
        if ("friend".equals(tribeSubsetContent.action)) {
            if (("short-term-fun".equals(m19792s0()) || "short-but-long".equals(m19792s0())) && "long-term-partner".equals(tribeSubsetContent.subType)) {
                ura.e().d().Ud(act());
                return;
            } else {
                m19791r0(tribeSubsetContent.subType);
                m19795x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
                return;
            }
        }
        if ("verify".equals(tribeSubsetContent.action)) {
            VerificationCenter verificationCenterQ4 = CoreModule.c.B0.q4();
            StudentVerificationStatus studentVerificationStatus = verificationCenterQ4 != null ? verificationCenterQ4.picVerificationInfo.status : null;
            if (!xma.e4() || TEnum.equals(studentVerificationStatus, "verified")) {
                m19795x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
                return;
            } else {
                new zdp(act()).show();
                return;
            }
        }
        if (!"premium".equals(tribeSubsetContent.action)) {
            if ("circle".equals(tribeSubsetContent.action)) {
                m19795x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
            }
        } else if (xma.e4()) {
            CoreModule.P().a().pr(act(), tribeSubsetContent.subType, Privilege.tribe);
        } else {
            m19795x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final List<TribeSubset> m19788N0(List<TribeSubset> list) {
        ArrayList<TribeSubset> arrayList = new ArrayList(list);
        vwb.d0(arrayList, new w9j() { // from class: l.bho
            public final Object call(Object obj) {
                TribeSubset tribeSubset = (TribeSubset) obj;
                return Boolean.valueOf(TextUtils.isEmpty(tribeSubset.mainHead) || vwb.J(tribeSubset.subsetContent) || (IntlCountryCodeController.k() && "right".equals(tribeSubset.groupCategory)));
            }
        });
        for (final TribeSubset tribeSubset : arrayList) {
            vwb.d0(tribeSubset.subsetContent, new w9j() { // from class: l.fho
                public final Object call(Object obj) {
                    return this.f13004a.m19781E0(tribeSubset, (TribeSubsetContent) obj);
                }
            });
        }
        vwb.d0(arrayList, new w9j() { // from class: l.gho
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.J(((TribeSubset) obj).subsetContent));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m19789O0(List<TribeSubset> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f18050a.put(new Gson().toJson(list));
        this.f18051b.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: Z */
    public void m19790Z() {
        super.Z();
        creates(new e30() { // from class: l.jho
            public final void call(Object obj) {
                this.f15171a.m19777y0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.o9().compose(mkd0.Q()).distinctUntilChanged(new x9j() { // from class: l.kho
            public final Object call(Object obj, Object obj2) {
                return oho.m19776q0((User) obj, (User) obj2);
            }
        }).compose(mkd0.C())).subscribe(mkd0.H(new e30() { // from class: l.lho
            public final void call(Object obj) {
                this.f16164a.m19796z0((User) obj);
            }
        }, new e30() { // from class: l.mho
            public final void call(Object obj) {
                oho.m19775p0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m19791r0(String str) {
        String strM19792s0 = m19792s0();
        if (TextUtils.isEmpty(strM19792s0) || strM19792s0.equals("unknown_") || strM19792s0.equals("not-sure-yet")) {
            User userClone = CoreModule.c.e0.na().clone();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            ProfileExtensionBasic profileExtensionBasic = userClone.profile.extensions.basic;
            profileExtensionBasic.intlFriendPurpose = arrayList;
            profileExtensionBasic.intlFriendPurposeV2 = arrayList;
            User userSubtract = userClone.subtract(CoreModule.c.e0.na());
            if (NullChecker.a(userSubtract)) {
                act().duringCreated(CoreModule.c.e0.v9(userSubtract, "updateIntlInterval")).subscribe(mkd0.H(new e30() { // from class: l.dho
                    public final void call(Object obj) {
                        oho.m19772m0((roj0) obj);
                    }
                }, new e30() { // from class: l.eho
                    public final void call(Object obj) {
                        oho.m19765f0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public String m19792s0() {
        List list = CoreModule.K().me_().profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.J(list) ? (String) list.get(0) : "";
    }

    /* JADX INFO: renamed from: t0 */
    public String m19793t0(int i, boolean z) {
        if (z && i > 99) {
            return "99+";
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        return ((i + 500) / 1000) + "k";
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m19794u0(TribeSubsetContent tribeSubsetContent, String str) {
        if (!TextUtils.isEmpty(tribeSubsetContent.subType) && !TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "banner":
                    if (!TextUtils.isEmpty(tribeSubsetContent.title) && !TextUtils.isEmpty(tribeSubsetContent.coverUrl)) {
                        return false;
                    }
                    break;
                case "pursue":
                case "hobby":
                    return TextUtils.isEmpty(tribeSubsetContent.title) || TextUtils.isEmpty(tribeSubsetContent.icon) || TextUtils.isEmpty(tribeSubsetContent.coverUrl);
                case "right":
                    return TextUtils.isEmpty(tribeSubsetContent.title) || TextUtils.isEmpty(tribeSubsetContent.coverUrl) || vwb.J(tribeSubsetContent.profilePhoto) || tribeSubsetContent.profilePhoto.size() < 3;
                default:
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public void m19795x0(final String str, final String str2, final String str3, final String str4, final String str5) {
        duringCreated(CoreModule.c.n1.H3("join", str, str2)).subscribe(mkd0.H(new e30() { // from class: l.nho
            public final void call(Object obj) {
                this.f17469a.m19778A0(str, str2, str3, str4, str5, (Envelope) obj);
            }
        }, new e30() { // from class: l.cho
            public final void call(Object obj) {
                lsi0.w(R.string.N);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m19796z0(User user) {
        m19783G0();
    }

    public void destroy() {
    }
}
