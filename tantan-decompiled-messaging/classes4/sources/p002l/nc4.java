package p002l;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nc4 {

    /* JADX INFO: renamed from: a */
    public String f15915a;

    /* JADX INFO: renamed from: b */
    public String f15916b;

    public nc4(String str, String str2) {
        this.f15915a = str;
        this.f15916b = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m18643a() {
        return this.f15916b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m18644b() {
        return TextUtils.equals("alertCampaign", this.f15915a);
    }

    /* JADX INFO: renamed from: c */
    public boolean m18645c() {
        return this.f15915a.contains("scheme");
    }

    /* JADX INFO: renamed from: d */
    public boolean m18646d() {
        return TextUtils.equals("showUserProfileCard", this.f15915a);
    }
}
