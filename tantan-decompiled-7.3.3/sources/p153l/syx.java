package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.data.Gender;

/* JADX INFO: loaded from: classes3.dex */
public class syx {

    /* JADX INFO: renamed from: b */
    public boolean f171324b;

    /* JADX INFO: renamed from: c */
    public boolean f171325c;

    /* JADX INFO: renamed from: d */
    public boolean f171326d;

    /* JADX INFO: renamed from: e */
    public String f171327e;

    /* JADX INFO: renamed from: f */
    public int f171328f;

    /* JADX INFO: renamed from: g */
    public boolean f171329g;

    /* JADX INFO: renamed from: h */
    public boolean f171330h;

    /* JADX INFO: renamed from: i */
    public Gender f171331i;

    /* JADX INFO: renamed from: k */
    public boolean f171333k;

    /* JADX INFO: renamed from: l */
    public boolean f171334l;

    /* JADX INFO: renamed from: p */
    public String f171338p;

    /* JADX INFO: renamed from: a */
    public int f171323a = 1;

    /* JADX INFO: renamed from: j */
    public String f171332j = "";

    /* JADX INFO: renamed from: m */
    public int f171335m = 3;

    /* JADX INFO: renamed from: n */
    public boolean f171336n = false;

    /* JADX INFO: renamed from: o */
    public boolean f171337o = false;

    /* JADX INFO: renamed from: q */
    public boolean f171339q = true;

    /* JADX INFO: renamed from: a */
    public Bundle m188610a() {
        Bundle bundle = new Bundle();
        bundle.putInt("imageCount", this.f171323a);
        bundle.putBoolean("hasCamera", this.f171324b);
        bundle.putBoolean("hasVideo", this.f171325c);
        bundle.putBoolean("cropIfSingle", this.f171326d);
        bundle.putBoolean("videoDefault", this.f171329g);
        bundle.putString("from", this.f171327e);
        bundle.putInt("source", this.f171328f);
        bundle.putBoolean("isFloatLayerExp", this.f171330h);
        bundle.putSerializable("gender", this.f171331i);
        bundle.putString("action_bar_title", this.f171332j);
        bundle.putBoolean("cropNewProfilePicture", this.f171333k);
        bundle.putBoolean("use_inner_camera", this.f171334l);
        bundle.putInt("span_count", this.f171335m);
        bundle.putBoolean("enable_back_key", this.f171336n);
        bundle.putBoolean("from_action_fake", this.f171337o);
        bundle.putString("tips_message", this.f171338p);
        bundle.putBoolean("show_simple_avatar", this.f171339q);
        return bundle;
    }
}
