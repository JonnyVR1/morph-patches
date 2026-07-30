package p149l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes.dex */
public class m16 extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public int f130801a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f130802b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f130803c;

    /* JADX INFO: renamed from: d */
    public Configuration f130804d;

    /* JADX INFO: renamed from: e */
    public Resources f130805e;

    public m16(Context context, @StyleRes int i) {
        super(context);
        this.f130801a = i;
    }

    /* JADX INFO: renamed from: a */
    public final Resources m152572a() {
        if (this.f130805e == null) {
            Configuration configuration = this.f130804d;
            if (configuration == null) {
                this.f130805e = super.getResources();
            } else {
                this.f130805e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f130805e;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public int m152573b() {
        return this.f130801a;
    }

    /* JADX INFO: renamed from: c */
    public final void m152574c() {
        boolean z = this.f130802b == null;
        if (z) {
            this.f130802b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f130802b.setTo(theme);
            }
        }
        m152575d(this.f130802b, this.f130801a, z);
    }

    /* JADX INFO: renamed from: d */
    public void m152575d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m152572a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f130803c == null) {
            this.f130803c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f130803c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f130802b;
        if (theme != null) {
            return theme;
        }
        if (this.f130801a == 0) {
            this.f130801a = p8c0.f147586e;
        }
        m152574c();
        return this.f130802b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f130801a != i) {
            this.f130801a = i;
            m152574c();
        }
    }

    public m16() {
        super(null);
    }

    public m16(Context context, Resources.Theme theme) {
        super(context);
        this.f130802b = theme;
    }
}
