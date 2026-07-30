package p006l;

import android.annotation.SuppressLint;
import l.hpd0;
import l.mnd0;
import l.tpd0;
import l.uqd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jva extends mnd0 {

    /* JADX INFO: renamed from: a */
    public hpd0 f15444a;

    /* JADX INFO: renamed from: b */
    public zpd0 f15445b = new zpd0("swipe_count", 0L);

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f15446c = new tpd0("new_has_pic_verification_intro_show_count" + qib0.f19805c0.userId(), 0);

    /* JADX INFO: renamed from: d */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f15447d = new zpd0("new_last_pic_verification_guide_shown_time" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: e */
    public zpd0 f15448e = new zpd0("swipe_count_for_picVerify" + qib0.f19805c0.userId(), 0L);

    /* JADX INFO: renamed from: f */
    public uqd0 f15449f = new uqd0("new_swipe_card_date" + qib0.f19805c0.userId(), "");

    /* JADX INFO: renamed from: g */
    public uqd0 f15450g;

    /* JADX INFO: renamed from: a */
    public void m17840a(String str) {
        this.f15444a = new hpd0("has_global_boost_and_see_intro_shown" + str, Boolean.FALSE);
        this.f15450g = new uqd0("verify_dlg_date_and_count" + str, "");
        this.f15446c = new tpd0("new_has_pic_verification_intro_show_count" + str, 0);
        this.f15447d = new zpd0("new_last_pic_verification_guide_shown_time" + str, 0L);
        this.f15448e = new zpd0("swipe_count_for_picVerify" + str, 0L);
        this.f15449f = new uqd0("new_swipe_card_date" + str, "");
    }
}
