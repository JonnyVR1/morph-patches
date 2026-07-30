package p149l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GroupCategory;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.TribeSubset;
import com.p046p1.mobile.putong.core.data.TribeSubsetContent;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.IntlPurpose;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class oho extends jq2<qho> {

    /* JADX INFO: renamed from: a */
    public final uqd0 f144030a;

    /* JADX INFO: renamed from: b */
    public final zpd0 f144031b;

    /* JADX INFO: renamed from: l.oho$a */
    public class C18940a extends TypeToken<List<TribeSubset>> {
        public C18940a() {
        }
    }

    public oho(mcr mcrVar) {
        super(mcrVar);
        this.f144030a = new uqd0("tribe_cache", "");
        this.f144031b = new zpd0("tribe_cache_time", 0L);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m164430f0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m164437m0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m164440p0(Throwable th) {
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Boolean m164441q0(User user, User user2) {
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
    public /* synthetic */ void m164442y0(Bundle bundle) {
        ((qho) this.viewModel).m174568r();
        m164448G0();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m164443A0(String str, String str2, String str3, String str4, String str5, Envelope envelope) {
        act().startActivityForResult(ura.m195053e().m195057d().mo33949xq(m142773Y(), str, str2, str3, str4, str5), 1001);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m164444C0(List list) {
        if (list != null) {
            List<TribeSubset> listM164453N0 = m164453N0(list);
            ((qho) this.viewModel).m174567i(listM164453N0);
            m164454O0(listM164453N0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m164445D0(Throwable th) {
        m164447F0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m164446E0(TribeSubset tribeSubset, TribeSubsetContent tribeSubsetContent) {
        return Boolean.valueOf(m164458u0(tribeSubsetContent, tribeSubset.groupCategory));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m164447F0() {
        if (mqi0.m155944o() - this.f144031b.get().longValue() >= 86400000 || TextUtils.isEmpty(this.f144030a.get())) {
            return;
        }
        try {
            List<TribeSubset> list = (List) new Gson().fromJson(this.f144030a.get(), new C18940a().getType());
            if (vwb.m200296J(list)) {
                return;
            }
            ((qho) this.viewModel).m174567i(m164453N0(list));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m164448G0() {
        m164447F0();
        m164449H0();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m164449H0() {
        duringCreated(CoreModule.f17545c.f19667n1.m34270L3()).subscribe(mkd0.m154956H(new e30() { // from class: l.hho
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107734a.m164444C0((List) obj);
            }
        }, new e30() { // from class: l.iho
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113319a.m164445D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m164450I0(int i, int i2, Intent intent) {
        if (i != 1001) {
            return false;
        }
        m164448G0();
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public void m164451J0(boolean z) {
        if (z) {
            return;
        }
        m164448G0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m164452L0(String str, TribeSubsetContent tribeSubsetContent) {
        zvf0.m220399u("e_intl_tribe_tribes_any_click", "p_intl_tribe_view", j760.m140076a("intl_purpose", m164456s0()), j760.m140076a(GroupCategory.TYPE, str), j760.m140076a("tribe_subtype", tribeSubsetContent.subType));
        if (SchemeKey.web.equals(tribeSubsetContent.action)) {
            if (TextUtils.isEmpty(tribeSubsetContent.jumpUrl)) {
                return;
            }
            CoreModule.m29935P().m94651a().mo33601ug(act(), Uri.parse("tantanapp://webview?url=" + tribeSubsetContent.jumpUrl));
            return;
        }
        if ("friend".equals(tribeSubsetContent.action)) {
            if ((IntlPurpose.short_term_fun.equals(m164456s0()) || IntlPurpose.short_but_long.equals(m164456s0())) && IntlPurpose.long_term_partner.equals(tribeSubsetContent.subType)) {
                ura.m195053e().m195057d().mo33758Ud(act());
                return;
            } else {
                m164455r0(tribeSubsetContent.subType);
                m164459x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
                return;
            }
        }
        if ("verify".equals(tribeSubsetContent.action)) {
            VerificationCenter verificationCenterM31618q4 = CoreModule.f17545c.f19552B0.m31618q4();
            StudentVerificationStatus studentVerificationStatus = verificationCenterM31618q4 != null ? verificationCenterM31618q4.picVerificationInfo.status : null;
            if (!xma.m210071e4() || TEnum.equals(studentVerificationStatus, "verified")) {
                m164459x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
                return;
            } else {
                new zdp(act()).show();
                return;
            }
        }
        if (!"premium".equals(tribeSubsetContent.action)) {
            if ("circle".equals(tribeSubsetContent.action)) {
                m164459x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
            }
        } else if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33565pr(act(), tribeSubsetContent.subType, Privilege.tribe);
        } else {
            m164459x0(str, tribeSubsetContent.subType, tribeSubsetContent.title, tribeSubsetContent.icon, tribeSubsetContent.innerBackgroundUrl);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final List<TribeSubset> m164453N0(List<TribeSubset> list) {
        ArrayList<TribeSubset> arrayList = new ArrayList(list);
        vwb.m200320d0(arrayList, new w9j() { // from class: l.bho
            @Override // p149l.w9j
            public final Object call(Object obj) {
                TribeSubset tribeSubset = (TribeSubset) obj;
                return Boolean.valueOf(TextUtils.isEmpty(tribeSubset.mainHead) || vwb.m200296J(tribeSubset.subsetContent) || (IntlCountryCodeController.m28115k() && "right".equals(tribeSubset.groupCategory)));
            }
        });
        for (final TribeSubset tribeSubset : arrayList) {
            vwb.m200320d0(tribeSubset.subsetContent, new w9j() { // from class: l.fho
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f97534a.m164446E0(tribeSubset, (TribeSubsetContent) obj);
                }
            });
        }
        vwb.m200320d0(arrayList, new w9j() { // from class: l.gho
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200296J(((TribeSubset) obj).subsetContent));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m164454O0(List<TribeSubset> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f144030a.put(new Gson().toJson(list));
        this.f144031b.put(Long.valueOf(mqi0.m155944o()));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.jho
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117964a.m164442y0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().compose(mkd0.m154965Q()).distinctUntilChanged((x9j<? super R, ? super R, Boolean>) new x9j() { // from class: l.kho
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return oho.m164441q0((User) obj, (User) obj2);
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154956H(new e30() { // from class: l.lho
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128122a.m164460z0((User) obj);
            }
        }, new e30() { // from class: l.mho
            @Override // p149l.e30
            public final void call(Object obj) {
                oho.m164440p0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m164455r0(String str) {
        String strM164456s0 = m164456s0();
        if (TextUtils.isEmpty(strM164456s0) || strM164456s0.equals("unknown_") || strM164456s0.equals(IntlPurpose.not_sure_yet)) {
            User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            ProfileExtensionBasic profileExtensionBasic = userMo223809clone.profile.extensions.basic;
            profileExtensionBasic.intlFriendPurpose = arrayList;
            profileExtensionBasic.intlFriendPurposeV2 = arrayList;
            User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na());
            if (NullChecker.m81303a(userSubtract)) {
                act().duringCreated(CoreModule.f17545c.f19639e0.m169551v9(userSubtract, "updateIntlInterval")).subscribe(mkd0.m154956H(new e30() { // from class: l.dho
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        oho.m164437m0((roj0) obj);
                    }
                }, new e30() { // from class: l.eho
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        oho.m164430f0((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public String m164456s0() {
        List<String> list = CoreModule.m29932K().me_().profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.m200296J(list) ? list.get(0) : "";
    }

    /* JADX INFO: renamed from: t0 */
    public String m164457t0(int i, boolean z) {
        if (z && i > 99) {
            return "99+";
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        return ((i + 500) / 1000) + "k";
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m164458u0(TribeSubsetContent tribeSubsetContent, String str) {
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
                    return TextUtils.isEmpty(tribeSubsetContent.title) || TextUtils.isEmpty(tribeSubsetContent.coverUrl) || vwb.m200296J(tribeSubsetContent.profilePhoto) || tribeSubsetContent.profilePhoto.size() < 3;
                default:
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public void m164459x0(final String str, final String str2, final String str3, final String str4, final String str5) {
        duringCreated(CoreModule.f17545c.f19667n1.m34269H3("join", str, str2)).subscribe(mkd0.m154956H(new e30() { // from class: l.nho
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139004a.m164443A0(str, str2, str3, str4, str5, (Envelope) obj);
            }
        }, new e30() { // from class: l.cho
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f20601N);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m164460z0(User user) {
        m164448G0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
