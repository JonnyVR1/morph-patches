package p149l;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes9.dex */
public class jva extends mnd0 {

    /* JADX INFO: renamed from: a */
    public hpd0 f119918a;

    /* JADX INFO: renamed from: b */
    public zpd0 f119919b = new zpd0("swipe_count", 0L);

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f119920c = new tpd0("new_has_pic_verification_intro_show_count" + qib0.f154714c0.userId(), 0);

    /* JADX INFO: renamed from: d */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f119921d = new zpd0("new_last_pic_verification_guide_shown_time" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f119922e = new zpd0("swipe_count_for_picVerify" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: f */
    public uqd0 f119923f = new uqd0("new_swipe_card_date" + qib0.f154714c0.userId(), "");

    /* JADX INFO: renamed from: g */
    public uqd0 f119924g;

    @Override // p149l.mnd0
    /* JADX INFO: renamed from: a */
    public void mo99213a(String str) {
        this.f119918a = new hpd0("has_global_boost_and_see_intro_shown" + str, Boolean.FALSE);
        this.f119924g = new uqd0("verify_dlg_date_and_count" + str, "");
        this.f119920c = new tpd0("new_has_pic_verification_intro_show_count" + str, 0);
        this.f119921d = new zpd0("new_last_pic_verification_guide_shown_time" + str, 0L);
        this.f119922e = new zpd0("swipe_count_for_picVerify" + str, 0L);
        this.f119923f = new uqd0("new_swipe_card_date" + str, "");
    }
}
