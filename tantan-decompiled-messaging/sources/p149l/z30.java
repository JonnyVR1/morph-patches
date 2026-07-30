package p149l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class z30 {

    /* JADX INFO: renamed from: a */
    public final Context f201295a;

    /* JADX INFO: renamed from: b */
    public InterfaceC21612a f201296b;

    /* JADX INFO: renamed from: c */
    public InterfaceC21613b f201297c;

    /* JADX INFO: renamed from: l.z30$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC21612a {
        /* JADX INFO: renamed from: a */
        void mo499a(boolean z);
    }

    /* JADX INFO: renamed from: l.z30$b */
    public interface InterfaceC21613b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public z30(@NonNull Context context) {
        this.f201295a = context;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo384a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo388b() {
        return true;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract View mo385c();

    @NonNull
    /* JADX INFO: renamed from: d */
    public View mo389d(@NonNull MenuItem menuItem) {
        return mo385c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo386e() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo390g() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: h */
    public void m217003h() {
        this.f201297c = null;
        this.f201296b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public void m217004i(@Nullable InterfaceC21612a interfaceC21612a) {
        this.f201296b = interfaceC21612a;
    }

    /* JADX INFO: renamed from: j */
    public void mo391j(@Nullable InterfaceC21613b interfaceC21613b) {
        this.f201297c = interfaceC21613b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public void m217005k(boolean z) {
        InterfaceC21612a interfaceC21612a = this.f201296b;
        if (interfaceC21612a != null) {
            interfaceC21612a.mo499a(z);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo387f(@NonNull SubMenu subMenu) {
    }
}
