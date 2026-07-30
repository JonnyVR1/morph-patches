package p153l;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jfw0 {

    /* JADX INFO: renamed from: a */
    public final lfw0 f120647a;

    /* JADX INFO: renamed from: b */
    public final WebView f120648b;

    /* JADX INFO: renamed from: c */
    public final List f120649c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map f120650d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final String f120651e = "";

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f120652f;

    /* JADX INFO: renamed from: g */
    public final zzfog f120653g;

    public jfw0(lfw0 lfw0Var, WebView webView, String str, List list, @Nullable String str2, String str3, zzfog zzfogVar) {
        this.f120647a = lfw0Var;
        this.f120648b = webView;
        this.f120653g = zzfogVar;
        this.f120652f = str2;
    }

    /* JADX INFO: renamed from: b */
    public static jfw0 m144730b(lfw0 lfw0Var, WebView webView, @Nullable String str, String str2) {
        return new jfw0(lfw0Var, webView, null, null, str, "", zzfog.HTML);
    }

    /* JADX INFO: renamed from: c */
    public static jfw0 m144731c(lfw0 lfw0Var, WebView webView, @Nullable String str, String str2) {
        return new jfw0(lfw0Var, webView, null, null, str, "", zzfog.JAVASCRIPT);
    }

    /* JADX INFO: renamed from: a */
    public final WebView m144732a() {
        return this.f120648b;
    }

    /* JADX INFO: renamed from: d */
    public final zzfog m144733d() {
        return this.f120653g;
    }

    /* JADX INFO: renamed from: e */
    public final lfw0 m144734e() {
        return this.f120647a;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m144735f() {
        return this.f120652f;
    }

    /* JADX INFO: renamed from: g */
    public final String m144736g() {
        return this.f120651e;
    }

    /* JADX INFO: renamed from: h */
    public final List m144737h() {
        return Collections.unmodifiableList(this.f120649c);
    }

    /* JADX INFO: renamed from: i */
    public final Map m144738i() {
        return Collections.unmodifiableMap(this.f120650d);
    }
}
