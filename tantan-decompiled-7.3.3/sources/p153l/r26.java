package p153l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes.dex */
public class r26 extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public int f160916a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f160917b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f160918c;

    /* JADX INFO: renamed from: d */
    public Configuration f160919d;

    /* JADX INFO: renamed from: e */
    public Resources f160920e;

    public r26(Context context, @StyleRes int i) {
        super(context);
        this.f160916a = i;
    }

    /* JADX INFO: renamed from: a */
    public final Resources m179531a() {
        if (this.f160920e == null) {
            Configuration configuration = this.f160919d;
            if (configuration == null) {
                this.f160920e = super.getResources();
            } else {
                this.f160920e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f160920e;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public int m179532b() {
        return this.f160916a;
    }

    /* JADX INFO: renamed from: c */
    public final void m179533c() {
        boolean z = this.f160917b == null;
        if (z) {
            this.f160917b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f160917b.setTo(theme);
            }
        }
        m179534d(this.f160917b, this.f160916a, z);
    }

    /* JADX INFO: renamed from: d */
    public void m179534d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m179531a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f160918c == null) {
            this.f160918c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f160918c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f160917b;
        if (theme != null) {
            return theme;
        }
        if (this.f160916a == 0) {
            this.f160916a = ugc0.f178884e;
        }
        m179533c();
        return this.f160917b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f160916a != i) {
            this.f160916a = i;
            m179533c();
        }
    }

    public r26() {
        super(null);
    }

    public r26(Context context, Resources.Theme theme) {
        super(context);
        this.f160917b = theme;
    }
}
