package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.data.Gender;

/* JADX INFO: loaded from: classes3.dex */
public class vpx {

    /* JADX INFO: renamed from: b */
    public boolean f182532b;

    /* JADX INFO: renamed from: c */
    public boolean f182533c;

    /* JADX INFO: renamed from: d */
    public boolean f182534d;

    /* JADX INFO: renamed from: e */
    public String f182535e;

    /* JADX INFO: renamed from: f */
    public int f182536f;

    /* JADX INFO: renamed from: g */
    public boolean f182537g;

    /* JADX INFO: renamed from: h */
    public boolean f182538h;

    /* JADX INFO: renamed from: i */
    public Gender f182539i;

    /* JADX INFO: renamed from: k */
    public boolean f182541k;

    /* JADX INFO: renamed from: l */
    public boolean f182542l;

    /* JADX INFO: renamed from: p */
    public String f182546p;

    /* JADX INFO: renamed from: a */
    public int f182531a = 1;

    /* JADX INFO: renamed from: j */
    public String f182540j = "";

    /* JADX INFO: renamed from: m */
    public int f182543m = 3;

    /* JADX INFO: renamed from: n */
    public boolean f182544n = false;

    /* JADX INFO: renamed from: o */
    public boolean f182545o = false;

    /* JADX INFO: renamed from: q */
    public boolean f182547q = true;

    /* JADX INFO: renamed from: a */
    public Bundle m199387a() {
        Bundle bundle = new Bundle();
        bundle.putInt("imageCount", this.f182531a);
        bundle.putBoolean("hasCamera", this.f182532b);
        bundle.putBoolean("hasVideo", this.f182533c);
        bundle.putBoolean("cropIfSingle", this.f182534d);
        bundle.putBoolean("videoDefault", this.f182537g);
        bundle.putString("from", this.f182535e);
        bundle.putInt("source", this.f182536f);
        bundle.putBoolean("isFloatLayerExp", this.f182538h);
        bundle.putSerializable("gender", this.f182539i);
        bundle.putString("action_bar_title", this.f182540j);
        bundle.putBoolean("cropNewProfilePicture", this.f182541k);
        bundle.putBoolean("use_inner_camera", this.f182542l);
        bundle.putInt("span_count", this.f182543m);
        bundle.putBoolean("enable_back_key", this.f182544n);
        bundle.putBoolean("from_action_fake", this.f182545o);
        bundle.putString("tips_message", this.f182546p);
        bundle.putBoolean("show_simple_avatar", this.f182547q);
        return bundle;
    }
}
