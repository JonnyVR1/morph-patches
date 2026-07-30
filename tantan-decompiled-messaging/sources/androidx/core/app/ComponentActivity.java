package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C0481k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hgf0;
import p149l.j6f;
import p149l.jcr;
import p149l.lxq;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\"\u0010\u000bR.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0018\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, m87232d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Ll/jcr;", "Ll/lxq$a;", "<init>", "()V", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "Landroidx/core/app/ComponentActivity$a;", "extraData", "", "putExtraData", "(Landroidx/core/app/ComponentActivity$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$a;", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "Ll/hgf0;", "extraDataMap", "Ll/hgf0;", "getExtraDataMap$annotations", "Landroidx/lifecycle/k;", "lifecycleRegistry", "Landroidx/lifecycle/k;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", RequestParameters.SUBRESOURCE_LIFECYCLE, "a", "core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ComponentActivity extends Activity implements jcr, lxq.InterfaceC18347a {

    @NotNull
    private final hgf0<Class<? extends C0232a>, C0232a> extraDataMap = new hgf0<>();

    @NotNull
    private final C0481k lifecycleRegistry = new C0481k(this);

    /* JADX INFO: renamed from: androidx.core.app.ComponentActivity$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Landroidx/core/app/ComponentActivity$a;", "", "<init>", "()V", "core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class C0232a {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r3.equals("--list-dumpables") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (r3.equals("--dump-dumpable") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldSkipDump(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L5e
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L5e
        L7:
            r3 = r3[r2]
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -645125871: goto L4e;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5e
        L12:
            java.lang.String r0 = "--autofill"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1b
            goto L5e
        L1b:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r3 < r0) goto L22
            return r1
        L22:
            return r2
        L23:
            java.lang.String r0 = "--contentcapture"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2c
            goto L5e
        L2c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L33
            return r1
        L33:
            return r2
        L34:
            java.lang.String r0 = "--list-dumpables"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46
            goto L5e
        L3d:
            java.lang.String r0 = "--dump-dumpable"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L46
            goto L5e
        L46:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L4d
            return r1
        L4d:
            return r2
        L4e:
            java.lang.String r0 = "--translation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L57
            goto L5e
        L57:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r3 < r0) goto L5e
            return r1
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        event.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (lxq.m152081d(decorView, event)) {
            return true;
        }
        return lxq.m152082e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent event) {
        event.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (lxq.m152081d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public <T extends C0232a> T getExtraData(@NotNull Class<T> extraDataClass) {
        extraDataClass.getClass();
        return (T) this.extraDataMap.get(extraDataClass);
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ReportFragment.INSTANCE.m3008c(this);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        this.lifecycleRegistry.m3033n(Lifecycle.State.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void putExtraData(@NotNull C0232a extraData) {
        extraData.getClass();
        this.extraDataMap.put((Class<? extends C0232a>) extraData.getClass(), extraData);
    }

    public final boolean shouldDumpInternalState(@Nullable String[] args) {
        return !shouldSkipDump(args);
    }

    @Override // p149l.lxq.InterfaceC18347a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@NotNull KeyEvent event) {
        event.getClass();
        return super.dispatchKeyEvent(event);
    }
}
