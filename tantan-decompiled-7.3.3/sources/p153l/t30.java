package p153l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class t30 {

    /* JADX INFO: renamed from: a */
    public final Context f171843a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20219a f171844b;

    /* JADX INFO: renamed from: c */
    public InterfaceC20220b f171845c;

    /* JADX INFO: renamed from: l.t30$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC20219a {
        /* JADX INFO: renamed from: a */
        void mo500a(boolean z);
    }

    /* JADX INFO: renamed from: l.t30$b */
    public interface InterfaceC20220b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public t30(@NonNull Context context) {
        this.f171843a = context;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo385a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo389b() {
        return true;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract View mo386c();

    @NonNull
    /* JADX INFO: renamed from: d */
    public View mo390d(@NonNull MenuItem menuItem) {
        return mo386c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo387e() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo391g() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public void m189010h() {
        this.f171845c = null;
        this.f171844b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public void m189011i(@Nullable InterfaceC20219a interfaceC20219a) {
        this.f171844b = interfaceC20219a;
    }

    /* JADX INFO: renamed from: j */
    public void mo392j(@Nullable InterfaceC20220b interfaceC20220b) {
        this.f171845c = interfaceC20220b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public void m189012k(boolean z) {
        InterfaceC20219a interfaceC20219a = this.f171844b;
        if (interfaceC20219a != null) {
            interfaceC20219a.mo500a(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo388f(@NonNull SubMenu subMenu) {
    }
}
