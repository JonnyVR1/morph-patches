package p153l;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes9.dex */
public class vwa extends ovd0 {

    /* JADX INFO: renamed from: a */
    public jxd0 f186111a;

    /* JADX INFO: renamed from: b */
    public byd0 f186112b = new byd0("swipe_count", 0L);

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f186113c = new vxd0("new_has_pic_verification_intro_show_count" + uqb0.f180397c0.userId(), 0);

    /* JADX INFO: renamed from: d */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f186114d = new byd0("new_last_pic_verification_guide_shown_time" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: e */
    public byd0 f186115e = new byd0("swipe_count_for_picVerify" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: f */
    public wyd0 f186116f = new wyd0("new_swipe_card_date" + uqb0.f180397c0.userId(), "");

    /* JADX INFO: renamed from: g */
    public wyd0 f186117g;

    @Override // p153l.ovd0
    /* JADX INFO: renamed from: a */
    public void mo169431a(String str) {
        this.f186111a = new jxd0("has_global_boost_and_see_intro_shown" + str, Boolean.FALSE);
        this.f186117g = new wyd0("verify_dlg_date_and_count" + str, "");
        this.f186113c = new vxd0("new_has_pic_verification_intro_show_count" + str, 0);
        this.f186114d = new byd0("new_last_pic_verification_guide_shown_time" + str, 0L);
        this.f186115e = new byd0("swipe_count_for_picVerify" + str, 0L);
        this.f186116f = new wyd0("new_swipe_card_date" + str, "");
    }
}
