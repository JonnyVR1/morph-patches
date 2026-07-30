package p003l;

import android.os.Bundle;
import com.p1.mobile.putong.data.Gender;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vpx {

    /* JADX INFO: renamed from: b */
    public boolean f8378b;

    /* JADX INFO: renamed from: c */
    public boolean f8379c;

    /* JADX INFO: renamed from: d */
    public boolean f8380d;

    /* JADX INFO: renamed from: e */
    public String f8381e;

    /* JADX INFO: renamed from: f */
    public int f8382f;

    /* JADX INFO: renamed from: g */
    public boolean f8383g;

    /* JADX INFO: renamed from: h */
    public boolean f8384h;

    /* JADX INFO: renamed from: i */
    public Gender f8385i;

    /* JADX INFO: renamed from: k */
    public boolean f8387k;

    /* JADX INFO: renamed from: l */
    public boolean f8388l;

    /* JADX INFO: renamed from: p */
    public String f8392p;

    /* JADX INFO: renamed from: a */
    public int f8377a = 1;

    /* JADX INFO: renamed from: j */
    public String f8386j = "";

    /* JADX INFO: renamed from: m */
    public int f8389m = 3;

    /* JADX INFO: renamed from: n */
    public boolean f8390n = false;

    /* JADX INFO: renamed from: o */
    public boolean f8391o = false;

    /* JADX INFO: renamed from: q */
    public boolean f8393q = true;

    /* JADX INFO: renamed from: a */
    public Bundle m8399a() {
        Bundle bundle = new Bundle();
        bundle.putInt("imageCount", this.f8377a);
        bundle.putBoolean("hasCamera", this.f8378b);
        bundle.putBoolean("hasVideo", this.f8379c);
        bundle.putBoolean("cropIfSingle", this.f8380d);
        bundle.putBoolean("videoDefault", this.f8383g);
        bundle.putString("from", this.f8381e);
        bundle.putInt("source", this.f8382f);
        bundle.putBoolean("isFloatLayerExp", this.f8384h);
        bundle.putSerializable("gender", this.f8385i);
        bundle.putString("action_bar_title", this.f8386j);
        bundle.putBoolean("cropNewProfilePicture", this.f8387k);
        bundle.putBoolean("use_inner_camera", this.f8388l);
        bundle.putInt("span_count", this.f8389m);
        bundle.putBoolean("enable_back_key", this.f8390n);
        bundle.putBoolean("from_action_fake", this.f8391o);
        bundle.putString("tips_message", this.f8392p);
        bundle.putBoolean("show_simple_avatar", this.f8393q);
        return bundle;
    }
}
