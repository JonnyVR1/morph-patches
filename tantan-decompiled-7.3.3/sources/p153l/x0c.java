package p153l;

import android.app.Activity;
import com.hellogroup.p036mk.business.base.p037ui.MKWebViewHelper;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m88121d2 = {"Ll/x0c;", "Lcom/hellogroup/mk/business/base/ui/MKWebViewHelper;", "", "pageUrl", "<init>", "(Ljava/lang/String;)V", "Ll/ave0;", "uiParams", "", "k", "(Ll/ave0;)V", "", "show", "e", "(Z)V", "p", "()V", "Ll/zue0;", CommandMessage.PARAMS, "r", "(Ll/zue0;)V", "f", "title", "g", "closePage", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class x0c extends MKWebViewHelper {
    public /* synthetic */ x0c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public void closePage() {
        Activity activityMo17967l = mo17967l();
        if (activityMo17967l != null) {
            activityMo17967l.finish();
        }
    }

    public x0c(@Nullable String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: f */
    public void mo18039f() {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: p */
    public void mo18042p() {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: e */
    public void mo18038e(boolean show) {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: g */
    public void mo18040g(@Nullable String title) {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: k */
    public void mo18041k(@Nullable ave0 uiParams) {
    }

    @Override // p153l.flw
    /* JADX INFO: renamed from: r */
    public void mo18043r(@Nullable zue0 params) {
    }
}
