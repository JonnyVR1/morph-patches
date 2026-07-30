package p153l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GroupCategory;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.TribeSubset;
import com.p051p1.mobile.putong.core.data.TribeSubsetContent;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.IntlPurpose;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class ojo extends ar2<qjo> {

    /* JADX INFO: renamed from: a */
    public final wyd0 f147685a;

    /* JADX INFO: renamed from: b */
    public final byd0 f147686b;

    /* JADX INFO: renamed from: l.ojo$a */
    public class C19154a extends TypeToken<List<TribeSubset>> {
        public C19154a() {
        }
    }

    public ojo(ner nerVar) {
        super(nerVar);
        this.f147685a = new wyd0("tribe_cache", "");
        this.f147686b = new byd0("tribe_cache_time", 0L);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m167870f0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m167877m0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m167880p0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Boolean m167881q0(User user, User user2) {
        Profile profile;
        Extensions extensions;
        ProfileExtensionBasic profileExtensionBasic;
        Profile profile2;
        Extensions extensions2;
        ProfileExtensionBasic profileExtensionBasic2;
        List<String> list = null;
        List<String> list2 = (user == null || (profile2 = user.profile) == null || (extensions2 = profile2.extensions) == null || (profileExtensionBasic2 = extensions2.basic) == null) ? null : profileExtensionBasic2.intlFriendPurposeV2;
        if (user2 != null && (profile = user2.profile) != null && (extensions = profile.extensions) != null && (profileExtensionBasic = extensions.basic) != null) {
            list = profileExtensionBasic.intlFriendPurposeV2;
        }
        return Boolean.valueOf(Objects.equals(list2, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m167882y0(Bundle bundle) {
        ((qjo) this.viewModel).m176851r();
        m167888G0();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m167883A0(String str, String str2, String str3, String str4, String str5, Envelope envelope) {
        act().startActivityForResult(gta.m132210e().m132214d().mo34952xq(m99640Y(), str, str2, str3, str4, str5), 1001);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m167884C0(List list) {
        if (list != null) {
            List<TribeSubset> listM167893N0 = m167893N0(list);
            ((qjo) this.viewModel).m176850i(listM167893N0);
            m167894O0(listM167893N0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m167885D0(Throwable th) {
        m167887F0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m167886E0(TribeSubset tribeSubset, TribeSubsetContent tribeSubsetContent) {
        return Boolean.valueOf(m167898u0(tribeSubsetContent, tribeSubset.groupCategory));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m167887F0() {
        if (pzi0.m174454o() - this.f147686b.get().longValue() >= 86400000 || TextUtils.isEmpty(this.f147685a.get())) {
            return;
        }
        try {
            List<TribeSubset> list = (List) new Gson().fromJson(this.f147685a.get(), new C19154a().getType());
            if (jyb.m147479J(list)) {
                return;
            }
            ((qjo) this.viewModel).m176850i(m167893N0(list));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m167888G0() {
        m167887F0();
        m167889H0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m167889H0() {
        duringCreated(CoreModule.f18264c.f20409n1.m35273L3()).subscribe(psd0.m173597H(new y20() { // from class: l.hjo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110252a.m167884C0((List) obj);
            }
        }, new y20() { // from class: l.ijo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115251a.m167885D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m167890I0(int i, int i2, Intent intent) {
        if (i != 1001) {
            return false;
        }
        m167888G0();
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public void m167891J0(boolean z) {
        if (z) {
            return;
        }
        m167888G0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m167892L0(String str, TribeSubsetContent tribeSubsetContent) {
        i4g0.m138523u("e_intl_tribe_tribes_any_click", "p_intl_tribe_view", pf60.m172085a("intl_purpose", m167896s0()), pf60.m172085a(GroupCategory.TYPE, str), pf60.m172085a("tribe_subtype", tribeSubsetContent.subType));
        if (SchemeKey.web.equals(tribeSubsetContent.action)) {
            if (TextUtils.isEmpty(tribeSubsetContent.jumpUrl)) {
                return;
            }
            CoreModule.m30933P().m143405a().mo34604ug(act(), Uri.parse("tantanapp://webview?url=" + tribeSubsetContent.jumpUrl));
            return;
        }
        if ("friend".equals(tribeSubsetContent.action)) {
            if ((IntlPurpose.short_term_fun.equals(m167896s0()) || IntlPurpose.short_but_long.equals(m167896s0())) && IntlPurpose.long_term_partner.equals(tribeSubsetContent.subType)) {
                gta.m132210e().m132214d().mo34761Ud(act());
                return;
            } else {
                m167895r0(tribeSubsetContent.subType);
                m167899x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
                return;
            }
        }
        if ("verify".equals(tribeSubsetContent.action)) {
            VerificationCenter verificationCenterM32621q4 = CoreModule.f18264c.f20294B0.m32621q4();
            StudentVerificationStatus studentVerificationStatus = verificationCenterM32621q4 != null ? verificationCenterM32621q4.picVerificationInfo.status : null;
            if (!joa.m146386f4() || TEnum.equals(studentVerificationStatus, "verified")) {
                m167899x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
                return;
            } else {
                new zfp(act()).show();
                return;
            }
        }
        if (!"premium".equals(tribeSubsetContent.action)) {
            if ("circle".equals(tribeSubsetContent.action)) {
                m167899x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
            }
        } else if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34568pr(act(), tribeSubsetContent.subType, Privilege.tribe);
        } else {
            m167899x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final List<TribeSubset> m167893N0(List<TribeSubset> list) {
        ArrayList<TribeSubset> arrayList = new ArrayList(list);
        jyb.m147503d0(arrayList, new qcj() { // from class: l.bjo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                TribeSubset tribeSubset = (TribeSubset) obj;
                return Boolean.valueOf(TextUtils.isEmpty(tribeSubset.mainHead) || jyb.m147479J(tribeSubset.subsetContent) || (IntlCountryCodeController.m29114k() && "right".equals(tribeSubset.groupCategory)));
            }
        });
        for (final TribeSubset tribeSubset : arrayList) {
            jyb.m147503d0(tribeSubset.subsetContent, new qcj() { // from class: l.fjo
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f99400a.m167886E0(tribeSubset, (TribeSubsetContent) obj);
                }
            });
        }
        jyb.m147503d0(arrayList, new qcj() { // from class: l.gjo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147479J(((TribeSubset) obj).subsetContent));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m167894O0(List<TribeSubset> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f147685a.put(new Gson().toJson(list));
        this.f147686b.put(Long.valueOf(pzi0.m174454o()));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.jjo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121212a.m167882y0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().compose(psd0.m173606Q()).distinctUntilChanged((rcj<? super R, ? super R, Boolean>) new rcj() { // from class: l.kjo
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ojo.m167881q0((User) obj, (User) obj2);
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173597H(new y20() { // from class: l.ljo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132379a.m167900z0((User) obj);
            }
        }, new y20() { // from class: l.mjo
            @Override // p153l.y20
            public final void call(Object obj) {
                ojo.m167880p0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m167895r0(String str) {
        String strM167896s0 = m167896s0();
        if (TextUtils.isEmpty(strM167896s0) || strM167896s0.equals("unknown_") || strM167896s0.equals(IntlPurpose.not_sure_yet)) {
            User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            ProfileExtensionBasic profileExtensionBasic = userMo225055clone.profile.extensions.basic;
            profileExtensionBasic.intlFriendPurpose = arrayList;
            profileExtensionBasic.intlFriendPurposeV2 = arrayList;
            User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na());
            if (NullChecker.m82486a(userSubtract)) {
                act().duringCreated(CoreModule.f18264c.f20381e0.m116624v9(userSubtract, "updateIntlInterval")).subscribe(psd0.m173597H(new y20() { // from class: l.djo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ojo.m167877m0((uxj0) obj);
                    }
                }, new y20() { // from class: l.ejo
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ojo.m167870f0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public String m167896s0() {
        List<String> list = CoreModule.m30930K().me_().profile.extensions.basic.intlFriendPurposeV2;
        return !jyb.m147479J(list) ? list.get(0) : "";
    }

    /* JADX INFO: renamed from: t0 */
    public String m167897t0(int i, boolean z) {
        if (z && i > 99) {
            return "99+";
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        return ((i + 500) / 1000) + "k";
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m167898u0(TribeSubsetContent tribeSubsetContent, String str) {
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
                    return TextUtils.isEmpty(tribeSubsetContent.title) || TextUtils.isEmpty(tribeSubsetContent.coverUrl) || jyb.m147479J(tribeSubsetContent.profilePhoto) || tribeSubsetContent.profilePhoto.size() < 3;
                default:
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public void m167899x0(final String str, final String str2, final String str3, final String str4, final String str5) {
        duringCreated(CoreModule.f18264c.f20409n1.m35272H3("join", str, str2)).subscribe(psd0.m173597H(new y20() { // from class: l.njo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142323a.m167883A0(str, str2, str3, str4, str5, (Envelope) obj);
            }
        }, new y20() { // from class: l.cjo
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f21343N);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m167900z0(User user) {
        m167888G0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
