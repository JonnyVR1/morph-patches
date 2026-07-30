package p153l;

import android.app.Activity;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/zkw;", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "", "pageUrl", "<init>", "(Ljava/lang/String;)V", "Lcom/hellogroup/mk/business/ui/BaseMKProxyActivity;", "K", "()Lcom/hellogroup/mk/business/ui/BaseMKProxyActivity;", "", "f", "()V", "closePage", "p", "title", "g", "", "show", "e", "(Z)V", "Ll/ave0;", "uiParams", "k", "(Ll/ave0;)V", "Ll/zue0;", CommandMessage.PARAMS, "r", "(Ll/zue0;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class zkw extends MKWebViewHelper {
    public /* synthetic */ zkw(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: K */
    private final BaseMKProxyActivity m220162K() {
        Activity activityMo17967l = mo17967l();
        if (!(activityMo17967l instanceof BaseMKProxyActivity)) {
            activityMo17967l = null;
        }
        return (BaseMKProxyActivity) activityMo17967l;
    }

    @Override // p153l.ziw
    public void closePage() {
        Activity activityMo17967l = mo17967l();
        if (activityMo17967l != null) {
            activityMo17967l.finish();
        }
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: e */
    public void mo18038e(boolean show) {
        BaseMKProxyActivity baseMKProxyActivityM220162K = m220162K();
        if (baseMKProxyActivityM220162K != null) {
            baseMKProxyActivityM220162K.mo18091B2(show);
        }
    }

    @Override // p153l.ziw
    /* JADX INFO: renamed from: f */
    public void mo18039f() {
        BaseMKProxyActivity baseMKProxyActivityM220162K = m220162K();
        if (baseMKProxyActivityM220162K != null) {
            baseMKProxyActivityM220162K.m18115p2();
        }
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: g */
    public void mo18040g(@Nullable String title) {
        BaseMKProxyActivity baseMKProxyActivityM220162K = m220162K();
        if (baseMKProxyActivityM220162K != null) {
            baseMKProxyActivityM220162K.setTitle(title);
        }
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: k */
    public void mo18041k(@Nullable ave0 uiParams) {
        try {
            BaseMKProxyActivity baseMKProxyActivityM220162K = m220162K();
            if (baseMKProxyActivityM220162K != null) {
                baseMKProxyActivityM220162K.m18117u2(uiParams);
            }
        } catch (Throwable th) {
            jzv.m147730c("MKActivity", "", th);
        }
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: p */
    public void mo18042p() {
        Activity activityMo17967l = mo17967l();
        if (activityMo17967l != null) {
            activityMo17967l.onBackPressed();
        }
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: r */
    public void mo18043r(@Nullable zue0 params) {
        try {
            BaseMKProxyActivity baseMKProxyActivityM220162K = m220162K();
            if (baseMKProxyActivityM220162K != null) {
                baseMKProxyActivityM220162K.m18123z2(params);
            }
        } catch (Throwable th) {
            jzv.m147730c("MKActivity", "", th);
        }
    }

    public zkw(@Nullable String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zkw() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
